void setup() {
  pinMode(2, OUTPUT);
  Serial.begin(115200);
  Serial.println("START");
}

void loop() {
  digitalWrite(2, HIGH);
  Serial.println("ON");
  delay(500);
  digitalWrite(2, LOW);
  Serial.println("OFF");
  delay(500);
}