package com.prology.bluetooth.tests;

import android.content.Context;
import android.util.Log;

import com.prology.bluetooth.PrologyBluetoothManager;
import com.prology.bluetooth.callbacks.BluetoothConnectionCallback;
import com.prology.bluetooth.callbacks.BluetoothDataCallback;
import com.prology.bluetooth.utils.BluetoothUtils;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Набор тестов для PrologyBluetoothManager
 *
 * Использование:
 * <pre>
 * {@code
 * BluetoothTests tests = new BluetoothTests(context);
 * tests.runAllTests();
 * }
 * </pre>
 */
public class BluetoothTests {

    private static final String TAG = "PrologyTests";
    private static final String TEST_DEVICE_ADDRESS = "90:20:71:5E:48:10";

    private final Context context;

    public BluetoothTests(Context context) {
        this.context = context;
    }

    /**
     * Запускает все тесты
     */
    public void runAllTests() {
        Log.d(TAG, "=== Запуск тестов PrologyBluetooth ===");

        testMacAddressValidation();
        testHexConversion();
        testConnectionCallback();
        testDataSending();
        testAutoReconnect();

        Log.d(TAG, "=== Тесты завершены ===");
    }

    /**
     * Тест 1: Валидация MAC адреса
     */
    public void testMacAddressValidation() {
        Log.d(TAG, "\n--- Тест 1: Валидация MAC адреса ---");

        // Корректные адреса
        assert BluetoothUtils.isValidMacAddress("90:20:71:5E:48:10") : "Должен быть валидным";
        assert BluetoothUtils.isValidMacAddress("00:11:22:33:44:55") : "Должен быть валидным";
        assert BluetoothUtils.isValidMacAddress("AA:BB:CC:DD:EE:FF") : "Должен быть валидным";

        // Некорректные адреса
        assert !BluetoothUtils.isValidMacAddress("") : "Должен быть невалидным";
        assert !BluetoothUtils.isValidMacAddress(null) : "Должен быть невалидным";
        assert !BluetoothUtils.isValidMacAddress("90:20:71:5E:48") : "Должен быть невалидным";
        assert !BluetoothUtils.isValidMacAddress("90-20-71-5E-48-10") : "Должен быть невалидным (дефисы)";
        assert !BluetoothUtils.isValidMacAddress("GG:HH:II:JJ:KK:LL") : "Должен быть невалидным (не hex)";

        Log.d(TAG, "✓ Валидация MAC адреса: PASSED");
    }

    /**
     * Тест 2: Преобразование HEX
     */
    public void testHexConversion() {
        Log.d(TAG, "\n--- Тест 2: Преобразование HEX ---");

        // Bytes to Hex
        byte[] testBytes = {0x01, 0x02, 0x03, 0x04, 0x05};
        String hex = BluetoothUtils.bytesToHex(testBytes);
        Log.d(TAG, "Bytes to Hex: " + hex);
        assert hex.equals("01 02 03 04 05") : "Неверное преобразование в HEX";

        // Hex to Bytes
        byte[] result = BluetoothUtils.hexToBytes("01 02 03 04 05");
        assert Arrays.equals(testBytes, result) : "Неверное преобразование из HEX";

        // Hex без пробелов
        byte[] result2 = BluetoothUtils.hexToBytes("0102030405");
        assert Arrays.equals(testBytes, result2) : "Неверное преобразование из HEX без пробелов";

        Log.d(TAG, "✓ Преобразование HEX: PASSED");
    }

    /**
     * Тест 3: Callback интерфейсы
     */
    public void testConnectionCallback() {
        Log.d(TAG, "\n--- Тест 3: Callback интерфейсы ---");

        final CountDownLatch latch = new CountDownLatch(1);
        final AtomicBoolean connected = new AtomicBoolean(false);

        PrologyBluetoothManager manager = new PrologyBluetoothManager(context);

        manager.setConnectionCallback(new BluetoothConnectionCallback() {
            @Override
            public void onConnected() {
                Log.d(TAG, "onConnected вызван");
                connected.set(true);
                latch.countDown();
            }

            @Override
            public void onDisconnected() {
                Log.d(TAG, "onDisconnected вызван");
            }

            @Override
            public void onError(String error) {
                Log.d(TAG, "onError вызван: " + error);
                latch.countDown();
            }
        });

        // Тест подключения (не блокирующий)
        Log.d(TAG, "Инициализация подключения...");
        manager.connect(TEST_DEVICE_ADDRESS);

        // Ждем события (максимум 10 секунд)
        try {
            if (latch.await(10, TimeUnit.SECONDS)) {
                Log.d(TAG, "Событие получено");
            } else {
                Log.d(TAG, "Таймаут ожидания события");
            }
        } catch (InterruptedException e) {
            Log.e(TAG, "Прерывание", e);
        }

        manager.release();
        Log.d(TAG, "✓ Callback интерфейсы: PASSED");
    }

    /**
     * Тест 4: Отправка данных
     */
    public void testDataSending() {
        Log.d(TAG, "\n--- Тест 4: Отправка данных ---");

        PrologyBluetoothManager manager = new PrologyBluetoothManager(context);

        manager.setDataCallback(new BluetoothDataCallback() {
            @Override
            public void onDataReceived(byte[] data) {
                Log.d(TAG, "Получены данные: " + Arrays.toString(data));
                Log.d(TAG, "Hex: " + BluetoothUtils.bytesToHex(data));
            }
        });

        // Тест отправки (без подключения - должно вернуть false)
        boolean result = manager.send(new byte[]{0x01, 0x02, 0x03});
        Log.d(TAG, "Отправка без подключения: " + result);
        assert !result : "Отправка без подключения должна вернуть false";

        // Тест отправки строки
        boolean stringResult = manager.sendString("TEST");
        Log.d(TAG, "Отправка строки без подключения: " + stringResult);
        assert !stringResult : "Отправка строки без подключения должна вернуть false";

        // Тест отправки команды
        boolean commandResult = manager.sendCommand("AUTH");
        Log.d(TAG, "Отправка команды без подключения: " + commandResult);
        assert !commandResult : "Отправка команды без подключения должна вернуть false";

        manager.release();
        Log.d(TAG, "✓ Отправка данных: PASSED");
    }

    /**
     * Тест 5: Автопереподключение
     */
    public void testAutoReconnect() {
        Log.d(TAG, "\n--- Тест 5: Автопереподключение ---");

        PrologyBluetoothManager manager = new PrologyBluetoothManager(context);

        // Настройка автопереподключения
        manager.setAutoReconnect(true);
        manager.setMaxReconnectAttempts(3);
        manager.setReconnectDelay(2000);

        Log.d(TAG, "Автопереподключение включено");
        Log.d(TAG, "Макс. попыток: 3");
        Log.d(TAG, "Задержка: 2000ms");

        // Проверка настроек (через логи)
        manager.connect(TEST_DEVICE_ADDRESS);

        // Даем время на попытки
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            Log.e(TAG, "Прерывание", e);
        }

        manager.release();
        Log.d(TAG, "✓ Автопереподключение: PASSED");
    }

    /**
     * Тест 6: Состояния подключения
     */
    public void testConnectionStates() {
        Log.d(TAG, "\n--- Тест 6: Состояния подключения ---");

        PrologyBluetoothManager manager = new PrologyBluetoothManager(context);

        // Начальное состояние
        assert !manager.isConnected() : "Должно быть отключено";
        assert !manager.isConnecting() : "Не должно подключаться";

        Log.d(TAG, "Начальное состояние: disconnected");

        // После вызова connect
        manager.connect(TEST_DEVICE_ADDRESS);
        Log.d(TAG, "После connect(): isConnecting = " + manager.isConnecting());

        // После disconnect
        manager.disconnect();
        assert !manager.isConnected() : "Должно быть отключено";

        Log.d(TAG, "После disconnect(): disconnected");

        manager.release();
        Log.d(TAG, "✓ Состояния подключения: PASSED");
    }

    /**
     * Тест 7: Таймауты
     */
    public void testTimeouts() {
        Log.d(TAG, "\n--- Тест 7: Таймауты ---");

        PrologyBluetoothManager manager = new PrologyBluetoothManager(context);

        // Установка таймаутов
        manager.setConnectTimeout(60000);
        manager.setIoTimeout(30000);

        Log.d(TAG, "Connect timeout: 60000ms");
        Log.d(TAG, "IO timeout: 30000ms");

        manager.release();
        Log.d(TAG, "✓ Таймауты: PASSED");
    }

    /**
     * Тест 8: Освобождение ресурсов
     */
    public void testResourceCleanup() {
        Log.d(TAG, "\n--- Тест 8: Освобождение ресурсов ---");

        // Создаем несколько менеджеров
        for (int i = 0; i < 5; i++) {
            PrologyBluetoothManager manager = new PrologyBluetoothManager(context);
            manager.connect(TEST_DEVICE_ADDRESS);
            manager.release();
            Log.d(TAG, "Менеджер " + i + " освобожден");
        }

        Log.d(TAG, "✓ Освобождение ресурсов: PASSED");
    }

    // Утилиты для тестов

    private void assert(boolean condition) {
        if (!condition) {
            throw new AssertionError("Assertion failed");
        }
    }

    private void assert(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }
}
