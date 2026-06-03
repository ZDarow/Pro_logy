#!/usr/bin/env python3
"""
Dart ELF Analyzer - Анализ libapp.so для извлечения Dart метаданных
Анализ структуры Dart snapshot без полной декомпиляции
"""

import struct
import re
import sys
from collections import defaultdict

class DartELFAnalyzer:
    def __init__(self, filepath):
        self.filepath = filepath
        self.data = None
        self.strings = []
        self.dart_objects = defaultdict(list)
        
    def load(self):
        """Загрузка ELF файла"""
        with open(self.filepath, 'rb') as f:
            self.data = f.read()
        print(f"✓ Загружено {len(self.data):,} байт")
        
    def extract_strings(self, min_length=6):
        """Извлечение ASCII строк"""
        pattern = rb'[\x20-\x7e]{' + str(min_length).encode() + rb',}'
        matches = re.findall(pattern, self.data)
        self.strings = [m.decode('ascii', errors='ignore') for m in matches]
        print(f"✓ Найдено {len(self.strings):,} строк")
        
    def find_dart_patterns(self):
        """Поиск Dart-специфичных паттернов"""
        patterns = {
            'classes': [],
            'functions': [],
            'libraries': [],
            'constants': []
        }
        
        # Паттерны для классов Dart
        class_pattern = rb'_([A-Z][a-zA-Z0-9]+)State@|&([A-Z][a-zA-Z0-9]+)&|([A-Z][a-zA-Z0-9]+)\.'
        for match in re.finditer(class_pattern, self.data):
            name = match.group(1) or match.group(2) or match.group(3)
            if name and len(name) > 2:
                patterns['classes'].append(name.decode('ascii', errors='ignore'))
        
        # Паттерны для функций
        func_pattern = rb'([a-z]+[A-Z][a-zA-Z0-9]*)(?:@|\.|&)'
        for match in re.finditer(func_pattern, self.data):
            name = match.group(1)
            if name and len(name) > 3:
                patterns['functions'].append(name.decode('ascii', errors='ignore'))
        
        # Паттерны для библиотек
        lib_pattern = rb'package:([a-zA-Z0-9_]+/[a-zA-Z0-9_/]+)'
        for match in re.finditer(lib_pattern, self.data):
            patterns['libraries'].append(match.group(1).decode('ascii', errors='ignore'))
        
        # Константы
        const_pattern = rb'@[0-9a-f]{8,}'
        for match in re.finditer(const_pattern, self.data):
            patterns['constants'].append(match.group(0).decode('ascii'))
        
        return patterns
        
    def find_protocol_data(self):
        """Поиск данных протокола"""
        protocol = {
            'mcu_codes': set(),
            'commands': set(),
            'presets': set(),
            'channels': set()
        }
        
        # MCU коды
        for s in self.strings:
            if re.match(r'^MCU_\d+', s):
                protocol['mcu_codes'].add(s)
            elif re.match(r'^EQ_\d+[A-Z]*$', s):
                protocol['presets'].add(s)
            elif re.match(r'^CHANNEL_\d+$', s):
                protocol['channels'].add(s)
            elif re.match(r'^(FLAT|CUSTOM|CLASSICAL|JAZZ|ROCK|POP|DANCE|USER)', s):
                protocol['presets'].add(s)
                
        # Команды парсеров
        parser_pattern = r'ParserCmdSet\|_parser(\w+)'
        for s in self.strings:
            match = re.match(parser_pattern, s)
            if match:
                protocol['commands'].add(f"_parser{match.group(1)}")
                
        return protocol
        
    def find_function_calls(self):
        """Поиск вызовов функций"""
        calls = set()
        call_patterns = [
            r'send\w+@',
            r'get\w+@',
            r'set\w+@',
            r'write\w+@',
            r'_\w+@',
        ]
        
        for pattern in call_patterns:
            for match in re.finditer(pattern, ''.join(self.strings)):
                calls.add(match.group(0).rstrip('@'))
                
        return sorted(calls)
        
    def find_class_references(self):
        """Поиск ссылок на классы"""
        classes = set()
        
        # Паттерны классов Flutter
        flutter_patterns = [
            r'__([A-Z][a-zA-Z0-9]+)&',
            r'_([A-Z][a-zA-Z0-9]+)State',
            r'([A-Z][a-zA-Z0-9]+)Listener',
            r'([A-Z][a-zA-Z0-9]+)Sender',
            r'([A-Z][a-zA-Z0-9]+)Helper',
        ]
        
        text = ''.join(self.strings)
        for pattern in flutter_patterns:
            for match in re.finditer(pattern, text):
                classes.add(match.group(1) if match.lastindex else match.group(0))
                
        return sorted(classes)
        
    def generate_report(self):
        """Генерация отчёта"""
        print("\n" + "="*70)
        print(" ОТЧЁТ АНАЛИЗА DART SNAPSHOT")
        print("="*70)
        
        # Паттерны
        patterns = self.find_dart_patterns()
        print(f"\n📦 Классы Dart: {len(set(patterns['classes']))}")
        for cls in sorted(set(patterns['classes']))[:20]:
            print(f"   - {cls}")
            
        print(f"\n📚 Библиотеки: {len(set(patterns['libraries']))}")
        for lib in sorted(set(patterns['libraries']))[:20]:
            print(f"   - package:{lib}")
            
        # Протокол
        protocol = self.find_protocol_data()
        print(f"\n🔧 MCU коды: {len(protocol['mcu_codes'])}")
        for mcu in sorted(protocol['mcu_codes']):
            print(f"   - {mcu}")
            
        print(f"\n📡 Парсеры команд: {len(protocol['commands'])}")
        for cmd in sorted(protocol['commands']):
            print(f"   - {cmd}")
            
        print(f"\n🎛 Пресеты эквалайзера: {len(protocol['presets'])}")
        for preset in sorted(protocol['presets'])[:30]:
            print(f"   - {preset}")
            
        print(f"\n🔊 Аудио каналы: {len(protocol['channels'])}")
        for ch in sorted(protocol['channels'])[:10]:
            print(f"   - {ch}")
            
        # Функции
        calls = self.find_function_calls()
        print(f"\n⚡ Функции (send/get/set/write): {len(calls)}")
        for call in calls[:40]:
            print(f"   - {call}")
            
        # Классы
        classes = self.find_class_references()
        print(f"\n🏗 Классы Flutter: {len(classes)}")
        for cls in classes[:30]:
            print(f"   - {cls}")
            
        print("\n" + "="*70)
        
    def export_to_file(self, output_path):
        """Экспорт результатов в файл"""
        with open(output_path, 'w', encoding='utf-8') as f:
            f.write("DART SNAPSHOT ANALYSIS REPORT\n")
            f.write("="*50 + "\n\n")
            
            patterns = self.find_dart_patterns()
            protocol = self.find_protocol_data()
            calls = self.find_function_calls()
            classes = self.find_class_references()
            
            f.write("CLASSES:\n")
            for cls in sorted(set(patterns['classes'])):
                f.write(f"  {cls}\n")
                
            f.write("\nLIBRARIES:\n")
            for lib in sorted(set(patterns['libraries'])):
                f.write(f"  package:{lib}\n")
                
            f.write("\nMCU CODES:\n")
            for mcu in sorted(protocol['mcu_codes']):
                f.write(f"  {mcu}\n")
                
            f.write("\nPARSERS:\n")
            for cmd in sorted(protocol['commands']):
                f.write(f"  {cmd}\n")
                
            f.write("\nPRESETS:\n")
            for preset in sorted(protocol['presets']):
                f.write(f"  {preset}\n")
                
            f.write("\nFUNCTIONS:\n")
            for call in calls:
                f.write(f"  {call}\n")
                
        print(f"✓ Экспорт в {output_path}")


if __name__ == '__main__':
    if len(sys.argv) < 2:
        print("Использование: python dart_analyzer.py <libapp.so> [output.txt]")
        sys.exit(1)
        
    analyzer = DartELFAnalyzer(sys.argv[1])
    analyzer.load()
    analyzer.extract_strings()
    analyzer.generate_report()
    
    if len(sys.argv) > 2:
        analyzer.export_to_file(sys.argv[2])
