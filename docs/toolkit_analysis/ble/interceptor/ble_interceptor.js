// Перехват данных Flutter Blue Plus
Java.perform(function() {
    console.log("\n╔══════════════════════════════════════════════════╗");
    console.log("║   PROLOGY BLE Data Interceptor (FBP)            ║");
    console.log("╚══════════════════════════════════════════════════╝\n");

    // Hook writeCharacteristic с данными
    try {
        var FlutterBluePlusPlugin = Java.use('com.lib.flutter_blue_plus.FlutterBluePlusPlugin');
        
        FlutterBluePlusPlugin.writeCharacteristic.implementation = function(args, result) {
            console.log("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            console.log("[WRITE] Вызов writeCharacteristic");
            console.log("[WRITE] Args: " + args);
            
            // Попытка извлечь байты
            try {
                if (args && args.size() > 0) {
                    for (var i = 0; i < args.size(); i++) {
                        console.log("[WRITE] Arg[" + i + "]: " + args.get(i));
                    }
                }
            } catch(e) {}
            
            console.log("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
            
            return this.writeCharacteristic(args, result);
        };
        console.log("[✓] writeCharacteristic hook установлен");
    } catch(e) {
        console.log("[-] writeCharacteristic hook не удался: " + e.message);
    }

    // Hook methodCallHandler
    try {
        var MethodChannel = Java.use('io.flutter.plugin.common.MethodChannel');
        
        MethodChannel.setMethodCallHandler.implementation = function(handler) {
            console.log("\n[METHOD] setMethodCallHandler: " + handler);
            return this.setMethodCallHandler(handler);
        };
        console.log("[✓] MethodChannel hook установлен");
    } catch(e) {
        console.log("[-] MethodChannel hook не удался: " + e.message);
    }

    // Hook BluetoothGattCharacteristic.setValue
    try {
        var BGC = Java.use('android.bluetooth.BluetoothGattCharacteristic');
        
        BGC.setValue.overload('[B').implementation = function(data) {
            console.log("\n[GATT] setValue(byte[]): " + bytesToHex(data));
            return this.setValue(data);
        };
        
        BGC.setValue.overload('[BI').implementation = function(data, len) {
            console.log("\n[GATT] setValue(byte[], int): " + bytesToHex(data));
            return this.setValue(data, len);
        };
        
        console.log("[✓] GATT Characteristic hook установлен");
    } catch(e) {
        console.log("[-] GATT Characteristic hook не удался: " + e.message);
    }

    console.log("\n[✓] Все hooks загружены. Жду команд...\n");
});

function bytesToHex(bytes) {
    if (!bytes) return "null";
    var hex = [];
    for (var i = 0; i < bytes.length; i++) {
        hex.push((bytes[i] & 0xFF).toString(16).padStart(2, '0'));
    }
    return hex.join(' ');
}
