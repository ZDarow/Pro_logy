# PROLOGY BLE Instrumentation — Обзор

## 📦 Что создано

### 1. 🎯 Frida Logger (`prology_logger.py`)

**Назначение:** Перехват BLE пакетов на runtime БЕЗ модификации APK

**Как работает:**
```
PROLOGY APK → Frida hook → Перехват writeCharacteristic()
                     ↓
              Запись в лог (TXT + JSON)
                     ↓
              Парсинг RCSP (checksum, команды, payload)
```

**Что логирует:**
- ✅ TX пакеты (APK → устройство)
- ✅ RX пакеты (устройство → APK)
- ✅ Checksum валидация
- ✅ Временные метки
- ✅ Интерпретация команд (Init, Heartbeat, EQ и т.д.)

**Результат:**
```
/home/mi/7a/prology/logs/
├── prology_ble_20260406_113000.log   # Человекочитаемый
└── prology_ble_20260406_113000.json  # Для анализа
```

### 2. 🔵 BLE Периферия (`prology_server.py`)

**Назначение:** Эмуляция PROLOGY устройства через Bluez D-Bus

**Как работает:**
```
Телефон с PROLOGY → BLE реклама (0xAE00)
                          ↓
              Подключение к ПК
                          ↓
              GATT Service (TX: 0xAE01, RX: 0xAE02)
                          ↓
              Обработка RCSP команд
```

**Поддерживаемые команды:**
| CMD | Название | Ответ |
|-----|----------|-------|
| 0x01 | Init | Identification (0xFF) |
| 0x03 | Query | Status (0x07) |
| 0x04 | Heartbeat | Heartbeat Resp (0x05) |
| 0x80 | Write Param | Confirm (0x9F) |
| 0x8A | Config Ext | Confirm (0x9F) |
| 0x8E | Status Req | Param Data (0x90) |
| 0xA0 | Gain/Fade | Confirm (0x9F) |

**Требования:**
- Bluetooth адаптер с BLE 4.0+
- Root права

### 3. 📋 RCSP Обработчик (`prology_emulator.py`)

**Назначение:** Полная эмуляция PROLOGY устройства через HCI socket

**Функции:**
- ✅ Расчёт checksum (TX/RX)
- ✅ Построение пакетов
- ✅ Обработка 7 типов команд
- ✅ Генерация ответов

## 🚀 Быстрый старт

### Вариант A: Логирование PROLOGY (Рекомендуется)

```bash
# 1. Установка Frida на устройство
cd /home/mi/7a/prology/ble_peripheral
./setup_frida.sh

# 2. Запуск frida-server на устройстве
adb shell '/data/local/tmp/frida-server &'

# 3. Запуск логирования
python3 prology_logger.py
```

### Вариант B: BLE Периферия

```bash
# Требует BLE адаптер!
cd /home/mi/7a/prology/ble_peripheral
sudo ./start_peripheral.sh
```

## 📊 Пример использования

### Логирование EQ команд

```
1. Запустить logger: python3 prology_logger.py
2. Открыть PROLOGY на устройстве
3. Подключиться к устройству
4. Изменить эквалайзер
5. Остановить logger (Ctrl+C)
6. Анализировать логи:
   cat /home/mi/7a/prology/logs/prology_ble_*.json | jq '.packets[] | select(.cmd == "0x80")'
```

### Анализ результатов

```bash
# Статистика команд
jq '.packets[].cmd' logs/prology_ble_*.json | sort | uniq -c | sort -rn

# Поиск ошибок checksum
jq '.packets[] | select(.checksum_valid == false)' logs/prology_ble_*.json

# Временная диаграмма
jq '.packets[].elapsed' logs/prology_ble_*.json | gnuplot
```

## 📋 RCSP Protocol Summary

### Checksum

```python
# TX (APK → устройство)
checksum = (sum(all_bytes) + 0x10) & 0xFF

# RX (устройство → APK)
checksum = (sum(all_bytes) + 0x40) & 0xFF
```

### Формат пакета

```
[CMD][PAYLOAD...][CHECKSUM]
 1 байт   N байт     1 байт
```

### BLE Характеристики

| UUID | Назначение | Операции |
|------|------------|----------|
| 0xAE00 | Service UUID | — |
| 0xAE01 | TX (Write) | write, write-without-response |
| 0xAE02 | RX (Notify) | notify |

## 🔧 Troubleshooting

### Frida не подключается

```bash
# Проверить frida-server
adb shell "ps | grep frida"

# Перезапустить
adb shell "killall frida-server"
adb shell "/data/local/tmp/frida-server &"

# Проверить с ПК
frida-ps -U
```

### Нет пакетов в логе

- Убедитесь что PROLOGY подключён к BLE устройству
- Проверьте что перехватывается правильный package name
- Android 12+ может использовать новые BLE API

### BLE периферия не запускается

```bash
# Проверить поддержку BLE адаптером
sudo btmgmt info | grep le

# Если LE не поддерживается — нужен другой адаптер
hciconfig -a
```

## 📚 Ссылки

- [PROTOCOL_RECONSTRUCTION.md](../PROTOCOL_RECONSTRUCTION.md) — Расшифровка протокола
- [Android-JL_Bluetooth SDK](https://github.com/Jieli-Tech/Android-JL_Bluetooth)
- [Frida документация](https://frida.re/docs/)
