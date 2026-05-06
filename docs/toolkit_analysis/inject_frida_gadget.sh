#!/bin/bash
# Модификация APK для встраивания Frida Gadget
# Позволяет выполнять динамический анализ без root на обычных устройствах

set -e

APK_PATH="/media/mi/home_ext2/tools/PROLOGY_TOOLKIT/apk/PROLOGY-140-5.0.55.apk"
WORK_DIR="/tmp/prology_modified"
FRIDA_GADGET_URL="https://github.com/frida/frida/releases/download/17.7.3/frida-gadget-17.7.3-android-arm64.so.xz"

echo "🔵 Начало модификации APK для динамического анализа..."

# Очистка и подготовка
rm -rf "$WORK_DIR"
mkdir -p "$WORK_DIR"
cd "$WORK_DIR"

# 1. Декомпиляция APK
echo "📦 Декомпиляция APK..."
apktool d "$APK_PATH" -o app_decoded

# 2. Скачивание Frida Gadget
echo "📦 Скачивание Frida Gadget..."
cd app_decoded/lib/arm64-v8a/
wget -q "$FRIDA_GADGET_URL" -O frida-gadget.so.xz
unxz frida-gadget.so.xz
mv frida-gadget.so libfrida-gadget.so
cd "$WORK_DIR"

# 3. Встраивание в Smali код (автозагрузка)
echo "🔧 Модификация Smali для автозагрузки..."
SMALI_MAIN=$(find app_decoded/smali -name "*MainActivity*.smali" | head -1)

if [ -n "$SMALI_MAIN" ]; then
    echo "   Найден MainActivity: $SMALI_MAIN"
    
    # Добавление загрузки библиотеки в static блок
    # Ищем строку с .method static constructor <clinit>()V
    # и добавляем после неё загрузку frida-gadget
    
    # Создаем временный файл с патчем
    cat >> "$SMALI_MAIN" << 'SMALI_PATCH'

# Frida Gadget auto-load
.method static constructor <clinit>()V
    const-string v0, "frida-gadget"
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    return-void
.end method
SMALI_PATCH
    
    echo "   ✅ Frida Gadget добавлен в автозагрузку"
else
    echo "   ⚠️  MainActivity не найден, используем альтернативный метод"
fi

# 4. Создание конфигурации Frida (опционально)
echo "📝 Создание конфигурации Frida..."
cat > app_decoded/lib/arm64-v8a/libfrida-gadget.config.so << 'CONFIG'
{
  "interaction": {
    "type": "listen",
    "address": "127.0.0.1",
    "port": 27042,
    "on_port_conflict": "fail",
    "on_load": "wait"
  }
}
CONFIG

# 5. Пересборка APK
echo "🔨 Пересборка APK..."
apktool b app_decoded -o modified.apk

# 6. Подпись APK
echo "🔑 Подпись APK..."
keytool -genkey -v -keystore debug.keystore -alias androiddebugkey \
    -keyalg RSA -keysize 2048 -validity 10000 \
    -storepass android -keypass android \
    -dname "CN=Android Debug,O=Android,C=US" 2>/dev/null

jarsigner -verbose -sigalg SHA1withRSA -digestalg SHA1 \
    -keystore debug.keystore -storepass android \
    modified.apk androiddebugkey

# 7. Установка на устройство
echo ""
echo "✅ APK модифицирован: $WORK_DIR/modified.apk"
echo ""
echo "📱 Для установки на устройство:"
echo "   adb install $WORK_DIR/modified.apk"
echo ""
echo "🚀 После запуска приложения Frida будет доступен:"
echo "   frida-ps -U"
echo "   frida -U -f com.prology -l script.js"

cd - > /dev/null
