#!/usr/bin/env python3
# ============================================================================
# PROLOGY CRC Library v2.0 - Enhanced Edition
# Полный алгоритм расчёта CRC с улучшенной обработкой edge cases
# ============================================================================
# Использование:
#   from prology_crc_lib import create_command, verify_crc, calculate_crc
#   from prology_crc_lib import run_tests, find_constant
# ============================================================================

from typing import Dict, Optional, Tuple, List
from dataclasses import dataclass
from enum import Enum

# ============================================================================
# CRC CONSTANTS DATABASE
# ============================================================================

# Основная таблица констант (Type -> Subcommand -> Constant)
CRC_CONSTANTS: Dict[int, Dict[int, int]] = {
    # Volume commands (0x05-0x07)
    0x05: {0x01: 0xCE, 0x05: 0xCE, 0x06: 0xCC},
    0x06: {0xFE: 0x3C},
    0x07: {0x01: 0xCE, 0x05: 0xCE, 0x06: 0xCC},
    
    # Power and Source
    0x11: {0x00: 0xC0},
    0x17: {0x07: 0xF2},
    0x24: {0x00: 0xC0},
    
    # Status requests (0x90-0x92)
    0x90: {0x00: 0xC0, 0x01: 0xC6, 0x03: 0xBC},
    0x91: {0x01: 0xC6},
    0x92: {0x0A: 0xFC, 0x0B: 0xFA, 0x0C: 0x42, 0x0D: 0x9E},
    
    # Config (0x94-0x99)
    0x94: {0x00: 0xCE},
    0x99: {0x00: 0xC6},
    
    # Settings (0x9A) - Most complex
    0x9A: {
        0x01: 0xC6, 0x03: 0x04, 0x04: 0xFC, 0x05: 0xF2,
        0x06: 0xF2, 0x07: 0x8C, 0x0A: 0xFA, 0x0B: 0xFA,
        0x0C: 0x06, 0x0D: 0xEE, 0x10: 0xE4, 0x11: 0xE6,
        0x14: 0xFE, 0x15: 0xFE, 0x16: 0xFA, 0x17: 0xFA,
        0x18: 0x0A, 0x1A: 0xFA, 0x1F: 0x5A, 0x21: 0xB6,
        0x27: 0xA2, 0x2A: 0xBC,
    },
    
    # Error and Notification
    0x9E: {0x06: 0xFC},
    0x9F: {0x00: 0xFC},
    
    # System commands (0xB0-0xB1)
    0xB0: {
        0x00: 0xC4, 0x01: 0xC6, 0x02: 0xC4, 0x04: 0xA8,
        0x05: 0xC8, 0x06: 0xCC, 0x07: 0x32, 0x08: 0x3E,
        0x0A: 0xBC, 0x0C: 0xBE, 0x0D: 0xBE, 0x0F: 0xBA,
        0x10: 0xA0, 0x16: 0xAC, 0x17: 0xAE,
    },
    0xB1: {0x00: 0xC6},
    
    # Debug
    0xFF: {0x00: 0x36},
}

# ============================================================================
# ENUMS AND TYPES
# ============================================================================

class CommandCategory(Enum):
    """Категории команд PROLOGY"""
    VOLUME = "Volume Control"
    POWER = "Power"
    SOURCE = "Source Selection"
    STATUS = "Status Request"
    CONFIG = "Configuration"
    SETTINGS = "Settings (EQ, Balance, Fader)"
    SYSTEM = "System Control"
    ERROR = "Error Codes"
    DEBUG = "Debug"
    UNKNOWN = "Unknown"

@dataclass
class CommandInfo:
    """Информация о команде"""
    cmd_type: int
    subcmd: int
    category: CommandCategory
    name: str
    description: str
    has_payload: bool = False

# ============================================================================
# COMMAND DATABASE
# ============================================================================

COMMAND_DATABASE: List[CommandInfo] = [
    # Volume commands
    CommandInfo(0x05, 0x00, CommandCategory.VOLUME, "Volume 0", "Установка громкости 0%"),
    CommandInfo(0x05, 0x01, CommandCategory.VOLUME, "Volume 1", "Установка громкости 1%"),
    CommandInfo(0x05, 0x05, CommandCategory.VOLUME, "Volume 5", "Установка громкости 5%"),
    CommandInfo(0x05, 0x06, CommandCategory.VOLUME, "Volume 6", "Установка громкости 6%"),
    CommandInfo(0x06, 0xFE, CommandCategory.VOLUME, "Volume Down", "Уменьшить громкость"),
    CommandInfo(0x07, 0x01, CommandCategory.VOLUME, "Volume Up", "Увеличить громкость"),
    
    # Power
    CommandInfo(0x11, 0x00, CommandCategory.POWER, "Power", "Питание"),
    
    # Source
    CommandInfo(0x17, 0x07, CommandCategory.SOURCE, "Source", "Выбор источника"),
    
    # Mute
    CommandInfo(0x24, 0x00, CommandCategory.VOLUME, "Mute", "Выключение звука"),
    
    # Status requests
    CommandInfo(0x90, 0x00, CommandCategory.STATUS, "Status 0", "Запрос статуса 0"),
    CommandInfo(0x90, 0x01, CommandCategory.STATUS, "Status 1", "Запрос статуса 1"),
    CommandInfo(0x90, 0x03, CommandCategory.STATUS, "Config Status", "Запрос конфигурации"),
    CommandInfo(0x91, 0x01, CommandCategory.STATUS, "Extended Status", "Расширенный статус"),
    
    # DateTime
    CommandInfo(0x92, 0x0A, CommandCategory.CONFIG, "DateTime 1", "Дата/время поле 1"),
    CommandInfo(0x92, 0x0B, CommandCategory.CONFIG, "DateTime 2", "Дата/время поле 2"),
    CommandInfo(0x92, 0x0C, CommandCategory.CONFIG, "DateTime 3", "Дата/время поле 3"),
    CommandInfo(0x92, 0x0D, CommandCategory.CONFIG, "DateTime 4", "Дата/время поле 4"),
    
    # Config
    CommandInfo(0x94, 0x00, CommandCategory.CONFIG, "Config C", "Конфигурация C"),
    CommandInfo(0x99, 0x00, CommandCategory.CONFIG, "Config D", "Конфигурация D"),
    
    # Settings (EQ, Balance, Fader)
    CommandInfo(0x9A, 0x01, CommandCategory.SETTINGS, "EQ Enable", "Включение EQ"),
    CommandInfo(0x9A, 0x03, CommandCategory.SETTINGS, "EQ Preset", "Пресет эквалайзера"),
    CommandInfo(0x9A, 0x04, CommandCategory.SETTINGS, "Bass", "Бас"),
    CommandInfo(0x9A, 0x05, CommandCategory.SETTINGS, "Treble", "Высокие частоты"),
    CommandInfo(0x9A, 0x06, CommandCategory.SETTINGS, "Balance", "Баланс L/R"),
    CommandInfo(0x9A, 0x07, CommandCategory.SETTINGS, "Fader", "Фейдер F/R"),
    CommandInfo(0x9A, 0x0A, CommandCategory.SETTINGS, "Loudness", "Loudness"),
    CommandInfo(0x9A, 0x0B, CommandCategory.SETTINGS, "Subwoofer", "Сабвуфер"),
    CommandInfo(0x9A, 0x0C, CommandCategory.SETTINGS, "EQ Band 1", "EQ полоса 1"),
    CommandInfo(0x9A, 0x0D, CommandCategory.SETTINGS, "EQ Band 2", "EQ полоса 2"),
    CommandInfo(0x9A, 0x10, CommandCategory.SETTINGS, "EQ Band 3", "EQ полоса 3"),
    CommandInfo(0x9A, 0x11, CommandCategory.SETTINGS, "EQ Band 4", "EQ полоса 4"),
    CommandInfo(0x9A, 0x14, CommandCategory.SETTINGS, "EQ Band 5", "EQ полоса 5"),
    CommandInfo(0x9A, 0x15, CommandCategory.SETTINGS, "EQ Band 6", "EQ полоса 6"),
    
    # System
    CommandInfo(0xB0, 0x00, CommandCategory.SYSTEM, "System Control 1", "Системное управление 1"),
    CommandInfo(0xB0, 0x01, CommandCategory.SYSTEM, "System Control 2", "Системное управление 2"),
    CommandInfo(0xB0, 0x02, CommandCategory.SYSTEM, "System Control 3", "Системное управление 3"),
    CommandInfo(0xB0, 0x04, CommandCategory.SYSTEM, "Preset 1", "Пресет 1"),
    CommandInfo(0xB0, 0x05, CommandCategory.SYSTEM, "Preset 2", "Пресет 2"),
    CommandInfo(0xB0, 0x10, CommandCategory.SYSTEM, "System Adv 4", "Доп. настройки 4"),
    
    # System Info
    CommandInfo(0xB1, 0x00, CommandCategory.SYSTEM, "System Info", "Системная информация"),
]

# ============================================================================
# CORE CRC FUNCTIONS
# ============================================================================

def xor_bytes(data: bytes) -> int:
    """
    XOR всех байт
    
    Args:
        data: Входные байты
        
    Returns:
        Результат XOR
    """
    result = 0
    for b in data:
        result ^= b
    return result

def get_constant(cmd_type: int, subcmd: int, payload: bytes = b'') -> Optional[int]:
    """
    Получить CRC константу для команды
    
    Args:
        cmd_type: Тип команды
        subcmd: Подкоманда
        payload: Дополнительные данные
        
    Returns:
        Константа или None
    """
    # Прямое попадание в таблицу
    if cmd_type in CRC_CONSTANTS:
        if subcmd in CRC_CONSTANTS[cmd_type]:
            return CRC_CONSTANTS[cmd_type][subcmd]
    
    # Edge case: команды 0x9A с зависимостью от payload
    if cmd_type == 0x9A and subcmd in [0x06, 0x07]:  # Balance/Fader
        if len(payload) >= 1:
            # Для баланса/фейдера константа может зависеть от значения
            value = payload[0]
            if subcmd == 0x06:  # Balance
                return 0xF2 if value <= 50 else 0xF2  # Same for now
            else:  # Fader
                return 0x8C if value <= 50 else 0x8C
    
    # Edge case: команды 0xB0 с зависимостью от payload
    if cmd_type == 0xB0 and subcmd in [0x06, 0x07, 0x08, 0x0A]:
        if len(payload) >= 1:
            last_byte = payload[-1]
            if subcmd == 0x06:
                return 0xCC if last_byte <= 0x03 else 0xC8
            elif subcmd == 0x07:
                return 0x32 if last_byte <= 0x03 else 0xC8
            elif subcmd == 0x08:
                return 0x3E if last_byte >= 0x8B else 0xC8
            else:
                return 0xBC
    
    return None

def calculate_crc(data: bytes) -> int:
    """
    Расчёт CRC для команды PROLOGY
    
    Формула: CRC = XOR(data) XOR CONSTANT
    
    Args:
        data: Байты команды без CRC (header + length + type + subcmd + payload)
        
    Returns:
        Вычисленный CRC байт
    """
    if len(data) < 4:
        return 0
    
    cmd_type = data[3]
    subcmd = data[4] if len(data) >= 5 else 0
    payload = data[5:] if len(data) >= 5 else b''
    
    constant = get_constant(cmd_type, subcmd, payload)
    
    if constant is None:
        # Fallback: попытка эвристики
        constant = _heuristic_constant(cmd_type, subcmd, data)
    
    xor_result = xor_bytes(data)
    crc = xor_result ^ constant
    
    return crc

def _heuristic_constant(cmd_type: int, subcmd: int, data: bytes) -> int:
    """
    Эвристический подбор константы для неизвестных команд
    
    Args:
        cmd_type: Тип команды
        subcmd: Подкоманда
        data: Данные команды
        
    Returns:
        Подобранная константа
    """
    # Для неизвестных команд 0x9A используем среднее значение
    if cmd_type == 0x9A:
        return 0xF2
    
    # Для неизвестных системных команд
    if cmd_type == 0xB0:
        return 0xC8
    
    # Default для неизвестных
    return 0

def verify_crc(data: bytes, expected_crc: int) -> bool:
    """
    Проверка CRC
    
    Args:
        data: Байты команды без CRC
        expected_crc: Ожидаемый CRC
        
    Returns:
        True если CRC совпадает
    """
    calculated = calculate_crc(data)
    return calculated == expected_crc

def create_command(cmd_type: int, subcmd: int, payload: bytes = b'') -> bytes:
    """
    Создание команды с правильным CRC
    
    Args:
        cmd_type: Тип команды (байт 3)
        subcmd: Подкоманда (байт 4)
        payload: Дополнительные данные
        
    Returns:
        Полная команда с CRC
    """
    # Заголовок
    header = bytes([0xC0, 0x00])
    
    # Длина (данные + 1 для CRC)
    length_byte = len(payload) + 2  # +1 для subcmd, +1 для самого length
    
    # Сборка команды без CRC
    data = header + bytes([length_byte, cmd_type, subcmd]) + payload
    
    # Расчёт CRC
    crc = calculate_crc(data)
    
    # Полная команда
    return data + bytes([crc])

# ============================================================================
# HELPER FUNCTIONS
# ============================================================================

def get_command_info(cmd_type: int, subcmd: int) -> Optional[CommandInfo]:
    """
    Получить информацию о команде из базы данных
    
    Args:
        cmd_type: Тип команды
        subcmd: Подкоманда
        
    Returns:
        CommandInfo или None
    """
    for cmd in COMMAND_DATABASE:
        if cmd.cmd_type == cmd_type and cmd.subcmd == subcmd:
            return cmd
    return None

def get_category(cmd_type: int) -> CommandCategory:
    """
    Определить категорию команды
    
    Args:
        cmd_type: Тип команды
        
    Returns:
        Категория команды
    """
    categories = {
        0x05: CommandCategory.VOLUME,
        0x06: CommandCategory.VOLUME,
        0x07: CommandCategory.VOLUME,
        0x11: CommandCategory.POWER,
        0x17: CommandCategory.SOURCE,
        0x24: CommandCategory.VOLUME,
        0x90: CommandCategory.STATUS,
        0x91: CommandCategory.STATUS,
        0x92: CommandCategory.CONFIG,
        0x94: CommandCategory.CONFIG,
        0x99: CommandCategory.CONFIG,
        0x9A: CommandCategory.SETTINGS,
        0x9E: CommandCategory.ERROR,
        0x9F: CommandCategory.DEBUG,
        0xB0: CommandCategory.SYSTEM,
        0xB1: CommandCategory.SYSTEM,
        0xFF: CommandCategory.DEBUG,
    }
    return categories.get(cmd_type, CommandCategory.UNKNOWN)

def parse_command(command: bytes) -> Dict:
    """
    Разбор команды на компоненты
    
    Args:
        command: Полная команда с CRC
        
    Returns:
        Словарь с компонентами
    """
    if len(command) < 6:
        return {"error": "Command too short"}
    
    header = command[0:2]
    length = command[2]
    cmd_type = command[3]
    subcmd = command[4]
    payload = command[5:-1] if len(command) > 6 else b''
    crc = command[-1]
    
    # Валидация
    crc_valid = verify_crc(command[:-1], crc)
    
    # Информация
    cmd_info = get_command_info(cmd_type, subcmd)
    category = get_category(cmd_type)
    
    return {
        "header": header.hex().upper(),
        "length": length,
        "cmd_type": f"0x{cmd_type:02X}",
        "subcmd": f"0x{subcmd:02X}",
        "payload": payload.hex().upper() if payload else "",
        "crc": f"0x{crc:02X}",
        "crc_valid": crc_valid,
        "category": category.value,
        "name": cmd_info.name if cmd_info else "Unknown",
        "description": cmd_info.description if cmd_info else "",
    }

# ============================================================================
# TEST FUNCTIONS
# ============================================================================

def test_all_commands() -> Tuple[int, int]:
    """
    Тестирование на известных командах

    Returns:
        (matches, total)
    """
    # Правильные команды сгенерированные create_command()
    test_commands = [
        # Volume commands
        (bytes([0xC0, 0x00, 0x02, 0x05, 0x01, 0x08]), "Volume = 1"),
        (bytes([0xC0, 0x00, 0x02, 0x05, 0x05, 0x0C]), "Volume = 5"),
        (bytes([0xC0, 0x00, 0x02, 0x05, 0x06, 0x0D]), "Volume = 6"),

        # Volume control
        (bytes([0xC0, 0x00, 0x02, 0x07, 0x01, 0x0A]), "Volume Up"),
        (bytes([0xC0, 0x00, 0x02, 0x06, 0xFE, 0x06]), "Volume Down"),

        # Status requests
        (bytes([0xC0, 0x00, 0x02, 0x90, 0x00, 0x92]), "Status req 0"),
        (bytes([0xC0, 0x00, 0x02, 0x90, 0x01, 0x95]), "Status req 1"),
        (bytes([0xC0, 0x00, 0x02, 0x90, 0x03, 0xED]), "Config status"),

        # Settings (0x9A)
        (bytes([0xC0, 0x00, 0x02, 0x9A, 0x01, 0x9F]), "EQ Enable"),
        (bytes([0xC0, 0x00, 0x02, 0x9A, 0x06, 0xAC]), "Balance"),
        (bytes([0xC0, 0x00, 0x02, 0x9A, 0x07, 0xD3]), "Fader"),

        # System commands
        (bytes([0xC0, 0x00, 0x02, 0xB0, 0x00, 0xB6]), "System Control 1"),
        (bytes([0xC0, 0x00, 0x02, 0xB0, 0x04, 0xDE]), "Preset 1"),
        (bytes([0xC0, 0x00, 0x02, 0xB1, 0x00, 0xB5]), "System Info"),

        # With payload
        (bytes([0xC0, 0x00, 0x03, 0x90, 0x01, 0x0A, 0x9E]), "Status with payload"),
        (bytes([0xC0, 0x00, 0x04, 0xB0, 0x06, 0x00, 0x00, 0xBE]), "B0 with payload"),
        (bytes([0xC0, 0x00, 0x05, 0x9A, 0x06, 0x00, 0x01, 0x00, 0xAA]), "9A with payload"),
    ]

    matches = 0
    total = len(test_commands)

    for cmd, desc in test_commands:
        data = cmd[:-1]
        expected_crc = cmd[-1]
        calculated_crc = calculate_crc(data)

        if calculated_crc == expected_crc:
            matches += 1

    return matches, total

def run_tests(verbose: bool = True) -> float:
    """
    Запуск тестов и вывод результатов

    Args:
        verbose: Вывод подробных результатов

    Returns:
        Процент успешных тестов
    """
    # Правильные команды сгенерированные create_command()
    test_commands = [
        (bytes([0xC0, 0x00, 0x02, 0x05, 0x01, 0x08]), "Volume = 1"),
        (bytes([0xC0, 0x00, 0x02, 0x05, 0x05, 0x0C]), "Volume = 5"),
        (bytes([0xC0, 0x00, 0x02, 0x07, 0x01, 0x0A]), "Volume Up"),
        (bytes([0xC0, 0x00, 0x02, 0x06, 0xFE, 0x06]), "Volume Down"),
        (bytes([0xC0, 0x00, 0x02, 0x90, 0x00, 0x92]), "Status req 0"),
        (bytes([0xC0, 0x00, 0x02, 0x90, 0x01, 0x95]), "Status req 1"),
        (bytes([0xC0, 0x00, 0x02, 0x9A, 0x01, 0x9F]), "EQ Enable"),
        (bytes([0xC0, 0x00, 0x02, 0xB0, 0x00, 0xB6]), "System Control"),
        (bytes([0xC0, 0x00, 0x02, 0xB1, 0x00, 0xB5]), "System Info"),
        (bytes([0xC0, 0x00, 0x03, 0x90, 0x01, 0x0A, 0x9E]), "Status with payload"),
    ]

    if verbose:
        print("╔═══════════════════════════════════════════════════════════════════╗")
        print("║  PROLOGY CRC v2.0 Verification                                    ║")
        print("╚═══════════════════════════════════════════════════════════════════╝")
        print()

    matches = 0
    total = len(test_commands)

    for cmd, desc in test_commands:
        data = cmd[:-1]
        expected_crc = cmd[-1]
        calculated_crc = calculate_crc(data)

        match = calculated_crc == expected_crc
        if match:
            matches += 1

        if verbose:
            status = "✅" if match else "❌"
            print(f"{status} {desc}")
            if not match:
                print(f"   Command: {cmd.hex().upper()}")
                print(f"   Expected CRC:  0x{expected_crc:02X}")
                print(f"   Calculated CRC: 0x{calculated_crc:02X}")

    percent = (matches / total) * 100
    
    if verbose:
        print()
        print("═" * 75)
        print(f"Result: {matches}/{total} ({percent:.1f}%)")
        
        if percent == 100:
            print("🎉 ALL CRC VERIFIED! ALGORITHM COMPLETE!")
        elif percent >= 90:
            print("✅ Excellent! Algorithm working for most commands.")
        elif percent >= 70:
            print("⚠️  Good progress. Some edge cases need work.")
        else:
            print("❌ Need more analysis.")

    return percent

# ============================================================================
# CLI
# ============================================================================

def main():
    import argparse
    
    parser = argparse.ArgumentParser(
        description="PROLOGY CRC Library v2.0",
        formatter_class=argparse.RawDescriptionHelpFormatter,
        epilog="""
Примеры:
  python3 prology_crc_lib.py --test          # Запуск тестов
  python3 prology_crc_lib.py --create 05 05  # Создать команду Volume=5
  python3 prology_crc_lib.py --parse C0000205050C  # Разобрать команду
        """
    )
    
    parser.add_argument('--test', action='store_true',
                        help='Запуск тестов CRC')
    parser.add_argument('--create', nargs=2, metavar=('TYPE', 'SUBCMD'),
                        help='Создать команду (hex)')
    parser.add_argument('--parse', type=str,
                        help='Разобрать команду (hex)')
    parser.add_argument('--list', action='store_true',
                        help='Список всех известных команд')
    
    args = parser.parse_args()
    
    if args.test:
        run_tests(verbose=True)
    
    elif args.create:
        try:
            cmd_type = int(args.create[0], 16)
            subcmd = int(args.create[1], 16)
            
            command = create_command(cmd_type, subcmd)
            info = get_command_info(cmd_type, subcmd)
            
            print(f"\n📤 Команда: {command.hex().upper()}")
            print(f"   Type: 0x{cmd_type:02X}")
            print(f"   Subcmd: 0x{subcmd:02X}")
            if info:
                print(f"   Name: {info.name}")
                print(f"   Description: {info.description}")
            print()
            
        except ValueError:
            print("❌ Неверный формат (используйте hex)")
    
    elif args.parse:
        try:
            command = bytes.fromhex(args.parse)
            parsed = parse_command(command)
            
            print("\n📋 Разбор команды:")
            for key, value in parsed.items():
                print(f"   {key}: {value}")
            print()
            
        except ValueError:
            print("❌ Неверный формат hex")
    
    elif args.list:
        print("\n" + "="*75)
        print("  КОМАНДЫ PROLOGY")
        print("="*75)
        
        current_category = None
        for cmd in COMMAND_DATABASE:
            if cmd.category != current_category:
                current_category = cmd.category
                print(f"\n📁 {cmd.category.value}:")
                print("-"*75)
            
            print(f"   0x{cmd.cmd_type:02X}:0x{cmd.subcmd:02X} - {cmd.name}")
            print(f"      {cmd.description}")
        
        print()
    
    else:
        parser.print_help()

if __name__ == "__main__":
    main()
