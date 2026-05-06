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
  static const String targetName = 'PROLOGY_BLE';
  static const String serviceUuid = '0000ae00-0000-1000-8000-00805f9b34fb';
  static const String cmdCharUuid = '0000ae01-0000-1000-8000-00805f9b34fb';
  static const String notifyServiceUuid = '0000af00-0000-1000-8000-00805f9b34fb';
  static const String notifyCharUuid = '0000af01-0000-1000-8000-00805f9b34fb';

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

  Future<void> _sendInit() async {
    await sendCommand([0xf0, 0x00, 0x03, 0x01, 0x05, 0x00, 0x09]);
  }

  int _calcChecksum(List<int> data) {
    int cs = 0x94;
    for (int b in data) {
      cs ^= b;
    }
    return cs;
  }

  Future<bool> volumeUp() async {
    return await volumeSet(_state.volume + 1);
  }

  Future<bool> volumeDown() async {
    return await volumeSet(_state.volume - 1);
  }

  Future<bool> volumeSet(int value) async {
    if (value < 0) value = 0;
    if (value > 28) value = 28;
    final cmd = [0xf0, 0x00, 0x05, 0xa0, 0x10, 0x0e, 0x18, value, _calcChecksum([value])];
    final result = await sendCommand(cmd);
    if (result) {
      _state.volume = value;
      _updateState();
    }
    return result;
  }

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
    final cmd = [0xf0, 0x00, 0x05, 0xa0, 0x10, 0x0e, 0x24, inputCode, _calcChecksum([inputCode])];
    final result = await sendCommand(cmd);
    if (result) {
      _state.inputSource = input.toUpperCase();
      _updateState();
    }
    return result;
  }

  Future<bool> setBass(int value) async {
    if (value < -10) value = -10;
    if (value > 10) value = 10;
    final cmd = [0xf0, 0x00, 0x05, 0xa0, 0x10, 0x0e, 0x24, value + 0x10, _calcChecksum([value + 0x10])];
    final result = await sendCommand(cmd);
    if (result) {
      _state.bass = value;
      _updateState();
    }
    return result;
  }

  Future<bool> setTreble(int value) async {
    if (value < -10) value = -10;
    if (value > 10) value = 10;
    final cmd = [0xf0, 0x00, 0x05, 0xa0, 0x10, 0x0e, 0x24, value + 0x20, _calcChecksum([value + 0x20])];
    final result = await sendCommand(cmd);
    if (result) {
      _state.treble = value;
      _updateState();
    }
    return result;
  }

  Future<bool> setBalance(int value) async {
    if (value < -10) value = -10;
    if (value > 10) value = 10;
    final cmd = [0xf0, 0x00, 0x06, 0xa0, 0x10, 0x0e, 0x2a, 0x03, value + 0x10, _calcChecksum([value + 0x10])];
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
    final cmd = [0xf0, 0x00, 0x06, 0xa0, 0x10, 0x0e, 0x20, 0x01, value + 0x10, _calcChecksum([value + 0x10])];
    final result = await sendCommand(cmd);
    if (result) {
      _state.fader = value;
      _updateState();
    }
    return result;
  }

  Future<bool> setEqPreset(int preset) async {
    final presets = [0x08, 0x03, 0x04, 0x09, 0x0a, 0x05, 0x06];
    if (preset < 0 || preset >= presets.length) return false;
    final cmd = [0xf0, 0x00, 0x06, 0xa0, 0x10, 0x0e, 0x26, 0x01, presets[preset], _calcChecksum([presets[preset]])];
    final result = await sendCommand(cmd);
    if (result) {
      _updateState();
    }
    return result;
  }

  // Extended Audio Settings (protocol bytes TBD based on APK analysis)
  // TODO: Update cmd bytes when exact protocol is documented

  Future<bool> setLoudness(bool enabled, {int level = 0, int freq = 0}) async {
    // Placeholder: [F0 00 07 A0 10 0E 30] [enabled] [level] [freq] [CS]
    final cmd = [0xf0, 0x00, 0x07, 0xa0, 0x10, 0x0e, 0x30, enabled ? 1 : 0, level, freq, _calcChecksum([enabled ? 1 : 0, level, freq])];
    return await sendCommand(cmd);
  }

  Future<bool> setSubwoofer({int level = 0, int freq = 0, int phase = 0}) async {
    // Placeholder: [F0 00 08 A0 10 0E 40] [level] [freq] [phase] [CS]
    final cmd = [0xf0, 0x00, 0x08, 0xa0, 0x10, 0x0e, 0x40, level, freq, phase, _calcChecksum([level, freq, phase])];
    return await sendCommand(cmd);
  }

  Future<bool> setXOver({int type = 0, int freq = 0}) async {
    // Placeholder: [F0 00 06 A0 10 0E 50] [type] [freq] [CS]
    final cmd = [0xf0, 0x00, 0x06, 0xa0, 0x10, 0x0e, 0x50, type, freq, _calcChecksum([type, freq])];
    return await sendCommand(cmd);
  }

  Future<bool> setTimeAlignment({int speaker = 0, int delay = 0}) async {
    // Placeholder: [F0 00 07 A0 10 0E 60] [speaker] [delay] [CS]
    final cmd = [0xf0, 0x00, 0x07, 0xa0, 0x10, 0x0e, 0x60, speaker, delay, _calcChecksum([speaker, delay])];
    return await sendCommand(cmd);
  }

  Future<bool> setEqPlus({int band = 0, int freq = 0, int gain = 0, int q = 0}) async {
    // Placeholder: [F0 00 09 A0 10 0E 70] [band] [freq] [gain] [q] [CS]
    final cmd = [0xf0, 0x00, 0x09, 0xa0, 0x10, 0x0e, 0x70, band, freq, gain, q, _calcChecksum([band, freq, gain, q])];
    return await sendCommand(cmd);
  }

  void parseNotification(List<int> data) {
    if (data.length < 4) return;
    if (data[0] != 0xc0) return;

    final len = data[2];
    final type = data[3];
    bool stateChanged = false;

    if (type == 0x90 && len == 0x03 && data.length >= 6) {
      _state.volume = data[5];
      stateChanged = true;
    } else if (type == 0x91 && len == 0x04 && data.length >= 7) {
      _state.bass = data[5] - 0x10;
      _state.treble = data[6] - 0x20;
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
