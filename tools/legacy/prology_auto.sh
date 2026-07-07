#!/bin/bash
# Автоматизация Prology - переключение источников
# btsnooz_hci.log требует перезапуска Bluetooth после очистки

ADB="adb -s 3af830ed0106"
PKG="com.prology"
LOG_SRC="/data/misc/bluetooth/logs/btsnoop_hci.log"
LOG_DST="/home/mi/projects/android/BLE"

# Координаты кнопок
BTN_RADIO_X=200
BTN_RADIO_Y=300

BTN_MUSIC_X=200
BTN_MUSIC_Y=550

BTN_GPS_X=200
BTN_GPS_Y=800

BTN_USB_X=540
BTN_USB_Y=300

BTN_AUX_X=540
BTN_AUX_Y=550

BTN_SETTINGS_X=540
BTN_SETTINGS_Y=800

log() {
    echo "[$(date +%H:%M:%S)] $1"
}

tap() {
    $ADB shell input tap $1 $2
    sleep 0.5
}

restart_bluetooth() {
    log "Перезапуск Bluetooth..."
    $ADB shell svc bluetooth disable
    sleep 2
    $ADB shell svc bluetooth enable
    sleep 3
}

pull_log() {
    local name=$1
    log "Сохранение: $name..."
    $ADB pull $LOG_SRC $LOG_DST/btsnoop_$name.log 2>/dev/null
    if [ $? -eq 0 ]; then
        ls -la $LOG_DST/btsnoop_$name.log
    else
        echo "  ОШИБКА: лог не сохранен"
    fi
}

test_source() {
    local name=$1
    local x=$2
    local y=$3
    
    log "=== ТЕСТ: $name (tap $x,$y) ==="
    
    # Перезапуск Bluetooth для создания нового лога
    restart_bluetooth
    
    # Возврат на главный экран Prology
    log "Переход на главный экран..."
    $ADB shell monkey -p $PKG -c android.intent.category.LAUNCHER 1
    sleep 3
    
    log "Клик по кнопке..."
    tap $x $y
    
    log "Ожидание команды (5 сек)..."
    sleep 5
    
    pull_log $name
    echo ""
}

case "${1:-all}" in
    radio)
        test_source "radio" $BTN_RADIO_X $BTN_RADIO_Y
        ;;
    music|bluetooth)
        test_source "music" $BTN_MUSIC_X $BTN_MUSIC_Y
        ;;
    gps)
        test_source "gps" $BTN_GPS_X $BTN_GPS_Y
        ;;
    usb)
        test_source "usb" $BTN_USB_X $BTN_USB_Y
        ;;
    aux)
        test_source "aux" $BTN_AUX_X $BTN_AUX_Y
        ;;
    settings)
        test_source "settings" $BTN_SETTINGS_X $BTN_SETTINGS_Y
        ;;
    all)
        log "========================================="
        log "ЗАПУСК ВСЕХ ТЕСТОВ"
        log "========================================="
        echo ""
        
        test_source "radio" $BTN_RADIO_X $BTN_RADIO_Y
        test_source "usb" $BTN_USB_X $BTN_USB_Y
        test_source "music" $BTN_MUSIC_X $BTN_MUSIC_Y
        test_source "aux" $BTN_AUX_X $BTN_AUX_Y
        test_source "gps" $BTN_GPS_X $BTN_GPS_Y
        test_source "settings" $BTN_SETTINGS_X $BTN_SETTINGS_Y
        
        log "========================================="
        log "ВСЕ ТЕСТЫ ЗАВЕРШЕНЫ"
        log "========================================="
        ;;
    *)
        echo "Использование: $0 [radio|music|gps|usb|aux|settings|all]"
        ;;
esac
