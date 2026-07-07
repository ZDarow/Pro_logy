import 'dart:async';
import 'package:flutter/foundation.dart';
import 'package:flutter_blue_plus/flutter_blue_plus.dart';

enum BtConnectionStatus { disconnected, connecting, connected, error }

class PrologyState {
  int volume = 0;
  int bass = 0;
  int treble = 0;
  int balance = 0;
  int fader = 0;
  String inputSource = 'RADIO';
  bool isConnected = false;
}

class BtRepository {
  // --- BLE GATT UUIDs ---
  static const String targetName = 'PROLOGY_BLE';
  static const String serviceUuid = '0000ae00-0000-1000-8000-00805f9b34fb';
  static const String cmdCharUuid = '0000ae01-0000-1000-8000-00805f9b34fb';
  static const String notifyServiceUuid = '0000ae00-0000-1000-8000-00805f9b34fb';
  static const String notifyCharUuid = '0000ae02-0000-1000-8000-00805f9b34fb';

  // --- Protocol framing ---
  static const int syncByte = 0xf0;
  static const int reservedByte = 0x00;
  static const int rxSyncByte = 0xc0;

  // --- Protocol header bytes (common to all commands) ---
  static const int headerType = 0xa0;
  static const int headerSub = 0x10;
  static const int headerSub2 = 0x0e;

  // --- TX command bytes ---
  static const int cmdPlayPause = 0x01;
  static const int cmdNextTrack = 0x02;
  static const int cmdPrevTrack = 0x03;
  static const int cmdVolume = 0x18;
  static const int cmdFader = 0x20;
  static const int cmdBass = 0x21;    // TODO: уточнить по протоколу (отделён от 0x24)
  static const int cmdTreble = 0x22;  // TODO: уточнить по протоколу (отделён от 0x24)
  static const int cmdInput = 0x24;
  static const int cmdEqPreset = 0x26;
  static const int cmdBalance = 0x2a;
  static const int cmdLoudness = 0x30;
  static const int cmdSubwoofer = 0x40;
  static const int cmdXOver = 0x50;
  static const int cmdTimeAlignment = 0x60;
  static const int cmdEqPlus = 0x70;
  static const int cmdRadioSeekUp = 0x80;
  static const int cmdRadioSeekDown = 0x81;
  static const int cmdRadioSetFreqFm = 0x82;
  static const int cmdRadioSetFreqAm = 0x83;

  // --- RX notification types ---
  static const int notifyVolume = 0x90;
  static const int notifyBassTreble = 0x91;
  static const int notifyBalanceFader = 0x92;
  static const int notifyInputSource = 0x93;

  // --- Checksum offsets ---
  static const int txChecksumOffset = 0x10;
  static const int rxChecksumOffset = 0x40;

  // --- Value encoding offsets ---
  static const int bassEncodingOffset = 0x10;
  static const int trebleEncodingOffset = 0x20;
  static const int balanceFaderEncodingOffset = 0x10;

  // --- Limits ---
  static const int minVolume = 0;
  static const int maxVolume = 28;
  static const int minToneValue = -10;
  static const int maxToneValue = 10;

  BluetoothDevice? _device;
  BluetoothCharacteristic? _cmdCharacteristic;
  BluetoothCharacteristic? _notifyCharacteristic;
  StreamSubscription? _notificationSubscription;
  BtConnectionStatus _status = BtConnectionStatus.disconnected;
  String? _errorMessage;
  final PrologyState _state = PrologyState();
  final StreamController<PrologyState> _stateController = StreamController<PrologyState>.broadcast();

  BtRepository() {
    _stateController.onListen = () {
      _stateController.add(_state);
    };
  }

  BtConnectionStatus get status => _status;
  String? get errorMessage => _errorMessage;
  bool get isConnected => _status == BtConnectionStatus.connected;
  PrologyState get state => _state;
  Stream<PrologyState> get stateStream => _stateController.stream;

  Stream<BluetoothConnectionState> get connectionState {
    return _device?.connectionState ??
        Stream.value(BluetoothConnectionState.disconnected);
  }

  Future<bool> connect(BluetoothDevice device) async {
    _status = BtConnectionStatus.connecting;
    _errorMessage = null;
    _device = device;

    try {
      await device.connect();
      await _discoverPrologyService();
      _status = BtConnectionStatus.connected;
      _state.isConnected = true;
      _updateState();
      if (_cmdCharacteristic != null) {
        await _sendInit();
      }
      return true;
    } catch (e) {
      _status = BtConnectionStatus.error;
      _errorMessage = e.toString();
      return false;
    }
  }

  Future<void> disconnect() async {
    if (_device != null) {
      await _device!.disconnect();
      _device = null;
      _cmdCharacteristic = null;
      if (_notifyCharacteristic != null) {
        try {
          await _notifyCharacteristic!.setNotifyValue(false);
        } catch (e) {
          debugPrint('Error disabling notifications: $e');
        }
      }
      _notifyCharacteristic = null;
      _notificationSubscription?.cancel();
      _notificationSubscription = null;
      _status = BtConnectionStatus.disconnected;
      _state.isConnected = false;
      _updateState();
    }
  }

  Future<void> _discoverPrologyService() async {
    if (_device == null) return;

    final services = await _device!.discoverServices();
    for (final service in services) {
      final serviceUuidLower = service.uuid.str.toLowerCase();
      if (serviceUuidLower == serviceUuid) {
        for (final char in service.characteristics) {
          final uuid = char.uuid.str.toLowerCase();
          if (uuid == cmdCharUuid) {
            _cmdCharacteristic = char;
            debugPrint('Found cmd char: ${char.uuid}');
          }
        }
      } else if (serviceUuidLower == notifyServiceUuid) {
        for (final char in service.characteristics) {
          final uuid = char.uuid.str.toLowerCase();
          if (uuid == notifyCharUuid) {
            _notifyCharacteristic = char;
            debugPrint('Found notify char: ${char.uuid}');
            try {
              await _notifyCharacteristic!.setNotifyValue(true);
              _notificationSubscription?.cancel();
              _notificationSubscription = _notifyCharacteristic!.onValueReceived.listen(_handleNotification);
              debugPrint('Subscribed to notifications');
            } catch (e) {
              debugPrint('Failed to subscribe to notifications: $e');
            }
          }
        }
      }
    }

    if (_cmdCharacteristic == null) {
      _errorMessage = 'Prology service not found';
    }
  }

  void _handleNotification(List<int> data) {
    debugPrint('Notification received: $data');
    parseNotification(data);
  }

  void _updateState() {
    _stateController.add(_state);
  }

  void dispose() {
    _stateController.close();
    debugPrint('BtRepository disposed');
  }

  Future<bool> sendCommand(List<int> data, {int retries = 2}) async {
    if (_cmdCharacteristic == null) {
      _errorMessage = 'Not connected to Prology';
      return false;
    }

    for (int attempt = 0; attempt < retries; attempt++) {
      try {
        await _cmdCharacteristic!.write(data);
        return true;
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

  /// Init sequence: [F0 00 03 01 05 00 09]
  Future<void> _sendInit() async {
    final payload = <int>[0x03, 0x01, 0x05, 0x00]; // LEN + TYPE + DATA
    await sendCommand(_buildTx(payload));
  }

  /// Собирает команду: [SYNC, RES, ...payload, checksum]
  List<int> _buildTx(List<int> payload) {
    final checksum = _calcChecksumTx(payload);
    return [syncByte, reservedByte, ...payload, checksum];
  }

  /// TX checksum: (sum(data) + txChecksumOffset) & 0xFF
  /// data = bytes from LEN to DATA (excluding SYNC, RES, CHECK)
  int _calcChecksumTx(List<int> data) {
    int sum = data.fold(0, (prev, element) => prev + element);
    return (sum + txChecksumOffset) & 0xFF;
  }

  /// RX checksum: (sum(data) + rxChecksumOffset) & 0xFF
  /// data = bytes from LEN to DATA (excluding SYNC, RES, CHECK)
  int _calcChecksumRx(List<int> data) {
    int sum = data.fold(0, (prev, element) => prev + element);
    return (sum + rxChecksumOffset) & 0xFF;
  }

  Future<bool> volumeUp() async {
    return await volumeSet(_state.volume + 1);
  }

  Future<bool> volumeDown() async {
    return await volumeSet(_state.volume - 1);
  }

  /// Приводит значение тона (bass/treble/balance/fader) к диапазону [-10..10]
  static int _clampTone(int value) => value.clamp(minToneValue, maxToneValue);

  Future<bool> volumeSet(int value) async {
    value = value.clamp(minVolume, maxVolume);
    final payload = <int>[0x05, headerType, headerSub, headerSub2, cmdVolume, value];
    final result = await sendCommand(_buildTx(payload));
    if (result) {
      _state.volume = value;
      _updateState();
    }
    return result;
  }

  Future<bool> setInput(String input) async {
    final inputCode = _inputStringToCode(input);
    // Payload: [LEN, TYPE, SUB, SUB2, CMD, VALUE]
    final payload = <int>[0x05, headerType, headerSub, headerSub2, cmdInput, inputCode];
    final result = await sendCommand(_buildTx(payload));
    if (result) {
      _state.inputSource = input.toUpperCase();
      _updateState();
    }
    return result;
  }

  Future<bool> setBass(int value) async {
    value = _clampTone(value);
    // NOTE: command byte 0x21 — предположительный, уточнить по протоколу
    final payload = <int>[0x05, headerType, headerSub, headerSub2, cmdBass, value + bassEncodingOffset];
    final result = await sendCommand(_buildTx(payload));
    if (result) {
      _state.bass = value;
      _updateState();
    }
    return result;
  }

  Future<bool> setTreble(int value) async {
    value = _clampTone(value);
    // NOTE: command byte 0x22 — предположительный, уточнить по протоколу
    final payload = <int>[0x05, headerType, headerSub, headerSub2, cmdTreble, value + trebleEncodingOffset];
    final result = await sendCommand(_buildTx(payload));
    if (result) {
      _state.treble = value;
      _updateState();
    }
    return result;
  }

  Future<bool> setBalance(int value) async {
    value = _clampTone(value);
    final payload = <int>[0x06, headerType, headerSub, headerSub2, cmdBalance, 0x03, value + balanceFaderEncodingOffset];
    final result = await sendCommand(_buildTx(payload));
    if (result) {
      _state.balance = value;
      _updateState();
    }
    return result;
  }

  Future<bool> setFader(int value) async {
    value = _clampTone(value);
    final payload = <int>[0x06, headerType, headerSub, headerSub2, cmdFader, 0x01, value + balanceFaderEncodingOffset];
    final result = await sendCommand(_buildTx(payload));
    if (result) {
      _state.fader = value;
      _updateState();
    }
    return result;
  }

  Future<bool> setEqPreset(int preset) async {
    const eqPresetValues = [0x08, 0x03, 0x04, 0x09, 0x0a, 0x05, 0x06];
    if (preset < 0 || preset >= eqPresetValues.length) return false;
    final payload = <int>[0x06, headerType, headerSub, headerSub2, cmdEqPreset, 0x01, eqPresetValues[preset]];
    final result = await sendCommand(_buildTx(payload));
    if (result) {
      _updateState();
    }
    return result;
  }

  // ---- Extended Audio Settings ----
  // TODO: уточнить protocol bytes по документации протокола

  Future<bool> setLoudness(bool enabled, {int level = 0, int freq = 0}) async {
    final payload = <int>[0x07, headerType, headerSub, headerSub2, cmdLoudness, enabled ? 1 : 0, level, freq];
    return await sendCommand(_buildTx(payload));
  }

  Future<bool> setSubwoofer({int level = 0, int freq = 0, int phase = 0}) async {
    // LEN=7: headerType(1) + headerSub(2) + headerSub2(3) + cmd(4) + level(5) + freq(6) + phase(7)
    final payload = <int>[0x07, headerType, headerSub, headerSub2, cmdSubwoofer, level, freq, phase];
    return await sendCommand(_buildTx(payload));
  }

  Future<bool> setXOver({int type = 0, int freq = 0}) async {
    final payload = <int>[0x06, headerType, headerSub, headerSub2, cmdXOver, type, freq];
    return await sendCommand(_buildTx(payload));
  }

  Future<bool> setTimeAlignment({int speaker = 0, int delay = 0}) async {
    // LEN=6: headerType(1) + headerSub(2) + headerSub2(3) + cmd(4) + speaker(5) + delay(6)
    final payload = <int>[0x06, headerType, headerSub, headerSub2, cmdTimeAlignment, speaker, delay];
    return await sendCommand(_buildTx(payload));
  }

  Future<bool> setEqPlus({int band = 0, int freq = 0, int gain = 0, int q = 0}) async {
    // LEN=8: headerType(1)+headerSub(2)+headerSub2(3)+cmd(4)+band(5)+freq(6)+gain(7)+q(8)
    final payload = <int>[0x08, headerType, headerSub, headerSub2, cmdEqPlus, band, freq, gain, q];
    return await sendCommand(_buildTx(payload));
  }

  Future<bool> playPause() async {
    final payload = <int>[0x04, headerType, headerSub, headerSub2, cmdPlayPause];
    return await sendCommand(_buildTx(payload));
  }

  Future<bool> nextTrack() async {
    final payload = <int>[0x04, headerType, headerSub, headerSub2, cmdNextTrack];
    return await sendCommand(_buildTx(payload));
  }

  Future<bool> prevTrack() async {
    final payload = <int>[0x04, headerType, headerSub, headerSub2, cmdPrevTrack];
    return await sendCommand(_buildTx(payload));
  }

  Future<bool> radioSeekUp() async {
    final payload = <int>[0x04, headerType, headerSub, headerSub2, cmdRadioSeekUp];
    return await sendCommand(_buildTx(payload));
  }

  Future<bool> radioSeekDown() async {
    final payload = <int>[0x04, headerType, headerSub, headerSub2, cmdRadioSeekDown];
    return await sendCommand(_buildTx(payload));
  }

  Future<bool> radioSetFreq(double freq, bool isFm) async {
    // FM: freq*10, AM: частота в kHz
    final int freqCode;
    if (isFm) {
      freqCode = (freq * 10).round();
    } else {
      freqCode = freq.toInt();
    }
    final cmdByte = isFm ? cmdRadioSetFreqFm : cmdRadioSetFreqAm;
    // LEN=6: headerType(1)+headerSub(2)+headerSub2(3)+cmd(4)+freqH(5)+freqL(6)
    final payload = <int>[0x06, headerType, headerSub, headerSub2, cmdByte, freqCode >> 8, freqCode & 0xFF];
    return await sendCommand(_buildTx(payload));
  }

  void parseNotification(List<int> data) {
    if (data.length < 4) return;
    if (data[0] != rxSyncByte) return;

    // RX checksum: sum(LEN..DATA) + rxChecksumOffset
    final payload = data.sublist(2, data.length - 1); // LEN to DATA (excl. checksum)
    final calc = _calcChecksumRx(payload);
    final recv = data.last;
    if (calc != recv) {
      debugPrint('RX checksum error: calc=0x${calc.toRadixString(16)}, recv=0x${recv.toRadixString(16)}');
      return;
    }

    final len = data[2];
    final type = data[3];
    bool stateChanged = false;

    if (type == notifyVolume && len == 0x03 && data.length >= 6) {
      _state.volume = data[4];
      stateChanged = true;
    } else if (type == notifyBassTreble && len == 0x04 && data.length >= 7) {
      _state.bass = data[4] - bassEncodingOffset;      // DATA[0] - 0x10
      _state.treble = data[5] - trebleEncodingOffset;  // DATA[1] - 0x20
      stateChanged = true;
    } else if (type == notifyBalanceFader && len == 0x05 && data.length >= 8) {
      _state.balance = data[6] - balanceFaderEncodingOffset; // DATA[2] - 0x10
      _state.fader = data[7] - balanceFaderEncodingOffset;   // DATA[3] - 0x10
      stateChanged = true;
    } else if (type == notifyInputSource && len == 0x03 && data.length >= 6) {
      _state.inputSource = _inputCodeToString(data[5]);
      stateChanged = true;
    }

    if (stateChanged) {
      _updateState();
    }
  }

  /// Преобразует строку источника в code для BLE-команды
  static int _inputStringToCode(String input) {
    switch (input.toUpperCase()) {
      case 'RADIO':  return 0x01;
      case 'USB':    return 0x02;
      case 'SD':     return 0x03;
      case 'BT':     return 0x04;
      case 'AUX':    return 0x05;
      case 'DISC':   return 0x06;
      case 'GPS':    return 0x07;
      case 'SXM':    return 0x08;
      case 'AVIN':
      case 'AV IN':  return 0x09;
      default:       return 0x01;
    }
  }

  /// Преобразует code из BLE-уведомления в строку источника
  static String _inputCodeToString(int code) {
    switch (code) {
      case 0x01: return 'RADIO';
      case 0x02: return 'USB';
      case 0x03: return 'SD';
      case 0x04: return 'BT';
      case 0x05: return 'AUX';
      case 0x06: return 'DISC';
      default:   return 'UNKNOWN';
    }
  }
}
