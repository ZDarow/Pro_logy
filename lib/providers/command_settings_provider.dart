import 'package:flutter/foundation.dart';
import 'package:path_provider/path_provider.dart';
import 'dart:convert';
import 'dart:io';

class CommandSettings {
  final Map<String, String> commands;

  const CommandSettings({required this.commands});

  CommandSettings copyWith({Map<String, String>? commands}) {
    return CommandSettings(commands: commands ?? this.commands);
  }
}

class CommandSettingsProvider extends ChangeNotifier {
  static const _defaultCommands = {
    'RADIO': 'RADIO',
    'BT': 'BT',
    'USB': 'USB',
    'SD': 'SD',
    'DISC': 'DISC',
    'AUX': 'AUX',
    'GPS': 'GPS',
    'SXM': 'SXM',
  };

  CommandSettings _settings = const CommandSettings(commands: _defaultCommands);
  bool _isLoading = false;

  CommandSettings get settings => _settings;
  bool get isLoading => _isLoading;

  String getCommand(String source) => _settings.commands[source] ?? source;

  Future<void> load() async {
    _isLoading = true;
    notifyListeners();

    try {
      final file = await _getFile();
      if (await file.exists()) {
        final content = await file.readAsString();
        final map = Map<String, String>.from(jsonDecode(content));
        _settings = CommandSettings(commands: map);
      }
    } catch (e) {
      _settings = const CommandSettings(commands: _defaultCommands);
    }

    _isLoading = false;
    notifyListeners();
  }

  Future<void> saveCommand(String source, String command) async {
    final newCommands = Map<String, String>.from(_settings.commands);
    newCommands[source] = command;
    _settings = _settings.copyWith(commands: newCommands);
    notifyListeners();

    await _saveToFile();
  }

  Future<void> _saveToFile() async {
    try {
      final file = await _getFile();
      await file.writeAsString(jsonEncode(_settings.commands));
    } catch (e) {
      debugPrint('Failed to save commands: $e');
    }
  }

  Future<File> _getFile() async {
    final dir = await getApplicationDocumentsDirectory();
    return File('${dir.path}/commands.json');
  }
}