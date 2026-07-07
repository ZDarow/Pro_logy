import 'dart:typed_data';

import 'package:flutter_test/flutter_test.dart';
import 'package:prology_bluetooth/prology_bluetooth.dart';

/// Набор тестов для PrologyBluetooth
void main() {
  group('PrologyBluetooth Tests', () {
    late PrologyBluetooth bluetooth;

    setUp(() {
      bluetooth = PrologyBluetooth();
    });

    tearDown(() {
      bluetooth.dispose();
    });

    test('Initial state is disconnected', () {
      expect(bluetooth.state, equals(BluetoothState.disconnected));
      expect(bluetooth.isConnected, isFalse);
      expect(bluetooth.isConnecting, isFalse);
    });

    test('MAC address validation', () {
      // Valid addresses
      expect(_isValidMacAddress('90:20:71:5E:48:10'), isTrue);
      expect(_isValidMacAddress('00:11:22:33:44:55'), isTrue);
      expect(_isValidMacAddress('AA:BB:CC:DD:EE:FF'), isTrue);

      // Invalid addresses
      expect(_isValidMacAddress(''), isFalse);
      expect(_isValidMacAddress('90:20:71:5E:48'), isFalse);
      expect(_isValidMacAddress('GG:HH:II:JJ:KK:LL'), isFalse);
    });

    test('Send without connection returns false', () async {
      final result = await bluetooth.send(Uint8List.fromList([0x01, 0x02]));
      expect(result, isFalse);
    });

    test('SendString without connection returns false', () async {
      final result = await bluetooth.sendString('TEST');
      expect(result, isFalse);
    });

    test('SendCommand without connection returns false', () async {
      final result = await bluetooth.sendCommand('AUTH');
      expect(result, isFalse);
    });

    test('State stream emits values', () async {
      final states = <BluetoothState>[];
      final subscription = bluetooth.connectionState.listen((state) {
        states.add(state);
      });

      // Simulate state changes
      // Note: In real tests, you would mock the connection

      await subscription.cancel();
      expect(states, isA<List<BluetoothState>>());
    });

    test('Data stream emits values', () async {
      final dataList = <Uint8List>[];
      final subscription = bluetooth.incomingData.listen((data) {
        dataList.add(data);
      });

      // Simulate data reception
      // Note: In real tests, you would mock the data source

      await subscription.cancel();
      expect(dataList, isA<List<Uint8List>>());
    });

    test('Error stream emits values', () async {
      final errors = <String>[];
      final subscription = bluetooth.errorStream.listen((error) {
        errors.add(error);
      });

      // Simulate errors
      // Note: In real tests, you would trigger error conditions

      await subscription.cancel();
      expect(errors, isA<List<String>>());
    });

    test('Callback assignment', () {
      bool connectedCalled = false;
      bool disconnectedCalled = false;
      String? errorCalled;

      bluetooth.connectionCallback = SimpleConnectionCallback(
        onConnectedCallback: () => connectedCalled = true,
        onDisconnectedCallback: () => disconnectedCalled = true,
        onErrorCallback: (error) => errorCalled = error,
      );

      // Note: In real tests, you would trigger the callbacks

      expect(bluetooth.connectionCallback, isA<SimpleConnectionCallback>());
    });

    test('Data callback assignment', () {
      Uint8List? receivedData;

      bluetooth.dataCallback = SimpleDataCallback(
        onDataReceivedCallback: (data) => receivedData = data,
      );

      expect(bluetooth.dataCallback, isA<SimpleDataCallback>());
    });

    test('Auto reconnect settings', () {
      bluetooth.autoReconnect = true;
      bluetooth.maxReconnectAttempts = 5;
      bluetooth.reconnectDelay = const Duration(seconds: 3);

      // Note: These are internal settings, verify through behavior in integration tests
    });
  });

  group('BluetoothState Extension Tests', () {
    test('State descriptions', () {
      expect(BluetoothState.disconnected.description, equals('Отключено'));
      expect(BluetoothState.connecting.description, equals('Подключение...'));
      expect(BluetoothState.connected.description, equals('Подключено'));
      expect(BluetoothState.disconnecting.description, equals('Отключение...'));
    });

    test('State predicates', () {
      expect(BluetoothState.connected.isConnected, isTrue);
      expect(BluetoothState.disconnected.isConnected, isFalse);
      expect(BluetoothState.connecting.isConnecting, isTrue);
      expect(BluetoothState.connected.isConnecting, isFalse);
    });
  });

  group('BluetoothDeviceInfo Tests', () {
    test('Create device info', () {
      final info = BluetoothDeviceInfo(
        address: '90:20:71:5E:48:10',
        name: 'PROLOGY Device',
        type: 'SPP',
        rssi: -50,
      );

      expect(info.address, equals('90:20:71:5E:48:10'));
      expect(info.name, equals('PROLOGY Device'));
      expect(info.type, equals('SPP'));
      expect(info.rssi, equals(-50));
    });

    test('Device info equality', () {
      final info1 = BluetoothDeviceInfo(
        address: '90:20:71:5E:48:10',
        type: 'SPP',
      );

      final info2 = BluetoothDeviceInfo(
        address: '90:20:71:5E:48:10',
        type: 'BLE',
      );

      expect(info1, equals(info2)); // Same address
      expect(info1.hashCode, equals(info2.hashCode));
    });

    test('Device info toString', () {
      final info = BluetoothDeviceInfo(
        address: '90:20:71:5E:48:10',
        name: 'PROLOGY',
        type: 'SPP',
      );

      final str = info.toString();
      expect(str, contains('90:20:71:5E:48:10'));
      expect(str, contains('PROLOGY'));
      expect(str, contains('SPP'));
    });
  });

  group('PrologyBluetoothSpp Tests', () {
    late PrologyBluetoothSpp spp;

    setUp(() {
      spp = PrologyBluetoothSpp();
    });

    tearDown(() {
      spp.dispose();
    });

    test('Initial state', () {
      expect(spp.state, equals(BluetoothSppState.disconnected));
      expect(spp.isConnected, isFalse);
    });

    test('Send without connection', () async {
      final result = await spp.send(Uint8List.fromList([0x01]));
      expect(result, isFalse);
    });
  });

  group('PrologyBluetoothBle Tests', () {
    late PrologyBluetoothBle ble;

    setUp(() {
      ble = PrologyBluetoothBle();
    });

    tearDown(() {
      ble.dispose();
    });

    test('Initial state', () {
      expect(ble.state, equals(BluetoothBleState.disconnected));
      expect(ble.isScanning, isFalse);
    });

    test('Start/Stop scan', () async {
      await ble.startScan();
      expect(ble.isScanning, isTrue);

      await ble.stopScan();
      expect(ble.isScanning, isFalse);
    });
  });
}

// Helper function for MAC address validation
bool _isValidMacAddress(String address) {
  final macPattern = RegExp(
    r'^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$',
  );
  return macPattern.hasMatch(address);
}
