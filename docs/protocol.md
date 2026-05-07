# Prology BLE Protocol Documentation

## Overview
Prology car audio systems communicate via Bluetooth Low Energy (BLE). This document describes the protocol observed from the original APK analysis.

## Service UUIDs

| Service | UUID | Purpose |
|---------|------|---------|
| **CMD Service** | `0000AE00-0000-1000-8000-00805F9B34FB` | Send commands |
| **Notify Service** | `0000AF00-0000-1000-8000-00805F9B34FB` | Receive notifications |

## Characteristic UUIDs

| Characteristic | UUID | Property |
|--------------|------|----------|
| **CMD Char** | `0000AE01-0000-1000-8000-00805F9B34FB` | Write |
| **Notify Char** | `0000AF01-0000-1000-8000-00805F9B34FB` | Notify |

## Packet Structure

```
[F0] [00] [LEN] [A0 10 0E] [CMD_CODE] [DATA...] [CHECKSUM]
```

- **Header**: `F0 00`
- **Length**: Number of bytes after length field
- **Fixed**: `A0 10 0E` (observed in all commands)
- **Command Code**: Varies by function
- **Data**: Parameter bytes
- **Checksum**: XOR 0x94 over all data bytes (excluding F0 00 and checksum itself)

## Command Reference

### Initialization
```
[F0 00 03 01 05 00 09]
```
Sent on connection.

### Playback Control
```
[F0 00 04 A0 10 0E 01] [CS]  # Play/Pause
[F0 00 04 A0 10 0E 02] [CS]  # Next track
[F0 00 04 A0 10 0E 03] [CS]  # Previous track
```

### Radio Control
```
[F0 00 04 A0 10 0E 80] [CS]  # Seek up
[F0 00 04 A0 10 0E 81] [CS]  # Seek down
[F0 00 05 A0 10 0E 82] [freq_high] [freq_low] [CS]  # Set FM freq (freq = value * 10)
[F0 00 05 A0 10 0E 83] [freq_high] [freq_low] [CS]  # Set AM freq
```

### Volume Control
```
[F0 00 05 A0 10 0E 18] [value: 0-28] [CS]
```
- Range: 0-28
- Set volume to `value`

### Input Source Selection
```
[F0 00 05 A0 10 0E 24] [code] [CS]
```

| Source | Code |
|--------|------|
| RADIO | 0x01 |
| USB | 0x02 |
| SD | 0x03 |
| BT | 0x04 |
| AUX | 0x05 |
| DISC | 0x06 |
| GPS | 0x07 |
| SXM | 0x08 |
| AV IN | 0x09 |

### Bass Control
```
[F0 00 05 A0 10 0E 24] [value+0x10] [CS]
```
- Range: -10..+10
- Send `value + 0x10` (e.g., 0x10 = 0, 0x1A = +10)

### Treble Control
```
[F0 00 05 A0 10 0E 24] [value+0x20] [CS]
```
- Range: -10..+10
- Send `value + 0x20`

### Balance Control
```
[F0 00 06 A0 10 0E 2A 03] [value+0x10] [CS]
```
- Range: -10..+10

### Fader Control
```
[F0 00 06 A0 10 0E 20 01] [value+0x10] [CS]
```
- Range: -10..+10

### EQ Presets
```
[F0 00 06 A0 10 0E 26 01] [preset] [CS]
```

| Preset | Code |
|-------|------|
| Preset 1 | 0x08 |
| Preset 2 | 0x03 |
| Preset 3 | 0x04 |
| Preset 4 | 0x09 |
| Preset 5 | 0x0A |
| Preset 6 | 0x05 |
| Preset 7 | 0x06 |

## Notification Structure

Notifications received on `AF01` characteristic:

```
[C0] [00] [LEN] [TYPE] [DATA...]
```

### Notification Types

| Type | Len | Data | Description |
|------|-----|------|-------------|
| 0x90 | 0x03 | `[?] [?] [volume]` | Volume update |
| 0x91 | 0x04 | `[?] [bass+0x10] [treble+0x20]` | Bass/Treble update |
| 0x92 | 0x05 | `[?] [?] [balance+0x10] [fader+0x10]` | Balance/Fader update |
| 0x93 | 0x03 | `[?] [?] [source_code]` | Input source update |

## TODO: Extended Audio Settings

The following features were found in APK but exact protocol bytes are TBD:

### Loudness (implemented with assumed bytes)
```
[F0 00 07 A0 10 0E 30] [on/off] [level] [freq] [CS]
```
- on/off: 1 = on, 0 = off
- level, freq: TBD (currently assumed)

### Subwoofer (implemented with assumed bytes)
```
[F0 00 08 A0 10 0E 40] [level] [freq] [phase] [CS]
```
- level: 0-100
- freq: cutoff frequency
- phase: 0/1

### X-Over (implemented with assumed bytes)
```
[F0 00 06 A0 10 0E 50] [type] [freq] [CS]
```
- type: 0=2-way, 1=3-way
- freq: crossover frequency

### Time Alignment (implemented with assumed bytes)
```
[F0 00 07 A0 10 0E 60] [speaker] [delay] [CS]
```
- speaker: 0-6 (FL, FR, RL, RR, SW, Tweeter)
- delay: 0-200 (milliseconds?)

### EQ Plus (implemented with assumed bytes)
```
[F0 00 09 A0 10 0E 70] [band] [freq] [gain] [q] [CS]
```
- band: 0-8 (frequency band index)
- freq: center frequency
- gain: -12 to +12 dB
- q: Q-factor

When exact protocol is reverse-engineered, update the command bytes above.
