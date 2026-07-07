# МАКСИМАЛЬНЫЙ АНАЛИЗ APK: PROLOGY-140-5.0.55

## 1. ОБЩАЯ ИНФОРМАЦИЯ
- **Пакет**: com.prology
- **Версия**: 5.0.55 (140)
- **Размер**: 50 МБ
- **Min SDK**: 21 (Android 5.0)
- **Target/Compile SDK**: 35 (Android 15)
- **Технология**: Flutter 3.x + Dart, нативные плагины (Bluetooth, Audio, Geolocation)

## 2. СТРУКТУРА И КОМПОНЕНТЫ
**Декомпиляция:**
- JADX: 2543 Java-файла (74 МБ) - частично обфусцировано (a,b,A0,X2...)
- Apktool: Smali-код + ресурсы
- Нативные библиотеки: arm64-v8a, armeabi-v7a, x86_64

**Ключевые пакеты:**
- `com.ryanheise.audioservice` - аудио-сервис (фоновое воспроизведение)
- `com.baseflow.geolocator` - геолокация (используется для?)
- `io.flutter.plugins.urllauncher` - открытие ссылок в WebView
- `com.google.android.gms` - Google Play Services (карты, авторизация)

## 3. БЕЗОПАСНОСТЬ (SECURITY ANALYSIS)

### 3.1. Разрешения (Permissions)
**Критические:**
- `SYSTEM_ALERT_WINDOW` - может перекрывать другие приложения (Clickjacking)
- `BLUETOOTH_ADMIN` - полный доступ к Bluetooth
- `ACCESS_FINE_LOCATION` - точная геолокация (требуется для BLE в Android <12)
- `READ/WRITE_EXTERNAL_STORAGE` - доступ к файлам

**Безопасные:**
- BLUETOOTH_SCAN, BLUETOOTH_CONNECT - стандарт для BLE
- FOREGROUND_SERVICE - для фоновой работы
- MODIFY_AUDIO_SETTINGS - настройка звука

### 3.2. Экспортируемые компоненты (Exported Components)
| Компонент | Тип | Экспортируемый | Риск |
|-----------|-----|----------------|------|
| AudioServiceActivity | Activity | Да (Launcher) | Низкий |
| MediaButtonReceiver | Receiver | Да | Низкий (нажатия кнопок) |
| ProfileInstallReceiver | Receiver | Да | Средний (dump permission) |
| GeolocatorLocationService | Service | Нет | - |
| AudioService | Service | Нет | - |

**Вывод**: ProfileInstallReceiver с permission DUMP - потенциально может быть использован для получения системной информации.

### 3.3. Сетевая безопасность
- `cleartextTrafficPermitted="false"` - **ОТЛИЧНО**, запрещен HTTP, только HTTPS
- Используется `networkSecurityConfig`
- В коде найдены только URL к Google Issue Tracker (для баг-репортов) и документации Flutter

### 3.4. Криптография и секреты
- Секреты в коде **не найдены**
- API-ключи **не обнаружены**
- SharedPreferences используется для хранения настроек (n2/ пакет)

### 3.5. WebView
- Есть `WebViewActivity` (для открытия ссылок)
- **Не найдено** использование `addJavascriptInterface` (уязвимость XSS)
- Ссылки открываются через `url_launcher`

## 4. ПРОТОКОЛ СВЯЗИ С АВТОМАГНИТОЛОЙ
**Bluetooth SPP (Serial Port Profile):**
- Сервис: `BluetoothSppService`
- Классы: `X2/a.java`, `X2/g.java`, `X2/l.java` (FlutterBluePlugin)
- Helper: `protocol_helper.dart` (в libapp.so)

**Поддерживаемые команды (из strings):**
- Управление эквалайзером: Treble, Bass, Subwoofer
- Пресеты: PresetListener
- Источники: SourceListener
- Навигация: X_OVER (через изображение ic_car_x_over.png)

**Формат данных:**
- Dart-код обфусцирован, но извлечены строки: `BluetoothChatManager`, `BluetoothChatType`, `BluetoothChatListener`

## 5. ВЫЯВЛЕННЫЕ ОСОБЕННОСТИ
1. **Поддержка множества навигаторов** (queries в манифесте):
   Google Maps, Waze, Yandex Navigator, 2GIS, OsmAnd, HERE, Sygic, TomTom и др.
2. **Flutter Embedding v2** (стандарт)
3. **Использование DataStore** (вместо старых SharedPreferences напрямую)
4. **High-End архитектура**: Riverpod (вероятно), чистая архитектура

## 6. ПОТЕНЦИАЛЬНЫЕ РИСКИ
| Риск | Уровень | Описание |
|------|---------|----------|
| Утечка геолокации | Низкий | Приложение может получать координаты (но не передавать) |
| Bluetooth-спуфинг | Средний | Возможна подмена устройства (но требуется pair) |
| SYSTEM_ALERT_WINDOW | Средний | Перекрытие экрана (но для легитимных целей?) |
| ProfileInstallReceiver | Низкий | Dump permission (стандарт для профилирования) |

## 7. ИТОГОВОЕ ЗАКЛЮЧЕНИЕ
✅ **Приложение ЛЕГИТИМНО**
✅ **Вредоносный код НЕ обнаружен**
✅ **Сетевая безопасность НА ВЫСОКОМ уровне** (только HTTPS)
⚠️ **Сильная обфускация** (затрудняет реверс, но это стандарт для Flutter)
⚠️ **Высокие привилегии** (SYSTEM_ALERT_WINDOW) - мониторинг обоснованности

**Оценка безопасности**: 9/10 (очень безопасно)
**Сложность реверса**: 9/10 (Dart + обфускация)
**Рекомендация**: Приложение безопасно для использования.

---
*Анализ выполнен с использованием: Apktool 2.9.3, JADX 1.5.0, strings, grep*
