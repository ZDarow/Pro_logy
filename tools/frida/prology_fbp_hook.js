/*
 * PROLOGY - Перехват FBP-Android (FastBle)
 * Перехватывает все GATT операции
 */

Java.perform(function() {
    console.log("╔═══════════════════════════════════════════════════════════╗");
    console.log("║     PROLOGY - Перехват FastBle (FBP-Android)              ║");
    console.log("╚═══════════════════════════════════════════════════════════╝");
    console.log();

    // Перехват com.clj.fastble
    try {
        var BleManager = Java.use("com.clj.fastble.BleManager");
        console.log("[+] BleManager найден");
    } catch(e) {
        console.log("[-] BleManager не найден, пробуем FBP...");
    }

    // Перехват onCharacteristicChanged
    var BluetoothGattCallback = Java.use("android.bluetooth.BluetoothGattCallback");
    
    BluetoothGattCallback.onCharacteristicChanged.overload(
        'android.bluetooth.BluetoothGatt',
        'android.bluetooth.BluetoothGattCharacteristic'
    ).implementation = function(gatt, characteristic) {
        console.log();
        console.log("📥 [GATT NOTIFY]Characteristic changed:");
        
        try {
            var uuid = characteristic.getUuid();
            console.log("   UUID: " + uuid);
            
            var value = characteristic.getValue();
            if (value) {
                var hex = "";
                for (var i = 0; i < value.length; i++) {
                    hex += (value[i] < 0 ? (value[i] + 256) : value[i]).toString(16).padStart(2, '0').toUpperCase() + " ";
                }
                console.log("   ЗНАЧЕНИЕ: " + hex.trim());
                console.log("   Длина: " + value.length + " байт");
                
                // Проверка на PROLOGY пакет
                if (value.length >= 3 && value[0] == 0xC0) {
                    console.log("   ✅ PROLOGY ПАКЕТ НАЙДЕН!");
                }
            }
        } catch(e) {
            console.log("   Ошибка чтения: " + e);
        }
        
        return this.onCharacteristicChanged(gatt, characteristic);
    };

    // Перехват writeCharacteristic
    BluetoothGattCallback.onCharacteristicWrite.overload(
        'android.bluetooth.BluetoothGatt',
        'android.bluetooth.BluetoothGattCharacteristic',
        'int'
    ).implementation = function(gatt, characteristic, status) {
        console.log();
        console.log("📤 [GATT WRITE]Characteristic write:");
        
        try {
            var uuid = characteristic.getUuid();
            console.log("   UUID: " + uuid);
            console.log("   Status: " + status);
            
            var value = characteristic.getValue();
            if (value) {
                var hex = "";
                for (var i = 0; i < value.length; i++) {
                    hex += (value[i] < 0 ? (value[i] + 256) : value[i]).toString(16).padStart(2, '0').toUpperCase() + " ";
                }
                console.log("   ЗНАЧЕНИЕ: " + hex.trim());
            }
        } catch(e) {
            console.log("   Ошибка: " + e);
        }
        
        return this.onCharacteristicWrite(gatt, characteristic, status);
    };

    console.log();
    console.log("[+] Hooks установлены!");
    console.log("═══════════════════════════════════════════════════════════");
    console.log("Ожидание GATT операций...");
    console.log("═══════════════════════════════════════════════════════════");
    console.log();
});
