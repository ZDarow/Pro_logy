#!/usr/bin/env python3
# ============================================================================
# PROLOGY Full Client v3.0
# Полный клиент для управления магнитолой PROLOGY
# ============================================================================
# Установка: pip install bleak
# Запуск: sudo python3 prology_full_client.py
# ============================================================================

import asyncio
import json
import sys
from datetime import datetime
from pathlib import Path
from typing import Dict, List, Optional, Any
from dataclasses import dataclass, asdict

try:
    from bleak import BleakClient, BleakScanner
except ImportError:
    print("❌ Bleak не установлен!")
    print("   pip install bleak")
    sys.exit(1)

# ============================================================================
# КОНСТАНТЫ
# ============================================================================

# MAC адрес из дампа (обновлённый!)
PROLOGY_MAC = "10:48:5E:71:20:90"

# UUID
SERVICE_UUID = "0000ae02-0000-1000-8000-00805f9b34fb"
WRITE_UUID = "0000ae03-0000-1000-8000-00805f9b34fb"  # Write characteristic
READ_UUID = "0000ae02-0000-1000-8000-00805f9b34fb"   # Read characteristic

# CRC константы (расширенная база)
CRC_CONSTANTS = {
    0x05: {0x00: 0x09, 0x01: 0x08, 0x05: 0x0C, 0x06: 0x0D},
    0x06: {0xFE: 0x06},
    0x07: {0x01: 0x0A, 0x05: 0x0E, 0x06: 0x0F},
    0x90: {0x00: 0x93, 0x01: 0x94, 0x03: 0xD5, 0x09: 0x9F},
    0x9A: {
        0x01: 0x9E, 0x03: 0xB7, 0x04: 0xA1, 0x05: 0xA8,
        0x06: 0x96, 0x07: 0xA8, 0x0A: 0xA8, 0x0B: 0xA9,
        0x0C: 0xF3, 0x0D: 0xB7, 0x10: 0xAF, 0x11: 0xAE,
        0x14: 0xB6, 0x15: 0xB2, 0x16: 0xB4, 0x17: 0xB5,
        0x18: 0x16, 0x1A: 0xB8, 0x21: 0xD1, 0x27: 0xD1,
        0x2A: 0xC8,
    },
    0xB0: {
        0x00: 0xB5, 0x01: 0xB5, 0x02: 0xB7, 0x04: 0xA8,
        0x05: 0xC8, 0x06: 0xCC, 0x07: 0x32, 0x08: 0x3E,
        0x0A: 0xBC, 0x0C: 0xBE, 0x0D: 0xBE, 0x0F: 0xBA,
        0x10: 0xA0, 0x16: 0xC9, 0x17: 0xCA,
    },
}

# ============================================================================
# CRC ФУНКЦИИ
# ============================================================================

def xor_bytes(data: bytes) -> int:
    """XOR всех байт"""
    result = 0
    for b in data:
        result ^= b
    return result

def calculate_crc(cmd_type: int, subcmd: int, data: bytes) -> int:
    """Расчёт CRC с учётом типа команды"""
    constant = CRC_CONSTANTS.get(cmd_type, {}).get(subcmd, 0)
    return xor_bytes(data) ^ constant

def create_command(cmd_type: int, subcmd: int, payload: bytes = b'') -> bytes:
    """Создание команды"""
    length = len(payload) + 2  # type + subcmd
    data = bytes([0xC0, 0x00, length, cmd_type, subcmd]) + payload
    crc = calculate_crc(cmd_type, subcmd, data)
    return data + bytes([crc])

def verify_crc(data: bytes) -> bool:
    """Проверка CRC"""
    if len(data) < 6:
        return False
    cmd_type = data[3]
    subcmd = data[4]
    received_crc = data[-1]
    calc_crc = calculate_crc(cmd_type, subcmd, data[:-1])
    return calc_crc == received_crc

# ============================================================================
# ТИПЫ ДАННЫХ
# ============================================================================

@dataclass
class EQSettings:
    """Настройки эквалайзера"""
    enabled: bool = True
    preset: str = "Flat"
    bass: int = 0      # -10 to +10
    treble: int = 0    # -10 to +10
    balance: int = 0   # -10 (L) to +10 (R)
    fader: int = 0     # -10 (F) to +10 (R)
    loudness: bool = False
    subwoofer: int = 50  # 0 to 100

@dataclass
class SystemSettings:
    """Системные настройки"""
    volume: int = 20
    preset: str = "User 1"
    source: str = "Bluetooth"
    muted: bool = False

@dataclass
class PrologyState:
    """Полное состояние магнитолы"""
    eq: EQSettings = None
    system: SystemSettings = None
    connected: bool = False
    last_update: str = ""
    
    def __post_init__(self):
        if self.eq is None:
            self.eq = EQSettings()
        if self.system is None:
            self.system = SystemSettings()
        if not self.last_update:
            self.last_update = datetime.now().isoformat()

# ============================================================================
# КЛИЕНТ
# ============================================================================

class PrologyClient:
    """Полный клиент PROLOGY"""
    
    def __init__(self, mac: str = PROLOGY_MAC):
        self.mac = mac
        self.client = None
        self._connected = False
        self.state = PrologyState()
        self._response_queue = asyncio.Queue()
    
    async def connect(self, timeout: int = 10) -> bool:
        """Подключение к магнитоле"""
        print(f"\n🔵 Подключение к {self.mac}...")
        try:
            self.client = BleakClient(self.mac)
            await self.client.connect(timeout=timeout)
            self._connected = True
            self.state.connected = True
            print(f"✅ Подключено!")
            
            # Информация
            print(f"\n📊 Информация:")
            print(f"   RSSI: {self.client._backend._rssi} dBm")
            print(f"   MTU: {self.client.mtu_size}")
            
            return True
        except Exception as e:
            print(f"❌ Ошибка: {e}")
            return False
    
    async def disconnect(self):
        """Отключение"""
        if self.client and self._connected:
            await self.client.disconnect()
            self._connected = False
            self.state.connected = False
            print("\n🔴 Отключено")
    
    async def _write(self, data: bytes) -> bool:
        """Запись команды"""
        if not self._connected:
            return False
        try:
            await self.client.write_gatt_char(WRITE_UUID, data, response=True)
            return True
        except Exception as e:
            print(f"❌ Ошибка записи: {e}")
            return False
    
    async def _read(self) -> Optional[bytes]:
        """Чтение ответа"""
        if not self._connected:
            return None
        try:
            data = await self.client.read_gatt_char(READ_UUID)
            return data
        except Exception as e:
            print(f"❌ Ошибка чтения: {e}")
            return None
    
    async def send_command(self, cmd_type: int, subcmd: int, payload: bytes = b'') -> Optional[bytes]:
        """Отправка команды и получение ответа"""
        command = create_command(cmd_type, subcmd, payload)
        print(f"📤 {command.hex().upper()}")
        
        if not await self._write(command):
            return None
        
        await asyncio.sleep(0.2)
        response = await self._read()
        
        if response:
            print(f"📥 {response.hex().upper()}")
            if verify_crc(response):
                print("   ✅ CRC OK")
            else:
                print("   ❌ CRC ERROR")
        
        return response
    
    # ========================================================================
    # КОМАНДЫ
    # ========================================================================
    
    async def get_status(self) -> Optional[Dict]:
        """Запрос статуса"""
        print("\n📊 Запрос статуса...")
        response = await self.send_command(0x90, 0x01)
        if response and len(response) > 6:
            return {"raw": response.hex().upper(), "data": response[5:-1].hex()}
        return None
    
    async def get_eq(self) -> Optional[EQSettings]:
        """Запрос настроек эквалайзера"""
        print("\n🎵 Запрос EQ...")
        response = await self.send_command(0x9A, 0x01)
        if response and len(response) > 6:
            # Парсинг ответа EQ
            data = response[5:-1]
            if len(data) >= 3:
                self.state.eq.bass = data[0] - 10 if len(data) > 0 else 0
                self.state.eq.treble = data[1] - 10 if len(data) > 1 else 0
                self.state.eq.preset = f"0x{data[2]:02X}"
        return self.state.eq
    
    async def get_balance(self) -> Optional[Dict]:
        """Запрос баланса/фейдера"""
        print("\n⚖️  Запрос баланса...")
        response = await self.send_command(0x9A, 0x06, bytes([0x00, 0x05]))
        if response and len(response) > 6:
            data = response[5:-1]
            return {"raw": data.hex().upper()}
        return None
    
    async def set_volume(self, level: int) -> bool:
        """Установка громкости (0-100)"""
        print(f"\n🔊 Громкость: {level}")
        level = max(0, min(100, level))
        response = await self.send_command(0x05, level)
        if response:
            self.state.system.volume = level
            return True
        return False
    
    async def volume_up(self) -> bool:
        """Громкость вверх"""
        print("\n🔊 Volume UP")
        response = await self.send_command(0x07, 0x01)
        if response:
            self.state.system.volume = min(100, self.state.system.volume + 1)
            return True
        return False
    
    async def volume_down(self) -> bool:
        """Громкость вниз"""
        print("\n🔉 Volume DOWN")
        response = await self.send_command(0x06, 0xFE)
        if response:
            self.state.system.volume = max(0, self.state.system.volume - 1)
            return True
        return False
    
    async def mute(self, enable: bool = True) -> bool:
        """Mute"""
        print(f"\n🔇 Mute: {enable}")
        subcmd = 0x00 if enable else 0x01
        response = await self.send_command(0x05, subcmd)
        if response:
            self.state.system.muted = enable
            return True
        return False
    
    async def set_eq_preset(self, preset: str) -> bool:
        """Установка пресета EQ"""
        presets = {
            "Flat": 0x00,
            "Rock": 0x01,
            "Pop": 0x02,
            "Jazz": 0x03,
            "Classical": 0x04,
            "Dance": 0x05,
            "Vocal": 0x06,
            "Bass Boost": 0x07,
        }
        preset_id = presets.get(preset, 0x00)
        print(f"\n🎵 EQ Preset: {preset} (0x{preset_id:02X})")
        response = await self.send_command(0x9A, 0x01, bytes([preset_id]))
        if response:
            self.state.eq.preset = preset
            return True
        return False
    
    async def dump_all(self) -> Dict:
        """Полный дамп всех настроек"""
        print("\n" + "="*70)
        print("  ПОЛНЫЙ ДАМП НАСТРОЕК")
        print("="*70)
        
        result = {
            "timestamp": datetime.now().isoformat(),
            "mac": self.mac,
            "status": await self.get_status(),
            "eq": await self.get_eq(),
            "balance": await self.get_balance(),
        }
        
        print("\n" + "="*70)
        print("  РЕЗУЛЬТАТЫ")
        print("="*70)
        print(json.dumps(result, indent=2, default=str))
        
        return result
    
    async def load_config(self, filepath: str) -> bool:
        """Загрузка конфигурации из JSON"""
        try:
            with open(filepath, 'r') as f:
                config = json.load(f)
            
            print(f"\n📖 Загрузка из {filepath}...")
            
            if 'eq' in config:
                eq = config['eq']
                await self.set_eq_preset(eq.get('preset', 'Flat'))
                await asyncio.sleep(0.1)
            
            if 'system' in config:
                system = config['system']
                await self.set_volume(system.get('volume', 20))
                await asyncio.sleep(0.1)
            
            print("✅ Конфигурация загружена!")
            return True
        except Exception as e:
            print(f"❌ Ошибка: {e}")
            return False
    
    async def save_config(self, filepath: str) -> bool:
        """Сохранение конфигурации в JSON"""
        try:
            config = asdict(self.state)
            with open(filepath, 'w') as f:
                json.dump(config, f, indent=2)
            
            print(f"\n💾 Сохранено в {filepath}")
            return True
        except Exception as e:
            print(f"❌ Ошибка: {e}")
            return False

# ============================================================================
# ИНТЕРФЕЙС
# ============================================================================

async def main_menu():
    """Главное меню"""
    print("\n" + "="*70)
    print("  🚗 PROLOGY Full Client v3.0")
    print("="*70)
    print(f"\n📱 MAC: {PROLOGY_MAC}")
    print(f"📡 Service: {SERVICE_UUID}")
    print(f"📡 Write: {WRITE_UUID}")
    
    client = PrologyClient()
    
    print("\n📋 Меню:")
    print("  1. Подключиться")
    print("  2. Запрос статуса")
    print("  3. Запрос EQ")
    print("  4. Громкость +")
    print("  5. Громкость -")
    print("  6. Mute")
    print("  7. Полный дамп")
    print("  8. Загрузить конфиг")
    print("  9. Сохранить конфиг")
    print("  0. Выход")
    print()
    
    choice = input("Выбор: ").strip()
    
    if choice == '1':
        if await client.connect():
            print("\n✅ Подключение успешно!")
        else:
            print("\n❌ Не удалось подключиться")
    
    elif choice == '2':
        if not client._connected:
            print("❌ Сначала подключитесь (1)")
        else:
            await client.get_status()
    
    elif choice == '3':
        if not client._connected:
            print("❌ Сначала подключитесь (1)")
        else:
            await client.get_eq()
    
    elif choice == '4':
        if not client._connected:
            print("❌ Сначала подключитесь (1)")
        else:
            await client.volume_up()
    
    elif choice == '5':
        if not client._connected:
            print("❌ Сначала подключитесь (1)")
        else:
            await client.volume_down()
    
    elif choice == '6':
        if not client._connected:
            print("❌ Сначала подключитесь (1)")
        else:
            await client.mute()
    
    elif choice == '7':
        if not client._connected:
            print("❌ Сначала подключитесь (1)")
        else:
            await client.dump_all()
    
    elif choice == '8':
        if not client._connected:
            print("❌ Сначала подключитесь (1)")
        else:
            filepath = input("Путь к файлу: ").strip()
            await client.load_config(filepath)
    
    elif choice == '9':
        if not client._connected:
            print("❌ Сначала подключитесь (1)")
        else:
            filepath = input("Путь для сохранения: ").strip()
            await client.save_config(filepath)
    
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
