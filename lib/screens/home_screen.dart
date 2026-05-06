import 'package:flutter/material.dart';
import 'package:flutter_blue_plus/flutter_blue_plus.dart';
import 'package:provider/provider.dart';
import 'package:flutter_bloc/flutter_bloc.dart';
import '../providers/bt_provider.dart';
import '../providers/command_settings_provider.dart';
import '../bloc/app_bloc.dart';
import '../data/constants.dart';
import '../widgets/now_playing_bar.dart';

class HomeScreen extends StatefulWidget {
  const HomeScreen({super.key});

  @override
  State<HomeScreen> createState() => _HomeScreenState();
}

class _HomeScreenState extends State<HomeScreen> {
  void _showBtDialog(BuildContext context) {
    showDialog(
      context: context,
      builder: (ctx) => AlertDialog(
        title: const Text('Bluetooth'),
        content: const Text('Отключить устройство?'),
        actions: [
          TextButton(
            onPressed: () => Navigator.pop(ctx),
            child: const Text('Отмена'),
          ),
          TextButton(
            onPressed: () {
              context.read<BtProvider>().disconnect();
              Navigator.pop(ctx);
            },
            child: const Text('Отключить'),
          ),
        ],
      ),
    );
  }

  void _onSourceTap(SourceItem source) {
    final appBloc = context.read<AppBloc>();
    if (source.screen != null) {
      appBloc.add(SelectSource(source.appSource));
      Navigator.push(context, MaterialPageRoute(builder: (_) => source.screen!));
    } else {
      final cmdSettings = context.read<CommandSettingsProvider>();
      final cmd = cmdSettings.getCommand(source.command).codeUnits;
      final bt = context.read<BtProvider>();
      if (!bt.isConnected) {
        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(content: Text('${source.name} - нужно подключение BT')),
        );
      } else {
        bt.sendCommand(cmd);
        appBloc.add(SelectSource(source.appSource));
      }
    }
  }

  @override
  Widget build(BuildContext context) {
    final bt = context.watch<BtProvider>();

    return Scaffold(
      appBar: AppBar(
        title: const Text('PROLOGY'),
        actions: [
          StreamBuilder<BluetoothConnectionState>(
            stream: bt.connectionState,
            builder: (context, snapshot) {
              final connected = snapshot.data == BluetoothConnectionState.connected;
              return IconButton(
                icon: Icon(
                  connected ? Icons.bluetooth_connected : Icons.bluetooth_disabled,
                  color: connected ? Colors.blue : Colors.grey,
                ),
                onPressed: connected
                    ? () => _showBtDialog(context)
                    : () => Navigator.push(context, MaterialPageRoute(builder: (_) => sources[8].screen!)),
                tooltip: connected ? 'Подключено. Нажмите для отключения.' : 'Нажмите для сканирования',
              );
            },
          ),
          const SizedBox(width: 8),
        ],
      ),
      body: Column(
        children: [
          Expanded(
            child: GridView.count(
              crossAxisCount: 2,
              padding: const EdgeInsets.all(16),
              children: sources.map((s) => _SourceCard(
                name: s.name,
                icon: s.icon,
                iconColor: s.iconColor,
                onTap: () => _onSourceTap(s),
              )).toList(),
            ),
          ),
          NowPlayingBar(
            onTap: () => Navigator.push(
              context,
              MaterialPageRoute(builder: (_) => settingsScreen),
            ),
          ),
          Padding(
            padding: const EdgeInsets.all(16),
            child: SizedBox(
              width: double.infinity,
              child: ElevatedButton(
                onPressed: () {
                  Navigator.push(
                    context,
                    MaterialPageRoute(builder: (_) => settingsScreen),
                  );
                },
                child: const Text('Settings'),
              ),
            ),
          ),
        ],
      ),
    );
  }
}

class _SourceCard extends StatelessWidget {
  final String name;
  final IconData icon;
  final Color? iconColor;
  final VoidCallback? onTap;

  const _SourceCard({
    required this.name,
    required this.icon,
    this.iconColor,
    this.onTap,
  });

  @override
  Widget build(BuildContext context) {
    return Card(
      child: InkWell(
        onTap: onTap,
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Icon(icon, size: 48, color: iconColor ?? Theme.of(context).colorScheme.primary),
            const SizedBox(height: 8),
            Text(name),
          ],
        ),
      ),
    );
  }
}
