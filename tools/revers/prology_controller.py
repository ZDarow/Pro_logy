#!/usr/bin/env python3
# ============================================================================
# PROLOGY Controller - L2CAP
# Полное управление магнитолой через Linux (BR/EDR Bluetooth)
# ============================================================================

import socket
import time
import sys

# ============================================================================
# КОНФИГУРАЦИЯ
# ============================================================================

DEVICE_MAC = "10:48:5E:71:20:90"  # MAC адрес PROLOGY
PSM_CHANNEL = 1  # L2CAP PSM 1 (RFCOMM)
TIMEOUT = 5  # Таймаут подключения (секунды)

# ============================================================================
# CRC АЛГОРИТМ
# ============================================================================

def calc_crc(data: bytes) -> int:
    """
    Вычислить CRC для пакета PROLOGY.
    
    Формула:
    - Если сумма данных < 0xC0: CRC = (сумма + 0x40) & 0xFF
    - Если сумма данных >= 0xC0: CRC = сумма & 0x3F
    """
    s = sum(data) & 0xFF
    if s < 0xC0:
        return (s + 0x40) & 0xFF
    else:
        return s & 0x3F

def build_packet(header: int, cmd: int, data: list) -> bytes:
    """Построить пакет с CRC."""
    packet = bytes([header, 0x00, cmd] + data)
    crc = calc_crc(packet)
    return packet + bytes([crc])

# ============================================================================
# КОМАНДЫ ПРОТОКОЛА
# ============================================================================

CMD_EQ_QUERY = 0x02      # Запрос полосы EQ
CMD_QFACTOR = 0x03       # Q Factor
CMD_EQ_GAIN_SET = 0x05   # Установка gain полосы
CMD_PRESET = 0x1B        # Пресет

# ============================================================================
# ФУНКЦИИ УПРАВЛЕНИЯ
# ============================================================================

class PrologyController:
    """Контроллер PROLOGY через L2CAP."""
    
    def __init__(self):
        self.sock = None
        self.connected = False
    
    def connect(self) -> bool:
        """Подключиться к устройству."""
        try:
            print(f"Подключение к {DEVICE_MAC} (L2CAP PSM {PSM_CHANNEL})...")
            self.sock = socket.socket(
                socket.AF_BLUETOOTH,
                socket.SOCK_SEQPACKET,
                socket.BTPROTO_L2CAP
            )
            self.sock.settimeout(TIMEOUT)
            self.sock.connect((DEVICE_MAC, PSM_CHANNEL))
            self.connected = True
            print("✅ ПОДКЛЮЧЕНО!")
            return True
        except Exception as e:
            print(f"❌ Ошибка подключения: {e}")
            return False
    
    def disconnect(self):
        """Отключиться от устройства."""
        if self.sock:
            try:
                self.sock.close()
            except:
                pass
        self.connected = False
        print("📴 Отключено")
    
    def send(self, packet: bytes) -> bool:
        """Отправить пакет."""
        if not self.connected:
            print("❌ Не подключено!")
            return False
        
        try:
            self.sock.send(packet)
            time.sleep(0.1)
            return True
        except Exception as e:
            print(f"❌ Ошибка отправки: {e}")
            return False
    
    # === КОМАНДЫ ===
    
    def volume_up(self):
        """Увеличить громкость."""
        packet = build_packet(0xC0, CMD_EQ_GAIN_SET, [0x92, 0x0C, 0x32, 0x24, 0x07])
        print(f"📤 Volume UP: {packet.hex().upper()}")
        self.send(packet)
    
    def volume_down(self):
        """Уменьшить громкость."""
        packet = build_packet(0xC0, CMD_EQ_GAIN_SET, [0x92, 0x0C, 0x32, 0x23, 0x07])
        print(f"📤 Volume DOWN: {packet.hex().upper()}")
        self.send(packet)
    
    def eq_query(self, band: int):
        """Запросить состояние полосы EQ."""
        packet = build_packet(0xC0, CMD_EQ_QUERY, [band & 0xFF, 0x00])
        print(f"📤 EQ Query Band {band}: {packet.hex().upper()}")
        self.send(packet)
    
    def eq_set(self, band: int, gain: int):
        """
        Установить gain полосы EQ.
        
        band: 0-59 (номер полосы)
        gain: 0x23 (normal) или 0x24 (boost)
        """
        d1 = 0x32 + (band * 0x0A)
        packet = build_packet(0xC0, CMD_EQ_GAIN_SET, [0x92, 0x0C, d1, gain, 0x07])
        print(f"📤 EQ Set Band {band} = 0x{gain:02X}: {packet.hex().upper()}")
        self.send(packet)
    
    def q_factor(self, value: int):
        """
        Установить Q Factor.
        
        value: 0x40-0x50 (0.64-0.80)
        """
        packet = build_packet(0xC0, CMD_QFACTOR, [0x92, 0x0B, value])
        print(f"📤 Q Factor 0x{value:02X}: {packet.hex().upper()}")
        self.send(packet)
    
    def preset_load(self, preset_id: int):
        """
        Загрузить пресет.
        
        preset_id: 0-10
        """
        packet = build_packet(0xC0, CMD_PRESET, [0x9A, 0x21, preset_id])
        print(f"📤 Preset Load {preset_id}: {packet.hex().upper()}")
        self.send(packet)
    
    def bass_boost(self):
        """Загрузить Bass Boost (полосы 0-10 = boost)."""
        print("📤 Bass Boost (полосы 0-10)...")
        for band in range(10):
            self.eq_set(band, 0x24)
            time.sleep(0.05)
        print("✅ Bass Boost загружен!")
    
    def flat(self):
        """Загрузить Flat EQ (все полосы = normal)."""
        print("📤 Flat EQ (все 60 полос)...")
        for band in range(60):
            self.eq_set(band, 0x23)
            time.sleep(0.02)
        print("✅ Flat загружен!")
    
    def vshape(self):
        """Загрузить V-Shape EQ."""
        print("📤 V-Shape EQ...")
        for band in range(60):
            if band < 10 or band > 50:
                gain = 0x24  # Bass и Treble boost
            elif 20 <= band <= 40:
                gain = 0x23  # Mids normal
            else:
                gain = 0x23
            self.eq_set(band, gain)
            time.sleep(0.02)
        print("✅ V-Shape загружен!")

# ============================================================================
# МЕНЮ
# ============================================================================

def print_menu():
    """Вывести меню."""
    print()
    print("=" * 60)
    print("  PROLOGY CONTROL - L2CAP")
    print("=" * 60)
    print()
    print("  📢 ГРОМКОСТЬ:")
    print("    1. Увеличить громкость")
    print("    2. Уменьшить громкость")
    print()
    print("  🎚️ EQ:")
    print("    3. Запросить полосу EQ")
    print("    4. Установить полосу EQ")
    print()
    print("  🎵 ПРЕСЕТЫ:")
    print("    5. Bass Boost (полосы 0-10)")
    print("    6. Flat (все полосы)")
    print("    7. V-Shape")
    print("    8. Загрузить пресет (0-10)")
    print()
    print("  ⚙️ НАСТРОЙКИ:")
    print("    9. Q Factor")
    print()
    print("  🚪 ВЫХОД:")
    print("    0. Выход")
    print()
    print("=" * 60)

def main_menu():
    """Главное меню."""
    controller = PrologyController()
    
    # Подключение
    if not controller.connect():
        print()
        print("Проверьте:")
        print("  1. Устройство PROLOGY включено")
        print("  2. Android Bluetooth выключен")
        print("  3. Linux Bluetooth включён")
        print("  4. Устройство не подключено к другому устройству")
        return
    
    print()
    print("Управление:")
    print("  • Введите номер команды")
    print("  • Ctrl+C для выхода")
    print()
    
    try:
        while True:
            print_menu()
            
            try:
                choice = input("Выбор: ").strip()
            except (EOFError, KeyboardInterrupt):
                print("\nВыход...")
                break
            
            if choice == '1':
                controller.volume_up()
            
            elif choice == '2':
                controller.volume_down()
            
            elif choice == '3':
                try:
                    band = int(input("Номер полосы (0-59): ").strip())
                    controller.eq_query(band)
                except ValueError:
                    print("❌ Неверный номер")
            
            elif choice == '4':
                try:
                    band = int(input("Номер полосы (0-59): ").strip())
                    gain_str = input("Gain (23=normal, 24=boost): ").strip()
                    gain = int(gain_str, 16)
                    controller.eq_set(band, gain)
                except ValueError:
                    print("❌ Неверные данные")
            
            elif choice == '5':
                controller.bass_boost()
            
            elif choice == '6':
                controller.flat()
            
            elif choice == '7':
                controller.vshape()
            
            elif choice == '8':
                try:
                    preset = int(input("Номер пресета (0-10): ").strip())
                    if 0 <= preset <= 10:
                        controller.preset_load(preset)
                    else:
                        print("❌ Пресет должен быть 0-10")
                except ValueError:
                    print("❌ Неверный номер")
            
            elif choice == '9':
                try:
                    value = int(input("Q Factor (40-50 hex): ").strip())
                    controller.q_factor(value)
                except ValueError:
                    print("❌ Неверное значение")
            
            elif choice == '0':
                print("Выход...")
                break
            
            else:
                print("❌ Неверная команда")
            
            time.sleep(0.3)
    
    except KeyboardInterrupt:
        print("\nПрервано...")
    
    finally:
        controller.disconnect()

# ============================================================================
# ЗАПУСК
# ============================================================================

if __name__ == '__main__':
    print()
    print("╔═══════════════════════════════════════════════════════════╗")
    print("║     PROLOGY CONTROLLER - L2CAP                            ║")
    print("║     Управление магнитолой через Linux                     ║")
    print("╚═══════════════════════════════════════════════════════════╝")
    print()
    
    main_menu()
    
    print()
    print("Сессия завершена!")
