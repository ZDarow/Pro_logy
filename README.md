# Prology

Мобильное приложение для управления автомагнитолами Prology через Bluetooth Low Energy (BLE).

## Возможности
- Подключение к устройствам Prology по BLE
- Управление громкостью, балансом, тембром
- Переключение источников входа (Radio, BT, USB, SD, AUX, Disc)
- Эквалайзер с пресетами

## Стек
- **Flutter** (Dart SDK ^3.11.5)
- **State Management**: `flutter_bloc`, `provider`
- **Hardware**: `flutter_blue_plus` (Bluetooth), `audio_service`

## Быстрый старт
```bash
flutter pub get
flutter run
```

## Команды
- `flutter analyze` — линтинг
- `flutter test` — тесты
- `flutter build apk` — сборка Android

## Структура
- `lib/bloc/` — глобальное состояние (Bloc)
- `lib/providers/` — провайдеры (Bluetooth, настройки)
- `lib/data/repositories/` — работа с BLE и данными
- `lib/screens/` — экраны приложения
- `assets/` — ресурсы (иконки, изображения)
