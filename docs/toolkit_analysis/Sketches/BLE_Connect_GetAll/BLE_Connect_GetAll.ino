/*
 * ESP32 BLE CONNECT - GET ALL GATT SERVICES
 */

#include <BLEDevice.h>
#include <BLEUtils.h>
#include <BLEClient.h>

static BLEAddress targetAddress("90:20:71:5e:48:10");
static BLEClient* pClient = nullptr;
bool connected = false;

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

void setup() {
  Serial.begin(115200);
  delay(500);
  
  Serial.println("\n\n");
  Serial.println("╔══════════════════════════════════════════════════════════╗");
  Serial.println("║   ESP32 BLE CONNECTOR - GET ALL GATT                   ║");
  Serial.println("║   Target: PROLOGY_BLE (90:20:71:5e:48:10)          ║");
  Serial.println("╚══════════════════════════════════════════════════════════╝");
  
  BLEDevice::init("");
  pClient = BLEDevice::createClient();
  pClient->setClientCallbacks(new MyClientCallback());
  
  Serial.println("\n>>> CONNECTING TO TARGET <<<");
  pClient->connect(targetAddress);
  
  delay(3000);
  
  if (connected && pClient) {
    Serial.println("\n>>> GETTING ALL SERVICES <<<");
    std::map<std::string, BLERemoteService*>* services = pClient->getServices();
    
    Serial.printf("\n══════════════════════════════════════════════════════════\n");
    Serial.printf("FOUND %d SERVICES\n", services->size());
    Serial.printf("══════════════════════════════════════════════════════════\n");
    
    for (auto& svc : *services) {
      BLERemoteService* pSvc = svc.second;
      Serial.printf("\n╔══════════════════════════════════════════════════════════╗\n");
      Serial.printf("║ Service #\n", svc.first.c_str());
      Serial.printf("╚══════════════════════════════════════════════════════════╝\n");
      Serial.printf("\n[ UUID ] %s\n", pSvc->getUUID().toString().c_str());
      
      Serial.println("\n[ CHARACTERISTICS ]");
      std::map<std::string, BLERemoteCharacteristic*>* chars = pSvc->getCharacteristics();
      Serial.printf("Count: %d\n", chars->size());
      
      for (auto& ch : *chars) {
        BLERemoteCharacteristic* pChar = ch.second;
        Serial.printf("\n  ----------------------------------------\n");
        Serial.printf("  UUID: %s\n", pChar->getUUID().toString().c_str());
        Serial.printf("  Handle: 0x%04x\n", pChar->getHandle());
        Serial.printf("  Properties: ");
        if (pChar->canRead()) Serial.print("R ");
        if (pChar->canWrite()) Serial.print("W ");
        if (pChar->canWriteNoResponse()) Serial.print("WnR ");
        if (pChar->canNotify()) Serial.print("NOTIFY ");
        if (pChar->canIndicate()) Serial.print("IND ");
        Serial.println();
        
        if (pChar->canRead()) {
          std::string val = pChar->readValue();
          Serial.printf("  Value (%d): ", val.length());
          for (size_t i = 0; i < val.length() && i < 20; i++) {
            Serial.printf("%02X ", (uint8_t)val[i]);
          }
          Serial.println();
        }
      }
    }
  } else {
    Serial.println("\n>>> CONNECTION FAILED <<<");
  }
  
  Serial.println("\n>>> DONE <<<");
}

void loop() {
  delay(10000);
}