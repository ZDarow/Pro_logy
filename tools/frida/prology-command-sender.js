/*
 * PROLOGY Frida Hook - Отправка команд и перехват ответа
 * Запуск: frida -U -f com.prology -l prology-command-sender.js
 */

Java.perform(function() {
    console.log("╔═══════════════════════════════════════════════════════════╗");
    console.log("║     PROLOGY - Отправка команд через Frida                 ║");
    console.log("╚═══════════════════════════════════════════════════════════╝");
    console.log();

    // Классы Bluetooth
    var BluetoothDevice = Java.use("android.bluetooth.BluetoothDevice");
    var BluetoothGatt = Java.use("android.bluetooth.BluetoothGatt");
    var BluetoothGattCharacteristic = Java.use("android.bluetooth.BluetoothGattCharacteristic");
    var BluetoothSocket = Java.use("android.bluetooth.BluetoothSocket");

    // Перехват write() в BluetoothSocket
    BluetoothSocket.write.overload('[B', 'int', 'int').implementation = function(bytes, offset, count) {
        console.log();
        console.log("📤 [SOCKET WRITE] " + count + " bytes");
        var hex = "";
        for (var i = offset; i < offset + count; i++) {
            hex += (bytes[i] < 0 ? (bytes[i] + 256) : bytes[i]).toString(16).padStart(2, '0').toUpperCase() + " ";
        }
        console.log("   " + hex.trim());
        return this.write(bytes, offset, count);
    };

    // Перехват read() в BluetoothSocket
    BluetoothSocket.read.overload('[B', 'int', 'int').implementation = function(bytes, offset, count) {
        var result = this.read(bytes, offset, count);
        if (result > 0) {
            console.log();
            console.log("📥 [SOCKET READ] " + result + " bytes");
            var hex = "";
            for (var i = offset; i < offset + result; i++) {
                hex += (bytes[i] < 0 ? (bytes[i] + 256) : bytes[i]).toString(16).padStart(2, '0').toUpperCase() + " ";
            }
            console.log("   " + hex.trim());
        }
        return result;
    };

    // Перехват writeCharacteristic
    BluetoothGatt.writeCharacteristic.overload('android.bluetooth.BluetoothGattCharacteristic').implementation = function(characteristic) {
        var value = characteristic.getValue();
        console.log();
        console.log("📤 [GATT WRITE] " + value.length + " bytes");
        var hex = "";
        for (var i = 0; i < value.length; i++) {
            hex += (value[i] < 0 ? (value[i] + 256) : value[i]).toString(16).padStart(2, '0').toUpperCase() + " ";
        }
        console.log("   " + hex.trim());
        return this.writeCharacteristic(characteristic);
    };

    // Перехват onCharacteristicChanged
    var BluetoothGattCallback = Java.use("android.bluetooth.BluetoothGattCallback");
    console.log("[+] Hooks installed. Waiting for commands...");
    console.log();
    console.log("═══════════════════════════════════════════════════════════");
    console.log("Ожидание команд от приложения...");
    console.log("═══════════════════════════════════════════════════════════");
});
