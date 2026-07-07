/// Буфер для сборки полных PROLOGY-фреймов из сырых байт.
///
/// Протокол: `6F CMD TYPE LEN [DATA...] CS 8F`
///
/// Алгоритм:
/// 1. Накапливает байты во внутреннем буфере.
/// 2. Ищет SYNC (0x6F) — с этого байта начинается фрейм.
/// 3. Ищет END (0x8F) — на этом байте фрейм заканчивается.
/// 4. Извлекает полный фрейм (SYNC..END включительно).
/// 5. Остаток буфера сохраняет для следующего вызова [feed].
///
/// Если буфер разрастается >64 КБ без обнаружения SYNC — сбрасывается
/// (защита от мусорных данных).
///
/// ## Примеры
/// ```dart
/// final buf = SppFrameBuffer();
///
/// // Один полный пакет
/// buf.feed([0x6F, 0x0F, 0x80, 0x03, 0x00, 0x01, 0x32, 0x??, 0x8F]);
/// // → возвращает [[0x6F, ..., 0x8F]]
///
/// // Два пакета в одном чтении
/// buf.feed([0x6F, ..., 0x8F, 0x6F, ..., 0x8F]);
/// // → возвращает [пакет1, пакет2]
///
/// // Пакет разрезан между чтениями
/// buf.feed([0x6F, 0x0F, 0x80]);
/// // → [] (ждём END)
/// buf.feed([0x03, 0x00, 0x01, 0x32, 0x??, 0x8F]);
/// // → [[0x6F, ..., 0x8F]]
/// ```
class SppFrameBuffer {
  /// Максимальный размер буфера (64 КБ). При превышении — сброс.
  static const int maxBufferSize = 65536;

  /// Маркеры протокола
  static const int _sync = 0x6f;
  static const int _end = 0x8f;

  /// Минимальная длина полного фрейма: SYNC CMD TYPE LEN CS END = 6 байт
  static const int _minFrameLength = 6;

  final List<int> _buffer = [];
  int _syncIndex = -1;

  /// Принять порцию байт и извлечь все полные фреймы.
  ///
  /// Возвращает список целых фреймов (каждый от 0x6F до 0x8F включительно).
  List<List<int>> feed(List<int> chunk) {
    _buffer.addAll(chunk);
    return _extractFrames();
  }

  /// Очистить буфер.
  void clear() {
    _buffer.clear();
    _syncIndex = -1;
  }

  /// Текущий размер буфера (для тестов и диагностики).
  int get bufferSize => _buffer.length;

  List<List<int>> _extractFrames() {
    if (_buffer.length > maxBufferSize) {
      // Защита от мусора — сбрасываем, если нет SYNC в пределах лимита
      _buffer.clear();
      _syncIndex = -1;
      return [];
    }

    final List<List<int>> frames = [];

    while (true) {
      // Ищем SYNC (0x6F) начиная с последней известной позиции
      if (_syncIndex < 0 || _syncIndex >= _buffer.length) {
        _syncIndex = _buffer.indexOf(_sync);
      }

      if (_syncIndex < 0) {
        // Нет SYNC во всём буфере — очищаем (данные без начала фрейма)
        _buffer.clear();
        return frames;
      }

      // Проверяем минимальную длину от SYNC
      if (_syncIndex + _minFrameLength > _buffer.length) {
        // Не хватает байт даже на минимальный фрейм — ждём ещё данных
        return frames;
      }

      // Ищем END (0x8F) после SYNC
      final endIndex = _buffer.indexOf(_end, _syncIndex + 1);
      if (endIndex < 0) {
        // Нет END — ждём ещё данных
        return frames;
      }

      // Извлекаем фрейм [SYNC .. END]
      final frame = _buffer.sublist(_syncIndex, endIndex + 1);
      frames.add(frame);

      // Удаляем обработанные байты из буфера (включая END)
      _buffer.removeRange(0, endIndex + 1);
      _syncIndex = -1; // следующий поиск начнётся с начала буфера
    }
  }
}
