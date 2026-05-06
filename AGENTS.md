# AGENTS.md

## Commands
- `flutter pub get` — установка зависимостей.
- `flutter analyze` — линтинг (настроен через `analysis_options.yaml` + `flutter_lints`).
- `flutter test` — запуск тестов.

## Stack
- **Flutter** (Dart SDK ^3.11.5).
- **State Management**: `flutter_bloc`, `provider`.
- **Hardware**: `flutter_blue_plus` (Bluetooth), `audio_service`.

## Architecture
- `BtRepository` — работа с BLE (команды + уведомления через `AF01`).
- `BtProvider` (ChangeNotifier) — пробрасывает состояние из `BtRepository.stateStream`.
- `AppBloc` — глобальный выбор источника (Radio/BT/USB/SD/AUX/DISC).

## BLE Protocol
- **Service CMD**: `0000AE00-...`, **Characteristic**: `0000AE01` (Write)
- **Service Notify**: `0000AF00-...`, **Characteristic**: `0000AF01` (Notify)
- **Checksum**: XOR 0x94 over data bytes
- **Init**: `[F0 00 03 01 05 00 09]`

## Assets
Все ассеты лежат в `assets/` и явно прописаны в `pubspec.yaml:59-75`. Структура плоская по подпапкам (button, speaker, radio, etc.).

## Structure
- `lib/bloc/` — глобальное состояние (Bloc)
- `lib/providers/` — провайдеры (Bluetooth, настройки)
- `lib/data/repositories/` — работа с BLE и данными
- `lib/screens/` — экраны приложения
- `assets/` — ресурсы (иконки, изображения)
