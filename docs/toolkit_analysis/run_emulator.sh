#!/bin/bash
# Запуск Android эмулятора для PROLOGY TOOLKIT

export ANDROID_HOME=~/Android/sdk
export JAVA_HOME=~/java/jdk-17.0.9+9
export PATH=$JAVA_HOME/bin:$ANDROID_HOME/emulator:$ANDROID_HOME/platform-tools:$ANDROID_HOME/cmdline-tools/latest/bin:$PATH

echo "🔵 Запуск Android эмулятора (PrologyEmulator)..."
echo "   Для остановки: в терминале эмулятора нажмите Ctrl+C"
echo ""

# Запуск эмулятора с параметрами для ускорения
emulator -avd PrologyEmulator -no-snapshot -wipe-data -no-boot-anim &
EMULATOR_PID=$!

echo "✅ Эмулятор запущен (PID: $EMULATOR_PID)"
echo ""
echo "📱 Ожидание загрузки системы..."

# Ожидание загрузки
adb wait-for-device
echo "✅ Устройство подключено"

# Ожидание полной загрузки
echo "⏳ Ожидание загрузки Android..."
adb shell 'while [[ -z $(getprop sys.boot_completed) ]]; do sleep 1; done' 2>/dev/null
echo "✅ Android загружен!"

echo ""
echo "📱 Полезные команды:"
echo "  adb devices          - список устройств"
echo "  adb install file.apk - установка APK"
echo "  adb shell            - оболочка Android"
echo ""
echo "🛠  Для установки Frida:"
echo "  1. Скачайте frida-server: https://github.com/frida/frida/releases"
echo "  2. adb push frida-server /data/local/tmp/"
echo "  3. adb shell 'chmod 755 /data/local/tmp/frida-server'"
echo "  4. adb shell '/data/local/tmp/frida-server &'"
