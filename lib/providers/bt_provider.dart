import 'dart:async';
import 'dart:math';
import 'package:flutter/foundation.dart';
import 'package:flutter_blue_plus/flutter_blue_plus.dart';
import '../data/repositories/bt_repository.dart';

class BtProvider extends ChangeNotifier {
  final BtRepository? _repository;
  final bool isDemo;
  StreamSubscription? _stateSubscription;

  int _demoVolume = 20;
  int _demoBass = 0;
  int _demoTreble = 0;
  int _demoBalance = 0;
  int _demoFader = 0;
  bool _demoConnected = false;
  Timer? _demoTimer;

  BtProvider({BtRepository? repository, this.isDemo = false}) 
      : _repository = repository {
    if (!isDemo && _repository != null) {
      _stateSubscription = _repository.stateStream.listen((_) {
        notifyListeners();
      });
    }
    if (isDemo) {
      _startDemoSimulation();
    }
  }
  
  void _startDemoSimulation() {
    _demoTimer = Timer.periodic(const Duration(seconds: 5), (timer) {
      final rand = Random();
      _demoVolume = (_demoVolume + (rand.nextBool() ? 1 : -1)).clamp(0, 40);
      _demoBass = (_demoBass + (rand.nextBool() ? 1 : -1)).clamp(-10, 10);
      _demoTreble = (_demoTreble + (rand.nextBool() ? 1 : -1)).clamp(-10, 10);
      notifyListeners();
    });
  }

  BtConnectionStatus get status {
    if (isDemo) return _demoConnected ? BtConnectionStatus.connected : BtConnectionStatus.disconnected;
    return _repository?.status ?? BtConnectionStatus.disconnected;
  }

  String? get errorMessage => _repository?.errorMessage;
  
  bool get isConnected {
    if (isDemo) return _demoConnected;
    return _repository?.isConnected ?? false;
  }

  PrologyState get state {
    if (isDemo) {
      final s = PrologyState();
      s.volume = _demoVolume;
      s.bass = _demoBass;
      s.treble = _demoTreble;
      s.balance = _demoBalance;
      s.fader = _demoFader;
      s.inputSource = 'RADIO';
      return s;
    }
    return _repository?.state ?? PrologyState();
  }

  int get volume => isDemo ? _demoVolume : _repository?.state.volume ?? 0;
  int get bass => isDemo ? _demoBass : _repository?.state.bass ?? 0;
  int get treble => isDemo ? _demoTreble : _repository?.state.treble ?? 0;
  int get balance => isDemo ? _demoBalance : _repository?.state.balance ?? 0;
  int get fader => isDemo ? _demoFader : _repository?.state.fader ?? 0;

  Stream<BluetoothConnectionState> get connectionState {
    if (isDemo) return Stream.value(BluetoothConnectionState.disconnected);
    return _repository?.connectionState ?? Stream.value(BluetoothConnectionState.disconnected);
  }

  Future<bool> connect(BluetoothDevice device) async {
    if (isDemo) {
      _demoConnected = true;
      notifyListeners();
      return true;
    }
    try {
      final result = await _repository?.connect(device) ?? false;
      notifyListeners();
      return result;
    } catch (e) {
      debugPrint('Connect error: $e');
      notifyListeners();
      return false;
    }
  }

  Future<void> disconnect() async {
    if (isDemo) {
      _demoConnected = false;
      notifyListeners();
      return;
    }
    try {
      await _repository?.disconnect();
    } catch (e) {
      debugPrint('Disconnect error: $e');
    } finally {
      notifyListeners();
    }
  }

  Future<bool> sendCommand(List<int> data) async {
    if (isDemo) return true;
    try {
      return await _repository?.sendCommand(data) ?? false;
    } catch (e) {
      debugPrint('Send command error: $e');
      return false;
    }
  }

  Future<bool> volumeUp() async {
    if (isDemo) {
      _demoVolume = (_demoVolume + 1).clamp(0, 40);
      notifyListeners();
      return true;
    }
    try {
      final result = await _repository?.volumeUp() ?? false;
      notifyListeners();
      return result;
    } catch (e) {
      debugPrint('Volume up error: $e');
      notifyListeners();
      return false;
    }
  }

  Future<bool> volumeDown() async {
    if (isDemo) {
      _demoVolume = (_demoVolume - 1).clamp(0, 40);
      notifyListeners();
      return true;
    }
    try {
      final result = await _repository?.volumeDown() ?? false;
      notifyListeners();
      return result;
    } catch (e) {
      debugPrint('Volume down error: $e');
      notifyListeners();
      return false;
    }
  }

  Future<bool> volumeSet(int value) async {
    if (isDemo) {
      _demoVolume = value.clamp(0, 40);
      notifyListeners();
      return true;
    }
    try {
      final result = await _repository?.volumeSet(value) ?? false;
      notifyListeners();
      return result;
    } catch (e) {
      debugPrint('Volume set error: $e');
      notifyListeners();
      return false;
    }
  }

  Future<bool> setInput(String input) async {
    if (isDemo) {
      notifyListeners();
      return true;
    }
    try {
      final result = await _repository?.setInput(input) ?? false;
      notifyListeners();
      return result;
    } catch (e) {
      debugPrint('Set input error: $e');
      notifyListeners();
      return false;
    }
  }

  Future<bool> setBass(int value) async {
    if (isDemo) {
      _demoBass = value.clamp(-10, 10);
      notifyListeners();
      return true;
    }
    try {
      final result = await _repository?.setBass(value) ?? false;
      notifyListeners();
      return result;
    } catch (e) {
      debugPrint('Set bass error: $e');
      notifyListeners();
      return false;
    }
  }

  Future<bool> setTreble(int value) async {
    if (isDemo) {
      _demoTreble = value.clamp(-10, 10);
      notifyListeners();
      return true;
    }
    try {
      final result = await _repository?.setTreble(value) ?? false;
      notifyListeners();
      return result;
    } catch (e) {
      debugPrint('Set treble error: $e');
      notifyListeners();
      return false;
    }
  }

  Future<bool> setBalance(int value) async {
    if (isDemo) {
      _demoBalance = value.clamp(-10, 10);
      notifyListeners();
      return true;
    }
    try {
      final result = await _repository?.setBalance(value) ?? false;
      notifyListeners();
      return result;
    } catch (e) {
      debugPrint('Set balance error: $e');
      notifyListeners();
      return false;
    }
  }

  Future<bool> setFader(int value) async {
    if (isDemo) {
      _demoFader = value.clamp(-10, 10);
      notifyListeners();
      return true;
    }
    try {
      final result = await _repository?.setFader(value) ?? false;
      notifyListeners();
      return result;
    } catch (e) {
      debugPrint('Set fader error: $e');
      notifyListeners();
      return false;
    }
  }

  Future<bool> setEqPreset(int preset) async {
    if (isDemo) return true;
    try {
      final result = await _repository?.setEqPreset(preset) ?? false;
      notifyListeners();
      return result;
    } catch (e) {
      debugPrint('Set EQ preset error: $e');
      notifyListeners();
      return false;
    }
  }

  Future<bool> setLoudness(bool enabled, {int level = 0, int freq = 0}) async {
    if (isDemo) return true;
    try {
      return await _repository?.setLoudness(enabled, level: level, freq: freq) ?? false;
    } catch (e) {
      debugPrint('Set loudness error: $e');
      return false;
    }
  }

  Future<bool> setSubwoofer({int level = 0, int freq = 0, int phase = 0}) async {
    if (isDemo) return true;
    try {
      return await _repository?.setSubwoofer(level: level, freq: freq, phase: phase) ?? false;
    } catch (e) {
      debugPrint('Set subwoofer error: $e');
      return false;
    }
  }

  Future<bool> setXOver({int type = 0, int freq = 0}) async {
    if (isDemo) return true;
    try {
      return await _repository?.setXOver(type: type, freq: freq) ?? false;
    } catch (e) {
      debugPrint('Set x-over error: $e');
      return false;
    }
  }

  Future<bool> setTimeAlignment({int speaker = 0, int delay = 0}) async {
    if (isDemo) return true;
    try {
      return await _repository?.setTimeAlignment(speaker: speaker, delay: delay) ?? false;
    } catch (e) {
      debugPrint('Set time alignment error: $e');
      return false;
    }
  }

  Future<bool> setEqPlus({int band = 0, int freq = 0, int gain = 0, int q = 0}) async {
    if (isDemo) return true;
    try {
      return await _repository?.setEqPlus(band: band, freq: freq, gain: gain, q: q) ?? false;
    } catch (e) {
      debugPrint('Set EQ Plus error: $e');
      return false;
    }
  }

  Future<bool> radioSeekUp() async {
    if (isDemo) return true;
    try {
      return await _repository?.radioSeekUp() ?? false;
    } catch (e) {
      debugPrint('Radio seek up error: $e');
      return false;
    }
  }

  Future<bool> radioSeekDown() async {
    if (isDemo) return true;
    try {
      return await _repository?.radioSeekDown() ?? false;
    } catch (e) {
      debugPrint('Radio seek down error: $e');
      return false;
    }
  }

  Future<bool> radioSetFreq(double freq, bool isFm) async {
    if (isDemo) return true;
    try {
      return await _repository?.radioSetFreq(freq, isFm) ?? false;
    } catch (e) {
      debugPrint('Radio set freq error: $e');
      return false;
    }
  }

  Future<bool> playPause() async {
    if (isDemo) return true;
    try {
      return await _repository?.playPause() ?? false;
    } catch (e) {
      debugPrint('Play/Pause error: $e');
      return false;
    }
  }

  Future<bool> nextTrack() async {
    if (isDemo) return true;
    try {
      return await _repository?.nextTrack() ?? false;
    } catch (e) {
      debugPrint('Next track error: $e');
      return false;
    }
  }

  Future<bool> prevTrack() async {
    if (isDemo) return true;
    try {
      return await _repository?.prevTrack() ?? false;
    } catch (e) {
      debugPrint('Prev track error: $e');
      return false;
    }
  }

  @override
  void dispose() {
    _demoTimer?.cancel();
    _stateSubscription?.cancel();
    _repository?.dispose();
    super.dispose();
  }
}