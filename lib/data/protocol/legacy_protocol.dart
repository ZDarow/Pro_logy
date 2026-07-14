/// LEGACY PROLOGY Protocol Builder v1 (F0-формат)
///
/// Оригинальный протокол из APK: F0 00 LEN A0 10 0E CMD [DATA] CS
/// CS = (sum(data) + 0x10) & 0xFF — для TX
/// Ответы: C0 00 LEN TYPE [DATA] CS, CS = (sum(data) + 0x40) & 0xFF
// ignore_for_file: dangling_library_doc_comments

import 'protocol_parser.dart';

/// Построитель legacy-команд (F0-формат)
///
/// Используется только при [ProtocolVersion.legacy].
/// Все методы возвращают готовый байтовый массив для отправки.
class LegacyProtocolBuilder {
  LegacyProtocolBuilder._();

  /// Формирует F0-пакет
  ///
  /// [cmd] — код команды (например 0x18=volume, 0x24=input)
  /// [data] — полезные данные
  static List<int> _buildF0Packet(int cmd, List<int> data) {
    final payload = <int>[data.length + 4, 0xa0, 0x10, 0x0e, cmd, ...data];
    final cs = (payload.fold(0, (p, b) => p + b) + 0x10) & 0xFF;
    return <int>[0xf0, 0x00, ...payload, cs];
  }

  // ====== INIT ======

  static List<int> buildInit() {
    final payload = <int>[0x03, 0x01, 0x05, 0x00];
    final checksum = (payload.fold(0, (p, b) => p + b) + 0x10) & 0xFF;
    return <int>[0xf0, 0x00, ...payload, checksum];
  }

  // ====== VOLUME (0x18) ======

  static List<int> buildVolumeSet(int clamped) {
    return _buildF0Packet(0x18, [clamped]);
  }

  // ====== BASS / TREBLE (0x24) ======

  static List<int> buildBassSet(int clamped) {
    final bassVal = ((clamped * 20) ~/ 100) - 10;
    return _buildF0Packet(0x24, [bassVal + 0x10]);
  }

  static List<int> buildTrebleSet(int clamped) {
    final trebVal = ((clamped * 20) ~/ 100) - 10;
    return _buildF0Packet(0x24, [trebVal + 0x20]);
  }

  // ====== BALANCE / FADER (0x2a / 0x20) ======

  static List<int> buildBalance(int value) {
    return _buildF0Packet(0x2a, [0x03, value + 0x10]);
  }

  static List<int> buildFader(int value) {
    return _buildF0Packet(0x20, [0x01, value + 0x10]);
  }

  // ====== EQ PRESET (0x26) ======

  static List<int> buildEqPreset(int preset) {
    const legacyPresets = [0x08, 0x03, 0x04, 0x09, 0x0a, 0x05, 0x06];
    final p = preset < legacyPresets.length ? legacyPresets[preset] : 0x08;
    return _buildF0Packet(0x26, [0x01, p]);
  }

  // ====== INPUT SELECT (0x24) ======

  static List<int> buildInputSelect(String input) {
    int inputCode;
    switch (input.toUpperCase()) {
      case 'RADIO':
        inputCode = 0x01;
        break;
      case 'USB':
        inputCode = 0x02;
        break;
      case 'SD':
        inputCode = 0x03;
        break;
      case 'BT':
        inputCode = 0x04;
        break;
      case 'AUX':
        inputCode = 0x05;
        break;
      case 'DISC':
        inputCode = 0x06;
        break;
      case 'GPS':
        inputCode = 0x07;
        break;
      case 'SXM':
        inputCode = 0x08;
        break;
      case 'AVIN':
      case 'AV IN':
        inputCode = 0x09;
        break;
      default:
        inputCode = 0x01;
    }
    return _buildF0Packet(0x24, [inputCode]);
  }

  // ====== PLAYBACK ======

  static List<int> buildPlayPause() {
    return _buildF0Packet(0x01, []);
  }

  static List<int> buildNextTrack() {
    return _buildF0Packet(0x02, []);
  }

  static List<int> buildPrevTrack() {
    return _buildF0Packet(0x03, []);
  }

  // ====== RADIO ======

  static List<int> buildRadioSeekUp() {
    return _buildF0Packet(0x80, []);
  }

  static List<int> buildRadioSeekDown() {
    return _buildF0Packet(0x81, []);
  }

  static List<int> buildRadioSetFreq(double freq, bool isFm) {
    final freqCode = isFm ? (freq * 10).toInt() : freq.toInt();
    return _buildF0Packet(isFm ? 0x82 : 0x83, [freqCode >> 8, freqCode & 0xFF]);
  }

  // ====== EXTENDED SETTINGS ======

  static List<int> buildLoudness(bool enabled, {int level = 0, int freq = 0}) {
    return _buildF0Packet(0x30, [enabled ? 1 : 0, level, freq]);
  }

  static List<int> buildSubwoofer({int level = 0, int freq = 0, int phase = 0}) {
    return _buildF0Packet(0x40, [level, freq, phase]);
  }

  static List<int> buildXOver({int type = 0, int freq = 0}) {
    return _buildF0Packet(0x50, [type, freq]);
  }

  static List<int> buildEqPlus({int band = 0, int freq = 0, int gain = 0, int q = 0}) {
    return _buildF0Packet(0x70, [band, freq, gain, q]);
  }

  // ====== PARSING LEGACY NOTIFICATIONS ======

  /// Парсит входящий C0-пакет и обновляет [PrologyState].
  /// Возвращает true, если состояние изменилось.
  static bool parseLegacyNotification(List<int> data, PrologyState state) {
    if (data.length < 4) return false;
    if (data.first != 0xC0) return false;

    final payload = data.sublist(2, data.length - 1);
    final calc = (payload.fold(0, (prev, element) => prev + element) + 0x40) & 0xFF;
    if (calc != data.last) {
      // checksum error — пропускаем
      return false;
    }

    final len = data[2];
    final type = data[3];
    bool stateChanged = false;

    if (type == 0x90 && len == 0x03 && data.length >= 6) {
      state.volume = data[4].clamp(0, 28);
      stateChanged = true;
    } else if (type == 0x91 && len == 0x04 && data.length >= 7) {
      final b = data[4] - 0x10;
      state.bass = ((b.clamp(-10, 10) + 10) * 5);
      final t = data[5] - 0x20;
      state.treble = ((t.clamp(-10, 10) + 10) * 5);
      stateChanged = true;
    } else if (type == 0x92 && len == 0x05 && data.length >= 8) {
      state.balance = data[6] - 0x10;
      state.fader = data[7] - 0x10;
      stateChanged = true;
    } else if (type == 0x93 && len == 0x03 && data.length >= 6) {
      state.inputSource = _inputCodeToString(data[5]);
      stateChanged = true;
    }

    return stateChanged;
  }

  static String _inputCodeToString(int code) {
    switch (code) {
      case 0x01: return 'RADIO';
      case 0x02: return 'USB';
      case 0x03: return 'SD';
      case 0x04: return 'BT';
      case 0x05: return 'AUX';
      case 0x06: return 'DISC';
      default: return 'UNKNOWN';
    }
  }
}
