/*
 * PROLOGY - Прямая отправка команд через Frida
 * Вызывает Bluetooth методы напрямую
 */

Java.perform(function() {
    console.log("╔═══════════════════════════════════════════════════════════╗");
    console.log("║     PROLOGY - Прямая отправка команд                      ║");
    console.log("╚═══════════════════════════════════════════════════════════╝");
    console.log();

    var Context = Java.use("android.app.ContextImpl");
    var BluetoothAdapter = Java.use("android.bluetooth.BluetoothAdapter");
    var BluetoothDevice = Java.use("android.bluetooth.BluetoothDevice");
    var BluetoothSocket = Java.use("android.bluetooth.BluetoothSocket");
    var Arrays = Java.use("java.util.Arrays");

    // MAC адрес устройства
    var TARGET_MAC = "10:48:5E:71:20:90";

    // Команды для отправки
    var COMMANDS = [
        { name: "EQ Query", data: [0xC0, 0x00, 0x02, 0x05, 0x05, 0x0C] },
        { name: "EQ Gain Set", data: [0xC0, 0x00, 0x05, 0x92, 0x0C, 0x32, 0x23, 0x07, 0xFF] },
        { name: "Q Factor", data: [0xC0, 0x00, 0x03, 0x92, 0x0B, 0x50, 0xF0] }
    ];

    console.log("[+] Target device: " + TARGET_MAC);
    console.log("[+] Commands to send: " + COMMANDS.length);
    console.log();

    try {
        // Получение BluetoothAdapter
        var ActivityThread = Java.use("android.app.ActivityThread");
        var currentApplication = ActivityThread.currentApplication();
        var context = currentApplication.getApplicationContext();
        
        var BluetoothManager = Java.use("android.bluetooth.BluetoothManager");
        var bluetoothManager = context.getSystemService("bluetooth");
        var adapter = bluetoothManager.getAdapter();

        console.log("[+] BluetoothAdapter: " + adapter);
        console.log("[+] Enabled: " + adapter.isEnabled());
        console.log();

        // Получение устройства
        console.log("[*] Получение устройства...");
        var device = adapter.getRemoteDevice(TARGET_MAC);
        console.log("[+] Device: " + device);
        console.log();

        // Создание RFCOMM сокета
        console.log("[*] Создание RFCOMM сокета...");
        var socket = device.createRfcommSocketToServiceRecord(
            Java.use("java.util.UUID").fromString("00001101-0000-1000-8000-00805f9b34fb")
        );
        console.log("[+] Socket создан");
        console.log();

        // Подключение
        console.log("[*] Подключение...");
        socket.connect();
        console.log("[+] Подключено!");
        console.log();

        // Отправка команд
        console.log("[*] Отправка команд...");
        console.log();

        for (var i = 0; i < COMMANDS.length; i++) {
            var cmd = COMMANDS[i];
            console.log("📤 " + cmd.name + ":");
            
            var byteArray = Java.array('byte', cmd.data);
            var outputStream = socket.getOutputStream();
            outputStream.write(byteArray);
            outputStream.flush();
            
            console.log("   " + cmd.data.map(function(b) {
                return (b < 0 ? (b + 256) : b).toString(16).padStart(2, '0').toUpperCase();
            }).join(" "));
            
            // Чтение ответа
            console.log("   Ожидание ответа...");
            var inputStream = socket.getInputStream();
            var buffer = Java.array('byte', [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]);
            var bytesRead = inputStream.read(buffer);
            
            if (bytesRead > 0) {
                var response = [];
                for (var j = 0; j < bytesRead; j++) {
                    response.push((buffer[j] < 0 ? (buffer[j] + 256) : buffer[j]).toString(16).padStart(2, '0').toUpperCase());
                }
                console.log("📥 ОТВЕТ: " + response.join(" "));
            } else {
                console.log("⚠️ Нет ответа");
            }
            
            console.log();
            Java.perform(function() { Thread.sleep(500); });
        }

        // Закрытие
        console.log("[*] Закрытие соединения...");
        socket.close();
        console.log("[+] Закрыто");
        
        console.log();
        console.log("═══════════════════════════════════════════════════════════");
        console.log("✅ КОМАНДЫ ОТПРАВЛЕНЫ И ПОЛУЧЕН ОТВЕТ!");
        console.log("═══════════════════════════════════════════════════════════");

    } catch (e) {
        console.log("❌ Ошибка: " + e);
        console.log(e.stackTrace);
    }
});
