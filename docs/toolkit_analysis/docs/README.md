# 🛠 PROLOGY-140-5.0.55.apk - Reverse Engineering Tools

Полный набор инструментов для динамического анализа и модификации Android приложения PROLOGY.

---

## 📁 Структура проекта

```
/home/mi/AutoSettingEQ/
├── PROLOGY-140-5.0.55.apk              # Исходный APK
├── output/
│   ├── decompiled/                     # Результаты декомпиляции
│   ├── BLUETOOTH_API_DOCUMENTATION.md  # Документация Bluetooth API
│   └── ...
└── tools/
    ├── README.md                       # Этот файл
    ├── frida_bluetooth_hook.js         # Основной Bluetooth hook
    ├── combined_full_analysis.js       # Комбинированный скрипт
    ├── install_frida_termux.sh         # Установка Frida на Termux
    ├── run_frida_hook.sh               # Запуск hook скриптов
    ├── analyze_bluetooth_log.sh        # Анализ логов
    ├── frida_codeshare_scripts.js      # Скрипты из CodeShare
    └── README_TERMUX_SETUP.md          # Инструкция по установке
```

---

## 🚀 Быстрый старт

### На ПК (с подключенным устройством)

```bash
# 1. Установка frida-server на устройство
adb push /data/local/tmp/frida-server /data/local/tmp/
adb shell chmod 755 /data/local/tmp/frida-server

# 2. Запуск frida-server
adb shell "/data/local/tmp/frida-server &"

# 3. Запуск анализа
cd /home/mi/AutoSettingEQ/tools
frida -U -f com.prology -l combined_full_analysis.js --no-pause | tee analysis.log
```

### На смартфоне (Termux, без ПК)

```bash
# 1. Установка (нужен root!)
su -c 'bash /sdcard/AutoSettingEQ/tools/install_frida_termux.sh'

# 2. Запуск анализа
bash /sdcard/AutoSettingEQ/tools/run_frida_hook.sh --log-file /sdcard/analysis.log
```

---

## 📜 Скрипты

### Основные

| Скрипт | Назначение | Команда |
|--------|------------|---------|
| **frida_bluetooth_hook.js** | Перехват Bluetooth SPP/BLE | `frida -U -f com.prology -l frida_bluetooth_hook.js` |
| **combined_full_analysis.js** | Полный анализ (всё в одном) | `frida -U -f com.prology -l combined_full_analysis.js` |
| **frida_codeshare_scripts.js** | Коллекция готовых скриптов | См. файл |

### Вспомогательные

| Скрипт | Назначение |
|--------|------------|
| **install_frida_termux.sh** | Автоматическая установка Frida на Termux |
| **run_frida_hook.sh** | Удобный запуск hook скриптов |
| **analyze_bluetooth_log.sh** | Анализ логов Bluetooth трафика |

---

## 🎯 Сценарии использования

### Сценарий 1: Первичный анализ Bluetooth

```bash
# Запуск Bluetooth hook
frida -U -f com.prology -l frida_bluetooth_hook.js --no-pause | tee bluetooth.log

# В приложении: подключиться к автомагнитоле
# Наблюдать вывод:
#   [BT CONNECT] -> 00:11:22:33:44:55
#   [SPP TX] 41 55 54 48 0D | "AUTH\r"
#   [SPP RX] 4F 4B 0D 0A | "OK\r\n"
```

### Сценарий 2: Полный анализ

```bash
# Запуск комбинированного скрипта
frida -U -f com.prology -l combined_full_analysis.js --no-pause | tee full.log

# Включает:
# ✓ Bluetooth перехват
# ✓ SSL Pinning Bypass
# ✓ HTTP/HTTPS логирование
# ✓ Crypto операции
# ✓ JSON мониторинг
# ✓ File I/O
```

### Сценарий 3: Анализ логов

```bash
# После сбора данных
bash analyze_bluetooth_log.sh bluetooth.log

# Вывод:
# 📤 SPP ОТПРАВКА (TX)
# 📥 SPP ПОЛУЧЕНИЕ (RX)
# 🔑 УНИКАЛЬНЫЕ UUID
# 📱 FLUTTER EVENTS
```

### Сценарий 4: Objection (интерактивный)

```bash
# Запуск
objection -g com.prology explore

# Команды внутри:
android hooking list classes
android hooking watch class X2.j
android hooking watch method k2.C0395h.z
android intent launch_activity com.prology.AudioServiceActivity
```

---

## 🔧 Полезные команды Frida

```bash
# Список процессов
frida-ps -U

# Запуск со скриптом
frida -U -f com.prology -l script.js --no-pause

# Подключение к запущенному
frida -U -n "PROLOGY" -l script.js

# Интерактивный режим
frida -U -f com.prology
[d] frida> %load script.js

# frida-trace для методов
frida-trace -U -f com.prology -m "X2.j.*"
```

---

## 📚 Документация

| Документ | Описание |
|----------|----------|
| **BLUETOOTH_API_DOCUMENTATION.md** | Полное описание Bluetooth API |
| **README_TERMUX_SETUP.md** | Инструкция по установке на Termux |
| **FRIDA_UTILITY_SCRIPTS.md** | Описание утилит и скриптов |

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

## 🐛 Решение проблем

### "Failed to spawn: unable to find process"

```bash
# Проверить имя пакета
adb shell pm list packages | grep prology

# Использовать точное имя
frida -U -f com.prology -l script.js
```

### "frida-server not running"

```bash
# Перезапустить
adb shell "pkill frida-server"
adb shell "/data/local/tmp/frida-server &"
```

### "Permission denied"

```bash
# Дать права
adb shell "setenforce 0"
adb shell "chmod 755 /data/local/tmp/frida-server"
```

---

## 📖 Ресурсы

### Официальные

- [Frida Docs](https://frida.re/docs/)
- [Frida CodeShare](https://codeshare.frida.re/)
- [Objection Docs](https://github.com/sensepost/objection/wiki)

### Коллекции скриптов

- [0xdea/frida-scripts](https://github.com/0xdea/frida-scripts)
- [iddoeldor/frida-snippets](https://github.com/iddoeldor/frida-snippets)
- [awesome-frida](https://github.com/dweinstein/awesome-frida)

### Обучение

- [OWASP MSTG](https://github.com/OWASP/owasp-mstg)
- [Hacking Android with Frida](https://www.codemetrix.net/hacking-android-apps-with-frida-1/)

---

## ⚠️ Примечания

1. **Root-доступ** требуется для работы frida-server
2. **Termux** должен быть из F-Droid (не Play Store)
3. **Android 8.0+** рекомендуется для полной совместимости
4. **Бэкап данных** - сделайте перед модификацией приложения

---

*Создано для PROLOGY-140-5.0.55.apk*
*Дата: 2026-03-02*
