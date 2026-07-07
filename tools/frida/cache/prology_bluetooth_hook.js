// ============================================================================
// PROLOGY Bluetooth Hook Script для Frida
// Перехват всех Bluetooth вызовов приложения
// ============================================================================
// Использование: frida -U -f com.prology -l prology_bluetooth_hook.js --no-pause
// ============================================================================

console.log("🔵 [PROLOGY] Bluetooth Hook загружен!");
console.log("🔵 [PROLOGY] Ожидание запуска приложения...");

Java.perform(function() {
    console.log("🔵 [PROLOGY] Java VM подключена");

    // ========================================================================
    // 1. ПЕРЕХВАТ ЗАПИСИ В BLUETOOTH GATT ХАРАКТЕРИСТИКУ
    // ========================================================================
    try {
        var BluetoothGattCharacteristic = Java.use("android.bluetooth.BluetoothGattCharacteristic");
        
        // Метод setValue(byte[])
        BluetoothGattCharacteristic.setValue.overload("[B").implementation = function(data) {
            console.log("\n📤 ════════════════════════════════════════════════════════");
            console.log("📤 WRITE CHARACTERISTIC (byte[])");
            console.log("📤 UUID: " + this.getUuid());
            console.log("📤 Instance ID: " + this.getInstanceId());
            console.log("📤 Properties: " + this.getProperties());
            console.log("📤 Data (hex): " + bytesToHex(data));
            console.log("📤 Data (ascii): " + bytesToAscii(data));
            console.log("📤 Data (length): " + data.length + " bytes");
            console.log("📤 ════════════════════════════════════════════════════════\n");
            
            // Логируем в файл (если нужно)
            // send({type: "write", uuid: this.getUuid().toString(), data: bytesToHex(data)});
            
            return this.setValue(data);
        };

        // Метод setValue(String)
        BluetoothGattCharacteristic.setValue.overload("java.lang.String").implementation = function(value) {
            console.log("\n📤 ════════════════════════════════════════════════════════");
            console.log("📤 WRITE CHARACTERISTIC (String)");
            console.log("📤 UUID: " + this.getUuid());
            console.log("📤 Value: " + value);
            console.log("📤 ════════════════════════════════════════════════════════\n");
            
            return this.setValue(value);
        };

        console.log("✅ [PROLOGY] Hook setValue установлен");
    } catch (e) {
        console.log("❌ [PROLOGY] Ошибка при хуке setValue: " + e.message);
    }

    // ========================================================================
    // 2. ПЕРЕХВАТ ЧТЕНИЯ ИЗ BLUETOOTH GATT ХАРАКТЕРИСТИКИ
    // ========================================================================
    try {
        var BluetoothGatt = Java.use("android.bluetooth.BluetoothGatt");
        
        BluetoothGatt.readCharacteristic.implementation = function(characteristic) {
            console.log("\n📖 ════════════════════════════════════════════════════════");
            console.log("📖 READ CHARACTERISTIC");
            console.log("📖 UUID: " + characteristic.getUuid());
            console.log("📖 Instance ID: " + characteristic.getInstanceId());
            console.log("📖 ════════════════════════════════════════════════════════\n");
            
            return this.readCharacteristic(characteristic);
        };

        console.log("✅ [PROLOGY] Hook readCharacteristic установлен");
    } catch (e) {
        console.log("❌ [PROLOGY] Ошибка при хуке readCharacteristic: " + e.message);
    }

    // ========================================================================
    // 3. ПЕРЕХВАТ ОТВЕТА НА ЧТЕНИЕ (onCharacteristicRead)
    // ========================================================================
    try {
        var BluetoothGattCallback = Java.use("android.bluetooth.BluetoothGattCallback");
        
        // Создаём прокси для перехвата callback методов
        var GattCallbackProxy = Java.registerClass({
            name: 'com.frida.GattCallbackProxy',
            implements: [BluetoothGattCallback],
            methods: {
                onCharacteristicRead: function(gatt, characteristic, value, status) {
                    console.log("\n📥 ════════════════════════════════════════════════════════");
                    console.log("📥 ON CHARACTERISTIC READ (ответ)");
                    console.log("📥 UUID: " + characteristic.getUuid());
                    console.log("📥 Status: " + status);
                    console.log("📥 Value (hex): " + bytesToHex(value));
                    console.log("📥 Value (ascii): " + bytesToAscii(value));
                    console.log("📥 Value (length): " + value.length + " bytes");
                    console.log("📥 ════════════════════════════════════════════════════════\n");
                    
                    return this.onCharacteristicRead(gatt, characteristic, value, status);
                }
            }
        });
        
        console.log("✅ [PROLOGY] Proxy для onCharacteristicRead создан");
    } catch (e) {
        console.log("❌ [PROLOGY] Ошибка при создании proxy: " + e.message);
    }

    // ========================================================================
    // 4. ПЕРЕХВАТ ЗАПИСИ ДЕСКРИПТОРА
    // ========================================================================
    try {
        var BluetoothGattDescriptor = Java.use("android.bluetooth.BluetoothGattDescriptor");
        
        BluetoothGattDescriptor.setValue.overload("[B").implementation = function(data) {
            console.log("\n🏷️ ════════════════════════════════════════════════════════");
            console.log("🏷️ WRITE DESCRIPTOR");
            console.log("🏷️ UUID: " + this.getUuid());
            console.log("🏷️ Data (hex): " + bytesToHex(data));
            console.log("🏷️ Data (ascii): " + bytesToAscii(data));
            console.log("🏷️ ════════════════════════════════════════════════════════\n");
            
            return this.setValue(data);
        };

        console.log("✅ [PROLOGY] Hook writeDescriptor установлен");
    } catch (e) {
        console.log("❌ [PROLOGY] Ошибка при хуке writeDescriptor: " + e.message);
    }

    // ========================================================================
    // 5. ПЕРЕХВАТ ПОДКЛЮЧЕНИЯ К GATT СЕРВЕРУ
    // ========================================================================
    try {
        var BluetoothDevice = Java.use("android.bluetooth.BluetoothDevice");
        
        BluetoothDevice.connectGatt.overload("android.content.Context", "boolean", "android.bluetooth.BluetoothGattCallback").implementation = function(context, autoConnect, callback) {
            console.log("\n🔗 ════════════════════════════════════════════════════════");
            console.log("🔗 CONNECT GATT");
            console.log("🔗 Device: " + this.getName() + " (" + this.getAddress() + ")");
            console.log("🔗 AutoConnect: " + autoConnect);
            console.log("🔗 ════════════════════════════════════════════════════════\n");
            
            return this.connectGatt(context, autoConnect, callback);
        };

        console.log("✅ [PROLOGY] Hook connectGatt установлен");
    } catch (e) {
        console.log("❌ [PROLOGY] Ошибка при хуке connectGatt: " + e.message);
    }

    // ========================================================================
    // 6. ПЕРЕХВАТ ОТКЛЮЧЕНИЯ ОТ GATT
    // ========================================================================
    try {
        BluetoothGatt.close.implementation = function() {
            console.log("\n❌ ════════════════════════════════════════════════════════");
            console.log("❌ GATT CLOSE");
            console.log("❌ Device: " + this.getDevice().getName() + " (" + this.getDevice().getAddress() + ")");
            console.log("❌ ════════════════════════════════════════════════════════\n");
            
            return this.close();
        };

        console.log("✅ [PROLOGY] Hook close установлен");
    } catch (e) {
        console.log("❌ [PROLOGY] Ошибка при хуке close: " + e.message);
    }

    // ========================================================================
    // 7. ПЕРЕХВАТ ОБНАРУЖЕНИЯ СЕРВИСОВ
    // ========================================================================
    try {
        BluetoothGatt.discoverServices.implementation = function() {
            console.log("\n🔍 ════════════════════════════════════════════════════════");
            console.log("🔍 DISCOVER SERVICES");
            console.log("🔍 Device: " + this.getDevice().getName() + " (" + this.getDevice().getAddress() + ")");
            console.log("🔍 ════════════════════════════════════════════════════════\n");
            
            return this.discoverServices();
        };

        console.log("✅ [PROLOGY] Hook discoverServices установлен");
    } catch (e) {
        console.log("❌ [PROLOGY] Ошибка при хуке discoverServices: " + e.message);
    }

    // ========================================================================
    // 8. ПЕРЕХВАТ onServicesDiscovered
    // ========================================================================
    try {
        // Перехват callback onServicesDiscovered
        var GattCallbackClass = Java.use("android.bluetooth.BluetoothGattCallback");
        
        console.log("✅ [PROLOGY] Класс BluetoothGattCallback найден");
        
        // Ищем конкретную реализацию в приложении
        var appClasses = Java.enumerateLoadedClassesSync();
        var bluetoothCallbacks = appClasses.filter(function(cls) {
            return cls.includes("BluetoothGattCallback") || cls.includes("gatt") || cls.includes("Gatt");
        });
        
        console.log("📋 [PROLOGY] Найдено классов связанных с GATT: " + bluetoothCallbacks.length);
        bluetoothCallbacks.forEach(function(cls) {
            console.log("   - " + cls);
        });
        
    } catch (e) {
        console.log("❌ [PROLOGY] Ошибка при поиске callback: " + e.message);
    }

    // ========================================================================
    // 9. ПЕРЕХВАТ BLE СКАНИРОВАНИЯ
    // ========================================================================
    try {
        var BluetoothLeScanner = Java.use("android.bluetooth.le.BluetoothLeScanner");
        
        BluetoothLeScanner.startScan.overload("java.util.List", "android.bluetooth.le.ScanSettings", "android.bluetooth.le.ScanCallback").implementation = function(filters, settings, callback) {
            console.log("\n📡 ════════════════════════════════════════════════════════");
            console.log("📡 START BLE SCAN");
            console.log("📡 Filters: " + (filters ? filters.size() : 0));
            console.log("📡 Scan Mode: " + settings.getScanMode());
            console.log("📡 ════════════════════════════════════════════════════════\n");
            
            return this.startScan(filters, settings, callback);
        };

        console.log("✅ [PROLOGY] Hook startScan установлен");
    } catch (e) {
        console.log("❌ [PROLOGY] Ошибка при хуке startScan: " + e.message);
    }

    // ========================================================================
    // 10. ПЕРЕХВАТ onScanResult (результаты сканирования)
    // ========================================================================
    try {
        var ScanCallback = Java.use("android.bluetooth.le.ScanCallback");
        
        // Создаём proxy для перехвата
        var ScanCallbackProxy = Java.registerClass({
            name: 'com.frida.ScanCallbackProxy',
            implements: [ScanCallback],
            methods: {
                onScanResult: function(callbackType, result) {
                    var device = result.getDevice();
                    var scanRecord = result.getScanRecord();
                    var deviceName = scanRecord.getDeviceName();
                    var txPower = scanRecord.getTxPowerLevel();
                    var rssi = result.getRssi();
                    
                    console.log("\n📡 ════════════════════════════════════════════════════════");
                    console.log("📡 SCAN RESULT");
                    console.log("📡 Device: " + (deviceName || "Unknown"));
                    console.log("📡 Address: " + device.getAddress());
                    console.log("📡 RSSI: " + rssi + " dBm");
                    console.log("📡 TxPower: " + txPower + " dBm");
                    console.log("📡 Connectable: " + result.isConnectable());
                    
                    // Service UUIDs
                    var serviceUuids = scanRecord.getServiceUuids();
                    if (serviceUuids && serviceUuids.size() > 0) {
                        console.log("📡 Service UUIDs: " + serviceUuids.size());
                        for (var i = 0; i < serviceUuids.size(); i++) {
                            console.log("📡   - " + serviceUuids.get(i));
                        }
                    }
                    
                    console.log("📡 ════════════════════════════════════════════════════════\n");
                    
                    return this.onScanResult(callbackType, result);
                }
            }
        });
        
        console.log("✅ [PROLOGY] Proxy для onScanResult создан");
    } catch (e) {
        console.log("❌ [PROLOGY] Ошибка при создании ScanCallback proxy: " + e.message);
    }

    // ========================================================================
    // 11. МОНИТОРИНГ ЛОГОВ ПРИЛОЖЕНИЯ
    // ========================================================================
    try {
        var Log = Java.use("android.util.Log");
        
        Log.d.overload("java.lang.String", "java.lang.String").implementation = function(tag, message) {
            if (tag.includes("prology") || tag.includes("Prology") || tag.includes("PROLOGY") ||
                tag.includes("bluetooth") || tag.includes("Bluetooth") || tag.includes("BLE")) {
                console.log("📝 [LOG-D] " + tag + ": " + message);
            }
            return this.d(tag, message);
        };
        
        Log.e.overload("java.lang.String", "java.lang.String").implementation = function(tag, message) {
            if (tag.includes("prology") || tag.includes("Prology") || tag.includes("PROLOGY") ||
                tag.includes("bluetooth") || tag.includes("Bluetooth") || tag.includes("BLE")) {
                console.log("❌ [LOG-E] " + tag + ": " + message);
            }
            return this.e(tag, message);
        };
        
        Log.i.overload("java.lang.String", "java.lang.String").implementation = function(tag, message) {
            if (tag.includes("prology") || tag.includes("Prology") || tag.includes("PROLOGY") ||
                tag.includes("bluetooth") || tag.includes("Bluetooth") || tag.includes("BLE")) {
                console.log("ℹ️ [LOG-I] " + tag + ": " + message);
            }
            return this.i(tag, message);
        };

        console.log("✅ [PROLOGY] Hook логов установлен");
    } catch (e) {
        console.log("❌ [PROLOGY] Ошибка при хуке логов: " + e.message);
    }

    // ========================================================================
    // ВСПОМОГАТЕЛЬНЫЕ ФУНКЦИИ
    // ========================================================================
    function bytesToHex(bytes) {
        if (!bytes) return "";
        return Array.from(bytes)
            .map(function(b) {
                return (b & 0xFF).toString(16).padStart(2, '0');
            })
            .join(' ')
            .toUpperCase();
    }

    function bytesToAscii(bytes) {
        if (!bytes) return "";
        return Array.from(bytes)
            .map(function(b) {
                return (b >= 32 && b <= 126) ? String.fromCharCode(b) : '.';
            })
            .join('');
    }

    // ========================================================================
    console.log("\n🔵 ════════════════════════════════════════════════════════");
    console.log("🔵 [PROLOGY] Все хуки установлены!");
    console.log("🔵 Ожидание Bluetooth активности...");
    console.log("🔵 ════════════════════════════════════════════════════════\n");
});
