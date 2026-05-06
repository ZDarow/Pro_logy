#!/bin/bash
#
# analyze.sh - Скрипт для анализа декомпилированного APK
# Использование: ./analyze.sh <decompiled_dir>
#

set -e

# Настройка путей
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
PROJECT_DIR="$(dirname "$SCRIPT_DIR")"
LOG_DIR="${PROJECT_DIR}/logs"

# Настройка PATH для инструментов
export PATH="$HOME/.local/bin:$PATH:$HOME/Android/Sdk/platform-tools:$HOME/Android/Sdk/build-tools/33.0.0"

# Цвета для вывода
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
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

log_section() {
    echo -e "${BLUE}========================================${NC}"
    echo -e "${BLUE}$1${NC}"
    echo -e "${BLUE}========================================${NC}"
}

# Проверка аргументов
if [ $# -lt 1 ]; then
    echo "Использование: $0 <decompiled_dir>"
    echo "Пример: $0 ./output/decompiled/PROLOGY-140-5.0.55"
    exit 1
fi

DECOMPILED_DIR="$1"

# Проверка существования директории
if [ ! -d "$DECOMPILED_DIR" ]; then
    log_error "Директория не найдена: $DECOMPILED_DIR"
    exit 1
fi

APK_NAME=$(basename "$DECOMPILED_DIR")
ANALYSIS_DIR="$DECOMPILED_DIR/analysis"
mkdir -p "$ANALYSIS_DIR"

log_section "АНАЛИЗ APK: $APK_NAME"
log_info "Директория анализа: $ANALYSIS_DIR"
echo ""

# 1. Анализ AndroidManifest.xml
log_section "1. AndroidManifest.xml Анализ"
MANIFEST_FILE="$DECOMPILED_DIR/resources/AndroidManifest.xml"
if [ -f "$MANIFEST_FILE" ]; then
    log_info "Извлечение информации из манифеста..."
    
    # Package name
    PACKAGE=$(grep -oP 'package="\K[^"]+' "$MANIFEST_FILE" | head -1)
    echo "Package: $PACKAGE"
    
    # Version info
    VERSION_CODE=$(grep -oP 'versionCode="\K[^"]+' "$MANIFEST_FILE" | head -1)
    VERSION_NAME=$(grep -oP 'versionName="\K[^"]+' "$MANIFEST_FILE" | head -1)
    echo "Version Code: $VERSION_CODE"
    echo "Version Name: $VERSION_NAME"
    
    # Min/Target SDK
    MIN_SDK=$(grep -oP 'minSdkVersion="\K[^"]+' "$MANIFEST_FILE" | head -1)
    TARGET_SDK=$(grep -oP 'targetSdkVersion="\K[^"]+' "$MANIFEST_FILE" | head -1)
    echo "Min SDK: $MIN_SDK"
    echo "Target SDK: $TARGET_SDK"
    
    # Permissions
    echo ""
    echo "Permissions:"
    grep -oP '<uses-permission[^>]*android:name="\K[^"]+' "$MANIFEST_FILE" | sort | uniq > "$ANALYSIS_DIR/permissions.txt"
    cat "$ANALYSIS_DIR/permissions.txt"
    
    # Components
    echo ""
    echo "Activities:"
    grep -oP '<activity[^>]*android:name="\K[^"]+' "$MANIFEST_FILE" | head -20 > "$ANALYSIS_DIR/activities.txt"
    cat "$ANALYSIS_DIR/activities.txt"
    
    echo ""
    echo "Services:"
    grep -oP '<service[^>]*android:name="\K[^"]+' "$MANIFEST_FILE" | head -20 > "$ANALYSIS_DIR/services.txt"
    cat "$ANALYSIS_DIR/services.txt"
    
    echo ""
    echo "Receivers:"
    grep -oP '<receiver[^>]*android:name="\K[^"]+' "$MANIFEST_FILE" | head -20 > "$ANALYSIS_DIR/receivers.txt"
    cat "$ANALYSIS_DIR/receivers.txt"
else
    log_warn "AndroidManifest.xml не найден"
fi

echo ""

# 2. Анализ Java кода
log_section "2. Анализ Java кода"
JAVA_DIR="$DECOMPILED_DIR/java"
if [ -d "$JAVA_DIR" ]; then
    log_info "Статистика Java кода..."
    
    TOTAL_FILES=$(find "$JAVA_DIR" -name "*.java" | wc -l)
    echo "Всего Java файлов: $TOTAL_FILES"
    
    TOTAL_LINES=$(find "$JAVA_DIR" -name "*.java" -exec cat {} \; | wc -l)
    echo "Всего строк кода: $TOTAL_LINES"
    
    # Поиск интересных паттернов
    echo ""
    log_info "Поиск интересных паттернов..."
    
    echo "URL/HTTP запросы:"
    find "$JAVA_DIR" -name "*.java" -exec grep -l "http://" {} \; 2>/dev/null | head -10 > "$ANALYSIS_DIR/http_files.txt" || true
    cat "$ANALYSIS_DIR/http_files.txt"
    
    echo ""
    echo "Crypto usage:"
    find "$JAVA_DIR" -name "*.java" -exec grep -l "Cipher\|MessageDigest\|SecretKey" {} \; 2>/dev/null | head -10 > "$ANALYSIS_DIR/crypto_files.txt" || true
    cat "$ANALYSIS_DIR/crypto_files.txt"
    
    echo ""
    echo "SharedPreferences:"
    find "$JAVA_DIR" -name "*.java" -exec grep -l "SharedPreferences" {} \; 2>/dev/null | head -10 > "$ANALYSIS_DIR/sharedprefs_files.txt" || true
    cat "$ANALYSIS_DIR/sharedprefs_files.txt"
    
    echo ""
    echo "Native methods (JNI):"
    find "$JAVA_DIR" -name "*.java" -exec grep -l "native " {} \; 2>/dev/null | head -10 > "$ANALYSIS_DIR/native_files.txt" || true
    cat "$ANALYSIS_DIR/native_files.txt"
else
    log_warn "Директория с Java кодом не найдена"
fi

echo ""

# 3. Анализ ресурсов
log_section "3. Анализ ресурсов"
RES_DIR="$DECOMPILED_DIR/resources/res"
if [ -d "$RES_DIR" ]; then
    log_info "Структура ресурсов..."
    find "$RES_DIR" -type d | head -20
    
    echo ""
    echo "XML файлы:"
    find "$RES_DIR" -name "*.xml" | wc -l
    
    echo ""
    echo "Поиск hardcoded строк..."
    find "$RES_DIR" -name "strings.xml" -exec cat {} \; > "$ANALYSIS_DIR/strings.txt" 2>/dev/null || true
    echo "Строки сохранены в: $ANALYSIS_DIR/strings.txt"
else
    log_warn "Директория ресурсов не найдена"
fi

echo ""

# 4. Анализ сертификатов
log_section "4. Анализ сертификатов"
CERT_DIR="$DECOMPILED_DIR/certificates"
if [ -d "$CERT_DIR" ] && [ "$(ls -A $CERT_DIR 2>/dev/null)" ]; then
    log_info "Сертификаты:"
    ls -la "$CERT_DIR"
    
    # Попытка извлечь информацию о сертификате
    for cert in "$CERT_DIR"/*.RSA "$CERT_DIR"/*.SF; do
        if [ -f "$cert" ]; then
            echo ""
            echo "Файл: $(basename "$cert")"
            # keytool может не работать без keystore, но попробуем
        fi
    done
else
    log_warn "Сертификаты не найдены"
fi

echo ""

# 5. Анализ smali кода (для продвинутого анализа)
log_section "5. Анализ Smali кода"
SMALI_DIR="$DECOMPILED_DIR/resources/smali"
if [ -d "$SMALI_DIR" ]; then
    log_info "Статистика Smali..."
    TOTAL_SMALI=$(find "$SMALI_DIR" -name "*.smali" | wc -l)
    echo "Всего Smali файлов: $TOTAL_SMALI"
    
    echo ""
    echo "Поиск invoke-commands (вызовы методов)..."
    find "$SMALI_DIR" -name "*.smali" -exec grep -l "invoke-" {} \; 2>/dev/null | head -5 > "$ANALYSIS_DIR/smali_invokes.txt" || true
    cat "$ANALYSIS_DIR/smali_invokes.txt"
else
    log_warn "Smali директория не найдена"
fi

echo ""

# Создание сводного отчета
log_section "Создание сводного отчета"
cat > "$ANALYSIS_DIR/ANALYSIS_REPORT.txt" << EOF
Отчет об анализе APK
====================
APK: $APK_NAME
Дата анализа: $(date)
Директория: $DECOMPILED_DIR

Основные метрики:
----------------
Package: ${PACKAGE:-N/A}
Version: ${VERSION_NAME:-N/A} (${VERSION_CODE:-N/A})
Min SDK: ${MIN_SDK:-N/A}
Target SDK: ${TARGET_SDK:-N/A}
Java файлов: ${TOTAL_FILES:-N/A}
Строк кода: ${TOTAL_LINES:-N/A}
Smali файлов: ${TOTAL_SMALI:-N/A}

Найденные компоненты:
--------------------
Permissions: $(wc -l < "$ANALYSIS_DIR/permissions.txt" 2>/dev/null || echo 0)
Activities: $(wc -l < "$ANALYSIS_DIR/activities.txt" 2>/dev/null || echo 0)
Services: $(wc -l < "$ANALYSIS_DIR/services.txt" 2>/dev/null || echo 0)
Receivers: $(wc -l < "$ANALYSIS_DIR/receivers.txt" 2>/dev/null || echo 0)

Потенциально интересные файлы:
-----------------------------
HTTP запросы: $(wc -l < "$ANALYSIS_DIR/http_files.txt" 2>/dev/null || echo 0)
Crypto: $(wc -l < "$ANALYSIS_DIR/crypto_files.txt" 2>/dev/null || echo 0)
Native methods: $(wc -l < "$ANALYSIS_DIR/native_files.txt" 2>/dev/null || echo 0)

Файлы отчетов:
-------------
- permissions.txt
- activities.txt
- services.txt
- receivers.txt
- http_files.txt
- crypto_files.txt
- sharedprefs_files.txt
- native_files.txt
- strings.txt
- smali_invokes.txt
EOF

log_info "Анализ завершен!"
log_info "Сводный отчет: $ANALYSIS_DIR/ANALYSIS_REPORT.txt"
