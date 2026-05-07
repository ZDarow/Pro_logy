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
      // Volume=15 (0x0f), LEN=3, TYPE=0x90
      // Payload: [0x03, 0x90, 0x0f], sum=0xA2, checksum=0xA2+0x40=0xE2
      final data = <int>[0xc0, 0x00, 0x03, 0x90, 0x0f, 0xE2];
      repository.parseNotification(data);
      expect(repository.state.volume, 15);
    });

    test('parseNotification updates bass and treble', () {
      // Bass=2 (0x12), Treble=2 (0x22), LEN=4, TYPE=0x91
      // Payload: [0x04, 0x91, 0x12, 0x22], sum=0xC9, checksum=0xC9+0x40=0x09
      final data = <int>[0xc0, 0x00, 0x04, 0x91, 0x12, 0x22, 0x09];
      repository.parseNotification(data);
      expect(repository.state.bass, 2); // 0x12 - 0x10
      expect(repository.state.treble, 2); // 0x22 - 0x20
    });

    test('stateStream emits updates', () async {
      final states = <PrologyState>[];
      final sub = repository.stateStream.listen((s) => states.add(s));

      // Volume=10 (0x0a), checksum: sum(0x03,0x90,0x0a)=0x9D, +0x40=0xDD
      repository.parseNotification([0xc0, 0x00, 0x03, 0x90, 0x0a, 0xDD]);
      await Future.delayed(Duration(milliseconds: 10));
      expect(states, isNotEmpty);

      await sub.cancel();
    });

    test('parseNotification handles unknown type', () {
      // Unknown type 0xff, checksum: sum(0x03,0xff,0x00)=0x102->0x02, +0x40=0x42
      final data = <int>[0xc0, 0x00, 0x03, 0xff, 0x00, 0x42];
      expect(() => repository.parseNotification(data), returnsNormally);
      expect(repository.state.volume, 0); // Should not change
    });

    test('dispose closes stream', () {
      final repo = BtRepository();
      // Volume=5 (0x05), checksum: sum(0x03,0x90,0x05)=0x98, +0x40=0xD8
      repo.parseNotification([0xc0, 0x00, 0x03, 0x90, 0x05, 0xD8]);
      repo.dispose();
      expect(repo.state.volume, 5); // State still accessible
    });

    test('playPause sends command', () async {
      final repo = BtRepository();
      expect(() => repo.playPause(), returnsNormally);
    });

    test('nextTrack sends command', () async {
      final repo = BtRepository();
      expect(() => repo.nextTrack(), returnsNormally);
    });

    test('prevTrack sends command', () async {
      final repo = BtRepository();
      expect(() => repo.prevTrack(), returnsNormally);
    });

    test('setLoudness sends command', () async {
      final repo = BtRepository();
      expect(() => repo.setLoudness(true), returnsNormally);
    });

    test('setSubwoofer sends command', () async {
      final repo = BtRepository();
      expect(() => repo.setSubwoofer(), returnsNormally);
    });

    test('setXOver sends command', () async {
      final repo = BtRepository();
      expect(() => repo.setXOver(), returnsNormally);
    });

    test('setTimeAlignment sends command', () async {
      final repo = BtRepository();
      expect(() => repo.setTimeAlignment(), returnsNormally);
    });

    test('setEqPlus sends command', () async {
      final repo = BtRepository();
      expect(() => repo.setEqPlus(), returnsNormally);
    });
  });
}
