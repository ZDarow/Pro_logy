/// Prology Bluetooth Library for Flutter
///
/// Библиотека для интеграции с PROLOGY Bluetooth устройствами.
/// Поддерживает Classic Bluetooth (SPP) и BLE.
///
/// ## Пример использования
///
/// ```dart
/// import 'package:prology_bluetooth/prology_bluetooth.dart';
///
/// void main() async {
///   final prology = PrologyBluetooth();
///
///   // Подписка на события
///   prology.connectionState.listen((state) {
///     print('Состояние: $state');
///   });
///
///   prology.incomingData.listen((data) {
///     print('Получены данные: $data');
///   });
///
///   // Подключение
///   await prology.connect('90:20:71:5E:48:10');
///
///   // Отправка команды
///   await prology.sendCommand('AUTH');
///
///   // Отключение
///   await prology.disconnect();
/// }
/// ```
library prology_bluetooth;

export 'src/prology_bluetooth.dart';
export 'src/prology_bluetooth_spp.dart';
export 'src/prology_bluetooth_ble.dart';
export 'callbacks/connection_callback.dart';
export 'callbacks/data_callback.dart';
export 'models/bluetooth_state.dart';
export 'models/bluetooth_device_info.dart';
