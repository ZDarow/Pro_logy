import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:flutter_blue_plus/flutter_blue_plus.dart';
import 'package:prology_linux/models/prology_state.dart';
import 'package:prology_linux/services/ble_service.dart';

class HomeScreen extends StatefulWidget {
  const HomeScreen({super.key});

  @override
  _HomeScreenState createState() => _HomeScreenState();
}

class _HomeScreenState extends State<HomeScreen> {
  int _selectedIndex = 0;

  final List<Widget> _screens = [
    const _MainControlTab(),
    const _EQTab(),
    const _XOverTab(),
    const _TimeAlignmentTab(),
    const _BassBoostTab(),
  ];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('PROLOGY Controller'),
        actions: [
          IconButton(
            icon: Icon(Provider.of<BleService>(context).currentState.connected
                ? Icons.bluetooth_connected
                : Icons.bluetooth),
            onPressed: () => _showDeviceList(context),
          ),
        ],
      ),
      body: _screens[_selectedIndex],
      bottomNavigationBar: BottomNavigationBar(
        currentIndex: _selectedIndex,
        onTap: (index) => setState(() => _selectedIndex = index),
        items: const [
          BottomNavigationBarItem(
            icon: Icon(Icons.home),
            label: 'Main',
          ),
          BottomNavigationBarItem(
            icon: Icon(Icons.equalizer),
            label: 'EQ',
          ),
          BottomNavigationBarItem(
            icon: Icon(Icons.filter_alt),
            label: 'X-Over',
          ),
          BottomNavigationBarItem(
            icon: Icon(Icons.timer),
            label: 'Time',
          ),
          BottomNavigationBarItem(
            icon: Icon(Icons.speaker),
            label: 'Bass',
          ),
        ],
      ),
    );
  }

  void _showDeviceList(BuildContext context) async {
    final ble = Provider.of<BleService>(context, listen: false);
    showDialog(
      context: context,
      builder: (context) => AlertDialog(
        title: const Text('Select Device'),
        content: FutureBuilder<List<ScanResult>>(
          future: ble.scanDevices(),
          builder: (context, snapshot) {
            if (!snapshot.hasData) return const CircularProgressIndicator();
            final devices = snapshot.data!;
            if (devices.isEmpty) return const Text('No PROLOGY devices found');
            return Column(
              mainAxisSize: MainAxisSize.min,
              children: devices
                  .map((d) => ListTile(
                        title: Text(d.device.platformName),
                        subtitle: Text(d.device.remoteId.str),
                        onTap: () {
                          ble.connectToDevice(d.device);
                          Navigator.pop(context);
                        },
                      ))
                  .toList(),
            );
          },
        ),
        actions: [
          TextButton(
            onPressed: () => Navigator.pop(context),
            child: const Text('Close'),
          ),
        ],
      ),
    );
  }
}

class _MainControlTab extends StatelessWidget {
  const _MainControlTab({super.key});

  @override
  Widget build(BuildContext context) {
    final ble = Provider.of<BleService>(context);
    final state = ble.currentState;

    return ListView(
      padding: const EdgeInsets.all(16),
      children: [
        Card(
          child: ListTile(
            leading: Icon(
              state.connected ? Icons.check_circle : Icons.error,
              color: state.connected ? Colors.green : Colors.red,
            ),
            title: Text(state.connected
                ? 'Connected: ${state.deviceAddress}'
                : 'Not connected'),
            subtitle: Text('Volume: ${state.muted ? "MUTED" : state.volume}'),
          ),
        ),
        const SizedBox(height: 16),
        Card(
          child: Padding(
            padding: const EdgeInsets.all(16),
            child: Column(
              children: [
                Text('Volume', style: Theme.of(context).textTheme.titleMedium),
                Row(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: [
                    IconButton(
                      icon: const Icon(Icons.volume_down, size: 32),
                      onPressed: () => ble.sendVolumeCommand(false),
                    ),
                    const SizedBox(width: 20),
                    Text(
                      state.muted ? 'MUTED' : '${state.volume}',
                      style: const TextStyle(
                          fontSize: 32, fontWeight: FontWeight.bold),
                    ),
                    const SizedBox(width: 20),
                    IconButton(
                      icon: const Icon(Icons.volume_up, size: 32),
                      onPressed: () => ble.sendVolumeCommand(true),
                    ),
                  ],
                ),
                IconButton(
                  icon: Icon(
                    state.muted ? Icons.volume_off : Icons.volume_up,
                    color: state.muted ? Colors.red : null,
                  ),
                  onPressed: () => ble.toggleMute(),
                ),
              ],
            ),
          ),
        ),
        const SizedBox(height: 16),
        Card(
          child: Padding(
            padding: const EdgeInsets.all(16),
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                const Text('EQ Presets',
                    style: TextStyle(fontSize: 16, fontWeight: FontWeight.bold)),
                const SizedBox(height: 8),
                Wrap(
                  spacing: 8,
                  children: EQPreset.values.map((preset) {
                    return ChoiceChip(
                      label: Text(preset.name),
                      selected: state.eqPreset == preset,
                      onSelected: (_) => ble.sendEQPresetCommand(preset),
                    );
                  }).toList(),
                ),
              ],
            ),
          ),
        ),
        const SizedBox(height: 16),
        Card(
          child: Padding(
            padding: const EdgeInsets.all(16),
            child: Column(
              children: [
                Text('Balance: ${state.balance}'),
                Slider(
                  value: state.balance.toDouble(),
                  min: -100,
                  max: 100,
                  onChanged: (v) => ble.sendBalanceCommand(v.round()),
                ),
                Text('Fader: ${state.fader}'),
                Slider(
                  value: state.fader.toDouble(),
                  min: -100,
                  max: 100,
                  onChanged: (v) => ble.sendFaderCommand(v.round()),
                ),
              ],
            ),
          ),
        ),
        const SizedBox(height: 16),
        Card(
          child: Padding(
            padding: const EdgeInsets.all(16),
            child: Column(
              children: [
                Text('Bass: ${state.bass}'),
                Slider(
                  value: state.bass.toDouble(),
                  min: -12,
                  max: 12,
                  onChanged: (v) => ble.sendBassCommand(v.round()),
                ),
                Text('Treble: ${state.treble}'),
                Slider(
                  value: state.treble.toDouble(),
                  min: -12,
                  max: 12,
                  onChanged: (v) => ble.sendTrebleCommand(v.round()),
                ),
              ],
            ),
          ),
        ),
        const SizedBox(height: 16),
        Card(
          child: Padding(
            padding: const EdgeInsets.all(16),
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                const Text('Input Source',
                    style: TextStyle(fontSize: 16, fontWeight: FontWeight.bold)),
                const SizedBox(height: 8),
                Wrap(
                  spacing: 8,
                  children: InputSource.values.map((input) {
                    return ChoiceChip(
                      label: Text(input.name),
                      selected: state.input == input,
                      onSelected: (_) => ble.sendInputCommand(input),
                    );
                  }).toList(),
                ),
              ],
            ),
          ),
        ),
      ],
    );
  }
}

class _EQTab extends StatelessWidget {
  const _EQTab({super.key});

  @override
  Widget build(BuildContext context) {
    final ble = Provider.of<BleService>(context);
    final state = ble.currentState;

    return ListView(
      padding: const EdgeInsets.all(16),
      children: [
        Card(
          child: Padding(
            padding: const EdgeInsets.all(16),
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                const Text('EQ Curves',
                    style: TextStyle(fontSize: 16, fontWeight: FontWeight.bold)),
                const SizedBox(height: 8),
                DropdownButton<int>(
                  value: state.selectedCurve,
                  items: List.generate(state.eqCurves.length,
                      (i) => DropdownMenuItem(
                            value: i,
                            child: Text(state.eqCurves[i].name),
                          )),
                  onChanged: (value) {
                    if (value != null) {
                      ble.sendCurveCommand(value);
                    }
                  },
                ),
                const SizedBox(height: 16),
                Wrap(
                  spacing: 8,
                  children: state.eqCurves.asMap().entries.map((entry) {
                    return ChoiceChip(
                      label: Text(entry.value.name),
                      selected: state.selectedCurve == entry.key,
                      onSelected: (_) => ble.sendCurveCommand(entry.key),
                    );
                  }).toList(),
                ),
              ],
            ),
          ),
        ),
        const SizedBox(height: 16),
        Card(
          child: Padding(
            padding: const EdgeInsets.all(16),
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                const Text('EQ Bands (25-band)',
                    style: TextStyle(fontSize: 16, fontWeight: FontWeight.bold)),
                const SizedBox(height: 8),
                Container(
                  height: 200,
                  child: Row(
                    crossAxisAlignment: CrossAxisAlignment.end,
                    children: List.generate(25, (i) {
                      int value = i < state.eqBands.length ? state.eqBands[i] : 0;
                      return Expanded(
                        child: Container(
                          margin: const EdgeInsets.symmetric(horizontal: 2),
                          height: (value / 255 * 200).clamp(0, 200),
                          color: Colors.blue,
                        ),
                      );
                    }),
                  ),
                ),
                const SizedBox(height: 8),
                Text('Band values: ${state.eqBands.take(10).map((v) => v.toRadixString(16).padLeft(2, '0').toUpperCase()).join(', ')}...'),
              ],
            ),
          ),
        ),
      ],
    );
  }
}

class _XOverTab extends StatelessWidget {
  const _XOverTab({super.key});

  @override
  Widget build(BuildContext context) {
    final ble = Provider.of<BleService>(context);
    final state = ble.currentState;

    return ListView(
      padding: const EdgeInsets.all(16),
      children: [
        Card(
          child: Padding(
            padding: const EdgeInsets.all(16),
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                const Text('X-Over Filters',
                    style: TextStyle(fontSize: 16, fontWeight: FontWeight.bold)),
                const SizedBox(height: 8),
                ...state.xOverItems.asMap().entries.map((entry) {
                  int index = entry.key;
                  XOverItem item = entry.value;
                  return Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      Text('Channel ${item.channel}'),
                      Row(
                        children: [
                          Expanded(
                            child: DropdownButton<XOverType>(
                              value: item.type,
                              items: XOverType.values.map((type) {
                                return DropdownMenuItem(
                                  value: type,
                                  child: Text(type.name),
                                );
                              }).toList(),
                              onChanged: (value) {
                                if (value != null) {
                                  ble.sendXOverTypeCommand(index, value.value);
                                }
                              },
                            ),
                          ),
                          const SizedBox(width: 10),
                          Expanded(
                            child: Text('Freq: ${item.freq} Hz'),
                          ),
                          Expanded(
                            child: Text('Gain: ${item.gain}'),
                          ),
                          Expanded(
                            child: Text('Slope: ${item.slope} dB/oct'),
                          ),
                        ],
                      ),
                      const SizedBox(height: 8),
                    ],
                  );
                }).toList(),
              ],
            ),
          ),
        ),
      ],
    );
  }
}

class _TimeAlignmentTab extends StatelessWidget {
  const _TimeAlignmentTab({super.key});

  @override
  Widget build(BuildContext context) {
    final ble = Provider.of<BleService>(context);
    final state = ble.currentState;

    return ListView(
      padding: const EdgeInsets.all(16),
      children: [
        Card(
          child: Padding(
            padding: const EdgeInsets.all(16),
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                const Text('Time Alignment',
                    style: TextStyle(fontSize: 16, fontWeight: FontWeight.bold)),
                const SizedBox(height: 8),
                ...state.timeAlignmentItems.asMap().entries.map((entry) {
                  int index = entry.key;
                  TimeAlignmentItem item = entry.value;
                  return Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      Text('Channel ${item.channel}'),
                      Row(
                        children: [
                          Expanded(
                            child: Text('Delay: ${item.delay} samples'),
                          ),
                          IconButton(
                            icon: const Icon(Icons.add),
                            onPressed: () => ble.sendTimeAlignmentCommand(
                                index, item.delay + 10),
                          ),
                          IconButton(
                            icon: const Icon(Icons.remove),
                            onPressed: () => ble.sendTimeAlignmentCommand(
                                index, (item.delay - 10).clamp(0, 700)),
                          ),
                        ],
                      ),
                      const SizedBox(height: 8),
                    ],
                  );
                }).toList(),
              ],
            ),
          ),
        ),
      ],
    );
  }
}

class _BassBoostTab extends StatelessWidget {
  const _BassBoostTab({super.key});

  @override
  Widget build(BuildContext context) {
    final ble = Provider.of<BleService>(context);
    final state = ble.currentState;

    return ListView(
      padding: const EdgeInsets.all(16),
      children: [
        Card(
          child: Padding(
            padding: const EdgeInsets.all(16),
            child: Column(
              children: [
                Text('Bass Boost',
                    style: Theme.of(context).textTheme.titleMedium),
                SwitchListTile(
                  title: const Text('Enable Bass Boost'),
                  value: state.bassBoostEnabled,
                  onChanged: (value) => ble.sendBassBoostCommand(
                      value, state.bassBoostLevel),
                ),
                const SizedBox(height: 16),
                Text('Bass Boost Level: ${state.bassBoostLevel}'),
                Slider(
                  value: state.bassBoostLevel.toDouble(),
                  min: 0,
                  max: 10,
                  onChanged: (v) => ble.sendBassBoostCommand(
                      state.bassBoostEnabled, v.round()),
                ),
              ],
            ),
          ),
        ),
        const SizedBox(height: 16),
        Card(
          child: Padding(
            padding: const EdgeInsets.all(16),
            child: Column(
              children: [
                Text('Subwoofer Volume: ${state.subwooferVolume}'),
                Slider(
                  value: state.subwooferVolume.toDouble(),
                  min: 0,
                  max: 100,
                  onChanged: (v) => ble.sendSubwooferVolumeCommand(v.round()),
                ),
              ],
            ),
          ),
        ),
      ],
    );
  }
}
