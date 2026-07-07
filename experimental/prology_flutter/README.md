# PROLOGY Flutter Controller

Приложение для управления автомагнитолами PROLOGY (CMD-300) по Bluetooth LE.

## Возможности

- Управление громкостью (Volume Up/Down, Mute)
- Выбор пресетов эквалайзера (FLAT, ROCK, POP, JAZZ, CLASSIC, USER1, USER2)
- Настройка баланса (Balance) и фейдера (Fader)
- Выбор источника звука (USB, SD, Bluetooth, AUX, Radio)
- Подключение к устройствам PROLOGY по BLE

## Структура проекта

```
lib/
  models/
    prology_state.dart    # Модель состояния устройства
  services/
    ble_service.dart       # BLE сервис (эмуляция для Web)
    prology_protocol.dart # Протокол команд PROLOGY
  screens/
    home_screen.dart      # Главный экран приложения
  main.dart               # Точка входа
```

## Протокол PROLOGY

Основан на анализе реального устройства CMD-300:
- Service UUID: `0000ae00-0000-1000-8000-00805f9b34fb`
- Command Char: `0000ae01-...` (Write)
- Notify Char: `0000ae02-...` (Notify)

### Команды
- INIT: `F0 00 03 01 05 00 09`
- Volume Up: `F0 00 05 A0 10 0E 18 12 ED`
- Volume Down: `F0 00 05 A0 10 0E 18 10 EB`
- EQ Preset: `F0 00 06 A0 10 0E 26 01 XX CS`

## Сборка

### Web (работает)
```bash
flutter build web --release
# Открыть build/web/index.html в браузере
```

### Linux (требует dev-пакеты)
```bash
# Установить зависимости (требует sudo):
sudo apt-get install libgtk-3-dev cmake ninja-build clang

# Сборка
flutter build linux
```

Или использовать локальные библиотеки (см. инструкции в code_comments).

## Эмуляция

Для тестирования без реального устройства используется эмулятор:
- Веб-версия работает в режиме эмуляции
- Для Linux требуется реальное устройство PROLOGY

## Зависимости

- `flutter_blue_plus: ^1.32.0` - BLE (только для мобильных/Linux с BLE)
- `provider: ^6.1.1` - состояние
- `hex: ^0.2.0` - работа с hex

## Статус

- [x] Модель состояния PROLOGY
- [x] Протокол команд  
- [x] UI экраны
- [x] Web сборка (работает)
- [ ] Linux сборка (требует dev-пакеты)
- [ ] BLE подключение (требует реального устройства)
