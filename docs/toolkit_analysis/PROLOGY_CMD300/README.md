# PROLOGY CMD 300 - BLE Protocol Documentation

## Overview

Reverse engineering of Prology CMD 300 car radio Bluetooth protocol for ESP32 control.

---

## Hardware

| Device | Description | Status |
|--------|-------------|--------|
| ESP32 (DevKit V1) | Controller | Working |
| Prology CMD 300 | Car radio with BLE | Target |
| Android phone + nRF Connect | Protocol debug | In use |

---

## Bluetooth Details

**MAC Address:** `90:20:71:5E:48:10`  
**Name:** `PROLOGY_BLE`

| Service/Char | UUID | Handle | Description |
|--------------|------|--------|-------------|
| Custom Service | `0000AE00-...` | - | Main service |
| Command (Write) | `0000AE01-...` | `0x0009` | Commands to radio |
| Notify | `0000AE02-...` | `0x000b` | Notifications from radio |

---

## Protocol

### Command Format (to radio):

| Bytes | Description |
|-------|-------------|
| `f0` | Command preamble |
| `00` | Unknown |
| `03/05/06` | Data length |
| `a0 10 0e ...` | Data |
| `xx` | Checksum |

### Notification Format (from radio):

| Bytes | Description |
|-------|-------------|
| `c0` | Response preamble |
| `00` | Unknown |
| `03/04/27/38` | Data length |
| `90 01 xx yy` | Data (xx = value, yy = checksum) |

---

## Discovered Commands

| Command (HEX) | Action | Response |
|---------------|--------|----------|
| `f0 00 03 01 05 00 09` | Initialize | `c0 00 ...` |
| `f0 00 05 a0 10 0e 18 12 ed` | Volume + | `c0 00 03 90 01 XX` (XX = 0x00-0x1C) |
| `f0 00 05 a0 10 0e 24 04 b4` | Input switch? | `c0 00 ...` |
| `f0 00 05 a0 10 0e 24 36 1d` | Bass +/- | `c0 00 ...` |
| `f0 00 06 a0 12 ea 07 04 06 b3` | Something else? | `c0 00 ...` |

---

## Notifications

| Packet (HEX) | Meaning |
|--------------|----------|
| `c0 00 03 90 01 XX YY` | **Volume** XX = 0x00-0x1C, YY = checksum |
| `c0 00 02 05 01 08` | Status/ping |
| `c0 00 04 90 03 XX YY` | Bass/Treble? |
| `c0 00 27 ...` (39 bytes) | Full DSP status |
| `c0 00 38 ...` (56 bytes) | Extended status |

**Volume 100% confirmed:**
- 0x00 = MUTE
- 0x01-0x1C = 1-28 volume steps
- Checksum YY = 0x94 + XX

---

## ESP32 Code

Working code at: `/home/mi/Arduino/Sketches/PROLOGY_BLE_GATT_Client/`

Features:
- Auto-connect to PROLOGY_BLE
- Find handles 0x0009 and 0x000b
- Parse volume notifications
- Auto-send commands every 10 sec

---

## Files

```
/media/mi/DATA/projects/PROLOGY_CMD300/
├── README.md                    # This file
├── PROTOCOL.md                  # Detailed protocol
├── COMMANDS.md                  # Command reference
├── notes.txt                    # Project notes
└── source/                      # Source code
    └── PROLOGY_BLE_GATT_Client.ino
```

---

## Next Steps

1. ✅ Volume - 100% decoded
2. ⏳ Inputs (AUX/USB/BT) - needs testing
3. ⏳ Bass/Treble - needs testing
4. ⏳ Full status - parse 0x27 and 0x38 packets
5. ⏳ ESP32 Proxy - fix compilation errors

---

## Commands

### Flash ESP32:
```bash
python3 /home/mi/.arduino15/packages/esp32/tools/esptool_py/4.5.1/esptool.py \
  -p /dev/ttyUSB0 -b 115200 --before no_reset \
  write_flash 0x0 \
  /home/mi/Arduino/Sketches/PROLOGY_BLE_GATT_Client/build/PROLOGY_BLE_GATT_Client.ino.merged.bin
```

### Serial monitor:
```bash
stty -F /dev/ttyUSB0 115200 raw -echo && cat /dev/ttyUSB0
```
