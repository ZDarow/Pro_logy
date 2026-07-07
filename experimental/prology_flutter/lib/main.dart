import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'services/ble_service.dart';
import 'screens/home_screen.dart';

void main() {
  runApp(PrologyApp());
}

class PrologyApp extends StatelessWidget {
  final BleService _bleService = BleService();

  PrologyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return Provider<BleService>(
      create: (_) => _bleService,
      dispose: (_, service) => service.dispose(),
      child: MaterialApp(
        title: 'PROLOGY Flutter',
        theme: ThemeData(
          primarySwatch: Colors.blue,
          useMaterial3: true,
        ),
        home: const HomeScreen(),
      ),
    );
  }
}
