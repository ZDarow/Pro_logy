# 📘 PROLOGY-140-5.0.55.apk - Reverse Engineering Project

**Полный набор инструментов и документации для анализа Android приложения**

---

## 📁 Структура проекта

```
/home/mi/AutoSettingEQ/
│
├── 📄 PROLOGY-140-5.0.55.apk          # Исходный APK файл (50 MB)
├── 📄 README.md                        # Главная документация
│
├── 📂 scripts/                         # Скрипты автоматизации
│   ├── decompile.sh                   # Декомпиляция APK
│   ├── analyze.sh                     # Анализ кода
│   └── rebuild.sh                     # Обратная сборка
│
├── 📂 tools/                           # 🔥 Frida инструменты
│   ├── 📖 INDEX.md                    # ← ЭТОТ ФАЙЛ
│   │
│   ├── 🎯 Основные скрипты
│   │   ├── frida_bluetooth_hook.js    # Перехват Bluetooth SPP/BLE
│   │   ├── combined_full_analysis.js  # Полный анализ (всё в одном)
│   │   └── frida_codeshare_scripts.js # Коллекция готовых скриптов
│   │
│   ├── 🚀 Установка и запуск
│   │   ├── auto_setup_device.sh       # Авто-настройка устройства
│   │   ├── install_frida_termux.sh    # Установка на Termux
│   │   ├── run_frida_hook.sh          # Запуск hook скриптов
│   │   └── README_TERMUX_SETUP.md     # Инструкция для Termux
│   │
│   ├── 📊 Анализ
│   │   ├── analyze_bluetooth_log.sh   # Анализ логов Bluetooth
│   │   ├── install_apk.sh             # Установка APK
│   │   └── quick_analyze.sh           # Быстрый анализ
│   │
│   └── 📚 Документация
│       ├── README.md                  # Главная инструкция
│       ├── CHEATSHEET.md              # Шпаргалка команд
│       ├── QUICK_REFERENCE.md         # Быстрый справочник
│       ├── TROUBLESHOOTING.md         # Решение проблем
│       ├── FRIDA_UTILITY_SCRIPTS.md   # Описание скриптов
│       ├── PROTOCOL_ANALYSIS_TEMPLATE.md # Шаблон анализа
│       └── BLUETOOTH_API_DOCUMENTATION.md # (в output/)
│
├── 📂 output/                          # Результаты анализа
│   ├── BLUETOOTH_API_DOCUMENTATION.md # 📘 Документация Bluetooth API
│   ├── decompiled/                    # Декомпилированный код
│   ├── rebuilt/                       # Пересобранные APK
│   └── signatures/                    # Ключи подписи
│
├── 📂 logs/                           # Логи операций
│
└── 📂 awesome-frida/                  # Коллекция ресурсов Frida
```

---

## 🚀 Быстрый старт

### Вариант 1: На ПК с подключенным устройством

```bash
# 1. Автоматическая настройка
bash /home/mi/AutoSettingEQ/tools/auto_setup_device.sh

# 2. Запуск анализа
frida -U -f com.prology -l /home/mi/AutoSettingEQ/tools/combined_full_analysis.js --no-pause | tee analysis.log
```

### Вариант 2: На смартфоне (Termux)

```bash
# 1. Установка (нужен root!)
su -c 'bash /sdcard/AutoSettingEQ/tools/install_frida_termux.sh'

# 2. Запуск
bash /sdcard/AutoSettingEQ/tools/run_frida_hook.sh
```

---

## 📚 Документация

### 🎯 Для начала работы

| Документ | Описание | Когда использовать |
|----------|----------|-------------------|
| **tools/README.md** | Главная инструкция | Первый запуск |
| **tools/CHEATSHEET.md** | Шпаргалка команд | Постоянно |
| **tools/QUICK_REFERENCE.md** | Быстрый справочник | Постоянно |

### 🔧 Для анализа

| Документ | Описание | Когда использовать |
|----------|----------|-------------------|
| **output/BLUETOOTH_API_DOCUMENTATION.md** | Bluetooth API | Анализ протокола |
| **tools/PROTOCOL_ANALYSIS_TEMPLATE.md** | Шаблон анализа | Запись результатов |
| **tools/FRIDA_UTILITY_SCRIPTS.md** | Скрипты Frida | Динамический анализ |

### 🐛 При проблемах

| Документ | Описание | Когда использовать |
|----------|----------|-------------------|
| **tools/TROUBLESHOOTING.md** | Решение проблем | Что-то не работает |
| **tools/README_TERMUX_SETUP.md** | Установка Termux | Настройка смартфона |

---

## 🎯 Сценарии использования

### Сценарий 1: Первичный анализ Bluetooth

```bash
# Подключить устройство
adb devices

# Запустить Bluetooth hook
frida -U -f com.prology -l tools/frida_bluetooth_hook.js --no-pause | tee bluetooth.log

# В приложении: подключиться к автомагнитоле
# Наблюдать вывод

# Проанализировать лог
tools/analyze_bluetooth_log.sh bluetooth.log
```

### Сценарий 2: Полный анализ

```bash
# Запустить комбинированный скрипт
frida -U -f com.prology -l tools/combined_full_analysis.js --no-pause | tee full.log

# Включает:
# ✓ Bluetooth перехват
# ✓ SSL Pinning Bypass
# ✓ HTTP/HTTPS логирование
# ✓ Crypto операции
# ✓ JSON мониторинг
# ✓ File I/O
```

### Сценарий 3: Интерактивный анализ

```bash
# Запустить objection
objection -g com.prology explore

# Команды:
android hooking list classes
android hooking watch class X2.j
android sslpinning disable
android root disable
```

### Сценарий 4: Автоматическая настройка

```bash
# Всё сделает автоматически
bash tools/auto_setup_device.sh

# Включает:
# ✓ Проверка устройства
# ✓ Установка frida-server
# ✓ Установка PROLOGY APK
# ✓ Копирование инструментов
# ✓ Проверка работы
```

---

## 🔑 Ключевые находки

### Bluetooth UUID

```
SPP (Classic Bluetooth):
  UUID: 00001101-0000-1000-8000-00805F9B34FB

GATT (BLE):
  0x1801 - Generic Attribute Profile
  0x2A05 - Service Changed
```

### Основные классы

```
X2.j          - SPP менеджер (подключение/отключение)
X2.a          - Bluetooth Socket поток
k2.C0395h     - Главный Bluetooth менеджер
k2.C0393f     - GATT Callback handler
```

### Компоненты приложения

```
AudioServiceActivity          - Основная Activity
AudioService                  - Фоновый аудиосервис
GeolocatorLocationService     - Сервис геолокации
MediaButtonReceiver           - Обработчик кнопок медиа
```

---

## 📋 Команды для копирования

### ADB

```bash
adb devices
adb shell
adb install -r PROLOGY-140-5.0.55.apk
adb logcat | grep -i bluetooth
adb shell pm list packages | grep prology
```

### Frida

```bash
frida-ps -U
frida -U -f com.prology -l tools/frida_bluetooth_hook.js --no-pause
frida -U -n "PROLOGY" -l tools/combined_full_analysis.js
frida-trace -U -f com.prology -m "X2.j.*"
```

### Objection

```bash
objection -g com.prology explore
android hooking list classes
android hooking watch class X2.j
android sslpinning disable
```

---

## 🛠 Инструменты

### Установленные

| Инструмент | Версия | Назначение |
|------------|--------|------------|
| **Frida** | 17.7.3 | Динамическая инструментация |
| **apktool** | 2.7.0 | Декомпиляция ресурсов |
| **jadx** | 1.5.0 | Декомпиляция Java кода |
| **objection** | 1.12.3 | Runtime exploration |
| **ADB** | 1.0.41 | Отладка Android |

### Скрипты проекта

| Скрипт | Назначение |
|--------|------------|
| `auto_setup_device.sh` | Автоматическая настройка устройства |
| `install_frida_termux.sh` | Установка Frida на Termux |
| `run_frida_hook.sh` | Запуск hook скриптов |
| `analyze_bluetooth_log.sh` | Анализ логов Bluetooth |
| `frida_bluetooth_hook.js` | Перехват Bluetooth |
| `combined_full_analysis.js` | Полный анализ |

---

## 📖 Полезные ресурсы

### Официальные

- [Frida Docs](https://frida.re/docs/)
- [Frida CodeShare](https://codeshare.frida.re/)
- [OWASP MSTG](https://github.com/OWASP/owasp-mstg)
- [Android Developers](https://developer.android.com/)

### Коллекции скриптов

- [0xdea/frida-scripts](https://github.com/0xdea/frida-scripts)
- [iddoeldor/frida-snippets](https://github.com/iddoeldor/frida-snippets)
- [awesome-frida](https://github.com/dweinstein/awesome-frida)

### Обучение

- [Hacking Android with Frida](https://www.codemetrix.net/hacking-android-apps-with-frida-1/)
- [Mobile Security Testing Guide](https://github.com/OWASP/owasp-mstg)

---

## ⚠️ Важные заметки

1. **Root-доступ** требуется для работы frida-server
2. **Termux** должен быть из F-Droid (не Play Store)
3. **Android 8.0+** рекомендуется для полной совместимости
4. **Бэкап данных** - сделайте перед модификацией приложения
5. **SELinux** может блокировать работу - используйте `setenforce 0`

---

## 📞 Поддержка

При возникновении проблем:

1. Проверьте **tools/TROUBLESHOOTING.md**
2. Посмотрите логи: `adb logcat`
3. Проверьте подключение: `adb devices`
4. Перезапустите frida-server: `adb shell "pkill frida-server && /data/local/tmp/frida-server &"`

---

## 📄 Лицензия

Инструменты созданы для образовательных целей в рамках reverse engineering анализа.

---

*PROLOGY-140-5.0.55.apk Reverse Engineering Project*
*Дата создания: 2026-03-02*
*Последнее обновление: 2026-03-02*
