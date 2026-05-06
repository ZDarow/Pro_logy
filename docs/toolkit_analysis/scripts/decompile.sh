#!/bin/bash
#
# decompile.sh - Скрипт для декомпиляции Android APK файлов
# Использование: ./decompile.sh <apk_file> [output_dir]
#

set -e

# Настройка путей
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
PROJECT_DIR="$(dirname "$SCRIPT_DIR")"
OUTPUT_DIR="${PROJECT_DIR}/output/decompiled"
LOG_DIR="${PROJECT_DIR}/logs"

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
    echo "Использование: $0 <apk_file> [output_dir]"
    echo "Пример: $0 app.apk"
    echo "        $0 app.apk ./my_output"
    exit 1
fi

APK_FILE="$1"
OUTPUT_DIR="${2:-$OUTPUT_DIR}"

# Проверка существования APK файла
if [ ! -f "$APK_FILE" ]; then
    log_error "APK файл не найден: $APK_FILE"
    exit 1
fi

# Получение имени файла без расширения
APK_NAME=$(basename "$APK_FILE" .apk)
APK_OUTPUT_DIR="$OUTPUT_DIR/$APK_NAME"

log_info "Начало декомпиляции: $APK_FILE"
log_info "Выходная директория: $APK_OUTPUT_DIR"

# Создание директории вывода
mkdir -p "$APK_OUTPUT_DIR"

# Декомпиляция ресурсов с помощью apktool
log_info "[1/3] Декомпиляция ресурсов (apktool)..."
apktool d -f -o "$APK_OUTPUT_DIR/resources" "$APK_FILE" 2>&1 | tee "$LOG_DIR/apktool_$APK_NAME.log"

# Декомпиляция Java кода с помощью jadx
log_info "[2/3] Декомпиляция Java кода (jadx)..."
jadx -d "$APK_OUTPUT_DIR/java" -j 4 "$APK_FILE" 2>&1 | tee "$LOG_DIR/jadx_$APK_NAME.log"

# Извлечение сертификатов
log_info "[3/3] Извлечение сертификатов..."
mkdir -p "$APK_OUTPUT_DIR/certificates"
cd "$APK_OUTPUT_DIR/certificates"
unzip -o -j "$APK_FILE" "META-INF/*.RSA" "META-INF/*.SF" "META-INF/*.MF" 2>/dev/null || true
cd - > /dev/null

# Создание отчета
log_info "Создание отчета..."
cat > "$APK_OUTPUT_DIR/DECOMPILE_REPORT.txt" << EOF
Отчет о декомпиляции APK
========================
Файл: $(basename "$APK_FILE")
Размер: $(du -h "$APK_FILE" | cut -f1)
Дата декомпиляции: $(date)

Структура результатов:
---------------------
resources/  - Декомпилированные ресурсы (AndroidManifest.xml, res/, smali/)
java/       - Декомпилированный Java код
certificates/ - Сертификаты подписи

Инструменты:
-----------
apktool: $(apktool --version 2>&1 | head -1)
jadx: $(jadx --version 2>&1 | head -1)
EOF

log_info "Декомпиляция завершена!"
log_info "Результаты сохранены в: $APK_OUTPUT_DIR"
echo ""
echo "Структура результатов:"
find "$APK_OUTPUT_DIR" -maxdepth 2 -type d | head -20
