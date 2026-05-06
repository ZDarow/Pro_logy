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

  @override
  Widget build(BuildContext context) {
    final bt = context.watch<BtProvider>();

    return Scaffold(
      appBar: AppBar(title: const Text('Audio Settings')),
      body: ListView(
        children: [
          _buildSlider('Bass', bass, -10, 10, (v) {
            setState(() => bass = v);
            bt.setBass(v.toInt());
          }, bt.isConnected),
          _buildSlider('Treble', treble, -10, 10, (v) {
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
                ? (v) => setState(() => loudness = v)
                : null,
          ),
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