import 'package:flutter/material.dart';

class AuxScreen extends StatelessWidget {
  const AuxScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('AUX Input')),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            const Icon(Icons.headphones, size: 100, color: Colors.grey),
            const SizedBox(height: 20),
            const Text('AUX Input', style: TextStyle(fontSize: 24)),
            const SizedBox(height: 10),
            const Text('Connect device to AUX port', style: TextStyle(color: Colors.grey)),
          ],
        ),
      ),
    );
  }
}
