#!/usr/bin/env python3
"""
PROLOGY BLE GATT Server
Эмулирует PROLOGY устройство через Bluez D-Bus API.

Service UUID: 0xAE00
TX (Write):   0xAE01 — принимает команды
RX (Notify):  0xAE02 — отправляет ответы
"""

import dbus
import dbus.service
import dbus.mainloop.glib
from gi.repository import GLib
import struct
import logging
import sys
import os

logging.basicConfig(
    level=logging.INFO,
    format='%(asctime)s [%(levelname)s] %(message)s',
    datefmt='%H:%M:%S'
)
logger = logging.getLogger('PROLOGY_GATT')

# ============================================================
# RCSP Checksum и пакеты
# ============================================================

def calc_tx_checksum(data: bytes) -> int:
    return (sum(data) + 0x10) & 0xFF

def calc_rx_checksum(data: bytes) -> int:
    return (sum(data) + 0x40) & 0xFF

def build_rx_packet(cmd: int, payload: bytes = b'') -> bytes:
    data = bytes([cmd]) + payload
    chk = calc_rx_checksum(data)
    return data + bytes([chk])

def build_heartbeat_response(seq: int) -> bytes:
    return build_rx_packet(0x05, bytes([seq]))

def build_identification_response() -> bytes:
    device_name = b'PROLOGY_BLE'
    firmware_ver = b'VER 8.7DSP'
    payload = bytes([0x00]) + device_name + b'\x00' + firmware_ver
    return build_rx_packet(0xFF, payload)

def build_status_response(channel: int) -> bytes:
    return build_rx_packet(0x07, bytes([channel, 0x00]))

def build_param_data_response(channel: int) -> bytes:
    return build_rx_packet(0x90, bytes([channel, 0x00, 0x01]))

def build_telemetry_response(battery: int = 85) -> bytes:
    return build_rx_packet(0x92, bytes([battery, 0x00]))

def build_confirm_response(cmd: int) -> bytes:
    return build_rx_packet(0x9F, bytes([cmd]))

# ============================================================
# RCSP Command Handler
# ============================================================

class RCSPHandler:
    def __init__(self):
        self.heartbeat_count = 0

    def handle(self, data: bytes) -> bytes:
        if len(data) < 2:
            return b''
        
        received_chk = data[-1]
        cmd = data[0]
        payload = data[1:-1]

        # Проверка checksum
        expected = calc_tx_checksum(data[:-1])
        if received_chk != expected:
            logger.warning(f"Checksum error: got {received_chk}, expected {expected}")
            return b''

        logger.info(f"📥 CMD=0x{cmd:02X} payload={payload.hex()}")

        if cmd == 0x01:
            logger.info("✅ Init — отправка Identification")
            return build_identification_response()
        elif cmd == 0x03:
            ch = payload[0] if payload else 0
            return build_status_response(ch)
        elif cmd == 0x04:
            self.heartbeat_count += 1
            seq = payload[0] if payload else 0
            return build_heartbeat_response(seq)
        elif cmd == 0x80:
            logger.info("📝 Write Param")
            return build_confirm_response(cmd)
        elif cmd == 0x8A:
            logger.info(f"⚙️ Config Ext sub=0x{payload[0]:02X}" if payload else "⚙️ Config Ext")
            return build_confirm_response(cmd)
        elif cmd == 0x8E:
            ch = payload[0] if payload else 0
            return build_param_data_response(ch)
        elif cmd == 0xA0:
            logger.info("🎚️ Gain/Fade")
            return build_confirm_response(cmd)
        else:
            logger.warning(f"❓ Unknown: 0x{cmd:02X}")
            return build_rx_packet(0x9F, bytes([cmd]))

# ============================================================
# Bluez D-Bus Objects
# ============================================================

BLUEZ_SERVICE = 'org.bluez'
GATT_MGR_IFACE = 'org.bluez.GattManager1'
LE_ADV_MGR_IFACE = 'org.bluez.LEAdvertisingManager1'
GATT_SVC_IFACE = 'org.bluez.GattService1'
GATT_CHRC_IFACE = 'org.bluez.GattCharacteristic1'
GATT_DESC_IFACE = 'org.bluez.GattDescriptor1'
PROPS_IFACE = 'org.freedesktop.DBus.Properties'
OM_IFACE = 'org.freedesktop.DBus.ObjectManager'

SERVICE_UUID = '0000ae00-0000-1000-8000-00805f9b34fb'
TX_CHAR_UUID = '0000ae01-0000-1000-8000-00805f9b34fb'
RX_CHAR_UUID = '0000ae02-0000-1000-8000-00805f9b34fb'

rcsp_handler = RCSPHandler()

class Service(dbus.service.Object):
    def __init__(self, bus, index):
        self.path = f'/org/bluez/prology/service{index}'
        self.uuid = SERVICE_UUID
        self.primary = True
        dbus.service.Object.__init__(self, bus, self.path)

class Characteristic(dbus.service.Object):
    def __init__(self, bus, index, uuid, svc_path, flags):
        self.path = f'/org/bluez/prology/char{index}'
        self.uuid = uuid
        self.service = svc_path
        self.flags = flags
        self.descriptors = []
        dbus.service.Object.__init__(self, bus, self.path)

    def add_descriptor(self, descriptor):
        self.descriptors.append(descriptor)

class Descriptor(dbus.service.Object):
    def __init__(self, bus, index, uuid, chr_path, flags):
        self.path = f'/org/bluez/prology/desc{index}'
        self.uuid = uuid
        self.characteristic = chr_path
        self.flags = flags
        dbus.service.Object.__init__(self, bus, self.path)

class TXCharacteristic(Characteristic):
    """Write characteristic — принимает команды от клиента"""
    
    def __init__(self, bus, index, svc_path):
        Characteristic.__init__(
            self, bus, index, TX_CHAR_UUID, svc_path,
            ['write', 'write-without-response']
        )
        self.value = dbus.Array([], signature='y')

    @dbus.service.method(GATT_CHRC_IFACE, in_signature='a{sv}', out_signature='ay')
    def ReadValue(self, options):
        return self.value

    @dbus.service.method(GATT_CHRC_IFACE, in_signature='aya{sv}')
    def WriteValue(self, value, options):
        # Получили данные от клиента
        data = bytes(value)
        logger.debug(f"TX Write: {data.hex()}")
        response = rcsp_handler.handle(data)
        if response:
            logger.debug(f"TX Response: {response.hex()}")
        # TODO: Отправить ответ через RX characteristic (notify)

class RXCharacteristic(Characteristic):
    """Notify characteristic — отправляет ответы клиенту"""
    
    def __init__(self, bus, index, svc_path):
        Characteristic.__init__(
            self, bus, index, RX_CHAR_UUID, svc_path,
            ['notify']
        )
        self.value = dbus.Array([], signature='y')

    @dbus.service.method(GATT_CHRC_IFACE, in_signature='a{sv}', out_signature='ay')
    def ReadValue(self, options):
        return self.value

    def send_notification(self, data: bytes):
        """Отправить уведомление клиенту"""
        # TODO: Реализовать через D-Bus signal
        logger.info(f"📤 Notify: {data.hex()}")

class Application(dbus.service.Object):
    def __init__(self, bus):
        self.path = '/org/bluez/prology'
        self.services = []
        self.characteristics = []
        self.descriptors = []
        dbus.service.Object.__init__(self, bus, self.path)

    def add_service(self, service):
        self.services.append(service)

    def add_characteristic(self, characteristic):
        self.characteristics.append(characteristic)

    def add_descriptor(self, descriptor):
        self.descriptors.append(descriptor)

    @dbus.service.method(OM_IFACE, out_signature='a{oa{sa{sv}}}')
    def GetManagedObjects(self):
        response = {}
        for svc in self.services:
            response[svc.path] = {GATT_SVC_IFACE: {'UUID': svc.uuid, 'Primary': svc.primary}}
        for chr in self.characteristics:
            response[chr.path] = {
                GATT_CHRC_IFACE: {
                    'Service': chr.service,
                    'UUID': chr.uuid,
                    'Flags': chr.flags
                }
            }
        for desc in self.descriptors:
            response[desc.path] = {
                GATT_DESC_IFACE: {
                    'Characteristic': desc.characteristic,
                    'UUID': desc.uuid,
                    'Flags': desc.flags
                }
            }
        return response

# ============================================================
# Advertisement
# ============================================================

class Advertisement(dbus.service.Object):
    def __init__(self, bus, index):
        self.path = f'/org/bluez/prology/ad{index}'
        self.service_uuids = [SERVICE_UUID]
        self.local_name = 'PROLOGY'
        dbus.service.Object.__init__(self, bus, self.path)

    @dbus.service.method(LE_ADV_MGR_IFACE, in_signature='', out_signature='')
    def Release(self):
        logger.info(f'Advertisement released: {self.path}')

    def get_properties(self):
        return {
            'Type': 'peripheral',
            'ServiceUUIDs': self.service_uuids,
            'LocalName': self.local_name
        }

    def get_path(self):
        return dbus.ObjectPath(self.path)

# ============================================================
# Main
# ============================================================

def find_adapter(bus):
    objects = bus.get_object(BLUEZ_SERVICE, '/')
    manager = dbus.Interface(objects, OM_IFACE)
    managed = manager.GetManagedObjects()
    for path, ifaces in managed.items():
        if GATT_MGR_IFACE in ifaces:
            return path
    return None

def register_advertisement(bus, adapter_path):
    adv_mgr = dbus.Interface(
        bus.get_object(BLUEZ_SERVICE, adapter_path),
        LE_ADV_MGR_IFACE
    )
    adv = Advertisement(bus, 0)
    adv_mgr.RegisterAdvertisement(adv.get_path(), {}, 
        reply_handler=lambda: logger.info('✅ Реклама зарегистрирована'),
        error_handler=lambda e: logger.error(f'❌ Ошибка регистрации рекламы: {e}')
    )

def register_application(bus, adapter_path):
    gatt_mgr = dbus.Interface(
        bus.get_object(BLUEZ_SERVICE, adapter_path),
        GATT_MGR_IFACE
    )
    
    app = Application(bus)
    
    # Service
    svc = Service(bus, 0)
    app.add_service(svc)
    
    # TX Characteristic (Write)
    tx_char = TXCharacteristic(bus, 0, svc.path)
    app.add_characteristic(tx_char)
    
    # RX Characteristic (Notify)
    rx_char = RXCharacteristic(bus, 1, svc.path)
    app.add_characteristic(rx_char)
    
    # CCCD Descriptor for RX
    cccd = Descriptor(bus, 0, '00002902-0000-1000-8000-00805f9b34fb', rx_char.path, ['read'])
    app.add_descriptor(cccd)
    rx_char.add_descriptor(cccd)
    
    gatt_mgr.RegisterApplication(app.path, {},
        reply_handler=lambda: logger.info('✅ GATT Application зарегистрирована'),
        error_handler=lambda e: logger.error(f'❌ Ошибка регистрации приложения: {e}')
    )

def main():
    logger.info("=" * 60)
    logger.info("🔵 PROLOGY BLE GATT Server")
    logger.info("=" * 60)
    logger.info(f"Service: {SERVICE_UUID}")
    logger.info(f"TX (Write): {TX_CHAR_UUID}")
    logger.info(f"RX (Notify): {RX_CHAR_UUID}")
    logger.info("=" * 60)

    dbus.mainloop.glib.DBusGMainLoop(set_as_default=True)
    bus = dbus.SystemBus()
    
    adapter = find_adapter(bus)
    if not adapter:
        logger.error("❌ Bluetooth адаптер не найден!")
        sys.exit(1)
    
    logger.info(f"✅ Адаптер: {adapter}")
    
    try:
        register_advertisement(bus, adapter)
        register_application(bus, adapter)
    except Exception as e:
        logger.error(f"❌ Ошибка: {e}")
        sys.exit(1)
    
    logger.info("🔵 Ожидание подключений...")
    logger.info("📱 Подключитесь через bluetoothctl или PROLOGY APK")
    
    mainloop = GLib.MainLoop()
    try:
        mainloop.run()
    except KeyboardInterrupt:
        logger.info("\n⏹️  Остановка...")
        mainloop.quit()

if __name__ == '__main__':
    try:
        main()
    except Exception as e:
        logger.error(f"❌ Критическая ошибка: {e}", exc_info=True)
