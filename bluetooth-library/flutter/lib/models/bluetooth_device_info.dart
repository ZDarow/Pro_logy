/// Информация о Bluetooth устройстве
class BluetoothDeviceInfo {
  /// MAC адрес устройства
  final String address;

  /// Имя устройства
  final String? name;

  /// Тип подключения (SPP или BLE)
  final String type;

  /// Уровень сигнала (RSSI)
  final int? rssi;

  /// Производитель устройства
  final String? manufacturer;

  BluetoothDeviceInfo({
    required this.address,
    this.name,
    required this.type,
    this.rssi,
    this.manufacturer,
  });

  @override
  String toString() {
    return 'BluetoothDeviceInfo('
        'address: $address, '
        'name: $name, '
        'type: $type, '
        'rssi: $rssi'
        ')';
  }

  @override
  bool operator ==(Object other) {
    if (identical(this, other)) return true;
    return other is BluetoothDeviceInfo && other.address == address;
  }

  @override
  int get hashCode => address.hashCode;
}
