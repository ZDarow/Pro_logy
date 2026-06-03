import 'package:flutter_test/flutter_test.dart';
import 'package:flutter_blue_plus_platform_interface/flutter_blue_plus_platform_interface.dart';
import 'package:prology/main.dart';

/// Mock-реализация FlutterBluePlusPlatform для тестовой среды
///
/// Все методы возвращают значения по умолчанию, чтобы flutter_blue_plus
/// не падал с UnsupportedError при запуске widget-тестов.
base class MockFlutterBluePlusPlatform extends FlutterBluePlusPlatform {
  @override
  Stream<BmBluetoothAdapterState> get onAdapterStateChanged =>
      Stream.value(BmBluetoothAdapterState(adapterState: BmAdapterStateEnum.on));
}

void main() {
  setUpAll(() {
    // Подменяем BLE-платформу на мок перед всеми тестами,
    // иначе FlutterBluePlus.adapterState вызовет UnsupportedError
    FlutterBluePlusPlatform.instance = MockFlutterBluePlusPlatform();
  });

  testWidgets('PROLOGY app loads', (WidgetTester tester) async {
    await tester.pumpWidget(PrologyApp());
    // Не используем pumpAndSettle — BLE стримы и таймеры не дадут ему завершиться
    await tester.pump(const Duration(milliseconds: 500));
    expect(find.text('PROLOGY'), findsOneWidget);
  });

  testWidgets('shows source cards', (WidgetTester tester) async {
    await tester.pumpWidget(PrologyApp());
    await tester.pump(const Duration(milliseconds: 500));
    expect(find.text('Radio'), findsOneWidget);
    expect(find.text('BT Music'), findsOneWidget);
    expect(find.text('USB'), findsOneWidget);
    expect(find.text('Settings'), findsOneWidget);
  });
}
