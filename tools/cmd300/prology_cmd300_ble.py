#!/usr/bin/env python3
"""
PROLOGY CMD300 — BLE клиент с правильным протоколом (из HCI лога)

Протокол:
  Sync: 0xC0
  TX: 0xAE01 (Handle 0x0009, Write Without Response)
  RX: 0xAE02 (Handle 0x000B, Notify)
  Чип: Jieli AC6925D
  Прошивка: VER 8.7DSP
"""

import asyncio
import struct
from bleak import BleakClient, BleakScanner

# BLE параметры
MAC = "10:48:5E:71:20:90"
SERVICE_UUID = "0000AE00-0000-1000-8000-00805F9B34FB"
TX_UUID = "0000AE01-0000-1000-8000-00805F9B34FB"   # Write
RX_UUID = "0000AE02-0000-1000-8000-00805F9B34FB"   # Notify

def make_packet(payload):
    """Создать пакет с sync byte C0 и checksum"""
    length = len(payload)
    # Формат: C0 + 00 + length_hi + length_lo + payload + checksum
    header = bytes([0xC0, 0x00, (length >> 8) & 0xFF, length & 0xFF])
    checksum = sum(payload) & 0xFF
    return header + payload + bytes([checksum])

class PrologyCMD300:
    def __init__(self, mac):
        self.mac = mac
        self.client = None
        self.responses = []

    def notification_handler(self, sender, data):
        """Обработчик уведомлений"""
        hex_data = data.hex()
        ascii_data = ''.join(chr(b) if 32 <= b <= 126 else '.' for b in data)
        
        print(f"\n← RX [{len(data)} байт]: {hex_data}")
        print(f"   ASCII: {ascii_data}")
        
        # Поиск ASCII строк
        if b'VER' in data:
            idx = data.find(b'VER')
            version = data[idx:idx+20].decode('ascii', errors='replace').strip()
            print(f"   🏷️ Версия: {version}")
        
        self.responses.append(data)

    async def connect(self):
        """Подключение"""
        print(f"\n🔵 Подключение к {MAC}...")
        self.client = BleakClient(self.mac, timeout=15.0)
        await self.client.connect()
        print(f"✅ Подключено!")
        
        # Подписка на уведомления
        await self.client.start_notify(RX_UUID, self.notification_handler)
        print(f"📡 Подписка на {RX_UUID}")
        await asyncio.sleep(1)

    async def disconnect(self):
        """Отключение"""
        if self.client:
            await self.client.disconnect()
            print("\n✅ Отключено")

    async def send_command(self, payload, description=""):
        """Отправить команду"""
        packet = make_packet(payload)
        print(f"\n{'='*60}")
        print(f"→ TX: {description}")
        print(f"   Payload: {payload.hex()}")
        print(f"   Packet:  {packet.hex()}")
        
        self.responses.clear()
        await self.client.write_gatt_char(TX_UUID, packet, response=False)
        
        await asyncio.sleep(2)
        
        if self.responses:
            print(f"   ✅ Ответов: {len(self.responses)}")
        else:
            print(f"   ❌ Нет ответа")

    async def test_heartbeat(self):
        """Проверить heartbeat (из HCI лога)"""
        # Heartbeat из HCI: c0 00 02 05 05 0c
        payload = bytes([0x02, 0x05, 0x05])
        await self.send_command(payload, "Heartbeat (из HCI лога)")

    async def test_version_request(self):
        """Запрос версии (аналог из HCI)"""
        # Команда из HCI лога: 01 02 03 04
        payload = bytes([0x01, 0x02, 0x03, 0x04])
        await self.send_command(payload, "Запрос версии (01 02 03 04)")

    async def test_short_command(self):
        """Короткая команда"""
        payload = bytes([0x01, 0x02, 0x03])
        await self.send_command(payload, "Короткая команда (01 02 03)")

    async def run_tests(self):
        """Запуск всех тестов"""
        await self.connect()
        
        print(f"\n{'='*60}")
        print(f"🧪 ТЕСТЫ ПРОТОКОЛА PROLOGY CMD300")
        print(f"{'='*60}")
        
        # Тест 1: Heartbeat
        await self.test_heartbeat()
        await asyncio.sleep(3)
        
        # Тест 2: Запрос версии
        await self.test_version_request()
        await asyncio.sleep(3)
        
        # Тест 3: Короткая команда
        await self.test_short_command()
        await asyncio.sleep(3)
        
        # Ждём ещё уведомления
        print(f"\n⏳ Ожидание уведомлений (10 сек)...")
        await asyncio.sleep(10)
        
        print(f"\n{'='*60}")
        print(f"📊 ИТОГО: {len(self.responses)} уведомлений")
        print(f"{'='*60}")
        
        await self.disconnect()

async def main():
    print(f"\n╔══════════════════════════════════════════════════╗")
    print(f"║   PROLOGY CMD300 BLE Client                     ║")
    print(f"║   Протокол: C0 + payload + checksum             ║")
    print(f"║   Чип: Jieli AC6925D                            ║")
    print(f"║   Прошивка: VER 8.7DSP                          ║")
    print(f"╚══════════════════════════════════════════════════╝")
    
    device = PrologyCMD300(MAC)
    
    try:
        await device.run_tests()
    except Exception as e:
        print(f"\n❌ Ошибка: {e}")
        import traceback
        traceback.print_exc()

if __name__ == '__main__':
    asyncio.run(main())
