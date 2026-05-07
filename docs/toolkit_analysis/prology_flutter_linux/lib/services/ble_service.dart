import 'dart:async';
import 'package:flutter_blue_plus/flutter_blue_plus.dart';
import '../models/prology_state.dart';
import 'prology_protocol.dart';

class BleService {
  BluetoothDevice? _device;
  BluetoothCharacteristic? _cmdChar;
  BluetoothCharacteristic? _notifyChar;
  final _stateController = StreamController<PrologyState>.broadcast();
  PrologyState _currentState = PrologyState();

  Stream<PrologyState> get stateStream => _stateController.stream;
  PrologyState get currentState => _currentState;

  Future<List<ScanResult>> scanDevices() async {
    List<ScanResult> results = [];
    try {
      await FlutterBluePlus.startScan(timeout: const Duration(seconds: 5));
      await for (var event in FlutterBluePlus.scanResults) {
        results = event
            .where((r) =>
                r.device.platformName.contains('PROLOGY') ||
                r.device.remoteId.str.toLowerCase().contains('90:20:71') ||
                r.device.remoteId.str.toLowerCase().contains('d0:7a:b4:69:4f:cc'))
            .toList();
      }
      await FlutterBluePlus.stopScan();
    } catch (e) {
      print('Scan error: $e');
    }
    return results;
  }

  Future<bool> connectToDevice(BluetoothDevice device) async {
    try {
      await device.connect();
      _device = device;
      _currentState = _currentState.copyWith(
        connected: true,
        deviceAddress: device.remoteId.str,
      );
      _stateController.add(_currentState);

      List<BluetoothService> services = await device.discoverServices();
      for (var service in services) {
        String uuid = service.uuid.toString().toUpperCase();
        
        if (uuid == PrologyProtocol.SERVICE_UUID.toUpperCase()) {
          for (var char in service.characteristics) {
            String charUuid = char.uuid.toString().toUpperCase();
            if (charUuid == PrologyProtocol.CMD_CHAR_UUID.toUpperCase()) {
              _cmdChar = char;
            } else if (charUuid == PrologyProtocol.NOTIFY_CHAR_UUID.toUpperCase()) {
              _notifyChar = char;
              await char.setNotifyValue(true);
              char.onValueReceived.listen(_handleNotification);
            }
          }
        }
        
        if (uuid == '0000AF00-0000-1000-8000-00805F9B34FB') {
          print('Found additional service: AF00');
        }
      }

      sendInitCommand();
      return true;
    } catch (e) {
      print('Connect error: $e');
      return false;
    }
  }

  void _handleNotification(List<int> data) {
    print('Notification received: ${data.map((b) => b.toRadixString(16).padLeft(2, '0')).join(' '))');
    var state = PrologyProtocol.parseResponse(Uint8List.fromList(data));
    if (state != null) {
      _currentState = _currentState.copyWith(
        volume: state.volume != 10 ? state.volume : _currentState.volume,
        balance: state.balance != 0 ? state.balance : _currentState.balance,
        fader: state.fader != 0 ? state.fader : _currentState.fader,
        eqPreset: state.eqPreset.subtype != 0x08
            ? state.eqPreset
            : _currentState.eqPreset,
        bass: state.bass != 0 ? state.bass : _currentState.bass,
        treble: state.treble != 0 ? state.treble : _currentState.treble,
        eqBands: state.eqBands.isNotEmpty
            ? state.eqBands
            : _currentState.eqBands,
      );
      _stateController.add(_currentState);
    }
  }

  void sendInitCommand() {
    if (_cmdChar != null) {
      _cmdChar!.write(PrologyProtocol.buildInitCommand(),
          withoutResponse: true);
    }
  }

  void sendVolumeCommand(bool up) {
    if (_cmdChar != null) {
      _cmdChar!.write(PrologyProtocol.buildVolumeCommand(up),
          withoutResponse: true);
      _currentState =
          _currentState.copyWith(volume: (up ? _currentState.volume + 1 : _currentState.volume - 1).clamp(0, 100));
      _stateController.add(_currentState);
    }
  }

  void sendEQPresetCommand(EQPreset preset) {
    if (_cmdChar != null) {
      _cmdChar!.write(PrologyProtocol.buildEQPresetCommand(preset),
          withoutResponse: true);
      _currentState = _currentState.copyWith(eqPreset: preset);
      _stateController.add(_currentState);
    }
  }

  void sendEQGainCommand(int band, int gain) {
    if (_cmdChar != null) {
      _cmdChar!.write(PrologyProtocol.buildEQGainCommand(band, gain),
          withoutResponse: true);
    }
  }

  void sendEQQFactorCommand(int band, int qFactor) {
    if (_cmdChar != null) {
      _cmdChar!.write(PrologyProtocol.buildEQQFactorCommand(band, qFactor),
          withoutResponse: true);
    }
  }

  void sendBassCommand(int level) {
    if (_cmdChar != null) {
      _cmdChar!.write(PrologyProtocol.buildBassCommand(level),
          withoutResponse: true);
      _currentState = _currentState.copyWith(bass: level - 12);
      _stateController.add(_currentState);
    }
  }

  void sendTrebleCommand(int level) {
    if (_cmdChar != null) {
      _cmdChar!.write(PrologyProtocol.buildTrebleCommand(level),
          withoutResponse: true);
      _currentState = _currentState.copyWith(treble: level - 12);
      _stateController.add(_currentState);
    }
  }

  void sendSubwooferVolumeCommand(int volume) {
    if (_cmdChar != null) {
      _cmdChar!.write(PrologyProtocol.buildSubwooferVolumeCommand(volume),
          withoutResponse: true);
    }
  }

  void sendBassBoostCommand(bool enable, int level) {
    if (_cmdChar != null) {
      _cmdChar!.write(PrologyProtocol.buildBassBoostCommand(enable, level),
          withoutResponse: true);
    }
  }

  void sendXOverHPFCommand(int ch, int freq, int gain, int slope, int type) {
    if (_cmdChar != null) {
      _cmdChar!.write(PrologyProtocol.buildXOverHPFCommand(ch, freq, gain, slope, type),
          withoutResponse: true);
    }
  }

  void sendXOverLPFCommand(int ch, int freq, int gain, int slope, int type) {
    if (_cmdChar != null) {
      _cmdChar!.write(PrologyProtocol.buildXOverLPFCommand(ch, freq, gain, slope, type),
          withoutResponse: true);
    }
  }

  void sendTimeAlignmentCommand(int ch, int delay) {
    if (_cmdChar != null) {
      _cmdChar!.write(PrologyProtocol.buildTimeAlignmentCommand(ch, delay),
          withoutResponse: true);
    }
  }

  void sendMuteCommand(int ch, bool enable) {
    if (_cmdChar != null) {
      _cmdChar!.write(PrologyProtocol.buildMuteCommand(ch, enable),
          withoutResponse: true);
      if (ch == 0x01) {
        _currentState = _currentState.copyWith(muted: enable);
        _stateController.add(_currentState);
      }
    }
  }

  void sendPresetSaveCommand(int slot, String name) {
    if (_cmdChar != null) {
      _cmdChar!.write(PrologyProtocol.buildPresetSaveCommand(slot, name),
          withoutResponse: true);
    }
  }

  void sendFactoryResetCommand() {
    if (_cmdChar != null) {
      _cmdChar!.write(PrologyProtocol.buildFactoryResetCommand(),
          withoutResponse: true);
    }
  }

  void sendGetStatusCommand() {
    if (_cmdChar != null) {
      _cmdChar!.write(PrologyProtocol.buildGetStatusCommand(),
          withoutResponse: true);
    }
  }

  void sendBeepCommand(bool enable) {
    if (_cmdChar != null) {
      _cmdChar!.write(PrologyProtocol.buildBeepCommand(enable),
          withoutResponse: true);
    }
  }

  void sendInputCommand(InputSource input) {
    if (_cmdChar != null) {
      _cmdChar!.write(PrologyProtocol.buildInputCommand(input),
          withoutResponse: true);
      _currentState = _currentState.copyWith(input: input);
      _stateController.add(_currentState);
    }
  }

  void sendBalanceCommand(int balance) {
    if (_cmdChar != null) {
      _cmdChar!.write(PrologyProtocol.buildBalanceCommand(balance),
          withoutResponse: true);
      _currentState = _currentState.copyWith(balance: balance);
      _stateController.add(_currentState);
    }
  }

  void sendFaderCommand(int fader) {
    if (_cmdChar != null) {
      _cmdChar!.write(PrologyProtocol.buildFaderCommand(fader),
          withoutResponse: true);
      _currentState = _currentState.copyWith(fader: fader);
      _stateController.add(_currentState);
    }
  }

  void toggleMute() {
    _currentState =
        _currentState.copyWith(muted: !_currentState.muted);
    _stateController.add(_currentState);
  }

  Future<void> disconnect() async {
    await _device?.disconnect();
    _device = null;
    _cmdChar = null;
    _notifyChar = null;
    _currentState =
        _currentState.copyWith(connected: false, deviceAddress: '');
    _stateController.add(_currentState);
  }

  void dispose() {
    _stateController.close();
  }
}
