#!/usr/bin/env python3
"""
PROLOGY BLE Device Emulator (Jieli AC6951)

Эмулятор BLE периферийного устройства PROLOGY через BlueZ D-Bus API.
Реализует RCSP протокол с полным checksum.

Требования:
  - Linux с BlueZ 5.48+
  - Root права (для BLE Peripheral advertising)
  - dbus-fast (уже установлен)

Запуск:
  sudo python3 prology_ble_emulator.py
"""

import asyncio
import struct
import logging
import time
from typing import Optional

from dbus_fast import Message, MessageType
from dbus_fast.aio import MessageBus
from dbus_fast.constants import PropertyAccess
from dbus_fast.service import ServiceInterface, PropertyAccess as PropAccess, method, dbus_property, signal

logging.basicConfig(
    level=logging.INFO,
    format="%(asctime)s [%(levelname)s] %(name)s: %(message)s",
)
log = logging.getLogger("prology_emulator")

# ============================================================================
# RCSP Protocol Constants
# ============================================================================

SERVICE_UUID = "0000ae00-0000-1000-8000-00805f9b34fb"
TX_CHAR_UUID = "0000ae01-0000-1000-8000-00805f9b34fb"
RX_CHAR_UUID = "0000ae02-0000-1000-8000-00805f9b34fb"
CCCD_UUID = "00002902-0000-1000-8000-00805f9b34fb"

SYNC_TX = 0xF0
SYNC_RX = 0xC0
RESERVED = 0x00
K_TX = 0x10
K_RX = 0x40

# Device identification
FIRMWARE_VERSION = b"VER 8.7DSP   j"

# Default EQ parameters (from btsnoop analysis)
DEFAULT_EQ_PARAMS = {
    0x12: 0x00,  # Band 1
    0x13: 0x01,  # Band 2
    0x14: 0x0F,  # Band 3
    0x15: 0x03,  # Band 4
    0x16: 0x01,  # Band 5
    0x17: 0x00,  # Band 6
    0x18: 0x00,  # Band 7
    0x19: 0x01,  # Band 8
    0x1A: 0x01,  # Band 9
    0x1B: 0x00,  # Band 10
    0x1D: 0x00,  # Band 11
}

# ============================================================================
# RCSP Protocol Handler
# ============================================================================


class RCSPProtocol:
    """RCSP protocol encoder/decoder."""

    @staticmethod
    def calc_checksum_tx(data: bytes) -> int:
        return (sum(data) + K_TX) & 0xFF

    @staticmethod
    def calc_checksum_rx(data: bytes) -> int:
        return (sum(data) + K_RX) & 0xFF

    @staticmethod
    def parse_packet(data: bytes) -> Optional[dict]:
        """Parse incoming TX packet."""
        if len(data) < 5:
            return None
        if data[0] != SYNC_TX:
            return None

        sync = data[0]
        reserved = data[1]
        length = data[2]
        cmd_type = data[3]
        payload = data[4:-1]
        checksum = data[-1]

        expected = RCSPProtocol.calc_checksum_tx(data[:-1])
        valid = checksum == expected

        return {
            "sync": sync,
            "reserved": reserved,
            "length": length,
            "type": cmd_type,
            "payload": payload,
            "checksum": checksum,
            "valid": valid,
        }

    @staticmethod
    def build_rx(type_byte: int, data: bytes) -> bytes:
        """Build RX packet with checksum."""
        length = len(data) + 1  # type + data
        packet = bytes([SYNC_RX, RESERVED, length, type_byte]) + data
        chk = RCSPProtocol.calc_checksum_rx(packet)
        return packet + bytes([chk])

    @staticmethod
    def build_init_response() -> bytes:
        """Build device identification packet (40 bytes)."""
        # From btsnoop: C0 00 27 FF 00 04 01 05 07 04 00 04 02 C5 00 03 00 08 08
        #               DC 78 E7 12 FF 03 00 00 0E 03 VER 8.7DSP   j
        hw_id = bytes.fromhex("000401050704000402c50003000808dc78e712ff0300000e03")
        fw_str = FIRMWARE_VERSION
        data = hw_id + fw_str
        return RCSPProtocol.build_rx(0xFF, data)

    @staticmethod
    def build_params_map() -> bytes:
        """Build parameters map (60 bytes)."""
        # Pattern: 03 92 [IDX] [VAL_hi] [VAL_lo]
        parts = []
        for idx in [0x14, 0x15, 0x12, 0x13, 0x16, 0x17, 0x18, 0x19, 0x1B, 0x1A, 0x1D]:
            val = DEFAULT_EQ_PARAMS.get(idx, 0x00)
            parts.append(bytes([0x03, 0x92, idx, val & 0xFF, 0x00]))
        data = b"".join(parts)
        return RCSPProtocol.build_rx(0xFF, data)

    @staticmethod
    def build_heartbeat(status: int = 0x05) -> bytes:
        """Build heartbeat notification."""
        # C0 00 02 05 [status] [chk]
        data = bytes([status])
        return RCSPProtocol.build_rx(0x05, data)

    @staticmethod
    def build_status_response(param: int, value: int = 0x00) -> bytes:
        """Build status response for 0x9F confirm."""
        data = bytes([param])
        return RCSPProtocol.build_rx(0x9F, data)

    @staticmethod
    def build_param_data(param: int, value: int) -> bytes:
        """Build parameter data response (0x90)."""
        data = bytes([param, value])
        return RCSPProtocol.build_rx(0x90, data)

    @staticmethod
    def build_telemetry() -> bytes:
        """Build telemetry data (0x92) - EQ levels."""
        # Simulated EQ levels
        levels = bytes([0x0D, 0x2E, 0x22, 0x28, 0x23, 0x48, 0x26, 0x68,
                        0x29, 0x30, 0x2A, 0x2E, 0x22, 0xF1])
        return RCSPProtocol.build_rx(0x92, bytes([0x0C]) + levels)

    @staticmethod
    def build_status_data(param: int, value: bytes) -> bytes:
        """Build status data response (0x9A)."""
        data = bytes([param]) + value
        return RCSPProtocol.build_rx(0x9A, data)

    @staticmethod
    def build_b0_response(param: int, value: int = 0x00) -> bytes:
        """Build B0 config response."""
        data = bytes([param, value])
        return RCSPProtocol.build_rx(0xB0, data)


# ============================================================================
# GATT Characteristic Implementations
# ============================================================================


class TXCharacteristic(ServiceInterface):
    """Write characteristic - receives commands from phone."""

    def __init__(self, path: str, emulator):
        super().__init__("org.bluez.GattCharacteristic1")
        self.path = path
        self.emulator = emulator
        self._value = bytearray()
        self._notifying = False

    @dbus_property(name="UUID", signature="s")
    def get_uuid(self):
        return TX_CHAR_UUID

    @dbus_property(name="Service", signature="o")
    def get_service(self):
        return "/org/bluez/prology/service"

    @dbus_property(name="Value", signature="ay")
    def get_value(self):
        return self._value

    @dbus_property(name="Flags", signature="as")
    def get_flags(self):
        return ["write-without-response"]

    @method(name="WriteValue")
    async def write_value(self, value: "ay", options: "a{sv}"):  # type: ignore  # noqa: F722
        """Handle write command from phone."""
        data = bytes(value)
        log.info(f"📥 TX Write: {' '.join(f'{b:02X}' for b in data)}")
        await self.emulator.handle_command(data)

    @method(name="StartNotify")
    async def start_notify(self):
        self._notifying = True
        log.info("📡 StartNotify called on TX (unexpected, but OK)")

    @method(name="StopNotify")
    async def stop_notify(self):
        self._notifying = False
        log.info("🔇 StopNotify called on TX")

    @method(name="ReadValue")
    async def read_value(self, options: "a{sv}"):
        return self._value


class RXCharacteristic(ServiceInterface):
    """Notify characteristic - sends data to phone."""

    def __init__(self, path: str):
        super().__init__("org.bluez.GattCharacteristic1")
        self.path = path
        self._value = bytearray()
        self._fd_watch = None

    @dbus_property(name="UUID", signature="s")
    def get_uuid(self):
        return RX_CHAR_UUID

    @dbus_property(name="Service", signature="o")
    def get_service(self):
        return "/org/bluez/prology/service"

    @dbus_property(name="Value", signature="ay")
    def get_value(self):
        return self._value

    @dbus_property(name="Notifying", signature="b")
    def get_notifying(self):
        return self._fd_watch is not None

    @dbus_property(name="Flags", signature="as")
    def get_flags(self):
        return ["notify"]

    @method(name="StartNotify")
    async def start_notify(self):
        log.info("✅ RX notifications enabled")

    @method(name="StopNotify")
    async def stop_notify(self):
        log.info("🔇 RX notifications disabled")
        self._fd_watch = None

    @method(name="ReadValue")
    async def read_value(self, options: "a{sv}"):
        return self._value

    @method(name="Confirm")
    async def confirm(self):
        pass

    def set_fd(self, fd):
        """Set the file descriptor for sending notifications."""
        self._fd_watch = fd

    async def send_notification(self, data: bytes):
        """Send notification to connected central."""
        if self._fd_watch is None:
            log.warning("⚠️ No notification FD, cannot send")
            return

        # Write directly to the fd
        import os
        try:
            os.write(self._fd_watch, data)
            self._value = bytearray(data)
            log.debug(f"📤 RX Notify: {' '.join(f'{b:02X}' for b in data[:20])}...")
        except OSError as e:
            log.error(f"❌ Failed to send notification: {e}")
            self._fd_watch = None


class CCCDCharacteristic(ServiceInterface):
    """Client Characteristic Configuration Descriptor."""

    def __init__(self, path: str):
        super().__init__("org.bluez.GattDescriptor1")
        self.path = path
        self._value = bytearray([0x00, 0x00])

    @dbus_property(name="UUID", signature="s")
    def get_uuid(self):
        return CCCD_UUID

    @dbus_property(name="Characteristic", signature="o")
    def get_characteristic(self):
        return "/org/bluez/prology/rx_char"

    @dbus_property(name="Value", signature="ay")
    def get_value(self):
        return self._value

    @method(name="ReadValue")
    async def read_value(self, options: "a{sv}"):
        return self._value

    @method(name="WriteValue")
    async def write_value(self, value: "ay", options: "a{sv}"):  # type: ignore  # noqa: F722
        self._value = bytearray(value)
        log.info(f"📝 CCCD Write: {' '.join(f'{b:02X}' for b in value)}")


# ============================================================================
# GATT Service
# ============================================================================


class PrologyService(ServiceInterface):
    """GATT Service for PROLOGY device."""

    def __init__(self):
        super().__init__("org.bluez.GattService1")
        self.path = "/org/bluez/prology/service"

    @dbus_property(name="UUID", signature="s")
    def get_uuid(self):
        return SERVICE_UUID

    @dbus_property(name="Primary", signature="b")
    def get_primary(self):
        return True


# ============================================================================
# Main Emulator
# ============================================================================


class PrologyEmulator:
    """Main PROLOGY BLE Emulator."""

    def __init__(self):
        self.protocol = RCSPProtocol()
        self.initialized = False
        self.heartbeat_status = 0x05
        self.eq_params = dict(DEFAULT_EQ_PARAMS)
        self.bus: Optional[MessageBus] = None
        self.heartbeat_task: Optional[asyncio.Task] = None
        self.rx_char: Optional[RXCharacteristic] = None

        # Service and characteristics
        self.service = PrologyService()
        self.tx_char = None  # Will be created with bus
        self.rx_char = None
        self.cccd = None

    async def handle_command(self, data: bytes):
        """Handle incoming RCSP command."""
        parsed = self.protocol.parse_packet(data)
        if not parsed:
            log.warning(f"⚠️ Invalid packet: {' '.join(f'{b:02X}' for b in data)}")
            return

        if not parsed["valid"]:
            log.warning(
                f"⚠️ Bad checksum: got 0x{parsed['checksum']:02X}, "
                f"expected 0x{self.protocol.calc_checksum_tx(data[:-1]):02X}"
            )

        cmd_type = parsed["type"]
        payload = parsed["payload"]

        log.info(f"🔧 Command 0x{cmd_type:02X}: {' '.join(f'{b:02X}' for b in payload)}")

        handler = {
            0x01: self._handle_init,
            0x03: self._handle_query,
            0x04: self._handle_heartbeat,
            0x80: self._handle_write_param,
            0x8A: self._handle_extended,
            0x8E: self._handle_status_req,
            0xA0: self._handle_config,
        }.get(cmd_type)

        if handler:
            await handler(payload)
        else:
            log.warning(f"⚠️ Unknown command: 0x{cmd_type:02X}")

    async def _handle_init(self, payload: bytes):
        """Handle Init command (0x01)."""
        log.info("🚀 Init command received")
        self.initialized = True
        self.heartbeat_status = 0x05

        # Send identification
        id_pkt = self.protocol.build_init_response()
        await self._send_notification(id_pkt)
        log.info(f"📤 Sent device ID: {FIRMWARE_VERSION}")

        # Send params map
        map_pkt = self.protocol.build_params_map()
        await self._send_notification(map_pkt)
        log.info("📤 Sent params map")

        # Start heartbeat
        if self.heartbeat_task is None or self.heartbeat_task.done():
            self.heartbeat_task = asyncio.create_task(self._heartbeat_loop())

    async def _handle_heartbeat(self, payload: bytes):
        """Handle Heartbeat command (0x04)."""
        log.debug(f"💓 Heartbeat: {' '.join(f'{b:02X}' for b in payload)}")
        # Heartbeat responses are sent periodically by _heartbeat_loop
        # No immediate response needed

    async def _handle_query(self, payload: bytes):
        """Handle Query command (0x03)."""
        if len(payload) >= 1:
            param = payload[0]
            log.info(f"🔍 Query param 0x{param:02X}")
            value = self.eq_params.get(param, 0x00)
            resp = self.protocol.build_param_data(param, value)
            await self._send_notification(resp)

    async def _handle_write_param(self, payload: bytes):
        """Handle Write Parameter command (0x80)."""
        if len(payload) >= 2:
            reg = payload[0]
            value = payload[1]
            log.info(f"✏️ Write param reg=0x{reg:02X} val=0x{value:02X}")
            self.eq_params[reg] = value

            # Send confirmation
            resp = self.protocol.build_status_data(0x0A, bytes([0x01]))
            await self._send_notification(resp)

            # Check if we need to change heartbeat status
            if value > 0x20:
                self.heartbeat_status = 0x06
                log.info(f"🔄 Heartbeat status changed to 0x06")

    async def _handle_extended(self, payload: bytes):
        """Handle Extended Config command (0x8A)."""
        if len(payload) >= 1:
            sub_cmd = payload[0]
            log.info(f"⚙️ Extended config sub=0x{sub_cmd:02X}: "
                     f"{' '.join(f'{b:02X}' for b in payload[1:])}")
            resp = self.protocol.build_status_data(sub_cmd, bytes([0x02]))
            await self._send_notification(resp)

    async def _handle_status_req(self, payload: bytes):
        """Handle Status Request command (0x8E)."""
        if len(payload) >= 1:
            channel = payload[0]
            log.info(f"📊 Status request channel={channel}")
            resp = self.protocol.build_status_response(channel)
            await self._send_notification(resp)

    async def _handle_config(self, payload: bytes):
        """Handle Config command (0xA0)."""
        log.info(f"🎛️ Config: {' '.join(f'{b:02X}' for b in payload)}")
        if len(payload) >= 1:
            sub = payload[0]
            resp = self.protocol.build_b0_response(sub, 0x01)
            await self._send_notification(resp)

    async def _heartbeat_loop(self):
        """Send periodic heartbeat notifications."""
        log.info("💓 Starting heartbeat loop (3.1s interval)")
        while self.initialized:
            pkt = self.protocol.build_heartbeat(self.heartbeat_status)
            await self._send_notification(pkt)
            log.debug(f"💓 Heartbeat sent: status=0x{self.heartbeat_status:02X}")
            await asyncio.sleep(3.1)

    async def _send_notification(self, data: bytes):
        """Send notification via RX characteristic."""
        if self.rx_char:
            await self.rx_char.send_notification(data)
        else:
            log.warning("⚠️ RX characteristic not set")

    async def register_gatt_services(self, bus: MessageBus):
        """Register GATT services with BlueZ."""
        # Create characteristics with bus reference
        from dbus_fast.service import method, dbus_property

        # TX characteristic
        tx_char = TXCharacteristic("/org/bluez/prology/tx", self)
        self.tx_char = tx_char

        # RX characteristic
        rx_char = RXCharacteristic("/org/bluez/prology/rx")
        self.rx_char = rx_char

        # CCCD
        cccd = CCCDCharacteristic("/org/bluez/prology/cccd")
        self.cccd = cccd

        # Export all objects
        bus.export(self.service.path, self.service)
        bus.export(tx_char.path, tx_char)
        bus.export(rx_char.path, rx_char)
        bus.export(cccd.path, cccd)

        log.info("✅ GATT services exported")

    async def start_advertising(self, bus: MessageBus):
        """Start BLE advertising via BlueZ LEAdvertisingManager1."""
        # Get adapter
        introspect = await bus.introspect("org.bluez", "/org/bluez")
        obj = await bus.get_proxy_object("org.bluez", "/org/bluez", introspect)
        props_iface = obj.get_interface("org.freedesktop.DBus.Properties")

        # Find hci0 adapter
        try:
            adapter_props = await props_iface.call_get_all("org.bluez.Adapter1")
        except Exception:
            # Try to get hci0 directly
            log.info("Trying to access hci0 adapter...")

        # Create advertisement
        adv_path = "/org/bluez/prology/adv"

        # Build advertisement data
        adv_data = {
            "Type": "peripheral",
            "ServiceUUIDs": [SERVICE_UUID],
            "LocalName": "PROLOGY_BLE",
            "IncludesTxPower": False,
        }

        # Register advertisement
        try:
            introspect_adv = await bus.introspect("org.bluez", "/org/bluez/hci0")
            obj_hci0 = await bus.get_proxy_object("org.bluez", "/org/bluez/hci0", introspect_adv)
            adv_mgr = obj_hci0.get_interface("org.bluez.LEAdvertisingManager1")

            # Get the advertisement object
            from dbus_fast.service import ServiceInterface, method, dbus_property

            class Advertisement(ServiceInterface):
                def __init__(self):
                    super().__init__("org.bluez.LEAdvertisement1")

                @dbus_property(name="Type", signature="s")
                def get_type(self):
                    return "peripheral"

                @dbus_property(name="ServiceUUIDs", signature="as")
                def get_service_uuids(self):
                    return [SERVICE_UUID]

                @dbus_property(name="LocalName", signature="s")
                def get_local_name(self):
                    return "PROLOGY_BLE"

                @method(name="Release")
                def release(self):
                    log.info("📢 Advertisement released")

            adv = Advertisement()
            bus.export(adv_path, adv)

            await adv_mgr.call_register_advertisement(adv_path, {})
            log.info("✅ Advertisement registered")

            # Start advertising
            await props_iface.call_set("org.bluez.Adapter1", "Powered", "b", True)
            log.info("📡 Advertising as PROLOGY_BLE")

        except Exception as e:
            log.error(f"❌ Failed to start advertising: {e}")
            log.info("Trying alternative approach...")
            await self._start_advertising_fallback(bus)

    async def _start_advertising_fallback(self, bus: MessageBus):
        """Fallback advertising using hcitool."""
        import subprocess
        try:
            # Use bluetoothctl to set up advertising
            log.info("Using bluetoothctl for advertising setup...")
            proc = await asyncio.create_subprocess_exec(
                "bluetoothctl",
                stdin=asyncio.subprocess.PIPE,
                stdout=asyncio.subprocess.PIPE,
                stderr=asyncio.subprocess.PIPE,
            )
            # This is a simplified fallback
            log.warning("⚠️ Fallback mode - limited functionality")
        except Exception as e:
            log.error(f"❌ Fallback advertising failed: {e}")

    async def run(self):
        """Main entry point."""
        log.info("=" * 60)
        log.info("PROLOGY BLE Emulator (Jieli AC6951)")
        log.info("=" * 60)
        log.info(f"Service UUID: {SERVICE_UUID}")
        log.info(f"TX Characteristic: {TX_CHAR_UUID}")
        log.info(f"RX Characteristic: {RX_CHAR_UUID}")
        log.info(f"Firmware: {FIRMWARE_VERSION.decode()}")
        log.info("")

        # Connect to system bus
        self.bus = await MessageBus(bus_type="system").connect()
        log.info("✅ Connected to D-Bus system bus")

        # Register GATT services
        await self.register_gatt_services(self.bus)

        # Start advertising
        await self.start_advertising(self.bus)

        # Keep running
        log.info("🔄 Emulator running... (Ctrl+C to stop)")
        try:
            await asyncio.Future()  # Run forever
        except asyncio.CancelledError:
            pass
        finally:
            await self.shutdown()

    async def shutdown(self):
        """Clean shutdown."""
        log.info("🛑 Shutting down emulator...")
        if self.heartbeat_task:
            self.heartbeat_task.cancel()
        if self.bus:
            self.bus.disconnect()


async def main():
    emulator = PrologyEmulator()
    try:
        await emulator.run()
    except KeyboardInterrupt:
        await emulator.shutdown()
    except PermissionError:
        log.error("❌ Permission denied. Run with sudo!")
    except Exception as e:
        log.error(f"❌ Fatal error: {e}", exc_info=True)
        raise


if __name__ == "__main__":
    asyncio.run(main())
