import 'dart:async';
import 'dart:typed_data';

import 'package:flutter/foundation.dart';

import '../callbacks/connection_callback.dart';
import '../callbacks/data_callback.dart';
import '../models/bluetooth_state.dart';
import '../models/bluetooth_device_info.dart';

/// Основной класс для управления PROLOGY Bluetooth подключением
///
/// Объединяет функциональность SPP и BLE подключений.
/// Автоматически выбирает подходящий метод подключения.
///
/// ## Пример использования
///
/// ```dart
/// final prology = PrologyBluetooth();
///
/// // Подписка на события
/// prology.connectionState.listen((state) {
///   print('State: $state');
/// });
///
/// prology.incomingData.listen((data) {
///   print('Received: $data');
/// });
///
/// // Подключение
/// await prology.connect('90:20:71:5E:48:10');
///
/// // Отправка данных
/// await prology.send(Uint8List.fromList([0x01, 0x02, 0x03]));
///
/// // Отключение
/// await prology.disconnect();
/// ```
class PrologyBluetooth with ChangeNotifier {
  /// SPP UUID для PROLOGY устройств
  static const String sppUuid = '00001101-0000-1000-8000-00805F9B34FB';

  /// Таймаут подключения по умолчанию
  static const Duration defaultConnectTimeout = Duration(seconds: 30);

  /// Таймаут операций по умолчанию
  static const Duration defaultIoTimeout = Duration(seconds: 10);

  BluetoothState _state = BluetoothState.disconnected;
  BluetoothDeviceInfo? _connectedDevice;
  bool _isConnecting = false;

  final StreamController<BluetoothState> _stateController =
      StreamController<BluetoothState>.broadcast();
  final StreamController<Uint8List> _dataController =
      StreamController<Uint8List>.broadcast();
  final StreamController<String> _errorController =
      StreamController<String>.broadcast();

  ConnectionCallback? _connectionCallback;
  DataCallback? _dataCallback;

  /// Поток состояния подключения
  Stream<BluetoothState> get connectionState => _stateController.stream;

  /// Поток входящих данных
  Stream<Uint8List> get incomingData => _dataController.stream;

  /// Поток ошибок
  Stream<String> get errorStream => _errorController.stream;

  /// Текущее состояние подключения
  BluetoothState get state => _state;

  /// Информация о подключенном устройстве
  BluetoothDeviceInfo? get connectedDevice => _connectedDevice;

  /// Подключено ли устройство
  bool get isConnected => _state == BluetoothState.connected;

  /// Идет ли процесс подключения
  bool get isConnecting => _isConnecting;

  /// Настройки автопереподключения
  bool _autoReconnect = false;
  int _maxReconnectAttempts = 3;
  int _reconnectAttempts = 0;
  Duration _reconnectDelay = const Duration(seconds: 5);

  /// Устанавливает callback для событий подключения
  set connectionCallback(ConnectionCallback? callback) {
    _connectionCallback = callback;
  }

  /// Устанавливает callback для получения данных
  set dataCallback(DataCallback? callback) {
    _dataCallback = callback;
  }

  /// Включает/отключает автоматическое переподключение
  set autoReconnect(bool value) {
    _autoReconnect = value;
  }

  /// Устанавливает максимальное количество попыток переподключения
  set maxReconnectAttempts(int value) {
    _maxReconnectAttempts = value;
  }

  /// Устанавливает задержку перед переподключением
  set reconnectDelay(Duration value) {
    _reconnectDelay = value;
  }

  /// Подключается к PROLOGY устройству по MAC адресу
  ///
  /// [address] - MAC адрес устройства (например, '90:20:71:5E:48:10')
  /// [timeout] - таймаут подключения
  /// [useSpp] - использовать SPP (Classic Bluetooth), если false - BLE
  Future<void> connect(
    String address, {
    Duration? timeout,
    bool? useSpp,
  }) async {
    if (_isConnecting) {
      _emitError('Already connecting');
      return;
    }

    if (isConnected) {
      _emitError('Already connected');
      return;
    }

    if (!_isValidMacAddress(address)) {
      _emitError('Invalid MAC address: $address');
      return;
    }

    _isConnecting = true;
    _reconnectAttempts = 0;

    try {
      _updateState(BluetoothState.connecting);

      // Используем SPP по умолчанию для PROLOGY
      final useSppDefault = useSpp ?? true;

      if (useSppDefault) {
        await _connectSpp(address, timeout ?? defaultConnectTimeout);
      } else {
        await _connectBle(address, timeout ?? defaultConnectTimeout);
      }

      _connectedDevice = BluetoothDeviceInfo(
        address: address,
        name: 'PROLOGY Device',
        type: useSppDefault ? 'SPP' : 'BLE',
      );

      _isConnecting = false;
      _updateState(BluetoothState.connected);
      _connectionCallback?.onConnected();
      notifyListeners();
    } catch (e) {
      _isConnecting = false;
      _updateState(BluetoothState.disconnected);
      _emitError('Connection failed: $e');
      _connectionCallback?.onError('Connection failed: $e');
      _handleConnectionFailure(address, useSpp ?? true);
    }
  }

  /// Подключение через SPP (Classic Bluetooth)
  Future<void> _connectSpp(String address, Duration timeout) async {
    // Реализация через flutter_bluetooth_serial
    // Здесь должен быть код подключения через Platform Channel
    await Future.delayed(timeout);
    // Заглушка для примера
  }

  /// Подключение через BLE
  Future<void> _connectBle(String address, Duration timeout) async {
    // Реализация через flutter_blue_plus
    // Здесь должен быть код подключения через Platform Channel
    await Future.delayed(timeout);
    // Заглушка для примера
  }

  /// Отключается от устройства
  Future<void> disconnect() async {
    if (!isConnected && !_isConnecting) {
      return;
    }

    _autoReconnect = false;
    _isConnecting = false;

    // Закрываем соединение
    await _closeConnection();

    _connectedDevice = null;
    _updateState(BluetoothState.disconnected);
    _connectionCallback?.onDisconnected();
    notifyListeners();
  }

  /// Закрывает соединение
  Future<void> _closeConnection() async {
    // Реализация закрытия соединения
    await Future.delayed(const Duration(milliseconds: 100));
  }

  /// Отправляет данные устройству
  ///
  /// [data] - байты для отправки
  /// [timeout] - таймаут отправки
  Future<bool> send(
    Uint8List data, {
    Duration? timeout,
  }) async {
    if (!isConnected) {
      _emitError('Cannot send: not connected');
      return false;
    }

    if (data.isEmpty) {
      _emitError('Cannot send: empty data');
      return false;
    }

    try {
      // Реализация отправки данных
      await Future.delayed(const Duration(milliseconds: 10));
      return true;
    } catch (e) {
      _emitError('Send error: $e');
      return false;
    }
  }

  /// Отправляет строку устройству (ASCII)
  Future<bool> sendString(
    String text, {
    Duration? timeout,
  }) async {
    final data = Uint8List.fromList(text.codeUnits);
    return send(data, timeout: timeout);
  }

  /// Отправляет команду с завершающим символом CR/LF
  Future<bool> sendCommand(
    String command, {
    Duration? timeout,
  }) async {
    return sendString('$command\r\n', timeout: timeout);
  }

  /// Обрабатывает ошибку подключения
  void _handleConnectionFailure(String address, bool useSpp) {
    if (_autoReconnect && _reconnectAttempts < _maxReconnectAttempts) {
      _reconnectAttempts++;
      debugPrint('Attempting reconnect $_reconnectAttempts/$_maxReconnectAttempts');

      Future.delayed(_reconnectDelay, () {
        if (!isConnected) {
          connect(address, useSpp: useSpp);
        }
      });
    }
  }

  /// Обновляет состояние
  void _updateState(BluetoothState newState) {
    _state = newState;
    _stateController.add(newState);
    notifyListeners();
  }

  /// Обрабатывает полученные данные
  void _handleDataReceived(Uint8List data) {
    _dataController.add(data);
    _dataCallback?.onDataReceived(data);
  }

  /// Испускает ошибку
  void _emitError(String error) {
    _errorController.add(error);
  }

  /// Проверяет корректность MAC адреса
  bool _isValidMacAddress(String address) {
    final macPattern = RegExp(
      r'^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$',
    );
    return macPattern.hasMatch(address);
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
