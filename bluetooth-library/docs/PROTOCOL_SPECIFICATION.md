# PROLOGY Bluetooth Protocol Specification

Детальная спецификация протокола взаимодействия с устройствами PROLOGY.

## Содержание

1. [Физический уровень](#физический-уровень)
2. [Канальный уровень](#канальный-уровень)
3. [Протокол приложения](#протокол-приложения)
4. [Команды и ответы](#команды-и-ответы)
5. [Примеры обмена](#примеры-обмена)

---

## Физический уровень

### Тип подключения

| Параметр | Значение |
|----------|----------|
| Тип | Classic Bluetooth (BR/EDR) |
| Профиль | SPP (Serial Port Profile) |
| UUID | `00001101-0000-1000-8000-00805F9B34FB` |
| Частота | 2.4 GHz ISM band |
| Модуляция | GFSK |

### MAC адрес устройства

```
90:20:71:5E:48:10
```

### Параметры RFCOMM

| Параметр | Значение |
|----------|----------|
| Канал | 1 (по умолчанию) |
| MTU | 127 байт (по умолчанию) |
| Flow Control | Аппаратный (RTS/CTS) |

---

## Канальный уровень

### Процесс подключения

```
┌─────────────┐         ┌─────────────┐
│   Client    │         │   PROLOGY   │
│             │         │   Device    │
└──────┬──────┘         └──────┬──────┘
       │                       │
       │  INQUIRY (scan)       │
       │──────────────────────>│
       │                       │
       │  INQUIRY RESPONSE     │
       │<──────────────────────│
       │  (MAC: 90:20:71:5E:48:10)
       │                       │
       │  PAGE (connect)       │
       │──────────────────────>│
       │                       │
       │  PAGE RESPONSE        │
       │<──────────────────────│
       │                       │
       │  RFCOMM SABM          │
       │  (channel 1)          │
       │──────────────────────>│
       │                       │
       │  RFCOMM UA            │
       │<──────────────────────│
       │                       │
       │  L2CAP CONFIG         │
       │──────────────────────>│
       │                       │
       │  L2CAP CONFIG RESP    │
       │<──────────────────────│
       │                       │
       │  Connection Ready     │
       │                       │
```

### Таймауты

| Операция | Таймаут |
|----------|---------|
| Подключение | 30 секунд |
| Отправка данных | 10 секунд |
| Ожидание ответа | 5 секунд |
| Keep-alive | 60 секунд |

---

## Протокол приложения

### Формат сообщений

#### ASCII режим (основной)

```
<COMMAND>[<PARAMS>]\r\n
```

- `COMMAND` - текстовая команда (3-20 символов)
- `PARAMS` - опциональные параметры
- `\r\n` - завершающая последовательность (CR+LF)

#### Бинарный режим

```
[SYNC][LENGTH][CMD][DATA][CHECKSUM]
```

| Поле | Размер | Описание |
|------|--------|----------|
| SYNC | 2 байта | Синхронизация (0xAA 0x55) |
| LENGTH | 1 байт | Длина данных |
| CMD | 1 байт | Код команды |
| DATA | N байт | Данные |
| CHECKSUM | 1 байт | Контрольная сумма |

### Кодировка

- **Текстовые команды:** ASCII (US-ASCII)
- **Бинарные данные:** Raw bytes
- **Числа:** Big-endian

---

## Команды и ответы

### Системные команды

#### AUTH - Авторизация

**Запрос:**
```
AUTH\r\n
```

**Ответ (успех):**
```
OK\r\n
```

**Ответ (ошибка):**
```
ERROR:AUTH_FAILED\r\n
```

#### PING - Проверка связи

**Запрос:**
```
PING\r\n
```

**Ответ:**
```
PONG\r\n
```

#### GET_STATUS - Получить статус

**Запрос:**
```
GET_STATUS\r\n
```

**Ответ:**
```
STATUS:ONLINE,BT:CONNECTED,VOLT:12.5,TEMP:35\r\n
```

**Параметры:**
- `ONLINE/OFFLINE` - состояние
- `CONNECTED/DISCONNECTED` - Bluetooth
- `VOLT:x.x` - напряжение (V)
- `TEMP:xx` - температура (°C)

### Команды эквалайзера

#### GET_EQ - Получить настройки EQ

**Запрос:**
```
GET_EQ\r\n
```

**Ответ:**
```
EQ:50,60,70,80,90\r\n
```

**Параметры:** 5 значений (0-100) для полос:
1. 60 Hz
2. 150 Hz
3. 400 Hz
4. 1 kHz
5. 3 kHz

#### SET_EQ - Установить настройки EQ

**Запрос:**
```
SET_EQ=50,60,70,80,90\r\n
```

**Ответ:**
```
OK\r\n
```

или

```
ERROR:INVALID_PARAMS\r\n
```

### Аудио команды

#### VOLUME_UP - Увеличить громкость

**Запрос:**
```
VOLUME_UP\r\n
```

**Ответ:**
```
VOLUME:25\r\n
```

#### VOLUME_DOWN - Уменьшить громкость

**Запрос:**
```
VOLUME_DOWN\r\n
```

**Ответ:**
```
VOLUME:24\r\n
```

#### MUTE - Включить беззвучный режим

**Запрос:**
```
MUTE\r\n
```

**Ответ:**
```
MUTE:ON\r\n
```

### Команды воспроизведения

#### PLAY - Воспроизведение

**Запрос:**
```
PLAY\r\n
```

**Ответ:**
```
PLAYING\r\n
```

#### PAUSE - Пауза

**Запрос:**
```
PAUSE\r\n
```

**Ответ:**
```
PAUSED\r\n
```

#### STOP - Остановить

**Запрос:**
```
STOP\r\n
```

**Ответ:**
```
STOPPED\r\n
```

#### NEXT - Следующий трек

**Запрос:**
```
NEXT\r\n
```

**Ответ:**
```
TRACK:5\r\n
```

#### PREV - Предыдущий трек

**Запрос:**
```
PREV\r\n
```

**Ответ:**
```
TRACK:3\r\n
```

### Команды источника

#### GET_SOURCE - Получить текущий источник

**Запрос:**
```
GET_SOURCE\r\n
```

**Ответ:**
```
SOURCE:BT\r\n
```

**Возможные значения:**
- `BT` - Bluetooth
- `USB` - USB
- `AUX` - AUX вход
- `FM` - FM радио

#### SET_SOURCE - Переключить источник

**Запрос:**
```
SET_SOURCE=USB\r\n
```

**Ответ:**
```
SOURCE:USB\r\n
```

---

## Примеры обмена

### Пример 1: Авторизация и получение статуса

```
Client: AUTH\r\n
Device: OK\r\n

Client: GET_STATUS\r\n
Device: STATUS:ONLINE,BT:CONNECTED,VOLT:12.5,TEMP:35\r\n
```

### Пример 2: Настройка эквалайзера

```
Client: GET_EQ\r\n
Device: EQ:50,50,50,50,50\r\n

Client: SET_EQ=60,70,80,70,60\r\n
Device: OK\r\n

Client: GET_EQ\r\n
Device: EQ:60,70,80,70,60\r\n
```

### Пример 3: Управление воспроизведением

```
Client: PLAY\r\n
Device: PLAYING\r\n

Client: VOLUME_UP\r\n
Device: VOLUME:30\r\n

Client: VOLUME_UP\r\n
Device: VOLUME:31\r\n

Client: PAUSE\r\n
Device: PAUSED\r\n

Client: STOP\r\n
Device: STOPPED\r\n
```

### Пример 4: Переключение источников

```
Client: GET_SOURCE\r\n
Device: SOURCE:BT\r\n

Client: SET_SOURCE=USB\r\n
Device: SOURCE:USB\r\n

Client: GET_SOURCE\r\n
Device: SOURCE:USB\r\n
```

---

## Обработка ошибок

### Коды ошибок

| Код | Описание |
|-----|----------|
| `OK` | Успех |
| `ERROR` | Общая ошибка |
| `ERROR:UNKNOWN_CMD` | Неизвестная команда |
| `ERROR:INVALID_PARAMS` | Неверные параметры |
| `ERROR:AUTH_FAILED` | Ошибка авторизации |
| `ERROR:TIMEOUT` | Таймаут операции |
| `ERROR:BUSY` | Устройство занято |
| `ERROR:NOT_READY` | Устройство не готово |

### Формат сообщений об ошибках

```
ERROR:<CODE>[:<DETAILS>]\r\n
```

**Примеры:**
```
ERROR:UNKNOWN_CMD\r\n
ERROR:INVALID_PARAMS:EQ value out of range\r\n
ERROR:AUTH_FAILED:Invalid PIN\r\n
```

---

## Рекомендации по реализации

### 1. Буферизация

Используйте буфер для чтения:
```java
byte[] buffer = new byte[1024];
int bytesRead = inputStream.read(buffer);
```

### 2. Парсинг ответов

Разделяйте обработку по `\r\n`:
```java
String response = new String(data, StandardCharsets.US_ASCII);
String[] lines = response.split("\r\n");
for (String line : lines) {
    processLine(line);
}
```

### 3. Таймауты

Всегда устанавливайте таймауты:
```java
manager.setConnectTimeout(30000);
manager.setIoTimeout(10000);
```

### 4. Повторные попытки

Реализуйте логику повторных попыток:
```java
int retries = 3;
while (retries > 0) {
    boolean success = sendCommand("AUTH");
    if (success) break;
    retries--;
    Thread.sleep(1000);
}
```

### 5. Логирование

Логируйте весь обмен:
```java
Log.d("BT", "TX: " + command);
Log.d("BT", "RX: " + response);
```

---

## Безопасность

### Ограничения

1. **Нет шифрования** - данные передаются открыто
2. **Нет аутентификации** - любой может подключиться
3. **Нет целостности** - нет проверки CRC

### Рекомендации

1. Используйте сопряжение устройств
2. Ограничьте видимость устройства
3. Реализуйте свой уровень аутентификации

---

*Protocol Specification v1.0.0 | 2026-03-02*
