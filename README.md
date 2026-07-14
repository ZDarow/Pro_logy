# Pro_logy

Мобильное приложение для управления автомагнитолами Prology через Bluetooth Low Energy (BLE).

## Возможности

- Подключение к устройствам Prology по BLE
- Управление громкостью, балансом, тембром
- Переключение источников входа (Radio, BT, USB, SD, AUX, Disc, GPS, SXM, AV IN)
- Эквалайзер с пресетами
- Расширенные настройки звука (Loudness, Subwoofer, X-Over, Time Alignment, EQ Plus)

## Стек

- **Flutter** (Dart SDK ^3.11.5)
- **State Management**: `flutter_bloc`, `provider`
- **Hardware**: `flutter_blue_plus` (Bluetooth)

## Быстрый старт

```bash
flutter pub get
flutter run
```

## Команды

- `flutter analyze` — линтинг
- `flutter test` — тесты
- `flutter build apk` — сборка Android

## Настройка VS Code для разработки

### 1. Установка рекомендуемых расширений

Откройте командную строку (Ctrl+` или View → Terminal) и выполните:

```bash
code --install-extension dart-code.dart-code
code --install-extension dart-code.flutter
code --install-extension redhat.vscode-yaml
```

### 2. Настройка путей (если требуется)

Проверьте `.vscode/settings.json`:

```json
{
  "dart.flutterSdkPath": "/home/mi/development/flutter",
  "dart.lineLength": 80,
  "editor.formatOnSave": true
}
```

### 3. Запуск и отладка

Используйте конфигурации из `.vscode/launch.json`:

- **Prology (Debug)** — обычный запуск с отладкой
- **Prology (Profile)** — запуск в режиме профилирования
- **Prology (Release)** — запуск релизной сборки

### 4. Полезные задачи

В `.vscode/tasks.json` настроены задачи:

- `Flutter: Pub Get` — установка пакетов
- `Flutter: Analyze` — проверка кода
- `Flutter: Test` — запуск тестов
- `Flutter: Build APK` — сборка Android

## Структура

- `lib/bloc/` — глобальное состояние (Bloc)
- `lib/providers/` — провайдеры (Bluetooth, настройки)
- `lib/data/repositories/` — работа с BLE и данными
- `lib/screens/` — экраны приложения
- `assets/` — ресурсы (иконки, изображения)
- `docs/` — документация (BLE протокол)
- `specs/` — спецификация (reverse-engineered)

## Документация

- `docs/protocol.md` — полное описание BLE протокола (UUID, команды, уведомления)
- `docs/TOOLKIT_INDEX.md` — сводный индекс по PROLOGY_TOOLKIT
- `docs/toolkit_analysis/` — полная документация toolkit:
  - `PROLOGY_TOOLKIT_ANALYSIS.md` — обзор структуры, команды, эмуляторы
  - `RCSP_PROTOCOL.md` — спецификация протокола RCSP
  - `PROLOGY_CMD300/COMMANDS.md` — справочник команд (Volume, EQ, Balance)
  - `DSP_ANALYSIS_REPORT.md` — анализ DSP функций (EQ, X-Over, Time Alignment, Subwoofer)
- `specs/prology_reverse_spec.md` — reverse-engineered спецификация в формате EARS
- `CHANGELOG.md` — история изменений
- `IMPLEMENTATION_REPORT.md` — отчёт о реализации
- `PROJECT_SUMMARY.md` — краткое резюме проекта
