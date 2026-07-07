# 📘 Руководство по Prology DSP (Jieli AC6951)

> **Устройство:** Prology автомобильный DSP-процессор  
> **Чип:** Jieli AC6951 (MCU_6951_DSP)  
> **Прошивка:** VER 8.7DSP  
> **Протокол:** RCSP (Jieli-Tech proprietary) поверх BLE GATT

---

## 1. Обзор

Prology — автомобильный аудиопроцессор на базе китайского BLE-чипа Jieli AC6951.  
Управляется через мобильное приложение на Flutter (два BT-стека).

| Параметр | Значение |
|----------|----------|
| Чип | Jieli AC6951 |
| Прошивка | VER 8.7DSP |
| BLE | Bluetooth LE (Custom GATT) |
| Протокол | RCSP (Jieli-Tech) |
| MTU | 517/515 |
| Приложение | Flutter, 50 MB, 27 Listener классов |
| OTA SDK | jl_bt_ota V1.10.0 |

---

## 2. BLE GATT структура

### 2.1 Сервис RCSP

```
Service:        0xAE00  (Jieli RCSP Service)
├── TX:         0xAE01  (Handle 0x0009) — WRITE, WRITE_NO_RESPONSE
└── RX:         0xAE02  (Handle 0x000B) — NOTIFY
```

### 2.2 Формат пакетов RCSP

```
[Command] [Data...] [Checksum]

Checksum = (sum(all_bytes) + K) & 0xFF
  TX: K = 0x10
  RX: K = 0x40
```

**Пример:**
```
TX: 01 10
  sum(0x01) = 0x01
  + 0x10 = 0x11
  Но в логах: 01 10 (видимо 0x10 = data, checksum уже включён)
```

---

## 3. TX Команды (7 типов)

| Команда | HEX | Описание |
|---------|-----|----------|
| Init | `01 10` | Инициализация подключения |
| Query | `03 13` | Запрос информации об устройстве |
| Heartbeat | `04 15` | Поддержание соединения (keep-alive) |
| Write Param | `80 ...` | Запись параметров (EQ, настройки) |
| Ext Config | `8A 9B` | Расширенная конфигурация |
| Status Req | `8E 9F` | Запрос статуса |
| Gain/Fade | `A0 ...` | Управление громкостью/балансом |

---

## 4. RX Ответы (17 типов)

| Ответ | HEX | Описание |
|-------|-----|----------|
| Heartbeat | `05 ...` | Ответ на heartbeat |
| Identification | `FF ...` | Идентификация устройства (после Init) |
| Confirm | `9F ...` | Подтверждение записи |
| Telemetry | `92 ...` | Телеметрия |
| Status Data | `9A ...` | Данные статуса |

---

## 5. Последовательность подключения

```
1. Connect → Request MTU 517
2. Discover Services
3. Enable RX notifications (CCCD = 0100)
4. Send Init (0x01 0x10)
5. Receive Identification (0xFF ...)
6. Send Query/Heartbeat/Status
7. Receive responses
```

---

## 6. EQ Настройки

Захвачены 14 значений EQ из btsnoop лога:

| Band | HEX команда |
|------|------------|
| Band 1 | `80 40 C0 4A 00 40 10` |
| Band 2 | `80 40 C0 4A 00 40 11` |
| Band 3 | `80 40 C0 4A 00 40 12` |
| ... | ... |

Формат Write Param: `80 [7 bytes data]`

---

## 7. OTA обновление

**SDK:** `jl_bt_ota` V1.10.0

**Состояния OTA:**
| State | Описание |
|-------|----------|
| idle | Ожидание |
| start | Начало обновления |
| reconnect | Переподключение |
| working | Передача прошивки |

**Транспорты:** BLE, SPP, A2DP

---

## 8. Типичные проблемы

| Проблема | Причина | Решение |
|----------|---------|---------|
| Не подключается | Неправильный MTU | Запросить MTU 517 |
| Нет ответов | CCCD не включён | `write-descriptor value="0100"` |
| Неправильный checksum | K=0x10 для TX | `(sum(bytes) + 0x10) & 0xFF` |
| Устройство молчит | Не отправлен Init | Сначала `01 10` |
| OTA не начинается | Не в DFU режиме | Перезапустить в режиме OTA |

---

## 9. Тестирование через nRF Connect

### 9.1 Быстрый тест

```bash
cd /sdcard/Android-nRF-Connect/documentation/Automated\ tests/
bash test.sh -E EXTRA_ADDRESS "AA:BB:CC:DD:EE:FF" \
  ../../workspace/tests/templates/template_prology.xml
```

### 9.2 Ручная проверка через nRF Connect UI

1. Открыть nRF Connect → Scan
2. Найти устройство (может называться "Prology" или "JL_AC6951")
3. Подключиться
4. Найти сервис `0xAE00`
5. Включить уведомления на `0xAE02`
6. Записать `0110` в `0xAE01`
7. Проверить ответ `0xFF...` на `0xAE02`

---

## 10. Связь с nRF Connect проектом

### 10.1 XML-тесты

| Файл | Описание |
|------|----------|
| `workspace/tests/templates/template_prology.xml` | 10 тестов для Prology |

### 10.2 Python-скрипты (из Prology проекта)

| Файл | Описание |
|------|----------|
| `rcsp_checksum.py` | Генератор пакетов с checksum |
| `crc8_bruteforce.py` | Поиск CRC формулы |
| `checksum_reverse.py` | Реверс checksum алгоритма |
| `analyze_protocol.py` | Анализ btsnoop логов |

### 10.3 Что можно улучшить

- [ ] Автоматический генератор RCSP команд с правильным checksum
- [ ] Парсер RX ответов (0xFF, 0x9A, 0x92)
- [ ] OTA тест через `<dfu>` или `<mcu>`
- [ ] Интеграция с валидатором XML

---

## 11. Источники данных

| Файл | Что содержит |
|------|-------------|
| `btsnoop_hci.log` | Захваченные BLE пакеты |
| `PROTOCOL_RECONSTRUCTION.md` | Реконструкция протокола |
| `BTSNOOP_ANALYSIS_REPORT.md` | Анализ btsnoop логов |
| `APK_ANALYSIS_REPORT.md` | Анализ APK приложения |
| `MASTER_REPORT.md` | Полный отчёт |
| `Android-JL_Bluetooth-main/` | SDK для JL Bluetooth |
| `Android-JL_OTA-master/` | SDK для JL OTA |

---

*Последнее обновление: 7 апреля 2026*
