#!/usr/bin/env python3
"""
Prology HFP Emulator - Управление магнитолой PROLOGY через Bluetooth HFP

Использование:
    sudo python3 prology_hfp.py scan          # Поиск устройств
    sudo python3 prology_hfp.py connect MAC   # Подключение к магнитоле
    sudo python3 prology_hfp.py console MAC   # Интерактивная консоль

Требования:
    - pybluez: pip install pybluez
    - pyserial: pip install pyserial
    - root права для доступа к Bluetooth
"""

import bluetooth
import serial
import time
import sys
import threading
from typing import Optional, Callable

# HFP UUIDs
HFP_UUID = "0000111e-0000-1000-8000-00805f9b34fb"  # Hands-Free
HSP_UUID = "00001108-0000-1000-8000-00805f9b34fb"  # Headset

class PrologyHFP:
    """HFP эмулятор для управления магнитолой Prology"""
    
    def __init__(self):
        self.sock: Optional[bluetooth.BluetoothSocket] = None
        self.rfcomm_sock: Optional[serial.Serial] = None
        self.connected = False
        self.mac_address: Optional[str] = None
        self.channel: Optional[int] = None
        self.receive_thread: Optional[threading.Thread] = None
        self.running = False
        self.callbacks: dict[str, Callable] = {}
        
    def scan(self, duration=5) -> list[dict]:
        """Поиск Bluetooth устройств с HFP/Headset профилем"""
        print("=" * 60)
        print("ПОИСК УСТРОЙСТВ HFP/HEADSET")
        print("=" * 60)
        
        devices = []
        print("Сканирование...")
        
        try:
            nearby = bluetooth.discover_devices(duration=duration, lookup_names=True)
            
            for addr, name in nearby:
                print(f"\nНайдено: {name} ({addr})")
                
                # Поиск HFP/Headset сервисов
                try:
                    services = bluetooth.find_service(address=addr)
                    hfp_channel = None
                    
                    for svc in services:
                        svc_name = svc.get('name', '').lower()
                        uuid = svc.get('service-classes', [])
                        
                        if 'hands-free' in svc_name or 'headset' in svc_name:
                            hfp_channel = svc.get('port')
                            print(f"  ✓ HFP/Headset сервис на канале {hfp_channel}")
                        
                        # Проверка по UUID
                        if HFP_UUID in str(uuid) or HSP_UUID in str(uuid):
                            hfp_channel = svc.get('port')
                            print(f"  ✓ HFP UUID найден на канале {hfp_channel}")
                    
                    devices.append({
                        'name': name,
                        'address': addr,
                        'channel': hfp_channel
                    })
                    
                except Exception as e:
                    print(f"  Ошибка поиска сервисов: {e}")
                    
        except Exception as e:
            print(f"Ошибка сканирования: {e}")
            
        return devices
    
    def connect(self, mac_address: str, channel: Optional[int] = None) -> bool:
        """Подключение к магнитоле через RFCOMM"""
        self.mac_address = mac_address
        
        print("=" * 60)
        print(f"ПОДКЛЮЧЕНИЕ К {mac_address}")
        print("=" * 60)
        
        # Если канал не указан, ищем его
        if channel is None:
            print("Поиск HFP канала...")
            try:
                services = bluetooth.find_service(address=mac_address)
                for svc in services:
                    svc_name = svc.get('name', '').lower()
                    if 'hands-free' in svc_name or 'headset' in svc_name:
                        channel = svc.get('port')
                        print(f"Найден канал: {channel}")
                        break
                    
                if channel is None:
                    # Пробуем стандартные каналы
                    for ch in [1, 2, 3]:
                        print(f"Пробуем канал {ch}...")
                        if self._try_connect(mac_address, ch):
                            channel = ch
                            break
            except Exception as e:
                print(f"Ошибка поиска: {e}")
                channel = 1  # По умолчанию
        
        if channel is None:
            channel = 1
            
        return self._try_connect(mac_address, channel)
    
    def _try_connect(self, mac_address: str, channel: int) -> bool:
        """Попытка подключения к указанному каналу"""
        try:
            # Создание RFCOMM сокета
            self.sock = bluetooth.BluetoothSocket(bluetooth.RFCOMM)
            self.sock.settimeout(10)
            
            print(f"Подключение к {mac_address} канал {channel}...")
            self.sock.connect((mac_address, channel))
            self.sock.settimeout(None)
            
            self.connected = True
            self.channel = channel
            
            print("✓ Подключено!")
            
            # Запуск потока приёма
            self.running = True
            self.receive_thread = threading.Thread(target=self._receive_loop)
            self.receive_thread.daemon = True
            self.receive_thread.start()
            
            # Отправка начальных AT команд
            self._init_hfp()
            
            return True
            
        except bluetooth.btcommon.BluetoothError as e:
            print(f"Ошибка подключения: {e}")
            return False
    
    def _init_hfp(self):
        """Инициализация HFP соединения"""
        print("\nИнициализация HFP...")
        
        # Отправка AT команд для инициализации
        commands = [
            "AT",           # Проверка связи
            "AT+BRSF=1023", # Поддерживаемые функции (все)
        ]
        
        for cmd in commands:
            self.send(cmd)
            time.sleep(0.5)
    
    def _receive_loop(self):
        """Цикл приёма данных от магнитолы"""
        buffer = b''
        
        while self.running and self.connected:
            try:
                data = self.sock.recv(1024)
                if not data:
                    print("\nСоединение разорвано")
                    self.connected = False
                    break
                
                buffer += data
                
                # Обработка по строкам (оканчивающимся на \r\n)
                while b'\r\n' in buffer:
                    line, buffer = buffer.split(b'\r\n', 1)
                    if line:
                        self._handle_response(line.decode('utf-8', errors='ignore'))
                        
            except bluetooth.btcommon.BluetoothError:
                time.sleep(0.1)
            except Exception as e:
                print(f"\nОшибка приёма: {e}")
                time.sleep(0.1)
    
    def _handle_response(self, response: str):
        """Обработка ответа от магнитолы"""
        print(f"\n← {response}")
        
        # Вызов callback если есть
        if 'OK' in response or 'ERROR' in response:
            if 'on_response' in self.callbacks:
                self.callbacks['on_response'](response)
    
    def send(self, command: str) -> bool:
        """Отправка AT команды"""
        if not self.connected:
            print("Не подключено!")
            return False
        
        try:
            full_cmd = command.strip() + '\r\n'
            print(f"→ {command}")
            self.sock.send(full_cmd.encode())
            return True
        except Exception as e:
            print(f"Ошибка отправки: {e}")
            return False
    
    def disconnect(self):
        """Отключение от магнитолы"""
        self.running = False
        self.connected = False
        
        if self.sock:
            try:
                self.sock.close()
            except:
                pass
            self.sock = None
        
        print("\nОтключено")
    
    # === Команды управления ===
    
    def answer_call(self):
        """Ответить на вызов (сделать активным источник)"""
        return self.send("ATA")
    
    def hangup(self):
        """Завершить вызов"""
        return self.send("AT+CHUP")
    
    def get_battery(self):
        """Запрос уровня батареи"""
        return self.send("AT+CBC")
    
    def get_signal(self):
        """Запрос уровня сигнала"""
        return self.send("AT+CSQ")
    
    def set_volume(self, level: int):
        """Установка громкости (0-15)"""
        level = max(0, min(15, level))
        return self.send(f"AT+VGM={level}")
    
    def get_volume(self):
        """Запрос текущей громкости"""
        return self.send("AT+VGM?")
    
    def send_dtmf(self, code: str):
        """Отправка DTMF кода"""
        return self.send(f"AT+VTS={code}")
    
    def probe_source(self, source_id: int):
        """
        Попытка переключения источника
        source_id: 1=RADIO, 2=USB, 3=BT, 4=AUX, 5=GPS
        """
        # Экспериментальные команды (требуют проверки)
        commands = [
            f"AT+PROLOGY={source_id}",
            f"AT+SRC={source_id}",
            f"AT+SOURCE={source_id}",
            f"AT^SOURCE={source_id}",
        ]
        
        for cmd in commands:
            self.send(cmd)
            time.sleep(0.3)


class ConsoleUI:
    """Интерактивная консоль для управления"""
    
    def __init__(self, hfp: PrologyHFP):
        self.hfp = hfp
        self.running = True
        
        # Регистрация callback
        self.hfp.callbacks['on_response'] = self.on_response
        
    def on_response(self, response: str):
        """Обработка ответа"""
        pass  # Уже выводится в _handle_response
    
    def print_help(self):
        """Вывод справки"""
        print("\n" + "=" * 60)
        print("КОМАНДЫ УПРАВЛЕНИЯ")
        print("=" * 60)
        print("  answer     - Ответить (активировать)")
        print("  hangup     - Завершить")
        print("  volume N   - Громкость (0-15)")
        print("  vol?       - Текущая громкость")
        print("  signal     - Уровень сигнала")
        print("  battery    - Батарея")
        print("  dtmf N     - DTMF код")
        print("  src N      - Источник (1-5)")
        print("  scan       - Поиск устройств")
        print("  connect MAC - Подключение")
        print("  disconnect - Отключение")
        print("  help       - Эта справка")
        print("  exit       - Выход")
        print("=" * 60)
    
    def run(self):
        """Главный цикл консоли"""
        self.print_help()
        
        while self.running:
            try:
                cmd = input("\nHFP> ").strip()
                
                if not cmd:
                    continue
                
                parts = cmd.split(maxsplit=1)
                action = parts[0].lower()
                arg = parts[1] if len(parts) > 1 else None
                
                if action == 'exit' or action == 'quit':
                    self.running = False
                    
                elif action == 'help':
                    self.print_help()
                    
                elif action == 'answer':
                    self.hfp.answer_call()
                    
                elif action == 'hangup':
                    self.hfp.hangup()
                    
                elif action == 'volume' and arg:
                    self.hfp.set_volume(int(arg))
                    
                elif action == 'vol?':
                    self.hfp.get_volume()
                    
                elif action == 'signal':
                    self.hfp.get_signal()
                    
                elif action == 'battery':
                    self.hfp.get_battery()
                    
                elif action == 'dtmf' and arg:
                    self.hfp.send_dtmf(arg)
                    
                elif action == 'src' and arg:
                    self.hfp.probe_source(int(arg))
                    
                elif action == 'scan':
                    self.hfp.scan()
                    
                elif action == 'connect' and arg:
                    self.hfp.connect(arg)
                    
                elif action == 'disconnect':
                    self.hfp.disconnect()
                    
                else:
                    print(f"Неизвестная команда: {action}")
                    
            except KeyboardInterrupt:
                print("\nПрервано")
                break
            except Exception as e:
                print(f"Ошибка: {e}")
        
        self.hfp.disconnect()


def main():
    if len(sys.argv) < 2:
        print(__doc__)
        sys.exit(1)
    
    hfp = PrologyHFP()
    command = sys.argv[1].lower()
    
    try:
        if command == 'scan':
            hfp.scan()
            
        elif command == 'connect' and len(sys.argv) >= 3:
            mac = sys.argv[2]
            channel = int(sys.argv[3]) if len(sys.argv) >= 4 else None
            
            if hfp.connect(mac, channel):
                print("\n✓ Подключено! Введите 'help' для команд")
                console = ConsoleUI(hfp)
                console.run()
                
        elif command == 'console' and len(sys.argv) >= 3:
            mac = sys.argv[2]
            channel = int(sys.argv[3]) if len(sys.argv) >= 4 else None
            
            if hfp.connect(mac, channel):
                console = ConsoleUI(hfp)
                console.run()
                
        else:
            print(__doc__)
            
    except KeyboardInterrupt:
        print("\nПрервано")
    finally:
        hfp.disconnect()


if __name__ == '__main__':
    main()
