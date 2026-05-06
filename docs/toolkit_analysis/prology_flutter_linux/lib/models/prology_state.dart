enum EQPreset {
  flat(0x00, 'FLAT'),
  rock(0x03, 'ROCK'),
  pop(0x04, 'POP'),
  jazz(0x09, 'JAZZ'),
  classic(0x0A, 'CLASSIC'),
  user1(0x05, 'USER1'),
  user2(0x06, 'USER2');

  final int subtype;
  final String name;
  const EQPreset(this.subtype, this.name);
}

enum InputSource {
  usb(0, 'USB'),
  sd(1, 'SD'),
  bluetooth(2, 'BLUETOOTH'),
  aux(3, 'AUX'),
  radio(4, 'RADIO');

  final int value;
  final String name;
  const InputSource(this.value, this.name);
}

enum XOverType {
  hpf(0, 'HPF'),
  lpf(1, 'LPF'),
  bpf(2, 'BPF'),
  apf(3, 'APF');

  final int value;
  final String name;
  const XOverType(this.value, this.name);
}

class EQCurve {
  String name;
  List<int> values; // 10 bands: 31Hz, 62Hz, 125Hz, 250Hz, 500Hz, 1kHz, 2kHz, 4kHz, 8kHz, 16kHz
  EQCurve(this.name, this.values);
}

class XOverItem {
  int channel;
  int freq;
  int gain;
  int slope;
  XOverType type;
  XOverItem({
    this.channel = 0,
    this.freq = 80,
    this.gain = 0,
    this.slope = 0,
    this.type = XOverType.hpf,
  });
}

class TimeAlignmentItem {
  int channel;
  int delay;
  TimeAlignmentItem({this.channel = 0, this.delay = 0});
}

class PrologyState {
  int volume;
  bool muted;
  EQPreset eqPreset;
  int balance;
  int fader;
  int bass;
  int treble;
  InputSource input;
  bool connected;
  String deviceAddress;
  List<int> eqBands; // 25 bands (full DSP)
  List<EQCurve> eqCurves; // 10-band curves
  int selectedCurve;
  List<XOverItem> xOverItems;
  List<TimeAlignmentItem> timeAlignmentItems;
  bool bassBoostEnabled;
  int bassBoostLevel;
  int subwooferVolume;

  PrologyState({
    this.volume = 10,
    this.muted = false,
    this.eqPreset = EQPreset.flat,
    this.balance = 0,
    this.fader = 0,
    this.bass = 0,
    this.treble = 0,
    this.input = InputSource.bluetooth,
    this.connected = false,
    this.deviceAddress = '',
    this.eqBands = const [],
    this.eqCurves = const [
      EQCurve('FLAT', [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]), // 0x08
      EQCurve('ROCK', [4, 1, 0, 2, 6, 3, 0, 0, 2, 2]), // 0x03
      EQCurve('POP', [1, 1, 2, 2, 2, 1, 1, 2, 2, 2]), // 0x04
      EQCurve('JAZZ', [1, 1, 0, 0, -1, 0, 0, 1, 2, 3]), // 0x09
      EQCurve('CLASSIC', [3, 1, -1, 0, 2, 2, 1, 0, 0, 3]), // 0x0A
    ],
    this.selectedCurve = 0,
    this.xOverItems = const [],
    this.timeAlignmentItems = const [],
    this.bassBoostEnabled = false,
    this.bassBoostLevel = 0,
    this.subwooferVolume = 0,
  });

  PrologyState copyWith({
    int? volume,
    bool? muted,
    EQPreset? eqPreset,
    int? balance,
    int? fader,
    int? bass,
    int? treble,
    InputSource? input,
    bool? connected,
    String? deviceAddress,
    List<int>? eqBands,
    List<EQCurve>? eqCurves,
    int? selectedCurve,
    List<XOverItem>? xOverItems,
    List<TimeAlignmentItem>? timeAlignmentItems,
    bool? bassBoostEnabled,
    int? bassBoostLevel,
    int? subwooferVolume,
  }) {
    return PrologyState(
      volume: volume ?? this.volume,
      muted: muted ?? this.muted,
      eqPreset: eqPreset ?? this.eqPreset,
      balance: balance ?? this.balance,
      fader: fader ?? this.fader,
      bass: bass ?? this.bass,
      treble: treble ?? this.treble,
      input: input ?? this.input,
      connected: connected ?? this.connected,
      deviceAddress: deviceAddress ?? this.deviceAddress,
      eqBands: eqBands ?? List.from(this.eqBands),
      eqCurves: eqCurves ?? List.from(this.eqCurves),
      selectedCurve: selectedCurve ?? this.selectedCurve,
      xOverItems: xOverItems ?? List.from(this.xOverItems),
      timeAlignmentItems: timeAlignmentItems ?? List.from(this.timeAlignmentItems),
      bassBoostEnabled: bassBoostEnabled ?? this.bassBoostEnabled,
      bassBoostLevel: bassBoostLevel ?? this.bassBoostLevel,
      subwooferVolume: subwooferVolume ?? this.subwooferVolume,
    );
  }
}
