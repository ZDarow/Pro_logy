import 'package:flutter_test/flutter_test.dart';
import 'package:prology/data/protocol/protocol_parser.dart';
import 'package:prology/data/repositories/bt_repository.dart';

void main() {
  group('ProtocolParser', () {
    test('buildVolumeSet creates correct packet', () {
      final packet = ProtocolParser.buildVolumeSet(50);
      expect(packet.first, 0x6f);
      expect(packet.last, 0x8f);
      expect(packet[1], 0x0f); // CMD VOLUME
      expect(packet[2], 0x70); // TYPE request
      expect(packet[3], 2); // LEN = 2 (0x00, level)
      expect(packet[4], 0x00);
      expect(packet[5], 50);
    });

    test('buildBassSet creates correct packet', () {
      final packet = ProtocolParser.buildBassSet(70);
      expect(packet[1], 0x08); // CMD BASS_TREBLE
      expect(packet[2], 0x70);
      expect(packet[3], 3); // LEN
      expect(packet[4], 0x00);
      expect(packet[5], 0x01); // TYPE=bass
      expect(packet[6], 70);
    });

    test('buildTrebleSet creates correct packet', () {
      final packet = ProtocolParser.buildTrebleSet(60);
      expect(packet[5], 0x02); // TYPE=treble
      expect(packet[6], 60);
    });

    test('buildEqPreset creates correct packet', () {
      final packet = ProtocolParser.buildEqPreset(3); // ROCK
      expect(packet[1], 0x01); // CMD EQ_PRESET
      expect(packet[4], 0x00);
      expect(packet[5], 3); // presetId
    });

    test('buildDeviceInfo creates correct packet', () {
      final packet = ProtocolParser.buildDeviceInfo();
      expect(packet[1], 0x93); // CMD DEVICE_INFO
      expect(packet[2], 0x70);
      expect(packet[3], 2);
    });

    test('checksum is XOR of all data bytes', () {
      final packet = ProtocolParser.buildVolumeSet(50);
      // CS = XOR[0x6f, 0x0f, 0x70, 0x02, 0x00, 0x32]
      final csIndex = packet.length - 2;
      final calculated = packet.sublist(0, csIndex).fold<int>(0, (p, b) => p ^ b);
      expect(packet[csIndex], calculated);
    });

    test('buildXoverHpf creates correct packet', () {
      final packet = ProtocolParser.buildXoverHpf(1, 80, 0, 2, 0);
      expect(packet[1], 0x20); // CMD XOVER_HPF
      expect(packet[4], 1); // ch
      expect(packet[5], 80); // freq
      expect(packet[6], 12); // gain+12
      expect(packet[7], 2); // slope
      expect(packet[8], 0); // type
    });

    test('buildTimeAlignment creates correct packet', () {
      final packet = ProtocolParser.buildTimeAlignment(1, 50);
      expect(packet[1], 0x30); // CMD TIME_ALIGNMENT
      expect(packet[4], 1); // channel
      expect(packet[5], 50); // delay
    });

    test('buildMuteChannel creates correct packet', () {
      final packet = ProtocolParser.buildMuteChannel(2, true);
      expect(packet[1], 0x40); // CMD MUTE
      expect(packet[4], 2);
      expect(packet[5], 1); // muted
    });

    test('buildBassBoost creates correct packet', () {
      final packet = ProtocolParser.buildBassBoost(true, 80);
      expect(packet[1], 0x14);
      expect(packet[4], 1); // enabled
      expect(packet[5], 80); // level
    });

    test('buildEqGain creates correct packet', () {
      final packet = ProtocolParser.buildEqGain(5, 3); // band 5, +3dB
      expect(packet[1], 0x02); // CMD EQ_GAIN
      expect(packet[4], 5); // band
      expect(packet[5], 15); // 3+12=15
    });

    test('buildHeartbeat creates correct packet', () {
      final packet = ProtocolParser.buildHeartbeat();
      expect(packet[1], 0x04);
    });

    test('buildGetStatus creates correct packet', () {
      final packet = ProtocolParser.buildGetStatus();
      expect(packet[1], 0x70);
    });

    test('parse valid HCI notification', () {
      // Volume response: 6f 0f 80 03 00 01 32 CS 8f
      final data = <int>[0x6f, 0x0f, 0x80, 0x03, 0x00, 0x01, 0x32];
      final cs = data.fold<int>(0, (p, b) => p ^ b);
      data.addAll([cs, 0x8f]);

      final pkt = ProtocolParser.parse(data);
      expect(pkt, isNotNull);
      expect(pkt!.cmd, 0x0f);
      expect(pkt.type, 0x80);
      expect(pkt.isResponse, true);
      expect(pkt.length, 3);

      // Проверка parseVolumeResponse
      final vol = ProtocolParser.parseVolumeResponse(pkt);
      expect(vol, 0x32); // volume = 50
    });

    test('parse returns null for invalid packet', () {
      expect(ProtocolParser.parse([0x00, 0x01, 0x02]), isNull); // too short
      expect(ProtocolParser.parse([0x6f, 0x01, 0x02]), isNull); // no end
      expect(ProtocolParser.parse([0x00, 0x01, 0x02, 0x03, 0x04, 0x8f]), isNull); // no sync
    });

    test('parse Device Info response', () {
      // 6f 93 80 0A 00 08 31 32 33 34 35 36 37 38 CS 8f
      // serial = "12345678", data=[0x00, 0x08, '1','2','3','4','5','6','7','8'] = 10 bytes = 0x0A
      final data = <int>[0x6f, 0x93, 0x80, 0x0A, 0x00, 0x08, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38];
      final cs = data.fold<int>(0, (p, b) => p ^ b);
      data.addAll([cs, 0x8f]);

      final pkt = ProtocolParser.parse(data);
      expect(pkt, isNotNull);
      expect(pkt!.cmd, 0x93);

      final serial = ProtocolParser.parseDeviceInfoResponse(pkt);
      expect(serial, '12345678');
    });
  });

  group('BtRepository', () {
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

    test('state fields have correct defaults', () {
      expect(repository.state.volume, 0);
      expect(repository.state.bass, 0);
      expect(repository.state.treble, 0);
      expect(repository.state.deviceSerial, '');
      expect(repository.state.deviceModel, '');
      expect(repository.state.deviceFirmware, '');
    });

    test('stateStream emits initial state on listen', () async {
      final states = <PrologyState>[];
      final sub = repository.stateStream.listen((s) => states.add(s));

      // onListen fires immediately on first listen, but event delivery is async
      await Future.microtask(() {}); // let the stream event through

      expect(states.length, 1); // initial state emitted via onListen
      expect(states[0].volume, 0);

      await sub.cancel();
    });

    test('parseNotification handles HCI volume notification', () {
      // Build HCI volume response: 6f 0f 80 03 00 01 32 CS 8f
      final data = <int>[0x6f, 0x0f, 0x80, 0x03, 0x00, 0x01, 0x32];
      final cs = data.fold<int>(0, (p, b) => p ^ b);
      data.addAll([cs, 0x8f]);

      repository.parseNotification(data);
      expect(repository.state.volume, 50); // 0x32 = 50
    });

    test('parseNotification handles HCI bass notification', () {
      // Bass response: 6f 08 80 03 00 01 46 CS 8f
      final data = <int>[0x6f, 0x08, 0x80, 0x03, 0x00, 0x01, 0x46];
      final cs = data.fold<int>(0, (p, b) => p ^ b);
      data.addAll([cs, 0x8f]);

      repository.parseNotification(data);
      expect(repository.state.bass, 70); // 0x46 = 70
    });

    test('parseNotification handles HCI treble notification', () {
      // Treble response: 6f 08 80 03 00 02 3C CS 8f
      final data = <int>[0x6f, 0x08, 0x80, 0x03, 0x00, 0x02, 0x3c];
      final cs = data.fold<int>(0, (p, b) => p ^ b);
      data.addAll([cs, 0x8f]);

      repository.parseNotification(data);
      expect(repository.state.treble, 60); // 0x3c = 60
    });

    test('parseNotification handles HCI device info notification', () {
      // Device info: 6f 93 80 12 00 10 d1 72 75 48 1d d8 79 36 CS 8f
      // serial = "d17275481dd87936" (16 bytes), data = [0x00, 0x10, 16 serial bytes] = 18 = 0x12
      final serial = 'd17275481dd87936';
      final serialBytes = serial.codeUnits;
      final data = <int>[0x6f, 0x93, 0x80, 0x12, 0x00, 0x10, ...serialBytes];
      final cs = data.fold<int>(0, (p, b) => p ^ b);
      data.addAll([cs, 0x8f]);

      repository.parseNotification(data);
      expect(repository.state.deviceSerial, serial);
    });

    test('parseNotification handles unknown notification', () {
      final data = <int>[0x6f, 0xff, 0x80, 0x01, 0x00];
      final cs = data.fold<int>(0, (p, b) => p ^ b);
      data.addAll([cs, 0x8f]);
      expect(() => repository.parseNotification(data), returnsNormally);
    });

    test('parseNotification handles empty data', () {
      expect(() => repository.parseNotification([]), returnsNormally);
    });

    test('dispose closes stream', () {
      final repo = BtRepository();
      repo.dispose();
      expect(repo.state.volume, 0); // State still accessible
    });

    test('sendCommand returns false when not connected', () async {
      final result = await repository.sendCommand(ProtocolParser.buildVolumeSet(50));
      expect(result, false);
    });

    // Legacy format parsing (backward compatibility)
    test('parseNotification handles legacy format', () {
      // Legacy volume: C0 00 03 90 0f CS (sum+0x40)
      // sum(0x03, 0x90, 0x0f) = 0xA2, +0x40 = 0xE2
      final data = <int>[0xc0, 0x00, 0x03, 0x90, 0x0f, 0xE2];
      repository.parseNotification(data);
      expect(repository.state.volume, 15);
    });
  });
}
