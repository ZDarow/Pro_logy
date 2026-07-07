enum EQPreset {
  flat(0x00, 'FLAT'),
  rock(0x03, 'ROCK'),
  pop(0x04, 'POP'),
  jazz(0x09, 'JAZZ'),
  classic(0x0A, 'CLASSIC'),
  user1(0x05, 'USER1'),
  user2(0x06, 'USER2');

  final int value;
  final String name;
  const EQPreset(this.value, this.name);
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
    );
  }
}
