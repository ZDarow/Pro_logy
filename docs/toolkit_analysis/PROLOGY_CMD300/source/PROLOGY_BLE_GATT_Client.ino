/*
 * PROLOGY DSP Control - FULL LOGGING VERSION
 * Logs ALL commands and notifications for protocol mapping
 */

#include <Arduino.h>
#include <BLEDevice.h>
#include <BLEUtils.h>
#include <BLEClient.h>
#include <BLEAddress.h>

#define TARGET_NAME "PROLOGY_BLE"
static BLEClient* pClient = nullptr;
static BLERemoteCharacteristic* pCmdChar = nullptr;
static BLERemoteCharacteristic* pNotifyChar = nullptr;
static bool deviceConnected = false;
static bool doScan = false;
static bool servicesDiscovered = false;

// Log file in memory (circular buffer)
#define LOG_SIZE 50
struct LogEntry {
  uint32_t ts;
  char type; // 'C' = Command sent, 'N' = Notify received
  uint8_t data[32];
  uint8_t len;
};

static LogEntry logBuf[LOG_SIZE];
static int logIdx = 0;

void addLog(char type, uint8_t* data, uint8_t len) {
  logBuf[logIdx].ts = millis();
  logBuf[logIdx].type = type;
  logBuf[logIdx].len = (len > 32) ? 32 : len;
  memcpy(logBuf[logIdx].data, data, logBuf[logIdx].len);
  logIdx = (logIdx + 1) % LOG_SIZE;
}

void dumpLog() {
  Serial.println("\n=== LOG DUMP ===");
  for (int i = 0; i < LOG_SIZE; i++) {
    int idx = (logIdx + i) % LOG_SIZE;
    if (logBuf[idx].len > 0) {
      Serial.printf("%lu: [%c] ", logBuf[idx].ts, logBuf[idx].type);
      for (int j = 0; j < logBuf[idx].len; j++) {
        Serial.printf("%02x ", logBuf[idx].data[j]);
      }
      Serial.println();
    }
  }
  Serial.println("=== END LOG ===\n");
}

// Notification callback - LOG EVERYTHING!
static void notifyCallback(BLERemoteCharacteristic* pChar, uint8_t* pData, size_t length, bool isNotify) {
  Serial.print("NOTIFY: ");
  for (size_t i = 0; i < length; i++) {
    Serial.printf("%02x ", pData[i]);
  }
  
  // Parse known patterns
  if (length >= 6 && pData[0] == 0xc0 && pData[1] == 0x00) {
    uint8_t len = pData[2];
    if (len == 0x03 && pData[3] == 0x90 && pData[4] == 0x01) {
      Serial.printf(">>> VOL: %d", pData[5]);
    }
    else if (len == 0x02 && pData[3] == 0x05) {
      Serial.print(">>> STATUS");
    }
    else if (length > 0x20) {
      Serial.print(">>> FULL STATUS");
    }
  }
  Serial.println();
  
  // Log to buffer
  addLog('N', pData, length);
}

class MyClientCallback : public BLEClientCallbacks {
  void onConnect(BLEClient* pclient) override {
    deviceConnected = true;
    Serial.println("[+] Connected!");
  }
  void onDisconnect(BLEClient* pclient) override {
    deviceConnected = false;
    servicesDiscovered = false;
    pCmdChar = nullptr;
    pNotifyChar = nullptr;
    Serial.println("[-] Disconnected - Rescanning...");
    doScan = true;
  }
};

class MyScanCallback : public BLEAdvertisedDeviceCallbacks {
  void onResult(BLEAdvertisedDevice advertisedDevice) override {
    if (advertisedDevice.haveName() && 
        strcmp(advertisedDevice.getName().c_str(), TARGET_NAME) == 0) {
      Serial.println(">>> FOUND! Connecting...");
      BLEDevice::getScan()->stop();
      delay(100);
      if (pClient->connect(&advertisedDevice)) {
        Serial.println("[+] Connected successfully!");
      } else {
        Serial.println("[-] Connection failed! Rescanning...");
        doScan = true;
      }
    }
  }
};

// Command list for testing
static const uint8_t* commands[] = {
  (uint8_t*)"\xf0\x00\x03\x01\x05\x00\x09",
  (uint8_t*)"\xf0\x00\x05\xa0\x10\x0e\x18\x12\xed",
  (uint8_t*)"\xf0\x00\x05\xa0\x10\x0e\x24\x04\xb4",
  (uint8_t*)"\xf0\x00\x05\xa0\x10\x0e\x24\x36\x1d",
  (uint8_t*)"\xf0\x00\x06\xa0\x12\xea\x07\x04\x06\xb3"
};
static const char* cmdNames[] = {"Init", "VolUp", "Input?", "Bass?", "Something?"};
static int cmdIdx = 0;
static uint32_t lastCmdTime = 0;
static bool autoTest = true;

void sendCmd(int idx) {
  if (pCmdChar == nullptr || idx >= 5) return;
  int len = (idx == 0) ? 7 : (idx == 4) ? 10 : 9;
  Serial.printf("SEND [%s]: ", cmdNames[idx]);
  for (int i = 0; i < len; i++) {
    Serial.printf("%02x ", commands[idx][i]);
  }
  Serial.println();
  pCmdChar->writeValue((uint8_t*)commands[idx], len, false);
  addLog('C', (uint8_t*)commands[idx], len);
}

void setup() {
  Serial.begin(115200);
  delay(1000);
  Serial.println("=== PROLOGY DSP FULL LOGGING ===");
  Serial.println("Will log ALL traffic for protocol mapping");
  
  BLEDevice::init("");
  pClient = BLEDevice::createClient();
  pClient->setClientCallbacks(new MyClientCallback());
  
  BLEScan* pScan = BLEDevice::getScan();
  pScan->setAdvertisedDeviceCallbacks(new MyScanCallback());
  pScan->setActiveScan(true);
  pScan->setInterval(100);
  pScan->setWindow(99);
  
  doScan = true;
  Serial.println("Starting scan...");
  pScan->start(10, false);
}

void loop() {
  if (doScan) {
    Serial.println("Scanning...");
    BLEDevice::getScan()->start(10, false);
    doScan = false;
  }
  
  if (deviceConnected && !servicesDiscovered) {
    Serial.println("Discovering services...");
    auto services = pClient->getServices();
    if (services != nullptr) {
      for (auto& pair : *services) {
        auto chars = pair.second->getCharacteristics();
        if (chars) {
          for (auto& cpair : *chars) {
            uint16_t handle = cpair.second->getHandle();
            if (handle == 0x0009) {
              pCmdChar = cpair.second;
              Serial.println(">>> Command char (0x0009) ready!");
            }
            if (handle == 0x000b) {
              pNotifyChar = cpair.second;
              Serial.println(">>> Notify char (0x000b) ready!");
              if (pNotifyChar->canNotify()) {
                pNotifyChar->registerForNotify(notifyCallback);
                Serial.println(">>> Subscribed to notifications!");
              }
            }
          }
        }
      }
      servicesDiscovered = true;
      Serial.println("Ready! Sending init command...");
      sendCmd(0); // Init command
    }
  }
  
  // Auto-send commands for mapping
  if (deviceConnected && servicesDiscovered && autoTest) {
    if (millis() - lastCmdTime > 8000) { // Every 8 seconds
      if (cmdIdx < 5) {
        sendCmd(cmdIdx);
        cmdIdx++;
        lastCmdTime = millis();
      } else {
        Serial.println(">>> Auto-test complete! Dumping log...");
        dumpLog();
        autoTest = false;
      }
    }
  }
  
  // Manual command: send 'd' to dump log
  if (Serial.available()) {
    char c = Serial.read();
    if (c == 'd') {
      dumpLog();
    }
  }
  
  delay(100);
}
