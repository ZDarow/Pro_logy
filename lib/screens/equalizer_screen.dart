import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../providers/bt_provider.dart';

class EqualizerScreen extends StatefulWidget {
  const EqualizerScreen({super.key});

  @override
  State<EqualizerScreen> createState() => _EqualizerScreenState();
}

class _EqualizerScreenState extends State<EqualizerScreen> {
  Map<String, double> bands = {
    '32 Hz': 0,
    '64 Hz': 0,
    '125 Hz': 0,
    '250 Hz': 0,
    '500 Hz': 0,
    '1 kHz': 0,
    '2 kHz': 0,
    '4 kHz': 0,
    '8 kHz': 0,
    '16 kHz': 0,
  };

  final Map<String, int> _freqToBand = {
    '32 Hz': 0,
    '64 Hz': 1,
    '125 Hz': 2,
    '250 Hz': 3,
    '500 Hz': 4,
    '1 kHz': 5,
    '2 kHz': 6,
    '4 kHz': 7,
    '16 kHz': 8,
  };

  void _sendCommand(String freq, double value) {
    final bt = context.read<BtProvider>();
    if (bt.isConnected) {
      final band = _freqToBand[freq] ?? 0;
      bt.setEqPlus(band: band, gain: value.toInt());
    }
  }

  @override
  Widget build(BuildContext context) {
    final bt = context.watch<BtProvider>();

    return Scaffold(
      appBar: AppBar(title: const Text('Equalizer')),
      body: ListView(
        children: [
          ...bands.entries.map((e) => _buildBand(e.key, e.value, (v) {
                setState(() => bands[e.key] = v);
                _sendCommand(e.key, v);
              })),
          const SizedBox(height: 20),
          Padding(
            padding: const EdgeInsets.symmetric(horizontal: 16),
            child: ElevatedButton(
              onPressed: bt.isConnected
                  ? () => setState(() {
                        bands.updateAll((key, value) => 0);
                        _sendCommand('RESET', 0);
                      })
                  : null,
              child: const Text('Reset'),
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

  Widget _buildBand(String name, double value, Function(double) onChanged) {
    return Padding(
      padding: const EdgeInsets.symmetric(horizontal: 16, vertical: 4),
      child: Row(
        children: [
          SizedBox(width: 80, child: Text(name)),
          Expanded(
            child: Slider(
              value: value,
              min: -12,
              max: 12,
              onChanged: onChanged,
            ),
          ),
          SizedBox(width: 50, child: Text(value.toStringAsFixed(1))),
        ],
      ),
    );
  }
}
