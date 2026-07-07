"""
RCSP Protocol — Парсер и генератор пакетов PROLOGY BLE (Jieli AC6951)

Формат пакета:
  TX (Phone→Device): F0 00 [LEN] [CMD] [DATA...] [CHK]
  RX (Device→Phone): C0 00 [LEN] [TYPE] [DATA...] [CHK]
  LEN = len(data) + 1 (checksum, без type)

Checksum:
  Однобайтовые:  chk = data_byte + K
  Многбайтовые:  chk = sum(data_bytes) + K
"""

from dataclasses import dataclass, field
from typing import Optional, Dict, Tuple, List

# ============================================================================
# Таблица констант checksum
# ============================================================================

K_SINGLE: Dict[int, int] = {
    0x01: 0x09,  # Init
    0x03: 0x05,  # Query
    0x04: 0x06,  # Heartbeat
    0x80: 0x84,  # Write param
    0x8E: 0x90,  # Status request
}

K_MULTI: Dict[Tuple[int, Optional[int]], int] = {
    (0x01, None): 0x04,   # Init 2-byte
    (0x80, None): 0x83,   # Write param 2-byte
    (0x8A, 0x10): 0x8E,   # Config
    (0x8A, 0x19): 0x8D,   # Config
    (0x8A, 0x17): 0x8D,   # Config
    (0xA0, 0x07): 0xA6,   # Gain fade
    (0xA0, 0x10): 0xA5,   # Gain fade
    (0xA0, 0x12): 0xA6,   # Gain fade
}

# RX K (для валидации ответов) — однобайтовые
K_RX: Dict[int, int] = {
    0x05: 0x07,  # Heartbeat
    0x07: 0x09,  # Status
    0x9F: 0xA1,  # Confirm
}

# K_RX для многбайтовых ответов (из btsnoop лога, обратный вывод)
K_RX_MULTI: Dict[int, int] = {
    0x90: 0x9B,  # Param data: sum(01,12)=13, chk=AE? → K=0x9B
    0x91: 0x9A,  # Status
    0x92: 0x9A,  # Telemetry
    0x94: 0x97,  # Status
    0x99: 0x9D,  # Status
    0x9A: 0x9E,  # Status data
    0x9E: 0x98,  # Status
    0xB0: 0xB3,  # Config data
    0xB1: 0xB4,  # Config data
}

# ============================================================================
# Точные ответы устройства (из btsnoop лога)
# ============================================================================

# Identification пакет (после Init) — полный пакет ВКЛЮЧАЯ sync/len/type/chk
# Из btsnoop: C0 00 27 FF ... 6A
IDENTIFICATION_PACKET = bytes.fromhex(
    "C0 00 27 FF 00 04 01 05 07 04 00 04 02 C5 00 03 00 08 08"
    "DC 78 E7 12 FF 03 00 00 0E 03 56 45 52 20 38 2E 37 44 53"
    "50 20 20 20 6A"
)

# Params map — полный пакет
PARAMS_MAP_PACKET = bytes.fromhex(
    "C0 00 38 FF 00 03 92 14 0F 00 03 92 15 03 00 03 92 12 00"
    "00 03 92 13 01 00 03 92 16 01 00 03 92 17 00 00 03 92 18"
    "00 00 03 92 19 01 00 03 92 1B 00 00 03 92 1A 01 00 03 92"
    "1D 00 B2"
)

# Payload (без sync/res/len/type/chk) для парсинга
IDENTIFICATION_PAYLOAD = bytes.fromhex(
    "00 04 01 05 07 04 00 04 02 C5 00 03 00 08 08"
    "DC 78 E7 12 FF 03 00 00 0E 03 56 45 52 20 38 2E 37"
    "44 53 50 20 20 20 6A"
)

PARAMS_MAP = bytes.fromhex(
    "00 03 92 14 0F 00 03 92 15 03 00 03 92 12 00"
    "00 03 92 13 01 00 03 92 16 01 00 03 92 17 00 00"
    "03 92 18 00 00 03 92 19 01 00 03 92 1B 00 00 03"
    "92 1A 01 00 03 92 1D 00 B2"
)

# Ответы на Init (отправляются密集的 после Init команды)
# Это ПОЛНЫЕ пакеты из btsnoop лога — НЕ пересобирать!
INIT_RESPONSE_PACKETS = [
    bytes.fromhex("C0 00 03 90 01 12 A6"),
    bytes.fromhex("C0 00 04 90 03 3E 00 D5"),
    bytes.fromhex("C0 00 03 90 00 00 93"),
    bytes.fromhex("C0 00 05 92 0C 28 23 27 15"),
    bytes.fromhex("C0 00 0E 92 0D 2E 22 28 23 48 26 68 29 30 2A 2E 22 F1"),
    bytes.fromhex("C0 00 03 92 0A 04 A3"),
    bytes.fromhex("C0 00 03 92 0B 00 A0"),
    bytes.fromhex("C0 00 02 9E 06 A6"),
    bytes.fromhex("C0 00 03 91 01 00 95"),
    bytes.fromhex("C0 00 03 9A 01 00 9E"),
    bytes.fromhex("C0 00 03 B0 01 00 B4"),
    bytes.fromhex("C0 00 03 B0 0C 01 C0"),
    bytes.fromhex("C0 00 03 B0 10 00 C3"),
    bytes.fromhex("C0 00 03 B0 27 0D D1"),
    bytes.fromhex("C0 00 03 B0 00 01 B3"),
    bytes.fromhex("C0 00 03 B1 00 01 B5"),
    bytes.fromhex("C0 00 02 9F 00 A1"),
]

# Heartbeat response (основной)
HEARTBEAT_RESPONSE = bytes.fromhex("05 06 0D")

# Heartbeat response (начальный)
HEARTBEAT_RESPONSE_INIT = bytes.fromhex("05 05 0C")

# ============================================================================
# Функции checksum
# ============================================================================


def compute_checksum(cmd_type: int, data: bytes) -> Optional[int]:
    """
    Вычислить checksum для пакета.

    Args:
        cmd_type: тип команды (байт 3)
        data: байты данных (без sync, res, len, type, checksum)

    Returns:
        checksum byte или None если тип неизвестен
    """
    if len(data) == 1:
        K = K_SINGLE.get(cmd_type)
        if K is None:
            return None
        return (data[0] + K) & 0xFF
    else:
        sub_cmd = data[0] if len(data) >= 1 else None
        K = K_MULTI.get((cmd_type, sub_cmd))
        if K is None:
            K = K_MULTI.get((cmd_type, None))
        if K is None:
            return None
        return (sum(data) + K) & 0xFF


def compute_rx_checksum(type_byte: int, data: bytes) -> Optional[int]:
    """Вычислить checksum для RX пакета."""
    if len(data) == 1:
        K = K_RX.get(type_byte)
        if K is None:
            return None
        return (data[0] + K) & 0xFF
    else:
        K = K_RX_MULTI.get(type_byte)
        if K is None:
            return None
        return (sum(data) + K) & 0xFF


def validate_tx_packet(data: bytes) -> Tuple[bool, str]:
    """
    Проверить валидность TX пакета.

    Returns:
        (valid, message)
    """
    if len(data) < 6:
        return False, "Packet too short"

    if data[0] != 0xF0:
        return False, f"Wrong sync byte: 0x{data[0]:02X}"

    if data[1] != 0x00:
        return False, f"Wrong reserved byte: 0x{data[1]:02X}"

    cmd_type = data[3]
    payload = data[4:-1]
    actual_checksum = data[-1]
    expected_checksum = compute_checksum(cmd_type, payload)

    if expected_checksum is None:
        return False, f"Unknown command type: 0x{cmd_type:02X}"

    if actual_checksum != expected_checksum:
        return False, (
            f"Checksum mismatch: expected 0x{expected_checksum:02X}, "
            f"got 0x{actual_checksum:02X}"
        )

    return True, "OK"

# ============================================================================
# Генератор пакетов
# ============================================================================


def build_packet(is_tx: bool, cmd_type: int, data: bytes) -> bytes:
    """
    Собрать RCSP пакет.

    Args:
        is_tx: True для TX (F0), False для RX (C0)
        cmd_type: тип команды
        data: данные (без checksum)

    Returns:
        полный пакет байтов
    """
    sync = 0xF0 if is_tx else 0xC0
    length = len(data) + 1  # +1 для checksum

    if is_tx:
        checksum = compute_checksum(cmd_type, data)
    else:
        checksum = compute_rx_checksum(cmd_type, data)

    if checksum is None:
        raise ValueError(
            f"Cannot compute checksum for type 0x{cmd_type:02X} "
            f"with {len(data)} data bytes"
        )

    return bytes([sync, 0x00, length, cmd_type]) + data + bytes([checksum])


def build_tx(cmd_type: int, data: bytes) -> bytes:
    """Собрать TX пакет (Phone→Device)."""
    return build_packet(True, cmd_type, data)


def build_rx(type_byte: int, data: bytes) -> bytes:
    """Собрать RX пакет (Device→Phone)."""
    return build_packet(False, type_byte, data)

# ============================================================================
# Фабрика команд (TX — что шлёт телефон)
# ============================================================================


def cmd_init() -> bytes:
    """Инициализация сессии."""
    return build_tx(0x01, bytes([0x05, 0x00]))


def cmd_heartbeat(data: int = 0x47) -> bytes:
    """Heartbeat (по умолчанию 0x47)."""
    return build_tx(0x04, bytes([data]))


def cmd_query(param: int) -> bytes:
    """Запрос данных (param: 0x01-0x06)."""
    return build_tx(0x03, bytes([param]))


def cmd_write_param(value: int) -> bytes:
    """Запись параметра (регистр 0x01)."""
    return build_tx(0x80, bytes([0x01, value]))


def cmd_status_req(channel: int) -> bytes:
    """Запрос статуса канала (1-6)."""
    return build_tx(0x8E, bytes([channel]))


def cmd_config_8a(sub_cmd: int, value: int) -> bytes:
    """Расширенная конфигурация 0x8A."""
    return build_tx(0x8A, bytes([sub_cmd, value]))


def cmd_gain_fade(value: int) -> bytes:
    """Gain fade-in (серия A0 0x07)."""
    return build_tx(0xA0, bytes([0x07, 0x00, value, 0xFF, 0x00]))

# ============================================================================
# Фабрика ответов (RX — что шлёт устройство)
# ============================================================================


def rx_heartbeat(status: int = 0x06) -> bytes:
    """Heartbeat response."""
    return build_rx(0x05, bytes([status]))


def rx_confirm(channel: int) -> bytes:
    """Confirm на status request."""
    return build_rx(0x9F, bytes([channel]))


def rx_identification() -> List[bytes]:
    """Полный набор ответов на Init (полные пакеты из btsnoop лога)."""
    return [
        IDENTIFICATION_PACKET,
        PARAMS_MAP_PACKET,
    ] + INIT_RESPONSE_PACKETS

# ============================================================================
# Парсер входящих пакетов
# ============================================================================


@dataclass
class ParsedPacket:
    """Распарсенный RCSP пакет."""
    is_tx: bool
    cmd_type: int
    data: bytes
    checksum: int
    checksum_valid: bool
    raw: bytes

    @property
    def type_name(self) -> str:
        names = {
            0x01: "Init",
            0x03: "Query",
            0x04: "Heartbeat",
            0x80: "WriteParam",
            0x8A: "Config",
            0x8E: "StatusReq",
            0xA0: "GainFade",
            0x05: "HeartbeatRX",
            0x07: "StatusRX",
            0x9F: "Confirm",
            0xFF: "Identification",
        }
        return names.get(self.cmd_type, f"Unknown(0x{self.cmd_type:02X})")

    def __str__(self) -> str:
        direction = "TX" if self.is_tx else "RX"
        chk = "✓" if self.checksum_valid else "✗"
        return (
            f"[{direction}] {self.type_name}: "
            f"{' '.join(f'{b:02X}' for b in self.raw)} {chk}"
        )


def parse_packet(raw: bytes) -> Optional[ParsedPacket]:
    """
    Распарсить RCSP пакет.

    Args:
        raw: сырые байты пакета

    Returns:
        ParsedPacket или None если пакет невалиден
    """
    if len(raw) < 6:
        return None

    sync = raw[0]
    if sync not in (0xF0, 0xC0):
        return None

    is_tx = (sync == 0xF0)
    cmd_type = raw[3]
    data = raw[4:-1]
    checksum = raw[-1]

    # Проверить checksum
    if is_tx:
        expected = compute_checksum(cmd_type, data)
    else:
        expected = compute_rx_checksum(cmd_type, data)

    checksum_valid = (expected is not None and checksum == expected)

    return ParsedPacket(
        is_tx=is_tx,
        cmd_type=cmd_type,
        data=data,
        checksum=checksum,
        checksum_valid=checksum_valid,
        raw=raw,
    )

# ============================================================================
# Обработчик команд (для эмулятора)
# ============================================================================


class RCSPHandler:
    """
    Обработчик RCSP команд для эмулятора.

    Принимает TX команду от телефона, возвращает список RX ответов.
    """

    def __init__(self):
        self._state = "idle"  # idle, initialized
        self._param_values: Dict[int, int] = {}
        self._heartbeat_count = 0

    def handle(self, raw: bytes) -> List[bytes]:
        """
        Обработать входящий TX пакет.

        Args:
            raw: сырые байты TX пакета

        Returns:
            список RX пакетов для отправки
        """
        pkt = parse_packet(raw)
        if pkt is None:
            return []

        if not pkt.checksum_valid:
            print(f"[RCSP] Invalid checksum, ignoring: {pkt}")
            return []

        handler = getattr(self, f"_handle_{pkt.cmd_type:02X}", None)
        if handler is None:
            print(f"[RCSP] Unknown command 0x{pkt.cmd_type:02X}: {pkt}")
            return []

        return handler(pkt)

    def _handle_01(self, pkt: ParsedPacket) -> List[bytes]:
        """Init — отправить идентификацию и параметры."""
        print(f"[RCSP] Init received")
        self._state = "initialized"
        return rx_identification()

    def _handle_04(self, pkt: ParsedPacket) -> List[bytes]:
        """Heartbeat — ответить heartbeat."""
        self._heartbeat_count += 1
        status = 0x06 if self._state == "initialized" else 0x05
        print(f"[RCSP] Heartbeat #{self._heartbeat_count} (status={status})")
        return [rx_heartbeat(status)]

    def _handle_03(self, pkt: ParsedPacket) -> List[bytes]:
        """Query — вернуть статус."""
        if len(pkt.data) >= 1:
            param = pkt.data[0]
            print(f"[RCSP] Query param=0x{param:02X}")
            return [build_rx(0x90, bytes([param, 0x00]))]
        return []

    def _handle_80(self, pkt: ParsedPacket) -> List[bytes]:
        """Write param — сохранить и подтвердить."""
        if len(pkt.data) >= 2:
            reg, val = pkt.data[0], pkt.data[1]
            self._param_values[reg] = val
            print(f"[RCSP] Write param reg=0x{reg:02X} val=0x{val:02X}")
        return []

    def _handle_8E(self, pkt: ParsedPacket) -> List[bytes]:
        """Status request — подтвердить."""
        if len(pkt.data) >= 1:
            ch = pkt.data[0]
            print(f"[RCSP] Status request channel={ch}")
            return [rx_confirm(ch)]
        return []

    def _handle_8A(self, pkt: ParsedPacket) -> List[bytes]:
        """Config — подтвердить."""
        if len(pkt.data) >= 2:
            sub, val = pkt.data[0], pkt.data[1]
            print(f"[RCSP] Config sub=0x{sub:02X} val=0x{val:02X}")
        return []

    def _handle_A0(self, pkt: ParsedPacket) -> List[bytes]:
        """Gain fade — подтвердить."""
        if len(pkt.data) >= 3:
            val = pkt.data[2]
            print(f"[RCSP] Gain fade value=0x{val:02X}")
        return []
