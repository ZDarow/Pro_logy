# 🚀 PROLOGY - АВТОНОМНЫЙ СБОР ДАННЫХ

**Инструкция для запуска без подключения**

---

## 📋 ЧЕКЛИСТ ГОТОВНОСТИ

- [ ] Устройство заряжено
- [ ] Беспроводная отладка включена
- [ ] PROLOGY запущен
- [ ] Termux открыт

---

## 🔌 ШАГ 1: ПОДКЛЮЧЕНИЕ УСТРОЙСТВА

### Вариант A: WiFi (рекомендуется)

1. На устройстве:
   - Настройки → Для разработчиков
   - Беспроводная отладка → ВКЛ
   - Подключить устройство → IP:порт

2. В Termux:
```bash
adb connect 192.168.X.X:XXXXX
adb devices  # Проверка
```

### Вариант Б: USB

```bash
adb devices  # Должно показать устройство
```

---

## 🎯 ШАГ 2: ЗАПУСК PROLOGY

```bash
# Запустить приложение
adb shell am start -n com.prology/com.ryanheise.audioservice.AudioServiceActivity

# Проверить PID
adb shell pidof com.prology
```

---

## 📊 ШАГ 3: СБОР ДАННЫХ

### 3.1 Перехват ответов (15 мин)

```bash
# Терминал 1
frida --host 127.0.0.1:27042 -p <PID> -l /storage/emulated/0/Documents/prology_interceptor.js

# В приложении PROLOGY:
# - Изменить громкость
# - Изменить настройки эквалайзера
# - Переключить пресет
# - Подождать 2-3 минуты
```

**Результат:** `/storage/emulated/0/Documents/prology_responses.txt`

### 3.2 Дамп настроек (30 мин)

```bash
# Терминал 2 - отправка команд
# Создать prology_sender.js и запустить

# Или вручную отправить команды из:
cat /storage/emulated/0/Documents/prology_dump_commands.txt
```

**Результат:** Ответы устройства в логе

### 3.3 Извлечение данных (15 мин)

```bash
# Копирование файлов приложения
adb pull /data/data/com.prology/shared_prefs/ /storage/emulated/0/Documents/prology_data/shared_prefs/
adb pull /data/data/com.prology/files/ /storage/emulated/0/Documents/prology_data/files/
adb pull /data/data/com.prology/cache/ /storage/emulated/0/Documents/prology_data/cache/

# Проверка
ls -la /storage/emulated/0/Documents/prology_data/
```

**Результат:** Настройки, кэш, данные

### 3.4 Bluetooth HCI лог (30 мин)

```bash
# Включить логирование
adb shell setprop persist.bluetooth.btsnooplogmode true

# В приложении PROLOGY:
# - Выполнить все действия (громкость, EQ, и т.д.)
# - Подождать 5 минут

# Вытащить лог
adb pull /sdcard/btsnoop_hci.log /storage/emulated/0/Documents/prology_bluetooth.hci

# Отключить логирование
adb shell setprop persist.bluetooth.btsnooplogmode false
```

**Результат:** `/storage/emulated/0/Documents/prology_bluetooth.hci` (анализ в Wireshark)

---

## 📁 ШАГ 4: ПРОВЕРКА РЕЗУЛЬТАТОВ

```bash
# Проверить все файлы
ls -lh /storage/emulated/0/Documents/prology*.txt
ls -lh /storage/emulated/0/Documents/prology_data/
ls -lh /storage/emulated/0/Documents/prology_bluetooth.hci

# Посмотреть логи
cat /storage/emulated/0/Documents/prology_responses.txt | head -50
```

---

## 🎯 ПРИОРИТЕТЫ ВЫПОЛНЕНИЯ

| # | Задача | Время | Важность |
|---|--------|-------|----------|
| 1 | Перехват ответов | 15 мин | ⭐⭐⭐ |
| 2 | Извлечение DataStore | 15 мин | ⭐⭐⭐ |
| 3 | Bluetooth HCI лог | 30 мин | ⭐⭐ |
| 4 | Дамп команд | 30 мин | ⭐⭐ |

---

## 📊 ОЖИДАЕМЫЕ РЕЗУЛЬТАТЫ

После выполнения:

- `prology_responses.txt` - Ответы устройства (10-50 команд)
- `prology_data/shared_prefs/` - Настройки приложения
- `prology_data/files/` - Файлы данных
- `prology_bluetooth.hci` - Bluetooth трафик

**Общий объём:** ~1-5 MB данных

---

## 🆘 ВОЗМОЖНЫЕ ПРОБЛЕМЫ

### "Device offline"
```bash
# Решение:
adb disconnect
adb connect 192.168.X.X:XXXXX
```

### "PROLOGY not found"
```bash
# Запустить приложение:
adb shell am start -n com.prology/com.ryanheise.audioservice.AudioServiceActivity
```

### "Frida not found"
```bash
# Проверить установку:
frida --version

# Если нет:
pip install frida-tools
```

---

## ✅ ГОТОВО!

Когда все данные собраны:

```bash
# Создать отчёт
echo "Сбор данных завершён!"
echo "Файлы:"
ls -lh /storage/emulated/0/Documents/prology*
```

---

**Удачи! 🚀**
