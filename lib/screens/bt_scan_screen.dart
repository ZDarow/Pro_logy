import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../providers/bt_provider.dart';
import '../providers/scan_device.dart';

class BtScanScreen extends StatefulWidget {
  const BtScanScreen({super.key});

  @override
  State<BtScanScreen> createState() => _BtScanScreenState();
}

class _BtScanScreenState extends State<BtScanScreen> {
  String? errorMessage;

  @override
  void initState() {
    super.initState();
    final bt = context.read<BtProvider>();
    if (!bt.isScanning) {
      bt.startScan();
    }
  }

  Future<void> _connect(ScanDevice device) async {
    final bt = context.read<BtProvider>();
    final ok = await bt.connectFromScanDevice(device);
    if (ok && mounted) {
      Navigator.pop(context, true);
    } else if (mounted) {
      setState(() => errorMessage = bt.errorMessage ?? 'Ошибка подключения');
    }
  }

  @override
  Widget build(BuildContext context) {
    final bt = context.watch<BtProvider>();
    final isScanning = bt.isScanning;
    final devices = bt.scanDevices;
    final adapterOn = bt.isAdapterOn;

    return Scaffold(
      appBar: AppBar(
        title: const Text('BT Devices'),
        actions: [
          if (!adapterOn)
            IconButton(
              icon: const Icon(Icons.bluetooth_disabled),
              onPressed: () => bt.startScan(),
            ),
        ],
      ),
      body: Column(
        children: [
          if (!adapterOn)
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
                      final d = devices[i];
                      return ListTile(
                        leading: const Icon(Icons.bluetooth),
                        title: Text(d.name.isNotEmpty ? d.name : 'Unknown'),
                        subtitle: Text(d.remoteId),
                        trailing: IconButton(
                          icon: const Icon(Icons.link),
                          onPressed: () => _connect(d),
                        ),
                      );
                    },
                  ),
          ),
        ],
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: isScanning ? null : () => bt.startScan(),
        child: Icon(isScanning ? Icons.hourglass_empty : Icons.search),
      ),
    );
  }
}