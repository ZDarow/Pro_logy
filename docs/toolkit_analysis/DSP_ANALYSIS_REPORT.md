# 🔬 PROLOGY DSP Analysis Report

**APK:** PROLOGY-140-5.0.55.apk  
**Package:** com.prology  
**Framework:** Flutter (AOT-compiled Dart → libapp.so 8.8MB)  
**BLE:** flutter_blue_plus_android + flutter_bluetooth_serial  

---

## 📋 1. DSP ФУНКЦИИ (уже реализованные)

| Функция | Статус | Dart класс/модель | Страница |
|---------|--------|-------------------|----------|
| **EQ (Equalizer)** | ✅ | `_EqPageState@895285551`, `EqListener`, `EqPlusModel` | `pages/view/eq/eq_chart_page.dart` |
| **X-Over (Crossover)** | ✅ | `_XOverChartPageState@964254273`, `XOverModel`, `XOverType` | chart page |
| **Subwoofer + Loudness** | ✅ | `SubwooferVolumeListener`, `LoudnessListener`, `loudness_model.dart` | `pages/model/subwoofer_loudness_view_model.dart` |
| **Time Alignment** | ✅ | `TimeAlignmentModel`, `TimeAlignmentListener`, `TimeAlignmentPosition` | pushTimeAlignment |
| **Fader / Balance** | ✅ | AudioBalanceLeft | settings |
| **Sound Field** | ✅ | `_SoundFieldPageState@902342021`, `SoundFieldType` | settings |
| **Presets** | ✅ | `PresetViewModel`, `IPresetListener`, `eq.preset.names` | `_PresetDialogState` |
| **Q-Factor (EQ)** | ✅ | `sendEqQFactorShared()`, `_eqQFactorButton`, `EqGroupEnable` | eq_chart_page |
| **Cut-off Frequency** | ✅ | `_sendSubwooferCutOffFrequency`, `onSubwooferCutOffFrequencyChanged` | subwoofer |
| **Output Phase** | ✅ | `ic_output_phase_normal`, `ic_output_phase_reversed` | output |
| **Output Mute per channel** | ✅ | `ic_speaker_*_mute` | output |
| **Bluetooth Mic Gain** | ✅ | `_bluetoothMicGainView` | settings |
| **Parking Sensor UI** | ✅ | `ic_parking_sensor_*` (left/right 1-6) | settings |

### EQ детали:
- **Пресеты:** `EQ_8`, `EQ_12D`, `EQ_13`, `EQ_14`, `EQ_16`, `EQ_23`, `EQ_33`, `EQ_39`, `EQ_44`, `EQ_51`, `EQ_55`
- **Полосы:** минимум 8-14 (EQ_8 → EQ_14)
- **Параметры:** Gain, Frequency, Q-Factor (link/unlink)
- **Профессиональный режим:** `_eqProfessionTextButton`, `_eqProfessionFilterGroupView`

### X-Over детали:
- **Типы:** 2-way, 3-way (`_xOverX2wButton`, `_xOverX3wButton`, `_xOverSelectorCheckedButton3WayTmw`)
- **Параметры:** Type, Mute, Link R/L (`XOver|isLinkRil`)
- **LPF/HPF:** `SW-LPF GAIN`, `SW-HPF GAIN`

### Time Alignment детали:
- **Каналы:** Front Left, Front Right, Rear Left, Rear Right, Subwoofer, Tweeter
- **Параметры:** Delay (`Event|sendTimeAlignmentDelayPeriod`), Gain (`sendTimeAlignmentGain`), Mute (`sendTimeAlignmentMute`)
- **Позиции:** `TimeAlignmentPosition`, тип авто (`sendTimeAlignmentCarType`)
- **Каналы:** 7+ (`CHANNEL_7`)

### Subwoofer детали:
- **Volume:** `SubwooferVolumeListener`, `_sendSubwooferVolumePeriod`
- **Cut-off Frequency:** `_sendSubwooferCutOffFrequency`
- **Level:** `notifySubwooferLevelChanged`
- **Loudness:** `LoudnessOnListener`, `Loudness`, `_loudnessCenterFrequencyView`

---

## 🔌 2. BLUETOOTH / BLE СТРУКТУРА

### Плагины:
| Плагин | Класс | Назначение |
|--------|-------|------------|
| **flutter_blue_plus_android** | `k2.C0395h` (936 строк) | BLE — основной канал к DSP устройству |
| **flutter_bluetooth_serial** | `X2.r` (167 строк) | Bluetooth Classic (Serial) |

### BLE метод (flutter_blue_plus):
```
Flutter Blue Plus → MethodChannel: "flutter_blue_plus/methods"
  ├── scan → discover DSP device
  ├── connect → GATT connection
  ├── discoverServices → find DSP characteristics
  ├── write → send DSP packets (bytes)
  ├── setNotifyValue → receive DSP responses
  └── read → read DSP state
```

### Ключевые методы:
| Метод | Описание |
|-------|----------|
| `_getPacketCmd@707000112` | Формирование CMD пакета |
| `_getPacketData@707000112` | Формирование DATA пакета |
| `_EqPlusController&Object&DspSender@942070233` | Миксин для отправки DSP |
| `__XOverChartPageState&HeaderPageState&DspSender@964254273` | X-Over page + DSP sender |
| `BluetoothModel._@746315451` | Singleton BLE модели |

### Протокол (предположительно):
```
[CMD byte] [Data bytes] [Checksum]
```
Пакеты формируются через `_getPacketCmd` и `_getPacketData`.

---

## 📡 3. METHODCHANNEL names

| Канал | Плагин | Назначение |
|-------|--------|------------|
| `flutter_blue_plus/methods` | flutter_blue_plus_android | BLE операции |
| `com.ryanheise.audio_service.client.methods` | audio_service | Управление аудио |
| `com.ryanheise.audio_service.handler.methods` | audio_service | Обработчик аудио |
| `com.ryanheise.audio_session` | audio_session | Сессия аудио |
| `com.ryanheise.android_audio_manager` | audio_session | Android AudioManager |
| `flutter/isolate` | Flutter | Isolate управление |
| `flutter/settings` | Flutter | Системные настройки |
| `flutter/lifecycle` | Flutter | Lifecycle события |
| `flutter/navigation` | Flutter | Навигация |
| `flutter/platform` | Flutter | Platform calls |
| `flutter/textinput` | Flutter | TextInput |

---

## 🎯 4. ТОЧКИ РАСШИРЕНИЯ (что МОЖНО добавить)

### 4.1 EQ расширения

| Что добавить | Где | Как |
|-------------|-----|-----|
| **Больше полос EQ** | `EqPlusModel`, `_EqPageState` | Добавить новые bands в модель, изменить `_eqSliderView` |
| **Новые пресеты** | `eq.preset.names`, `PresetViewModel` | Добавить строки в список пресетов |
| **Parametric EQ** | `_eqProfessionFilterGroupView` | Добавить тип фильтра (Peaking, Low Shelf, High Shelf, Bandpass) |
| **Graphic EQ → Parametric** | `eq_chart_page.dart` | Переключить режим отображения |
| **Real-time Analyzer (RTA)** | `eq_chart_page.dart` | Добавить FFT визуализацию через `fl_chart` |

**Ключевые классы для модификации:**
- `EqPlusModel._@867496465` — модель EQ
- `_setEqController@896428704` — контроллер EQ
- `sendEqQFactorShared()` — отправка Q-Factor
- `_sendEqQFactorLink` / `_sendEqQFactorLinkPeriod` — Link Q-Factor
- `onEqSingleChanged` — хук изменения EQ
- `notifyEqAllChanged` — хук изменения всех EQ

### 4.2 X-Over расширения

| Что добавить | Где | Как |
|-------------|-----|-----|
| **4-way crossover** | `XOverType`, `showXOverSelectorDialog` | Добавить новый тип |
| **Slope (dB/oct)** | `XOverModel` | Добавить 12/24/48 dB/oct |
| **Phase per band** | X-Over page | Добавить 0°/180° |
| **Link EQ+XOver** | `XOver|isLinkRil` | Расширить link логику |

**Ключевые классы:**
- `XOverModel` — модель crossover
- `notifyXOverTypeChanged` / `notifyXOverTypeSyncChanged` — уведомления
- `notifyXOverItemChanged` — изменение элемента
- `Event|_getXOverOptionBy` — получение опций

### 4.3 Time Alignment расширения

| Что добавить | Где | Как |
|-------------|-----|-----|
| **Больше каналов** | `TimeAlignmentModel`, `CHANNEL_7` | Добавить 8+ каналов |
| **Unit (ms/cm/inch)** | `TimeAlignmentPosition` | Выбор единиц |
| **Auto TA (mic)** | `sendTimeAlignmentCarType` | Автоматический расчёт |
| **Phase alignment** | Time Alignment page | Добавить фазу |

**Ключевые классы:**
- `TimeAlignmentModel().gainOption[` — gain опции
- `sendTimeAlignmentGain` / `sendTimeAlignmentMute` / `sendTimeAlignmentPosition`
- `notifyTimeAlignmentChanged` — уведомление
- `TimeAlignmentListener` — listener

### 4.4 Subwoofer расширения

| Что добавить | Где | Как |
|-------------|-----|-----|
| **Dual Subwoofer** | `isSubwooferChannel`, `Channel|isSubwooferChannel` | 2独立 subwoofer |
| **Sub EQ** | Subwoofer page | Добавить EQ для саба |
| **Bass EQ** | `loudness_model.dart` | Добавить bass boost кривую |
| **Phase 0°/180°** | `ic_output_phase_*` | Добавить фазу саба |

**Ключевые классы:**
- `SubwooferVolumeListener` / `SubwooferChannelListener`
- `notifySubwooferVolumeChanged` / `notifySubwooferLevelChanged`
- `onSubwooferCutOffFrequencyChanged`

### 4.5 Sound Field расширения

| Что добавить | Где | Как |
|-------------|-----|-----|
| **Surround режимы** | `_SoundFieldPageState` | Dolby/Virtual Surround |
| **Stereo width** | `SoundFieldType` | Ширина стерео |
| **Center image** | Sound Field page | Фокусировка центра |

### 4.6 Новые DSP эффекты

| Эффект | Описание | Сложность |
|--------|----------|-----------|
| **Bass Boost** | Усиление низких | ⭐⭐ |
| **Treble Enhancement** | Усиление высоких | ⭐⭐ |
| **Vocal Enhancer** | Средние частоты | ⭐⭐⭐ |
| **Dynamic EQ** | EQ зависит от громкости | ⭐⭐⭐⭐ |
| **Room Correction** | Калибровка помещения | ⭐⭐⭐⭐⭐ |

---

## 🔧 5. КАК ДОБАВИТЬ НОВЫЕ ФУНКЦИИ

### Вариант A: Frida runtime hook (без изменения APK)
```javascript
// hook_dsp.js — перехват BLE отправки
Java.perform(function() {
    // Перехват _getPacketCmd — видеть какие пакеты шлются
    // Перехват writeCharacteristic — видеть сырые байты
    
    // Пример: добавить новый пресет EQ
    var EqPlusModel = Java.use('...EqPlusModel...');
    EqPlusModel.getPresetNames.implementation = function() {
        var presets = this.getPresetNames();
        presets.add("My Custom Preset");
        return presets;
    };
});
```

### Вариант B: Smali patch (изменение APK)
1. Декомпилировать: `apktool d PROLOGY-140-5.0.55.apk`
2. Найти нужный метод в smali (по строкам из libapp.so)
3. Модифицировать smali
4. Пересобрать + подписать

### Вариант C: Dart reverse engineering (libapp.so)
```bash
# Извлечь Dart символы из libapp.so
strings lib/arm64-v8a/libapp.so | grep "flutter_app/" > dart_symbols.txt

# Результат показывает структуру:
# flutter_app/pages/view/eq/eq_chart_page.dart
# flutter_app/pages/model/subwoofer_loudness_view_model.dart
# flutter_app/pages/base/eq_type_page.dart
# flutter_app/model/loudness_model.dart
```

### Вариант D: Frida + BLE sniff (лучший для анализа протокола)
```javascript
// sniff_ble.js — перехват всех BLE пакетов
Java.perform(function() {
    var Gatt = Java.use('android.bluetooth.BluetoothGatt');
    
    Gatt.writeCharacteristic.overload('android.bluetooth.BluetoothGattCharacteristic')
        .implementation = function(chr) {
            var value = chr.getValue();
            console.log('[BLE TX] ' + bytesToHex(value));
            return this.writeCharacteristic(chr);
        };
    
    function bytesToHex(bytes) {
        return Array.from(bytes).map(b => b.toString(16).padStart(2,'0')).join(' ');
    }
});
```

---

## 📊 6. СТРУКТУРА ПРИЛОЖЕНИЯ

```
com.prology (Flutter App)
├── pages/
│   ├── view/
│   │   └── eq/
│   │       └── eq_chart_page.dart      # EQ визуализация
│   ├── model/
│   │   └── subwoofer_loudness_view_model.dart
│   └── base/
│       └── eq_type_page.dart           # Тип EQ
├── model/
│   └── loudness_model.dart             # Loudness модель
└── [DSP Sender mixin]                  # DspSender — отправка пакетов

BLE Layer:
├── flutter_blue_plus_android          # Основной BLE
└── flutter_bluetooth_serial           # Serial BT

Audio Layer:
├── audio_service                      # Background audio
├── audio_session                      # Audio session
└── just_audio                         # Audio playback
```

---

## ⚡ 7. РЕКОМЕНДУЕМЫЙ ПОРЯДОК ДЕЙСТВИЙ

### Шаг 1: Sniff BLE протокол
```bash
frida -U -f com.prology -l sniff_ble.js --no-pause
```
→ Узнать формат пакетов DSP

### Шаг 2: Маппинг UI → BLE
→ Нажать EQ slider → записать BLE пакет  
→ Нажать X-Over → записать BLE пакет  
→ Нажать Time Alignment → записать BLE пакет

### Шаг 3: Создать Frida скрипт
→ Добавить новые пресеты EQ  
→ Добавить новые X-Over типы  
→ Добавить Sound Field режимы

### Шаг 4 (опционально): Smali патч
→ Если нужно добавить UI элементы

---

## 🔑 8. КЛЮЧЕВЫЕ СТРОКИ для поиска в smali/Dart

| Строка | Где искать |
|--------|-----------|
| `_getPacketCmd` | Dart (libapp.so) — формирование CMD |
| `_getPacketData` | Dart (libapp.so) — формирование DATA |
| `DspSender` | Dart mixin — отправка DSP |
| `flutter_blue_plus/methods` | MethodChannel BLE |
| `EqListener` | Dart — EQ события |
| `XOverModel` | Dart — X-Over модель |
| `TimeAlignmentModel` | Dart — TA модель |
| `SubwooferVolumeListener` | Dart — Subwoofer события |
| `PresetViewModel` | Dart — пресеты |
| `SoundFieldType` | Dart — Sound Field |
| `eq.preset.names` | Dart — имена пресетов |
| `SW-LPF GAIN` | Dart — Subwoofer LPF |
| `SW-HPF GAIN` | Dart — Subwoofer HPF |
| `CHANNEL_7` | Dart — кол-во каналов |

---

## ✅ ИТОГО

**DSP функции:** 12 реализованных  
**BLE плагины:** 2 (flutter_blue_plus + serial)  
**MethodChannel:** 11 (5 Flutter, 4 Audio, 2 BT)  
**Точек расширения:** 20+  
**Главная преграда:** Dart AOT-код в libapp.so (требуется Frida для анализа)
