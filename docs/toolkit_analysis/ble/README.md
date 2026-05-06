# PROLOGY BLE Instrumentation

Инструменты для перехвата, логирования и анализа BLE пакетов PROLOGY.

## 📁 Структура

| Файл | Описание |
|------|----------|
| `prology_logger.py` | 🎯 Frida скрипт для перехвата BLE пакетов (RUNTIME) |
| `prology_server.py` | BLE периферия — эмуляция PROLOGY устройства |
| `prology_emulator.py` | RCSP обработчик команд + HCI socket режим |
| `start_peripheral.sh` | Скрипт запуска BLE периферии |

## 🎯 Быстрый старт — Логирование BLE

### Требования

1. **Android устройство** (физическое или эмулятор)
2. **PROLOGY APK** установлен
3. **Frida сервер** на устройстве

### Установка Frida на устройство

```bash
# 1. Проверка архитектуры устройства
adb shell getprop ro.product.cpu.abi

# 2. Скачивание frida-server
# Для arm64:
curl -L https://github.com/frida/frida/releases/download/17.7.3/frida-server-17.7.3-android-arm64.xz -o frida-server.xz

# Для x86 (эмулятор):
curl -L https://github.com/frida/frida/releases/download/17.7.3/frida-server-17.7.3-android-x86.xz -o frida-server.xz

# 3. Распаковка
unxz frida-server.xz

# 4. Установка на устройство
adb push frida-server /data/local/tmp/
adb shell "chmod 755 /data/local/tmp/frida-server"

# 5. Запуск frida-server
adb shell "/data/local/tmp/frida-server &"
```

### Запуск логирования

```bash
# Логирование PROLOGY (если установлен на устройство)
python3 prology_logger.py ru.prology.app

# Логирование RuStore (тест)
python3 prology_logger.py ru.vk.store

# Логирование любого пакета
python3 prology_logger.py com.example.app
```

### Результат

После запуска создаются 2 файла:

```
/home/mi/7a/prology/logs/
├── prology_ble_20260406_113000.log    # Человекочитаемый лог
└── prology_ble_20260406_113000.json  # JSON для анализа
```

### Формат лога

```
============================================================
🕐 1.234s | TX | #1 | 12 байт
📦 Команда: Init (0x01)
🔗 Payload: (0 байт)
✅ Checksum: OK
📝 Инициализация сессии
🔴 Raw: 01e6
============================================================
🕐 1.456s | RX | #1 | 25 байт
📦 Команда: Identification (0xFF)
🔗 Payload: 0050524f4c4f47595f424c450056455220382e37445350
✅ Checksum: OK
📝 Device: PROLOGY_BLE, Firmware: VER 8.7DSP
🔴 Raw: ff0050524f4c4f47595f424c450056455220382e374453504a
```

## 🔵 BLE Периферия — эмуляция устройства

### Требования

- Bluetooth адаптер с поддержкой BLE (4.0+)
- Root права

### Запуск

```bash
cd /home/mi/7a/prology/ble_peripheral
sudo ./start_peripheral.sh
```

### Что эмулируется

```
Устройство: PROLOGY_BLE
Service: 0xAE00
TX (Write): 0xAE01 — приём команд
RX (Notify): 0xAE02 — отправка ответов

Поддерживаемые команды:
- 0x01 Init
- 0x03 Query
- 0x04 Heartbeat
- 0x80 Write Param
- 0x8A Config Ext
- 0x8E Status Req
- 0xA0 Gain/Fade
```

## 📊 Перехватываемые данные

| Данные | Источник | Описание |
|--------|----------|----------|
| TX пакеты | `writeCharacteristic()` | Команды от APK к устройству |
| RX пакеты | `onCharacteristicChanged()` | Ответы устройства |
| Flutter канал | `MethodChannel.invokeMethod()` | Dart ↔ Native вызовы |
| BLE сканирование | `BluetoothLeScanner` | Поиск устройств |

## 🔧 Анализ логов

```bash
# Подсчёт команд
cat prology_ble_*.json | jq '.packets[].cmd' | sort | uniq -c | sort -rn

# Фильтр по команде
cat prology_ble_*.json | jq '.packets[] | select(.cmd == "0x80")'

# Временная диаграмма
cat prology_ble_*.json | jq '.packets[].elapsed'

# Ошибки checksum
cat prology_ble_*.json | jq '.packets[] | select(.checksum_valid == false)'
```

## ⚠️ Troubleshooting

### Frida не подключается

```bash
# Проверить frida-server на устройстве
adb shell "ps | grep frida"

# Перезапустить
adb shell "killall frida-server"
adb shell "/data/local/tmp/frida-server &"

# Проверить с ПК
frida-ps -U
```

### Нет BLE пакетов

- Убедитесь что PROLOGY подключён к BLE устройству
- Проверьте что перехватывается правильный package name
- Android 12+ может использовать новые BLE API

### Ошибка прав

```bash
# Для USB доступа
sudo usermod -aG plugdev $USER
```

## 📚 Ссылки

- [Frida документация](https://frida.re/docs/)
- [RCSP протокол](../PROTOCOL_RECONSTRUCTION.md)
- [Android-JL_Bluetooth SDK](https://github.com/Jieli-Tech/Android-JL_Bluetooth)
