import 'package:flutter/material.dart';

class AuxScreen extends StatelessWidget {
  const AuxScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('AUX Input')),
      body: const Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Icon(Icons.headphones, size: 100, color: Colors.grey),
            SizedBox(height: 20),
            Text('AUX Input', style: TextStyle(fontSize: 24)),
            SizedBox(height: 10),
            Text(
              'Connect device to AUX port',
              style: TextStyle(color: Colors.grey),
            ),
          ],
        ),
      ),
    );
  }
}
