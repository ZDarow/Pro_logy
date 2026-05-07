import 'package:flutter/material.dart';
import 'models/prology_state.dart';

void main() {
  runApp(PrologyApp());
}

class PrologyApp extends StatelessWidget {
  const PrologyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'PROLOGY Flutter',
      theme: ThemeData(primarySwatch: Colors.blue, useMaterial3: true),
      home: HomeScreen(),
    );
  }
}

class HomeScreen extends StatefulWidget {
  const HomeScreen({super.key});

  @override
  _HomeScreenState createState() => _HomeScreenState();
}

class _HomeScreenState extends State<HomeScreen> {
  PrologyState state = PrologyState();

  void _volumeUp() {
    setState(() {
      if (state.volume < 28) state = state.copyWith(volume: state.volume + 1);
    });
  }

  void _volumeDown() {
    setState(() {
      if (state.volume > 0) state = state.copyWith(volume: state.volume - 1);
    });
  }

  void _toggleMute() {
    setState(() {
      state = state.copyWith(muted: !state.muted);
    });
  }

  void _setEQPreset(EQPreset preset) {
    setState(() {
      state = state.copyWith(eqPreset: preset);
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('PROLOGY Controller')),
      body: ListView(
        padding: const EdgeInsets.all(16),
        children: [
          Card(
            child: ListTile(
              leading: Icon(
                state.connected ? Icons.check_circle : Icons.error,
                color: state.connected ? Colors.green : Colors.red,
              ),
              title: Text(
                state.connected
                    ? 'Connected: ${state.deviceAddress}'
                    : 'Not connected',
              ),
              subtitle: Text('Volume: ${state.muted ? "MUTED" : state.volume}'),
            ),
          ),
          const SizedBox(height: 16),
          Card(
            child: Padding(
              padding: const EdgeInsets.all(16),
              child: Column(
                children: [
                  Text(
                    'Volume',
                    style: Theme.of(context).textTheme.titleMedium,
                  ),
                  Row(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      IconButton(
                        icon: const Icon(Icons.volume_down, size: 32),
                        onPressed: _volumeDown,
                      ),
                      const SizedBox(width: 20),
                      Text(
                        state.muted ? 'MUTED' : '${state.volume}',
                        style: const TextStyle(
                          fontSize: 32,
                          fontWeight: FontWeight.bold,
                        ),
                      ),
                      const SizedBox(width: 20),
                      IconButton(
                        icon: const Icon(Icons.volume_up, size: 32),
                        onPressed: _volumeUp,
                      ),
                    ],
                  ),
                  IconButton(
                    icon: Icon(
                      state.muted ? Icons.volume_off : Icons.volume_up,
                      color: state.muted ? Colors.red : null,
                    ),
                    onPressed: _toggleMute,
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
                  const Text(
                    'EQ Presets',
                    style: TextStyle(fontSize: 16, fontWeight: FontWeight.bold),
                  ),
                  const SizedBox(height: 8),
                  Wrap(
                    spacing: 8,
                    children: EQPreset.values.map((preset) {
                      return ChoiceChip(
                        label: Text(preset.name),
                        selected: state.eqPreset == preset,
                        onSelected: (_) => _setEQPreset(preset),
                      );
                    }).toList(),
                  ),
                ],
              ),
            ),
          ),
        ],
      ),
    );
  }
}
