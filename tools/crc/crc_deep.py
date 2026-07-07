#!/usr/bin/env python3
"""
PROLOGY CRC Deep Analysis
Анализ сложных команд с переменной константой
"""

# Команды 0x9A с subcmd 0x06
CMDS_9A_06 = [
    bytes([0xC0, 0x00, 0x05, 0x9A, 0x06, 0x00, 0x01, 0x00, 0xA6]),
    bytes([0xC0, 0x00, 0x05, 0x9A, 0x06, 0x00, 0x07, 0x00, 0xAC]),
    bytes([0xC0, 0x00, 0x05, 0x9A, 0x06, 0x00, 0x08, 0x00, 0xAD]),
    bytes([0xC0, 0x00, 0x05, 0x9A, 0x06, 0x00, 0x09, 0x00, 0xAE]),
    bytes([0xC0, 0x00, 0x05, 0x9A, 0x06, 0x00, 0x0A, 0x00, 0xAF]),
    bytes([0xC0, 0x00, 0x05, 0x9A, 0x06, 0x00, 0x0B, 0x00, 0xB0]),
    bytes([0xC0, 0x00, 0x05, 0x9A, 0x06, 0x01, 0x00, 0x00, 0xA6]),
    bytes([0xC0, 0x00, 0x05, 0x9A, 0x06, 0x01, 0x01, 0x00, 0xA7]),
    bytes([0xC0, 0x00, 0x05, 0x9A, 0x06, 0x01, 0x02, 0x00, 0xA8]),
    bytes([0xC0, 0x00, 0x05, 0x9A, 0x06, 0x01, 0x03, 0x00, 0xA9]),
    bytes([0xC0, 0x00, 0x05, 0x9A, 0x06, 0x01, 0x07, 0x00, 0xAD]),
    bytes([0xC0, 0x00, 0x05, 0x9A, 0x06, 0x01, 0x08, 0x00, 0xAE]),
    bytes([0xC0, 0x00, 0x05, 0x9A, 0x06, 0x01, 0x09, 0x00, 0xAF]),
    bytes([0xC0, 0x00, 0x05, 0x9A, 0x06, 0x01, 0x0A, 0x00, 0xB0]),
    bytes([0xC0, 0x00, 0x05, 0x9A, 0x06, 0x01, 0x0B, 0x00, 0xB1]),
    bytes([0xC0, 0x00, 0x05, 0x9A, 0x06, 0x02, 0x00, 0x00, 0xA7]),
    bytes([0xC0, 0x00, 0x05, 0x9A, 0x06, 0x02, 0x01, 0x00, 0xA8]),
    bytes([0xC0, 0x00, 0x05, 0x9A, 0x06, 0x02, 0x02, 0x00, 0xA9]),
    bytes([0xC0, 0x00, 0x05, 0x9A, 0x06, 0x02, 0x03, 0x00, 0xAA]),
    bytes([0xC0, 0x00, 0x05, 0x9A, 0x06, 0x02, 0x04, 0x00, 0xAB]),
    bytes([0xC0, 0x00, 0x05, 0x9A, 0x06, 0x02, 0x05, 0x00, 0xAC]),
    bytes([0xC0, 0x00, 0x05, 0x9A, 0x06, 0x02, 0x06, 0x00, 0xAD]),
    bytes([0xC0, 0x00, 0x05, 0x9A, 0x06, 0x02, 0x08, 0x00, 0xAF]),
    bytes([0xC0, 0x00, 0x05, 0x9A, 0x06, 0x02, 0x0A, 0x00, 0xB1]),
    bytes([0xC0, 0x00, 0x05, 0x9A, 0x06, 0x02, 0x0B, 0x00, 0xB1]),
]

# Команды B0 с subcmd 0x06
CMDS_B0_06 = [
    bytes([0xC0, 0x00, 0x04, 0xB0, 0x06, 0x00, 0x00, 0xBA]),
    bytes([0xC0, 0x00, 0x04, 0xB0, 0x06, 0x00, 0x01, 0xBB]),
    bytes([0xC0, 0x00, 0x04, 0xB0, 0x06, 0x00, 0x02, 0xBC]),
    bytes([0xC0, 0x00, 0x04, 0xB0, 0x06, 0x00, 0x03, 0xBD]),
]

def xor_bytes(data):
    result = 0
    for b in data:
        result ^= b
    return result

def analyze_9a_06():
    """Анализ команд 0x9A 0x06"""
    print("╔═══════════════════════════════════════════════════════════════════╗")
    print("║  ANALYSIS: 0x9A 0x06 COMMANDS                                     ║")
    print("╚═══════════════════════════════════════════════════════════════════╝")
    print()
    
    print("Looking for pattern in CRC calculation...")
    print()
    
    for cmd in CMDS_9A_06[:10]:
        data = cmd[:-1]
        crc = cmd[-1]
        
        byte5 = data[5]  # 0x06
        byte6 = data[6]  # variable (0x00-0x0B)
        byte7 = data[7]  # 0x00
        byte8 = data[8]  # 0x01-0x0B
        
        xor_all = xor_bytes(data)
        
        # Проверяем гипотезу: CRC зависит от byte6 и byte8
        # CRC = XOR(data) XOR const XOR byte6 XOR byte8 ?
        test1 = xor_all ^ byte6 ^ byte8
        test2 = xor_all ^ (byte6 + byte8) & 0xFF
        test3 = (xor_all + byte6 + byte8) & 0xFF
        
        print(f"Cmd: {cmd.hex().upper()}")
        print(f"  byte[5]=0x{byte6:02X} byte[8]=0x{byte8:02X} CRC=0x{crc:02X}")
        print(f"  XOR(data)=0x{xor_all:02X}")
        print(f"  XOR^b5^b8=0x{test1:02X}  XOR^(b5+b8)=0x{test2:02X}  SUM(b5,b8)=0x{test3:02X}")
        
        if test1 == crc:
            print(f"  ✅ MATCH: CRC = XOR(data) XOR byte[5] XOR byte[8]")
        elif test2 == crc:
            print(f"  ✅ MATCH: CRC = XOR(data) XOR (byte[5]+byte[8])")
        elif test3 == crc:
            print(f"  ✅ MATCH: CRC = (XOR(data) + byte[5] + byte[8]) mod 256")
        
        print()
    
    print()
    print("═══════════════════════════════════════════════════════════════════")
    print()

def analyze_b0_06():
    """Анализ команд B0 0x06"""
    print("╔═══════════════════════════════════════════════════════════════════╗")
    print("║  ANALYSIS: 0xB0 0x06 COMMANDS                                     ║")
    print("╚═══════════════════════════════════════════════════════════════════╝")
    print()
    
    for cmd in CMDS_B0_06:
        data = cmd[:-1]
        crc = cmd[-1]
        
        byte5 = data[5]  # 0x06
        byte6 = data[6]  # 0x00
        byte7 = data[7]  # variable (0x00-0x03)
        
        xor_all = xor_bytes(data)
        const = 0xCC  # Из предыдущего анализа
        
        # Проверяем: CRC = XOR(data) XOR const XOR byte7 ?
        test1 = xor_all ^ const ^ byte7
        test2 = xor_all ^ const
        
        print(f"Cmd: {cmd.hex().upper()}")
        print(f"  byte[7]=0x{byte7:02X} CRC=0x{crc:02X}")
        print(f"  XOR(data)=0x{xor_all:02X}")
        print(f"  XOR^const=0x{test2:02X}  XOR^const^b7=0x{test1:02X}")
        
        if test1 == crc:
            print(f"  ✅ MATCH: CRC = XOR(data) XOR const XOR byte[7]")
        elif test2 == crc:
            print(f"  ✅ MATCH: CRC = XOR(data) XOR const")
        
        print()

def find_general_formula():
    """Поиск общей формулы"""
    print("╔═══════════════════════════════════════════════════════════════════╗")
    print("║  GENERAL CRC FORMULA DISCOVERY                                    ║")
    print("╚═══════════════════════════════════════════════════════════════════╝")
    print()
    
    # Объединяем все команды
    all_cmds = CMDS_9A_06 + CMDS_B0_06
    
    # Считаем константы для каждой команды
    print("Analyzing all commands...")
    print()
    
    for cmd in all_cmds[:5]:
        data = cmd[:-1]
        crc = cmd[-1]
        
        cmd_type = data[3]
        subcmd = data[4]
        
        xor_data = xor_bytes(data)
        implied_const = crc ^ xor_data
        
        print(f"Cmd: {cmd.hex().upper()}")
        print(f"  Type=0x{cmd_type:02X} Subcmd=0x{subcmd:02X}")
        print(f"  XOR=0x{xor_data:02X} CRC=0x{crc:02X} ImpliedConst=0x{implied_const:02X}")
        
        # Проверяем зависимость от байтов
        for i in range(len(data)):
            test_const = implied_const ^ data[i]
            print(f"  Const^byte[{i}]=0x{test_const:02X}")
        
        print()

if __name__ == "__main__":
    analyze_9a_06()
    print()
    analyze_b0_06()
    print()
    find_general_formula()
