#!/usr/bin/env python3
"""
Dart Protocol Analyzer - Поиск команд протокола в libapp.so
Извлечение структур команд, функций отправки и форматов пакетов
"""

import re
import sys
from collections import defaultdict

class ProtocolAnalyzer:
    def __init__(self, filepath):
        self.filepath = filepath
        self.data = None
        self.strings = []
        
    def load(self):
        with open(self.filepath, 'rb') as f:
            self.data = f.read()
            
    def extract_strings(self, min_length=4):
        pattern = rb'[\x20-\x7e]{' + str(min_length).encode() + rb',}'
        matches = re.findall(pattern, self.data)
        self.strings = [m.decode('ascii', errors='ignore') for m in matches]
        
    def find_send_functions(self):
        """Поиск функций отправки команд"""
        functions = defaultdict(list)
        
        patterns = {
            'send': r'(send\w+)@(\d+)',
            'get': r'(get\w+)@(\d+)',
            'set': r'(set\w+)@(\d+)',
            'write': r'(write\w+)@(\d+)',
        }
        
        text = '\n'.join(self.strings)
        
        for category, pattern in patterns.items():
            for match in re.finditer(pattern, text):
                func_name = match.group(1)
                addr = match.group(2)
                functions[category].append({
                    'name': func_name,
                    'address': f"@{addr}"
                })
                
        return functions
        
    def find_protocol_classes(self):
        """Поиск классов протокола"""
        classes = set()
        
        patterns = [
            r'Protocol\w+',
            r'Packet\w+',
            r'Command\w+',
            r'Message\w+',
            r'Helper\w+',
            r'Sender\w+',
            r'Listener\w+',
            r'Manager\w+',
            r'Service\w+',
        ]
        
        text = '\n'.join(self.strings)
        for pattern in patterns:
            for match in re.finditer(pattern, text, re.IGNORECASE):
                classes.add(match.group(0))
                
        return sorted(classes)
        
    def find_bluetooth_data(self):
        """Поиск Bluetooth-специфичных данных"""
        bt_data = {
            'services': set(),
            'characteristics': set(),
            'descriptors': set(),
            'uuids': set(),
            'states': set(),
        }
        
        text = '\n'.join(self.strings)
        
        # UUID
        uuid_pattern = r'[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}'
        for match in re.finditer(uuid_pattern, text):
            bt_data['uuids'].add(match.group(0))
            
        # Состояния Bluetooth
        state_patterns = [
            r'Bluetooth(A|C|D|E|I|O|P|R|S|T|U|V|W)\w+',
            r'(connected|connecting|disconnecting|disconnected)',
        ]
        
        for pattern in state_patterns:
            for match in re.finditer(pattern, text, re.IGNORECASE):
                bt_data['states'].add(match.group(0))
                
        # SPP
        for s in self.strings:
            if 'spp' in s.lower() or 'SPP' in s:
                bt_data['services'].add(s)
            if 'characteristic' in s.lower():
                bt_data['characteristics'].add(s)
                
        return bt_data
        
    def find_eq_commands(self):
        """Поиск команд эквалайзера"""
        eq_commands = {
            'presets': set(),
            'functions': set(),
            'parameters': set(),
        }
        
        text = '\n'.join(self.strings)
        
        # Пресеты EQ
        for s in self.strings:
            if re.match(r'^EQ_\d+[A-Z]*$', s):
                eq_commands['presets'].add(s)
                
        # Функции эквалайзера
        eq_patterns = [
            r'(sendEq\w+)@',
            r'(setEq\w+)@',
            r'(getEq\w+)@',
            r'(Eq\w+Listener)',
            r'(Eq\w+Controller)',
        ]
        
        for pattern in eq_patterns:
            for match in re.finditer(pattern, text):
                eq_commands['functions'].add(match.group(0).rstrip('@'))
                
        # Параметры
        param_patterns = [
            r'eq\.(\w+)',
            r'equalizer\.(\w+)',
            r'(\w+Gain)',
            r'(\w+Freq)',
            r'(\w+Q)',
        ]
        
        for pattern in param_patterns:
            for match in re.finditer(pattern, text, re.IGNORECASE):
                eq_commands['parameters'].add(match.group(0))
                
        return eq_commands
        
    def find_dsp_commands(self):
        """Поиск DSP команд"""
        dsp = {
            'xover': set(),
            'time_alignment': set(),
            'channels': set(),
            'functions': set(),
        }
        
        text = '\n'.join(self.strings)
        
        # X-Over
        xover_patterns = [
            r'(sendXOver\w+)@',
            r'(setXOver\w+)@',
            r'(XOver\w+)',
            r'(hpf|lpf|bpf|apf)\w*',
        ]
        
        for pattern in xover_patterns:
            for match in re.finditer(pattern, text, re.IGNORECASE):
                dsp['xover'].add(match.group(0).rstrip('@'))
                
        # Time Alignment
        ta_patterns = [
            r'(sendTimeAlignment\w+)@',
            r'(setTimeAlignment\w+)@',
            r'(TimeAlignment\w+)',
        ]
        
        for pattern in ta_patterns:
            for match in re.finditer(pattern, text):
                dsp['time_alignment'].add(match.group(0).rstrip('@'))
                
        # Каналы
        for s in self.strings:
            if re.match(r'^CHANNEL_\d+$', s):
                dsp['channels'].add(s)
            if re.match(r'^CHANNEL_GROUP_\d+$', s):
                dsp['channels'].add(s)
                
        return dsp
        
    def find_audio_settings(self):
        """Поиск аудио настроек"""
        audio = {
            'volume': set(),
            'bass_treble': set(),
            'subwoofer': set(),
            'loudness': set(),
            'functions': set(),
        }
        
        text = '\n'.join(self.strings)
        
        # Громкость
        vol_patterns = [
            r'(sendVolume\w*)@',
            r'(setVolume\w*)@',
            r'(Volume\w+)',
        ]
        
        for pattern in vol_patterns:
            for match in re.finditer(pattern, text):
                audio['volume'].add(match.group(0).rstrip('@'))
                audio['functions'].add(match.group(0).rstrip('@'))
                
        # Bass/Treble
        bt_patterns = [
            r'(sendBass\w*)@',
            r'(sendTreble\w*)@',
            r'(Bass\w+)',
            r'(Treble\w+)',
        ]
        
        for pattern in bt_patterns:
            for match in re.finditer(pattern, text, re.IGNORECASE):
                audio['bass_treble'].add(match.group(0).rstrip('@'))
                audio['functions'].add(match.group(0).rstrip('@'))
                
        # Сабвуфер
        sub_patterns = [
            r'(sendSubwoofer\w*)@',
            r'(setSubwoofer\w*)@',
            r'(Subwoofer\w+)',
        ]
        
        for pattern in sub_patterns:
            for match in re.finditer(pattern, text, re.IGNORECASE):
                audio['subwoofer'].add(match.group(0).rstrip('@'))
                audio['functions'].add(match.group(0).rstrip('@'))
                
        # Loudness
        loud_patterns = [
            r'(sendLoudness\w*)@',
            r'(setLoudness\w*)@',
            r'(Loudness\w+)',
        ]
        
        for pattern in loud_patterns:
            for match in re.finditer(pattern, text, re.IGNORECASE):
                audio['loudness'].add(match.group(0).rstrip('@'))
                audio['functions'].add(match.group(0).rstrip('@'))
                
        return audio
        
    def find_mcu_codes(self):
        """Поиск MCU кодов"""
        mcu = set()
        
        for s in self.strings:
            if re.match(r'^MCU_\d+(_DSP)?$', s):
                mcu.add(s)
                
        return sorted(mcu)
        
    def find_parser_commands(self):
        """Поиск команд парсеров"""
        parsers = set()
        
        pattern = r'ParserCmdSet\|_parser(\w+)'
        
        for s in self.strings:
            match = re.match(pattern, s)
            if match:
                parsers.add(f"_parser{match.group(1)}")
                
        return sorted(parsers)
        
    def generate_protocol_report(self):
        """Генерация отчёта по протоколу"""
        print("\n" + "="*70)
        print(" ПРОТОКОЛ СВЯЗИ - DETAIL REPORT")
        print("="*70)
        
        # MCU коды
        mcu = self.find_mcu_codes()
        print(f"\n🔧 MCU CODES ({len(mcu)}):")
        for code in mcu:
            print(f"   • {code}")
            
        # Парсеры
        parsers = self.find_parser_commands()
        print(f"\n📡 PARSER COMMANDS ({len(parsers)}):")
        for parser in parsers:
            print(f"   • {parser}")
            
        # Эквалайзер
        eq = self.find_eq_commands()
        print(f"\n🎛 EQUALIZER:")
        print(f"   Пресеты: {len(eq['presets'])}")
        for preset in sorted(eq['presets'])[:20]:
            print(f"      - {preset}")
        print(f"   Функции: {len(eq['functions'])}")
        for func in sorted(eq['functions'])[:15]:
            print(f"      - {func}")
            
        # DSP
        dsp = self.find_dsp_commands()
        print(f"\n🔊 DSP:")
        print(f"   X-Over: {len(dsp['xover'])}")
        for xover in sorted(dsp['xover'])[:10]:
            print(f"      - {xover}")
        print(f"   Time Alignment: {len(dsp['time_alignment'])}")
        for ta in sorted(dsp['time_alignment'])[:10]:
            print(f"      - {ta}")
        print(f"   Каналы: {len(dsp['channels'])}")
        for ch in sorted(dsp['channels'])[:10]:
            print(f"      - {ch}")
            
        # Аудио настройки
        audio = self.find_audio_settings()
        print(f"\n🎵 AUDIO SETTINGS:")
        print(f"   Volume: {len(audio['volume'])}")
        for v in sorted(audio['volume'])[:10]:
            print(f"      - {v}")
        print(f"   Bass/Treble: {len(audio['bass_treble'])}")
        for bt in sorted(audio['bass_treble'])[:10]:
            print(f"      - {bt}")
        print(f"   Subwoofer: {len(audio['subwoofer'])}")
        for sub in sorted(audio['subwoofer'])[:10]:
            print(f"      - {sub}")
            
        # Bluetooth
        bt = self.find_bluetooth_data()
        print(f"\n📶 BLUETOOTH:")
        print(f"   UUIDs: {len(bt['uuids'])}")
        for uuid in sorted(bt['uuids'])[:5]:
            print(f"      - {uuid}")
        print(f"   States: {len(bt['states'])}")
        for state in sorted(bt['states'])[:10]:
            print(f"      - {state}")
            
        # Функции отправки
        send_funcs = self.find_send_functions()
        print(f"\n⚡ SEND FUNCTIONS:")
        for category, funcs in send_funcs.items():
            print(f"   {category.upper()} ({len(funcs)}):")
            for func in funcs[:10]:
                print(f"      - {func['name']}")
                
        print("\n" + "="*70)
        
    def export_protocol(self, output_path):
        """Экспорт протокола в файл"""
        with open(output_path, 'w', encoding='utf-8') as f:
            f.write("PROTOCOL ANALYSIS REPORT\n")
            f.write("="*50 + "\n\n")
            
            f.write("MCU CODES:\n")
            for code in self.find_mcu_codes():
                f.write(f"  {code}\n")
                
            f.write("\nPARSER COMMANDS:\n")
            for parser in self.find_parser_commands():
                f.write(f"  {parser}\n")
                
            f.write("\nEQUALIZER PRESETS:\n")
            eq = self.find_eq_commands()
            for preset in sorted(eq['presets']):
                f.write(f"  {preset}\n")
                
            f.write("\nEQUALIZER FUNCTIONS:\n")
            for func in sorted(eq['functions']):
                f.write(f"  {func}\n")
                
            f.write("\nDSP COMMANDS:\n")
            dsp = self.find_dsp_commands()
            f.write("  X-Over:\n")
            for xover in sorted(dsp['xover']):
                f.write(f"    {xover}\n")
            f.write("  Time Alignment:\n")
            for ta in sorted(dsp['time_alignment']):
                f.write(f"    {ta}\n")
            f.write("  Channels:\n")
            for ch in sorted(dsp['channels']):
                f.write(f"    {ch}\n")
                
            f.write("\nAUDIO SETTINGS:\n")
            audio = self.find_audio_settings()
            for category, items in audio.items():
                if category != 'functions':
                    f.write(f"  {category}:\n")
                    for item in sorted(items):
                        f.write(f"    {item}\n")
                        
            f.write("\nBLUETOOTH UUIDs:\n")
            bt = self.find_bluetooth_data()
            for uuid in sorted(bt['uuids']):
                f.write(f"  {uuid}\n")
                
        print(f"✓ Экспорт в {output_path}")


if __name__ == '__main__':
    if len(sys.argv) < 2:
        print("Использование: python protocol_analyzer.py <libapp.so> [output.txt]")
        sys.exit(1)
        
    analyzer = ProtocolAnalyzer(sys.argv[1])
    analyzer.load()
    analyzer.extract_strings()
    analyzer.generate_protocol_report()
    
    if len(sys.argv) > 2:
        analyzer.export_protocol(sys.argv[2])
