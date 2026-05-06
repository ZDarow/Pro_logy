#!/usr/bin/env python3
"""
PROLOGY Receiver Control for Linux
Управление ресивером PROLOGY через BLE на Linux

Требования: pip install bleak
Запуск: sudo python3 linux_receiver_control.py (иногда нужны права для BLE)
"""

import asyncio
import struct
import logging
from typing import Optional, List, Dict

from bleak import BleakScanner, BleakClient
from bleak.backends.device import BLEDevice

logging.basicConfig(level=logging.INFO, format='%(message)s')
logger = logging.getLogger('PROLOGY')

# ============================================================
# RCSP Protocol constants
# ============================================================
SERVICE_UUID = "0000ae00-0000-1000-8000-00805f9b34fb"
TX_CHAR_UUID = "0000ae01-0000-1000-8000-00805f9b34fb"  # Write
RX_CHAR_UUID = "0000ae02-0000-1000-8000-00805f9b34fb"  # Notify

class RCSPProtocol:
    """Реализация протокола RCSP"""

    @staticmethod
    def calc_tx_checksum(data: bytes) -> int:
        """TX checksum: (sum + 0x10) & 0xFF"""
        return (sum(data) + 0x10) & 0xFF

    @staticmethod
    def calc_rx_checksum(data: bytes) -> int:
        """RX checksum: (sum + 0x40) & 0xFF"""
        return (sum(data) + 0x40) & 0xFF

    @staticmethod
    def build_tx_packet(cmd: int, payload: bytes = b'') -> bytes:
        """Сборка TX пакета (к устройству)"""
        data = bytes([cmd]) + payload
        chk = RCSPProtocol.calc_tx_checksum(data)
        return data + bytes([chk])

    @staticmethod
    def parse_rx_packet(packet: bytes) -> Optional[Dict]:
        """Разбор RX пакета (от устройства)"""
        if len(packet) < 2:
            return None
        cmd = packet[0]
        received_chk = packet[-1]
        data = packet[1:-1]
        expected_chk = RCSPProtocol.calc_rx_checksum(packet[:-1])
        if received_chk != expected_chk:
            logger.warning(f"Checksum error: {received_chk:02X} != {expected_chk:02X}")
            return None
        return {'cmd': cmd, 'data': data, 'raw': packet}


class PrologyReceiver:
    """Управление ресивером PROLOGY через BLE"""

    def __init__(self, mac_address: Optional[str] = None):
        self.mac_address = mac_address.upper() if mac_address else None
        self.client: Optional[BleakClient] = None
        self.rx_buffer = bytearray()
        self.connected = False
        self.device_info = {}

    async def scan(self, timeout: float = 5.0) -> List[BLEDevice]:
        """Поиск устройств PROLOGY"""
        logger.info("🔍 Поиск устройств PROLOGY...")
        devices = await BleakScanner.discover(timeout=timeout)
        prology_devices = [d for d in devices if d.name and 'PROLOGY' in d.name.upper()]
        return prology_devices

    async def connect(self, mac: Optional[str] = None) -> bool:
        """Подключение к устройству"""
        target_mac = mac or self.mac_address
        if not target_mac:
            devices = await self.scan()
            if not devices:
                logger.error("❌ Устройства не найдены")
                return False
            target_mac = devices[0].address
            logger.info(f"✅ Найдено: {devices[0].name} ({target_mac})")

        self.client = BleakClient(target_mac)
        try:
            await self.client.connect()
            self.connected = True
            logger.info(f"✅ Подключено к {target_mac}")

            # Включаем уведомления
            await self.client.start_notify(RX_CHAR_UUID, self._rx_handler)
            logger.info("📡 Уведомления включены")

            # Инициализация сессии
            await self.init_session()
            return True
        except Exception as e:
            logger.error(f"❌ Ошибка подключения: {e}")
            return False

    def _rx_handler(self, sender, data: bytearray):
        """Обработчик входящих данных"""
        self.rx_buffer.extend(data)
        logger.debug(f"📥 RX: {data.hex()}")

    async def init_session(self):
        """Инициализация сессии (CMD 0x01)"""
        packet = RCSPProtocol.build_tx_packet(0x01)
        await self._send(packet)
        await asyncio.sleep(0.5)
        # Читаем ответ идентификации (0xFF)
        if self.rx_buffer:
            response = RCSPProtocol.parse_rx_packet(bytes(self.rx_buffer))
            if response and response['cmd'] == 0xFF:
                data = response['data']
                if b'\x00' in data:
                    parts = data.split(b'\x00')
                    self.device_info['name'] = parts[0].decode('ascii', errors='ignore')
                    if len(parts) > 1:
                        self.device_info['firmware'] = parts[1].decode('ascii', errors='ignore')
                logger.info(f"📱 Устройство: {self.device_info.get('name', 'Unknown')}")
                logger.info(f"🔧 Версия: {self.device_info.get('firmware', 'Unknown')}")
            self.rx_buffer.clear()

    async def _send(self, data: bytes):
        """Отправка данных"""
        if not self.connected or not self.client:
            raise RuntimeError("Не подключено")
        await self.client.write_gatt_char(TX_CHAR_UUID, bytearray(data))
        logger.debug(f"📤 TX: {data.hex()}")

    async def set_volume(self, volume: int) -> bool:
        """Установка громкости (0-100)"""
        volume = max(0, min(100, volume))
        # CMD 0xA0 - Gain/Fade
        payload = bytes([volume])
        packet = RCSPProtocol.build_tx_packet(0xA0, payload)
        await self._send(packet)
        await asyncio.sleep(0.2)
        logger.info(f"🔊 Громкость: {volume}%")
        return True

    async def set_eq_preset(self, preset: str) -> bool:
        """Установка пресета эквалайзера"""
        presets = {
            'flat': 0x00, 'rock': 0x01, 'jazz': 0x02,
            'classical': 0x03, 'pop': 0x04, 'dance': 0x05
        }
        if preset.lower() not in presets:
            logger.error(f"❌ Неизвестный пресет: {preset}")
            return False
        # CMD 0x80 - Write Param (EQ preset)
        preset_id = presets[preset.lower()]
        payload = bytes([0x01, preset_id])  # Channel 1, preset
        packet = RCSPProtocol.build_tx_packet(0x80, payload)
        await self._send(packet)
        await asyncio.sleep(0.2)
        logger.info(f"🎵 Эквалайзер: {preset}")
        return True

    async def set_bass(self, level: int) -> bool:
        """Установка Bass (0-100, 50 = центр)"""
        level = max(0, min(100, level))
        # CMD 0x08 - Bass/Treble
        bass_val = int((level / 100) * 255)
        payload = bytes([0x01, bass_val])  # Bass channel, value
        packet = RCSPProtocol.build_tx_packet(0x08, payload)
        await self._send(packet)
        await asyncio.sleep(0.2)
        logger.info(f"🎸 Bass: {level}%")
        return True

    async def set_treble(self, level: int) -> bool:
        """Установка Treble (0-100, 50 = центр)"""
        level = max(0, min(100, level))
        treble_val = int((level / 100) * 255)
        payload = bytes([0x02, treble_val])  # Treble channel, value
        packet = RCSPProtocol.build_tx_packet(0x08, payload)
        await self._send(packet)
        await asyncio.sleep(0.2)
        logger.info(f"🎶 Treble: {level}%")
        return True

    async def set_subwoofer(self, volume: int) -> bool:
        """Установка громкости сабвуфера (0-100)"""
        volume = max(0, min(100, volume))
        payload = bytes([volume])
        packet = RCSPProtocol.build_tx_packet(0x11, payload)
        await self._send(packet)
        await asyncio.sleep(0.2)
        logger.info(f"🎵 Сабвуфер: {volume}%")
        return True

    async def send_heartbeat(self):
        """Отправка heartbeat (keep-alive)"""
        import time
        seq = int(time.time()) & 0xFF
        packet = RCSPProtocol.build_tx_packet(0x04, bytes([seq]))
        await self._send(packet)

    async def get_device_info(self) -> Dict:
        """Получение информации об устройстве"""
        return self.device_info

    async def disconnect(self):
        """Отключение"""
        if self.client and self.connected:
            await self.client.disconnect()
            self.connected = False
            logger.info("⏹️  Отключено")


# ============================================================
# CLI Interface
# ============================================================
async def interactive_mode(receiver: PrologyReceiver):
    """Интерактивный режим"""
    print("\n" + "="*50)
    print("PROLOGY Receiver Control - Interactive Mode")
    print("="*50)
    print("Команды:")
    print("  volume <0-100>    - громкость")
    print("  eq <preset>       - пресет (flat/rock/jazz/classical/pop)")
    print("  bass <0-100>     - bass")
    print("  treble <0-100>   - treble")
    print("  sub <0-100>      - сабвуфер")
    print("  info              - информация")
    print("  quit              - выход")
    print("="*50 + "\n")

    while True:
        try:
            cmd = input("> ").strip().lower()
            if cmd == 'quit':
                break
            elif cmd.startswith('volume '):
                vol = int(cmd.split()[1])
                await receiver.set_volume(vol)
            elif cmd.startswith('eq '):
                preset = cmd.split()[1]
                await receiver.set_eq_preset(preset)
            elif cmd.startswith('bass '):
                level = int(cmd.split()[1])
                await receiver.set_bass(level)
            elif cmd.startswith('treble '):
                level = int(cmd.split()[1])
                await receiver.set_treble(level)
            elif cmd.startswith('sub '):
                vol = int(cmd.split()[1])
                await receiver.set_subwoofer(vol)
            elif cmd == 'info':
                info = await receiver.get_device_info()
                print(f"  Модель: {info.get('name', 'Unknown')}")
                print(f"  Версия: {info.get('firmware', 'Unknown')}")
            else:
                print("Неизвестная команда")
        except (ValueError, IndexError):
            print("Неверный формат")
        except KeyboardInterrupt:
            break
    await receiver.disconnect()


async def main():
    """Основная функция"""
    import sys

    if len(sys.argv) < 2:
        print("PROLOGY Receiver Control for Linux")
        print("\nИспользование:")
        print("  python3 linux_receiver_control.py scan")
        print("  python3 linux_receiver_control.py connect <MAC>")
        print("  python3 linux_receiver_control.py interactive [MAC]")
        print("  python3 linux_receiver_control.py volume <MAC> <0-100>")
        print("  python3 linux_receiver_control.py eq <MAC> <preset>")
        print("\nПримеры:")
        print("  python3 linux_receiver_control.py scan")
        print("  python3 linux_receiver_control.py interactive AA:BB:CC:DD:EE:FF")
        return

    command = sys.argv[1]

    if command == 'scan':
        receiver = PrologyReceiver()
        devices = await receiver.scan()
        if devices:
            print("\nНайдены устройства:")
            for i, d in enumerate(devices, 1):
                print(f"  {i}. {d.name} ({d.address})")
        else:
            print("Устройства не найдены")

    elif command == 'interactive':
        mac = sys.argv[2] if len(sys.argv) > 2 else None
        receiver = PrologyReceiver(mac)
        if await receiver.connect():
            await interactive_mode(receiver)

    elif command == 'volume' and len(sys.argv) >= 4:
        mac = sys.argv[2]
        vol = int(sys.argv[3])
        receiver = PrologyReceiver(mac)
        if await receiver.connect():
            await receiver.set_volume(vol)
            await receiver.disconnect()

    elif command == 'eq' and len(sys.argv) >= 4:
        mac = sys.argv[2]
        preset = sys.argv[3]
        receiver = PrologyReceiver(mac)
        if await receiver.connect():
            await receiver.set_eq_preset(preset)
            await receiver.disconnect()

    else:
        print("Неизвестная команда или неверные аргументы")


if __name__ == '__main__':
    asyncio.run(main())
