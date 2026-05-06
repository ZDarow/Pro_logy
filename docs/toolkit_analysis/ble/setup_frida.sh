#!/bin/bash
# Автоматическая установка Frida сервера на Android устройство

set -e

FRIDA_VERSION="17.7.3"
FRIDA_URL_BASE="https://github.com/frida/frida/releases/download/${FRIDA_VERSION}"

echo "=========================================="
echo "📱 Установка Frida сервера"
echo "=========================================="

# Проверка подключения устройства
echo "🔍 Проверка устройства..."
DEVICE_COUNT=$(adb devices 2>/dev/null | grep -c "device$" || echo "0")

if [ "$DEVICE_COUNT" -eq 0 ]; then
    echo "❌ Устройства не найдены!"
    echo "💡 Подключите телефон через USB или запустите эмулятор"
    exit 1
fi

echo "✅ Устройство подключено"

# Определение архитектуры
ARCH=$(adb shell getprop ro.product.cpu.abi 2>/dev/null | tr -d '\r')
echo "📐 Архитектура: $ARCH"

# Выбор правильного frida-server
case $ARCH in
    arm64-v8a)
        FRIDA_FILE="frida-server-${FRIDA_VERSION}-android-arm64"
        ;;
    armeabi-v7a)
        FRIDA_FILE="frida-server-${FRIDA_VERSION}-android-arm"
        ;;
    x86_64)
        FRIDA_FILE="frida-server-${FRIDA_VERSION}-android-x86_64"
        ;;
    x86)
        FRIDA_FILE="frida-server-${FRIDA_VERSION}-android-x86"
        ;;
    *)
        echo "❌ Неподдерживаемая архитектура: $ARCH"
        exit 1
        ;;
esac

FRIDA_URL="${FRIDA_URL_BASE}/${FRIDA_FILE}.xz"

echo "📥 Загрузка: $FRIDA_FILE"
echo "   URL: $FRIDA_URL"

# Загрузка
cd /tmp
if command -v xz &> /dev/null; then
    curl -L "$FRIDA_URL" -o "${FRIDA_FILE}.xz"
    unxz "${FRIDA_FILE}.xz"
else
    curl -L "${FRIDA_URL/.xz/.xz}" -o "${FRIDA_FILE}.xz"
    tar -xJf "${FRIDA_FILE}.xz"
fi

chmod 755 "$FRIDA_FILE"

echo "✅ Загружено: $(ls -lh $FRIDA_FILE | awk '{print $5}')"

# Установка на устройство
echo "📤 Установка на устройство..."
adb push "$FRIDA_FILE" /data/local/tmp/frida-server
adb shell "chmod 755 /data/local/tmp/frida-server"

echo "✅ Установлено"

# Проверка запуска
echo "🧪 Проверка..."
adb shell "/data/local/tmp/frida-server --version" && echo "✅ Frida сервер работает!"

echo ""
echo "=========================================="
echo "🎯 Запуск логирования"
echo "=========================================="
echo ""
echo "1. Запустите frida-server на устройстве:"
echo "   adb shell '/data/local/tmp/frida-server &'"
echo ""
echo "2. Установите PROLOGY APK:"
echo "   adb install /home/mi/AutoSettingEQ/PROLOGY-140-5.0.55.apk"
echo ""
echo "3. Запустите логирование:"
echo "   cd /home/mi/7a/prology/ble_peripheral"
echo "   python3 prology_logger.py"
echo ""
echo "=========================================="
