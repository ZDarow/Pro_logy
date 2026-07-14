import 'dart:async';
import 'package:flutter/foundation.dart';
import 'package:flutter_blue_plus/flutter_blue_plus.dart';
import 'abstract_transport.dart';

/// BLE (GATT) транспорт для PROLOGY устройства
///
/// UUID (подтверждены HCI-логом):
///   Service:   0000ae00-0000-1000-8000-00805f9b34fb
///   CMD (Write): 0000ae01-0000-1000-8000-00805f9b34fb
///   Notify:      0000ae02-0000-1000-8000-00805f9b34fb
///
/// Fallback (старый APK):
///   Service AF00 с характеристикой AF01 (Notify)
class BleTransport implements AbstractTransport {
  static const String targetName = 'PROLOGY_BLE';

  // BLE UUID (подтверждены HCI-логом)
  static const String serviceUuid = '0000ae00-0000-1000-8000-00805f9b34fb';
  static const String cmdCharUuid = '0000ae01-0000-1000-8000-00805f9b34fb';
  static const String notifyCharUuid = '0000ae02-0000-1000-8000-00805f9b34fb';

  // Альтернативный сервис (AF00) — fallback
  static const String altServiceUuid = '0000af00-0000-1000-8000-00805f9b34fb';
  static const String altNotifyCharUuid = '0000af01-0000-1000-8000-00805f9b34fb';

  BluetoothDevice? _device;
  BluetoothCharacteristic? _cmdCharacteristic;
  BluetoothCharacteristic? _notifyCharacteristic;
  StreamSubscription? _notificationSubscription;

  /// Адрес для подключения, установленный через [setTargetAddress]
  String? _pendingAddress;

  final StreamController<List<int>> _dataController =
      StreamController<List<int>>.broadcast();
  final StreamController<TransportEvent> _eventController =
      StreamController<TransportEvent>.broadcast();

  bool _connected = false;
  String? _errorMessage;
  StreamSubscription? _connectionStateSub;

  @override
  bool get isConnected => _connected;

  @override
  String? get errorMessage => _errorMessage;

  @override
  Stream<List<int>> get onData => _dataController.stream;

  @override
  Stream<TransportEvent> get onEvent => _eventController.stream;

  BleTransport({String? targetAddress}) : _pendingAddress = targetAddress;

  /// Установить MAC-адрес целевого устройства (до вызова [connect])
  void setTargetAddress(String address) {
    _pendingAddress = address;
  }

  /// Поиск устройства PROLOGY по имени
  static Future<BluetoothDevice?> scanForDevice({
    Duration timeout = const Duration(seconds: 10),
  }) async {
    final results = <BluetoothDevice>[];
    final sub = FlutterBluePlus.scanResults.listen((devices) {
      for (final d in devices) {
        if (d.device.platformName.toUpperCase().contains('PROLOGY')) {
          results.add(d.device);
        }
      }
    });

    await FlutterBluePlus.startScan(timeout: timeout);
    await Future.delayed(timeout);
    await FlutterBluePlus.stopScan();
    await sub.cancel();

    return results.isNotEmpty ? results.first : null;
  }

  /// Подключиться:
  ///   - если задан адрес через [setTargetAddress] или конструктор — к нему
  ///   - иначе — сканирует первое PROLOGY устройство
  @override
  Future<bool> connect() async {
    if (_device == null && _pendingAddress != null) {
      _device = await _scanForAddress(_pendingAddress!);
      if (_device == null) {
        _errorMessage = 'Device $_pendingAddress not found via scan';
        debugPrint('BleTransport.connect: $_errorMessage');
        return false;
      }
    }
    if (_device == null) {
      _device = await scanForDevice();
      if (_device == null) {
        _errorMessage = 'No PROLOGY device found';
        return false;
      }
    }
    return _connectDevice();
  }

  /// Сканирует BLE и ищет устройство с указанным MAC-адресом
  static Future<BluetoothDevice?> _scanForAddress(String address,
      {Duration timeout = const Duration(seconds: 10)}) async {
    final target = address.toUpperCase();
    final completer = Completer<BluetoothDevice?>();

    final sub = FlutterBluePlus.scanResults.listen((devices) {
      for (final d in devices) {
        if (d.device.remoteId.str.toUpperCase() == target) {
          if (!completer.isCompleted) {
            completer.complete(d.device);
          }
          return;
        }
      }
    });

    await FlutterBluePlus.startScan(timeout: timeout);
    final result = await completer.future.timeout(timeout, onTimeout: () => null);
    await FlutterBluePlus.stopScan();
    await sub.cancel();

    return result;
  }

  /// Подключиться по MAC-адресу (полный цикл: установка адреса + connect)
  Future<bool> connectToAddress(String remoteId) async {
    setTargetAddress(remoteId);
    return connect();
  }

  /// Таймаут на BLE-подключение и discovery
  static const Duration _connectTimeout = Duration(seconds: 15);

  Future<bool> _connectDevice() async {
    try {
      _connectionStateSub?.cancel();
      _connectionStateSub = _device!.connectionState.listen((state) {
        debugPrint('BleTransport: connection state -> $state');
        if (state == BluetoothConnectionState.disconnected && _connected) {
          _connected = false;
          _eventController.add(const TransportEvent(
            TransportEventType.disconnected,
            message: 'BLE device disconnected',
          ));
        }
      });

      await _device!.connect(timeout: _connectTimeout);
      await _discoverPrologyService();

      if (_cmdCharacteristic == null) {
        _errorMessage = 'CMD characteristic (AE01) not found during discovery';
        await _device!.disconnect();
        _eventController.add(TransportEvent(
          TransportEventType.error,
          message: _errorMessage,
        ));
        return false;
      }

      _connected = true;
      _errorMessage = null;
      _eventController.add(const TransportEvent(TransportEventType.connected));
      debugPrint('BleTransport: connected with timeout=$_connectTimeout');
      return true;
    } catch (e) {
      _errorMessage = 'Connection failed: $e';
      _eventController.add(TransportEvent(
        TransportEventType.error,
        message: _errorMessage,
      ));
      debugPrint('BleTransport._connectDevice error: $e');
      return false;
    }
  }

  Future<void> _discoverPrologyService() async {
    if (_device == null) return;

    final services = await _device!.discoverServices();
    for (final service in services) {
      final svcUuid = service.uuid.str128.toLowerCase();

      // Service AE00
      if (svcUuid == serviceUuid) {
        for (final char in service.characteristics) {
          final uuid = char.uuid.str128.toLowerCase();
          if (uuid == cmdCharUuid) {
            _cmdCharacteristic = char;
            debugPrint('BleTransport: found CMD char (AE01)');
          }
          if (uuid == notifyCharUuid) {
            _notifyCharacteristic = char;
            debugPrint('BleTransport: found NOTIFY char (AE02)');
            await _subscribeToNotifications();
          }
        }
      }

      // Fallback: Service AF00
      if (svcUuid == altServiceUuid && _notifyCharacteristic == null) {
        for (final char in service.characteristics) {
          final uuid = char.uuid.str128.toLowerCase();
          if (uuid == altNotifyCharUuid) {
            _notifyCharacteristic = char;
            debugPrint('BleTransport: found NOTIFY char (AF01 fallback)');
            await _subscribeToNotifications();
          }
        }
      }
    }

    if (_cmdCharacteristic == null) {
      debugPrint('BleTransport: CMD characteristic (AE01) not found');
    }
  }

  Future<void> _subscribeToNotifications() async {
    if (_notifyCharacteristic == null) return;
    try {
      await _notifyCharacteristic!.setNotifyValue(true);
      _notificationSubscription?.cancel();
      _notificationSubscription =
          _notifyCharacteristic!.onValueReceived.listen((data) {
        _dataController.add(data);
      });
      debugPrint('BleTransport: subscribed to notifications');
    } catch (e) {
      debugPrint('BleTransport: subscribe error: $e');
    }
  }

  @override
  Future<bool> send(List<int> data) async {
    if (_cmdCharacteristic == null) return false;
    try {
      await _cmdCharacteristic!.write(data, withoutResponse: true);
      return true;
    } catch (e) {
      debugPrint('BleTransport.send error: $e');
      return false;
    }
  }

  @override
  Future<void> disconnect() async {
    _notificationSubscription?.cancel();
    _notificationSubscription = null;
    _connectionStateSub?.cancel();
    _connectionStateSub = null;
    if (_notifyCharacteristic != null) {
      try {
        await _notifyCharacteristic!.setNotifyValue(false);
      } catch (e) {
        debugPrint('BleTransport: error disabling notifications: $e');
      }
    }
    _notifyCharacteristic = null;
    _cmdCharacteristic = null;
    if (_device != null) {
      await _device!.disconnect();
      _device = null;
    }
    _connected = false;
  }

  @override
  Future<void> dispose() async {
    await disconnect();
    await _dataController.close();
    await _eventController.close();
  }
}
