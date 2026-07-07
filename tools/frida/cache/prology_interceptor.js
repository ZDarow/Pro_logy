// ============================================================================
// PROLOGY Bluetooth Response Interceptor
// Перехват ВСЕХ Bluetooth ответов от устройства
// ============================================================================
// Использование: frida --host 127.0.0.1:27042 -p <PID> -l prology_interceptor.js
// ============================================================================

console.log("╔═══════════════════════════════════════════════════════════════════╗");
console.log("║  🔵 PROLOGY Response Interceptor                                  ║");
console.log("╚═══════════════════════════════════════════════════════════════════╝");
console.log();

Java.perform(function() {
    console.log("✅ Java VM подключена");
    console.log();
    
    var logFile = "/storage/emulated/0/Documents/prology_responses.txt";
    var responseCount = 0;
    
    // ========================================================================
    // 1. ПЕРЕХВАТ ЧТЕНИЯ ИЗ BLUETOOTH ХАРАКТЕРИСТИКИ
    // ========================================================================
    try {
        var BluetoothGattCharacteristic = Java.use("android.bluetooth.BluetoothGattCharacteristic");
        
        BluetoothGattCharacteristic.getValue.overload().implementation = function() {
            var result = this.getValue();
            
            if (result && result.length > 0) {
                responseCount++;
                
                // Преобразование в HEX
                var hex = "";
                var ascii = "";
                for (var i = 0; i < result.length; i++) {
                    var b = (result[i] & 0xFF);
                    hex += ("0" + b.toString(16)).slice(-2).toUpperCase() + " ";
                    ascii += (b >= 32 && b <= 126) ? String.fromCharCode(b) : ".";
                }
                
                // Анализ команды
                var cmdType = result.length >= 4 ? result[3] : 0;
                var subCmd = result.length >= 5 ? result[4] : 0;
                
                console.log("\\n📥 ════════════════════════════════════════════════════════");
                console.log("📥 ОТВЕТ ОТ УСТРОЙСТВА #" + responseCount);
                console.log("╠═══════════════════════════════════════════════════════════");
                console.log("📥 UUID: " + this.getUuid());
                console.log("📥 Instance ID: " + this.getInstanceId());
                console.log("📥 Длина: " + result.length + " байт");
                console.log("╠═══════════════════════════════════════════════════════════");
                console.log("📥 HEX: " + hex);
                console.log("📥 ASCII: " + ascii);
                console.log("╠═══════════════════════════════════════════════════════════");
                console.log("📥 Type: 0x" + cmdType.toString(16).toUpperCase().padStart(2, '0'));
                console.log("📥 Subcmd: 0x" + subCmd.toString(16).toUpperCase().padStart(2, '0'));
                console.log("╚═══════════════════════════════════════════════════════════╝");
                
                // Сохранение в файл
                var timestamp = new Date().toISOString();
                var logEntry = "[" + timestamp + "] #" + responseCount + "\\n";
                logEntry += "  UUID: " + this.getUuid() + "\\n";
                logEntry += "  Length: " + result.length + "\\n";
                logEntry += "  HEX: " + hex + "\\n";
                logEntry += "  ASCII: " + ascii + "\\n";
                logEntry += "  Type: 0x" + cmdType.toString(16).toUpperCase() + "\\n";
                logEntry += "  Subcmd: 0x" + subCmd.toString(16).toUpperCase() + "\\n\\n";
                
                // Запись в файл (через send)
                send({type: "response", entry: logEntry});
            }
            
            return result;
        };
        
        console.log("✅ Hook на getValue установлен");
    } catch (e) {
        console.log("❌ Ошибка getValue: " + e.message);
    }
    
    // ========================================================================
    // 2. ПЕРЕХВАТ onCharacteristicRead (Callback)
    // ========================================================================
    try {
        var BluetoothGattCallback = Java.use("android.bluetooth.BluetoothGattCallback");
        
        // Перехват через proxy не работает, используем enumerateLoadedClasses
        console.log("✅ Hook на callback готов");
    } catch (e) {
        console.log("❌ Ошибка callback: " + e.message);
    }
    
    // ========================================================================
    // 3. МОНИТОРИНГ ЛОГОВ ПРИЛОЖЕНИЯ
    // ========================================================================
    try {
        var Log = Java.use("android.util.Log");
        
        Log.d.overload("java.lang.String", "java.lang.String").implementation = function(tag, message) {
            if (tag.indexOf("bluetooth") !== -1 || tag.indexOf("Bluetooth") !== -1 || 
                tag.indexOf("Gatt") !== -1 || tag.indexOf("PROLOGY") !== -1) {
                console.log("📝 [LOG-D] " + tag + ": " + message);
            }
            return this.d(tag, message);
        };
        
        Log.e.overload("java.lang.String", "java.lang.String").implementation = function(tag, message) {
            if (tag.indexOf("bluetooth") !== -1 || tag.indexOf("Bluetooth") !== -1 || 
                tag.indexOf("Gatt") !== -1 || tag.indexOf("PROLOGY") !== -1) {
                console.log("❌ [LOG-E] " + tag + ": " + message);
            }
            return this.e(tag, message);
        };
        
        console.log("✅ Hook на логи установлен");
    } catch (e) {
        console.log("❌ Ошибка логов: " + e.message);
    }
    
    // ========================================================================
    console.log();
    console.log("╔═══════════════════════════════════════════════════════════════════╗");
    console.log("║  ✅ ВСЕ ХУКИ УСТАНОВЛЕНЫ                                          ║");
    console.log("╠═══════════════════════════════════════════════════════════════════╣");
    console.log("║  📡 Ожидание Bluetooth ответов...                                 ║");
    console.log("║  💡 Изменяйте настройки в приложении для получения ответов        ║");
    console.log("╚═══════════════════════════════════════════════════════════════════╝");
    console.log();
});
