// ============================================================================
// PROLOGY Bluetooth Response Interceptor v2
// ИСПРАВЛЕННЫЙ - с записью в файл и логами
// ============================================================================

console.log("╔═══════════════════════════════════════════════════════════════════╗");
console.log("║  🔵 PROLOGY Response Interceptor v2                               ║");
console.log("╚═══════════════════════════════════════════════════════════════════╝");
console.log("");
console.log("📡 Ожидание Bluetooth ответов...");
console.log("");

Java.perform(function() {
    console.log("✅ Java VM подключена");
    
    var responseCount = 0;
    
    // ========================================================================
    // ПЕРЕХВАТ getValue() - ЧТЕНИЕ ДАННЫХ
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
                
                // Вывод в консоль
                console.log("");
                console.log("📥 ════════════════════════════════════════════════════════");
                console.log("📥 ОТВЕТ #" + responseCount);
                console.log("╠═══════════════════════════════════════════════════════════");
                console.log("📥 UUID: " + this.getUuid());
                console.log("📥 Instance ID: " + this.getInstanceId());
                console.log("📥 Длина: " + result.length + " байт");
                console.log("╠═══════════════════════════════════════════════════════════");
                console.log("📥 HEX: " + hex);
                console.log("📥 ASCII: " + ascii);
                console.log("╚═══════════════════════════════════════════════════════════╝");
                console.log("");
                
                // Отправка данных вовне
                send({
                    type: "response",
                    count: responseCount,
                    uuid: this.getUuid().toString(),
                    instanceId: this.getInstanceId(),
                    length: result.length,
                    hex: hex,
                    ascii: ascii
                });
            }
            
            return result;
        };
        
        console.log("✅ Hook на getValue() установлен");
    } catch (e) {
        console.log("❌ Ошибка getValue(): " + e.message);
    }
    
    // ========================================================================
    // ПЕРЕХВАТ readCharacteristic() - ЗАПРОС ЧТЕНИЯ
    // ========================================================================
    try {
        var BluetoothGatt = Java.use("android.bluetooth.BluetoothGatt");
        
        BluetoothGatt.readCharacteristic.overload("android.bluetooth.BluetoothGattCharacteristic").implementation = function(characteristic) {
            console.log("📖 READ запрос: " + characteristic.getUuid());
            return this.readCharacteristic(characteristic);
        };
        
        console.log("✅ Hook на readCharacteristic() установлен");
    } catch (e) {
        console.log("❌ Ошибка readCharacteristic(): " + e.message);
    }
    
    // ========================================================================
    // МОНИТОРИНГ ЛОГОВ
    // ========================================================================
    try {
        var Log = Java.use("android.util.Log");
        
        Log.d.overload("java.lang.String", "java.lang.String").implementation = function(tag, message) {
            if (tag.indexOf("bluetooth") !== -1 || tag.indexOf("Bluetooth") !== -1 || tag.indexOf("Gatt") !== -1) {
                console.log("📝 [" + tag + "] " + message);
            }
            return this.d(tag, message);
        };
        
        console.log("✅ Hook на логи установлен");
    } catch (e) {
        console.log("❌ Ошибка логов: " + e.message);
    }
    
    console.log("");
    console.log("╔═══════════════════════════════════════════════════════════════════╗");
    console.log("║  ✅ ВСЕ ХУКИ УСТАНОВЛЕНЫ                                          ║");
    console.log("║  📡 Ожидание данных...                                            ║");
    console.log("╚═══════════════════════════════════════════════════════════════════╝");
    console.log("");
});
