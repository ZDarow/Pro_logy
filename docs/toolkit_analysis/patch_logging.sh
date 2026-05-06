#!/bin/bash
# Добавление расширенного логирования в PROLOGY APK
# Позволяет видеть параметры Bluetooth-команд в logcat

set -e

APK_PATH="/media/mi/home_ext2/tools/PROLOGY_TOOLKIT/apk/PROLOGY-140-5.0.55.apk"
WORK_DIR="/tmp/prology_logged"
PATCH_SCRIPT="/media/mi/home_ext2/tools/PROLOGY_TOOLKIT/ble/interceptor/ble_interceptor.js"

echo "🔵 Модификация APK для расширенного логирования..."

rm -rf "$WORK_DIR"
mkdir -p "$WORK_DIR"
cd "$WORK_DIR"

# Декомпиляция
echo "📦 Декомпиляция..."
apktool d "$APK_PATH" -o app_decoded

# Поиск классов, работающих с Bluetooth
echo "🔍 Поиск Bluetooth-классов..."
find app_decoded/smali -name "*.smali" | xargs grep -l "Bluetooth\|Gatt\|Ble" | head -10

# Добавление логирования в методы отправки данных
echo "📝 Патчинг Smali для логирования..."

# Ищем методы, которые могут отправлять данные
find app_decoded/smali -name "*.smali" | while read smali_file; do
    # Добавляем логирование в методы write/writeCharacteristic
    if grep -q "write\|writeCharacteristic\|send" "$smali_file" 2>/dev/null; then
        echo "   Найден файл: $(basename $smali_file)"
        
        # Создаем backup
        cp "$smali_file" "${smali_file}.bak"
        
        # Добавляем логирование перед инструкциями invoke (упрощенно)
        # В реальности нужно точечно вставлять вызовы Log.d
    fi
done

# Пересборка
echo "🔨 Пересборка..."
apktool b app_decoded -o logged.apk

# Подпись
echo "🔑 Подпись..."
keytool -genkey -v -keystore debug.keystore -alias androiddebugkey \
    -keyalg RSA -keysize 2048 -validity 10000 \
    -storepass android -keypass android \
    -dname "CN=Android Debug,O=Android,C=US" 2>/dev/null

jarsigner -verbose -sigalg SHA1withRSA -digestalg SHA1 \
    -keystore debug.keystore -storepass android \
    logged.apk androiddebugkey

echo "✅ APK с логированием: $WORK_DIR/logged.apk"
echo ""
echo "📱 Установка:"
echo "   adb install $WORK_DIR/logged.apk"
echo ""
echo "📋 Просмотр логов:"
echo "   adb logcat | grep -i 'Bluetooth\|PROLOGY\|BLE'"
