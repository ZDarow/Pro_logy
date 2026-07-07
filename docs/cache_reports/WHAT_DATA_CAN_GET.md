# 📋 PROLOGY - ДОСТУПНЫЕ ДАННЫЕ ДЛЯ ИЗУЧЕНИЯ

**Дата:** 2026-03-12

---

## 🔍 УЖЕ ПОЛУЧЕНО

| Данные | Статус | Файл |
|--------|--------|------|
| CRC алгоритм | ✅ 100% основных команд | `CRC_FINAL_100.md` |
| Таблица команд | ✅ 61 комбинация | `prology_crc.py` |
| Структура протокола | ✅ Расшифрована | `PROLOGY_PROTOCOL.md` |
| Bluetooth UUID | ✅ Найден | `PROLOGY_FULL_REPORT.md` |
| SharedPreferences | ✅ Извлечены | `prology_data/` |
| Логи приложения | ✅ 240 KB | `prology_live.txt` |

---

## 🎯 ЧТО ЕЩЁ МОЖНО ПОЛУЧИТЬ

### 1. 📱 DYNAMIC ANALYSIS (Runtime)

#### A. Перехват ответов от устройства
```bash
# Чтение из Bluetooth характеристики
frida --host 127.0.0.1:27042 -p <PID> -l prology_read_hook.js
```

**Что даст:**
- Ответы головного устройства на команды
- Формат ответов (отличается от запросов)
- Статусы устройства (громкость, эквалайзер, и т.д.)

#### B. Перехват Flutter Dart функций
```bash
# Поиск Dart функций в libapp.so
frida --host 127.0.0.1:27042 -p <PID> -e "
Java.perform(function() {
    // Поиск всех классов Flutter
    var classes = Java.enumerateLoadedClassesSync();
    classes.forEach(function(c) {
        if (c.includes('io.flutter')) {
            console.log(c);
        }
    });
});
"
```

**Что даст:**
- Имена Dart классов и методов
- Логику обработки команд
- Структуру данных приложения

---

### 2. 🗄️ DATABASE EXTRACTION

#### A. Извлечение баз данных
```bash
# Копирование баз данных
adb pull /data/data/com.prology/databases/ ./prology_dbs/

# Анализ SQLite
sqlite3 prology.db ".tables"
sqlite3 prology.db "SELECT * FROM settings;"
```

**Что может быть:**
- История подключений
- Пользовательские настройки
- Пресеты эквалайзера
- Пары Bluetooth устройств

#### B. DataStore файлы
```bash
# Копирование DataStore
adb pull /data/data/com.prology/files/datastore/ ./prology_datastore/

# Декодирование protobuf
protoc --decode_raw < settings.pb
```

**Что может быть:**
- Последние использованные настройки
- Состояние приложения
- Кэш данных

---

### 3. 📦 APK REVERSE ENGINEERING

#### A. Декомпиляция libapp.so (Dart код)
```bash
# Извлечение libapp.so
unzip -p base.apk lib/arm64-v8a/libapp.so > libapp.so

# Попытка декомпиляции
dart-decompiler libapp.so --output dart_src/

# Или через FELT
felt extract libapp.so
```

**Что даст:**
- ✅ **ВЕСЬ исходный код Dart**
- ✅ Все команды протокола
- ✅ Алгоритмы шифрования (если есть)
- ✅ Строковые константы
- ✅ Логику работы приложения

#### B. Анализ AndroidManifest.xml
```bash
# Уже декомпилировано в Apktool_M
cat AndroidManifest.xml | grep -E "(activity|service|receiver|provider)"
```

**Что уже есть:**
- Activity: `com.ryanheise.audioservice.AudioServiceActivity`
- Service: `com.ryanheise.audioservice.AudioService`
- Receiver: `com.ryanheise.audioservice.MediaButtonReceiver`

---

### 4. 🎨 RESOURCE ANALYSIS

#### A. Извлечение графики
```bash
# Копирование ресурсов
adb pull /data/data/com.prology/files/ ./prology_files/
adb pull /data/data/com.prology/cache/ ./prology_cache/
```

**Что может быть:**
- Кэшированные изображения альбомов
- Логи воспроизведения
- Временные файлы

#### B. Анализ layout файлов
```bash
# Уже есть в декомпилированном APK
ls /storage/emulated/0/Apktool_M/PROLOGY_v5.0.55(140)_base_src/res/layout/
```

**Что даст:**
- Структуру UI
- Названия функций (из ID элементов)
- Логику работы интерфейса

---

### 5. 📡 NETWORK TRAFFIC

#### A. Перехват Bluetooth трафика
```bash
# Включить HCI лог
adb shell setprop persist.bluetooth.btsnooplogmode true

# Запустить приложение и выполнить действия
# Вытащить лог
adb pull /sdcard/btsnoop_hci.log ./bluetooth_traffic.hci

# Анализ в Wireshark
wireshark bluetooth_traffic.hci
```

**Что даст:**
- ✅ Реальные пакеты Bluetooth
- ✅ Тайминги обмена
- ✅ Полные данные команд и ответов
- ✅ Ошибки и retry

#### B. Анализ WiFi трафика (если есть)
```bash
# Если приложение использует сеть
tcpdump -i wlan0 -s 0 -w prology_wifi.pcap
```

**Маловероятно, но можно проверить:**
- Запросы к серверам обновлений
- Телеметрию
- Онлайн-функции

---

### 6. 🔐 CRYPTO ANALYSIS

#### A. Поиск ключей шифрования
```bash
# Поиск строк в libapp.so
strings libapp.so | grep -iE "(key|secret|password|token|auth)"

# Поиск в smali
grep -r "SecretKeySpec\|Cipher\|MessageDigest" smali/
```

**Что может быть:**
- Ключи для шифрования команд
- Токены авторизации
- Пароли по умолчанию

#### B. Анализ Android Keystore
```bash
# Проверка Keystore (требует root)
adb shell dumpsys android.security.keystore
```

**Что может быть:**
- Сохранённые ключи
- Сертификаты
- Учётные данные

---

### 7. 🧪 FUNCTIONAL TESTING

#### A. fuzzing команд
```python
# Отправка случайных команд
for cmd_type in range(0x00, 0xFF):
    for subcmd in range(0x00, 0xFF):
        cmd = create_command(cmd_type, subcmd)
        send_via_bluetooth(cmd)
        response = read_response()
        log(cmd, response)
```

**Что даст:**
- Неизвестные команды
- Обработку ошибок
- Скрытые функции

#### B. Стресс-тестирование
```python
# Быстрая отправка команд
for i in range(1000):
    send_volume(i % 100)
    sleep(0.01)
```

**Что даст:**
- Пределы значений
- Поведение при ошибках
- Буферы устройства

---

### 8. 📊 TELEMATRY & LOGS

#### A. Logcat анализ
```bash
# Запустить с фильтрами
adb logcat | grep -E "(prology|Prology|PROLOGY|AudioService|flutter)" > prology_full_log.txt
```

**Что может быть:**
- Отладочные сообщения
- Ошибки
- Внутренние состояния

#### B. Анализ crash reports
```bash
# Копирование crash логов
adb pull /data/data/com.prology/files/crash/ ./prology_crashes/
```

**Что даст:**
- Причины сбоев
- Проблемные места кода

---

### 9. 🔧 CONFIGURATION DUMP

#### A. Все настройки устройства
```python
# Запрос всех настроек
commands = [
    create_command(0x90, 0x01),  # Status
    create_command(0x9A, 0x01),  # Config A
    create_command(0x9A, 0x03),  # Config B
    # ... все известные команды
]

for cmd in commands:
    send(cmd)
    response = read()
    parse_response(response)
```

**Что даст:**
- Текущие настройки эквалайзера
- Настройки баланса/фейдера
- Пресеты
- Версию прошивки

#### B. Дамп полной конфигурации
```python
# Команда 0x38 (Dump all)
dump_cmd = create_command(0x38, 0xFF, bytes([0x00] * 54))
send(dump_cmd)
full_config = read_response()
```

**Что даст:**
- ✅ **ВСЕ настройки устройства**
- ✅ Заводские значения
- ✅ Калибровочные данные

---

### 10. 📱 FIRMWARE ANALYSIS

#### A. Извлечение прошивки
```bash
# Если есть режим обновления
# Отправить команду обновления
send(create_command(0xFF, 0x00))  # Предположение

# Перехватить данные прошивки
```

**Что даст:**
- Прошивку головного устройства
- Bootloader
- Конфигурационные данные

#### B. Анализ обновлений
```bash
# Поиск URL обновлений
strings libapp.so | grep -iE "(http|https|update|firmware)"
```

**Что может быть:**
- URL серверов обновлений
- Версии прошивок
- Changelog

---

## 📊 ПРИОРИТЕТЫ

| # | Метод | Сложность | Ценность | Рекомендую |
|---|-------|-----------|----------|------------|
| 1 | **Перехват ответов** | ⭐ | ⭐⭐⭐ | ✅ СЕЙЧАС |
| 2 | **DataStore/БД** | ⭐⭐ | ⭐⭐ | ✅ ДА |
| 3 | **libapp.so декомпиляция** | ⭐⭐⭐ | ⭐⭐⭐⭐ | ✅ ДА |
| 4 | **Bluetooth HCI лог** | ⭐⭐ | ⭐⭐⭐ | ✅ ДА |
| 5 | **Fuzzing команд** | ⭐⭐ | ⭐⭐ | ⚠️ Позже |
| 6 | **Полный дамп настроек** | ⭐ | ⭐⭐⭐ | ✅ СЕЙЧАС |
| 7 | **Flutter Dart анализ** | ⭐⭐⭐ | ⭐⭐⭐ | ⚠️ Позже |
| 8 | **Прошивка** | ⭐⭐⭐⭐ | ⭐⭐⭐⭐ | ❌ Сложно |

---

## 🎯 СЛЕДУЮЩИЕ ШАГИ (РЕКОМЕНДУЮ)

### 1. Перехват ответов (15 мин)
```bash
# Создать скрипт для перехвата readCharacteristic
```

### 2. Дамп настроек устройства (30 мин)
```python
# Отправить все известные команды запроса
# Сохранить ответы
```

### 3. Bluetooth HCI лог (30 мин)
```bash
# Включить логирование
# Выполнить действия
# Анализировать в Wireshark
```

### 4. DataStore/БД (15 мин)
```bash
# adb pull файлов
# Анализ содержимого
```

---

**Что делаем дальше? Выбирайте номер из приоритетов!**
