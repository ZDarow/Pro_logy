# 🔵 PROLOGY Bluetooth Analysis Guide

## 📋 Быстрый старт

### 1. Установка Frida

```bash
# На Termux
pkg install python
pip install frida-tools

# Проверка
frida --version
```

### 2. Подготовка устройства

```bash
# Включить отладку по USB на Android устройстве
# Подключить устройство через USB

# Проверка подключения
adb devices

# Если устройство не root - нужен магистральный режим
adb root  # Только на root устройствах
```

### 3. Запуск скриптов

#### Базовый перехват Bluetooth:
```bash
frida -U -f com.prology -l prology_bluetooth_hook.js --no-pause
```

#### Анализ протокола:
```bash
frida -U -f com.prology -l prology_protocol_analyzer.js --no-pause
```

#### Если приложение уже запущено:
```bash
frida -U com.prology -l prology_bluetooth_hook.js
```

---

## 📂 Файлы

| Файл | Назначение |
|------|------------|
| `prology_bluetooth_hook.js` | Базовый перехват всех Bluetooth вызовов |
| `prology_protocol_analyzer.js` | Анализ протокола с расшифровкой команд |
| `PROLOGY_ANALYSIS_GUIDE.md` | Этот файл |

---

## 🎯 Что делают скрипты

### prology_bluetooth_hook.js

Перехватывает:
- ✅ Запись в GATT характеристики (`setValue`)
- ✅ Чтение из GATT характеристик (`readCharacteristic`)
- ✅ Ответы на чтение (`onCharacteristicRead`)
- ✅ Запись дескрипторов
- ✅ Подключение/отключение GATT
- ✅ Обнаружение сервисов
- ✅ BLE сканирование
- ✅ Логи приложения

### prology_protocol_analyzer.js

Анализирует:
- 🔍 Известные UUID сервисов
- 🔍 Типы команд по первому байту
- 🔍 Структуру пакетов
- 🔍 ASCII представление данных
- 🔍 Статистику обмена

**Категории команд:**
```
0x00-0x0F → Control (подключение, отключение)
0x10-0x1F → Status (запрос статуса)
0x20-0x3F → Media (play, pause, volume)
0x40-0x5F → Audio (EQ, balance, fader)
0x60-0x7F → Sound (bass, treble)
0x80-0x9F → Display (brightness, contrast)
0xA0-0xBF → System (парковка, время)
0xC0-0xDF → Config (настройки, reboot)
```

---

## 📊 Пример вывода

```
╔═══════════════════════════════════════════════════════════════════╗
║  📤 WRITE COMMAND                                                 ║
╠═══════════════════════════════════════════════════════════════════╣
║  UUID:        1077efec-c0b2-4d02-ace3-3c1e52e2fb4b                ║
║  Instance ID: 15                                                   ║
╠═══════════════════════════════════════════════════════════════════╣
║  HEX:  20 0A 00 00 00 00 00 00 00 00 00 00 00 00 00 00           ║
║  ASCII:  . . . . . . . . . . . . . . . .                         ║
╠═══════════════════════════════════════════════════════════════════╣
║  Length:    16 bytes                                              ║
║  Command:   VOLUME_UP                                             ║
║  Type:      Media                                                 ║
║  Desc:      Volume: 10                                            ║
╚═══════════════════════════════════════════════════════════════════╝
```

---

## 🔧 Дополнительные команды

### Сохранение лога в файл:
```bash
frida -U -f com.prology -l prology_bluetooth_hook.js --no-pause 2>&1 | tee prology_log.txt
```

### Поиск конкретных классов:
```bash
frida -U -f com.prology -e "
Java.perform(function() {
    var classes = Java.enumerateLoadedClassesSync();
    classes.forEach(function(c) {
        if (c.includes('bluetooth') || c.includes('Bluetooth')) {
            console.log(c);
        }
    });
});
"
```

### Перехват конкретных методов:
```bash
frida -U -f com.prology -e "
Java.perform(function() {
    var TargetClass = Java.use('com.prology.SomeClass');
    TargetClass.someMethod.implementation = function(arg) {
        console.log('Called with: ' + arg);
        return this.someMethod(arg);
    };
});
"
```

---

## 🛠️ Если что-то не работает

### Ошибка: "Failed to spawn: unable to find process"
```bash
# Проверьте что приложение установлено
adb shell pm list packages | grep prology

# Запустите приложение вручную, затем подключитесь
frida -U com.prology -l script.js
```

### Ошибка: "Java.perform() called on main thread"
```bash
# Скрипт уже вызывает Java.perform() внутри себя
# Убедитесь что используете --no-pause
```

### Ошибка: "Permission denied"
```bash
# На некоторых устройствах нужен root
adb root
adb shell setenforce 0
```

### Frida не видит устройство
```bash
# Перезапустите adb server
adb kill-server
adb start-server
adb devices
```

---

## 📈 Следующие шаги

### 1. Сбор данных
Запустите скрипт и выполните действия в приложении:
- Подключение к устройству
- Изменение громкости
- Переключение треков
- Настройка эквалайзера

### 2. Анализ лога
Ищите паттерны:
- Одинаковые команды → одинаковые HEX
- Изменение параметра → изменение байта в позиции N

### 3. Документирование протокола
Создайте таблицу:
```
Команда      | HEX                    | UUID
-------------|------------------------|----------------------------------
Volume Up    | 20 0A 00...            | 1077efec-c0b2-4d02-ace3-3c1e52e2fb4b
Volume Down  | 21 09 00...            | 1077efec-c0b2-4d02-ace3-3c1e52e2fb4b
Play         | 30 00 00...            | 1077efec-c0b2-4d02-ace3-3c1e52e2fb4b
```

### 4. Создание своего клиента
```python
# Пример на Python с bleak (BLE библиотека)
from bleak import BleakClient

ADDRESS = "XX:XX:XX:XX:XX:XX"
VOLUME_UUID = "1077efec-c0b2-4d02-ace3-3c1e52e2fb4b-..."

async def set_volume(client, volume):
    data = bytes([0x20, volume, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0])
    await client.write_gatt_char(VOLUME_UUID, data)
```

---

## 📚 Полезные ресурсы

- [Frida Documentation](https://frida.re/docs/)
- [Android Bluetooth GATT](https://developer.android.com/guide/topics/connectivity/bluetooth-le)
- [Bluetooth SIG Assigned Numbers](https://www.bluetooth.com/specifications/assigned-numbers/)
- [Bleak (Python BLE)](https://bleak.readthedocs.io/)

---

## ⚠️ Предупреждения

1. **Только для образовательных целей**
2. **Не используйте для взлома чужих устройств**
3. **Возможен brick головного устройства при неправильных командах**
4. **Всегда делайте backup настроек**

---

**Удачи в анализе! 🚀**
