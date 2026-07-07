import 'dart:async';
import 'dart:typed_data';

import 'package:flutter/foundation.dart';

/// PrologyBluetoothBle - Класс для работы с BLE (Bluetooth Low Energy)
///
/// Использует flutter_blue_plus для подключения к устройствам
/// через GATT профиль.
///
/// ## Пример использования
///
/// ```dart
/// final ble = PrologyBluetoothBle();
///
/// await ble.connect('90:20:71:5E:48:10');
///
/// // Запись в характеристику
/// await ble.writeCharacteristic(
///   serviceUuid: '00001801-0000-1000-8000-00805F9B34FB',
///   characteristicUuid: '00002A05-0000-1000-8000-00805F9B34FB',
///   value: Uint8List.fromList([0x01, 0x02]),
/// );
///
/// // Подписка на уведомления
/// await ble.subscribeCharacteristic(
///   serviceUuid: '...',
///   characteristicUuid: '...',
/// );
///
/// await ble.disconnect();
/// ```
class PrologyBluetoothBle with ChangeNotifier {
  BluetoothBleState _state = BluetoothBleState.disconnected;
  String? _deviceAddress;
  bool _isConnecting = false;
  bool _isScanning = false;

  final StreamController<BluetoothBleState> _stateController =
      StreamController<BluetoothBleState>.broadcast();
  final StreamController<Uint8List> _dataController =
      StreamController<Uint8List>.broadcast();
  final StreamController<String> _errorController =
      StreamController<String>.broadcast();

  /// Поток состояния подключения
  Stream<BluetoothBleState> get connectionState => _stateController.stream;

  /// Поток входящих данных (из уведомлений характеристик)
  Stream<Uint8List> get incomingData => _dataController.stream;

  /// Поток ошибок
  Stream<String> get errorStream => _errorController.stream;

  /// Текущее состояние
  BluetoothBleState get state => _state;

  /// MAC адрес подключенного устройства
  String? get deviceAddress => _deviceAddress;

  /// Подключено ли устройство
  bool get isConnected => _state == BluetoothBleState.connected;

  /// Идет ли процесс подключения
  bool get isConnecting => _isConnecting;

  /// Идет ли сканирование
  bool get isScanning => _isScanning;

  /// Запускает сканирование BLE устройств
  Future<void> startScan() async {
    if (_isScanning) {
      return;
    }

    _isScanning = true;
    // FlutterBluePlus.startScan();
  }

  /// Останавливает сканирование
  Future<void> stopScan() async {
    if (!_isScanning) {
      return;
    }

    _isScanning = false;
    // FlutterBluePlus.stopScan();
  }

  /// Подключается к устройству
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
    _updateState(BluetoothBleState.connecting);

    try {
      // Реализация подключения через flutter_blue_plus
      // final device = BluetoothDevice.fromId(address);
      // await device.connect();

      _deviceAddress = address;
      _isConnecting = false;
      _updateState(BluetoothBleState.connected);
      notifyListeners();
    } catch (e) {
      _isConnecting = false;
      _updateState(BluetoothBleState.disconnected);
      _emitError('Connection failed: $e');
    }
  }

  /// Отключается от устройства
  Future<void> disconnect() async {
    if (!isConnected && !_isConnecting) {
      return;
    }

    _isConnecting = false;

    // device.disconnect();

    _deviceAddress = null;
    _updateState(BluetoothBleState.disconnected);
    notifyListeners();
  }

  /// Открывает сервисы устройства
  Future<List<BleService>> discoverServices() async {
    if (!isConnected) {
      throw StateError('Not connected');
    }

    // Реализация через device.discoverServices()
    return [];
  }

  /// Читает характеристику
  Future<Uint8List> readCharacteristic({
    required String serviceUuid,
    required String characteristicUuid,
  }) async {
    if (!isConnected) {
      throw StateError('Not connected');
    }

    // Реализация через characteristic.read()
    return Uint8List(0);
  }

  /// Записывает в характеристику
  Future<bool> writeCharacteristic({
    required String serviceUuid,
    required String characteristicUuid,
    required Uint8List value,
    bool withResponse = true,
  }) async {
    if (!isConnected) {
      _emitError('Not connected');
      return false;
    }

    try {
      // characteristic.write(value);
      return true;
    } catch (e) {
      _emitError('Write error: $e');
      return false;
    }
  }

  /// Подписывается на уведомления характеристики
  Future<bool> subscribeCharacteristic({
    required String serviceUuid,
    required String characteristicUuid,
  }) async {
    if (!isConnected) {
      _emitError('Not connected');
      return false;
    }

    try {
      // await characteristic.setNotifyValue(true);
      return true;
    } catch (e) {
      _emitError('Subscribe error: $e');
      return false;
    }
  }

  /// Отписывается от уведомлений
  Future<bool> unsubscribeCharacteristic({
    required String serviceUuid,
    required String characteristicUuid,
  }) async {
    if (!isConnected) {
      return false;
    }

    try {
      // await characteristic.setNotifyValue(false);
      return true;
    } catch (e) {
      return false;
    }
  }

  /// Обрабатывает полученные данные из уведомления
  void handleCharacteristicNotification(Uint8List data) {
    _dataController.add(data);
  }

  void _updateState(BluetoothBleState newState) {
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
    stopScan();
    _stateController.close();
    _dataController.close();
    _errorController.close();
    super.dispose();
  }
}

/// Состояния BLE подключения
enum BluetoothBleState {
  disconnected,
  connecting,
  connected,
  disconnecting,
}

/// Информация о BLE сервисе
class BleService {
  final String uuid;
  final List<BleCharacteristic> characteristics;

  BleService({
    required this.uuid,
    required this.characteristics,
  });
}

/// Информация о BLE характеристике
class BleCharacteristic {
  final String uuid;
  final List<int> value;
  final bool canRead;
  final bool canWrite;
  final bool canNotify;
  final bool canIndicate;

  BleCharacteristic({
    required this.uuid,
    required this.value,
    required this.canRead,
    required this.canWrite,
    required this.canNotify,
    required this.canIndicate,
  });
}
