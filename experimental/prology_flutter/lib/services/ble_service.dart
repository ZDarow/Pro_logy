import 'dart:async';
import '../models/prology_state.dart';
import 'prology_protocol.dart';

class BleService {
  final _stateController = StreamController<PrologyState>.broadcast();
  PrologyState _currentState = PrologyState();

  Stream<PrologyState> get stateStream => _stateController.stream;
  PrologyState get currentState => _currentState;

  BleService() {
    _currentState = PrologyState(connected: true, deviceAddress: 'EMULATOR');
    _stateController.add(_currentState);
  }

  Future<List<String>> scanDevices() async {
    return ['PROLOGY_EMULATOR'];
  }

  Future<bool> connectToDevice(String deviceName) async {
    _currentState = _currentState.copyWith(
      connected: true,
      deviceAddress: deviceName,
    );
    _stateController.add(_currentState);
    sendInit();
    return true;
  }

  void sendInit() {
    _stateController.add(_currentState);
  }

  void sendVolumeUp() {
    int newVol = (_currentState.volume + 1).clamp(0, 28);
    _currentState = _currentState.copyWith(volume: newVol);
    _stateController.add(_currentState);
  }

  void sendVolumeDown() {
    int newVol = (_currentState.volume - 1).clamp(0, 28);
    _currentState = _currentState.copyWith(volume: newVol);
    _stateController.add(_currentState);
  }

  void sendEQPreset(EQPreset preset) {
    _currentState = _currentState.copyWith(eqPreset: preset);
    _stateController.add(_currentState);
  }

  void sendBalance(int balance) {
    _currentState = _currentState.copyWith(balance: balance);
    _stateController.add(_currentState);
  }

  void sendFader(int fader) {
    _currentState = _currentState.copyWith(fader: fader);
    _stateController.add(_currentState);
  }

  void sendInput(InputSource input) {
    _currentState = _currentState.copyWith(input: input);
    _stateController.add(_currentState);
  }

  void toggleMute() {
    _currentState = _currentState.copyWith(muted: !_currentState.muted);
    _stateController.add(_currentState);
  }

  Future<void> disconnect() async {
    _currentState = _currentState.copyWith(connected: false, deviceAddress: '');
    _stateController.add(_currentState);
  }

  void dispose() {
    _stateController.close();
  }
}
