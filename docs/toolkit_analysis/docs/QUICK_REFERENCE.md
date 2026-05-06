# ⚡ Quick Reference Card

## 🚀 One-Liners

```bash
# Запуск полного анализа
frida -U -f com.prology -l combined_full_analysis.js --no-pause | tee $(date +%Y%m%d_%H%M%S).log

# Objection быстро
objection -g com.prology explore

# Логирование Bluetooth
adb logcat | grep -iE "(bluetooth|bt|spp|gatt)"

# Быстрый дамп строк
strings PROLOGY.apk | grep -iE "(auth|api|key|token|secret)" | head -50

# Поиск URL в APK
unzip -p PROLOGY.apk classes*.dex | strings | grep -oE "https?://[a-zA-Z0-9./?=_-]+" | sort -u
```

---

## 📋 Command Cheat Sheet

### ADB

| Команда | Коротко |
|---------|---------|
| `adb devices` | `adb dev` |
| `adb shell` | `adb sh` |
| `adb install -r app.apk` | `adb inst app.apk` |
| `adb logcat -c` | `adb lc` |
| `adb logcat \| grep` | `adb lg` |

### Frida

| Команда | Коротко |
|---------|---------|
| `frida-ps -U` | `fps -U` |
| `frida -U -f` | `f -U -f` |
| `--no-pause` | `-np` |

### Objection

| Команда | Коротко |
|---------|---------|
| `android hooking list classes` | `ahlc` |
| `android hooking watch class` | `ahwc` |
| `android sslpinning disable` | `aspd` |
| `android root disable` | `ard` |

---

## 🔑 Common UUID

```
SPP:           00001101-0000-1000-8000-00805F9B34FB
A2DP:          0000110A-0000-1000-8000-00805F9B34FB
HFP:           0000111F-0000-1000-8000-00805F9B34FB
CCCD:          00002902-0000-1000-8000-00805F9B34FB
```

---

## 📱 Package Names

```bash
# Bluetooth
com.android.bluetooth
com.android.bluetoothmidiservice

# Settings
com.android.settings

# System
android
com.android.systemui
```

---

## 🎯 Frida Snippets

### Quick Hook

```javascript
Java.perform(function() {
    var Target = Java.use("com.example.Class");
    Target.method.implementation = function(arg) {
        console.log("Called: " + arg);
        return this.method(arg);
    };
});
```

### Trace All Methods

```javascript
Java.perform(function() {
    var klass = Java.use("com.example.Class");
    var methods = klass.class.getDeclaredMethods();
    methods.forEach(function(m) {
        try {
            klass[m.getName()].implementation = function() {
                console.log(m.getName() + " called");
                return this[m.getName()].apply(this, arguments);
            };
        } catch(e) {}
    });
});
```

### Hook Constructor

```javascript
Java.perform(function() {
    var Target = Java.use("com.example.Class");
    Target.$init.implementation = function(arg) {
        console.log("Constructor called: " + arg);
        return this.$init(arg);
    };
});
```

---

## 🐛 Quick Fixes

```bash
# ADB не видит
adb kill-server && adb start-server

# Frida упал
pkill frida-server && /data/local/tmp/frida-server &

| App крашится
adb shell am force-stop com.prology

| Нет root
adb shell setenforce 0

| SSL pinning
objection -g com.prology explore
android sslpinning disable
```

---

## 📊 File Locations

```
/data/local/tmp/          # Frida server
/sdcard/                  | Общее хранилище
/data/data/com.prology/   # Данные приложения
/system/app/              # Системные приложения
/system/priv-app/         # Привилегированные приложения
```

---

## 🔍 Grep Patterns

```bash
# URLs
grep -oE "https?://[^[:space:]]+"

# IP addresses
grep -oE "[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}"

| Base64
grep -oE "[A-Za-z0-9+/]{40,}={0,2}"

| HEX strings
grep -oE "[0-9a-fA-F]{32,}"

| Email
grep -oE "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}"
```

---

## 🎨 Color Codes

```bash
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
NC='\033[0m'

echo -e "${RED}Error${NC}"
echo -e "${GREEN}Success${NC}"
echo -e "${YELLOW}Warning${NC}"
echo -e "${BLUE}Info${NC}"
```

---

## 📝 Template Commands

```bash
# Создать лог с датой
LOG=$(date +%Y%m%d_%H%M%S).log
frida -U -f com.prology -l script.js --no-pause | tee $LOG

# Анализ логов
cat $LOG | grep -E "(TX|RX|SEND|RECV)" | tee extracted.log

# Скрипт анализа
./analyze_bluetooth_log.sh $LOG
```

---

*Quick Reference | 2026-03-02*
