#!/usr/bin/env python3
"""
RCSP Protocol Checksum — PROLOGY BLE (Jieli AC6951)

Расшифрованная формула checksum:
    TX (Phone → Device):  chk = (sum(all_bytes_except_checksum) + 0x10) & 0xFF
    RX (Device → Phone):  chk = (sum(all_bytes_except_checksum) + 0x40) & 0xFF

Верифицировано на 53 пакетах (44 TX + 9 RX) — 100% совпадение.

Sync byte:  0xF0 = TX, 0xC0 = RX
Формат:     [SYNC] [RES=0x00] [LEN] [TYPE] [DATA...] [CHECKSUM]

Дата расшифровки: 6 апреля 2026 г.
"""


def calc_checksum_tx(data_bytes: bytes) -> int:
    """Calculate checksum for TX (Phone → Device) packet.
    
    Args:
        data_bytes: All bytes of the packet EXCEPT the checksum byte.
                   Includes sync, reserved, length, type, and data.
    
    Returns:
        Checksum byte value (0x00–0xFF).
    """
    return (sum(data_bytes) + 0x10) & 0xFF


def calc_checksum_rx(data_bytes: bytes) -> int:
    """Calculate checksum for RX (Device → Phone) packet.
    
    Args:
        data_bytes: All bytes of the packet EXCEPT the checksum byte.
                   Includes sync, reserved, length, type, and data.
    
    Returns:
        Checksum byte value (0x00–0xFF).
    """
    return (sum(data_bytes) + 0x40) & 0xFF


def verify_checksum(packet: bytes, direction: str = "tx") -> bool:
    """Verify checksum of a complete packet.
    
    Args:
        packet: Complete packet including checksum (last byte).
        direction: "tx" for Phone→Device, "rx" for Device→Phone.
    
    Returns:
        True if checksum is valid.
    """
    if len(packet) < 2:
        return False
    data = packet[:-1]
    expected = packet[-1]
    calc = calc_checksum_tx(data) if direction == "tx" else calc_checksum_rx(data)
    return calc == expected


def build_packet_tx(type_byte: int, data: list[int]) -> bytes:
    """Build complete TX packet with sync, length, type, data, and checksum.
    
    Args:
        type_byte: Command type (0x01, 0x03, 0x04, 0x80, 0x8A, 0x8E, 0xA0).
        data: Payload data bytes (without sync, reserved, length, type, checksum).
    
    Returns:
        Complete packet bytes.
    """
    # Length = type_byte + data bytes (everything after length field)
    length = 1 + len(data)  # type + data
    packet = bytes([0xF0, 0x00, length, type_byte]) + bytes(data)
    chk = calc_checksum_tx(packet)
    return packet + bytes([chk])


def build_packet_rx(type_byte: int, data: list[int]) -> bytes:
    """Build complete RX packet with sync, length, type, data, and checksum.
    
    Args:
        type_byte: Notification type (0x05, 0x07, 0x9F, etc.).
        data: Payload data bytes (without sync, reserved, length, type, checksum).
    
    Returns:
        Complete packet bytes.
    """
    length = 1 + len(data)
    packet = bytes([0xC0, 0x00, length, type_byte]) + bytes(data)
    chk = calc_checksum_rx(packet)
    return packet + bytes([chk])


def parse_packet(packet: bytes) -> dict:
    """Parse a complete RCSP packet into its components.
    
    Args:
        packet: Complete packet bytes.
    
    Returns:
        Dictionary with sync, reserved, length, type, data, checksum, direction, valid.
    """
    if len(packet) < 5:
        return {"error": "Packet too short"}
    
    sync = packet[0]
    reserved = packet[1]
    length = packet[2]
    type_byte = packet[3]
    data = packet[4:-1]
    checksum = packet[-1]
    
    direction = "tx" if sync == 0xF0 else "rx" if sync == 0xC0 else "unknown"
    
    if direction == "tx":
        expected_chk = calc_checksum_tx(packet[:-1])
    elif direction == "rx":
        expected_chk = calc_checksum_rx(packet[:-1])
    else:
        expected_chk = None
    
    return {
        "sync": sync,
        "reserved": reserved,
        "length": length,
        "type": type_byte,
        "data": data,
        "checksum": checksum,
        "expected_checksum": expected_chk,
        "direction": direction,
        "valid": checksum == expected_chk if expected_chk is not None else None,
    }


# ============================================================================
# Common TX commands (convenience functions)
# ============================================================================

def cmd_init() -> bytes:
    """Build Init command: F0 00 03 01 05 00 09"""
    return build_packet_tx(0x01, [0x05, 0x00])


def cmd_heartbeat(param: int = 0x47) -> bytes:
    """Build Heartbeat command: F0 00 02 04 [param] [chk]"""
    return build_packet_tx(0x04, [param])


def cmd_query(param: int) -> bytes:
    """Build Query command: F0 00 02 03 [param] [chk]"""
    return build_packet_tx(0x03, [param])


def cmd_write_param(reg: int = 0x01, value: int = 0x00) -> bytes:
    """Build Write Parameter command: F0 00 03 80 [reg] [val] [chk]"""
    return build_packet_tx(0x80, [reg, value])


def cmd_status_req(channel: int) -> bytes:
    """Build Status Request command: F0 00 02 8E [channel] [chk]"""
    return build_packet_tx(0x8E, [channel])


def cmd_config(data: list[int]) -> bytes:
    """Build Config command: F0 00 [len] A0 [data...] [chk]"""
    return build_packet_tx(0xA0, data)


def cmd_config_ext(sub_cmd: int, data: list[int]) -> bytes:
    """Build Extended Config command: F0 00 [len] 8A [sub_cmd] [data...] [chk]"""
    return build_packet_tx(0x8A, [sub_cmd] + data)


if __name__ == "__main__":
    print("=" * 70)
    print("RCSP Protocol Checksum — PROLOGY BLE (Jieli AC6951)")
    print("=" * 70)
    
    # Verification
    test_packets = [
        (bytes.fromhex("F0000301050009"), "tx"),
        (bytes.fromhex("F000020447"), "tx"),  # без checksum для проверки
        (bytes.fromhex("F0000204474D"), "tx"),
        (bytes.fromhex("C0000205050C"), "rx"),
        (bytes.fromhex("C000029F01A2"), "rx"),
    ]
    
    print("\n--- Verification ---")
    for pkt, direction in test_packets:
        # Для пакетов без checksum (4 байта)
        if len(pkt) == 4:
            data = pkt
            calc = calc_checksum_tx(data) if direction == "tx" else calc_checksum_rx(data)
            full = pkt + bytes([calc])
            print(f"  Build:  {' '.join(f'{b:02X}' for b in data)} → chk=0x{calc:02X}")
            print(f"  Full:   {' '.join(f'{b:02X}' for b in full)}")
        else:
            valid = verify_checksum(pkt, direction)
            parsed = parse_packet(pkt)
            print(f"  Verify: {' '.join(f'{b:02X}' for b in pkt)} → {'✅' if valid else '❌'} ({parsed})")
    
    # Generate common commands
    print("\n--- Common Commands ---")
    print(f"  Init:         {' '.join(f'{b:02X}' for b in cmd_init())}")
    print(f"  Heartbeat:    {' '.join(f'{b:02X}' for b in cmd_heartbeat())}")
    print(f"  Query 0x36:   {' '.join(f'{b:02X}' for b in cmd_query(0x36))}")
    print(f"  Write 0x80:   {' '.join(f'{b:02X}' for b in cmd_write_param(0x01, 0x30))}")
    print(f"  Status Ch1:   {' '.join(f'{b:02X}' for b in cmd_status_req(1))}")
    print(f"  Config A0:    {' '.join(f'{b:02X}' for b in cmd_config([0x07, 0x00, 0xE4, 0xFF, 0x00]))}")
