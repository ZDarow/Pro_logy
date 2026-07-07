#!/usr/bin/env python3
# ============================================================================
# PROLOGY Classic Bluetooth Client v4.0
# Подключение через Classic Bluetooth (SPP/RFCOMM)
# ============================================================================
# Установка: pip install pybluez
# Запуск: sudo python3 prology_classic_client.py
# ============================================================================

import socket
import sys
import time

# Проверка импортов
try:
    import bluetooth
except ImportError:
    print("❌ PyBluez не установлен!")
    print("   Установка:")
    print("   Ubuntu/Debian: sudo apt install python3-bluetooth libbluetooth-dev")
    print("   pip: pip install pybluez")
    sys.exit(1)

# ============================================================================
# КОНСТАНТЫ
# ============================================================================

# MAC адрес
PROLOGY_MAC = "10:48:5E:71:20:90"

# SPP UUID (Serial Port Profile)
SPP_UUID = "00001101-0000-1000-8000-00805f9b34fb"

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

def verify_crc(data: bytes) -> bool:
    if len(data) < 6:
        return False
    cmd_type = data[3]
    subcmd = data[4]
    received_crc = data[-1]
    calc_crc = calculate_crc(cmd_type, subcmd, data[:-1])
    return calc_crc == received_crc

# ============================================================================
# КЛИЕНТ
# ============================================================================

class PrologyClassicClient:
    """Клиент для Classic Bluetooth (SPP)"""
    
    def __init__(self, mac: str = PROLOGY_MAC):
        self.mac = mac
        self.sock = None
        self._connected = False
    
    def find_service(self) -> str:
        """Поиск SPP сервиса"""
        print(f"\n🔍 Поиск SPP сервиса на {self.mac}...")
        
        try:
            services = bluetooth.find_service(address=self.mac)
            
            for service in services:
                uuid = service.get('service-classes', [''])[0] if service.get('service-classes') else service.get('uuid', '')
                name = service.get('name', 'Unknown')
                port = service.get('port')
                
                print(f"   Найдено: {name}")
                print(f"   UUID: {uuid}")
                print(f"   Порт: {port}")
                
                # Ищем SPP
                if SPP_UUID in str(uuid).lower() or 'serial' in name.lower() or port:
                    print(f"   ✅ SPP найден!")
                    return str(port)
            
            # Если не нашли, пробуем стандартный порт
            print(f"   ⚠️  SPP не найден, пробуем порт 1")
            return "1"
            
        except Exception as e:
            print(f"   ❌ Ошибка: {e}")
            return "1"
    
    def connect(self, timeout: int = 10) -> bool:
        """Подключение через RFCOMM"""
        print(f"\n🔵 Подключение к {self.mac}...")
        
        try:
            # Поиск порта
            port = self.find_service()
            
            # Создание сокета
            self.sock = socket.socket(socket.AF_BLUETOOTH, socket.SOCK_STREAM, socket.BTPROTO_RFCOMM)
            self.sock.settimeout(timeout)
            
            # Подключение
            print(f"   Подключение к {self.mac}:{port}...")
            self.sock.connect((self.mac, int(port)))
            self.sock.settimeout(5)  # Таймаут для чтения/записи
            
            self._connected = True
            print(f"✅ Подключено!")
            
            return True
            
        except Exception as e:
            print(f"❌ Ошибка подключения: {e}")
            print(f"\n💡 Попробуйте:")
            print(f"   1. Убедитесь что устройство включено")
            print(f"   2. Проверьте что не подключено к другому приложению")
            print(f"   3. Переподключите в настройках Bluetooth")
            return False
    
    def disconnect(self):
        """Отключение"""
        if self.sock:
            try:
                self.sock.close()
            except:
                pass
            self._connected = False
            print("\n🔴 Отключено")
    
    def send(self, data: bytes) -> bool:
        """Отправка данных"""
        if not self._connected:
            print("❌ Не подключено!")
            return False
        
        try:
            self.sock.send(data)
            return True
        except Exception as e:
            print(f"❌ Ошибка отправки: {e}")
            return False
    
    def read(self, size: int = 1024, timeout: float = 0.5) -> bytes:
        """Чтение данных"""
        if not self._connected:
            return b''
        
        try:
            self.sock.settimeout(timeout)
            data = self.sock.recv(size)
            return data
        except socket.timeout:
            return b''
        except Exception as e:
            print(f"❌ Ошибка чтения: {e}")
            return b''
    
    def send_command(self, cmd_type: int, subcmd: int, payload: bytes = b'') -> bytes:
        """Отправка команды и чтение ответа"""
        command = create_command(cmd_type, subcmd, payload)
        print(f"📤 {command.hex().upper()}")
        
        if not self.send(command):
            return b''
        
        # Чтение ответа
        time.sleep(0.1)
        response = self.read(1024)
        
        if response:
            print(f"📥 {response.hex().upper()}")
            if verify_crc(response):
                print("   ✅ CRC OK")
            else:
                print("   ❌ CRC ERROR")
        
        return response
    
    # Команды
    def set_volume(self, level: int):
        level = max(0, min(100, level))
        print(f"\n🔊 Громкость: {level}")
        return self.send_command(0x05, level)
    
    def volume_up(self):
        print("\n🔊 Volume UP")
        return self.send_command(0x07, 0x01)
    
    def volume_down(self):
        print("\n🔉 Volume DOWN")
        return self.send_command(0x06, 0xFE)
    
    def mute(self, enable: bool = True):
        print(f"\n🔇 Mute: {enable}")
        return self.send_command(0x05, 0x00 if enable else 0x01)
    
    def get_status(self):
        print("\n📊 Запрос статуса...")
        return self.send_command(0x90, 0x01)
    
    def get_eq(self):
        print("\n🎵 Запрос EQ...")
        return self.send_command(0x9A, 0x01)

# ============================================================================
# МЕНЮ
# ============================================================================

def main_menu():
    print("\n" + "="*70)
    print("  🚗 PROLOGY Classic Bluetooth Client v4.0")
    print("="*70)
    print(f"\n📱 MAC: {PROLOGY_MAC}")
    print(f"📡 Тип: Classic Bluetooth (SPP/RFCOMM)")
    print(f"🔌 UUID: {SPP_UUID}")
    
    client = PrologyClassicClient()
    
    print("\n📋 Меню:")
    print("  1. Подключиться")
    print("  2. Запрос статуса")
    print("  3. Запрос EQ")
    print("  4. Громкость +")
    print("  5. Громкость -")
    print("  6. Mute")
    print("  7. Громкость (0-100)")
    print("  8. Тест связи")
    print("  0. Выход")
    print()
    
    choice = input("Выбор: ").strip()
    
    if choice == '1':
        if client.connect():
            print("\n✅ Подключение успешно!")
        else:
            print("\n❌ Не удалось подключиться")
    
    elif choice == '2':
        if not client._connected:
            print("❌ Сначала подключитесь (1)")
        else:
            client.get_status()
    
    elif choice == '3':
        if not client._connected:
            print("❌ Сначала подключитесь (1)")
        else:
            client.get_eq()
    
    elif choice == '4':
        if not client._connected:
            print("❌ Сначала подключитесь (1)")
        else:
            client.volume_up()
    
    elif choice == '5':
        if not client._connected:
            print("❌ Сначала подключитесь (1)")
        else:
            client.volume_down()
    
    elif choice == '6':
        if not client._connected:
            print("❌ Сначала подключитесь (1)")
        else:
            client.mute()
    
    elif choice == '7':
        if not client._connected:
            print("❌ Сначала подключитесь (1)")
        else:
            level = input("Громкость (0-100): ").strip()
            try:
                client.set_volume(int(level))
            except:
                print("❌ Неверное значение")
    
    elif choice == '8':
        if not client._connected:
            print("❌ Сначала подключитесь (1)")
        else:
            print("\n🧪 Тест связи...")
            for i in range(3):
                print(f"\nПопытка {i+1}:")
                client.get_status()
                time.sleep(0.5)
    
    elif choice == '0':
        client.disconnect()
        print("👋 Выход")
        return
    
    else:
        print("❌ Неверный выбор")
    
    # Возврат в меню
    main_menu()

if __name__ == "__main__":
    try:
        main_menu()
    except KeyboardInterrupt:
        print("\n\n👋 Прервано")
