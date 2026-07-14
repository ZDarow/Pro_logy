/// Модель найденного BLE-устройства (платформо-независимая)
///
/// Используется вместо flutter_blue_plus ScanResult в UI-слое,
/// чтобы BtScanScreen не зависел от flutter_blue_plus напрямую.
class ScanDevice {
  /// Адрес устройства (MAC)
  final String remoteId;

  /// Имя устройства
  final String name;

  /// RSSI — уровень сигнала
  final int rssi;

  const ScanDevice({
    required this.remoteId,
    required this.name,
    this.rssi = 0,
  });

  @override
  bool operator ==(Object other) =>
      other is ScanDevice && other.remoteId == remoteId;

  @override
  int get hashCode => remoteId.hashCode;

  @override
  String toString() => 'ScanDevice($name, $remoteId, $rssi dBm)';
}
