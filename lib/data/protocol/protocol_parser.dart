/// PROLOGY BLE Protocol Parser v2.0
///
/// Основан на анализе HCI-лога (8842 пакета), декомпиляции APK и
/// альтернативной реализации prology_flutter_linux.
///
/// Формат пакета:
///   Request:  6F CMD TYPE LEN [DATA...] CS 8F
///   Response: 6F CMD TYPE LEN [DATA...] CS 8F
///
///   SYNC = 0x6F, END = 0x8F
///   TYPE: 0x70=req, 0x80=resp
///   CS = XOR всех байтов от 6F до последнего DATA
// ignore_for_file: dangling_library_doc_comments

class PrologyPacket {
  final int cmd;
  final int type; // 0x70=request, 0x80=response
  final int length;
  final List<int> data;
  final int checksum;
  final List<int> raw;

  const PrologyPacket({
    required this.cmd,
    required this.type,
    required this.length,
    required this.data,
    required this.checksum,
    required this.raw,
  });

  bool get isRequest => type == 0x70;
  bool get isResponse => type == 0x80;

  @override
  String toString() =>
      'PrologyPacket(CMD=0x${cmd.toRadixString(16).padLeft(2, '0')}, '
      'TYPE=0x${type.toRadixString(16).padLeft(2, '0')}, '
      'LEN=$length, DATA=${data.map((b) => b.toRadixString(16).padLeft(2, '0')).join(' ')})';
}

/// Команды протокола PROLOGY (подтверждены HCI-логом)
class PrologyCmd {
  PrologyCmd._();

  static const int eqPreset = 0x01;
  static const int xover = 0x03;
  static const int heartbeat = 0x04;
  static const int bassTreble = 0x08;
  static const int volume = 0x0f;
  static const int subwoofer = 0x11;
  static const int audioSettings = 0x41;
  static const int eqSettings = 0x43;
  static const int preset = 0x50;
  static const int request = 0x90;
  static const int deviceInfo = 0x93;
  static const int reqStatus = 0x9e;
  static const int bluetooth = 0xbe;

  // Из prology_flutter_linux:
  static const int eqGain = 0x02;
  static const int eqQFactor = 0x03;
  static const int subwooferVolume = 0x13;
  static const int bassBoost = 0x14;
  static const int xoverHpf = 0x20;
  static const int xoverLpf = 0x21;
  static const int timeAlignment = 0x30;
  static const int mute = 0x40;
  static const int factoryReset = 0x60;
  static const int getStatus = 0x70;

  static const int typeRequest = 0x70;
  static const int typeResponse = 0x80;
  static const int sync = 0x6f;
  static const int end = 0x8f;

  static const String deviceName = 'PROLOGY_BLE';
}

/// Парсер пакетов протокола PROLOGY
class ProtocolParser {
  /// Формирует пакет команды
  ///
  /// [cmd] — код команды
  /// [type] — тип (0x70=request, 0x80=response)
  /// [data] — полезные данные (без CS и END)
  static List<int> buildPacket(int cmd, int type, List<int> data) {
    final packet = <int>[
      PrologyCmd.sync,
      cmd,
      type,
      data.length,
      ...data,
    ];
    final cs = packet.fold<int>(0, (prev, b) => prev ^ b);
    packet.add(cs);
    packet.add(PrologyCmd.end);
    return packet;
  }

  /// Парсит сырой байтовый массив в [PrologyPacket]
  ///
  /// Возвращает `null`, если пакет невалидный.
  static PrologyPacket? parse(List<int> raw) {
    if (raw.length < 5) return null; // минимум: SYNC CMD TYPE LEN CS END
    if (raw.first != PrologyCmd.sync) return null;
    if (raw.last != PrologyCmd.end) return null;

    final cmd = raw[1];
    final type = raw[2];
    final length = raw[3];

    // data = от LEN+1 до предпоследнего (CS)
    final dataStart = 4;
    final dataEnd = raw.length - 2; // -1 CS, -1 END
    if (dataStart > dataEnd) {
      // нет данных
      final cs = raw[raw.length - 2];
      if (!_verifyChecksum(raw, cs)) return null;
      return PrologyPacket(
        cmd: cmd,
        type: type,
        length: length,
        data: [],
        checksum: cs,
        raw: raw,
      );
    }

    final data = raw.sublist(dataStart, dataEnd);
    if (data.length != length) return null; // LEN не совпадает

    final cs = raw[raw.length - 2];
    if (!_verifyChecksum(raw, cs)) return null;

    return PrologyPacket(
      cmd: cmd,
      type: type,
      length: length,
      data: data,
      checksum: cs,
      raw: raw,
    );
  }

  /// Проверяет XOR-контрольную сумму
  static bool _verifyChecksum(List<int> raw, int expectedCs) {
    // CS = XOR всех байтов от SYNC (0x6F) до последнего DATA
    final csEnd = raw.length - 2; // не включая CS и END
    if (csEnd < 1) return true; // слишком короткий, пропускаем
    final calculated = raw.sublist(0, csEnd).fold<int>(0, (p, b) => p ^ b);
    return calculated == expectedCs;
  }

  // ====== ВСПОМОГАТЕЛЬНЫЕ МЕТОДЫ ======

  /// Команда VOLUME (0x0F): 0-100
  static List<int> buildVolumeSet(int level) {
    final clamped = level.clamp(0, 100);
    return buildPacket(PrologyCmd.volume, PrologyCmd.typeRequest, [0x00, clamped]);
  }

  /// Команда VOLUME UP/DOWN
  static List<int> buildVolumeUp() => buildVolumeSet(1); // относительный шаг
  static List<int> buildVolumeDown() => buildVolumeSet(0);

  /// Команда BASS_TREBLE (0x08): type=1=bass, 2=treble, level=0-100
  static List<int> buildBassTrebleSet(int type, int level) {
    final clamped = level.clamp(0, 100);
    return buildPacket(PrologyCmd.bassTreble, PrologyCmd.typeRequest, [0x00, type, clamped]);
  }

  static List<int> buildBassSet(int level) => buildBassTrebleSet(1, level);
  static List<int> buildTrebleSet(int level) => buildBassTrebleSet(2, level);

  /// Команда EQ_PRESET (0x01)
  /// presetId: 0=flat, 3=rock, 4=jazz, 5=classical, 6=pop
  static List<int> buildEqPreset(int presetId) {
    return buildPacket(PrologyCmd.eqPreset, PrologyCmd.typeRequest, [0x00, presetId]);
  }

  /// Команда DEVICE_INFO (0x93)
  static List<int> buildDeviceInfo() {
    return buildPacket(PrologyCmd.deviceInfo, PrologyCmd.typeRequest, [0x00, 0x00]);
  }

  /// Команда EQ_SETTINGS (0x43)
  static List<int> buildEqSettings() {
    return buildPacket(PrologyCmd.eqSettings, PrologyCmd.typeRequest, [0x00, 0x01]);
  }

  /// Команда X-OVER (0x03) — запрос модели/настроек
  static List<int> buildXoverRequest() {
    return buildPacket(PrologyCmd.xover, PrologyCmd.typeRequest, [0x00, 0x00]);
  }

  /// Команда X-OVER HPF (0x20)
  /// [ch], [freq], [gain+12], [slope], [type]
  static List<int> buildXoverHpf(int ch, int freq, int gain, int slope, int type) {
    return buildPacket(PrologyCmd.xoverHpf, PrologyCmd.typeRequest, [
      ch, freq, (gain + 12) & 0xff, slope, type,
    ]);
  }

  /// Команда X-OVER LPF (0x21)
  static List<int> buildXoverLpf(int ch, int freq, int gain, int slope, int type) {
    return buildPacket(PrologyCmd.xoverLpf, PrologyCmd.typeRequest, [
      ch, freq, (gain + 12) & 0xff, slope, type,
    ]);
  }

  /// Команда TIME ALIGNMENT (0x30)
  static List<int> buildTimeAlignment(int channel, int delayMs) {
    return buildPacket(PrologyCmd.timeAlignment, PrologyCmd.typeRequest, [
      channel, delayMs,
    ]);
  }

  /// Команда SUBWOOFER (0x11) — запрос информации
  static List<int> buildSubwooferRequest() {
    return buildPacket(PrologyCmd.subwoofer, PrologyCmd.typeRequest, [0x00, 0x01]);
  }

  /// Команда SUBWOOFER VOLUME (0x13)
  static List<int> buildSubwooferVolume(int volume) {
    return buildPacket(PrologyCmd.subwooferVolume, PrologyCmd.typeRequest, [
      0x01, volume.clamp(0, 100),
    ]);
  }

  /// Команда BASS BOOST (0x14)
  static List<int> buildBassBoost(bool enabled, int level) {
    return buildPacket(PrologyCmd.bassBoost, PrologyCmd.typeRequest, [
      enabled ? 0x01 : 0x00, level.clamp(0, 100),
    ]);
  }

  /// Команда HEARTBEAT (0x04)
  static List<int> buildHeartbeat() {
    // из HCI-лога: 6f 04 71 0c 00 ea 07 03 0e 0a 28 23 01 00 01 03 00 8f
    return buildPacket(0x04, 0x71, [
      0x00, 0xea, 0x07, 0x03, 0x0e, 0x0a, 0x28, 0x23, 0x01, 0x00, 0x01, 0x03, 0x00,
    ]);
  }

  /// Команда MUTE (0x40) per-channel
  static List<int> buildMuteChannel(int channel, bool mute) {
    return buildPacket(PrologyCmd.mute, PrologyCmd.typeRequest, [
      channel, mute ? 0x01 : 0x00,
    ]);
  }

  /// Команда GET_STATUS (0x70)
  static List<int> buildGetStatus() {
    return buildPacket(PrologyCmd.getStatus, PrologyCmd.typeRequest, [0x00, 0x01]);
  }

  /// Команда EQ GAIN (0x02) — 60-band parametric EQ
  static List<int> buildEqGain(int band, int gainDb) {
    // gain: -12..+12, передаётся как gain+12
    return buildPacket(PrologyCmd.eqGain, PrologyCmd.typeRequest, [
      band, (gainDb + 12).clamp(0, 24),
    ]);
  }

  /// Команда EQ Q-Factor (0x03)
  static List<int> buildEqQFactor(int band, int qValue) {
    return buildPacket(PrologyCmd.eqQFactor, PrologyCmd.typeRequest, [
      band, qValue,
    ]);
  }

  /// Парсинг ответа VOLUME (0x0F)
  static int? parseVolumeResponse(PrologyPacket pkt) {
    if (pkt.cmd != PrologyCmd.volume || !pkt.isResponse) return null;
    if (pkt.data.length >= 3) {
      return pkt.data[2]; // [0x00, 0x01, <volume>]
    }
    return null;
  }

  /// Парсинг ответа BASS_TREBLE (0x08)
  static int? parseBassTrebleResponse(PrologyPacket pkt) {
    if (pkt.cmd != PrologyCmd.bassTreble || !pkt.isResponse) return null;
    if (pkt.data.length >= 3) {
      return pkt.data[2]; // [0x00, 0x00, <level>, 0x00]
    }
    return null;
  }

  /// Парсинг ответа DEVICE_INFO (0x93)
  static String? parseDeviceInfoResponse(PrologyPacket pkt) {
    if (pkt.cmd != PrologyCmd.deviceInfo || !pkt.isResponse) return null;
    if (pkt.data.length >= 2) {
      // data[0] = 0x00, data[1] = length, data[2..] = serial ASCII
      final serialLen = pkt.data[1];
      if (pkt.data.length >= serialLen + 2) {
        return String.fromCharCodes(pkt.data.sublist(2, 2 + serialLen));
      }
    }
    return null;
  }
}
