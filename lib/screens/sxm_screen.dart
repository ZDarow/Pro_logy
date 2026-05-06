import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../providers/bt_provider.dart';

class SxmScreen extends StatelessWidget {
  const SxmScreen({super.key});

  @override
  Widget build(BuildContext context) {
    final bt = context.watch<BtProvider>();

    return Scaffold(
      appBar: AppBar(title: const Text('SiriusXM')),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            const Icon(Icons.satellite_alt, size: 100, color: Colors.indigo),
            const SizedBox(height: 20),
            const Text('SiriusXM Radio', style: TextStyle(fontSize: 24)),
            const SizedBox(height: 10),
            const Text('Subscription required', style: TextStyle(color: Colors.grey)),
            const SizedBox(height: 40),
            Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                IconButton(icon: const Icon(Icons.skip_previous, size: 48), onPressed: bt.isConnected ? () {} : null),
                const SizedBox(width: 20),
                IconButton(icon: const Icon(Icons.play_arrow, size: 64), onPressed: bt.isConnected ? () {} : null),
                const SizedBox(width: 20),
                IconButton(icon: const Icon(Icons.skip_next, size: 48), onPressed: bt.isConnected ? () {} : null),
              ],
            ),
          ],
        ),
      ),
    );
  }
}
