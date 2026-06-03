import 'dart:async';
import 'dart:io' show File, FileMode, Process;
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
/// - **Android**: через MethodChannel → BluetoothSocket (RFCOMM)
/// - **Linux**: через rfcomm connect + /dev/rfcomm0
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

  /// Адрес целевого устройства
  String? _targetAddress;
  String? _errorMessage;
  bool _connected = false;

  // Linux SPP state
  Process? _rfcommProcess;       // rfcomm connect subprocess
  Process? _readerProcess;       // cat /dev/rfcomm0 subprocess
  StreamSubscription? _readerSub;

  /// UUID сервиса SPP (SPP = 0x1101)
  static const String sppServiceUuid = '00001101-0000-1000-8000-00805f9b34fb';
  static const String sppServiceUuidShort = '1101';

  @override
  bool get isConnected => _connected;

  @override
  String? get errorMessage => _errorMessage;

  @override
  Stream<List<int>> get onData => _dataController.stream;

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
      debugPrint('SppTransport: connected via Android RFCOMM');
      return true;
    } on MissingPluginException {
      _errorMessage =
          'Android SPP plugin not registered. Add SppPlugin to MainActivity.';
      debugPrint('SppTransport: $_errorMessage');
      return false;
    } catch (e) {
      _errorMessage = 'Android SPP connect error: $e';
      debugPrint('SppTransport: $_errorMessage');
      return false;
    }
  }

  /// Подключение через Linux RFCOMM (bluez-tools)
  ///
  /// Использует `rfcomm connect` для создания устройства /dev/rfcomm0,
  /// затем открывает его для чтения/записи.
  ///
  /// Требования:
  ///   sudo apt install bluez-tools
  ///   `sudo rfcomm bind 0 <addr> 1`  (или права на rfcomm)
  ///
  /// Альтернатива (без sudo):
  ///   1. `sudo setcap cap_net_raw+eip $(which rfcomm)`
  ///   2. Или добавить пользователя в группу bluetooth
  Future<bool> _connectLinux() async {
    try {
      // 1. Останавливаем старые RFCOMM-сессии для этого адреса
      await Process.run('pkill', ['-f', 'rfcomm.*$_targetAddress'])
          .timeout(const Duration(seconds: 2));
      await Future.delayed(const Duration(milliseconds: 200));

      // 2. Запускаем rfcomm connect в фоне
      _rfcommProcess = await Process.start(
        'rfcomm',
        ['connect', '0', _targetAddress!, '1'],
      );

      // 3. Ждём появления /dev/rfcomm0
      const rfcommDevice = '/dev/rfcomm0';
      final deviceFile = File(rfcommDevice);
      bool deviceReady = false;
      for (int i = 0; i < 50; i++) {
        if (await deviceFile.exists()) {
          // Проверяем, что устройство доступно для записи
          try {
            final testFile = await deviceFile.open(mode: FileMode.writeOnlyAppend);
            await testFile.close();
            deviceReady = true;
            break;
          } catch (_) {
            // Устройство есть, но ещё не готово
          }
        }
        await Future.delayed(const Duration(milliseconds: 200));
      }

      if (!deviceReady) {
        _errorMessage = 'RFCOMM device $rfcommDevice not created.\n'
            '  Make sure bluez-tools is installed and you have permissions:\n'
            '  sudo apt install bluez-tools\n'
            '  sudo adduser <your-user> bluetooth';
        debugPrint('SppTransport._connectLinux: $_errorMessage');
        return false;
      }

      // 4. Запускаем чтение входящих данных через cat
      _readerProcess = await Process.start('cat', [rfcommDevice]);
      _readerSub = _readerProcess!.stdout.listen(
        (data) {
          _dataController.add(data.toList());
        },
        onError: (e) {
          debugPrint('SppTransport reader error: $e');
        },
        onDone: () {
          debugPrint('SppTransport reader finished');
        },
      );

      _errorMessage = null;
      _connected = true;
      debugPrint('SppTransport: connected via Linux RFCOMM ($rfcommDevice)');
      return true;
    } catch (e) {
      _errorMessage = 'Linux SPP connect error: $e';
      debugPrint('SppTransport._connectLinux: $_errorMessage');
      return false;
    }
  }

  @override
  Future<bool> send(List<int> data) async {
    if (!_connected) {
      _errorMessage = 'Not connected';
      return false;
    }

    switch (defaultTargetPlatform) {
      case TargetPlatform.android:
        try {
          await _channel.invokeMethod('write', {
            'data': data,
          });
          return true;
        } on MissingPluginException {
          _errorMessage = 'Android SPP plugin not registered';
          return false;
        } catch (e) {
          _errorMessage = 'SPP write error: $e';
          return false;
        }

      case TargetPlatform.linux:
        try {
          final file = await File('/dev/rfcomm0').open(mode: FileMode.writeOnlyAppend);
          await file.writeFrom(data);
          await file.close();
          debugPrint(
              'SPP TX (Linux): ${data.map((b) => b.toRadixString(16).padLeft(2, '0')).join(' ')}');
          return true;
        } catch (e) {
          _errorMessage = 'Linux SPP write error: $e';
          return false;
        }

      default:
        _errorMessage = 'SPP send not implemented on $defaultTargetPlatform';
        return false;
    }
  }

  @override
  Future<void> disconnect() async {
    if (!_connected) return;

    switch (defaultTargetPlatform) {
      case TargetPlatform.android:
        try {
          await _channel.invokeMethod('disconnect');
        } catch (e) {
          debugPrint('SppTransport.disconnect error: $e');
        }
        break;

      case TargetPlatform.linux:
        // Останавливаем reader
        _readerSub?.cancel();
        _readerSub = null;
        _readerProcess?.kill();
        _readerProcess = null;

        // Останавливаем rfcomm
        _rfcommProcess?.kill();
        _rfcommProcess = null;

        // Принудительно отвязываем RFCOMM
        try {
          await Process.run('rfcomm', ['release', '0'])
              .timeout(const Duration(seconds: 2));
        } catch (_) {}
        try {
          await Process.run('pkill', ['-f', 'rfcomm.*$_targetAddress'])
              .timeout(const Duration(seconds: 2));
        } catch (_) {}
        break;

      default:
        break;
    }

    _connected = false;
    _errorMessage = null;
    debugPrint('SppTransport: disconnected');
  }

  @override
  Future<void> dispose() async {
    await disconnect();
    _readerSub?.cancel();
    _readerProcess?.kill();
    _rfcommProcess?.kill();
    await _dataController.close();
  }
}
