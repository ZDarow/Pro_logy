# ГЛУБОКИЙ АНАЛИЗ APK: PROLOGY-140-5.0.55

## ОБЩАЯ ИНФОРМАЦИЯ
- **Пакет**: com.prology
- **Размер APK**: 50 МБ
- **Декомпилировано**: 2543 Java-файла (74 МБ)
- **Фреймворк**: Flutter (Dart) + нативные Android-компоненты
- **Нативные библиотеки**: libapp.so (8.5МБ - Dart-код), libflutter.so (11МБ)

## РАЗРЕШЕНИЯ (Permissions)
**Bluetooth** (основные):
- BLUETOOTH, BLUETOOTH_ADMIN, BLUETOOTH_SCAN, BLUETOOTH_ADVERTISE, BLUETOOTH_CONNECT
**Локация** (для BLE-сканирования):
- ACCESS_COARSE_LOCATION, ACCESS_FINE_LOCATION, NEARBY_WIFI_DEVICES
**Аудио и система**:
- MODIFY_AUDIO_SETTINGS, FOREGROUND_SERVICE, SYSTEM_ALERT_WINDOW
**Хранение**:
- READ/WRITE_EXTERNAL_STORAGE, READ_MEDIA_AUDIO

## АРХИТЕКТУРА И ЛОГИКА
**Основные компоненты**:
1. **Bluetooth SPP Service** - связь с автомагнитолой через Serial Port Profile
2. **Audio Service** (com.ryanheise.audioservice) - управление аудио
3. **Location Service** (geolocator) - получение геопозиции
4. **Flutter UI** - интерфейс на Dart

**Протокол обмена**:
- Файлы: `protocol_helper.dart`, `bluetooth_chat_manager.dart`
- Формат: Bluetooth SPP (последовательный порт)
- Слушатели: treble_bass, subwoofer, preset, source

## КЛЮЧЕВЫЕ ФАЙЛЫ (обфусцированы)
- `X2/` - пакет работы с Bluetooth (FlutterBluePlugin)
- `u2/C0584a.java` - обработка команд устройства
- `n2/` - работа с SharedPreferences (хранение настроек)
- `libapp.so` - основная логика на Dart

## ХРАНИЛИЩЕ ДАННЫХ
- **SharedPreferences** (n2/k.java, n2/l.java и др.)
- Настройки эквалайзера, пресеты, состояние Bluetooth

## БЕЗОПАСНОСТЬ
✅ **ВНИМАНИЕ**: Обфускация кода (a, b, A0, X2...), но признаков вредоносности не найдено
✅ Секреты/ключи в коде не обнаружены
✅ Google Play Services используются легитимно
⚠️ Высокие привилегии: SYSTEM_ALERT_WINDOW, доступ к хранилищу

## ФУНКЦИОНАЛЬНОСТЬ
1. Подключение к автомагнитолам PROLOGY через Bluetooth
2. Управление эквалайзером (Treble/Bass/Subwoofer)
3. Переключение источников звука (Source)
4. Управление аудио (play/pause/next/prev)
5. Сохранение пресетов настроек
6. Получение информации об устройстве (Device Info)

## ВЫВОД
Приложение **легитимное**, предназначено для управления автомобильными мультимедийными системами PROLOGY. Использует стандартные Flutter-библиотеки. Код обфусцирован штатными средствами защиты Dart/Flutter.

**Риск**: 0/10 (приложение безопасно)
**Сложность реверса**: Высокая (сильная обфускация + Dart-код в libapp.so)
