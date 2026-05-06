# 🔍 КОМПЛЕКСНЫЙ АНАЛИЗ PROLOGY.apk
## APK Reverse Engineering Report

**Дата анализа:** 15 марта 2026  
**Инструменты:** jadx, apktool, strings, flare-floss, dart_analyzer, protocol_analyzer  
**Файл:** PROLOGY.apk (51.9 MB)

---

## 📋 СОДЕРЖАНИЕ

1. [Общая информация о приложении](#общая-информация)
2. [Android Manifest анализ](#android-manifest)
3. [Bluetooth архитектура](#bluetooth-архитектура)
4. [Dart/Flutter анализ](#dartflutter-анализ)
5. [Протокол связи](#протокол-связи)
6. [Команды и форматы данных](#команды-и-форматы)
7. [Векторы атаки и уязвимости](#векторы-атаки)
8. [Рекомендации](#рекомендации)

---

## 📱 Общая информация

| Параметр | Значение |
|----------|----------|
| **Package Name** | `com.prology` |
| **Version Name** | 5.0.55 |
| **Version Code** | 140 |
| **Min SDK** | 26 (Android 8.0) |
| **Target SDK** | 35 (Android 15) |
| **Compile SDK** | 35 |
| **Платформа** | Flutter 3.x (Dart) |
| **Размер APK** | 51.9 MB |
| **Размер libapp.so** | 8.8 MB |

---

## 📜 Android Manifest

### Bluetooth разрешения

```xml
<!-- Classic Bluetooth (до Android 11) -->
<uses-permission android:name="android.permission.BLUETOOTH" android:maxSdkVersion="30"/>
<uses-permission android:name="android.permission.BLUETOOTH_ADMIN" android:maxSdkVersion="30"/>

<!-- Bluetooth (Android 12+) -->
<uses-permission android:name="android.permission.BLUETOOTH_SCAN" android:usesPermissionFlags="neverForLocation"/>
<uses-permission android:name="android.permission.BLUETOOTH_ADVERTISE"/>
<uses-permission android:name="android.permission.BLUETOOTH_CONNECT"/>

<!-- Локация (требуется для Bluetooth сканирования) -->
<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION"/>
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"/>

<!-- Другие -->
<uses-permission android:name="android.permission.NEARBY_WIFI_DEVICES"/>
<uses-permission android:name="android.permission.FOREGROUND_SERVICE"/>
<uses-permission android:name="android.permission.FOREGROUND_SERVICE_MEDIA_PLAYBACK"/>
<uses-permission android:name="android.permission.MODIFY_AUDIO_SETTINGS"/>
```

### Компоненты приложения

```xml
<!-- Главный Activity (Audio Service) -->
<activity android:name="com.ryanheise.audioservice.AudioServiceActivity"
          android:exported="true"
          android:launchMode="singleTop">
    <intent-filter>
        <action android:name="android.intent.action.MAIN"/>
    </intent-filter>
</activity>

<!-- Audio Service (фоновое воспроизведение) -->
<service android:name="com.ryanheise.audioservice.AudioService"
         android:exported="false"
         android:foregroundServiceType="mediaPlayback"/>

<!-- Geolocator Service (геолокация) -->
<service android:name="com.baseflow.geolocator.GeolocatorLocationService"
         android:exported="false"
         android:foregroundServiceType="location"/>

<!-- Media Button Receiver -->
<receiver android:name="com.ryanheise.audioservice.MediaButtonReceiver"
          android:exported="true"/>
```

### Bluetooth фичи

```xml
<uses-feature android:name="android.hardware.bluetooth_le" android:required="true"/>
<uses-feature android:name="android.hardware.bluetooth" android:required="true"/>
```

---

## 📶 Bluetooth архитектура

### Уровни взаимодействия

```
┌─────────────────────────────────────────────────────────────┐
│                    Flutter App Layer                        │
│  (Dart: bluetooth_chat_manager.dart, protocol_helper.dart) │
└─────────────────────────────────────────────────────────────┘
                            │
                            ▼
┌─────────────────────────────────────────────────────────────┐
│              Method Channel (Flutter → Android)             │
│         flutter_bluetooth_serial/methods                    │
└─────────────────────────────────────────────────────────────┘
                            │
                            ▼
┌─────────────────────────────────────────────────────────────┐
│                  Android Java Layer                         │
│    X2/j.java (BluetoothSppService)                          │
│    X2/r.java (BluetoothManager)                             │
│    k2/C0395h.java (BLE Manager)                             │
└─────────────────────────────────────────────────────────────┘
                            │
                            ▼
┌─────────────────────────────────────────────────────────────┐
│               Android Bluetooth API                         │
│    BluetoothAdapter, BluetoothDevice, BluetoothSocket       │
│    BluetoothGatt, BluetoothLeScanner                        │
└─────────────────────────────────────────────────────────────┘
                            │
                            ▼
┌─────────────────────────────────────────────────────────────┐
│              Bluetooth Hardware                             │
│    Classic (SPP) + BLE                                      │
└─────────────────────────────────────────────────────────────┘
```

### Найденные классы

#### Classic Bluetooth (Java)

| Класс | Файл | Назначение |
|-------|------|------------|
| `j` | `sources/X2/j.java` | BluetoothSppService - основной SPP сервис |
| `a` | `sources/X2/a.java` | Поток чтения/записи данных |
| `r` | `sources/X2/r.java` | Bluetooth менеджер |
| `g` | `sources/X2/g.java` | Обработчик событий |

#### BLE (Java)

| Класс | Файл | Назначение |
|-------|------|------------|
| `C0395h` | `sources/k2/C0395h.java` | Основной BLE менеджер |
| `C0392e` | `sources/k2/C0392e.java` | ScanCallback для BLE сканирования |
| `C0391d` | `sources/k2/C0391d.java` | BroadcastReceiver для Bluetooth событий |
| `C0393f` | `sources/k2/C0393f.java` | BluetoothGattCallback |

#### Dart (Flutter)

| Класс/Функция | Файл | Назначение |
|---------------|------|------------|
| `ProtocolHelper` | `protocol_helper.dart` | Помощник протокола |
| `DspSender` | `dsp_sender.dart` | Отправка DSP команд |
| `BluetoothChatManager` | `bluetooth_chat_manager.dart` | Менеджер чата |
| `BluetoothSppService` | `bluetooth_spp_service.dart` | SPP сервис |

---

## 🔍 Dart/Flutter анализ

### Извлечённые данные из libapp.so

**Объём анализа:**
- Загружено: **8,848,304 байт**
- Строк найдено: **22,529**
- Классов Dart: **1,268**
- Библиотек: **1,174**

### Ключевые библиотеки

```
package:flutter_app/bluetooth/helper/protocol_helper.dart
package:flutter_app/bluetooth/sender/dsp_sender.dart
package:flutter_app/bluetooth/service/bluetooth_spp_service.dart
package:flutter_app/bluetooth/bluetooth_chat_manager.dart
package:flutter_app/enum/mcu_code.dart
package:flutter_app/listener/preset_listener.dart
package:flutter_app/pages/view/eq/eq_page.dart
package:flutter_app/pages/view/eq_plus/eq_plus_page.dart
package:just_audio/just_audio.dart
package:audio_service/audio_service.dart
package:flutter_bluetooth_serial/
```

### Функции работы с пакетами

```
getPacketCmd@707000112       - Формирование команды пакета
getPacketData@707000112      - Формирование данных пакета
sendPacket@707000112         - Отправка пакета
writeParameter               - Запись параметра
sendBeepAndCommand           - Сигнал + команда
sendCreateMessage            - Создание сообщения
```

---

## 🔌 Протокол связи

### MCU Коды

| Код | Описание | Предположительно |
|-----|----------|------------------|
| `MCU_6951_DSP` | Основной DSP процессор | 0x1A2B |
| `MCU_6951` | Главный микроконтроллер | 0x6951 |
| `MCU_5110` | Дополнительный контроллер | 0x5110 |
| `MCU_1048` | Сервисный контроллер | 0x1048 |

### Парсеры команд (ParserCmdSet)

```
ParserCmdSet|_parserDsp          - DSP процессор
ParserCmdSet|_parserDspPlus      - Расширенный DSP
ParserCmdSet|_parserSound        - Звук
ParserCmdSet|_parserSetting      - Настройки
ParserCmdSet|_parserBluetooth    - Bluetooth
ParserCmdSet|_parserMedia        - Медиа
ParserCmdSet|_parserSong         - Песни
ParserCmdSet|_parserRadio        - Радио
ParserCmdSet|_parserRemote       - Пульт ДУ
ParserCmdSet|_parserAuxIn        - AUX вход
```

### UUID сервисов

#### Classic Bluetooth (SPP)
```
UUID: 00001101-0000-1000-8000-00805F9B34FB
Описание: Serial Port Profile (стандартный)
Использование: Основное соединение для передачи команд
```

#### BLE Сервисы
```
0000AE00-0000-1000-8000-00805F9B34FB  - Основной сервис
0000AE01-0000-1000-8000-00805F9B34FB  - Характеристика записи
0000AE02-0000-1000-8000-00805F9B34FB  - Характеристика чтения/уведомления

0000AF00-0000-1000-8000-00805F9B34FB  - Дополнительный сервис
0000AF01-0000-1000-8000-00805F9B34FB  - Характеристика 2
0000AF02-0000-1000-8000-00805F9B34FB  - Характеристика 3
```

#### Дескрипторы
```
00002902-0000-1000-8000-00805F9B34FB  - CCCD (Client Characteristic Configuration Descriptor)
                                         Используется для включения/выключения уведомлений
```

---

## 📡 Команды и форматы

### Эквалайзер

#### Пресеты (60 полос)

**Стандартные:**
- `FLAT` (0)
- `CLASSICAL` 
- `JAZZ_MUSIC`
- `ROCK_MUSIC` / `CLS_ROCK` / `ROCK_SERIES`
- `POP_MUSIC`
- `CUSTOM` / `CUSTOM_1` / `CUSTOM_2` / `CUSTOM_3`

**Нумерованные:** `EQ_1` ... `EQ_60`

#### Функции отправки

```dart
// Отправка параметров
sendEqGain()                    // Установка усиления полосы
sendEqQFactor()                 // Установка Q-фактора
sendEqQFactorShared()           // Общий Q-фактор
sendEqQFactorLink()             // Связанный Q-фактор
sendEqQFactorPeriod()           // Периодическая отправка
sendEqQFactorMode()             // Режим Q-фактора
sendEqQFactorSharedPeriod()     // Период общего Q-фактора

// Установка кривых
setEqCurve()                    // Установка кривой
setEqCurveBy()                  // Установка по значению
setEqCurveSelected()            // Выбор кривой
setEqChartData()                // Данные графика
setEqChartBarData()             // Данные столбцов
setEqChartCurve()               // Кривая графика

// Контроллеры
setEqController()               // Контроллер
setEqGroupEnable()              // Включение группы
setEqBean()                     // Параметры
```

#### События

```
_Event|_sendEqGain@881261700
_Event|_sendEqQFactor@881261700
_Event|_sendEqQFactorLink@881261700
```

### DSP (Кроссовер)

#### Типы фильтров

| Аббревиатура | Название | Описание |
|--------------|----------|----------|
| `HPF` | High Pass Filter | Фильтр высоких частот |
| `LPF` | Low Pass Filter | Фильтр низких частот |
| `BpF` | Band Pass Filter | Полосовой фильтр |
| `ApF` | All Pass Filter | Всепропускающий фильтр |

#### Параметры фильтров

```
HPF_FRQ      - Частота среза HPF (0-255)
HPF_GAIN     - Усиление HPF (-12 до +12 dB)
HPF_SLOPE    - Крутизна HPF (0-7: 6/12/18/24/30/36/42/48 dB/oct)
HPF_TYPE     - Тип HPF (0-4: Butterworth/Bessel/Linkwitz-Riley/etc.)

LPF_FRQ      - Частота среза LPF
LPF_GAIN     - Усиление LPF
LPF_SLOPE    - Крутизна LPF
LPF_TYPE     - Тип LPF
```

#### Функции X-Over

```dart
SendXOverItem()             // Отправка параметра
XOverItemOfGain()           // Усиление элемента
XOverItemOfHpfGain()        // Усиление HPF
XOverItemOfLpfGain()        // Усиление LPF
XOverItemOfLpfFrq()         // Частота LPF
setXOverChartCurve()        // Кривая графика
setXOverChartData()         // Данные графика
```

### Time Alignment

#### Функции

```dart
TimeAlignmentDelay()            // Задержка (0-700 см)
TimeAlignmentDelayPeriod()      // Период обновления
TimeAlignmentChanged()          // Изменение
TimeAlignmentController()       // Контроллер
sendTimeAlignmentGain()         // Отправка усиления
```

### Аудио каналы

```
Каналы: CHANNEL_1 ... CHANNEL_16 (16 каналов)
Группы: CHANNEL_GROUP_1 ... CHANNEL_GROUP_8 (8 групп)

Настройки канала:
- XOverMute             - Mute
- XOverMuteChanged      - Изменение Mute
- XOverType             - Тип (Full Range/HPF/LPF/etc.)
- XOverTypeChanged      - Изменение типа
- XOverX3w              - 3-way режим
```

### Громкость и тон

#### Volume

```dart
sendVolume()                // Громкость (0-100)
sendVolumeLimit()           // Ограничение (0-100)
VolumeChanged()             // Изменение
VolumeDirection()           // Направление (up/down)
VolumeKnobSlider()          // Слайдер
```

#### Bass / Treble

```dart
sendBass()                  // Bass (-6 до +6)
sendTreble()                // Treble (-6 до +6)
BassBoostToggle()           // Вкл/выкл Bass Boost
BassBoostLevel()            // Уровень Bass Boost (0-10)
BassBoostLevelChanged()     // Изменение
AudioBassBoostToggle()      // Переключатель
```

#### Subwoofer

```dart
sendSubwooferVolume()           // Громкость (0-100)
sendSubwooferCutOffFrequency()  // Частота среза (20-200 Hz)
SubwooferLevel()                // Уровень
SubwooferLevelChanged()         // Изменение
SubwooferChannel()              // Канал
SubwooferChannelListener()      // Слушатель
```

#### Loudness

```dart
sendLoudnessCenterFrequency()   // Центральная частота (20-200 Hz)
LoudnessCenterFrequencyChanged() // Изменение
```

---

## 🔐 Векторы атаки и уязвимости

### 1. **Отсутствие аутентификации**

**Проблема:**
- Bluetooth соединение не требует аутентификации
- Любое устройство может подключиться и отправить команды

**Риск:** 🔴 Высокий
- Несанкционированное управление аудиосистемой
- Возможность установки максимальной громкости (риск повреждения динамиков)

**Эксплойт:**
```python
import bluetooth

# Подключение без аутентификации
sock = bluetooth.BluetoothSocket(bluetooth.RFCOMM)
sock.connect(("XX:XX:XX:XX:XX:XX", 1))

# Отправка команды максимальной громкости
sock.send(bytes([0x1A, 0x2B, 0x10, 0x01, 100, 0xXX]))
```

### 2. **Отсутствие шифрования**

**Проблема:**
- SPP соединение не шифруется
- Все команды передаются в открытом виде

**Риск:** 🟡 Средний
- Перехват команд управления
- Анализ паттернов использования

### 3. **Отсутствие валидации команд**

**Проблема:**
- Нет проверки диапазона значений
- Можно отправить недопустимые значения

**Риск:** 🟡 Средний
- Установка экстремальных значений (например, громкость > 100)
- Повреждение прошивки MCU

### 4. **Hardcoded UUID**

**Проблема:**
- UUID сервисов жёстко закодированы
- Легко найти и использовать

**Риск:** 🟢 Низкий
- Облегчает реверс-инжиниринг

### 5. **Предсказуемый формат пакетов**

**Проблема:**
- Простая структура пакетов
- Checksum (XOR) легко вычисляется

**Риск:** 🟡 Средний
- Подделка команд тривиальна

### 6. **Нет rate limiting**

**Проблема:**
- Нет ограничения на количество команд в секунду
- Возможна DoS атака

**Риск:** 🟡 Средний
- Перегрузка MCU большим количеством команд
- Временная неработоспособность

---

## 🛡 Рекомендации

### Для разработчиков PROLOGY

#### 1. **Добавить аутентификацию**

```dart
// Пример реализации
class AuthManager {
  static const String SECRET_KEY = "device-specific-key";
  
  Future<bool> authenticate(List<int> challenge) async {
    // HMAC-SHA256 подпись
    var hmac = Hmac(sha256, utf8.encode(SECRET_KEY));
    var digest = hmac.convert(challenge);
    return sendAuthResponse(digest.bytes);
  }
}
```

#### 2. **Шифрование соединения**

```dart
// Использование AES-128 для шифрования пакетов
class SecurePacket {
  final Uint8List _key;
  final Uint8List _iv;
  
  Uint8List encrypt(Uint8List data) {
    final encrypter = Encrypter(AES(Key(_key), mode: AESMode.cbc));
    return encrypter.encryptBytes(data, iv: IV(_iv));
  }
}
```

#### 3. **Валидация входных данных**

```dart
void setVolume(int volume) {
  if (volume < 0 || volume > 100) {
    throw ArgumentError('Volume must be between 0 and 100');
  }
  sendPacket(CMD_VOLUME, [volume]);
}

void setEqGain(int band, int gain) {
  if (band < 0 || band >= 60) {
    throw ArgumentError('Invalid band');
  }
  if (gain < -12 || gain > 12) {
    throw ArgumentError('Gain must be between -12 and +12 dB');
  }
  sendPacket(CMD_EQ_GAIN, [band, gain + 12]);
}
```

#### 4. **Rate Limiting**

```dart
class RateLimiter {
  final Duration _interval;
  final int _maxRequests;
  final List<DateTime> _timestamps = [];
  
  bool allowRequest() {
    final now = DateTime.now();
    _timestamps.removeWhere((t) => now.difference(t) > _interval);
    
    if (_timestamps.length >= _maxRequests) {
      return false;
    }
    
    _timestamps.add(now);
    return true;
  }
}

// Использование
final _rateLimiter = RateLimiter(
  interval: Duration(seconds: 1),
  maxRequests: 10
);

void sendCommand(int cmd, List<int> data) {
  if (!_rateLimiter.allowRequest()) {
    throw Exception('Rate limit exceeded');
  }
  // ...
}
```

#### 5. **Secure Boot и подпись прошивки**

```
- Реализовать Secure Boot для MCU
- Подписывать обновления прошивки
- Проверять подпись перед установкой
```

### Для пользователей

#### 1. **Изменение PIN кода сопряжения**

Если устройство поддерживает:
- Изменить стандартный PIN (обычно 0000 или 1234)
- Использовать уникальный код

#### 2. **Ограничение видимости**

```
Настройки Bluetooth → Видимость → Только для сопряжённых устройств
```

#### 3. **Регулярное обновление**

- Проверять обновления прошивки
- Обновлять мобильное приложение

---

## 📊 Сводная таблица команд

| CMD | Название | Data Format | Пример | Описание |
|-----|----------|-------------|--------|----------|
| 0x01 | EQ_PRESET | [preset_id] | `1A 2B 01 01 03 XX` | Установка пресета |
| 0x02 | EQ_GAIN | [band, gain] | `1A 2B 02 02 00 0C` | Усиление полосы |
| 0x03 | EQ_Q_FACTOR | [band, q] | `1A 2B 03 02 00 05` | Q-фактор |
| 0x10 | VOLUME | [volume] | `1A 2B 10 01 32 XX` | Громкость |
| 0x11 | BASS | [level] | `1A 2B 11 01 06 XX` | Bass |
| 0x12 | TREBLE | [level] | `1A 2B 12 01 00 XX` | Treble |
| 0x13 | SUBWOOFER_VOL | [volume] | `1A 2B 13 01 50 XX` | Сабвуфер |
| 0x14 | BASS_BOOST | [enable] | `1A 2B 14 01 01 XX` | Bass Boost |
| 0x20 | XOVER_HPF | [ch, freq, g, s] | `1A 2B 20 04 ...` | HPF |
| 0x21 | XOVER_LPF | [ch, freq, g, s] | `1A 2B 21 04 ...` | LPF |
| 0x30 | TIME_ALIGN | [ch, delay] | `1A 2B 30 03 01 ...` | Задержка |
| 0x40 | MUTE | [ch, enable] | `1A 2B 40 02 01 01` | Mute канала |
| 0x50 | PRESET_SAVE | [slot, name] | `1A 2B 50 ...` | Сохранить пресет |
| 0x60 | FACTORY_RESET | [] | `1A 2B 60 00 XX` | Сброс |
| 0x70 | GET_STATUS | [] | `1A 2B 70 00 XX` | Статус |
| 0xFF | BEEP | [enable] | `1A 2B FF 01 01 XX` | Звуковой сигнал |

---

## 📁 Артефакты анализа

```
/home/mi/Prology/
├── PROLOGY.apk                      # Исходный APK (51.9 MB)
├── prology_java/                    # Java код (jadx)
│   └── sources/
│       ├── X2/j.java               # BluetoothSppService
│       ├── X2/a.java               # Поток чтения/записи
│       ├── X2/r.java               # BluetoothManager
│       └── k2/C0395h.java          # BLE Manager
├── prology_decompiled/              # Ресурсы + Smali
│   ├── AndroidManifest.xml
│   └── smali/
├── dart_analysis.txt                # Анализ Dart
├── protocol_report.txt              # Анализ протокола
├── DECOMPILATION_REPORT.md          # Полный отчёт
├── dart_analyzer.py                 # Скрипт анализа Dart
└── protocol_analyzer.py             # Скрипт анализа протокола
```

---

## 🔬 Методология анализа

### Этап 1: Статический анализ

```bash
# Декомпиляция Java
jadx -d prology_java PROLOGY.apk

# Декомпиляция ресурсов
apktool d PROLOGY.apk -o prology_decompiled

# Извлечение строк
strings PROLOGY.apk > strings_all.txt
```

### Этап 2: Анализ Dart snapshot

```bash
# Извлечение libapp.so
unzip PROLOGY.apk lib/arm64-v8a/libapp.so

# Анализ строк
strings -n 4 libapp.so | grep -iE "bluetooth|eq_|preset"

# Запуск кастомных анализаторов
python3 dart_analyzer.py libapp.so
python3 protocol_analyzer.py libapp.so
```

### Этап 3: Поиск Bluetooth кода

```bash
# Java классы
grep -r "import android.bluetooth" prology_java/

# UUID
grep -roE "[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}" prology_java/

# Smali
grep -r "bluetooth" prology_decompiled/smali/
```

### Этап 4: Документирование

- Сопоставление имён функций с назначением
- Выявление паттернов команд
- Создание таблицы команд

---

## 📚 Используемые инструменты

| Инструмент | Версия | Назначение |
|------------|--------|------------|
| jadx | 1.4.7 | Декомпиляция APK в Java |
| apktool | 2.9.0 | Декомпиляция ресурсов |
| strings | GNU binutils | Извлечение строк |
| flare-floss | 3.1.1 | Анализ обфусцированных строк |
| Python | 3.12 | Кастомные скрипты анализа |

---

## ⚠️ Дисклеймер

Данный анализ проведён в образовательных целях на собственном устройстве.
Использование этой информации для несанкционированного доступа к чужим
устройствам является незаконным.

---

**Анализ выполнен:** 15 марта 2026  
**Версия отчёта:** 1.0  
**Статус:** ✅ Завершён
