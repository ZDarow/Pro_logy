import 'dart:async';

/// Тип события транспорта
enum TransportEventType { connected, disconnected, error }

/// Событие транспорта (connected/disconnected/error)
class TransportEvent {
  final TransportEventType type;
  final String? message;
  const TransportEvent(this.type, {this.message});
}

/// Абстрактный транспортный слой для PROLOGY протокола
///
/// Поддерживает BLE (GATT) и SPP (RFCOMM/Classic Bluetooth).
/// Позволяет переключать транспорт без изменения бизнес-логики.
abstract class AbstractTransport {
  /// Подключиться к устройству
  Future<bool> connect();

  /// Отключиться
  Future<void> disconnect();

  /// Отправить данные
  Future<bool> send(List<int> data);

  /// Поток входящих данных (нотификации/ответы)
  Stream<List<int>> get onData;

  /// Поток событий транспорта (connected/disconnected/error)
  Stream<TransportEvent> get onEvent;

  /// Статус подключения
  bool get isConnected;

  /// Последняя ошибка (опционально)
  String? get errorMessage => null;

  /// Освободить ресурсы
  Future<void> dispose();
}
