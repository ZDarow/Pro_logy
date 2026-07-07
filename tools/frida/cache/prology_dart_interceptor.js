// ============================================================================
// PROLOGY Flutter/Dart Interceptor
// Перехват Dart методов и Flutter каналов
// ============================================================================

console.log("╔═══════════════════════════════════════════════════════════════════╗");
console.log("║  🔵 PROLOGY Flutter/Dart Interceptor                              ║");
console.log("╚═══════════════════════════════════════════════════════════════════╝");
console.log("");

Java.perform(function() {
    console.log("✅ Java VM подключена");
    console.log("");
    
    var messageCount = 0;
    
    // ========================================================================
    // 1. ПЕРЕХВАТ FLUTTER METHOD CHANNEL
    // ========================================================================
    try {
        var MethodChannel = Java.use("io.flutter.plugin.common.MethodChannel");
        
        console.log("✅ MethodChannel найден");
        
        // Перехват invokeMethod
        MethodChannel.invokeMethod.overload("java.lang.String", "java.lang.Object").implementation = function(method, args) {
            messageCount++;
            console.log("");
            console.log("📤 ════════════════════════════════════════════════════════");
            console.log("📤 FLUTTER METHOD CALL #" + messageCount);
            console.log("╠═══════════════════════════════════════════════════════════");
            console.log("📤 Method: " + method);
            console.log("📤 Args: " + args);
            console.log("╚═══════════════════════════════════════════════════════════╝");
            
            return this.invokeMethod(method, args);
        };
        
        console.log("✅ Hook на invokeMethod установлен");
    } catch (e) {
        console.log("⚠️  MethodChannel не найден: " + e.message);
    }
    
    // ========================================================================
    // 2. ПЕРЕХВАТ FLUTTER MESSENGER
    // ========================================================================
    try {
        var FlutterJNI = Java.use("io.flutter.embedding.engine.FlutterJNI");
        
        console.log("✅ FlutterJNI найден");
        
        // setSemanticsEnabled
        if (FlutterJNI.setSemanticsEnabled) {
            FlutterJNI.setSemanticsEnabled.overload("boolean").implementation = function(enabled) {
                console.log("📡 FlutterJNI.setSemanticsEnabled: " + enabled);
                return this.setSemanticsEnabled(enabled);
            };
        }
        
        console.log("✅ Hook на FlutterJNI установлен");
    } catch (e) {
        console.log("⚠️  FlutterJNI не найден: " + e.message);
    }
    
    // ========================================================================
    // 3. ПЕРЕХВАТ BLUETOOTH ПИСАТЕЛЕЙ
    // ========================================================================
    try {
        var BluetoothGattCharacteristic = Java.use("android.bluetooth.BluetoothGattCharacteristic");
        
        // setValue для записи
        BluetoothGattCharacteristic.setValue.overload("[B").implementation = function(data) {
            if (data && data.length > 0) {
                var hex = "";
                for (var i = 0; i < data.length; i++) {
                    hex += ("0" + (data[i] & 0xFF).toString(16)).slice(-2).toUpperCase() + " ";
                }
                
                console.log("");
                console.log("📤 ════════════════════════════════════════════════════════");
                console.log("📤 WRITE CHARACTERISTIC");
                console.log("╠═══════════════════════════════════════════════════════════");
                console.log("📤 UUID: " + this.getUuid());
                console.log("📤 Data: " + hex);
                console.log("📤 Length: " + data.length);
                console.log("╚═══════════════════════════════════════════════════════════╝");
                
                // Отправка
                send({
                    type: "write",
                    uuid: this.getUuid().toString(),
                    hex: hex,
                    length: data.length
                });
            }
            
            return this.setValue(data);
        };
        
        console.log("✅ Hook на setValue(byte[]) установлен");
    } catch (e) {
        console.log("⚠️  Ошибка setValue: " + e.message);
    }
    
    // ========================================================================
    // 4. ПЕРЕХВАТ CALLBACK МЕТОДОВ
    // ========================================================================
    try {
        // Ищем все классы BluetoothGattCallback
        var loadedClasses = Java.enumerateLoadedClassesSync();
        var gattCallbacks = [];
        
        loadedClasses.forEach(function(cls) {
            if (cls.includes("GattCallback") || cls.includes("BluetoothCallback")) {
                gattCallbacks.push(cls);
            }
        });
        
        console.log("");
        console.log("📋 Найдено GATT Callback классов: " + gattCallbacks.length);
        gattCallbacks.forEach(function(cls) {
            console.log("   └─ " + cls);
        });
        
    } catch (e) {
        console.log("⚠️  Ошибка поиска callback: " + e.message);
    }
    
    // ========================================================================
    // 5. МОНИТОРИНГ ВСЕХ БЛУТУЗ КЛАССОВ
    // ========================================================================
    try {
        var loadedClasses = Java.enumerateLoadedClassesSync();
        var bluetoothClasses = [];
        
        loadedClasses.forEach(function(cls) {
            if (cls.includes("bluetooth") || cls.includes("Bluetooth") || cls.includes("Gatt")) {
                if (cls.includes("com.prology") || cls.includes("io.flutter")) {
                    bluetoothClasses.push(cls);
                }
            }
        });
        
        console.log("");
        console.log("📋 PROLOGY/Flutter Bluetooth классов: " + bluetoothClasses.length);
        bluetoothClasses.slice(0, 20).forEach(function(cls) {
            console.log("   └─ " + cls);
        });
        
        if (bluetoothClasses.length > 20) {
            console.log("   ... и ещё " + (bluetoothClasses.length - 20));
        }
        
    } catch (e) {
        console.log("⚠️  Ошибка поиска: " + e.message);
    }
    
    // ========================================================================
    // 6. ПЕРЕХВАТ ЛОГОВ ПРИЛОЖЕНИЯ
    // ========================================================================
    try {
        var Log = Java.use("android.util.Log");
        
        Log.d.overload("java.lang.String", "java.lang.String").implementation = function(tag, message) {
            if (tag.indexOf("flutter") !== -1 || tag.indexOf("Flutter") !== -1 || 
                tag.indexOf("prology") !== -1 || tag.indexOf("Prology") !== -1 ||
                tag.indexOf("Bluetooth") !== -1 || tag.indexOf("Gatt") !== -1) {
                console.log("📝 [LOG-D] " + tag + ": " + message);
            }
            return this.d(tag, message);
        };
        
        Log.i.overload("java.lang.String", "java.lang.String").implementation = function(tag, message) {
            if (tag.indexOf("flutter") !== -1 || tag.indexOf("Flutter") !== -1 || 
                tag.indexOf("prology") !== -1 || tag.indexOf("Prology") !== -1) {
                console.log("📝 [LOG-I] " + tag + ": " + message);
            }
            return this.i(tag, message);
        };
        
        console.log("✅ Hook на логи установлен");
    } catch (e) {
        console.log("⚠️  Ошибка логов: " + e.message);
    }
    
    // ========================================================================
    console.log("");
    console.log("╔═══════════════════════════════════════════════════════════════════╗");
    console.log("║  ✅ ВСЕ ХУКИ УСТАНОВЛЕНЫ                                          ║");
    console.log("║  📡 Ожидание Flutter/Dart событий...                              ║");
    console.log("╚═══════════════════════════════════════════════════════════════════╝");
    console.log("");
});
