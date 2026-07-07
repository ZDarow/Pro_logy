#!/usr/bin/env python3
"""
PROLOGY BLE Emulator — эмулятор Jieli AC6951 через BlueZ DBus API

Рекламится как PROLOGY_BLE, обрабатывает RCSP команды через BLE GATT.
Требует: root, BlueZ 5.x, Linux

Запуск: sudo python3 prology_emulator.py
"""

import asyncio
import sys
import os
import signal
import logging
from datetime import datetime

# Добавляем текуую директорию в path
sys.path.insert(0, os.path.dirname(__file__))

from rcsp_protocol import (
    parse_packet, build_rx, build_tx,
    rx_heartbeat, rx_confirm, rx_identification,
    cmd_heartbeat, cmd_init,
    RCSPHandler, HEARTBEAT_RESPONSE, HEARTBEAT_RESPONSE_INIT,
)

logging.basicConfig(
    level=logging.INFO,
    format='%(asctime)s [%(levelname)s] %(message)s',
    datefmt='%H:%M:%S'
)
log = logging.getLogger("prology_emulator")

# ============================================================================
# BlueZ DBus константы
# ============================================================================

BLUEZ_SERVICE = "org.bluez"
ADAPTER_IFACE = "org.bluez.Adapter1"
LE_ADVERTISING_IFACE = "org.bluez.LEAdvertisement1"
GATT_SERVICE_IFACE = "org.bluez.GattService1"
GATT_CHAR_IFACE = "org.bluez.GattCharacteristic1"
DEVICE_IFACE = "org.bluez.Device1"
PROPERTIES_IFACE = "org.freedesktop.DBus.Properties"
OBJECT_MANAGER_IFACE = "org.freedesktop.DBus.ObjectManager"

# UUIDs
SERVICE_UUID = "0000AE00-0000-1000-8000-00805F9B34FB"
WRITE_UUID = "0000AE01-0000-1000-8000-00805F9B34FB"
NOTIFY_UUID = "0000AE02-0000-1000-8000-00805F9B34FB"

DEVICE_NAME = "PROLOGY_BLE"

try:
    import dbus
    import dbus.service
    import dbus.mainloop.glib
    from gi.repository import GLib
except ImportError:
    log.error("Требуются: pip3 install dbus-python pygobject")
    log.error("Или: sudo apt install python3-dbus python3-gi")
    sys.exit(1)


class RCSPEmulator:
    """Эмулятор PROLOGY BLE устройства через BlueZ DBus."""

    def __init__(self):
        self.handler = RCSPHandler()
        self._notify_enabled = False
        self._bus = None
        self._adapter_path = None
        self._service_path = None
        self._write_path = None
        self._notify_path = None

    async def start(self):
        """Запустить эмулятор."""
        log.info("=" * 60)
        log.info("PROLOGY BLE Emulator (Jieli AC6951)")
        log.info("=" * 60)

        # Инициализация DBus
        dbus.mainloop.glib.DBusGMainLoop(set_as_default=True)
        self._bus = dbus.SystemBus()

        # Найти адаптер
        await self._find_adapter()
        if not self._adapter_path:
            log.error("Bluetooth адаптер не найден!")
            return False

        log.info(f"Адаптер: {self._adapter_path}")

        # Зарегистрировать GATT сервис
        await self._register_gatt_service()

        # Зарегистрировать рекламу
        await self._register_advertisement()

        log.info(f"Реклама как '{DEVICE_NAME}'...")
        log.info("Ожидание подключений (Ctrl+C для остановки)")

        return True

    async def _find_adapter(self):
        """Найти первый Bluetooth адаптер."""
        try:
            manager = dbus.Interface(
                self._bus.get_object(BLUEZ_SERVICE, "/"),
                OBJECT_MANAGER_IFACE
            )
            objects = manager.GetManagedObjects()

            for path, ifaces in objects.items():
                if ADAPTER_IFACE in ifaces:
                    self._adapter_path = path
                    return
        except Exception as e:
            log.error(f"Ошибка поиска адаптера: {e}")

    async def _register_gatt_service(self):
        """Зарегистрировать GATT сервис и характеристики."""
        # BlueZ требует регистрации через GattManager
        # Для простоты используем btmgmt или hcitool для настройки

        # Создаём GATT сервис через DBus
        service_path = f"/org/bluez/service_prology"
        self._service_path = service_path

        # Создаём Write characteristic
        write_path = f"{service_path}/char_write"
        self._write_path = write_path

        # Создаём Notify characteristic
        notify_path = f"{service_path}/char_notify"
        self._notify_path = notify_path

        # Для упрощения — используем bluetoothctl для настройки
        log.info("GATT сервис будет настроен через bluetoothctl...")
        log.info(f"  Service:  {SERVICE_UUID}")
        log.info(f"  Write:    {WRITE_UUID}")
        log.info(f"  Notify:   {NOTIFY_UUID}")

        # Настроить через bluetoothctl
        await self._setup_bluetoothctl()

    async def _setup_bluetoothctl(self):
        """Настроить Bluetooth через bluetoothctl."""
        proc = await asyncio.create_subprocess_exec(
            "bluetoothctl",
            stdin=asyncio.subprocess.PIPE,
            stdout=asyncio.subprocess.PIPE,
            stderr=asyncio.subprocess.PIPE,
        )

        commands = [
            "menu gatt",
            f"register-service {SERVICE_UUID}",
            f"register-characteristic {WRITE_UUID} write-without-response",
            f"register-characteristic {NOTIFY_UUID} notify",
            "register-application",
            "back",
            "advertise on",
        ]

        for cmd in commands:
            log.info(f"  bluetoothctl: {cmd}")
            proc.stdin.write((cmd + "\n").encode())
            await proc.stdin.drain()
            await asyncio.sleep(0.5)

        proc.terminate()
        await proc.wait()

    async def _register_advertisement(self):
        """Зарегистрировать BLE рекламу."""
        # Использовать bluetoothctl advertise
        proc = await asyncio.create_subprocess_exec(
            "bluetoothctl",
            stdin=asyncio.subprocess.PIPE,
            stdout=asyncio.subprocess.PIPE,
            stderr=asyncio.subprocess.PIPE,
        )

        commands = [
            "menu advertise",
            f"name {DEVICE_NAME}",
            "uuids 0000AE00-0000-1000-8000-00805F9B34FB",
            "appearance 0x0340",
            "back",
            "advertise on",
        ]

        for cmd in commands:
            proc.stdin.write((cmd + "\n").encode())
            await proc.stdin.drain()
            await asyncio.sleep(0.3)

        proc.terminate()
        await proc.wait()

    def handle_write(self, data: bytes):
        """Обработать записанные данные (RCSP пакет)."""
        log.info(f"  ← RX: {' '.join(f'{b:02X}' for b in data)}")

        pkt = parse_packet(data)
        if pkt is None:
            log.warning("  Невалидный пакет")
            return

        responses = self.handler.handle(data)

        for resp in responses:
            log.info(f"  → TX: {' '.join(f'{b:02X}' for b in resp)}")
            # Отправить notify — в реальной имплементации через DBus
            # self._send_notify(resp)

    def _send_notify(self, data: bytes):
        """Отправить уведомление клиенту."""
        # Через BlueZ DBus: SetValue на notify characteristic
        # Это требует реализации GattCharacteristic1
        pass


async def main():
    """Основная функция."""
    emulator = RCSPEmulator()

    success = await emulator.start()
    if not success:
        log.error("Не удалось запустить эмулятор")
        sys.exit(1)

    # Цикл обработки
    loop = asyncio.get_event_loop()
    stop = loop.create_future()

    for sig in (signal.SIGINT, signal.SIGTERM):
        loop.add_signal_handler(sig, stop.set_result, None)

    await stop
    log.info("Остановка...")


if __name__ == "__main__":
    if os.geteuid() != 0:
        log.warning("Запустите от root для доступа к Bluetooth")
        log.warning("sudo python3 prology_emulator.py")

    asyncio.run(main())
