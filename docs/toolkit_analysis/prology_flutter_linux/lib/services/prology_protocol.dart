import 'dart:typed_data';
import '../models/prology_state.dart';

class PrologyProtocol {
  static const SERVICE_UUID = '0000ae00-0000-1000-8000-00805f9b34fb';
  static const CMD_CHAR_UUID = '0000ae01-0000-1000-8000-00805f9b34fb';
  static const NOTIFY_CHAR_UUID = '0000ae02-0000-1000-8000-00805f9b34fb';

  static const int SYNC = 0x6F;
  static const int END = 0x8F;

  static const Map<int, Map<int, int>> CRC_CONSTANTS = {
    0x05: {0x01: 0xCC, 0x05: 0xCC, 0x06: 0xCE},
    0x06: {0xFE: 0x3E},
    0x07: {0x01: 0xCC, 0x05: 0xCC, 0x06: 0xCE},
    0x90: {0x00: 0xC3, 0x01: 0xC5, 0x03: 0xB8},
    0x91: {0x01: 0xC5},
    0x92: {0x0A: 0xFF, 0x0B: 0xF9, 0x0C: 0x47, 0x0D: 0x90},
    0x94: {0x00: 0xCD},
    0x99: {0x00: 0xC5},
    0x9A: {
      0x01: 0xC5, 0x03: 0x20, 0x04: 0xFF, 0x05: 0xF1,
      0x06: 0xF7, 0x07: 0x83, 0x0A: 0xF9, 0x0B: 0xF9,
      0x0C: 0x02, 0x0D: 0xED, 0x10: 0xE7, 0x11: 0xE5,
      0x14: 0xFD, 0x15: 0xFD, 0x16: 0xF9, 0x17: 0xF9,
      0x18: 0x06, 0x1A: 0xF9, 0x1F: 0x6E, 0x21: 0xAD,
      0x27: 0xA1, 0x2A: 0xB8,
    },
    0x9E: {0x06: 0xFE},
    0x9F: {0x00: 0xFE},
    0xB0: {
      0x00: 0xC7, 0x01: 0xC5, 0x02: 0xC7, 0x04: 0xAC,
      0x05: 0xCC, 0x06: 0xC8, 0x07: 0x36, 0x08: 0x3A,
      0x0A: 0xB8, 0x0C: 0xBD, 0x0D: 0xBD, 0x0F: 0xB9,
      0x10: 0xA3, 0x16: 0xAF, 0x17: 0xAD,
    },
    0xB1: {0x00: 0xC5},
    0xFF: {0x00: 0x11},
  };

  static int _calculateCrc(List<int> data) {
    if (data.length <= 3) return 0;
    int xor = data[0] ^ data[1];
    for (int i = 3; i < data.length; i++) {
      xor ^= data[i];
    }
    int type = data.length > 3 ? data[3] : 0;
    int subcmd = data.length > 4 ? data[4] : 0;
    int constant = CRC_CONSTANTS[type]?[subcmd] ?? 0;
    return xor ^ constant;
  }

  static Uint8List buildCommand(int cmd, int subcmd, List<int> payload) {
    List<int> data = [SYNC, cmd, subcmd, payload.length, ...payload];
    int checksum = _calculateCrc(data);
    return Uint8List.fromList([...data, checksum, END]);
  }

  static Uint8List buildResponse(int cmd, int subcmd, List<int> payload) {
    List<int> data = [SYNC, cmd | 0x80, subcmd, payload.length, ...payload];
    int checksum = _calculateCrc(data);
    return Uint8List.fromList([...data, checksum, END]);
  }

  static Uint8List buildInitCommand() {
    return buildCommand(0x93, 0x70, [0x00, 0x00]);
  }

  static Uint8List buildVolumeCommand(bool up) {
    return buildCommand(0x0F, 0x70, [0x01, up ? 0x64 : 0x00]);
  }

  static Uint8List buildEQPresetCommand(EQPreset preset) {
    return buildCommand(0x01, 0x70, [0x01, preset.subtype]);
  }

  static Uint8List buildEQGainCommand(int band, int gain) {
    return buildCommand(0x02, 0x70, [band, gain + 12]);
  }

  static Uint8List buildEQQFactorCommand(int band, int qFactor) {
    return buildCommand(0x03, 0x70, [band, qFactor]);
  }

  static Uint8List buildBassCommand(int level) {
    return buildCommand(0x11, 0x70, [0x01, level + 12]);
  }

  static Uint8List buildTrebleCommand(int level) {
    return buildCommand(0x12, 0x70, [0x02, level + 12]);
  }

  static Uint8List buildSubwooferVolumeCommand(int volume) {
    return buildCommand(0x13, 0x70, [0x01, volume]);
  }

  static Uint8List buildBassBoostCommand(bool enable, int level) {
    return buildCommand(0x14, 0x70, [enable ? 0x01 : 0x00, level]);
  }

  static Uint8List buildXOverHPFCommand(int ch, int freq, int gain, int slope, int type) {
    return buildCommand(0x20, 0x70, [ch, freq, gain + 12, slope, type]);
  }

  static Uint8List buildXOverLPFCommand(int ch, int freq, int gain, int slope, int type) {
    return buildCommand(0x21, 0x70, [ch, freq, gain + 12, slope, type]);
  }

  static Uint8List buildTimeAlignmentCommand(int ch, int delay) {
    return buildCommand(0x30, 0x70, [ch, delay]);
  }

  static Uint8List buildMuteCommand(int ch, bool enable) {
    return buildCommand(0x40, 0x70, [ch, enable ? 0x01 : 0x00]);
  }

  static Uint8List buildPresetSaveCommand(int slot, String name) {
    List<int> nameBytes = name.codeUnits.take(8).toList();
    while (nameBytes.length < 8) nameBytes.add(0x20);
    return buildCommand(0x50, 0x70, [slot, ...nameBytes]);
  }

  static Uint8List buildFactoryResetCommand() {
    return buildCommand(0x60, 0x70, [0x00]);
  }

  static Uint8List buildGetStatusCommand() {
    return buildCommand(0x70, 0x70, [0x00, 0x01]);
  }

  static Uint8List buildBeepCommand(bool enable) {
    return buildCommand(0xFF, 0x70, [enable ? 0x01 : 0x00]);
  }

  static Uint8List buildBalanceCommand(int balance) {
    int balValue = ((balance.clamp(-100, 100) + 100) * 127 ~/ 200) & 0xFF;
    return buildCommand(0x9A, 0x2A, [0x03, balValue]);
  }

  static Uint8List buildFaderCommand(int fader) {
    int fadValue = ((fader.clamp(-100, 100) + 100) * 127 ~/ 200) & 0xFF;
    return buildCommand(0x9A, 0x20, [0x01, fadValue]);
  }

  static Uint8List buildInputCommand(InputSource input) {
    return buildCommand(0x93, 0x70, [0x04, input.value]);
  }

  static PrologyState? parseResponse(Uint8List data) {
    if (data.isEmpty || data[0] != SYNC) return null;
    if (data.length < 5) return null;
    if (data.last != END) return null;

    int cmd = data[1];
    int subcmd = data[2];
    int length = data[3];
    if (data.length < length + 4) return null;

    List<int> payload = data.sublist(4, 4 + length);

    switch (cmd) {
      case 0x10:
        if (subcmd == 0x80 && payload.length >= 1) {
          int volume = payload[0];
          return PrologyState(volume: volume);
        }
        break;

      case 0x80:
        if (subcmd == 0x80 && payload.length >= 1) {
          int volume = payload[0];
          return PrologyState(volume: volume);
        }
        break;

      case 0x81:
        if (payload.isNotEmpty) {
          int bass = payload[0] - 12;
          return PrologyState(bass: bass);
        }
        break;

      case 0x82:
        if (payload.isNotEmpty) {
          int treble = payload[0] - 12;
          return PrologyState(treble: treble);
        }
        break;

      case 0x83:
        if (payload.length >= 2) {
          int subwooferVol = payload[1];
          return PrologyState();
        }
        break;

      case 0x93:
        if (payload.length >= 2) {
          int inputVal = payload[1];
          InputSource? input;
          if (inputVal < InputSource.values.length) {
            input = InputSource.values[inputVal];
          }
          return PrologyState(input: input ?? InputSource.bluetooth);
        }
        break;

      case 0x9A:
        if (subcmd == 0x80) {
          if (payload.isNotEmpty) {
            int presetVal = payload[0];
            EQPreset preset = EQPreset.values.firstWhere(
              (e) => e.subtype == presetVal,
              orElse: () => EQPreset.flat,
            );
            return PrologyState(eqPreset: preset);
          }
        }
        break;

      case 0x70:
        if (subcmd == 0x80 && payload.length >= 4) {
          int volume = payload[0];
          int inputVal = payload[1];
          int presetVal = payload[2];
          EQPreset preset = EQPreset.values.firstWhere(
            (e) => e.subtype == presetVal,
            orElse: () => EQPreset.flat,
          );
          InputSource? input;
          if (inputVal < InputSource.values.length) {
            input = InputSource.values[inputVal];
          }
          List<int> bands = [];
          for (int i = 4; i < payload.length && i < 29; i++) {
            bands.add(payload[i]);
          }
          return PrologyState(
            volume: volume,
            input: input ?? InputSource.bluetooth,
            eqPreset: preset,
            eqBands: bands,
          );
        }
        break;
    }
    return null;
  }
}
