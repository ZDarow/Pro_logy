# AGENTS.md — Prology Mobile App

> Специализированная документация для ИИ-агентов кодирования.
> Формат оптимизирован для парсинга LLM: чёткие секции, machine-readable маркеры, однозначные инструкции.
> Версия: 2.0.0 | Дата: 07.07.2026 | Платформа: Flutter (Dart SDK ^3.11.5)

---

## 1. Контекст и архитектура

### 1.1 Стек технологий

- **Язык**: Dart 3.x (null safety, records, patterns)
- **Фреймворк**: Flutter 3.x (Material 3, Widgets)
- **Управление состоянием**:
  - `flutter_bloc` ^9.1.1 — глобальное состояние (выбор источника)
  - `provider` ^6.1.2 — Bluetooth-состояние, настройки
- **BLE**: `flutter_blue_plus` ^1.36.8
- **Тестирование**: `flutter_test`, `mockito` ^5.4.0, `build_runner` ^2.4.0
- **Линтинг**: `flutter_lints` ^6.0.0 (`analysis_options.yaml`)

### 1.2 Структура проекта (ключевые пути)

```text
prology/
├── lib/
│   ├── main.dart                          # Точка входа (MultiProvider + BlocProvider)
│   ├── bloc/
│   │   └── app_bloc.dart                  # AppSource enum + AppBloc (Cubit)
│   ├── providers/
│   │   ├── bt_provider.dart               # BtProvider — прослойка UI↔Repository (420 строк)
│   │   └── command_settings_provider.dart # CommandSettingsProvider — хранение команд
│   ├── data/
│   │   ├── constants.dart                 # SourceItem definitions (10 экранов)
│   │   └── repositories/
│   │       └── bt_repository.dart         # BtRepository — ядро BLE (473 строки)
│   ├── screens/                           # 11 экранов
│   │   ├── home_screen.dart               # Главный экран (источники)
│   │   ├── audio_settings_screen.dart     # Настройки аудио (240 строк)
│   │   ├── radio_screen.dart              # Радио (148 строк)
│   │   ├── equalizer_screen.dart          # Эквалайзер (131 строка)
│   │   ├── bt_scan_screen.dart            # Сканирование BLE (135 строк)
│   │   ├── player_screen.dart             # Плеер (93 строки)
│   │   ├── settings_screen.dart           # Настройки (77 строк)
│   │   ├── sxm_screen.dart                # SXM (39 строк)
│   │   ├── disc_screen.dart               # DISC (39 строк)
│   │   ├── usb_screen.dart                # USB (33 строки)
│   │   ├── sd_screen.dart                 # SD (33 строки)
│   │   ├── aux_screen.dart                # AUX (27 строк)
│   │   └── av_in_screen.dart              # AV IN (27 строк, заглушка)
│   └── widgets/
│       └── now_playing_bar.dart           # Now Playing (85 строк)
├── test/
│   └── bt_repository_test.dart            # 14 unit-тестов (112 строк)
├── assets/                                # Ресурсы (16 подпапок)
├── docs/
│   └── protocol.md                        # BLE-протокол
├── specs/
│   └── prology_reverse_spec.md            # Реверс-спецификация (EARS)
├── .github/workflows/ci.yml               # CI: analyze + test
├── pubspec.yaml
└── analysis_options.yaml
```

### 1.3 Архитектура: Repository → Provider → UI

```text
BLE-устройство (Prology)
     ↕ GATT (AE01 Write / AF01 Notify)
BtRepository (lib/data/repositories/bt_repository.dart)
     ↕ stateStream (Stream<PrologyState>)
BtProvider (lib/providers/bt_provider.dart) — ChangeNotifier
     ↕ context.watch<BtProvider>()
UI (lib/screens/*.dart)
```

- **BtRepository** — единственный класс, работающий с `flutter_blue_plus`. Содержит всю BLE-логику: connect/discover/send/notify.
- **BtProvider** — обёртка вокруг `BtRepository` с try-catch и demo-режимом. UI никогда не обращается к Repository напрямую.
- **AppBloc** — глобальный выбор источника (Radio/BT/USB/SD/AUX/DISC/GPS/SXM/AV IN).
- **CommandSettingsProvider** — сохранение кастомных BLE-команд (SharedPreferences через path_provider).

### 1.4 BLE-протокол (кратко)

| Параметр | Значение |
| ---------- | ---------- |
| Сервис CMD | `0000AE00-0000-1000-8000-00805f9b34fb` |
| Характеристика Write | `0000AE01-0000-1000-8000-00805f9b34fb` |
| Сервис Notify | `0000AF00-0000-1000-8000-00805f9b34fb` |
| Характеристика Notify | `0000AF02-0000-1000-8000-00805f9b34fb` |

**Формат команды (TX)**:

```text
[0xF0, 0x00, LEN, 0xA0, 0x10, 0x0E, CMD, DATA..., CS]
```

- CS = (sum(LEN..DATA) + 0x10) & 0xFF

**Формат уведомления (RX)**:

```text
[0xC0, 0x00, LEN, TYPE, DATA..., CS]
```

- CS = (sum(LEN..DATA) + 0x40) & 0xFF

**Команды** (TX command bytes, определены как static const в bt_repository.dart):

- `playPause`=0x01, `nextTrack`=0x02, `prevTrack`=0x03
- `volume`=0x18, `fader`=0x20, `bass`=0x21, `treble`=0x22, `input`=0x24
- `eqPreset`=0x26, `balance`=0x2a
- `loudness`=0x30, `subwoofer`=0x40, `xover`=0x50, `timeAlignment`=0x60, `eqPlus`=0x70
- `radioSeekUp`=0x80, `radioSeekDown`=0x81, `radioSetFreqFm`=0x82, `radioSetFreqAm`=0x83

**Уведомления** (RX notification types):

- 0x90=volume, 0x91=bass+treble, 0x92=balance+fader, 0x93=inputSource

### 1.5 Точки входа для анализа

- **Главная точка входа**: `lib/main.dart` — MaterialApp с MultiProvider
- **Инициализация BLE**: `BtRepository.connect()` → `_discoverPrologyService()` → `_sendInit()`
- **Обработка уведомлений**: `_handleNotification()` → `parseNotification()` → `_updateState()`
- **Сборка команды**: `_buildTx(payload)` → `sendCommand(data)`

---

## 2. Строгие правила

### 2.1 Стиль кода

- **Имена**: переменные/функции/классы — **английский**, CamelCase (классы), snake_case (методы, переменные).
- **Комментарии**: на **русском**, поясняют «почему», а не «что». Комментарии «что» только если код неочевиден.
- **Форматирование**: стандартный `dart format`. Максимальная длина строки — 120 символов.
- **Типизация**: ВСЕ публичные функции и поля должны иметь явный тип. `var` допускается только в локальных контекстах, где тип очевиден.
- **Импорты**: относительные (с `../`), не package:prology/..., кроме тестов (package:prology/...).
- **Константы**: магические числа ЗАПРЕЩЕНЫ. Все protocol bytes — `static const` в `bt_repository.dart`. Числа в BLE-командах — только через именованные константы.
- **Журналирование**: только `debugPrint()` (не `print()`). Не оставлять `debugPrint` в release-коде без флага `kDebugMode`.

### 2.2 Запрещённые паттерны

| Категория | Запрещено | Вместо |
| ----------- | ----------- | -------- |
| BLE | Прямое обращение UI к `flutter_blue_plus` | Только через `BtRepository` → `BtProvider` |
| BLE | `setInput('RADIO')` перед каждым preset | Только смена частоты (радио уже активно) |
| BLE | Отправка команды на каждый pixel слайдера | `Timer` debounce 300ms (уже реализован) |
| Состояние | `ChangeNotifier` не вызывающий `notifyListeners()` | Всегда после изменения состояния |
| Состояние | Создание нового `StreamController` без `dispose` | `dispose()` в Repository и Provider |
| BLE | Двойная подписка на `onValueReceived` | Отмена `_notificationSubscription` перед новой подпиской |
| Потоки | Использование `dart:math` Random | Только `int`-арифметика (Random удалён, но импорт мог остаться) |
| UI | `Navigator.push` без проверки `mounted` | `if (!context.mounted) return;` или `StatefulWidget` |

### 2.3 Специфика Linux Mint (среда разработки)

- **ОС**: Linux Mint (Ubuntu-based). Команды: `apt`, `snap`, `flatpak`.
- **Flutter**: установлен через `snap` или `apt`. SDK в `/usr/lib/flutter` или `~/snap/flutter`.
- **Android SDK**: через Linux Mint не гарантируется. `flutter build apk` может не работать (таймаут). Сборка только для проверки синтаксиса, не для деплоя.
- **USB-отладка**: Android-устройство подключается по ADB. `flutter run` работает, но требует настроенного Android SDK.
- **SDK Manager**: если `sdkmanager` не найден, Flutter установит Android SDK автоматически при первом build. Ждать 5+ минут.
- **Графика**: Flutter работает штатно. Эмулятор Android (AVD) может тормозить — предпочитать физическое устройство.

### 2.4 Git-правила

- **Язык коммитов**: русский, повелительное наклонение. Пример: «Исправил checksum в setSubwoofer».
- **Ветки**: английский, kebab-case. Пример: `fix/bass-treble-cmd`, `feature/debounce`.
- **Коммит** — только по явной команде пользователя.
- **Пуш** — только по явной команде пользователя.
- **Не делать**: `git commit -m "fix"` (слишком коротко), `git push --force`, `git rebase`.

### 2.5 Приоритет источников истины

1. **AGENTS.md** (этот файл) — текущие правила и бэклог
2. **BtRepository** (lib/data/repositories/bt_repository.dart) — BLE-логика, протокол
3. **docs/protocol.md** — описание протокола (может отставать от кода)
4. **PROJECT_SUMMARY.md**, **IMPLEMENTATION_REPORT.md** — исторический контекст

⚠️ Если `docs/protocol.md` расходится с кодом — доверять **коду** (bt_repository.dart).

---

## 3. Операционные инструкции

### 3.1 Установка зависимостей

```bash
flutter pub get
```

После изменения `pubspec.yaml` — всегда `flutter pub get`.

### 3.2 Линтинг (анализ)

```bash
flutter analyze
```

Ожидаемый результат: **0 issues, 0 warnings, 0 errors**. CI проверяет это.

### 3.3 Генерация моков (для тестов)

```bash
flutter pub run build_runner build --delete-conflicting-outputs
```

Только если изменены `@GenerateMocks` аннотации в тестах. Сейчас моки объявлены вручную (MockBluetoothDevice etc.), build_runner не обязателен для запуска тестов.

### 3.4 Тестирование

```bash
flutter test
```

Ожидаемый результат: **All tests passed** (14 unit + 2 widget). CI запускает `flutter test`.

### 3.5 Сборка APK

```bash
flutter build apk --release
```

⚠️ Может занимать 10+ минут. На Linux Mint возможен таймаут Gradle. Не запускать без флага `--release` для CI/debug.

### 3.6 Полный цикл проверки (pre-commit)

```bash
flutter pub get && flutter analyze && flutter test
```

Выполнять перед каждым коммитом. Если `analyze` не проходит — правки не принимаются.

### 3.7 Запуск на устройстве

```bash
flutter devices                    # проверить подключённые устройства
flutter run                        # запуск на первом устройстве
flutter run -d <device_id>         # запуск на конкретном устройстве
```

---

## 4. Бэклог задач

<!-- PRIORITY: P0=критично, P1=высокий, P2=средний, P3=низкий, P4=идея -->

### 4.1 P0 — Критические

| # | Задача | Файлы | Описание |
| --- | -------- | ------- | ---------- |
| 1 | Валидировать Bass/Treble command bytes | `bt_repository.dart:41-42` | `cmdBass=0x21`, `cmdTreble=0x22` — предположительные. Нужно подтвердить через Frida-перехват на реальном устройстве или APK decompile. Возможны другие значения. |
| 2 | Разрешить несоответствие checksum | `bt_repository.dart:63-64`, `docs/protocol.md` | Документация говорит XOR 0x94, код использует (sum+0x10)/(sum+0x40). Один из источников ошибается. Нужно подтвердить через сниффер BLE-трафика. |

### 4.2 P1 — Высокий приоритет

| # | Задача | Файлы | Описание |
| --- | -------- | ------- | ---------- |
| 3 | Реализовать debounce для Bass/Treble/Balance/Fader слайдеров | `audio_settings_screen.dart` | Уже добавлен Timer 300ms в AudioSettingsScreen. Проверить, что он работает на всех слайдерах, включая subwoofer и Time Alignment dialog. |
| 4 | LEN-поля extended audio settings | `bt_repository.dart:339-365` | `setLoudness(LEN=0x07)`, `setSubwoofer(LEN=0x07)`, `setXOver(LEN=0x06)`, `setTimeAlignment(LEN=0x06)`, `setEqPlus(LEN=0x08)` — не проверены на реальном устройстве. Могут не совпадать с фактическим протоколом. |
| 5 | CI/CD пайплайн не существует | `.github/workflows/ci.yml` | Файл может отсутствовать. Проверить наличие. Если отсутствует — создать. |
| 6 | Удалить `dart:math` из bt_provider.dart | `bt_provider.dart:2` | `import 'dart:math'` не используется (Random не вызывается в коде). Удалить неиспользуемый импорт. |

### 4.3 P2 — Средний приоритет

| # | Задача | Файлы | Описание |
| --- | -------- | ------- | ---------- |
| 7 | Переработать BtProvider: убрать дублирование try-catch | `bt_provider.dart` | Сейчас 22 метода-прокладки с try-catch. Можно сделать generic `_safeCall<T>()` или генерировать обёртки. |
| 8 | Добавить `if (!mounted) return;` в setState | `audio_settings_screen.dart:54,58,62,...` | После async-операций нужно проверять mounted. |
| 9 | Перевести presets на именованные константы | `bt_repository.dart:326` | Массив `eqPresetValues = [0x08, 0x03, ...]` — магические числа. Должны быть `static const` с именами. |
| 10 | Receiver-проверка на пустой `payload` | `bt_repository.dart:227-229` | `_buildTx()` не проверяет `payload` на пустоту. Пустой payload вызовет index out of bounds. |
| 11 | Тесты для `_buildTx()` и `_calcChecksumTx()` | `test/bt_repository_test.dart` | Сейчас тестов на сборку команды нет. Добавить unit-тесты. |
| 12 | Тесты для экранов (widget tests) | `test/` | Добавить тесты для audio_settings_screen, radio_screen. Сейчас только 2 widget теста. |

### 4.4 P3 — Низкий приоритет

| # | Задача | Файлы | Описание |
| --- | -------- | ------- | ---------- |
| 13 | Устаревшие версии зависимостей | `pubspec.yaml` | `flutter_blue_plus` ^1.36.8 → ^2.3.10 (major behind). 27 пакетов с новыми версиями. Обновить с осторожностью — breaking changes. |
| 14 | Parking Sensor экран | `lib/screens/` | Не реализован вообще. Нужен UI и BLE-команды. |
| 15 | Remote Control (IR кнопки) | `lib/screens/` | Не реализован. Нужны протокольные байты. |
| 16 | RDS Radio | `lib/screens/radio_screen.dart` | Отображение RDS-информации (название станции, текст). |
| 17 | Skin/Theme switcher | `lib/` | Смена темы (скины из оригинального APK). |
| 18 | Наполнение экранов-заглушек | `av_in_screen.dart` | Сейчас просто Scaffold с текстом. |

### 4.5 P4 — Идеи / Исследования

| # | Задача | Файлы | Описание |
| --- | -------- | ------- | ---------- |
| 19 | Reverse-engineer extended audio bytes из APK | `apk/libapp.so` | Анализ libapp.so бинарника для точных протокольных байт Loudness/Subwoofer/XOver/TimeAlignment/EQPlus. |
| 20 | Frida-скрипты для перехвата BLE | `tools/frida/` | Написать Frida-хуки для трассировки всех BLE-команд на реальном устройстве. |
| 21 | Автоматическая реконнект | `bt_repository.dart` | Добавить auto-reconnect при обрыве связи с таймаутом и exponential backoff. |
| 22 | Состояние bass/treble из уведомлений | `bt_repository.dart:427` | Сейчас parseNotification обновляет state.bass/treble из RX, но кеширование на старте отсутствует — state = 0 до первого уведомления. |

---

## 5. Технический долг и рекомендации

### 5.1 «Красная зона» — НЕ ТРОГАТЬ

| Компонент | Причина | Альтернатива |
| ----------- | --------- | -------------- |
| `RxDart` | Не используется. Не добавлять. | Использовать только dart:async Stream |
| `json_serializable` | Нет моделей JSON. Не добавлять. | Ручные fromJson/toJson если нужно |
| `freezed` | Нет sealed-классов данных. Не добавлять. | Использовать enum/sealed class из коробки Dart |
| `auto_route` / `go_router` | Маршрутизация через `Navigator.push()` | Не менять без явного ТЗ |
| `get_it` / `kiwi` | DI через Provider/BlocProvider | Не добавлять DI-фреймворки |
| `rxdart` | Stream-операции базовые | Не добавлять |
| `logger` | debugPrint достаточно | Не добавлять логгер |
| `shared_preferences` | Заменён на path_provider | Не возвращать |
| `services/bt_service.dart` | Удалён в Stage 1 | Не восстанавливать |

### 5.2 «Жёлтая зона» — Осторожно

| Компонент | Риск | Рекомендация |
| ----------- | ------ | -------------- |
| `flutter_blue_plus` upgrade (1.36.8→2.x) | **Breaking changes**: API переписан (scan, connect, characteristic access) | Сначала протестировать upgrade на отдельной ветке. Написать интеграционные тесты ДО миграции. |
| `provider` → `riverpod` | Архитектурная смена всего управления состоянием | Только если ТЗ явно требует. Затрагивает все 12 экранов + провайдеры. |
| `dart:io` | Недоступен на Web платформе | `dart:io` уже используется в `path_provider`, но flutter_blue_plus не работает на Web. Не добавлять новых зависимостей от dart:io. |

### 5.3 Известные проблемы

1. **Protocol discrepancy**: `docs/protocol.md` описывает checksum как `XOR 0x94`, код использует `(sum+0x10)` для TX и `(sum+0x40)` для RX. Одна из формул неверна. **Не менять код, пока не будет BLE-сниффера.** Ошибка может быть в документации.

2. **RX-уведомления приходят только после первого TX-запроса**: Устройство Prology не отправляет уведомления само — только в ответ на команду. `_sendInit()` отправляет `[F0 00 03 01 05 00 09]` при подключении; если уведомлений нет — устройство не ответило на init.

3. **GUID уведомлений**: `0000AF02` (notify) — подтверждён из APK-анализа. Если устройство не отвечает — проверить совпадает ли UUID с реальным устройством.

4. **Bass/Treble кодирование**: value смещается на +0x10 (bass) и +0x20 (treble) перед отправкой. Это предположение из анализа APK. Если на устройстве звук не меняется — encoding неверен.

5. **APK build timeout**: Gradle может не собраться на Linux Mint из-за нехватки ресурсов или отсутствия Android SDK. Workaround: `flutter build apk --release` с увеличенным таймаутом или CI (GitHub Actions).

### 5.4 Метрики качества

| Метрика | Текущее | Цель | Проверка |
| --------- | --------- | ------ | ---------- |
| Анализатор | 0 issues | 0 issues | `flutter analyze` |
| Unit-тесты | 14 | 20+ | `flutter test` |
| Widget-тесты | 2 | 10+ | `flutter test` |
| Покрытие кода | Нет данных | >60% | `flutter test --coverage` + `genhtml` |
| Доступность BLE | 100% (тесты mock) | 100% | Интеграционные тесты |

### 5.5 Порядок действий для нового агента

1. Прочитать этот файл полностью.
2. Выполнить `flutter pub get`.
3. Выполнить `flutter analyze` — убедиться, что проект «зелёный».
4. Выполнить `flutter test` — убедиться, что все тесты проходят.
5. Сверить `docs/protocol.md` с кодом `bt_repository.dart` на предмет расхождений.
6. Приступить к задачам из бэклога (раздел 4), начиная с **P0**.
7. **Перед каждым коммитом**: `flutter pub get && flutter analyze && flutter test`.

---

*Конец документации. При изменениях в коде — обновить секции 1.4 (протокол) и 4 (бэклог).*
