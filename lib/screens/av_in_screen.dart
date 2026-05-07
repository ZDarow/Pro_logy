import 'package:flutter/material.dart';

class AvInScreen extends StatelessWidget {
  const AvInScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('AV IN')),
      body: const Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Icon(Icons.cable, size: 80, color: Colors.grey),
            SizedBox(height: 20),
            Text('AV IN Input', style: TextStyle(fontSize: 24)),
            SizedBox(height: 10),
            Text(
              'Analog video/audio input',
              style: TextStyle(color: Colors.grey),
            ),
          ],
        ),
      ),
    );
  }
}
