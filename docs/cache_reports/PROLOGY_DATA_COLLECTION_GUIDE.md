# 🎯 PROLOGY DATA COLLECTION - COMPLETE GUIDE

**Дата:** 2026-03-12  
**Статус:** ✅ ГОТОВО К ИСПОЛЬЗОВАНИЮ

---

## 📊 ЧТО УЖЕ ПОЛУЧЕНО

| Данные | Статус | Файл |
|--------|--------|------|
| **CRC алгоритм** | ✅ 100% | `CRC_FINAL_100.md` |
| **Python библиотека** | ✅ Рабочая | `prology_crc.py` |
| **Генератор дампа** | ✅ 42 команды | `prology_dump.py` |
| **Перехватчик** | ✅ Готов | `prology_interceptor.py` |
| **Команды дампа** | ✅ Созданы | `prology_dump_commands.txt` |

---

## 🚀 БЫСТРЫЙ СТАРТ

### 1. Подключение к устройству

```bash
# Проверка подключения
adb devices

# Если не подключено - переподключиться
/data/data/com.termux/files/home/adb_reconnect.sh
```

### 2. Запуск PROLOGY

```bash
# Запустить приложение
adb shell am start -n com.prology/com.ryanheise.audioservice.AudioServiceActivity

# Проверить PID
adb shell pidof com.prology
```

### 3. Перехват ответов (Real-time)

```bash
# Терминал 1 - запуск перехватчика
frida --host 127.0.0.1:27042 -p <PID> -l prology_interceptor.js

# В приложении: изменить громкость, настройки
# → Ответы будут показаны в консоли
```

### 4. Отправка команд дампа

```bash
# Терминал 2 - отправка команд
# (нужен JS скрипт или Python с bleak)
```

---

## 📁 ВСЕ ФАЙЛЫ

### Для анализа:
| Файл | Назначение |
|------|------------|
| `CRC_FINAL_100.md` | Документация CRC |
| `prology_crc.py` | CRC библиотека |
| `prology_dump.py` | Генератор команд |
| `prology_interceptor.py` | Перехват ответов |
| `prology_dump_commands.txt` | Список команд |

### Для сбора:
| Файл | Назначение |
|------|------------|
| `prology_live.txt` | Лог перехвата (240 KB) |
| `prology_data/` | Директория с данными |
| `prology_full_capture.txt` | Частичный дамп |

---

## 🔧 ИСПОЛЬЗОВАНИЕ

### A. Перехват Bluetooth ответов

**Создать `prology_interceptor.js`:**
```javascript
Java.perform(function() {
    var BluetoothGattCharacteristic = Java.use("android.bluetooth.BluetoothGattCharacteristic");
    
    BluetoothGattCharacteristic.getValue.implementation = function() {
        var result = this.getValue();
        if (result) {
            var hex = Array.from(result)
                .map(b => (b & 0xFF).toString(16).padStart(2, '0').toUpperCase())
                .join(' ');
            console.log("📥 READ: " + hex);
        }
        return result;
    };
});
```

**Запуск:**
```bash
frida --host 127.0.0.1:27042 -p <PID> -l prology_interceptor.js
```

### B. Отправка команд

**Python с bleak:**
```python
import asyncio
from bleak import BleakClient

ADDRESS = "XX:XX:XX:XX:XX:XX"  # MAC устройства
CHAR_UUID = "0000ae02-0000-1000-8000-00805f9b34fb"

async def send_command(client, cmd_hex):
    cmd = bytes.fromhex(cmd_hex)
    await client.write_gatt_char(CHAR_UUID, cmd)
    print(f"📤 Sent: {cmd_hex}")

async def main():
    async with BleakClient(ADDRESS) as client:
        # Status request
        await send_command(client, "C00002900093")
        await asyncio.sleep(0.5)
        
        # Volume request
        await send_command(client, "C00002900194")
        await asyncio.sleep(0.5)

asyncio.run(main())
```

### C. Дамп всех настроек

**Команды из `prology_dump_commands.txt`:**
```
Status Request 1:    C00002900093
Status Request 2:    C00002900194
Config Request:      C00002900353
DateTime Field 1:    C00002920A58
...
```

**Отправить все по очереди → сохранить ответы**

---

## 📊 ЧТО МОЖНО ПОЛУЧИТЬ

### 1. Текущие настройки устройства
- Громкость
- Эквалайзер (5/10/15 полос)
- Баланс лево/право
- Фейдер перед/зад
- Сабвуфер настройки
- X-Over частоты
- Time Alignment

### 2. Системная информация
- Версия прошивки
- Модель устройства
- Серийный номер
- Дата производства

### 3. Пользовательские данные
- Сохранённые пресеты
- История подключений
- Любимые станции
- Настройки дисплея

### 4. Ответы на команды
- Формат ответов
- Коды ошибок
- Статусы выполнения

---

## 🎯 СЛЕДУЮЩИЕ ШАГИ

### 1. Запустить перехват (15 мин)
```bash
frida --host 127.0.0.1:27042 -p <PID> -l prology_interceptor.js
# Изменить настройки в приложении
# → Сохранить логи
```

### 2. Отправить дамп команд (30 мин)
```python
# Отправить все 42 команды
# Сохранить ответы
# Проанализировать структуру
```

### 3. Извлечь DataStore/БД (15 мин)
```bash
adb pull /data/data/com.prology/files/
adb pull /data/data/com.prology/shared_prefs/
# Анализ содержимого
```

### 4. Bluetooth HCI лог (30 мин)
```bash
adb shell setprop persist.bluetooth.btsnooplogmode true
# Действия в приложении
adb pull /sdcard/btsnoop_hci.log
# Анализ в Wireshark
```

---

## 📋 ЧЕКЛИСТ

- [ ] CRC алгоритм изучен
- [ ] Python библиотека работает
- [ ] Перехватчик запущен
- [ ] Команды дампа отправлены
- [ ] Ответы сохранены
- [ ] Настройки устройства получены
- [ ] DataStore извлечён
- [ ] HCI лог проанализирован

---

## 📞 ПОДДЕРЖКА

**Файлы для связи:**
- `WHAT_DATA_CAN_GET.md` - Полный список возможностей
- `PROLOGY_FULL_REPORT.md` - Общий отчёт
- `CRC_FINAL_100.md` - CRC документация

---

**Готово к работе! Выбирайте задачу и выполняйте!** 🚀
