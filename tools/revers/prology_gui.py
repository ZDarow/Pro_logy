#!/usr/bin/env python3
# ============================================================================
# PROLOGY GUI Controller
# Графический интерфейс управления магнитолой через Linux
# ============================================================================

import tkinter as tk
from tkinter import ttk, scrolledtext, messagebox
import socket
import threading
import time

# ============================================================================
# КОНФИГУРАЦИЯ
# ============================================================================

DEVICE_MAC = "10:48:5E:71:20:90"
PSM_CHANNEL = 1
TIMEOUT = 5

# ============================================================================
# CRC И ПОСТРОЕНИЕ ПАКЕТОВ
# ============================================================================

def calc_crc(data: bytes) -> int:
    s = sum(data) & 0xFF
    if s < 0xC0:
        return (s + 0x40) & 0xFF
    else:
        return s & 0x3F

def build_packet(header: int, cmd: int, data: list) -> bytes:
    packet = bytes([header, 0x00, cmd] + data)
    crc = calc_crc(packet)
    return packet + bytes([crc])

# ============================================================================
# КОМАНДЫ
# ============================================================================

CMD_EQ_QUERY = 0x02
CMD_QFACTOR = 0x03
CMD_EQ_GAIN_SET = 0x05
CMD_PRESET = 0x1B

# ============================================================================
# КОНТРОЛЛЕР
# ============================================================================

class PrologyGUIController:
    def __init__(self, log_callback=None):
        self.sock = None
        self.connected = False
        self.log_callback = log_callback
    
    def log(self, message):
        if self.log_callback:
            self.log_callback(message)
    
    def connect(self) -> bool:
        try:
            self.log(f"Подключение к {DEVICE_MAC}...")
            self.sock = socket.socket(
                socket.AF_BLUETOOTH,
                socket.SOCK_SEQPACKET,
                socket.BTPROTO_L2CAP
            )
            self.sock.settimeout(TIMEOUT)
            self.sock.connect((DEVICE_MAC, PSM_CHANNEL))
            self.connected = True
            self.log("✅ ПОДКЛЮЧЕНО!")
            return True
        except Exception as e:
            self.log(f"❌ Ошибка: {e}")
            return False
    
    def disconnect(self):
        if self.sock:
            try:
                self.sock.close()
            except:
                pass
        self.connected = False
        self.log("📴 Отключено")
    
    def send(self, packet: bytes):
        if not self.connected:
            self.log("❌ Не подключено!")
            return
        
        try:
            self.sock.send(packet)
            self.log(f"📤 {packet.hex().upper()}")
        except Exception as e:
            self.log(f"❌ Ошибка отправки: {e}")
    
    # Команды
    def volume_up(self):
        packet = build_packet(0xC0, CMD_EQ_GAIN_SET, [0x92, 0x0C, 0x32, 0x24, 0x07])
        self.send(packet)
    
    def volume_down(self):
        packet = build_packet(0xC0, CMD_EQ_GAIN_SET, [0x92, 0x0C, 0x32, 0x23, 0x07])
        self.send(packet)
    
    def eq_set(self, band: int, gain: int):
        d1 = 0x32 + (band * 0x0A)
        packet = build_packet(0xC0, CMD_EQ_GAIN_SET, [0x92, 0x0C, d1, gain, 0x07])
        self.send(packet)
    
    def bass_boost(self):
        self.log("📤 Bass Boost...")
        for band in range(10):
            self.eq_set(band, 0x24)
            time.sleep(0.05)
        self.log("✅ Bass Boost загружен!")
    
    def flat(self):
        self.log("📤 Flat EQ...")
        for band in range(60):
            self.eq_set(band, 0x23)
            time.sleep(0.02)
        self.log("✅ Flat загружен!")
    
    def preset_load(self, preset_id: int):
        packet = build_packet(0xC0, CMD_PRESET, [0x9A, 0x21, preset_id])
        self.send(packet)
        self.log(f"✅ Пресет {preset_id} загружен!")

# ============================================================================
# GUI ПРИЛОЖЕНИЕ
# ============================================================================

class PrologyGUI:
    def __init__(self, root):
        self.root = root
        self.root.title("PROLOGY Controller")
        self.root.geometry("800x600")
        self.root.resizable(True, True)
        
        self.controller = PrologyGUIController(self.log)
        
        self.create_widgets()
    
    def create_widgets(self):
        # Главный фрейм
        main_frame = ttk.Frame(self.root, padding="10")
        main_frame.grid(row=0, column=0, sticky=(W, E, N, S))
        
        # Заголовок
        title_label = ttk.Label(main_frame, text="🚗 PROLOGY Controller", font=('Helvetica', 16, 'bold'))
        title_label.grid(row=0, column=0, columnspan=3, pady=10)
        
        # Статус подключения
        self.status_label = ttk.Label(main_frame, text="❌ Не подключено", foreground="red")
        self.status_label.grid(row=1, column=0, columnspan=3, pady=5)
        
        # Кнопка подключения
        self.connect_btn = ttk.Button(main_frame, text="🔗 Подключиться", command=self.toggle_connection)
        self.connect_btn.grid(row=2, column=0, columnspan=3, pady=5)
        
        # Фрейм громкости
        vol_frame = ttk.LabelFrame(main_frame, text="📢 Громкость", padding="10")
        vol_frame.grid(row=3, column=0, columnspan=3, sticky=(W, E), pady=10)
        
        ttk.Button(vol_frame, text="🔼 Увеличить", command=self.volume_up).grid(row=0, column=0, padx=5)
        ttk.Button(vol_frame, text="🔽 Уменьшить", command=self.volume_down).grid(row=0, column=1, padx=5)
        
        # Фрейм пресетов
        preset_frame = ttk.LabelFrame(main_frame, text="🎵 Пресеты EQ", padding="10")
        preset_frame.grid(row=4, column=0, columnspan=3, sticky=(W, E), pady=10)
        
        ttk.Button(preset_frame, text="Bass Boost", command=self.bass_boost).grid(row=0, column=0, padx=5, pady=5)
        ttk.Button(preset_frame, text="Flat", command=self.flat).grid(row=0, column=1, padx=5, pady=5)
        ttk.Button(preset_frame, text="V-Shape", command=self.vshape).grid(row=0, column=2, padx=5, pady=5)
        
        # Фрейм пользовательских пресетов
        custom_preset_frame = ttk.LabelFrame(main_frame, text="📋 Пресеты (0-10)", padding="10")
        custom_preset_frame.grid(row=5, column=0, columnspan=3, sticky=(W, E), pady=10)
        
        for i in range(11):
            btn = ttk.Button(custom_preset_frame, text=str(i), width=3, 
                           command=lambda x=i: self.load_preset(x))
            btn.grid(row=0, column=i, padx=2, pady=2)
        
        # Фрейм ручной настройки EQ
        eq_frame = ttk.LabelFrame(main_frame, text="🎚️ Ручная настройка EQ", padding="10")
        eq_frame.grid(row=6, column=0, columnspan=3, sticky=(W, E), pady=10)
        
        ttk.Label(eq_frame, text="Полоса (0-59):").grid(row=0, column=0, padx=5)
        self.band_entry = ttk.Entry(eq_frame, width=5)
        self.band_entry.grid(row=0, column=1, padx=5)
        self.band_entry.insert(0, "0")
        
        ttk.Label(eq_frame, text="Gain (23/24):").grid(row=0, column=2, padx=5)
        self.gain_entry = ttk.Entry(eq_frame, width=5)
        self.gain_entry.grid(row=0, column=3, padx=5)
        self.gain_entry.insert(0, "23")
        
        ttk.Button(eq_frame, text="Установить", command=self.set_eq).grid(row=0, column=4, padx=10)
        
        # Лог
        log_frame = ttk.LabelFrame(main_frame, text="📋 Лог операций", padding="10")
        log_frame.grid(row=7, column=0, columnspan=3, sticky=(W, E, N, S), pady=10)
        
        self.log_text = scrolledtext.ScrolledText(log_frame, height=10, width=80)
        self.log_text.grid(row=0, column=0, sticky=(W, E, N, S))
        
        # Настройка растягивания
        self.root.columnconfigure(0, weight=1)
        self.root.rowconfigure(0, weight=1)
        main_frame.columnconfigure(0, weight=1)
        main_frame.rowconfigure(7, weight=1)
        log_frame.columnconfigure(0, weight=1)
        log_frame.rowconfigure(0, weight=1)
    
    def log(self, message):
        timestamp = time.strftime("%H:%M:%S")
        self.log_text.insert(tk.END, f"[{timestamp}] {message}\n")
        self.log_text.see(tk.END)
    
    def toggle_connection(self):
        if self.controller.connected:
            self.controller.disconnect()
            self.status_label.config(text="❌ Не подключено", foreground="red")
            self.connect_btn.config(text="🔗 Подключиться")
        else:
            # Подключение в отдельном потоке
            def connect_thread():
                success = self.controller.connect()
                if success:
                    self.status_label.config(text="✅ Подключено", foreground="green")
                    self.connect_btn.config(text="🔌 Отключиться")
                else:
                    self.status_label.config(text="❌ Ошибка подключения", foreground="red")
            
            thread = threading.Thread(target=connect_thread)
            thread.start()
    
    def volume_up(self):
        if self.controller.connected:
            self.controller.volume_up()
    
    def volume_down(self):
        if self.controller.connected:
            self.controller.volume_down()
    
    def bass_boost(self):
        if self.controller.connected:
            def thread():
                self.controller.bass_boost()
            threading.Thread(target=thread).start()
    
    def flat(self):
        if self.controller.connected:
            def thread():
                self.controller.flat()
            threading.Thread(target=thread).start()
    
    def vshape(self):
        if self.controller.connected:
            def thread():
                self.controller.log("📤 V-Shape EQ...")
                for band in range(60):
                    gain = 0x24 if (band < 10 or band > 50) else 0x23
                    self.controller.eq_set(band, gain)
                    time.sleep(0.02)
                self.controller.log("✅ V-Shape загружен!")
            threading.Thread(target=thread).start()
    
    def load_preset(self, preset_id):
        if self.controller.connected:
            self.controller.preset_load(preset_id)
    
    def set_eq(self):
        if self.controller.connected:
            try:
                band = int(self.band_entry.get())
                gain = int(self.gain_entry.get(), 16)
                self.controller.eq_set(band, gain)
            except ValueError:
                messagebox.showerror("Ошибка", "Неверные данные")

# ============================================================================
# ЗАПУСК
# ============================================================================

def main():
    root = tk.Tk()
    app = PrologyGUI(root)
    root.mainloop()

if __name__ == '__main__':
    main()
