import 'dart:typed_data';

/// Callback интерфейс для получения данных
abstract class DataCallback {
  /// Вызывается при получении данных
  void onDataReceived(Uint8List data);
}

/// Простая реализация DataCallback
class SimpleDataCallback implements DataCallback {
  final Function(Uint8List)? onDataReceivedCallback;

  SimpleDataCallback({this.onDataReceivedCallback});

  @override
  void onDataReceived(Uint8List data) {
    onDataReceivedCallback?.call(data);
  }
}
