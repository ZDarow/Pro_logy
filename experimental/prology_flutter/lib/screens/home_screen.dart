import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../models/prology_state.dart';
import '../services/ble_service.dart';

class HomeScreen extends StatelessWidget {
  const HomeScreen({super.key});

  @override
  Widget build(BuildContext context) {
    final ble = Provider.of<BleService>(context);

    return Scaffold(
      appBar: AppBar(
        title: Text('PROLOGY Controller'),
        actions: [
          IconButton(
            icon: Icon(ble.currentState.connected
                ? Icons.bluetooth_connected
                : Icons.bluetooth),
            onPressed: () => _showDeviceList(context, ble),
          ),
        ],
      ),
      body: StreamBuilder<PrologyState>(
        stream: ble.stateStream,
        initialData: ble.currentState,
        builder: (context, snapshot) {
          final state = snapshot.data!;
          return ListView(
            padding: EdgeInsets.all(16),
            children: [
              _buildConnectionCard(state),
              SizedBox(height: 16),
              _buildVolumeControl(context, ble, state),
              SizedBox(height: 16),
              _buildEQPresets(ble, state),
              SizedBox(height: 16),
              _buildBalanceFader(ble, state),
              SizedBox(height: 16),
              _buildInputSelect(ble, state),
            ],
          );
        },
      ),
    );
  }

  Widget _buildConnectionCard(PrologyState state) {
    return Card(
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
    );
  }

  Widget _buildVolumeControl(
      BuildContext context, BleService ble, PrologyState state) {
    return Card(
      child: Padding(
        padding: EdgeInsets.all(16),
        child: Column(
          children: [
            Text('Volume', style: Theme.of(context).textTheme.titleMedium),
            Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                IconButton(
                  icon: Icon(Icons.volume_down, size: 32),
                  onPressed: () => ble.sendVolumeDown(),
                ),
                SizedBox(width: 20),
                Text(
                  state.muted ? 'MUTED' : '${state.volume}',
                  style: TextStyle(fontSize: 32, fontWeight: FontWeight.bold),
                ),
                SizedBox(width: 20),
                IconButton(
                  icon: Icon(Icons.volume_up, size: 32),
                  onPressed: () => ble.sendVolumeUp(),
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
    );
  }

  Widget _buildEQPresets(BleService ble, PrologyState state) {
    return Card(
      child: Padding(
        padding: EdgeInsets.all(16),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Text('EQ Presets', style: TextStyle(fontSize: 16, fontWeight: FontWeight.bold)),
            SizedBox(height: 8),
            Wrap(
              spacing: 8,
              children: EQPreset.values.map((preset) {
                return ChoiceChip(
                  label: Text(preset.name),
                  selected: state.eqPreset == preset,
                  onSelected: (_) => ble.sendEQPreset(preset),
                );
              }).toList(),
            ),
          ],
        ),
      ),
    );
  }

  Widget _buildBalanceFader(BleService ble, PrologyState state) {
    return Card(
      child: Padding(
        padding: EdgeInsets.all(16),
        child: Column(
          children: [
            Text('Balance: ${state.balance}'),
            Slider(
              value: state.balance.toDouble(),
              min: -100,
              max: 100,
              onChanged: (v) => ble.sendBalance(v.round()),
            ),
            Text('Fader: ${state.fader}'),
            Slider(
              value: state.fader.toDouble(),
              min: -100,
              max: 100,
              onChanged: (v) => ble.sendFader(v.round()),
            ),
          ],
        ),
      ),
    );
  }

  Widget _buildInputSelect(BleService ble, PrologyState state) {
    return Card(
      child: Padding(
        padding: EdgeInsets.all(16),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Text('Input Source', style: TextStyle(fontSize: 16, fontWeight: FontWeight.bold)),
            SizedBox(height: 8),
            Wrap(
              spacing: 8,
              children: InputSource.values.map((input) {
                return ChoiceChip(
                  label: Text(input.name),
                  selected: state.input == input,
                  onSelected: (_) => ble.sendInput(input),
                );
              }).toList(),
            ),
          ],
        ),
      ),
    );
  }

  void _showDeviceList(BuildContext context, BleService ble) async {
    showDialog(
      context: context,
      builder: (context) => AlertDialog(
        title: Text('Select Device'),
        content: FutureBuilder<List<String>>(
          future: ble.scanDevices(),
          builder: (context, snapshot) {
            if (!snapshot.hasData) return CircularProgressIndicator();
            final devices = snapshot.data!;
            if (devices.isEmpty) return Text('No devices found');
            return Column(
              mainAxisSize: MainAxisSize.min,
              children: devices
                  .map((d) => ListTile(
                        title: Text(d),
                        onTap: () {
                          ble.connectToDevice(d);
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
            child: Text('Close'),
          ),
        ],
      ),
    );
  }
}
