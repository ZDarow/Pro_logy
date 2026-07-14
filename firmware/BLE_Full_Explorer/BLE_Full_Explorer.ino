/*
 * ESP32 BLE FULL EXPLORER - All capabilities
 * 1. Connect to PROLOGY
 * 2. Enable ALL notifications
 * 3. Send commands + capture responses
 * 4. Dump EVERYTHING
 */

#include <BLEDevice.h>
#include <BLEUtils.h>
#include <BLEClient.h>
#include <BLERemoteCharacteristic.h>
#include <BLEUtils.h>

static BLEAddress targetAddress("90:20:71:5e:48:10");
static BLEClient* pClient = nullptr;
static BLERemoteCharacteristic* pNotifyChar = nullptr;
static BLERemoteCharacteristic* pCommandChar = nullptr;
bool connected = false;

uint8_t notifyHandle = 0;

class MyClientCallback : public BLEClientCallbacks {
  void onConnect(BLEClient* pclient) {
    Serial.println("\n>>> CONNECTED <<<");
    connected = true;
  }
  void onDisconnect(BLEClient* pclient) {
    Serial.println("\n>>> DISCONNECTED <<<");
    connected = false;
  }
};

void notificationCallback(BLERemoteCharacteristic* pBLERemoteCharacteristic, 
                       uint8_t* pData, size_t length, bool isNotify) {
  Serial.printf("\n[NOTIFY] handle 0x%04x (%d bytes): ", 
               pBLERemoteCharacteristic->getHandle(), length);
  for (size_t i = 0; i < length; i++) {
    Serial.printf("%02X ", pData[i]);
  }
  Serial.println();
  
  Serial.print("[NOTIFY] ASCII: ");
  for (size_t i = 0; i < length; i++) {
    if (pData[i] >= 32 && pData[i] < 127) Serial.print((char)pData[i]);
  }
  Serial.println();
}

void setup() {
  Serial.begin(115200);
  delay(500);
  
  Serial.println("\n\n");
  Serial.println("╔══════════════════════════════════════════════════════════╗");
  Serial.println("║   ESP32 BLE FULL EXPLORER v1.0                     ║");
  Serial.println("║   PROLOGY Complete Exploration                      ║");
  Serial.println("╚══════════════════════════════════════════════════════════╝");
  
  BLEDevice::init("");
  pClient = BLEDevice::createClient();
  pClient->setClientCallbacks(new MyClientCallback());
  
  Serial.println("\n>>> CONNECTING <<<");
  pClient->connect(targetAddress);
  delay(3000);
  
  if (!connected) {
    Serial.println(">>> CONNECTION FAILED <<<");
    return;
  }
  
  Serial.println("\n>>> DISCOVERING ALL SERVICES <<<");
  std::map<std::string, BLERemoteService*>* services = pClient->getServices();
  
  for (auto& svc : *services) {
    BLERemoteService* pSvc = svc.second;
    Serial.printf("\n╔══════════════════════════════════════════════════════════╗\n");
    Serial.printf("║ SERVICE: %s\n", pSvc->getUUID().toString().c_str());
    Serial.printf("╚══════════════════════════════════════════════════════════╝\n");
    
    std::map<std::string, BLERemoteCharacteristic*>* chars = pSvc->getCharacteristics();
    
    for (auto& ch : *chars) {
      BLERemoteCharacteristic* pChar = ch.second;
      Serial.printf("\n--- Char: %s ---\n", pChar->getUUID().toString().c_str());
      Serial.printf("Handle: 0x%04x\n", pChar->getHandle());
      Serial.printf("Properties: ");
      if (pChar->canRead()) Serial.print("R ");
      if (pChar->canWrite()) Serial.print("W ");
      if (pChar->canWriteNoResponse()) Serial.print("WnR ");
      if (pChar->canNotify()) Serial.print("NOTIFY ");
      if (pChar->canIndicate()) Serial.print("IND ");
      Serial.println();
      
      // Read value
      if (pChar->canRead()) {
        std::string val = pChar->readValue();
        if (val.length() > 0) {
          Serial.printf("Value (%d): ", val.length());
          for (size_t i = 0; i < val.length(); i++) {
            Serial.printf("%02X ", (uint8_t)val[i]);
          }
          Serial.println();
          
          Serial.print("ASCII: ");
          for (size_t i = 0; i < val.length(); i++) {
            if ((uint8_t)val[i] >= 32 && (uint8_t)val[i] < 127) Serial.print((char)val[i]);
          }
          Serial.println();
        }
      }
      
      // Check for descriptors
      std::map<std::string, BLERemoteDescriptor*>* descs = pChar->getDescriptors();
      if (descs->size() > 0) {
        Serial.printf("Descriptors (%d):\n", descs->size());
        for (auto& d : *descs) {
          BLERemoteDescriptor* pDesc = d.second;
          Serial.printf("  - %s handle=0x%04x\n", 
                     pDesc->getUUID().toString().c_str(), 
                     pDesc->getHandle());
          
          // Try to read descriptor value
          try {
            std::string dval = pDesc->readValue();
            if (dval.length() > 0) {
              Serial.printf("    Value: ");
              for (size_t i = 0; i < dval.length(); i++) {
                Serial.printf("%02X ", (uint8_t)dval[i]);
              }
              Serial.println();
            }
          } catch (...) {
            Serial.println("    (not readable)");
          }
        }
      }
      
      // Enable notifications for NOTIFY characteristics
      if (pChar->canNotify() || pChar->canIndicate()) {
        Serial.println(">>> ENABLING NOTIFICATION <<<");
        pChar->registerForNotify(notificationCallback);
        notifyHandle = pChar->getHandle();
      }
      
      // Save important characteristics
      if (pChar->getUUID().toString() == "0000ae01-0000-1000-8000-00805f9b34fb") {
        pCommandChar = pChar;
        Serial.println("*** SAVED AS COMMAND CHAR ***");
      }
      if (pChar->getUUID().toString() == "0000ae02-0000-1000-8000-00805f9b34fb") {
        pNotifyChar = pChar;
        Serial.println("*** SAVED AS NOTIFY CHAR ***");
      }
    }
  }
  
  delay(1000);
  
  Serial.println("\n\n");
  Serial.println("╔══════════════════════════════════════════════════════════╗");
  Serial.println("║   SENDING TEST COMMANDS                             ║");
  Serial.println("╚══════════════════════════════════════════════════════════╝");
  
  // Command 1: Initialize
  Serial.println("\n>>> SENDING: INIT <<<");
  uint8_t init_cmd[] = {0xF0, 0x00, 0x03, 0x01, 0x05, 0x00, 0x09};
  if (pCommandChar) {
    pCommandChar->writeValue((uint8_t*)init_cmd, 7, true);
  }
  delay(500);
  
  // Command 2: Volume UP
  Serial.println("\n>>> SENDING: VOL+ <<<");
  uint8_t vol_cmd[] = {0xF0, 0x00, 0x05, 0xA0, 0x10, 0x0E, 0x18, 0x12, 0xED};
  if (pCommandChar) {
    pCommandChar->writeValue((uint8_t*)vol_cmd, 9, true);
  }
  delay(500);
  
  // Command 3: Volume DOWN
  Serial.println("\n>>> SENDING: VOL- <<<");
  uint8_t vol_down[] = {0xF0, 0x00, 0x05, 0xA0, 0x10, 0x0E, 0x18, 0x10, 0xEB};
  if (pCommandChar) {
    pCommandChar->writeValue((uint8_t*)vol_down, 9, true);
  }
  delay(500);
  
  // Read all values again after commands
  Serial.println("\n>>> READING VALUES AFTER COMMANDS <<<");
  for (auto& svc : *services) {
    BLERemoteService* pSvc = svc.second;
    std::map<std::string, BLERemoteCharacteristic*>* chars = pSvc->getCharacteristics();
    for (auto& ch : *chars) {
      BLERemoteCharacteristic* pChar = ch.second;
      if (pChar->canRead()) {
        std::string val = pChar->readValue();
        if (val.length() > 0) {
          Serial.printf("\n[%s] ", pChar->getUUID().toString().c_str());
          for (size_t i = 0; i < val.length(); i++) {
            Serial.printf("%02X ", (uint8_t)val[i]);
          }
          Serial.println();
        }
      }
    }
  }
  
  Serial.println("\n\n>>> EXPLORATION COMPLETE <<<");
}

void loop() {
  delay(1000);
}