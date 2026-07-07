// ============================================================================
// PROLOGY - Исследование классов и методов приложения
// Для поиска скрытой логики и Bluetooth команд
// ============================================================================
// Использование: frida -U -f com.prology -l prology_class_explorer.js --no-pause
// ============================================================================

console.log("🔬 [PROLOGY] Class Explorer загружен!");

Java.perform(function() {
    console.log("🔬 [PROLOGY] Java VM подключена\n");

    // ========================================================================
    // 1. СПИСОК ВСЕХ КЛАССОВ ПРИЛОЖЕНИЯ
    // ========================================================================
    console.log("╔═══════════════════════════════════════════════════════════════════╗");
    console.log("║  📋 КЛАССЫ ПРИЛОЖЕНИЯ PROLOGY                                     ║");
    console.log("╚═══════════════════════════════════════════════════════════════════╝\n");

    var appClasses = [];
    var loadedClasses = Java.enumerateLoadedClassesSync();
    
    // Фильтруем классы приложения
    loadedClasses.forEach(function(cls) {
        if (cls.includes("com.prology") || 
            cls.includes("io.flutter") || 
            cls.includes("k2.") || 
            cls.includes("K2.") ||
            cls.includes("B1.") ||
            cls.includes("T.")) {
            appClasses.push(cls);
        }
    });

    console.log("Всего найдено классов: " + appClasses.length + "\n");
    
    // Группируем по пакетам
    var packages = {};
    appClasses.forEach(function(cls) {
        var parts = cls.split('.');
        var pkg = parts.slice(0, parts.length - 1).join('.');
        if (!packages[pkg]) packages[pkg] = [];
        packages[pkg].push(cls);
    });

    // Выводим пакеты
    Object.keys(packages).forEach(function(pkg) {
        console.log("📦 " + pkg + " (" + packages[pkg].length + " классов)");
        packages[pkg].forEach(function(cls) {
            console.log("   └─ " + cls.split('.').pop());
        });
        console.log("");
    });

    // ========================================================================
    // 2. ПОИСК BLUETOOTH КЛАССОВ
    // ========================================================================
    console.log("\n╔═══════════════════════════════════════════════════════════════════╗");
    console.log("║  🔵 BLUETOOTH КЛАССЫ                                            ║");
    console.log("╚═══════════════════════════════════════════════════════════════════╝\n");

    var bluetoothClasses = appClasses.filter(function(cls) {
        var lower = cls.toLowerCase();
        return lower.includes("bluetooth") || 
               lower.includes("ble") || 
               lower.includes("gatt") ||
               lower.includes("scan");
    });

    console.log("Найдено Bluetooth классов: " + bluetoothClasses.length + "\n");
    bluetoothClasses.forEach(function(cls) {
        console.log("   🔵 " + cls);
        
        // Пробуем получить методы
        try {
            var clazz = Java.use(cls);
            var methods = clazz.class.getDeclaredMethods();
            if (methods && methods.length > 0) {
                console.log("      Методы: " + methods.length);
                methods.forEach(function(m) {
                    var methodName = m.getName();
                    if (!methodName.startsWith('$')) {
                        console.log("         └─ " + methodName + "()");
                    }
                });
            }
        } catch (e) {
            console.log("      (не удалось загрузить)");
        }
        console.log("");
    });

    // ========================================================================
    // 3. ПОИСК КЛАССОВ С UUID
    // ========================================================================
    console.log("\n╔═══════════════════════════════════════════════════════════════════╗");
    console.log("║  🏷️  КЛАССЫ С UUID                                              ║");
    console.log("╚═══════════════════════════════════════════════════════════════════╝\n");

    var uuidClasses = appClasses.filter(function(cls) {
        return cls.includes("UUID") || cls.includes("Uuid") || cls.includes("uuid");
    });

    if (uuidClasses.length === 0) {
        console.log("Классы с UUID не найдены в загруженных.\n");
        console.log("Попробуем найти в Android UUID...\n");
        
        try {
            var UUID = Java.use("java.util.UUID");
            console.log("✅ java.util.UUID доступен");
            
            // Создаём тестовые UUID
            var testUuid = UUID.fromString("1077efec-c0b2-4d02-ace3-3c1e52e2fb4b");
            console.log("Тестовый UUID: " + testUuid);
            console.log("UUID.toString(): " + testUuid.toString());
            
        } catch (e) {
            console.log("❌ Ошибка: " + e.message);
        }
    } else {
        uuidClasses.forEach(function(cls) {
            console.log("   🏷️  " + cls);
        });
    }

    // ========================================================================
    // 4. ПОИСК КЛАССОВ ОБРАБОТКИ ДАННЫХ
    // ========================================================================
    console.log("\n╔═══════════════════════════════════════════════════════════════════╗");
    console.log("║  📊 КЛАССЫ ОБРАБОТКИ ДАННЫХ                                     ║");
    console.log("╚═══════════════════════════════════════════════════════════════════╝\n");

    var dataClasses = appClasses.filter(function(cls) {
        var lower = cls.toLowerCase();
        return lower.includes("data") || 
               lower.includes("model") || 
               lower.includes("entity") ||
               lower.includes("packet") ||
               lower.includes("command") ||
               lower.includes("message") ||
               lower.includes("request") ||
               lower.includes("response");
    });

    console.log("Найдено классов данных: " + dataClasses.length + "\n");
    dataClasses.forEach(function(cls) {
        console.log("   📊 " + cls);
    });

    // ========================================================================
    // 5. ПОИСК МЕНЕДЖЕРОВ И СЕРВИСОВ
    // ========================================================================
    console.log("\n╔═══════════════════════════════════════════════════════════════════╗");
    console.log("║  ⚙️  МЕНЕДЖЕРЫ И СЕРВИСЫ                                        ║");
    console.log("╚═══════════════════════════════════════════════════════════════════╝\n");

    var managerClasses = appClasses.filter(function(cls) {
        var lower = cls.toLowerCase();
        return lower.includes("manager") || 
               lower.includes("service") || 
               lower.includes("controller") ||
               lower.includes("handler") ||
               lower.includes("helper") ||
               lower.includes("util");
    });

    console.log("Найдено менеджеров/сервисов: " + managerClasses.length + "\n");
    managerClasses.forEach(function(cls) {
        console.log("   ⚙️  " + cls);
        
        // Пробуем получить публичные методы
        try {
            var clazz = Java.use(cls);
            var methods = clazz.class.getDeclaredMethods();
            if (methods && methods.length > 0) {
                var publicMethods = [];
                methods.forEach(function(m) {
                    var name = m.getName();
                    if (!name.startsWith('$') && !name.startsWith('_')) {
                        publicMethods.push(name);
                    }
                });
                if (publicMethods.length > 0) {
                    console.log("      Методы: " + publicMethods.slice(0, 10).join(", "));
                    if (publicMethods.length > 10) {
                        console.log("      ... и ещё " + (publicMethods.length - 10));
                    }
                }
            }
        } catch (e) {
            // Игнорируем ошибки загрузки
        }
        console.log("");
    });

    // ========================================================================
    // 6. ФЛАТТЕР ПЛАГИНЫ
    // ========================================================================
    console.log("\n╔═══════════════════════════════════════════════════════════════════╗");
    console.log("║  🐦 FLUTTER ПЛАГИНЫ                                             ║");
    console.log("╚═══════════════════════════════════════════════════════════════════╝\n");

    var flutterPlugins = [
        "flutter_blue_plus",
        "flutter_bluetooth_serial",
        "audio_service",
        "just_audio",
        "geolocator",
        "map_launcher",
        "shared_preferences",
        "sqflite"
    ];

    flutterPlugins.forEach(function(plugin) {
        var pluginClasses = appClasses.filter(function(cls) {
            return cls.toLowerCase().includes(plugin.toLowerCase());
        });
        
        if (pluginClasses.length > 0) {
            console.log("🐦 " + plugin + " (" + pluginClasses.length + " классов)");
            pluginClasses.forEach(function(cls) {
                console.log("   └─ " + cls);
            });
            console.log("");
        }
    });

    // ========================================================================
    // 7. ПОИСК КОНКРЕТНЫХ МЕТОДОВ
    // ========================================================================
    console.log("\n╔═══════════════════════════════════════════════════════════════════╗");
    console.log("║  🔍 ПОИСК МЕТОДОВ ПО КЛЮЧЕВЫМ СЛОВАМ                            ║");
    console.log("╚═══════════════════════════════════════════════════════════════════╝\n");

    var searchTerms = ["write", "read", "send", "receive", "connect", "disconnect", "command"];
    
    searchTerms.forEach(function(term) {
        var matchingClasses = appClasses.filter(function(cls) {
            try {
                var clazz = Java.use(cls);
                var methods = clazz.class.getDeclaredMethods();
                if (methods) {
                    return methods.some(function(m) {
                        return m.getName().toLowerCase().includes(term.toLowerCase());
                    });
                }
                return false;
            } catch (e) {
                return false;
            }
        });
        
        if (matchingClasses.length > 0) {
            console.log("🔍 Методы с '" + term + "': " + matchingClasses.length + " классов");
            matchingClasses.slice(0, 5).forEach(function(cls) {
                console.log("   └─ " + cls);
            });
            if (matchingClasses.length > 5) {
                console.log("   ... и ещё " + (matchingClasses.length - 5));
            }
            console.log("");
        }
    });

    // ========================================================================
    // 8. СТРОКОВЫЕ КОНСТАНТЫ (поиск URL, команд)
    // ========================================================================
    console.log("\n╔═══════════════════════════════════════════════════════════════════╗");
    console.log("║  💬 ПОИСК СТРОКОВЫХ КОНСТАНТ                                    ║");
    console.log("╚═══════════════════════════════════════════════════════════════════╝\n");

    // Ищем классы которые могут содержать строки
    var stringClasses = appClasses.filter(function(cls) {
        return cls.includes("Constant") || 
               cls.includes("Config") || 
               cls.includes("Setting");
    });

    console.log("Потенциальные классы с константами:");
    stringClasses.forEach(function(cls) {
        console.log("   💬 " + cls);
    });

    // ========================================================================
    console.log("\n╔═══════════════════════════════════════════════════════════════════╗");
    console.log("║  ✅ ИССЛЕДОВАНИЕ ЗАВЕРШЕНО                                      ║");
    console.log("╚═══════════════════════════════════════════════════════════════════╝\n");

    console.log("💡 Советы:");
    console.log("   • Изучите классы k2.* и K2.* - это Bluetooth логика");
    console.log("   • Классы B1.* работают с BluetoothGatt");
    console.log("   • Классы T.* содержат UUID константы");
    console.log("   • Используйте 'hook <classname>' для перехвата конкретного класса\n");
});
