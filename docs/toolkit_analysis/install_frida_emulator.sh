#!/bin/bash
# Установка Frida Server на Android эмулятор

export ANDROID_HOME=~/Android/sdk
export PATH=$ANDROID_HOME/platform-tools:$PATH

FRIDA_SERVER="/tmp/frida-server"

echo "🔵 Установка Frida Server на эмулятор..."

# Проверка подключения
adb devices | grep -q "emulator"
if [ $? -ne 0 ]; then
    echo "❌ Эмулятор не запущен!"
    echo "   Запустите: /media/mi/home_ext2/tools/PROLOGY_TOOLKIT/run_emulator.sh"
    exit 1
fi

echo "✅ Эмулятор подключен"

# Копирование Frida Server
echo "📦 Копирование frida-server..."
adb push "$FRIDA_SERVER" /data/local/tmp/frida-server
adb shell "chmod 755 /data/local/tmp/frida-server"

echo "✅ Frida Server установлен!"
echo ""
echo "🚀 Запуск Frida Server (в отдельном терминале):"
echo "   adb shell '/data/local/tmp/frida-server &'"
echo ""
echo "📱 Проверка:"
echo "   frida-ps -U  # список процессов"
echo "   frida -U -f com.prology -l script.js  # запуск с скриптом"
