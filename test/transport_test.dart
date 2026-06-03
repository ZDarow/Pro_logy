import 'dart:async';
import 'package:flutter_test/flutter_test.dart';
import 'package:prology/data/transport/abstract_transport.dart';
import 'package:prology/data/transport/ble_transport.dart';
import 'package:flutter_blue_plus/flutter_blue_plus.dart';
import 'package:prology/data/repositories/bt_repository.dart';

/// Mock-транспорт для тестирования BtRepository без реального BLE
class MockTransport implements AbstractTransport {
  bool _connected = false;
  String? _errorMessage;
  bool _shouldConnect = true;
  bool _shouldSend = true;

  final StreamController<List<int>> _controller =
      StreamController<List<int>>.broadcast();

  /// Эмулировать входящие данные от «устройства»
  void injectData(List<int> data) {
    _controller.add(data);
  }

  /// Управление результатом connect()
  void setShouldConnect(bool value) => _shouldConnect = value;

  /// Управление результатом send()
  void setShouldSend(bool value) => _shouldSend = value;

  @override
  bool get isConnected => _connected;

  @override
  String? get errorMessage => _errorMessage;

  @override
  Stream<List<int>> get onData => _controller.stream;

  @override
  Future<bool> connect() async {
    if (_shouldConnect) {
      _connected = true;
      _errorMessage = null;
      return true;
    }
    _errorMessage = 'Mock connect failed';
    return false;
  }

  @override
  Future<void> disconnect() async {
    _connected = false;
  }

  @override
  Future<bool> send(List<int> data) async {
    if (!_connected) {
      _errorMessage = 'Mock: not connected';
      return false;
    }
    if (!_shouldSend) {
      _errorMessage = 'Mock: send failed';
      return false;
    }
    return true;
  }

  @override
  Future<void> dispose() async {
    await _controller.close();
    _connected = false;
  }
}

void main() {
  group('BleTransport', () {
    test('constructor accepts target address', () {
      final transport = BleTransport(targetAddress: 'AA:BB:CC:DD:EE:FF');
      expect(transport.isConnected, false);
      expect(transport.errorMessage, isNull);
    });

    test('constructor with null address', () {
      final transport = BleTransport();
      expect(transport.isConnected, false);
    });

    test('setTargetAddress stores address', () {
      final transport = BleTransport();
      transport.setTargetAddress('11:22:33:44:55:66');
      // Не можем протестировать _pendingAddress (private),
      // но можем проверить что вызов не падает
      expect(transport.isConnected, false);
    });

    test('send returns false when not connected', () async {
      final transport = BleTransport();
      final result = await transport.send([0x6f, 0x0f, 0x70, 0x02, 0x00, 0x32]);
      expect(result, false);
      expect(transport.errorMessage, isNull); // send не выставляет errorMessage
    });
  });

  group('BtRepository with MockTransport', () {
    late MockTransport mockTransport;
    late BtRepository repository;

    setUp(() {
      mockTransport = MockTransport();
      repository = BtRepository(transport: mockTransport);
    });

    tearDown(() {
      repository.dispose();
    });

    test('connect succeeds when transport connects', () async {
      final result = await repository.connect();
      expect(result, true);
      expect(repository.isConnected, true);
      expect(repository.status, BtConnectionStatus.connected);
    });

    test('connect fails when transport fails', () async {
      mockTransport.setShouldConnect(false);
      final result = await repository.connect();
      expect(result, false);
      expect(repository.isConnected, false);
      expect(repository.status, BtConnectionStatus.error);
    });

    test('sendCommand succeeds when connected', () async {
      await repository.connect();
      final result = await repository.sendCommand([0x6f, 0x0f, 0x70, 0x02, 0x00, 0x32]);
      expect(result, true);
    });

    test('sendCommand fails when not connected', () async {
      final result = await repository.sendCommand([0x6f, 0x0f, 0x70, 0x02, 0x00, 0x32]);
      expect(result, false);
    });

    test('incoming data via transport emits parseNotification', () async {
      final states = <PrologyState>[];
      final sub = repository.stateStream.listen((s) => states.add(s));

      await repository.connect();

      // Эмулируем входящее уведомление volume
      final data = <int>[0x6f, 0x0f, 0x80, 0x03, 0x00, 0x01, 0x32];
      final cs = data.fold<int>(0, (p, b) => p ^ b);
      data.addAll([cs, 0x8f]);
      mockTransport.injectData(data);

      await Future.microtask(() {}); // даём стриму дойти

      expect(repository.state.volume, 50);
      await sub.cancel();
    });

    test('incoming data via transport parses bass notification', () async {
      await repository.connect();

      final data = <int>[0x6f, 0x08, 0x80, 0x03, 0x00, 0x01, 0x46];
      final cs = data.fold<int>(0, (p, b) => p ^ b);
      data.addAll([cs, 0x8f]);
      mockTransport.injectData(data);

      await Future.microtask(() {});

      expect(repository.state.bass, 70);
    });

    test('incoming data via transport parses treble notification', () async {
      await repository.connect();

      final data = <int>[0x6f, 0x08, 0x80, 0x03, 0x00, 0x02, 0x3c];
      final cs = data.fold<int>(0, (p, b) => p ^ b);
      data.addAll([cs, 0x8f]);
      mockTransport.injectData(data);

      await Future.microtask(() {});

      expect(repository.state.treble, 60);
    });

    test('incoming data via transport parses device info', () async {
      await repository.connect();

      final serial = 'd17275481dd87936';
      final serialBytes = serial.codeUnits;
      final data = <int>[0x6f, 0x93, 0x80, 0x12, 0x00, 0x10, ...serialBytes];
      final cs = data.fold<int>(0, (p, b) => p ^ b);
      data.addAll([cs, 0x8f]);
      mockTransport.injectData(data);

      await Future.microtask(() {});

      expect(repository.state.deviceSerial, serial);
    });

    test('disconnect resets state', () async {
      await repository.connect();
      expect(repository.isConnected, true);

      await repository.disconnect();
      expect(repository.isConnected, false);
      expect(repository.status, BtConnectionStatus.disconnected);
    });

    test('connectionState stream emits connected/disconnected', () async {
      final states = <BluetoothConnectionState>[];
      final sub = repository.connectionState.listen((s) => states.add(s));

      await repository.connect();
      await Future.microtask(() {});

      expect(states, contains(BluetoothConnectionState.connected));

      await repository.disconnect();
      await Future.microtask(() {});

      expect(states, contains(BluetoothConnectionState.disconnected));

      await sub.cancel();
    });
  });
}
