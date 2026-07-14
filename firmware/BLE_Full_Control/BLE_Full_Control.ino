/*
 * ESP32 BLE - FULL CONTROL TEST (25-band EQ, Balance, Fader)
 */

#include <BLEDevice.h>
#include <BLEUtils.h>
#include <BLEClient.h>
#include <BLERemoteCharacteristic.h>

static BLEAddress targetAddress("90:20:71:5e:48:10");
static BLEClient* pClient = nullptr;
static BLERemoteCharacteristic* pCommandChar = nullptr;
bool connected = false;

class MyClientCallback : public BLEClientCallbacks {
  void onConnect(BLEClient* pclient) {
    Serial.println("\n>>> CONNECTED <<<");
    connected = true;
  }
  void onDisconnect(BLEClient* pclient) {
    connected = false;
  }
};

void notificationCallback(BLERemoteCharacteristic* pChar, uint8_t* pData, size_t length, bool isNotify) {
  if (length <= 12) {
    Serial.printf("[NOTIFY] ");
    for (size_t i = 0; i < length; i++) Serial.printf("%02X ", pData[i]);
    Serial.println();
  }
}

void sendCommand(uint8_t* cmd, size_t len, const char* name) {
  Serial.printf("\n>>> %s <<<\n", name);
  if (pCommandChar) pCommandChar->writeValue(cmd, len, true);
  delay(300);
}

void setup() {
  Serial.begin(115200);
  delay(500);
  
  Serial.println("\n╔══════════════════════════════════════════════════════════╗");
  Serial.println("║   FULL CONTROL TEST - 25-BAND EQ                 ║");
  Serial.println("╚══════════════════════════════════════════════════════════╝");
  
  BLEDevice::init("");
  pClient = BLEDevice::createClient();
  pClient->setClientCallbacks(new MyClientCallback());
  
  Serial.println("\n>>> CONNECTING <<<");
  pClient->connect(targetAddress);
  delay(3000);
  
  if (!connected) return;
  
  std::map<std::string, BLERemoteService*>* services = pClient->getServices();
  for (auto& svc : *services) {
    std::map<std::string, BLERemoteCharacteristic*>* chars = svc.second->getCharacteristics();
    for (auto& ch : *chars) {
      if (ch.second->getUUID().toString() == "0000ae01-0000-1000-8000-00805f9b34fb") {
        pCommandChar = ch.second;
      }
      if (ch.second->canNotify()) {
        ch.second->registerForNotify(notificationCallback);
      }
    }
  }
  
  delay(500);
  
  Serial.println("\n╔══════════════════════════════════════════════════════════╗");
  Serial.println("║   INIT + PRESETS                              ║");
  Serial.println("╚══════════════════════════════════════════════════════════╝");
  
  uint8_t init[] = {0xF0, 0x00, 0x03, 0x01, 0x05, 0x00, 0x09};
  sendCommand(init, 7, "INIT");
  delay(500);
  
  Serial.println("\n--- EQ PRESETS ---");
  uint8_t flat[] = {0xF0, 0x00, 0x06, 0xA0, 0x10, 0x0E, 0x26, 0x01, 0x00, 0xB8};
  sendCommand(flat, 10, "EQ FLAT");
  
  uint8_t rock[] = {0xF0, 0x00, 0x06, 0xA0, 0x10, 0x0E, 0x26, 0x01, 0x03, 0xBB};
  sendCommand(rock, 10, "EQ ROCK");
  
  uint8_t pop[] = {0xF0, 0x00, 0x06, 0xA0, 0x10, 0x0E, 0x26, 0x01, 0x04, 0xBC};
  sendCommand(pop, 10, "EQ POP");
  
  uint8_t jazz[] = {0xF0, 0x00, 0x06, 0xA0, 0x10, 0x0E, 0x26, 0x01, 0x09, 0xC1};
  sendCommand(jazz, 10, "EQ JAZZ");
  
  uint8_t classic[] = {0xF0, 0x00, 0x06, 0xA0, 0x10, 0x0E, 0x26, 0x01, 0x0A, 0xC2};
  sendCommand(classic, 10, "EQ CLASSIC");
  
  Serial.println("\n--- BALANCE TEST ---");
  uint8_t bal_c[] = {0xF0, 0x00, 0x05, 0xA0, 0x10, 0x0E, 0x2A, 0x03, 0x00, 0xB0};  // Center
  sendCommand(bal_c, 10, "BAL CENTER");
  
  uint8_t bal_l5[] = {0xF0, 0x00, 0x05, 0xA0, 0x10, 0x0E, 0x2A, 0x03, 0x32, 0xE2};  // Left
  sendCommand(bal_l5, 10, "BAL LEFT");
  
  uint8_t bal_r5[] = {0xF0, 0x00, 0x05, 0xA0, 0x10, 0x0E, 0x2A, 0x03, 0xCE, 0xBE};  // Right
  sendCommand(bal_r5, 10, "BAL RIGHT");
  
  Serial.println("\n--- FADER TEST ---");
  uint8_t fdr_f[] = {0xF0, 0x00, 0x05, 0xA0, 0x10, 0x0E, 0x20, 0x01, 0x00, 0xA6};  // Front
  sendCommand(fdr_f, 10, "FADER FRONT");
  
  uint8_t fdr_r[] = {0xF0, 0x00, 0x05, 0xA0, 0x10, 0x0E, 0x20, 0x01, 0xFF, 0xA5};  // Rear
  sendCommand(fdr_r, 10, "FADER REAR");
  
  Serial.println("\n--- VOLUME TEST ---");
  uint8_t vol_up[] = {0xF0, 0x00, 0x05, 0xA0, 0x10, 0x0E, 0x18, 0x12, 0xED};
  sendCommand(vol_up, 9, "VOL UP");
  delay(200);
  sendCommand(vol_up, 9, "VOL UP");
  
  uint8_t vol_dn[] = {0xF0, 0x00, 0x05, 0xA0, 0x10, 0x0E, 0x18, 0x10, 0xEB};
  sendCommand(vol_dn, 9, "VOL DOWN");
  delay(200);
  sendCommand(vol_dn, 9, "VOL DOWN");
  
  Serial.println("\n>>> COMPLETE <<<");
}

void loop() {
  delay(10000);
}