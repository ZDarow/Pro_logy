# 📱 Frida Setup для Termux - Полная инструкция

## 📋 Требования

- **Root-доступ** на Android устройстве
- **Termux** из [F-Droid](https://f-droid.org/packages/com.termux/) (НЕ Play Store!)
- **Android 8.0+**
- **Свободное место:** ~100 MB

---

## 🚀 Быстрая установка

### Шаг 1: Скопировать файлы на устройство

```bash
# Подключить устройство к ПК
adb push /home/mi/AutoSettingEQ/tools/ /sdcard/AutoSettingEQ/tools/

# Или скопировать вручную через MTP
```

### Шаг 2: Запустить установку

```bash
# Открыть Termux

# Дать права на выполнение
chmod +x /sdcard/AutoSettingEQ/tools/install_frida_termux.sh

# Запустить установку (нужен root!)
su -c 'bash /sdcard/AutoSettingEQ/tools/install_frida_termux.sh'
```

### Шаг 3: Запустить Frida Hook

```bash
# Дать права на скрипт запуска
chmod +x /sdcard/AutoSettingEQ/tools/run_frida_hook.sh

# Запустить hook (автоматически запустит frida-server)
bash /sdcard/AutoSettingEQ/tools/run_frida_hook.sh

# Или с логированием
bash /sdcard/AutoSettingEQ/tools/run_frida_hook.sh --log-file /sdcard/bluetooth_hook.log
```

---

## 📖 Подробная установка по шагам

### 1. Установка Termux

```
⚠️ ВАЖНО: Устанавливайте Termux ТОЛЬКО из F-Droid!
Версия из Play Store устарела и не поддерживается.

Ссылка: https://f-droid.org/packages/com.termux/
```

### 2. Обновление Termux

```bash
pkg update && pkg upgrade
```

### 3. Проверка root

```bash
su
# Если запросило root и показало # вместо $ - root есть
```

### 4. Ручная установка (альтернатива скрипту)

```bash
# Установка зависимостей
pkg update
pkg install -y python wget curl root-repo

# Установка frida-tools
pip install frida-tools --break-system-packages

# Скачать frida-server (для ARM64)
cd /sdcard/Download
wget https://github.com/frida/frida/releases/download/17.7.3/frida-server-17.7.3-android-arm64.xz

# Распаковать
unxz frida-server-17.7.3-android-arm64.xz

# Установить в систему
su
cp /sdcard/Download/frida-server-17.7.3-android-arm64 /data/local/tmp/frida-server
chmod 755 /data/local/tmp/frida-server
exit
```

### 5. Запуск frida-server

```bash
# В Termux с root
su -c '/data/local/tmp/frida-server &'
```

### 6. Проверка работы

```bash
# В новом окне Termux (без root)
frida-ps -U
```

Должен показать список процессов.

---

## 🎯 Использование

### Запуск hook для PROLOGY

```bash
# Простой запуск
frida -U -f com.prology -l /sdcard/AutoSettingEQ/tools/frida_bluetooth_hook.js --no-pause

# С логированием
frida -U -f com.prology -l /sdcard/AutoSettingEQ/tools/frida_bluetooth_hook.js --no-pause | tee /sdcard/bluetooth.log

# К запущенному приложению
frida -U -n "PROLOGY" -l /sdcard/AutoSettingEQ/tools/frida_bluetooth_hook.js
```

### Анализ логов

```bash
# Использовать скрипт анализа
bash /sdcard/AutoSettingEQ/tools/analyze_bluetooth_log.sh /sdcard/bluetooth.log

# Или из stdin
cat /sdcard/bluetooth.log | bash /sdcard/AutoSettingEQ/tools/analyze_bluetooth_log.sh -
```

---

## 🔧 Команды Frida

| Команда | Описание |
|---------|----------|
| `frida-ps -U` | Список процессов на устройстве |
| `frida -U -f <package>` | Запуск приложения с hook |
| `frida -U -n <name>` | Подключение к запущенному |
| `frida -U -p <pid>` | Подключение по PID |
| `frida --help` | Полная справка |

---

## 🛠 Решение проблем

### Ошибка: "Failed to spawn: unable to find process"

```bash
# Проверить имя пакета
pm list packages | grep prology

# Использовать точное имя
frida -U -f com.prology -l hook.js
```

### Ошибка: "frida-server not running"

```bash
# Проверить процесс
ps | grep frida

# Перезапустить
pkill frida-server
su -c '/data/local/tmp/frida-server &'
```

### Ошибка: "Permission denied"

```bash
# Дать права
su
chmod 755 /data/local/tmp/frida-server
setenforce 0  # Временно отключить SELinux
```

### Ошибка: "Package not installed"

```bash
# Установить APK
adb install /path/to/PROLOGY-140-5.0.55.apk

# Или на устройстве
pm install /sdcard/PROLOGY-140-5.0.55.apk
```

### Termux не видит root

```bash
# В Termux
pkg install root-repo
```

---

## 📁 Структура файлов

```
/sdcard/AutoSettingEQ/
├── tools/
│   ├── frida_bluetooth_hook.js    # Hook скрипт
│   ├── install_frida_termux.sh    # Скрипт установки
│   ├── run_frida_hook.sh          # Скрипт запуска
│   └── analyze_bluetooth_log.sh   # Анализ логов
└── output/
    └── BLUETOOTH_API_DOCUMENTATION.md
```

---

## 📊 Пример сессии

```bash
# 1. Termux #1 - запуск frida-server
su
/data/local/tmp/frida-server &

# 2. Termux #2 - запуск hook
bash /sdcard/AutoSettingEQ/tools/run_frida_hook.sh --log-file /sdcard/hook.log

# 3. Открыть приложение PROLOGY на устройстве
# 4. Подключиться к автомагнитоле
# 5. Наблюдать вывод в Termux

# 6. Анализ (после остановки)
bash /sdcard/AutoSettingEQ/tools/analyze_bluetooth_log.sh /sdcard/hook.log
```

---

## 🔗 Полезные ссылки

- [Frida Docs](https://frida.re/docs/)
- [Frida Releases](https://github.com/frida/frida/releases)
- [Termux Wiki](https://wiki.termux.com/)
- [XDA Developers](https://forum.xda-developers.com/)

---

*Инструкция создана для PROLOGY-140-5.0.55.apk*
*Дата: 2026-03-02*
