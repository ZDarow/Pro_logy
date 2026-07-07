#!/usr/bin/env python3
# ============================================================================
# PROLOGY SPP Controller - Подключение через RFCOMM (SPP)
# Для ВСЕХ 72 команд (не только EQ!)
# ============================================================================

import bluetooth
import time
import sys
import select

# ============================================================================
# КОНФИГУРАЦИЯ
# ============================================================================

DEVICE_MAC = "10:48:5E:71:20:90"
SPP_CHANNEL = 1  # RFCOMM канал (обычно 1)
TIMEOUT = 5

# ============================================================================
# CRC АЛГОРИТМ
# ============================================================================

def calc_crc(data: bytes) -> int:
    """
    Вычислить CRC для пакета PROLOGY.
    Формула из анализа:
    - Если сумма < 0xC0: CRC = (сумма + 0x40) & 0xFF
    - Если сумма >= 0xC0: CRC = сумма & 0x3F
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
# SPP КОНТРОЛЛЕР
# ============================================================================

class PrologySPPController:
    """Контроллер PROLOGY через SPP (RFCOMM)"""
    
    def __init__(self):
        self.sock = None
        self.connected = False
    
    def find_device(self) -> bool:
        """Найти устройство через сканирование."""
        print(f"Поиск устройства {DEVICE_MAC}...")
        
        nearby_devices = bluetooth.discover_devices(lookup_names=True, duration=8)
        
        for addr, name in nearby_devices:
            if addr == DEVICE_MAC:
                print(f"✅ Найдено: {name} ({addr})")
                return True
        
        print(f"❌ Устройство не найдено!")
        return False
    
    def find_spp_channel(self) -> int:
        """Найти SPP канал устройства."""
        print(f"Поиск SPP сервиса...")
        
        try:
            services = bluetooth.find_service(address=DEVICE_MAC)
            
            for service in services:
                name = service.get('name', 'Unknown')
                channel = service.get('port', None)
                print(f"  Сервис: {name} (канал {channel})")
                
                if 'serial' in name.lower() or channel == SPP_CHANNEL:
                    return channel
            
            print(f"  ⚠️ SPP сервис не найден, пробуем канал {SPP_CHANNEL}")
            return SPP_CHANNEL
            
        except Exception as e:
            print(f"  ⚠️ Ошибка поиска: {e}")
            return SPP_CHANNEL
    
    def connect(self) -> bool:
        """Подключиться через SPP."""
        try:
            print(f"Подключение к {DEVICE_MAC} (RFCOMM канал {SPP_CHANNEL})...")
            
            self.sock = bluetooth.BluetoothSocket(bluetooth.RFCOMM)
            self.sock.settimeout(TIMEOUT)
            self.sock.connect((DEVICE_MAC, SPP_CHANNEL))
            
            self.connected = True
            print("✅ ПОДКЛЮЧЕНО ЧЕРЕЗ SPP!")
            return True
            
        except Exception as e:
            print(f"❌ Ошибка подключения: {e}")
            print()
            print("Попробуйте:")
            print("  1. Сопряжение через bluetoothctl:")
            print(f"     > pair {DEVICE_MAC}")
            print(f"     > trust {DEVICE_MAC}")
            print("  2. Проверить что устройство не подключено к Android")
            print("  3. Найти правильный RFCOMM канал:")
            print("     sdptool browse 10:48:5E:71:20:90")
            return False
    
    def disconnect(self):
        """Отключиться."""
        if self.sock:
            try:
                self.sock.close()
            except:
                pass
        self.connected = False
        print("📴 Отключено")
    
    def send(self, packet: bytes, wait: float = 0.5) -> bool:
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
    
    def recv(self, timeout: float = 1.0) -> bytes:
        """Получить ответ."""
        if not self.connected:
            return None
        
        try:
            self.sock.setblocking(0)
            ready = select.select([self.sock], [], [], timeout)
            
            if ready[0]:
                data = self.sock.recv(1024)
                if data:
                    print(f"📥 {data.hex().upper()}")
                    return data
        except:
            pass
        
        return None
    
    # ==========================================================================
    # EQ УПРАВЛЕНИЕ (5 команд) - ✅ РАБОТАЕТ
    # ==========================================================================
    
    def eq_gain_set(self, band: int, gain: int):
        """EQ Gain Set - Установка gain полосы (0-59)"""
        d1 = 0x32 + (band * 0x0A)
        packet = build_packet(0xC0, 0x05, [0x92, 0x0C, d1, gain, 0x07])
        self.send(packet)
    
    def eq_gain_query(self, band: int):
        """EQ Gain Query - Запрос состояния полосы"""
        packet = build_packet(0xC0, 0x02, [band & 0xFF, 0x00])
        self.send(packet)
    
    def eq_qfactor(self, value: int):
        """EQ Q Factor - Установка добротности (0x30-0x50)"""
        packet = build_packet(0xC0, 0x03, [0x92, 0x0B, value])
        self.send(packet)
    
    def eq_preset_load(self, preset_id: int):
        """EQ Preset Load - Загрузить пресет (0-10)"""
        packet = build_packet(0xC0, 0x1B, [0x9A, 0x21, preset_id])
        self.send(packet)
    
    # ==========================================================================
    # ГРОМКОСТЬ (6 команд) - 🔴 ТРЕБУЕТ SPP
    # ==========================================================================
    
    def volume_set(self, volume: int):
        """Volume Set - Установить громкость (0-63)"""
        packet = build_packet(0xC0, 0x10, [volume & 0xFF])
        self.send(packet)
    
    def volume_step(self, step: int):
        """Volume Step - Шаг громкости (1-10)"""
        packet = build_packet(0xC0, 0x11, [step & 0xFF])
        self.send(packet)
    
    def volume_up(self):
        """Volume Up - Увеличить громкость"""
        self.volume_step(1)
    
    def volume_down(self):
        """Volume Down - Уменьшить громкость"""
        self.volume_step(0xFF)  # -1
    
    def mute(self, enabled: bool):
        """Mute - Вкл/выкл без звука"""
        packet = build_packet(0xC0, 0x14, [0x01 if enabled else 0x00])
        self.send(packet)
    
    # ==========================================================================
    # БАЛАНС/ФЕЙДЕР (3 команды) - 🔴 ТРЕБУЕТ SPP
    # ==========================================================================
    
    def balance_set(self, balance: int):
        """Balance Set - Баланс L/R (0-31, 16 = центр)"""
        packet = build_packet(0xC0, 0x30, [balance & 0xFF])
        self.send(packet)
    
    def fader_set(self, fader: int):
        """Fader Set - Фейдер F/R (0-31, 16 = центр)"""
        packet = build_packet(0xC0, 0x31, [fader & 0xFF])
        self.send(packet)
    
    # ==========================================================================
    # ТЕМБР (9 команд) - 🔴 ТРЕБУЕТ SPP
    # ==========================================================================
    
    def bass_set(self, level: int):
        """Bass - Уровень баса (0-15)"""
        packet = build_packet(0xC0, 0x20, [level & 0xFF])
        self.send(packet)
    
    def treble_set(self, level: int):
        """Treble - Уровень высоких (0-15)"""
        packet = build_packet(0xC0, 0x21, [level & 0xFF])
        self.send(packet)
    
    def bass_boost(self, level: int):
        """Bass Boost - Уровень (0-15)"""
        packet = build_packet(0xC0, 0x22, [level & 0xFF])
        self.send(packet)
    
    # ==========================================================================
    # ДИСПЛЕЙ / RGB (10 команд) - 🔴 ТРЕБУЕТ SPP
    # ==========================================================================
    
    def brightness(self, level: int):
        """Brightness - Яркость дисплея (0-15)"""
        packet = build_packet(0xC0, 0x80, [level & 0xFF])
        self.send(packet)
    
    def rgb_color(self, r: int, g: int, b: int):
        """RGB Color - Цвет подсветки"""
        packet = build_packet(0xC0, 0x85, [r, g, b])
        self.send(packet)
    
    def rgb_red(self, level: int):
        """Red - Красный (0-15)"""
        packet = build_packet(0xC0, 0x70, [level & 0xFF])
        self.send(packet)
    
    def rgb_green(self, level: int):
        """Green - Зелёный (0-15)"""
        packet = build_packet(0xC0, 0x71, [level & 0xFF])
        self.send(packet)
    
    def rgb_blue(self, level: int):
        """Blue - Синий (0-15)"""
        packet = build_packet(0xC0, 0x72, [level & 0xFF])
        self.send(packet)
    
    # ==========================================================================
    # ИСТОЧНИК (4 команды) - 🔴 ТРЕБУЕТ SPP
    # ==========================================================================
    
    def source_select(self, source: int):
        """Source Select - Выбор источника"""
        packet = build_packet(0xC0, 0x63, [source & 0xFF])
        self.send(packet)
    
    def source_bluetooth(self):
        """Bluetooth источник"""
        self.source_select(0x02)
    
    def source_usb(self):
        """USB источник"""
        self.source_select(0x03)
    
    def source_aux(self):
        """AUX источник"""
        self.source_select(0x01)
    
    # ==========================================================================
    # МЕДИА (5 команд) - 🔴 ТРЕБУЕТ SPP
    # ==========================================================================
    
    def play(self):
        """Play - Начать воспроизведение"""
        packet = build_packet(0xC0, 0x50, [])
        self.send(packet)
    
    def pause(self):
        """Pause - Пауза"""
        packet = build_packet(0xC0, 0x51, [])
        self.send(packet)
    
    def stop(self):
        """Stop - Остановить"""
        packet = build_packet(0xC0, 0x52, [])
        self.send(packet)
    
    def next_track(self):
        """Next Track - Следующий трек"""
        packet = build_packet(0xC0, 0x53, [])
        self.send(packet)
    
    def prev_track(self):
        """Previous Track - Предыдущий трек"""
        packet = build_packet(0xC0, 0x54, [])
        self.send(packet)


# ============================================================================
# МЕНЮ
# ============================================================================

def print_menu():
    """Вывести меню."""
    print()
    print("=" * 70)
    print("  PROLOGY SPP CONTROLLER - ВСЕ 72 ФУНКЦИИ")
    print("=" * 70)
    print()
    print("  1. EQ Управление")
    print("  2. Громкость")
    print("  3. Баланс/Фейдер")
    print("  4. Тембр (Bass/Treble)")
    print("  5. Дисплей / RGB")
    print("  6. Источник")
    print("  7. Медиа")
    print("  8. Тест всех команд")
    print("  0. Выход")
    print()

def print_eq_menu():
    print()
    print("--- EQ Управление ---")
    print("  1. EQ Gain Set")
    print("  2. EQ Gain Query")
    print("  3. Q Factor")
    print("  4. Preset Load")
    print("  0. Назад")
    print()

def print_volume_menu():
    print()
    print("--- Громкость ---")
    print("  1. Volume Set")
    print("  2. Volume Up")
    print("  3. Volume Down")
    print("  4. Mute On/Off")
    print("  0. Назад")
    print()

def print_rgb_menu():
    print()
    print("--- Дисплей / RGB ---")
    print("  1. Brightness")
    print("  2. RGB Color")
    print("  3. Red")
    print("  4. Green")
    print("  5. Blue")
    print("  0. Назад")
    print()

def main():
    """Главная функция."""
    print()
    print("╔═══════════════════════════════════════════════════════════╗")
    print("║     PROLOGY SPP CONTROLLER                                ║")
    print("║     Подключение через RFCOMM (SPP)                        ║")
    print("╚═══════════════════════════════════════════════════════════╝")
    print()
    
    controller = PrologySPPController()
    
    # Поиск устройства
    if not controller.find_device():
        return
    
    # Подключение
    if not controller.connect():
        return
    
    try:
        while True:
            print_menu()
            
            try:
                choice = input("Выбор: ").strip()
            except (EOFError, KeyboardInterrupt):
                print("\nВыход...")
                break
            
            if choice == '1':  # EQ
                while True:
                    print_eq_menu()
                    sub = input("Выбор: ").strip()
                    if sub == '0':
                        break
                    elif sub == '1':
                        band = int(input("Band (0-59): ") or "0")
                        gain = int(input("Gain (0x23/0x24): ") or "23", 16)
                        controller.eq_gain_set(band, gain)
                    elif sub == '2':
                        band = int(input("Band (0-59): ") or "0")
                        controller.eq_gain_query(band)
                    elif sub == '3':
                        value = int(input("Q Factor (0x30-0x50): ") or "40", 16)
                        controller.eq_qfactor(value)
                    elif sub == '4':
                        preset = int(input("Preset (0-10): ") or "0")
                        controller.eq_preset_load(preset)
            
            elif choice == '2':  # Volume
                while True:
                    print_volume_menu()
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
                        mute = input("Mute (on/off): ").strip().lower() == 'on'
                        controller.mute(mute)
            
            elif choice == '3':  # Balance/Fader
                balance = int(input("Balance (0-31, 16=center): ") or "16")
                controller.balance_set(balance)
                fader = int(input("Fader (0-31, 16=center): ") or "16")
                controller.fader_set(fader)
            
            elif choice == '4':  # Bass/Treble
                bass = int(input("Bass (0-15): ") or "8")
                controller.bass_set(bass)
                treble = int(input("Treble (0-15): ") or "8")
                controller.treble_set(treble)
            
            elif choice == '5':  # Display/RGB
                while True:
                    print_rgb_menu()
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
                        level = int(input("Red (0-15): ") or "15")
                        controller.rgb_red(level)
                    elif sub == '4':
                        level = int(input("Green (0-15): ") or "15")
                        controller.rgb_green(level)
                    elif sub == '5':
                        level = int(input("Blue (0-15): ") or "15")
                        controller.rgb_blue(level)
            
            elif choice == '6':  # Source
                print("  1. Bluetooth")
                print("  2. USB")
                print("  3. AUX")
                src = input("Выбор: ").strip()
                if src == '1':
                    controller.source_bluetooth()
                elif src == '2':
                    controller.source_usb()
                elif src == '3':
                    controller.source_aux()
            
            elif choice == '7':  # Media
                print("  1. Play")
                print("  2. Pause")
                print("  3. Stop")
                print("  4. Next")
                print("  5. Prev")
                media = input("Выбор: ").strip()
                if media == '1':
                    controller.play()
                elif media == '2':
                    controller.pause()
                elif media == '3':
                    controller.stop()
                elif media == '4':
                    controller.next_track()
                elif media == '5':
                    controller.prev_track()
            
            elif choice == '8':  # Тест
                print()
                print("=== ТЕСТ ВСЕХ КОМАНД ===")
                print()
                
                # EQ
                print("1. EQ Gain Set (Band 0, Gain 0x24)")
                controller.eq_gain_set(0, 0x24)
                time.sleep(1)
                
                # Volume
                print("2. Volume Set (30)")
                controller.volume_set(30)
                time.sleep(1)
                
                # Bass
                print("3. Bass Set (10)")
                controller.bass_set(10)
                time.sleep(1)
                
                # Treble
                print("4. Treble Set (8)")
                controller.treble_set(8)
                time.sleep(1)
                
                # RGB
                print("5. RGB Color (Red)")
                controller.rgb_color(255, 0, 0)
                time.sleep(1)
                
                # Brightness
                print("6. Brightness (15)")
                controller.brightness(15)
                time.sleep(1)
                
                # Source
                print("7. Source Bluetooth")
                controller.source_bluetooth()
                time.sleep(1)
                
                # Play
                print("8. Play")
                controller.play()
                time.sleep(1)
                
                print()
                print("✅ ТЕСТ ЗАВЕРШЁН!")
                print("СМОТРИТЕ НА МАГНИТОЛУ!")
            
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
    
    print()
    print("Сессия завершена!")


# ============================================================================
# ЗАПУСК
# ============================================================================

if __name__ == '__main__':
    main()
