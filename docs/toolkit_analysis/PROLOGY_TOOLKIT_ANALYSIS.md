# PROLOGY TOOLKIT — Полный анализ проекта

## Содержание

1. [Обзор](#обзор)
2. [Структура](#структура)
3. [Протокол RCSP](#протокол-rcsp)
4. [Аппаратное обеспечение](#аппаратное-обеспечение)
5. [Программное обеспечение](#программное-обеспечение)
6. [Команды](#команды)
7. [Эмуляторы](#эмуляторы)
8. [Инструменты](#инструменты)
9. [TODO](#todo)

---

## Обзор

**PROLOGY TOOLKIT** — набор инструментов для реверс-инжиниринга автомагнитолы PROLOGY CMD 300 и протокола RCSP.

| Параметр | Значение |
|----------|----------|
| Устройство | PROLOGY CMD 300 (Jieli AC6951) |
| Приложение | PROLOGY (Android, v5.0.55) |
| APK Package | `com.prology` |
| Транспорт | BLE GATT |
| Протокол | RCSP (Remote Control Serial Protocol) |

---

## Структура

```
/media/mi/home_ext2/tools/PROLOGY_TOOLKIT/
├── AGENTS.md              # Инструкции для агентов
├── README.md             # Общее описание
├── apk/                  # Оригинальные APK
│   └── PROLOGY-140-5.0.55.apk (51MB)
├── ble/                  # BLE инструменты
│   ├── interceptor/       # Frida перехватчик
│   ├── peripheral/       # Python эмуляторы
│   └── logs/            # Перехваченные логи
├── docs/                 # Документация
│   ├── RCSP_PROTOCOL.md   # Спецификация протокола
│   ├── PROLOGY_CMD300/
│   │   └── COMMANDS.md # Справочник команд
│   └── prology_analysis/ # Анализ APK
├── dsp/                 # Frida DSP скрипты
├── legacy/              # Архивные материалы
│   ├── mobile-apps/     # Декомпилированные APK
│   ├── sources/       # smali/kotlin исходники
│   └── tools/        # Старые инструменты
├── output/              # Выходные файлы
├── punchthrough.com/       # BLE статьи (дамп)
├── PROLOGY_CMD300/       # Рабочие документы
│   ├── COMMANDS.md
│   ├── PROTOCOL.md
│   └── README.md
├── scripts/             # Скрипты сборки
├── Sketches/            # Arduino/ESP32 скетчи
│   ├── PROLOGY_Emulator/    # ESP32 эмулятор ⚡
│   ├── PROLOGY_BLE_GATT_Client/  # Рабочий клиент
│   └── ...
└── tools/              # Инструменты
```

---

## Протокол RCSP

### GATT Service

| UUID | Name | Characteristics |
|------|------|----------------|
| `0xAE00` | PROLOGY DSP | TX + RX |
| `0xAE01` | CMD (Write) | Write No Response |
| `0xAE02` | STATUS (Notify) | Notify |

### Checksum

```python
# TX (APK → устройство)
checksum = (sum(all_bytes) + 0x10) & 0xFF

# RX (устройство → APK)  
checksum = (sum(all_bytes) + 0x40) & 0xFF
```

### Packet Format

```
[PREAMBLE][LEN][DATA...][CHECKSUM]
   1 байт    1 байт   N байт   1 байт

Preamble: 0xF0 (command), 0xC0 (response)
```

### Команды

| CMD | Название | Описание |
|-----|---------|----------|
| 0x01 | Init | Инициализация сессии |
| 0x04 | Heartbeat | Keep-alive |
| 0x05 | Heartbeat Resp | Ответ heartbeat |
| 0x80 | Write Param | Запись параметров (EQ, X-Over) |
| 0x8A | Config Ext | Расширенная конфигурация |
| 0x90 | Param Data | Данные параметров |
| 0x9F | Confirm | Подтверждение |
| 0xA0 | Gain/Fade | Volume, Balance, Fader |
| 0xFF | Identification | ИД устройства |

### Response Types

| Type | Length | Description |
|------|--------|------------|
| 0x90 | 3-4 | Volume |
| 0x9A | 2-56 | EQ (10/25-band) |
| 0x9A 0x2A | 3 | Balance |
| 0x9A 0x20 | 3 | Fader |
| 0xB0 | 3-4 | Bass |
| 0xB1 | 3 | Treble |
| 0xC0 | 2 | Status |
| 0xFF | 6+ | Identification |

---

## Аппаратное обеспечение

### PROLOGY CMD 300

| Параметр | Значение |
|----------|----------|
| SoC | Jieli AC6951 |
| Bluetooth | BLE 5.0 |
| Flash | 8MB |
| EQ | 25-band |
| Выход | 4 канала + Sub |

### ESP32 (эмулятор)

| Параметр | Значение |
|----------|----------|
| Модуль | ESP32-D0WD-V3 |
| Ядро | ESP32 2.0.17 |
| Flash | 85% (1.1MB) |
| RAM | 11% (39KB) |

---

## Программное обеспечение

### Android App (PROLOGY-140-5.0.55.apk)

- **Package:** `com.prology`
- **Version:** 5.0.55 (140)
- **Framework:** Flutter
- **SDK:** minSdk 21, targetSdk 34

### BLE библиотека

- `flutter_blue_plus` — BLE операции
- MethodChannel → native BLE

---

## Команды

### Тестированные команды

| # | Команда (HEX) | Действие | Статус |
|---|---------------|---------|--------|
| 1 | `F0 00 03 01 05 00 09` | Init | ✅ |
| 2 | `F0 00 05 A0 10 0E 18 12 ED` | Volume + | ✅ |
| 3 | `F0 00 05 A0 10 0E 18 10 EB` | Volume - | ✅ |
| 4 | `F0 00 06 A0 10 0E 26 01 00 B8` | EQ FLAT | ✅ |
| 5 | `F0 00 06 A0 10 0E 26 01 03 BB` | EQ ROCK | ✅ |
| 6 | `F0 00 06 A0 10 0E 26 01 04 BC` | EQ POP | ✅ |
| 7 | `F0 00 06 A0 10 0E 26 01 09 C1` | EQ JAZZ | ✅ |
| 8 | `F0 00 06 A0 10 0E 26 01 0A C2` | EQ CLASSIC | ✅ |

### Ответы

**Volume (0x90):**
```
C0 00 03 90 01 VV CS
             └─ Volume 0-28
```

**EQ (0x9A):**
```
C0 00 1B 9A 21 PP VV VV...VV CS
               │ └─ 25 значений
               └─ Пресет (08=FLAT, 03=ROCK...)
```

**Balance (0x9A 0x2A):**
```
C0 00 03 9A 2A 03 VV CS
                  └─ 00=center, FE=left, 02=right
```

---

## Эмуляторы

### 1. ESP32 Emulator (Sketches/PROLOGY_Emulator/)

**Файл:** `PROLOGY_Emulator.ino` (683 строки)

**Функции:**
- ✅ GATT Server (Service 0xAE00)
- ✅ Volume 0-28, Mute
- ✅ EQ Presets (FLAT/ROCK/POP/JAZZ/CLASSIC)
- ✅ Balance/Fader
- ✅ Bass/Treble
- ✅ Input Select
- ✅ CLI (Serial)
- ✅ Fast-then-slow advertising

**CLI команды:**
```
vol 15       # Volume 0-28
vol+ / vol-  # +/-1
mute        # Toggle
eq rock    # Preset
bal l5/r3  # Balance
fad f2/r1  # Fader
bass +3    # Bass
treble -2   # Treble
input bt    # Input
status     # Show state
help      # Help
raw f000... # Raw command
```

**Прошивка:**
```bash
arduino-cli compile -b esp32:esp32:esp32doit-devkit-v1 .
arduino-cli upload -p /dev/ttyUSB0 -b esp32:esp32:esp32doit-devkit-v1 .
```

### 2. Python Emulator (ble/peripheral/)

**Файл:** `prology_emulator.py` (446 строк)

**Особенности:**
- Python 3 + dbus (Bluez)
-Полная эмуляция RCSP
- Логирование команд
- Поддержка всех команд

**Запуск:**
```bash
cd ble/peripheral
sudo ./prology_emulator.py
```

### 3. Logger (ble/peripheral/)

**Файл:** `prology_logger.py` (385 строк)

**Особенности:**
- Перехват BLE команд
- Логирование в JSON
- А��ализ пакетов

---

## Инструменты

### Frida

**Скрипты:**
- `ble/interceptor/frida_bluetooth_hook.js` — перехват BLE
- `dsp/frida_dsp_interceptor.js` — перехват DSP команд

**Запуск:**
```bash
frida -U -f com.prology -l ble/interceptor/frida_bluetooth_hook.js
```

### APK Декомпиляция

```bash
# apktool
apktool d PROLOGY-140-5.0.55.apk -o output/

# jadx
jadx -d output/ PROLOGY-140-5.0.55.apk
```

---

## TODO

### Приоритет 1 — Тестирование эмулятора

- [ ] Подключить телефон к ESP32
- [ ] Отправить Init команду
- [ ] Проверить ответ
- [ ] Тестировать Volume +/-
- [ ] Тестировать EQ
- [ ] Тестировать Balance

### Приоритет 2 — Расширение эмулятора

- [ ] Добавить больше EQ пресетов
- [ ] Добавить X-Over команды
- [ ] Добавить Time Alignment
- [ ] Добавить 25-band EQ control

### Приоритет 3 — Анализ

- [ ] Capture больше трафика
- [ ] Расшифровать X-Over payload
- [ ] Расшифровать Time Alignment payload

---

## References

- `docs/RCSP_PROTOCOL.md` — Спецификация
- `PROLOGY_CMD300/COMMANDS.md` — Команды
- `ble/peripheral/prology_emulator.py` — Python эмулятор
- `Sketches/PROLOGY_Emulator/` — ESP32 эмулятор