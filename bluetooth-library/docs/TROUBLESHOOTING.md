# PROLOGY Bluetooth Troubleshooting Guide

Руководство по решению распространенных проблем.

## Содержание

1. [Проблемы подключения](#проблемы-подключения)
2. [Проблемы с разрешениями](#проблемы-с-разрешениями)
3. [Проблемы передачи данных](#проблемы-передачи-данных)
4. [Проблемы производительности](#проблемы-производительности)
5. [Диагностика](#диагностика)

---

## Проблемы подключения

### Устройство не подключается

**Симптомы:**
- Таймаут подключения
- Ошибка "Connection failed"

**Возможные причины и решения:**

1. **Bluetooth выключен**
   ```java
   if (!bluetoothAdapter.isEnabled()) {
       Intent enableIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
       startActivityForResult(enableIntent, REQUEST_ENABLE_BT);
   }
   ```

2. **Неверный MAC адрес**
   - Проверьте формат: "90:20:71:5E:48:10"
   - Убедитесь, что адрес правильный

3. **Устройство не в диапазоне**
   - Приблизьтесь к устройству (до 10 метров)
   - Уберите препятствия

4. **Устройство уже подключено**
   ```java
   if (manager.isConnected()) {
       manager.disconnect();
   }
   manager.connect(address);
   ```

5. **Требуется сопряжение**
   ```java
   Set<BluetoothDevice> bonded = adapter.getBondedDevices();
   // Проверьте, есть ли устройство в списке
   ```

### Частые отключения

**Симптомы:**
- Устройство отключается через несколько секунд
- Постоянные переподключения

**Решения:**

1. **Увеличьте таймауты**
   ```java
   manager.setConnectTimeout(60000);
   manager.setIoTimeout(30000);
   ```

2. **Включите автопереподключение**
   ```java
   manager.setAutoReconnect(true);
   manager.setMaxReconnectAttempts(5);
   manager.setReconnectDelay(3000);
   ```

3. **Проверьте питание устройства**
   - Убедитесь, что устройство заряжено

### Ошибка "Bluetooth not supported"

**Причина:** На устройстве нет Bluetooth

**Решение:** Проверьте наличие Bluetooth:
```java
if (BluetoothAdapter.getDefaultAdapter() == null) {
    // Bluetooth не поддерживается
}
```

---

## Проблемы с разрешениями

### Android 12+ (API 31+)

**Требуемые разрешения:**
```xml
<uses-permission android:name="android.permission.BLUETOOTH_CONNECT" />
<uses-permission android:name="android.permission.BLUETOOTH_SCAN" />
```

**Runtime запрос:**
```java
if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
    String[] permissions = {
        Manifest.permission.BLUETOOTH_CONNECT,
        Manifest.permission.BLUETOOTH_SCAN
    };
    ActivityCompat.requestPermissions(this, permissions, REQUEST_CODE);
}
```

### Android 6-11 (API 23-30)

**Требуемые разрешения:**
```xml
<uses-permission android:name="android.permission.BLUETOOTH" />
<uses-permission android:name="android.permission.BLUETOOTH_ADMIN" />
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
```

**Runtime запрос:**
```java
String[] permissions = {
    Manifest.permission.ACCESS_FINE_LOCATION,
    Manifest.permission.BLUETOOTH,
    Manifest.permission.BLUETOOTH_ADMIN
};
ActivityCompat.requestPermissions(this, permissions, REQUEST_CODE);
```

### Разрешения не запрашиваются

**Проблема:** Приложение крашится при попытке подключения

**Решение:** Всегда запрашивайте разрешения до использования Bluetooth:
```java
private void checkPermissions() {
    if (ContextCompat.checkSelfPermission(this, 
            Manifest.permission.BLUETOOTH_CONNECT) 
            != PackageManager.PERMISSION_GRANTED) {
        ActivityCompat.requestPermissions(this, 
            new String[]{Manifest.permission.BLUETOOTH_CONNECT}, 
            REQUEST_CODE);
        return;
    }
    // Разрешения есть, можно использовать Bluetooth
}
```

---

## Проблемы передачи данных

### Данные не отправляются

**Симптомы:**
- `send()` возвращает `false`
- Устройство не реагирует

**Проверки:**

1. **Подключено ли устройство**
   ```java
   if (!manager.isConnected()) {
       Log.e("BT", "Not connected!");
       return;
   }
   ```

2. **Пустые ли данные**
   ```java
   if (data == null || data.length == 0) {
       Log.e("BT", "Empty data!");
       return;
   }
   ```

3. **Формат команды**
   ```java
   // Правильно:
   manager.sendCommand("AUTH"); // Отправит "AUTH\r\n"

   // Неправильно:
   manager.sendString("AUTH"); // Отправит "AUTH" без завершения
   ```

### Данные не принимаются

**Симптомы:**
- `onDataReceived()` не вызывается
- Устройство не отвечает

**Проверки:**

1. **Установлен ли callback**
   ```java
   manager.setDataCallback(new BluetoothDataCallback() {
       @Override
       public void onDataReceived(byte[] data) {
           Log.d("BT", "Received: " + Arrays.toString(data));
       }
   });
   ```

2. **Читаемый ли формат данных**
   ```java
   // Логируйте полученные данные
   String hex = BluetoothUtils.bytesToHex(data);
   String ascii = new String(data, StandardCharsets.US_ASCII);
   Log.d("BT", "Hex: " + hex);
   Log.d("BT", "ASCII: " + ascii);
   ```

### Неправильные данные

**Симптомы:**
- Получены некорректные байты
- ASCII не декодируется

**Решения:**

1. **Проверьте кодировку**
   ```java
   String text = new String(data, StandardCharsets.US_ASCII);
   ```

2. **Отфильтруйте нечитаемые символы**
   ```java
   StringBuilder sb = new StringBuilder();
   for (byte b : data) {
       if (b >= 32 && b <= 126) {
           sb.append((char) b);
       } else {
           sb.append('.');
       }
   }
   ```

---

## Проблемы производительности

### Медленное подключение

**Причины:**
- Активное сканирование
- Много устройств в списке

**Решения:**

1. **Отмените discovery перед подключением**
   ```java
   if (bluetoothAdapter.isDiscovering()) {
       bluetoothAdapter.cancelDiscovery();
   }
   ```

2. **Используйте известный MAC адрес**
   ```java
   // Не сканируйте, если знаете адрес
   manager.connect("90:20:71:5E:48:10");
   ```

### Высокое потребление памяти

**Причины:**
- Утечки ресурсов
- Не закрытые сокеты

**Решения:**

1. **Освобождайте ресурсы**
   ```java
   @Override
   protected void onDestroy() {
       super.onDestroy();
       if (manager != null) {
           manager.release();
       }
   }
   ```

2. **Используйте try-with-resources**
   ```java
   try (BluetoothSocket socket = ...) {
       // работа с сокетом
   } catch (IOException e) {
       // обработка
   }
   ```

---

## Диагностика

### Логирование

Включите подробное логирование:

```java
private static final String TAG = "PrologyBT";

// Везде используйте Log.d/tag
Log.d(TAG, "Connecting to " + address);
Log.d(TAG, "Connected!");
Log.d(TAG, "Sending: " + data.length + " bytes");
Log.d(TAG, "Received: " + Arrays.toString(data));
```

### ADB логи

```bash
# Все Bluetooth логи
adb logcat | grep -E "(Bluetooth|BtService|Prology)"

# Только логи приложения
adb logcat --pid=$(adb shell pidof -s com.yourapp)

# Сохранение в файл
adb logcat -b all > bt_log.txt
```

### Проверка состояния Bluetooth

```java
BluetoothAdapter adapter = BluetoothAdapter.getDefaultAdapter();

// Поддерживается ли
boolean supported = adapter != null;

// Включен ли
boolean enabled = adapter != null && adapter.isEnabled();

// Статус
int state = adapter.getState();
// 10 = off, 11 = turning on, 12 = on, 13 = turning off
```

### Проверка сопряжения

```java
Set<BluetoothDevice> bonded = adapter.getBondedDevices();
for (BluetoothDevice device : bonded) {
    Log.d("BT", "Bonded: " + device.getName() + 
          " (" + device.getAddress() + ")");
}
```

### Тестирование подключения

```java
// Быстрый тест
public void testConnection() {
    manager.setConnectTimeout(10000);
    manager.connect("90:20:71:5E:48:10");
    
    // Через 5 секунд проверьте состояние
    new Handler().postDelayed(() -> {
        Log.d("BT", "Is connected: " + manager.isConnected());
    }, 5000);
}
```

---

## Часто задаваемые вопросы

### Q: Как узнать MAC адрес устройства?

**A:** Через настройки Android или сканированием:
```java
adapter.startDiscovery();
// В BroadcastReceiver получите MAC из intent
```

### Q: Можно ли подключиться к нескольким устройствам?

**A:** Да, создайте несколько экземпляров `PrologyBluetoothManager`:
```java
PrologyBluetoothManager manager1 = new PrologyBluetoothManager(context);
PrologyBluetoothManager manager2 = new PrologyBluetoothManager(context);
```

### Q: Как работать в фоновом режиме?

**A:** Используйте Service:
```java
public class BluetoothService extends Service {
    private PrologyBluetoothManager manager;
    
    @Override
    public void onCreate() {
        manager = new PrologyBluetoothManager(this);
    }
}
```

### Q: Почему отключается при выключенном экране?

**A:** Android может убивать фоновые процессы. Используйте Foreground Service:
```java
startForeground(NOTIFICATION_ID, notification);
```

---

## Контакты

Если проблема не решена:
1. Проверьте логи
2. Попробуйте на другом устройстве
3. Создайте issue на GitHub

---

*Troubleshooting Guide v1.0.0 | 2026-03-02*
