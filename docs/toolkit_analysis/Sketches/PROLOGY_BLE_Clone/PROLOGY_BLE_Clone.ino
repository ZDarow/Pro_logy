/*
 * PROLOGY_BLE Clone - Simple ESP32 GATT Server
 * Advertises as "PROLOGY_BLE"
 * Service: 0xAE00
 * Char 0xAE01: Write (commands)
 * Char 0xAE02: Notify (responses)
 */

#include <BLEDevice.h>
#include <BLEServer.h>
#include <BLEUtils.h>
#include <BLECharacteristic.h>

#define SERVICE_UUID        "0000ae00-0000-1000-8000-00805f9b34fb"
#define CMD_CHAR_UUID        "0000ae01-0000-1000-8000-00805f9b34fb"
#define NOTIFY_CHAR_UUID    "0000ae02-0000-1000-8000-00805f9b34fb"

BLECharacteristic *pCmdChar = NULL;
BLECharacteristic *pNotifyChar = NULL;
bool deviceConnected = false;

class MyServerCallbacks: public BLEServerCallbacks {
    void onConnect(BLEServer* pServer) {
      deviceConnected = true;
      Serial.println("[+] Phone connected!");
    }
    void onDisconnect(BLEServer* pServer) {
      deviceConnected = false;
      Serial.println("[-] Phone disconnected. Restarting advertising...");
      BLEDevice::startAdvertising();
    }
};

class MyCharCallbacks: public BLECharacteristicCallbacks {
    void onWrite(BLECharacteristic *pCharacteristic) {
      String value = pCharacteristic->getValue();
      if (value.length() > 0) {
        Serial.print("RX CMD: ");
        for (int i = 0; i < value.length(); i++) {
          Serial.printf("%02x ", (uint8_t)value[i]);
        }
        Serial.println();
        
        // Simple response for testing
        if (value.length() >= 6 && (uint8_t)value[0] == 0xf0) {
          uint8_t response[6] = {0xc0, 0x00, 0x03, 0x90, 0x01, 0x00};
          if (pNotifyChar != NULL) {
            pNotifyChar->setValue(response, 6);
            pNotifyChar->notify();
            Serial.println("TX NOTIFY: c0 00 03 90 01 00");
          }
        }
      }
    }
};

void setup() {
  Serial.begin(115200);
  delay(1000);
  Serial.println("=== PROLOGY_BLE Clone ===");
  
  BLEDevice::init("PROLOGY_BLE");
  
  BLEServer *pServer = BLEDevice::createServer();
  pServer->setCallbacks(new MyServerCallbacks());
  
  BLEService *pService = pServer->createService(BLEUUID(SERVICE_UUID));
  
  // Command characteristic (0xAE01) - Write
  pCmdChar = pService->createCharacteristic(
                    BLEUUID(CMD_CHAR_UUID),
                    BLECharacteristic::PROPERTY_WRITE | 
                    BLECharacteristic::PROPERTY_WRITE_NR
                  );
  pCmdChar->setCallbacks(new MyCharCallbacks());
  
  // Notify characteristic (0xAE02) - Notify
  pNotifyChar = pService->createCharacteristic(
                      BLEUUID(NOTIFY_CHAR_UUID),
                      BLECharacteristic::PROPERTY_NOTIFY
                    );
  
  pService->start();
  
  BLEAdvertising *pAdvertising = BLEDevice::getAdvertising();
  pAdvertising->addServiceUUID(BLEUUID(SERVICE_UUID));
  pAdvertising->setScanResponse(true);
  pAdvertising->start();
  
  Serial.println("Clone ready! Waiting for phone...");
  Serial.println("Service: 0000ae00-...");
  Serial.println("  Char 0xAE01: Write (commands)");
  Serial.println("  Char 0xAE02: Notify (responses)");
}

void loop() {
  delay(2000);
  if (deviceConnected) {
    Serial.println("Device connected. Send commands from phone.");
  }
}
