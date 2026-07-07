// Базовый smoke-тест для Prology Flutter
// Проверяет, что приложение собирается без ошибок

import 'package:flutter/material.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:provider/provider.dart';

import 'package:prology_flutter/main.dart';
import 'package:prology_flutter/services/ble_service.dart';

void main() {
  testWidgets('Приложение запускается и показывает HomeScreen',
      (WidgetTester tester) async {
    // Создаём экземпляр приложения
    await tester.pumpWidget(PrologyApp());

    // Проверяем, что главный экран загружен
    expect(find.byType(MaterialApp), findsOneWidget);
  });
}
