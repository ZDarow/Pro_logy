# PROLOGY Bluetooth API Documentation

Полная документация API библиотеки.

## Содержание

1. [Android API Reference](#android-api-reference)
2. [Flutter API Reference](#flutter-api-reference)
3. [Protocol Specification](#protocol-specification)

---

## Android API Reference

### Класс: PrologyBluetoothManager

**Пакет:** `com.prology.bluetooth`

#### Константы

```java
public static final UUID SPP_UUID
// SPP UUID: 00001101-0000-1000-8000-00805F9B34FB

public static final int DEFAULT_CONNECT_TIMEOUT
// Таймаут подключения: 30000 мс

public static final int DEFAULT_IO_TIMEOUT
// Таймаут операций: 10000 мс
```

#### Конструктор

```java
public PrologyBluetoothManager(Context context)
```

**Параметры:**
- `context` - контекст приложения (будет использован ApplicationContext)

**Исключения:**
- `IllegalStateException` - если Bluetooth не поддерживается на устройстве

#### Методы подключения

##### connect()

```java
public void connect(String address)
```

Подключается к PROLOGY устройству по MAC адресу.

**Параметры:**
- `address` - MAC адрес в формате "XX:XX:XX:XX:XX:XX"

**Исключения:**
- `IllegalArgumentException` - неверный формат MAC адреса
- `IllegalStateException` - Bluetooth выключен

**Пример:**
```java
manager.connect("90:20:71:5E:48:10");
```

##### disconnect()

```java
public void disconnect()
```

Отключается от устройства и освобождает ресурсы.

##### isConnected()

```java
public boolean isConnected()
```

**Возвращает:** `true` если устройство подключено

##### isConnecting()

```java
public boolean isConnecting()
```

**Возвращает:** `true` если идет процесс подключения

#### Методы передачи данных

##### send()

```java
public boolean send(byte[] data)
```

Отправляет байтовый массив устройству.

**Параметры:**
- `data` - данные для отправки

**Возвращает:** `true` если данные поставлены в очередь на отправку

**Пример:**
```java
byte[] cmd = {0x41, 0x55, 0x54, 0x48, 0x0D, 0x0A}; // "AUTH\r\n"
manager.send(cmd);
```

##### sendString()

```java
public boolean sendString(String text)
```

Отправляет строку в кодировке ASCII.

**Параметры:**
- `text` - строка для отправки

**Возвращает:** `true` если успешно

##### sendCommand()

```java
public boolean sendCommand(String command)
```

Отправляет команду с автоматическим добавлением CR/LF.

**Параметры:**
- `command` - текст команды (без завершающих символов)

**Возвращает:** `true` если успешно

**Пример:**
```java
manager.sendCommand("AUTH"); // Отправит "AUTH\r\n"
```

#### Настройка таймаутов

##### setConnectTimeout()

```java
public void setConnectTimeout(int timeout)
```

**Параметры:**
- `timeout` - таймаут в миллисекундах (минимум 5000)

##### setIoTimeout()

```java
public void setIoTimeout(int timeout)
```

**Параметры:**
- `timeout` - таймаут в миллисекундах (минимум 1000)

#### Настройка автопереподключения

##### setAutoReconnect()

```java
public void setAutoReconnect(boolean enabled)
```

**Параметры:**
- `enabled` - включить/отключить автопереподключение

##### setReconnectDelay()

```java
public void setReconnectDelay(int delay)
```

**Параметры:**
- `delay` - задержка в миллисекундах (минимум 1000)

##### setMaxReconnectAttempts()

```java
public void setMaxReconnectAttempts(int attempts)
```

**Параметры:**
- `attempts` - количество попыток (минимум 1)

#### Callback интерфейсы

##### setConnectionCallback()

```java
public void setConnectionCallback(BluetoothConnectionCallback callback)
```

##### setDataCallback()

```java
public void setDataCallback(BluetoothDataCallback callback)
```

##### setStateCallback()

```java
public void setStateCallback(BluetoothStateCallback callback)
```

#### Очистка ресурсов

##### release()

```java
public void release()
```

Освобождает все ресурсы и останавливает фоновые потоки.

Вызывайте в `onDestroy()` Activity/Service.

---

### Интерфейс: BluetoothConnectionCallback

**Пакет:** `com.prology.bluetooth.callbacks`

```java
public interface BluetoothConnectionCallback {
    void onConnected();
    void onDisconnected();
    void onError(String error);
}
```

#### Методы

##### onConnected()

Вызывается при успешном подключении к устройству.

##### onDisconnected()

Вызывается при отключении от устройства.

##### onError()

```java
void onError(String error)
```

Вызывается при ошибке подключения или передачи данных.

**Параметры:**
- `error` - описание ошибки

---

### Интерфейс: BluetoothDataCallback

**Пакет:** `com.prology.bluetooth.callbacks`

```java
public interface BluetoothDataCallback {
    void onDataReceived(byte[] data);
}
```

#### Методы

##### onDataReceived()

```java
void onDataReceived(byte[] data)
```

Вызывается при получении данных от устройства.

**Параметры:**
- `data` - полученные байты

---

### Интерфейс: BluetoothStateCallback

**Пакет:** `com.prology.bluetooth.callbacks`

```java
public interface BluetoothStateCallback {
    void onStateChanged(ConnectionState state);
    void onError(String error);
}
```

#### Перечисление: ConnectionState

```java
public enum ConnectionState {
    DISCONNECTED,      // Отключено
    CONNECTING,        // Подключение
    CONNECTED,         // Подключено
    DISCONNECTING      // Отключение
}
```

---

### Класс: BluetoothUtils

**Пакет:** `com.prology.bluetooth.utils`

#### Методы

##### isValidMacAddress()

```java
public static boolean isValidMacAddress(String address)
```

Проверяет корректность MAC адреса.

**Возвращает:** `true` если формат верный

##### normalizeMacAddress()

```java
public static String normalizeMacAddress(String address)
```

Нормализует MAC адрес к формату XX:XX:XX:XX:XX:XX.

##### bytesToHex()

```java
public static String bytesToHex(byte[] data)
```

Преобразует байты в HEX строку.

**Пример:**
```java
String hex = BluetoothUtils.bytesToHex(new byte[]{0x01, 0x02, 0x03});
// "01 02 03"
```

##### hexToBytes()

```java
public static byte[] hexToBytes(String hex)
```

Преобразует HEX строку в байты.

**Пример:**
```java
byte[] data = BluetoothUtils.hexToBytes("01 02 03");
// {0x01, 0x02, 0x03}
```

##### isBluetoothEnabled()

```java
public static boolean isBluetoothEnabled(BluetoothAdapter adapter)
```

##### isBluetoothSupported()

```java
public static boolean isBluetoothSupported()
```

##### getBondedDevices()

```java
public static Set<BluetoothDevice> getBondedDevices(BluetoothAdapter adapter)
```

---

## Flutter API Reference

### Класс: PrologyBluetooth

**Пакет:** `prology_bluetooth`

#### Константы

```dart
static const String sppUuid = '00001101-0000-1000-8000-00805F9B34FB';
static const Duration defaultConnectTimeout = Duration(seconds: 30);
static const Duration defaultIoTimeout = Duration(seconds: 10);
```

#### Свойства

```dart
Stream<BluetoothState> get connectionState;
Stream<Uint8List> get incomingData;
Stream<String> get errorStream;
BluetoothState get state;
BluetoothDeviceInfo? get connectedDevice;
bool get isConnected;
bool get isConnecting;
```

#### Методы

##### connect()

```dart
Future<void> connect(
  String address, {
  Duration? timeout,
  bool? useSpp,
})
```

**Параметры:**
- `address` - MAC адрес устройства
- `timeout` - таймаут подключения (опционально)
- `useSpp` - использовать SPP (по умолчанию true)

##### disconnect()

```dart
Future<void> disconnect()
```

##### send()

```dart
Future<bool> send(
  Uint8List data, {
  Duration? timeout,
})
```

##### sendString()

```dart
Future<bool> sendString(
  String text, {
  Duration? timeout,
})
```

##### sendCommand()

```dart
Future<bool> sendCommand(
  String command, {
  Duration? timeout,
})
```

#### Callback'и

```dart
set connectionCallback(ConnectionCallback? callback);
set dataCallback(DataCallback? callback);
set autoReconnect(bool value);
set maxReconnectAttempts(int value);
set reconnectDelay(Duration value);
```

---

### Класс: PrologyBluetoothSpp

Класс для работы только с Classic Bluetooth.

#### Методы

```dart
Future<void> connect(String address);
Future<void> disconnect();
Future<bool> send(Uint8List data);
Future<bool> sendString(String text);
Future<bool> sendCommand(String command);
```

#### Свойства

```dart
Stream<BluetoothSppState> get connectionState;
Stream<Uint8List> get incomingData;
Stream<String> get errorStream;
BluetoothSppState get state;
String? get deviceAddress;
bool get isConnected;
```

---

### Класс: PrologyBluetoothBle

Класс для работы только с BLE.

#### Методы

```dart
Future<void> startScan();
Future<void> stopScan();
Future<void> connect(String address);
Future<void> disconnect();
Future<List<BleService>> discoverServices();
Future<Uint8List> readCharacteristic({...});
Future<bool> writeCharacteristic({...});
Future<bool> subscribeCharacteristic({...});
Future<bool> unsubscribeCharacteristic({...});
```

---

## Protocol Specification

### SPP UUID

```
00001101-0000-1000-8000-00805F9B34FB
```

### MAC адрес устройства

```
90:20:71:5E:48:10
```

### Формат команд

ASCII строки с завершением CR/LF (`\r\n`):

```
<COMMAND>\r\n
```

### Коды ответов

| Код | Описание |
|-----|----------|
| `OK` | Команда выполнена успешно |
| `ERROR` | Ошибка выполнения |
| `READY` | Устройство готово |
| `BUSY` | Устройство занято |

### Примеры команд

#### Авторизация

```
Отправка: AUTH\r\n
Ответ: OK\r\n
```

#### Получение статуса

```
Отправка: GET_STATUS\r\n
Ответ: STATUS:ONLINE,BT:CONNECTED\r\n
```

#### Настройки EQ

```
Отправка: GET_EQ\r\n
Ответ: EQ:50,60,70,80,90\r\n

Отправка: SET_EQ=60,70,80,90,100\r\n
Ответ: OK\r\n
```

---

*API Documentation v1.0.0 | 2026-03-02*
