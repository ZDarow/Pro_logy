#!/usr/bin/env python3
"""
HCI Log Analyzer - Анализ btsnoop_hci.log для PROLOGY.apk
Извлечение и декодирование Bluetooth пакетов
"""

import struct
import re
from collections import defaultdict
from datetime import datetime

class BtsnoopHeader:
    """Заголовок btsnoop файла"""
    MAGIC = b'btsnoop\x00'
    VERSION = 1
    
    def __init__(self, data):
        self.magic = data[0:8]
        self.version = struct.unpack('>I', data[8:12])[0]
        self.type_ = struct.unpack('>I', data[12:16])[0]
        
    def validate(self):
        if self.magic != self.MAGIC:
            raise ValueError("Invalid btsnoop magic")
        if self.version != self.VERSION:
            raise ValueError(f"Unsupported version: {self.version}")
        return True

class HCI_Packet:
    """HCI пакет"""
    # Типы пакетов
    HCI_COMMAND = 0x01
    HCI_ACL_DATA = 0x02
    HCI_SCO_DATA = 0x03
    HCI_EVENT = 0x04
    
    TYPE_NAMES = {
        0x01: 'COMMAND',
        0x02: 'ACL_DATA',
        0x03: 'SCO_DATA',
        0x04: 'EVENT'
    }
    
    def __init__(self, orig_len, incl_len, flags, drops, timestamp, data):
        self.orig_len = orig_len
        self.incl_len = incl_len
        self.flags = flags
        self.drops = drops
        self.timestamp = timestamp
        self.data = data
        self.packet_type = data[0] if len(data) > 0 else None
        
    def type_name(self):
        return self.TYPE_NAMES.get(self.packet_type, f'UNKNOWN(0x{self.packet_type:02X})')
    
    def to_dict(self):
        return {
            'type': self.type_name(),
            'timestamp': self.timestamp,
            'length': self.orig_len,
            'data': self.data.hex() if self.data else ''
        }

class L2CAP_Packet:
    """L2CAP пакет внутри ACL"""
    # CID каналы
    CID_SIGNALING = 0x0001
    CID_CONNECTIONLESS = 0x0002
    CID_ATT = 0x0004
    CID_LE_SIGNALING = 0x0005
    
    CID_NAMES = {
        0x0001: 'SIGNALLING',
        0x0002: 'CONNECTIONLESS',
        0x0004: 'ATT',
        0x0005: 'LE_SIGNALING'
    }
    
    def __init__(self, data):
        self.length = struct.unpack('<H', data[0:2])[0] if len(data) >= 2 else 0
        self.cid = struct.unpack('<H', data[2:4])[0] if len(data) >= 4 else 0
        self.payload = data[4:] if len(data) > 4 else b''
        
    def cid_name(self):
        return self.CID_NAMES.get(self.cid, f'0x{self.cid:04X}')

class RFCOMM_Packet:
    """RFCOMM пакет"""
    def __init__(self, data):
        self.data = data
        self.parse()
        
    def parse(self):
        if len(self.data) < 3:
            self.dlci = None
            self.type = None
            self.payload = self.data
            return
            
        # Address field
        address = self.data[0]
        self.dlci = (address >> 1) & 0x3F  # DLCI = bits 1-6
        self.direction = address & 0x01  # bit 0
        
        # Control field
        self.control = self.data[1]
        
        # Length
        self.length = self.data[2]
        
        # Payload
        self.payload = self.data[3:3+self.length] if len(self.data) > 3 else b''
        
    def to_dict(self):
        return {
            'dlci': self.dlci,
            'direction': 'TX' if self.direction else 'RX',
            'length': self.length,
            'payload': self.payload.hex() if self.payload else '',
            'payload_ascii': self._decode_ascii()
        }
        
    def _decode_ascii(self):
        """Попытка декодировать payload как ASCII"""
        try:
            # Фильтруем только печатные символы
            return ''.join(chr(b) if 32 <= b < 127 else '.' for b in self.payload)
        except:
            return ''

class HCIAnalyzer:
    """Анализатор HCI логов"""
    
    def __init__(self, filepath):
        self.filepath = filepath
        self.header = None
        self.packets = []
        self.rfcomm_packets = []
        self.att_packets = []
        
    def parse(self):
        """Парсинг btsnoop файла"""
        with open(self.filepath, 'rb') as f:
            data = f.read()
            
        # Заголовок
        self.header = BtsnoopHeader(data[0:16])
        self.header.validate()
        print(f"✓ Btsnoop v{self.header.version}, тип: {'Little Endian' if self.header.type_ == 0x4d3c else 'Big Endian'}")
        
        # Пакеты
        offset = 16
        packet_num = 0
        
        while offset < len(data):
            if offset + 24 > len(data):
                break
                
            # Заголовок пакета (24 байта)
            header_data = data[offset:offset+24]
            orig_len, incl_len, flags, drops, timestamp = struct.unpack('>IIIIq', header_data)
            offset += 24
            
            # Данные пакета
            if offset + incl_len > len(data):
                break
                
            packet_data = data[offset:offset+incl_len]
            offset += incl_len
            
            packet = HCI_Packet(orig_len, incl_len, flags, drops, timestamp, packet_data)
            self.packets.append(packet)
            packet_num += 1
            
            # Анализ L2CAP внутри ACL
            if packet.packet_type == HCI_Packet.HCI_ACL_DATA:
                self._analyze_acl(packet_data[1:], packet.timestamp)
                
        print(f"✓ Всего пакетов: {packet_num:,}")
        print(f"✓ RFCOMM пакетов: {len(self.rfcomm_packets):,}")
        print(f"✓ ATT (BLE) пакетов: {len(self.att_packets):,}")
        
    def _analyze_acl(self, acl_data, timestamp):
        """Анализ ACL данных"""
        if len(acl_data) < 10:
            return
            
        # HCI ACL заголовок
        handle = struct.unpack('<H', acl_data[0:2])[0]
        acl_flags = (handle >> 12) & 0x0F
        handle = handle & 0x0FFF
        acl_len = struct.unpack('<H', acl_data[2:4])[0]
        
        # L2CAP заголовок
        l2cap_len = struct.unpack('<H', acl_data[4:6])[0]
        cid = struct.unpack('<H', acl_data[6:8])[0]
        l2cap_payload = acl_data[8:8+l2cap_len]
        
        l2cap = L2CAP_Packet(acl_data[4:])
        
        # RFCOMM (CID 0x0001 - но может быть другой для SPP)
        if cid >= 0x0020:  # Динамические каналы (обычно SPP)
            rfcomm = RFCOMM_Packet(l2cap_payload)
            if rfcomm.dlci is not None:
                rfcomm.timestamp = timestamp
                rfcomm.handle = handle
                rfcomm.cid = cid
                self.rfcomm_packets.append(rfcomm)
                
        # ATT (BLE)
        elif cid == L2CAP_Packet.CID_ATT:
            self.att_packets.append({
                'timestamp': timestamp,
                'handle': handle,
                'data': l2cap_payload
            })
            
    def find_prology_commands(self):
        """Поиск команд PROLOGY в RFCOMM пакетах"""
        prology_commands = []
        
        # Сигнатуры команд PROLOGY
        # Ожидаем формат: [MCU_CODE][CMD][LENGTH][DATA][CHECKSUM]
        # MCU_6951_DSP = 0x1A2B (предположительно)
        
        for pkt in self.rfcomm_packets:
            payload = pkt.payload
            
            # Поиск паттернов команд
            if len(payload) >= 5:
                # Проверка на формат команды PROLOGY
                # 0x1A 0x2B = MCU_6951_DSP
                if payload[0:2] == b'\x1a\x2b' or payload[0:2] == b'\x69\x51':
                    cmd = {
                        'timestamp': pkt.timestamp,
                        'dlci': pkt.dlci,
                        'mcu': payload[0:2].hex().upper(),
                        'cmd': f'0x{payload[2]:02X}',
                        'length': payload[3] if len(payload) > 3 else 0,
                        'data': payload[4:].hex() if len(payload) > 4 else '',
                        'raw': payload.hex()
                    }
                    prology_commands.append(cmd)
                    
        return prology_commands
    
    def find_eq_commands(self):
        """Поиск команд эквалайзера"""
        eq_commands = []
        
        # Команды эквалайзера: CMD 0x01 (preset), 0x02 (gain), 0x03 (q-factor)
        for pkt in self.rfcomm_packets:
            payload = pkt.payload
            
            if len(payload) >= 4:
                # Проверка на команду EQ_PRESET (0x01)
                if payload[2:3] == b'\x01' and len(payload) == 5:
                    eq_commands.append({
                        'type': 'EQ_PRESET',
                        'timestamp': pkt.timestamp,
                        'preset_id': payload[4] if len(payload) > 4 else 0,
                        'raw': payload.hex()
                    })
                    
                # Проверка на команду EQ_GAIN (0x02)
                elif payload[2:3] == b'\x02' and len(payload) == 6:
                    eq_commands.append({
                        'type': 'EQ_GAIN',
                        'timestamp': pkt.timestamp,
                        'band': payload[4] if len(payload) > 4 else 0,
                        'gain': payload[5] if len(payload) > 5 else 0,
                        'raw': payload.hex()
                    })
                    
        return eq_commands
    
    def find_volume_commands(self):
        """Поиск команд громкости"""
        vol_commands = []
        
        # Команда VOLUME: CMD 0x10
        for pkt in self.rfcomm_packets:
            payload = pkt.payload
            
            if len(payload) >= 5 and payload[2:3] == b'\x10':
                vol_commands.append({
                    'type': 'VOLUME',
                    'timestamp': pkt.timestamp,
                    'volume': payload[4] if len(payload) > 4 else 0,
                    'raw': payload.hex()
                })
                
        return vol_commands
    
    def analyze_ble(self):
        """Анализ BLE пакетов (ATT)"""
        ble_data = []
        
        for pkt in self.att_packets:
            data = pkt['data']
            if len(data) < 3:
                continue
                
            # ATT Opcode
            opcode = data[0]
            
            # ATT Write Request (0x12)
            if opcode == 0x12:
                handle = struct.unpack('<H', data[1:3])[0]
                value = data[3:]
                ble_data.append({
                    'type': 'WRITE_REQUEST',
                    'timestamp': pkt['timestamp'],
                    'handle': f'0x{handle:04X}',
                    'value': value.hex(),
                    'value_ascii': self._decode_ascii(value)
                })
                
            # ATT Write Command (0x52)
            elif opcode == 0x52:
                handle = struct.unpack('<H', data[1:3])[0]
                value = data[3:]
                ble_data.append({
                    'type': 'WRITE_COMMAND',
                    'timestamp': pkt['timestamp'],
                    'handle': f'0x{handle:04X}',
                    'value': value.hex(),
                    'value_ascii': self._decode_ascii(value)
                })
                
            # ATT Read Request (0x0A)
            elif opcode == 0x0A:
                handle = struct.unpack('<H', data[1:3])[0]
                ble_data.append({
                    'type': 'READ_REQUEST',
                    'timestamp': pkt['timestamp'],
                    'handle': f'0x{handle:04X}'
                })
                
            # ATT Handle Value Notification (0x1B)
            elif opcode == 0x1B:
                handle = struct.unpack('<H', data[1:3])[0]
                value = data[3:]
                ble_data.append({
                    'type': 'NOTIFICATION',
                    'timestamp': pkt['timestamp'],
                    'handle': f'0x{handle:04X}',
                    'value': value.hex(),
                    'value_ascii': self._decode_ascii(value)
                })
                
        return ble_data
    
    def _decode_ascii(self, data):
        """Декодирование ASCII с фильтрацией"""
        try:
            return ''.join(chr(b) if 32 <= b < 127 else '.' for b in data)
        except:
            return ''
    
    def generate_report(self):
        """Генерация отчёта"""
        print("\n" + "="*70)
        print(" HCI LOG ANALYSIS REPORT - PROLOGY")
        print("="*70)
        
        # Общая статистика
        print(f"\n📊 СТАТИСТИКА:")
        print(f"   Всего пакетов: {len(self.packets):,}")
        print(f"   RFCOMM пакетов: {len(self.rfcomm_packets):,}")
        print(f"   BLE ATT пакетов: {len(self.att_packets):,}")
        
        # Поиск команд PROLOGY
        prology_cmds = self.find_prology_commands()
        if prology_cmds:
            print(f"\n🔧 НАЙДЕНЫ КОМАНДЫ PROLOGY ({len(prology_cmds)}):")
            for cmd in prology_cmds[:20]:
                print(f"   [{self._format_timestamp(cmd['timestamp'])}] "
                      f"DLCI={cmd['dlci']} MCU={cmd['mcu']} CMD={cmd['cmd']} "
                      f"LEN={cmd['length']} DATA={cmd['data']}")
                      
        # Команды эквалайзера
        eq_cmds = self.find_eq_commands()
        if eq_cmds:
            print(f"\n🎛 КОМАНДЫ ЭКВАЛАЙЗЕРА ({len(eq_cmds)}):")
            for cmd in eq_cmds[:20]:
                if cmd['type'] == 'EQ_PRESET':
                    print(f"   [{self._format_timestamp(cmd['timestamp'])}] "
                          f"PRESET_ID={cmd['preset_id']} RAW={cmd['raw']}")
                elif cmd['type'] == 'EQ_GAIN':
                    print(f"   [{self._format_timestamp(cmd['timestamp'])}] "
                          f"BAND={cmd['band']} GAIN={cmd['gain']} RAW={cmd['raw']}")
                          
        # Команды громкости
        vol_cmds = self.find_volume_commands()
        if vol_cmds:
            print(f"\n🔊 КОМАНДЫ ГРОМКОСТИ ({len(vol_cmds)}):")
            for cmd in vol_cmds[:20]:
                print(f"   [{self._format_timestamp(cmd['timestamp'])}] "
                      f"VOLUME={cmd['volume']} RAW={cmd['raw']}")
                      
        # BLE анализ
        ble_data = self.analyze_ble()
        if ble_data:
            print(f"\n📶 BLE ПАКЕТЫ ({len(ble_data)}):")
            for pkt in ble_data[:20]:
                if pkt['type'] == 'WRITE_REQUEST':
                    print(f"   [{self._format_timestamp(pkt['timestamp'])}] "
                          f"WRITE {pkt['handle']} = {pkt['value']} "
                          f"({pkt.get('value_ascii', '')})")
                elif pkt['type'] == 'NOTIFICATION':
                    print(f"   [{self._format_timestamp(pkt['timestamp'])}] "
                          f"NOTIFY {pkt['handle']} = {pkt['value']} "
                          f"({pkt.get('value_ascii', '')})")
                          
        # DLCI каналы
        dlci_counts = defaultdict(int)
        for pkt in self.rfcomm_packets:
            dlci_counts[pkt.dlci] += 1
            
        if dlci_counts:
            print(f"\n📡 КАНАЛЫ DLCI:")
            for dlci, count in sorted(dlci_counts.items()):
                print(f"   DLCI {dlci}: {count} пакетов")
                
        print("\n" + "="*70)
        
    def _format_timestamp(self, timestamp_ms):
        """Форматирование временной метки"""
        # Конвертация из микросекунд в читаемый формат
        seconds = timestamp_ms / 1000000
        return f"{seconds:.3f}s"
        
    def export_to_file(self, output_path):
        """Экспорт в файл"""
        with open(output_path, 'w', encoding='utf-8') as f:
            f.write("HCI LOG ANALYSIS REPORT\n")
            f.write("="*50 + "\n\n")
            
            f.write(f"Total packets: {len(self.packets)}\n")
            f.write(f"RFCOMM packets: {len(self.rfcomm_packets)}\n")
            f.write(f"BLE ATT packets: {len(self.att_packets)}\n\n")
            
            # PROLOGY команды
            prology_cmds = self.find_prology_commands()
            f.write("PROLOGY COMMANDS:\n")
            for cmd in prology_cmds:
                f.write(f"  {cmd}\n")
                
            # EQ команды
            eq_cmds = self.find_eq_commands()
            f.write("\nEQUALIZER COMMANDS:\n")
            for cmd in eq_cmds:
                f.write(f"  {cmd}\n")
                
            # Volume команды
            vol_cmds = self.find_volume_commands()
            f.write("\nVOLUME COMMANDS:\n")
            for cmd in vol_cmds:
                f.write(f"  {cmd}\n")
                
            # BLE
            ble_data = self.analyze_ble()
            f.write("\nBLE PACKETS:\n")
            for pkt in ble_data:
                f.write(f"  {pkt}\n")
                
        print(f"✓ Экспорт в {output_path}")


if __name__ == '__main__':
    import sys
    
    if len(sys.argv) < 2:
        print("Использование: python hci_analyzer.py <btsnoop_hci.log> [output.txt]")
        sys.exit(1)
        
    analyzer = HCIAnalyzer(sys.argv[1])
    analyzer.parse()
    analyzer.generate_report()
    
    if len(sys.argv) > 2:
        analyzer.export_to_file(sys.argv[2])
