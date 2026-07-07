#!/usr/bin/env python3
"""
Эмулятор Bluetooth SPP для автомагнитолы PROLOGY.
Принимает команды (EQ_*, pushTrebleBass и др.) и логирует их.
Работает через TCP-сокет (порт 5000) для простоты.
"""

import socket
import threading
import time

HOST = '0.0.0.0'
PORT = 5000

# Команды, которые мы извлекли из dart_vm_strings.txt
KNOWN_COMMANDS = [
    b'EQ_55', b'EQ_39', b'EQ_23', b'EQ_14', b'EQ_8',
    b'pushTrebleBass', b'notifySourceChanged',
    b'onBassBoostLevelChanged', b'_sendSubwooferVolumePeriod'
]

def handle_client(conn, addr):
    print(f"[+] Подключение от {addr}")
    with conn:
        while True:
            try:
                data = conn.recv(1024)
                if not data:
                    break
                print(f"[<--] Получено: {data}")
                # Проверяем, известна ли команда
                for cmd in KNOWN_COMMANDS:
                    if cmd in data:
                        print(f"    Команда распознана: {cmd.decode()}")
                # Эмулируем ответ (заглушка)
                response = b'OK\n'
                conn.sendall(response)
                print(f"[-->] Ответ: OK")
            except ConnectionResetError:
                break
    print(f"[-] Отключение {addr}")

def main():
    print(f"[*] Запуск эмулятора PROLOGY SPP на {HOST}:{PORT}")
    print("[*] Известные команды:", [c.decode() for c in KNOWN_COMMANDS])
    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
        s.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
        s.bind((HOST, PORT))
        s.listen()
        print("[*] Ожидание подключений...")
        while True:
            conn, addr = s.accept()
            t = threading.Thread(target=handle_client, args=(conn, addr))
            t.daemon = True
            t.start()

if __name__ == '__main__':
    main()
