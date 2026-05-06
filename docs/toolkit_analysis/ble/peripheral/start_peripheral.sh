#!/bin/bash
# PROLOGY BLE Peripheral — запуск через btmgmt

set -e

echo "=========================================="
echo "🔵 PROLOGY BLE Peripheral"
echo "=========================================="
echo "Service: 0xAE00"
echo "TX: 0xAE01 (Write)"
echo "RX: 0xAE02 (Notify)"
echo "=========================================="

# Остановка existing рекламы
sudo btmgmt power off 2>/dev/null || true
sleep 1

# Включение LE
sudo btmgmt le on
sudo btmgmt bredr off
sudo btmgmt power on

echo "📡 Настройка рекламы..."

# Создание advertising data
# Flags: LE General Discoverable, BR/EDR Not Supported
# Service UUID: 0xAE00 (16-bit)
# Local Name: PROLOGY
sudo btmgmt appearance 0x0000

# Создание GATT service
echo "⏳ Запуск GATT server..."

# btmgmt не поддерживает создание GATT напрямую, используем python с bluez
echo "🔧 Запуск Python BLE сервера..."

cd /home/mi/7a/prology/ble_peripheral
sudo python3 prology_server.py
