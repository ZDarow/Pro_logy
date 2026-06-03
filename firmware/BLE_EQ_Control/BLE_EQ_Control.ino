/*
 * ESP32 BLE - EQ/BASS/TREBLE CONTROL TEST
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
    Serial.println("\n>>> DISCONNECTED <<<");
    connected = false;
  }
};

void notificationCallback(BLERemoteCharacteristic* pChar, uint8_t* pData, size_t length, bool isNotify) {
  Serial.printf("\n[NOTIFY] (%d): ", length);
  for (size_t i = 0; i < length; i++) Serial.printf("%02X ", pData[i]);
  Serial.println();
}

void sendCommand(uint8_t* cmd, size_t len, const char* name) {
  Serial.printf("\n>>> SENDING: %s <<<\n", name);
  if (pCommandChar) {
    pCommandChar->writeValue(cmd, len, true);
  }
  delay(2000);
}

void setup() {
  Serial.begin(115200);
  delay(500);
  
  Serial.println("\n╔══════════════════════════════════════════════════════════╗");
  Serial.println("║   EQ / BASS / TREBLE CONTROL TEST                    ║");
  Serial.println("╚══════════════════════════════════════════════════════════════════╝");
  
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
  
  Serial.println("\n>>> FINDING CHARACTERISTICS <<<");
  std::map<std::string, BLERemoteService*>* services = pClient->getServices();
  
  for (auto& svc : *services) {
    std::map<std::string, BLERemoteCharacteristic*>* chars = svc.second->getCharacteristics();
    for (auto& ch : *chars) {
      if (ch.second->getUUID().toString() == "0000ae01-0000-1000-8000-00805f9b34fb") {
        pCommandChar = ch.second;
        Serial.println("*** COMMAND CHAR FOUND ***");
      }
      if (ch.second->canNotify()) {
        ch.second->registerForNotify(notificationCallback);
      }
    }
  }
  
  delay(1000);
  
  Serial.println("\n");
  Serial.println("╔══════════════════════════════════════════════════════════╗");
  Serial.println("║   TESTING COMMANDS                              ║");
  Serial.println("╚══════════════════════════════════════════════════════════╝");
  
  // INIT first
  uint8_t init[] = {0xF0, 0x00, 0x03, 0x01, 0x05, 0x00, 0x09};
  sendCommand(init, 7, "INIT");
  
  // BASS +1
  Serial.println("\n--- BASS +1 ---");
  uint8_t bass_up[] = {0xF0, 0x00, 0x05, 0xA0, 0x10, 0x0E, 0x24, 0x36, 0x1D};
  sendCommand(bass_up, 9, "BASS UP");
  
  // BASS -1
  Serial.println("\n--- BASS -1 ---");
  uint8_t bass_down[] = {0xF0, 0x00, 0x05, 0xA0, 0x10, 0x0E, 0x24, 0x34, 0x1B};
  sendCommand(bass_down, 9, "BASS DOWN");
  
  // TREBLE +1
  Serial.println("\n--- TREBLE +1 ---");
  uint8_t treble_up[] = {0xF0, 0x00, 0x05, 0xA0, 0x10, 0x0E, 0x28, 0x36, 0x1F};
  sendCommand(treble_up, 9, "TREBLE UP");
  
  // TREBLE -1
  Serial.println("\n--- TREBLE -1 ---");
  uint8_t treble_down[] = {0xF0, 0x00, 0x05, 0xA0, 0x10, 0x0E, 0x28, 0x34, 0x1D};
  sendCommand(treble_down, 9, "TREBLE DOWN");
  
  // INPUT SELECT
  Serial.println("\n--- INPUT SELECT ---");
  uint8_t input[] = {0xF0, 0x00, 0x05, 0xA0, 0x10, 0x0E, 0x24, 0x04, 0xB4};
  sendCommand(input, 9, "INPUT CHANGE");
  
  // EQ PRESET: ROCK
  Serial.println("\n--- EQ: ROCK ---");
  uint8_t eq_rock[] = {0xF0, 0x00, 0x06, 0xA0, 0x10, 0x0E, 0x26, 0x01, 0x01, 0xB9};
  sendCommand(eq_rock, 10, "EQ ROCK");
  
  // EQ PRESET: POP
  Serial.println("\n--- EQ: POP ---");
  uint8_t eq_pop[] = {0xF0, 0x00, 0x06, 0xA0, 0x10, 0x0E, 0x26, 0x01, 0x02, 0xBA};
  sendCommand(eq_pop, 10, "EQ POP");
  
  // EQ PRESET: JAZZ
  Serial.println("\n--- EQ: JAZZ ---");
  uint8_t eq_jazz[] = {0xF0, 0x00, 0x06, 0xA0, 0x10, 0x0E, 0x26, 0x01, 0x03, 0xBB};
  sendCommand(eq_jazz, 10, "EQ JAZZ");
  
  // EQ PRESET: CLASSIC
  Serial.println("\n--- EQ: CLASSIC ---");
  uint8_t eq_classic[] = {0xF0, 0x00, 0x06, 0xA0, 0x10, 0x0E, 0x26, 0x01, 0x04, 0xBC};
  sendCommand(eq_classic, 10, "EQ CLASSIC");
  
  // EQ PRESET: FLAT
  Serial.println("\n--- EQ: FLAT ---");
  uint8_t eq_flat[] = {0xF0, 0x00, 0x06, 0xA0, 0x10, 0x0E, 0x26, 0x01, 0x00, 0xB8};
  sendCommand(eq_flat, 10, "EQ FLAT");
  
  Serial.println("\n\n>>> TEST COMPLETE <<<");
}

void loop() {
  delay(10000);
}