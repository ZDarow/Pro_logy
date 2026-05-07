import 'package:flutter/material.dart';
import 'package:flutter_blue_plus/flutter_blue_plus.dart';
import 'package:provider/provider.dart';
import '../providers/bt_provider.dart';

class BtScanScreen extends StatefulWidget {
  const BtScanScreen({super.key});

  @override
  State<BtScanScreen> createState() => _BtScanScreenState();
}

class _BtScanScreenState extends State<BtScanScreen> {
  List<ScanResult> devices = [];
  bool isScanning = false;
  String? errorMessage;
  BluetoothAdapterState _adapterState = BluetoothAdapterState.unknown;

  @override
  void initState() {
    super.initState();
    FlutterBluePlus.adapterState.listen((state) {
      if (mounted) setState(() => _adapterState = state);
    });
    FlutterBluePlus.scanResults.listen((results) {
      if (mounted) setState(() => devices = results);
    });
    Future.delayed(Duration.zero, () => _startScan());
  }

  Future<void> _startScan() async {
    setState(() {
      devices.clear();
      isScanning = true;
      errorMessage = null;
    });

    try {
      if (await FlutterBluePlus.isSupported == false) {
        setState(() {
          errorMessage = 'BLE не поддерживается';
          isScanning = false;
        });
        return;
      }

      if (await FlutterBluePlus.adapterState.first == BluetoothAdapterState.off) {
        await FlutterBluePlus.turnOn();
      }

      await FlutterBluePlus.startScan(
        timeout: const Duration(seconds: 15),
        androidUsesFineLocation: true,
      );

      await Future.delayed(const Duration(seconds: 16));
      if (mounted) setState(() => isScanning = false);
    } catch (e) {
      if (mounted) {
        setState(() {
          errorMessage = 'Ошибка сканирования: $e';
          isScanning = false;
        });
      }
    }
  }

  Future<void> _connect(ScanResult r) async {
    final bt = context.read<BtProvider>();
    final ok = await bt.connect(r.device);
    if (ok && mounted) {
      Navigator.pop(context, true);
    } else if (mounted) {
      setState(() => errorMessage = bt.errorMessage ?? 'Ошибка подключения');
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('BT Devices'),
        actions: [
          if (_adapterState != BluetoothAdapterState.on)
            IconButton(
              icon: const Icon(Icons.bluetooth_disabled),
              onPressed: () => FlutterBluePlus.turnOn(),
            ),
        ],
      ),
      body: Column(
        children: [
          if (_adapterState != BluetoothAdapterState.on)
            Container(
              width: double.infinity,
              padding: const EdgeInsets.all(12),
              color: Colors.orange.shade100,
              child: const Text('Bluetooth выключен'),
            ),
          if (errorMessage != null)
            Container(
              width: double.infinity,
              padding: const EdgeInsets.all(12),
              color: Colors.red.shade100,
              child: Text(errorMessage!),
            ),
          Expanded(
            child: devices.isEmpty && !isScanning
                ? const Center(child: Text('Устройства не найдены'))
                : ListView.builder(
                    itemCount: devices.length,
                    itemBuilder: (context, i) {
                      final d = devices[i].device;
                      return ListTile(
                        leading: const Icon(Icons.bluetooth),
                        title: Text(d.platformName.isNotEmpty
                            ? d.platformName
                            : 'Unknown'),
                        subtitle: Text(d.remoteId.str),
                        trailing: IconButton(
                          icon: const Icon(Icons.link),
                          onPressed: () => _connect(devices[i]),
                        ),
                      );
                    },
                  ),
          ),
        ],
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: isScanning ? null : _startScan,
        child: Icon(isScanning ? Icons.hourglass_empty : Icons.search),
      ),
    );
  }
}