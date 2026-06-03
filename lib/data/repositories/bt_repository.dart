import 'dart:async';
import 'package:flutter/foundation.dart';
import 'package:flutter_blue_plus/flutter_blue_plus.dart';
import '../protocol/protocol_parser.dart';
import '../transport/abstract_transport.dart';
import '../transport/ble_transport.dart';

/// Версия протокола
enum ProtocolVersion {
  /// v1 — старый: F0 00 LEN A0 10 0E CMD DATA (sum+0x10) — оригинальный APK
  legacy,

  /// v2 — HCI-лог: 6F CMD TYPE LEN DATA XOR 8F — подтверждённый реальный трафик
  hci,
}

enum BtConnectionStatus { disconnected, connecting, connected, error }

class PrologyState {
  int volume = 0; // 0-100 (v2), 0-28 (v1 legacy)
  int bass = 0; // 0-100 (v2), -10..+10 (v1)
  int treble = 0; // 0-100 (v2), -10..+10 (v1)
  int balance = 0; // -10..+10
  int fader = 0; // -10..+10
  int eqPreset = 0; // 0=flat, 3=rock, 4=jazz, 5=classical, 6=pop
  String inputSource = 'RADIO';
  bool isConnected = false;
  String deviceSerial = '';
  String deviceModel = '';
  String deviceFirmware = '';
}

class BtRepository {
  // Версия протокола
  final ProtocolVersion protocolVersion;

  /// Транспортный слой (BLE, SPP и т.д.)
  final AbstractTransport transport;

  StreamSubscription? _transportSubscription;

  BtConnectionStatus _status = BtConnectionStatus.disconnected;
  String? _errorMessage;
  final PrologyState _state = PrologyState();
  final StreamController<PrologyState> _stateController =
      StreamController<PrologyState>.broadcast();

  /// Контроллер статуса для внешних наблюдателей (connectionState)
  final StreamController<BtConnectionStatus> _statusController =
      StreamController<BtConnectionStatus>.broadcast();

  Timer? _heartbeatTimer;

  BtRepository({
    this.protocolVersion = ProtocolVersion.hci,
    AbstractTransport? transport,
  }) : transport = transport ?? BleTransport() {
    _stateController.onListen = () {
      _stateController.add(_state);
    };
    _statusController.onListen = () {
      _statusController.add(_status);
    };
  }

  BtConnectionStatus get status => _status;
  String? get errorMessage => _errorMessage;
  bool get isConnected => _status == BtConnectionStatus.connected;
  PrologyState get state => _state;
  Stream<PrologyState> get stateStream => _stateController.stream;

  /// Поток статуса Bluetooth для HomeScreen (BluetoothConnectionState)
  Stream<BluetoothConnectionState> get connectionState {
    return _statusController.stream.map((s) {
      // connecting deprecated — Android & iOS не стримят это состояние
      return s == BtConnectionStatus.connected
          ? BluetoothConnectionState.connected
          : BluetoothConnectionState.disconnected;
    });
  }

  // =======================================================================
  // CONNECT / DISCONNECT
  // =======================================================================

  /// Подключиться через транспорт (транспорт сам сканирует или использует
  /// предварительно заданный адрес через [BleTransport.setTargetAddress])
  Future<bool> connect() async {
    _status = BtConnectionStatus.connecting;
    _statusController.add(_status);
    _errorMessage = null;

    // Слушаем входящие данные от транспорта
    _transportSubscription?.cancel();
    _transportSubscription = transport.onData.listen(_onTransportData);

    final ok = await transport.connect();
    if (!ok) {
      _status = BtConnectionStatus.error;
      _errorMessage = transport.errorMessage;
      _statusController.add(_status);
      return false;
    }

    _status = BtConnectionStatus.connected;
    _state.isConnected = true;
    _statusController.add(_status);
    _updateState();
    await _sendInit();
    _startHeartbeat();
    return true;
  }

  /// Подключиться к BLE-устройству по MAC-адресу
  Future<bool> connectToAddress(String remoteId) async {
    if (transport is BleTransport) {
      (transport as BleTransport).setTargetAddress(remoteId);
    }
    return connect();
  }

  Future<void> disconnect() async {
    _heartbeatTimer?.cancel();
    _heartbeatTimer = null;
    _transportSubscription?.cancel();
    _transportSubscription = null;
    await transport.disconnect();
    _status = BtConnectionStatus.disconnected;
    _state.isConnected = false;
    _statusController.add(_status);
    _updateState();
  }

  void _onTransportData(List<int> data) {
    debugPrint(
        'RX (${data.length}B): ${data.map((b) => b.toRadixString(16).padLeft(2, '0')).join(' ')}');
    parseNotification(data);
  }

  void _updateState() {
    _stateController.add(_state);
  }

  void dispose() {
    _heartbeatTimer?.cancel();
    _transportSubscription?.cancel();
    transport.dispose();
    _stateController.close();
    _statusController.close();
    debugPrint('BtRepository disposed');
  }

  // =======================================================================
  // HEARTBEAT
  // =======================================================================

  void _startHeartbeat() {
    _heartbeatTimer?.cancel();
    _heartbeatTimer = Timer.periodic(const Duration(seconds: 10), (_) {
      if (protocolVersion == ProtocolVersion.hci) {
        sendCommand(ProtocolParser.buildHeartbeat());
      }
    });
  }

  // =======================================================================
  // INIT + SEND
  // =======================================================================

  Future<void> _sendInit() async {
    switch (protocolVersion) {
      case ProtocolVersion.hci:
        await sendCommand(ProtocolParser.buildDeviceInfo());
        await Future.delayed(const Duration(milliseconds: 100));
        await sendCommand(ProtocolParser.buildEqSettings());
        await Future.delayed(const Duration(milliseconds: 100));
        await sendCommand(ProtocolParser.buildXoverRequest());
        break;

      case ProtocolVersion.legacy:
        final payload = <int>[0x03, 0x01, 0x05, 0x00];
        final checksum = (payload.fold(0, (p, b) => p + b) + 0x10) & 0xFF;
        await sendCommand(<int>[0xf0, 0x00, ...payload, checksum]);
        break;
    }
  }

  Future<bool> sendCommand(List<int> data, {int retries = 2}) async {
    if (!transport.isConnected) {
      _errorMessage = 'Not connected';
      return false;
    }

    for (int attempt = 0; attempt < retries; attempt++) {
      try {
        final ok = await transport.send(data);
        if (ok) {
          debugPrint(
              'TX: ${data.map((b) => b.toRadixString(16).padLeft(2, '0')).join(' ')}');
          return true;
        }
      } catch (e) {
        if (attempt == retries - 1) {
          _errorMessage = 'Failed to send: $e';
          return false;
        }
        await Future.delayed(Duration(milliseconds: 100 * (attempt + 1)));
      }
    }
    return false;
  }

  // =======================================================================
  // VOLUME (CMD 0x0F, range 0-100)
  // =======================================================================

  Future<bool> volumeUp() async {
    final newVol = (_state.volume + 5).clamp(0, 100);
    return volumeSet(newVol);
  }

  Future<bool> volumeDown() async {
    final newVol = (_state.volume - 5).clamp(0, 100);
    return volumeSet(newVol);
  }

  Future<bool> volumeSet(int value) async {
    final clamped = value.clamp(0, 100);
    List<int> cmd;
    switch (protocolVersion) {
      case ProtocolVersion.hci:
        cmd = ProtocolParser.buildVolumeSet(clamped);
        break;
      case ProtocolVersion.legacy:
        final payload = <int>[0x05, 0xa0, 0x10, 0x0e, 0x18, clamped];
        final cs = (payload.fold(0, (p, b) => p + b) + 0x10) & 0xFF;
        cmd = <int>[0xf0, 0x00, ...payload, cs];
        break;
    }
    final result = await sendCommand(cmd);
    if (result) {
      _state.volume = clamped;
      _updateState();
    }
    return result;
  }

  // =======================================================================
  // BASS / TREBLE (CMD 0x08, type 0x01/0x02, range 0-100)
  // =======================================================================

  Future<bool> setBass(int value) async {
    final clamped = value.clamp(0, 100);
    List<int> cmd;
    switch (protocolVersion) {
      case ProtocolVersion.hci:
        cmd = ProtocolParser.buildBassSet(clamped);
        break;
      case ProtocolVersion.legacy:
        final bassVal = ((clamped * 20) ~/ 100) - 10;
        final payload = <int>[0x05, 0xa0, 0x10, 0x0e, 0x24, bassVal + 0x10];
        final cs = (payload.fold(0, (p, b) => p + b) + 0x10) & 0xFF;
        cmd = <int>[0xf0, 0x00, ...payload, cs];
        break;
    }
    final result = await sendCommand(cmd);
    if (result) {
      _state.bass = clamped;
      _updateState();
    }
    return result;
  }

  Future<bool> setTreble(int value) async {
    final clamped = value.clamp(0, 100);
    List<int> cmd;
    switch (protocolVersion) {
      case ProtocolVersion.hci:
        cmd = ProtocolParser.buildTrebleSet(clamped);
        break;
      case ProtocolVersion.legacy:
        final trebVal = ((clamped * 20) ~/ 100) - 10;
        final payload = <int>[0x05, 0xa0, 0x10, 0x0e, 0x24, trebVal + 0x20];
        final cs = (payload.fold(0, (p, b) => p + b) + 0x10) & 0xFF;
        cmd = <int>[0xf0, 0x00, ...payload, cs];
        break;
    }
    final result = await sendCommand(cmd);
    if (result) {
      _state.treble = clamped;
      _updateState();
    }
    return result;
  }

  // =======================================================================
  // BALANCE / FADER
  // =======================================================================

  Future<bool> setBalance(int value) async {
    if (value < -10) value = -10;
    if (value > 10) value = 10;
    final payload = <int>[0x06, 0xa0, 0x10, 0x0e, 0x2a, 0x03, value + 0x10];
    final cs = (payload.fold(0, (p, b) => p + b) + 0x10) & 0xFF;
    final cmd = <int>[0xf0, 0x00, ...payload, cs];
    final result = await sendCommand(cmd);
    if (result) {
      _state.balance = value;
      _updateState();
    }
    return result;
  }

  Future<bool> setFader(int value) async {
    if (value < -10) value = -10;
    if (value > 10) value = 10;
    final payload = <int>[0x06, 0xa0, 0x10, 0x0e, 0x20, 0x01, value + 0x10];
    final cs = (payload.fold(0, (p, b) => p + b) + 0x10) & 0xFF;
    final cmd = <int>[0xf0, 0x00, ...payload, cs];
    final result = await sendCommand(cmd);
    if (result) {
      _state.fader = value;
      _updateState();
    }
    return result;
  }

  Future<bool> setEqPreset(int preset) async {
    List<int> cmd;
    switch (protocolVersion) {
      case ProtocolVersion.hci:
        cmd = ProtocolParser.buildEqPreset(preset);
        break;
      case ProtocolVersion.legacy:
        final legacyPresets = [0x08, 0x03, 0x04, 0x09, 0x0a, 0x05, 0x06];
        final p = preset < legacyPresets.length ? legacyPresets[preset] : 0x08;
        final payload = <int>[0x06, 0xa0, 0x10, 0x0e, 0x26, 0x01, p];
        final cs = (payload.fold(0, (p, b) => p + b) + 0x10) & 0xFF;
        cmd = <int>[0xf0, 0x00, ...payload, cs];
        break;
    }
    final result = await sendCommand(cmd);
    if (result) {
      _state.eqPreset = preset;
      _updateState();
    }
    return result;
  }

  // =======================================================================
  // INPUT SOURCE SELECTION
  // =======================================================================

  Future<bool> setInput(String input) async {
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
    final payload = <int>[0x05, 0xa0, 0x10, 0x0e, 0x24, inputCode];
    final checksum = (payload.fold(0, (prev, element) => prev + element) + 0x10) & 0xFF;
    final cmd = <int>[0xf0, 0x00, ...payload, checksum];
    final result = await sendCommand(cmd);
    if (result) {
      _state.inputSource = input.toUpperCase();
      _updateState();
    }
    return result;
  }

  // =======================================================================
  // PLAYBACK
  // =======================================================================

  Future<bool> playPause() async {
    final payload = <int>[0x04, 0xa0, 0x10, 0x0e, 0x01];
    final checksum = (payload.fold(0, (p, b) => p + b) + 0x10) & 0xFF;
    return await sendCommand(<int>[0xf0, 0x00, ...payload, checksum]);
  }

  Future<bool> nextTrack() async {
    final payload = <int>[0x04, 0xa0, 0x10, 0x0e, 0x02];
    final checksum = (payload.fold(0, (p, b) => p + b) + 0x10) & 0xFF;
    return await sendCommand(<int>[0xf0, 0x00, ...payload, checksum]);
  }

  Future<bool> prevTrack() async {
    final payload = <int>[0x04, 0xa0, 0x10, 0x0e, 0x03];
    final checksum = (payload.fold(0, (p, b) => p + b) + 0x10) & 0xFF;
    return await sendCommand(<int>[0xf0, 0x00, ...payload, checksum]);
  }

  // =======================================================================
  // RADIO
  // =======================================================================

  Future<bool> radioSeekUp() async {
    final payload = <int>[0x04, 0xa0, 0x10, 0x0e, 0x80];
    final checksum = (payload.fold(0, (p, b) => p + b) + 0x10) & 0xFF;
    return await sendCommand(<int>[0xf0, 0x00, ...payload, checksum]);
  }

  Future<bool> radioSeekDown() async {
    final payload = <int>[0x04, 0xa0, 0x10, 0x0e, 0x81];
    final checksum = (payload.fold(0, (p, b) => p + b) + 0x10) & 0xFF;
    return await sendCommand(<int>[0xf0, 0x00, ...payload, checksum]);
  }

  Future<bool> radioSetFreq(double freq, bool isFm) async {
    int freqCode = isFm ? (freq * 10).toInt() : freq.toInt();
    final payload = <int>[0x05, 0xa0, 0x10, 0x0e, isFm ? 0x82 : 0x83, freqCode >> 8, freqCode & 0xFF];
    final checksum = (payload.fold(0, (p, b) => p + b) + 0x10) & 0xFF;
    return await sendCommand(<int>[0xf0, 0x00, ...payload, checksum]);
  }

  // =======================================================================
  // EXTENDED DSP (HCI protocol — CMD 0x20, 0x21, 0x30, 0x40, 0x13, 0x14)
  // =======================================================================

  Future<bool> setXoverHpf(int ch, int freq, int gain, int slope, int type) async {
    final cmd = ProtocolParser.buildXoverHpf(ch, freq, gain, slope, type);
    return await sendCommand(cmd);
  }

  Future<bool> setXoverLpf(int ch, int freq, int gain, int slope, int type) async {
    final cmd = ProtocolParser.buildXoverLpf(ch, freq, gain, slope, type);
    return await sendCommand(cmd);
  }

  Future<bool> setTimeAlignment(int channel, int delayMs) async {
    final cmd = ProtocolParser.buildTimeAlignment(channel, delayMs);
    return await sendCommand(cmd);
  }

  Future<bool> setMuteChannel(int channel, bool mute) async {
    final cmd = ProtocolParser.buildMuteChannel(channel, mute);
    return await sendCommand(cmd);
  }

  Future<bool> setSubwooferVolume(int volume) async {
    final cmd = ProtocolParser.buildSubwooferVolume(volume);
    return await sendCommand(cmd);
  }

  Future<bool> setBassBoost(bool enabled, int level) async {
    final cmd = ProtocolParser.buildBassBoost(enabled, level);
    return await sendCommand(cmd);
  }

  Future<bool> setEqBandGain(int band, int gainDb) async {
    final cmd = ProtocolParser.buildEqGain(band, gainDb);
    return await sendCommand(cmd);
  }

  Future<bool> getStatus() async {
    final cmd = ProtocolParser.buildGetStatus();
    return await sendCommand(cmd);
  }

  // =======================================================================
  // LEGACY EXTENDED SETTINGS
  // =======================================================================

  Future<bool> setLoudness(bool enabled, {int level = 0, int freq = 0}) async {
    final payload = <int>[0x07, 0xa0, 0x10, 0x0e, 0x30, enabled ? 1 : 0, level, freq];
    final cs = (payload.fold(0, (p, b) => p + b) + 0x10) & 0xFF;
    return await sendCommand(<int>[0xf0, 0x00, ...payload, cs]);
  }

  Future<bool> setSubwoofer({int level = 0, int freq = 0, int phase = 0}) async {
    final payload = <int>[0x08, 0xa0, 0x10, 0x0e, 0x40, level, freq, phase];
    final cs = (payload.fold(0, (p, b) => p + b) + 0x10) & 0xFF;
    return await sendCommand(<int>[0xf0, 0x00, ...payload, cs]);
  }

  Future<bool> setXOver({int type = 0, int freq = 0}) async {
    final payload = <int>[0x06, 0xa0, 0x10, 0x0e, 0x50, type, freq];
    final cs = (payload.fold(0, (p, b) => p + b) + 0x10) & 0xFF;
    return await sendCommand(<int>[0xf0, 0x00, ...payload, cs]);
  }

  Future<bool> setEqPlus({int band = 0, int freq = 0, int gain = 0, int q = 0}) async {
    final payload = <int>[0x09, 0xa0, 0x10, 0x0e, 0x70, band, freq, gain, q];
    final cs = (payload.fold(0, (p, b) => p + b) + 0x10) & 0xFF;
    return await sendCommand(<int>[0xf0, 0x00, ...payload, cs]);
  }

  // =======================================================================
  // NOTIFICATION PARSING
  // =======================================================================

  void parseNotification(List<int> data) {
    if (data.isEmpty) return;

    // Формат v2 (6F...8F)
    if (data.first == 0x6f && data.last == 0x8f) {
      _parseHciNotification(data);
      return;
    }

    // Формат v1 (C0 00 ...)
    if (data.first == 0xC0) {
      _parseLegacyNotification(data);
      return;
    }

    debugPrint('Unknown notification format: ${data.first.toRadixString(16)}');
  }

  void _parseHciNotification(List<int> raw) {
    final pkt = ProtocolParser.parse(raw);
    if (pkt == null) {
      debugPrint('Failed to parse HCI notification');
      return;
    }

    bool stateChanged = false;

    switch (pkt.cmd) {
      case 0x0f: // VOLUME response
        final vol = ProtocolParser.parseVolumeResponse(pkt);
        if (vol != null) {
          _state.volume = vol.clamp(0, 100);
          stateChanged = true;
        }
        break;

      case 0x08: // BASS_TREBLE response
        final val = ProtocolParser.parseBassTrebleResponse(pkt);
        if (val != null) {
          if (pkt.data.length >= 3) {
            final type = pkt.data[1];
            if (type == 0x01) {
              _state.bass = val.clamp(0, 100);
            } else if (type == 0x02) {
              _state.treble = val.clamp(0, 100);
            }
            stateChanged = true;
          }
        }
        break;

      case 0x93: // DEVICE_INFO response
        final serial = ProtocolParser.parseDeviceInfoResponse(pkt);
        if (serial != null) {
          _state.deviceSerial = serial;
          debugPrint('Device serial: $serial');
          stateChanged = true;
        }
        break;

      case 0x03: // XOVER response → device model
        if (pkt.isResponse && pkt.data.length >= 5) {
          final modelBytes = pkt.data.sublist(2);
          final model = String.fromCharCodes(modelBytes).trim();
          if (model.isNotEmpty) {
            _state.deviceModel = model;
            debugPrint('Device model: $model');
            stateChanged = true;
          }
        }
        break;

      case 0x43: // EQ_SETTINGS
        if (pkt.isResponse && pkt.data.length >= 3) {
          _state.eqPreset = pkt.data[2];
          stateChanged = true;
        }
        break;

      case 0x11: // SUBWOOFER response → firmware string
        if (pkt.isResponse && pkt.data.length >= 4) {
          final fwBytes = pkt.data.sublist(2);
          final fw = String.fromCharCodes(fwBytes).trim();
          if (fw.isNotEmpty) {
            _state.deviceFirmware = fw;
            debugPrint('Device firmware: $fw');
            stateChanged = true;
          }
        }
        break;
    }

    if (stateChanged) {
      _updateState();
    }
  }

  void _parseLegacyNotification(List<int> data) {
    if (data.length < 4) return;

    final payload = data.sublist(2, data.length - 1);
    final calc = (payload.fold(0, (prev, element) => prev + element) + 0x40) & 0xFF;
    if (calc != data.last) {
      debugPrint(
          'Legacy RX checksum error: calc=0x${calc.toRadixString(16)}, recv=0x${data.last.toRadixString(16)}');
      return;
    }

    final len = data[2];
    final type = data[3];
    bool stateChanged = false;

    if (type == 0x90 && len == 0x03 && data.length >= 6) {
      _state.volume = data[4].clamp(0, 28);
      stateChanged = true;
    } else if (type == 0x91 && len == 0x04 && data.length >= 7) {
      final b = data[4] - 0x10;
      _state.bass = ((b.clamp(-10, 10) + 10) * 5);
      final t = data[5] - 0x20;
      _state.treble = ((t.clamp(-10, 10) + 10) * 5);
      stateChanged = true;
    } else if (type == 0x92 && len == 0x05 && data.length >= 8) {
      _state.balance = data[6] - 0x10;
      _state.fader = data[7] - 0x10;
      stateChanged = true;
    } else if (type == 0x93 && len == 0x03 && data.length >= 6) {
      _state.inputSource = _inputCodeToString(data[5]);
      stateChanged = true;
    }

    if (stateChanged) {
      _updateState();
    }
  }

  String _inputCodeToString(int code) {
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
