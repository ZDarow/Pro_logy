#!/usr/bin/env python3
# ============================================================================
# PROLOGY Linux BLE Controller
# Подключение через BLE GATT и управление громкостью/EQ
# ============================================================================

import asyncio
import sys

try:
    from bleak import BleakClient
    BLEAK_AVAILABLE = True
except ImportError:
    BLEAK_AVAILABLE = False
    print("⚠️ bleak не установлен. Используем gatttool...")

# Адрес устройства
DEVICE_ADDRESS = "10:48:5E:71:20:90"

# BLE характеристики
WRITE_CHARACTERISTIC = 0xAE01
NOTIFY_CHARACTERISTIC = 0xAE02

# Команды из лога
COMMANDS = {
    'volume_up': bytes.fromhex('C00005920C322407FF'),  # Увеличение громкости
    'eq_query': bytes.fromhex('C0000205050C'),
    'qfactor': bytes.fromhex('C00003920B50F0'),
}

async def connect_and_control():
    """Подключение и управление через BLE"""
    
    print("╔═══════════════════════════════════════════════════════════╗")
    print("║     PROLOGY BLE Controller                                ║")
    print("╚═══════════════════════════════════════════════════════════╝")
    print()
    
    if not BLEAK_AVAILABLE:
        print("❌ bleak библиотека не доступна")
        print("Установите: pip3 install bleak")
        return
    
    print(f"[1/3] Подключение к {DEVICE_ADDRESS}...")
    
    try:
        async with BleakClient(DEVICE_ADDRESS, timeout=10.0) as client:
            print(f"✅ Подключено!")
            print()
            
            print("[2/3] Отправка команды увеличения громкости...")
            
            # Отправка команды
            await client.write_gatt_char(
                WRITE_CHARACTERISTIC,
                COMMANDS['volume_up'],
                response=True
            )
            print(f"📤 Отправлено: {COMMANDS['volume_up'].hex().upper()}")
            print()
            
            print("[3/3] Ожидание ответа...")
            
            # Подписка на уведомления
            def notification_handler(sender, data):
                print(f"📥 Получено: {data.hex().upper()}")
            
            await client.start_notify(NOTIFY_CHARACTERISTIC, notification_handler)
            await asyncio.sleep(3)
            await client.stop_notify(NOTIFY_CHARACTERISTIC)
            
            print()
            print("✅ КОМАНДА ОТПРАВЛЕНА!")
            
    except Exception as e:
        print(f"❌ Ошибка: {e}")
        print()
        print("Попробуйте через Android:")
        print("  adb shell monkey -p com.prology -c android.intent.category.LAUNCHER 1")
        print("  adb shell input keyevent KEYCODE_VOLUME_UP")

def main():
    if sys.platform == "linux":
        asyncio.run(connect_and_control())
    else:
        print("Только для Linux")

if __name__ == '__main__':
    main()
