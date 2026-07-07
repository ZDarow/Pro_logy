# RCSP Protocol Specification

## Overview

RCSP (Remote Control Serial Protocol) — бинарный протокол связи между Android приложением PROLOGY и автомагнитолой по BLE.

## Physical Layer

| Parameter | Value |
|-----------|-------|
| Transport | BLE GATT |
| Service UUID | `0xAE00` |
| TX Characteristic | `0xAE01` (Write) |
| RX Characteristic | `0xAE02` (Notify) |

## Packet Format

```
[CMD][PAYLOAD...][CHECKSUM]
 1 байт   N байт     1 байт
```

## Checksum

```python
# TX (APK → устройство)
checksum = (sum(all_bytes) + 0x10) & 0xFF

# RX (устройство → APK)
checksum = (sum(all_bytes) + 0x40) & 0xFF
```

## Commands

### 0x01 — Init (TX)
Инициализация сессии.

**Payload:** пусто

**Response (RX 0xFF):** Identification

---

### 0x03 — Query (TX)
Запрос статуса канала.

**Payload:**
- `byte[0]` — номер канала

**Response (RX 0x07):** Status

---

### 0x04 — Heartbeat (TX)
Keep-alive пакет.

**Payload:**
- `byte[0]` — порядковый номер

**Response (RX 0x05):** Heartbeat Response

---

### 0x05 — Heartbeat Response (RX)
Ответ на heartbeat.

**Payload:**
- `byte[0]` — порядковый номер

---

### 0x07 — Status (RX)
Статус канала.

**Payload:**
- `byte[0]` — номер канала
- `byte[1]` — значение статуса

---

### 0x80 — Write Param (TX)
Запись параметров (эквалайзер, настройки звука).

**Payload:** переменной длины, зависит от типа параметра

**Response (RX 0x9F):** Confirm

---

### 0x8A — Config Ext (TX)
Расширенная конфигурация.

**Payload:**
- `byte[0]` — sub-command

**Response (RX 0x9F):** Confirm

---

### 0x8E — Status Req (TX)
Запрос статуса.

**Payload:**
- `byte[0]` — номер канала

**Response (RX 0x90):** Param Data

---

### 0x90 — Param Data (RX)
Данные параметров.

**Payload:** переменная длина

---

### 0x92 — Telemetry (RX)
Телеметрия устройства.

**Payload:**
- `byte[0]` — уровень заряда (%)
- `byte[1]` — RSSI (dBm)

---

### 0x9F — Confirm (RX)
Подтверждение получения команды.

**Payload:**
- `byte[0]` — код подтверждаемой команды

---

### 0xA0 — Gain/Fade (TX)
Настройка громкости и фейдера.

**Response (RX 0x9F):** Confirm

---

### 0xB0 — B0 Data (RX)
Данные B0.

---

### 0xFF — Identification (RX)
Идентификация устройства.

**Payload:**
```
[0x00][device_name][0x00][firmware_version]
```

**Example:**
```
00 PROLOGY_BLE 00 VER 8.7DSP
```

---

## Session Flow

```
APK (TX)                    Device (RX)
    |                           |
    |------ 0x01 Init ------>|
    |<---- 0xFF ID -----------|
    |                           |
    |------ 0x04 Heartbeat -->|
    |<---- 0x05 Heartbeat ----|
    |      (every ~1s)        |
    |                           |
    |------ 0x80 Write Param ->|
    |<---- 0x9F Confirm ------|
    |                           |
    |<---- 0x92 Telemetry ----|
    |      (periodic)          |
```

## Research Notes

### 0x80 Write Param Payload — Гипотеза

Based on Jieli AC6951 (30-band EQ) и анализа libapp.so:

**EQ формат (предположительно):**
```
[CMD=0x80][CHANNEL][EQ_TYPE][GAIN_1][GAIN_2]...[GAIN_N][CHECKSUM]

Channel: 0x01-0x07 (FL, FR, RL, RR, SW, Tweeter, All)
EQ Type: 0x00=Normal, 0x01=Custom, 0x02=Preset
Gain: 1 байт на полосу, диапазон 0x00-0xFF (0 = -12dB, 0x80 = 0dB, 0xFF = +12dB)
```

**Известные пресеты (из libapp.so):**
- EQ_8 (8 полос), EQ_12D, EQ_13, EQ_14, EQ_16, EQ_23, EQ_33, EQ_39, EQ_44, EQ_51, EQ_55

**Частотные полосы:**
```
60Hz, 170Hz, 310Hz, 600Hz, 1kHz, 3kHz, 6kHz, 12kHz, 14kHz, 16kHz (10 bands)
```

### 0x8A Config Ext Sub-commands (Hypothesis)

```
0x8A 0x01 - EQ Preset Save
0x8A 0x02 - EQ Preset Load
0x8A 0x03 - Reset EQ
```

## Research Status

| Command | Status | Notes |
|---------|--------|-------|
| 0x01 Init | ✅ Known | |
| 0x03 Query | ✅ Known | |
| 0x04 Heartbeat | ✅ Known | 1s interval |
| 0x05 Heartbeat Resp | ✅ Known | |
| 0x07 Status | ✅ Known | |
| 0x80 Write Param | 🔬 Need Capture | EQ data format unknown |
| 0x8A Config Ext | 🔬 Need Capture | sub-commands unknown |
| 0x8E Status Req | ✅ Known | |
| 0x90 Param Data | 🔬 Need Capture | |
| 0x92 Telemetry | ✅ Known | |
| 0x9F Confirm | ✅ Known | |
| 0xA0 Gain/Fade | 🔬 Need Capture | payload unknown |
| 0xB0 B0 Data | ❓ Unknown | not analyzed |
| 0xFF Identification | ✅ Known | |

## Исследование (из документации)

### Известные команды DSP (из RCSP)

Основано на анализе libapp.so и Flutter коде:

| Команда | Описание | Payload |
|---------|----------|---------|
| 0x80 | DSP Write | EQ + X-Over + TA параметры |
| 0x8A | Config Ext | Пресеты, сброс |
| 0xA0 | Gain/Fade | Volume, Balance |

### EQ Специфика (из DSP_ANALYSIS_REPORT.md)

- **Пресеты:** EQ_8, EQ_12D, EQ_13, EQ_14, EQ_16, EQ_23, EQ_33, EQ_39, EQ_44, EQ_51, EQ_55
- **Полос:** 8-14 (EQ_8 = 8 полос, EQ_55 = 10+ полос)
- **Параметры:** Gain (-12 до +12 dB), Frequency (20Hz-20kHz), Q-Factor

### X-Over (из документации)

- **Типы:** 2-way, 3-way
- **Параметры:** Type, Mute, Link R/L, HPF/LPF

### Time Alignment

- **Каналы:** Front Left, Front Right, Rear Left, Rear Right, Subwoofer, Tweeter (7+)
- **Параметры:** Delay, Gain, Mute

### BLE MethodChannel

```
flutter_blue_plus/methods
├── scan → discover
├── connect → GATT
├── discoverServices → find services
├── write → send packets
├── setNotifyValue → receive
└── read → read state
```

### Точки расширения (из DSP_ANALYSIS_REPORT.md)

- `EqPlusModel` — модель EQ
- `XOverModel` — модель кроссовера
- `TimeAlignmentModel` — модель TA
- `PresetViewModel` — пресеты

## Исследование TODO

### Приоритет 1: Capture трафика (Frida)

```bash
# Перехват BLE пакетов
frida -U -f com.prology -l dsp/frida_dsp_interceptor.js --no-pause

# Изменить EQ slider → записать 0x80 payload
# Изменить X-Over → записать 0x80 payload  
# Изменить TA → записать 0x80 payload
```

### Приоритет 2: Анализ payload

```bash
# Парсить логи
jq '.packets[] | select(.cmd == "0x80")' logs/*.json
```

## References

- `ble/peripheral/prology_emulator.py` — эмулятор с обработчиком команд
- `ble/peripheral/prology_logger.py` — логгер с парсером
- `ble/INSTRUMENTATION_OVERVIEW.md` — обзор инструментов
