# Reverse Engineering Bluetooth/BLE Packets — Comprehensive Guide

## 1. Инструментарий для BLE реверс-инжиниринга

### Железо
- **ESP32 + ESP32 Marauder** (проект в `firmware/ESP32Marauder/`) — 11 режимов BLE сканирования
- **nRF52840 DK / nRF52832** — профессиональный BLE-сниффер (sniffer_uart.hex)
- **Ubertooth One** — BT Classic + BLE (2.4 GHz)
- **Adafruit Bluefruit LE Sniffer** — nRF51822-based, контролируется через Python

### Программное обеспечение
- **Wireshark** — анализ pcap с BLE-пакетов
- **nRF Connect** — мобильное приложение для просмотра GATT сервисов/характеристик
- **Frida** — перехват BLE-вызовов на Android
- **Python BLE библиотеки** — `bleak`, `bluepy`, `pygatt`
- **Android HCI Snoop Log** — встроенный логгер (Developer Options)

---

## 2. Методология реверс-инжиниринга BLE

### Шаг 1: Discovery (GATT сервисы)
Сканирование с nRF Connect или ESP32 для выявления:
- Service UUIDs
- Characteristic UUIDs (read/write/notify/indicate)
- Descriptors (CCCD 0x2902)

### Шаг 2: HCI Snoop Log (Android)
Включить в настройках разработчика Android:

```
Settings → Developer Options → Enable Bluetooth HCI Snoop Log
```

Файл сохраняется в `/sdcard/btsnoop_hci.log`. Открыть в Wireshark:

```bash
adb pull /sdcard/btsnoop_hci.log .
wireshark btsnoop_hci.log
# Фильтр: btatt && frame.len < 300
```

### Шаг 3: Frida перехват
Hook Android BLE API для захвата TX/RX в реальном времени:

```javascript
// frida_bluetooth_hook.js
// Hook BluetoothGatt.writeCharacteristic
var BluetoothGatt = Java.use('android.bluetooth.BluetoothGatt');
BluetoothGatt.writeCharacteristic.overload(
    'android.bluetooth.BluetoothGattCharacteristic'
).implementation = function(char) {
    var value = char.getValue();
    console.log('[TX] UUID: ' + char.getUuid() +
        ' Value: ' + bytesToHex(value));
    return this.writeCharacteristic(char);
};

// Hook onCharacteristicChanged
BluetoothGatt.onCharacteristicChanged.implementation = function(char) {
    var value = char.getValue();
    console.log('[RX] UUID: ' + char.getUuid() +
        ' Value: ' + bytesToHex(value));
    this.onCharacteristicChanged(char);
};
```

Запуск:
```bash
frida -U -f com.prology -l frida_bluetooth_hook.js
```

### Шаг 4: Пассивный сниффинг ESP32
Использовать ESP32 Marauder в режиме `BT_SCAN_ALL`:

```cpp
// WiFiScan.cpp - RunBluetoothScan() конфигурация
NimBLEDevice::init("");
pBLEScan = NimBLEDevice::getScan();
pBLEScan->setActiveScan(true);
pBLEScan->setInterval(100);   // 100ms интервал
pBLEScan->setWindow(99);      // 99ms окно
pBLEScan->setMaxResults(0);   // бесконечный режим
pBLEScan->start(0, scanCompleteCB, false);

// Callback сниффера
class bluetoothScanAllCallback : public NimBLEAdvertisedDeviceCallbacks {
    void onResult(NimBLEAdvertisedDevice* advertisedDevice) {
        Serial.printf("MAC: %s, RSSI: %d, Name: %s\n",
            advertisedDevice->getAddress().toString().c_str(),
            advertisedDevice->getRSSI(),
            advertisedDevice->getName().c_str());
        // Доступен сырой payload через getPayload()
    }
};
```

Для активного сканирования ESP32 отправляет Scan Request и получает Scan Response (доп. данные).

### Шаг 5: Анализ трафика
- Собрать TX/RX пары для каждого действия в UI
- Идентифицировать preamble, length, command type, payload, checksum
- Найти контрольные суммы и их алгоритмы (XOR, sum, CRC-8, CRC-16)

---

## 3. Разбор BLE пакета (физический уровень)

### Структура BLE Advertising PDU
```
[Preamble][Access Address][PDU][CRC]
   1 байт      4 байта    2-37   3 байта
```

### PDU (Advertising Channel)
```
[Header: 2 bytes][Payload: 0-31 bytes]

Header:
  [4b PDU Type][2b RFU][1b ChSel][1b TxAdd][1b RxAdd][3b Length]

Payload (AD Structure):
  [1b Length][1b AD Type][N bytes Data]
```

### Типы AD (Advertising Data)
```
0x01  - Flags
0x02  - Incomplete List of 16-bit Service UUIDs
0x03  - Complete List of 16-bit Service UUIDs
0x06  - Incomplete List of 128-bit Service UUIDs
0x07  - Complete List of 128-bit Service UUIDs
0x08  - Shortened Local Name
0x09  - Complete Local Name
0x0A  - Tx Power Level
0xFF  - Manufacturer Specific Data
```

### Manufacturer Specific Data — известные Company IDs
```cpp
// Apple iBeacon:     0x4C 0x00 (Apple, Inc.)
// Microsoft:         0x06 0x00 (Microsoft)
// Samsung:           0x75 0x00 (Samsung Electronics)
// Google Fast Pair:  0x2C 0xFE (Google)
// Espressif:         0x02 0xFE (Espressif)
// Nordic Semi:       0x59 0x00 (Nordic Semiconductor)
```

### Детектирование устройств по Manufacturer Data
```cpp
// AirTag (Apple Find My)
if (payload[i] == 0x4C && payload[i+1] == 0x00 &&
    payload[i+2] == 0x12 && payload[i+3] == 0x19) {
    // AirTag detected
}

// Flipper Zero
if (payload[i] == 0x81 && payload[i+1] == 0x30) {
    // Flipper Zero (Black)
}

// Microsoft SwiftPair
if (payload[i] == 0xFF && payload[i+1] == 0x06 &&
    payload[i+2] == 0x00 && payload[i+3] == 0x03) {
    // Microsoft device
}
```

---

## 4. Практический пример: PROLOGY RCSP

### Полный анализ протокола
Из реверс-инжиниринга PROLOGY CMD 300 (Jieli AC6951):

```
Service UUID:   0000ae00-0000-1000-8000-00805f9b34fb
TX (Write):     0000ae01-0000-1000-8000-00805f9b34fb
RX (Notify):    0000ae02-0000-1000-8000-00805f9b34fb
Device Name:    PROLOGY_BLE
```

### Формат пакета TX (App → Device)
```
[F0][00][LEN][CMD][PAYLOAD...][CHECKSUM]
 0xF0         // Preamble
 0x00         // Флаг/резерв
 LEN          // Длина данных (CMD + PAYLOAD, 1 байт)
 CMD          // ID команды
 PAYLOAD      // Параметры (LEN-1 байт)
 CHECKSUM     // (sum + 0x10) & 0xFF
```

### Формат пакета RX (Device → App)
```
[C0][00][LEN][TYPE][DATA...][CHECKSUM]
 0xC0         // Preamble ответа
 0x00         // Флаг/резерв
 LEN          // Длина (TYPE + DATA)
 TYPE         // Тип ответа
 DATA         // Данные
 CHECKSUM     // (sum + 0x40) & 0xFF
```

### Алгоритмы контрольной суммы
```cpp
// TX checksum (команда от APK)
uint8_t calcTXChecksum(uint8_t* data, uint8_t len) {
    uint8_t sum = 0;
    for (uint8_t i = 0; i < len; i++) {
        sum += data[i];
    }
    return (sum + 0x10) & 0xFF;
}

// RX checksum (ответ устройства)
uint8_t calcRXChecksum(uint8_t* data, uint8_t len) {
    uint8_t sum = 0;
    for (uint8_t i = 0; i < len; i++) {
        sum += data[i];
    }
    return (sum + 0x40) & 0xFF;
}
```

### Этапы обмена (Session Flow)
```
1. INIT (0x01)
   TX: F0 00 03 01 05 00 09
   RX: C0 00 27 FF ... CS (39 байт, полный статус)

2. HEARTBEAT (0x04 / 0x05)
   TX: F0 00 04 04 SEQ CS (каждые ~1000ms)
   RX: C0 00 02 05 SEQ CS

3. GAIN/FADE (0xA0)
   TX: F0 00 05 A0 10 0E 18 12 ED (Volume +)
   RX: C0 00 03 90 01 VV CS

4. WRITE PARAM (0x80)
   TX: Команды настройки (EQ, X-Over, TA)
   RX: C0 00 02 9F 80 CS (Confirm)

5. STATUS REQ (0x8E)
   TX: F0 00 03 8E CH CS
   RX: C0 00 .. 90 .. CS (Param Data)

6. TELEMETRY (0x92)
   RX: C0 00 02 92 XX CS (периодически от устройства)
```

### Команды управления (проверенные)

| # | Команда (HEX) | Действие | Длина |
|---|---------------|----------|-------|
| 1 | `F0 00 03 01 05 00 09` | Init | 7 |
| 2 | `F0 00 05 A0 10 0E 18 12 ED` | Volume + | 9 |
| 3 | `F0 00 05 A0 10 0E 18 10 EB` | Volume - | 9 |
| 4 | `F0 00 06 A0 10 0E 26 01 00 B8` | EQ FLAT | 10 |
| 5 | `F0 00 06 A0 10 0E 26 01 03 BB` | EQ ROCK | 10 |
| 6 | `F0 00 06 A0 10 0E 26 01 04 BC` | EQ POP | 10 |
| 7 | `F0 00 06 A0 10 0E 26 01 09 C1` | EQ JAZZ | 10 |
| 8 | `F0 00 06 A0 10 0E 26 01 0A C2` | EQ CLASSIC | 10 |

### Детальный разбор команды 0xA0
```
F0 00 05 A0 10 0E 18 12 ED
           │  │  │  │  │
           │  │  │  │  └─ Volume delta (0x12=+, 0x10=-)
           │  │  │  └──── Fixed 0x18 (subcommand)
           │  │  └─────── Fixed 0x0E
           │  └────────── Fixed 0x10
           └───────────── CMD=0xA0 (Gain/Fade)
```

Для EQ пресетов:
```
F0 00 06 A0 10 0E 26 01 XX CS
                    │  │  └─ Preset byte (0=FLAT, 3=ROCK, 4=POP, 9=JAZZ, 0A=CLASSIC)
                    │  └──── Channel (0x01)
                    └─────── Subcmd (0x26 = EQ Preset)
```

### Типы ответов RX

| Type | Length | Описание |
|------|--------|----------|
| 0x90 | 3-4 | Volume (0x90 0x01 VV) |
| 0x9A | 2-56 | EQ данные (субтипы: 0x20=Fader, 0x21=EQ, 0x2A=Balance) |
| 0xB0 | 3-4 | Bass |
| 0xB1 | 3 | Treble |
| 0x9F | 2 | Confirm (0x9F CMD) |
| 0x05 | 2+ | Heartbeat response |
| 0xFF | 6+ | Identification (полный статус) |

#### Формат Volume (0x90)
```
C0 00 03 90 01 VV CS
            │  └─ Volume 0-28 (0 = MUTE)
            └──── Fixed 0x01
```

#### Формат EQ Preset (0x9A 0x21)
```
C0 00 1B 9A 21 PP VV VV...VV CS
            │  │  └─ 10 значений (каждый байт: 00=-12dB, 7F=0dB, FF=+12dB)
            │  └──── Preset ID
            └─────── Subtype 0x21
```

### Парсинг ответов
```cpp
struct RCSPResponse {
    uint8_t type;
    uint8_t data[32];
    uint8_t dataLen;
};

RCSPResponse parseResponse(uint8_t* packet, uint8_t len) {
    RCSPResponse resp = {0};
    if (len < 4 || packet[0] != 0xC0) return resp;

    uint8_t dataLen = packet[2];
    resp.type = packet[3];
    resp.dataLen = dataLen - 1;

    for (int i = 0; i < resp.dataLen && i < 32; i++) {
        resp.data[i] = packet[4 + i];
    }

    return resp;
}

void handleResponse(RCSPResponse* resp) {
    switch (resp->type) {
        case 0x90: // Volume
            if (resp->dataLen >= 2 && resp->data[0] == 0x01) {
                uint8_t volume = resp->data[1];
            }
            break;
        case 0x9A: // EQ/Balance/Fader
            if (resp->dataLen >= 1) {
                uint8_t subtype = resp->data[0];
                // 0x20 = Fader, 0x21 = EQ, 0x2A = Balance
            }
            break;
        case 0x9F: // Confirm
            break;
        case 0x05: // Heartbeat response
            break;
        case 0xFF: // Identification
            break;
    }
}
```

### Как был восстановлен протокол (метод)
1. **HCI Snoop Log** — запись всего BLE-трафика с телефона
2. **Wireshark фильтр** `btatt` — выделение ATT пакетов
3. **nRF Connect** — просмотр GATT сервисов/характеристик
4. **Побайтовое сравнение** — для каждого действия UI записывались TX и RX
5. **Frida hook** — подтверждение на уровне Android API
6. **ESP32 сниффер** — подтверждение на радиоканале (MAC, RSSI)
7. **Checksum bruteforce** — подбор алгоритма: перебор XOR/sum/CRC, найдено `(sum + offset) & 0xFF`

### Структура лога для анализа
```json
{
  "direction": "TX",
  "cmd": "0x01",
  "payload_hex": "050000",
  "checksum_valid": true,
  "timestamp": "2026-05-07T10:30:00"
}
```

---

## 5. Wireshark фильтры для BLE

```bash
# Все BLE ATT пакеты
btatt

# ATT Write команды (TX клиента)
btatt.opcode == 0x52

# ATT Notifications (RX от сервера)
btatt.opcode == 0x1b

# ATT Read/Write by type
btatt.opcode == 0x08 || btatt.opcode == 0x16

# По конкретному UUID сервиса
btatt.service_uuid16 == 0xae00

# Хендлы характеристик
btatt.handle == 0x0024

# Индикации
btatt.opcode == 0x1d

# BLE Advertising пакеты
btle.advertising_address

# BLE Scanning
btle.scan_request || btle.scan_response

# Только пакеты с данными
btatt && frame.len > 10

# Исключить ACK/пустые пакеты
btatt && btatt.opcode != 0x00

# BLE Connection Events
btle.connection_handle

# Manufacturer Specific Data
btcommon.eir_ad.entry.type == 0xFF
```

---

## 6. Классический BT (BR/EDR) реверс-инжиниринг

### SDP (Service Discovery Protocol)
```bash
# Wireshark фильтр
btsdp

# RFCOMM каналы
btrfcomm

# L2CAP
btl2cap
```

### Инструменты для BT Classic
- **Ubertooth** — захват BT Basic Rate
- **btmon** (BlueZ) — мониторинг BlueZ стека на Linux
- **hcitool + wireshark** — захват HCI трафика на Linux
- **scapy** — манипуляция BT/BLE пакетами (Python)

---

## 7. Создание Wireshark dissector для кастомного BLE протокола

Пример Lua-диссектора для RCSP:

```lua
-- rcsp_dissector.lua
-- Wireshark Lua dissector for PROLOGY RCSP protocol
-- Копировать в ~/.local/lib/wireshark/plugins/

rcsp_protocol = Proto("RCSP", "PROLOGY Remote Control Serial Protocol")

-- Поля
local f_preamble = ProtoField.uint8("rcsp.preamble", "Preamble", base.HEX)
local f_flags    = ProtoField.uint8("rcsp.flags", "Flags", base.HEX)
local f_length   = ProtoField.uint8("rcsp.length", "Length", base.DEC)
local f_cmd      = ProtoField.uint8("rcsp.command", "Command", base.HEX)
local f_payload  = ProtoField.bytes("rcsp.payload", "Payload")
local f_checksum = ProtoField.uint8("rcsp.checksum", "Checksum", base.HEX)

rcsp_protocol.fields = {f_preamble, f_flags, f_length, f_cmd, f_payload, f_checksum}

function rcsp_protocol.dissector(buffer, pinfo, tree)
    pinfo.cols.protocol = "RCSP"
    local subtree = tree:add(rcsp_protocol, buffer(), "RCSP Protocol")

    -- Preamble (TX=0xF0, RX=0xC0)
    subtree:add(f_preamble, buffer(0, 1))

    -- Flags
    subtree:add(f_flags, buffer(1, 1))

    -- Length
    local len = buffer(2, 1):uint()
    subtree:add(f_length, buffer(2, 1))

    -- Command/Type
    subtree:add(f_cmd, buffer(3, 1))

    -- Payload
    if len > 1 then
        subtree:add(f_payload, buffer(4, len - 1))
    end

    -- Checksum
    subtree:add(f_checksum, buffer(4 + len - 1, 1))
end

-- Регистрация для анализа ATT Write/Notify по UUID характеристик
local btatt_table = DissectorTable.get("btatt")
btatt_table:add(0xae01, rcsp_protocol)  -- TX characteristic handle
btatt_table:add(0xae02, rcsp_protocol)  -- RX characteristic handle
```

---

## 8. ESP32 как BLE сниффер

### Конфигурация Marauder
Из `WiFiScan.cpp` (ESP32 Marauder):

```cpp
// Инициализация BLE сканирования
NimBLEDevice::init("");
pBLEScan = NimBLEDevice::getScan();
pBLEScan->setActiveScan(true);
pBLEScan->setInterval(100);
pBLEScan->setWindow(99);
pBLEScan->setMaxResults(0);  // бесконечный режим
pBLEScan->start(0, scanCompleteCB, false);

// Callback со всеми данными
class scanCallback : public NimBLEAdvertisedDeviceCallbacks {
    void onResult(NimBLEAdvertisedDevice* dev) {
        Serial.printf("MAC: %s, RSSI: %d, Name: %s\n",
            dev->getAddress().toString().c_str(),
            dev->getRSSI(),
            dev->getName().c_str());

        // Manufacturer Specific Data
        if (dev->haveManufacturerData()) {
            std::string manufData = dev->getManufacturerData();
            // Анализ Company ID и payload
            uint16_t companyId = (manufData[1] << 8) | manufData[0];
        }

        // Service UUIDs
        if (dev->haveServiceUUID()) {
            for (auto uuid : dev->getServiceUUIDs()) {
                Serial.printf("  Service: %s\n", uuid.toString().c_str());
            }
        }
    }
};
```

---

## 9. Расшифровка кастомных BLE протоколов — Checklist

- [ ] Определить Service UUID (16-bit или 128-bit)
- [ ] Найти все Characteristic UUID и их права (Read/Write/Notify/Indicate)
- [ ] Определить CCCD дескриптор (0x2902) — нужен для включения Notify
- [ ] Собрать пары TX/RX для каждого действия в приложении
- [ ] Идентифицировать preamble/framing байты (константы в начале пакета)
- [ ] Определить длину пакета (фиксированная или переменная)
- [ ] Найти поле длины и проверить соответствие
- [ ] Выделить Command ID и сопоставить с действиями
- [ ] Найти контрольную сумму: XOR → sum + offset → CRC-8 → CRC-16
- [ ] Проверить шифрование (повторяющиеся байты при одинаковых действиях?)
- [ ] Создать Wireshark dissector (Lua) для визуального анализа
- [ ] Написать эмулятор сервера для ESP32 (NimBLE или BLEDevice)
- [ ] Написать клиент для ESP32 для автоматизации

---

## 10. Инструменты в вашей директории

| Инструмент | Путь | Назначение |
|-----------|------|-----------|
| ESP32 Marauder | `firmware/ESP32Marauder/` | 11 режимов BLE сканирования, детектирование AirTag/Flipper |
| Marauder GUI | `marauder-gui/app.py` | GUI управление Marauder |
| PROLOGY BLE Client | `prology_ble_android_client.md` | Спецификация BLE клиента для PROLOGY |
| PROLOGY Emulator | `prology_ble_receiver_emulator.md` | Эмулятор BLE GATT сервера PROLOGY |
| PROLOGY Architecture | `prology_architecture_analysis.md` | Анализ протокола RCSP |
| Frida hook | `/media/mi/home_ext2/tools/PROLOGY_TOOLKIT/ble/interceptor/frida_bluetooth_hook.js` | Android BLE перехват |
| Python логгер | `/media/mi/home_ext2/tools/PROLOGY_TOOLKIT/ble/peripheral/prology_logger.py` | Логирование BLE в .log/.json |
| HCI лог | `/media/mi/home_ext2/tools/PROLOGY_TOOLKIT/ble/logs/btsnoop_hci.log.zip` | Wireshark-совместимый лог |
| ESP32 скетчи | `sketches/` | PlatformIO/Arduino скетчи для ESP32 |
| Flutter приложение | `/media/mi/home_ext2/tools/apk-analysis/` | Анализ Flutter/Dart BLE логики |
| Jieli SDK анализ | `/media/mi/home_ext2/tools/JL_BLE/` | Документация чипа Jieli AC6951 |

---

## 11. Быстрые команды для анализа

```bash
# Захват BLE через HCI на Linux
sudo btmon -w capture.pcap &
sudo hcitool lescan --duplicate   # активное сканирование

# Анализ в Wireshark
wireshark capture.pcap            # или btsnoop_hci.log
# Фильтр: btatt && frame.len < 300

# ESP32 Marauder BLE сканирование (через Serial)
screen /dev/ttyUSB0 115200
# В меню: Bluetooth → BLE Scan → All

# Конвертация btsnoop в pcap (Android btsnoop_hci.log уже в pcap формате)
# Никаких дополнительных действий не требуется — открывается напрямую в Wireshark

# Frida перехват BLE на Android
frida -U -f com.prology -l frida_bluetooth_hook.js

# Python BLE анализ через bleak
pip install bleak
python3 -c "
import asyncio
from bleak import BleakScanner

async def scan():
    devices = await BleakScanner.discover(return_adv=True)
    for addr, (dev, adv) in devices.items():
        print(f'{addr}: {dev.name} | RSSI: {adv.rssi} | '
              f'Data: {adv.manufacturer_data}')

asyncio.run(scan())
"

# Просмотр HCI лога в текстовом виде
hcidump -r btsnoop_hci.log

# Извлечение ATT операций из pcap с tshark
tshark -r capture.pcap -Y "btatt" -T fields \
  -e frame.number -e btatt.opcode -e btatt.handle \
  -e btatt.value
```

---

## 12. Ссылки на документацию

- `../media/mi/home_ext2/tools/PROLOGY_TOOLKIT/docs/RCSP_PROTOCOL.md` — Основная спецификация RCSP
- `../media/mi/home_ext2/tools/JL_BLE/JIELI_BLE_FULL_ANALYSIS.md` — Полный анализ BLE стека Jieli
- `../media/mi/home_ext2/tools/JL_BLE/Android-JL_Bluetooth/doc/JieLi_Home_SDK_V4.2.0_html_en/` — Jieli Home SDK документация
- `../media/mi/home_ext2/tools/apk-analysis/FLUTTER_BLUETOOTH_PROTOCOL_LEARNING.md` — Разбор Flutter BLE приложения
