import 'package:mockito/mockito.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:flutter_blue_plus/flutter_blue_plus.dart';
import 'package:prology/data/repositories/bt_repository.dart';

// Mock classes
class MockBluetoothDevice extends Mock implements BluetoothDevice {}
class MockBluetoothCharacteristic extends Mock implements BluetoothCharacteristic {}
class MockBluetoothService extends Mock implements BluetoothService {}

void main() {
  group('BtRepository Tests', () {
    late BtRepository repository;

    setUp(() {
      repository = BtRepository();
    });

    tearDown(() {
      repository.dispose();
    });

    test('Initial state is disconnected', () {
      expect(repository.status, BtConnectionStatus.disconnected);
      expect(repository.isConnected, false);
    });

    test('parseNotification updates volume', () {
      final data = <int>[0xc0, 0x00, 0x03, 0x90, 0x00, 0x0f];
      repository.parseNotification(data);
      expect(repository.state.volume, 15);
    });

    test('parseNotification updates bass and treble', () {
      final data = <int>[0xc0, 0x00, 0x04, 0x91, 0x00, 0x12, 0x22];
      repository.parseNotification(data);
      expect(repository.state.bass, 2); // 0x12 - 0x10
      expect(repository.state.treble, 2); // 0x22 - 0x20
    });

    test('stateStream emits updates', () async {
      final states = <PrologyState>[];
      final sub = repository.stateStream.listen((s) => states.add(s));

      repository.parseNotification([0xc0, 0x00, 0x03, 0x90, 0x00, 0x10]);
      await Future.delayed(Duration(milliseconds: 10));
      expect(states, isNotEmpty);

      await sub.cancel();
    });

    test('parseNotification handles unknown type', () {
      final data = <int>[0xc0, 0x00, 0x03, 0xff, 0x00, 0x10]; // Unknown type 0xff
      expect(() => repository.parseNotification(data), returnsNormally);
      expect(repository.state.volume, 0); // Should not change
    });

    test('dispose closes stream', () {
      final repo = BtRepository();
      repo.parseNotification([0xc0, 0x00, 0x03, 0x90, 0x00, 0x05]);
      repo.dispose();
      expect(repo.state.volume, 5); // State still accessible
    });
  });
}
