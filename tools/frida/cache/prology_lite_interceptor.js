// PROLOGY Lite Interceptor - без переполнения
Java.perform(function() {
    console.log("🔵 PROLOGY Lite Interceptor запущен");
    
    var BluetoothGattCharacteristic = Java.use("android.bluetooth.BluetoothGattCharacteristic");
    
    BluetoothGattCharacteristic.setValue.overload("[B").implementation = function(data) {
        if (data && data.length > 0) {
            var hex = "";
            for (var i = 0; i < data.length; i++) {
                hex += ("0" + (data[i] & 0xFF).toString(16)).slice(-2).toUpperCase() + " ";
            }
            console.log("📤 WRITE: " + hex + " (len=" + data.length + ")");
        }
        return this.setValue(data);
    };
    
    console.log("✅ Готов к перехвату");
});
