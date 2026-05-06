#!/bin/bash
# Установка PROLOGY APK на эмулятор

export ANDROID_HOME=~/Android/sdk
export PATH=$ANDROID_HOME/platform-tools:$PATH

APK_PATH="/media/mi/home_ext2/tools/PROLOGY_TOOLKIT/apk/PROLOGY-140-5.0.55.apk"

echo "🔵 Установка PROLOGY APK на эмулятор..."

# Проверка подключения
if ! adb devices | grep -q "emulator"; then
    echo "❌ Эмулятор не запущен!"
    echo "   Запустите: /media/mi/home_ext2/tools/PROLOGY_TOOLKIT/run_emulator.sh"
    exit 1
fi

# Проверка наличия APK
if [ ! -f "$APK_PATH" ]; then
    echo "❌ APK не найден: $APK_PATH"
    exit 1
fi

echo "📦 Установка APK..."
adb install "$APK_PATH"

if [ $? -eq 0 ]; then
    echo "✅ APK успешно установлен!"
    echo ""
    echo "🚀 Запуск приложения:"
    echo "   adb shell am start -n com.prology/.MainActivity"
else
    echo "❌ Ошибка установки"
    exit 1
fi
