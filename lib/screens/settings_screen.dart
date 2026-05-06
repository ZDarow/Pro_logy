import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../providers/bt_provider.dart';
import '../providers/command_settings_provider.dart';
import 'audio_settings_screen.dart';

class SettingsScreen extends StatelessWidget {
  const SettingsScreen({super.key});

  @override
  Widget build(BuildContext context) {
    final bt = context.watch<BtProvider>();
    final cmdSettings = context.watch<CommandSettingsProvider>();
    final commands = cmdSettings.settings.commands;

    return Scaffold(
      appBar: AppBar(title: const Text('Settings')),
      body: ListView(
        children: [
          const Padding(
            padding: EdgeInsets.all(16),
            child: Text('Команды источников', style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold)),
          ),
          ...commands.entries.map((e) => ListTile(
                title: Text(e.key),
                subtitle: Text(e.value),
                trailing: IconButton(
                  icon: const Icon(Icons.edit),
                  onPressed: () => _editCommand(context, e.key, e.value),
                ),
              )),
          const Divider(),
          ListTile(
            leading: const Icon(Icons.audiotrack),
            title: const Text('Audio Settings'),
            trailing: const Icon(Icons.chevron_right),
            onTap: () => Navigator.push(
              context,
              MaterialPageRoute(builder: (_) => const AudioSettingsScreen()),
            ),
          ),
          const Divider(),
          ListTile(
            leading: Icon(bt.isConnected ? Icons.bluetooth_connected : Icons.bluetooth_disabled),
            title: Text(bt.isConnected ? 'Подключено' : 'Отключено'),
            subtitle: bt.isConnected ? const Text('Нажмите для отключения') : null,
            onTap: bt.isConnected ? () => bt.disconnect() : null,
          ),
        ],
      ),
    );
  }

  void _editCommand(BuildContext context, String source, String value) {
    final controller = TextEditingController(text: value);
    showDialog(
      context: context,
      builder: (dialogContext) => AlertDialog(
        title: Text('Команда для $source'),
        content: TextField(controller: controller),
        actions: [
          TextButton(
            onPressed: () => Navigator.pop(dialogContext),
            child: const Text('Отмена'),
          ),
          TextButton(
            onPressed: () {
              context.read<CommandSettingsProvider>().saveCommand(source, controller.text);
              Navigator.pop(dialogContext);
            },
            child: const Text('Сохранить'),
          ),
        ],
      ),
    );
  }
}
