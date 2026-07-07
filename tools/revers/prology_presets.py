#!/usr/bin/env python3
# ============================================================================
# PROLOGY Presets - Быстрые пресеты
# ============================================================================

import socket
import sys
import time

DEVICE_MAC = "10:48:5E:71:20:90"
PSM_CHANNEL = 1
TIMEOUT = 5

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

CMD_EQ_GAIN_SET = 0x05
CMD_PRESET = 0x1B

def connect():
    try:
        sock = socket.socket(socket.AF_BLUETOOTH, socket.SOCK_SEQPACKET, socket.BTPROTO_L2CAP)
        sock.settimeout(TIMEOUT)
        sock.connect((DEVICE_MAC, PSM_CHANNEL))
        print(f"✅ Подключено к {DEVICE_MAC}")
        return sock
    except Exception as e:
        print(f"❌ Ошибка: {e}")
        return None

def eq_set(sock, band: int, gain: int):
    d1 = 0x32 + (band * 0x0A)
    packet = build_packet(0xC0, CMD_EQ_GAIN_SET, [0x92, 0x0C, d1, gain, 0x07])
    sock.send(packet)
    time.sleep(0.02)

def bass_boost(sock):
    print("🎵 Bass Boost...")
    for band in range(10):
        eq_set(sock, band, 0x24)
    print("✅ Готово!")

def flat(sock):
    print("🎵 Flat EQ...")
    for band in range(60):
        eq_set(sock, band, 0x23)
    print("✅ Готово!")

def vshape(sock):
    print("🎵 V-Shape EQ...")
    for band in range(60):
        gain = 0x24 if (band < 10 or band > 50) else 0x23
        eq_set(sock, band, gain)
    print("✅ Готово!")

def main():
    if len(sys.argv) < 2:
        print("Использование: python3 prology-presets.py <preset>")
        print("Пресеты: bass, flat, vshape")
        sys.exit(1)
    
    preset = sys.argv[1].lower()
    
    sock = connect()
    if not sock:
        sys.exit(1)
    
    try:
        if preset == 'bass':
            bass_boost(sock)
        elif preset == 'flat':
            flat(sock)
        elif preset == 'vshape':
            vshape(sock)
        else:
            print(f"❌ Неизвестный пресет: {preset}")
            print("Доступные: bass, flat, vshape")
    finally:
        sock.close()

if __name__ == '__main__':
    main()
