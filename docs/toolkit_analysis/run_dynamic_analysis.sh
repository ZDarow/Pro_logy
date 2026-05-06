#!/bin/bash
# Динамический анализ PROLOGY без модификации APK
# Требуется: реальное Android устройство с root или эмулятор

set -e

APK_PATH="/media/mi/home_ext2/tools/PROLOGY_TOOLKIT/apk/PROLOGY-140-5.0.55.apk"
FRIDA_SCRIPT="/media/mi/home_ext2/tools/PROLOGY_TOOLKIT/ble/interceptor/frida_bluetooth_hook.js"
DEVICE_IP="127.0.0.1:5555"  # или реальный IP устройства

echo "🔵 Динамический анализ PROLOGY"
echo "=================================="

# 1. Проверка устройства
echo "📱 Проверка подключения..."
adb devices | grep -v "List" | grep -q "device"
if [ $? -ne 0 ]; then
    echo "❌ Устройство не найдено!"
    echo "   Подключите Android устройство или запустите эмулятор"
    exit 1
fi
echo "✅ Устройство подключено"

# 2. Установка APK если нужно
echo "📦 Проверка наличия PROLOGY..."
adb shell "pm list packages | grep -q com.prology"
if [ $? -ne 0 ]; then
    echo "   Установка APK..."
    adb install "$APK_PATH"
fi
echo "✅ PROLOGY установлен"

# 3. Запуск Frida Server на устройстве
echo "🚀 Проверка Frida Server..."
adb shell "ps -A | grep -q frida-server"
if [ $? -ne 0 ]; then
    echo "   Запуск Frida Server..."
    adb shell "/data/local/tmp/frida-server &"
    sleep 2
fi
echo "✅ Frida Server запущен"

# 4. Запуск приложения
echo "📱 Запуск PROLOGY..."
adb shell "am start -n com.prology/.MainActivity"

# 5. Выполнение скрипта перехвата
echo ""
echo "🎯 Запуск перехвата Bluetooth-трафика..."
echo "   Скрипт: $FRIDA_SCRIPT"
echo "   Для остановки: Ctrl+C"
echo ""

frida -U -f com.prology -l "$FRIDA_SCRIPT"

echo ""
echo "✅ Анализ завершен"
echo "📋 Логи: adb logcat | grep -i 'frida\|bluetooth\|prology'"
