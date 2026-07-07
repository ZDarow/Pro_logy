/*
 * PROLOGY Receiver Emulator for ESP32
 * Emulates PROLOGY CMD 300 car radio (Jieli AC6951)
 * 
 * Based on:
 * - /media/mi/home_ext2/tools/PROLOGY_TOOLKIT/docs/RCSP_PROTOCOL.md
 * - /media/mi/home_ext2/tools/PROLOGY_TOOLKIT/Sketches/PROLOGY_Emulator/PROLOGY_Emulator.ino
 * - /home/mi/esp32-projects/prology_ble_receiver_emulator.md
 * 
 * Protocol: RCSP (Remote Control Serial Protocol) over BLE GATT
 * Service UUID: 0000ae00-0000-1000-8000-00805f9b34fb
 * TX Char (Write): 0000ae01-...
 * RX Char (Notify): 0000ae02-...
 */

#include <BLEDevice.h>
#include <BLEServer.h>
#include <BLEUtils.h>
#include <BLECharacteristic.h>
#include <BLE2902.h>

// ============ DEFINITIONS ============
#define DEVICE_NAME        "PROLOGY_BLE"
#define SERVICE_UUID     "0000ae00-0000-1000-8000-00805f9b34fb"
#define CMD_CHAR_UUID    "0000ae01-0000-1000-8000-00805f9b34fb"
#define NOTIFY_CHAR_UUID "0000ae02-0000-1000-8000-00805f9b34fb"

// Connection parameters (Punch Through best practices)
#define FAST_ADV_INTERVAL   32   // 20ms
#define SLOW_ADV_INTERVAL   800  // 500ms
#define CONN_INTERVAL_MIN  16   // 10ms
#define CONN_INTERVAL_MAX  32   // 20ms
#define SLAVE_LATENCY      4
#define SUPERVISION_TIMEOUT 500 // 500ms

// ============ STATE STRUCTURE ============
struct PrologyState {
    uint8_t volume;      // 0-28 (0 = MUTE)
    uint8_t eq_preset;   // 0=FLAT, 3=ROCK, 4=POP, 9=JAZZ, 0xA=CLASSIC, 5=USER1, 6=USER2
    int8_t balance;     // -128..+127 (0 = center, FE=left, 02=right)
    int8_t fader;       // -128..+127 (0 = center, FE=rear, 04=front)
    int8_t bass;        // -12..+12
    int8_t treble;      // -12..+12
    uint8_t input;      // 0=USB, 1=SD, 2=BT, 3=AUX, 4=RADIO
    bool muted;
    uint8_t heartbeat_seq;
} deviceState;

// ============ GLOBAL VARIABLES ============
BLECharacteristic *pCmdChar = NULL;
BLECharacteristic *pNotifyChar = NULL;
bool deviceConnected = false;
uint32_t lastActivity = 0;

enum AdvMode { FAST, SLOW };
AdvMode advertisingMode = FAST;
uint32_t advertisingStartTime = 0;

// EQ Presets (10-band values from analysis)
const uint8_t EQ_FLAT[]   = {0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00};
const uint8_t EQ_ROCK[]   = {0x04,0x01,0x00,0x02,0x06,0x03,0x00,0x00,0x02,0x02};
const uint8_t EQ_POP[]    = {0x01,0x01,0x02,0x02,0x02,0x01,0x01,0x02,0x02,0x02};
const uint8_t EQ_JAZZ[]   = {0x01,0x01,0x00,0x00,0xFF,0x00,0x00,0x01,0x02,0x02};
const uint8_t EQ_CLASSIC[]= {0x03,0x01,0xFF,0x00,0x02,0x02,0x01,0x00,0x00,0x03};
const uint8_t EQ_USER1[]  = {0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00};
const uint8_t EQ_USER2[]  = {0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00};

const char* EQ_PRESET_NAMES[] = {"FLAT","USER1","USER2","ROCK","POP","USER1","USER2","???","???","JAZZ","CLASSIC"};
const char* INPUT_NAMES[] = {"USB","SD","BLUETOOTH","AUX","RADIO"};

// Forward declarations
void handleCommand(uint8_t* cmd, uint8_t len);
uint8_t calcChecksum(uint8_t* data, uint8_t len);
void sendResponse(uint8_t* response, uint8_t len);

// ============ BLE CALLBACKS ============
class MyServerCallbacks : public BLEServerCallbacks {
    void onConnect(BLEServer* pServer) {
        deviceConnected = true;
        lastActivity = millis();
        Serial.println("\n[+] Phone connected!");
        Serial.printf("    Interval: %dms, Latency: %d\n", 
            (int)(CONN_INTERVAL_MIN * 1.25), (int)SLAVE_LATENCY);
    }
    void onDisconnect(BLEServer* pServer) {
        deviceConnected = false;
        Serial.println("\n[-] Phone disconnected.");
        BLEAdvertising *pAdvertising = BLEDevice::getAdvertising();
        pAdvertising->setMinInterval(FAST_ADV_INTERVAL);
        pAdvertising->setMaxInterval(FAST_ADV_INTERVAL);
        pAdvertising->start();
        advertisingMode = FAST;
        advertisingStartTime = millis();
        Serial.println("    Fast advertising reset for quick reconnection...");
    }
};

class MyCharCallbacks : public BLECharacteristicCallbacks {
    void onWrite(BLECharacteristic *pCharacteristic) {
        String value = pCharacteristic->getValue();
        if (value.length() > 0) {
            lastActivity = millis();
            Serial.printf("\n[%lu] RX CMD (%d bytes): ", millis(), value.length());
            for (int i = 0; i < value.length(); i++) {
                Serial.printf("%02X ", (uint8_t)value[i]);
            }
            Serial.println();
            
            uint8_t* cmd = (uint8_t*)value.c_str();
            handleCommand(cmd, value.length());
        }
    }
};

// ============ COMMAND HANDLER ============
void handleCommand(uint8_t* cmd, uint8_t len) {
    if (len < 3) {
        Serial.println("  [!] Command too short");
        return;
    }
    
    // Check preamble (0xF0 for commands from app)
    if (cmd[0] == 0xF0) {
        uint8_t dataLen = cmd[2]; // LEN byte
        
        // Init command (0x01)
        if (len >= 6 && cmd[3] == 0x01) {
            Serial.println("  -> INIT");
            sendFullStateResponse();
        }
        // Heartbeat (0x04)
        else if (len >= 5 && cmd[3] == 0x04) {
            Serial.printf("  -> HEARTBEAT seq=%d\n", cmd[4]);
            deviceState.heartbeat_seq = cmd[4];
            sendHeartbeatResponse();
        }
        // Gain/Fade (0xA0) - Volume, Balance, Fader, Input, Bass, Treble
        else if (cmd[3] == 0xA0) {
            if (len >= 9 && cmd[4] == 0x10 && cmd[5] == 0x0E && cmd[6] == 0x18) {
                // Volume command (from BLE_Full_Control.ino: f0 00 05 a0 10 0e 18 12 ed)
                uint8_t volDelta = cmd[7];
                Serial.printf("  -> VOLUME delta: 0x%02X\n", volDelta);
                if (volDelta == 0x12 && deviceState.volume < 28) {
                    deviceState.volume++;
                } else if (volDelta == 0x10 && deviceState.volume > 0) {
                    deviceState.volume--;
                }
                sendVolumeResponse();
            }
            else if (len >= 10 && cmd[4] == 0x10 && cmd[5] == 0x0E && cmd[6] == 0x26) {
                // EQ Preset command (from BLE_Full_Control.ino)
                uint8_t presetByte = cmd[8];
                Serial.printf("  -> EQ preset byte: 0x%02X\n", presetByte);
                switch(presetByte) {
                    case 0x00: deviceState.eq_preset = 0; break; // FLAT
                    case 0x03: deviceState.eq_preset = 3; break; // ROCK
                    case 0x04: deviceState.eq_preset = 4; break; // POP
                    case 0x09: deviceState.eq_preset = 9; break; // JAZZ
                    case 0x0A: deviceState.eq_preset = 10; break; // CLASSIC
                    case 0x05: deviceState.eq_preset = 5; break; // USER1
                    case 0x06: deviceState.eq_preset = 6; break; // USER2
                }
                sendEQResponse();
            }
            else if (len >= 10 && cmd[4] == 0x10 && cmd[5] == 0x0E && cmd[6] == 0x2A) {
                // Balance command (from BLE_Full_Control.ino: f0 00 05 a0 10 0e 2a 03 00 b0)
                uint8_t balValue = cmd[8]; // 0x00=center, 0x32=left, 0xCE=right
                Serial.printf("  -> BALANCE: 0x%02X\n", balValue);
                deviceState.balance = (int8_t)(balValue - 0x80);
                sendBalanceResponse();
            }
            else if (len >= 10 && cmd[4] == 0x10 && cmd[5] == 0x0E && cmd[6] == 0x20) {
                // Fader command (from BLE_Full_Control.ino: f0 00 05 a0 10 0e 20 01 00 a6)
                uint8_t fadValue = cmd[8]; // 0x00=center, 0xFF=rear, 0x04=front
                Serial.printf("  -> FADER: 0x%02X\n", fadValue);
                deviceState.fader = (int8_t)(fadValue - 0x80);
                sendFaderResponse();
            }
            else if (len >= 10 && cmd[4] == 0x10 && cmd[5] == 0x0E && cmd[6] == 0x24) {
                // Input/Bass/Treble
                uint8_t subCmd = cmd[7];
                if (subCmd == 0x04) {
                    // Input select
                    uint8_t inputNum = cmd[8];
                    if (inputNum < 5) {
                        deviceState.input = inputNum;
                        Serial.printf("  -> INPUT: %s\n", INPUT_NAMES[deviceState.input]);
                    }
                }
                sendConfirmResponse(0xA0);
            }
            else {
                Serial.printf("  [!] Unknown 0xA0 subcmd, len=%d\n", len);
                sendConfirmResponse(0xA0);
            }
        }
        // Write Param (0x80) - X-Over, Time Alignment, etc.
        else if (cmd[3] == 0x80) {
            Serial.println("  -> WRITE PARAM (0x80)");
            Serial.print("     Payload: ");
            for (int i = 4; i < len-1 && i < 20; i++) Serial.printf("%02X ", cmd[i]);
            Serial.println();
            sendConfirmResponse(0x80);
        }
        // Config Ext (0x8A)
        else if (cmd[3] == 0x8A) {
            Serial.println("  -> CONFIG EXT (0x8A)");
            sendConfirmResponse(0x8A);
        }
        else {
            Serial.printf("  [!] Unknown cmd 0x%02X, len=%d\n", cmd[3], len);
            sendConfirmResponse(cmd[3]);
        }
    }
    else {
        Serial.println("  [!] Unknown preamble");
    }
}

// ============ RESPONSE GENERATORS ============
uint8_t calcChecksum(uint8_t* data, uint8_t len) {
    // Based on COMMANDS.md:287-296 - CS = 0x94 + last_data_byte
    // data[0..len-1] = full packet (header + data)
    // DATA starts at data[3], length = data[2]
    // Checksum = 0x94 + data[3 + data[2] - 1] (last data byte)
    uint8_t dataLen = data[2]; // LEN byte
    if (dataLen == 0 || 3 + dataLen > len) {
        return 0x94; // fallback
    }
    uint8_t lastDataByte = data[3 + dataLen - 1];
    return 0x94 + lastDataByte; // ADDITION, not XOR!
}

void sendResponse(uint8_t* response, uint8_t len) {
    if (pNotifyChar != NULL && deviceConnected) {
        uint8_t checksum = calcChecksum(response, len);
        uint8_t packet[64];
        memcpy(packet, response, len);
        packet[len] = checksum;
        
        pNotifyChar->setValue(packet, len + 1);
        pNotifyChar->notify();
        
        Serial.print("  <- TX NOTIFY: ");
        for (int i = 0; i <= len; i++) Serial.printf("%02X ", packet[i]);
        Serial.println();
    }
}

void sendVolumeResponse() {
    uint8_t resp[] = {0xC0, 0x00, 0x03, 0x90, 0x01, deviceState.muted ? 0 : deviceState.volume};
    Serial.printf("  <- VOLUME: %d\n", deviceState.muted ? 0 : deviceState.volume);
    sendResponse(resp, 6);
}

void sendBalanceResponse() {
    uint8_t bal = deviceState.balance + 0x80;
    uint8_t resp[] = {0xC0, 0x00, 0x03, 0x9A, 0x2A, 0x03, bal};
    Serial.printf("  <- BALANCE: %d\n", deviceState.balance);
    sendResponse(resp, 7);
}

void sendFaderResponse() {
    uint8_t fad = deviceState.fader + 0x80;
    uint8_t resp[] = {0xC0, 0x00, 0x03, 0x9A, 0x20, 0x01, fad};
    Serial.printf("  <- FADER: %d\n", deviceState.fader);
    sendResponse(resp, 7);
}

void sendEQResponse() {
    Serial.printf("  <- EQ: %s\n", EQ_PRESET_NAMES[deviceState.eq_preset]);
    uint8_t resp[43]; // 3 (header) + 39 (data) = 42 bytes, +1 checksum = 43
    resp[0] = 0xC0;
    resp[1] = 0x00;
    resp[2] = 0x27; // LEN: 39 bytes
    resp[3] = 0x9A;
    resp[4] = 0x21; // EQ response type
    resp[5] = deviceState.eq_preset;
    
    const uint8_t* eqVals;
    switch(deviceState.eq_preset) {
        case 0: eqVals = EQ_FLAT; break;
        case 3: eqVals = EQ_ROCK; break;
        case 4: eqVals = EQ_POP; break;
        case 9: eqVals = EQ_JAZZ; break;
        case 10: eqVals = EQ_CLASSIC; break;
        case 5: eqVals = EQ_USER1; break;
        case 6: eqVals = EQ_USER2; break;
        default: eqVals = EQ_FLAT;
    }
    memcpy(&resp[6], eqVals, 10);
    memset(&resp[16], 0, 23); // Zero indices 16..38 (23 bytes)
    // resp[39..41] should be zeroed too (indices 39, 40, 41 = 3 bytes)
    resp[39] = 0x00;
    resp[40] = 0x00;
    resp[41] = 0x00;
    
    sendResponse(resp, 42); // 3 (C0 00 27) + 39 (data) = 42 bytes
}

void sendFullStateResponse() {
    Serial.println("  <- FULL STATE (39 bytes)");
    // Based on COMMANDS.md:106-110: c0 00 27 FF 00 04 01 05 07 04 00 04 02 c5...
    uint8_t resp[43]; // 3 (header) + 39 (data) + 1 (checksum) = 43 bytes total
    resp[0] = 0xC0;
    resp[1] = 0x00;
    resp[2] = 0x27; // Length: 39 bytes
    resp[3] = 0xFF; // Type: Identification
    resp[4] = 0x00; // Volume = 0 (MUTE) for INIT
    resp[5] = 0x04; // Fixed
    resp[6] = 0x01; // Fixed
    resp[7] = 0x05; // Fixed
    resp[8] = 0x07; // Fixed
    resp[9] = 0x04; // Fixed
    resp[10] = 0x00; // Input
    resp[11] = 0x04; // Fixed
    resp[12] = 0x02; // Fixed
    resp[13] = 0xC5; // Fixed from example
    resp[14] = 0x00; // EQ preset
    resp[15] = 0x03; // Fixed
    resp[16] = 0x00; // Fixed
    resp[17] = 0x08; // Fixed
    resp[18] = 0x08; // Fixed
    resp[19] = 0x00; // Reserved
    resp[20] = 0x03; // Fixed
    resp[21] = 0x00; // Reserved
    resp[22] = 0x08; // Fixed
    resp[23] = 0x08; // Fixed
    // Fill rest with zeros (indices 24-41 = 18 bytes, total data = 39 bytes)
    for (int i = 24; i <= 41; i++) resp[i] = 0x00;
    
    sendResponse(resp, 42); // 3 (header) + 39 (data) = 42 bytes (checksum calculated on data[3..41])
}

void sendConfirmResponse(uint8_t cmdId) {
    uint8_t resp[] = {0xC0, 0x00, 0x02, 0x9F, cmdId};
    Serial.printf("  <- CONFIRM: 0x%02X\n", cmdId);
    sendResponse(resp, 5);
}

void sendHeartbeatResponse() {
    uint8_t resp[] = {0xC0, 0x00, 0x02, 0x05, deviceState.heartbeat_seq};
    Serial.println("  <- HEARTBEAT RESP");
    sendResponse(resp, 5);
}

// ============ SERIAL CLI ============
void handleSerialCommand(String cmd) {
    cmd.trim();
    cmd.toLowerCase();
    
    if (cmd == "help" || cmd == "?") {
        Serial.println("\n========== PROLOGY EMULATOR COMMANDS ==========");
        Serial.println("vol N       - Set volume (0-28)");
        Serial.println("vol+        - Volume up");
        Serial.println("vol-        - Volume down");
        Serial.println("mute        - Toggle mute");
        Serial.println("eq PRESET   - EQ preset: flat/rock/pop/jazz/classic/user1/user2");
        Serial.println("bal N       - Balance: -128 to +127");
        Serial.println("fad N       - Fader: -128 to +127");
        Serial.println("bass N      - Bass: -12 to +12");
        Serial.println("treble N    - Treble: -12 to +12");
        Serial.println("input NAME  - Input: usb/sd/bt/aux/radio");
        Serial.println("status      - Show current state");
        Serial.println("notify      - Send test notification");
        Serial.println("raw XX...   - Send raw hex command");
        Serial.println("help        - Show this help");
        Serial.println("===============================================\n");
    }
    else if (cmd == "status") {
        printStatus();
    }
    else if (cmd.startsWith("vol")) {
        if (cmd == "vol+") {
            if (deviceState.volume < 28) deviceState.volume++;
            printStatus();
            sendVolumeResponse();
        }
        else if (cmd == "vol-") {
            if (deviceState.volume > 0) deviceState.volume--;
            printStatus();
            sendVolumeResponse();
        }
        else if (cmd.startsWith("vol ")) {
            int vol = cmd.substring(4).toInt();
            if (vol >= 0 && vol <= 28) {
                deviceState.volume = vol;
                printStatus();
                sendVolumeResponse();
            }
        }
    }
    else if (cmd == "mute") {
        deviceState.muted = !deviceState.muted;
        Serial.printf("MUTE: %s\n", deviceState.muted ? "ON" : "OFF");
        sendVolumeResponse();
    }
    else if (cmd.startsWith("eq ")) {
        String preset = cmd.substring(3);
        preset.trim();
        if (preset == "flat") deviceState.eq_preset = 0;
        else if (preset == "rock") deviceState.eq_preset = 3;
        else if (preset == "pop") deviceState.eq_preset = 4;
        else if (preset == "jazz") deviceState.eq_preset = 9;
        else if (preset == "classic") deviceState.eq_preset = 10;
        else if (preset == "user1") deviceState.eq_preset = 5;
        else if (preset == "user2") deviceState.eq_preset = 6;
        else {
            Serial.println("ERROR: Use eq flat/rock/pop/jazz/classic/user1/user2");
            return;
        }
        printStatus();
        sendEQResponse();
    }
    else if (cmd.startsWith("bal ")) {
        int8_t bal = cmd.substring(4).toInt();
        if (bal < -128) bal = -128;
        if (bal > 127) bal = 127;
        deviceState.balance = bal;
        printStatus();
        sendBalanceResponse();
    }
    else if (cmd.startsWith("fad ")) {
        int8_t fad = cmd.substring(4).toInt();
        if (fad < -128) fad = -128;
        if (fad > 127) fad = 127;
        deviceState.fader = fad;
        printStatus();
        sendFaderResponse();
    }
    else if (cmd.startsWith("bass ")) {
        int8_t bass = cmd.substring(5).toInt();
        if (bass >= -12 && bass <= 12) {
            deviceState.bass = bass;
            printStatus();
        }
    }
    else if (cmd.startsWith("treble ")) {
        int8_t treble = cmd.substring(7).toInt();
        if (treble >= -12 && treble <= 12) {
            deviceState.treble = treble;
            printStatus();
        }
    }
    else if (cmd.startsWith("input ")) {
        String inp = cmd.substring(7);
        inp.trim();
        if (inp == "usb") deviceState.input = 0;
        else if (inp == "sd") deviceState.input = 1;
        else if (inp == "bt") deviceState.input = 2;
        else if (inp == "aux") deviceState.input = 3;
        else if (inp == "radio") deviceState.input = 4;
        else {
            Serial.println("ERROR: Use input usb/sd/bt/aux/radio");
            return;
        }
        printStatus();
    }
    else if (cmd == "raw") {
        Serial.println("ERROR: Use raw <hex bytes>");
    }
    else if (cmd.startsWith("raw ")) {
        String hexStr = cmd.substring(4);
        hexStr.replace(" ", "");
        uint8_t rawData[64];
        uint8_t rawLen = 0;
        for (int i = 0; i < hexStr.length() && rawLen < 64; i += 2) {
            String byteStr = hexStr.substring(i, i + 2);
            rawData[rawLen++] = strtol(byteStr.c_str(), NULL, 16);
        }
        Serial.printf("Sending raw (%d bytes): ", rawLen);
        for (int i = 0; i < rawLen; i++) Serial.printf("%02X ", rawData[i]);
        Serial.println();
        handleCommand(rawData, rawLen);
    }
    else {
        Serial.printf("Unknown command: %s\n", cmd.c_str());
        Serial.println("Type 'help' for available commands.");
    }
}

void printStatus() {
    Serial.println("\n========== PROLOGY STATE ==========");
    Serial.printf("Volume:     %d %s\n", 
        deviceState.muted ? 0 : deviceState.volume,
        deviceState.muted ? "(MUTED)" : "");
    Serial.printf("EQ Preset:  %s\n", EQ_PRESET_NAMES[deviceState.eq_preset]);
    Serial.printf("Balance:    %d\n", deviceState.balance);
    Serial.printf("Fader:      %d\n", deviceState.fader);
    Serial.printf("Bass:       %+d dB\n", deviceState.bass);
    Serial.printf("Treble:     %+d dB\n", deviceState.treble);
    Serial.printf("Input:      %s\n", INPUT_NAMES[deviceState.input]);
    Serial.printf("Connected:  %s\n", deviceConnected ? "YES" : "NO");
    Serial.println("===================================\n");
}

// ============ SETUP ============
void setup() {
    Serial.begin(115200);
    delay(500);
    
    Serial.println("\n");
    Serial.println("╔════════════════════════════════════╗");
    Serial.println("║   PROLOGY RECEIVER EMULATOR v1.0   ║");
    Serial.println("║   Emulates PROLOGY CMD 300       ║");
    Serial.println("╚════════════════════════════════════╝");
    
    // Initialize state
    deviceState.volume = 10;
    deviceState.eq_preset = 0;
    deviceState.balance = 0;
    deviceState.fader = 0;
    deviceState.bass = 0;
    deviceState.treble = 0;
    deviceState.input = 0;
    deviceState.muted = false;
    deviceState.heartbeat_seq = 0;
    
    // Initialize BLE
    Serial.println("\n[1] Initializing BLE...");
    BLEDevice::init(DEVICE_NAME);
    Serial.printf("    Device name: %s\n", DEVICE_NAME);
    
    BLEServer *pServer = BLEDevice::createServer();
    pServer->setCallbacks(new MyServerCallbacks());
    Serial.println("[2] Server created");
    
    BLEService *pService = pServer->createService(SERVICE_UUID);
    Serial.println("[3] Service created: 0xAE00");
    
    pCmdChar = pService->createCharacteristic(
        CMD_CHAR_UUID,
        BLECharacteristic::PROPERTY_WRITE | 
        BLECharacteristic::PROPERTY_WRITE_NR
    );
    pCmdChar->setCallbacks(new MyCharCallbacks());
    Serial.println("[4] Command char: 0xAE01 (WRITE)");
    
    pNotifyChar = pService->createCharacteristic(
        NOTIFY_CHAR_UUID,
        BLECharacteristic::PROPERTY_NOTIFY
    );
    BLE2902 *p2902 = new BLE2902();
    pNotifyChar->addDescriptor(p2902);
    Serial.println("[5] Notify char: 0xAE02 (NOTIFY)");
    
    pService->start();
    Serial.println("[6] Service started");
    
    BLEAdvertising *pAdvertising = BLEDevice::getAdvertising();
    pAdvertising->addServiceUUID(SERVICE_UUID);
    pAdvertising->setScanResponse(true);
    pAdvertising->setMinInterval(FAST_ADV_INTERVAL);
    pAdvertising->setMaxInterval(FAST_ADV_INTERVAL);
    pAdvertising->start();
    
    advertisingMode = FAST;
    advertisingStartTime = millis();
    
    Serial.println("\n>>> Ready! Connect using nRF Connect or PROLOGY app");
    Serial.println("    Device: PROLOGY_BLE");
    Serial.println("    Service: 0000ae00-...");
    Serial.println("    CMD Char: 0000ae01 | Notify Char: 0000ae02");
    Serial.println("\nType 'help' for Serial CLI commands.\n");
    
    printStatus();
}

// ============ LOOP ============
void loop() {
    // Handle Serial input
    while (Serial.available()) {
        String cmd = Serial.readStringUntil('\n');
        if (cmd.length() > 0) {
            Serial.printf("[CLI] %s\n", cmd.c_str());
            handleSerialCommand(cmd);
        }
    }
    
    // Fast-then-slow advertising
    if (!deviceConnected && (advertisingMode == FAST) && 
        (millis() - advertisingStartTime > 30000)) {
        BLEAdvertising *pAdvertising = BLEDevice::getAdvertising();
        pAdvertising->setMinInterval(SLOW_ADV_INTERVAL);
        pAdvertising->setMaxInterval(SLOW_ADV_INTERVAL);
        pAdvertising->start();
        advertisingMode = SLOW;
        Serial.println("\n[!] Switched to SLOW advertising (500ms) for battery save");
    }
    
    delay(50);
}
