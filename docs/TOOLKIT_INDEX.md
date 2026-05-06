# PROLOGY_TOOLKIT — Сводный индекс

Документация и инструменты для реверс-инжиниринга автомагнитол Prology CMD 300.

## 📚 Документация

| Файл | Описание |
|------|------------|
| `PROLOGY_TOOLKIT_ANALYSIS.md` | Общий анализ: структура, протокол RCSP, команды |
| `RCSP_PROTOCOL.md` | Спецификация протокола (UUID, пакеты, контрольная сумма) |
| `PROLOGY_CMD300/COMMANDS.md` | Справочник команд (EQ, Volume, Balance) |
| `DSP_ANALYSIS_REPORT.md` | Анализ DSP функций (EQ, X-Over, TA, Subwoofer) |
| `PROTOCOL_ANALYSIS_TEMPLATE.md` | Шаблон для анализа протокола |
| `QUICK_REFERENCE.md` | Быстрая справка по командам |
| `TROUBLESHOOTING.md` | Решение проблем (Frida, BLE) |

## 🛠️ Инструменты

### BLE
- `ble/interceptor/frida_bluetooth_hook.js` — перехват BLE на Android
- `ble/peripheral/prology_emulator.py` — эмулятор устройства (Python)
- `ble/peripheral/prology_logger.py` — логирование пакетов

### ESP32
- `Sketches/PROLOGY_Emulator/` — прошивка эмулятора (Arduino)
- `Sketches/PROLOGY_BLE_Clone/` — клонирование BLE

### Frida
- `dsp/frida_dsp_interceptor.js` — перехват DSP команд
- `setup_frida.sh` — установка и запуск

## 🔬 Протокол RCSP (кратко)

| Параметр | Значение |
|-----------|----------|
| Service UUID | `0xAE00` |
| TX (Write) | `0xAE01` |
| RX (Notify) | `0xAE02` |
| Checksum TX | `(sum + 0x10) & 0xFF` |
| Checksum RX | `(sum + 0x40) & 0xFF` |

## 🎵 Аудио функции (из DSP_ANALYSIS_REPORT)

| Функция | Статус | Детали |
|-----------|--------|---------|
| EQ (25-band) | ✅ | Пресеты: FLAT, ROCK, POP, JAZZ, CLASSIC |
| X-Over | ✅ | 2-way, 3-way, LPF/HPF |
| Time Alignment | ✅ | 7+ каналов, Delay, Gain |
| Subwoofer | ✅ | Volume, Cut-off, Loudness |
| Loudness | ✅ | Вкл/Выкл, частота |

## 🚀 Быстрый старт

```bash
# Перехват BLE (Frida)
frida -U -f com.prology -l ble/interceptor/frida_bluetooth_hook.js

# Эмулятор (Python)
cd ble/peripheral && sudo ./prology_emulator.py

# Сборка ESP32
arduino-cli compile -b esp32:esp32:esp32doit-devkit-v1 Sketches/PROLOGY_Emulator/
```

## 📊 Статус реализации в Pro_logy

| Функция | Реализовано | Детали |
|-----------|-------------|---------|
| Volume/Bass/Treble | ✅ | Через `BtRepository` |
| EQ Presets | ✅ | 5 пресетов (FLAT- CLASSIC) |
| Input Select | ✅ | 8 источников (Radio-BT-AUX...) |
| Extended Audio | ⚠️ | Заглушки (нужны байты из `libapp.so`) |
| Parking Sensor | ❌ | Только UI (иконки) |
| Remote Control | ❌ | Нет реализации |

## 🔗 Ссылки
- [GitHub репозиторий](https://github.com/ZDarow/Pro_logy)
- [Основной README](../README.md)
- [Спецификация reverse-engineered](../specs/prology_reverse_spec.md)
