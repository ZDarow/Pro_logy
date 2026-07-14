import 'dart:async';
import 'package:flutter/foundation.dart';
import 'package:flutter_blue_plus/flutter_blue_plus.dart';
import '../protocol/protocol_parser.dart';
export '../protocol/protocol_parser.dart' show PrologyState;
import '../protocol/legacy_protocol.dart';
import '../transport/abstract_transport.dart';
import '../transport/ble_transport.dart';

/// Версия протокола
enum ProtocolVersion {
  /// v1 — старый: F0 00 LEN A0 10 0E CMD DATA (sum+0x10) — оригинальный APK
  legacy,

  /// v2 — HCI-лог: 6F CMD TYPE LEN DATA XOR 8F — подтверждённый реальный трафик
  hci,
}

enum BtConnectionStatus { disconnected, connecting, connected, error }

class BtRepository {
  // Версия протокола
  final ProtocolVersion protocolVersion;

  /// Транспортный слой (BLE, SPP и т.д.)
  final AbstractTransport transport;

  StreamSubscription? _transportSubscription;
  StreamSubscription? _eventSubscription;

  BtConnectionStatus _status = BtConnectionStatus.disconnected;
  String? _errorMessage;
  final PrologyState _state = PrologyState();
  final StreamController<PrologyState> _stateController =
      StreamController<PrologyState>.broadcast();

  /// Контроллер статуса для внешних наблюдателей (connectionState)
  final StreamController<BtConnectionStatus> _statusController =
      StreamController<BtConnectionStatus>.broadcast();

  Timer? _heartbeatTimer;
  Timer? _reconnectTimer;
  int _missedHeartbeats = 0;
  int _reconnectAttempt = 0;
  bool _reconnecting = false;

  BtRepository({
    this.protocolVersion = ProtocolVersion.hci,
    AbstractTransport? transport,
  }) : transport = transport ?? BleTransport() {
    _stateController.onListen = () {
      _stateController.add(_state);
    };
    _statusController.onListen = () {
      _statusController.add(_status);
    };
  }

  BtConnectionStatus get status => _status;
  String? get errorMessage => _errorMessage;
  bool get isConnected => _status == BtConnectionStatus.connected;
  PrologyState get state => _state;
  Stream<PrologyState> get stateStream => _stateController.stream;

  /// Поток статуса Bluetooth для HomeScreen (BluetoothConnectionState)
  Stream<BluetoothConnectionState> get connectionState {
    return _statusController.stream.map((s) {
      return s == BtConnectionStatus.connected
          ? BluetoothConnectionState.connected
          : BluetoothConnectionState.disconnected;
    });
  }

  // =======================================================================
  // CONNECT / DISCONNECT
  // =======================================================================

  /// Подключиться через транспорт (транспорт сам сканирует или использует
  /// предварительно заданный адрес через [BleTransport.setTargetAddress])
  Future<bool> connect() async {
    _status = BtConnectionStatus.connecting;
    _statusController.add(_status);
    _errorMessage = null;
    _reconnectAttempt = 0;
    _reconnecting = false;

    // Слушаем входящие данные от транспорта
    _transportSubscription?.cancel();
    _transportSubscription = transport.onData.listen(_onTransportData);

    // Слушаем события транспорта
    _eventSubscription?.cancel();
    _eventSubscription = transport.onEvent.listen(_onTransportEvent);

    final ok = await transport.connect();
    if (!ok) {
      _status = BtConnectionStatus.error;
      _errorMessage = transport.errorMessage;
      _statusController.add(_status);
      return false;
    }

    _status = BtConnectionStatus.connected;
    _state.isConnected = true;
    _statusController.add(_status);
    _updateState();
    _missedHeartbeats = 0;
    await _sendInit();
    _startHeartbeat();
    return true;
  }

  void _onTransportEvent(TransportEvent event) {
    debugPrint('BtRepository: transport event -> ${event.type} ${event.message ?? ''}');

    switch (event.type) {
      case TransportEventType.disconnected:
        _handleDisconnect();
      case TransportEventType.error:
        _handleDisconnect();
      case TransportEventType.connected:
        // Уже обрабатывается в connect()
        break;
    }
  }

  void _handleDisconnect() {
    _heartbeatTimer?.cancel();
    _heartbeatTimer = null;
    _status = BtConnectionStatus.disconnected;
    _state.isConnected = false;
    _statusController.add(_status);
    _updateState();

    if (!_reconnecting) {
      _reconnecting = true;
      _reconnectAttempt = 0;
      _tryReconnect();
    }
  }

  Future<void> _tryReconnect() async {
    const maxAttempts = 3;
    _scheduleReconnect(maxAttempts);
  }

  void _scheduleReconnect(int maxAttempts) {
    if (!_reconnecting || _reconnectAttempt >= maxAttempts) {
      _reconnecting = false;
      _status = BtConnectionStatus.error;
      _errorMessage = 'Reconnect failed after $maxAttempts attempts';
      if (!_statusController.isClosed) {
        _statusController.add(_status);
      }
      debugPrint('BtRepository: $_errorMessage');
      return;
    }

    _reconnectAttempt++;
    final delay = Duration(seconds: 1 * (1 << (_reconnectAttempt - 1)));
    debugPrint('BtRepository: reconnect attempt $_reconnectAttempt/$maxAttempts in ${delay.inSeconds}s');

    _reconnectTimer?.cancel();
    _reconnectTimer = Timer(delay, () async {
      if (!_reconnecting) return;

      _status = BtConnectionStatus.connecting;
      if (!_statusController.isClosed) {
        _statusController.add(_status);
      }

      final ok = await transport.connect();
      if (ok) {
        _reconnecting = false;
        _reconnectAttempt = 0;
        _status = BtConnectionStatus.connected;
        _state.isConnected = true;
        if (!_statusController.isClosed) {
          _statusController.add(_status);
        }
        _updateState();
        _missedHeartbeats = 0;
        await _sendInit();
        _startHeartbeat();
        debugPrint('BtRepository: reconnected on attempt $_reconnectAttempt');
      } else {
        debugPrint('BtRepository: reconnect attempt $_reconnectAttempt failed');
        _scheduleReconnect(maxAttempts);
      }
    });
  }

  /// Подключиться к BLE-устройству по MAC-адресу
  Future<bool> connectToAddress(String remoteId) async {
    if (transport is BleTransport) {
      (transport as BleTransport).setTargetAddress(remoteId);
    }
    return connect();
  }

  Future<void> disconnect() async {
    _reconnecting = false;
    _reconnectTimer?.cancel();
    _reconnectTimer = null;
    _heartbeatTimer?.cancel();
    _heartbeatTimer = null;
    _transportSubscription?.cancel();
    _transportSubscription = null;
    _eventSubscription?.cancel();
    _eventSubscription = null;
    await transport.disconnect();
    _status = BtConnectionStatus.disconnected;
    _state.isConnected = false;
    _statusController.add(_status);
    _updateState();
  }

  void _onTransportData(List<int> data) {
    debugPrint(
        'RX (${data.length}B): ${data.map((b) => b.toRadixString(16).padLeft(2, '0')).join(' ')}');
    parseNotification(data);
  }

  void _updateState() {
    _stateController.add(_state);
  }

  void dispose() {
    _reconnecting = false;
    _reconnectTimer?.cancel();
    _reconnectTimer = null;
    _heartbeatTimer?.cancel();
    _transportSubscription?.cancel();
    _eventSubscription?.cancel();
    transport.dispose();
    _stateController.close();
    _statusController.close();
    debugPrint('BtRepository disposed');
  }

  // =======================================================================
  // HEARTBEAT
  // =======================================================================

  void _startHeartbeat() {
    _missedHeartbeats = 0;
    _heartbeatTimer?.cancel();
    _heartbeatTimer = Timer.periodic(const Duration(seconds: 10), (_) {
      if (protocolVersion == ProtocolVersion.hci) {
        sendCommand(ProtocolParser.buildHeartbeat());
        _missedHeartbeats++;
        if (_missedHeartbeats >= 3) {
          debugPrint('BtRepository: 3 missed heartbeats, initiating reconnect');
          _handleDisconnect();
        }
      }
    });
  }

  // =======================================================================
  // INIT + SEND
  // =======================================================================

  Future<void> _sendInit() async {
    switch (protocolVersion) {
      case ProtocolVersion.hci:
        await sendCommand(ProtocolParser.buildDeviceInfo());
        await Future.delayed(const Duration(milliseconds: 100));
        await sendCommand(ProtocolParser.buildEqSettings());
        await Future.delayed(const Duration(milliseconds: 100));
        await sendCommand(ProtocolParser.buildXoverRequest());
        break;

      case ProtocolVersion.legacy:
        await sendCommand(LegacyProtocolBuilder.buildInit());
        break;
    }
  }

  Future<bool> sendCommand(List<int> data, {int retries = 2}) async {
    if (!transport.isConnected) {
      _errorMessage = 'Not connected';
      return false;
    }

    for (int attempt = 0; attempt < retries; attempt++) {
      try {
        final ok = await transport.send(data);
        if (ok) {
          debugPrint(
              'TX: ${data.map((b) => b.toRadixString(16).padLeft(2, '0')).join(' ')}');
          return true;
        }
      } catch (e) {
        if (attempt == retries - 1) {
          _errorMessage = 'Failed to send: $e';
          return false;
        }
        await Future.delayed(Duration(milliseconds: 100 * (attempt + 1)));
      }
    }
    return false;
  }

  // =======================================================================
  // VOLUME (CMD 0x0F, range 0-100)
  // =======================================================================

  Future<bool> volumeUp() async {
    final newVol = (_state.volume + 5).clamp(0, 100);
    return volumeSet(newVol);
  }

  Future<bool> volumeDown() async {
    final newVol = (_state.volume - 5).clamp(0, 100);
    return volumeSet(newVol);
  }

  Future<bool> volumeSet(int value) async {
    final clamped = value.clamp(0, 100);
    final cmd = switch (protocolVersion) {
      ProtocolVersion.hci => ProtocolParser.buildVolumeSet(clamped),
      ProtocolVersion.legacy => LegacyProtocolBuilder.buildVolumeSet(clamped),
    };
    final result = await sendCommand(cmd);
    if (result) {
      _state.volume = clamped;
      _updateState();
    }
    return result;
  }

  // =======================================================================
  // BASS / TREBLE (CMD 0x08, type 0x01/0x02, range 0-100)
  // =======================================================================

  Future<bool> setBass(int value) async {
    final clamped = value.clamp(0, 100);
    final cmd = switch (protocolVersion) {
      ProtocolVersion.hci => ProtocolParser.buildBassSet(clamped),
      ProtocolVersion.legacy => LegacyProtocolBuilder.buildBassSet(clamped),
    };
    final result = await sendCommand(cmd);
    if (result) {
      _state.bass = clamped;
      _updateState();
    }
    return result;
  }

  Future<bool> setTreble(int value) async {
    final clamped = value.clamp(0, 100);
    final cmd = switch (protocolVersion) {
      ProtocolVersion.hci => ProtocolParser.buildTrebleSet(clamped),
      ProtocolVersion.legacy => LegacyProtocolBuilder.buildTrebleSet(clamped),
    };
    final result = await sendCommand(cmd);
    if (result) {
      _state.treble = clamped;
      _updateState();
    }
    return result;
  }

  // =======================================================================
  // BALANCE / FADER
  // =======================================================================

  Future<bool> setBalance(int value) async {
    final clamped = value.clamp(-10, 10);
    final cmd = switch (protocolVersion) {
      ProtocolVersion.hci => ProtocolParser.buildBalance(clamped),
      ProtocolVersion.legacy => LegacyProtocolBuilder.buildBalance(clamped),
    };
    final result = await sendCommand(cmd);
    if (result) {
      _state.balance = clamped;
      _updateState();
    }
    return result;
  }

  Future<bool> setFader(int value) async {
    final clamped = value.clamp(-10, 10);
    final cmd = switch (protocolVersion) {
      ProtocolVersion.hci => ProtocolParser.buildFader(clamped),
      ProtocolVersion.legacy => LegacyProtocolBuilder.buildFader(clamped),
    };
    final result = await sendCommand(cmd);
    if (result) {
      _state.fader = clamped;
      _updateState();
    }
    return result;
  }

  Future<bool> setEqPreset(int preset) async {
    final cmd = switch (protocolVersion) {
      ProtocolVersion.hci => ProtocolParser.buildEqPreset(preset),
      ProtocolVersion.legacy => LegacyProtocolBuilder.buildEqPreset(preset),
    };
    final result = await sendCommand(cmd);
    if (result) {
      _state.eqPreset = preset;
      _updateState();
    }
    return result;
  }

  // =======================================================================
  // INPUT SOURCE SELECTION
  // =======================================================================

  Future<bool> setInput(String input) async {
    final cmd = switch (protocolVersion) {
      ProtocolVersion.hci => ProtocolParser.buildInputSelect(_inputToCode(input)),
      ProtocolVersion.legacy => LegacyProtocolBuilder.buildInputSelect(input),
    };
    final result = await sendCommand(cmd);
    if (result) {
      _state.inputSource = input.toUpperCase();
      _updateState();
    }
    return result;
  }

  int _inputToCode(String input) {
    switch (input.toUpperCase()) {
      case 'RADIO': return 0x01;
      case 'USB': return 0x02;
      case 'SD': return 0x03;
      case 'BT': return 0x04;
      case 'AUX': return 0x05;
      case 'DISC': return 0x06;
      case 'GPS': return 0x07;
      case 'SXM': return 0x08;
      case 'AVIN':
      case 'AV IN': return 0x09;
      default: return 0x01;
    }
  }

  // =======================================================================
  // PLAYBACK
  // =======================================================================

  Future<bool> playPause() async {
    final cmd = switch (protocolVersion) {
      ProtocolVersion.hci => ProtocolParser.buildPlayPause(),
      ProtocolVersion.legacy => LegacyProtocolBuilder.buildPlayPause(),
    };
    return sendCommand(cmd);
  }

  Future<bool> nextTrack() async {
    final cmd = switch (protocolVersion) {
      ProtocolVersion.hci => ProtocolParser.buildNextTrack(),
      ProtocolVersion.legacy => LegacyProtocolBuilder.buildNextTrack(),
    };
    return sendCommand(cmd);
  }

  Future<bool> prevTrack() async {
    final cmd = switch (protocolVersion) {
      ProtocolVersion.hci => ProtocolParser.buildPrevTrack(),
      ProtocolVersion.legacy => LegacyProtocolBuilder.buildPrevTrack(),
    };
    return sendCommand(cmd);
  }

  // =======================================================================
  // RADIO
  // =======================================================================

  Future<bool> radioSeekUp() async {
    final cmd = switch (protocolVersion) {
      ProtocolVersion.hci => ProtocolParser.buildRadioSeekUp(),
      ProtocolVersion.legacy => LegacyProtocolBuilder.buildRadioSeekUp(),
    };
    return sendCommand(cmd);
  }

  Future<bool> radioSeekDown() async {
    final cmd = switch (protocolVersion) {
      ProtocolVersion.hci => ProtocolParser.buildRadioSeekDown(),
      ProtocolVersion.legacy => LegacyProtocolBuilder.buildRadioSeekDown(),
    };
    return sendCommand(cmd);
  }

  Future<bool> radioSetFreq(double freq, bool isFm) async {
    final cmd = switch (protocolVersion) {
      ProtocolVersion.hci => ProtocolParser.buildRadioSetFreq(freq, isFm),
      ProtocolVersion.legacy => LegacyProtocolBuilder.buildRadioSetFreq(freq, isFm),
    };
    return sendCommand(cmd);
  }

  // =======================================================================
  // EXTENDED DSP — общие для HCI и legacy через switch
  // =======================================================================

  Future<bool> setXoverHpf(int ch, int freq, int gain, int slope, int type) async {
    final cmd = switch (protocolVersion) {
      ProtocolVersion.hci => ProtocolParser.buildXoverHpf(ch, freq, gain, slope, type),
      ProtocolVersion.legacy => LegacyProtocolBuilder.buildXOver(type: type, freq: freq),
    };
    return sendCommand(cmd);
  }

  Future<bool> setXoverLpf(int ch, int freq, int gain, int slope, int type) async {
    final cmd = switch (protocolVersion) {
      ProtocolVersion.hci => ProtocolParser.buildXoverLpf(ch, freq, gain, slope, type),
      ProtocolVersion.legacy => LegacyProtocolBuilder.buildXOver(type: type, freq: freq),
    };
    return sendCommand(cmd);
  }

  Future<bool> setTimeAlignment(int channel, int delayMs) async {
    final cmd = switch (protocolVersion) {
      ProtocolVersion.hci => ProtocolParser.buildTimeAlignment(channel, delayMs),
      ProtocolVersion.legacy => LegacyProtocolBuilder.buildEqPlus(band: channel, gain: delayMs),
    };
    return sendCommand(cmd);
  }

  Future<bool> setMuteChannel(int channel, bool mute) async {
    final cmd = switch (protocolVersion) {
      ProtocolVersion.hci => ProtocolParser.buildMuteChannel(channel, mute),
      ProtocolVersion.legacy => _buildLegacyPlacholder('mute_ch_$channel'),
    };
    return sendCommand(cmd);
  }

  Future<bool> setSubwooferVolume(int volume) async {
    final cmd = switch (protocolVersion) {
      ProtocolVersion.hci => ProtocolParser.buildSubwooferVolume(volume),
      ProtocolVersion.legacy => LegacyProtocolBuilder.buildSubwoofer(level: volume),
    };
    return sendCommand(cmd);
  }

  Future<bool> setBassBoost(bool enabled, int level) async {
    final cmd = switch (protocolVersion) {
      ProtocolVersion.hci => ProtocolParser.buildBassBoost(enabled, level),
      ProtocolVersion.legacy => LegacyProtocolBuilder.buildLoudness(enabled, level: level),
    };
    return sendCommand(cmd);
  }

  Future<bool> setEqBandGain(int band, int gainDb) async {
    final cmd = switch (protocolVersion) {
      ProtocolVersion.hci => ProtocolParser.buildEqGain(band, gainDb),
      ProtocolVersion.legacy => LegacyProtocolBuilder.buildEqPlus(band: band, gain: gainDb),
    };
    return sendCommand(cmd);
  }

  Future<bool> getStatus() async {
    final cmd = switch (protocolVersion) {
      ProtocolVersion.hci => ProtocolParser.buildGetStatus(),
      ProtocolVersion.legacy => _buildLegacyPlacholder('get_status'),
    };
    return sendCommand(cmd);
  }

  // =======================================================================
  // LEGACY EXTENDED SETTINGS (только legacy)
  // =======================================================================

  Future<bool> setLoudness(bool enabled, {int level = 0, int freq = 0}) async {
    final cmd = switch (protocolVersion) {
      ProtocolVersion.hci => ProtocolParser.buildLoudness(enabled, level: level, freq: freq),
      ProtocolVersion.legacy => LegacyProtocolBuilder.buildLoudness(enabled, level: level, freq: freq),
    };
    return sendCommand(cmd);
  }

  Future<bool> setSubwoofer({int level = 0, int freq = 0, int phase = 0}) async {
    final cmd = switch (protocolVersion) {
      ProtocolVersion.hci => ProtocolParser.buildSubwooferCfg(level: level, freq: freq, phase: phase),
      ProtocolVersion.legacy => LegacyProtocolBuilder.buildSubwoofer(level: level, freq: freq, phase: phase),
    };
    return sendCommand(cmd);
  }

  Future<bool> setXOver({int type = 0, int freq = 0}) async {
    final cmd = switch (protocolVersion) {
      ProtocolVersion.hci => ProtocolParser.buildXoverCfg(type: type, freq: freq),
      ProtocolVersion.legacy => LegacyProtocolBuilder.buildXOver(type: type, freq: freq),
    };
    return sendCommand(cmd);
  }

  Future<bool> setEqPlus({int band = 0, int freq = 0, int gain = 0, int q = 0}) async {
    final cmd = switch (protocolVersion) {
      ProtocolVersion.hci => ProtocolParser.buildEqPlusCfg(band: band, freq: freq, gain: gain, q: q),
      ProtocolVersion.legacy => LegacyProtocolBuilder.buildEqPlus(band: band, freq: freq, gain: gain, q: q),
    };
    return sendCommand(cmd);
  }

  /// Заглушка для legacy-команд, у которых нет прямого аналога
  List<int> _buildLegacyPlacholder(String hint) {
    debugPrint('Legacy placeholder: $hint — no legacy equivalent, sending as debug');
    // Отправляем безвредный запрос getStatus в legacy-формате
    return LegacyProtocolBuilder.buildInit();
  }

  // =======================================================================
  // NOTIFICATION PARSING
  // =======================================================================

  void parseNotification(List<int> data) {
    if (data.isEmpty) return;

    // Формат v2 (6F...8F)
    if (data.first == 0x6f && data.last == 0x8f) {
      _parseHciNotification(data);
      return;
    }

    // Формат v1 (C0 00 ...)
    if (data.first == 0xC0) {
      final changed = LegacyProtocolBuilder.parseLegacyNotification(data, _state);
      if (changed) _updateState();
      return;
    }

    debugPrint('Unknown notification format: ${data.first.toRadixString(16)}');
  }

  void _parseHciNotification(List<int> raw) {
    final pkt = ProtocolParser.parse(raw);
    if (pkt == null) {
      debugPrint('Failed to parse HCI notification');
      return;
    }

    _missedHeartbeats = 0;

    bool stateChanged = false;

    switch (pkt.cmd) {
      case 0x0f: // VOLUME response
        final vol = ProtocolParser.parseVolumeResponse(pkt);
        if (vol != null) {
          _state.volume = vol.clamp(0, 100);
          stateChanged = true;
        }
        break;

      case 0x08: // BASS_TREBLE response
        final val = ProtocolParser.parseBassTrebleResponse(pkt);
        if (val != null) {
          if (pkt.data.length >= 3) {
            final type = pkt.data[1];
            if (type == 0x01) {
              _state.bass = val.clamp(0, 100);
            } else if (type == 0x02) {
              _state.treble = val.clamp(0, 100);
            }
            stateChanged = true;
          }
        }
        break;

      case 0x93: // DEVICE_INFO response
        final serial = ProtocolParser.parseDeviceInfoResponse(pkt);
        if (serial != null) {
          _state.deviceSerial = serial;
          debugPrint('Device serial: $serial');
          stateChanged = true;
        }
        break;

      case 0x03: // XOVER response → device model
        if (pkt.isResponse && pkt.data.length >= 5) {
          final modelBytes = pkt.data.sublist(2);
          final model = String.fromCharCodes(modelBytes).trim();
          if (model.isNotEmpty) {
            _state.deviceModel = model;
            debugPrint('Device model: $model');
            stateChanged = true;
          }
        }
        break;

      case 0x43: // EQ_SETTINGS
        if (pkt.isResponse && pkt.data.length >= 3) {
          _state.eqPreset = pkt.data[2];
          stateChanged = true;
        }
        break;

      case 0x11: // SUBWOOFER response → firmware string
        if (pkt.isResponse && pkt.data.length >= 4) {
          final fwBytes = pkt.data.sublist(2);
          final fw = String.fromCharCodes(fwBytes).trim();
          if (fw.isNotEmpty) {
            _state.deviceFirmware = fw;
            debugPrint('Device firmware: $fw');
            stateChanged = true;
          }
        }
        break;
    }

    if (stateChanged) {
      _updateState();
    }
  }
}
