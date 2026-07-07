# PROLOGY BLE Android Client - Спецификация клиента

Документ для создания прошивки ESP32, эмулирующей Android приложение PROLOGY (BLE client).

## Обзор

ESP32 выступает в роли BLE клиента, подключается к ресиверу PROLOGY и отправляет команды управления.

## BLE Service & Characteristics (целевое устройство)

```
Service UUID:   0000ae00-0000-1000-8000-00805f9b34fb
TX Char UUID:   0000ae01-0000-1000-8000-00805f9b34fb (Write)
RX Char UUID:   0000ae02-0000-1000-8000-00805f9b34fb (Notify)
Device Name:    PROLOGY_BLE
```

## Последовательность подключения

```
1. Scan для "PROLOGY_BLE"
2. Connect к устройству
3. Discover services
4. Найти характеристику 0xAE01 (write) и 0xAE02 (notify)
5. Подписаться на уведомления 0xAE02 (write 0x2902 descriptor = 0x0100)
6. Отправить Init команду (0x01)
7. Получить ответ идентификации (0xFF)
8. Запустить heartbeat каждые 1000ms (0x04)
```

## Протокол RCSP - Команды клиента

### Формат пакета (TX)

```
[F0][00][LEN][CMD][PAYLOAD...][CHECKSUM]
 │   │   │    │     │          │
 │   │   │    │     │          └─ (sum + 0x10) & 0xFF
 │   │   │    │     └──────────── Параметры команды
 │   │   │    └────────────────── Command ID
 │   │   └─────────────────────── Длина данных (LEN)
 │   └─────────────────────────── Всегда 0x00?
 └─────────────────────────────── Preamble 0xF0
```

### Checksum (TX)

```cpp
uint8_t calcTXChecksum(uint8_t* data, uint8_t len) {
    uint8_t sum = 0;
    for (uint8_t i = 0; i < len; i++) {
        sum += data[i];
    }
    return (sum + 0x10) & 0xFF;
}
```

## Команды управления

### 1. Init (Инициализация сессии)

```cpp
// Команда: F0 00 03 01 05 00 09
uint8_t initCmd[] = {0xF0, 0x00, 0x03, 0x01, 0x05, 0x00, 0x09};
```

**Ответ:** Полный статус (39 байт) или Identification (0xFF)

### 2. Volume Up

```cpp
// Команда: F0 00 05 A0 10 0E 18 12 ED
uint8_t volUpCmd[] = {0xF0, 0x00, 0x05, 0xA0, 0x10, 0x0E, 0x18, 0x12, 0xED};
```

### 3. Volume Down

```cpp
// Команда: F0 00 05 A0 10 0E 18 10 EB
uint8_t volDownCmd[] = {0xF0, 0x00, 0x05, 0xA0, 0x10, 0x0E, 0x18, 0x10, 0xEB};
```

### 4. Set Volume Absolute

```cpp
// Для установки конкретного значения (0-28) нужно отправить delta
// Протокол использует относительное изменение, но можно послать несколько раз
void sendVolume(uint8_t targetVol) {
    if (targetVol > currentVol) {
        for (int i = 0; i < targetVol - currentVol; i++) {
            sendCmd(volUpCmd, 9);
            delay(50);
        }
    } else if (targetVol < currentVol) {
        for (int i = 0; i < currentVol - targetVol; i++) {
            sendCmd(volDownCmd, 9);
            delay(50);
        }
    }
}
```

### 5. EQ Presets

```cpp
// FLAT: F0 00 06 A0 10 0E 26 01 00 B8
uint8_t eqFlat[] = {0xF0, 0x00, 0x06, 0xA0, 0x10, 0x0E, 0x26, 0x01, 0x00, 0xB8};

// ROCK: F0 00 06 A0 10 0E 26 01 03 BB
uint8_t eqRock[] = {0xF0, 0x00, 0x06, 0xA0, 0x10, 0x0E, 0x26, 0x01, 0x03, 0xBB};

// POP: F0 00 06 A0 10 0E 26 01 04 BC
uint8_t eqPop[] = {0xF0, 0x00, 0x06, 0xA0, 0x10, 0x0E, 0x26, 0x01, 0x04, 0xBC};

// JAZZ: F0 00 06 A0 10 0E 26 01 09 C1
uint8_t eqJazz[] = {0xF0, 0x00, 0x06, 0xA0, 0x10, 0x0E, 0x26, 0x01, 0x09, 0xC1};

// CLASSIC: F0 00 06 A0 10 0E 26 01 0A C2
uint8_t eqClassic[] = {0xF0, 0x00, 0x06, 0xA0, 0x10, 0x0E, 0x26, 0x01, 0x0A, 0xC2};
```

### 6. Heartbeat

```cpp
// F0 00 04 04 SEQ CS (каждые 1000ms)
uint8_t hbCmd[7];
hbCmd[0] = 0xF0;
hbCmd[1] = 0x00;
hbCmd[2] = 0x04;
hbCmd[3] = 0x04;
hbCmd[4] = seq++;  // порядковый номер
hbCmd[6] = calcTXChecksum(&hbCmd[3], 2); // checksum для 04 + seq
```

### 7. Input Select

```cpp
// F0 00 06 A0 10 0E 24 04 XX YY
// XX = input number: 0=USB, 1=SD, 2=BT, 3=AUX, 4=RADIO
uint8_t inputCmd[] = {0xF0, 0x00, 0x06, 0xA0, 0x10, 0x0E, 0x24, 0x04, inputNum, checksum};
```

## Парсинг ответов (RX)

### Формат ответа

```
[C0][00][LEN][TYPE][DATA...][CHECKSUM]
 │   │   │    │     │       │
 │   │   │    │     │       └─ (sum + 0x40) & 0xFF
 │   │   │    │     └───────── Данные
 │   │   │    └─────────────── Type/Command ID
 │   │   └─────────────────── Длина
 │   └─────────────────────── Всегда 0x00?
 └─────────────────────────── Preamble 0xC0 (response)
```

### Парсер ответов

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
    resp.dataLen = dataLen - 1;  // минус type byte
    
    for (int i = 0; i < resp.dataLen && i < 32; i++) {
        resp.data[i] = packet[4 + i];
    }
    
    return resp;
}
```

### Обработка типов ответов

```cpp
void handleResponse(RCSPResponse* resp) {
    switch (resp->type) {
        case 0x90: // Volume
            if (resp->dataLen >= 2 && resp->data[0] == 0x01) {
                uint8_t volume = resp->data[1];
                Serial.printf("Volume: %d\n", volume);
            }
            break;
            
        case 0x9A: // EQ/Balance/Fader
            if (resp->dataLen >= 1) {
                uint8_t subtype = resp->data[0];
                if (subtype == 0x2A) {
                    Serial.println("Balance response");
                } else if (subtype == 0x20) {
                    Serial.println("Fader response");
                } else if (subtype == 0x21) {
                    Serial.printf("EQ Preset: %02X\n", resp->data[1]);
                }
            }
            break;
            
        case 0x9F: // Confirm
            Serial.printf("Confirm: CMD 0x%02X\n", resp->data[0]);
            break;
            
        case 0x05: // Heartbeat response
            Serial.println("Heartbeat OK");
            break;
            
        case 0xFF: // Identification
            Serial.println("Device identification");
            break;
    }
}
```

## Пример реализации BLE клиента (ESP32 Arduino)

```cpp
#include <BLEDevice.h>
#include <BLEClient.h>
#include <BLEUtils.h>

#define TARGET_NAME "PROLOGY_BLE"

static BLEClient* pClient = nullptr;
static BLERemoteCharacteristic* pCmdChar = nullptr;
static BLERemoteCharacteristic* pNotifyChar = nullptr;
static bool deviceConnected = false;
static bool servicesDiscovered = false;

// Callback для уведомлений
static void notifyCallback(BLERemoteCharacteristic* pChar, uint8_t* pData, size_t length, bool isNotify) {
    Serial.print("RX: ");
    for (size_t i = 0; i < length; i++) {
        Serial.printf("%02X ", pData[i]);
    }
    Serial.println();
    
    // Парсим ответ
    if (length >= 4 && pData[0] == 0xC0) {
        RCSPResponse resp = parseResponse(pData, length);
        handleResponse(&resp);
    }
}

class MyClientCallback : public BLEClientCallbacks {
    void onConnect(BLEClient* pclient) {
        deviceConnected = true;
        Serial.println("Connected!");
    }
    void onDisconnect(BLEClient* pclient) {
        deviceConnected = false;
        servicesDiscovered = false;
        Serial.println("Disconnected");
    }
};

class MyScanCallback : public BLEAdvertisedDeviceCallbacks {
    void onResult(BLEAdvertisedDevice advertisedDevice) {
        if (advertisedDevice.haveName() && 
            strcmp(advertisedDevice.getName().c_str(), TARGET_NAME) == 0) {
            BLEDevice::getScan()->stop();
            pClient->connect(&advertisedDevice);
        }
    }
};

void sendCommand(uint8_t* cmd, uint8_t len) {
    if (!pCmdChar || !deviceConnected) return;
    pCmdChar->writeValue(cmd, len, false);
    Serial.print("TX: ");
    for (int i = 0; i < len; i++) Serial.printf("%02X ", cmd[i]);
    Serial.println();
}

void setup() {
    Serial.begin(115200);
    BLEDevice::init("");
    
    pClient = BLEDevice::createClient();
    pClient->setClientCallbacks(new MyClientCallback());
    
    BLEScan* pScan = BLEDevice::getScan();
    pScan->setAdvertisedDeviceCallbacks(new MyScanCallback());
    pScan->setActiveScan(true);
    pScan->start(10);
}

void loop() {
    if (deviceConnected && !servicesDiscovered) {
        // Discover services
        BLEUUID serviceUUID("0000ae00-0000-1000-8000-00805f9b34fb");
        BLERemoteService* pService = pClient->getService(serviceUUID);
        
        if (pService) {
            // Get TX characteristic (write)
            pCmdChar = pService->getCharacteristic(BLEUUID("0000ae01-0000-1000-8000-00805f9b34fb"));
            
            // Get RX characteristic (notify)
            pNotifyChar = pService->getCharacteristic(BLEUUID("0000ae02-0000-1000-8000-00805f9b34fb"));
            
            if (pNotifyChar && pNotifyChar->canNotify()) {
                pNotifyChar->registerForNotify(notifyCallback);
            }
            
            servicesDiscovered = true;
            
            // Send init command
            uint8_t initCmd[] = {0xF0, 0x00, 0x03, 0x01, 0x05, 0x00, 0x09};
            sendCommand(initCmd, 7);
        }
    }
    
    // Heartbeat каждую секунду
    static uint32_t lastHB = 0;
    if (deviceConnected && servicesDiscovered && millis() - lastHB > 1000) {
        static uint8_t seq = 0;
        uint8_t hb[7] = {0xF0, 0x00, 0x04, 0x04, seq++, 0x00, 0x00};
        hb[6] = (0x04 + hb[4] + 0x10) & 0xFF;
        sendCommand(hb, 7);
        lastHB = millis();
    }
    
    delay(100);
}
```

## CLI команды для тестирования

```cpp
void handleSerialCommand(String cmd) {
    cmd.trim();
    cmd.toUpperCase();
    
    if (cmd == "VOL+") {
        uint8_t c[] = {0xF0, 0x00, 0x05, 0xA0, 0x10, 0x0E, 0x18, 0x12, 0xED};
        sendCommand(c, 9);
    }
    else if (cmd == "VOL-") {
        uint8_t c[] = {0xF0, 0x00, 0x05, 0xA0, 0x10, 0x0E, 0x18, 0x10, 0xEB};
        sendCommand(c, 9);
    }
    else if (cmd.startsWith("EQ ")) {
        String preset = cmd.substring(3);
        uint8_t* c;
        uint8_t len = 10;
        if (preset == "FLAT") c = (uint8_t*)"\xF0\x00\x06\xA0\x10\x0E\x26\x01\x00\xB8";
        else if (preset == "ROCK") c = (uint8_t*)"\xF0\x00\x06\xA0\x10\x0E\x26\x01\x03\xBB";
        else if (preset == "POP") c = (uint8_t*)"\xF0\x00\x06\xA0\x10\x0E\x26\x01\x04\xBC";
        else if (preset == "JAZZ") c = (uint8_t*)"\xF0\x00\x06\xA0\x10\x0E\x26\x01\x09\xC1";
        else if (preset == "CLASSIC") c = (uint8_t*)"\xF0\x00\x06\xA0\x10\x0E\x26\x01\x0A\xC2";
        else return;
        sendCommand(c, len);
    }
    else if (cmd == "INIT") {
        uint8_t c[] = {0xF0, 0x00, 0x03, 0x01, 0x05, 0x00, 0x09};
        sendCommand(c, 7);
    }
}
```

## Полный список протестированных команд

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

## Логирование трафика

Для отладки используйте кольцевой буфер:

```cpp
#define LOG_SIZE 50
struct LogEntry {
    uint32_t ts;
    char type; // 'C' = Command, 'N' = Notification
    uint8_t data[32];
    uint8_t len;
} logBuf[LOG_SIZE];
int logIdx = 0;

void addLog(char type, uint8_t* data, uint8_t len) {
    logBuf[logIdx].ts = millis();
    logBuf[logIdx].type = type;
    logBuf[logIdx].len = (len > 32) ? 32 : len;
    memcpy(logBuf[logIdx].data, data, logBuf[logIdx].len);
    logIdx = (logIdx + 1) % LOG_SIZE;
}
```

## Reconnect strategy

```cpp
void loop() {
    if (!deviceConnected) {
        static uint32_t lastReconnect = 0;
        if (millis() - lastReconnect > 5000) {
            Serial.println("Reconnecting...");
            BLEDevice::getScan()->start(10);
            lastReconnect = millis();
        }
    }
}
```

## References

- Исходный код клиента: `/media/mi/home_ext2/tools/PROLOGY_TOOLKIT/Sketches/PROLOGY_BLE_GATT_Client/PROLOGY_BLE_GATT_Client.ino`
- Python клиент: `/media/mi/home_ext2/tools/PROLOGY_TOOLKIT/linux_receiver_control.py`
- Спецификация протокола: `/media/mi/home_ext2/tools/PROLOGY_TOOLKIT/docs/RCSP_PROTOCOL.md`
