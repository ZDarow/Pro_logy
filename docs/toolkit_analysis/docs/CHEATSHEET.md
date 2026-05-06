# 📚 PROLOGY Reverse Engineering - Полная Шпаргалка

## 🔥 Быстрый старт

### 1. Подключение устройства
```bash
adb devices                    # Проверка устройств
adb kill-server && adb start-server  # Перезапуск ADB
adb tcpip 5555                 # Включить Wi-Fi отладку
adb connect 192.168.1.XXX:5555 # Подключение по Wi-Fi
```

### 2. Установка Frida
```bash
# На ПК
adb push frida-server /data/local/tmp/
adb shell chmod 755 /data/local/tmp/frida-server
adb shell "/data/local/tmp/frida-server &"

# На Termux (нужен root!)
su -c 'bash /sdcard/AutoSettingEQ/tools/install_frida_termux.sh'
```

### 3. Запуск анализа
```bash
# Один скрипт
frida -U -f com.prology -l frida_bluetooth_hook.js --no-pause

# Всё включено
frida -U -f com.prology -l combined_full_analysis.js --no-pause | tee analysis.log
```

---

## 📋 Команды ADB

| Команда | Описание |
|---------|----------|
| `adb devices` | Список устройств |
| `adb shell` | Командная оболочка устройства |
| `adb install app.apk` | Установка APK |
| `adb uninstall com.prology` | Удаление приложения |
| `adb push <файл> <путь>` | Копирование на устройство |
| `adb pull <путь> <файл>` | Копирование с устройства |
| `adb logcat` | Просмотр логов Android |
| `adb logcat -c` | Очистка лога |
| `adb logcat -d > log.txt` | Сохранение лога |
| `adb forward tcp:8080 tcp:8080` | Проброс портов |
| `adb shell pm list packages` | Список пакетов |
| `adb shell pm dump <package>` | Информация о пакете |
| `adb shell dumpsys` | Системная информация |
| `adb backup -f backup.ab com.prology` | Бэкап данных |
| `adb restore backup.ab` | Восстановление данных |

---

## 🎯 Команды Frida

### Базовые

```bash
frida-ps -U                     # Список процессов
frida -U -f com.prology         # Запуск приложения
frida -U -n "PROLOGY"           # Подключение к запущенному
frida -U -p <PID>               # Подключение по PID
frida -U -f com.prology --no-pause  # Запуск без паузы
frida --version                 # Версия Frida
```

### Скрипты

```bash
frida -U -f com.prology -l script.js              # Со скриптом
frida -U -f com.prology -l s1.js -l s2.js         # Несколько скриптов
frida -U -f com.prology -l script.js | tee log.txt  # С логом
frida -U -f com.prology -l script.js -o log.txt   # В файл
```

### Интерактивный режим

```bash
frida -U -f com.prology
[d] frida> %load script.js      # Загрузить скрипт
[d] frida> %reload              # Перезагрузить скрипт
[d] frida> help                 # Помощь
[d] frida> resume               # Продолжить
[d] frida> exit                 # Выход
```

### frida-trace

```bash
frida-trace -U -f com.prology -m "*.*"          # Все методы
frida-trace -U -f com.prology -m "X2.j.*"       # Класс X2.j
frida-trace -U -f com.prology -m "*Bluetooth*"  # Bluetooth методы
frida-trace -U -f com.prology -i "open"         # Native функции
frida-trace -U -f com.prology -I libnative.so   # Библиотека
```

---

## 🔍 Objection команды

```bash
objection -g com.prology explore

# Внутри:
env                           # Информация о среде
android hooking list classes  # Список классов
android hooking list methods <class>  # Методы класса
android hooking watch <class>         # Следить за классом
android hooking watch method <class.method>  # Следить за методом
android hooking list receivers        # Broadcast receivers
android hooking list services         # Сервисы
android hooking list activities       # Activity
android intent launch_activity <name> # Запуск Activity
android memory list modules           # Модули памяти
android keystore list                 # Ключи Keystore
android sslpinning disable            # Отключить SSL pinning
android root disable                  # Отключить root detection
```

---

## 📊 Анализ APK

### Декомпиляция

```bash
# Apktool (ресурсы + Smali)
apktool d PROLOGY-140-5.0.55.apk -o decompiled/
apktool b decompiled/ -o rebuilt.apk

# JADX (Java код)
jadx -d decompiled_java/ PROLOGY-140-5.0.55.apk
jadx-gui PROLOGY-140-5.0.55.apk  # GUI

# unzip (быстрый просмотр)
unzip -l PROLOGY-140-5.0.55.apk  # Список файлов
unzip PROLOGY-140-5.0.55.apk -o  # Распаковать
```

### Анализ AndroidManifest.xml

```bash
# Извлечение
aapt dump badging PROLOGY-140-5.0.55.apk

# Просмотр разрешений
aapt dump permissions PROLOGY-140-5.0.55.apk

# Компоненты
aapt dump xmltree PROLOGY-140-5.0.55.apk AndroidManifest.xml
```

### Подпись APK

```bash
# Keystore
keytool -genkey -v -keystore mykey.keystore -alias alias -keyalg RSA -keysize 2048 -validity 10000

# Подпись (v1)
jarsigner -verbose -sigalg SHA1withRSA -digestalg SHA1 -keystore mykey.keystore rebuilt.apk alias

# Подпись (v2)
apksigner sign --ks mykey.keystore rebuilt.apk

# Проверка
apksigner verify rebuilt.apk
```

---

## 🔑 Bluetooth UUID

### Classic Bluetooth (SPP)

```
00001101-0000-1000-8000-00805F9B34FB  # Serial Port
0000110A-0000-1000-8000-00805F9B34FB  # A2DP Audio
0000110B-0000-1000-8000-00805F9B34FB  # AVRCP Control
0000110C-0000-1000-8000-00805F9B34FB  # Headset
0000110D-0000-1000-8000-00805F9B34FB  # Headset Audio
0000110E-0000-1000-8000-00805F9B34FB  # Hands-Free
0000111F-0000-1000-8000-00805F9B34FB  # HID
```

### BLE GATT Services

```
0x1800  # Generic Access
0x1801  # Generic Attribute
0x180A  # Device Information
0x180F  # Battery Service
0x181A  # Glucose
0x181D  # Health Thermometer
```

### BLE GATT Characteristics

```
0x2A00  # Device Name
0x2A01  # Appearance
0x2A02  # Peripheral Privacy Flag
0x2A03  # Reconnection Address
0x2A04  # Peripheral Preferred Connection Parameters
0x2A05  # Service Changed
0x2A19  # Battery Level
0x2A29  # Manufacturer Name
0x2A2A  # IEEE 11073-20601 Regulatory Certification
0x2A2B  # Date of Birth
0x2A2C  # Date of Time
```

### CCCD Descriptor

```
00002902-0000-1000-8000-00805F9B34FB  # Client Characteristic Configuration
Значения:
  0x0000  # Notifications disabled
  0x0001  # Notifications enabled
  0x0002  # Indications enabled
```

---

## 🛡 Обход защит

### SSL Pinning Bypass

```javascript
// Универсальный обход
Java.perform(function() {
    var TrustManagerImpl = Java.use("com.android.org.conscrypt.TrustManagerImpl");
    var ArrayList = Java.use("java.util.ArrayList");
    TrustManagerImpl.checkTrustedRecursive.implementation = function() {
        return ArrayList.$new();
    };
});
```

### Root Detection Bypass

```javascript
Java.perform(function() {
    var File = Java.use("java.io.File");
    File.exists.implementation = function() {
        var path = this.getAbsolutePath();
        if (path.contains("su") || path.contains("magisk")) {
            return false;
        }
        return this.exists();
    };
});
```

### Emulator Detection Bypass

```javascript
Java.perform(function() {
    var Build = Java.use("android.os.Build");
    Build.FINGERPRINT.value = "google/sdk_gphone_x86/generic:11/RSR1.201013.001/6903527:user/release-keys";
});
```

---

## 📝 Шаблон отчёта

```markdown
# Отчёт об анализе: <APP_NAME>

## Основная информация
- Package: <package.name>
- Version: <version>
- Min SDK: <sdk>
- Target SDK: <sdk>

## Компоненты
- Activities: <count>
- Services: <count>
- Receivers: <count>
- Providers: <count>

## Разрешения
<list permissions>

## Bluetooth
- UUID: <uuid>
- Тип: Classic/BLE
- Сервисы: <services>

## Найденные уязвимости
1. <vulnerability>

## Команды протокола
<TX/RX commands>

## Рекомендации
<recommendations>
```

---

## 🔧 Полезные утилиты

### Для анализа

```bash
# Strings из APK
strings PROLOGY.apk | grep -i "auth\|api\|key"

# Поиск в Smali
grep -r "invoke" decompiled/ | grep -i "bluetooth"

# Поиск URL
grep -roh "https?://[a-zA-Z0-9./?=_-]*" decompiled/ | sort -u
```

### Для модификации

```bash
# Edit Smali
vim decompiled/smali/X2/j.smali

# Пересборка
apktool b decompiled/ -o modified.apk

# Подпись
uber-apk-signer -a modified.apk
```

---

## 🐛 Troubleshooting

### ADB не видит устройство

```bash
adb kill-server
adb start-server
adb devices
# Проверить кабель и отладку по USB
```

### Frida crash

```bash
# Проверить версию frida-server
frida --version
# Должна совпадать с версией на устройстве
```

### App crash после инъекции

```bash
# Попробовать с задержкой
frida -U -f com.prology --no-pause -l script.js

# Или подключиться к запущенному
frida -U -n "PROLOGY" -l script.js
```

### Permission denied

```bash
adb shell setenforce 0  # Временно отключить SELinux
adb shell chmod 755 /data/local/tmp/frida-server
```

---

## 📚 Ссылки

- [Frida Docs](https://frida.re/docs/)
- [Frida CodeShare](https://codeshare.frida.re/)
- [OWASP MSTG](https://github.com/OWASP/owasp-mstg)
- [Android Developers](https://developer.android.com/)
- [Bluetooth SIG](https://www.bluetooth.com/specifications/specs/)

---

*PROLOGY-140-5.0.55.apk | 2026-03-02*
