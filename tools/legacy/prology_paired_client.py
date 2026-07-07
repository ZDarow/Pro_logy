#!/usr/bin/env python3
# ============================================================================
# PROLOGY Client для сопряжённого устройства v3.1
# Подключение к уже сопряжённому устройству
# ============================================================================
# Установка: pip install bleak
# Запуск: sudo python3 prology_paired_client.py
# ============================================================================

import asyncio
import sys
from pathlib import Path

try:
    from bleak import BleakClient, BleakScanner
    from bleak.backends.device import BLEDevice
    from bleak.backends.scanner import AdvertisementData
except ImportError:
    print("❌ Bleak не установлен!")
    print("   pip install bleak")
    sys.exit(1)

# ============================================================================
# КОНСТАНТЫ
# ============================================================================

# MAC адрес из дампа
PROLOGY_MAC = "10:48:5E:71:20:90"

# UUID
SERVICE_UUID = "0000ae02-0000-1000-8000-00805f9b34fb"
WRITE_UUID = "0000ae03-0000-1000-8000-00805f9b34fb"
READ_UUID = "0000ae02-0000-1000-8000-00805f9b34fb"

# CRC константы
CRC_CONSTANTS = {
    0x05: {0x00: 0x09, 0x01: 0x08, 0x05: 0x0C, 0x06: 0x0D},
    0x06: {0xFE: 0x06},
    0x07: {0x01: 0x0A, 0x05: 0x0E, 0x06: 0x0F},
    0x90: {0x00: 0x93, 0x01: 0x94, 0x03: 0xD5, 0x09: 0x9F},
    0x9A: {0x01: 0x9E, 0x06: 0x96, 0x0A: 0xA8},
    0xB0: {0x00: 0xB5, 0x01: 0xB5, 0x0A: 0xBC},
}

# ============================================================================
# CRC ФУНКЦИИ
# ============================================================================

def xor_bytes(data: bytes) -> int:
    result = 0
    for b in data:
        result ^= b
    return result

def calculate_crc(cmd_type: int, subcmd: int, data: bytes) -> int:
    constant = CRC_CONSTANTS.get(cmd_type, {}).get(subcmd, 0)
    return xor_bytes(data) ^ constant

def create_command(cmd_type: int, subcmd: int, payload: bytes = b'') -> bytes:
    length = len(payload) + 2
    data = bytes([0xC0, 0x00, length, cmd_type, subcmd]) + payload
    crc = calculate_crc(cmd_type, subcmd, data)
    return data + bytes([crc])

# ============================================================================
# КЛИЕНТ
# ============================================================================

class PrologyPairedClient:
    """Клиент для сопряжённого устройства"""
    
    def __init__(self, mac: str = PROLOGY_MAC):
        self.mac = mac
        self.client = None
        self._connected = False
        self._device = None
    
    async def find_device(self, timeout: int = 5) -> bool:
        """Поиск сопряжённого устройства"""
        print(f"\n🔍 Поиск устройства {self.mac}...")
        
        def detection_callback(device: BLEDevice, adv: AdvertisementData):
            if device.address.upper() == self.mac.upper():
                print(f"✅ Найдено: {device.name} ({device.address})")
                print(f"   RSSI: {adv.rssi} dBm")
                self._device = device
                return True
            return False
        
        try:
            # Сканирование
            devices = await BleakScanner.discover(timeout=timeout, return_adv=True)
            
            for device, adv in devices.values():
                if device.address.upper() == self.mac.upper():
                    print(f"✅ Найдено: {device.name or 'PROLOGY'} ({device.address})")
                    print(f"   RSSI: {adv.rssi} dBm")
                    self._device = device
                    return True
            
            print(f"❌ Устройство не найдено в диапазоне")
            return False
            
        except Exception as e:
            print(f"❌ Ошибка поиска: {e}")
            return False
    
    async def connect(self, timeout: int = 10) -> bool:
        """Подключение к сопряжённому устройству"""
        
        # Сначала найдём устройство
        if not self._device:
            if not await self.find_device():
                print("\n💡 Попробуйте:")
                print("   1. Убедитесь что магнитола включена")
                print("   2. Проверьте что устройство сопряжено в системе")
                print("   3. Переподключите устройство в настройках Bluetooth")
                return False
        
        print(f"\n🔵 Подключение к {self.mac}...")
        
        try:
            # Важные параметры для сопряжённых устройств
            self.client = BleakClient(
                self._device,
                timeout=timeout,
                services_cache_mode="store",  # Кэширование сервисов
            )
            
            await self.client.connect()
            self._connected = True
            print(f"✅ Подключено!")
            
            # Информация
            print(f"\n📊 Информация:")
            print(f"   MTU: {self.client.mtu_size}")
            print(f"   Подключено: {self.client.is_connected}")
            
            # Проверка сервисов
            print(f"\n📡 Сервисы:")
            for service in self.client.services:
                print(f"   {service.uuid}")
                for char in service.characteristics:
                    print(f"      └─ {char.uuid} ({char.properties})")
            
            return True
            
        except Exception as e:
            print(f"❌ Ошибка подключения: {e}")
            print(f"\n💡 Возможные причины:")
            print(f"   1. Устройство уже подключено к другому приложению")
            print(f"   2. Требуется переподключить в системе")
            print(f"   3. Проблема с правами доступа")
            return False
    
    async def disconnect(self):
        """Отключение"""
        if self.client and self._connected:
            await self.client.disconnect()
            self._connected = False
            print("\n🔴 Отключено")
    
    async def send(self, cmd_type: int, subcmd: int, payload: bytes = b'') -> bool:
        """Отправка команды"""
        if not self._connected:
            print("❌ Не подключено!")
            return False
        
        command = create_command(cmd_type, subcmd, payload)
        print(f"📤 {command.hex().upper()}")
        
        try:
            await self.client.write_gatt_char(WRITE_UUID, command, response=True)
            print("   ✅ Отправлено")
            return True
        except Exception as e:
            print(f"   ❌ Ошибка: {e}")
            return False
    
    async def send_and_read(self, cmd_type: int, subcmd: int, payload: bytes = b''):
        """Отправка и чтение"""
        if not await self.send(cmd_type, subcmd, payload):
            return None
        
        await asyncio.sleep(0.2)
        
        try:
            data = await self.client.read_gatt_char(READ_UUID)
            print(f"📥 {data.hex().upper()}")
            return data
        except Exception as e:
            print(f"❌ Ошибка чтения: {e}")
            return None
    
    # Команды
    async def set_volume(self, level: int):
        level = max(0, min(100, level))
        print(f"\n🔊 Громкость: {level}")
        return await self.send(0x05, level)
    
    async def volume_up(self):
        print("\n🔊 Volume UP")
        return await self.send(0x07, 0x01)
    
    async def volume_down(self):
        print("\n🔉 Volume DOWN")
        return await self.send(0x06, 0xFE)
    
    async def mute(self, enable: bool = True):
        print(f"\n🔇 Mute: {enable}")
        return await self.send(0x05, 0x00 if enable else 0x01)
    
    async def get_status(self):
        print("\n📊 Запрос статуса...")
        return await self.send_and_read(0x90, 0x01)
    
    async def get_eq(self):
        print("\n🎵 Запрос EQ...")
        return await self.send_and_read(0x9A, 0x01)

# ============================================================================
# МЕНЮ
# ============================================================================

async def main_menu():
    print("\n" + "="*70)
    print("  🚗 PROLOGY Paired Client v3.1")
    print("="*70)
    print(f"\n📱 MAC: {PROLOGY_MAC}")
    print(f"💡 Режим: Работа с сопряжённым устройством")
    
    client = PrologyPairedClient()
    
    print("\n📋 Меню:")
    print("  1. Найти устройство")
    print("  2. Подключиться")
    print("  3. Запрос статуса")
    print("  4. Громкость +")
    print("  5. Громкость -")
    print("  6. Mute")
    print("  7. Громкость (0-100)")
    print("  0. Выход")
    print()
    
    choice = input("Выбор: ").strip()
    
    if choice == '1':
        await client.find_device()
    
    elif choice == '2':
        if await client.connect():
            print("\n✅ Подключение успешно!")
        else:
            print("\n❌ Не удалось подключиться")
    
    elif choice == '3':
        if not client._connected:
            print("❌ Сначала подключитесь (2)")
        else:
            await client.get_status()
    
    elif choice == '4':
        if not client._connected:
            print("❌ Сначала подключитесь (2)")
        else:
            await client.volume_up()
    
    elif choice == '5':
        if not client._connected:
            print("❌ Сначала подключитесь (2)")
        else:
            await client.volume_down()
    
    elif choice == '6':
        if not client._connected:
            print("❌ Сначала подключитесь (2)")
        else:
            await client.mute()
    
    elif choice == '7':
        if not client._connected:
            print("❌ Сначала подключитесь (2)")
        else:
            level = input("Громкость (0-100): ").strip()
            try:
                await client.set_volume(int(level))
            except:
                print("❌ Неверное значение")
    
    elif choice == '0':
        await client.disconnect()
        print("👋 Выход")
        return
    
    else:
        print("❌ Неверный выбор")
    
    # Возврат в меню
    await main_menu()

if __name__ == "__main__":
    try:
        asyncio.run(main_menu())
    except KeyboardInterrupt:
        print("\n\n👋 Прервано")
