# Quick Start Guide

Быстрый старт для интеграции PROLOGY Bluetooth библиотеки.

## 5 минут до первого подключения

### Android (Java/Kotlin)

#### Шаг 1: Добавьте зависимость

**build.gradle (app):**
```gradle
dependencies {
    implementation project(':prology-bluetooth')
}
```

#### Шаг 2: Добавьте разрешения

**AndroidManifest.xml:**
```xml
<uses-permission android:name="android.permission.BLUETOOTH_CONNECT" />
<uses-permission android:name="android.permission.BLUETOOTH_SCAN" />
<uses-permission android:name="android.permission.BLUETOOTH" />
<uses-permission android:name="android.permission.BLUETOOTH_ADMIN" />
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
```

#### Шаг 3: Подключитесь к устройству

**MainActivity.java:**
```java
public class MainActivity extends AppCompatActivity {
    private PrologyBluetoothManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = new PrologyBluetoothManager(this);

        // Настройка callback'ов
        manager.setConnectionCallback(new BluetoothConnectionCallback() {
            @Override
            public void onConnected() {
                Toast.makeText(MainActivity.this, "Подключено!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDisconnected() {
                Toast.makeText(MainActivity.this, "Отключено!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(String error) {
                Toast.makeText(MainActivity.this, "Ошибка: " + error, Toast.LENGTH_SHORT).show();
            }
        });

        manager.setDataCallback(new BluetoothDataCallback() {
            @Override
            public void onDataReceived(byte[] data) {
                Log.d("BT", "Получено: " + new String(data));
            }
        });

        // Подключение
        manager.connect("90:20:71:5E:48:10");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (manager != null) {
            manager.release();
        }
    }
}
```

#### Шаг 4: Отправьте команду

```java
// После подключения
manager.sendCommand("AUTH");
manager.sendCommand("GET_STATUS");
```

---

### Flutter (Dart)

#### Шаг 1: Добавьте зависимость

**pubspec.yaml:**
```yaml
dependencies:
  prology_bluetooth:
    path: ../prology-bluetooth-library/flutter
```

#### Шаг 2: Установите зависимости

```bash
flutter pub get
```

#### Шаг 3: Добавьте разрешения

**android/app/src/main/AndroidManifest.xml:**
```xml
<uses-permission android:name="android.permission.BLUETOOTH_CONNECT"/>
<uses-permission android:name="android.permission.BLUETOOTH_SCAN"/>
<uses-permission android:name="android.permission.BLUETOOTH"/>
<uses-permission android:name="android.permission.BLUETOOTH_ADMIN"/>
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"/>
```

#### Шаг 4: Подключитесь к устройству

**lib/main.dart:**
```dart
import 'package:flutter/material.dart';
import 'package:prology_bluetooth/prology_bluetooth.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: BluetoothPage(),
    );
  }
}

class BluetoothPage extends StatefulWidget {
  @override
  _BluetoothPageState createState() => _BluetoothPageState();
}

class _BluetoothPageState extends State<BluetoothPage> {
  final PrologyBluetooth _bluetooth = PrologyBluetooth();
  String _status = 'Отключено';

  @override
  void initState() {
    super.initState();

    _bluetooth.connectionState.listen((state) {
      setState(() {
        _status = state.description;
      });
    });

    _bluetooth.incomingData.listen((data) {
      print('Получено: $data');
    });

    // Подключение
    _bluetooth.connect('90:20:71:5E:48:10');
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('Prology Bluetooth')),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Text('Статус: $_status', style: TextStyle(fontSize: 20)),
            SizedBox(height: 20),
            ElevatedButton(
              onPressed: () => _bluetooth.sendCommand('AUTH'),
              child: Text('Отправить AUTH'),
            ),
          ],
        ),
      ),
    );
  }

  @override
  void dispose() {
    _bluetooth.dispose();
    super.dispose();
  }
}
```

#### Шаг 5: Отправьте команду

```dart
await _bluetooth.sendCommand('AUTH');
await _bluetooth.sendCommand('GET_STATUS');
```

---

## Готово!

Теперь вы можете:
- ✅ Подключаться к PROLOGY устройству
- ✅ Отправлять команды
- ✅ Получать ответы
- ✅ Обрабатывать ошибки

---

## Следующие шаги

1. **Изучите примеры:**
   - Android: `android/examples/MainActivity.java`
   - Flutter: `flutter/example/lib/main.dart`

2. **Прочитайте документацию:**
   - [API Reference](./docs/API_REFERENCE.md)
   - [Protocol Specification](./docs/PROTOCOL_SPECIFICATION.md)
   - [Troubleshooting](./docs/TROUBLESHOOTING.md)

3. **Настройте под свой проект:**
   - Измените таймауты
   - Включите автопереподключение
   - Добавьте обработку специфичных команд

---

## Часто задаваемые вопросы

### Q: Как запросить разрешения на Android 12+?

```java
if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
    ActivityCompat.requestPermissions(this,
        new String[]{
            Manifest.permission.BLUETOOTH_CONNECT,
            Manifest.permission.BLUETOOTH_SCAN
        },
        REQUEST_CODE);
}
```

### Q: Как включить автопереподключение?

**Android:**
```java
manager.setAutoReconnect(true);
manager.setMaxReconnectAttempts(5);
```

**Flutter:**
```dart
_bluetooth.autoReconnect = true;
_bluetooth.maxReconnectAttempts = 5;
```

### Q: Как отправить бинарные данные?

**Android:**
```java
byte[] data = {0x01, 0x02, 0x03, 0x04};
manager.send(data);
```

**Flutter:**
```dart
await _bluetooth.send(Uint8List.fromList([0x01, 0x02, 0x03, 0x04]));
```

---

*Quick Start Guide v1.0.0 | 2026-03-02*
