#!/usr/bin/env python3
"""
PROLOGY CRC 100% Analyzer
Интеллектуальный поиск паттернов для всех типов команд
"""

import re
from collections import defaultdict

# Загрузка команд из лога
def load_commands_from_log():
    commands = []
    try:
        with open('/storage/emulated/0/Documents/prology_live.txt', 'r') as f:
            content = f.read()
            # Извлечение HEX строк
            matches = re.findall(r'Data \(hex\):\s*([0-9A-F ]+)', content)
            for match in matches:
                hex_str = match.strip().replace(' ', '')
                if len(hex_str) >= 4:  # Минимум 2 байта
                    try:
                        cmd = bytes.fromhex(hex_str)
                        commands.append(cmd)
                    except:
                        pass
    except FileNotFoundError:
        print("❌ Лог файл не найден!")
        return []
    
    return commands

# Загрузка из файла уникальных команд
def load_unique_commands():
    commands = []
    try:
        with open('/storage/emulated/0/Documents/prology_data/all_unique_commands.txt', 'r') as f:
            for line in f:
                hex_str = line.strip().replace(' ', '')
                if len(hex_str) >= 4:
                    try:
                        cmd = bytes.fromhex(hex_str)
                        commands.append(cmd)
                    except:
                        pass
    except:
        pass
    return commands

def xor_bytes(data):
    """XOR всех байт"""
    result = 0
    for b in data:
        result ^= b
    return result

def analyze_command_patterns(commands):
    """Умный анализ паттернов"""
    print("╔═══════════════════════════════════════════════════════════════════╗")
    print("║  PROLOGY CRC 100% Analyzer                                        ║")
    print("╚═══════════════════════════════════════════════════════════════════╝")
    print()
    
    # Группировка по структуре
    by_length = defaultdict(list)
    by_type = defaultdict(list)
    by_prefix = defaultdict(list)
    
    for cmd in commands:
        by_length[len(cmd)].append(cmd)
        if len(cmd) >= 4:
            by_type[cmd[3]].append(cmd)
        if len(cmd) >= 3:
            by_prefix[cmd[:3].hex()].append(cmd)
    
    print(f"📊 Загружено команд: {len(commands)}")
    print(f"📊 Уникальных длин: {len(by_length)}")
    print(f"📊 Уникальных типов: {len(by_type)}")
    print()
    
    # Анализ по длине
    print("═══════════════════════════════════════════════════════════════════")
    print("  ANALYSIS BY COMMAND LENGTH")
    print("═══════════════════════════════════════════════════════════════════")
    print()
    
    for length in sorted(by_length.keys()):
        cmds = by_length[length]
        print(f"Length {length} bytes: {len(cmds)} commands")
        
        # Проверка простого XOR
        xor_matches = 0
        for cmd in cmds[:10]:  # Первые 10
            if len(cmd) > 1:
                data = cmd[:-1]
                crc = cmd[-1]
                if xor_bytes(data) == crc:
                    xor_matches += 1
        
        if xor_matches > 0:
            print(f"  ✅ XOR match: {xor_matches}/{min(10, len(cmds))}")
        
        # Поиск констант
        constants = []
        for cmd in cmds:
            if len(cmd) > 1:
                data = cmd[:-1]
                crc = cmd[-1]
                const = crc ^ xor_bytes(data)
                constants.append(const)
        
        if constants:
            from collections import Counter
            const_counts = Counter(constants)
            most_common = const_counts.most_common(3)
            print(f"  Top constants: {[f'0x{c:02X}({n})' for c, n in most_common]}")
        
        print()
    
    # Детальный анализ по типам команд
    print()
    print("═══════════════════════════════════════════════════════════════════")
    print("  DETAILED ANALYSIS BY COMMAND TYPE")
    print("═══════════════════════════════════════════════════════════════════")
    print()
    
    results = {}
    
    for cmd_type in sorted(by_type.keys()):
        cmds = by_type[cmd_type]
        
        # Группировка по подкоманде (байт 4)
        by_subcmd = defaultdict(list)
        for cmd in cmds:
            if len(cmd) >= 5:
                by_subcmd[cmd[4]].append(cmd)
        
        print(f"Type 0x{cmd_type:02X}: {len(cmds)} commands, {len(by_subcmd)} subtypes")
        
        type_constants = {}
        
        for subcmd, subcmds in sorted(by_subcmd.items()):
            # Вычисление констант для подкоманды
            constants = []
            for cmd in subcmds:
                data = cmd[:-1]
                crc = cmd[-1]
                const = crc ^ xor_bytes(data)
                constants.append(const)
            
            if constants:
                from collections import Counter
                const_counts = Counter(constants)
                most_common = const_counts.most_common(1)[0]
                type_constants[subcmd] = most_common[0]
                
                match_percent = (most_common[1] / len(subcmds)) * 100
                
                if match_percent >= 90:
                    status = "✅"
                elif match_percent >= 50:
                    status = "⚠️"
                else:
                    status = "❌"
                
                print(f"  Subcmd 0x{subcmd:02X}: const=0x{most_common[0]:02X} ({most_common[1]}/{len(subcmds)} {match_percent:.0f}%) {status}")
        
        results[cmd_type] = type_constants
        print()
    
    return results

def generate_python_code(results):
    """Генерация Python кода с константами"""
    print()
    print("═══════════════════════════════════════════════════════════════════")
    print("  GENERATED PYTHON CODE")
    print("═══════════════════════════════════════════════════════════════════")
    print()
    
    print("CRC_CONSTANTS = {")
    for cmd_type in sorted(results.keys()):
        subcmds = results[cmd_type]
        print(f"    0x{cmd_type:02X}: {{  # Command type")
        for subcmd, const in sorted(subcmds.items()):
            print(f"        0x{subcmd:02X}: 0x{const:02X},")
        print("    }},")
    print("}")
    print()

def main():
    # Загрузка команд
    print("📂 Loading commands from log file...")
    commands = load_commands_from_log()
    
    if not commands:
        print("📂 Loading from unique commands file...")
        commands = load_unique_commands()
    
    if not commands:
        print("❌ No commands found!")
        return
    
    print(f"✅ Loaded {len(commands)} commands")
    print()
    
    # Анализ
    results = analyze_command_patterns(commands)
    
    # Генерация кода
    generate_python_code(results)
    
    # Сохранение результатов
    print()
    print("═══════════════════════════════════════════════════════════════════")
    print("  SAVING RESULTS")
    print("═══════════════════════════════════════════════════════════════════")
    print()
    
    # Сохранение в файл
    output_file = '/data/data/com.termux/files/home/crc_100_percent_results.txt'
    with open(output_file, 'w') as f:
        f.write("PROLOGY CRC 100% Analysis Results\n")
        f.write("=" * 75 + "\n\n")
        f.write(f"Total commands analyzed: {len(commands)}\n\n")
        f.write("CRC Constants by Command Type and Subcommand:\n\n")
        f.write("CRC_CONSTANTS = {\n")
        for cmd_type in sorted(results.keys()):
            subcmds = results[cmd_type]
            f.write(f"    0x{cmd_type:02X}: {{\n")
            for subcmd, const in sorted(subcmds.items()):
                f.write(f"        0x{subcmd:02X}: 0x{const:02X},\n")
            f.write("    },\n")
        f.write("}\n")
    
    print(f"✅ Results saved to: {output_file}")
    print()
    print("🎉 Analysis complete!")

if __name__ == "__main__":
    main()
