# Динамический анализ PROLOGY - альтернативы

## Проблема
Эмулятор Android не запускается на текущей системе (Linux Mint 22.3, Intel HD Graphics 3000).
Возможные причины:
- Несовместимость Vulkan/OpenGL драйверов
- Проблемы с виртуализацией
- Особенности конфигурации AVD

## Варианты решения

### 1. Реальное Android устройство (рекомендуется)
- Включить "Отладка по USB" на Android устройстве
- Подключить к ПК через USB
- `adb devices` → увидит устройство
- Установить PROLOGY APK: `adb install apk/PROLOGY-140-5.0.55.apk`
- Запустить Frida: `adb shell '/data/local/tmp/frida-server &'`

### 2. Установка Frida на реальное устройство
```bash
# Копирование frida-server (уже скачан в /tmp/frida-server)
adb push /tmp/frida-server /data/local/tmp/frida-server
adb shell "chmod 755 /data/local/tmp/frida-server"
adb shell "/data/local/tmp/frida-server &"

# Проверка (на хосте)
export PATH=~/Android/sdk/platform-tools:$PATH
frida-ps -U
```

### 3. Альтернативные эмуляторы
- **Genymotion** (требует регистрацию)
- **Android-x86** (запуск в VirtualBox)
- **Redroid** (Docker контейнер с Android)

### 4. Пропустить динамический анализ
- Использовать только статический анализ (уже выполнен на 90%)
- Документация в `docs/prology_analysis/APK_ANALYSIS_FULL.md`
- Готовый Linux-клиент: `linux_receiver_control.py`

## Текущий статус
✅ Android SDK установлен: `~/Android/sdk`
✅ Java JDK 17 установлен: `~/java/jdk-17.0.9+9`
✅ AVD создан: `PrologyEmulator` (Android 13, x86_64)
✅ Frida Server скачан: `/tmp/frida-server`
✅ Linux-клиент готов: `linux_receiver_control.py`

❌ Эмулятор не запускается (проблемы с графикой/виртуализацией)

## Следующие шаги
1. Подключить реальное Android устройство
2. Или использовать статический анализ для завершения проекта
