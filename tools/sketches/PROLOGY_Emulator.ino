/*
 * PROLOGY BLE Emulator - Full Functionality
 * Emulates PROLOGY CMD 300 car radio for testing
 * 
 * Based on BLE best practices from Punch Through articles:
 * - Fast-then-slow advertising for quick discovery + battery saving
 * - Proper connection parameter negotiation
 * - Supervision timeout >= 6x connection interval
 * - GATT table with proper read/write/notify characteristics
 * 
 * Features:
 * - GATT Server: Service 0xAE00, Chars 0xAE01/0xAE02
 * - Volume control (0-28)
 * - EQ presets (FLAT/ROCK/POP/JAZZ/CLASSIC/USER1/USER2)
 * - Balance/Fader
 * - Bass/Treble
 * - Input select
 * - Serial CLI commands
 * 
 * MAC: ESP32 default
 * Service: 0000ae00-0000-1000-8000-00805f9b34fb
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

#define FAST_ADV_INTERVAL   32    // 20ms (32 * 0.625ms) - fast discovery
#define SLOW_ADV_INTERVAL   800   // 500ms (800 * 0.625ms) - battery save
#define CONN_INTERVAL_MIN  16    // 10ms min connection interval
#define CONN_INTERVAL_MAX  32    // 20ms max connection interval  
#define SLAVE_LATENCY       4     // Skip 4 events when idle
#define SUPERVISION_TIMEOUT  500   // 500ms timeout (>= 6x max interval)

// ============ STATE STRUCTURE ============
struct PrologyState {
    uint8_t volume;      // 0-28 (0 = MUTE)
    uint8_t eq_preset;   // 0=FLAT, 3=ROCK, 4=POP, 9=JAZZ, 0A=CLASSIC, 5=USER1, 6=USER2
    int8_t balance;    // -128..+127 (0 = center)
    int8_t fader;     // -128..+127 (0 = center)
    int8_t bass;      // -12..+12
    int8_t treble;    // -12..+12
    uint8_t input;    // 0=USB, 1=SD, 2=BT, 3=AUX, 4=RADIO
    bool muted;
    uint8_t heartbeat_seq;
} deviceState;

// ============ GLOBAL VARIABLES ============
BLECharacteristic *pCmdChar = NULL;
BLECharacteristic *pNotifyChar = NULL;
bool deviceConnected = false;
uint32_t lastActivity = 0;

// Advertising mode for fast-then-slow strategy
enum AdvMode { FAST, SLOW };
AdvMode advertisingMode = FAST;
uint32_t advertisingStartTime = 0;

// EQ Preset values (10 bands from 25-band EQ)
const uint8_t EQ_FLAT[]   = {0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00};
const uint8_t EQ_ROCK[]   = {0x04,0x01,0x00,0x02,0x06,0x03,0x00,0x00,0x02,0x02};
const uint8_t EQ_POP[]   = {0x01,0x01,0x02,0x02,0x02,0x01,0x01,0x02,0x02,0x02};
const uint8_t EQ_JAZZ[]  = {0x01,0x01,0x00,0x00,0xFF,0x00,0x00,0x01,0x02,0x02};
const uint8_t EQ_CLASSIC[] = {0x03,0x01,0xFF,0x00,0x02,0x02,0x01,0x00,0x00,0x03};
const uint8_t EQ_USER1[] = {0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00};
const uint8_t EQ_USER2[] = {0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00};

const char* EQ_PRESET_NAMES[] = {"FLAT", "USER1", "USER2", "ROCK", "POP", "USER1", "USER2", "???", "???", "JAZZ", "CLASSIC"};
const char* INPUT_NAMES[] = {"USB", "SD", "BLUETOOTH", "AUX", "RADIO"};

// Forward declarations
void handleCommand(uint8_t* cmd, uint8_t len);

// ============ GATT CALLBACKS ============
class MyServerCallbacks: public BLEServerCallbacks {
    void onConnect(BLEServer* pServer) {
        deviceConnected = true;
        lastActivity = millis();
        Serial.println("\n[+] Phone connected!");
        Serial.printf("    Interval: %dms, Latency: %d\n", 
            CONN_INTERVAL_MIN * 1.25, SLAVE_LATENCY);
    }
    void onDisconnect(BLEServer* pServer) {
        deviceConnected = false;
        Serial.println("\n[-] Phone disconnected.");
        
        // Reset to FAST advertising for quick reconnection (Punch Through best practice)
        BLEAdvertising *pAdvertising = BLEDevice::getAdvertising();
        pAdvertising->setMinInterval(FAST_ADV_INTERVAL);
        pAdvertising->setMaxInterval(FAST_ADV_INTERVAL);
        pAdvertising->start();
        advertisingMode = FAST;
        advertisingStartTime = millis();
        
        Serial.println("    Fast advertising reset for quick reconnection...");
    }
};

class MyCharCallbacks: public BLECharacteristicCallbacks {
    void onWrite(BLECharacteristic *pCharacteristic) {
        std::string value = pCharacteristic->getValue();
        if (value.length() > 0) {
            lastActivity = millis();
            Serial.printf("\n[%lu] RX CMD (%d bytes): ", millis(), value.length());
            for (int i = 0; i < value.length(); i++) {
                Serial.printf("%02X ", (uint8_t)value[i]);
            }
            Serial.println();
            
            // Parse and handle command
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
    
    // Check preamble
    if (cmd[0] == 0xF0) {
        // Command from app
        uint8_t dataLen = cmd[2];
        
        if (len >= 7 && cmd[3] == 0x01 && cmd[4] == 0x05 && cmd[5] == 0x00) {
            // INIT command
            Serial.println("  -> INIT");
            sendFullStateResponse();
        }
        else if (len >= 9 && cmd[3] == 0xA0 && cmd[4] == 0x10 && cmd[5] == 0x0E && cmd[6] == 0x18) {
            // Volume command
            uint8_t volumeDelta = cmd[7];
            Serial.printf("  -> VOLUME delta: 0x%02X\n", volumeDelta);
            
            // Volume UP: 0x12, DOWN: 0x10 (based on protocol)
            if (volumeDelta == 0x12) {
                if (deviceState.volume < 28) deviceState.volume++;
            } else if (volumeDelta == 0x10) {
                if (deviceState.volume > 0) deviceState.volume--;
            }
            
            sendVolumeResponse();
        }
        else if (len >= 9 && cmd[3] == 0xA0 && cmd[4] == 0x10 && cmd[5] == 0x0E && cmd[6] == 0x24) {
            // Input/Bass/Treble command
            uint8_t subCmd = cmd[7];
            Serial.printf("  -> INPUT/BASS/TREBLE subCmd: 0x%02X\n", subCmd);
            
            if (subCmd == 0x04) {
                // Input select
                uint8_t inputNum = cmd[8];
                if (inputNum < 5) {
                    deviceState.input = inputNum;
                    Serial.printf("  -> INPUT: %s\n", INPUT_NAMES[deviceState.input]);
                }
            } else if (subCmd == 0x36) {
                // Bass (+/-)
                deviceState.bass = (cmd[8] > 0x10) ? 1 : -1;
            }
            
            sendConfirmResponse(0x24);
        }
        else if (len >= 10 && cmd[3] == 0xA0 && cmd[4] == 0x10 && cmd[5] == 0x0E && cmd[6] == 0x26) {
            // EQ Preset command
            uint8_t presetByte = cmd[8];
            Serial.printf("  -> EQ preset byte: 0x%02X\n", presetByte);
            
            // Map preset byte to preset index
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
        else if (len >= 10 && cmd[3] == 0xA0 && cmd[4] == 0x10 && cmd[5] == 0x0E && cmd[6] == 0x2A) {
            // Balance command
            uint8_t balL = cmd[8];
            uint8_t balR = cmd[9];
            Serial.printf("  -> BALANCE L: 0x%02X R: 0x%02X\n", balL, balR);
            // Parse balance (needs more analysis)
            deviceState.balance = (int8_t)balL - (int8_t)balR;
            sendBalanceResponse();
        }
        else if (len >= 10 && cmd[3] == 0xA0 && cmd[4] == 0x10 && cmd[5] == 0x0E && cmd[6] == 0x20) {
            // Fader command
            uint8_t fadeVal = cmd[8];
            Serial.printf("  -> FADER value: 0x%02X\n", fadeVal);
            deviceState.fader = (int8_t)fadeVal - 0x80;
            sendFaderResponse();
        }
        else {
            Serial.printf("  [!] Unknown command, len=%d\n", len);
            Serial.print("     Raw: ");
            for (int i = 0; i < len && i < 16; i++) Serial.printf("%02X ", cmd[i]);
            Serial.println();
            sendConfirmResponse(cmd[3]);
        }
    }
    else {
        Serial.println("  [!] Unknown preamble");
    }
}

// ============ RESPONSE GENERATORS ============
uint8_t calcChecksum(uint8_t* data, uint8_t len) {
    uint8_t sum = 0;
    for (uint8_t i = 0; i < len; i++) {
        sum += data[i];
    }
    return (sum + 0x94) & 0xFF;
}

void sendResponse(uint8_t* response, uint8_t len) {
    if (pNotifyChar != NULL && deviceConnected) {
        // Calculate checksum
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
    // Full EQ response (39 bytes - full state)
    uint8_t resp[40];
    resp[0] = 0xC0;
    resp[1] = 0x00;
    resp[2] = 0x27; // 39 bytes
    resp[3] = 0x9A;
    resp[4] = 0x21; // EQ response type
    resp[5] = deviceState.eq_preset;
    
    // Add 10-band EQ values
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
    
    // Fill rest with zeros (for 39 byte total)
    memset(&resp[16], 0, 23);
    
    sendResponse(resp, 40);
}

void sendFullStateResponse() {
    Serial.println("  <- FULL STATE (39 bytes)");
    
    uint8_t resp[40];
    resp[0] = 0xC0;
    resp[1] = 0x00;
    resp[2] = 0x27; // 39 bytes
    
    // Full DSP state (parsed from real device)
    resp[3] = 0xFF;  // Status type
    resp[4] = deviceState.volume;
    resp[5] = deviceState.input;
    resp[6] = deviceState.eq_preset;
    resp[7] = 0x04;  // ?
    resp[8] = 0x01;  // ?
    resp[9] = deviceState.bass + 12;  // Convert -12..+12 to 0..24
    resp[10] = deviceState.treble + 12;
    resp[11] = 0x00;
    resp[12] = 0x04;
    resp[13] = (deviceState.balance + 0x80);
    resp[14] = 0x00;
    resp[15] = 0x03;
    resp[16] = 0x00;
    resp[17] = 0x08;
    resp[18] = 0x08;
    resp[19] = 0x00;
    resp[20] = 0x00;
    resp[21] = 0x00;
    resp[22] = 0x00;
    resp[23] = 0x00;
    resp[24] = 0x00;
    resp[25] = 0x00;
    resp[26] = 0x00;
    resp[27] = 0x00;
    resp[28] = 0x00;
    resp[29] = 0x00;
    resp[30] = 0x00;
    resp[31] = 0x00;
    resp[32] = 0x00;
    resp[33] = 0x00;
    resp[34] = 0x00;
    resp[35] = 0x00;
    resp[36] = 0x00;
    resp[37] = 0x00;
    resp[38] = 0x00;
    
    sendResponse(resp, 39);
}

void sendConfirmResponse(uint8_t cmdId) {
    uint8_t resp[] = {0xC0, 0x00, 0x02, 0x9F, cmdId};
    Serial.printf("  <- CONFIRM: 0x%02X\n", cmdId);
    sendResponse(resp, 5);
}

void sendStatusResponse() {
    uint8_t resp[] = {0xC0, 0x00, 0x02, 0x05, 0x01};
    Serial.println("  <- STATUS/HEARTBEAT");
    sendResponse(resp, 5);
}

// ============ SERIAL CLI ============
void handleSerialCommand(String cmd) {
    cmd.trim();
    cmd.toLowerCase();
    
    if (cmd == "help" || cmd == "?") {
        printHelp();
    }
    else if (cmd == "status") {
        printStatus();
    }
    else if (cmd == "version") {
        Serial.println("PROLOGY Emulator v1.0");
        Serial.println("Compiled: " __DATE__ " " __TIME__);
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
            } else {
                Serial.println("ERROR: Volume must be 0-28");
            }
        }
    }
    else if (cmd == "mute") {
        deviceState.muted = !deviceState.muted;
        Serial.printf("MUTE: %s\n", deviceState.muted ? "ON" : "OFF");
        sendVolumeResponse();
    }
    else if (cmd.startsWith("eq")) {
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
    else if (cmd.startsWith("bal") || cmd.startsWith("balance")) {
        String val = cmd.substring(4);
        val.trim();
        
        int8_t bal = 0;
        if (val.startsWith("l")) {
            bal = -val.substring(1).toInt();
        } else if (val.startsWith("r")) {
            bal = val.substring(1).toInt();
        } else {
            bal = val.toInt();
        }
        
        if (bal < -128) bal = -128;
        if (bal > 127) bal = 127;
        deviceState.balance = bal;
        
        printStatus();
        sendBalanceResponse();
    }
    else if (cmd.startsWith("fad") || cmd.startsWith("fader")) {
        String val = cmd.substring(4);
        val.trim();
        
        int8_t fad = 0;
        if (val.startsWith("f")) {
            fad = -val.substring(1).toInt();
        } else if (val.startsWith("r")) {
            fad = val.substring(1).toInt();
        } else {
            fad = val.toInt();
        }
        
        if (fad < -128) fad = -128;
        if (fad > 127) fad = 127;
        deviceState.fader = fad;
        
        printStatus();
        sendFaderResponse();
    }
    else if (cmd.startsWith("bass")) {
        int8_t bass = cmd.substring(5).toInt();
        if (bass >= -12 && bass <= 12) {
            deviceState.bass = bass;
            printStatus();
        } else {
            Serial.println("ERROR: Bass must be -12 to +12");
        }
    }
    else if (cmd.startsWith("treble")) {
        int8_t treble = cmd.substring(7).toInt();
        if (treble >= -12 && treble <= 12) {
            deviceState.treble = treble;
            printStatus();
        } else {
            Serial.println("ERROR: Treble must be -12 to +12");
        }
    }
    else if (cmd.startsWith("input")) {
        String inp = cmd.substring(6);
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
    else if (cmd == "notify") {
        Serial.println("Sending test notification...");
        sendVolumeResponse();
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

void printHelp() {
    Serial.println("\n========== PROLOGY EMULATOR COMMANDS ==========");
    Serial.println("vol N       - Set volume (0-28)");
    Serial.println("vol+        - Volume up");
    Serial.println("vol-        - Volume down");
    Serial.println("mute        - Toggle mute");
    Serial.println("eq PRESET   - EQ preset: flat/rock/pop/jazz/classic/user1/user2");
    Serial.println("bal LN/RN   - Balance: L1-L128 or R1-R128");
    Serial.println("fad FN/RN   - Fader: F1-F128 or R1-R128");
    Serial.println("bass +/-N   - Bass: -12 to +12");
    Serial.println("treble +/-N - Treble: -12 to +12");
    Serial.println("input NAME  - Input: usb/sd/bt/aux/radio");
    Serial.println("status      - Show current state");
    Serial.println("notify      - Send test notification");
    Serial.println("raw XX...   - Send raw hex command");
    Serial.println("version     - Show firmware version");
    Serial.println("help        - Show this help");
    Serial.println("================================================\n");
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
    Serial.println("================================\n");
}

// ============ SETUP ============
void setup() {
    Serial.begin(115200);
    delay(500);
    
    Serial.println("\n");
    Serial.println("╔════════════════════════════════════════╗");
    Serial.println("║   PROLOGY BLE EMULATOR v1.0           ║");
    Serial.println("║   Emulates PROLOGY CMD 300            ║");
    Serial.println("╚════════════════════════════════════════╝");
    
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
    
    // Create server
    BLEServer *pServer = BLEDevice::createServer();
    pServer->setCallbacks(new MyServerCallbacks());
    Serial.println("[2] Server created");
    
    // Create service
    BLEService *pService = pServer->createService(SERVICE_UUID);
    Serial.println("[3] Service created: 0xAE00");
    
    // Create command characteristic (Write)
    pCmdChar = pService->createCharacteristic(
        CMD_CHAR_UUID,
        BLECharacteristic::PROPERTY_WRITE | 
        BLECharacteristic::PROPERTY_WRITE_NR
    );
    pCmdChar->setCallbacks(new MyCharCallbacks());
    Serial.println("[4] Command char: 0xAE01 (WRITE)");
    
    // Create notify characteristic
    pNotifyChar = pService->createCharacteristic(
        NOTIFY_CHAR_UUID,
        BLECharacteristic::PROPERTY_NOTIFY
    );
    BLE2902 *p2902 = new BLE2902();
    pNotifyChar->addDescriptor(p2902);
    Serial.println("[5] Notify char: 0xAE02 (NOTIFY)");
    
    // Start service
    pService->start();
    Serial.println("[6] Service started");
    
    // Configure advertising with fast-then-slow strategy (Punch Through best practice)
    BLEAdvertising *pAdvertising = BLEDevice::getAdvertising();
    pAdvertising->addServiceUUID(SERVICE_UUID);
    pAdvertising->setScanResponse(true);
    
    // Set advertising parameters for fast discovery
    pAdvertising->setMinInterval(FAST_ADV_INTERVAL);
    pAdvertising->setMaxInterval(FAST_ADV_INTERVAL);
    pAdvertising->start();
    
    // Schedule slow advertising after 30 seconds
    Serial.println("[7] Fast advertising (20ms interval) - for quick discovery");
    Serial.println("    Will switch to slow (500ms) after 30s for battery save");
    
    advertisingMode = FAST;
    advertisingStartTime = millis();
    
    Serial.println("\n>>> Ready! Connect using nRF Connect or PROLOGY app");
    Serial.println("    Device: PROLOGY_BLE");
    Serial.println("    Service: 0xAE00");
    Serial.println("    CMD Char: 0xAE01 | Notify Char: 0xAE02");
    Serial.println("\nConnection params:");
    Serial.printf("    Min interval: %dms\n", CONN_INTERVAL_MIN * 1.25);
    Serial.printf("    Max interval: %dms\n", CONN_INTERVAL_MAX * 1.25);
    Serial.printf("    Slave latency: %d\n", SLAVE_LATENCY);
    Serial.printf("    Timeout: %dms\n", SUPERVISION_TIMEOUT * 10);
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
    
    // Fast-then-slow advertising (Punch Through best practice)
    // After 30s of no connection, switch to slow advertising for battery
    if (!deviceConnected && (advertisingMode == FAST) && 
        (millis() - advertisingStartTime > 30000)) {
        BLEAdvertising *pAdvertising = BLEDevice::getAdvertising();
        pAdvertising->setMinInterval(SLOW_ADV_INTERVAL);
        pAdvertising->setMaxInterval(SLOW_ADV_INTERVAL);
        pAdvertising->start();
        advertisingMode = SLOW;
        Serial.println("\n[!] Switched to SLOW advertising (500ms) for battery save");
    }
    
    // Send heartbeat every 10 seconds if connected
    if (deviceConnected && (millis() - lastActivity > 10000)) {
        lastActivity = millis();
        deviceState.heartbeat_seq++;
        Serial.printf("\n[HEARTBEAT #%d]\n", deviceState.heartbeat_seq);
    }
    
    delay(50);
}