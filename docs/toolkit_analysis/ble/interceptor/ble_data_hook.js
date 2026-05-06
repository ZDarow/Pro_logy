// Минимальный hook для перехвата BLE данных
Java.perform(function() {
    console.log("\n=== PROLOGY BLE Data Interceptor ===\n");

    // Перехват записи характеристик
    var BluetoothGatt = Java.use('android.bluetooth.BluetoothGatt');
    
    BluetoothGatt.writeCharacteristic.overload('android.bluetooth.BluetoothGattCharacteristic').implementation = function(chr) {
        var uuid = chr.getUuid().toString();
        var value = chr.getValue();
        
        console.log("\n[WRITE] Characteristic: " + uuid);
        console.log("[WRITE] Value (hex): " + bytesToHex(value));
        console.log("[WRITE] Value (ascii): " + bytesToAscii(value));
        
        return this.writeCharacteristic(chr);
    };

    // Перехват чтения
    BluetoothGatt.readCharacteristic.overload('android.bluetooth.BluetoothGattCharacteristic').implementation = function(chr) {
        var uuid = chr.getUuid().toString();
        console.log("\n[READ] Characteristic: " + uuid);
        return this.readCharacteristic(chr);
    };

    console.log("[✓] BLE hooks loaded\n");
});

function bytesToHex(bytes) {
    if (!bytes) return "null";
    var hex = [];
    for (var i = 0; i < bytes.length; i++) {
        hex.push((bytes[i] & 0xFF).toString(16).padStart(2, '0'));
    }
    return hex.join(' ');
}

function bytesToAscii(bytes) {
    if (!bytes) return "null";
    var ascii = [];
    for (var i = 0; i < bytes.length; i++) {
        var c = bytes[i] & 0xFF;
        ascii.push((c >= 32 && c <= 126) ? String.fromCharCode(c) : '.');
    }
    return ascii.join('');
}
