#!/usr/bin/env python3
# ============================================================================
# PROLOGY Linux Controller
# Управление через Bluetooth SPP
# MAC: 10:48:5E:71:20:90
# ============================================================================

import sys
import time
import socket
import struct
from typing import Optional, List

# Импорт библиотеки протокола
try:
    from prology_protocol import (
        prology_crc,
        prology_crc_verify,
        prology_crc_append,
        PrologyPacketBuilder,
        PrologyPacketParser,
        bytes_to_hex,
        hex_to_bytes
    )
    PROTOCOL_LOADED = True
except ImportError:
    PROTOCOL_LOADED = False
    print("⚠️ prology_protocol.py не найден, используем базовые функции")

# ============================================================================
# Базовые функции CRC (если библиотека не загружена)
# ============================================================================

def calc_crc(data: bytes) -> int:
    """PROLOGY CRC алгоритм"""
    s = sum(data) & 0xFF
    if s < 0xC0:
        return (s + 0x40) & 0xFF
    else:
        return s & 0x3F

def build_packet(header: int, cmd: int, data: List[int]) -> bytes:
    """Построить пакет с CRC"""
    packet = bytes([header, 0x00, cmd] + data)
    crc = calc_crc(packet)
    return packet + bytes([crc])

# ============================================================================
# PROLOGY SPP Controller
# ============================================================================

class PrologySPPController:
    """Контроллер PROLOGY через Bluetooth SPP"""
    
    # MAC адрес устройства
    DEVICE_MAC = "10:48:5E:71:20:90"
    
    # SPP канал (обычно 1 для последовательного порта)
    SPP_CHANNEL = 1
    
    # UUID SPP
    SPP_UUID = "00001101-0000-1000-8000-00805f9b34fb"
    
    def __init__(self):
        self.socket = None
        self.connected = False
        self.buffer = b''
    
    def connect(self) -> bool:
        """Подключение к устройству через SPP"""
        import os
        import subprocess
        
        print(f"📡 Подключение к PROLOGY ({self.DEVICE_MAC})...")
        
        # Попытка 1: Проверка /dev/rfcomm0
        if os.path.exists('/dev/rfcomm0'):
            print(f"✅ RFCOMM устройство найдено: /dev/rfcomm0")
            try:
                self.socket = open('/dev/rfcomm0', 'wb')
                self.connected = True
                print(f"✅ Подключение успешно (через /dev/rfcomm0)!")
                return True
            except Exception as e:
                print(f"⚠️ Ошибка открытия /dev/rfcomm0: {e}")
        
        # Попытка 2: Создание RFCOMM устройства
        print(f"⚠️ RFCOMM устройство не найдено, создаём...")
        try:
            # Загрузка модуля
            subprocess.run(['sudo', 'modprobe', 'rfcomm'], capture_output=True, timeout=5)
            
            # Привязка
            result = subprocess.run(
                ['sudo', 'rfcomm', 'bind', '0', self.DEVICE_MAC, '1'],
                capture_output=True,
                text=True,
                timeout=10
            )
            
            if result.returncode == 0 or os.path.exists('/dev/rfcomm0'):
                time.sleep(1)
                if os.path.exists('/dev/rfcomm0'):
                    # Права доступа
                    subprocess.run(['sudo', 'chmod', '666', '/dev/rfcomm0'], capture_output=True)
                    
                    self.socket = open('/dev/rfcomm0', 'wb')
                    self.connected = True
                    print(f"✅ RFCOMM устройство создано и подключено!")
                    return True
            else:
                print(f"⚠️ Не удалось создать RFCOMM: {result.stderr}")
        
        except Exception as e:
            print(f"⚠️ Ошибка создания RFCOMM: {e}")
        
        # Попытка 3: Прямое подключение через socket
        print(f"📡 Попытка прямого подключения через Bluetooth socket...")
        try:
            self.socket = socket.socket(socket.AF_BLUETOOTH, 
                                        socket.SOCK_STREAM, 
                                        socket.BTPROTO_RFCOMM)
            self.socket.connect((self.DEVICE_MAC, self.SPP_CHANNEL))
            self.connected = True
            print(f"✅ Подключение успешно (через socket)!")
            return True
        
        except Exception as e:
            print(f"❌ Ошибка подключения: {e}")
            print()
            print("Попробуйте вручную:")
            print(f"  sudo rfcomm bind 0 {self.DEVICE_MAC} 1")
            print(f"  sudo chmod 666 /dev/rfcomm0")
            print()
            print("Или используйте скрипт:")
            print("  ./prology-auto.sh")
            return False
    
    def disconnect(self):
        """Отключение от устройства"""
        if self.socket:
            try:
                if isinstance(self.socket, socket.socket):
                    self.socket.close()
                else:
                    self.socket.close()
                self.connected = False
                print("📴 Отключено")
            except:
                pass
    
    def send(self, data: bytes) -> bool:
        """Отправка данных"""
        if not self.connected:
            print("❌ Нет подключения!")
            return False
        
        try:
            if isinstance(self.socket, socket.socket):
                self.socket.send(data)
            else:
                # File-like object (RFCOMM)
                self.socket.write(data)
                self.socket.flush()
            return True
        
        except Exception as e:
            print(f"❌ Ошибка отправки: {e}")
            return False
    
    def receive(self, timeout: float = 1.0) -> bytes:
        """Приём данных"""
        if not self.connected:
            return b''
        
        try:
            self.socket.settimeout(timeout)
            data = self.socket.recv(1024)
            self.socket.settimeout(None)
            return data
        except socket.timeout:
            return b''
        except Exception as e:
            print(f"❌ Ошибка приёма: {e}")
            return b''
    
    # ========================================================================
    # Команды протокола
    # ========================================================================
    
    def send_eq_gain(self, band: int, gain_msb: int = 0x23, gain_data: int = 0x07) -> bool:
        """
        Установка gain полосы эквалайзера.
        
        Args:
            band: Номер полосы (0-59)
            gain_msb: MSB gain (0x23 или 0x24)
            gain_data: Gain data (обычно 0x07)
        """
        if PROTOCOL_LOADED:
            packet = PrologyPacketBuilder.build_eq_gain_set(band, gain_msb, gain_data)
        else:
            # Вычисление D1 из номера полосы
            d1 = 0x32 + (band * 0x0A)
            packet = build_packet(0xC0, 0x05, [0x92, 0x0C, d1, gain_msb, gain_data])
        
        print(f"📤 EQ Gain Set: band={band}, gain=0x{gain_msb:02X}")
        print(f"   Пакет: {bytes_to_hex(packet) if PROTOCOL_LOADED else packet.hex().upper()}")
        
        return self.send(packet)
    
    def send_eq_query(self, band: int, gain: int = 0) -> bool:
        """
        Запрос состояния полосы.
        
        Args:
            band: Номер полосы
            gain: Значение gain (0-4)
        """
        if PROTOCOL_LOADED:
            packet = PrologyPacketBuilder.build_eq_gain_query(band, gain)
        else:
            packet = build_packet(0xC0, 0x02, [band & 0xFF, gain & 0xFF])
        
        print(f"📤 EQ Query: band={band}")
        print(f"   Пакет: {bytes_to_hex(packet) if PROTOCOL_LOADED else packet.hex().upper()}")
        
        return self.send(packet)
    
    def send_qfactor(self, base: int = 0x92, sub: int = 0x0B, value: int = 0x50) -> bool:
        """
        Установка Q factor.
        
        Args:
            base: Base value (0x92)
            sub: Subcommand (0x0B или 0x0C)
            value: Q factor value
        """
        if PROTOCOL_LOADED:
            packet = PrologyPacketBuilder.build_eq_qfactor(base, sub, value)
        else:
            packet = build_packet(0xC0, 0x03, [base, sub, value])
        
        print(f"📤 Q Factor: base=0x{base:02X}, sub=0x{sub:02X}, value=0x{value:02X}")
        print(f"   Пакет: {bytes_to_hex(packet) if PROTOCOL_LOADED else packet.hex().upper()}")
        
        return self.send(packet)
    
    def scan_all_bands(self, delay: float = 0.05):
        """Сканирование всех 60 полос эквалайзера"""
        print("📡 Сканирование всех 60 полос...")
        
        for band in range(60):
            self.send_eq_query(band, 0)
            time.sleep(delay)
        
        print("✅ Сканирование завершено")
    
    def set_all_gains(self, gains: List[int], delay: float = 0.05):
        """
        Установка gain для всех полос.
        
        Args:
            gains: Список gain значений (60 значений)
            delay: Задержка между командами
        """
        if len(gains) != 60:
            print("❌ Нужно 60 значений gain!")
            return
        
        print("📤 Установка gain для всех 60 полос...")
        
        for band, gain in enumerate(gains):
            self.send_eq_gain(band, gain)
            time.sleep(delay)
        
        print("✅ Установка завершена")
    
    def load_flat_preset(self):
        """Загрузка плоского пресета (все gain = 0x23)"""
        print("📤 Загрузка плоского пресета (Flat)...")
        gains = [0x23] * 60
        self.set_all_gains(gains)
    
    def load_bass_boost_preset(self):
        """Загрузка пресета с усилением баса"""
        print("📤 Загрузка пресета Bass Boost...")
        
        # Усиление низких частот (полосы 0-10)
        gains = []
        for band in range(60):
            if band < 10:
                gains.append(0x24)  # Усиление
            else:
                gains.append(0x23)  # Плоско
        
        self.set_all_gains(gains)

# ============================================================================
# Interactive Mode
# ============================================================================

def interactive_mode(controller: PrologySPPController):
    """Интерактивный режим"""
    
    print()
    print("╔═══════════════════════════════════════════════════════════╗")
    print("║     PROLOGY Controller - Интерактивный режим              ║")
    print("╚═══════════════════════════════════════════════════════════╝")
    print()
    print("Команды:")
    print("  eq <band> <gain>   - Установка gain (0-59, 0x23/0x24)")
    print("  query <band>       - Запрос полосы")
    print("  qf <value>         - Q factor (0x00-0xFF)")
    print("  scan               - Сканировать все полосы")
    print("  flat               - Плоский пресет")
    print("  bass               - Bass Boost")
    print("  help               - Справка")
    print("  exit/quit          - Выход")
    print()
    
    while True:
        try:
            cmd = input("🎛️ prology> ").strip().lower()
        except (EOFError, KeyboardInterrupt):
            print()
            break
        
        if cmd in ('exit', 'quit', 'q'):
            break
        
        elif cmd == 'help':
            continue
        
        elif cmd.startswith('eq '):
            parts = cmd.split()
            if len(parts) >= 3:
                try:
                    band = int(parts[1])
                    gain = int(parts[2], 16) if parts[2].startswith('0x') else int(parts[2])
                    if 0 <= band <= 59:
                        controller.send_eq_gain(band, gain)
                    else:
                        print("❌ Band должен быть 0-59")
                except ValueError:
                    print("❌ Пример: eq 5 0x23")
            else:
                print("❌ Пример: eq 5 0x23")
        
        elif cmd.startswith('query '):
            parts = cmd.split()
            if len(parts) >= 2:
                try:
                    band = int(parts[1])
                    if 0 <= band <= 59:
                        controller.send_eq_query(band)
                    else:
                        print("❌ Band должен быть 0-59")
                except ValueError:
                    print("❌ Пример: query 5")
            else:
                print("❌ Пример: query 5")
        
        elif cmd.startswith('qf '):
            parts = cmd.split()
            if len(parts) >= 2:
                try:
                    value = int(parts[1], 16) if parts[1].startswith('0x') else int(parts[1])
                    controller.send_qfactor(value=value)
                except ValueError:
                    print("❌ Пример: qf 0x50")
            else:
                print("❌ Пример: qf 0x50")
        
        elif cmd == 'scan':
            controller.scan_all_bands()
        
        elif cmd == 'flat':
            controller.load_flat_preset()
        
        elif cmd == 'bass':
            controller.load_bass_boost_preset()
        
        else:
            print(f"❌ Неизвестная команда: {cmd}")
    
    controller.disconnect()

# ============================================================================
# Main
# ============================================================================

def main():
    print()
    print("╔═══════════════════════════════════════════════════════════╗")
    print("║     PROLOGY Linux Controller v1.0                         ║")
    print("║     MAC: 10:48:5E:71:20:90                                ║")
    print("╚═══════════════════════════════════════════════════════════╝")
    print()
    
    # Создание контроллера
    controller = PrologySPPController()
    
    # Подключение
    if not controller.connect():
        print()
        print("Не удалось подключиться. Проверьте:")
        print("  1. Устройство включено")
        print("  2. Устройство в режиме сопряжения")
        print("  3. Выполните сопряжение:")
        print("     bluetoothctl")
        print("     > pair 10:48:5E:71:20:90")
        print("     > trust 10:48:5E:71:20:90")
        return
    
    print()
    
    # Интерактивный режим
    interactive_mode(controller)

if __name__ == '__main__':
    main()
