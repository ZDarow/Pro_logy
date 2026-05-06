#!/bin/bash
# Скрипт установки и запуска Frida для PROLOGY DSP модификации
# Использование: bash setup_frida.sh [install|run|stop]

set -e

APP_PACKAGE="com.prology"
APK_PATH="/home/mi/APK_MOD/PROLOGY-140-5.0.55.apk"
FRIDA_INTERCEPTOR="/home/mi/APK_MOD/frida_dsp_interceptor.js"
FRIDA_EXTENSIONS="/home/mi/APK_MOD/frida_dsp_extensions.js"

# Цвета для вывода
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
NC='\033[0m' # No Color

echo -e "${GREEN}========================================${NC}"
echo -e "${GREEN}  PROLOGY Frida DSP Modifier${NC}"
echo -e "${GREEN}========================================${NC}\n"

# Функция: Проверка подключённого устройства
check_device() {
    echo -e "${YELLOW}[1] Проверка устройства...${NC}"
    
    if ! command -v adb &> /dev/null; then
        echo -e "${RED}✗ ADB не установлен${NC}"
        echo "Установи: sudo apt install android-tools-adb"
        exit 1
    fi
    
    DEVICE_COUNT=$(adb devices | tail -n +2 | grep -c "device$")
    
    if [ "$DEVICE_COUNT" -eq 0 ]; then
        echo -e "${RED}✗ Устройство не подключено${NC}"
        echo "Подключи Android устройство через USB"
        exit 1
    fi
    
    DEVICE_SERIAL=$(adb devices | grep "device$" | head -1 | cut -f1)
    echo -e "${GREEN}✓ Устройство найдено: $DEVICE_SERIAL${NC}"
}

# Функция: Установка Frida
install_frida() {
    echo -e "\n${YELLOW}[2] Установка Frida...${NC}"
    
    # Проверка frida на ПК
    if ! command -v frida &> /dev/null; then
        echo -e "${YELLOW}Установка frida-tools...${NC}"
        pip3 install frida-tools --user
    fi
    
    FRIDA_VERSION=$(frida --version)
    echo -e "${GREEN}✓ Frida версия: $FRIDA_VERSION${NC}"
    
    # Получение архитектуры устройства
    ARCH=$(adb shell getprop ro.product.cpu.abi)
    echo -e "${YELLOW}Архитектура устройства: $ARCH${NC}"
    
    # Скачивание frida-server
    echo -e "${YELLOW}Скачивание frida-server...${NC}"
    FRIDA_SERVER_URL="https://github.com/frida/frida/releases/download/$FRIDA_VERSION/frida-server-$FRIDA_VERSION-android-$ARCH.xz"
    
    if [ ! -f "/tmp/frida-server.xz" ]; then
        wget -O /tmp/frida-server.xz "$FRIDA_SERVER_URL" || {
            echo -e "${RED}✗ Ошибка скачивания frida-server${NC}"
            echo "Скачай вручную с: https://github.com/frida/frida/releases"
            exit 1
        }
    fi
    
    # Распаковка
    echo -e "${YELLOW}Распаковка frida-server...${NC}"
    xz -d -f /tmp/frida-server.xz
    
    # Push на устройство
    echo -e "${YELLOW}Загрузка frida-server на устройство...${NC}"
    adb push /tmp/frida-server /data/local/tmp/frida-server
    adb shell chmod 755 /data/local/tmp/frida-server
    
    echo -e "${GREEN}✓ Frida-server установлен${NC}"
}

# Функция: Запуск frida-server
start_frida_server() {
    echo -e "\n${YELLOW}[3] Запуск frida-server...${NC}"
    
    # Проверка, запущен ли уже
    if adb shell pgrep -x frida-server > /dev/null 2>&1; then
        echo -e "${YELLOW}⚠ Frida-server уже запущен${NC}"
        return
    fi
    
    adb shell '/data/local/tmp/frida-server &' &
    sleep 2
    
    if adb shell pgrep -x frida-server > /dev/null 2>&1; then
        echo -e "${GREEN}✓ Frida-server запущен${NC}"
    else
        echo -e "${RED}✗ Ошибка запуска frida-server${NC}"
        exit 1
    fi
}

# Функция: Пересборка APK с debug флагом
rebuild_apk_debug() {
    echo -e "\n${YELLOW}[4] Пересборка APK с debug флагом...${NC}"
    
    DECOMPILED_DIR="/home/mi/APK_MOD/PROLOGY_decompiled"
    
    if [ ! -d "$DECOMPILED_DIR" ]; then
        echo -e "${RED}✗ Декомпилированная директория не найдена${NC}"
        echo "Сначала выполни: apktool d PROLOGY-140-5.0.55.apk"
        exit 1
    fi
    
    # Добавление android:debuggable="true" в AndroidManifest.xml
    echo -e "${YELLOW}Добавление debug флага в AndroidManifest...${NC}"
    sed -i 's/<application/<application android:debuggable="true"/' "$DECOMPILED_DIR/AndroidManifest.xml"
    
    # Пересборка
    echo -e "${YELLOW}Пересборка APK...${NC}"
    apktool b "$DECOMPILED_DIR" -o /home/mi/APK_MOD/PROLOGY-debug.apk
    
    # Подпись APK
    echo -e "${YELLOW}Подпись APK...${NC}"
    if command -v apksigner &> /dev/null; then
        apksigner sign --ks ~/.android/debug.keystore /home/mi/APK_MOD/PROLOGY-debug.apk
    else
        echo -e "${YELLOW}Использую jarsigner...${NC}"
        jarsigner -keystore ~/.android/debug.keystore -storepass android \
            /home/mi/APK_MOD/PROLOGY-debug.apk androiddebugkey
    fi
    
    echo -e "${GREEN}✓ Debug APK создан: /home/mi/APK_MOD/PROLOGY-debug.apk${NC}"
}

# Функция: Установка APK
install_apk() {
    echo -e "\n${YELLOW}[5] Установка APK...${NC}"
    
    if [ -f "/home/mi/APK_MOD/PROLOGY-debug.apk" ]; then
        adb install -r /home/mi/APK_MOD/PROLOGY-debug.apk
        echo -e "${GREEN}✓ Debug APK установлен${NC}"
    else
        echo -e "${YELLOW}Использую оригинальный APK...${NC}"
        adb install -r "$APK_PATH"
        echo -e "${GREEN}✓ Оригинальный APK установлен${NC}"
    fi
}

# Функция: Запуск перехвата DSP
run_interceptor() {
    echo -e "\n${YELLOW}[6] Запуск DSP перехватчика...${NC}"
    
    if [ ! -f "$FRIDA_INTERCEPTOR" ]; then
        echo -e "${RED}✗ Frida скрипт не найден: $FRIDA_INTERCEPTOR${NC}"
        exit 1
    fi
    
    echo -e "${GREEN}Запуск Frida с DSP перехватчиком...${NC}"
    echo -e "${YELLOW}Наблюдай за логами BLE/DSP команд${NC}\n"
    
    frida -U -f "$APP_PACKAGE" -l "$FRIDA_INTERCEPTOR" --no-pause
}

# Функция: Запуск DSP расширений
run_extensions() {
    echo -e "\n${YELLOW}[7] Запуск DSP расширений...${NC}"
    
    if [ ! -f "$FRIDA_EXTENSIONS" ]; then
        echo -e "${RED}✗ Frida extensions не найдены: $FRIDA_EXTENSIONS${NC}"
        exit 1
    fi
    
    echo -e "${GREEN}Запуск DSP Extension Injector...${NC}\n"
    
    frida -U -f "$APP_PACKAGE" -l "$FRIDA_EXTENSIONS" --no-pause
}

# Функция: Остановка frida-server
stop_frida() {
    echo -e "\n${YELLOW}Остановка frida-server...${NC}"
    adb shell pkill -x frida-server
    echo -e "${GREEN}✓ Frida-server остановлен${NC}"
}

# Функция: Помощь
show_help() {
    echo "Использование:"
    echo "  $0 install    - Установка Frida и подготовка APK"
    echo "  $0 intercept  - Запуск перехвата DSP команд"
    echo "  $0 extend     - Запуск DSP расширений"
    echo "  $0 full       - Полный цикл (install + intercept)"
    echo "  $0 stop       - Остановка frida-server"
    echo "  $0 help       - Показать эту справку"
}

# Главная логика
case "${1:-help}" in
    install)
        check_device
        install_frida
        start_frida_server
        rebuild_apk_debug
        install_apk
        ;;
    intercept)
        check_device
        start_frida_server
        run_interceptor
        ;;
    extend)
        check_device
        start_frida_server
        run_extensions
        ;;
    full)
        check_device
        install_frida
        start_frida_server
        rebuild_apk_debug
        install_apk
        run_interceptor
        ;;
    stop)
        stop_frida
        ;;
    help|*)
        show_help
        ;;
esac
