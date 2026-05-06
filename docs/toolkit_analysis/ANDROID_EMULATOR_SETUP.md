# Android Emulator для PROLOGY TOOLKIT

## Установленные компоненты

- **Android SDK**: `~/Android/sdk`
- **Java JDK**: `~/java/jdk-17.0.9+9`
- **Emulator**: API 33 (Android 13), x86_64, Google APIs
- **AVD**: `PrologyEmulator`

## Скрипты управления

### 1. Запуск эмулятора
```bash
/media/mi/home_ext2/tools/PROLOGY_TOOLKIT/run_emulator.sh
```

### 2. Установка APK на эмулятор
```bash
/media/mi/home_ext2/tools/PROLOGY_TOOLKIT/install_apk_emulator.sh
```

### 3. Установка Frida Server
```bash
/media/mi/home_ext2/tools/PROLOGY_TOOLKIT/install_frida_emulator.sh
```

## Ручные команды

### Управление AVD
```bash
export ANDROID_HOME=~/Android/sdk
export JAVA_HOME=~/java/jdk-17.0.9+9
export PATH=$JAVA_HOME/bin:$ANDROID_HOME/emulator:$ANDROID_HOME/platform-tools:$PATH

# Список AVD
emulator -list-avds

# Запуск эмулятора
emulator -avd PrologyEmulator -no-snapshot

# Список устройств
adb devices

# Установка APK
adb install /path/to/app.apk

# Оболочка Android
adb shell
```

### Frida на эмуляторе
```bash
# Копирование Frida Server (если не использовали скрипт)
adb push /tmp/frida-server /data/local/tmp/frida-server
adb shell "chmod 755 /data/local/tmp/frida-server"

# Запуск Frida Server (на эмуляторе)
adb shell "/data/local/tmp/frida-server &"

# Проверка (на хосте)
frida-ps -U
```

## Динамический анализ с Frida

1. Запустить эмулятор: `run_emulator.sh`
2. Установить APK: `install_apk_emulator.sh`
3. Установить Frida: `install_frida_emulator.sh`
4. Запустить приложение на эмуляторе
5. Выполнить скрипт Frida:
   ```bash
   frida -U -f com.prology -l /media/mi/home_ext2/tools/PROLOGY_TOOLKIT/ble/interceptor/frida_bluetooth_hook.js
   ```

## Полезные ссылки

- Frida релизы: https://github.com/frida/frida/releases
- Документация Frida: https://frida.re/docs/home/
- Android SDK: https://developer.android.com/studio
