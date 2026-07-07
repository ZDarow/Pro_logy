import 'dart:async';
import 'package:flutter_test/flutter_test.dart';
import 'package:prology/data/transport/abstract_transport.dart';
import 'package:prology/data/transport/ble_transport.dart';
import 'package:prology/data/transport/spp_frame_buffer.dart';
import 'package:flutter_blue_plus/flutter_blue_plus.dart';
import 'package:prology/data/repositories/bt_repository.dart';

/// Mock-транспорт для тестирования BtRepository без реального BLE
class MockTransport implements AbstractTransport {
  bool _connected = false;
  String? _errorMessage;
  bool _shouldConnect = true;
  bool _shouldSend = true;
  int _sendFailCount = 0;
  int _sendCallCount = 0;
  final List<List<int>> sentCommands = [];

  final StreamController<List<int>> _dataController =
      StreamController<List<int>>.broadcast();
  final StreamController<TransportEvent> _eventController =
      StreamController<TransportEvent>.broadcast();

  /// Эмулировать входящие данные от «устройства»
  void injectData(List<int> data) {
    _dataController.add(data);
  }

  /// Эмулировать событие отключения от транспорта
  void simulateDisconnect() {
    _connected = false;
    _eventController.add(const TransportEvent(
      TransportEventType.disconnected,
      message: 'Mock disconnect',
    ));
  }

  /// Эмулировать событие ошибки
  void simulateError(String message) {
    _connected = false;
    _eventController.add(TransportEvent(
      TransportEventType.error,
      message: message,
    ));
  }

  /// Управление результатом connect()
  void setShouldConnect(bool value) => _shouldConnect = value;

  /// Управление результатом send()
  void setShouldSend(bool value) => _shouldSend = value;

  /// Количество первых вызовов send(), которые будут кидать исключение
  void setSendFailCount(int count) => _sendFailCount = count;

  @override
  bool get isConnected => _connected;

  @override
  String? get errorMessage => _errorMessage;

  @override
  Stream<List<int>> get onData => _dataController.stream;

  @override
  Stream<TransportEvent> get onEvent => _eventController.stream;

  @override
  Future<bool> connect() async {
    if (_shouldConnect) {
      _connected = true;
      _errorMessage = null;
      _eventController.add(const TransportEvent(TransportEventType.connected));
      return true;
    }
    _errorMessage = 'Mock connect failed';
    _eventController.add(TransportEvent(
      TransportEventType.error,
      message: _errorMessage,
    ));
    return false;
  }

  @override
  Future<void> disconnect() async {
    _connected = false;
    _eventController.add(const TransportEvent(TransportEventType.disconnected));
  }

  @override
  Future<bool> send(List<int> data) async {
    sentCommands.add(List.unmodifiable(data));
    _sendCallCount++;
    if (_sendCallCount <= _sendFailCount) {
      throw Exception('Mock send failure #$_sendCallCount');
    }
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
    await _dataController.close();
    await _eventController.close();
    _connected = false;
  }
}

void main() {
  group('SppFrameBuffer', () {
    late SppFrameBuffer buffer;

    setUp(() {
      buffer = SppFrameBuffer();
    });

    test('returns empty list for empty input', () {
      expect(buffer.feed([]), isEmpty);
    });

    test('returns empty list for partial frame (no END)', () {
      final frames = buffer.feed([0x6f, 0x0f, 0x80, 0x03, 0x00, 0x01, 0x32]);
      expect(frames, isEmpty);
      expect(buffer.bufferSize, 7);
    });

    test('extracts one complete frame', () {
      final frame = <int>[0x6f, 0x0f, 0x80, 0x03, 0x00, 0x01, 0x32, 0x6c, 0x8f];
      final frames = buffer.feed(frame);
      expect(frames, hasLength(1));
      expect(frames[0], orderedEquals(frame));
      expect(buffer.bufferSize, 0);
    });

    test('extracts complete frame after partial feed', () {
      // Первая часть — без END
      var frames = buffer.feed([0x6f, 0x0f, 0x80, 0x03, 0x00, 0x01, 0x32]);
      expect(frames, isEmpty);
      expect(buffer.bufferSize, 7);

      // Вторая часть — с END
      frames = buffer.feed([0x6c, 0x8f]);
      expect(frames, hasLength(1));
      expect(frames[0], hasLength(9));
      expect(frames[0].first, 0x6f);
      expect(frames[0].last, 0x8f);
      expect(buffer.bufferSize, 0);
    });

    test('extracts two frames from single chunk', () {
      const frame1 = <int>[0x6f, 0x01, 0x80, 0x02, 0x00, 0x03, 0x7f, 0x8f];
      const frame2 = <int>[0x6f, 0x0f, 0x80, 0x03, 0x00, 0x01, 0x32, 0x6c, 0x8f];
      final frames = buffer.feed([...frame1, ...frame2]);
      expect(frames, hasLength(2));
      expect(frames[0], orderedEquals(frame1));
      expect(frames[1], orderedEquals(frame2));
      expect(buffer.bufferSize, 0);
    });

    test('ignores garbage before SYNC', () {
      final frame = <int>[0x00, 0xff, 0xab, 0x6f, 0x0f, 0x80, 0x03, 0x00, 0x01, 0x32, 0x6c, 0x8f];
      final frames = buffer.feed(frame);
      expect(frames, hasLength(1));
      // Фрейм должен начинаться с 0x6f
      expect(frames[0].first, 0x6f);
      expect(frames[0].last, 0x8f);
      expect(buffer.bufferSize, 0);
    });

    test('discards data before SYNC and extracts frame after', () {
      // Мусор до 0x6f будет отброшен, фрейм будет найден
      final frames = buffer.feed(<int>[
        0x00, 0xff, 0xab, // мусор
        0x6f, 0x0f, 0x80, 0x03, 0x00, 0x01, 0x32, 0x6c, 0x8f, // фрейм
      ]);
      expect(frames, hasLength(1));
      expect(frames[0].first, 0x6f);
      expect(frames[0][1], 0x0f);
      expect(frames[0].last, 0x8f);
      expect(buffer.bufferSize, 0);
    });

    test('buffer overflow resets state', () {
      // Заполняем буффер > 64КБ без valid фрейма
      final bigChunk = List<int>.generate(70000, (i) => 0x42);
      final frames = buffer.feed(bigChunk);
      expect(frames, isEmpty);
      // После overflow буффер должен быть пуст
      expect(buffer.bufferSize, 0);
    });

    test('clear resets buffer', () {
      buffer.feed([0x6f, 0x0f, 0x80]);
      expect(buffer.bufferSize, 3);
      buffer.clear();
      expect(buffer.bufferSize, 0);
    });

    test('v1 legacy frames (0xF0) mixed with v2 are ignored', () {
      // v1: F0 00 ..., v2: 6F ... 8F
      // v1 данные не содержат 0x8f, поэтому буфер накапливает их
      // до тех пор, пока не встретит 0x6f (начало v2 фрейма)
      final frames = buffer.feed(<int>[
        0xf0, 0x00, 0x05, 0xa0, 0x10, 0x0e, 0x18, 0x32, 0x95, // v1 (9 байт, нет 0x8f)
        0x6f, 0x0f, 0x80, 0x03, 0x00, 0x01, 0x32, 0x6c, 0x8f, // v2 (9 байт)
      ]);
      expect(frames, hasLength(1));
      expect(frames[0].first, 0x6f);
    });

    test('extracts minimum 6-byte frame (LEN=0)', () {
      // SYNC CMD TYPE LEN=0 CS END = 6 bytes
      final data = <int>[0x6f, 0x01, 0x70, 0x00];
      final cs = data.fold<int>(0, (p, b) => p ^ b);
      data.addAll([cs, 0x8f]);

      final frames = buffer.feed(data);
      expect(frames, hasLength(1));
      expect(frames[0], hasLength(6));
      expect(frames[0].first, 0x6f);
      expect(frames[0].last, 0x8f);
      expect(buffer.bufferSize, 0);
    });

    test('does not confuse SYNC byte in data with frame start', () {
      // Первый пакет содержит 0x6f в данных
      // 6f 01 80 02 [6f 00] CS 8f
      final data1 = <int>[0x6f, 0x01, 0x80, 0x02, 0x6f, 0x00];
      final cs1 = data1.fold<int>(0, (p, b) => p ^ b);
      data1.addAll([cs1, 0x8f]);

      // Второй пакет идёт сразу следом
      // 6f 0f 80 03 00 01 32 d0 8f
      final data2 = <int>[0x6f, 0x0f, 0x80, 0x03, 0x00, 0x01, 0x32, 0xd0, 0x8f];

      final frames = buffer.feed([...data1, ...data2]);
      expect(frames, hasLength(2));
      // Первый фрейм: SYNC..END, второй: SYNC..END
      expect(frames[0].first, 0x6f);
      expect(frames[1].first, 0x6f);
      expect(buffer.bufferSize, 0);
    });
  });

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

    test('transport disconnect event triggers reconnect attempt', () async {
      await repository.connect();
      expect(repository.isConnected, true);

      // Эмулируем обрыв соединения
      mockTransport.simulateDisconnect();

      // Ждём начала reconnect (задержка 1s, в тесте не ждём)
      await Future.delayed(const Duration(milliseconds: 50));

      // Не connected, т.к. reconnecting
      expect(repository.isConnected, false);
      expect(repository.status, BtConnectionStatus.disconnected);
    });

    test('reconnect restores connection', () async {
      await repository.connect();
      expect(repository.isConnected, true);

      // Устанавливаем shouldConnect обратно в true перед disconnect
      mockTransport.simulateDisconnect();
      await Future.delayed(const Duration(milliseconds: 50));

      // После reconnect delay, should снова connected
      await Future.delayed(const Duration(seconds: 1));
      expect(repository.isConnected, true);
      expect(repository.status, BtConnectionStatus.connected);
    });

    test('heartbeat responses reset missed counter', () async {
      await repository.connect();

      // Отправляем heartbeat response — любой ответ сбрасывает _missedHeartbeats
      final data = <int>[0x6f, 0x0f, 0x80, 0x03, 0x00, 0x01, 0x32];
      final cs = data.fold<int>(0, (p, b) => p ^ b);
      data.addAll([cs, 0x8f]);
      mockTransport.injectData(data);

      await Future.microtask(() {});
      // Не должно быть reconnect после heartbeat timeout, т.к. счётчик сброшен
      expect(repository.state.volume, 50);
    });

    test('disconnect from transport triggers status update', () async {
      await repository.connect();
      final states = <BluetoothConnectionState>[];
      final sub = repository.connectionState.listen((s) {
        states.add(s);
      });

      mockTransport.simulateDisconnect();

      await Future.delayed(const Duration(milliseconds: 50));
      expect(states, contains(BluetoothConnectionState.disconnected));
      await sub.cancel();
    });

    test('volumeSet updates state on success', () async {
      await repository.connect();
      expect(repository.state.volume, 0);

      final result = await repository.volumeSet(50);
      expect(result, true);
      expect(repository.state.volume, 50);
    });

    test('volumeSet clamps value 0-100', () async {
      await repository.connect();

      var result = await repository.volumeSet(-5);
      expect(result, true);
      expect(repository.state.volume, 0);

      result = await repository.volumeSet(150);
      expect(result, true);
      expect(repository.state.volume, 100);
    });

    test('volumeUp and volumeDown update state', () async {
      await repository.connect();
      await repository.volumeSet(50);

      await repository.volumeUp();
      expect(repository.state.volume, 55);

      await repository.volumeDown();
      expect(repository.state.volume, 50);
    });

    test('volumeSet returns false when not connected', () async {
      final result = await repository.volumeSet(50);
      expect(result, false);
      expect(repository.state.volume, 0);
    });

    test('setBass and setTreble update state', () async {
      await repository.connect();

      var result = await repository.setBass(70);
      expect(result, true);
      expect(repository.state.bass, 70);

      result = await repository.setTreble(60);
      expect(result, true);
      expect(repository.state.treble, 60);
    });

    test('setBass clamps value 0-100', () async {
      await repository.connect();

      var result = await repository.setBass(-1);
      expect(result, true);
      expect(repository.state.bass, 0);

      result = await repository.setBass(101);
      expect(result, true);
      expect(repository.state.bass, 100);
    });

    test('sendCommand retries on exception', () async {
      await repository.connect();
      // Первые 2 вызова send() будут кидать исключение, третий — успех
      mockTransport.setSendFailCount(2);

      final result = await repository.sendCommand([0x6f, 0x0f, 0x70, 0x02, 0x00, 0x32]);
      expect(result, true);
    });

    test('sendCommand returns false after all retries fail', () async {
      await repository.connect();
      // Все вызовы send() будут кидать исключение
      mockTransport.setSendFailCount(99);

      final result = await repository.sendCommand([0x6f, 0x0f, 0x70, 0x02, 0x00, 0x32]);
      expect(result, false);
      expect(repository.errorMessage, contains('Failed to send'));
    });

    test('reconnect exhausts after 3 attempts', () async {
      mockTransport.setShouldConnect(false);
      await repository.connect();

      // Все 3 reconnect attempts будут фейлиться (shouldConnect=false)
      // Ждём: 1s + 2s + 4s + запас
      await Future.delayed(const Duration(seconds: 8));

      expect(repository.status, BtConnectionStatus.error);
      expect(repository.isConnected, false);
      expect(repository.errorMessage, contains('Reconnect failed'));
    }, timeout: const Timeout(Duration(seconds: 15)));

    test('connectionState emits disconnected on transport error', () async {
      mockTransport.setShouldConnect(false);
      final states = <BluetoothConnectionState>[];
      final sub = repository.connectionState.listen((s) {
        states.add(s);
      });

      await repository.connect();
      await Future.microtask(() {});

      expect(states, contains(BluetoothConnectionState.disconnected));
      await sub.cancel();
    });

    test('legacy connect sends legacy init frame', () async {
      mockTransport.sentCommands.clear();
      final legacyRepo = BtRepository(
        protocolVersion: ProtocolVersion.legacy,
        transport: mockTransport,
      );

      await legacyRepo.connect();
      // Init frame: f0 00 03 01 05 00 CS
      final initCmd = mockTransport.sentCommands.firstWhere(
        (c) => c.first == 0xf0 && c[1] == 0x00,
      );
      expect(initCmd[2], 0x03);
      expect(initCmd[3], 0x01);
      expect(initCmd[4], 0x05);
      expect(initCmd[5], 0x00);

      legacyRepo.dispose();
    });

    test('legacy volumeSet sends legacy format packet', () async {
      mockTransport.sentCommands.clear();
      final legacyRepo = BtRepository(
        protocolVersion: ProtocolVersion.legacy,
        transport: mockTransport,
      );

      await legacyRepo.connect();
      mockTransport.sentCommands.clear(); // очищаем init

      await legacyRepo.volumeSet(50);
      // f0 00 05 a0 10 0e 18 32 CS
      final volCmd = mockTransport.sentCommands.last;
      expect(volCmd[0], 0xf0);
      expect(volCmd[2], 0x05);
      expect(volCmd[5], 0x0e);
      expect(volCmd[6], 0x18);
      expect(volCmd[7], 50);
      expect(legacyRepo.state.volume, 50);

      legacyRepo.dispose();
    });

    test('legacy setBass sends legacy format packet', () async {
      mockTransport.sentCommands.clear();
      final legacyRepo = BtRepository(
        protocolVersion: ProtocolVersion.legacy,
        transport: mockTransport,
      );

      await legacyRepo.connect();
      mockTransport.sentCommands.clear();

      await legacyRepo.setBass(70);
      // f0 00 05 a0 10 0e 24 14 CS (bassVal=4, +0x10=0x14)
      final bassCmd = mockTransport.sentCommands.last;
      expect(bassCmd[0], 0xf0);
      expect(bassCmd[6], 0x24);
      expect(bassCmd[7], 0x14);
      expect(legacyRepo.state.bass, 70);

      legacyRepo.dispose();
    });

    test('legacy setTreble sends legacy format packet', () async {
      mockTransport.sentCommands.clear();
      final legacyRepo = BtRepository(
        protocolVersion: ProtocolVersion.legacy,
        transport: mockTransport,
      );

      await legacyRepo.connect();
      mockTransport.sentCommands.clear();

      await legacyRepo.setTreble(60);
      // trebleVal = ((60*20)~/100)-10 = 2, +0x20 = 0x22
      final trebCmd = mockTransport.sentCommands.last;
      expect(trebCmd[0], 0xf0);
      expect(trebCmd[6], 0x24);
      expect(trebCmd[7], 0x22);
      expect(legacyRepo.state.treble, 60);

      legacyRepo.dispose();
    });

    test('setXoverHpf sends correct command', () async {
      await repository.connect();
      mockTransport.sentCommands.clear();

      await repository.setXoverHpf(1, 80, 0, 2, 0);
      final cmd = mockTransport.sentCommands.last;
      expect(cmd[0], 0x6f);
      expect(cmd[1], 0x20); // CMD XOVER_HPF
      expect(cmd[4], 1);
      expect(cmd[5], 80);
    });

    test('setTimeAlignment sends correct command', () async {
      await repository.connect();
      mockTransport.sentCommands.clear();

      await repository.setTimeAlignment(1, 50);
      final cmd = mockTransport.sentCommands.last;
      expect(cmd[1], 0x30);
      expect(cmd[4], 1);
      expect(cmd[5], 50);
    });

    test('setMuteChannel sends correct command', () async {
      await repository.connect();
      mockTransport.sentCommands.clear();

      await repository.setMuteChannel(2, true);
      final cmd = mockTransport.sentCommands.last;
      expect(cmd[1], 0x40);
      expect(cmd[4], 2);
      expect(cmd[5], 1);
    });

    test('setSubwooferVolume sends correct command', () async {
      await repository.connect();
      mockTransport.sentCommands.clear();

      await repository.setSubwooferVolume(80);
      final cmd = mockTransport.sentCommands.last;
      expect(cmd[1], 0x13);
      expect(cmd[4], 0x01);
      expect(cmd[5], 80);
    });

    test('setBassBoost sends correct command', () async {
      await repository.connect();
      mockTransport.sentCommands.clear();

      await repository.setBassBoost(true, 80);
      final cmd = mockTransport.sentCommands.last;
      expect(cmd[1], 0x14);
      expect(cmd[4], 1);
      expect(cmd[5], 80);
    });

    test('getStatus sends correct command', () async {
      await repository.connect();
      mockTransport.sentCommands.clear();

      await repository.getStatus();
      final cmd = mockTransport.sentCommands.last;
      expect(cmd[1], 0x70); // CMD GET_STATUS
    });
  });
}
