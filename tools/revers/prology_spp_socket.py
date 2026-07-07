#!/usr/bin/env python3
# ============================================================================
# PROLOGY SPP Controller - через socket (без pybluez)
# ============================================================================

import socket
import time
import sys

DEVICE_MAC = "10:48:5E:71:20:90"
SPP_CHANNEL = 1

def calc_crc(data):
    s = sum(data) & 0xFF
    return (s + 0x40) & 0xFF if s < 0xC0 else s & 0x3F

def build_packet(header, cmd, data):
    packet = bytes([header, 0x00, cmd] + data)
    return packet + bytes([calc_crc(packet)])

print("╔═══════════════════════════════════════════════════════════╗")
print("║     PROLOGY SPP CONTROLLER                                ║")
print("╚═══════════════════════════════════════════════════════════╝")
print()
print("Подключение через RFCOMM...")

try:
    sock = socket.socket(socket.AF_BLUETOOTH, socket.SOCK_STREAM, socket.BTPROTO_RFCOMM)
    sock.settimeout(5)
    sock.connect((DEVICE_MAC, SPP_CHANNEL))
    print("✅ ПОДКЛЮЧЕНО!")
    print()
    
    # Тест команд
    tests = [
        ("Volume 30", build_packet(0xC0, 0x10, [30])),
        ("Bass 10", build_packet(0xC0, 0x20, [10])),
        ("Treble 8", build_packet(0xC0, 0x21, [8])),
        ("RGB Red", build_packet(0xC0, 0x85, [255, 0, 0])),
        ("Brightness 15", build_packet(0xC0, 0x80, [15])),
    ]
    
    print("ОТПРАВКА КОМАНД (интервал 3 сек):")
    print()
    
    for name, packet in tests:
        print(f"📤 {name}: {packet.hex().upper()}")
        sock.send(packet)
        time.sleep(3)
    
    sock.close()
    print()
    print("✅ ТЕСТ ЗАВЕРШЁН!")
    print("СМОТРИТЕ НА МАГНИТОЛУ!")
    
except Exception as e:
    print(f"❌ Ошибка: {e}")
    print()
    print("SPP не работает! Попробуйте:")
    print("  1. Сопряжение: bluetoothctl → pair 10:48:5E:71:20:90")
    print("  2. Найти канал: sdptool browse 10:48:5E:71:20:90")
    print("  3. Установить pybluez: sudo apt install python3-bluez")
