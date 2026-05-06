/**
 * Агрессивный Bluetooth Hook для PROLOGY
 * Перехватывает ВСЕ Bluetooth вызовы
 */

Java.perform(function() {
    console.log("=== PROLOGY Aggressive Bluetooth Hook ===");
    
    var hooked = 0;
    var failed = 0;
    
    // 1. BluetoothAdapter
    try {
        var BluetoothAdapter = Java.use("android.bluetooth.BluetoothAdapter");
        
        var methods = [
            "enable", "disable", "isEnabled", "getState",
            "getName", "getAddress", "getBondedDevices",
            "getRemoteDevice", "startDiscovery", "cancelDiscovery",
            "listenUsingRfcommWithServiceRecord",
            "listenUsingInsecureRfcommWithServiceRecord"
        ];
        
        methods.forEach(function(method) {
            try {
                if (BluetoothAdapter[method]) {
                    BluetoothAdapter[method].implementation = function() {
                        console.log("\n[BT ADAPTER] " + method + "()");
                        if (arguments.length > 0) {
                            console.log("  Args: " + JSON.stringify(Array.from(arguments)));
                        }
                        var result = this[method].apply(this, arguments);
                        console.log("  Result: " + result);
                        return result;
                    };
                    hooked++;
                }
            } catch(e) {}
        });
        
        console.log("[✓] BluetoothAdapter: " + methods.length + " методов перехвачено");
    } catch(e) {
        console.log("[-] BluetoothAdapter error: " + e);
        failed++;
    }
    
    // 2. BluetoothDevice
    try {
        var BluetoothDevice = Java.use("android.bluetooth.BluetoothDevice");
        
        var methods = [
            "getName", "getAddress", "getBondState",
            "getType", "getUuids",
            "createBond", "removeBond", "cancelBondProcess",
            "setPin", "setPairingConfirmation",
            "createRfcommSocketToServiceRecord",
            "createInsecureRfcommSocketToServiceRecord",
            "connectGatt"
        ];
        
        methods.forEach(function(method) {
            try {
                if (BluetoothDevice[method]) {
                    BluetoothDevice[method].implementation = function() {
                        console.log("\n[BT DEVICE] " + method + "()");
                        console.log("  Device: " + this.getAddress() + " (" + this.getName() + ")");
                        if (arguments.length > 0) {
                            console.log("  Args: " + JSON.stringify(Array.from(arguments)));
                        }
                        var result = this[method].apply(this, arguments);
                        console.log("  Result: " + result);
                        return result;
                    };
                    hooked++;
                }
            } catch(e) {}
        });
        
        console.log("[✓] BluetoothDevice: " + methods.length + " методов перехвачено");
    } catch(e) {
        console.log("[-] BluetoothDevice error: " + e);
        failed++;
    }
    
    // 3. BluetoothSocket
    try {
        var BluetoothSocket = Java.use("android.bluetooth.BluetoothSocket");
        
        var methods = ["connect", "close", "getInputStream", "getOutputStream"];
        
        methods.forEach(function(method) {
            try {
                if (BluetoothSocket[method]) {
                    BluetoothSocket[method].implementation = function() {
                        console.log("\n[BT SOCKET] " + method + "()");
                        var result = this[method].apply(this, arguments);
                        console.log("  Result: " + result);
                        return result;
                    };
                    hooked++;
                }
            } catch(e) {}
        });
        
        console.log("[✓] BluetoothSocket: " + methods.length + " методов перехвачено");
    } catch(e) {
        console.log("[-] BluetoothSocket error: " + e);
        failed++;
    }
    
    // 4. BluetoothGatt
    try {
        var BluetoothGatt = Java.use("android.bluetooth.BluetoothGatt");
        
        var methods = [
            "connect", "disconnect", "close",
            "discoverServices", "readRemoteRssi", "requestMtu",
            "readCharacteristic", "writeCharacteristic",
            "readDescriptor", "writeDescriptor",
            "setCharacteristicNotification",
            "beginReliableWrite", "executeReliableWrite", "abortReliableWrite"
        ];
        
        methods.forEach(function(method) {
            try {
                if (BluetoothGatt[method]) {
                    BluetoothGatt[method].implementation = function() {
                        console.log("\n[BT GATT] " + method + "()");
                        if (arguments.length > 0) {
                            console.log("  Args: " + JSON.stringify(Array.from(arguments)));
                        }
                        var result = this[method].apply(this, arguments);
                        console.log("  Result: " + result);
                        return result;
                    };
                    hooked++;
                }
            } catch(e) {}
        });
        
        console.log("[✓] BluetoothGatt: " + methods.length + " методов перехвачено");
    } catch(e) {
        console.log("[-] BluetoothGatt error: " + e);
        failed++;
    }
    
    // 5. InputStream/OutputStream
    try {
        var OutputStream = Java.use("java.io.OutputStream");
        
        OutputStream.write.overload("[B").implementation = function(data) {
            console.log("\n[DATA OUT] " + bytesToHex(data) + " | " + bytesToString(data));
            return this.write(data);
        };
        
        OutputStream.write.overload("[B", "int", "int").implementation = function(data, offset, length) {
            var sliced = data.slice(offset, offset + length);
            console.log("\n[DATA OUT] " + bytesToHex(sliced) + " | " + bytesToString(sliced));
            return this.write(data, offset, length);
        };
        
        var InputStream = Java.use("java.io.InputStream");
        
        InputStream.read.overload("[B").implementation = function(data) {
            var len = this.read(data);
            if (len > 0) {
                console.log("\n[DATA IN] " + bytesToHex(data.slice(0, len)) + " | " + bytesToString(data.slice(0, len)));
            }
            return len;
        };
        
        console.log("[✓] Stream hooks loaded");
    } catch(e) {
        console.log("[-] Stream hook error: " + e);
        failed++;
    }
    
    // Итог
    console.log("\n╔══════════════════════════════════════════════════════════╗");
    console.log("║  Hook Status: " + hooked + " перехвачено, " + failed + " ошибок          ║");
    console.log("╚══════════════════════════════════════════════════════════╝");
    console.log("[*] Ждём Bluetooth активности...");
    
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
});
