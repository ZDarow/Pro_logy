import 'dart:async';
import 'package:flutter/foundation.dart';
import 'package:flutter_blue_plus/flutter_blue_plus.dart';
import '../data/repositories/bt_repository.dart';

class BtProvider extends ChangeNotifier {
  final BtRepository _repository;
  StreamSubscription? _stateSubscription;

  BtProvider({BtRepository? repository}) : _repository = repository ?? BtRepository() {
    _stateSubscription = _repository.stateStream.listen((_) {
      notifyListeners();
    });
  }

  BtConnectionStatus get status => _repository.status;
  String? get errorMessage => _repository.errorMessage;
  bool get isConnected => _repository.isConnected;
  PrologyState get state => _repository.state;

  int get volume => _repository.state.volume;
  int get bass => _repository.state.bass;
  int get treble => _repository.state.treble;
  int get balance => _repository.state.balance;
  int get fader => _repository.state.fader;

  Stream<BluetoothConnectionState> get connectionState => _repository.connectionState;

  Future<bool> connect(BluetoothDevice device) async {
    try {
      final result = await _repository.connect(device);
      notifyListeners();
      return result;
    } catch (e) {
      debugPrint('Connect error: $e');
      notifyListeners();
      return false;
    }
  }

  Future<void> disconnect() async {
    try {
      await _repository.disconnect();
    } catch (e) {
      debugPrint('Disconnect error: $e');
    } finally {
      notifyListeners();
    }
  }

  Future<bool> sendCommand(List<int> data) async {
    try {
      return await _repository.sendCommand(data);
    } catch (e) {
      debugPrint('Send command error: $e');
      return false;
    }
  }

  Future<bool> volumeUp() async {
    try {
      final result = await _repository.volumeUp();
      notifyListeners();
      return result;
    } catch (e) {
      debugPrint('Volume up error: $e');
      notifyListeners();
      return false;
    }
  }

  Future<bool> volumeDown() async {
    try {
      final result = await _repository.volumeDown();
      notifyListeners();
      return result;
    } catch (e) {
      debugPrint('Volume down error: $e');
      notifyListeners();
      return false;
    }
  }

  Future<bool> volumeSet(int value) async {
    try {
      final result = await _repository.volumeSet(value);
      notifyListeners();
      return result;
    } catch (e) {
      debugPrint('Volume set error: $e');
      notifyListeners();
      return false;
    }
  }

  Future<bool> setInput(String input) async {
    try {
      final result = await _repository.setInput(input);
      notifyListeners();
      return result;
    } catch (e) {
      debugPrint('Set input error: $e');
      notifyListeners();
      return false;
    }
  }

  Future<bool> setBass(int value) async {
    try {
      final result = await _repository.setBass(value);
      notifyListeners();
      return result;
    } catch (e) {
      debugPrint('Set bass error: $e');
      notifyListeners();
      return false;
    }
  }

  Future<bool> setTreble(int value) async {
    try {
      final result = await _repository.setTreble(value);
      notifyListeners();
      return result;
    } catch (e) {
      debugPrint('Set treble error: $e');
      notifyListeners();
      return false;
    }
  }

  Future<bool> setBalance(int value) async {
    try {
      final result = await _repository.setBalance(value);
      notifyListeners();
      return result;
    } catch (e) {
      debugPrint('Set balance error: $e');
      notifyListeners();
      return false;
    }
  }

  Future<bool> setFader(int value) async {
    try {
      final result = await _repository.setFader(value);
      notifyListeners();
      return result;
    } catch (e) {
      debugPrint('Set fader error: $e');
      notifyListeners();
      return false;
    }
  }

  Future<bool> setEqPreset(int preset) async {
    try {
      final result = await _repository.setEqPreset(preset);
      notifyListeners();
      return result;
    } catch (e) {
      debugPrint('Set EQ preset error: $e');
      notifyListeners();
      return false;
    }
  }

  // Extended Audio Settings
  Future<bool> setLoudness(bool enabled, {int level = 0, int freq = 0}) async {
    try {
      return await _repository.setLoudness(enabled, level: level, freq: freq);
    } catch (e) {
      debugPrint('Set loudness error: $e');
      return false;
    }
  }

  Future<bool> setSubwoofer({int level = 0, int freq = 0, int phase = 0}) async {
    try {
      return await _repository.setSubwoofer(level: level, freq: freq, phase: phase);
    } catch (e) {
      debugPrint('Set subwoofer error: $e');
      return false;
    }
  }

  Future<bool> setXOver({int type = 0, int freq = 0}) async {
    try {
      return await _repository.setXOver(type: type, freq: freq);
    } catch (e) {
      debugPrint('Set x-over error: $e');
      return false;
    }
  }

  Future<bool> setTimeAlignment({int speaker = 0, int delay = 0}) async {
    try {
      return await _repository.setTimeAlignment(speaker: speaker, delay: delay);
    } catch (e) {
      debugPrint('Set time alignment error: $e');
      return false;
    }
  }

  Future<bool> setEqPlus({int band = 0, int freq = 0, int gain = 0, int q = 0}) async {
    try {
      return await _repository.setEqPlus(band: band, freq: freq, gain: gain, q: q);
    } catch (e) {
      debugPrint('Set EQ Plus error: $e');
      return false;
    }
  }

  @override
  void dispose() {
    _stateSubscription?.cancel();
    _repository.dispose();
    super.dispose();
  }
}
