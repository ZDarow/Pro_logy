import 'dart:async';
import 'dart:typed_data';

import 'package:flutter/material.dart';
import 'package:prology_bluetooth/prology_bluetooth.dart';

/// Пример приложения для демонстрации работы с PROLOGY Bluetooth
void main() {
  runApp(const PrologyExampleApp());
}

class PrologyExampleApp extends StatelessWidget {
  const PrologyExampleApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Prology Bluetooth Example',
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.blue),
        useMaterial3: true,
      ),
      home: const MainPage(),
    );
  }
}

class MainPage extends StatefulWidget {
  const MainPage({super.key});

  @override
  State<MainPage> createState() => _MainPageState();
}

class _MainPageState extends State<MainPage> {
  final PrologyBluetooth _bluetooth = PrologyBluetooth();

  String _deviceAddress = '90:20:71:5E:48:10';
  String _logText = '';
  final List<String> _logLines = [];
  final ScrollController _scrollController = ScrollController();

  StreamSubscription<BluetoothState>? _stateSubscription;
  StreamSubscription<Uint8List>? _dataSubscription;
  StreamSubscription<String>? _errorSubscription;

  @override
  void initState() {
    super.initState();
    _setupListeners();
  }

  void _setupListeners() {
    // Подписка на состояние подключения
    _stateSubscription = _bluetooth.connectionState.listen((state) {
      _addLog('Состояние: ${state.description}');
      setState(() {});
    });

    // Подписка на входящие данные
    _dataSubscription = _bluetooth.incomingData.listen((data) {
      final hexData = _bytesToHex(data);
      final asciiData = _tryDecodeAscii(data);
      _addLog('Получено: $hexData');
      _addLog('ASCII: $asciiData');
    });

    // Подписка на ошибки
    _errorSubscription = _bluetooth.errorStream.listen((error) {
      _addLog('Ошибка: $error', isError: true);
    });

    // Настройка callback'ов
    _bluetooth.connectionCallback = SimpleConnectionCallback(
      onConnectedCallback: () {
        _addLog('=== Подключено! ===');
      },
      onDisconnectedCallback: () {
        _addLog('=== Отключено ===');
      },
      onErrorCallback: (error) {
        _addLog('Callback ошибка: $error', isError: true);
      },
    );

    _bluetooth.dataCallback = SimpleDataCallback(
      onDataReceivedCallback: (data) {
        // Дополнительная обработка данных
      },
    );
  }

  @override
  void dispose() {
    _stateSubscription?.cancel();
    _dataSubscription?.cancel();
    _errorSubscription?.cancel();
    _bluetooth.dispose();
    _scrollController.dispose();
    super.dispose();
  }

  void _addLog(String message, {bool isError = false}) {
    final timestamp = DateTime.now().toString().substring(11, 19);
    final line = '[$timestamp] $message';
    setState(() {
      _logLines.add(line);
      if (_logLines.length > 100) {
        _logLines.removeAt(0);
      }
      _logText = _logLines.join('\n');
    });

    // Автопрокрутка вниз
    Future.delayed(const Duration(milliseconds: 100), () {
      if (_scrollController.hasClients) {
        _scrollController.animateTo(
          _scrollController.position.maxScrollExtent,
          duration: const Duration(milliseconds: 200),
          curve: Curves.easeOut,
        );
      }
    });
  }

  String _bytesToHex(Uint8List data) {
    return data.map((b) => b.toRadixString(16).padLeft(2, '0').toUpperCase()).join(' ');
  }

  String _tryDecodeAscii(Uint8List data) {
    try {
      return String.fromCharCodes(data.where((b) => b >= 32 && b <= 126));
    } catch (e) {
      return '<invalid ASCII>';
    }
  }

  Future<void> _connect() async {
    _addLog('Подключение к $_deviceAddress...');
    _bluetooth.autoReconnect = true;
    _bluetooth.maxReconnectAttempts = 3;
    await _bluetooth.connect(_deviceAddress);
  }

  Future<void> _disconnect() async {
    _addLog('Отключение...');
    await _bluetooth.disconnect();
  }

  Future<void> _sendAuth() async {
    if (!_bluetooth.isConnected) {
      _addLog('Не подключено!', isError: true);
      return;
    }
    _addLog('Отправка AUTH...');
    await _bluetooth.sendCommand('AUTH');
  }

  Future<void> _sendStatus() async {
    if (!_bluetooth.isConnected) {
      _addLog('Не подключено!', isError: true);
      return;
    }
    _addLog('Отправка GET_STATUS...');
    await _bluetooth.sendCommand('GET_STATUS');
  }

  Future<void> _sendCustom() async {
    if (!_bluetooth.isConnected) {
      _addLog('Не подключено!', isError: true);
      return;
    }

    // Диалог для ввода команды
    final controller = TextEditingController();
    final result = await showDialog<String>(
      context: context,
      builder: (context) => AlertDialog(
        title: const Text('Отправить команду'),
        content: TextField(
          controller: controller,
          decoration: const InputDecoration(
            hintText: 'Например: GET_EQ',
            border: OutlineInputBorder(),
          ),
        ),
        actions: [
          TextButton(
            onPressed: () => Navigator.pop(context),
            child: const Text('Отмена'),
          ),
          ElevatedButton(
            onPressed: () => Navigator.pop(context, controller.text),
            child: const Text('Отправить'),
          ),
        ],
      ),
    );

    if (result != null && result.isNotEmpty) {
      _addLog('Отправка: $result');
      await _bluetooth.sendCommand(result);
    }
  }

  void _clearLog() {
    setState(() {
      _logLines.clear();
      _logText = '';
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Prology Bluetooth'),
        backgroundColor: Theme.of(context).colorScheme.inversePrimary,
        actions: [
          IconButton(
            icon: const Icon(Icons.clear_all),
            onPressed: _clearLog,
            tooltip: 'Очистить лог',
          ),
        ],
      ),
      body: Column(
        children: [
          // Статус подключения
          _buildStatusCard(),

          // Поле ввода MAC адреса
          _buildAddressInput(),

          // Кнопки управления
          _buildControlButtons(),

          // Лог
          Expanded(
            child: Container(
              margin: const EdgeInsets.all(8),
              padding: const EdgeInsets.all(8),
              decoration: BoxDecoration(
                color: Colors.black87,
                borderRadius: BorderRadius.circular(8),
              ),
              child: ListView.builder(
                controller: _scrollController,
                itemCount: _logLines.length,
                itemBuilder: (context, index) {
                  final line = _logLines[index];
                  final isError = line.contains('Ошибка');
                  return Padding(
                    padding: const EdgeInsets.symmetric(vertical: 2),
                    child: Text(
                      line,
                      style: TextStyle(
                        fontFamily: 'monospace',
                        fontSize: 12,
                        color: isError ? Colors.redAccent : Colors.greenAccent,
                      ),
                    ),
                  );
                },
              ),
            ),
          ),
        ],
      ),
    );
  }

  Widget _buildStatusCard() {
    final state = _bluetooth.state;
    final isConnected = _bluetooth.isConnected;

    return Card(
      margin: const EdgeInsets.all(8),
      child: Padding(
        padding: const EdgeInsets.all(16),
        child: Row(
          children: [
            Icon(
              isConnected ? Icons.bluetooth_connected : Icons.bluetooth_disabled,
              color: isConnected ? Colors.green : Colors.grey,
              size: 32,
            ),
            const SizedBox(width: 16),
            Expanded(
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Text(
                    isConnected ? 'Подключено' : 'Отключено',
                    style: TextStyle(
                      fontSize: 18,
                      fontWeight: FontWeight.bold,
                      color: isConnected ? Colors.green : Colors.grey,
                    ),
                  ),
                  Text(
                    state.description,
                    style: TextStyle(
                      fontSize: 14,
                      color: Colors.grey[600],
                    ),
                  ),
                ],
              ),
            ),
            if (_bluetooth.connectedDevice != null)
              Text(
                _bluetooth.connectedDevice!.address,
                style: const TextStyle(fontFamily: 'monospace'),
              ),
          ],
        ),
      ),
    );
  }

  Widget _buildAddressInput() {
    return Padding(
      padding: const EdgeInsets.symmetric(horizontal: 8),
      child: Row(
        children: [
          const Text('MAC: '),
          Expanded(
            child: TextField(
              onChanged: (value) => _deviceAddress = value,
              decoration: const InputDecoration(
                hintText: '90:20:71:5E:48:10',
                border: OutlineInputBorder(),
                contentPadding: EdgeInsets.symmetric(horizontal: 12, vertical: 8),
              ),
              style: const TextStyle(fontFamily: 'monospace'),
            ),
          ),
        ],
      ),
    );
  }

  Widget _buildControlButtons() {
    return Padding(
      padding: const EdgeInsets.all(8),
      child: Wrap(
        spacing: 8,
        runSpacing: 8,
        children: [
          ElevatedButton.icon(
            onPressed: _bluetooth.isConnected ? null : _connect,
            icon: const Icon(Icons.bluetooth_connected),
            label: const Text('Подключиться'),
          ),
          ElevatedButton.icon(
            onPressed: _bluetooth.isConnected ? _disconnect : null,
            icon: const Icon(Icons.bluetooth_disabled),
            label: const Text('Отключиться'),
          ),
          const SizedBox(width: 16),
          ElevatedButton.icon(
            onPressed: _bluetooth.isConnected ? _sendAuth : null,
            icon: const Icon(Icons.login),
            label: const Text('AUTH'),
          ),
          ElevatedButton.icon(
            onPressed: _bluetooth.isConnected ? _sendStatus : null,
            icon: const Icon(Icons.info_outline),
            label: const Text('STATUS'),
          ),
          ElevatedButton.icon(
            onPressed: _bluetooth.isConnected ? _sendCustom : null,
            icon: const Icon(Icons.send),
            label: const Text('Команда'),
          ),
        ],
      ),
    );
  }
}
