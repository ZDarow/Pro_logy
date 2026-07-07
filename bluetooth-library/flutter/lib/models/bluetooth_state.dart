/// Состояния Bluetooth подключения
enum BluetoothState {
  /// Отключено
  disconnected,

  /// Подключение
  connecting,

  /// Подключено
  connected,

  /// Отключение
  disconnecting,
}

extension BluetoothStateExtension on BluetoothState {
  /// Возвращает человекочитаемое описание состояния
  String get description {
    switch (this) {
      case BluetoothState.disconnected:
        return 'Отключено';
      case BluetoothState.connecting:
        return 'Подключение...';
      case BluetoothState.connected:
        return 'Подключено';
      case BluetoothState.disconnecting:
        return 'Отключение...';
    }
  }

  /// Возвращает true если устройство подключено
  bool get isConnected => this == BluetoothState.connected;

  /// Возвращает true если идет процесс подключения
  bool get isConnecting => this == BluetoothState.connecting;
}
