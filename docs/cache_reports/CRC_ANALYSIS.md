# 🔐 PROLOGY CRC Algorithm Analysis

**Дата:** 2026-03-12  
**Статус:** Частично расшифровано (~30%)

---

## ✅ ОТКРЫТИЕ: Формула CRC обнаружена для некоторых команд

### Формула:
```
CRC = XOR(all_data_bytes) XOR CONSTANT
```

Где:
- `all_data_bytes` — все байты команды КРОМЕ последнего (CRC)
- `CONSTANT` — константа, зависящая от типа команды

---

## 📊 ИЗВЕСТНЫЕ КОНСТАНТЫ

| Тип команды | HEX | CONSTANT | Статус |
|-------------|-----|----------|--------|
| **Volume** | 0x02, 0x05 | `0xCE` | ✅ 100% match |
| **Volume Down** | 0x02, 0x06 | `0x3C` | ✅ 100% match |
| **Volume Up** | 0x02, 0x07 | `0xCE` | ✅ 100% match |
| **DateTime** | 0x05, 0x92 | `0x42` / `0x48` | ⚠️ 50% match |

---

## 📝 ПРИМЕРЫ РАСЧЁТА

### Пример 1: Volume = 1
```
Команда: C0 00 02 05 01 08
                    ↑↑
              Data  CRC

XOR(data) = C0 XOR 00 XOR 02 XOR 05 XOR 01
          = 0xC6

CRC = XOR(data) XOR CONSTANT
0x08 = 0xC6 XOR 0xCE  ✅
```

### Пример 2: Volume = 5
```
Команда: C0 00 02 05 05 0C

XOR(data) = C0 XOR 00 XOR 02 XOR 05 XOR 05
          = 0xC2

CRC = 0xC2 XOR 0xCE
    = 0x0C  ✅
```

### Пример 3: Volume Up
```
Команда: C0 00 02 07 01 0A

XOR(data) = C0 XOR 00 XOR 02 XOR 07 XOR 01
          = 0xC4

CRC = 0xC4 XOR 0xCE
    = 0x0A  ✅
```

---

## 🔍 НЕИЗВЕСТНЫЕ КОНСТАНТЫ

Для следующих типов команд константа НЕ постоянная:

| Тип | Проблема |
|-----|----------|
| 0x90 (Status) | 3 разные константы: 0xBC, 0xC0, 0xC6 |
| 0x9A (Config) | 14 разных констант! |
| 0xB0 (Unknown) | 9 разных констант |

### Гипотезы:

1. **Константа зависит от подкоманды** (байт 4)
2. **Константа зависит от длины команды**
3. **Есть дополнительный параметр** (например, ID устройства)
4. **Более сложный алгоритм** для этих команд

---

## 💻 PYTHON ФУНКЦИЯ ДЛЯ РАСЧЁТА CRC

```python
def calculate_crc(data: bytes, cmd_type: int) -> int:
    """
    Расчёт CRC для команд PROLOGY
    
    Args:
        data: Байты команды без CRC
        cmd_type: Тип команды (байт 3)
    
    Returns:
        Вычисленный CRC байт
    """
    
    # Известные константы
    CONSTANTS = {
        0x05: 0xCE,  # Volume команды
        0x06: 0x3C,  # Volume Down
        0x07: 0xCE,  # Volume Up
    }
    
    # XOR всех байт
    xor_result = 0
    for byte in data:
        xor_result ^= byte
    
    # Получаем константу (или 0 если неизвестна)
    constant = CONSTANTS.get(cmd_type, 0)
    
    # Расчёт CRC
    crc = xor_result ^ constant
    
    return crc


# Пример использования:
data = bytes([0xC0, 0x00, 0x02, 0x05, 0x01])  # Volume = 1
crc = calculate_crc(data, 0x05)
print(f"CRC: 0x{crc:02X}")  # 0x08 ✅
```

---

## 🎯 СЛЕДУЮЩИЕ ШАГИ

1. **Собрать больше данных** для команд 0x90, 0x9A, 0xB0
2. **Найти паттерн** в изменении констант
3. **Проанализировать зависимость** от байта 4 (подкоманда)
4. **Проверить гипотезу** с ID устройства

---

## 📛 КОМАНДЫ С ИЗВЕСТНЫМ CRC

| Команда (HEX) | CRC | Формула |
|---------------|-----|---------|
| `C0 00 02 05 01` | 0x08 | XOR(data) XOR 0xCE |
| `C0 00 02 05 05` | 0x0C | XOR(data) XOR 0xCE |
| `C0 00 02 07 01` | 0x0A | XOR(data) XOR 0xCE |
| `C0 00 02 06 FE` | 0x06 | XOR(data) XOR 0x3C |

---

**Статус:** 19/63 команды (30.2%) расшифрованы ✅
