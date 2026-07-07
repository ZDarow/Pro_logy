#!/usr/bin/env python3
"""
Эмулятор PROLOGY SPP v2: с состоянием, парсингом параметров и событиями.
Поддерживает TCP (порт 5000) или Bluetooth RFCOMM (канал 1).
"""

import socket
import threading
import time
import sys
import random

import logging
from datetime import datetime

# Логирование
logging.basicConfig(
    filename='/media/mi/home_ext2/tools/apk-analysis/emulator/emulator_v2.log',
    level=logging.INFO,
    format='%(asctime)s - %(levelname)s - %(message)s'
)

import json

# Загрузка конфигурации
CONFIG_FILE = '/media/mi/home_ext2/tools/apk-analysis/emulator/config.json'
try:
    with open(CONFIG_FILE) as f:
        config = json.load(f)
    logging.info(f"Загружена конфигурация из {CONFIG_FILE}")
except Exception as e:
    config = {}
    logging.warning(f"Не удалось загрузить конфиг: {e}")

# Состояние "магнитолы" (из конфигурации или по умолчанию)
state = config.get('default_state', {
    'eq_preset': None,
    'treble': 0,
    'bass': 0,
    'subwoofer_vol': 0,
    'source': 'BT',
    'bass_boost': False,
    'volume': 30,
    'mute': False,
    'power': True
})

HOST = '0.0.0.0'
PORT = 5000
RFCOMM_CHANNEL = 1

KNOWN_COMMANDS = {
    'EQ_55': 'Пресет №55 (Flat)',
    'EQ_39': 'Пресет №39 (Rock)',
    'EQ_23': 'Пресет №23 (Pop)',
    'EQ_14': 'Пресет №14 (Jazz)',
    'EQ_8': 'Пресет №8 (Classic)',
}

def handle_client(conn, addr, proto='TCP'):
    print(f"[+] {proto} подключение от {addr}")
    with conn:
        while True:
            try:
                data = conn.recv(1024).decode().strip()
                if not data:
                    break
                print(f"[<--] {proto} получено: {data}")
                
                # Имитация задержки устройства (50-200мс)
                delay = random.uniform(0.05, 0.2)
                time.sleep(delay)
                
                # Редкая ошибка (5% шанс)
                if random.random() < 0.05:
                    error_resp = "ERROR: Device busy, try again"
                    conn.sendall((error_resp + '\n').encode())
                    print(f"[-->] {proto} ошибка: {error_resp}")
                    continue
                
                response = process_command(data)
                # Если ответ содержит несколько строк (события)
                for line in response.split('\n'):
                    if line:
                        conn.sendall((line + '\n').encode())
                        print(f"[-->] {proto} ответ: {line}")
                        time.sleep(0.05)  # Пауза между событиями
                # Если изменился источник — шлем событие (эмуляция)
                if 'notifySourceChanged' in data:
                    time.sleep(0.3)
                    event = f"notifySourceChanged:{state['source']}"
                    conn.sendall((event + '\n').encode())
                    print(f"[-->] Событие: {event}")
            except (ConnectionResetError, ConnectionAbortedError):
                break
    print(f"[-] {proto} отключение {addr}")

def process_command(cmd):
    global state
    parts = cmd.split()
    cmd_main = parts[0]
    
    # EQ пресеты
    if cmd_main in KNOWN_COMMANDS:
        old_preset = state['eq_preset']
        state['eq_preset'] = cmd_main
        logging.info(f"EQ preset changed: {old_preset} -> {cmd_main}")
        # Событие смены пресета
        return f"OK: Установлен {KNOWN_COMMANDS[cmd_main]}\nEQChanged:{cmd_main}"
    
    # pushTrebleBass: pushTrebleBass <treble> <bass>
    if cmd_main == 'pushTrebleBass' and len(parts) == 3:
        try:
            state['treble'] = int(parts[1])
            state['bass'] = int(parts[2])
            return f"OK: Treble={state['treble']}, Bass={state['bass']}"
        except ValueError:
            return "ERROR: Неверные параметры (нужны числа)"
    
    # onBassBoostLevelChanged
    if 'onBassBoostLevelChanged' in cmd:
        state['bass_boost'] = not state['bass_boost']
        return f"OK: BassBoost {'ON' if state['bass_boost'] else 'OFF'}"
    
    # _sendSubwooferVolumePeriod
    if '_sendSubwooferVolumePeriod' in cmd and len(parts) >= 2:
        try:
            state['subwoofer_vol'] = int(parts[1])
            return f"OK: Subwoofer volume={state['subwoofer_vol']}"
        except ValueError:
            return "ERROR: Неверный уровень сабвуфера"
    
    # notifySourceChanged: смена источника
    if 'notifySourceChanged' in cmd and len(parts) >= 2:
        state['source'] = parts[1]
        return f"OK: Source={state['source']}"
    
    # Запрос состояния
    if cmd_main == 'GET_STATE':
        return f"STATE: {state}"
    
    # Громкость: setVolume <0-100>
    if cmd_main == 'setVolume' and len(parts) == 2:
        try:
            vol = int(parts[1])
            if 0 <= vol <= 100:
                state['volume'] = vol
                # Событие при превышении лимита (громкость >90)
                if vol > 90:
                    return f"OK: Volume={vol}\nnotifyVolumeLimitChanged:{vol}"
                return f"OK: Volume={vol}"
            return "ERROR: Volume 0-100"
        except ValueError:
            return "ERROR: Bad volume"
    
    # Mute: mute on/off
    if cmd_main == 'mute':
        if len(parts) == 2:
            state['mute'] = parts[1].lower() == 'on'
        else:
            state['mute'] = not state['mute']
        return f"OK: Mute {'ON' if state['mute'] else 'OFF'}"
    
    # Power: power on/off
    if cmd_main == 'power':
        if len(parts) == 2:
            state['power'] = parts[1].lower() == 'on'
        else:
            state['power'] = not state['power']
        return f"OK: Power {'ON' if state['power'] else 'OFF'}"
    
    return "ERROR: Неизвестная команда"

def run_tcp_server():
    print(f"[*] TCP сервер (эмуляция SPP) на {HOST}:{PORT}")
    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
        s.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
        s.bind((HOST, PORT))
        s.listen()
        while True:
            conn, addr = s.accept()
            t = threading.Thread(target=handle_client, args=(conn, addr, 'TCP'))
            t.daemon = True
            t.start()

def run_bluetooth_server():
    try:
        import bluetooth
        print(f"[*] Bluetooth RFCOMM сервер на канале {RFCOMM_CHANNEL}")
        server_sock = bluetooth.BluetoothSocket(bluetooth.RFCOMM)
        server_sock.bind(("", RFCOMM_CHANNEL))
        server_sock.listen(1)
        print("[*] Ожидание Bluetooth подключений...")
        while True:
            client_sock, addr = server_sock.accept()
            t = threading.Thread(target=handle_client, args=(client_sock, addr, 'BT'))
            t.daemon = True
            t.start()
    except ImportError:
        print("[-] pybluez не установлен, переход на TCP")
        run_tcp_server()
    except Exception as e:
        print(f"[-] Ошибка Bluetooth: {e}, переход на TCP")
        run_tcp_server()

if __name__ == '__main__':
    print("[*] Эмулятор PROLOGY SPP v2")
    print(f"[*] Начальное состояние: {state}")
    # Можно выбрать режим: bluetooth или tcp
    if '--bluetooth' in sys.argv:
        run_bluetooth_server()
    else:
        run_tcp_server()
