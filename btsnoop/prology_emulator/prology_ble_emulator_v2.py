#!/usr/bin/env python3
"""
PROLOGY BLE Device Emulator (Jieli AC6951) — v2

Эмулятор BLE периферийного устройства PROLOGY.
Реализует RCSP протокол с полным checksum.

Два режима работы:
  1. HCI raw mode (требует root) — полный контроль
  2. bluetoothctl advertise mode (требует root) — упрощённый

Запуск:
  sudo python3 prology_ble_emulator_v2.py
"""

import asyncio
import struct
import logging
import os
import sys
import signal
from typing import Optional, Callable

logging.basicConfig(
    level=logging.INFO,
    format="%(asctime)s [%(levelname)s] %(message)s",
    datefmt="%H:%M:%S",
)
log = logging.getLogger("prology")

# ============================================================================
# RCSP Protocol
# ============================================================================

SERVICE_UUID = "0000ae00-0000-1000-8000-00805f9b34fb"
TX_CHAR_UUID = "0000ae01-0000-1000-8000-00805f9b34fb"
RX_CHAR_UUID = "0000ae02-0000-1000-8000-00805f9b34fb"

K_TX = 0x10
K_RX = 0x40
FIRMWARE_VERSION = b"VER 8.7DSP   j"

DEFAULT_EQ_PARAMS = {
    0x12: 0x00, 0x13: 0x01, 0x14: 0x0F, 0x15: 0x03,
    0x16: 0x01, 0x17: 0x00, 0x18: 0x00, 0x19: 0x01,
    0x1A: 0x01, 0x1B: 0x00, 0x1D: 0x00,
}


def calc_checksum(data: bytes, k: int) -> int:
    return (sum(data) + k) & 0xFF


def build_rx(type_byte: int, data: bytes) -> bytes:
    """Build RX (Device→Phone) packet."""
    length = len(data) + 1
    pkt = bytes([0xC0, 0x00, length, type_byte]) + data
    return pkt + bytes([calc_checksum(pkt, K_RX)])


def parse_tx(data: bytes) -> Optional[dict]:
    """Parse TX (Phone→Device) packet."""
    if len(data) < 5 or data[0] != 0xF0:
        return None
    return {
        "type": data[3],
        "payload": data[4:-1],
        "checksum": data[-1],
        "valid": data[-1] == calc_checksum(data[:-1], K_TX),
    }


# ============================================================================
# Device State
# ============================================================================


class DeviceState:
    """Emulated device state."""

    def __init__(self):
        self.initialized = False
        self.heartbeat_status = 0x05
        self.eq_params = dict(DEFAULT_EQ_PARAMS)
        self.connected = False
        self.notify_enabled = False
        self.on_notify: Optional[Callable] = None

    async def send(self, data: bytes):
        """Send notification to phone."""
        if self.on_notify:
            result = self.on_notify(data)
            if asyncio.iscoroutine(result):
                await result

    async def send_init_response(self):
        """Send device identification."""
        # ID packet (from btsnoop)
        hw_id = bytes.fromhex("000401050704000402c50003000808dc78e712ff0300000e03")
        await self.send(build_rx(0xFF, hw_id + FIRMWARE_VERSION))
        log.info(f"📤 Device ID: {FIRMWARE_VERSION.decode()}")

        # Params map
        parts = []
        for idx in [0x14, 0x15, 0x12, 0x13, 0x16, 0x17, 0x18, 0x19, 0x1B, 0x1A, 0x1D]:
            val = self.eq_params.get(idx, 0x00)
            parts.append(bytes([0x03, 0x92, idx, val & 0xFF, 0x00]))
        await self.send(build_rx(0xFF, b"".join(parts)))
        log.info("📤 Params map sent")

    async def send_heartbeat(self):
        await self.send(build_rx(0x05, bytes([self.heartbeat_status])))

    async def handle_command(self, data: bytes):
        """Process incoming command."""
        pkt = parse_tx(data)
        if not pkt:
            log.warning(f"⚠️ Invalid: {' '.join(f'{b:02X}' for b in data)}")
            return

        if not pkt["valid"]:
            exp = calc_checksum(data[:-1], K_TX)
            log.warning(f"⚠️ Bad checksum: got 0x{pkt['checksum']:02X}, exp 0x{exp:02X}")

        cmd = pkt["type"]
        payload = pkt["payload"]
        log.info(f"🔧 Cmd 0x{cmd:02X}: {' '.join(f'{b:02X}' for b in payload)}")

        handlers = {
            0x01: self._cmd_init,
            0x03: self._cmd_query,
            0x04: self._cmd_heartbeat,
            0x80: self._cmd_write,
            0x8A: self._cmd_extended,
            0x8E: self._cmd_status,
            0xA0: self._cmd_config,
        }
        h = handlers.get(cmd)
        if h:
            await h(payload)
        else:
            log.warning(f"⚠️ Unknown: 0x{cmd:02X}")

    async def _cmd_init(self, payload):
        self.initialized = True
        self.heartbeat_status = 0x05
        await self.send_init_response()

    async def _cmd_heartbeat(self, payload):
        log.debug(f"💓 HB: {' '.join(f'{b:02X}' for b in payload)}")

    async def _cmd_query(self, payload):
        if payload:
            p = payload[0]
            v = self.eq_params.get(p, 0x00)
            await self.send(build_rx(0x90, bytes([p, v])))

    async def _cmd_write(self, payload):
        if len(payload) >= 2:
            reg, val = payload[0], payload[1]
            log.info(f"✏️ Write 0x{reg:02X}=0x{val:02X}")
            self.eq_params[reg] = val
            if val > 0x20:
                self.heartbeat_status = 0x06
            await self.send(build_rx(0x9A, bytes([0x0A, 0x01])))

    async def _cmd_extended(self, payload):
        if payload:
            await self.send(build_rx(0x9A, bytes([payload[0], 0x02])))

    async def _cmd_status(self, payload):
        if payload:
            await self.send(build_rx(0x9F, payload))

    async def _cmd_config(self, payload):
        if payload:
            await self.send(build_rx(0xB0, bytes([payload[0], 0x01])))


# ============================================================================
# HCI Raw Mode — Полный BLE Peripheral через HCI socket
# ============================================================================


class HCIBlePeripheral:
    """BLE Peripheral через HCI raw socket."""

    def __init__(self, state: DeviceState):
        self.state = state
        self.sock = None
        self.running = False

    async def start(self):
        """Start BLE advertising via HCI."""
        import socket
        import fcntl

        log.info("📡 HCI raw mode — creating BLE socket...")

        try:
            # First, try to bring down the adapter
            proc = await asyncio.create_subprocess_exec(
                "hciconfig", "hci0", "down",
                stdout=asyncio.subprocess.PIPE,
                stderr=asyncio.subprocess.PIPE,
            )
            await proc.communicate()
            await asyncio.sleep(0.5)

            # HCI socket
            self.sock = socket.socket(
                socket.AF_BLUETOOTH, socket.SOCK_RAW, socket.BTPROTO_HCI
            )
            self.sock.bind((0,))
            self.running = True

            # Bring adapter back up
            proc = await asyncio.create_subprocess_exec(
                "hciconfig", "hci0", "up",
                stdout=asyncio.subprocess.PIPE,
                stderr=asyncio.subprocess.PIPE,
            )
            await proc.communicate()
            await asyncio.sleep(0.5)

            # Enable LE advertising
            await self._hci_le_set_advertising_enable(False)

            # Set advertising parameters
            await self._hci_le_set_advertising_params()

            # Set advertising data
            adv_data = self._build_adv_data()
            await self._hci_le_set_advertising_data(adv_data)

            # Set scan response
            scan_data = self._build_scan_response()
            await self._hci_le_set_scan_response(scan_data)

            # Enable advertising
            await self._hci_le_set_advertising_enable(True)
            log.info("📡 Advertising as PROLOGY_BLE via HCI raw")

            # Start listening for connections
            asyncio.create_task(self._hci_listen())

        except Exception as e:
            log.error(f"❌ HCI raw mode failed: {e}")
            raise

    def _build_adv_data(self) -> bytes:
        """Build advertising data."""
        name = b"PROLOGY_BLE"
        # Flags: LE General Discoverable + BR/EDR Not Supported
        flags = bytes([0x02, 0x01, 0x06])
        # Service UUIDs (complete list, 16-bit)
        svc = bytes([0x03, 0x03, 0x00, 0xAE])
        # Local name
        n = bytes([len(name) + 1, 0x09]) + name
        return flags + svc + n

    def _build_scan_response(self) -> bytes:
        return bytes([0x02, 0x0A, 0x00])  # TX power level 0

    async def _hci_cmd(self, ogf: int, ocf: int, data: bytes = b"") -> bytes:
        """Send HCI command."""
        import struct
        opcode = (ogf << 10) | ocf
        hdr = struct.pack("<BHB", 0x01, opcode, len(data))
        self.sock.send(hdr + data)
        # Read event
        evt = self.sock.recv(258)
        return evt

    async def _hci_le_set_advertising_params(self):
        """Set LE advertising parameters."""
        # 0x08 = LE, 0x0006 = Set Advertising Parameters
        # Min interval, max interval, type, own addr type, channel map, filter policy
        params = struct.pack("<HHBBB",
                             0x00A0,   # Min interval (160 * 0.625ms = 100ms)
                             0x00C0,   # Max interval (192 * 0.625ms = 120ms)
                             0x00,     # ADV_IND (connectable undirected)
                             0x00,     # Public address
                             0x07)     # All channels
        await self._hci_cmd(0x08, 0x0006, params)

    async def _hci_le_set_advertising_data(self, data: bytes):
        """Set advertising data."""
        params = struct.pack("B", len(data)) + data.ljust(31, b'\x00')
        await self._hci_cmd(0x08, 0x0008, params)

    async def _hci_le_set_scan_response(self, data: bytes):
        """Set scan response data."""
        params = struct.pack("B", len(data)) + data.ljust(31, b'\x00')
        await self._hci_cmd(0x08, 0x0009, params)

    async def _hci_le_set_advertising_enable(self, enable: bool):
        """Enable/disable advertising."""
        await self._hci_cmd(0x08, 0x000A, bytes([int(enable)]))

    async def _hci_listen(self):
        """Listen for incoming BLE events."""
        log.info("👂 Listening for BLE events...")
        while self.running:
            try:
                import select
                ready, _, _ = select.select([self.sock], [], [], 1.0)
                if ready:
                    data = self.sock.recv(258)
                    if data and len(data) > 3:
                        evt_code = data[0]
                        if evt_code == 0x3E:  # LE Meta Event
                            subevent = data[3]
                            if subevent == 0x01:  # LE Connection Complete
                                log.info("🔗 LE Connection Complete!")
                                self.state.connected = True
                            elif subevent == 0x02:  # LE Advertising Report
                                pass  # Ignore
                            elif subevent == 0x03:  # LE Connection Update Complete
                                log.info("🔄 Connection updated")
                            elif subevent == 0x05:  # LE Read Remote Features
                                log.info("📋 Remote features read")
            except Exception as e:
                log.error(f"HCI listen error: {e}")
                break

    async def stop(self):
        self.running = False
        if self.sock:
            await self._hci_le_set_advertising_enable(False)
            self.sock.close()


# ============================================================================
# bluetoothctl advertise mode
# ============================================================================


class BluetoothctlPeripheral:
    """BLE Peripheral через bluetoothctl advertise API."""

    def __init__(self, state: DeviceState):
        self.state = state
        self.proc = None

    async def start(self):
        """Start advertising via bluetoothctl."""
        log.info("📡 bluetoothctl advertise mode...")

        self.proc = await asyncio.create_subprocess_exec(
            "bluetoothctl",
            stdin=asyncio.subprocess.PIPE,
            stdout=asyncio.subprocess.PIPE,
            stderr=asyncio.subprocess.PIPE,
        )

        commands = [
            "power on",
            "advertise on",
            "advertise.service 0xAE00",
            "advertise.name PROLOGY_BLE",
            "advertise.timeout 0",
        ]

        for cmd in commands:
            await self._send_cmd(cmd)
            await asyncio.sleep(0.5)

        log.info("📡 Advertising as PROLOGY_BLE")

        # Start heartbeat
        asyncio.create_task(self._heartbeat_loop())

    async def _send_cmd(self, cmd: str):
        if self.proc and self.proc.stdin:
            self.proc.stdin.write((cmd + "\n").encode())
            await self.proc.stdin.drain()
            log.debug(f"📤 bluetoothctl: {cmd}")

    async def _heartbeat_loop(self):
        while self.state.initialized:
            await self.state.send_heartbeat()
            await asyncio.sleep(3.1)

    async def stop(self):
        if self.proc:
            await self._send_cmd("advertise off")
            self.proc.terminate()


# ============================================================================
# Main
# ============================================================================


async def main():
    log.info("=" * 60)
    log.info("PROLOGY BLE Emulator (Jieli AC6951) v2")
    log.info("=" * 60)
    log.info(f"Service: {SERVICE_UUID}")
    log.info(f"TX: {TX_CHAR_UUID}")
    log.info(f"RX: {RX_CHAR_UUID}")
    log.info(f"Firmware: {FIRMWARE_VERSION.decode()}")
    log.info("")

    if os.geteuid() != 0:
        log.error("❌ Требуется root! Запустите: sudo python3 prology_ble_emulator_v2.py")
        sys.exit(1)

    state = DeviceState()

    # Try HCI raw mode first
    try:
        import socket
        socket.AF_BLUETOOTH
        hci = HCIBlePeripheral(state)
        await hci.start()
        log.info("✅ HCI raw mode active")
    except Exception as e:
        log.warning(f"⚠️ HCI raw mode failed: {e}")
        log.info("Trying bluetoothctl mode...")
        btctl = BluetoothctlPeripheral(state)
        await btctl.start()

    # Setup signal handler
    loop = asyncio.get_event_loop()
    stop_event = asyncio.Event()

    def signal_handler():
        log.info("\n🛑 Shutdown...")
        stop_event.set()

    for sig in (signal.SIGINT, signal.SIGTERM):
        loop.add_signal_handler(sig, signal_handler)

    # Start heartbeat loop
    async def hb_loop():
        while not stop_event.is_set():
            if state.initialized:
                await state.send_heartbeat()
            await asyncio.sleep(3.1)

    hb_task = asyncio.create_task(hb_loop())

    log.info("🔄 Emulator running... (Ctrl+C to stop)")
    await stop_event.wait()

    hb_task.cancel()
    log.info("👋 Bye!")


if __name__ == "__main__":
    try:
        asyncio.run(main())
    except KeyboardInterrupt:
        pass
