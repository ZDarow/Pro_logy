# 📱 ПОЛНЫЙ ОТЧЁТ ДЕКОМПИЛЯЦИИ PROLOGY.apk

## 🎯 Дата анализа: 15 марта 2026

---

## 📋 СОДЕРЖАНИЕ

1. [Общая информация](#общая-информация)
2. [Bluetooth UUID](#bluetooth-uuid)
3. [Протокол связи](#протокол-связи)
4. [Команды эквалайзера](#команды-эквалайзера)
5. [DSP команды](#dsp-команды)
6. [Аудио настройки](#аудио-настройки)
7. [Пример кода подключения](#пример-кода-подключения)

---

## 🔍 Общая информация

| Параметр | Значение |
|----------|----------|
| **Package** | com.prology |
| **Version** | 5.0.55 (140) |
| **Platform** | Flutter (Dart) |
| **libapp.so** | 8.8 MB |
| **Строк найдено** | 22,529 |

---

## 📶 Bluetooth UUID

### Classic Bluetooth (SPP)
```
UUID: 00001101-0000-1000-8000-00805F9B34FB
```
Стандартный Serial Port Profile для основного соединения

### BLE Характеристики
```
0000AE00-0000-1000-8000-00805F9B34FB  - Сервис 1
0000AE01-0000-1000-8000-00805F9B34FB  - Характеристика 1
0000AE02-0000-1000-8000-00805F9B34FB  - Характеристика 2

0000AF00-0000-1000-8000-00805F9B34FB  - Сервис 2
0000AF01-0000-1000-8000-00805F9B34FB  - Характеристика 3
0000AF02-0000-1000-8000-00805F9B34FB  - Характеристика 4
```

### BLE Дескрипторы
```
00002902-0000-1000-8000-00805F9B34FB  - Client Characteristic Configuration Descriptor (CCCD)
```

---

## 🔧 Протокол связи

### MCU Коды

| Код | Описание |
|-----|----------|
| `MCU_6951_DSP` | Основной DSP процессор |
| `MCU_6951` | Главный микроконтроллер |
| `MCU_5110` | Дополнительный контроллер |
| `MCU_1048` | Сервисный контроллер |

### Парсеры команд

```
ParserCmdSet|_parserDsp          - DSP процессор
ParserCmdSet|_parserDspPlus      - Расширенный DSP
ParserCmdSet|_parserSound        - Звук
ParserCmdSet|_parserSetting      - Настройки
ParserCmdSet|_parserBluetooth    - Bluetooth
ParserCmdSet|_parserMedia        - Медиа
ParserCmdSet|_parserSong         - Песни
ParserCmdSet|_parserRadio        - Радио
ParserCmdSet|_parserRemote       - Пульт ДУ
ParserCmdSet|_parserAuxIn        - AUX вход
```

### Ключевые классы

```dart
ProtocolHelper          - Помощник протокола
DspSender              - Отправитель DSP команд
KeycodeSender          - Отправитель кнопок
BluetoothChatManager   - Менеджер Bluetooth чата
BluetoothChatService   - Сервис Bluetooth
```

### Функции работы с пакетами

```
getPacketCmd@707000112     - Получить команду пакета
getPacketData@707000112    - Получить данные пакета
sendPacket@707000112       - Отправить пакет
writeParameter            - Записать параметр
sendBeepAndCommand        - Отправить сигнал + команду
```

---

## 🎛 Команды эквалайзера

### Пресеты (60 полос)

**Стандартные:**
- `FLAT` - Плоский
- `CLASSICAL` - Классика
- `JAZZ_MUSIC` - Джаз
- `ROCK_MUSIC` / `CLS_ROCK` / `ROCK_SERIES` - Рок
- `POP_MUSIC` - Поп
- `CUSTOM` / `CUSTOM_1` / `CUSTOM_2` / `CUSTOM_3` - Пользовательские

**Нумерованные:** `EQ_1` ... `EQ_60` (59 пресетов)

### Функции отправки

```dart
// Отправка параметров
sendEqGain()              // Установка усиления полосы
sendEqQFactor()           // Установка Q-фактора
sendEqQFactorShared()     // Общий Q-фактор
sendEqQFactorLink()       // Связанный Q-фактор
sendEqQFactorPeriod()     // Периодическая отправка

// Установка кривых
setEqCurve()              // Установка кривой
setEqCurveBy()            // Установка по значению
setEqCurveSelected()      // Выбор кривой
setEqChartData()          // Установка данных графика
setEqChartBarData()       // Установка данных столбцов

// Контроллеры
setEqController()         // Установка контроллера
setEqGroupEnable()        // Включение группы
setEqBean()               // Установка параметров
```

### События эквалайзера

```
_Event|_sendEqGain@881261700
_Event|_sendEqQFactor@881261700
_Event|_sendEqQFactorLink@881261700
```

---

## 🔊 DSP команды

### Кроссовер (X-Over)

**Типы фильтров:**
- `HPF` - High Pass Filter
- `LPF` - Low Pass Filter
- `BpF` - Band Pass Filter
- `ApF` - All Pass Filter

**Параметры фильтров:**
```
HPF_FRQ      - Частота среза HPF
HPF_GAIN     - Усиление HPF
HPF_SLOPE    - Крутизна HPF
HPF_TYPE     - Тип HPF

LPF_FRQ      - Частота среза LPF
LPF_GAIN     - Усиление LPF
LPF_SLOPE    - Крутизна LPF
LPF_TYPE     - Тип LPF
```

**Функции:**
```dart
SendXOverItem()           // Отправка параметра X-Over
XOverItemOfGain()         // Усиление элемента
XOverItemOfHpfGain()      // Усиление HPF
XOverItemOfLpfGain()      // Усиление LPF
setXOverChartCurve()      // Установка кривой
setXOverChartData()       // Установка данных
```

### Time Alignment (Временное выравнивание)

**Функции:**
```dart
TimeAlignmentDelay()          // Задержка
TimeAlignmentDelayPeriod()    // Период задержки
TimeAlignmentChanged()        // Изменение
TimeAlignmentController()     // Контроллер
```

### Аудио каналы (16 каналов)

```
CHANNEL_1 ... CHANNEL_16
CHANNEL_GROUP_1 ... CHANNEL_GROUP_8
```

**Настройки каналов:**
- `XOverMute` - Mute канала
- `XOverMuteChanged` - Изменение Mute
- `XOverType` - Тип канала
- `XOverTypeChanged` - Изменение типа

---

## 🎵 Аудио настройки

### Громкость

**Функции:**
```dart
sendVolume()              // Основная громкость
sendVolumeLimit()         // Ограничение громкости
VolumeChanged()           // Изменение громкости
VolumeDirection()         // Направление изменения
```

### Bass / Treble

**Функции:**
```dart
sendBass()                // Установка Bass
sendTreble()              // Установка Treble
BassBoostToggle()         // Вкл/выкл Bass Boost
BassBoostLevel()          // Уровень Bass Boost
BassBoostLevelChanged()   // Изменение уровня
```

### Сабвуфер

**Функции:**
```dart
sendSubwooferVolume()         // Громкость сабвуфера
sendSubwooferCutOffFrequency() // Частота среза
SubwooferLevel()              // Уровень
SubwooferLevelChanged()       // Изменение уровня
SubwooferChannel()            // Канал сабвуфера
```

### Loudness

**Функции:**
```dart
sendLoudnessCenterFrequency()  // Центральная частота loudness
LoudnessCenterFrequencyChanged() // Изменение
```

---

## 📶 Bluetooth команды

### Классы

```dart
BluetoothChatManager       - Менеджер чата
BluetoothChatService       - Сервис чата
BluetoothChatListener      - Слушатель
BluetoothConnection        - Соединение
BluetoothConnectionState   - Состояние соединения
BluetoothDevice            - Устройство
BluetoothCharacteristic    - Характеристика
BluetoothDescriptor        - Дескриптор
```

### Функции

```dart
BmWriteCharacteristicRequest()    // Запись характеристики
BmSetNotifyValueRequest()         // Установка уведомлений
sendBeep()                        // Звуковой сигнал
sendBeepAndCommand()              // Сигнал + команда
sendBeepOn()                      // Включить сигнал
```

### Состояния Bluetooth

```
BluetoothAdapterState        - Состояние адаптера
BluetoothConnectionState     - Состояние соединения
connected                    - Подключено
connecting                   - Подключение
disconnecting                - Отключение
disconnected                 - Отключено
```

---

## 🛠 Пример кода подключения

### Python (BlueZ)

```python
import bluetooth
import struct

# UUID сервисов
SPP_UUID = "00001101-0000-1000-8000-00805F9B34FB"

# BLE UUID
BLE_SERVICE_1 = "0000AE00-0000-1000-8000-00805F9B34FB"
BLE_SERVICE_2 = "0000AF00-0000-1000-8000-00805F9B34FB"

class PrologyController:
    def __init__(self, mac_address):
        self.mac = mac_address
        self.sock = None
        
    def connect_spp(self):
        """Подключение через Classic Bluetooth (SPP)"""
        self.sock = bluetooth.BluetoothSocket(bluetooth.RFCOMM)
        self.sock.connect((self.mac, 1))  # Канал 1
        print(f"✓ Подключено к {self.mac}")
        
    def disconnect(self):
        """Отключение"""
        if self.sock:
            self.sock.close()
            
    def send_packet(self, mcu_code, cmd, data):
        """
        Отправка пакета
        Формат: [MCU_CODE][CMD][DATA_LENGTH][DATA][CHECKSUM]
        """
        # Формирование пакета (предположительно)
        packet = struct.pack('>HBB', mcu_code, cmd, len(data)) + data
        
        # Вычисление checksum (XOR всех байтов)
        checksum = 0
        for b in packet:
            checksum ^= b
        packet += bytes([checksum])
        
        self.sock.send(packet)
        return self.sock.recv(1024)
        
    def set_eq_preset(self, preset_id):
        """Установка пресета эквалайзера"""
        # MCU_6951_DSP = 0x1A2B (предположительно)
        # CMD_SET_EQ = 0x01
        return self.send_packet(0x1A2B, 0x01, bytes([preset_id]))
        
    def set_eq_gain(self, band, gain):
        """Установка усиления полосы эквалайзера"""
        # band: 0-59 (номер полосы)
        # gain: -12 до +12 (dB)
        data = struct.pack('BB', band, gain + 12)  # Смещение на 12
        return self.send_packet(0x1A2B, 0x02, data)
        
    def set_volume(self, volume):
        """Установка громкости (0-100)"""
        return self.send_packet(0x1A2B, 0x10, bytes([volume]))
        
    def set_bass(self, level):
        """Установка Bass (-6 до +6)"""
        return self.send_packet(0x1A2B, 0x11, bytes([level + 6]))
        
    def set_treble(self, level):
        """Установка Treble (-6 до +6)"""
        return self.send_packet(0x1A2B, 0x12, bytes([level + 6]))
        
    def set_subwoofer_volume(self, volume):
        """Громкость сабвуфера (0-100)"""
        return self.send_packet(0x1A2B, 0x13, bytes([volume]))
        
    def set_xover_hpf(self, channel, freq, gain, slope):
        """Настройка HPF кроссовера"""
        data = struct.pack('BBBB', channel, freq, gain, slope)
        return self.send_packet(0x1A2B, 0x20, data)
        
    def set_time_alignment(self, channel, delay):
        """Временное выравнивание канала"""
        data = struct.pack('>BH', channel, delay)  # delay в см
        return self.send_packet(0x1A2B, 0x30, data)


# Пример использования
if __name__ == '__main__':
    controller = PrologyController("XX:XX:XX:XX:XX:XX")
    
    try:
        controller.connect_spp()
        
        # Установка пресета "Rock"
        controller.set_eq_preset(3)  # EQ_3 = Rock
        
        # Установка громкости
        controller.set_volume(50)
        
        # Настройка эквалайзера
        for band in range(10):
            controller.set_eq_gain(band, 0)  # Плоский
            
        # Настройка кроссовера
        controller.set_xover_hpf(channel=1, freq=80, gain=0, slope=2)
        
        # Временное выравнивание
        controller.set_time_alignment(channel=1, delay=50)  # 50 см
        
    finally:
        controller.disconnect()
```

### C# (.NET)

```csharp
using System;
using System.Bluetooth;
using System.IO;

public class PrologyController : IDisposable
{
    private BluetoothClient _client;
    private NetworkStream _stream;
    
    // UUID
    private static readonly Guid SPP_UUID = 
        new Guid("00001101-0000-1000-8000-00805F9B34FB");
    
    public void Connect(string macAddress)
    {
        _client = new BluetoothClient();
        _client.Connect(BluetoothAddress.Parse(macAddress), SPP_UUID);
        _stream = _client.GetStream();
    }
    
    public void Disconnect()
    {
        _stream?.Close();
        _client?.Close();
    }
    
    private byte[] SendPacket(ushort mcuCode, byte cmd, byte[] data)
    {
        // Формирование пакета
        var packet = new byte[4 + data.Length + 1];
        packet[0] = (byte)(mcuCode >> 8);
        packet[1] = (byte)(mcuCode & 0xFF);
        packet[2] = cmd;
        packet[3] = (byte)data.Length;
        Array.Copy(data, 0, packet, 4, data.Length);
        
        // Checksum
        byte checksum = 0;
        for (int i = 0; i < packet.Length - 1; i++)
            checksum ^= packet[i];
        packet[packet.Length - 1] = checksum;
        
        _stream.Write(packet, 0, packet.Length);
        
        // Чтение ответа
        var response = new byte[1024];
        _stream.Read(response, 0, response.Length);
        return response;
    }
    
    public void SetEqPreset(byte presetId)
    {
        SendPacket(0x1A2B, 0x01, new[] { presetId });
    }
    
    public void SetVolume(byte volume)
    {
        SendPacket(0x1A2B, 0x10, new[] { volume });
    }
    
    public void Dispose() => Disconnect();
}
```

---

## 📊 Структура пакета (предположительно)

```
┌────────────┬─────────┬────────────┬──────────┬─────────────┐
│ MCU_CODE   │  CMD    │ DATA_LENGTH│   DATA   │  CHECKSUM   │
│  2 bytes   │ 1 byte  │  1 byte    │ N bytes  │  1 byte     │
└────────────┴─────────┴────────────┴──────────┴─────────────┘
```

**Поля:**
- `MCU_CODE` - Код устройства (MCU_6951_DSP = 0x1A2B)
- `CMD` - Код команды (0x01 = EQ preset, 0x10 = volume, etc.)
- `DATA_LENGTH` - Длина данных
- `DATA` - Данные команды
- `CHECKSUM` - XOR всех предыдущих байтов

---

## 📂 Извлечённые файлы

```
/home/mi/Prology/
├── PROLOGY.apk                    # Исходный APK
├── prology_java/                  # Java код (jadx)
├── prology_decompiled/            # Ресурсы + Smali
├── dart_analysis.txt              # Анализ Dart
├── protocol_report.txt            # Отчёт протокола
├── dart_analyzer.py               # Скрипт анализа Dart
└── protocol_analyzer.py           # Скрипт анализа протокола
```

---

## ⚠️ Примечания

1. **Формат пакета** - предположительный, требует верификации через перехват трафика
2. **MCU коды** - точные значения требуют дополнительного анализа
3. **Команды** - идентифицированы по именам функций, точные коды команд неизвестны
4. **UUID** - найдены в бинарном коде, подтверждены

---

## 🔬 Следующие шаги

1. **Перехват трафика:**
   ```bash
   adb shell setprop persist.bluetooth.btsnooplogmode true
   adb shell setprop persist.bluetooth.btsnooplogmode.mode full
   # Выполнить действия в приложении
   adb bugreport > bugreport.zip
   ```

2. **Анализ HCI лога:**
   - Извлечь `btsnoop_hci.log` из bugreport
   - Открыть в Wireshark
   - Сопоставить действия с пакетами

3. **Документирование протокола:**
   - Составить таблицу всех команд
   - Определить форматы данных для каждой команды
   - Создать полную библиотеку для управления

---

**Анализ выполнен:** 15 марта 2026  
**Инструменты:** Python 3.12, jadx, apktool, strings, flare-floss
