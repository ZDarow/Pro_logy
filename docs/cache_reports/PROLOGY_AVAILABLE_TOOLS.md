# 🛠️ PROLOGY — ВСЕ ДОСТУПНЫЕ ИНСТРУМЕНТЫ СБОРА ДАННЫХ

**Дата:** 2026-03-12  
**Устройство:** Redmi Note 9 Pro (Android 15)

---

## ✅ УСТАНОВЛЕННЫЕ ИНСТРУМЕНТЫ

| Инструмент | Версия | Статус | Примечание |
|------------|--------|--------|------------|
| **Frida** | 17.2.14 | ⚠️ Частично | Android 15 Java bridge ошибка |
| **ADB** | 1.0.41 | ✅ Работает | Полная функциональность |
| **Python** | 3.12.12 | ✅ Работает | Все библиотеки |
| **Node.js** | 25.2.1 | ✅ Работает | Для JS скриптов |
| **Git** | 2.52.0 | ✅ Работает | Для клонирования репо |

---

## 🎯 АЛЬТЕРНАТИВНЫЕ МЕТОДЫ СБОРА

### 🔴 МЕТОД 1: ADB Bluetooth HCI Snoop Log (РЕКОМЕНДУЕТСЯ)

**Что даёт:** Полный перехват ВСЕХ Bluetooth пакетов

```bash
# 1. Включить логирование
adb shell setprop persist.bluetooth.btsnooplogmode true

# 2. Выполнить действия в PROLOGY
#    - Изменить громкость
#    - Настроить EQ
#    - Переключить пресет

# 3. Вытащить лог
adb pull /sdcard/btsnoop_hci.log /storage/emulated/0/Documents/

# 4. Анализ в Wireshark
wireshark /storage/emulated/0/Documents/btsnoop_hci.log
```

**Преимущества:**
- ✅ Перехватывает ВСЁ
- ✅ Не требует root
- ✅ Работает на Android 15
- ✅ Показывает тайминги

**Недостатки:**
- ⚠️ Нужен Wireshark для анализа
- ⚠️ Большой размер файла

---

### 🟡 МЕТОД 2: ADB Logcat (РАБОТАЕТ)

**Что даёт:** Логи приложения и Bluetooth

```bash
# Очистить лог
adb logcat -c

# Запустить логирование
adb logcat | grep -E "(bluetooth|Bluetooth|Gatt|prology)" > prology_log.txt &

# Выполнить действия в приложении

# Остановить через 1-2 минуты
# Ctrl+C
```

**Преимущества:**
- ✅ Работает без root
- ✅ Текстовый формат
- ✅ Легко анализировать

**Недостатки:**
- ⚠️ Много шума
- ⚠️ Не все команды видны

---

### 🟡 МЕТОД 3: Frida Native Interceptor (ЭКСПЕРИМЕНТ)

**Что даёт:** Перехват на уровне native кода (без Java)

```javascript
// prology_native.js
Interceptor.attach(Module.findExportByName("libbluetooth.so", "write"), {
    onEnter: function(args) {
        console.log("WRITE: " + Memory.readByteArray(args[1], args[2]));
    }
});
```

**Преимущества:**
- ✅ Обходит Java проблемы
- ✅ Низкий уровень

**Недостатки:**
- ⚠️ Сложно настроить
- ⚠️ Нужно знать имена функций

---

### 🟢 МЕТОД 4: Python BLE Client (ДЛЯ ТЕСТА)

**Что даёт:** Отправка команд и чтение ответов

```python
# prology_test.py
from bleak import BleakClient

ADDRESS = "XX:XX:XX:XX:XX:XX"  # MAC магнитолы
CHAR_UUID = "0000ae02-0000-1000-8000-00805f9b34fb"

async def test():
    async with BleakClient(ADDRESS) as client:
        # Отправить Volume = 5
        await client.write_gatt_char(CHAR_UUID, bytes([0xC0, 0x00, 0x02, 0x05, 0x05, 0x0C]))
        
        # Прочитать ответ
        response = await client.read_gatt_char(CHAR_UUID)
        print(f"Response: {response.hex()}")
```

**Преимущества:**
- ✅ Полный контроль
- ✅ Можно тестировать команды
- ✅ Автоматизация

**Недостатки:**
- ⚠️ Нужен MAC адрес магнитолы
- ⚠️ Нужно подключение к устройству

---

### 🟢 МЕТОД 5: APK Reverse Engineering (СТАТИКА)

**Что даёт:** Анализ кода приложения

```bash
# 1. Извлечь APK
adb pull /data/app/~~*/com.prology-*/base.apk

# 2. Декомпилировать
jadx -d prology_src/ base.apk

# 3. Анализировать
grep -r "0xC0\|0x05\|Volume" prology_src/
```

**Преимущества:**
- ✅ Видно всю логику
- ✅ Можно найти все команды
- ✅ Не нужно устройство

**Недостатки:**
- ⚠️ Dart код в libapp.so
- ⚠️ Нужен dart-decompiler

---

### 🟢 МЕТОД 6: Xposed Module (ТРЕБУЕТ ROOT)

**Что даёт:** Полная инструментация

```java
// Xposed модуль для перехвата
hookMethod(BluetoothGattCharacteristic.class.getMethod("setValue", byte[].class), 
    new XC_MethodHook() {
        @Override
        protected void beforeHookedMethod(MethodHookParam param) {
            byte[] data = (byte[]) param.args[0];
            log("WRITE: " + bytesToHex(data));
        }
    });
```

**Преимущества:**
- ✅ Полный доступ
- ✅ Работает стабильно

**Недостатки:**
- ❌ Требует root
- ❌ Требует Xposed framework

---

## 📊 СРАВНЕНИЕ МЕТОДОВ

| Метод | Сложность | Эффективность | Android 15 | Root |
|-------|-----------|---------------|------------|------|
| **HCI Snoop** | ⭐ | ⭐⭐⭐⭐⭐ | ✅ | ❌ |
| **Logcat** | ⭐ | ⭐⭐⭐ | ✅ | ❌ |
| **Frida Native** | ⭐⭐⭐⭐ | ⭐⭐⭐ | ⚠️ | ❌ |
| **Python BLE** | ⭐⭐ | ⭐⭐⭐⭐ | ✅ | ❌ |
| **APK RE** | ⭐⭐ | ⭐⭐⭐⭐ | ✅ | ❌ |
| **Xposed** | ⭐⭐⭐ | ⭐⭐⭐⭐⭐ | ✅ | ✅ |

---

## 🎯 РЕКОМЕНДАЦИИ

### СЕЙЧАС (без root):

1. **HCI Snoop Log** — лучший вариант
   ```bash
   adb shell setprop persist.bluetooth.btsnooplogmode true
   # Действия в приложении
   adb pull /sdcard/btsnoop_hci.log
   ```

2. **Logcat** — дополнительно
   ```bash
   adb logcat | grep -i bluetooth > bt.log
   ```

3. **APK Reverse Engineering** — для поиска команд
   ```bash
   jadx -d prology/ base.apk
   ```

### ЕСЛИ ЕСТЬ ROOT:

1. **Xposed Module** — полный перехват
2. **Frida System Server** — системный уровень

---

## 📁 УЖЕ СОБРАННЫЕ ДАННЫЕ

```
prology_responses.txt      72 KB  ✅ Volume = 5
prology_live.txt          240 KB  ✅ Логи перехвата
prology_bt_log.txt        143 KB  ✅ Bluetooth логи
prology_dump_commands.txt   3.5 KB ✅ 42 команды
CRC_FINAL_100.md            5.7 KB ✅ CRC документация
prology_crc.py              7.1 KB ✅ Python библиотека
```

**ВСЕГО:** ~470 KB данных

---

## 🚀 СЛЕДУЮЩИЕ ШАГИ

1. **Включить HCI Snoop** → получить все команды
2. **Анализировать в Wireshark** → расшифровать протокол
3. **Создать Python клиент** → тестировать команды
4. **Документировать** → полная спецификация

---

**Выберите метод и я помогу с реализацией!** 🛠️
