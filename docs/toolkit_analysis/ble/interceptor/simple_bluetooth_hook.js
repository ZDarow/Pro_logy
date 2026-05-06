/**
 * Простой Bluetooth Hook для PROLOGY
 * Перехват основных Bluetooth событий
 */

Java.perform(function() {
    console.log("=== PROLOGY Bluetooth Simple Hook ===");
    console.log("[*] Starting Bluetooth interception...");
    
    // 1. Перехват BluetoothAdapter
    try {
        var BluetoothAdapter = Java.use("android.bluetooth.BluetoothAdapter");
        
        BluetoothAdapter.enable.overload().implementation = function() {
            console.log("\n[BT] BluetoothAdapter.enable() called");
            return this.enable();
        };
        
        BluetoothAdapter.getRemoteDevice.overload("java.lang.String").implementation = function(address) {
            console.log("\n[BT] getRemoteDevice: " + address);
            return this.getRemoteDevice(address);
        };
        
        console.log("[✓] BluetoothAdapter hooks loaded");
    } catch(e) {
        console.log("[-] BluetoothAdapter hook failed: " + e);
    }
    
    // 2. Перехват BluetoothDevice
    try {
        var BluetoothDevice = Java.use("android.bluetooth.BluetoothDevice");
        
        BluetoothDevice.createRfcommSocketToServiceRecord.overload("java.util.UUID").implementation = function(uuid) {
            console.log("\n[BT SPP] createRfcommSocketToServiceRecord");
            console.log("  UUID: " + uuid.toString());
            return this.createRfcommSocketToServiceRecord(uuid);
        };
        
        BluetoothDevice.connect.overload("android.bluetooth.BluetoothSocket", "int").implementation = function(socket, ms) {
            console.log("\n[BT] connect() called");
            return this.connect(socket, ms);
        };
        
        console.log("[✓] BluetoothDevice hooks loaded");
    } catch(e) {
        console.log("[-] BluetoothDevice hook failed: " + e);
    }
    
    // 3. Перехват BluetoothSocket
    try {
        var BluetoothSocket = Java.use("android.bluetooth.BluetoothSocket");
        
        BluetoothSocket.connect.overload().implementation = function() {
            console.log("\n[BT SOCKET] connect()");
            return this.connect();
        };
        
        BluetoothSocket.close.overload().implementation = function() {
            console.log("\n[BT SOCKET] close()");
            return this.close();
        };
        
        console.log("[✓] BluetoothSocket hooks loaded");
    } catch(e) {
        console.log("[-] BluetoothSocket hook failed: " + e);
    }
    
    // 4. Перехват GATT
    try {
        var BluetoothGatt = Java.use("android.bluetooth.BluetoothGatt");
        
        BluetoothGatt.connect.overload().implementation = function() {
            console.log("\n[BT GATT] connect()");
            return this.connect();
        };
        
        BluetoothGatt.disconnect.overload().implementation = function() {
            console.log("\n[BT GATT] disconnect()");
            return this.disconnect();
        };
        
        BluetoothGatt.discoverServices.overload().implementation = function() {
            console.log("\n[BT GATT] discoverServices()");
            return this.discoverServices();
        };
        
        console.log("[✓] BluetoothGatt hooks loaded");
    } catch(e) {
        console.log("[-] BluetoothGatt hook failed: " + e);
    }
    
    // 5. Перехват InputStream/OutputStream
    try {
        var OutputStream = Java.use("java.io.OutputStream");
        
        OutputStream.write.overload("[B").implementation = function(data) {
            console.log("\n[DATA TX] " + bytesToHex(data) + " | " + bytesToString(data));
            return this.write(data);
        };
        
        var InputStream = Java.use("java.io.InputStream");
        
        InputStream.read.overload("[B").implementation = function(data) {
            var len = this.read(data);
            if (len > 0) {
                console.log("\n[DATA RX] " + bytesToHex(data.slice(0, len)) + " | " + bytesToString(data.slice(0, len)));
            }
            return len;
        };
        
        console.log("[✓] Stream hooks loaded");
    } catch(e) {
        console.log("[-] Stream hook failed: " + e);
    }
    
    // Helper функции
    function bytesToHex(bytes) {
        if (bytes === null || bytes.length === 0) return "(empty)";
        var hexChars = "0123456789ABCDEF";
        var result = [];
        for (var i = 0; i < bytes.length; i++) {
            result.push(hexChars.charAt((bytes[i] >> 4) & 0xF));
            result.push(hexChars.charAt(bytes[i] & 0xF));
        }
        return result.join(" ");
    }
    
    function bytesToString(bytes) {
        if (bytes === null || bytes.length === 0) return "(empty)";
        var result = [];
        for (var i = 0; i < bytes.length; i++) {
            var c = bytes[i];
            if (c >= 32 && c <= 126) {
                result.push(String.fromCharCode(c));
            } else {
                result.push(".");
            }
        }
        return "\"" + result.join("") + "\"";
    }
    
    console.log("\n=== All hooks ready ===");
    console.log("[*] Waiting for Bluetooth activity...");
    console.log("[*] Подключайтесь к автомагнитоле в приложении!");
});
