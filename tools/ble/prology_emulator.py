#!/usr/bin/env python3
"""
PROLOGY BLE Peripheral Emulator
Эмулирует устройство PROLOGY_BLE (Jieli AC6951) для тестирования RCSP команд.

Service UUID: 0xAE00
TX (Write):   0xAE01 — принимает команды от клиента
RX (Notify):  0xAE02 — отправляет ответы клиенту
"""

import asyncio
import struct
import logging
import time
from datetime import datetime

# BLE через Bluez D-Bus API
import dbus
import dbus.service
import dbus.mainloop.glib
from gi.repository import GLib

logging.basicConfig(
    level=logging.DEBUG,
    format='%(asctime)s [%(levelname)s] %(message)s',
    datefmt='%H:%M:%S'
)
logger = logging.getLogger('PROLOGY_BLE')

# ============================================================
# RCSP Checksum (расшифровано из btsnoop_hci.log)
# ============================================================

def calc_tx_checksum(data: bytes) -> int:
    """TX checksum: (sum(all_bytes) + 0x10) & 0xFF"""
    return (sum(data) + 0x10) & 0xFF

def calc_rx_checksum(data: bytes) -> int:
    """RX checksum: (sum(all_bytes) + 0x40) & 0xFF"""
    return (sum(data) + 0x40) & 0xFF

def verify_packet(packet: bytes, expected_chk: int, direction='tx') -> bool:
    """Проверка пакета"""
    if direction == 'tx':
        calc_chk = calc_tx_checksum(packet)
    else:
        calc_chk = calc_rx_checksum(packet)
    return calc_chk == expected_chk

# ============================================================
# RCSP Packet Builder
# ============================================================

def build_rx_packet(cmd: int, payload: bytes = b'') -> bytes:
    """
    Строит RX пакет (от устройства к клиенту)
    Format: [cmd][payload...][checksum]
    """
    data = bytes([cmd]) + payload
    chk = calc_rx_checksum(data)
    return data + bytes([chk])

def build_heartbeat_response(seq: int) -> bytes:
    """Heartbeat ответ (0x05)"""
    payload = struct.pack('<B', seq)
    return build_rx_packet(0x05, payload)

def build_identification_response() -> bytes:
    """Identification ответ (0xFF) — VER 8.7DSP"""
    device_name = b'PROLOGY_BLE'
    firmware_ver = b'VER 8.7DSP'
    payload = bytes([0x00]) + device_name + b'\x00' + firmware_ver
    return build_rx_packet(0xFF, payload)

def build_status_response(channel: int, value: int = 0) -> bytes:
    """Status ответ (0x07) для канала"""
    payload = struct.pack('<BB', channel, value)
    return build_rx_packet(0x07, payload)

def build_param_data_response(data: bytes = b'') -> bytes:
    """Param Data ответ (0x90)"""
    return build_rx_packet(0x90, data)

def build_telemetry_response(battery: int = 85, rssi: int = -45) -> bytes:
    """Telemetry ответ (0x92)"""
    payload = struct.pack('<BB', battery, rssi)
    return build_rx_packet(0x92, payload)

def build_confirm_response(cmd: int) -> bytes:
    """Confirm ответ (0x9F) — подтверждение получения команды"""
    payload = bytes([cmd])
    return build_rx_packet(0x9F, payload)

def build_b0_response() -> bytes:
    """B0 Data ответ (0xB0)"""
    # Пример данных из HCI лога
    payload = bytes([0x00, 0x01, 0x02, 0x03, 0x04, 0x05])
    return build_rx_packet(0xB0, payload)

# ============================================================
# RCSP Command Handler
# ============================================================

class RCSPCommandHandler:
    """Обработчик RCSP команд от PROLOGY клиента"""

    def __init__(self):
        self.heartbeat_count = 0
        self.session_initialized = False
        self.write_count = 0

    def handle_packet(self, packet: bytes) -> list:
        """
        Разбирает входящий пакет и возвращает список ответов
        """
        if len(packet) < 2:
            logger.warning(f"Короткий пакет: {len(packet)} байт")
            return []

        # Последний байт — checksum
        received_chk = packet[-1]
        cmd = packet[0]
        payload = packet[1:-1]

        # Проверка checksum
        if not verify_packet(packet[:-1], received_chk, direction='tx'):
            logger.warning(f"Checksum error: got {received_chk}, expected {calc_tx_checksum(packet[:-1])}")
            return []

        logger.info(f"📥 CMD=0x{cmd:02X} payload={payload.hex()}")

        responses = []

        if cmd == 0x01:
            # Init — инициализация сессии
            self.session_initialized = True
            logger.info("✅ Сессия инициализирована")
            responses.append(build_identification_response())

        elif cmd == 0x03:
            # Query — запрос статуса канала
            channel = payload[0] if payload else 0
            logger.info(f"📊 Query канал {channel}")
            responses.append(build_status_response(channel))

        elif cmd == 0x04:
            # Heartbeat — keep-alive
            self.heartbeat_count += 1
            seq = payload[0] if payload else 0
            responses.append(build_heartbeat_response(seq))
            if self.heartbeat_count % 30 == 0:
                # Периодически отправляем телеметрию
                responses.append(build_telemetry_response())

        elif cmd == 0x80:
            # Write Param — запись параметров EQ
            self.write_count += 1
            logger.info(f"📝 Write Param (серия #{self.write_count})")
            responses.append(build_confirm_response(cmd))

        elif cmd == 0x8A:
            # Config Ext — расширенная настройка
            sub_cmd = payload[0] if payload else 0
            logger.info(f"⚙️  Config Ext sub=0x{sub_cmd:02X}")
            responses.append(build_confirm_response(cmd))

        elif cmd == 0x8E:
            # Status Req — запрос статуса
            channel = payload[0] if payload else 0
            logger.info(f"📈 Status Req канал {channel}")
            responses.append(build_param_data_response(bytes([channel, 0x00, 0x01])))

        elif cmd == 0xA0:
            # Gain/Fade — конфигурация
            logger.info(f"🎚️  Gain/Fade")
            responses.append(build_confirm_response(cmd))

        else:
            logger.warning(f"❓ Неизвестная команда: 0x{cmd:02X}")
            responses.append(build_rx_packet(0x9F, bytes([cmd])))  # Generic confirm

        return responses

# ============================================================
# BlueZ GATT Peripheral (через D-Bus)
# ============================================================

BLUEZ_SERVICE = 'org.bluez'
ADAPTER_INTERFACE = 'org.bluez.Adapter1'
GATT_MANAGER_INTERFACE = 'org.bluez.GattManager1'
LE_ADVERTISING_MANAGER = 'org.bluez.LEAdvertisingManager1'

GATT_SERVICE_INTERFACE = 'org.bluez.GattService1'
GATT_CHAR_INTERFACE = 'org.bluez.GattCharacteristic1'
GATT_DESCRIPTOR_INTERFACE = 'org.bluez.GattDescriptor1'

DBUS_PROP_INTERFACE = 'org.freedesktop.DBus.Properties'

# UUIDs
SERVICE_UUID = '0000ae00-0000-1000-8000-00805f9b34fb'
TX_CHAR_UUID = '0000ae01-0000-1000-8000-00805f9b34fb'  # Write (от клиента к нам)
RX_CHAR_UUID = '0000ae02-0000-1000-8000-00805f9b34fb'  # Notify (от нас к клиенту)

class PrologyEmulatorPeripheral:
    """BLE периферия — эмуляция PROLOGY устройства"""

    def __init__(self):
        self.cmd_handler = RCSPCommandHandler()
        self.notify_callback = None
        self.bluez_adapter = None
        self.bluez_gatt_manager = None
        self.service_path = None
        self.tx_char_path = None
        self.rx_char_path = None

    async def start(self):
        """Запуск BLE периферии"""
        logger.info("=" * 60)
        logger.info("🔵 PROLOGY BLE Peripheral Emulator")
        logger.info("=" * 60)
        logger.info(f"Service: {SERVICE_UUID}")
        logger.info(f"TX (Write): {TX_CHAR_UUID}")
        logger.info(f"RX (Notify): {RX_CHAR_UUID}")
        logger.info("=" * 60)

        # Подключение к D-Bus
        dbus.mainloop.glib.DBusGMainLoop(set_as_default=True)
        bus = dbus.SystemBus()

        # Получение адаптера
        adapter_path = self._find_adapter(bus)
        if not adapter_path:
            logger.error("❌ Bluetooth адаптер не найден!")
            return

        logger.info(f"✅ Адаптер: {adapter_path}")

        self.bluez_adapter = dbus.Interface(
            bus.get_object(BLUEZ_SERVICE, adapter_path),
            ADAPTER_INTERFACE
        )

        # Получение GattManager
        self.bluez_gatt_manager = dbus.Interface(
            bus.get_object(BLUEZ_SERVICE, adapter_path),
            GATT_MANAGER_INTERFACE
        )

        # Регистрация GATT сервиса
        self._register_gatt_service(bus)

        # Регистрация рекламы (advertising)
        await self._register_advertising(bus)

        logger.info("🔵 Периферия запущена! Ожидание подключений...")
        logger.info("📱 Подключитесь через: bluetoothctl")
        logger.info("   или через PROLOGY APK")

        # Запуск Glib main loop
        mainloop = GLib.MainLoop()
        try:
            mainloop.run()
        except KeyboardInterrupt:
            logger.info("\n⏹️  Остановка...")
            mainloop.quit()

    def _find_adapter(self, bus):
        """Поиск Bluetooth адаптера"""
        objects = bus.get_object(BLUEZ_SERVICE, '/')
        manager = dbus.Interface(objects, 'org.freedesktop.DBus.ObjectManager')
        managed_objects = manager.GetManagedObjects()

        for path, interfaces in managed_objects.items():
            if ADAPTER_INTERFACE in interfaces:
                return path
        return None

    def _register_gatt_service(self, bus):
        """Регистрация GATT сервиса и характеристик"""
        # TODO: Реализовать через D-Bus export
        # Это требует создания объектов D-Bus для сервиса, характеристики и дескриптора
        logger.info("⏳ Регистрация GATT сервиса (в разработке)...")
        
        # Упрощённая версия — через hcitool и gatttool
        logger.info("📌 Для полной регистрации используйте:")
        logger.info("   1. bluetoothctl")
        logger.info("   2. advertise")
        logger.info("   3. gatt-server")

    async def _register_advertising(self, bus):
        """Регистрация BLE рекламы"""
        # Создание рекламного пакета
        adv_data = struct.pack(
            '<BBBB16B',
            0x02, 0x01, 0x06,  # LE General Discoverable, BR/EDR Not Supported
            0x11, 0x07,  # Complete List of 128-bit UUIDs
            0xFB, 0x34, 0x9B, 0x5F, 0x80, 0x00, 0x00, 0x80,
            0x00, 0x10, 0x00, 0x00, 0x00, 0xAE, 0x00, 0x00  # Service UUID
        )

        logger.info("📡 Регистрация рекламы...")

# ============================================================
# Simple BLE Peripheral через btmgmt (более простой подход)
# ============================================================

async def start_simple_peripheral():
    """
    Простая периферия через btmgmt/btadv
    Работает без D-Bus, через HCI команды
    """
    import subprocess

    logger.info("=" * 60)
    logger.info("🔵 PROLOGY BLE Peripheral (Simple Mode)")
    logger.info("=" * 60)
    logger.info(f"Service: 0xAE00")
    logger.info(f"TX: 0xAE01 (Write)")
    logger.info(f"RX: 0xAE02 (Notify)")
    logger.info("=" * 60)

    cmd_handler = RCSPCommandHandler()

    # Запуск рекламы
    logger.info("📡 Запуск BLE рекламы...")
    
    # Проверка btmgmt
    result = subprocess.run(['which', 'btmgmt'], capture_output=True, text=True)
    if result.returncode == 0:
        logger.info("✅ btmgmt найден")
    else:
        logger.info("❌ btmgmt не найден, пробую hcitool")
        result = subprocess.run(['which', 'hcitool'], capture_output=True, text=True)
        if result.returncode == 0:
            logger.info("✅ hcitool найден")
        else:
            logger.error("❌ Ни btmgmt, ни hcitool не найдены!")
            return

    # Альтернатива: использовать Python с HCI socket напрямую
    logger.info("🔧 Использую HCI socket напрямую...")
    
    await start_hci_socket_peripheral(cmd_handler)


async def start_hci_socket_peripheral(cmd_handler):
    """
    BLE периферия через HCI socket
    Полностью контролирует HCI уровень
    """
    import socket
    import struct

    # HCI Socket — правильный формат для Python 3.12
    HCI_CHANNEL_USER = 1
    sock = socket.socket(
        socket.AF_BLUETOOTH,
        socket.SOCK_RAW,
        socket.BTPROTO_HCI
    )
    
    # Правильный формат bind: (hci_dev, channel)
    sock.bind((0, HCI_CHANNEL_USER))
    
    logger.info("✅ HCI socket открыт")

    # HCI Reset
    hci_reset = bytes([0x01, 0x03, 0x0C, 0x00])
    sock.send(hci_reset)
    logger.info("🔄 HCI Reset отправлен")

    # HCI LE Set Random Address
    import random
    random_addr = bytes([0x01]) + bytes([random.randint(0, 255) for _ in range(5)])
    hci_set_addr = struct.pack('<BBB6B', 0x01, 0x05, 0x20, 6, *random_addr)
    sock.send(hci_set_addr)
    logger.info(f"📍 Random Address: {random_addr.hex()}")

    # HCI LE Set Advertising Data
    adv_data = bytes([
        0x02, 0x01, 0x06,  # Flags: LE General, BR/EDR Not Supported
        0x03, 0x03, 0x00, 0xAE,  # Incomplete List 16-bit UUIDs
        0x05, 0x09, 0x50, 0x52, 0x4F, 0x4C, 0x4F, 0x47, 0x59,  # Complete Local Name: PROLOGY
    ])
    
    # Trim to 31 bytes max
    adv_data = adv_data[:31]
    
    hci_adv_data = struct.pack('<BBB31B', 0x01, 0x08, 0x20, len(adv_data), *adv_data.ljust(31, b'\x00'))
    sock.send(hci_adv_data)
    logger.info(f"📡 Advertising data: {adv_data.hex()}")

    # HCI LE Set Advertising Enable
    hci_adv_enable = bytes([0x01, 0x0A, 0x20, 0x01, 0x01])
    sock.send(hci_adv_enable)
    logger.info("🔵 Реклама включена!")

    # Ожидание входящих соединений (чтение HCI событий)
    logger.info("👂 Ожидание подключений...")
    
    while True:
        try:
            data = sock.recv(1024)
            if data:
                logger.debug(f"HCI Event: {data.hex()}")
                # Парсинг HCI событий
                if len(data) > 3:
                    event_code = data[0]
                    if event_code == 0x3E:  # LE Meta Event
                        subevent = data[3]
                        if subevent == 0x01:  # LE Connection Complete
                            logger.info("✅ Подключение!")
                        elif subevent == 0x02:  # LE Advertising Report
                            addr_type = data[4]
                            addr = data[5:11]
                            logger.info(f"📡 Advertising Report от: {addr.hex()}")
        except KeyboardInterrupt:
            logger.info("\n⏹️  Остановка...")
            # Disable advertising
            sock.send(bytes([0x01, 0x0A, 0x20, 0x01, 0x00]))
            sock.close()
            break


# ============================================================
# Main
# ============================================================

async def main():
    """Запуск эмулятора"""
    logger.info("Запуск PROLOGY BLE Emulator...")
    
    # Простой режим — HCI socket
    await start_simple_peripheral()


if __name__ == '__main__':
    try:
        asyncio.run(main())
    except KeyboardInterrupt:
        logger.info("Программа остановлена пользователем")
    except PermissionError:
        logger.error("❌ Требуются root права для доступа к Bluetooth!")
        logger.error("   Запустите: sudo python3 prology_emulator.py")
    except Exception as e:
        logger.error(f"❌ Ошибка: {e}", exc_info=True)
