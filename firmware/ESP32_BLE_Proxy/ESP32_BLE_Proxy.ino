/*
 * ESP32 BLE Proxy - SUPER SIMPLE
 * Just logs ALL traffic to Serial
 */

#include <Arduino.h>
#include <BLEDevice.h>
#include <BLEServer.h>
#include <BLEClient.h>
#include <BLEUtils.h>
#include <BLECharacteristic.h>

#define TARGET_NAME "PROLOGY_BLE"

// For Phone (GATT Server)
BLECharacteristic* pPhoneCmd = NULL;
BLECharacteristic* pPhoneNotify = NULL;
bool phoneConnected = false;

// For Receiver (GATT Client)
BLEClient* pClient = NULL;
BLERemoteCharacteristic* pRecvCmd = NULL;
BLERemoteCharacteristic* pRecvNotify = NULL;
bool recvConnected = false;

// ===== PHONE CALLBACKS (Server) =====

class PhoneCB : public BLECharacteristicCallbacks {
  void onWrite(BLECharacteristic* pChar) {
    String val = pChar->getValue();
    if (val.length() > 0) {
      Serial.print("[PHONE] ");
      for (int i=0; i<val.length(); i++) Serial.printf("%02x ", val[i]);
      Serial.println();
      
      // Forward to receiver
      if (recvConnected && pRecvCmd) {
        pRecvCmd->writeValue((uint8_t*)val.c_str(), val.length(), false);
        Serial.println("  -> Forwarded to RECEIVER");
      }
    }
  }
};

class PhoneSrvCB : public BLEServerCallbacks {
  void onConnect(BLEServer* pServer) {
    phoneConnected = true;
    Serial.println("[+] Phone connected");
  }
  void onDisconnect(BLEServer* pServer) {
    phoneConnected = false;
    Serial.println("[-] Phone disconnected");
    BLEDevice::startAdvertising();
  }
};

// ===== RECEIVER CALLBACKS (Client) =====

class RecvNotifyCB : public BLERemoteCharacteristicCallbacks {
  void onNotify(BLERemoteCharacteristic* pChar, uint8_t* pData, size_t len, bool isNotify) {
    Serial.print("[RECV] ");
    for (size_t i=0; i<len; i++) Serial.printf("%02x ", pData[i]);
    Serial.println();
    
    // Forward to phone
    if (phoneConnected && pPhoneNotify) {
      pPhoneNotify->setValue((uint8_t*)pData, len);
      pPhoneNotify->notify();
      Serial.println("  -> Forwarded to PHONE");
    }
  }
};

class RecvClientCB : public BLEClientCallbacks {
  void onConnect(BLEClient* pclient) {
    recvConnected = true;
    Serial.println("[+] Connected to RECEIVER");
  }
  void onDisconnect(BLEClient* pclient) {
    recvConnected = false;
    pRecvCmd = NULL;
    pRecvNotify = NULL;
    Serial.println("[-] Disconnected from receiver");
  }
};

class RecvScanCB : public BLEAdvertisedDeviceCallbacks {
  void onResult(BLEAdvertisedDevice advertisedDevice) {
    if (advertisedDevice.haveName() && 
        strcmp(advertisedDevice.getName().c_str(), TARGET_NAME) == 0) {
      Serial.println(">>> Found RECEIVER! Connecting...");
      BLEDevice::getScan()->stop();
      delay(100);
      if (pClient->connect(new BLERemoteDevice(advertisedDevice))) {
        Serial.println("[+] Connected!");
      } else {
        Serial.println("[-] Failed!");
        BLEDevice::getScan()->start(10, false);
      }
    }
  }
};

void setup() {
  Serial.begin(115200);
  delay(1000);
  Serial.println("=== ESP32 BLE PROXY ===");
  
  BLEDevice::init("PROLOGY_BLE");
  
  // ===== SETUP SERVER (for Phone) =====
  BLEServer* pServer = BLEDevice::createServer();
  pServer->setCallbacks(new PhoneSrvCB());
  
  BLEService* pSvc = pServer->createService(BLEUUID("0000ae00-0000-1000-8000-00805f9b34fb"));
  
  pPhoneCmd = pSvc->createCharacteristic(
    BLEUUID("0000ae01-0000-1000-8000-00805f9b34fb"),
    BLECharacteristic::PROPERTY_WRITE | BLECharacteristic::PROPERTY_WRITE_NR
  );
  pPhoneCmd->setCallbacks(new PhoneCB());
  
  pPhoneNotify = pSvc->createCharacteristic(
    BLEUUID("0000ae02-0000-1000-8000-00805f9b34fb"),
    BLECharacteristic::PROPERTY_NOTIFY
  );
  pPhoneNotify->addDescriptor(new BLE2902());
  
  pSvc->start();
  
  BLEAdvertising* pAdv = BLEDevice::getAdvertising();
  pAdv->addServiceUUID(BLEUUID("0000ae00-0000-1000-8000-00805f9b34fb"));
  pAdv->start();
  Serial.println("[*] Advertising as PROLOGY_BLE (for Phone)");
  
  // ===== SETUP CLIENT (to Receiver) =====
  pClient = BLEDevice::createClient();
  pClient->setClientCallbacks(new RecvClientCB());
  
  BLEScan* pScan = BLEDevice::getScan();
  pScan->setAdvertisedDeviceCallbacks(new RecvScanCB());
  pScan->setActiveScan(true);
  pScan->start(10, false);
  Serial.println("[*] Scanning for Receiver...");
}

void loop() {
  // Discover receiver services after connection
  if (recvConnected && pRecvCmd == NULL) {
    Serial.println("Discovering receiver services...");
    auto svcs = pClient->getServices();
    if (svcs) {
      for (auto& p : *svcs) {
        auto chars = p.second->getCharacteristics();
        if (chars) {
          for (auto& cp : *chars) {
            uint16_t h = cp.second->getHandle();
            if (h == 0x0009) {
              pRecvCmd = cp.second;
              Serial.println("  >>> Found CMD char (0x0009)");
            }
            if (h == 0x000b) {
              pRecvNotify = cp.second;
              Serial.println("  >>> Found NOTIFY char (0x000b)");
              if (pRecvNotify->canNotify()) {
                pRecvNotify->registerForNotify(new RecvNotifyCB());
                Serial.println("  >>> Subscribed!");
              }
            }
          }
        }
      }
    }
  }
  delay(2000);
}
