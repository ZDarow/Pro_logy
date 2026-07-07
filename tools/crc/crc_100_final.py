#!/usr/bin/env python3
"""
PROLOGY CRC 100% - Final Deep Analysis
Полный анализ всех команд с поиском точных формул
"""

import re
from collections import defaultdict, Counter

def load_all_commands():
    """Загрузка всех команд из лога"""
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
    """XOR всех байт"""
    result = 0
    for b in data:
        result ^= b
    return result

def analyze_byte_dependencies(commands):
    """Глубокий анализ зависимостей CRC от байтов"""
    print("╔═══════════════════════════════════════════════════════════════════╗")
    print("║  PROLOGY CRC 100% - Deep Byte Analysis                            ║")
    print("╚═══════════════════════════════════════════════════════════════════╝")
    print()
    
    # Группировка по type + subcmd
    by_type_subcmd = defaultdict(list)
    
    for cmd in commands:
        if len(cmd) >= 5:
            key = (cmd[3], cmd[4])  # type, subcmd
            by_type_subcmd[key].append(cmd)
    
    print(f"📊 Найдено {len(by_type_subcmd)} уникальных type+subcmd комбинаций")
    print()
    
    results = {}
    problem_cases = []
    
    for (cmd_type, subcmd), cmds in sorted(by_type_subcmd.items()):
        if len(cmds) < 2:
            continue
        
        print(f"═" * 75)
        print(f"Type 0x{cmd_type:02X}, Subcmd 0x{subcmd:02X} ({len(cmds)} commands)")
        print()
        
        # Вычисление "implied constants" для каждой команды
        constants = []
        for cmd in cmds:
            data = cmd[:-1]
            crc = cmd[-1]
            implied_const = crc ^ xor_bytes(data)
            constants.append((implied_const, cmd))
        
        # Проверка постоянства константы
        const_counts = Counter(c[0] for c in constants)
        
        if len(const_counts) == 1:
            # Все константы одинаковые ✅
            const = list(const_counts.keys())[0]
            print(f"  ✅ CONSTANT: 0x{const:02X} (100% match)")
            results[(cmd_type, subcmd)] = {'const': const, 'formula': 'fixed'}
        else:
            # Разные константы - ищем зависимость
            print(f"  ⚠️  {len(const_counts)} different constants:")
            for const, count in const_counts.most_common(5):
                print(f"      0x{const:02X}: {count} commands")
            
            # Группировка по константам
            by_const = defaultdict(list)
            for const, cmd in constants:
                by_const[const].append(cmd)
            
            # Анализ паттернов для каждой константы
            for const, const_cmds in by_const.items():
                if len(const_cmds) >= 2:
                    print(f"\n  Analyzing constant 0x{const:02X} ({len(const_cmds)} cmds):")
                    
                    # Проверяем зависимость от конкретных байтов
                    for byte_pos in range(min(10, len(const_cmds[0]))):
                        byte_values = set(cmd[byte_pos] if len(cmd) > byte_pos else None for cmd in const_cmds)
                        if len(byte_values) == 1:
                            print(f"    byte[{byte_pos}] is constant: 0x{list(byte_values)[0]:02X}")
                    
                    # Проверяем корреляцию byte[5] с константой
                    byte5_values = [(cmd[5] if len(cmd) > 5 else 0, c[0]) for c in constants for c in [(cmd,)]]
                    
            # Сохраняем как проблемный случай
            problem_cases.append((cmd_type, subcmd, const_counts))
        
        print()
    
    return results, problem_cases

def find_formula_for_problematic(problem_cases, commands):
    """Поиск формул для проблемных команд"""
    print()
    print("═" * 75)
    print("  ANALYZING PROBLEMATIC CASES")
    print("═" * 75)
    print()
    
    formulas = {}
    
    for cmd_type, subcmd, const_counts in problem_cases[:10]:  # Первые 10
        print(f"Type 0x{cmd_type:02X}, Subcmd 0x{subcmd:02X}:")
        
        # Получаем все команды этого типа
        type_cmds = [cmd for cmd in commands if len(cmd) >= 5 and cmd[3] == cmd_type and cmd[4] == subcmd]
        
        # Пробуем разные формулы
        for const, count in const_counts.most_common(3):
            matching_cmds = []
            for cmd in type_cmds:
                data = cmd[:-1]
                crc = cmd[-1]
                implied = crc ^ xor_bytes(data)
                if implied == const:
                    matching_cmds.append(cmd)
            
            if len(matching_cmds) >= 2:
                print(f"\n  Constant 0x{const:02X} ({len(matching_cmds)} cmds):")
                
                # Анализируем байты
                for i in range(min(8, len(matching_cmds[0]))):
                    values = [cmd[i] for cmd in matching_cmds if len(cmd) > i]
                    if len(set(values)) == 1:
                        print(f"    byte[{i}] = 0x{values[0]:02X} (constant)")
                
                # Проверяем формулу CRC = XOR(data) XOR const XOR byte[N]
                for byte_pos in range(min(8, len(matching_cmds[0]))):
                    test_matches = 0
                    for cmd in type_cmds:
                        data = cmd[:-1]
                        crc = cmd[-1]
                        if len(cmd) > byte_pos:
                            test_crc = xor_bytes(data) ^ const ^ data[byte_pos]
                            if test_crc == crc:
                                test_matches += 1
                    
                    if test_matches > 0:
                        print(f"    Formula: CRC = XOR(data) XOR 0x{const:02X} XOR byte[{byte_pos}]")
                        print(f"    Matches: {test_matches}/{len(type_cmds)}")
                        
                        if test_matches == len(type_cmds):
                            formulas[(cmd_type, subcmd)] = {
                                'formula': 'xor_byte',
                                'const': const,
                                'byte_pos': byte_pos
                            }
        
        print()
    
    return formulas

def generate_final_library(results, formulas):
    """Генерация финальной библиотеки"""
    print()
    print("═" * 75)
    print("  GENERATED FINAL CRC LIBRARY")
    print("═" * 75)
    print()
    
    print("# PROLOGY CRC Constants - 100% Complete")
    print("CRC_CONSTANTS = {")
    
    # Группировка по типам
    by_type = defaultdict(dict)
    for (cmd_type, subcmd), data in results.items():
        by_type[cmd_type][subcmd] = data['const']
    
    for (cmd_type, subcmd), formula in formulas.items():
        if formula['formula'] == 'xor_byte':
            by_type[cmd_type][subcmd] = (formula['const'], formula['byte_pos'])
    
    for cmd_type in sorted(by_type.keys()):
        print(f"    0x{cmd_type:02X}: {{")
        for subcmd in sorted(by_type[cmd_type].keys()):
            val = by_type[cmd_type][subcmd]
            if isinstance(val, tuple):
                print(f"        0x{subcmd:02X}: (0x{val[0]:02X}, {val[1]}),  # XOR byte[{val[1]}]")
            else:
                print(f"        0x{subcmd:02X}: 0x{val:02X},")
        print("    }},")
    
    print("}")

def main():
    # Загрузка
    print("📂 Loading commands...")
    commands = load_all_commands()
    print(f"✅ Loaded {len(commands)} commands")
    print()
    
    # Анализ
    results, problem_cases = analyze_byte_dependencies(commands)
    
    # Поиск формул
    formulas = find_formula_for_problematic(problem_cases, commands)
    
    # Генерация
    generate_final_library(results, formulas)
    
    # Статистика
    print()
    print("═" * 75)
    print("  FINAL STATISTICS")
    print("═" * 75)
    print()
    print(f"  Simple constants: {len(results)}")
    print(f"  Complex formulas: {len(formulas)}")
    print(f"  Total coverage: {len(results) + len(formulas)} type+subcmd combinations")
    
    # Сохранение
    output = f"""
PROLOGY CRC 100% Analysis Results
{'=' * 75}

Simple Constants: {len(results)}
Complex Formulas: {len(formulas)}
Total Coverage: {len(results) + len(formulas)}

RESULTS = {results}
FORMULAS = {formulas}
"""
    
    with open('/data/data/com.termux/files/home/crc_100_final_results.txt', 'w') as f:
        f.write(output)
    
    print()
    print(f"✅ Results saved to: /data/data/com.termux/files/home/crc_100_final_results.txt")

if __name__ == "__main__":
    main()
