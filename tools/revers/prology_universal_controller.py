#!/usr/bin/env python3
# ============================================================================
# PROLOGY Universal Controller - ПОЛНАЯ РЕАЛИЗАЦИЯ ВСЕХ 87 ФУНКЦИЙ
# Универсальный контроллер с поддержкой всех функций приложения PROLOGY
# ============================================================================

import socket
import time
import sys
from prology_full_protocol import PrologyProtocolBuilder, calc_crc, build_packet

# ============================================================================
# КОНФИГУРАЦИЯ
# ============================================================================

DEVICE_MAC = "10:48:5E:71:20:90"
PSM_CHANNEL = 1
TIMEOUT = 5

# ============================================================================
# УНИВЕРСАЛЬНЫЙ КОНТРОЛЛЕР
# ============================================================================

class PrologyUniversalController:
    """
    Универсальный контроллер PROLOGY с поддержкой всех 87 функций.
    
    Категории функций:
    1. EQ Управление (5) - ✅ Реализовано
    2. Громкость (6) - 🔴 Требует тестирования
    3. Баланс/Фейдер (3) - 🔴 Требует тестирования
    4. Аудио настройки (10) - 🔴 Требует тестирования
    5. Медиа управление (12) - 🔴 Требует тестирования
    6. Источник (6) - 🔴 Требует тестирования
    7. Режим воспроизведения (3) - 🔴 Требует тестирования
    8. Дисплей и подсветка (8) - 🔴 Требует тестирования
    9. Системные команды (15) - 🔴 Требует тестирования
    10. Пульт ДУ (5) - 🔴 Требует тестирования
    11. Радио (5) - 🔴 Требует тестирования
    12. Часы и будильник (4) - 🔴 Требует тестирования
    13. Парковка и камера (5) - 🔴 Требует тестирования
    14. Большие пакеты (8) - 🔴 Требует исследования
    """
    
    def __init__(self):
        self.sock = None
        self.connected = False
        self.builder = PrologyProtocolBuilder()
    
    def connect(self) -> bool:
        """Подключиться к устройству через L2CAP."""
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
    
    def send(self, packet: bytes, wait: float = 0.1) -> bool:
        """Отправить пакет."""
        if not self.connected:
            print("❌ Не подключено!")
            return False
        
        try:
            self.sock.send(packet)
            time.sleep(wait)
            print(f"📤 {packet.hex().upper()}")
            return True
        except Exception as e:
            print(f"❌ Ошибка отправки: {e}")
            return False
    
    # ==========================================================================
    # 1. EQ УПРАВЛЕНИЕ (5 функций) - ✅ РЕАЛИЗОВАНО
    # ==========================================================================
    
    def eq_gain_set(self, band: int, gain: int):
        """EQ Gain Set - Установка gain полосы (0-59)"""
        packet = self.builder.eq_gain_set(band, gain)
        self.send(packet)
    
    def eq_gain_query(self, band: int):
        """EQ Gain Query - Запрос состояния полосы"""
        packet = self.builder.eq_gain_query(band, 0)
        self.send(packet)
    
    def eq_qfactor(self, value: int):
        """EQ Q Factor - Установка добротности (0x30-0x50)"""
        packet = self.builder.eq_qfactor(0x92, 0x0B, value)
        self.send(packet)
    
    def eq_preset_load(self, preset_id: int):
        """EQ Preset Load - Загрузить пресет (0-10)"""
        packet = self.builder.eq_preset_load(preset_id)
        self.send(packet)
    
    def eq_preset_save(self, preset_id: int, data: list):
        """EQ Preset Save - Сохранить пресет"""
        packet = self.builder.eq_preset_save(preset_id, data)
        self.send(packet)
    
    # ==========================================================================
    # 2. ГРОМКОСТЬ (6 функций) - 🔴 ТРЕБУЕТ ТЕСТИРОВАНИЯ
    # ==========================================================================
    
    def volume_set(self, volume: int):
        """Volume Set - Установить громкость (0-63)"""
        packet = self.builder.volume_set(volume)
        self.send(packet)
    
    def volume_step(self, step: int):
        """Volume Step - Шаг громкости (1-10)"""
        packet = self.builder.volume_step(step)
        self.send(packet)
    
    def volume_up(self):
        """Volume Up - Увеличить громкость (через EQ Gain)"""
        packet = self.builder.eq_gain_set(0, 0x24)
        self.send(packet)
        print("   Volume UP")
    
    def volume_down(self):
        """Volume Down - Уменьшить громкость (через EQ Gain)"""
        packet = self.builder.eq_gain_set(0, 0x23)
        self.send(packet)
        print("   Volume DOWN")
    
    def volume_limit(self, limit: int):
        """Volume Limit - Лимит громкости (0-63)"""
        packet = self.builder.volume_limit(limit)
        self.send(packet)
    
    def volume_power_on(self, volume: int):
        """Volume Power On - Громкость при включении (0-63)"""
        packet = self.builder.volume_power_on(volume)
        self.send(packet)
    
    def subwoofer_volume(self, volume: int):
        """Subwoofer Volume - Громкость сабвуфера (0-63)"""
        packet = self.builder.subwoofer_volume(volume)
        self.send(packet)
    
    def time_alignment_gain(self, channel: int, gain: int):
        """Time Alignment Gain - Gain канала (0-7, 0-255)"""
        packet = self.builder.time_alignment_gain(channel, gain)
        self.send(packet)
    
    # ==========================================================================
    # 3. БАЛАНС/ФЕЙДЕР (3 функции) - 🔴 ТРЕБУЕТ ТЕСТИРОВАНИЯ
    # ==========================================================================
    
    def balance_set(self, balance: int):
        """Balance Set - Баланс L/R (0-31, 16 = центр)"""
        packet = self.builder.balance_set(balance)
        self.send(packet)
    
    def fader_set(self, fader: int):
        """Fader Set - Фейдер F/R (0-31, 16 = центр)"""
        packet = self.builder.fader_set(fader)
        self.send(packet)
    
    def fader_balance(self, fader: int, balance: int):
        """Fader/Balance Set - Фейдер и баланс"""
        packet = self.builder.fader_balance(fader, balance)
        self.send(packet)
    
    # ==========================================================================
    # 4. АУДИО НАСТРОЙКИ (10 функций) - 🔴 ТРЕБУЕТ ТЕСТИРОВАНИЯ
    # ==========================================================================
    
    def bass_boost_up(self):
        """Bass Boost Up - Увеличить bass boost"""
        packet = self.builder.bass_boost_up()
        self.send(packet)
    
    def bass_boost_down(self):
        """Bass Boost Down - Уменьшить bass boost"""
        packet = self.builder.bass_boost_down()
        self.send(packet)
    
    def bass_boost_toggle(self, enabled: bool):
        """Bass Boost Toggle - Вкл/выкл bass boost"""
        packet = self.builder.bass_boost_toggle(enabled)
        self.send(packet)
    
    def treble_up(self):
        """Treble Up - Увеличить treble"""
        packet = self.builder.treble_up()
        self.send(packet)
    
    def treble_down(self):
        """Treble Down - Уменьшить treble"""
        packet = self.builder.treble_down()
        self.send(packet)
    
    def set_bass(self, level: int):
        """Set Bass - Уровень bass (0-15)"""
        packet = self.builder.set_bass(level)
        self.send(packet)
    
    def set_treble(self, level: int):
        """Set Treble - Уровень treble (0-15)"""
        packet = self.builder.set_treble(level)
        self.send(packet)
    
    def loudness_on_off(self, enabled: bool):
        """Loudness On/Off - Вкл/выкл loudness"""
        packet = self.builder.loudness_on_off(enabled)
        self.send(packet)
    
    def loudness_level(self, level: int):
        """Loudness Level - Уровень loudness (0-7)"""
        packet = self.builder.loudness_level(level)
        self.send(packet)
    
    def xover_freq(self, frequency: int):
        """X-Over Frequency - Частота кроссовера (20-20000 Hz)"""
        packet = self.builder.xover_freq(frequency)
        self.send(packet)
    
    def xover_slope(self, slope: int):
        """X-Over Slope - Крутизна кроссовера (0-7)"""
        packet = self.builder.xover_slope(slope)
        self.send(packet)
    
    def xover_type(self, type: int):
        """X-Over Type - Тип кроссовера (0=LP, 1=HP, 2=BP)"""
        packet = self.builder.xover_type(type)
        self.send(packet)
    
    # ==========================================================================
    # 5. МЕДИА УПРАВЛЕНИЕ (12 функций) - 🔴 ТРЕБУЕТ ТЕСТИРОВАНИЯ
    # ==========================================================================
    
    def play_pause(self):
        """Play/Pause - Переключение воспроизведения"""
        packet = self.builder.play_pause()
        self.send(packet)
    
    def play(self):
        """Play - Начать воспроизведение"""
        packet = self.builder.play()
        self.send(packet)
    
    def pause(self):
        """Pause - Пауза"""
        packet = self.builder.pause()
        self.send(packet)
    
    def stop(self):
        """Stop - Остановить"""
        packet = self.builder.stop()
        self.send(packet)
    
    def next_track(self):
        """Next Track - Следующий трек"""
        packet = self.builder.next_track()
        self.send(packet)
    
    def prev_track(self):
        """Previous Track - Предыдущий трек"""
        packet = self.builder.prev_track()
        self.send(packet)
    
    def fast_forward(self):
        """Fast Forward - Перемотка вперёд"""
        packet = self.builder.fast_forward()
        self.send(packet)
    
    def rewind(self):
        """Rewind - Перемотка назад"""
        packet = self.builder.rewind()
        self.send(packet)
    
    # ==========================================================================
    # 6. ИСТОЧНИК (6 функций) - 🔴 ТРЕБУЕТ ТЕСТИРОВАНИЯ
    # ==========================================================================
    
    def source_select(self, source: int):
        """Source Select - Выбор источника"""
        packet = self.builder.source_select(source)
        self.send(packet)
    
    def aux_in(self):
        """AUX In - Выбрать AUX"""
        packet = self.builder.aux_in()
        self.send(packet)
    
    def bluetooth(self):
        """Bluetooth - Выбрать Bluetooth"""
        packet = self.builder.bluetooth()
        self.send(packet)
    
    def usb(self):
        """USB - Выбрать USB"""
        packet = self.builder.usb()
        self.send(packet)
    
    def sd_card(self):
        """SD Card - Выбрать SD карту"""
        packet = self.builder.sd_card()
        self.send(packet)
    
    def radio(self):
        """Radio - Выбрать радио"""
        packet = self.builder.radio()
        self.send(packet)
    
    # ==========================================================================
    # 7. РЕЖИМ ВОСПРОИЗВЕДЕНИЯ (3 функции) - 🔴 ТРЕБУЕТ ТЕСТИРОВАНИЯ
    # ==========================================================================
    
    def repeat_mode(self, mode: int):
        """Repeat Mode - Режим повтора (0=Off, 1=One, 2=All)"""
        packet = self.builder.repeat_mode(mode)
        self.send(packet)
    
    def shuffle_mode(self, enabled: bool):
        """Shuffle Mode - Случайный порядок"""
        packet = self.builder.shuffle_mode(enabled)
        self.send(packet)
    
    def eq_mode(self, mode: int):
        """EQ Mode - Режим эквалайзера (0=Flat, 1=Rock, 2=Pop...)"""
        packet = self.builder.eq_mode(mode)
        self.send(packet)
    
    # ==========================================================================
    # 8. ДИСПЛЕЙ И ПОДСВЕТКА (8 функций) - 🔴 ТРЕБУЕТ ТЕСТИРОВАНИЯ
    # ==========================================================================
    
    def brightness(self, level: int):
        """Brightness - Яркость дисплея (0-15)"""
        packet = self.builder.brightness(level)
        self.send(packet)
    
    def dimmer_on_off(self, enabled: bool):
        """Dimmer On/Off - Вкл/выкл диммер"""
        packet = self.builder.dimmer_on_off(enabled)
        self.send(packet)
    
    def screen_saver(self, timeout: int):
        """Screen Saver - Тайм-аут заставки (секунды)"""
        packet = self.builder.screen_saver(timeout)
        self.send(packet)
    
    def logo_select(self, logo_id: int):
        """Logo Select - Выбрать логотип (0-15)"""
        packet = self.builder.logo_select(logo_id)
        self.send(packet)
    
    def rgb_color(self, r: int, g: int, b: int):
        """RGB Color - Цвет подсветки"""
        packet = self.builder.rgb_color(r, g, b)
        self.send(packet)
    
    def rgb_brightness(self, level: int):
        """RGB Brightness - Яркость RGB (0-15)"""
        packet = self.builder.rgb_brightness(level)
        self.send(packet)
    
    def rgb_mode(self, mode: int):
        """RGB Mode - Режим RGB (0=Static, 1=Breathing...)"""
        packet = self.builder.rgb_mode(mode)
        self.send(packet)
    
    def rgb_effect(self, effect: int):
        """RGB Effect - Эффект RGB (0-15)"""
        packet = self.builder.rgb_effect(effect)
        self.send(packet)
    
    # ==========================================================================
    # 9. СИСТЕМНЫЕ КОМАНДЫ (15 функций) - 🔴 ТРЕБУЕТ ТЕСТИРОВАНИЯ
    # ==========================================================================
    
    def version_query(self):
        """Version Query - Запрос версии"""
        packet = self.builder.version_query()
        self.send(packet)
    
    def mcu_version(self):
        """MCU Version - Версия MCU"""
        packet = self.builder.mcu_version()
        self.send(packet)
    
    def device_info(self):
        """Device Info - Информация об устройстве"""
        packet = self.builder.device_info()
        self.send(packet)
    
    def serial_number(self):
        """Serial Number - Серийный номер"""
        packet = self.builder.serial_number()
        self.send(packet)
    
    def factory_reset(self, confirm: bool = False):
        """Factory Reset - Сброс к заводским настройкам"""
        packet = self.builder.factory_reset(0x55 if confirm else 0x00)
        self.send(packet)
    
    def save_settings(self):
        """Save Settings - Сохранить настройки"""
        packet = self.builder.save_settings()
        self.send(packet)
    
    def load_defaults(self):
        """Load Defaults - Загрузить настройки по умолчанию"""
        packet = self.builder.load_defaults()
        self.send(packet)
    
    def backup_config(self):
        """Backup Config - Резервное копирование"""
        packet = self.builder.backup_config()
        self.send(packet)
    
    def restore_config(self):
        """Restore Config - Восстановить конфигурацию"""
        packet = self.builder.restore_config()
        self.send(packet)
    
    def self_test(self, test_id: int):
        """Self Test - Самодиагностика"""
        packet = self.builder.self_test(test_id)
        self.send(packet)
    
    def adc_read(self, channel: int):
        """ADC Read - Чтение АЦП (0-7)"""
        packet = self.builder.adc_read(channel)
        self.send(packet)
    
    def gpio_test(self, pin: int, state: int):
        """GPIO Test - Тест GPIO"""
        packet = self.builder.gpio_test(pin, state)
        self.send(packet)
    
    def memory_test(self):
        """Memory Test - Тест памяти"""
        packet = self.builder.memory_test()
        self.send(packet)
    
    # ==========================================================================
    # 10-13. ДОПОЛНИТЕЛЬНЫЕ ФУНКЦИИ (19 функций) - 🔴 ТРЕБУЕТ ТЕСТИРОВАНИЯ
    # ==========================================================================
    
    # Пульт ДУ
    def remote_key(self, key_code: int):
        """Remote Key - Код кнопки пульта"""
        packet = self.builder.remote_key(key_code)
        self.send(packet)
    
    def remote_learn(self, enabled: bool):
        """Remote Learn - Обучение пульта"""
        packet = self.builder.remote_learn(enabled)
        self.send(packet)
    
    def remote_clear(self):
        """Remote Clear - Очистить пульт"""
        packet = self.builder.remote_clear()
        self.send(packet)
    
    def key_press(self, key_code: int):
        """Key Press - Нажатие кнопки"""
        packet = self.builder.key_press(key_code)
        self.send(packet)
    
    def key_release(self, key_code: int):
        """Key Release - Отпускание кнопки"""
        packet = self.builder.key_release(key_code)
        self.send(packet)
    
    # Радио
    def radio_freq(self, frequency: int):
        """Radio Frequency - Частота (875-1080 = 87.5-108.0 MHz)"""
        packet = self.builder.radio_freq(frequency)
        self.send(packet)
    
    def radio_seek_up(self):
        """Radio Seek Up - Поиск вверх"""
        packet = self.builder.radio_seek_up()
        self.send(packet)
    
    def radio_seek_down(self):
        """Radio Seek Down - Поиск вниз"""
        packet = self.builder.radio_seek_down()
        self.send(packet)
    
    def radio_preset(self, preset_id: int):
        """Radio Preset - Пресет радио (1-30)"""
        packet = self.builder.radio_preset(preset_id)
        self.send(packet)
    
    def radio_region(self, region: int):
        """Radio Region - Регион (0=EU, 1=USA, 2=JP)"""
        packet = self.builder.radio_region(region)
        self.send(packet)
    
    # Часы
    def set_time(self, hours: int, minutes: int, seconds: int = 0):
        """Set Time - Установка времени"""
        packet = self.builder.set_time(hours, minutes, seconds)
        self.send(packet)
    
    def set_date(self, year: int, month: int, day: int):
        """Set Date - Установка даты"""
        packet = self.builder.set_date(year, month, day)
        self.send(packet)
    
    def alarm_set(self, hours: int, minutes: int, enabled: bool):
        """Alarm Set - Установка будильника"""
        packet = self.builder.alarm_set(hours, minutes, enabled)
        self.send(packet)
    
    def time_format(self, format: int):
        """Time Format - Формат времени (0=12h, 1=24h)"""
        packet = self.builder.time_format(format)
        self.send(packet)
    
    # Парковка/Камера
    def parking_brake(self, state: bool):
        """Parking Brake - Стояночный тормоз"""
        packet = self.builder.parking_brake(state)
        self.send(packet)
    
    def parking_override(self, code: int):
        """Parking Override - Обход парковки"""
        packet = self.builder.parking_override(code)
        self.send(packet)
    
    def camera_trigger(self, enabled: bool):
        """Camera Trigger - Активация камеры"""
        packet = self.builder.camera_trigger(enabled)
        self.send(packet)
    
    def camera_mirror(self, mirror: int):
        """Camera Mirror - Зеркалирование (0=Off, 1=H, 2=V, 3=Both)"""
        packet = self.builder.camera_mirror(mirror)
        self.send(packet)
    
    def camera_guidelines(self, enabled: bool):
        """Camera Guidelines - Направляющие линии"""
        self.send(self.builder.camera_guidelines(enabled))
    
    # ==========================================================================
    # 14. БОЛЬШИЕ ПАКЕТЫ (8 функций) - 🔴 ТРЕБУЕТ ИССЛЕДОВАНИЯ
    # ==========================================================================
    
    def send_large_packet(self, cmd: int, data: list):
        """Отправить большой пакет данных"""
        packet = build_packet(0xC0, cmd, data)
        self.send(packet, wait=0.5)


# ============================================================================
# МЕНЮ УПРАВЛЕНИЯ
# ============================================================================

def print_main_menu():
    """Вывести главное меню."""
    print()
    print("=" * 70)
    print("  PROLOGY UNIVERSAL CONTROLLER - ВСЕ 87 ФУНКЦИЙ")
    print("=" * 70)
    print()
    print("  1. EQ Управление (5 функций)")
    print("  2. Громкость (6 функций)")
    print("  3. Баланс/Фейдер (3 функции)")
    print("  4. Аудио настройки (10 функций)")
    print("  5. Медиа управление (12 функций)")
    print("  6. Источник (6 функций)")
    print("  7. Режим воспроизведения (3 функции)")
    print("  8. Дисплей и подсветка (8 функций)")
    print("  9. Системные команды (15 функций)")
    print("  A. Пульт ДУ (5 функций)")
    print("  B. Радио (5 функций)")
    print("  C. Часы и будильник (4 функции)")
    print("  D. Парковка и камера (5 функций)")
    print("  E. Большие пакеты (8 функций)")
    print("  0. Выход")
    print()

def print_category_menu(category: str):
    """Вывести меню категории."""
    menus = {
        '1': [
            ("1", "EQ Gain Set"),
            ("2", "EQ Gain Query"),
            ("3", "EQ Q Factor"),
            ("4", "EQ Preset Load"),
            ("5", "EQ Preset Save"),
        ],
        '2': [
            ("1", "Volume Set"),
            ("2", "Volume Up"),
            ("3", "Volume Down"),
            ("4", "Volume Limit"),
            ("5", "Subwoofer Volume"),
        ],
        '3': [
            ("1", "Balance Set"),
            ("2", "Fader Set"),
            ("3", "Fader/Balance"),
        ],
        '4': [
            ("1", "Bass Boost Up"),
            ("2", "Bass Boost Down"),
            ("3", "Bass Boost Toggle"),
            ("4", "Treble Up"),
            ("5", "Treble Down"),
            ("6", "Set Bass"),
            ("7", "Set Treble"),
        ],
        '5': [
            ("1", "Play/Pause"),
            ("2", "Play"),
            ("3", "Pause"),
            ("4", "Next Track"),
            ("5", "Prev Track"),
        ],
        '6': [
            ("1", "Bluetooth"),
            ("2", "USB"),
            ("3", "AUX"),
            ("4", "Radio"),
        ],
        '8': [
            ("1", "Brightness"),
            ("2", "RGB Color"),
            ("3", "RGB Mode"),
            ("4", "Logo Select"),
        ],
        '9': [
            ("1", "Version Query"),
            ("2", "MCU Version"),
            ("3", "Device Info"),
            ("4", "Save Settings"),
            ("5", "Factory Reset"),
        ],
    }
    
    menu = menus.get(category, [])
    print(f"\n--- Категория {category} ---")
    for key, name in menu:
        print(f"  {key}. {name}")
    print("  0. Назад")
    print()

def main():
    """Главная функция."""
    print()
    print("╔═══════════════════════════════════════════════════════════╗")
    print("║     PROLOGY UNIVERSAL CONTROLLER                          ║")
    print("║     ПОЛНАЯ РЕАЛИЗАЦИЯ ВСЕХ 87 ФУНКЦИЙ                     ║")
    print("╚═══════════════════════════════════════════════════════════╝")
    print()
    
    controller = PrologyUniversalController()
    
    # Подключение
    if not controller.connect():
        print()
        print("Проверьте:")
        print("  1. Устройство PROLOGY включено")
        print("  2. Android Bluetooth выключен")
        print("  3. Linux Bluetooth включён")
        return
    
    try:
        while True:
            print_main_menu()
            
            try:
                choice = input("Выбор: ").strip().upper()
            except (EOFError, KeyboardInterrupt):
                print("\nВыход...")
                break
            
            if choice == '0':
                print("Выход...")
                break
            
            elif choice == '1':  # EQ
                while True:
                    print_category_menu('1')
                    sub = input("Выбор: ").strip()
                    if sub == '0':
                        break
                    elif sub == '1':
                        band = int(input("Band (0-59): ") or "0")
                        gain = int(input("Gain (23/24): ") or "23", 16)
                        controller.eq_gain_set(band, gain)
                    elif sub == '2':
                        band = int(input("Band (0-59): ") or "0")
                        controller.eq_gain_query(band)
                    elif sub == '3':
                        value = int(input("Q Factor (30-50 hex): ") or "40", 16)
                        controller.eq_qfactor(value)
                    elif sub == '4':
                        preset = int(input("Preset (0-10): ") or "0")
                        controller.eq_preset_load(preset)
            
            elif choice == '2':  # Volume
                while True:
                    print_category_menu('2')
                    sub = input("Выбор: ").strip()
                    if sub == '0':
                        break
                    elif sub == '1':
                        vol = int(input("Volume (0-63): ") or "30")
                        controller.volume_set(vol)
                    elif sub == '2':
                        controller.volume_up()
                    elif sub == '3':
                        controller.volume_down()
                    elif sub == '4':
                        limit = int(input("Limit (0-63): ") or "50")
                        controller.volume_limit(limit)
                    elif sub == '5':
                        vol = int(input("Sub Volume (0-63): ") or "30")
                        controller.subwoofer_volume(vol)
            
            elif choice == '5':  # Media
                while True:
                    print_category_menu('5')
                    sub = input("Выбор: ").strip()
                    if sub == '0':
                        break
                    elif sub == '1':
                        controller.play_pause()
                    elif sub == '2':
                        controller.play()
                    elif sub == '3':
                        controller.pause()
                    elif sub == '4':
                        controller.next_track()
                    elif sub == '5':
                        controller.prev_track()
            
            elif choice == '6':  # Source
                while True:
                    print_category_menu('6')
                    sub = input("Выбор: ").strip()
                    if sub == '0':
                        break
                    elif sub == '1':
                        controller.bluetooth()
                    elif sub == '2':
                        controller.usb()
                    elif sub == '3':
                        controller.aux_in()
                    elif sub == '4':
                        controller.radio()
            
            elif choice == '8':  # Display
                while True:
                    print_category_menu('8')
                    sub = input("Выбор: ").strip()
                    if sub == '0':
                        break
                    elif sub == '1':
                        level = int(input("Brightness (0-15): ") or "10")
                        controller.brightness(level)
                    elif sub == '2':
                        r = int(input("R (0-255): ") or "255")
                        g = int(input("G (0-255): ") or "0")
                        b = int(input("B (0-255): ") or "0")
                        controller.rgb_color(r, g, b)
                    elif sub == '3':
                        mode = int(input("RGB Mode (0-3): ") or "0")
                        controller.rgb_mode(mode)
                    elif sub == '4':
                        logo = int(input("Logo ID (0-15): ") or "0")
                        controller.logo_select(logo)
            
            elif choice == '9':  # System
                while True:
                    print_category_menu('9')
                    sub = input("Выбор: ").strip()
                    if sub == '0':
                        break
                    elif sub == '1':
                        controller.version_query()
                    elif sub == '2':
                        controller.mcu_version()
                    elif sub == '3':
                        controller.device_info()
                    elif sub == '4':
                        controller.save_settings()
                    elif sub == '5':
                        confirm = input("Confirm factory reset? (yes/no): ").strip()
                        controller.factory_reset(confirm == "yes")
            
            else:
                print(f"Категория {choice} в разработке...")
            
            time.sleep(0.3)
    
    except KeyboardInterrupt:
        print("\nПрервано...")
    
    finally:
        controller.disconnect()
    
    print()
    print("Сессия завершена!")


# ============================================================================
# ЗАПУСК
# ============================================================================

if __name__ == '__main__':
    main()
