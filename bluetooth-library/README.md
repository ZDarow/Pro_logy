# PROLOGY Bluetooth Library

Полноценная библиотека для интеграции PROLOGY Bluetooth устройств в Android и Flutter проекты.

## 📋 Содержание

- [Обзор](#обзор)
- [Установка](#установка)
- [Быстрый старт](#быстрый-старт)
- [Android API](#android-api)
- [Flutter API](#flutter-api)
- [Протокол](#протокол)
- [Troubleshooting](#troubleshooting)
- [Примеры](#примеры)

---

## 📖 Обзор

Библиотека предоставляет готовые классы для работы с PROLOGY устройствами через:

- **Classic Bluetooth (SPP)** - RFCOMM сокет для передачи данных
- **BLE (Bluetooth Low Energy)** - GATT профиль для энергоэффективного подключения

### Ключевые возможности

- ✅ Подключение/отключение
- ✅ Отправка и получение данных
- ✅ Callback интерфейсы для событий
- ✅ Обработка ошибок и таймауты
- ✅ Автоматическое переподключение
- ✅ Потокобезопасность
- ✅ Поддержка Android 5.0+

### Технические характеристики

| Параметр | Значение |
|----------|----------|
| MAC адрес устройства | `90:20:71:5E:48:10` |
| SPP UUID | `00001101-0000-1000-8000-00805F9B34FB` |
| Протокол | Байтовые массивы через RFCOMM |
| Мин. версия Android | API 21 (Android 5.0) |
| Flutter версия | 3.10+ |

---

## 📦 Установка

### Android

1. Добавьте зависимость в `build.gradle`:

```gradle
dependencies {
    implementation 'com.prology:bluetooth:1.0.0'
}
```

2. Или подключите как модуль:

```gradle
dependencies {
    implementation project(':prology-bluetooth')
}
```

3. Добавьте разрешения в `AndroidManifest.xml`:

```xml
<!-- Android 12+ -->
<uses-permission android:name="android.permission.BLUETOOTH_CONNECT" />
<uses-permission android:name="android.permission.BLUETOOTH_SCAN" />

<!-- Android 6-11 -->
<uses-permission android:name="android.permission.BLUETOOTH" />
<uses-permission android:name="android.permission.BLUETOOTH_ADMIN" />
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
```

### Flutter

1. Добавьте зависимость в `pubspec.yaml`:

```yaml
dependencies:
  prology_bluetooth:
    git:
      url: https://github.com/your-org/prology-bluetooth-library.git
      path: flutter
```

2. Установите зависимости:

```bash
flutter pub get
```

3. Настройте разрешения в `AndroidManifest.xml`:

```xml
<uses-permission android:name="android.permission.BLUETOOTH_CONNECT"/>
<uses-permission android:name="android.permission.BLUETOOTH_SCAN"/>
<uses-permission android:name="android.permission.BLUETOOTH"/>
<uses-permission android:name="android.permission.BLUETOOTH_ADMIN"/>
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"/>
```

---

## 🚀 Быстрый старт

### Android (Java)

```java
// Создание менеджера
PrologyBluetoothManager manager = new PrologyBluetoothManager(context);

// Настройка callback'ов
manager.setConnectionCallback(new BluetoothConnectionCallback() {
    @Override
    public void onConnected() {
        Log.d("BT", "Подключено!");
    }

    @Override
    public void onDisconnected() {
        Log.d("BT", "Отключено!");
    }

    @Override
    public void onError(String error) {
        Log.e("BT", "Ошибка: " + error);
    }
});

manager.setDataCallback(new BluetoothDataCallback() {
    @Override
    public void onDataReceived(byte[] data) {
        Log.d("BT", "Получено: " + Arrays.toString(data));
    }
});

// Подключение
manager.connect("90:20:71:5E:48:10");

// Отправка команды
manager.sendString("AUTH\r\n");

// Отключение
manager.disconnect();
```

### Flutter (Dart)

```dart
import 'package:prology_bluetooth/prology_bluetooth.dart';

// Создание экземпляра
final prology = PrologyBluetooth();

// Подписка на события
prology.connectionState.listen((state) {
  print('Состояние: $state');
});

prology.incomingData.listen((data) {
  print('Получено: $data');
});

// Подключение
await prology.connect('90:20:71:5E:48:10');

// Отправка команды
await prology.sendCommand('AUTH');

// Отключение
await prology.disconnect();
```

---

## 🤖 Android API

### PrologyBluetoothManager

Основной класс для управления Bluetooth подключением.

#### Конструктор

```java
public PrologyBluetoothManager(Context context)
```

#### Методы подключения

| Метод | Описание |
|-------|----------|
| `connect(String address)` | Подключение к устройству по MAC адресу |
| `disconnect()` | Отключение от устройства |
| `isConnected()` | Проверка состояния подключения |
| `isConnecting()` | Проверка процесса подключения |

#### Методы передачи данных

| Метод | Описание |
|-------|----------|
| `send(byte[] data)` | Отправка байтового массива |
| `sendString(String text)` | Отправка строки (ASCII) |
| `sendCommand(String command)` | Отправка команды с CR/LF |

#### Настройки

| Метод | Описание |
|-------|----------|
| `setConnectTimeout(int ms)` | Таймаут подключения |
| `setIoTimeout(int ms)` | Таймаут операций ввода/вывода |
| `setAutoReconnect(boolean)` | Включить автопереподключение |
| `setReconnectDelay(int ms)` | Задержка перед переподключением |
| `setMaxReconnectAttempts(int)` | Макс. количество попыток |

#### Callback интерфейсы

```java
// Callback подключения
manager.setConnectionCallback(new BluetoothConnectionCallback() {
    void onConnected();
    void onDisconnected();
    void onError(String error);
});

// Callback данных
manager.setDataCallback(new BluetoothDataCallback() {
    void onDataReceived(byte[] data);
});

// Callback состояния
manager.setStateCallback(new BluetoothStateCallback() {
    void onStateChanged(ConnectionState state);
    void onError(String error);
});
```

### BluetoothUtils

Утилиты для работы с Bluetooth.

```java
// Проверка MAC адреса
boolean valid = BluetoothUtils.isValidMacAddress("90:20:71:5E:48:10");

// Нормализация MAC адреса
String normalized = BluetoothUtils.normalizeMacAddress("90-20-71-5E-48-10");

// Преобразование в HEX
String hex = BluetoothUtils.bytesToHex(new byte[]{0x01, 0x02, 0x03});

// Преобразование из HEX
byte[] data = BluetoothUtils.hexToBytes("01 02 03");
```

---

## 🎯 Flutter API

### PrologyBluetooth

Основной класс для Flutter.

#### Свойства

| Свойство | Тип | Описание |
|----------|-----|----------|
| `connectionState` | `Stream<BluetoothState>` | Поток состояния |
| `incomingData` | `Stream<Uint8List>` | Поток входящих данных |
| `errorStream` | `Stream<String>` | Поток ошибок |
| `state` | `BluetoothState` | Текущее состояние |
| `isConnected` | `bool` | Подключено ли |
| `connectedDevice` | `BluetoothDeviceInfo?` | Информация об устройстве |

#### Методы

```dart
// Подключение
Future<void> connect(String address, {Duration? timeout, bool? useSpp});

// Отключение
Future<void> disconnect();

// Отправка данных
Future<bool> send(Uint8List data, {Duration? timeout});
Future<bool> sendString(String text, {Duration? timeout});
Future<bool> sendCommand(String command, {Duration? timeout});
```

#### Callback'и

```dart
prology.connectionCallback = SimpleConnectionCallback(
  onConnectedCallback: () => print('Connected'),
  onDisconnectedCallback: () => print('Disconnected'),
  onErrorCallback: (error) => print('Error: $error'),
);

prology.dataCallback = SimpleDataCallback(
  onDataReceivedCallback: (data) => print('Received: $data'),
);
```

### PrologyBluetoothSpp

Класс для работы только с Classic Bluetooth (SPP).

```dart
final spp = PrologyBluetoothSpp();

await spp.connect('90:20:71:5E:48:10');
await spp.send(Uint8List.fromList([0x01, 0x02]));
await spp.disconnect();
```

### PrologyBluetoothBle

Класс для работы только с BLE.

```dart
final ble = PrologyBluetoothBle();

await ble.connect('90:20:71:5E:48:10');

// Запись в характеристику
await ble.writeCharacteristic(
  serviceUuid: '00001801-0000-1000-8000-00805F9B34FB',
  characteristicUuid: '00002A05-0000-1000-8000-00805F9B34FB',
  value: Uint8List.fromList([0x01, 0x02]),
);

// Подписка на уведомления
await ble.subscribeCharacteristic(
  serviceUuid: '...',
  characteristicUuid: '...',
);
```

---

## 📡 Протокол

### Формат команд

Команды передаются как ASCII строки с завершающими символами CR/LF:

```
COMMAND\r\n
```

### Стандартные команды

| Команда | Описание | Ответ |
|---------|----------|-------|
| `AUTH` | Авторизация | `OK` / `ERROR` |
| `GET_STATUS` | Получить статус | Статус устройства |
| `GET_EQ` | Получить настройки EQ | Параметры эквалайзера |
| `SET_EQ=...` | Установить настройки EQ | `OK` / `ERROR` |

### Пример обмена

```
Client: AUTH\r\n
Device: OK\r\n

Client: GET_STATUS\r\n
Device: STATUS:ONLINE,BT:CONNECTED\r\n

Client: GET_EQ\r\n
Device: EQ:50,60,70,80,90\r\n
```

### Бинарный протокол

Для некоторых команд используется бинарный формат:

```
[HEADER][LENGTH][COMMAND][DATA][CHECKSUM]
```

---

## 🐛 Troubleshooting

### Android

#### Bluetooth не включается

```java
if (!bluetoothAdapter.isEnabled()) {
    Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
    startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
}
```

#### Ошибка подключения

Проверьте:
1. Разрешения предоставлены
2. Bluetooth включен
3. Устройство сопряжено
4. MAC адрес верный

#### Таймаут подключения

Увеличьте таймаут:
```java
manager.setConnectTimeout(60000); // 60 секунд
```

### Flutter

#### Ошибка импорта

Убедитесь, что зависимости установлены:
```bash
flutter pub get
```

#### Разрешения не работают

Проверьте `AndroidManifest.xml` и запросите runtime permissions для Android 6+.

#### Подключение не устанавливается

1. Проверьте MAC адрес
2. Убедитесь, что устройство доступно
3. Попробуйте использовать SPP вместо BLE

---

## 📝 Примеры

### Android: Полное приложение

См. `/android/examples/MainActivity.java`

### Flutter: Полное приложение

См. `/flutter/example/lib/main.dart`

### Android: Фоновая служба

```java
public class BluetoothService extends Service {
    private PrologyBluetoothManager manager;

    @Override
    public void onCreate() {
        manager = new PrologyBluetoothManager(this);
        manager.setAutoReconnect(true);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        manager.connect("90:20:71:5E:48:10");
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        manager.release();
    }
}
```

### Flutter: Widget с интеграцией

```dart
class BluetoothWidget extends StatefulWidget {
  @override
  State<BluetoothWidget> createState() => _BluetoothWidgetState();
}

class _BluetoothWidgetState extends State<BluetoothWidget> {
  final _bluetooth = PrologyBluetooth();

  @override
  Widget build(BuildContext context) {
    return StreamBuilder<BluetoothState>(
      stream: _bluetooth.connectionState,
      builder: (context, snapshot) {
        final state = snapshot.data ?? BluetoothState.disconnected;
        return Text('State: ${state.description}');
      },
    );
  }
}
```

---

## 📄 Лицензия

MIT License

---

## 🔗 Ссылки

- [GitHub Repository](https://github.com/your-org/prology-bluetooth-library)
- [Issue Tracker](https://github.com/your-org/prology-bluetooth-library/issues)
- [Flutter Bluetooth Serial](https://pub.dev/packages/flutter_bluetooth_serial)
- [Flutter Blue Plus](https://pub.dev/packages/flutter_blue_plus)
- [Android Bluetooth API](https://developer.android.com/guide/topics/connectivity/bluetooth)

---

*Версия: 1.0.0 | Дата: 2026-03-02*
