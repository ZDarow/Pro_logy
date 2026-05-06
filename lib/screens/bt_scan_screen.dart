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

  @override
  void initState() {
    super.initState();
    FlutterBluePlus.scanResults.listen((results) {
      setState(() => devices = results);
    });
  }

  void _startScan() {
    setState(() {
      devices.clear();
      isScanning = true;
      errorMessage = null;
    });
    FlutterBluePlus.startScan(timeout: const Duration(seconds: 5));
    Future.delayed(const Duration(seconds: 6), () {
      if (mounted) setState(() => isScanning = false);
    });
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
      appBar: AppBar(title: const Text('BT Devices')),
      body: Column(
        children: [
          if (errorMessage != null)
            Container(
              width: double.infinity,
              padding: const EdgeInsets.all(12),
              color: Colors.red.shade100,
              child: Text(errorMessage!),
            ),
          Expanded(
            child: ListView.builder(
              itemCount: devices.length,
              itemBuilder: (context, i) {
                final d = devices[i].device;
                return ListTile(
                  leading: const Icon(Icons.bluetooth),
                  title: Text(d.platformName.isNotEmpty ? d.platformName : 'Unknown'),
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
