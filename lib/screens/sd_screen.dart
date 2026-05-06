import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../providers/bt_provider.dart';

class SdCardScreen extends StatelessWidget {
  const SdCardScreen({super.key});

  @override
  Widget build(BuildContext context) {
    final bt = context.watch<BtProvider>();

    return Scaffold(
      appBar: AppBar(title: const Text('SD Card')),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            const Icon(Icons.sd_card, size: 100, color: Colors.green),
            const SizedBox(height: 20),
            const Text('SD Card', style: TextStyle(fontSize: 24)),
            const SizedBox(height: 10),
            const Text('No SD card inserted', style: TextStyle(color: Colors.grey)),
            const SizedBox(height: 40),
            ElevatedButton(
              onPressed: bt.isConnected ? () {} : null,
              child: const Text('Scan SD Card'),
            ),
          ],
        ),
      ),
    );
  }
}
