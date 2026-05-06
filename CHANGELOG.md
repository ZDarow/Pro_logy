# Changelog

## [Unreleased] - 2026-05-06

### Added
- **Stage 1: Stabilization & Tests**
  - Unit tests for `BtRepository` (6 tests: initial state, parseNotification for volume/bass/treble/balance/fader, stateStream, unknown type, dispose)
  - Fixed `StreamController` leak (added `dispose()` method)
  - Prevented duplicate notification subscriptions on reconnect
  - `setEqPreset` now updates state correctly
  - Notifications disabled on disconnect (`setNotifyValue(false)`)
  - `_updateState()` only called when state actually changes

- **Stage 2: Missing Features Implementation**
  - Added GPS (0x07), SXM (0x08), AV IN (0x09) to `AppSource` enum
  - Created `av_in_screen.dart` (placeholder screen)
  - Added extended audio settings methods (placeholders):
    - `setLoudness(bool, {level, freq})`
    - `setSubwoofer({level, freq, phase})`
    - `setXOver({type, freq})`
    - `setTimeAlignment({speaker, delay})`
    - `setEqPlus({band, freq, gain, q})`
  - Updated `BtProvider` with corresponding methods
  - Updated `constants.dart` with all 8 sources
  - Created `docs/protocol.md` with full BLE protocol documentation

- **Stage 3: Infrastructure & Release Prep**
  - Created `.github/workflows/ci.yml` for automated analyze + test
  - Updated `README.md` with new features and structure
  - Created `specs/prology_reverse_spec.md` (reverse-engineered specification)
  - Created `AGENTS.md` for future OpenCode sessions
  - Configured VS Code (`.vscode/` with extensions, settings, launch, tasks)
  - Created `.editorconfig` for consistent code style

### Fixed
- Removed dead code (`services/bt_service.dart`)
- Fixed `Future.delayed` typo in `bt_repository.dart`
- Fixed `BtProvider` structure (methods were outside class)
- `parseNotification` now properly updates state for all notification types
- Added missing import for `dart:async` in repository

### Changed
- `BtRepository` now uses `StreamController<PrologyState>` for state updates
- `BtProvider` subscribes to `stateStream` and calls `notifyListeners()`
- `disconnect()` now properly cancels notification subscriptions
- `setInput()` supports all 8 input sources from original APK

### Technical Details
- **Tests**: 8/8 passed (2 widget + 6 unit)
- **Analyzer**: 0 issues
- **APK Analysis**: Reverse-engineered protocol from `PROLOGY-140-5.0.55.apk`
- **BLE Protocol**: Service `AE00`, CMD `AE01`, Notify `AF01`, Checksum XOR 0x94
