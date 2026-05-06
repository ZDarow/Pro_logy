# 🐛 PROLOGY - Troubleshooting Guide

## 🔧 ADB Problems

### Устройство не определяется

**Симптомы:**
```bash
$ adb devices
List of devices attached
```

**Решения:**

1. Проверьте кабель USB
```bash
# Попробуйте другой кабель (желательно оригинальный)
# Попробуйте другой USB порт (USB 2.0 предпочтительнее)
```

2. Перезапуск ADB
```bash
adb kill-server
adb start-server
adb devices
```

3. Проверьте отладку по USB
```
Настройки → Для разработчиков → Отладка по USB
- Выключить и включить снова
- Нажать "Отладка по USB (настройки безопасности)" → Разрешить
```

4. Правила udev (Linux)
```bash
# Создать правило
echo 'SUBSYSTEM=="usb", ATTR{idVendor}=="****", MODE="0666"' | sudo tee /etc/udev/rules.d/51-android.rules

# Перезапуск udev
sudo udevadm control --reload-rules
sudo service udev restart
```

5. Wireless ADB
```bash
# Включить Wi-Fi отладку
adb tcpip 5555
adb connect <IP>:5555
```

---

### ADB unauthorized

**Симптомы:**
```bash
$ adb devices
XXXXXX    unauthorized
```

**Решение:**

1. Отключите и подключите USB снова
2. На устройстве появится запрос "Разрешить отладку?"
3. Нажмите "Разрешить" и "Всегда разрешать"

Или:
```bash
# Сброс авторизации
adb kill-server
adb start-server
# Переподключить USB
```

---

## 🔧 Frida Problems

### Failed to spawn: unable to find process

**Симптомы:**
```bash
$ frida -U -f com.prology
Failed to spawn: unable to find process
```

**Решения:**

1. Проверить имя пакета
```bash
adb shell pm list packages | grep -i prology
# Использовать точное имя
frida -U -f com.prology -l script.js
```

2. Приложение уже запущено
```bash
# Подключиться к запущенному
frida -U -n "PROLOGY" -l script.js

# Или закрыть и запустить снова
adb shell am force-stop com.prology
frida -U -f com.prology -l script.js --no-pause
```

3. Приложение не установлено
```bash
adb install PROLOGY-140-5.0.55.apk
```

---

### frida-server not running

**Симптомы:**
```bash
$ frida-ps -U
Failed to enumerate processes: unable to connect
```

**Решения:**

1. Проверить процесс
```bash
adb shell "ps | grep frida"
```

2. Перезапустить frida-server
```bash
adb shell "pkill frida-server"
adb shell "/data/local/tmp/frida-server &"
sleep 2
frida-ps -U
```

3. Проверить версию
```bash
# Версия на ПК
frida --version

# Версия на устройстве
adb shell "/data/local/tmp/frida-server --version"

# Должны совпадать!
```

4. Permission denied
```bash
adb shell "chmod 755 /data/local/tmp/frida-server"
adb shell "setenforce 0"  # Временно отключить SELinux
```

---

### Script crashes app

**Симптомы:**
Приложение закрывается сразу после запуска со скриптом.

**Решения:**

1. Добавить задержку
```bash
frida -U -f com.prology --no-pause -l script.js
```

2. Упростить скрипт
```javascript
// Начать с минимального скрипта
Java.perform(function() {
    console.log("Hook loaded");
});
```

3. Проверить ошибки в скрипте
```bash
frida -U -f com.prology -l script.js 2>&1 | tee debug.log
```

4. Использовать try-catch
```javascript
Java.perform(function() {
    try {
        // Ваш код
    } catch(e) {
        console.log("Error: " + e);
    }
});
```

---

## 🔧 Objection Problems

### Unable to connect to frida-server

**Симптомы:**
```bash
$ objection -g com.prology explore
Unable to connect to frida-server
```

**Решения:**

1. Проверить frida-server
```bash
frida-ps -U
# Должен работать
```

2. Обновить objection
```bash
pip install --upgrade objection
```

3. Использовать конкретное устройство
```bash
objection -g com.prology --host 127.0.0.1 --port 27042 explore
```

---

## 🔧 APK Analysis Problems

### Apktool decode error

**Симптомы:**
```bash
$ apktool d PROLOGY.apk
Exception in thread "main" brut.androlib.AndrolibException
```

**Решения:**

1. Обновить apktool
```bash
wget https://github.com/iBotPeaches/Apktool/releases/latest/download/apktool_2.x.x.jar
chmod +x apktool_2.x.x.jar
sudo mv apktool_2.x.x.jar /usr/local/bin/apktool
```

2. Попробовать без декомпиляции ресурсов
```bash
apktool d -r PROLOGY.apk
```

3. Использовать JADX
```bash
jadx -d output/ PROLOGY.apk
```

---

### JADX out of memory

**Симптомы:**
```bash
$ jadx -d output/ PROLOGY.apk
Java heap space error
```

**Решения:**

1. Увеличить память
```bash
export _JAVA_OPTIONS="-Xmx4G"
jadx -d output/ PROLOGY.apk
```

2. Декомпилировать по частям
```bash
# Только классы
jadx --classes-dex -d output/ PROLOGY.apk
```

---

## 🔧 Bluetooth Problems

### Bluetooth not connecting

**Симптомы:**
Приложение не подключается к автомагнитоле.

**Решения:**

1. Проверить Bluetooth на устройстве
```bash
adb shell settings get global bluetooth_on
# Должен быть 1

# Включить
adb shell settings put global bluetooth_on 1
```

2. Проверить сопряжение
```bash
adb shell dumpsys bluetooth_manager
```

3. Удалить старое сопряжение
```
Настройки → Bluetooth
- Найти устройство
- Нажать "Забыть"
- Сопрячь снова
```

4. Логирование Bluetooth
```bash
adb logcat | grep -i bluetooth
adb logcat | grep -i btservice
```

---

## 🔧 Root Problems

### No root access

**Симптомы:**
```bash
$ adb shell su
su: not found
```

**Решения:**

1. Проверить root
```bash
adb shell "which su"
adb shell "su -c 'id'"
```

2. Установить Magisk
- Скачать Magisk.apk
- Переименовать в .zip
- Прошить через TWRP/Custom Recovery

3. Без root (ограниченный функционал)
```bash
# Запуск frida-server без root (может не работать)
adb shell "/data/local/tmp/frida-server &"
```

---

## 🔧 SELinux Problems

### Permission denied

**Симптомы:**
```bash
$ adb shell "/data/local/tmp/frida-server"
Permission denied
```

**Решения:**

1. Проверить права
```bash
adb shell "ls -la /data/local/tmp/frida-server"
adb shell "chmod 755 /data/local/tmp/frida-server"
```

2. Отключить SELinux временно
```bash
adb shell "setenforce 0"
```

3. Проверить статус
```bash
adb shell "getenforce"
# Enforcing → Перевести в Permissive
# Permissive → OK
```

---

## 🔧 Network Problems

### SSL Pinning blocking requests

**Симптомы:**
HTTPS запросы не проходят.

**Решения:**

1. Frida SSL Unpinning
```bash
frida -U -f com.prology -l ssl_unpinning.js --no-pause
```

2. Objection
```bash
objection -g com.prology explore
android sslpinning disable
```

3. Burp Suite + Frida
```bash
# Установить сертификат Burp
adb push burp.der /sdcard/
# Установить через настройки → Безопасность → Сертификаты
```

---

## 🔧 Performance Problems

### Device lagging

**Симптомы:**
Устройство тормозит после запуска Frida.

**Решения:**

1. Упростить скрипт
- Меньше хуков
- Меньше логирования

2. Использовать фильтрацию
```javascript
// Только конкретные методы
X2_j.a.overload("java.lang.String").implementation = function(addr) {
    if (addr === "00:11:22:33:44:55") {
        console.log("Target device!");
    }
    return this.a(addr);
};
```

3. Сохранять в файл вместо консоли
```bash
frida -U -f com.prology -l script.js -o log.txt
```

---

## 📞 Quick Reference

### Emergency Commands

```bash
# Restart ADB
adb kill-server && adb start-server

# Restart frida-server
adb shell "pkill frida-server"
adb shell "/data/local/tmp/frida-server &"

# Force stop app
adb shell am force-stop com.prology

# Clear app data
adb shell pm clear com.prology

# Reinstall app
adb uninstall com.prology && adb install PROLOGY.apk

# Check logs
adb logcat -d > crash.log

# Screenshot
adb shell screencap -p /sdcard/screen.png
adb pull /sdcard/screen.png

# Screen record
adb shell screenrecord /sdcard/test.mp4
adb pull /sdcard/test.mp4
```

---

## 📚 Additional Resources

- [Frida Troubleshooting](https://frida.re/docs/troubleshooting/)
- [XDA Developers](https://forum.xda-developers.com/)
- [Stack Overflow - Frida](https://stackoverflow.com/questions/tagged/frida)
- [GitHub Issues](https://github.com/frida/frida/issues)

---

*PROLOGY-140-5.0.55.apk | 2026-03-02*
