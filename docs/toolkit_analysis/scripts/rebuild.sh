#!/bin/bash
#
# rebuild.sh - Скрипт для сборки APK из декомпилированных ресурсов
# Использование: ./rebuild.sh <decompiled_dir> [output_apk]
#

set -e

# Настройка путей
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
PROJECT_DIR="$(dirname "$SCRIPT_DIR")"
OUTPUT_DIR="${PROJECT_DIR}/output/rebuilt"
LOG_DIR="${PROJECT_DIR}/logs"
SIGNATURE_DIR="${PROJECT_DIR}/output/signatures"

# Настройка PATH для инструментов
export PATH="$HOME/.local/bin:$PATH:$HOME/Android/Sdk/platform-tools:$HOME/Android/Sdk/build-tools/33.0.0"

# Цвета для вывода
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
NC='\033[0m' # No Color

log_info() {
    echo -e "${GREEN}[INFO]${NC} $1"
}

log_warn() {
    echo -e "${YELLOW}[WARN]${NC} $1"
}

log_error() {
    echo -e "${RED}[ERROR]${NC} $1"
}

# Проверка аргументов
if [ $# -lt 1 ]; then
    echo "Использование: $0 <decompiled_dir> [output_apk]"
    echo "Пример: $0 ./output/decompiled/PROLOGY-140-5.0.55"
    echo "        $0 ./output/decompiled/PROLOGY-140-5.0.55 ./my_app.apk"
    exit 1
fi

DECOMPILED_DIR="$1"
RESOURCES_DIR="$DECOMPILED_DIR/resources"

# Проверка существования директории с ресурсами
if [ ! -d "$RESOURCES_DIR" ]; then
    log_error "Директория с ресурсами не найдена: $RESOURCES_DIR"
    log_error "Убедитесь, что вы указали правильную директорию декомпиляции"
    exit 1
fi

APK_NAME=$(basename "$DECOMPILED_DIR")
OUTPUT_APK="${2:-$OUTPUT_DIR/${APK_NAME}_rebuilt.apk}"
UNSIGNED_APK="$OUTPUT_DIR/${APK_NAME}_unsigned.apk"

# Создание директорий
mkdir -p "$OUTPUT_DIR"
mkdir -p "$SIGNATURE_DIR"

log_info "Начало сборки APK..."
log_info "Исходная директория: $RESOURCES_DIR"
log_info "Выходной файл: $OUTPUT_APK"

# Шаг 1: Сборка APK с помощью apktool
log_info "[1/4] Сборка APK (apktool build)..."
apktool b -o "$UNSIGNED_APK" "$RESOURCES_DIR" 2>&1 | tee "$LOG_DIR/apktool_build_${APK_NAME}.log"

# Шаг 2: Выравнивание APK с помощью zipalign
log_info "[2/4] Выравнивание APK (zipalign)..."
ALIGNED_APK="$OUTPUT_DIR/${APK_NAME}_aligned.apk"
zipalign -v -p 4 "$UNSIGNED_APK" "$ALIGNED_APK" 2>&1 | tee "$LOG_DIR/zipalign_${APK_NAME}.log"

# Шаг 3: Генерация ключа для подписи (если не существует)
KEYSTORE="$SIGNATURE_DIR/debug.keystore"
if [ ! -f "$KEYSTORE" ]; then
    log_info "[3/4] Генерация debug ключа..."
    keytool -genkey -v \
        -keystore "$KEYSTORE" \
        -alias debug \
        -keyalg RSA \
        -keysize 2048 \
        -validity 10000 \
        -storepass android \
        -keypass android \
        -dname "CN=Android Debug,O=Android,C=US" 2>&1 | tee "$LOG_DIR/keytool_${APK_NAME}.log"
else
    log_info "[3/4] Debug ключ найден: $KEYSTORE"
fi

# Шаг 4: Подпись APK
log_info "[4/4] Подпись APK (apksigner)..."
apksigner sign \
    --ks "$KEYSTORE" \
    --ks-pass pass:android \
    --ks-key-alias debug \
    --key-pass pass:android \
    --out "$OUTPUT_APK" \
    "$ALIGNED_APK" 2>&1 | tee "$LOG_DIR/apksigner_${APK_NAME}.log"

# Проверка подписи
log_info "Проверка подписи..."
apksigner verify --verbose "$OUTPUT_APK" 2>&1 | tee "$LOG_DIR/apksigner_verify_${APK_NAME}.log"

# Очистка временных файлов
rm -f "$UNSIGNED_APK" "$ALIGNED_APK"

# Создание отчета о сборке
log_info "Создание отчета о сборке..."
cat > "$OUTPUT_DIR/${APK_NAME}_BUILD_REPORT.txt" << EOF
Отчет о сборке APK
==================
Исходная директория: $DECOMPILED_DIR
Выходной файл: $OUTPUT_APK
Дата сборки: $(date)

Этапы сборки:
------------
1. apktool build - Сборка из smali
2. zipalign - Выравнивание по 4 байтам
3. keytool - Генерация debug ключа
4. apksigner - Подпись APK

Результат:
---------
Размер APK: $(du -h "$OUTPUT_APK" | cut -f1)
Подпись: Verified (debug.keystore)

Примечания:
----------
- Используется debug ключ для тестирования
- Для production сборки используйте свой keystore
- APK готов к установке на устройство с отладкой по USB
EOF

log_info "Сборка завершена!"
log_info "Готовый APK: $OUTPUT_APK"
echo ""
echo "Для установки на устройство:"
echo "  adb install -r $OUTPUT_APK"
echo ""
echo "Для проверки подписи:"
echo "  apksigner verify --verbose $OUTPUT_APK"
