/*
 * PROLOGY CMD-300 - COMPLETE CONTROL
 * All working commands + more exploration
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
  void onConnect(BLEClient* pclient) { connected = true; }
  void onDisconnect(BLEClient* pclient) { connected = false; }
};

void notificationCallback(BLERemoteCharacteristic* pChar, uint8_t* pData, size_t length, bool isNotify) {
  if (length <= 8) {
    Serial.printf("[RX] ");
    for (size_t i = 0; i < length; i++) Serial.printf("%02X ", pData[i]);
    Serial.println();
  }
}

void sendCmd(uint8_t* cmd, size_t len, const char* name) {
  Serial.printf("\n>>> %s\n", name);
  if (pCommandChar) pCommandChar->writeValue(cmd, len, true);
  delay(800);
}

void setup() {
  Serial.begin(115200);
  delay(500);
  Serial.println("\n=== PROLOGY COMPLETE CONTROL ===\n");
  
  BLEDevice::init("");
  pClient = BLEDevice::createClient();
  pClient->setClientCallbacks(new MyClientCallback());
  pClient->connect(targetAddress);
  delay(3000);
  if (!connected) return;
  
  auto services = pClient->getServices();
  for (auto& svc : *services) {
    auto chars = svc.second->getCharacteristics();
    for (auto& ch : *chars) {
      if (ch.second->getUUID().toString() == "0000ae01-0000-1000-8000-00805f9b34fb") {
        pCommandChar = ch.second;
      }
      if (ch.second->canNotify()) ch.second->registerForNotify(notificationCallback);
    }
  }
  
  delay(500);
  
  // INIT
  uint8_t init[] = {0xF0, 0x00, 0x03, 0x01, 0x05, 0x00, 0x09};
  sendCmd(init, 7, "INIT");
  
  Serial.println("\n=== EQ PRESETS ===");
  // EQ FLAT
  uint8_t flat[] = {0xF0, 0x00, 0x06, 0xA0, 0x10, 0x0E, 0x26, 0x01, 0x08, 0xC0};
  sendCmd(flat, 10, "EQ FLAT");
  
  // EQ ROCK
  uint8_t rock[] = {0xF0, 0x00, 0x06, 0xA0, 0x10, 0x0E, 0x26, 0x01, 0x03, 0xBB};
  sendCmd(rock, 10, "EQ ROCK");
  
  // EQ POP
  uint8_t pop[] = {0xF0, 0x00, 0x06, 0xA0, 0x10, 0x0E, 0x26, 0x01, 0x04, 0xBC};
  sendCmd(pop, 10, "EQ POP");
  
  // EQ JAZZ
  uint8_t jazz[] = {0xF0, 0x00, 0x06, 0xA0, 0x10, 0x0E, 0x26, 0x01, 0x09, 0xC1};
  sendCmd(jazz, 10, "EQ JAZZ");
  
  // EQ CLASSIC
  uint8_t classic[] = {0xF0, 0x00, 0x06, 0xA0, 0x10, 0x0E, 0x26, 0x01, 0x0A, 0xC2};
  sendCmd(classic, 10, "EQ CLASSIC");
  
  // EQ USER 1
  uint8_t user1[] = {0xF0, 0x00, 0x06, 0xA0, 0x10, 0x0E, 0x26, 0x01, 0x05, 0xBD};
  sendCmd(user1, 10, "EQ USER1");
  
  // EQ USER 2
  uint8_t user2[] = {0xF0, 0x00, 0x06, 0xA0, 0x10, 0x0E, 0x26, 0x01, 0x06, 0xBE};
  sendCmd(user2, 10, "EQ USER2");
  
  Serial.println("\n=== VOLUME ===");
  uint8_t vol_up[] = {0xF0, 0x00, 0x05, 0xA0, 0x10, 0x0E, 0x18, 0x12, 0xED};
  sendCmd(vol_up, 9, "VOL +");
  
  uint8_t vol_dn[] = {0xF0, 0x00, 0x05, 0xA0, 0x10, 0x0E, 0x18, 0x10, 0xEB};
  sendCmd(vol_dn, 9, "VOL -");
  
  Serial.println("\n=== BALANCE ===");
  uint8_t bal_c[] = {0xF0, 0x00, 0x05, 0xA0, 0x10, 0x0E, 0x2A, 0x03, 0x00, 0xB0};
  sendCmd(bal_c, 10, "BAL CENTER");
  
  uint8_t bal_l[] = {0xF0, 0x00, 0x05, 0xA0, 0x10, 0x0E, 0x2A, 0x03, 0x32, 0xE2};
  sendCmd(bal_l, 10, "BAL LEFT");
  
  uint8_t bal_r[] = {0xF0, 0x00, 0x05, 0xA0, 0x10, 0x0E, 0x2A, 0x03, 0xCE, 0xBE};
  sendCmd(bal_r, 10, "BAL RIGHT");
  
  Serial.println("\n=== FADER ===");
  uint8_t fdr_f[] = {0xF0, 0x00, 0x05, 0xA0, 0x10, 0x0E, 0x20, 0x01, 0x00, 0xA6};
  sendCmd(fdr_f, 10, "FADER FRONT");
  
  uint8_t fdr_r[] = {0xF0, 0x00, 0x05, 0xA0, 0x10, 0x0E, 0x20, 0x01, 0xFF, 0xA5};
  sendCmd(fdr_r, 10, "FADER REAR");
  
  Serial.println("\n=== COMPLETE ===");
}

void loop() { delay(10000); }