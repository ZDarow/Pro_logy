import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../providers/bt_provider.dart';

class RadioScreen extends StatefulWidget {
  const RadioScreen({super.key});

  @override
  State<RadioScreen> createState() => _RadioScreenState();
}

class _RadioScreenState extends State<RadioScreen> {
  double frequency = 101.5;
  bool isFm = true;
  List<String> presets = ['101.5', '102.3', '98.7', '105.2', '107.9', '99.5'];
  int _selectedPreset = -1;

  @override
  Widget build(BuildContext context) {
    final bt = context.watch<BtProvider>();

    return Scaffold(
      appBar: AppBar(title: const Text('Radio')),
      body: SingleChildScrollView(
        padding: const EdgeInsets.all(16),
        child: Column(
          children: [
            const SizedBox(height: 20),
            Text(
              isFm ? '${frequency.toStringAsFixed(1)} MHz' : '${frequency.toStringAsFixed(0)} kHz',
              style: const TextStyle(fontSize: 48, fontWeight: FontWeight.bold),
            ),
            const SizedBox(height: 20),
            Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                TextButton(
                  onPressed: () => setState(() => isFm = true),
                  child: Text('FM', style: TextStyle(
                    fontSize: 18,
                    fontWeight: isFm ? FontWeight.bold : FontWeight.normal,
                    color: isFm ? Colors.blue : Colors.grey,
                  )),
                ),
                const SizedBox(width: 20),
                TextButton(
                  onPressed: () => setState(() => isFm = false),
                  child: Text('AM', style: TextStyle(
                    fontSize: 18,
                    fontWeight: !isFm ? FontWeight.bold : FontWeight.normal,
                    color: !isFm ? Colors.blue : Colors.grey,
                  )),
                ),
              ],
            ),
            const SizedBox(height: 30),
            Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                IconButton(
                  icon: const Icon(Icons.arrow_back, size: 48),
                  onPressed: bt.isConnected
                      ? () => setState(() => frequency -= isFm ? 0.1 : 10)
                      : null,
                ),
                const SizedBox(width: 60),
                IconButton(
                  icon: const Icon(Icons.arrow_forward, size: 48),
                  onPressed: bt.isConnected
                      ? () => setState(() => frequency += isFm ? 0.1 : 10)
                      : null,
                ),
              ],
            ),
            const SizedBox(height: 30),
            const Text('Presets', style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold)),
            const SizedBox(height: 10),
            Wrap(
              spacing: 8,
              runSpacing: 8,
              alignment: WrapAlignment.center,
              children: List.generate(presets.length, (i) => ElevatedButton(
                style: ElevatedButton.styleFrom(
                  backgroundColor: _selectedPreset == i ? Colors.blue : null,
                ),
                onPressed: bt.isConnected
                    ? () {
                        setState(() {
                          frequency = double.parse(presets[i]);
                          _selectedPreset = i;
                        });
                        bt.setInput('RADIO');
                      }
                    : null,
                child: Text(presets[i]),
              )),
            ),
            const SizedBox(height: 30),
            const Divider(),
            const SizedBox(height: 10),
            const Text('Input Sources', style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold)),
            const SizedBox(height: 10),
            Wrap(
              spacing: 8,
              runSpacing: 8,
              alignment: WrapAlignment.center,
              children: [
                _SourceButton(label: 'RADIO', onPressed: () => bt.setInput('RADIO'), isConnected: bt.isConnected),
                _SourceButton(label: 'USB', onPressed: () => bt.setInput('USB'), isConnected: bt.isConnected),
                _SourceButton(label: 'SD', onPressed: () => bt.setInput('SD'), isConnected: bt.isConnected),
                _SourceButton(label: 'BT', onPressed: () => bt.setInput('BT'), isConnected: bt.isConnected),
                _SourceButton(label: 'AUX', onPressed: () => bt.setInput('AUX'), isConnected: bt.isConnected),
                _SourceButton(label: 'DISC', onPressed: () => bt.setInput('DISC'), isConnected: bt.isConnected),
              ],
            ),
            if (!bt.isConnected)
              const Padding(
                padding: EdgeInsets.only(top: 20),
                child: Text('Подключите Bluetooth для управления', style: TextStyle(color: Colors.grey)),
              ),
          ],
        ),
      ),
    );
  }
}

class _SourceButton extends StatelessWidget {
  final String label;
  final VoidCallback? onPressed;
  final bool isConnected;

  const _SourceButton({required this.label, this.onPressed, required this.isConnected});

  @override
  Widget build(BuildContext context) {
    return ElevatedButton(
      onPressed: isConnected ? onPressed : null,
      child: Text(label),
    );
  }
}