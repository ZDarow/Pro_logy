/*
 * Blink test for ESP32
 */
#include <Arduino.h>

void setup() {
  Serial.begin(115200);
  delay(1000);
  Serial.println("=== ESP32 Blink Test ===");
  pinMode(2, OUTPUT); // Built-in LED on most ESP32 boards
}

void loop() {
  Serial.println("LED ON");
  digitalWrite(2, HIGH);
  delay(1000);
  Serial.println("LED OFF");
  digitalWrite(2, LOW);
  delay(1000);
}
