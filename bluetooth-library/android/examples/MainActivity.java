package com.prology.bluetooth.examples;

import android.Manifest;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.prology.bluetooth.PrologyBluetoothManager;
import com.prology.bluetooth.callbacks.BluetoothConnectionCallback;
import com.prology.bluetooth.callbacks.BluetoothDataCallback;
import com.prology.bluetooth.callbacks.BluetoothStateCallback;

import java.util.Arrays;

/**
 * Пример использования PrologyBluetoothManager
 *
 * Demonstrates:
 * - Requesting Bluetooth permissions
 * - Connecting to PROLOGY device
 * - Sending commands
 * - Receiving data
 * - Handling disconnection
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "PrologyExample";

    // MAC адрес PROLOGY устройства
    private static final String PROLOGY_MAC_ADDRESS = "90:20:71:5E:48:10";

    // Request codes
    private static final int REQUEST_ENABLE_BT = 1;
    private static final int REQUEST_PERMISSIONS = 2;

    // Bluetooth менеджер
    private PrologyBluetoothManager bluetoothManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Инициализация менеджера
        bluetoothManager = new PrologyBluetoothManager(this);

        // Настройка callback интерфейсов
        setupCallbacks();

        // Проверка и запрос разрешений
        checkPermissions();
    }

    /**
     * Настраивает callback интерфейсы
     */
    private void setupCallbacks() {
        // Callback для подключения
        bluetoothManager.setConnectionCallback(new BluetoothConnectionCallback() {
            @Override
            public void onConnected() {
                Log.d(TAG, "Подключено к устройству!");
                runOnUiThread(() -> Toast.makeText(MainActivity.this,
                        "Подключено!", Toast.LENGTH_SHORT).show());

                // Отправляем команду после подключения
                sendAuthCommand();
            }

            @Override
            public void onDisconnected() {
                Log.d(TAG, "Отключено от устройства");
                runOnUiThread(() -> Toast.makeText(MainActivity.this,
                        "Отключено!", Toast.LENGTH_SHORT).show());
            }

            @Override
            public void onError(String error) {
                Log.e(TAG, "Ошибка: " + error);
                runOnUiThread(() -> Toast.makeText(MainActivity.this,
                        "Ошибка: " + error, Toast.LENGTH_LONG).show());
            }
        });

        // Callback для данных
        bluetoothManager.setDataCallback(new BluetoothDataCallback() {
            @Override
            public void onDataReceived(byte[] data) {
                Log.d(TAG, "Получены данные: " + bytesToHex(data));

                // Обрабатываем ответ от устройства
                handleReceivedData(data);
            }
        });

        // Callback для состояния
        bluetoothManager.setStateCallback(new BluetoothStateCallback() {
            @Override
            public void onStateChanged(PrologyBluetoothManager.ConnectionState state) {
                Log.d(TAG, "Состояние изменилось: " + state);
            }

            @Override
            public void onError(String error) {
                Log.e(TAG, "Ошибка состояния: " + error);
            }
        });
    }

    /**
     * Проверяет и запрашивает разрешения
     */
    private void checkPermissions() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            // Android 12+
            String[] permissions = {
                    Manifest.permission.BLUETOOTH_CONNECT,
                    Manifest.permission.BLUETOOTH_SCAN
            };

            if (!hasPermissions(permissions)) {
                ActivityCompat.requestPermissions(this, permissions, REQUEST_PERMISSIONS);
                return;
            }
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            // Android 6-11
            String[] permissions = {
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.BLUETOOTH,
                    Manifest.permission.BLUETOOTH_ADMIN
            };

            if (!hasPermissions(permissions)) {
                ActivityCompat.requestPermissions(this, permissions, REQUEST_PERMISSIONS);
                return;
            }
        }

        // Проверяем включен ли Bluetooth
        checkBluetoothEnabled();
    }

    /**
     * Проверяет наличие разрешений
     */
    private boolean hasPermissions(String[] permissions) {
        for (String permission : permissions) {
            if (ContextCompat.checkSelfPermission(this, permission)
                    != PackageManager.PERMISSION_GRANTED) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == REQUEST_PERMISSIONS) {
            boolean allGranted = true;
            for (int result : grantResults) {
                if (result != PackageManager.PERMISSION_GRANTED) {
                    allGranted = false;
                    break;
                }
            }

            if (allGranted) {
                checkBluetoothEnabled();
            } else {
                Toast.makeText(this, "Требуемые разрешения не предоставлены",
                        Toast.LENGTH_LONG).show();
            }
        }
    }

    /**
     * Проверяет, включен ли Bluetooth
     */
    private void checkBluetoothEnabled() {
        BluetoothAdapter adapter = bluetoothManager.getBluetoothAdapter();
        if (adapter == null || !adapter.isEnabled()) {
            Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
        } else {
            // Bluetooth включен, можно подключаться
            connectToDevice();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_ENABLE_BT) {
            if (resultCode == RESULT_OK) {
                connectToDevice();
            } else {
                Toast.makeText(this, "Bluetooth должен быть включен",
                        Toast.LENGTH_LONG).show();
            }
        }
    }

    /**
     * Подключается к устройству
     */
    private void connectToDevice() {
        Log.d(TAG, "Подключение к " + PROLOGY_MAC_ADDRESS);
        Toast.makeText(this, "Подключение...", Toast.LENGTH_SHORT).show();

        // Включаем автопереподключение
        bluetoothManager.setAutoReconnect(true);
        bluetoothManager.setMaxReconnectAttempts(3);

        // Подключаемся
        bluetoothManager.connect(PROLOGY_MAC_ADDRESS);
    }

    /**
     * Отправляет команду авторизации
     */
    private void sendAuthCommand() {
        // Пример команды авторизации (ASCII)
        String authCommand = "AUTH\r\n";
        bluetoothManager.sendString(authCommand);
        Log.d(TAG, "Отправлена команда: " + authCommand.trim());
    }

    /**
     * Отправляет команду получения статуса
     */
    public void sendStatusCommand() {
        if (bluetoothManager.isConnected()) {
            String statusCommand = "GET_STATUS\r\n";
            bluetoothManager.sendString(statusCommand);
            Log.d(TAG, "Отправлена команда: " + statusCommand.trim());
        } else {
            Toast.makeText(this, "Не подключено", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Обрабатывает полученные данные
     */
    private void handleReceivedData(byte[] data) {
        // Пример обработки ответа
        String response = new String(data, java.nio.charset.StandardCharsets.US_ASCII);
        Log.d(TAG, "Ответ устройства: " + response);

        // Здесь можно добавить парсинг ответа
        if (response.contains("OK")) {
            Log.d(TAG, "Команда выполнена успешно");
        } else if (response.contains("ERROR")) {
            Log.e(TAG, "Ошибка выполнения команды");
        }
    }

    /**
     * Преобразует байты в HEX строку
     */
    private String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02X ", b));
        }
        return sb.toString().trim();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Освобождаем ресурсы
        if (bluetoothManager != null) {
            bluetoothManager.release();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Отключаемся при паузе (опционально)
        // if (bluetoothManager != null) {
        //     bluetoothManager.disconnect();
        // }
    }
}
