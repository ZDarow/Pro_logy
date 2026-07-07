/// Callback интерфейс для событий подключения
abstract class ConnectionCallback {
  /// Вызывается при успешном подключении
  void onConnected();

  /// Вызывается при отключении
  void onDisconnected();

  /// Вызывается при ошибке
  void onError(String error);
}

/// Простая реализация ConnectionCallback
class SimpleConnectionCallback implements ConnectionCallback {
  final VoidCallback? onConnectedCallback;
  final VoidCallback? onDisconnectedCallback;
  final Function(String)? onErrorCallback;

  SimpleConnectionCallback({
    this.onConnectedCallback,
    this.onDisconnectedCallback,
    this.onErrorCallback,
  });

  @override
  void onConnected() {
    onConnectedCallback?.call();
  }

  @override
  void onDisconnected() {
    onDisconnectedCallback?.call();
  }

  @override
  void onError(String error) {
    onErrorCallback?.call(error);
  }
}
