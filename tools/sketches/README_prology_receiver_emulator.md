# PROLOGY Receiver Emulator - ESP32

Эмулятор автомагнитолы PROLOGY CMD 300 на базе ESP32.

## Описание

Прошивка реализует BLE GATT сервер, эмулирующий ресивер PROLOGY:
- Service UUID: `0000ae00-0000-1000-8000-00805f9b34fb`
- TX Characteristic (Write): `0000ae01-...`
- RX Characteristic (Notify): `0000ae02-...`

## Поддерживаемые команды

| Команда | Описание | Статус |
|---------|----------|--------|
| 0x01 Init | Инициализация сессии | ✅ |
| 0x04 Heartbeat | Keep-alive (1 раз в сек) | ✅ |
| 0xA0 Volume | Громкость (0-28) | ✅ |
| 0xA0 EQ Preset | Пресеты (FLAT/ROCK/POP/JAZZ/CLASSIC) | ✅ |
| 0xA0 Balance | Баланс (лево/право) | ✅ |
| 0xA0 Fader | Фейдер (перед/зад) | ✅ |
| 0xA0 Input | Вход (USB/SD/BT/AUX/RADIO) | ✅ |
| 0x80 Write Param | Настройки (EQ, X-Over) | 🔬 Требует перехвата |
| 0x8A Config Ext | Расширенная конфигурация | 🔬 Требует перехвата |

## Быстрый старт

### 1. Подключение через nRF Connect
1. Откройте nRF Connect на телефоне
2. Найдите устройство **PROLOGY_BLE**
3. Подключитесь, включите уведомления (Notify) для `0xAE02`
4. Отправьте команду Init: `F0 00 03 01 05 00 09` в `0xAE01`

### 2. Serial CLI (через монитор порта)
Скорость: **115200 baud**

Доступные команды:
```
vol N       - Установить громкость (0-28)
vol+        - Громкость +
vol-        - Громкость -
mute        - Вкл/выкл Mute
eq flat     - Эквалайзер FLAT
eq rock     - Эквалайзер ROCK
eq pop      - Эквалайзер POP
eq jazz     - Эквалайзер JAZZ
eq classic  - Эквалайзер CLASSIC
bal N       - Баланс (-128..+127)
fad N       - Фейдер (-128..+127)
bass N      - Bass (-12..+12)
treble N    - Treble (-12..+12)
input usb   - Вход USB
input sd    - Вход SD
input bt    - Вход Bluetooth
input aux   - Вход AUX
input radio - Вход RADIO
status      - Показать текущее состояние
raw XX...   - Отправить сырые HEX байты
help        - Помощь
```

### 3. Тестирование команд

После подключения через nRF Connect отправьте:
- **Init:** `F0 00 03 01 05 00 09`
- **Volume +:** `F0 00 05 A0 10 0E 18 12 ED`
- **Volume -:** `F0 00 05 A0 10 0E 18 10 EB`
- **EQ ROCK:** `F0 00 06 A0 10 0E 26 01 03 BB`

## Прошивка

```bash
# Компиляция
arduino-cli compile -b esp32:esp32:esp32doit-devkit-v1 prology_receiver_emulator.ino

# Загрузка
arduino-cli upload -p /dev/ttyUSB0 -b esp32:esp32:esp32doit-devkit-v1 -v
```

## Мониторинг

В Serial Monitor (115200) будут отображаться:
- Подключения/отключения
- Принятые команды (RX CMD)
- Отправленные уведомления (TX NOTIFY)
- Текущее состояние устройства

## Архитектура

Основано на документации:
- `/media/mi/home_ext2/tools/PROLOGY_TOOLKIT/docs/RCSP_PROTOCOL.md`
- `/home/mi/esp32-projects/prology_ble_receiver_emulator.md`
- `/home/mi/esp32-projects/prology_architecture_analysis.md`

## Дальнейшее развитие

1. Перехват трафика через Frida для расшифровки команд 0x80/0x8A
2. Добавление поддержки X-Over (кроссовер)
3. Добавление Time Alignment
4. Реализация 25-band EQ (побандовая настройка)
5. Создание клиента (ESP32 как BLE client)

## Статус

✅ Базовая функциональность работает
🔬 Требуется дозапись для полной эмуляции
