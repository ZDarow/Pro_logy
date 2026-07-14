import 'dart:async';
import 'dart:io';
import 'package:flutter/foundation.dart';
import 'package:flutter/services.dart';
import 'abstract_transport.dart';

/// SPP (RFCOMM/Classic Bluetooth) транспорт для PROLOGY устройства
///
/// 96.5% реального трафика PROLOGY LS20 идёт через SPP (RFCOMM),
/// а не через BLE GATT. Этот транспорт обеспечивает доступ ко всем
/// DSP-функциям (60-полосный эквалайзер, 16 аудиоканалов, X-Over и т.д.).
///
/// ## Отличия SPP-протокола от BLE
/// | Параметр | BLE (GATT) | SPP (RFCOMM) |
/// |----------|-----------|--------------|
/// | Формат | `6F CMD TYPE LEN DATA CS 8F` | `[CMD][DATA...]` |
/// | Контр. сумма | XOR всех байтов | Отсутствует |
/// | SYNC/END | 0x6F / 0x8F | Нет |
/// | Тип трафика | 3.5% | 96.5% |
///
/// ## Платформенная поддержка
/// - **Android**: через MethodChannel → BluetoothSocket (RFOMM)
/// - **Linux**: через D-Bus (org.bluez) или прямой сокет
/// - **iOS**: не поддерживается (MFi restriction)
///
/// ## Использование
/// ```dart
/// final transport = SppTransport();
/// transport.setTargetAddress('AA:BB:CC:DD:EE:FF');
/// await transport.connect();
/// await transport.send([0x0f, 0x00, 0x32]); // volume 50
/// ```
class SppTransport implements AbstractTransport {
  // Имя канала для платформенного моста (Android)
  static const String _channelName = 'prology/spp';
  static const MethodChannel _channel = MethodChannel(_channelName);

  final StreamController<List<int>> _dataController =
      StreamController<List<int>>.broadcast();
  final StreamController<TransportEvent> _eventController =
      StreamController<TransportEvent>.broadcast();

  /// Адрес целевого устройства
  String? _targetAddress;
  String? _errorMessage;
  bool _connected = false;

  /// UUID сервиса SPP (SPP = 0x1101)
  static const String sppServiceUuid = '00001101-0000-1000-8000-00805f9b34fb';
  static const String sppServiceUuidShort = '1101';

  @override
  bool get isConnected => _connected;

  @override
  String? get errorMessage => _errorMessage;

  @override
  Stream<List<int>> get onData => _dataController.stream;

  @override
  Stream<TransportEvent> get onEvent => _eventController.stream;

  SppTransport({String? targetAddress}) : _targetAddress = targetAddress;

  /// Установить MAC-адрес целевого устройства (до вызова [connect])
  void setTargetAddress(String address) {
    _targetAddress = address;
  }

  @override
  Future<bool> connect() async {
    if (_targetAddress == null) {
      _errorMessage = 'Target address not set. Call setTargetAddress() first.';
      debugPrint('SppTransport.connect: $_errorMessage');
      return false;
    }

    _errorMessage = null;

    if (defaultTargetPlatform == TargetPlatform.android) {
      return _connectAndroid();
    } else if (defaultTargetPlatform == TargetPlatform.linux) {
      return _connectLinux();
    } else {
      _errorMessage = 'SPP not supported on ${defaultTargetPlatform.name}';
      debugPrint('SppTransport.connect: $_errorMessage');
      return false;
    }
  }

  /// Подключение через Android BluetoothSocket (RFCOMM)
  Future<bool> _connectAndroid() async {
    try {
      final connected = await _channel.invokeMethod<bool>('connect', {
        'address': _targetAddress,
        'uuid': sppServiceUuid,
      });

      if (connected != true) {
        _errorMessage = 'Android SPP connect returned false';
        return false;
      }

      // Запускаем чтение входящих данных
      _channel.setMethodCallHandler((call) async {
        if (call.method == 'onData') {
          final data = (call.arguments as List<dynamic>).cast<int>();
          _dataController.add(data);
        }
        return null;
      });

      _connected = true;
      _eventController.add(const TransportEvent(TransportEventType.connected));
      debugPrint('SppTransport: connected via Android RFCOMM');
      return true;
    } on MissingPluginException {
      _errorMessage =
          'Android SPP plugin not registered. Add SppPlugin to MainActivity.';
      _eventController.add(TransportEvent(
        TransportEventType.error,
        message: _errorMessage,
      ));
      debugPrint('SppTransport: $_errorMessage');
      return false;
    } catch (e) {
      _errorMessage = 'Android SPP connect error: $e';
      _eventController.add(TransportEvent(
        TransportEventType.error,
        message: _errorMessage,
      ));
      debugPrint('SppTransport: $_errorMessage');
      return false;
    }
  }

  /// Подключение через Linux RFCOMM (/dev/rfcomm0)
  ///
  /// Использует `rfcomm bind` для создания виртуального COM-порта,
  /// затем открывает его как RandomAccessFile для обмена данными.
  ///
  /// Требования:
  /// - Пакет bluez-utils (rfcomm)
  /// - Права на /dev/rfcomm0 (udev rule или sudo)
  Future<bool> _connectLinux() async {
    _errorMessage = null;

    try {
      // 1. Создаём RFCOMM-соединение
      debugPrint('SppTransport: binding rfcomm0 -> $_targetAddress');
      final bindResult = await Process.run(
        'rfcomm',
        ['bind', '0', _targetAddress!, '1'],
      );
      if (bindResult.exitCode != 0) {
        // Может быть уже занят — пробуем существующий
        debugPrint(
          'SppTransport: rfcomm bind exit ${bindResult.exitCode}: '
          '${bindResult.stderr}',
        );
      }

      // 2. Ждём появления /dev/rfcomm0 (до 5 секунд)
      final deviceFile = File('/dev/rfcomm0');
      for (int i = 0; i < 50; i++) {
        if (await deviceFile.exists()) break;
        await Future.delayed(const Duration(milliseconds: 100));
      }

      if (!await deviceFile.exists()) {
        _errorMessage = '/dev/rfcomm0 not found after rfcomm bind';
        _eventController.add(TransportEvent(
          TransportEventType.error,
          message: _errorMessage,
        ));
        debugPrint('SppTransport: $_errorMessage');
        return false;
      }

      // 3. Настраиваем raw mode (без buffering, без echo)
      await Process.run('stty', [
        '-F', '/dev/rfcomm0',
        'raw',
        '-echo',
        '-onlcr',
        'time', '1',
        'min', '0',
      ]);

      // 4. Открываем файл: read через openRead (эполл для char devices)
      //    write через RandomAccessFile
      _linuxReadStream = deviceFile.openRead();
      _linuxWriteFile = await deviceFile.open(mode: FileMode.writeOnly);

      // 5. Запускаем чтение
      _startLinuxReader();

      _connected = true;
      _eventController.add(const TransportEvent(TransportEventType.connected));
      debugPrint('SppTransport: connected via Linux RFCOMM');
      return true;
    } catch (e) {
      _errorMessage = 'Linux SPP connect error: $e';
      _eventController.add(TransportEvent(
        TransportEventType.error,
        message: _errorMessage,
      ));
      debugPrint('SppTransport: $_errorMessage');
      await _cleanupLinux();
      return false;
    }
  }

  StreamSubscription<List<int>>? _linuxReadSub;
  RandomAccessFile? _linuxWriteFile;
  bool _linuxReading = false;

  void _startLinuxReader() {
    if (_linuxReadStream == null) return;
    _linuxReading = true;

    _linuxReadSub = _linuxReadStream!.listen(
      (chunk) {
        if (!_linuxReading) return;
        _dataController.add(chunk);
      },
      onError: (error) {
        debugPrint('SppTransport: Linux read error: $error');
        _linuxReading = false;
        if (_connected) {
          _connected = false;
          _eventController.add(TransportEvent(
            TransportEventType.error,
            message: 'Linux SPP read error: $error',
          ));
        }
      },
      onDone: () {
        debugPrint('SppTransport: Linux read stream closed');
        _linuxReading = false;
        if (_connected) {
          _connected = false;
          _eventController.add(const TransportEvent(
            TransportEventType.disconnected,
            message: 'Linux SPP stream closed',
          ));
        }
      },
      cancelOnError: false,
    );
  }

  void _stopLinuxReader() {
    _linuxReading = false;
    _linuxReadSub?.cancel();
    _linuxReadSub = null;
  }

  Stream<List<int>>? _linuxReadStream;

  Future<void> _cleanupLinux() async {
    _stopLinuxReader();
    _linuxReadStream = null;
    try {
      await _linuxWriteFile?.close();
    } catch (_) {}
    _linuxWriteFile = null;
    try {
      await Process.run('rfcomm', ['release', '0']);
    } catch (_) {}
  }

  @override
  Future<bool> send(List<int> data) async {
    if (!_connected) {
      _errorMessage = 'Not connected';
      return false;
    }

    if (defaultTargetPlatform == TargetPlatform.android) {
      try {
        await _channel.invokeMethod('write', {'data': data});
        return true;
      } on MissingPluginException {
        _errorMessage = 'Android SPP plugin not registered';
        return false;
      } catch (e) {
        _errorMessage = 'SPP write error: $e';
        return false;
      }
    }

    if (defaultTargetPlatform == TargetPlatform.linux) {
      if (_linuxWriteFile == null) {
        _errorMessage = 'Linux SPP write file not initialized';
        return false;
      }
      try {
        await _linuxWriteFile!.writeFrom(data);
        return true;
      } catch (e) {
        _errorMessage = 'Linux SPP write error: $e';
        return false;
      }
    }

    _errorMessage = 'SPP send not implemented on this platform';
    return false;
  }

  @override
  Future<void> disconnect() async {
    if (!_connected) return;

    if (defaultTargetPlatform == TargetPlatform.android) {
      try {
        await _channel.invokeMethod('disconnect');
      } catch (e) {
        debugPrint('SppTransport.disconnect error: $e');
      }
    }

    if (defaultTargetPlatform == TargetPlatform.linux) {
      await _cleanupLinux();
    }

    _connected = false;
    _errorMessage = null;
    _eventController.add(const TransportEvent(TransportEventType.disconnected));
    debugPrint('SppTransport: disconnected');
  }

  @override
  Future<void> dispose() async {
    await disconnect();
    await _dataController.close();
    await _eventController.close();
  }
}
