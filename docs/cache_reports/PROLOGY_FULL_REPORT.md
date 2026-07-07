# 📊 PROLOGY DATA COLLECTION REPORT

**Дата:** 2026-03-12  
**Устройство:** Redmi Note 9 Pro (Android 15)  
**Приложение:** PROLOGY v5.0.55 (140)  
**Статус:** ✅ Завершено

---

## 📁 СОБРАННЫЕ ДАННЫЕ

### Директория: `/storage/emulated/0/Documents/prology_data/`

| Файл | Описание | Размер |
|------|----------|--------|
| `device_properties.txt` | Системные свойства Android | ~5 KB |
| `app_info.txt` | Информация о приложении | ~10 KB |
| `components.txt` | Activity, Service, Receiver | ~2 KB |
| `permissions.txt` | Разрешения приложения | ~3 KB |
| `bluetooth_info.txt` | Bluetooth статус и настройки | ~50 KB |
| `processes.txt` | Процессы и память | ~5 KB |
| `app_files.txt` | Файловая структура | ~2 KB |
| `shared_prefs_flutter.txt` | Flutter настройки | ~0.3 KB |
| `shared_prefs_audio.txt` | Audio сервис настройки | ~0.5 KB |
| `databases.txt` | Базы данных (пусто) | ~0.1 KB |
| `files_list.txt` | Список файлов кэша | ~0.5 KB |
| `apk_path.txt` | Путь к APK | ~0.1 KB |
| `logcat.txt` | Логи приложения | ~30 KB |
| `command_stats.txt` | Статистика Bluetooth команд | ~5 KB |

---

## 🔍 КЛЮЧЕВЫЕ НАХОДКИ

### 1. Информация о приложении

```
Package: com.prology
Version: 5.0.55 (140)
Min SDK: 26
Target SDK: 35
Activity: com.ryanheise.audioservice.AudioServiceActivity
Signature: 22f966cc
```

### 2. Компоненты приложения

**Activity:**
- `com.ryanheise.audioservice.AudioServiceActivity` (LAUNCHER)

**Service:**
- `com.ryanheise.audioservice.AudioService` (Media playback)
- `androidx.startup.InitializationProvider`

**Receiver:**
- `com.ryanheise.audioservice.MediaButtonReceiver`
- `androidx.profileinstaller.ProfileInstallReceiver`

### 3. Разрешения

| Разрешение | Статус |
|------------|--------|
| BLUETOOTH_SCAN | ✅ granted |
| BLUETOOTH_CONNECT | ✅ granted |
| BLUETOOTH_ADVERTISE | ✅ granted |
| ACCESS_FINE_LOCATION | ✅ granted |
| ACCESS_COARSE_LOCATION | ✅ granted |
| READ_MEDIA_AUDIO | ✅ granted |
| MODIFY_AUDIO_SETTINGS | ✅ granted |
| SYSTEM_ALERT_WINDOW | ❌ not granted |
| READ_EXTERNAL_STORAGE | ❌ not granted |

### 4. SharedPreferences

**Flutter:**
```xml
flutter.connected.device.name = PROLOGY_BLE
flutter.sp.version = 1
flutter.connected.device.address = (empty)
```

**Audio Service:**
```xml
androidNotificationOngoing = true
androidStopForegroundOnPause = true
androidResumeOnClick = true
```

### 5. Файлы приложения

```
/data/data/com.prology/
├── app_flutter/ (пусто)
├── cache/
│   └── libCachedImageData/
├── databases/ (пусто)
├── files/
│   ├── libCachedImageData.db (16 KB)
│   └── profileInstalled
└── shared_prefs/
    ├── FlutterSharedPreferences.xml
    └── audio_service_preferences.xml
```

### 6. Bluetooth протокол

**UUID сервиса:** `0000ae02-0000-1000-8000-00805f9b34fb`  
**Instance ID:** 11  
**Properties:** 16 (WRITE)

---

## 📊 СТАТИСТИКА BLUETOOTH КОМАНД

**Всего перехвачено:** 100+ команд  
**Уникальных команд:** 94

### Топ команд:

| Команда (HEX) | Кол-во | Назначение |
|---------------|--------|------------|
| `C0 00 02 05 05 0C` | 68 | Volume = 5 |
| `C0 00 03 90 01 0A 9E` | 32 | Запрос статуса |
| `C0 00 02 05 01 08` | 12 | Volume = 1 |
| `C0 00 05 92 0C 72 29 07 45` | 3 | Дата/время |
| `C0 00 38 FF...` (57 байт) | 2 | Дамп настроек |
| `C0 00 27 FF...` (43 байта) | 2 | Инициализация (VER 8.7DSP) |
| `C0 00 24 9A...` (37 байт) | 2 | Полная конфигурация |
| `C0 00 21 9A...` (34 байта) | 2 | Баланс/Фейдер |
| `C0 00 17 9A...` (26 байт) | 2 | X-Over настройки |
| `C0 00 0C 9A...` (16 байт) | 2 | Эквалайзер |

---

## 🔬 АНАЛИЗ ПРОТОКОЛА

### Структура команды:

```
Byte 0:   0xC0 (префикс)
Byte 1:   0x00 (sub-prefix)
Byte 2:   Длина данных
Byte 3:   Тип команды
Byte 4+:  Данные
Last:     CRC
```

### Категории команд:

| Байт 3 | Категория | Примеры |
|--------|-----------|---------|
| 0x02 | Control | Громкость (6 байт) |
| 0x03 | Status | Запрос статуса (7 байт) |
| 0x04 | Config | Конфигурация (8 байт) |
| 0x05 | DateTime | Дата/время (9 байт) |
| 0x07 | Zone | Зональные настройки |
| 0x09 | Presets | Пресеты |
| 0x0C | EQ | Эквалайзер (16 байт) |
| 0x0E | Unknown | Парковочные сенсоры? |
| 0x0F | Display | Настройки дисплея |
| 0x11 | Unknown | Тестовый режим |
| 0x17 | XOver | Кроссовер (26 байт) |
| 0x1B | Test | Тест (28 байт) |
| 0x21 | Balance | Баланс/Фейдер (34 байта) |
| 0x24 | Full | Полная конфигурация (37 байт) |
| 0x27 | Init | Инициализация (43 байта) |
| 0x34 | Advanced | Расширенные настройки (53 байта) |
| 0x38 | Dump | Дамп настроек (57 байт) |

---

## 🎯 ВЫВОДЫ

### Архитектура:
1. **Flutter приложение** на базе `audio_service` плагина
2. **Bluetooth Low Energy** связь с головным устройством
3. **Локальное хранение** настроек в SharedPreferences
4. **Кастомный протокол** поверх GATT характеристик

### Протокол:
1. **Префикс:** `0xC0 0x00`
2. **UUID:** `0000ae02-0000-1000-8000-00805f9b34fb`
3. **Формат:** Бинарный с CRC
4. **Команды:** 94 уникальных типа

### Безопасность:
1. Нет внешних API
2. Нет шифрования трафика
3. CRC алгоритм не раскрыт
4. Все данные локально

---

## 📂 ДОПОЛНИТЕЛЬНЫЕ ФАЙЛЫ

### Скрипты:
- `adb_reconnect.sh` - Переподключение ADB
- `adb_frida_auto.sh` - Авто-перезапуск Frida
- `run_frida.sh` - Запуск Frida

### Логи:
- `prology_live.txt` (184 KB) - Полный лог перехвата
- `prology_full_capture.txt` - Частичный захват

### Документация:
- `PROLOGY_PROTOCOL.md` - Документация протокола
- `PROLOGY_ANALYSIS_GUIDE.md` - Руководство по анализу

---

## 📈 ОБЪЁМ ДАННЫХ

```
prology_data/          ~120 KB
prology_live.txt       ~184 KB
Scripts                ~50 KB
Documentation          ~15 KB
─────────────────────────────────
TOTAL:                 ~369 KB
```

---

**Сбор данных завершён!** ✅
