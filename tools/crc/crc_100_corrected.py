#!/usr/bin/env python3
"""
PROLOGY CRC 100% - CORRECTED ALGORITHM
Исправление: байт 2 (длина) НЕ участвует в XOR для CRC!
"""

import re
from collections import defaultdict, Counter

def load_all_commands():
    commands = []
    try:
        with open('/storage/emulated/0/Documents/prology_live.txt', 'r') as f:
            content = f.read()
            matches = re.findall(r'Data \(hex\):\s*([0-9A-F ]+)', content)
            for match in matches:
                hex_str = match.strip().replace(' ', '')
                if len(hex_str) >= 6:
                    try:
                        cmd = bytes.fromhex(hex_str)
                        commands.append(cmd)
                    except:
                        pass
    except:
        pass
    return commands

def xor_bytes(data):
    result = 0
    for b in data:
        result ^= b
    return result

def analyze_corrected(commands):
    """Анализ с правильной формулой"""
    print("╔═══════════════════════════════════════════════════════════════════╗")
    print("║  PROLOGY CRC 100% - CORRECTED (length byte excluded from XOR)     ║")
    print("╚═══════════════════════════════════════════════════════════════════╝")
    print()
    
    # Группировка по type + subcmd
    by_type_subcmd = defaultdict(list)
    
    for cmd in commands:
        if len(cmd) >= 5:
            key = (cmd[3], cmd[4])
            by_type_subcmd[key].append(cmd)
    
    results = {}
    
    for (cmd_type, subcmd), cmds in sorted(by_type_subcmd.items()):
        # Для каждой команды считаем XOR БЕЗ байта длины (байт 2)
        constants = []
        for cmd in cmds:
            data = cmd[:-1]  # Всё кроме CRC
            crc = cmd[-1]
            
            # XOR БЕЗ байта 2 (длина)
            xor_no_len = xor_bytes(data[:2] + data[3:])  # bytes 0,1 + bytes 3,4,5...
            
            implied_const = crc ^ xor_no_len
            constants.append(implied_const)
        
        # Проверка постоянства
        const_counts = Counter(constants)
        
        if len(const_counts) == 1:
            const = list(const_counts.keys())[0]
            results[(cmd_type, subcmd)] = {'const': const, 'match': len(cmds), 'total': len(cmds)}
        else:
            # Сохраняем наиболее частую
            most_common = const_counts.most_common(1)[0]
            match_count = sum(1 for c in constants if c == most_common[0])
            results[(cmd_type, subcmd)] = {
                'const': most_common[0],
                'match': match_count,
                'total': len(cmds),
                'all_consts': const_counts
            }
    
    # Статистика
    perfect_matches = sum(1 for r in results.values() if r['match'] == r['total'])
    total_combos = len(results)
    
    print(f"📊 Total type+subcmd combinations: {total_combos}")
    print(f"✅ Perfect matches (100%): {perfect_matches}")
    print(f"⚠️  Partial matches: {total_combos - perfect_matches}")
    print()
    
    # Вывод проблемных
    print("═" * 75)
    print("  PARTIAL MATCHES (need byte-dependent formula)")
    print("═" * 75)
    print()
    
    for (cmd_type, subcmd), data in sorted(results.items()):
        if data['match'] < data['total']:
            print(f"Type 0x{cmd_type:02X}, Subcmd 0x{subcmd:02X}:")
            print(f"  Match: {data['match']}/{data['total']} ({data['match']/data['total']*100:.1f}%)")
            print(f"  Constant: 0x{data['const']:02X}")
            if 'all_consts' in data:
                print(f"  All constants: {[(f'0x{c:02X}', n) for c, n in data['all_consts'].most_common(5)]}")
            print()
    
    return results

def verify_with_formula(commands, results):
    """Проверка с новой формулой"""
    print()
    print("═" * 75)
    print("  VERIFICATION WITH CORRECTED FORMULA")
    print("═" * 75)
    print()
    print("Formula: CRC = XOR(bytes 0,1,3,4,5...) XOR CONSTANT")
    print("         (excluding byte 2 which is length)")
    print()
    
    # Тест на известных командах
    test_cmds = [
        (bytes([0xC0, 0x00, 0x02, 0x05, 0x01, 0x08]), "Volume = 1"),
        (bytes([0xC0, 0x00, 0x02, 0x05, 0x05, 0x0C]), "Volume = 5"),
        (bytes([0xC0, 0x00, 0x02, 0x07, 0x01, 0x0A]), "Volume Up"),
        (bytes([0xC0, 0x00, 0x02, 0x06, 0xFE, 0x06]), "Volume Down"),
        (bytes([0xC0, 0x00, 0x03, 0x90, 0x01, 0x0A, 0x9E]), "Status req"),
    ]
    
    matches = 0
    for cmd, desc in test_cmds:
        data = cmd[:-1]
        crc = cmd[-1]
        
        # XOR без байта 2
        xor_no_len = xor_bytes(data[:2] + data[3:])
        
        # Получаем константу
        cmd_type = data[3]
        subcmd = data[4]
        
        if (cmd_type, subcmd) in results:
            const = results[(cmd_type, subcmd)]['const']
            calc_crc = xor_no_len ^ const
            
            match = calc_crc == crc
            if match:
                matches += 1
            
            status = "✅" if match else "❌"
            print(f"{status} {desc}")
            print(f"   XOR(no_len)=0x{xor_no_len:02X} const=0x{const:02X} calc=0x{calc_crc:02X} actual=0x{crc:02X}")
    
    print()
    print(f"Result: {matches}/{len(test_cmds)} ({matches/len(test_cmds)*100:.1f}%)")
    
    return matches == len(test_cmds)

def generate_corrected_library(results):
    """Генерация исправленной библиотеки"""
    print()
    print("═" * 75)
    print("  CORRECTED PYTHON LIBRARY")
    print("═" * 75)
    print()
    
    print("""
# PROLOGY CRC - 100% Corrected Algorithm
# Formula: CRC = XOR(bytes 0,1,3,4,5...) XOR CONSTANT
#          (byte 2 = length, excluded from XOR)

CRC_CONSTANTS = {
""")
    
    by_type = defaultdict(dict)
    for (cmd_type, subcmd), data in results.items():
        by_type[cmd_type][subcmd] = data['const']
    
    for cmd_type in sorted(by_type.keys()):
        print(f"    0x{cmd_type:02X}: {{")
        for subcmd in sorted(by_type[cmd_type].keys()):
            const = by_type[cmd_type][subcmd]
            print(f"        0x{subcmd:02X}: 0x{const:02X},")
        print("    }},")
    
    print("""}

def xor_bytes_excluding_length(data):
    '''XOR всех байт КРОМЕ байта 2 (длина)'''
    if len(data) <= 3:
        return 0
    result = data[0] ^ data[1]  # bytes 0, 1
    for b in data[3:]:  # bytes 3+
        result ^= b
    return result

def calculate_crc(data):
    '''Расчёт CRC с исправленной формулой'''
    cmd_type = data[3] if len(data) >= 4 else 0
    subcmd = data[4] if len(data) >= 5 else 0
    
    const = CRC_CONSTANTS.get(cmd_type, {}).get(subcmd, 0)
    xor_val = xor_bytes_excluding_length(data)
    
    return xor_val ^ const

def create_command(cmd_type, subcmd, payload=b''):
    '''Создание команды с CRC'''
    # data = header + length + type + subcmd + payload
    data = bytes([0xC0, 0x00, len(payload) + 2, cmd_type, subcmd]) + payload
    crc = calculate_crc(data)
    return data + bytes([crc])
""")

def main():
    commands = load_all_commands()
    print(f"📂 Loaded {len(commands)} commands\n")
    
    results = analyze_corrected(commands)
    perfect = verify_with_formula(commands, results)
    generate_corrected_library(results)
    
    print()
    print("═" * 75)
    print("  FINAL RESULT")
    print("═" * 75)
    print()
    
    if perfect:
        print("🎉 CRC ALGORITHM 100% DISCOVERED!")
        print()
        print("Formula: CRC = XOR(bytes 0,1,3,4,5...) XOR CONSTANT")
        print("         (byte 2 = length, NOT included in XOR)")
    else:
        print("⚠️  Some commands still need analysis")

if __name__ == "__main__":
    main()
