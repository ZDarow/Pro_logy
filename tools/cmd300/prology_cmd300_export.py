#!/usr/bin/env python3
"""
PROLOGY CMD-300 Configuration Export Tool
Экспорт/импорт конфигураций на магнитолу через Bluetooth

Зависимости:
    sudo apt install python3-serial python3-gi python3-gi-cairo gir1.2-gtk-3.0

Использование:
    python3 prology_cmd300_export.py
"""

import serial
import json
import time
import sys
import os
from datetime import datetime
from pathlib import Path

# Конфигурация
DEVICE_MAC = "10:48:5E:71:20:90"
DEVICE_NAME = "PROLOGY CMD-300"
RFCOMM_PORT = "/dev/rfcomm0"
BAUD_RATE = 9600
TIMEOUT = 2  # Уменьшено для быстрой реакции

# Частотные полосы CMD-300 (10 основных)
FREQUENCIES_10BAND = [31, 62, 125, 250, 500, 1000, 2000, 4000, 8000, 16000]

# Формат команды: EQ BAND {index} {sign}{gain}\r\n
COMMAND_FORMAT = "EQ BAND {} {}{}\r\n"
COMMAND_DELAY = 0.05  # 50ms между командами


class PrologyCMD300:
    """Класс для работы с PROLOGY CMD-300"""
    
    def __init__(self, port=RFCOMM_PORT, baud=BAUD_RATE, timeout=TIMEOUT):
        self.port = port
        self.baud = baud
        self.timeout = timeout
        self.serial_conn = None
        self.connected = False
        self.config = self._default_config()
        
    def _default_config(self):
        """Конфигурация по умолчанию"""
        return {
            "device": DEVICE_NAME,
            "version": "1.0",
            "exported": None,
            "equalizer": {
                "preset": "Flat",
                "bands": [0] * 10,  # 10 полос от -12 до +12 dB
                "bass_boost": 0,  # 0-5
                "loudness": 0  # 0-2
            },
            "volumes": {
                "master": 25,  # 0-40
            }
        }
    
    def connect(self):
        """Подключение к устройству"""
        try:
            print(f"🔵 Подключение к {DEVICE_NAME}...")
            print(f"   Порт: {self.port}")
            print(f"   Baud: {self.baud}")
            print(f"   Timeout: {self.timeout}s")
            
            self.serial_conn = serial.Serial(
                self.port, 
                self.baud, 
                timeout=self.timeout
            )
            time.sleep(1)  # Дольше ждем инициализации
            
            # Очистка буферов
            self.serial_conn.reset_input_buffer()
            self.serial_conn.reset_output_buffer()
            
            # Тестовая команда с повторными попытками
            max_attempts = 3
            for attempt in range(max_attempts):
                print(f"   Попытка {attempt + 1}/{max_attempts}...")
                response = self._send_command("PING")
                if response == "PONG":
                    self.connected = True
                    print(f"✅ Подключено к {DEVICE_NAME}")
                    return True
                elif response:
                    print(f"   Получен ответ: {response}")
                time.sleep(0.5)
            
            print(f"❌ Устройство не отвечает после {max_attempts} попыток")
            print(f"   Возможно протокол отличается от ожидаемого")
            return False
                
        except serial.SerialException as e:
            print(f"❌ Ошибка подключения: {e}")
            print(f"   Убедитесь что:")
            print(f"   1. Устройство подключено через bluetoothctl")
            print(f"   2. RFCOMM порт создан: sudo rfcomm bind {self.port} {DEVICE_MAC} 1")
            return False
        except Exception as e:
            print(f"❌ Неожиданная ошибка: {e}")
            return False
    
    def disconnect(self):
        """Отключение"""
        if self.serial_conn and self.serial_conn.is_open:
            self.serial_conn.close()
            self.connected = False
            print("🔴 Отключено")
    
    def _send_command(self, command, expect_response=False):
        """Отправка команды"""
        if not self.serial_conn or not self.serial_conn.is_open:
            return None
        
        try:
            # Добавляем терминатор если нет
            if not command.endswith('\r\n'):
                full_command = f"{command}\r\n"
            else:
                full_command = command
            
            # Очистка буферов перед отправкой
            self.serial_conn.reset_input_buffer()
            self.serial_conn.reset_output_buffer()
            
            # Отправка команды
            self.serial_conn.write(full_command.encode('ascii'))
            self.serial_conn.flush()
            
            # Небольшая задержка
            time.sleep(0.01)
            
            if expect_response:
                # Чтение ответа
                time.sleep(0.1)
                if self.serial_conn.in_waiting:
                    response = self.serial_conn.read(self.serial_conn.in_waiting).decode('ascii').strip()
                    return response
            return None
            
        except Exception as e:
            print(f"❌ Ошибка отправки: {e}")
            return None
    
    def ping(self):
        """Проверка связи"""
        return self._send_command("PING") == "PONG"
    
    def get_status(self):
        """Получить статус устройства"""
        response = self._send_command("GET_STATUS")
        if response and response.startswith("STATUS:"):
            # Парсинг: STATUS:ONLINE,BT:CONNECTED,VOL:25
            parts = response.split(",")
            status = {}
            for part in parts:
                if ":" in part:
                    key, value = part.split(":", 1)
                    status[key] = value
            return status
        return None
    
    def get_eq_settings(self):
        """Получить настройки эквалайзера (возвращает локальную копию)"""
        # Возвращаем локальные настройки
        return self.config["equalizer"]["bands"]
    
    def set_eq_band(self, index, gain):
        """Установить значение полосы эквалайзера"""
        if index < 0 or index > 9:  # 10 полос
            print(f"❌ Неверный индекс: {index} (0-9)")
            return False
        if gain < -12 or gain > 12:
            print(f"❌ Gain вне диапазона: {gain} (-12 до +12)")
            return False
        
        sign = "+" if gain >= 0 else ""
        command = f"EQ BAND {index} {sign}{gain}"
        response = self._send_command(command, expect_response=False)
        return True  # Возвращаем True так как не ждем ответа
    
    def set_all_eq(self, gains):
        """Установить все полосы эквалайзера"""
        if len(gains) != 10:  # 10 полос
            print(f"❌ Нужно 10 значений! Получено: {len(gains)}")
            return False
        
        success_count = 0
        print(f"\n🎛️ Отправка {len(gains)} команд...")
        
        for i, gain in enumerate(gains):
            if self.set_eq_band(i, gain):
                success_count += 1
                print(f"  {FREQUENCIES_10BAND[i]:5d}Hz: {gain:+4d} dB ✅")
            time.sleep(COMMAND_DELAY)  # 50ms задержка
        
        print(f"\n✅ Отправлено {success_count}/{len(gains)} команд")
        return success_count == len(gains)
    
    def apply_preset(self, preset_name):
        """Применить пресет"""
        presets = {
            "Flat": [0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
            "Bass Boost": [8, 6, 3, 0, 0, 0, 0, 0, 0, 0],
            "Rock": [4, 3, 2, 0, -2, -2, 0, 2, 3, 4],
            "Pop": [2, 4, 3, 1, 0, 0, 1, 2, 2, 3],
            "Jazz": [3, 2, 4, 3, 1, 0, 0, 1, 2, 2],
            "Classic": [2, 2, 3, 4, 3, 2, 1, 0, 0, 0],
            "Vocal": [0, 0, 0, 2, 4, 4, 3, 2, 1, 0],
            "Electronic": [6, 4, 2, 1, 0, 0, 2, 3, 4, 5]
        }
        
        if preset_name in presets:
            print(f"🎵 Применение пресета '{preset_name}'...")
            return self.set_all_eq(presets[preset_name])
        else:
            print(f"❌ Пресет '{preset_name}' не найден")
            print(f"   Доступные: {', '.join(presets.keys())}")
            return False
    
    def export_config(self, filename=None):
        """Экспорт конфигурации в файл"""
        if not filename:
            timestamp = datetime.now().strftime("%Y%m%d_%H%M%S")
            filename = f"prology_cmd300_config_{timestamp}.json"
        
        self.config["exported"] = datetime.now().isoformat()
        
        # Получение текущих настроек
        print("📥 Чтение настроек с устройства...")
        self.get_eq_settings()
        status = self.get_status()
        if status:
            self.config["status"] = status
        
        # Сохранение в файл
        try:
            with open(filename, 'w', encoding='utf-8') as f:
                json.dump(self.config, f, indent=2, ensure_ascii=False)
            
            print(f"✅ Конфигурация экспортирована в {filename}")
            return True
        except Exception as e:
            print(f"❌ Ошибка сохранения: {e}")
            return False
    
    def import_config(self, filename):
        """Импорт конфигурации из файла"""
        try:
            with open(filename, 'r', encoding='utf-8') as f:
                imported_config = json.load(f)
            
            print(f"📤 Импорт конфигурации из {filename}...")
            
            # Применение настроек эквалайзера
            if "equalizer" in imported_config and "bands" in imported_config["equalizer"]:
                bands = imported_config["equalizer"]["bands"]
                if len(bands) == 25:
                    print("🎛️ Применение настроек эквалайзера...")
                    self.set_all_eq(bands)
                else:
                    print(f"❌ Неверное количество полос: {len(bands)} (нужно 25)")
                    return False
            
            print("✅ Конфигурация импортирована")
            return True
            
        except Exception as e:
            print(f"❌ Ошибка импорта: {e}")
            return False
    
    def list_presets(self):
        """Список доступных пресетов"""
        print("\n🎵 Доступные пресеты:")
        presets = ["Flat", "Rock", "Pop", "Jazz", "Classic", "Electronic", "Vocal", "Bass Boost"]
        for i, preset in enumerate(presets, 1):
            print(f"  {i}. {preset}")
        print()


def check_rfcomm():
    """Проверка RFCOMM подключения"""
    if not os.path.exists(RFCOMM_PORT):
        print(f"❌ Устройство {RFCOMM_PORT} не найдено!")
        print(f"\nДля подключения выполните:")
        print(f"  sudo rfcomm release {RFCOMM_PORT}")
        print(f"  sudo rfcomm bind {RFCOMM_PORT} {DEVICE_MAC} 1")
        return False
    return True


def interactive_mode():
    """Интерактивный режим"""
    device = PrologyCMD300()
    
    print("\n" + "="*60)
    print("  PROLOGY CMD-300 Configuration Tool")
    print("="*60)
    
    # Проверка подключения
    if not check_rfcomm():
        return
    
    # Подключение
    if not device.connect():
        return
    
    # Главное меню
    while True:
        print("\n" + "="*60)
        print("  ГЛАВНОЕ МЕНЮ")
        print("="*60)
        print("  1. Получить статус устройства")
        print("  2. Читать настройки эквалайзера")
        print("  3. Применить пресет")
        print("  4. Ручная настройка эквалайзера")
        print("  5. Экспорт конфигурации")
        print("  6. Импорт конфигурации")
        print("  7. Список пресетов")
        print("  0. Выход")
        print("="*60)
        
        choice = input("  Выберите действие: ").strip()
        
        if choice == "1":
            status = device.get_status()
            if status:
                print("\n📊 Статус устройства:")
                for key, value in status.items():
                    print(f"  {key}: {value}")
        
        elif choice == "2":
            print("\n🎛️ Чтение настроек эквалайзера...")
            bands = device.get_eq_settings()
            print("\n  Частота | Gain")
            print("  " + "-"*20)
            for i, band in enumerate(bands[:10]):  # Первые 10 для краткости
                print(f"  {FREQUENCIES_25BAND[i]:4d}Hz | {band:+4d} dB")
            print("  ... (ещё 15 полос)")
        
        elif choice == "3":
            device.list_presets()
            preset_num = input("  Номер пресета: ").strip()
            try:
                presets = ["Flat", "Rock", "Pop", "Jazz", "Classic", "Electronic", "Vocal", "Bass Boost"]
                preset_name = presets[int(preset_num) - 1]
                device.apply_preset(preset_name)
            except:
                print("  ❌ Неверный номер")
        
        elif choice == "4":
            print("\n  Ручная настройка (пример):")
            print("  Введите значения через пробел (-12 до +12)")
            try:
                gains = list(map(int, input("  25 значений: ").split()))
                if len(gains) == 25:
                    device.set_all_eq(gains)
                else:
                    print(f"  ❌ Нужно 25 значений, введено {len(gains)}")
            except:
                print("  ❌ Ошибка ввода")
        
        elif choice == "5":
            filename = input("  Имя файла (Enter для авто): ").strip()
            device.export_config(filename if filename else None)
        
        elif choice == "6":
            filename = input("  Имя файла: ").strip()
            device.import_config(filename)
        
        elif choice == "7":
            device.list_presets()
        
        elif choice == "0":
            device.disconnect()
            print("\n  Выход...")
            break
        
        else:
            print("  ❌ Неверная команда")


def main():
    """Основная функция"""
    if len(sys.argv) > 1:
        # Режим командной строки
        command = sys.argv[1]
        device = PrologyCMD300()
        
        if command == "connect":
            if not check_rfcomm():
                sys.exit(1)
            device.connect()
            device.disconnect()
        
        elif command == "export":
            if not check_rfcomm():
                sys.exit(1)
            if device.connect():
                filename = sys.argv[2] if len(sys.argv) > 2 else None
                device.export_config(filename)
                device.disconnect()
            else:
                sys.exit(1)
        
        elif command == "import":
            if len(sys.argv) < 3:
                print("Использование: python3 prology_cmd300_export.py import <файл>")
                sys.exit(1)
            if not check_rfcomm():
                sys.exit(1)
            if device.connect():
                device.import_config(sys.argv[2])
                device.disconnect()
            else:
                sys.exit(1)
        
        elif command == "preset":
            if len(sys.argv) < 3:
                print("Использование: python3 prology_cmd300_export.py preset <название>")
                sys.exit(1)
            if not check_rfcomm():
                sys.exit(1)
            if device.connect():
                device.apply_preset(sys.argv[2])
                device.disconnect()
            else:
                sys.exit(1)
        
        elif command == "test":
            # Тестовый режим для отладки
            print("🔬 ТЕСТОВЫЙ РЕЖИМ")
            print("="*60)
            print("\n📋 ПРОТОКОЛ: ASCII команды с терминатором \\r\\n")
            print("📊 Формат: EQ BAND {index} {sign}{gain}\\r\\n")
            print("="*60)
            
            if not check_rfcomm():
                sys.exit(1)
            if device.connect():
                print("\n📊 Тестирование команд...")
                
                # Тест различных форматов команд
                test_commands = [
                    ("EQ BAND 0 +6", "31Hz +6dB"),
                    ("EQ BAND 5 -3", "1kHz -3dB"),
                    ("EQ BAND 9 +0", "16kHz 0dB"),
                ]
                
                for cmd, desc in test_commands:
                    print(f"\n  Команда: {cmd} ({desc})")
                    device._send_command(cmd, expect_response=False)
                    time.sleep(0.1)
                
                print("\n✅ Тест завершен!")
                print("   Если устройство подключено, команды отправлены.")
                
                device.disconnect()
            else:
                print("\n⚠️ Не удалось подключиться")
                print("   Проверьте что:")
                print("   1. Устройство сопряжено: bluetoothctl pair 10:48:5E:71:20:90")
                print("   2. RFCOMM порт создан: sudo rfcomm bind /dev/rfcomm0 10:48:5E:71:20:90 1")
                print("   3. Устройство не подключено к телефону")
                sys.exit(1)
        
        else:
            print("Неизвестная команда")
            print("Команды: connect, export, import, preset, test, interactive")
    else:
        # Интерактивный режим
        interactive_mode()


if __name__ == "__main__":
    main()
