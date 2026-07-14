# PROLOGY BLE Protocol — Comprehensive Specification v2.0

**Дата:** 2026-06-03  
**Источники:** HCI-лог (8842 пакета), декомпиляция APK, prology_flutter_linux, btsnoop  
**Устройство:** PROLOGY LS20, прошивка JW_LS20WF0151  
**SoC:** Jieli AC6951 + MCU_6951_DSP

---

## 1. Транспорт

### 1.1 Dual Transport

| Транспорт | HCI пакетов | UUID / Handle | Назначение |
|-----------|-------------|---------------|------------|
| **BLE GATT** | 145 | Service `AE00`, Write `AE01` (handle 0x0016), Notify `AE02` (handle 0x0018) | Команды управления |
| **Classic SPP** (RFCOMM) | 4035 | UUID `00001101-...`, канал 1 | Аудио, настройки, bulk-данные |

> **Примечание:** Flutter-приложение (v1.x) реализовано только на BLE через UUID `AF01`.  
> HCI-лог подтверждает Notify через handle `0x0018` (UUID `AE02`).

### 1.2 BLE GATT Handles (подтверждено HCI)

| Handle | UUID | Назначение |
|--------|------|------------|
| 0x0013 | — | CCCD сервиса 1 |
| 0x0016 | `AE01` | Write (команды) |
| 0x0018 | `AE02` | Notify (ответы) |
| 0x0019 | — | CCCD сервиса 2 |
| 0x001D | — | Info сервис |
| 0x001E | — | CCCD info |

---

## 2. Формат пакета

### 2.1 Универсальный формат (BLE и SPP)

```
Запрос:  6F CMD TYPE LEN [DATA...] CS 8F
Ответ:   6F CMD TYPE LEN [DATA...] CS 8F

Байты:
  6F       — SYNC (начало пакета)
  CMD      — код команды
  TYPE     — тип: 0x70=запрос, 0x80=ответ, 0x71=запрос+, 0x81=ответ+
  LEN      — длина DATA (1 байт)
  DATA     — N байт полезных данных
  CS       — контрольная сумма (XOR всех байтов от SYNC до DATA включительно)
  8F       — END (конец пакета)
```

### 2.2 Контрольная сумма

```
CS = XOR всех байтов от 0x6F до последнего байта DATA
```

**Реализация:**
```dart
int _checksum(List<int> data) {
  // data = [0x6F, CMD, TYPE, LEN, ...DATA]
  return data.fold(0, (prev, b) => prev ^ b);
}
```

> ❗ В SPP-трафике (RFCOMM) контрольная сумма **отсутствует** — уязвимость.

---

## 3. Таблица команд (полная, по HCI-логу)

| CMD | Название | REQ LEN | RESP LEN | REQ (HEX) | RESP (HEX) |
|-----|----------|---------|----------|-----------|------------|
| 0x01 | **EQ_PRESET** | 1 | 2 | `6f 01 70 01 00 xx 8f` | `6f 01 81 02 00 xx yy 8f` |
| 0x03 | **XOVER** | 1 | 5 | `6f 03 70 01 00 00 8f` | `6f 03 80 05 00 00 4c 53 32 30 8f` → "LS20" |
| 0x04 | **HEARTBEAT** | 12 | — | `6f 04 71 0c 00 ea 07 03 0e 0a 28 23 01 00 01 03 00 8f` | — |
| 0x08 | **BASS_TREBLE** | 1 | 3 | `6f 08 70 01 00 01 8f` | `6f 08 80 03 00 00 58 00 8f` ↑bass=88 |
| 0x0B | **REQ_SUB** | 1 | — | `6f 0b 71 01 00 0c 8f` | — |
| 0x0C | **REQ_MEDIA** | 1 | — | `6f 0c 71 01 00 00 8f` | — |
| 0x0F | **VOLUME** | 1 | 3 | `6f 0f 70 01 00 01 8f` | `6f 0f 80 03 00 01 01 01 8f` ↑vol=1 |
| 0x11 | **SUBWOOFER** | 1 | 16 | `6f 11 70 01 00 01 8f` | `6f 11 80 10 00 00 0e 4a 57...` → "JW_LS20WF0151" |
| 0x41 | **AUDIO_SETT** | 1 | 18 | `6f 41 70 01 00 02 8f` | Сложный ответ (настройки) |
| 0x43 | **EQ_SETTINGS** | 1 | 13 | `6f 43 70 01 00 01 8f` | 13 байт EQ-настроек |
| 0x50 | **PRESET** | 1 | 21 | `6f 50 70 01 00 00 8f` | Пресеты (21 байт) |
| 0x5C | **REQ_AUDIO** | 1 | — | `6f 5c 71 01 00 0a 8f` | — |
| 0x90 | **REQUEST** | 1 | 4 | `6f 90 70 01 00 xx 8f` | `6f 90 80 04 00 f8 93 20 20 8f` |
| 0x93 | **DEVICE_INFO** | 1 | 16 | `6f 93 70 01 00 00 8f` | `6f 93 80 10 00 64 31 37...` → serial |
| 0x9E | **REQ_STATUS** | 5 | — | `6f 9e 71 05 00 00 01 02 31 01 8f` | — |
| 0xBE | **BLUETOOTH** | 11 | 4+ | `6f be 70 0b 00 00 02 08 d0 7a b4 69 4f cc b5 69 8f` | `6f be 80 04 00 02 02 00 00 8f` |
| 0xD8 | **UNKNOWN** | 6 | — | `6f d8 71 06 00 00 01 06 00 01 07 8f` | — |
| 0xE0 | **UNKNOWN** | 3 | — | `6f e0 71 03 00 02 01 35 8f` | — |

---

## 4. Детальная спецификация команд

### 4.1 DEVICE_INFO (0x93)

```
Запрос:  6F 93 70 01 00 00 8F
Ответ:   6F 93 80 10 00 XX [SERIAL_16bytes] 8F
         └── serial = "d17275481dd87936"
```

### 4.2 VOLUME (0x0F)

```
Запрос:  6F 0F 70 01 00 <LEVEL> 8F         // LEVEL: 0-100
Ответ:   6F 0F 80 03 00 01 01 <LEVEL> 8F   // подтверждение
```

### 4.3 BASS_TREBLE (0x08)

```
Запрос:  6F 08 70 01 00 <TYPE> 8F
         TYPE: 0x01 = bass, 0x02 = treble
Ответ:   6F 08 80 03 00 00 <LEVEL> 00 8F   // LEVEL: 0-100
```

### 4.4 EQ_PRESET (0x01)

```
Запрос:  6F 01 70 01 00 <PRESET_ID> 8F

Пресеты (из декомпиляции):
  0  = FLAT
  3  = ROCK
  4  = JAZZ
  5  = CLASSICAL
  6  = POP
  1,2,7-60 = CUSTOM / EQ_N

Ответ:   6F 01 81 02 00 <ACK> ?? 8F
```

### 4.5 EQ_SETTINGS (0x43)

```
Запрос:  6F 43 70 01 00 01 8F
Ответ:   6F 43 80 0D 00 01 0B 18 01 08 00 00 01 01 01 01 01 08 8F
         └── 13 байт: пресет, ? , band gains...

Парсинг (предположительно):
  [0] = пресет
  [1] = ?
  [2] = band_0_gain
  [3] = band_1_gain
  ...
```

### 4.6 XOVER (Crossover, 0x03)

```
Запрос:  6F 03 70 01 00 00 8F
Ответ:   6F 03 80 05 00 00 4C 53 32 30 8F
         └── "LS20" (модель устройства)

Запись:  CMD 0x20 = XOVER_HPF, CMD 0x21 = XOVER_LPF
  Формат: 6F 20 70 05 [CH] [FREQ] [GAIN+12] [SLOPE] [TYPE] 8F
  Формат: 6F 21 70 05 [CH] [FREQ] [GAIN+12] [SLOPE] [TYPE] 8F
```

### 4.7 SUBWOOFER (0x11)

```
Запрос:  6F 11 70 01 00 01 8F
Ответ:   6F 11 80 10 00 00 0E 4A 57 5F 4C 53 32 30 57 46 30 31 35 31 00 8F
         └── 0x0E=14, "JW_LS20WF0151" (имя устройства)

Параметры (из prology_flutter_linux):
  sendSubwooferVolume(ch, volume)
  sendSubwooferCutOffFrequency(freq)
```

### 4.8 HEARTBEAT (0x04)

```
Запрос:  6F 04 71 0C 00 EA 07 03 0E 0A 28 23 01 00 01 03 00 8F
```

### 4.9 BLUETOOTH (0xBE) — сопряжённые устройства

```
Запрос:  6F BE 70 0B 00 <OP> <COUNT> 08 <MAC1_6bytes> <MAC2_6bytes> 8F
Ответ:   6F BE 80 04 00 <OP> 02 <STATUS> 00 8F

OP = номер операции (0x00-0x07)
STATUS: 0x00 = paired, 0x01 = disconnected, etc.
```

---

## 5. 60-полосный эквалайзер (из декомпиляции)

**Параметры на полосу:**
- **Gain:** -12..+12 dB (отправляется как value+12)
- **Q-Factor:** 0.1..10.0 (разные типы: shared, link, period)
- **Частота:** определяется номером полосы

**Команды EQ из prology_flutter_linux:**

| Функция | CMD | DATA |
|---------|-----|------|
| sendEqGain | 0x02 0x70 | `[band] [gain+12]` |
| sendEqQFactor | 0x03 0x70 | `[band] [q_value]` |
| sendEqQFactorShared | 0x03 0x71 | ... |
| sendEqQFactorLink | 0x03 0x72 | ... |
| setEqCurve | 0x01 0x73 | preset_id |
| setEqGroupEnable | 0x01 0x74 | group_id, enable |

---

## 6. Расширенные DSP-команды (из декомпиляции)

### 6.1 Time Alignment (0x30)

```
6F 30 70 02 [CHANNEL] [DELAY] 8F

CHANNEL: 0-15 (16 каналов)
DELAY: 0-200 (миллисекунды или сантиметры)
```

### 6.2 Mute per-channel (0x40)

```
6F 40 70 02 [CHANNEL] [0x00/0x01] 8F
```

### 6.3 Сохранение пресета (0x50)

```
6F 50 70 09 [SLOT] [NAME_8bytes] 8F
NAME: 8 символов ASCII (дополненные 0x20)
```

### 6.4 Громкость сабвуфера (0x13)

```
6F 13 70 02 [01] [VOLUME] 8F
VOLUME: 0-100
```

### 6.5 Bass Boost (0x14)

```
6F 14 70 02 [ENABLE] [LEVEL] 8F
ENABLE: 0x00/0x01
LEVEL: 0-100
```

### 6.6 Запрос статуса (0x70)

```
Запрос:  6F 70 70 02 00 01 8F
Ответ:   6F 70 80 XX [VOLUME] [INPUT] [PRESET] [BAND_GAINS...] 8F
         └── полный статус: громкость, источник, пресет, ~25 band gains
```

---

## 7. Сравнение с Flutter-реализацией (v1.x)

| Параметр | Текущая реализация (v1.x) | HCI-лог / Эталон | Исправление |
|----------|--------------------------|-------------------|-------------|
| **Формат пакета** | `F0 00 LEN A0 10 0E CMD DATA CS` | `6F CMD TYPE LEN DATA CS 8F` | ❌ Полная замена |
| **Sync** | `0xF0 0x00` | `0x6F` | ❌ |
| **End** | нет | `0x8F` | ❌ |
| **Notify UUID** | `AF01` | `AE02` (handle 0x0018) | ❌ |
| **CS алгоритм** | `(sum + 0x10) & 0xFF` | `XOR всех байтов` | ❌ |
| **Init** | `F0 00 03 01 05 00 09` | `6F 93 70 01 00 00 8F` (Device Info) | ❌ |
| **Volume** | 0-28, CMD 0x18 | 0-100, CMD 0x0F | ❌ |
| **Bass/Treble** | CMD 0x24 + 0x10/0x20 offset | CMD 0x08, тип 0x01/0x02, 0-100 | ❌ |
| **EQ** | 10 полос, 7 пресетов | 60 полос, 60+ пресетов | ❌ |
| **Balance/Fader** | CMD 0x2A/0x20 + offset | CMD 0x9A (из prology_flutter_linux) | ❌ |
| **X-Over** | заглушка (0x50) | CMD 0x20/0x21, HPF+LPF, 4 типа | ❌ |
| **Time Alignment** | заглушка (0x60) | CMD 0x30, 16 каналов | ❌ |
| **Heartbeat** | нет | CMD 0x04 | ❌ |

---

## 8. Структура ответов (notification)

### 8.1 Volume notification (0x90)

```
C0 00 03 90 01 <VOLUME> CS
         └── где VOLUME: 0-28 (текущий, устаревший)
```

> ❗ В HCI-логе VOLUME идёт через CMD 0x0F (0-100), не через notification 0x90.  
> Нотация `C0 00...` из оригинального APK — вероятно, дополнительный/старый канал.

### 8.2 Статусный ответ (0x80)

```
6F <CMD> 80 <LEN> 00 <DATA...> 8F
         └── 0x80 = response type
```

---

## 9. MCU Архитектура (из декомпиляции)

| MCU | Назначение |
|-----|------------|
| **MCU_6951_DSP** | Цифровой сигнальный процессор (EQ, X-Over, TA) |
| **MCU_6951** | Главный микроконтроллер (Jieli) |
| **MCU_5110** | Дополнительный контроллер |
| **MCU_1048** | Сервисный / диагностический |

Парсеры команд по MCU:
- `_parserDsp` / `_parserDspPlus` — DSP
- `_parserSound` — звук
- `_parserBluetooth` — Bluetooth
- `_parserMedia` / `_parserSong` — медиа
- `_parserRadio` — радио
- `_parserRemote` — пульт ДУ
- `_parserSetting` — настройки
- `_parserAuxIn` — AUX

---

## 10. Уязвимости безопасности

| # | Уязвимость | CVSS | Описание |
|---|------------|------|----------|
| 1 | Отсутствие аутентификации | 8.6 | Любой BLE-клиент может управлять |
| 2 | Нет шифрования трафика | 7.5 | Команды в открытом виде |
| 3 | Нет CS в SPP | 7.2 | Пакеты можно подделать |
| 4 | Нет rate limiting | 5.3 | DoS возможна |

---

## 11. Справочник UUID (полный)

| UUID | Назначение |
|------|------------|
| `00001101-0000-1000-8000-00805F9B34FB` | Classic SPP |
| `0000AE00-0000-1000-8000-00805F9B34FB` | BLE Service |
| `0000AE01-0000-1000-8000-00805F9B34FB` | Write characteristic |
| `0000AE02-0000-1000-8000-00805F9B34FB` | Notify characteristic |
| `0000AF00-0000-1000-8000-00805F9B34FB` | BLE Service 2 (альтернативный) |
| `0000AF01-0000-1000-8000-00805F9B34FB` | Write 2 |
| `0000AF02-0000-1000-8000-00805F9B34FB` | Notify 2 |

---

## 12. Источники данных

| Источник | Файл | Строк |
|----------|------|-------|
| HCI-лог | `Prology/archive/btsnoop_hci.log` | 8842 пакета |
| HCI-анализатор | `Prology/archive/hci_analyzer.py` | 450+ |
| Dart-анализатор | `Prology/archive/dart_analyzer.py` | 250+ |
| Протокол-анализатор | `Prology/archive/protocol_analyzer.py` | 400+ |
| Отчёт декомпиляции | `Prology/archive/DECOMPILATION_REPORT.md` | 541 строка |
| Анализ HCI | `Prology/archive/HCI_ANALYSIS_DETAILED.md` | 364 строки |
| Итоговый отчёт | `Prology/archive/FINAL_REPORT.md` | 601 строка |
| Linux-реализация | `docs/toolkit_analysis/prology_flutter_linux/lib/services/prology_protocol.dart` | 290 строк |
| Анализ APK | `Prology/archive/APK_ANALYSIS_FULL.md` | 730 строк |
| Python Library | `Prology/archive/prology-control/` | 1249 строк |
| ESP32 эмулятор | `docs/toolkit_analysis/Sketches/PROLOGY_Emulator/PROLOGY_Emulator.ino` | 683 строки |
