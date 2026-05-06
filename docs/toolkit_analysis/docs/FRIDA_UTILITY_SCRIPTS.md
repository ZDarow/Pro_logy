# 🧰 Frida Utility Scripts для PROLOGY-140-5.0.55

Набор утилит для динамического анализа на основе [awesome-frida](https://github.com/dweinstein/awesome-frida)

---

## 📋 Оглавление

1. [Быстрый старт](#быстрый-старт)
2. [Скрипты](#скрипты)
3. [Полезные команды](#полезные-команды)
4. [Ресурсы](#ресурсы)

---

## 🚀 Быстрый старт

```bash
# Termux с root
su -c '/data/local/tmp/frida-server &'

# Запуск скрипта
frida -U -f com.prology -l <скрипт>.js --no-pause
```

---

## 📜 Скрипты

### 1. ssl_unpinning.js - Обход SSL Pinning

**Источник:** [codeshare.frida.re/@akabe1](https://codeshare.frida.re/@akabe1/frida-multiple-unpinning/)

**Зачем:** Многие приложения используют SSL pinning для защиты HTTPS трафика.

```bash
frida -U -f com.prology -l ssl_unpinning.js --no-pause
```

---

### 2. root_bypass.js - Обход Root Detection

**Источник:** [codeshare.frida.re/@dzonerzy](https://codeshare.frida.re/@dzonerzy/fridantiroot/)

**Зачем:** Приложение может отказываться работать на root устройствах.

```bash
frida -U -f com.prology -l root_bypass.js --no-pause
```

---

### 3. http_logger.js - Логирование HTTP/HTTPS

**Источник:** [codeshare.frida.re/@federicodotta](https://codeshare.frida.re/@federicodotta/okhttp-logger/)

**Зачем:** Перехват HTTP запросов приложения.

```bash
frida -U -f com.prology -l http_logger.js --no-pause
```

---

### 4. crypto_logger.js - Логирование Crypto операций

**Зачем:** Поиск ключей шифрования, алгоритмов.

```bash
frida -U -f com.prology -l crypto_logger.js --no-pause
```

---

### 5. json_monitor.js - Мониторинг JSON

**Зачем:** Перехват передаваемых данных в JSON формате.

```bash
frida -U -f com.prology -l json_monitor.js --no-pause
```

---

### 6. string_decoder.js - Декодирование строк

**Зачем:** Многие приложения шифруют строки для обфускации.

```bash
frida -U -f com.prology -l string_decoder.js --no-pause
```

---

### 7. file_io_monitor.js - Мониторинг файловых операций

**Зачем:** Отслеживание чтения/записи файлов (SharedPreferences, базы данных).

```bash
frida -U -f com.prology -l file_io_monitor.js --no-pause
```

---

### 8. ble_scanner.js - BLE Сканер

**Зачем:** Поиск BLE устройств и сервисов.

```bash
frida -U -f com.prology -l ble_scanner.js --no-pause
```

---

### 9. main_bluetooth_hook.js - Основной Bluetooth Hook

**Наш кастомный скрипт для PROLOGY.**

Перехватывает:
- SPP подключения (UUID: 00001101-0000-1000-8000-00805F9B34FB)
- GATT операции
- Отправку/получение данных

```bash
frida -U -f com.prology -l main_bluetooth_hook.js --no-pause
```

---

### 10. combined_full.js - Комбинированный скрипт

**Все скрипты в одном для полного анализа.**

```bash
frida -U -f com.prology -l combined_full.js --no-pause | tee full_analysis.log
```

---

## 🔧 Полезные команды

### Frida базовые

```bash
# Список процессов
frida-ps -U

# Запуск приложения со скриптом
frida -U -f com.prology -l script.js --no-pause

# Подключение к запущенному
frida -U -n "PROLOGY" -l script.js

# Подключение по PID
frida -U -p <PID> -l script.js

# Интерактивный режим
frida -U -f com.prology
[d] frida> %load script.js
```

### frida-trace

```bash
# Трассировка всех методов класса
frida-trace -U -f com.prology -m "X2.j.*"

# Трассировка конкретных методов
frida-trace -U -f com.prology -m "X2.j.a" -m "X2.j.c"

# Трассировка Bluetooth методов
frida-trace -U -f com.prology -m "android.bluetooth.*.*"
```

### objection

```bash
# Запуск
objection -g com.prology explore

# Внутри objection:
android hooking list classes
android hooking watch class X2.j
android hooking watch method k2.C0395h.z
android intent launch_activity com.prology.MainActivity
```

### Fridump (дампа памяти)

```bash
# Установка
pip install fridump

# Запуск
fridump -U com.prology -o /sdcard/dump/
```

---

## 📚 Ресурсы

### Официальные

- [Frida Docs](https://frida.re/docs/)
- [Frida CodeShare](https://codeshare.frida.re/)
- [Frida Blog](https://frida.re/news/)

### Коллекции скриптов

- [0xdea/frida-scripts](https://github.com/0xdea/frida-scripts)
- [iddoeldor/frida-snippets](https://github.com/iddoeldor/frida-snippets)
- [as0ler/frida-scripts](https://github.com/as0ler/frida-scripts)

### Инструменты

- [objection](https://github.com/sensepost/objection)
- [Brida](https://github.com/federicodotta/Brida)
- [Fridump](https://github.com/Nightbringer21/fridump)
- [r2frida](https://github.com/nowsecure/r2frida)

### Обучение

- [Hacking Android apps with Frida](https://www.codemetrix.net/hacking-android-apps-with-frida-1/)
- [OWASP MSTG - Frida](https://github.com/OWASP/owasp-mstg/blob/master/Document/0x06h-Testing-Platform-Interaction.md#dynamic-instrumentation-with-frida)
- [Mobile Security Testing Guide](https://github.com/OWASP/owasp-mstg)

---

## 🎯 Пример сессии анализа PROLOGY

```bash
# 1. Запуск frida-server
su -c '/data/local/tmp/frida-server &'

# 2. Обход SSL pinning + логирование HTTP
frida -U -f com.prology -l ssl_unpinning.js -l http_logger.js --no-pause

# 3. В новом окне - Bluetooth hook
frida -U -n "PROLOGY" -l main_bluetooth_hook.js --no-pause | tee bluetooth.log

# 4. После сбора данных - анализ
bash analyze_bluetooth_log.sh bluetooth.log

# 5. Дамп памяти для поиска строк
fridump -U com.prology -o /sdcard/prology_dump/

# 6. Поиск интересных строк
strings /sdcard/prology_dump/*.dmp | grep -i "auth\|api\|key\|token"
```

---

*Создано для PROLOGY-140-5.0.55.apk*
*Дата: 2026-03-02*
