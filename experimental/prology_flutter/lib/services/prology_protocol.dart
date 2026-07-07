import 'dart:typed_data';
import '../models/prology_state.dart';

class PrologyProtocol {
  static const SERVICE_UUID = '0000ae00-0000-1000-8000-00805f9b34fb';
  static const CMD_CHAR_UUID = '0000ae01-0000-1000-8000-00805f9b34fb';
  static const NOTIFY_CHAR_UUID = '0000ae02-0000-1000-8000-00805f9b34fb';

  static Uint8List buildInitCommand() {
    return Uint8List.fromList([0xF0, 0x00, 0x03, 0x01, 0x05, 0x00, 0x09]);
  }

  static Uint8List buildVolumeCommand(bool up) {
    return Uint8List.fromList([
      0xF0, 0x00, 0x05, 0xA0, 0x10, 0x0E, 0x18,
      up ? 0x12 : 0x10,
      up ? 0xED : 0xEB,
    ]);
  }

  static Uint8List buildEQCommand(EQPreset preset) {
    return Uint8List.fromList([
      0xF0, 0x00, 0x06, 0xA0, 0x10, 0x0E, 0x26, 0x01,
      preset.value,
      (0xF0 + 0x00 + 0x06 + 0xA0 + 0x10 + 0x0E + 0x26 + 0x01 + preset.value) & 0xFF,
    ]);
  }

  static Uint8List buildBalanceCommand(int balance) {
    int balL = (balance.clamp(-128, 127) + 0x80) & 0xFF;
    int balR = (0x80 - balance.clamp(-128, 127)) & 0xFF;
    return Uint8List.fromList([
      0xF0, 0x00, 0x05, 0xA0, 0x10, 0x0E, 0x2A, 0x03,
      balL, balR,
    ]);
  }

  static Uint8List buildFaderCommand(int fader) {
    int fadeVal = (fader.clamp(-128, 127) + 0x80) & 0xFF;
    return Uint8List.fromList([
      0xF0, 0x00, 0x05, 0xA0, 0x10, 0x0E, 0x20, 0x01,
      fadeVal,
      (0xF0 + 0x00 + 0x05 + 0xA0 + 0x10 + 0x0E + 0x20 + 0x01 + fadeVal) & 0xFF,
    ]);
  }

  static Uint8List buildInputCommand(InputSource input) {
    return Uint8List.fromList([
      0xF0, 0x00, 0x05, 0xA0, 0x10, 0x0E, 0x24, 0x04,
      input.value,
      (0xF0 + 0x00 + 0x05 + 0xA0 + 0x10 + 0x0E + 0x24 + 0x04 + input.value) & 0xFF,
    ]);
  }

  static Uint8List buildBassCommand(int bass) {
    int bassVal = (bass.clamp(-12, 12) + 12) & 0xFF;
    return Uint8List.fromList([
      0xF0, 0x00, 0x05, 0xA0, 0x10, 0x0E, 0x24, 0x36,
      bassVal,
      (0xF0 + 0x00 + 0x05 + 0xA0 + 0x10 + 0x0E + 0x24 + 0x36 + bassVal) & 0xFF,
    ]);
  }

  static Uint8List buildTrebleCommand(int treble) {
    int trebleVal = (treble.clamp(-12, 12) + 12) & 0xFF;
    return Uint8List.fromList([
      0xF0, 0x00, 0x05, 0xA0, 0x10, 0x0E, 0x24, 0x37,
      trebleVal,
      (0xF0 + 0x00 + 0x05 + 0xA0 + 0x10 + 0x0E + 0x24 + 0x37 + trebleVal) & 0xFF,
    ]);
  }

  static PrologyState? parseResponse(Uint8List data) {
    if (data.isEmpty) return null;

    if (data[0] == 0xC0 && data.length > 4) {
      switch (data[3]) {
        case 0x90:
          if (data.length >= 6) {
            return PrologyState(volume: data[5]);
          }
          break;
        case 0x9A:
          if (data.length >= 7) {
            if (data[4] == 0x2A) {
              int bal = data[6] - 0x80;
              return PrologyState(balance: bal);
            } else if (data[4] == 0x20) {
              int fad = data[6] - 0x80;
              return PrologyState(fader: fad);
            }
          }
          break;
        case 0x21:
          if (data.length >= 6) {
            int presetVal = data[5];
            EQPreset preset = EQPreset.values.firstWhere(
              (e) => e.value == presetVal,
              orElse: () => EQPreset.flat,
            );
            return PrologyState(eqPreset: preset);
          }
          break;
      }
    }
    return null;
  }
}
