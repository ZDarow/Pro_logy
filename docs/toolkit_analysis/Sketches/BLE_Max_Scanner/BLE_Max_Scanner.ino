/*
 * ESP32 BLE Scanner - MAXIMUM v5 (compatible with ESP32 BLE 2.0.0)
 */

#include <BLEDevice.h>
#include <BLEUtils.h>
#include <BLEScan.h>

static BLEScan* pBLEScan;
static int deviceCount = 0;

class MyAdvertisedDeviceCallbacks : public BLEAdvertisedDeviceCallbacks {
  void onResult(BLEAdvertisedDevice advertisedDevice) {
    deviceCount++;
    Serial.println("\n╔══════════════════════════════════════════════════╗");
    Serial.printf("║ Device #%d FOUND\n", deviceCount);
    Serial.println("╚══════════════════════════════════════════════════╝");
    
    // Name
    Serial.println("\n[ NAME ]");
    Serial.println(advertisedDevice.haveName() ? advertisedDevice.getName().c_str() : "(no name)");
    
    // MAC & Type
    Serial.println("\n[ ADDRESS ]");
    Serial.println(advertisedDevice.getAddress().toString().c_str());
    Serial.println(advertisedDevice.getAddressType() == 0 ? "PUBLIC" : "RANDOM");
    
    // RSSI & TX
    Serial.println("\n[ SIGNAL ]");
    Serial.printf("RSSI: %d dBm\n", advertisedDevice.getRSSI());
    if (advertisedDevice.haveTXPower()) {
      Serial.printf("TX Power: %d dBm\n", advertisedDevice.getTXPower());
    }
    
    // Appearance
    if (advertisedDevice.haveAppearance()) {
      Serial.println("\n[ APPEARANCE ]");
      Serial.printf("Value: %d (0x%04x)\n", 
                  advertisedDevice.getAppearance(), 
                  advertisedDevice.getAppearance());
    }
    
    // Manufacturer Data
    if (advertisedDevice.haveManufacturerData()) {
      std::string md = advertisedDevice.getManufacturerData();
      Serial.println("\n[ MANUFACTURER DATA ]");
      Serial.printf("Length: %d bytes\n", md.length());
      Serial.print("Hex: ");
      for (size_t i = 0; i < md.length(); i++) {
        Serial.printf("%02X", (uint8_t)md[i]);
        if (i < md.length() - 1) Serial.print(" ");
      }
      Serial.println();
      
      // Parse company ID
      if (md.length() >= 2) {
        uint16_t companyId = (uint8_t)md[0] | ((uint8_t)md[1] << 8);
        Serial.printf("Company ID: 0x%04X\n", companyId);
      }
      
      // Full parse for known formats
      Serial.println("Bytes:");
      for (size_t i = 0; i < md.length(); i++) {
        Serial.printf("  [%d]: 0x%02X (%d)\n", i, (uint8_t)md[i], (uint8_t)md[i]);
      }
    }
    
    // Service UUID
    if (advertisedDevice.haveServiceUUID()) {
      Serial.println("\n[ SERVICE UUID ]");
      Serial.println(advertisedDevice.getServiceUUID().toString().c_str());
    }
    
    // Service Data
    if (advertisedDevice.haveServiceData()) {
      std::string sd = advertisedDevice.getServiceData();
      Serial.println("\n[ SERVICE DATA ]");
      Serial.printf("Length: %d bytes\n", sd.length());
      Serial.print("Hex: ");
      for (size_t i = 0; i < sd.length(); i++) {
        Serial.printf("%02X", (uint8_t)sd[i]);
        if (i < sd.length() - 1) Serial.print(" ");
      }
      Serial.println();
    }
    
    Serial.println("\n────────────────────────────────────────────────");
  }
};

void setup() {
  Serial.begin(115200);
  delay(500);
  
  Serial.println("\n\n");
  Serial.println("╔══════════════════════════════════════════════════════════╗");
  Serial.println("║   ESP32 BLE SCANNER v5.0 - MAXIMUM INFO                   ║");
  Serial.println("║   All available BLE data from advertisement...       ║");
  Serial.println("╚══════════════════════════════════════════════════════════╝");
  
  BLEDevice::init("");
  
  pBLEScan = BLEDevice::getScan();
  pBLEScan->setAdvertisedDeviceCallbacks(new MyAdvertisedDeviceCallbacks());
  pBLEScan->setActiveScan(true);
  pBLEScan->setInterval(100);
  pBLEScan->setWindow(99);
  
  Serial.println("\n[CONFIG]");
  Serial.println("  Active Scan: ENABLED");
  Serial.println("  Interval: 100ms | Window: 99ms");
  Serial.println("\n>>> STARTING SCAN <<<\n");
  
  pBLEScan->start(0, false);
}

void loop() {
  static uint32_t lastMsg = 0;
  if (millis() - lastMsg > 10000) {
    Serial.printf("[%lu] Scanning... Found: %d devices\n", millis() / 1000, deviceCount);
    lastMsg = millis();
  }
  delay(1000);
}