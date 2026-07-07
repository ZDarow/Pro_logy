#!/usr/bin/env python3
# ============================================================================
# PROLOGY CLI - Консольная утилита
# Управление магнитолой через командную строку
# ============================================================================

import socket
import sys
import argparse
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
# ФУНКЦИИ
# ============================================================================

def connect():
    """Подключиться к устройству."""
    try:
        sock = socket.socket(
            socket.AF_BLUETOOTH,
            socket.SOCK_SEQPACKET,
            socket.BTPROTO_L2CAP
        )
        sock.settimeout(TIMEOUT)
        sock.connect((DEVICE_MAC, PSM_CHANNEL))
        print(f"✅ Подключено к {DEVICE_MAC}")
        return sock
    except Exception as e:
        print(f"❌ Ошибка подключения: {e}")
        return None

def send(sock, packet):
    """Отправить пакет."""
    sock.send(packet)
    print(f"📤 {packet.hex().upper()}")
    time.sleep(0.1)

def volume_up(sock):
    """Увеличить громкость."""
    packet = build_packet(0xC0, CMD_EQ_GAIN_SET, [0x92, 0x0C, 0x32, 0x24, 0x07])
    send(sock, packet)
    print("Volume UP")

def volume_down(sock):
    """Уменьшить громкость."""
    packet = build_packet(0xC0, CMD_EQ_GAIN_SET, [0x92, 0x0C, 0x32, 0x23, 0x07])
    send(sock, packet)
    print("Volume DOWN")

def eq_set(sock, band: int, gain: int):
    """Установить gain полосы."""
    d1 = 0x32 + (band * 0x0A)
    packet = build_packet(0xC0, CMD_EQ_GAIN_SET, [0x92, 0x0C, d1, gain, 0x07])
    send(sock, packet)
    print(f"EQ Band {band} = 0x{gain:02X}")

def eq_query(sock, band: int):
    """Запросить полосу."""
    packet = build_packet(0xC0, CMD_EQ_QUERY, [band & 0xFF, 0x00])
    send(sock, packet)
    print(f"EQ Query Band {band}")

def q_factor(sock, value: int):
    """Установить Q Factor."""
    packet = build_packet(0xC0, CMD_QFACTOR, [0x92, 0x0B, value])
    send(sock, packet)
    print(f"Q Factor 0x{value:02X}")

def preset_load(sock, preset_id: int):
    """Загрузить пресет."""
    packet = build_packet(0xC0, CMD_PRESET, [0x9A, 0x21, preset_id])
    send(sock, packet)
    print(f"Preset {preset_id}")

def bass_boost(sock):
    """Bass Boost."""
    print("Bass Boost (полосы 0-10)...")
    for band in range(10):
        eq_set(sock, band, 0x24)
        time.sleep(0.05)
    print("✅ Bass Boost загружен!")

def flat(sock):
    """Flat EQ."""
    print("Flat EQ (все 60 полос)...")
    for band in range(60):
        eq_set(sock, band, 0x23)
        time.sleep(0.02)
    print("✅ Flat загружен!")

def vshape(sock):
    """V-Shape EQ."""
    print("V-Shape EQ...")
    for band in range(60):
        gain = 0x24 if (band < 10 or band > 50) else 0x23
        eq_set(sock, band, gain)
        time.sleep(0.02)
    print("✅ V-Shape загружен!")

# ============================================================================
# CLI
# ============================================================================

def main():
    parser = argparse.ArgumentParser(
        description='PROLOGY CLI - Управление магнитолой через Linux',
        formatter_class=argparse.RawDescriptionHelpFormatter,
        epilog='''
Примеры:
  prology-cli volume up          Увеличить громкость
  prology-cli volume down        Уменьшить громкость
  prology-cli eq set 5 24        Установить полосу 5 = 0x24
  prology-cli eq query 5         Запросить полосу 5
  prology-cli preset 2           Загрузить пресет 2
  prology-cli bass               Bass Boost
  prology-cli flat               Flat EQ
  prology-cli vshape             V-Shape EQ
  prology-cli qfactor 50         Q Factor 0x50
        '''
    )
    
    subparsers = parser.add_subparsers(dest='command', help='Команды')
    
    # Volume
    volume_parser = subparsers.add_parser('volume', help='Громкость')
    volume_parser.add_argument('action', choices=['up', 'down'], help='Действие')
    
    # EQ
    eq_parser = subparsers.add_parser('eq', help='Эквалайзер')
    eq_subparsers = eq_parser.add_subparsers(dest='eq_action')
    
    eq_set_parser = eq_subparsers.add_parser('set', help='Установить полосу')
    eq_set_parser.add_argument('band', type=int, help='Номер полосы (0-59)')
    eq_set_parser.add_argument('gain', type=str, help='Gain (23 или 24)')
    
    eq_query_parser = eq_subparsers.add_parser('query', help='Запросить полосу')
    eq_query_parser.add_argument('band', type=int, help='Номер полосы (0-59)')
    
    # Preset
    preset_parser = subparsers.add_parser('preset', help='Пресет')
    preset_parser.add_argument('id', type=int, help='ID пресета (0-10)')
    
    # Bass
    subparsers.add_parser('bass', help='Bass Boost')
    
    # Flat
    subparsers.add_parser('flat', help='Flat EQ')
    
    # V-Shape
    subparsers.add_parser('vshape', help='V-Shape EQ')
    
    # Q Factor
    qfactor_parser = subparsers.add_parser('qfactor', help='Q Factor')
    qfactor_parser.add_argument('value', type=str, help='Значение (40-50 hex)')
    
    args = parser.parse_args()
    
    if not args.command:
        parser.print_help()
        return
    
    # Подключение
    sock = connect()
    if not sock:
        sys.exit(1)
    
    try:
        if args.command == 'volume':
            if args.action == 'up':
                volume_up(sock)
            elif args.action == 'down':
                volume_down(sock)
        
        elif args.command == 'eq':
            if args.eq_action == 'set':
                gain = int(args.gain, 16)
                eq_set(sock, args.band, gain)
            elif args.eq_action == 'query':
                eq_query(sock, args.band)
        
        elif args.command == 'preset':
            preset_load(sock, args.id)
        
        elif args.command == 'bass':
            bass_boost(sock)
        
        elif args.command == 'flat':
            flat(sock)
        
        elif args.command == 'vshape':
            vshape(sock)
        
        elif args.command == 'qfactor':
            value = int(args.value, 16)
            q_factor(sock, value)
    
    finally:
        sock.close()
        print("📴 Отключено")

if __name__ == '__main__':
    main()
