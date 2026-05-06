# PROLOGY CMD 300 - Detailed Protocol Description

## GATT Structure

### Services

#### Service 0x1800 (Generic Access)
- Handle 0x0003: Device Name (0x2A00) - READ

#### Service 0x1801 (Generic Attribute)
- Handle 0x0006: Service Changed (0x2A05) - READ

#### Service 0xAE00 (Custom - PROLOGY DSP)
- Handle 0x0009: Command Characteristic (0xAE01) - WRITE, WRITE WITHOUT RESPONSE
- Handle 0x000B: Notify Characteristic (0xAE02) - NOTIFY

---

## Command Format Detailed

### Structure: f0 00 LL DD..CS

| Offset | Bytes | Meaning |
|--------|-------|----------|
| 0 | 1 | Preamble: `0xf0` |
| 1 | 1 | Unknown: `0x00` |
| 2 | 1 | Data length: `0x03`, `0x05`, `0x06` |
| 3..N | N-2 | Data payload |
| N+1 | 1 | Checksum (XOR of all data bytes + 0x94) |

### Known Commands

#### 1. Initialization
```
f0 00 03 01 05 00 09
```
Length: 3 bytes (01 05 00)
Purpose: Initialize connection?

#### 2. Volume Up
```
f0 00 05 a0 10 0e 18 12 ed
```
Length: 5 bytes (a0 10 0e 18 12)
Data: a0 10 0e 18 = fixed, 12 = volume + 0x94?

#### 3. Volume Down (same command, different last byte)
```
f0 00 05 a0 10 0e 18 12 ed
```
Actually sends multiple volume-down commands in sequence.

#### 4. Input Select
```
f0 00 05 a0 10 0e 24 04 b4
```
a0 10 0e = fixed prefix
24 = input command?
04 = input number?
b4 = checksum

#### 5. Bass/Treble
```
f0 00 05 a0 10 0e 24 36 1d
```

#### 6. Unknown
```
f0 00 06 a0 12 ea 07 04 06 b3
```

---

## Response Format

### Structure: c0 00 LL DD..CS

| Offset | Bytes | Meaning |
|--------|-------|----------|
| 0 | 1 | Response preamble: `0xc0` |
| 1 | 1 | Channel: `0x00` |
| 2 | 1 | Data length |
| 3..N | N-2 | Data payload |
| N+1 | 1 | Checksum |

### Known Responses

#### Volume Response
```
c0 00 03 90 01 VV CS
```
- 03 = length
- 90 01 = "volume" command ID
- VV = volume value (0x00-0x1C)
- CS = 0x94 + VV

#### Status Response
```
c0 00 02 05 01 08
```
02 = length
05 01 = status
08 = checksum
(Heartbeat/ping response)

#### Full Status (39 bytes)
```
c0 00 27 FF 00 04 01 05 07 04 00 04 02 c5 00 03 00 08 08 dc..
```
Contains all DSP settings

#### Extended Status (56 bytes)
```
c0 00 38 9A 1F 18 09 28 00 3F 00 64 00 7D 00 A0 00 FA 00 3B..
```

---

## Volume Mapping

| Value | Volume Level | Notes |
|-------|--------------|-------|
| 0x00 | MUTE | Silent |
| 0x01 | 1 | Very low |
| 0x0A | 10 | Low |
| 0x14 | 20 | Medium |
| 0x1C | 28 | Maximum |

Formula: `checksum = 0x94 + volume_value`

---

## Checksum Calculation

Simple XOR-based checksum:
```
checksum = 0x94
for each data byte:
    checksum ^= data_byte
# For volume: 0x94 + volume_value
```

---

## Reference Handles

| Handle | Usage | Access |
|--------|-------|--------|
| 0x0003 | Generic Access (Device Name) | READ |
| 0x0006 | Generic Attribute (Service Changed) | READ |
| 0x0009 | PROLOGY Command | WRITE, WRITE_NR |
| 0x000B | PROLOGY Notify | NOTIFY |

---

## UUID Reference

| UUID | Name | Usage |
|------|------|-------|
| 00001800-0000-1000-8000-00805f9b34fb | Generic Access | Device Name |
| 00001801-0000-1000-8000-00805f9b34fb | Generic Attribute | Service Changed |
| 0000180D-0000-1000-8000-00805f9b34fb | Heart Rate | Sometimes visible |
| 0000AE00-0000-1000-8000-00805f9b34fb | PROLOGY Custom | Main service |
| 0000AE01-0000-1000-8000-00805f9b34fb | PROLOGY Command | Write commands |
| 0000AE02-0000-1000-8000-00805f9b34fb | PROLOGY Notify | Read notifications |
