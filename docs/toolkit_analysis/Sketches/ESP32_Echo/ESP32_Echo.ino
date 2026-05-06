void setup() {
  Serial.begin(115200);
  delay(500);
  Serial.println("\n\n=== ESP32 ECHO TEST ===");
  Serial.println("Device booted successfully!");
}

void loop() {
  if (Serial.available()) {
    Serial.write(Serial.read());
  }
}