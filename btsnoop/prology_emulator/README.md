# 📱 PROLOGY BLE Emulator (Jieli AC6951)

Эмулятор BLE периферийного устройства PROLOGY с полным RCSP протоколом.

## 🎯 Назначение

Эмуляция автомобильного BLE устройства PROLOGY для:
- Тестирования Android приложения без реального железа
- Reverse engineering протокола
- Отладки команд эквалайзера
- Изучения handshake последовательности

## 🏗️ Архитектура

```
┌─────────────────────────────────────────────────────┐
│              PROLOGY BLE Emulator                   │
│                                                     │
│  ┌─────────────────────────────────────────────┐   │
│  │          BLE Peripheral (HCI Raw)           │   │
│  │  Service:    0xAE00                         │   │
│  │  TX (Write): 0xAE01 (Handle 0x0009)         │   │
│  │  RX (Notify): 0xAE02 (Handle 0x000B)        │   │
│  └──────────────────┬──────────────────────────┘   │
│                     │                              │
│  ┌──────────────────▼──────────────────────────┐   │
│  │           RCSP Protocol Handler             │   │
│  │                                             │   │
│  │  Commands: 0x01, 0x03, 0x04, 0x80,          │   │
│  │            0x8A, 0x8E, 0xA0                 │   │
│  │                                             │   │
│  │  Checksum: sum + K (TX=0x10, RX=0x40)      │   │
│  └──────────────────┬──────────────────────────┘   │
│                     │                              │
│  ┌──────────────────▼──────────────────────────┐   │
│  │              Device State                   │   │
│  │  - Firmware: VER 8.7DSP                    │   │
│  │  - EQ params: 11 bands                     │   │
│  │  - Heartbeat: каждые 3.1 сек               │   │
│  │  - Status: 0x05 → 0x06 (после записи EQ)   │   │
│  └─────────────────────────────────────────────┘   │
└─────────────────────────────────────────────────────┘
```

## 📋 Поддерживаемые команды

### TX (Phone → Device)

| Команда | Тип | Формат | Описание |
|---------|-----|--------|----------|
| **Init** | 0x01 | `F0 00 03 01 05 00 09` | Инициализация сессии |
| **Query** | 0x03 | `F0 00 02 03 [param] [chk]` | Запрос параметра |
| **Heartbeat** | 0x04 | `F0 00 02 04 [param] [chk]` | Keep-alive |
| **Write Param** | 0x80 | `F0 00 03 80 [reg] [val] [chk]` | Запись EQ параметра |
| **Extended** | 0x8A | `F0 00 [len] 8A [sub] [data] [chk]` | Расширенная настройка |
| **Status Req** | 0x8E | `F0 00 02 8E [ch] [chk]` | Запрос статуса канала |
| **Config** | 0xA0 | `F0 00 [len] A0 [data...] [chk]` | Конфигурация |

### RX (Device → Phone)

| Тип | Формат | Описание |
|-----|--------|----------|
| **0xFF** | `C0 00 [len] FF [data...] [chk]` | Идентификация / карта параметров |
| **0x05** | `C0 00 02 05 [status] [chk]` | Heartbeat (каждые 3.1 сек) |
| **0x90** | `C0 00 03 90 [param] [val] [chk]` | Данные параметра |
| **0x9F** | `C0 00 02 9F [ch] [chk]` | Подтверждение статуса |
| **0x9A** | `C0 00 [len] 9A [data...] [chk]` | Данные статуса |
| **0xB0** | `C0 00 03 B0 [param] [val] [chk]` | Ответ на конфигурацию |

## 🚀 Установка и запуск

### Требования

- Linux с BlueZ 5.48+
- Root права (для BLE advertising)
- Python 3.10+

### Проверка зависимостей

```bash
python3 --version        # Должен быть 3.10+
bluetoothd -v            # Должен быть 5.48+
hcitool dev              # Должен показать HCI адаптер
```

### Запуск эмулятора

```bash
# Вариант 1: HCI raw mode (полный контроль)
sudo python3 prology_ble_emulator_v2.py

# Вариант 2: Тест без BLE (только протокол)
python3 -c "
from prology_ble_emulator_v2 import *
state = DeviceState()
# ... тестирование команд
"
```

## 🔧 Конфигурация

### Изменение имени устройства

```python
# В bluetoothctl mode
adv.name PROLOGY_EMU
```

### Изменение версии прошивки

```python
# В prology_ble_emulator_v2.py
FIRMWARE_VERSION = b"VER 9.0DSP   j"
```

### Изменение EQ параметров по умолчанию

```python
DEFAULT_EQ_PARAMS = {
    0x12: 0x10,  # Band 1: +16
    0x13: 0x08,  # Band 2: +8
    # ...
}
```

## 📡 Подключение с телефона

1. Запустить эмулятор: `sudo python3 prology_ble_emulator_v2.py`
2. На телефоне: открыть PROLOGY приложение
3. Найти устройство `PROLOGY_BLE` в списке
4. Подключиться
5. Эмулятор ответит:
   - Device ID: `VER 8.7DSP   j`
   - Карта параметров (11 EQ bands)
   - Heartbeat каждые 3.1 сек

## 🧪 Тестирование

### Тест протокола

```bash
cd prology_emulator
python3 -c "
from prology_ble_emulator_v2 import *

# Тест checksum
pkt = bytes([0xF0, 0x00, 0x02, 0x04, 0x47])
assert calc_checksum(pkt, K_TX) == 0x4D

# Тест build RX
rx = build_rx(0x05, bytes([0x05]))
assert rx == bytes.fromhex('C0000205050C')

print('✅ Все тесты пройдены!')
"
```

### Тест Device State

```python
import asyncio
from prology_ble_emulator_v2 import *

async def test():
    state = DeviceState()
    notifications = []
    state.on_notify = lambda d: notifications.append(d)
    
    # Init
    await state._cmd_init(b'')
    
    # Heartbeat
    await state._cmd_heartbeat(b'\x47')
    
    # Status req
    await state._cmd_status(b'\x01')
    
    # Write param
    await state._cmd_write(b'\x01\x30')
    
    # Проверить все уведомления
    for n in notifications:
        assert n[-1] == calc_checksum(n[:-1], K_RX)
    
    print(f'✅ {len(notifications)} уведомлений, все валидны')

asyncio.run(test())
```

## 📊 Лог работы

```
10:50:48 [INFO] PROLOGY BLE Emulator (Jieli AC6951) v2
10:50:48 [INFO] Service: 0000ae00-0000-1000-8000-00805f9b34fb
10:50:48 [INFO] TX: 0000ae01-0000-1000-8000-00805f9b34fb
10:50:48 [INFO] RX: 0000ae02-0000-1000-8000-00805f9b34fb
10:50:48 [INFO] Firmware: VER 8.7DSP   j
10:50:48 [INFO] 📡 HCI raw mode — creating BLE socket...
10:50:48 [INFO] 📡 Advertising as PROLOGY_BLE
10:50:48 [INFO] ✅ HCI raw mode active
10:50:48 [INFO] 👂 Listening for BLE events...
10:50:48 [INFO] 🔄 Emulator running... (Ctrl+C to stop)
```

## 🔍 Известные ограничения

1. **GATT Characteristics** — эмулятор через HCI raw mode не создаёт реальные GATT характеристики
   - Решение: использовать `bluetoothctl advertise` mode
   - Или: реализовать через D-Bus `org.bluez.GattCharacteristic1`

2. **ACL Data** — HCI raw socket не перехватывает ATT/GATT данные автоматически
   - Решение: слушать HCI ACL packets (0x02) и парсить ATT

3. **Один клиент** — эмулятор поддерживает одно подключение

## 📁 Структура файлов

```
prology_emulator/
├── prology_ble_emulator.py       # v1 (D-Bus GATT, требует доработки)
├── prology_ble_emulator_v2.py    # v2 (HCI raw + bluetoothctl, рабочий)
└── README.md                     # Этот файл
```

## 🔗 Связанные файлы

- `../rcsp_checksum.py` — модуль checksum (используется эмулятором)
- `../PROTOCOL_RECONSTRUCTION.md` — полная документация протокола
- `../BTSNOOP_ANALYSIS_REPORT.md` — анализ btsnoop логов

## 📝 История изменений

### v2 (6 апреля 2026)
- ✅ Полный RCSP протокол
- ✅ Checksum (TX=0x10, RX=0x40)
- ✅ Все 7 типов команд
- ✅ Heartbeat каждые 3.1 сек
- ✅ Device identification (VER 8.7DSP)
- ✅ EQ params map (11 bands)
- ✅ HCI raw mode
- ✅ bluetoothctl fallback

### v1 (3 апреля 2026)
- Базовая структура D-Bus GATT services
- Требует доработки advertising registration
