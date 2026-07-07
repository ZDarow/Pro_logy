#!/usr/bin/env python3
# ============================================================================
# PROLOGY Protocol Library
# Полная реализация протокола с CRC
# ============================================================================

from typing import List, Tuple, Optional
import struct

# ============================================================================
# CRC Алгоритм (ВОССТАНОВЛЕН!)
# ============================================================================

def prology_crc(data: bytes) -> int:
    """
    Вычислить CRC для пакета PROLOGY.
    
    Формула:
    - Если сумма данных < 0xC0: CRC = (сумма + 0x40) & 0xFF
    - Если сумма данных >= 0xC0: CRC = сумма & 0x3F
    
    Args:
        data: Байты данных (без CRC)
    
    Returns:
        CRC byte (0x00-0xFF)
    """
    s = sum(data) & 0xFF
    if s < 0xC0:
        return (s + 0x40) & 0xFF
    else:
        return s & 0x3F

def prology_crc_verify(packet: bytes) -> bool:
    """
    Проверить CRC пакета.
    
    Args:
        packet: Полный пакет (данные + CRC)
    
    Returns:
        True если CRC верный, False иначе
    """
    if len(packet) < 2:
        return False
    
    data = packet[:-1]
    expected_crc = packet[-1]
    calculated_crc = prology_crc(data)
    
    return calculated_crc == expected_crc

def prology_crc_append(data: bytes) -> bytes:
    """
    Добавить CRC к данным.
    
    Args:
        data: Байты данных (без CRC)
    
    Returns:
        data + CRC byte
    """
    crc = prology_crc(data)
    return data + bytes([crc])

# ============================================================================
# Построитель пакетов
# ============================================================================

class PrologyPacketBuilder:
    """Построитель пакетов PROLOGY"""
    
    HEADER = 0xC0
    RESERVED = 0x00
    
    # Команды
    CMD_EQ_GAIN_QUERY = 0x02
    CMD_EQ_QFACTOR = 0x03
    CMD_EQ_GAIN_SET = 0x05
    CMD_EQ_PRESET = 0x1B
    
    @staticmethod
    def build_eq_gain_query(band: int, gain: int) -> bytes:
        """
        Построить 6-байтовый пакет EQ Gain Query.
        
        Args:
            band: Номер полосы (0-159)
            gain: Значение gain (0-4)
        
        Returns:
            Готовый пакет с CRC (6 байт)
        """
        data = bytes([
            PrologyPacketBuilder.HEADER,
            PrologyPacketBuilder.RESERVED,
            PrologyPacketBuilder.CMD_EQ_GAIN_QUERY,
            band & 0xFF,
            gain & 0xFF
        ])
        return prology_crc_append(data)
    
    @staticmethod
    def build_eq_qfactor(base: int, sub: int, value: int) -> bytes:
        """
        Построить 7-байтовый пакет Q Factor.
        
        Args:
            base: Base value (обычно 0x92)
            sub: Subcommand (0x0B или 0x0C)
            value: Q factor value
        
        Returns:
            Готовый пакет с CRC (7 байт)
        """
        data = bytes([
            PrologyPacketBuilder.HEADER,
            PrologyPacketBuilder.RESERVED,
            PrologyPacketBuilder.CMD_EQ_QFACTOR,
            base & 0xFF,
            sub & 0xFF,
            value & 0xFF
        ])
        return prology_crc_append(data)
    
    @staticmethod
    def build_eq_gain_set(band: int, gain_msb: int, gain_data: int) -> bytes:
        """
        Построить 9-байтовый пакет EQ Gain Set.
        
        Args:
            band: Номер полосы (0-59)
            gain_msb: MSB gain (0x23 или 0x24)
            gain_data: Gain data byte
        
        Returns:
            Готовый пакет с CRC (9 байт)
        """
        # Вычисление D1 из номера полосы
        d1 = 0x32 + (band * 0x0A)
        
        data = bytes([
            PrologyPacketBuilder.HEADER,
            PrologyPacketBuilder.RESERVED,
            PrologyPacketBuilder.CMD_EQ_GAIN_SET,
            0x92,  # Base
            0x0C,  # Subcommand (Set Gain)
            d1 & 0xFF,
            gain_msb & 0xFF,
            gain_data  # Обычно 0x07
        ])
        return prology_crc_append(data)
    
    @staticmethod
    def build_eq_preset(preset_id: int, data: List[int]) -> bytes:
        """
        Построить 31-байтовый пакет Preset Save/Load.
        
        Args:
            preset_id: ID пресета
            data: Данные пресета (25 байт)
        
        Returns:
            Готовый пакет с CRC (31 байт)
        """
        if len(data) > 25:
            data = data[:25]
        
        # Дополнить нулями до 25 байт
        while len(data) < 25:
            data.append(0)
        
        packet_data = [
            PrologyPacketBuilder.HEADER,
            PrologyPacketBuilder.RESERVED,
            0x1B,  # Length (27)
            0x9A,  # Base
            0x21,  # Command (Preset)
            preset_id & 0xFF
        ] + data
        
        return prology_crc_append(bytes(packet_data))

# ============================================================================
# Парсер пакетов
# ============================================================================

class PrologyPacketParser:
    """Парсер пакетов PROLOGY"""
    
    @staticmethod
    def parse(packet: bytes) -> Optional[dict]:
        """
        Разобрать пакет.
        
        Args:
            packet: Байты пакета
        
        Returns:
            Dict с информацией о пакете или None если ошибка
        """
        if len(packet) < 6:
            return None
        
        # Проверка CRC
        if not prology_crc_verify(packet):
            return {'error': 'CRC mismatch', 'packet': packet.hex().upper()}
        
        header = packet[0]
        # reserved = packet[1]
        command = packet[2]
        
        result = {
            'header': header,
            'command': command,
            'size': len(packet),
            'crc_valid': True,
            'raw': packet.hex().upper()
        }
        
        # Парсинг по типу команды
        if command == 0x02 and len(packet) == 6:
            result['type'] = 'EQ_GAIN_QUERY'
            result['band'] = packet[3]
            result['gain'] = packet[4]
        
        elif command == 0x03 and len(packet) == 7:
            result['type'] = 'EQ_QFACTOR'
            result['base'] = packet[3]
            result['subcommand'] = packet[4]
            result['value'] = packet[5]
        
        elif command == 0x05 and len(packet) == 9:
            result['type'] = 'EQ_GAIN_SET'
            result['base'] = packet[3]
            result['subcommand'] = packet[4]
            result['d1'] = packet[5]
            result['gain_msb'] = packet[6]
            result['gain_data'] = packet[7]
            
            # Вычисление номера полосы
            band = (packet[5] - 0x32) // 0x0A
            result['band'] = band
        
        elif command == 0x1B and len(packet) == 31:
            result['type'] = 'EQ_PRESET'
            result['base'] = packet[3]
            result['preset_id'] = packet[5]
            result['preset_data'] = packet[6:30]
        
        else:
            result['type'] = 'UNKNOWN'
            result['data'] = packet[3:-1].hex().upper()
        
        return result

# ============================================================================
# Утилиты
# ============================================================================

def hex_to_bytes(hex_str: str) -> bytes:
    """Конвертировать hex строку в байты"""
    return bytes([int(b, 16) for b in hex_str.split()])

def bytes_to_hex(data: bytes) -> str:
    """Конвертировать байты в hex строку"""
    return ' '.join(f'{b:02X}' for b in data)

def analyze_packet(hex_str: str) -> None:
    """
    Проанализировать пакет.
    
    Args:
        hex_str: Hex строка пакета
    """
    packet = hex_to_bytes(hex_str)
    result = PrologyPacketParser.parse(packet)
    
    if result:
        print(f"Пакет: {hex_str}")
        print(f"  Тип: {result.get('type', 'UNKNOWN')}")
        print(f"  Размер: {result.get('size', 0)} байт")
        print(f"  CRC: {'✓ верный' if result.get('crc_valid') else '✗ неверный'}")
        
        if 'band' in result:
            print(f"  Полоса: {result['band']}")
        if 'gain' in result:
            print(f"  Gain: {result['gain']}")
        if 'preset_id' in result:
            print(f"  Пресет ID: {result['preset_id']}")
    else:
        print(f"Ошибка парсинга: {hex_str}")

# ============================================================================
# Тесты
# ============================================================================

def run_tests():
    """Запустить тесты"""
    print("=" * 70)
    print("ТЕСТИРОВАНИЕ PROLOGY PROTOCOL LIBRARY")
    print("=" * 70)
    print()
    
    # Тест 1: CRC
    print("Тест 1: CRC алгоритм")
    print("-" * 50)
    
    test_data = bytes([0xC0, 0x00, 0x02, 0x9F, 0x00])
    crc = prology_crc(test_data)
    print(f"  Данные: {bytes_to_hex(test_data)}")
    print(f"  CRC: 0x{crc:02X} (ожидалось 0xA1)")
    print(f"  {'✓' if crc == 0xA1 else '✗'}")
    print()
    
    # Тест 2: Построение пакета
    print("Тест 2: Построение пакетов")
    print("-" * 50)
    
    # 6-байтовый
    pkt = PrologyPacketBuilder.build_eq_gain_query(159, 0)
    print(f"  EQ Query (band=159, gain=0):")
    print(f"    {bytes_to_hex(pkt)}")
    print(f"    {'✓' if prology_crc_verify(pkt) else '✗'} CRC")
    
    # 9-байтовый
    pkt = PrologyPacketBuilder.build_eq_gain_set(5, 0x23, 0x07)
    print(f"  EQ Gain Set (band=5):")
    print(f"    {bytes_to_hex(pkt)}")
    print(f"    {'✓' if prology_crc_verify(pkt) else '✗'} CRC")
    
    print()
    
    # Тест 3: Парсинг
    print("Тест 3: Парсинг пакетов")
    print("-" * 50)
    
    test_packets = [
        "C0 00 02 9F 00 A1",
        "C0 00 05 92 0C 3C 23 07 09",
        "C0 00 03 92 0B 40 E0"
    ]
    
    for hex_str in test_packets:
        packet = hex_to_bytes(hex_str)
        result = PrologyPacketParser.parse(packet)
        if result:
            print(f"  {hex_str}")
            print(f"    Тип: {result['type']}, CRC: {'✓' if result['crc_valid'] else '✗'}")
    
    print()
    print("=" * 70)
    print("ТЕСТЫ ЗАВЕРШЕНЫ")
    print("=" * 70)

# ============================================================================
# Main
# ============================================================================

if __name__ == '__main__':
    run_tests()
    
    print()
    print("Примеры использования:")
    print()
    
    # Пример 1: Создание пакета
    print("1. Создание пакета EQ Gain Query:")
    pkt = PrologyPacketBuilder.build_eq_gain_query(5, 3)
    print(f"   band=5, gain=3 → {bytes_to_hex(pkt)}")
    print()
    
    # Пример 2: Проверка CRC
    print("2. Проверка CRC:")
    pkt = hex_to_bytes("C0 00 02 9F 00 A1")
    valid = prology_crc_verify(pkt)
    print(f"   {bytes_to_hex(pkt)} → CRC {'верный' if valid else 'неверный'}")
    print()
    
    # Пример 3: Парсинг
    print("3. Парсинг пакета:")
    pkt = hex_to_bytes("C0 00 05 92 0C 50 23 07 1D")
    result = PrologyPacketParser.parse(pkt)
    if result:
        print(f"   Тип: {result['type']}")
        print(f"   Полоса: {result.get('band', 'N/A')}")
        print(f"   CRC: {'верный' if result.get('crc_valid') else 'неверный'}")
