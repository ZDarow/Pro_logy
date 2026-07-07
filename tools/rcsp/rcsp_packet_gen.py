#!/usr/bin/env python3
"""
PROLOGY BLE — Генератор пакетов RCSP протокола
Использует расшифрованную формулу: checksum = data_byte + K_type
"""

from dataclasses import dataclass
from typing import List, Optional

# Таблица констант checksum по типам команд
# Формула: chk = last_data_byte + K (для однобайтовых)
#          chk = sum(data_bytes) + K (для многбайтовых)
CHECKSUM_K_SINGLE = {
    0x01: 0x09,  # Init (1-byte) / для 2-byte: chk = sum(data) + 0x04
    0x03: 0x05,  # Query
    0x04: 0x06,  # Heartbeat
    0x80: 0x84,  # Write param (1-byte) / для 2-byte: K = 0x83
    0x8E: 0x90,  # Status request
}

CHECKSUM_K_MULTI = {
    # (cmd_type, sub_cmd) → K  (chk = sum(data) + K)
    (0x01, None): 0x04,   # Init 2-byte: sum(05,00)+04=09
    (0x80, None): 0x83,   # Write param 2-byte
    (0x8A, 0x10): 0x8E,   # Config
    (0x8A, 0x19): 0x8D,   # Config
    (0x8A, 0x17): 0x8D,   # Config
    (0xA0, 0x12): 0xA6,   # Gain fade
    (0xA0, 0x10): 0xA5,   # Gain fade
    (0xA0, 0x07): 0xA6,   # Gain fade sweep
}

@dataclass
class RCSP_Packet:
    """Пакет RCSP протокола"""
    is_tx: bool  # True = команда (F0), False = ответ (C0)
    cmd_type: int  # Тип команды/уведомления
    data: bytes  # Данные (без checksum)
    
    @property
    def sync(self) -> int:
        return 0xF0 if self.is_tx else 0xC0
    
    @property
    def length(self) -> int:
        """Длина = len(data) + 1 (checksum) — НЕ включает type"""
        return len(self.data) + 1
    
    def compute_checksum(self) -> Optional[int]:
        """Вычислить checksum по формуле: chk = data_sum + K"""
        if len(self.data) == 1:
            K = CHECKSUM_K_SINGLE.get(self.cmd_type)
            if K is None:
                return None
            return (self.data[0] + K) & 0xFF
        else:
            # Многбайтовый: chk = sum(data_bytes) + K
            sub_cmd = self.data[0] if len(self.data) >= 1 else None
            K = CHECKSUM_K_MULTI.get((self.cmd_type, sub_cmd))
            if K is None:
                # Попробовать без sub_cmd
                K = CHECKSUM_K_MULTI.get((self.cmd_type, None))
            if K is None:
                return None
            return (sum(self.data) + K) & 0xFF
    
    def build(self) -> bytes:
        """Собрать полный пакет"""
        chk = self.compute_checksum()
        if chk is None:
            raise ValueError(f"Неизвестная константа K для типа 0x{self.cmd_type:02X}")
        
        return bytes([self.sync, 0x00, self.length, self.cmd_type]) + self.data + bytes([chk])
    
    def to_hex(self) -> str:
        return ' '.join(f'{b:02X}' for b in self.build())


# ============================================================================
# Фабрика команд
# ============================================================================

def cmd_init() -> RCSP_Packet:
    """Инициализация сессии — F0 00 03 01 05 00 09"""
    return RCSP_Packet(is_tx=True, cmd_type=0x01, data=bytes([0x05, 0x00]))

def cmd_heartbeat(data: int = 0x47) -> RCSP_Packet:
    """Heartbeat (по умолчанию 0x47)"""
    return RCSP_Packet(is_tx=True, cmd_type=0x04, data=bytes([data]))

def cmd_query(param: int) -> RCSP_Packet:
    """Запрос данных (param: 0x01-0x06)"""
    return RCSP_Packet(is_tx=True, cmd_type=0x03, data=bytes([param]))

def cmd_write_param(reg: int = 0x01, value: int = 0x27) -> RCSP_Packet:
    """Запись параметра эквалайзера"""
    return RCSP_Packet(is_tx=True, cmd_type=0x80, data=bytes([reg, value]))

def cmd_status_req(channel: int) -> RCSP_Packet:
    """Запрос статуса канала (1-6)"""
    return RCSP_Packet(is_tx=True, cmd_type=0x8E, data=bytes([channel]))

def cmd_gain_fade(value: int = 0xE4) -> RCSP_Packet:
    """Gain fade-in (серия A0)"""
    # F0 00 06 A0 07 00 XX FF 00 CHK
    return RCSP_Packet(is_tx=True, cmd_type=0xA0, data=bytes([0x07, 0x00, value, 0xFF, 0x00]))


# ============================================================================
# Парсер ответов
# ============================================================================

def parse_rx(data: bytes) -> dict:
    """Распарсить RX пакет"""
    if len(data) < 6:
        return {"error": "too short"}
    
    sync = data[0]
    length = data[2]
    cmd_type = data[3]
    payload = data[4:-1]
    checksum = data[-1]
    
    # Проверить checksum
    K = CHECKSUM_K.get(cmd_type)
    if K is not None and len(payload) >= 1:
        expected = (payload[-1] + K) & 0xFF
        chk_valid = (expected == checksum)
    else:
        chk_valid = None
        expected = None
    
    result = {
        "sync": "TX" if sync == 0xF0 else "RX",
        "type": f"0x{cmd_type:02X}",
        "length": length,
        "payload_hex": payload.hex().upper(),
        "checksum": f"0x{checksum:02X}",
        "checksum_valid": chk_valid,
        "checksum_expected": f"0x{expected:02X}" if expected is not None else "unknown",
    }
    
    # Специфичные парсеры
    if cmd_type == 0x05 and len(payload) == 2:
        result["description"] = f"Heartbeat: status=0x{payload[0]:02X}"
    
    elif cmd_type == 0x9F and len(payload) == 1:
        result["description"] = f"Confirm: channel=0x{payload[0]:02X}"
    
    elif cmd_type == 0xFF:
        ascii_data = ''.join(chr(b) if 0x20 <= b < 0x7F else '.' for b in payload)
        result["description"] = f"Identification: {ascii_data}"
    
    elif cmd_type == 0x80 and len(payload) == 2:
        result["description"] = f"Param write: reg=0x{payload[0]:02X} val=0x{payload[1]:02X}"
    
    return result


# ============================================================================
# Тест
# ============================================================================

if __name__ == "__main__":
    print("=" * 80)
    print("PROLOGY BLE — Генератор RCSP пакетов")
    print("=" * 80)
    
    # Генерация команд
    print("\n--- Генерация TX команд ---\n")
    
    commands = [
        ("Init", cmd_init()),
        ("Heartbeat (0x47)", cmd_heartbeat(0x47)),
        ("Heartbeat (0x01)", cmd_heartbeat(0x01)),
        ("Query (0x01)", cmd_query(0x01)),
        ("Write Param (0x27)", cmd_write_param(0x01, 0x27)),
        ("Write Param (0x39)", cmd_write_param(0x01, 0x09)),
        ("Status Req (ch 1)", cmd_status_req(1)),
        ("Status Req (ch 3)", cmd_status_req(3)),
    ]
    
    for name, cmd in commands:
        pkt = cmd.build()
        print(f"{name:25s}: {cmd.to_hex()}")
        
        # Проверить что совпадает с оригиналом
        original = None
        if name == "Init":
            original = "F0 00 03 01 05 00 09"
        elif name == "Heartbeat (0x47)":
            original = "F0 00 02 04 47 4D"
        elif name == "Heartbeat (0x01)":
            original = "F0 00 02 04 01 07"
        elif name == "Write Param (0x27)":
            original = "F0 00 03 80 01 27 AB"
        elif name == "Write Param (0x39)":
            original = "F0 00 03 80 01 09 8D"
        elif name == "Status Req (ch 1)":
            original = "F0 00 02 8E 01 91"
        elif name == "Status Req (ch 3)":
            original = "F0 00 02 8E 03 93"
        
        if original:
            match = "✅" if cmd.to_hex() == original else f"❌ (expected: {original})"
            print(f"  {'':25s}  → {match}")
    
    # Парсинг RX
    print("\n--- Парсинг RX пакетов ---\n")
    
    rx_samples = [
        bytes.fromhex("C0000205050C"),
        bytes.fromhex("C0000205060D"),
        bytes.fromhex("C000029F01A2"),
        bytes.fromhex("C000029F03A4"),
    ]
    
    for rx_data in rx_samples:
        result = parse_rx(rx_data)
        print(f"  {' '.join(f'{b:02X}' for b in rx_data)}")
        print(f"    {result}")
        print()
    
    print("=" * 80)
    print("DONE")
    print("=" * 80)
