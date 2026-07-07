# Архитектура обмена данными PROLOGY (RCSP Protocol)

## 1. Общая архитектура

Android App (Flutter) <--BLE GATT--> PROLOGY CMD 300 (Jieli AC6951)

Service UUID: 0000ae00-0000-1000-8000-00805f9b34fb
TX Char (Write): 0000ae01-...
RX Char (Notify): 0000ae02-...

## 2. Структура RCSP пакета

Формат для Prology (упрощенный):
[PREAMBLE][LEN][DATA...][CHECKSUM]
   1 байт    1 байт  N байт   1 байт

Preamble TX (App -> Device): 0xF0
Preamble RX (Device -> App): 0xC0
LEN: длина данных
CHECKSUM: XOR всех байтов данных + 0x94 (согласно PROTOCOL.md:29)
Пример: CS = 0x94 ^ data[0] ^ data[1] ... ^ data[N]

## 3. Этапы обмена (Session Flow)

1. INIT (0x01)
   TX: F0 00 03 01 05 00 09
   RX: C0 00 27 FF ... CS (39 bytes ID)

2. HEARTBEAT (0x04 / 0x05)
   TX: F0 00 04 04 SEQ CS (каждые ~1 сек)
   RX: C0 00 02 05 SEQ CS

3. WRITE PARAM (0x80)
   TX: Команды настройки (EQ, X-Over, TA)
   RX: C0 00 02 9F 80 CS (Confirm)

4. STATUS REQ (0x8E)
   TX: F0 00 03 8E CH CS
   RX: C0 00 .. 90 .. CS (Param Data)

5. TELEMETRY (0x92)
   RX: C0 00 02 92 XX CS (периодически)

## 4. Типы команд и ответов

CMD 0xA0 - Gain/Fade (Volume, Balance, Fader, Input)
  TX: F0 00 05 A0 10 0E 18 12 ED (Volume +)
  RX: C0 00 03 90 01 VV CS

CMD 0x80 - Write Param (EQ, X-Over, Time Alignment)
  Payload: [CHANNEL][EQ_TYPE][GAIN_1]...[GAIN_N]

Response 0x9A - EQ Data
  9A 21 PP VV...VV (25-band EQ preset)

Response 0x9A 2A - Balance
Response 0x9A 20 - Fader

## 5. Визуализация данных

### Инструменты захвата:

1. Frida перехват
   Скрипт: /media/mi/home_ext2/tools/PROLOGY_TOOLKIT/ble/interceptor/frida_bluetooth_hook.js
   Запуск: frida -U -f com.prology -l frida_bluetooth_hook.js

2. Python логгер
   Файл: /media/mi/home_ext2/tools/PROLOGY_TOOLKIT/ble/peripheral/prology_logger.py
   Логи: /home/mi/7a/prology/logs/
   Форматы: .log (читаемый), .json (для анализа)

3. HCI Snoop Log
   Файл: /media/mi/home_ext2/tools/PROLOGY_TOOLKIT/ble/logs/btsnoop_hci.log.zip
   Анализ через Wireshark
   Фильтр: btatt && frame.len < 300

### Структура лога (JSON):
{
  "direction": "TX" | "RX",
  "cmd": "0x01",
  "payload_hex": "050000",
  "checksum_valid": true,
  "timestamp": "2026-05-07T10:30:00"
}

## 6. Источники документации

1. /media/mi/home_ext2/tools/PROLOGY_TOOLKIT/docs/RCSP_PROTOCOL.md
   - Основная спецификация протокола
   - Session Flow (стр. 160-178)
   - Описание команд 0x01, 0x04, 0x80, 0x8A, 0x90, 0x9F

2. /media/mi/home_ext2/tools/JL_BLE/JIELI_BLE_FULL_ANALYSIS.md
   - Детальный разбор RCSP (стр. 1-106)
   - Wire format: 0xFE 0xDC 0xBA header
   - Opcode таблицы (стр. 430-468)

3. /media/mi/home_ext2/tools/PROLOGY_TOOLKIT/Sketches/PROLOGY_Emulator/PROLOGY_Emulator.ino
   - Реализация обработки команд (683 строки)
   - handleCommand() - парсинг пакетов
   - sendResponse() - формирование ответов

4. /media/mi/home_ext2/tools/apk-analysis/FLUTTER_BLUETOOTH_PROTOCOL_LEARNING.md
   - Структура Flutter приложения
   - Dart VM строки с командами

5. /media/mi/home_ext2/tools/JL_BLE/Android-JL_Bluetooth/doc/JieLi_Home_SDK_V4.2.0_html_en/html/_sources/development/module/use_flow.rst.txt
   - Диаграмма потока (graphviz)
   - Этапы: Init -> Scan -> Connect -> Operate

## 7. Недостающие данные

Для полной эмуляции не хватает (требуется Frida перехват):
- Точный формат payload для 0x80 (X-Over, Time Alignment)
- Структура 25-band EQ (побандовая настройка)
- Параметры Bass/Treble команд
- Подтвержденные субкоманды 0x8A (Config Ext)

## 8. Рекомендации

1. Запустить Frida перехват на реальном устройстве
2. Выполнить все действия в приложении (EQ, X-Over, TA)
3. Сохранить логи в /home/mi/7a/prology/logs/
4. Проанализировать .json логи для расшифровки payload
5. Обновить эмулятор ESP32 с полной поддержкой команд
