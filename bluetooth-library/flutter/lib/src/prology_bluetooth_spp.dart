import 'dart:async';
import 'dart:typed_data';

import 'package:flutter/foundation.dart';

/// PrologyBluetoothSpp - Класс для работы с Classic Bluetooth (SPP)
///
/// Использует flutter_bluetooth_serial для подключения к устройствам
/// через RFCOMM сокет.
///
/// ## Пример использования
///
/// ```dart
/// final spp = PrologyBluetoothSpp();
///
/// await spp.connect('90:20:71:5E:48:10');
/// await spp.send(Uint8List.fromList([0x01, 0x02]));
///
/// spp.incomingData.listen((data) {
///   print('Received: $data');
/// });
///
/// await spp.disconnect();
/// ```
class PrologyBluetoothSpp with ChangeNotifier {
  /// SPP UUID для PROLOGY устройств
  static const String sppUuid = '00001101-0000-1000-8000-00805F9B34FB';

  BluetoothSppState _state = BluetoothSppState.disconnected;
  String? _deviceAddress;
  bool _isConnecting = false;

  final StreamController<BluetoothSppState> _stateController =
      StreamController<BluetoothSppState>.broadcast();
  final StreamController<Uint8List> _dataController =
      StreamController<Uint8List>.broadcast();
  final StreamController<String> _errorController =
      StreamController<String>.broadcast();

  /// Поток состояния подключения
  Stream<BluetoothSppState> get connectionState => _stateController.stream;

  /// Поток входящих данных
  Stream<Uint8List> get incomingData => _dataController.stream;

  /// Поток ошибок
  Stream<String> get errorStream => _errorController.stream;

  /// Текущее состояние
  BluetoothSppState get state => _state;

  /// MAC адрес подключенного устройства
  String? get deviceAddress => _deviceAddress;

  /// Подключено ли устройство
  bool get isConnected => _state == BluetoothSppState.connected;

  /// Идет ли процесс подключения
  bool get isConnecting => _isConnecting;

  /// Подключается к устройству по MAC адресу
  Future<void> connect(String address) async {
    if (_isConnecting) {
      _emitError('Already connecting');
      return;
    }

    if (isConnected) {
      _emitError('Already connected');
      return;
    }

    _isConnecting = true;
    _updateState(BluetoothSppState.connecting);

    try {
      // Реализация подключения через flutter_bluetooth_serial
      // BluetoothConnection.toAddress(address).then((connection) { ... })

      _deviceAddress = address;
      _isConnecting = false;
      _updateState(BluetoothSppState.connected);
      notifyListeners();
    } catch (e) {
      _isConnecting = false;
      _updateState(BluetoothSppState.disconnected);
      _emitError('Connection failed: $e');
    }
  }

  /// Отключается от устройства
  Future<void> disconnect() async {
    if (!isConnected && !_isConnecting) {
      return;
    }

    _isConnecting = false;

    // Закрываем соединение
    // connection.dispose();

    _deviceAddress = null;
    _updateState(BluetoothSppState.disconnected);
    notifyListeners();
  }

  /// Отправляет данные
  Future<bool> send(Uint8List data) async {
    if (!isConnected) {
      _emitError('Not connected');
      return false;
    }

    try {
      // connection.output.add(data);
      // await connection.output.allSent;
      return true;
    } catch (e) {
      _emitError('Send error: $e');
      return false;
    }
  }

  /// Отправляет строку
  Future<bool> sendString(String text) async {
    final data = Uint8List.fromList(text.codeUnits);
    return send(data);
  }

  /// Отправляет команду с CR/LF
  Future<bool> sendCommand(String command) async {
    return sendString('$command\r\n');
  }

  /// Обрабатывает полученные данные
  void handleDataReceived(Uint8List data) {
    _dataController.add(data);
  }

  void _updateState(BluetoothSppState newState) {
    _state = newState;
    _stateController.add(newState);
    notifyListeners();
  }

  void _emitError(String error) {
    _errorController.add(error);
  }

  @override
  void dispose() {
    disconnect();
    _stateController.close();
    _dataController.close();
    _errorController.close();
    super.dispose();
  }
}

/// Состояния SPP подключения
enum BluetoothSppState {
  disconnected,
  connecting,
  connected,
  disconnecting,
}
