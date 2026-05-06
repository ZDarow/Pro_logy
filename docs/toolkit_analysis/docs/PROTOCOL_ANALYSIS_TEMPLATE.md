# 🎯 PROLOGY Bluetooth Protocol Analysis Template

## 📋 Session Information

| Field | Value |
|-------|-------|
| **Device** | PROLOGY-140-5.0.55 |
| **Package** | com.prology |
| **Date** | YYYY-MM-DD |
| **Analyst** | [Your Name] |
| **Target** | Car Headunit Bluetooth |

---

## 🔍 Pre-Analysis

### Device Information

```bash
# Get device info
adb shell getprop | grep -E "(ro.product|ro.build)"

# Get Bluetooth MAC
adb shell settings get global bluetooth_address

# List Bluetooth devices
adb shell dumpsys bluetooth_manager
```

### Application Information

```bash
# App info
adb shell dumpsys package com.prology

# List permissions
adb shell dumpsys package com.prology | grep permission

# List activities
adb shell dumpsys package com.prology | grep Activity
```

---

## 📡 Bluetooth Connection Flow

### Step 1: Discovery

```
[ ] Start discovery
[ ] Device found: _______________
[ ] MAC Address: _______________
[ ] RSSI: _______ dBm
[ ] Device Name: _______________
[ ] Device Class: _______________
```

### Step 2: Pairing

```
[ ] Pairing requested
[ ] PIN Code: _______________
[ ] Bond state: BONDED
[ ] Pairing method: _______________
```

### Step 3: Connection

```
[ ] Connection initiated
[ ] UUID: 00001101-0000-1000-8000-00805F9B34FB (SPP)
[ ] Connection established
[ ] MTU: _______ bytes
```

---

## 📊 Protocol Analysis

### Command/Response Table

| # | Direction | Command (HEX) | Command (ASCII) | Response (HEX) | Response (ASCII) | Description |
|---|-----------|---------------|-----------------|----------------|------------------|-------------|
| 1 | TX | | | | | |
| 2 | RX | | | | | |
| 3 | TX | | | | | |
| 4 | RX | | | | | |

### Known Commands

| Command | HEX | ASCII | Purpose |
|---------|-----|-------|---------|
| AUTH | | | Authentication |
| STATUS | | | Get status |
| VOLUME | | | Volume control |
| PLAY | | | Play command |
| PAUSE | | | Pause command |
| NEXT | | | Next track |
| PREV | | | Previous track |

### Message Format Analysis

```
Possible format:
[HEADER] [LENGTH] [COMMAND] [DATA] [CHECKSUM]

Example:
41 55 54 48 0D 0A = "AUTH\r\n"

Header: 41 55 (AU)
Length: 54 48 (TH)
Command: 0D 0A (\r\n)
```

---

## 🔐 Authentication Flow

### Step-by-Step

```
1. App → Device: _______________
   HEX: _______________
   
2. Device → App: _______________
   HEX: _______________
   
3. App → Device: _______________
   HEX: _______________
   
4. Device → App: _______________
   HEX: _______________
   
5. Result: [ ] Success [ ] Failure
```

### Authentication Tokens

```
Token 1: _______________
Token 2: _______________
Session Key: _______________
```

---

## 🎵 Audio Control Commands

### Volume Control

```
Volume Up:    HEX: _______________
Volume Down:  HEX: _______________
Volume Set:   HEX: _______________
Mute:         HEX: _______________
```

### Playback Control

```
Play:         HEX: _______________
Pause:        HEX: _______________
Stop:         HEX: _______________
Next Track:   HEX: _______________
Prev Track:   HEX: _______________
Fast Forward: HEX: _______________
Rewind:       HEX: _______________
```

---

## 📱 GATT Services (BLE)

### Discovered Services

| UUID | Type | Characteristics |
|------|------|-----------------|
| | | |

### Characteristic Analysis

| Service UUID | Characteristic UUID | Properties | Value |
|--------------|---------------------|------------|-------|
| | | READ | |
| | | WRITE | |
| | | NOTIFY | |

---

## 🔧 Reverse Engineering Notes

### Key Classes

```
X2.j       - SPP Connection Manager
X2.a       - Bluetooth Socket Thread
k2.C0395h  - Main Bluetooth Manager
k2.C0393f  - GATT Callback Handler
```

### Important Methods

```java
// Connection
X2.j.a(String address)     // Connect to device
X2.j.b()                   // Disconnect
X2.j.c(byte[] data)        // Send data

// Events
k2.C0395h.z(String event, HashMap data)  // Send to Flutter
```

### Flutter Event Channel

```
Event: OnConnectionStateChanged
Event: OnDiscoveredServices
Event: OnCharacteristicReceived
Event: OnCharacteristicWritten
Event: OnDescriptorRead
Event: OnDescriptorWritten
Event: OnMtuChanged
Event: OnReadRssi
```

---

## 🐛 Issues & Workarounds

### Connection Issues

| Issue | Cause | Workaround |
|-------|-------|------------|
| Connection timeout | Device out of range | Move closer |
| Authentication fail | Wrong protocol | Analyze more |
| Service not found | Wrong UUID | Scan again |

### App Protections

| Protection | Detected | Bypass Method |
|------------|----------|---------------|
| Root Detection | [ ] | objection root disable |
| SSL Pinning | [ ] | frida ssl_unpinning.js |
| Emulator Check | [ ] | Modify Build props |

---

## 📝 Raw Log Data

### Session Log

```
Paste raw Frida output here:
_________________________________
_________________________________
_________________________________
```

### Interesting Strings

```
Paste interesting strings here:
_________________________________
_________________________________
_________________________________
```

---

## 🎯 Integration Checklist

- [ ] Identify connection UUID
- [ ] Capture authentication sequence
- [ ] Document all commands
- [ ] Understand message format
- [ ] Implement client library
- [ ] Test reimplementation
- [ ] Handle errors
- [ ] Add logging

---

## 📚 References

- [Bluetooth SIG Specifications](https://www.bluetooth.com/specifications/specs/)
- [Android Bluetooth API](https://developer.android.com/guide/topics/connectivity/bluetooth)
- [Frida Documentation](https://frida.re/docs/)

---

*Template created for PROLOGY-140-5.0.55.apk analysis*
*Date: 2026-03-02*
