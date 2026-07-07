# 🚗 PROLOGY Full Client v3.0

Полный клиент для управления магнитолой PROLOGY через Bluetooth LE.

## 📋 Возможности

- ✅ **Подключение** к PROLOGY по Bluetooth LE
- ✅ **Запрос статуса** магнитолы
- ✅ **Чтение настроек** эквалайзера
- ✅ **Запрос баланса/фейдера**
- ✅ **Управление громкостью** (+/-)
- ✅ **Mute** (выключение звука)
- ✅ **Полный дамп** всех настроек
- ✅ **Загрузка конфига** из JSON
- ✅ **Сохранение конфига** в JSON

## 🚀 Быстрый старт

### 1. Установка зависимостей

```bash
pip install bleak
```

### 2. Запуск

```bash
sudo python3 prology_full_client.py
```

### 3. Меню

```
1. Подключиться       ← Поиск и подключение
2. Запрос статуса     ← Чтение статуса
3. Запрос EQ          ← Чтение настроек эквалайзера
4. Громкость +        ← Увеличить громкость
5. Громкость -        ← Уменьшить громкость
6. Mute               ← Выключить звук
7. Полный дамп        ← Вычитать все настройки
8. Загрузить конфиг   ← Из JSON файла
9. Сохранить конфиг   ← В JSON файл
0. Выход
```

## 📖 Примеры использования

### Пример 1: Подключение и запрос статуса

```python
from prology_full_client import PrologyClient
import asyncio

async def main():
    client = PrologyClient()
    
    # Подключение
    if await client.connect():
        # Запрос статуса
        status = await client.get_status()
        print(f"Статус: {status}")
        
        # Отключение
        await client.disconnect()

asyncio.run(main())
```

### Пример 2: Полный дамп настроек

```python
async def dump():
    client = PrologyClient()
    
    if await client.connect():
        # Дамп всех настроек
        result = await client.dump_all()
        
        # Сохранение в JSON
        import json
        with open('prology_dump.json', 'w') as f:
            json.dump(result, f, indent=2, default=str)
        
        await client.disconnect()

asyncio.run(dump())
```

### Пример 3: Управление громкостью

```python
async def volume_control():
    client = PrologyClient()
    
    if await client.connect():
        # Установка громкости
        await client.set_volume(50)  # 50%
        await asyncio.sleep(1)
        
        # Громкость вверх
        await client.volume_up()
        await asyncio.sleep(1)
        
        # Mute
        await client.mute(True)
        await asyncio.sleep(1)
        
        # Mute off
        await client.mute(False)
        
        await client.disconnect()

asyncio.run(volume_control())
```

### Пример 4: Настройка эквалайзера

```python
async def eq_setup():
    client = PrologyClient()
    
    if await client.connect():
        # Запрос текущих настроек EQ
        eq = await client.get_eq()
        print(f"Текущий EQ: {eq}")
        
        # Установка пресета
        await client.set_eq_preset("Rock")
        
        await client.disconnect()

asyncio.run(eq_setup())
```

### Пример 5: Сохранение и загрузка конфига

```python
async def config_backup():
    client = PrologyClient()
    
    if await client.connect():
        # Чтение всех настроек
        await client.get_eq()
        await client.get_status()
        
        # Сохранение в файл
        await client.save_config('my_config.json')
        
        # Загрузка из файла
        await client.load_config('my_config.json')
        
        await client.disconnect()

asyncio.run(config_backup())
```

## 🔧 Конфигурация

### MAC адрес

По умолчанию используется MAC из дампа:

```python
PROLOGY_MAC = "10:48:5E:71:20:90"
```

Если у вас другой MAC, измените в начале файла:

```python
PROLOGY_MAC = "XX:XX:XX:XX:XX:XX"  # Ваш MAC
```

### UUID

```python
SERVICE_UUID = "0000ae02-0000-1000-8000-00805f9b34fb"
WRITE_UUID = "0000ae03-0000-1000-8000-00805f9b34fb"
READ_UUID = "0000ae02-0000-1000-8000-00805f9b34fb"
```

## 📊 Структура данных

### EQSettings

```python
@dataclass
class EQSettings:
    enabled: bool = True       # Эквалайзер включён
    preset: str = "Flat"       # Пресет
    bass: int = 0              # -10 to +10
    treble: int = 0            # -10 to +10
    balance: int = 0           # -10 (L) to +10 (R)
    fader: int = 0             # -10 (F) to +10 (R)
    loudness: bool = False     # Loudness
    subwoofer: int = 50        # 0 to 100
```

### SystemSettings

```python
@dataclass
class SystemSettings:
    volume: int = 20           # 0 to 100
    preset: str = "User 1"     # Пресет пользователя
    source: str = "Bluetooth"  # Источник
    muted: bool = False        # Mute статус
```

### PrologyState

```python
@dataclass
class PrologyState:
    eq: EQSettings             # Настройки EQ
    system: SystemSettings     # Системные настройки
    connected: bool = False    # Статус подключения
    last_update: str = ""      # Время обновления
```

## 🐛 Отладка

### Проблема: "Не удаётся подключиться"

1. Проверьте MAC адрес
2. Убедитесь что магнитола включена
3. Проверьте что Bluetooth адаптер работает:
   ```bash
   hciconfig -a
   ```

### Проблема: "CRC ERROR"

Проверьте что используется правильная константа для команды. CRC_CONSTANTS в начале файла содержит все известные константы.

### Проблема: "Нет ответа"

Увеличьте задержку между отправкой и чтением:

```python
await asyncio.sleep(0.5)  # Вместо 0.2
```

## 📁 Формат JSON конфига

```json
{
  "eq": {
    "enabled": true,
    "preset": "Rock",
    "bass": 4,
    "treble": 3,
    "balance": 0,
    "fader": -2,
    "loudness": true,
    "subwoofer": 70
  },
  "system": {
    "volume": 25,
    "preset": "User 1",
    "source": "Bluetooth",
    "muted": false
  },
  "connected": false,
  "last_update": "2026-03-12T19:41:29.390450"
}
```

## 🔗 Связанные файлы

- `prology_crc_lib.py` - CRC библиотека
- `prology_config.py` - Менеджер конфигураций
- `configs/` - Пресеты эквалайзера (rock.json, pop.json, и т.д.)

## 📊 Протокол

### Формат команды

```
Byte:   0      1      2      3      4      5...   N
       [C0]  [00]  [Len]  [Type] [SubC] [Payload...] [CRC]
```

- **C0** - Заголовок
- **00** - Флаги
- **Len** - Длина (Type + Subcmd + Payload)
- **Type** - Тип команды
- **Subcmd** - Субкоманда
- **Payload** - Данные
- **CRC** - Контрольная сумма

### Примеры команд

| Команда | HEX | Описание |
|---------|-----|----------|
| Status | `C0 00 02 90 01 94` | Запрос статуса |
| EQ | `C0 00 03 9A 01 00 9E` | Запрос EQ |
| Volume 5 | `C0 00 02 05 05 0C` | Громкость 5 |
| Volume Up | `C0 00 02 07 01 0A` | Громкость + |
| Mute | `C0 00 02 05 00 09` | Mute |

## 📝 Лицензия

MIT License

## 👥 Авторы

- Reverse engineering: PROLOGY Protocol Analysis
- Client development: PROLOGY Project Team
