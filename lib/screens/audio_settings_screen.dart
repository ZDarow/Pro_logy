import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../screens/equalizer_screen.dart';
import '../providers/bt_provider.dart';

class AudioSettingsScreen extends StatefulWidget {
  const AudioSettingsScreen({super.key});

  @override
  State<AudioSettingsScreen> createState() => _AudioSettingsScreenState();
}

class _AudioSettingsScreenState extends State<AudioSettingsScreen> {
  double bass = 0;
  double treble = 0;
  double balance = 0;
  double fader = 0;
  bool loudness = false;
  double subwooferLevel = 50;
  int xoverType = 0;
  int taSpeaker = 0;
  double taDelay = 0;

  String _getSpeakerName(int index) {
    const names = ['Front Left', 'Front Right', 'Rear Left', 'Rear Right', 'Subwoofer', 'Tweeter'];
    return names[index % names.length];
  }

  @override
  Widget build(BuildContext context) {
    final bt = context.watch<BtProvider>();

    return Scaffold(
      appBar: AppBar(title: const Text('Audio Settings')),
      body: ListView(
        children: [
          _buildSlider('Bass', bass, 0, 100, (v) {
            setState(() => bass = v);
            bt.setBass(v.toInt());
          }, bt.isConnected),
          _buildSlider('Treble', treble, 0, 100, (v) {
            setState(() => treble = v);
            bt.setTreble(v.toInt());
          }, bt.isConnected),
          _buildSlider('Balance', balance, -10, 10, (v) {
            setState(() => balance = v);
            bt.setBalance(v.toInt());
          }, bt.isConnected),
          _buildSlider('Fader', fader, -10, 10, (v) {
            setState(() => fader = v);
            bt.setFader(v.toInt());
          }, bt.isConnected),
          SwitchListTile(
            title: const Text('Loudness'),
            value: loudness,
            onChanged: bt.isConnected
                ? (v) {
                    setState(() => loudness = v);
                    bt.setLoudness(v);
                  }
                : null,
          ),
          const Divider(),
          ListTile(
            leading: const Icon(Icons.speaker),
            title: const Text('Subwoofer Level'),
            trailing: SizedBox(
              width: 200,
              child: Slider(
                value: subwooferLevel,
                min: 0,
                max: 100,
                onChanged: bt.isConnected
                    ? (v) {
                        setState(() => subwooferLevel = v);
                        bt.setSubwoofer(level: v.toInt());
                      }
                    : null,
              ),
            ),
          ),
          ListTile(
            leading: const Icon(Icons.graphic_eq),
            title: const Text('X-Over Type'),
            trailing: DropdownButton<int>(
              value: xoverType,
              items: const [
                DropdownMenuItem(value: 0, child: Text('2-Way')),
                DropdownMenuItem(value: 1, child: Text('3-Way')),
              ],
              onChanged: bt.isConnected
                  ? (v) {
                      setState(() => xoverType = v!);
                      bt.setXOver(type: v!);
                    }
                  : null,
            ),
          ),
          const Divider(),
          ListTile(
            leading: const Icon(Icons.timer),
            title: const Text('Time Alignment'),
            subtitle: Text('Speaker: ${_getSpeakerName(taSpeaker)}, Delay: ${taDelay.toStringAsFixed(0)}ms'),
            trailing: const Icon(Icons.chevron_right),
            onTap: bt.isConnected
                ? () {
                    showDialog(
                      context: context,
                      builder: (ctx) => AlertDialog(
                        title: const Text('Time Alignment'),
                        content: StatefulBuilder(
                          builder: (context, setDialogState) => Column(
                            mainAxisSize: MainAxisSize.min,
                            children: [
                              DropdownButton<int>(
                                value: taSpeaker,
                                items: List.generate(6, (i) => DropdownMenuItem(value: i, child: Text(_getSpeakerName(i)))),
                                onChanged: (v) {
                                  setDialogState(() => taSpeaker = v!);
                                  setState(() {});
                                },
                              ),
                              Slider(
                                value: taDelay,
                                min: 0,
                                max: 200,
                                label: '${taDelay.toStringAsFixed(0)}ms',
                                onChanged: (v) {
                                  setDialogState(() => taDelay = v);
                                  setState(() {});
                                  bt.setTimeAlignment(speaker: taSpeaker, delay: v.toInt());
                                },
                              ),
                            ],
                          ),
                        ),
                        actions: [TextButton(onPressed: () => Navigator.pop(ctx), child: const Text('OK'))],
                      ),
                    );
                  }
                : null,
          ),
          const Divider(),
          ListTile(
            leading: const Icon(Icons.equalizer),
            title: const Text('Equalizer'),
            trailing: const Icon(Icons.chevron_right),
            onTap: () {
              Navigator.push(
                context,
                MaterialPageRoute(builder: (_) => const EqualizerScreen()),
              );
            },
          ),
          const Divider(),
          const Padding(
            padding: EdgeInsets.all(16),
            child: Text('EQ Presets', style: TextStyle(fontSize: 16, fontWeight: FontWeight.bold)),
          ),
          Padding(
            padding: const EdgeInsets.symmetric(horizontal: 16),
            child: Wrap(
              spacing: 8,
              children: [
                _PresetButton(label: 'FLAT', preset: 0, bt: bt),
                _PresetButton(label: 'ROCK', preset: 1, bt: bt),
                _PresetButton(label: 'POP', preset: 2, bt: bt),
                _PresetButton(label: 'JAZZ', preset: 3, bt: bt),
                _PresetButton(label: 'CLASSIC', preset: 4, bt: bt),
                _PresetButton(label: 'USER1', preset: 5, bt: bt),
                _PresetButton(label: 'USER2', preset: 6, bt: bt),
              ],
            ),
          ),
          if (!bt.isConnected)
            const Padding(
              padding: EdgeInsets.all(16),
              child: Text('Подключите Bluetooth для управления', style: TextStyle(color: Colors.grey)),
            ),
        ],
      ),
    );
  }

  Widget _buildSlider(String title, double value, double min, double max, Function(double) onChanged, bool enabled) {
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        Padding(
          padding: const EdgeInsets.fromLTRB(16, 16, 16, 0),
          child: Row(
            mainAxisAlignment: MainAxisAlignment.spaceBetween,
            children: [
              Text(title),
              Text(value.toStringAsFixed(1)),
            ],
          ),
        ),
        Slider(
          value: value,
          min: min,
          max: max,
          onChanged: enabled ? onChanged : null,
        ),
      ],
    );
  }
}

class _PresetButton extends StatelessWidget {
  final String label;
  final int preset;
  final BtProvider bt;

  const _PresetButton({required this.label, required this.preset, required this.bt});

  @override
  Widget build(BuildContext context) {
    return ElevatedButton(
      onPressed: bt.isConnected ? () => bt.setEqPreset(preset) : null,
      child: Text(label),
    );
  }
}