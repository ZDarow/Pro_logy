# Reverse-Engineered Specification: Prology

## Overview

Prology is a Flutter mobile application for controlling Prology car audio systems via Bluetooth Low Energy (BLE). The app connects to devices (target name: PROLOGY_BLE), sends commands for audio control, and receives state updates through BLE notifications.

## Architecture Summary

### Technology Stack

- **Language**: Dart SDK ^3.11.5
- **Framework**: Flutter 3.x
- **State Management**: flutter_bloc (AppBloc), provider (BtProvider, CommandSettingsProvider)
- **Hardware**: flutter_blue_plus (BLE)
- **Linting**: flutter_lints + analysis_options.yaml

### Module Structure

```text
lib/
├── main.dart                    # Entry point, MultiProvider setup
├── bloc/
│   └── app_bloc.dart             # Global source selection (Radio/BT/USB/SD/AUX/DISC/GPS/SXM)
├── providers/
│   ├── bt_provider.dart          # Bridges BtRepository to UI (ChangeNotifier)
│   └── command_settings_provider.dart # Persists custom BLE commands (JSON)
├── data/
│   └── repositories/
│       └── bt_repository.dart    # Core BLE logic: connect, send, notify
├── screens/                     # UI: home, player, radio, settings, etc.
└── widgets/
    └── now_playing_bar.dart
```

### Data Flow

```text
User Action → BtProvider → BtRepository → BLE Write (AE01)
                                      ↓
Device Notification (AF01) → BtRepository.parseNotification() → StreamController → BtProvider → UI update
```

## Observed Functional Requirements

### BLE Connection

**OBS-CONN-001: Device Connection**
When a BluetoothDevice is selected, the system shall connect to the device and discover Prology services (AE00, AF00).

**OBS-CONN-002: Auto-Subscribe to Notifications**
When the AF01 characteristic is found, the system shall subscribe to notifications and listen for state updates.

**OBS-CONN-003: Clean Disconnect**
When disconnect() is called, the system shall cancel notifications, clear characteristics, and update connection state.

### Audio Control Commands

**OBS-CTRL-001: Volume Control**
When volumeSet(value) is called (0-28 range), the system shall send `[F0 00 05 A0 10 0E 18] [value] [CS]` and update state on success.

**OBS-CTRL-002: Input Source Selection**
When setInput(source) is called, the system shall map source to code (RADIO=0x01, USB=0x02, SD=0x03, BT=0x04, AUX=0x05, DISC=0x06, GPS=0x07, SXM=0x08, AV IN=0x09) and send `[F0 00 05 A0 10 0E 24] [code] [CS]`.

**OBS-CTRL-003: Sound Settings**
The system shall support Bass (-10..+10), Treble (-10..+10), Balance (-10..+10), Fader (-10..+10) with dedicated commands using offsets +0x10, +0x20, etc.

**OBS-CTRL-004: EQ Presets**
When setEqPreset(preset) is called (0-6), the system shall send `[F0 00 06 A0 10 0E 26 01] [preset_code] [CS]` with codes `[0x08, 0x03, 0x04, 0x09, 0x0a, 0x05, 0x06]`.

**OBS-CTRL-005: Extended Audio Settings (Placeholder)**
Where extended audio is supported, the system shall provide:

- Loudness: `setLoudness(enabled, level, freq)` - command TBD
- Subwoofer: `setSubwoofer(level, freq, phase)` - command TBD
- X-Over: `setXOver(type, freq)` - command TBD
- Time Alignment: `setTimeAlignment(speaker, delay)` - command TBD
- EQ Plus: `setEqPlus(band, freq, gain, q)` - command TBD

### Protocol

**OBS-PROT-001: Packet Structure**
The system shall construct commands as: `[F0] [00] [LEN] [A0 10 0E] [CMD] [DATA...] [CHECKSUM]`.

**OBS-PROT-002: Checksum Calculation**
The system shall calculate checksum as XOR 0x94 over all data bytes.

**OBS-PROT-003: Initialization**
When connected, the system shall send init command: `[F0 00 03 01 05 00 09]`.

### Notification Parsing

**OBS-NOTIF-001: Volume Updates**
When notification type=0x90 is received, the system shall update `_state.volume` from `data[5]`.

**OBS-NOTIF-002: Sound Settings Updates**
When notification type=0x91 is received, the system shall update bass (`data[5]` - 0x10) and treble (`data[6]` - 0x20).

**OBS-NOTIF-003: Balance/Fader Updates**
When notification type=0x92 is received, the system shall update balance (`data[6]` - 0x10) and fader (`data[7]` - 0x10).

**OBS-NOTIF-004: Input Source Updates**
When notification type=0x93 is received, the system shall update inputSource using `_inputCodeToString(data[5])`.

### Persistent Settings

**OBS-SETT-001: Custom Commands**
Where CommandSettingsProvider is used, the system shall load/save custom BLE commands to `{docs}/commands.json`.

## Observed Non-Functional Requirements

### Security

- BLE device must be physically present for connection
- No authentication tokens; trust via BLE pairing
- Commands validated by device, not app

### Performance

- BLE operations with retry logic (2 attempts, 100-200ms delays)
- Stream-based state updates (no polling)
- Assets preloaded in pubspec.yaml (17 subdirectories)

### Error Handling

| Condition | Action |
| ----------- | -------- |
| Connection fails | Catch exception, set status=error, return false |
| Send fails (retries exhausted) | Set errorMessage, return false |
| Notification parse error | Log via debugPrint, continue |
| JSON load fails | Fallback to default commands |

## Infered Acceptance Criteria

### AC-001: BLE Connectivity

Given Bluetooth is enabled, when user selects PROLOGY_BLE device, then app shall connect and subscribe to notifications within 5 seconds.

### AC-002: Command Execution

Given device is connected, when user adjusts volume, then BLE command shall be sent and UI shall update immediately.

### AC-003: State Synchronization

Given device is connected, when volume changes externally, then app shall receive notification via AF01 and update UI within 500ms.

## Uncertainties and Questions

- [x] Does the device support the full 7 input sources (GPS, SXM, AV IN)? - **Implemented in Stage 2**
- [ ] What triggers the init command `[F0 00 03 01 05 00 09]` - connection only or periodic?
- [x] Are there additional EQ parameters (Loudness, Subwoofer) mentioned in APK analysis but not implemented? - **Placeholder methods added in Stage 2, need exact protocol**
- [ ] What is the retry strategy for failed notifications?
- [x] Is the `AppBloc` actually needed given its current minimal implementation? - **Yes, used for navigation in home_screen.dart**

## Recommendations

1. Add `StreamController.close()` in `BtRepository.dispose()` to prevent memory leaks (already implemented in this session)
2. Cancel previous notification subscriptions on reconnect to avoid duplicates (already implemented)
3. Replace minimal `AppBloc` with `ChangeNotifier` if no complex business logic is planned
4. Implement extended audio settings (Loudness, Subwoofer, X-Over) found in original APK - **Stage 2: Placeholder methods added, need exact protocol**
5. Add unit tests for `BtRepository` using mocks for `flutter_blue_plus` - **Stage 1: Completed (8 tests pass)**
6. Document BLE protocol in `docs/protocol.md` for future maintainers

## Stage 2 Completion (2026-05-06)

- [x] Added GPS (0x07), SXM (0x08), AV IN (0x09) to `AppSource` and `setInput`
- [x] Created `av_in_screen.dart` (placeholder)
- [x] Updated `constants.dart` with all 8 sources
- [x] Added extended audio settings methods (Loudness, Subwoofer, X-Over, Time Alignment, EQ Plus) as placeholders
- [x] Added corresponding methods to `BtProvider`
- [ ] **Next**: Need exact BLE protocol bytes for extended audio settings (analyze APK `libapp.so` further)
