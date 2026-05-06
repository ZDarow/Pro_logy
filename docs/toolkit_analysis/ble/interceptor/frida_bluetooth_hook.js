/**
 * Frida скрипт для перехвата Bluetooth взаимодействий
 * PROLOGY-140-5.0.55.apk
 * 
 * Перехватывает:
 * - SPP (Serial Port Profile) UUID: 00001101-0000-1000-8000-00805F9B34FB
 * - GATT характеристики
 * - Запись/чтение данных
 */

Java.perform(function() {
    console.log("=== Bluetooth Hook Initialized ===");
    console.log("[*] Target: com.prology");
    
    // ============================================
    // 1. Перехват SPP (Serial Port Profile)
    // ============================================
    
    var UUID_SPP = "00001101-0000-1000-8000-00805F9B34FB";
    
    try {
        var BluetoothSocket = Java.use("android.bluetooth.BluetoothSocket");
        
        // Перехват отправки данных через SPP
        BluetoothSocket.getOutputStream.overload().implementation = function() {
            var outputStream = this.getOutputStream();
            console.log("\n[=== SPP OUTPUT STREAM ===]");
            console.log("[+] Socket: " + this);
            
            var OutputStream = Java.use("java.io.OutputStream");
            OutputStream.write.overload("[B").implementation = function(data) {
                console.log("[SPP TX] " + bytesToHex(data) + " | ASCII: " + bytesToString(data));
                return this.write(data);
            };
            
            OutputStream.write.overload("[B", "int", "int").implementation = function(data, offset, length) {
                var sliced = data.slice(offset, offset + length);
                console.log("[SPP TX] " + bytesToHex(sliced) + " | ASCII: " + bytesToString(sliced));
                return this.write(data, offset, length);
            };
            
            return outputStream;
        };
        
        // Перехват получения данных через SPP
        BluetoothSocket.getInputStream.overload().implementation = function() {
            var inputStream = this.getInputStream();
            console.log("\n[=== SPP INPUT STREAM ===]");
            console.log("[+] Socket: " + this);
            
            var InputStream = Java.use("java.io.InputStream");
            InputStream.read.overload("[B").implementation = function(data) {
                var result = this.read(data);
                if (result > 0) {
                    var received = data.slice(0, result);
                    console.log("[SPP RX] " + bytesToHex(received) + " | ASCII: " + bytesToString(received));
                }
                return result;
            };
            
            return inputStream;
        };
        
        console.log("[+] SPP hooks installed");
    } catch(e) {
        console.log("[-] SPP hook error: " + e);
    }
    
    // ============================================
    // 2. Перехват Bluetooth GATT
    // ============================================
    
    try {
        var BluetoothGatt = Java.use("android.bluetooth.BluetoothGatt");
        var BluetoothGattCharacteristic = Java.use("android.bluetooth.BluetoothGattCharacteristic");
        var BluetoothGattDescriptor = Java.use("android.bluetooth.BluetoothGattDescriptor");
        
        // writeCharacteristic - запись в характеристику
        BluetoothGatt.writeCharacteristic.overload("android.bluetooth.BluetoothGattCharacteristic").implementation = function(characteristic) {
            var value = characteristic.getValue();
            var uuid = characteristic.getUuid().toString();
            var serviceUuid = characteristic.getService().getUuid().toString();
            
            console.log("\n[=== GATT WRITE ===]");
            console.log("[Service UUID] " + serviceUuid);
            console.log("[Char UUID] " + uuid);
            console.log("[Value] " + bytesToHex(value) + " | ASCII: " + bytesToString(value));
            
            return this.writeCharacteristic(characteristic);
        };
        
        // readCharacteristic - чтение из характеристики
        BluetoothGatt.readCharacteristic.overload("android.bluetooth.BluetoothGattCharacteristic").implementation = function(characteristic) {
            var uuid = characteristic.getUuid().toString();
            var serviceUuid = characteristic.getService().getUuid().toString();
            
            console.log("\n[=== GATT READ ===]");
            console.log("[Service UUID] " + serviceUuid);
            console.log("[Char UUID] " + uuid);
            
            return this.readCharacteristic(characteristic);
        };
        
        // onCharacteristicChanged - получение уведомлений
        var BluetoothGattCallback = Java.use("android.bluetooth.BluetoothGattCallback");
        
        console.log("[+] GATT hooks installed");
    } catch(e) {
        console.log("[-] GATT hook error: " + e);
    }
    
    // ============================================
    // 3. Перехват X2.j - класс подключения
    // ============================================
    
    try {
        var X2_j = Java.use("X2.j");
        
        // Метод подключения a(String)
        X2_j.a.overload("java.lang.String").implementation = function(address) {
            console.log("\n[=== BLUETOOTH CONNECT ===]");
            console.log("[+] Connecting to: " + address);
            console.log("[+] UUID: " + UUID_SPP);
            return this.a(address);
        };
        
        // Метод отправки c(byte[])
        X2_j.c.overload("[B").implementation = function(data) {
            console.log("\n[=== X2.j SEND ===]");
            console.log("[Data] " + bytesToHex(data) + " | ASCII: " + bytesToString(data));
            return this.c(data);
        };
        
        // Метод отключения b()
        X2_j.b.overload().implementation = function() {
            console.log("\n[=== BLUETOOTH DISCONNECT ===]");
            return this.b();
        };
        
        console.log("[+] X2.j hooks installed");
    } catch(e) {
        console.log("[-] X2.j hook error: " + e);
    }
    
    // ============================================
    // 4. Перехват k2.C0395h - основной Bluetooth менеджер
    // ============================================
    
    try {
        var C0395h = Java.use("k2.C0395h");
        
        // Перехват метода z - отправка событий во Flutter
        C0395h.z.overload("java.lang.String", "java.util.HashMap").implementation = function(event, data) {
            console.log("\n[=== FLUTTER EVENT ===]");
            console.log("[Event] " + event);
            console.log("[Data] " + JSON.stringify(javaMapToObj(data)));
            return this.z(event, data);
        };
        
        console.log("[+] k2.C0395h hooks installed");
    } catch(e) {
        console.log("[-] k2.C0395h hook error: " + e);
    }
    
    // ============================================
    // 5. Перехват GATT Callbacks
    // ============================================
    
    try {
        var C0393f = Java.use("k2.C0393f");
        
        // onCharacteristicChanged
        C0393f.onCharacteristicChanged.overload("android.bluetooth.BluetoothGatt", "android.bluetooth.BluetoothGattCharacteristic", "[B").implementation = function(gatt, characteristic, value) {
            console.log("\n[=== GATT NOTIFICATION ===]");
            console.log("[Char UUID] " + characteristic.getUuid().toString());
            console.log("[Value] " + bytesToHex(value) + " | ASCII: " + bytesToString(value));
            return this.onCharacteristicChanged(gatt, characteristic, value);
        };
        
        // onCharacteristicRead
        C0393f.onCharacteristicRead.overload("android.bluetooth.BluetoothGatt", "android.bluetooth.BluetoothGattCharacteristic", "[B", "int").implementation = function(gatt, characteristic, value, status) {
            console.log("\n[=== GATT READ RESPONSE ===]");
            console.log("[Char UUID] " + characteristic.getUuid().toString());
            console.log("[Status] " + status);
            console.log("[Value] " + bytesToHex(value) + " | ASCII: " + bytesToString(value));
            return this.onCharacteristicRead(gatt, characteristic, value, status);
        };
        
        // onCharacteristicWrite
        C0393f.onCharacteristicWrite.overload("android.bluetooth.BluetoothGatt", "android.bluetooth.BluetoothGattCharacteristic", "int").implementation = function(gatt, characteristic, status) {
            console.log("\n[=== GATT WRITE RESPONSE ===]");
            console.log("[Char UUID] " + characteristic.getUuid().toString());
            console.log("[Status] " + status);
            return this.onCharacteristicWrite(gatt, characteristic, status);
        };
        
        // onServicesDiscovered
        C0393f.onServicesDiscovered.overload("android.bluetooth.BluetoothGatt", "int").implementation = function(gatt, status) {
            console.log("\n[=== SERVICES DISCOVERED ===]");
            console.log("[Status] " + status);
            var services = gatt.getServices();
            console.log("[Services count] " + services.size());
            
            for (var i = 0; i < services.size(); i++) {
                var service = services.get(i);
                console.log("  [Service] " + service.getUuid().toString());
                var characteristics = service.getCharacteristics();
                for (var j = 0; j < characteristics.size(); j++) {
                    var chr = characteristics.get(j);
                    console.log("    [Char] " + chr.getUuid().toString());
                }
            }
            
            return this.onServicesDiscovered(gatt, status);
        };
        
        console.log("[+] GATT Callback hooks installed");
    } catch(e) {
        console.log("[-] GATT Callback hook error: " + e);
    }
    
    // ============================================
    // Helper функции
    // ============================================
    
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
        return result.join("");
    }
    
    function javaMapToObj(javaMap) {
        var obj = {};
        var entrySet = javaMap.entrySet();
        var iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            var entry = iterator.next();
            var key = entry.getKey().toString();
            var value = entry.getValue();
            obj[key] = value ? value.toString() : "null";
        }
        return obj;
    }
    
    console.log("\n=== All Hooks Ready ===");
    console.log("[*] Waiting for Bluetooth activity...");
});
