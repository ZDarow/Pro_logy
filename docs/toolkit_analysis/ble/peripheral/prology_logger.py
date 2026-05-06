#!/usr/bin/env python3
"""
PROLOGY BLE Packet Logger
Перехватывает и логирует все BLE пакеты между PROLOGY APK и устройством.

Использует Frida для перехвата Bluetooth вызовов на runtime.
НЕ требует модификации APK!
"""

import frida
import sys
import os
import time
import json
import struct
import logging
from datetime import datetime
from pathlib import Path

# ============================================================
# Настройка логирования
# ============================================================

LOG_DIR = Path("/home/mi/7a/prology/logs")
LOG_DIR.mkdir(parents=True, exist_ok=True)

# Создаём уникальный файл лога для каждой сессии
timestamp = datetime.now().strftime("%Y%m%d_%H%M%S")
LOG_FILE = LOG_DIR / f"prology_ble_{timestamp}.log"
JSON_LOG = LOG_DIR / f"prology_ble_{timestamp}.json"

logging.basicConfig(
    level=logging.INFO,
    format='%(message)s',
    handlers=[
        logging.FileHandler(LOG_FILE, encoding='utf-8'),
        logging.StreamHandler(sys.stdout)
    ]
)
logger = logging.getLogger('PROLOGY_LOGGER')

# JSON лог для последующего анализа
json_log = []

# ============================================================
# RCSP Checksum и парсинг (из предыдущего анализа)
# ============================================================

def calc_tx_checksum(data: bytes) -> int:
    """TX checksum: (sum(all_bytes) + 0x10) & 0xFF"""
    return (sum(data) + 0x10) & 0xFF

def calc_rx_checksum(data: bytes) -> int:
    """RX checksum: (sum(all_bytes) + 0x40) & 0xFF"""
    return (sum(data) + 0x40) & 0xFF

def verify_checksum(packet: bytes, direction: str) -> bool:
    if len(packet) < 2:
        return False
    data = packet[:-1]
    received = packet[-1]
    if direction == 'TX':
        return calc_tx_checksum(data) == received
    else:
        return calc_rx_checksum(data) == received

def parse_rcsp_packet(data: bytes, direction: str) -> dict:
    """Разбирает RCSP пакет"""
    if len(data) < 2:
        return {'raw': data.hex(), 'error': 'Too short'}
    
    cmd = data[0]
    payload = data[1:-1]
    checksum = data[-1]
    
    result = {
        'direction': direction,
        'cmd': f'0x{cmd:02X}',
        'cmd_dec': cmd,
        'payload_hex': payload.hex(),
        'payload_len': len(payload),
        'checksum': checksum,
        'checksum_valid': verify_checksum(data, direction),
        'timestamp': datetime.now().isoformat(),
        'raw': data.hex()
    }
    
    # Интерпретация команд
    cmd_names = {
        0x01: 'Init',
        0x03: 'Query',
        0x04: 'Heartbeat',
        0x05: 'Heartbeat Resp',
        0x07: 'Status',
        0x80: 'Write Param',
        0x8A: 'Config Ext',
        0x8E: 'Status Req',
        0x90: 'Param Data',
        0x92: 'Telemetry',
        0x9A: 'Status Data',
        0x9F: 'Confirm',
        0xA0: 'Gain/Fade',
        0xB0: 'B0 Data',
        0xFF: 'Identification'
    }
    
    result['cmd_name'] = cmd_names.get(cmd, f'Unknown (0x{cmd:02X})')
    
    # Парсинг payload для известных команд
    if cmd == 0x01 and direction == 'TX':
        result['description'] = 'Инициализация сессии'
    elif cmd == 0x04 and direction == 'TX':
        result['description'] = f'Heartbeat seq={payload[0] if payload else "?"}'
    elif cmd == 0x05 and direction == 'RX':
        result['description'] = f'Heartbeat ответ seq={payload[0] if payload else "?"}'
    elif cmd == 0xFF and direction == 'RX':
        # Identification: [0x00][name][0x00][firmware]
        if payload:
            try:
                parts = payload.split(b'\x00')
                name = parts[1].decode('ascii', errors='replace') if len(parts) > 1 else '?'
                fw = parts[2].decode('ascii', errors='replace') if len(parts) > 2 else '?'
                result['description'] = f'Device: {name}, Firmware: {fw}'
                result['device_name'] = name
                result['firmware'] = fw
            except:
                result['description'] = 'Identification response'
    elif cmd == 0x03 and direction == 'TX':
        result['description'] = f'Query канала: {payload[0] if payload else "?"}'
    elif cmd == 0x80 and direction == 'TX':
        result['description'] = f'Запись EQ параметров ({len(payload)} байт)'
    elif cmd == 0x8A and direction == 'TX':
        sub = payload[0] if payload else 0
        result['description'] = f'Config Ext sub=0x{sub:02X}'
    elif cmd == 0x92 and direction == 'RX':
        if len(payload) >= 2:
            result['description'] = f'Battery: {payload[0]}%, RSSI: {payload[1]} dBm'
    elif cmd == 0xA0 and direction == 'TX':
        result['description'] = 'Gain/Fade конфигурация'
    
    return result

# ============================================================
# Frida скрипт для перехвата BLE
# ============================================================

FRIDA_SCRIPT = """
'use strict';

console.log('[PROLOGY] Frida script loaded');

// ============================================================
// Перехват Android Bluetooth LE вызовов
// ============================================================

// 1. BluetoothGatt.writeCharacteristic
Java.perform(function() {
    console.log('[PROLOGY] Java VM attached');

    // Перехват записи в характеристики (TX)
    var BluetoothGatt = Java.use('android.bluetooth.BluetoothGatt');
    
    if (BluetoothGatt) {
        console.log('[PROLOGY] Hooking BluetoothGatt');
        
        BluetoothGatt.writeCharacteristic.overload('android.bluetooth.BluetoothGattCharacteristic').implementation = function(characteristic) {
            var value = characteristic.getValue();
            if (value) {
                var byteArray = Java.array('byte', value);
                var hex = '';
                for (var i = 0; i < byteArray.length; i++) {
                    hex += ('0' + (byteArray[i] & 0xFF).toString(16)).slice(-2);
                }
                console.log('[TX] ' + hex);
                send({type: 'tx', data: hex, len: byteArray.length});
            }
            return this.writeCharacteristic.overload('android.bluetooth.BluetoothGattCharacteristic').call(this, characteristic);
        };
        
        console.log('[PROLOGY] ✅ writeCharacteristic hooked');
    }

    // 2. BluetoothGattCallback.onCharacteristicChanged (RX)
    try {
        var GattCallback = Java.use('android.bluetooth.BluetoothGattCallback');
        
        GattCallback.onCharacteristicChanged.implementation = function(gatt, characteristic) {
            var value = characteristic.getValue();
            if (value) {
                var byteArray = Java.array('byte', value);
                var hex = '';
                for (var i = 0; i < byteArray.length; i++) {
                    hex += ('0' + (byteArray[i] & 0xFF).toString(16)).slice(-2);
                }
                console.log('[RX] ' + hex);
                send({type: 'rx', data: hex, len: byteArray.length});
            }
            this.onCharacteristicChanged(gatt, characteristic);
        };
        
        console.log('[PROLOGY] ✅ onCharacteristicChanged hooked');
    } catch(e) {
        console.log('[PROLOGY] ⚠️ GattCallback hook failed: ' + e.message);
    }

    // 3. Перехват Flutter Platform Channel (Dart ↔ Native)
    try {
        var MethodChannel = Java.use('io.flutter.plugin.common.MethodChannel');
        
        MethodChannel.invokeMethod.overload('java.lang.String', 'java.lang.Object').implementation = function(method, args) {
            console.log('[Dart→Native] ' + method + ' args=' + args);
            return this.invokeMethod(method, args);
        };
        
        console.log('[PROLOGY] ✅ Flutter MethodChannel hooked');
    } catch(e) {
        console.log('[PROLOGY] ⚠️ Flutter hook failed: ' + e.message);
    }

    // 4. Перехват Bluetooth Low Energy API (Android 12+)
    try {
        var BluetoothLe = Java.use('android.bluetooth.le.BluetoothLeScanner');
        console.log('[PROLOGY] BluetoothLeScanner found');
    } catch(e) {
        console.log('[PROLOGY] ⚠️ BLE Scanner hook failed');
    }

    console.log('[PROLOGY] 🎯 All hooks installed');
});
"""

# ============================================================
# Logger класс
# ============================================================

class PrologyLogger:
    def __init__(self):
        self.session = None
        self.device = None
        self.packet_count = {'tx': 0, 'rx': 0}
        self.start_time = None

    def on_message(self, message, data):
        """Обработка сообщений от Frida"""
        if message['type'] == 'send':
            payload = message['payload']
            if payload.get('type') in ['tx', 'rx']:
                self.log_packet(payload)
        elif message['type'] == 'error':
            logger.error(f"Frida error: {message['description']}")

    def log_packet(self, payload):
        """Логирование пакета"""
        direction = payload['type'].upper()
        hex_data = payload['data']
        length = payload['len']
        
        # Декодирование hex
        raw_bytes = bytes.fromhex(hex_data)
        
        # Парсинг RCSP
        parsed = parse_rcsp_packet(raw_bytes, direction)
        
        # Обновление счётчиков
        self.packet_count[payload['type']] += 1
        
        # Форматированный вывод
        elapsed = time.time() - self.start_time if self.start_time else 0
        
        log_line = (
            f"\n{'='*60}\n"
            f"🕐 {elapsed:.2f}s | {direction} | #{self.packet_count[payload['type']]} | {length} байт\n"
            f"📦 Команда: {parsed.get('cmd_name', 'Unknown')} ({parsed.get('cmd', '?')})\n"
            f"🔗 Payload: {parsed.get('payload_hex', '?')} ({parsed.get('payload_len', 0)} байт)\n"
            f"✅ Checksum: {'OK' if parsed.get('checksum_valid') else 'FAIL'}\n"
            f"📝 {parsed.get('description', '')}\n"
            f"🔴 Raw: {hex_data}\n"
        )
        
        logger.info(log_line)
        
        # Сохранение в JSON
        json_log.append({
            'elapsed': round(elapsed, 3),
            'direction': direction,
            'packet_num': self.packet_count[payload['type']],
            'raw_hex': hex_data,
            **parsed
        })

    def save_json_log(self):
        """Сохранение JSON лога"""
        with open(JSON_LOG, 'w', encoding='utf-8') as f:
            json.dump({
                'session_info': {
                    'start_time': self.start_time,
                    'total_packets': sum(self.packet_count.values()),
                    'tx_count': self.packet_count['tx'],
                    'rx_count': self.packet_count['rx']
                },
                'packets': json_log
            }, f, indent=2, ensure_ascii=False)
        logger.info(f"\n💾 JSON лог сохранён: {JSON_LOG}")

    def run(self, package_name: str = "ru.vk.store"):
        """Запуск логирования"""
        print("=" * 60)
        print("🔍 PROLOGY BLE Packet Logger (Frida)")
        print("=" * 60)
        print(f"📱 Приложение: {package_name}")
        print(f"📄 Лог файл: {LOG_FILE}")
        print(f"💾 JSON: {JSON_LOG}")
        print("=" * 60)
        
        # Подключение к устройству (эмулятор или телефон)
        try:
            # Сначала пробуем USB устройство
            self.device = frida.get_usb_device()
            print(f"✅ Подключено к USB: {self.device.name}")
        except:
            try:
                # Или локальный процесс
                self.device = frida.get_local_device()
                print("✅ Локальное устройство")
            except Exception as e:
                print(f"❌ Ошибка подключения: {e}")
                return
        
        # Список процессов
        try:
            processes = self.device.enumerate_processes()
            app_running = any(p.name == package_name for p in processes)
            if not app_running:
                print(f"⚠️ {package_name} не запущен. Запустите приложение...")
                print("Ожидание (30 сек)...")
                time.sleep(30)
        except:
            pass
        
        # Подключение к процессу
        try:
            self.session = self.device.attach(package_name)
            print(f"✅ Прикреплено к {package_name}")
        except Exception as e:
            print(f"❌ Не удалось подключиться: {e}")
            print("\n💡 Убедитесь что:")
            print("   1. Приложение запущено")
            print("   2. Устройство подключено через USB")
            print("   3. Frida сервер запущен на устройстве (frida-server)")
            return
        
        # Загрузка скрипта
        self.start_time = time.time()
        script = self.session.create_script(FRIDA_SCRIPT)
        script.on('message', self.on_message)
        script.load()
        
        print("\n🎯 Логирование запущено!")
        print("📊 Статистика: TX=0, RX=0")
        print("⏹️  Нажмите Ctrl+C для остановки\n")
        
        try:
            # Бесконечный цикл
            while True:
                time.sleep(1)
        except KeyboardInterrupt:
            print("\n⏹️  Остановка...")
            self.save_json_log()
            
            print(f"\n📊 Итоги:")
            print(f"   TX пакетов: {self.packet_count['tx']}")
            print(f"   RX пакетов: {self.packet_count['rx']}")
            print(f"   Всего: {sum(self.packet_count.values())}")
            print(f"   Лог: {LOG_FILE}")
            print(f"   JSON: {JSON_LOG}")
            
            script.unload()
            self.session.detach()

if __name__ == '__main__':
    logger_instance = PrologyLogger()
    
    # Проверка аргументов
    if len(sys.argv) > 1:
        package = sys.argv[1]
    else:
        package = "ru.vk.store"  # RuStore
    
    logger_instance.run(package)
