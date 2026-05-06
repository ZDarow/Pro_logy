import 'package:flutter_test/flutter_test.dart';
import 'package:prology/main.dart';

void main() {
  testWidgets('PROLOGY app loads', (WidgetTester tester) async {
    await tester.pumpWidget(const PrologyApp());
    await tester.pumpAndSettle();
    expect(find.text('PROLOGY'), findsOneWidget);
  });

  testWidgets('shows source cards', (WidgetTester tester) async {
    await tester.pumpWidget(const PrologyApp());
    await tester.pumpAndSettle();
    expect(find.text('Radio'), findsOneWidget);
    expect(find.text('BT Music'), findsOneWidget);
    expect(find.text('USB'), findsOneWidget);
    expect(find.text('Settings'), findsOneWidget);
  });
}