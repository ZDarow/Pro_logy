# PROLOGY BLE Receiver Emulator - Полная спецификация

Документ для создания прошивки ESP32, эмулирующей автомагнитолу PROLOGY CMD 300.

## Обзор

Эмулятор реализует BLE GATT сервер, имитирующий поведение ресивера PROLOGY CMD 300 на чипе Jieli AC6951.

## BLE Service & Characteristics

```
Service UUID:   0000ae00-0000-1000-8000-00805f9b34fb
TX Char UUID:   0000ae01-0000-1000-8000-00805f9b34fb (Write No Response)
RX Char UUID:   0000ae02-0000-1000-8000-00805f9b34fb (Notify)
Device Name:    PROLOGY_BLE (char 0x2A00)
```

## Протокол RCSP (Remote Control Serial Protocol)

### Формат пакета

```
[PREAMBLE][LEN][DATA...][CHECKSUM]
   1 байт    1 байт  N байт   1 байт
```

- **Preamble TX (APK → устройство):** `0xF0`
- **Preamble RX (устройство → APK):** `0xC0`
- **LEN:** длина данных (байты после LEN до CHECKSUM)

### Checksum

```c
// TX (команда от APK)
uint8_t tx_checksum = (sum(all_data_bytes) + 0x10) & 0xFF;

// RX (ответ устройства)
uint8_t rx_checksum = (sum(all_data_bytes) + 0x40) & 0xFF;

// В коде ESP32 эмулятора используется упрощенная формула:
uint8_t checksum = (sum(response_bytes) + 0x94) & 0xFF;
```

## Команды (TX от APK)

| CMD | Название | Payload | Описание |
|-----|---------|---------|----------|
| 0x01 | Init | пусто | Инициализация сессии |
| 0x04 | Heartbeat | 1 байт (seq) | Keep-alive (1 раз в сек) |
| 0x80 | Write Param | переменная | Запись параметров (EQ, X-Over) |
| 0x8A | Config Ext | переменная | Расширенная конфигурация |
| 0xA0 | Gain/Fade | 5+ байт | Громкость, Balance, Fader, Input |
| 0x05 | Heartbeat Resp | 1 байт | Ответ на heartbeat |

### Детальный разбор команды 0xA0 (Gain/Fade)

```
F0 00 05 A0 10 0E 18 12 ED
           │  │  │  │  │
           │  │  │  │  └─ Volume delta (0x12=+, 0x10=-)
           │  │  │  └──── Fixed 0x18
           │  │  └─────── Fixed 0x0E
           │  └────────── Fixed 0x10
           └───────────── CMD=0xA0
```

Для EQ пресетов:
```
F0 00 06 A0 10 0E 26 01 XX CS
                    │  │  └─ Preset byte
                    │  └──── Channel (01)
                    └─────── Subcmd (26 = EQ)
```

## Ответы (RX от устройства)

| Type | Length | Описание |
|------|--------|----------|
| 0x90 | 3-4 | Volume (0x90 0x01 VV) |
| 0x9A | 2-56 | EQ данные (субтипы ниже) |
| 0x9A 0x2A | 3 | Balance (9A 2A 03 VV) |
| 0x9A 0x20 | 3 | Fader (9A 20 01 VV) |
| 0x9A 0x21 | 25+ | EQ Preset (21 PP VV...) |
| 0xB0 | 3-4 | Bass |
| 0xB1 | 3 | Treble |
| 0x9F | 2 | Confirm (9F CMD) |
| 0x05 | 2+ | Status/Heartbeat response |
| 0xFF | 6+ | Identification |

### Формат ответа Volume (0x90)
```
C0 00 03 90 01 VV CS
            │  └─ Volume 0-28 (0=MUTE)
            └──── Fixed 0x01
```

### Формат ответа EQ Preset (0x9A 0x21)
```
C0 00 1B 9A 21 PP VV VV...VV CS
            │  │  └─ 25 значений (-12dB..+12dB)
            │  └──── Preset ID
            └─────── Subtype 0x21
```

Значения полос: `00` = -12dB, `7F` = 0dB, `FF` = +12dB

## EQ Пресеты

| Preset ID | Название | Байты (10-band) |
|-----------|----------|-----------------|
| 0x00 (00) | FLAT | 00 00 00 00 00 00 00 00 00 00 |
| 0x03 (03) | ROCK | 04 01 00 02 06 03 00 00 02 02 |
| 0x04 (04) | POP | 01 01 02 02 02 01 01 02 02 02 02 |
| 0x09 (09) | JAZZ | 01 01 00 00 FF 00 00 01 02 02 03 |
| 0x0A (10) | CLASSIC | 03 01 FF 00 02 02 01 00 00 00 03 |
| 0x05 (05) | USER1 | редактируемый |
| 0x06 (06) | USER2 | редактируемый |

## Структура состояния устройства

```c
struct PrologyState {
    uint8_t volume;      // 0-28 (0 = MUTE)
    uint8_t eq_preset;   // 0=FLAT, 3=ROCK, 4=POP, 9=JAZZ, 0A=CLASSIC
    int8_t balance;      // -128..+127 (0 = center, FE=left, 02=right)
    int8_t fader;        // -128..+127 (0 = center, FE=rear, 04=front)
    int8_t bass;         // -12..+12
    int8_t treble;       // -12..+12
    uint8_t input;       // 0=USB, 1=SD, 2=BT, 3=AUX, 4=RADIO
    bool muted;
};
```

## Полный ответ состояния (39 байт)

```
C0 00 27 FF VV II PP ?? ?? BB TT 00 04 BA 00 03 00 08 08 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 CS
            │  │  │  │  │  │
            │  │  │  │  │  └─ Treble (0-24, center=12)
            │  │  │  │  └──── Bass (0-24, center=12)
            │  │  │  └─────── Input
            │  │  └────────── EQ Preset
            │  └───────────── Volume
            └──────────────── Status type (0xFF)
```

## Пример реализации GATT сервера (ESP32 Arduino)

```cpp
#include <BLEDevice.h>
#include <BLEServer.h>
#include <BLEUtils.h>
#include <BLECharacteristic.h>

#define DEVICE_NAME        "PROLOGY_BLE"
#define SERVICE_UUID     "0000ae00-0000-1000-8000-00805f9b34fb"
#define CMD_CHAR_UUID    "0000ae01-0000-1000-8000-00805f9b34fb"
#define NOTIFY_CHAR_UUID "0000ae02-0000-1000-8000-00805f9b34fb"

BLECharacteristic *pCmdChar = NULL;
BLECharacteristic *pNotifyChar = NULL;
bool deviceConnected = false;

// Состояние
uint8_t volume = 15;
uint8_t eq_preset = 0;
int8_t balance = 0;
int8_t fader = 0;

class MyCharCallbacks : public BLECharacteristicCallbacks {
    void onWrite(BLECharacteristic *pCharacteristic) {
        std::string value = pCharacteristic->getValue();
        if (value.length() > 0) {
            uint8_t* cmd = (uint8_t*)value.c_str();
            handleCommand(cmd, value.length());
        }
    }
};

void handleCommand(uint8_t* cmd, uint8_t len) {
    if (cmd[0] != 0xF0) return;
    
    if (len >= 7 && cmd[3] == 0x01) {
        // INIT
        sendFullStateResponse();
    }
    else if (len >= 9 && cmd[3] == 0xA0 && cmd[6] == 0x18) {
        // Volume
        if (cmd[7] == 0x12 && volume < 28) volume++;
        else if (cmd[7] == 0x10 && volume > 0) volume--;
        sendVolumeResponse();
    }
    else if (len >= 10 && cmd[3] == 0xA0 && cmd[6] == 0x26) {
        // EQ Preset
        eq_preset = cmd[8];
        sendEQResponse();
    }
}

uint8_t calcChecksum(uint8_t* data, uint8_t len) {
    uint8_t sum = 0;
    for (uint8_t i = 0; i < len; i++) sum += data[i];
    return (sum + 0x94) & 0xFF;
}

void sendResponse(uint8_t* resp, uint8_t len) {
    if (!pNotifyChar || !deviceConnected) return;
    uint8_t packet[64];
    memcpy(packet, resp, len);
    packet[len] = calcChecksum(resp, len);
    pNotifyChar->setValue(packet, len + 1);
    pNotifyChar->notify();
}

void sendVolumeResponse() {
    uint8_t resp[] = {0xC0, 0x00, 0x03, 0x90, 0x01, volume};
    sendResponse(resp, 6);
}

void setup() {
    BLEDevice::init(DEVICE_NAME);
    BLEServer *pServer = BLEDevice::createServer();
    pServer->setCallbacks(new MyServerCallbacks());
    
    BLEService *pService = pServer->createService(SERVICE_UUID);
    
    pCmdChar = pService->createCharacteristic(
        CMD_CHAR_UUID, BLECharacteristic::PROPERTY_WRITE_NR);
    pCmdChar->setCallbacks(new MyCharCallbacks());
    
    pNotifyChar = pService->createCharacteristic(
        NOTIFY_CHAR_UUID, BLECharacteristic::PROPERTY_NOTIFY);
    pNotifyChar->addDescriptor(new BLE2902());
    
    pService->start();
    
    BLEAdvertising *pAdvertising = BLEDevice::getAdvertising();
    pAdvertising->addServiceUUID(SERVICE_UUID);
    pAdvertising->setMinInterval(32);  // 20ms
    pAdvertising->setMaxInterval(800); // 500ms
    pAdvertising->start();
}

void loop() {
    delay(100);
}
```

## Настройки Advertising (Best Practices)

```cpp
// Fast discovery (первые 30 сек)
pAdvertising->setMinInterval(32);   // 20ms
pAdvertising->setMaxInterval(32);

// Slow advertising (после подключения/дисконнекта)
pAdvertising->setMinInterval(800);  // 500ms
pAdvertising->setMaxInterval(800);
```

## Параметры подключения (Connection Parameters)

```cpp
#define CONN_INTERVAL_MIN  16   // 10ms
#define CONN_INTERVAL_MAX  32   // 20ms
#define SLAVE_LATENCY      4    // Skip 4 events when idle
#define SUPERVISION_TIMEOUT 500 // 500ms (>= 6x max interval)
```

## Тестирование

1. Загрузить прошивку на ESP32
2. На телефоне открыть nRF Connect
3. Найти устройство "PROLOGY_BLE"
4. Подключиться, включить уведомления на 0xAE02
5. Отправить команду Init: `F0 00 03 01 05 00 09` в 0xAE01
6. Наблюдать ответ в 0xAE02

## Известные команды для тестирования

| Действие | Команда (HEX) |
|----------|---------------|
| Init | `F0 00 03 01 05 00 09` |
| Volume + | `F0 00 05 A0 10 0E 18 12 ED` |
| Volume - | `F0 00 05 A0 10 0E 18 10 EB` |
| EQ FLAT | `F0 00 06 A0 10 0E 26 01 00 B8` |
| EQ ROCK | `F0 00 06 A0 10 0E 26 01 03 BB` |
| EQ POP | `F0 00 06 A0 10 0E 26 01 04 BC` |
| EQ JAZZ | `F0 00 06 A0 10 0E 26 01 09 C1` |
| EQ CLASSIC | `F0 00 06 A0 10 0E 26 01 0A C2` |

## Частотные полосы EQ (25-band)

| ID | Частота | ID | Частота |
|----|---------|----|---------|
| 03 | 31Hz | 0D | 4kHz |
| 04 | 62Hz | 0E | 8kHz |
| 05 | 125Hz | 0F | 16kHz |
| 06 | 250Hz | ... | ... |
| 07 | 500Hz | 1B | 25th band |
| 08 | 1kHz | | |

## Оптимизация памяти ESP32

- Flash: ~1.1MB (85% при полной эмуляции)
- RAM: ~39KB (11%)
- Использовать PSRAM для буферов если нужно >28-band EQ
- Отключить ненужные BLE features через `BLEDevice::setCustomGattsAttrTab`

## References

- Исходный код эмулятора: `/media/mi/home_ext2/tools/PROLOGY_TOOLKIT/Sketches/PROLOGY_Emulator/PROLOGY_Emulator.ino`
- Спецификация протокола: `/media/mi/home_ext2/tools/PROLOGY_TOOLKIT/docs/RCSP_PROTOCOL.md`
- Справочник команд: `/media/mi/home_ext2/tools/PROLOGY_TOOLKIT/PROLOGY_CMD300/COMMANDS.md`
