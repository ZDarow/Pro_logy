import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:flutter_bloc/flutter_bloc.dart';
import 'data/repositories/bt_repository.dart';
import 'providers/bt_provider.dart';
import 'providers/command_settings_provider.dart';
import 'bloc/app_bloc.dart';
import 'screens/home_screen.dart';

void main() {
  WidgetsFlutterBinding.ensureInitialized();
  runApp(PrologyApp());
}

class PrologyApp extends StatelessWidget {
  PrologyApp({super.key});

  final BtRepository _repository = BtRepository();

  @override
  Widget build(BuildContext context) {
    return MultiProvider(
      providers: [
        ChangeNotifierProvider(create: (_) => BtProvider(repository: _repository)),
        ChangeNotifierProvider(
          create: (_) => CommandSettingsProvider()..load(),
        ),
        BlocProvider(create: (_) => AppBloc()),
      ],
      child: MaterialApp(
        title: 'PROLOGY',
        theme: ThemeData(
          colorScheme: ColorScheme.fromSeed(seedColor: Colors.deepPurple),
          useMaterial3: true,
        ),
        home: const HomeScreen(),
      ),
    );
  }
}
