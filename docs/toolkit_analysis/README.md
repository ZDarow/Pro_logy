# PROLOGY_TOOLKIT

Единый инструментарий для анализа и модификации PROLOGY Android приложения.

## Структура

```
PROLOGY_TOOLKIT/
├── apk/                      # Оригинальные APK
├── ble/                     # BLE инструменты
│   ├── interceptor/         # Frida перехватчики
│   ├── peripheral/          # BLE эмулятор
│   └── logs/                # Логи захвата
├── dsp/                     # DSP модификации
│   ├── frida_dsp_*.js       # Frida DSP скрипты
├── docs/                    # Документация
├── scripts/                 # Скрипты сборки
└── setup_frida.sh           # Установка Frida
```

## Быстрый старт

### Требования
```bash
# Android SDK
export ANDROID_HOME=/media/mi/home_ext1/tools/Development/Android/sdk

# Frida
pip install frida frida-tools

# Подключить Android устройство с USB debugging
adb devices
```

### Использование

#### 1. Логирование BLE
```bash
cd ble/interceptor
python3 prology_logger.py ru.prology.app
```

#### 2. BLE эмулятор
```bash
cd ble/peripheral
sudo ./start_peripheral.sh
```

#### 3. DSP расширения
```bash
./setup_frida.sh extend
```

#### 4. Декомпиляция APK
```bash
./scripts/decompile.sh apk/PROLOGY-140-5.0.55.apk
```

## Инструменты

### BLE Анализ
| Файл | Назначение |
|------|-----------|
| `prology_logger.py` | Перехват BLE пакетов (Frida) |
| `prology_server.py` | BLE эмулятор устройства |
| `ble_interceptor.js` | Перехват BLE вызовов |
| `frida_bluetooth_hook.js` | Hook Bluetooth методов |

### DSP Модификация
| Файл | Назначение |
|------|-----------|
| `frida_dsp_interceptor.js` | Логирование DSP команд |
| `frida_dsp_extensions.js` | Инжекция новых функций |

### Скрипты
| Файл | Назначение |
|------|-----------|
| `decompile.sh` | Декомпиляция APK |
| `analyze.sh` | Анализ кода |
| `rebuild.sh` | Сборка APK |

## RCSP Протокол

- **Service UUID:** 0xAE00
- **TX (Write):** 0xAE01
- **RX (Notify):** 0xAE02
- **Checksum TX:** `(sum + 0x10) & 0xFF`
- **Checksum RX:** `(sum + 0x40) & 0xFF`

## Версии

- **APK:** PROLOGY-140-5.0.55
- **Frida:** 17.7.3
- **jadx:** 1.5.0
- **apktool:** 2.7.0
