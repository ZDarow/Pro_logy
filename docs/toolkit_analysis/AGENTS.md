# AGENTS.md - PROLOGY_TOOLKIT

Инструментарий для реверс-инжиниринга Android-приложения PROLOGY и RCSP протокола.

## Структура

```
PROLOGY_TOOLKIT/
├── apk/             # Оригинальные APK (PROLOGY-140-5.0.55.apk)
├── ble/             # BLE перехватчик + эмулятор
├── dsp/             # Frida DSP скрипты
├── docs/            # Документация (RCSP_PROTOCOL.md)
├── legacy/          # Архивные исходники и бэкапы
├── Prology/         # Альтернативная версия (CarMedia)
└── scripts/         # Скрипты сборки (decompile.sh, analyze.sh)
```

## Команды

```bash
# BLE перехват (требуется Android + USB debugging)
cd ble/interceptor && python3 prology_logger.py ru.prology.app

# BLE эмулятор (требуется root)
cd ble/peripheral && sudo ./start_peripheral.sh

# Frida DSP
./setup_frida.sh install   # Установка
./setup_frida.sh intercept # Перехват
./setup_frida.sh extend   # Расширения

# Декомпиляция APK
./scripts/decompile.sh apk/PROLOGY-140-5.0.55.apk
```

## RCSP Протокол (полно в docs/RCSP_PROTOCOL.md)

| Параметр | Значение |
|----------|----------|
| Service UUID | `0xAE00` |
| TX (Write) | `0xAE01` |
| RX (Notify) | `0xAE02` |
| Checksum TX | `(sum + 0x10) & 0xFF` |
| Checksum RX | `(sum + 0x40) & 0xFF` |

## Важные пути

- **Пакет APK:** `com.prology`
- **Frida скрипты:** `/home/mi/APK_MOD/`
- **Android SDK:** `/media/mi/home_ext1/tools/Development/Android/sdk`

## Требования

- Frida 17.7.3: `pip install frida frida-tools`
- adb с подключённым устройством
- apktool 2.7.0, jadx 1.5.0

## Что ещё есть

- `docs/prology_analysis/` — анализ APK (APK_ANALYSIS_FULL.md)
- `legacy/sources/` — Java/smali исходники
- `legacy/mobile-apps/` — старые скрипты управления
- `Prology/prology_eway_carmedia/` — альтернативная версия APK