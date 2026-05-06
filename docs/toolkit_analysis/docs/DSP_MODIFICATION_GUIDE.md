# PROLOGY DSP Modification Guide

**Версия:** 1.0  
**APK:** PROLOGY-140-5.0.55.apk  
**Дата:** 13 апреля 2026

---

## 📋 Оглавление

1. [Обзор](#обзор)
2. [Архитектура DSP](#архитектура-dsp)
3. [Новые функции](#новые-функции)
4. [Установка Frida](#установка-frida)
5. [Использование](#использование)
6. [Frida скрипты](#frida-скрипты)
7. [Патчинг libapp.so](#патчинг-libappso)
8. [Пересборка APK](#пересборка-apk)
9. [Troubleshooting](#troubleshooting)

---

## Обзор

Приложение PROLOGY — это **Flutter-приложение** для управления автомобильными мультимедийными системами.

**Ключевые характеристики:**
- Фреймворк: Flutter 3.x (Embedding v2)
- Вся бизнес-логика: `libapp.so` (Dart AOT компиляция)
- Bluetooth: BLE + SPP (двойной протокол)
- DSP функции: 28 listener'ов для управления звуком

**Структура файлов:**
```
APK_MOD/
├── PROLOGY-140-5.0.55.apk          # Оригинальный APK
├── PROLOGY_decompiled/              # Декомпиляция (apktool)
├── PROLOGY_jadx/                    # Декомпиляция (jadx)
├── PROLOGY_extracted/               # Извлечённые файлы
│   └── lib/arm64-v8a/libapp.so      # Dart AOT бинарник (8.5 MB)
├── frida_dsp_interceptor.js         # Перехват DSP команд
├── frida_dsp_extensions.js          # Инжекция новых функций
├── setup_frida.sh                   # Скрипт установки Frida
└── DSP_MODIFICATION_GUIDE.md        # Этот файл
```

---

## Архитектура DSP

### Реализованные функции (12)

| Функция | Описание | Параметры |
|---------|----------|-----------|
| **EQ** | Многополосный эквалайзер | 11 пресетов, Q-Factor, Link |
| **EQ Plus** | Расширенный EQ | Профессиональный режим |
| **X-Over** | Кроссовер | 2-way/3-way, HPF/LPF, 6-24 dB |
| **Time Alignment** | Временная коррекция | 7 каналов, delay + gain + mute |
| **Subwoofer** | Настройки сабвуфера | Volume, cutoff, level, loudness |
| **Fader/Balance** | Баланс каналов | Front/Rear, Left/Right |
| **Sound Field** | Звуковое поле | Режимы обработки |
| **Output Phase** | Фазировка | Normal/Reverse |
| **Presets** | Пресеты настроек | Сохранение/загрузка |
| **Loudness** | Тонкомпенсация | On/Off |
| **Treble/Bass** | ВЧ/НЧ | Простая настройка |
| **Bass Boost** | Усиление басов | Level, Frequency |

### Bluetooth стек

```
Flutter (Dart)
    ↓ MethodChannel
flutter_blue_plus_android (k2.C0395h, 936 строк)
    ↓ BLE/SPP
Автомобильное головное устройство
```

### DSP Models (из libapp.so)

Ключевые Dart классы (строки из libapp.so):
- `DspSender` — миксин отправки DSP пакетов
- `EqPlusModel` — модель расширенного EQ
- `XOverModel` — модель кроссовера
- `TimeAlignmentModel` — модель временной коррекции
- `PresetViewModel` — модель пресетов

---

## Новые функции

### 1. Dynamic EQ ⭐⭐⭐⭐⭐

**Описание:** Автоматическая подстройка эквалайзера в зависимости от громкости.

**Параметры:**
```json
{
  "enabled": true,
  "loudness_compensation": true,
  "curves": {
    "low_volume": { "gain": 3, "freq": 100 },
    "mid_volume": { "gain": 0, "freq": 1000 },
    "high_volume": { "gain": -2, "freq": 4000 }
  }
}
```

**Преимущество:** При низкой громкости автоматически поднимает НЧ, при высокой — снижает ВЧ для комфортного звучания.

---

### 2. Room Correction ⭐⭐⭐⭐⭐

**Описание:** Коррекция АЧХ салона автомобиля на основе измерений.

**Параметры:**
```json
{
  "enabled": true,
  "target_response": "flat",
  "filters": [
    { "type": "peaking", "freq": 100, "gain": -3, "q": 2.0 },
    { "type": "peaking", "freq": 300, "gain": 2, "q": 1.5 }
  ]
}
```

**Преимущество:** Компенсация резонансов салона, выравнивание АЧХ.

---

### 3. Dynamic Bass Boost ⭐⭐⭐⭐

**Описание:** Динамическое усиление басов с компрессией.

**Параметры:**
```json
{
  "enabled": true,
  "level": 6,
  "frequency": 60,
  "dynamic": true,
  "compression_ratio": 0.5,
  "threshold": -20
}
```

**Преимущество:** Мощные басы без клиппинга, автоматическая подстройка под сигнал.

---

### 4. 3D Sound Field ⭐⭐⭐⭐

**Описание:** Объёмное звучание с HRTF обработкой.

**Параметры:**
```json
{
  "enabled": true,
  "mode": "3d_surround",
  "width": 1.0,
  "depth": 0.8,
  "height": 0.5,
  "listener_position": { "x": 0, "y": 0, "z": 0 },
  "hrtf_enabled": true
}
```

**Преимущество:** Эффект присутствия, виртуальное расширение сцены.

---

### 5. Preset Manager ⭐⭐⭐

**Описание:** Менеджер пресетов с экспортом/импортом.

**Функции:**
- Экспорт всех DSP настроек в JSON
- Импорт настроек из файла
- Облачное хранение пресетов (опционально)
- Переключение между пресетами

---

### 6. Real-time RTA ⭐⭐⭐

**Описание:** Анализатор спектра в реальном времени.

**Визуализация:**
- 31-полосный анализатор (1/3 октавы)
- Частотный диапазон: 20 Hz — 20 kHz
- Отображение текущей АЧХ

---

## Установка Frida

### Требования

| Компонент | Версия | Установка |
|-----------|--------|-----------|
| Python | 3.8+ | `sudo apt install python3` |
| ADB | Любая | `sudo apt install android-tools-adb` |
| Android устройство | Root не требуется | Режим разработчика + USB debugging |

### Шаг 1: Установка frida-tools

```bash
pip3 install frida-tools --user
```

### Шаг 2: Проверка подключения

```bash
adb devices
# Должно показать устройство
```

### Шаг 3: Автоматическая установка

```bash
cd /home/mi/APK_MOD
bash setup_frida.sh install
```

Это выполнит:
- Скачивание frida-server для архитектуры устройства
- Загрузку frida-server на устройство
- Пересборку APK с debug флагом
- Установка APK

### Шаг 4: Ручная установка (если нужно)

```bash
# 1. Узнать архитектуру
adb shell getprop ro.product.cpu.abi
# Результат: arm64-v8a или armeabi-v7a

# 2. Скачать frida-server
FRIDA_VERSION=$(frida --version)
wget https://github.com/frida/frida/releases/download/$FRIDA_VERSION/frida-server-$FRIDA_VERSION-android-arm64.xz

# 3. Распаковать
xz -d frida-server-*.xz

# 4. Загрузить на устройство
adb push frida-server /data/local/tmp/
adb shell chmod 755 /data/local/tmp/frida-server

# 5. Запустить
adb shell '/data/local/tmp/frida-server &'
```

---

## Использование

### Режим 1: Перехват DSP команд

**Цель:** Увидеть какие команды отправляются на устройство.

```bash
bash setup_frida.sh intercept
```

**Что будет:**
1. Запуск приложения через Frida
2. Логирование всех MethodChannel вызовов
3. Логирование BLE/SPP команд
4. Расшифровка DSP пакетов

**Пример вывода:**
```
[METHODCHANNEL] Вызов: dsp/eq/set_preset
[METHODCHANNEL] Аргументы: {"preset_id": 3}
[BLE WRITE] Характеристика: 0000ffe1-0000-1000-8000-00805f9b34fb
[BLE WRITE] Данные (hex): 0102030405
[DSP] >>> Перехвачена DSP команда: dsp/xover/set_filter
```

---

### Режим 2: Инжекция новых функций

**Цель:** Добавить новые DSP функции.

```bash
bash setup_frida.sh extend
```

**Доступные команды (через frida REPL):**

```javascript
// Включить Dynamic EQ
rpc.exports.enableDynamicEq()

// Настроить Dynamic EQ
rpc.exports.setDynamicEqParams(true, 3, 0, -2)

// Включить Room Correction
rpc.exports.enableRoomCorrection()

// Загрузить фильтры коррекции
rpc.exports.setCorrectionFilters([
    {"type": "peaking", "freq": 100, "gain": -3, "q": 2.0}
])

// Включить Bass Boost
rpc.exports.enableBassBoost(6, 60, true)

// Включить 3D Sound
rpc.exports.enable3dSound(100, 80, 50)

// Экспорт настроек
rpc.exports.exportAllSettings()

// Импорт настроек
rpc.exports.importSettings('{"dynamic_eq": {...}}')

// Статус функций
rpc.exports.getFeatureStatus()
```

---

## Frida скрипты

### frida_dsp_interceptor.js

**Назначение:** Перехват и логирование DSP команд.

**Функции:**
- Перехват MethodChannel.invokeMethod
- Перехват BLE/SPP записи/чтения
- Декодирование DSP пакетов
- Автоматическое логирование

**Использование:**
```bash
frida -U -f com.prology -l frida_dsp_interceptor.js --no-pause
```

---

### frida_dsp_extensions.js

**Назначение:** Инжекция новых DSP функций.

**Добавленные функции:**
1. Dynamic EQ
2. Room Correction
3. Dynamic Bass Boost
4. 3D Sound Field
5. Preset Manager (export/import)

**Использование:**
```bash
frida -U -f com.prology -l frida_dsp_extensions.js --no-pause
```

После запуска доступны RPC команды (см. выше).

---

## Патчинг libapp.so

> ⚠️ **Сложный метод, требует знаний Dart VM internals**

### Когда нужен

- Постоянное решение (не требует Frida)
- Распространение модифицированного APK
- Добавление UI для новых функций

### Инструменты

| Инструмент | Назначение |
|------------|-----------|
| **Ghidra** | Дизассемблирование libapp.so |
| **IDA Pro** | Альтернатива Ghidra (платная) |
| **DartAotParser** | Парсинг Dart AOT (experimental) |
| **radare2** | Бинарный патчинг |

### Процесс

#### 1. Загрузка в Ghidra

```
1. Открыть Ghidra
2. File → New Project
3. Import file: lib/arm64-v8a/libapp.so
4. Анализ: default options
5. Ждать окончания анализа (30-60 мин)
```

#### 2. Поиск DSP функций

```
Search → Program Text:
- "DspSender"
- "EqPlusModel"
- "x_over"
- "time_alignment"
- "bluetooth_le_service"
```

#### 3. Патчинг

```
1. Найти функцию для модификации
2. Patch → Edit Instruction
3. Изменить логику
4. Сохранить изменения
```

#### 4. Пересборка

```bash
# Заменить libapp.so в decompiled директории
cp modified_libapp.so PROLOGY_decompiled/lib/arm64-v8a/libapp.so

# Пересобрать APK
apktool b PROLOGY_decompiled -o PROLOGY-modified.apk

# Подписать
apksigner sign --ks debug.keystore PROLOGY-modified.apk
```

### Альтернатива: Frida runtime hook

Вместо патчинга libapp.so можно использовать Frida для перехвата Dart функций:

```javascript
// Перехват Dart функции через Dart API
var dartSymbol = Module.findExportByName("libapp.so", "Dart_Invoke");

Interceptor.attach(dartSymbol, {
    onEnter: function(args) {
        console.log("[DART] Вызов функции: " + args[0]);
    }
});
```

---

## Пересборка APK

### Простой метод (ресурсы)

```bash
# 1. Заменить ресурсы
cd PROLOGY_extracted
# Заменить PNG в assets/flutter_assets/

# 2. Запаковать
zip -r ../PROLOGY-res-modified.apk *

# 3. Подписать
apksigner sign --ks debug.keystore ../PROLOGY-res-modified.apk
```

### Полный метод (с libapp.so)

```bash
# 1. Внести изменения в libapp.so (через Ghidra)

# 2. Заменить в decompiled директории
cp libapp.so PROLOGY_decompiled/lib/arm64-v8a/

# 3. Пересобрать
apktool b PROLOGY_decompiled -o PROLOGY-full-mod.apk

# 4. Подписать
apksigner sign --ks debug.keystore PROLOGY-full-mod.apk

# 5. Установить
adb install -r PROLOGY-full-mod.apk
```

---

## Troubleshooting

### Проблема: Frida-server не запускается

**Решение:**
```bash
# Проверить права
adb shell ls -l /data/local/tmp/frida-server

# Если не executable
adb shell chmod 755 /data/local/tmp/frida-server

# Если ошибка SELinux
adb shell setenforce 0
```

### Проблема: Приложение крашится при запуске с Frida

**Решение:**
```bash
# Использовать --no-pause
frida -U -f com.prology -l script.js --no-pause

# Или подключиться к уже запущенному
frida -U -n PROLOGY -l script.js
```

### Проблема: MethodChannel не перехватывается

**Причина:** Flutter использует другую реализацию.

**Решение:**
```bash
# Перехватить через Dart API
frida -U -f com.prology -l frida_dart_hook.js

# Или через JNI
# Искать: JNIEnv->CallStaticObjectMethod
```

### Проблема: libapp.so не поддаётся анализу

**Причина:** Dart AOT компиляция obfuscates символы.

**Решение:**
1. Использовать строки для поиска: `strings libapp.so | grep -i "dsp"`
2. Анализировать вызовы Dart VM функций
3. Использовать Frida для динамического анализа

### Проблема: APK не устанавливается

**Решение:**
```bash
# Удалить старую версию
adb uninstall com.prology

# Установить заново
adb install PROLOGY-modified.apk

# Если ошибка подписи
apksigner verify --print-certs PROLOGY-modified.apk
```

---

## Ссылки

- **Frida документация:** https://frida.re/docs
- **Dart AOT реверс:** https://github.com/Impact-I/DartAotParser
- **Flutter MethodChannel:** https://docs.flutter.dev/development/platform-integration/platform-channels
- **Ghidra:** https://ghidra-sre.org

---

## TODO

- [ ] Добавить UI для Dynamic EQ
- [ ] Реализовать Room Correction с измерением АЧХ
- [ ] Создать Preset Manager с облачной синхронизацией
- [ ] Добавить Real-time RTA визуализацию
- [ ] Патчинг libapp.so для постоянного решения
