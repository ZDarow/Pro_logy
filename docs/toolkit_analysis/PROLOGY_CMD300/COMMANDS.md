# PROLOGY CMD 300 - Command Reference

## BLE Advertisement Data (Scan Results)

### Device #1: PROLOGY_BLE
| Field | Value |
|-------|-------|
| Name | PROLOGY_BLE |
| MAC | 90:20:71:5e:48:10 |
| Address Type | PUBLIC |
| RSSI | -59 dBm (excellent) |
| Manufacturer Data | 8 bytes: 00 00 00 00 00 00 00 00 |
| Company ID | 0x0000 (none/null) |
| Service UUID | 0000180d-0000-1000-8000-00805f9b34fb (Heart Rate) |

### Device #2: BT-APP-BLE
| Field | Value |
|-------|-------|
| Name | BT-APP-BLE |
| MAC | a3:ed:f7:61:8d:b1 |
| Address Type | PUBLIC |
| RSSI | -69 to -76 dBm |
| Manufacturer Data | 29 bytes |
| Company ID | 0x05D6 |

### Device #3: FANKY(APP)
| Field | Value |
|-------|-------|
| Name | FANKY(APP) |
| MAC | c9:44:c6:b5:ef:4d |
| Address Type | PUBLIC |
| RSSI | -62 to -75 dBm |
| Service UUID | 0000af30-0000-1000-8000-00805f9b34fb |

---

## GATT Services (Connected)

| # | Service UUID | Name | Characteristics |
|---|-------------|------|-----------------|
| 1 | 00001800 | Generic Access | 0x2A00 (Device Name) |
| 2 | 00001801 | Generic Attribute | 0x2A05 (Service Changed) |
| 3 | **0000AE00** | **Custom DSP** | **0xAE01** (Write), **0xAE02** (Notify) |

### Characteristic Details:

| Char UUID | Handle | Properties | Description |
|-----------|--------|------------|-------------|
| 0xAE01 | 0x0009 | Write No Response | Command (TX) |
| 0xAE02 | 0x000b | Notify | Status/Response (RX) |
| 0x2A00 | 0x0003 | Read | Device Name: "PROLOGY_BLE" |
| 0x2A05 | 0x0006 | Read | Service Changed |
| **0x2902** | **0x000c** | CCC Descriptor | Enable notifications |

---

## Command/Response Protocol

### Response Format:
```
C0 LL TT DD DD... CS
|| || || └────────── Data (LL-3 bytes)
|| ││ └──────────── Type/Command ID
││ └────────────── Length (total packet)
└──────────────── Response Prefix (0xC0 = response, 0xF0 = command)
```

### Response Types Observed (NEED MORE ANALYSIS):

| Type | Lengths Observed | Likely Function |
|------|---------------|--------------|
| 0x90 | 3, 4 | Volume (confirmed) |
| 0x91 | 3 | Balance? |
| 0x92 | 3, 4, 7, 8 | Settings |
| 0x94 | 3 | Unknown |
| 0x9A | 2-56 | EQ (10-band) - multiple sub-types |
| 0x9E | 2 | Unknown |
| 0x11 | 4 | Unknown |
| 0x17 | 6 | Unknown |
| 0x24 | 2 | Unknown |
| 0x27 | 39 | Full DSP State |
| 0x38 | 56 | Extended State |
| 0xB0 | 3, 4, 7, 8 | Bass |
| 0xB1 | 3 | Treble |
| 0x99 | 3 | Unknown |
| 0x05 | 6 | Keep-alive/ping? |

---

## Known Commands (TESTED)

| # | Command (HEX) | Length | Action | Status | Notes |
|---|---------------|--------|--------|--------|-------|
| 1 | `f0 00 03 01 05 00 09` | 7 | Initialize | ✅ | Full state response |
| 2 | `f0 00 05 a0 10 0e 18 12 ed` | 9 | Volume + | ✅ | |
| 3 | `f0 00 05 a0 10 0e 18 10 eb` | 9 | Volume - | ✅ | |
| 4 | `f0 00 06 a0 10 0e 26 01 00 b8` | 10 | EQ FLAT | ✅ | |
| 5 | `f0 00 06 a0 10 0e 2a 03 xx yy` | 10 | Balance | ⚠ | Different format |
| 6 | `f0 00 06 a0 10 0e 20 01 xx yy` | 10 | Fader | ⚠ | Different format |
| 7 | `f0 00 06 a0 10 0e 26 01 03 bb` | 10 | EQ ROCK | ✅ | Returns 25-band values |
| 8 | `f0 00 06 a0 10 0e 26 01 04 bc` | 10 | EQ POP | ✅ | Returns 25-band values |
| 9 | `f0 00 06 a0 10 0e 26 01 09 c1` | 10 | EQ JAZZ | ✅ | Returns 25-band values |
| 10 | `f0 00 06 a0 10 0e 26 01 0a c2` | 10 | EQ CLASSIC | ✅ | Returns 25-band values |

### EQ Preset Values (25 bands):
| Preset | 25-band Values |
|--------|-------------|
| FLAT | 00 00 00 00 00 00 00 00 00 00 |
| ROCK | 04 01 00 02 06 03 00 00 02 02 |
| POP | 01 01 02 02 02 01 01 02 02 02 02 |
| JAZZ | 01 01 00 00 FF 00 00 01 02 02 03 |
| CLASSIC | 03 01 FF 00 02 02 01 00 00 00 03 |

Value format: 00=0dB, 7F=+12dB, FF=-12dB

## Working Response Format:
- **0x90** (Volume): `90 01 VV` where VV = volume 0-28
- **0x9A** (EQ): Subtype + band values
- **0x9A2A03** (Balance): `9A 2A 03 XX` center=00, left=32, right=CE
- **0xB0** (Bass): Various subtypes
- **BASS** (0xB0): `B0 SS VV` where SS=subtype, VV=value
- **TREBLE** (0xB1): `B1 00 VV` - probably treble
- **EQ** (0x9A): Subtype indicates band (0A, 0C, 10, 14, 16...)
- **BALANCE** (0x2A): `9A 2A 03 VV` - Value 00-FF
- **FADER** (0x20): `9A 20 CN VV` - Channel 01-04, Value 00-FF

## Working commands:

### EQ Control (25-band):
| Type | Example |
|------|---------|
| Band query (01-19) | `9A 20 01 XX` = 31Hz, `9A 20 02 XX` = 62Hz... |
| Bass boost (15) | `9A 15 XX` = bass emphasis |
| Treble boost (16?) | need test |

### Balance/Fader / Audio:
| Type | Example |
|------|---------|
| **Balance L←→R** | `9A 2A XX YY` - value 00=center, FE=left, 02=right |
| **Rear↔Front** | `9A 20 YY ZZ` - value 00=center, FE=rear, 04=front |

### EQ Presets:
| Preset | Command Byte | Values |
|-------|-------------|--------|
| FLAT | 08 | `00 00 00 00 00 00 00 00 00 00` |
| ROCK | 03 | `04 01 00 02 06 03 00 00 02 02` |
| POP | 04 | `01 01 02 02 02 01 01 02 02 02 02` |
| JAZZ | 09 | `01 01 00 00 FF 00 00 01 02 02 03` |
| CLASSIC | 0A | `03 01 FF 00 02 02 01 00 00 00 03` |
| USER1 | 05 | User editable |
| USER2 | 06 | User editable |
```
C0 00 1B 9A 21 BB VV VV VV... VV CS
              │  └─ 25 band values (-12dB to +12dB)
              └── Query type (03-1B = individual band, 00 = all?)
```
Values: 00 = -12dB, 7F = 0dB, FF = +12dB

### Frequency Bands (25-band EQ):
| ID | Frequency |
|----|-----------|
| 03 | 31Hz |
| 04 | 62Hz |
| 05 | 125Hz |
| 06 | 250Hz |
| 07 | 500Hz |
| 08 | 1kHz |
| 09 | 2kHz |
| 0A | 4kHz |
| 0B | 8kHz |
| 0C | 16kHz |
| ... | ... |

### EQ Preset Subtypes:
| Subtype | Preset |
|--------|-------|
| 0x21 08 | FLAT |
| 0x21 03 | Rock |
| 0x21 04 | Pop |
| 0x21 09 | Jazz |
| 0x21 0A | Classic |
| 0x21 05 | User 1 |
| 0x21 0B | User 2 |

---

## Command Breakdown

### 1. Initialize (f0 00 03 01 05 00 09)

```
f0 00 03 01 05 00 09
|| |  || || || ||
|| |  || || || ++-- Checksum (0x94 + 0x09 = 0x9D? Wait, 0x09 = 0x09)
|| |  || || || +--- Unknown (0x00)
|| |  || || |+----- Unknown (0x05)
|| |  || |+------- ID (0x01)
|| |  || +--------- Length (0x03 = 3 bytes data)
|| |  |+----------- Unknown (0x00)
|+--------------- Preamble (0xf0)
```

### 2. Volume (f0 00 05 a0 10 0e 18 12 ed)

```
f0 00 05 a0 10 0e 18 12 ed
|| |  || || || || || |+-- Checksum: 0x94 + 0xED(237) = ?
|| |  || || || || |+--- Volume value? 0x12 = 18
|| |  || || || |+----- Fixed 0x18
|| |  || || |+------- Fixed 0x0E
|| |  || |+---------- Fixed 0x10
|| |  || +----------- Fixed 0xA0
|| |  |+------------- Length (0x05 = 5 bytes data)
|| |  +--------------- Unknown (0x00)
|+-------------------- Preamble (0xf0)
```

---

## Response Patterns

### Volume Response (c0 00 03 90 01 VV CS)

| Command | Response | Meaning |
|---------|----------|---------|
| Volume + | `c0 00 03 90 01 01 95` | Volume 1 |
| Volume + | `c0 00 03 90 01 02 96` | Volume 2 |
| Volume + | `c0 00 03 90 01 0A 9E` | Volume 10 |
| Volume + | `c0 00 03 90 01 10 A4` | Volume 16 |
| Volume + | `c0 00 03 90 01 14 A8` | Volume 20 |
| Volume + | `c0 00 03 90 01 1C AC` | Volume 28 (max) |
| Volume - | `c0 00 03 90 01 00 94` | Volume 0 (MUTE) |
| N/A | `c0 00 03 90 01 01 95` | Volume 1 |

### Status Response (c0 00 02 05 01 08)

- Sent periodically as heartbeat/ping
- Also sent after most commands

### Full Status Response (c0 00 27...)

39 bytes of DSP state including:
- Current volume
- Input source
- EQ settings
- Bass/Treble levels
- Balance
- And more...

---

## Command-to-Action Mapping

### To Find Commands:

1. Open n RF Connect on phone
2. Connect to PROLOGY_BLE
3. Enable notifications on 0xAE02
4. Send command in 0xAE01
5. Watch response in 0xAE02
6. Repeat for each button on radio

### Known Actions to Test:

| Action on Radio | Expected Command |
|-----------------|------------------|
| Volume + Button | `f0 00 05 a0 10 0e 18 12 ed` |
| Volume - Button | `f0 00 05 a0 10 0e 18 12 ed` (repeat) |
| Input AUX | Test with remote |
| Input USB | Test with remote |
| Input BT | Test with remote |
| Input RADIO | Test with remote |
| Bass + | `f0 00 05 a0 10 0e 24 36 1d`? |
| Bass - | Test with remote |
| Treble + | Test with remote |
| Treble - | Test with remote |
|Balance L | Test with remote |
| Balance R | Test with remote |
| Mute | Test with remote |
| Power | Test with remote |

---

## Checksum Reference

Simple formula for known commands:
```
CS = 0x94 + data_byte
```

For Volume (VV):
```
CS = 0x94 + 0x01 = 95 -> c0 00 03 90 01 01 95
CS = 0x94 + 0x0A = 9E -> c0 00 03 90 01 0A 9E
CS = 0x94 + 0x14 = A8 -> c0 00 03 90 01 14 A8
CS = 0x94 + 0x1C = B0 -> c0 00 03 90 01 1C B0
```
