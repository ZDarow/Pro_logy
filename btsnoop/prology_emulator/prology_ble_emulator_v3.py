#!/usr/bin/env python3
"""
PROLOGY BLE Device Emulator (Jieli AC6951) — v3

Эмулятор BLE периферийного устройства PROLOGY.
Реализует RCSP протокол с auth state machine.

История изменений:
  v1 — D-Bus GATT (неполный)
  v2 — HCI raw mode, базовый RCSP
  v3 — Добавлена auth state machine (challenge-response),
       исправлен heartbeat (только после init),
       добавлены дополнительные response типы

Запуск:
  sudo python3 prology_ble_emulator_v3.py
"""

import asyncio
import struct
import logging
import os
import sys
import signal
import secrets
from typing import Optional, Callable

logging.basicConfig(
    level=logging.INFO,
    format="%(asctime)s [%(levelname)s] %(message)s",
    datefmt="%H:%M:%S",
)
log = logging.getLogger("prology")

# ============================================================================
# RCSP Protocol Constants
# ============================================================================

SERVICE_UUID = "0000ae00-0000-1000-8000-00805f9b34fb"
TX_CHAR_UUID = "0000ae01-0000-1000-00805f9b34fb"
RX_CHAR_UUID = "0000ae02-0000-1000-00805f9b34fb"

K_TX = 0x10  # Phone → Device
K_RX = 0x40  # Device → Phone

# Link Key из SDK Jieli (rcsp_bluetooth.c)
LINK_KEY = bytes.fromhex("06775f87918dd423005df1d8cf0c142b")

FIRMWARE_VERSION = b"VER 8.7DSP   j"

DEFAULT_EQ_PARAMS = {
    0x12: 0x00, 0x13: 0x01, 0x14: 0x0F, 0x15: 0x03,
    0x16: 0x01, 0x17: 0x00, 0x18: 0x00, 0x19: 0x01,
    0x1A: 0x01, 0x1B: 0x00, 0x1D: 0x00,
}

# ============================================================================
# RCSP Packet Building
# ============================================================================


def calc_checksum(data: bytes, k: int) -> int:
    """RCSP checksum: chk = (sum(data) + K) & 0xFF"""
    return (sum(data) + k) & 0xFF


def build_rx(type_byte: int, data: bytes) -> bytes:
    """Build Device→Phone packet."""
    length = len(data) + 1  # +1 for type_byte
    pkt = bytes([0xC0, 0x00, length, type_byte]) + data
    return pkt + bytes([calc_checksum(pkt, K_RX)])


def build_tx(type_byte: int, data: bytes) -> bytes:
    """Build Phone→Device packet (for testing)."""
    length = len(data) + 1
    pkt = bytes([0xF0, 0x00, length, type_byte]) + data
    return pkt + bytes([calc_checksum(pkt, K_TX)])


def parse_tx(data: bytes) -> Optional[dict]:
    """Parse Phone→Device packet."""
    if len(data) < 5 or data[0] != 0xF0:
        return None
    pkt_type = data[3]
    payload = data[4:-1]
    checksum = data[-1]
    valid = checksum == calc_checksum(data[:-1], K_TX)
    return {"type": pkt_type, "payload": payload, "checksum": checksum, "valid": valid}


# ============================================================================
# Auth State Machine (Challenge-Response)
# ============================================================================


class RcspAuth:
    """
    RCSP Authentication — Challenge-Response.

    Протокол из Android SDK (RcspAuth.java + rcsp_bluetooth.c):
    1. Phone → Device: Reset Auth Flag (любая команда до auth)
    2. Device → Phone: [0x01, random_16] — challenge
    3. Phone → Device: encrypted(random, link_key)
    4. Device → Phone: [0x00, ...] — OK
    """

    def __init__(self, link_key: bytes = LINK_KEY):
        self.link_key = link_key
        self.authenticated = False
        self.challenge: Optional[bytes] = None

    def generate_challenge(self) -> bytes:
        """Generate 16-byte random challenge."""
        self.challenge = secrets.token_bytes(16)
        return bytes([0x01]) + self.challenge

    def verify_response(self, response: bytes) -> bool:
        """
        Verify auth response from phone.

        В SDK: getEncryptedAuthData(random) — native метод.
        Реальная функция шифрования находится в libjl_bluetooth.so.
        Для эмуляции: принимаем любой ответ (BT_CONNECTION_VERIFY=0 в PROLOGY).
        """
        # В реальной прошивке PROLOGY auth может быть отключён.
        # Для совместимости: принимаем любой ответ длины >= 16.
        self.authenticated = len(response) >= 16
        return self.authenticated

    def build_ok_response(self) -> bytes:
        """Build auth OK response."""
        return bytes([0x00]) + bytes(16)  # 16 zero bytes

    def is_authenticated(self) -> bool:
        return self.authenticated


# ============================================================================
# Device State Machine
# ============================================================================


class DeviceState:
    """
    PROLOGY device state machine.

    States:
      DISCONNECTED → ADVERTISING → CONNECTED → AUTHENTICATED → READY
    """

    def __init__(self, require_auth: bool = False):
        # Connection state
        self.connected = False
        self.notify_enabled = False

        # Auth
        self.require_auth = require_auth
        self.auth = RcspAuth()
        self.auth_challenge_sent = False

        # RCSP state
        self.initialized = False
        self.heartbeat_status = 0x05
        self.eq_params = dict(DEFAULT_EQ_PARAMS)
        self.bass_level = 0x10
        self.treble_level = 0x10

        # Callbacks
        self.on_notify: Optional[Callable] = None

        # Stats
        self.commands_received = 0
        self.responses_sent = 0

    async def send(self, data: bytes):
        """Send notification to phone."""
        if self.on_notify and self.notify_enabled:
            result = self.on_notify(data)
            if asyncio.iscoroutine(result):
                await result
            self.responses_sent += 1

    async def send_init_response(self):
        """Send device identification after init command."""
        # ID packet — из btsnoop: тип 0xFF
        hw_id = bytes.fromhex("000401050704000402c50003000808dc78e712ff0300000e03")
        await self.send(build_rx(0xFF, hw_id + FIRMWARE_VERSION))
        log.info(f"📤 Device ID: {FIRMWARE_VERSION.decode()}")

        # Params map — из btsnoop
        parts = []
        for idx in [0x14, 0x15, 0x12, 0x13, 0x16, 0x17, 0x18, 0x19, 0x1B, 0x1A, 0x1D]:
            val = self.eq_params.get(idx, 0x00)
            parts.append(bytes([0x03, 0x92, idx, val & 0xFF, 0x00]))
        await self.send(build_rx(0xFF, b"".join(parts)))
        log.info("📤 Params map sent")

    async def send_heartbeat(self):
        """Periodic heartbeat."""
        await self.send(build_rx(0x05, bytes([self.heartbeat_status])))

    async def handle_command(self, data: bytes):
        """Process incoming RCSP command."""
        self.commands_received += 1

        # Check if auth is required
        if self.require_auth and not self.auth.is_authenticated():
            await self._handle_auth_command(data)
            return

        # Normal RCSP processing
        pkt = parse_tx(data)
        if not pkt:
            log.warning(f"⚠️ Invalid packet: {data[:20].hex()}")
            return

        if not pkt["valid"]:
            exp = calc_checksum(data[:-1], K_TX)
            log.warning(f"⚠️ Bad checksum: got 0x{pkt['checksum']:02X}, exp 0x{exp:02X}")
            return

        cmd = pkt["type"]
        payload = pkt["payload"]
        log.debug(f"🔧 Cmd 0x{cmd:02X}: {payload.hex()}")

        handlers = {
            0x00: self._cmd_reset_auth,  # Reset Auth Flag
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
            log.warning(f"⚠️ Unknown cmd: 0x{cmd:02X} payload={payload.hex()}")

    async def _handle_auth_command(self, data: bytes):
        """Handle auth-related commands when auth is required."""
        if not self.auth_challenge_sent:
            # First command after connection — send challenge
            challenge = self.auth.generate_challenge()
            self.auth_challenge_sent = True
            await self.send(build_rx(0xFF, challenge))
            log.info("🔐 Auth challenge sent")
        else:
            # Phone sending auth response
            if self.auth.verify_response(data):
                await self.send(self.auth.build_ok_response())
                log.info("✅ Auth OK")
            else:
                log.warning("❌ Auth FAILED")

    async def _cmd_reset_auth(self, payload):
        """Reset auth flag — phone requesting re-auth."""
        self.auth.authenticated = False
        self.auth_challenge_sent = False
        log.info("🔄 Auth reset requested")

    async def _cmd_init(self, payload):
        """Initialize device."""
        self.initialized = True
        self.heartbeat_status = 0x05
        await self.send_init_response()

    async def _cmd_heartbeat(self, payload):
        """Heartbeat — just log, no response needed."""
        log.debug(f"💓 HB: {payload.hex()}")

    async def _cmd_query(self, payload):
        """Query parameter value."""
        if payload:
            p = payload[0]
            v = self.eq_params.get(p, 0x00)
            await self.send(build_rx(0x90, bytes([p, v])))
            log.debug(f"📋 Query 0x{p:02X} = 0x{v:02X}")

    async def _cmd_write(self, payload):
        """Write parameter (EQ, Bass, Treble, etc.)."""
        if len(payload) >= 2:
            reg, val = payload[0], payload[1]
            self.eq_params[reg] = val
            log.info(f"✏️ Write 0x{reg:02X}=0x{val:02X}")

            # Update heartbeat status based on value
            if val > 0x20:
                self.heartbeat_status = 0x06

            # Confirm write
            await self.send(build_rx(0x9A, bytes([0x0A, 0x01])))

    async def _cmd_extended(self, payload):
        """Extended command."""
        if payload:
            await self.send(build_rx(0x9A, bytes([payload[0], 0x02])))
            log.debug(f"📦 Extended: {payload.hex()}")

    async def _cmd_status(self, payload):
        """Status request."""
        if payload:
            await self.send(build_rx(0x9F, payload))
            log.debug(f"📊 Status: {payload.hex()}")

    async def _cmd_config(self, payload):
        """Config command."""
        if payload:
            await self.send(build_rx(0xB0, bytes([payload[0], 0x01])))
            log.debug(f"⚙️ Config: {payload.hex()}")

    def get_state_summary(self) -> str:
        """Get human-readable state summary."""
        parts = []
        parts.append(f"Connected: {self.connected}")
        parts.append(f"Notify: {self.notify_enabled}")
        parts.append(f"Auth: {'✅' if self.auth.is_authenticated() else '❌' if self.require_auth else 'N/A'}")
        parts.append(f"Initialized: {self.initialized}")
        parts.append(f"HB Status: 0x{self.heartbeat_status:02X}")
        parts.append(f"Commands: {self.commands_received} RX / {self.responses_sent} TX")
        return " | ".join(parts)


# ============================================================================
# HCI Raw BLE Peripheral
# ============================================================================


class HCIBlePeripheral:
    """BLE Peripheral через HCI raw socket."""

    def __init__(self, state: DeviceState):
        self.state = state
        self.sock = None
        self.running = False
        self.connection_handle = None

    async def start(self):
        """Start BLE advertising via HCI."""
        import socket

        log.info("📡 HCI raw mode — taking adapter down...")
        await self._run_cmd("hciconfig", "hci0", "down")
        await asyncio.sleep(0.5)

        try:
            # HCI socket (requires adapter DOWN)
            self.sock = socket.socket(
                socket.AF_BLUETOOTH, socket.SOCK_RAW, socket.BTPROTO_HCI
            )
            self.sock.bind((0,))
            self.running = True
            log.info("✅ HCI raw socket bound")

            # Bring adapter up
            await self._run_cmd("hciconfig", "hci0", "up")
            await asyncio.sleep(1)

            # Disable advertising
            await self._hci_cmd(0x08, 0x000A, bytes([0x00]))

            # Set advertising parameters
            await self._hci_le_set_advertising_params()

            # Set advertising data
            adv_data = self._build_adv_data()
            await self._hci_le_set_advertising_data(adv_data)

            # Set scan response
            scan_data = self._build_scan_response()
            await self._hci_le_set_scan_response(scan_data)

            # Enable advertising
            await self._hci_cmd(0x08, 0x000A, bytes([0x01]))
            log.info("📡 Advertising as PROLOGY_BLE")

            # Start listening
            asyncio.create_task(self._hci_listen())

        except Exception as e:
            log.error(f"❌ HCI raw mode failed: {e}")
            raise

    def _build_adv_data(self) -> bytes:
        """Build advertising data."""
        name = b"PROLOGY_BLE"
        flags = bytes([0x02, 0x01, 0x06])  # LE General + BR/EDR Not Supported
        svc = bytes([0x03, 0x03, 0x00, 0xAE])  # Service UUID 0xAE00
        n = bytes([len(name) + 1, 0x09]) + name
        return flags + svc + n

    def _build_scan_response(self) -> bytes:
        return bytes([0x02, 0x0A, 0x00])  # TX power 0

    async def _run_cmd(self, *args):
        proc = await asyncio.create_subprocess_exec(
            *args,
            stdout=asyncio.subprocess.PIPE,
            stderr=asyncio.subprocess.PIPE,
        )
        await proc.communicate()

    async def _hci_cmd(self, ogf: int, ocf: int, data: bytes = b"") -> bytes:
        """Send HCI command and wait for response."""
        import select
        opcode = (ogf << 10) | ocf
        hdr = struct.pack("<BHB", 0x01, opcode, len(data))
        self.sock.send(hdr + data)

        # Wait for response with timeout
        ready, _, _ = select.select([self.sock], [], [], 2.0)
        if ready:
            evt = self.sock.recv(258)
            return evt
        return b""

    async def _hci_le_set_advertising_params(self):
        """Set LE advertising parameters (100ms interval, connectable)."""
        params = struct.pack("<HHBBB",
                             0x00A0,   # Min: 100ms
                             0x00C0,   # Max: 120ms
                             0x00,     # ADV_IND
                             0x00,     # Public addr
                             0x07)     # All channels
        await self._hci_cmd(0x08, 0x0006, params)

    async def _hci_le_set_advertising_data(self, data: bytes):
        params = struct.pack("B", len(data)) + data.ljust(31, b'\x00')
        await self._hci_cmd(0x08, 0x0008, params)

    async def _hci_le_set_scan_response(self, data: bytes):
        params = struct.pack("B", len(data)) + data.ljust(31, b'\x00')
        await self._hci_cmd(0x08, 0x0009, params)

    async def _hci_listen(self):
        """Listen for BLE events."""
        import select
        log.info("👂 Listening for BLE events...")
        while self.running:
            try:
                ready, _, _ = select.select([self.sock], [], [], 1.0)
                if ready:
                    data = self.sock.recv(258)
                    if data and len(data) > 3:
                        evt_code = data[0]
                        if evt_code == 0x3E:  # LE Meta Event
                            subevent = data[3]
                            if subevent == 0x01:  # LE Connection Complete
                                hdl = struct.unpack("<H", data[5:7])[0]
                                self.connection_handle = hdl
                                self.state.connected = True
                                log.info(f"🔗 Connected! Handle: 0x{hdl:04X}")
                                log.info(f"   {self.state.get_state_summary()}")
                            elif subevent == 0x05:  # Disconnection Complete
                                self.state.connected = False
                                self.state.notify_enabled = False
                                self.state.initialized = False
                                log.info("📴 Disconnected")
            except Exception as e:
                log.error(f"HCI listen error: {e}")
                break

    async def stop(self):
        self.running = False
        if self.sock:
            try:
                await self._hci_cmd(0x08, 0x000A, bytes([0x00]))
            except Exception:
                pass
            self.sock.close()


# ============================================================================
# Main
# ============================================================================


async def main():
    log.info("=" * 60)
    log.info("PROLOGY BLE Emulator (Jieli AC6951) v3")
    log.info("=" * 60)
    log.info(f"Service: {SERVICE_UUID}")
    log.info(f"TX: {TX_CHAR_UUID}")
    log.info(f"RX: {RX_CHAR_UUID}")
    log.info(f"Firmware: {FIRMWARE_VERSION.decode()}")
    log.info(f"Auth required: {'NO (like PROLOGY)' if False else 'YES'}")
    log.info(f"Link Key: {LINK_KEY.hex()}")
    log.info("")

    if os.geteuid() != 0:
        log.error("❌ Требуется root!")
        sys.exit(1)

    # Auth OFF — как в PROLOGY firmware (BT_CONNECTION_VERIFY обход)
    state = DeviceState(require_auth=False)

    try:
        hci = HCIBlePeripheral(state)
        await hci.start()
    except Exception as e:
        log.error(f"❌ HCI failed: {e}")
        sys.exit(1)

    # Signal handling
    loop = asyncio.get_event_loop()
    stop_event = asyncio.Event()

    def signal_handler():
        log.info("\n🛑 Shutdown...")
        stop_event.set()

    for sig in (signal.SIGINT, signal.SIGTERM):
        loop.add_signal_handler(sig, signal_handler)

    # Heartbeat loop — только после init
    async def hb_loop():
        while not stop_event.is_set():
            if state.initialized and state.connected:
                await state.send_heartbeat()
                log.debug("💓 Heartbeat sent")
            await asyncio.sleep(3.1)

    hb_task = asyncio.create_task(hb_loop())

    # Status loop
    async def status_loop():
        while not stop_event.is_set():
            log.info(f"📊 {state.get_state_summary()}")
            await asyncio.sleep(30)

    status_task = asyncio.create_task(status_loop())

    log.info("🔄 Emulator running... (Ctrl+C to stop)")
    await stop_event.wait()

    hb_task.cancel()
    status_task.cancel()
    await hci.stop()
    log.info("👋 Bye!")


if __name__ == "__main__":
    try:
        asyncio.run(main())
    except KeyboardInterrupt:
        pass
