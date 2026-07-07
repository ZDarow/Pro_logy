#!/usr/bin/env python3
"""
PROLOGY Settings Dump
Полный дамп всех настроек устройства
"""

import sys
import time

# Добавляем путь к CRC библиотеке
sys.path.insert(0, '/data/data/com.termux/files/home')

try:
    from prology_crc import create_command, xor_bytes_excluding_length, CRC_CONSTANTS
except ImportError:
    print("❌ prology_crc.py not found!")
    print("   Creating minimal CRC functions...")
    
    def xor_bytes_excluding_length(data):
        if len(data) <= 3:
            return 0
        result = data[0] ^ data[1]
        for b in data[3:]:
            result ^= b
        return result
    
    CRC_CONSTANTS = {
        0x05: {0x01: 0xCC, 0x05: 0xCC},
        0x07: {0x01: 0xCC},
        0x90: {0x00: 0xC3, 0x01: 0xC5},
        0x9A: {0x01: 0xC5, 0x03: 0x20, 0x04: 0xFF},
    }
    
    def create_command(cmd_type, subcmd, payload=b''):
        data = bytes([0xC0, 0x00, len(payload) + 2, cmd_type, subcmd]) + payload
        xor_val = xor_bytes_excluding_length(data)
        const = CRC_CONSTANTS.get(cmd_type, {}).get(subcmd, 0)
        crc = xor_val ^ const
        return data + bytes([crc])

# Команды для запроса настроек
DUMP_COMMANDS = [
    # (type, subcmd, description)
    (0x90, 0x00, "Status Request 1"),
    (0x90, 0x01, "Status Request 2"),
    (0x90, 0x03, "Config Request"),
    (0x91, 0x01, "Config Request B"),
    (0x92, 0x0A, "DateTime Field 1"),
    (0x92, 0x0B, "DateTime Field 2"),
    (0x92, 0x0C, "DateTime Field 3"),
    (0x92, 0x0D, "DateTime Field 4"),
    (0x94, 0x00, "Config Request C"),
    (0x99, 0x00, "Config Request D"),
    (0x9A, 0x01, "Config A"),
    (0x9A, 0x03, "Config B"),
    (0x9A, 0x04, "Config C"),
    (0x9A, 0x05, "Config D"),
    (0x9A, 0x0A, "Config E"),
    (0x9A, 0x0B, "Config F"),
    (0x9A, 0x0C, "Config G"),
    (0x9A, 0x0D, "Config H"),
    (0x9A, 0x10, "Config I"),
    (0x9A, 0x11, "Config J"),
    (0x9A, 0x14, "Config K"),
    (0x9A, 0x15, "Config L"),
    (0x9A, 0x16, "Config M"),
    (0x9A, 0x17, "Config N"),
    (0x9A, 0x18, "Config O"),
    (0x9A, 0x1A, "Config P"),
    (0x9A, 0x1F, "Config Q"),
    (0x9A, 0x21, "Config R"),
    (0x9A, 0x27, "Config S"),
    (0x9A, 0x2A, "Config T"),
    (0xB0, 0x00, "System Control 1"),
    (0xB0, 0x01, "System Control 2"),
    (0xB0, 0x02, "System Control 3"),
    (0xB0, 0x04, "System Preset 1"),
    (0xB0, 0x05, "System Preset 2"),
    (0xB0, 0x0C, "System Adv 1"),
    (0xB0, 0x0D, "System Adv 2"),
    (0xB0, 0x0F, "System Adv 3"),
    (0xB0, 0x10, "System Adv 4"),
    (0xB0, 0x16, "System Adv 5"),
    (0xB0, 0x17, "System Adv 6"),
    (0xB1, 0x00, "System Info"),
]

def generate_all_commands():
    """Генерация всех команд для дампа"""
    commands = []
    
    for cmd_type, subcmd, desc in DUMP_COMMANDS:
        cmd = create_command(cmd_type, subcmd)
        commands.append((cmd, desc))
    
    return commands

def save_commands(commands):
    """Сохранение команд в файл"""
    with open('/storage/emulated/0/Documents/prology_dump_commands.txt', 'w') as f:
        f.write("PROLOGY Settings Dump Commands\n")
        f.write("=" * 75 + "\n\n")
        f.write(f"Generated: {time.strftime('%Y-%m-%d %H:%M:%S')}\n")
        f.write(f"Total commands: {len(commands)}\n\n")
        
        for cmd, desc in commands:
            f.write(f"{desc}:\n")
            f.write(f"  HEX: {cmd.hex().upper()}\n")
            f.write(f"  Type: 0x{cmd[3]:02X}, Subcmd: 0x{cmd[4]:02X}\n")
            f.write(f"  Length: {len(cmd)} bytes\n\n")
    
    print(f"✅ Commands saved to: /storage/emulated/0/Documents/prology_dump_commands.txt")

def send_via_adb(commands):
    """Отправка команд через adb (требует дополнительного скрипта)"""
    print()
    print("═" * 75)
    print("  ОТПРАВКА КОМАНД ЧЕРЕез ADB")
    print("═" * 75)
    print()
    print("Для отправки команд используйте:")
    print()
    print("1. Через Frida:")
    print("   frida --host 127.0.0.1:27042 -p <PID> -l prology_sender.js")
    print()
    print("2. Через Bluetooth CLI:")
    print("   btgatt-client -b <MAC> -t random")
    print("   > write-value 0000ae02-0000-1000-8000-00805f9b34fb <HEX>")
    print()
    print("3. Через Python с bleak:")
    print("   python prology_send_ble.py")
    print()

def main():
    print("╔═══════════════════════════════════════════════════════════════════╗")
    print("║  PROLOGY Settings Dump Generator                                  ║")
    print("╚═══════════════════════════════════════════════════════════════════╝")
    print()
    
    print("📋 Generating dump commands...")
    commands = generate_all_commands()
    print(f"✅ Generated {len(commands)} commands")
    print()
    
    # Сохранение
    save_commands(commands)
    
    # Вывод первых команд
    print("═" * 75)
    print("  FIRST 10 COMMANDS")
    print("═" * 75)
    print()
    
    for cmd, desc in commands[:10]:
        print(f"{desc}:")
        print(f"  {cmd.hex().upper()}")
        print()
    
    # Инструкция по отправке
    send_via_adb(commands)
    
    print()
    print("═" * 75)
    print("  NEXT STEPS")
    print("═" * 75)
    print()
    print("1. Запустите PROLOGY на устройстве")
    print("2. Подключитесь через Frida:")
    print("   frida --host 127.0.0.1:27042 -p $(adb shell pidof com.prology) -l prology_interceptor.js")
    print("3. Отправьте команды (вручную или скриптом)")
    print("4. Сохраните ответы")
    print()

if __name__ == "__main__":
    main()
