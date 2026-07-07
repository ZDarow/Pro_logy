// ============================================================================
// PROLOGY - Поиск конкретных UUID и команд протокола
// Расширенный скрипт для анализа протокола
// ============================================================================
// Использование: frida -U -f com.prology -l prology_protocol_analyzer.js --no-pause
// ============================================================================

console.log("🔍 [PROLOGY] Protocol Analyzer загружен!");

// Известные UUID из приложения
const KNOWN_UUIDS = {
    "00000000-0000-0000-0000-000000000000": "NULL UUID",
    "1077efec-c0b2-4d02-ace3-3c1e52e2fb4b": "Custom Service B",
    "e2719d58-a985-b3c9-781a-b030af78d30e": "Custom Service C",
    "edef8ba9-79d6-4ace-a3c8-27dcd51d21ed": "Custom Service D",
    "9a04f079-9840-4286-ab92-e65be0885f95": "Custom Service E",
    "00001800-0000-1000-8000-00805f9b34fb": "Generic Access",
    "00001801-0000-1000-8000-00805f9b34fb": "Generic Attribute",
    "0000180a-0000-1000-8000-00805f9b34fb": "Device Information",
    "00001101-0000-1000-8000-00805f9b34fb": "Serial Port (SPP)",
    "0000110a-0000-1000-8000-00805f9b34fb": "A/V Remote Control",
    "0000110b-0000-1000-8000-00805f9b34fb": "A/V Remote Control Target",
    "0000110c-0000-1000-8000-00805f9b34fb": "A/V Remote Control Controller",
    "0000110e-0000-1000-8000-00805f9b34fb": "A/V Audio Source",
    "0000110f-0000-1000-8000-00805f9b34fb": "A/V Video Distribution"
};

// Команды для расшифровки (предположительные)
const COMMAND_CODES = {
    0x01: "CONNECT",
    0x02: "DISCONNECT",
    0x10: "GET_STATUS",
    0x11: "SET_STATUS",
    0x20: "VOLUME_UP",
    0x21: "VOLUME_DOWN",
    0x22: "MUTE",
    0x30: "PLAY",
    0x31: "PAUSE",
    0x32: "STOP",
    0x33: "NEXT_TRACK",
    0x34: "PREV_TRACK",
    0x40: "SET_EQ",
    0x50: "SET_BALANCE",
    0x60: "SET_FADER",
    0x70: "SET_BASS",
    0x71: "SET_TREBLE",
    0x80: "SET_BRIGHTNESS",
    0x90: "SET_CONTRAST",
    0xA0: "GET_PARKING_STATUS",
    0xB0: "SET_TIME",
    0xC0: "REBOOT",
    0xFF: "PING"
};

Java.perform(function() {
    console.log("🔍 [PROLOGY] Java VM подключена");

    // ========================================================================
    // 1. ДЕТЕКТИРОВАНИЕ ЗАПИСИ КОМАНД
    // ========================================================================
    try {
        var BluetoothGattCharacteristic = Java.use("android.bluetooth.BluetoothGattCharacteristic");
        
        BluetoothGattCharacteristic.setValue.overload("[B").implementation = function(data) {
            var uuid = this.getUuid().toString();
            var hexData = bytesToHex(data);
            var asciiData = bytesToAscii(data);
            
            // Определяем тип команды
            var commandInfo = analyzeCommand(data);
            
            console.log("\n╔═══════════════════════════════════════════════════════════════════╗");
            console.log("║  📤 WRITE COMMAND                                                 ║");
            console.log("╠═══════════════════════════════════════════════════════════════════╣");
            console.log("║  UUID:        " + padRight(uuid, 48) + "  ║");
            console.log("║  Instance ID: " + padRight(this.getInstanceId().toString(), 48) + "  ║");
            console.log("╠═══════════════════════════════════════════════════════════════════╣");
            console.log("║  HEX:  " + padRight(hexData, 58) + "║");
            console.log("║  ASCII: " + padRight(asciiData, 58) + "║");
            console.log("╠═══════════════════════════════════════════════════════════════════╣");
            console.log("║  Length:    " + padRight(data.length + " bytes", 48) + "  ║");
            console.log("║  Command:   " + padRight(commandInfo.name, 48) + "  ║");
            console.log("║  Type:      " + padRight(commandInfo.type, 48) + "  ║");
            if (commandInfo.description) {
                console.log("║  Desc:      " + padRight(commandInfo.description, 48) + "  ║");
            }
            console.log("╚═══════════════════════════════════════════════════════════════════╝\n");
            
            // Отправляем данные для внешнего анализатора
            send({
                type: "write",
                uuid: uuid,
                uuidName: getUuidName(uuid),
                data: hexData,
                ascii: asciiData,
                command: commandInfo.name,
                commandType: commandInfo.type,
                length: data.length
            });
            
            return this.setValue(data);
        };

        console.log("✅ [PROLOGY] Hook анализа команд установлен");
    } catch (e) {
        console.log("❌ [PROLOGY] Ошибка: " + e.message);
    }

    // ========================================================================
    // 2. АНАЛИЗ ОТВЕТОВ ОТ УСТРОЙСТВА
    // ========================================================================
    try {
        var BluetoothGattCallback = Java.use("android.bluetooth.BluetoothGattCallback");
        
        // Перехватываем все классы которые наследуют BluetoothGattCallback
        var loadedClasses = Java.enumerateLoadedClassesSync();
        var callbackClasses = loadedClasses.filter(function(cls) {
            return cls.includes("GattCallback") || 
                   (cls.includes("com.prology") && cls.includes("Callback"));
        });
        
        console.log("📋 [PROLOGY] Найдено потенциальных callback классов: " + callbackClasses.length);
        callbackClasses.forEach(function(cls) {
            console.log("   └─ " + cls);
        });
        
    } catch (e) {
        console.log("❌ [PROLOGY] Ошибка при поиске callback: " + e.message);
    }

    // ========================================================================
    // 3. МОНИТОРИНГ СПЕЦИФИЧНЫХ UUID
    // ========================================================================
    var targetUuids = [
        "1077efec-c0b2-4d02-ace3-3c1e52e2fb4b",
        "e2719d58-a985-b3c9-781a-b030af78d30e",
        "edef8ba9-79d6-4ace-a3c8-27dcd51d21ed",
        "9a04f079-9840-4286-ab92-e65be0885f95"
    ];

    function isTargetUuid(uuid) {
        var uuidStr = uuid.toString().toLowerCase();
        return targetUuids.some(function(target) {
            return uuidStr.includes(target.toLowerCase());
        });
    }

    // ========================================================================
    // 4. АНАЛИЗ СТРУКТУРЫ ПАКЕТОВ
    // ========================================================================
    function analyzeCommand(data) {
        if (!data || data.length === 0) {
            return { name: "EMPTY", type: "Unknown", description: "" };
        }

        var firstByte = data[0] & 0xFF;
        var secondByte = data.length > 1 ? data[1] & 0xFF : 0;
        
        // Определяем тип команды по первому байту
        var commandName = COMMAND_CODES[firstByte] || "UNKNOWN_0x" + firstByte.toString(16).toUpperCase();
        
        // Определяем тип пакета
        var packetType = "Data";
        if (firstByte >= 0x01 && firstByte <= 0x0F) packetType = "Control";
        else if (firstByte >= 0x10 && firstByte <= 0x1F) packetType = "Status";
        else if (firstByte >= 0x20 && firstByte <= 0x3F) packetType = "Media";
        else if (firstByte >= 0x40 && firstByte <= 0x5F) packetType = "Audio";
        else if (firstByte >= 0x60 && firstByte <= 0x7F) packetType = "Sound";
        else if (firstByte >= 0x80 && firstByte <= 0x9F) packetType = "Display";
        else if (firstByte >= 0xA0 && firstByte <= 0xBF) packetType = "System";
        else if (firstByte >= 0xC0 && firstByte <= 0xDF) packetType = "Config";
        
        // Расшифровка конкретных команд
        var description = "";
        if (firstByte === 0x20 || firstByte === 0x21) {
            description = "Volume: " + secondByte;
        } else if (firstByte === 0x40) {
            description = "EQ Preset: " + secondByte;
        } else if (firstByte === 0x50) {
            description = "Balance: " + secondByte;
        } else if (firstByte === 0xB0) {
            description = "Timestamp: " + secondByte;
        }
        
        return {
            name: commandName,
            type: packetType,
            description: description
        };
    }

    // ========================================================================
    // 5. ВСПОМОГАТЕЛЬНЫЕ ФУНКЦИИ
    // ========================================================================
    function getUuidName(uuid) {
        var uuidStr = uuid.toString().toLowerCase();
        for (var knownUuid in KNOWN_UUIDS) {
            if (uuidStr.includes(knownUuid.toLowerCase())) {
                return KNOWN_UUIDS[knownUuid];
            }
        }
        return "Unknown UUID";
    }

    function bytesToHex(bytes) {
        if (!bytes) return "";
        return Array.from(bytes)
            .map(function(b) { return (b & 0xFF).toString(16).padStart(2, '0'); })
            .join(' ')
            .toUpperCase();
    }

    function bytesToAscii(bytes) {
        if (!bytes) return "";
        return Array.from(bytes)
            .map(function(b) { return (b >= 32 && b <= 126) ? String.fromCharCode(b) : '.'; })
            .join('');
    }

    function padRight(str, len) {
        if (!str) str = "";
        return str.toString().length >= len ? str.toString() : str.toString() + " ".repeat(len - str.toString().length);
    }

    // ========================================================================
    // 6. СТАТИСТИКА
    // ========================================================================
    var stats = {
        writeCount: 0,
        readCount: 0,
        uuids: {},
        commands: {}
    };

    setInterval(function() {
        console.log("\n📊 ════════════════════════════════════════════════════════");
        console.log("📊 СТАТИСТИКА");
        console.log("📊 Записей команд: " + stats.writeCount);
        console.log("📊 Прочитано ответов: " + stats.readCount);
        console.log("📊 Уникальных UUID: " + Object.keys(stats.uuids).length);
        console.log("📊 Типов команд: " + Object.keys(stats.commands).length);
        console.log("📊 ════════════════════════════════════════════════════════\n");
    }, 30000); // Каждые 30 секунд

    // ========================================================================
    console.log("\n🔍 ════════════════════════════════════════════════════════");
    console.log("🔍 [PROLOGY] Protocol Analyzer готов!");
    console.log("🔍 Известные UUID: " + Object.keys(KNOWN_UUIDS).length);
    console.log("🔍 Команд для распознавания: " + Object.keys(COMMAND_CODES).length);
    console.log("🔍 ════════════════════════════════════════════════════════\n");
});
