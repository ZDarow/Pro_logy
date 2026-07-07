#!/usr/bin/env python3
# ============================================================================
# PROLOGY Configuration Manager v1.0
# Экспорт, импорт и управление конфигурациями PROLOGY
# ============================================================================
# Использование:
#   python3 prology_config.py export --file my_config.json    # Экспорт
#   python3 prology_config.py import --file my_config.json    # Импорт
#   python3 prology_config.py list                            # Список конфигов
#   python3 prology_config.py compare config1.json config2.json  # Сравнение
# ============================================================================

import json
import sys
from datetime import datetime
from pathlib import Path
from typing import Dict, List, Optional, Any
from dataclasses import dataclass, asdict

# Проверка импортов
try:
    from prology_crc_lib import create_command
except ImportError:
    print("⚠️  prology_crc_lib не найден, используем встроенную реализацию")
    sys.path.insert(0, str(Path(__file__).parent))
    from prology_crc import create_command

# ============================================================================
# ТИПЫ ДАННЫХ
# ============================================================================

@dataclass
class EQSettings:
    """Настройки эквалайзера"""
    enabled: bool = True
    preset: str = "Flat"
    bass: int = 0  # -10 to +10
    treble: int = 0  # -10 to +10
    balance: int = 0  # -10 (L) to +10 (R)
    fader: int = 0  # -10 (F) to +10 (R)
    loudness: bool = False
    subwoofer: int = 50  # 0 to 100
    eq_bands: List[Dict] = None

    def __post_init__(self):
        if self.eq_bands is None:
            self.eq_bands = []

@dataclass
class SystemSettings:
    """Системные настройки"""
    volume: int = 20
    preset: str = "User 1"
    source: str = "Bluetooth"

@dataclass
class PrologyConfig:
    """Полная конфигурация PROLOGY"""
    name: str = "Default"
    description: str = ""
    created: str = ""
    version: str = "1.0"
    
    eq: EQSettings = None
    system: SystemSettings = None
    
    def __post_init__(self):
        if self.eq is None:
            self.eq = EQSettings()
        if self.system is None:
            self.system = SystemSettings()
        if not self.created:
            self.created = datetime.now().isoformat()

# ============================================================================
# МЕНЕДЖЕР КОНФИГУРАЦИЙ
# ============================================================================

class ConfigManager:
    """Менеджер конфигураций PROLOGY"""

    # Маппинг пресетов EQ
    EQ_PRESET_MAP = {
        "Flat": 0x00,
        "Rock": 0x01,
        "Pop": 0x02,
        "Jazz": 0x03,
        "Classical": 0x04,
        "Dance": 0x05,
        "Custom": 0x06,
        "Live": 0x07,
        "Loud": 0x08,
        "Soft": 0x09,
        "Bass Boost": 0x0A,
    }

    # Маппинг источников
    SOURCE_MAP = {
        "FM": 0x00,
        "AM": 0x01,
        "USB": 0x02,
        "AUX": 0x03,
        "Bluetooth": 0x04,
        "SD Card": 0x05,
        "MP3": 0x06,
    }

    # Директория для конфигов
    CONFIG_DIR = Path(__file__).parent / "configs"

    def __init__(self):
        self.CONFIG_DIR.mkdir(exist_ok=True)

    def create_config(self, name: str = "Default") -> PrologyConfig:
        """Создание новой конфигурации"""
        return PrologyConfig(name=name)

    def load_config(self, filepath: str) -> PrologyConfig:
        """Загрузка конфигурации из файла"""
        path = Path(filepath)
        if not path.exists():
            # Поиск в директории конфигов
            path = self.CONFIG_DIR / filepath
            if not path.suffix:
                path = path.with_suffix('.json')
            if not path.exists():
                raise FileNotFoundError(f"Конфигурация не найдена: {filepath}")

        with open(path, 'r', encoding='utf-8') as f:
            data = json.load(f)

        # Восстановление структуры
        eq_data = data.get('eq', {})
        system_data = data.get('system', {})

        config = PrologyConfig(
            name=data.get('name', 'Unknown'),
            description=data.get('description', ''),
            created=data.get('created', ''),
            version=data.get('version', '1.0'),
            eq=EQSettings(
                enabled=eq_data.get('enabled', True),
                preset=eq_data.get('preset', 'Flat'),
                bass=eq_data.get('bass', 0),
                treble=eq_data.get('treble', 0),
                balance=eq_data.get('balance', 0),
                fader=eq_data.get('fader', 0),
                loudness=eq_data.get('loudness', False),
                subwoofer=eq_data.get('subwoofer', 50),
                eq_bands=eq_data.get('eq_bands', []),
            ),
            system=SystemSettings(
                volume=system_data.get('volume', 20),
                preset=system_data.get('preset', 'User 1'),
                source=system_data.get('source', 'Bluetooth'),
            ),
        )

        return config

    def save_config(self, config: PrologyConfig, filepath: Optional[str] = None) -> str:
        """Сохранение конфигурации в файл"""
        if filepath is None:
            filepath = self.CONFIG_DIR / f"{config.name.lower().replace(' ', '_')}.json"
        else:
            filepath = Path(filepath)

        data = {
            'name': config.name,
            'description': config.description,
            'created': config.created,
            'version': config.version,
            'eq': asdict(config.eq),
            'system': asdict(config.system),
        }

        with open(filepath, 'w', encoding='utf-8') as f:
            json.dump(data, f, indent=2, ensure_ascii=False)

        return str(filepath)

    def create_default_presets(self) -> List[str]:
        """Создание стандартных пресетов"""
        presets = [
            {
                'name': 'Flat',
                'description': 'Плоская АЧХ (без обработки)',
                'eq': {'enabled': True, 'preset': 'Flat', 'bass': 0, 'treble': 0, 'balance': 0, 'fader': 0, 'loudness': False, 'subwoofer': 50},
                'system': {'volume': 20},
            },
            {
                'name': 'Rock',
                'description': 'Рок музыка (усиленные басы и высокие)',
                'eq': {'enabled': True, 'preset': 'Rock', 'bass': 4, 'treble': 3, 'balance': 0, 'fader': -2, 'loudness': True, 'subwoofer': 70},
                'system': {'volume': 25},
            },
            {
                'name': 'Pop',
                'description': 'Поп музыка (сбалансированный звук)',
                'eq': {'enabled': True, 'preset': 'Pop', 'bass': 2, 'treble': 2, 'balance': 0, 'fader': 0, 'loudness': True, 'subwoofer': 60},
                'system': {'volume': 22},
            },
            {
                'name': 'Jazz',
                'description': 'Джаз (мягкие высокие частоты)',
                'eq': {'enabled': True, 'preset': 'Jazz', 'bass': 3, 'treble': -2, 'balance': 0, 'fader': 0, 'loudness': False, 'subwoofer': 55},
                'system': {'volume': 18},
            },
            {
                'name': 'Classical',
                'description': 'Классическая музыка (естественный звук)',
                'eq': {'enabled': True, 'preset': 'Classical', 'bass': 1, 'treble': 1, 'balance': 0, 'fader': 0, 'loudness': False, 'subwoofer': 40},
                'system': {'volume': 15},
            },
            {
                'name': 'Dance',
                'description': 'Танцевальная музыка (максимальные басы)',
                'eq': {'enabled': True, 'preset': 'Dance', 'bass': 6, 'treble': 2, 'balance': 0, 'fader': 0, 'loudness': True, 'subwoofer': 85},
                'system': {'volume': 28},
            },
            {
                'name': 'Bass Boost',
                'description': 'Максимальный бас',
                'eq': {'enabled': True, 'preset': 'Bass Boost', 'bass': 10, 'treble': 0, 'balance': 0, 'fader': 0, 'loudness': True, 'subwoofer': 100},
                'system': {'volume': 25},
            },
            {
                'name': 'Vocal',
                'description': 'Вокал (подчёркнутые средние частоты)',
                'eq': {'enabled': True, 'preset': 'Custom', 'bass': -2, 'treble': 4, 'balance': 0, 'fader': 0, 'loudness': False, 'subwoofer': 30},
                'system': {'volume': 20},
            },
        ]

        saved_files = []
        for preset in presets:
            config = PrologyConfig(
                name=preset['name'],
                description=preset['description'],
                eq=EQSettings(**preset['eq']),
                system=SystemSettings(**preset['system']),
            )
            filepath = self.save_config(config)
            saved_files.append(filepath)

        return saved_files

    def list_configs(self) -> List[Dict]:
        """Список доступных конфигураций"""
        configs = []

        # Поиск в текущей директории
        for pattern in ['*.json', 'config*.json']:
            for path in Path(__file__).parent.glob(pattern):
                if 'prology_config' not in path.name:
                    configs.append(self._get_config_info(path))

        # Поиск в директории конфигов
        if self.CONFIG_DIR.exists():
            for path in self.CONFIG_DIR.glob('*.json'):
                configs.append(self._get_config_info(path))

        return configs

    def _get_config_info(self, path: Path) -> Dict:
        """Получение информации о конфигурации"""
        try:
            with open(path, 'r', encoding='utf-8') as f:
                data = json.load(f)
            return {
                'file': str(path),
                'name': data.get('name', path.stem),
                'created': data.get('created', 'Unknown'),
                'description': data.get('description', ''),
            }
        except:
            return {
                'file': str(path),
                'name': path.stem,
                'error': 'Cannot read',
            }

    def compare_configs(self, config1: PrologyConfig, config2: PrologyConfig) -> Dict:
        """Сравнение двух конфигураций"""
        diff = {
            'eq': {},
            'system': {},
            'identical': True,
        }

        # Сравнение EQ
        eq1 = asdict(config1.eq)
        eq2 = asdict(config2.eq)
        for key in eq1:
            if eq1[key] != eq2.get(key):
                diff['eq'][key] = {'old': eq1[key], 'new': eq2[key]}
                diff['identical'] = False

        # Сравнение System
        sys1 = asdict(config1.system)
        sys2 = asdict(config2.system)
        for key in sys1:
            if sys1[key] != sys2.get(key):
                diff['system'][key] = {'old': sys1[key], 'new': sys2[key]}
                diff['identical'] = False

        return diff

    def config_to_commands(self, config: PrologyConfig) -> List[Dict]:
        """Преобразование конфигурации в команды PROLOGY"""
        commands = []

        # 1. Включение EQ
        cmd = create_command(0x9A, 0x01, bytes([1 if config.eq.enabled else 0]))
        commands.append({
            'name': 'EQ Enable' if config.eq.enabled else 'EQ Disable',
            'command': cmd.hex().upper(),
            'type': 0x9A,
            'subcmd': 0x01,
        })

        # 2. Пресет EQ
        preset_value = self.EQ_PRESET_MAP.get(config.eq.preset, 0x00)
        cmd = create_command(0x9A, 0x03, bytes([preset_value]))
        commands.append({
            'name': f'EQ Preset: {config.eq.preset}',
            'command': cmd.hex().upper(),
            'type': 0x9A,
            'subcmd': 0x03,
        })

        # 3. Бас (0-100, где 50 = 0)
        bass_value = min(100, max(0, config.eq.bass + 50))
        cmd = create_command(0x9A, 0x04, bytes([bass_value]))
        commands.append({
            'name': f'Bass: {config.eq.bass:+d}',
            'command': cmd.hex().upper(),
            'type': 0x9A,
            'subcmd': 0x04,
        })

        # 4. Высокие частоты
        treble_value = min(100, max(0, config.eq.treble + 50))
        cmd = create_command(0x9A, 0x05, bytes([treble_value]))
        commands.append({
            'name': f'Treble: {config.eq.treble:+d}',
            'command': cmd.hex().upper(),
            'type': 0x9A,
            'subcmd': 0x05,
        })

        # 5. Баланс (0-100, где 50 = центр)
        balance_value = min(100, max(0, config.eq.balance + 50))
        cmd = create_command(0x9A, 0x06, bytes([balance_value]))
        commands.append({
            'name': f'Balance: {config.eq.balance:+d}',
            'command': cmd.hex().upper(),
            'type': 0x9A,
            'subcmd': 0x06,
        })

        # 6. Фейдер
        fader_value = min(100, max(0, config.eq.fader + 50))
        cmd = create_command(0x9A, 0x07, bytes([fader_value]))
        commands.append({
            'name': f'Fader: {config.eq.fader:+d}',
            'command': cmd.hex().upper(),
            'type': 0x9A,
            'subcmd': 0x07,
        })

        # 7. Loudness
        cmd = create_command(0x9A, 0x0A, bytes([1 if config.eq.loudness else 0]))
        commands.append({
            'name': 'Loudness ON' if config.eq.loudness else 'Loudness OFF',
            'command': cmd.hex().upper(),
            'type': 0x9A,
            'subcmd': 0x0A,
        })

        # 8. Сабвуфер
        cmd = create_command(0x9A, 0x0B, bytes([config.eq.subwoofer]))
        commands.append({
            'name': f'Subwoofer: {config.eq.subwoofer}%',
            'command': cmd.hex().upper(),
            'type': 0x9A,
            'subcmd': 0x0B,
        })

        # 9. Громкость
        cmd = create_command(0x05, config.system.volume & 0xFF)
        commands.append({
            'name': f'Volume: {config.system.volume}',
            'command': cmd.hex().upper(),
            'type': 0x05,
            'subcmd': config.system.volume & 0xFF,
        })

        return commands

    def export_commands(self, config: PrologyConfig, filepath: Optional[str] = None) -> str:
        """Экспорт команд в текстовый файл"""
        commands = self.config_to_commands(config)

        if filepath is None:
            filepath = self.CONFIG_DIR / f"{config.name.lower().replace(' ', '_')}_commands.txt"
        else:
            filepath = Path(filepath)

        with open(filepath, 'w', encoding='utf-8') as f:
            f.write(f"# PROLOGY Configuration: {config.name}\n")
            f.write(f"# Created: {config.created}\n")
            f.write(f"# Description: {config.description}\n")
            f.write("#" + "="*74 + "\n")
            f.write("\n")

            for i, cmd in enumerate(commands, 1):
                f.write(f"{i}. {cmd['name']}\n")
                f.write(f"   HEX: {cmd['command']}\n")
                f.write(f"   Type: 0x{cmd['type']:02X}, Subcmd: 0x{cmd['subcmd']:02X}\n")
                f.write("\n")

        return str(filepath)


# ============================================================================
# CLI
# ============================================================================

def main():
    import argparse

    parser = argparse.ArgumentParser(
        description="PROLOGY Configuration Manager v1.0",
        formatter_class=argparse.RawDescriptionHelpFormatter,
        epilog="""
Примеры:
  python3 prology_config.py create --name "Rock Concert"
  python3 prology_config.py export --file rock.json
  python3 prology_config.py import --file rock.json
  python3 prology_config.py list
  python3 prology_config.py compare config1.json config2.json
  python3 prology_config.py commands --file rock.json --output commands.txt
        """
    )

    subparsers = parser.add_subparsers(dest='command', help='Команды')

    # Create
    create_parser = subparsers.add_parser('create', help='Создать конфигурацию')
    create_parser.add_argument('--name', type=str, default='Default',
                               help='Имя конфигурации')
    create_parser.add_argument('--output', type=str,
                               help='Сохранить в файл')

    # Export
    export_parser = subparsers.add_parser('export', help='Экспорт конфигурации')
    export_parser.add_argument('--file', type=str, required=True,
                               help='Имя файла для экспорта')
    export_parser.add_argument('--name', type=str, default='Default',
                               help='Имя конфигурации')

    # Import
    import_parser = subparsers.add_parser('import', help='Импорт конфигурации')
    import_parser.add_argument('--file', type=str, required=True,
                               help='Имя файла для импорта')
    import_parser.add_argument('--show', action='store_true',
                               help='Показать конфигурацию')

    # List
    list_parser = subparsers.add_parser('list', help='Список конфигураций')

    # Presets
    presets_parser = subparsers.add_parser('presets', help='Создать стандартные пресеты')
    presets_parser.add_argument('--output-dir', type=str,
                                help='Директория для сохранения (по умолчанию: configs/)')

    # Compare
    compare_parser = subparsers.add_parser('compare', help='Сравнение конфигураций')
    compare_parser.add_argument('config1', type=str, help='Первый файл')
    compare_parser.add_argument('config2', type=str, help='Второй файл')

    # Commands
    commands_parser = subparsers.add_parser('commands', help='Генерация команд')
    commands_parser.add_argument('--file', type=str, required=True,
                                 help='Файл конфигурации')
    commands_parser.add_argument('--output', type=str,
                                 help='Выходной файл')
    commands_parser.add_argument('--send', action='store_true',
                                 help='Отправить команды (требуется устройство)')

    args = parser.parse_args()

    manager = ConfigManager()

    if args.command == 'create':
        config = manager.create_config(args.name)
        if args.output:
            filepath = manager.save_config(config, args.output)
            print(f"✅ Конфигурация сохранена: {filepath}")
        else:
            print(f"✅ Конфигурация создана: {config.name}")
            print(f"   Для сохранения: python3 prology_config.py export --file {config.name.lower()}.json")

    elif args.command == 'export':
        config = manager.create_config(args.name)
        filepath = manager.save_config(config, args.file)
        print(f"✅ Конфигурация экспортирована: {filepath}")

    elif args.command == 'import':
        try:
            config = manager.load_config(args.file)
            print(f"✅ Конфигурация импортирована: {config.name}")
            
            if args.show:
                print()
                print("="*75)
                print(f"  {config.name}")
                print("="*75)
                print(f"  Created: {config.created}")
                print(f"  Description: {config.description}")
                print()
                print("  EQ Settings:")
                print(f"    Enabled: {config.eq.enabled}")
                print(f"    Preset: {config.eq.preset}")
                print(f"    Bass: {config.eq.bass:+d}")
                print(f"    Treble: {config.eq.treble:+d}")
                print(f"    Balance: {config.eq.balance:+d}")
                print(f"    Fader: {config.eq.fader:+d}")
                print(f"    Loudness: {config.eq.loudness}")
                print(f"    Subwoofer: {config.eq.subwoofer}%")
                print()
                print("  System:")
                print(f"    Volume: {config.system.volume}")
                print(f"    Preset: {config.system.preset}")
                print(f"    Source: {config.system.source}")
                print()
        except FileNotFoundError as e:
            print(f"❌ Ошибка: {e}")
            sys.exit(1)

    elif args.command == 'list':
        configs = manager.list_configs()
        if not configs:
            print("❌ Конфигурации не найдены")
            print()
            print("💡 Создайте конфигурацию:")
            print("   python3 prology_config.py create --name \"My Config\"")
        else:
            print("="*75)
            print("  ДОСТУПНЫЕ КОНФИГУРАЦИИ")
            print("="*75)
            for cfg in configs:
                print(f"\n  📁 {cfg.get('name', 'Unknown')}")
                print(f"     Файл: {cfg['file']}")
                if 'created' in cfg:
                    print(f"     Создана: {cfg['created']}")
                if 'description' in cfg:
                    print(f"     Описание: {cfg['description']}")
            print()

    elif args.command == 'presets':
        # Создание стандартных пресетов
        print("="*75)
        print("  СОЗДАНИЕ СТАНДАРТНЫХ ПРЕСЕТОВ")
        print("="*75)
        
        if args.output_dir:
            manager.CONFIG_DIR = Path(args.output_dir)
            manager.CONFIG_DIR.mkdir(exist_ok=True)
        
        saved_files = manager.create_default_presets()
        
        print(f"\n✅ Создано пресетов: {len(saved_files)}\n")
        for filepath in saved_files:
            print(f"  📁 {filepath}")
        print()
        print("💡 Используйте пресеты:")
        print("   python3 prology_sender.py --apply-config configs/rock.json")
        print()

    elif args.command == 'compare':
        try:
            config1 = manager.load_config(args.config1)
            config2 = manager.load_config(args.config2)
            
            diff = manager.compare_configs(config1, config2)
            
            print("="*75)
            print(f"  СРАВНЕНИЕ КОНФИГУРАЦИЙ")
            print("="*75)
            print(f"  Config 1: {config1.name}")
            print(f"  Config 2: {config2.name}")
            print("="*75)
            
            if diff['identical']:
                print("\n  ✅ Конфигурации идентичны")
            else:
                print("\n  📊 Различия:")
                
                if diff['eq']:
                    print("\n  EQ Settings:")
                    for key, values in diff['eq'].items():
                        print(f"    {key}: {values['old']} → {values['new']}")
                
                if diff['system']:
                    print("\n  System:")
                    for key, values in diff['system'].items():
                        print(f"    {key}: {values['old']} → {values['new']}")
            print()
            
        except FileNotFoundError as e:
            print(f"❌ Ошибка: {e}")
            sys.exit(1)

    elif args.command == 'commands':
        try:
            config = manager.load_config(args.file)
            
            if args.output:
                filepath = manager.export_commands(config, args.output)
                print(f"✅ Команды экспортированы: {filepath}")
            else:
                commands = manager.config_to_commands(config)
                print("="*75)
                print(f"  КОМАНДЫ ДЛЯ: {config.name}")
                print("="*75)
                for i, cmd in enumerate(commands, 1):
                    print(f"\n  {i}. {cmd['name']}")
                    print(f"     HEX: {cmd['command']}")
                print()
            
            if args.send:
                print("⚠️  Отправка команд требует подключённого устройства")
                print("   Используйте: python3 prology_sender.py --interactive")
            
        except FileNotFoundError as e:
            print(f"❌ Ошибка: {e}")
            sys.exit(1)

    else:
        parser.print_help()

if __name__ == "__main__":
    main()
