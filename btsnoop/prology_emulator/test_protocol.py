"""
Тесты RCSP протокола — проверка парсинга, генерации, checksum
"""

import pytest
import sys
import os

sys.path.insert(0, os.path.dirname(__file__))
from rcsp_protocol import (
    compute_checksum, compute_rx_checksum, validate_tx_packet,
    build_tx, build_rx, build_packet,
    cmd_init, cmd_heartbeat, cmd_query, cmd_write_param,
    cmd_status_req, cmd_config_8a, cmd_gain_fade,
    rx_heartbeat, rx_confirm, rx_identification,
    parse_packet, ParsedPacket, RCSPHandler,
    IDENTIFICATION_PAYLOAD, PARAMS_MAP,
    K_SINGLE, K_MULTI, K_RX,
)


# ============================================================================
# Тесты Checksum
# ============================================================================

class TestChecksum:
    """Тесты вычисления checksum."""

    def test_single_heartbeat(self):
        """Heartbeat: 0x47 + K=0x06 = 0x4D."""
        assert compute_checksum(0x04, bytes([0x47])) == 0x4D

    def test_single_heartbeat_01(self):
        """Heartbeat: 0x01 + K=0x06 = 0x07."""
        assert compute_checksum(0x04, bytes([0x01])) == 0x07

    def test_single_heartbeat_05(self):
        """Heartbeat: 0x05 + K=0x06 = 0x0B."""
        assert compute_checksum(0x04, bytes([0x05])) == 0x0B

    def test_single_query(self):
        """Query: 0x01 + K=0x05 = 0x06."""
        assert compute_checksum(0x03, bytes([0x01])) == 0x06

    def test_single_status_req(self):
        """Status: 0x01 + K=0x90 = 0x91."""
        assert compute_checksum(0x8E, bytes([0x01])) == 0x91

    def test_single_write_param(self):
        """Write param: 0x27 + K=0x84 = 0xAB."""
        # Для мультибайт: sum(01,27) + 0x84 = 0x28+0x84 = 0xAC... 
        # Но K_SINGLE для 0x80 = 0x84 (single byte data)
        assert compute_checksum(0x80, bytes([0x27])) == 0xAB

    def test_rx_heartbeat(self):
        """RX Heartbeat: 0x06 + K=0x07 = 0x0D."""
        assert compute_rx_checksum(0x05, bytes([0x06])) == 0x0D

    def test_rx_confirm(self):
        """RX Confirm: 0x01 + K=0xA1 = 0xA2."""
        assert compute_rx_checksum(0x9F, bytes([0x01])) == 0xA2

    def test_unknown_type(self):
        """Неизвестный тип → None."""
        assert compute_checksum(0xFF, bytes([0x00])) is None

    def test_multi_write_param(self):
        """Write param multi: sum(01,27)+K=0x83 = 0x28+0x83=0xAB."""
        assert compute_checksum(0x80, bytes([0x01, 0x27])) == 0xAB

    def test_multi_init(self):
        """Init multi: sum(05,00)+K=0x04 = 0x05+0x04=0x09."""
        assert compute_checksum(0x01, bytes([0x05, 0x00])) == 0x09

    def test_multi_config_8a(self):
        """Config 0x8A: sum(10,00,00)+K=0x8E = 0x10+0x8E=0x9E."""
        assert compute_checksum(0x8A, bytes([0x10, 0x00, 0x00])) == 0x9E


# ============================================================================
# Тесты генерации пакетов
# ============================================================================

class TestPacketGeneration:
    """Тесты генерации пакетов."""

    def test_init_packet(self):
        """Init: F0 00 03 01 05 00 09."""
        pkt = cmd_init()
        assert pkt.hex().upper() == "F0000301050009"

    def test_heartbeat_47(self):
        """Heartbeat 0x47: F0 00 02 04 47 4D."""
        pkt = cmd_heartbeat(0x47)
        assert pkt.hex().upper() == "F0000204474D"

    def test_heartbeat_01(self):
        """Heartbeat 0x01: F0 00 02 04 01 07."""
        pkt = cmd_heartbeat(0x01)
        assert pkt.hex().upper() == "F00002040107"

    def test_query_01(self):
        """Query 0x01: F0 00 02 03 01 06."""
        pkt = cmd_query(0x01)
        assert pkt.hex().upper() == "F00002030106"

    def test_write_param_27(self):
        """Write param 0x27: F0 00 03 80 01 27 AB."""
        pkt = cmd_write_param(0x27)
        assert pkt.hex().upper() == "F00003800127AB"

    def test_status_req_ch1(self):
        """Status ch1: F0 00 02 8E 01 91."""
        pkt = cmd_status_req(1)
        assert pkt.hex().upper() == "F000028E0191"

    def test_status_req_ch3(self):
        """Status ch3: F0 00 02 8E 03 93."""
        pkt = cmd_status_req(3)
        assert pkt.hex().upper() == "F000028E0393"

    def test_rx_heartbeat_06(self):
        """RX Heartbeat: C0 00 02 05 06 0D."""
        pkt = rx_heartbeat(0x06)
        assert pkt.hex().upper() == "C0000205060D"

    def test_rx_heartbeat_05(self):
        """RX Heartbeat init: C0 00 02 05 05 0C."""
        pkt = rx_heartbeat(0x05)
        assert pkt.hex().upper() == "C0000205050C"

    def test_rx_confirm_ch1(self):
        """RX Confirm ch1: C0 00 02 9F 01 A2."""
        pkt = rx_confirm(1)
        assert pkt.hex().upper() == "C000029F01A2"


# ============================================================================
# Тесты валидации пакетов из btsnoop лога
# ============================================================================

class TestRealPackets:
    """Тесты на реальных пакетах из btsnoop лога."""

    def test_all_tx_packets_from_log(self):
        """Все TX команды из btsnoop лога должны проходить валидацию."""
        real_packets = [
            "F0000301050009",       # Init
            "F0000204474D",         # Heartbeat
            "F00002040107",         # Heartbeat
            "F0000204050B",         # Heartbeat
            "F0000204060C",         # Heartbeat
            "F00003800127AB",       # Write param
            "F00003800139BD",       # Write param
            "F0000380012CB0",       # Write param
            "F0000380011EA2",       # Write param
            "F000038001098D",       # Write param
            "F000038001088C",       # Write param
            "F000038001199D",       # Write param
            "F0000380011599",       # Write param
            "F0000380010C90",       # Write param
            "F0000380010B8F",       # Write param
            "F0000380010A8E",       # Write param
            "F000038001078B",       # Write param
            "F000028E0191",         # Status req
            "F000028E0292",         # Status req
            "F000028E0393",         # Status req
            "F000028E0494",         # Status req
            "F000028E0595",         # Status req
            "F000028E0696",         # Status req
            "F00002030106",         # Query
            "F00002030308",         # Query
            "F0000203050A",         # Query
            "F0000203060B",         # Query
            "F00002030409",         # Query
            "F00002030207",         # Query
            "F000048A1000009E",     # Config 8A
            "F000048A100104A3",     # Config 8A
            "F000048A1003FC9D",     # Config 8A
            "F000038A1903A9",       # Config 8A
            "F000038A1901A7",       # Config 8A
            "F000038A1900A6",       # Config 8A
            "F000038A1704A8",       # Config 8A
            "F000038A1700A4",       # Config 8A
            "F000038A1701A5",       # Config 8A
            "F000038A1703A7",       # Config 8A
            "F000038A1702A6",       # Config 8A
        ]

        passed = 0
        failed = 0
        for hex_str in real_packets:
            raw = bytes.fromhex(hex_str)
            valid, msg = validate_tx_packet(raw)
            if valid:
                passed += 1
            else:
                failed += 1
                print(f"  FAIL: {hex_str} → {msg}")

        print(f"  Passed: {passed}/{passed+failed}")
        assert failed == 0, f"{failed} packets failed validation"


# ============================================================================
# Тесты парсинга
# ============================================================================

class TestParsing:
    """Тесты парсинга пакетов."""

    def test_parse_heartbeat(self):
        pkt = parse_packet(bytes.fromhex("F0000204474D"))
        assert pkt is not None
        assert pkt.is_tx is True
        assert pkt.cmd_type == 0x04
        assert pkt.data == bytes([0x47])
        assert pkt.checksum == 0x4D
        assert pkt.checksum_valid is True

    def test_parse_init(self):
        pkt = parse_packet(bytes.fromhex("F0000301050009"))
        assert pkt is not None
        assert pkt.cmd_type == 0x01
        assert pkt.data == bytes([0x05, 0x00])
        assert pkt.checksum_valid is True

    def test_parse_rx_heartbeat(self):
        pkt = parse_packet(bytes.fromhex("C0000205060D"))
        assert pkt is not None
        assert pkt.is_tx is False
        assert pkt.cmd_type == 0x05
        assert pkt.checksum_valid is True

    def test_parse_rx_confirm(self):
        pkt = parse_packet(bytes.fromhex("C000029F01A2"))
        assert pkt is not None
        assert pkt.cmd_type == 0x9F
        assert pkt.checksum_valid is True

    def test_parse_too_short(self):
        pkt = parse_packet(bytes([0xF0, 0x00, 0x02]))
        assert pkt is None

    def test_parse_wrong_sync(self):
        pkt = parse_packet(bytes.fromhex("A00002044700"))
        assert pkt is None

    def test_packet_str(self):
        pkt = parse_packet(bytes.fromhex("F0000204474D"))
        s = str(pkt)
        assert "TX" in s
        assert "Heartbeat" in s


# ============================================================================
# Тесты RCSPHandler
# ============================================================================

class TestRCSPHandler:
    """Тесты обработчика команд."""

    def test_init_response(self):
        handler = RCSPHandler()
        responses = handler.handle(cmd_init())
        assert len(responses) > 0
        # Первый ответ — identification
        assert responses[0][3] == 0xFF  # type == 0xFF

    def test_heartbeat_response(self):
        handler = RCSPHandler()
        handler.handle(cmd_init())  # init first
        responses = handler.handle(cmd_heartbeat())
        assert len(responses) == 1
        pkt = parse_packet(responses[0])
        assert pkt is not None
        assert pkt.cmd_type == 0x05
        assert pkt.checksum_valid is True

    def test_status_confirm(self):
        handler = RCSPHandler()
        responses = handler.handle(cmd_status_req(1))
        assert len(responses) == 1
        pkt = parse_packet(responses[0])
        assert pkt is not None
        assert pkt.cmd_type == 0x9F
        assert pkt.data == bytes([1])

    def test_invalid_checksum(self):
        handler = RCSPHandler()
        bad_packet = bytes([0xF0, 0x00, 0x02, 0x04, 0x47, 0x00])  # wrong chk
        responses = handler.handle(bad_packet)
        assert len(responses) == 0

    def test_unknown_command(self):
        handler = RCSPHandler()
        unknown = bytes([0xF0, 0x00, 0x02, 0xFF, 0x00, 0x00])
        responses = handler.handle(unknown)
        assert len(responses) == 0


# ============================================================================
# Тесты identification данных
# ============================================================================

class TestIdentification:
    """Тесты identification данных."""

    def test_identification_contains_version(self):
        """Identification должен содержать VER 8.7DSP."""
        ascii_data = IDENTIFICATION_PAYLOAD.decode('ascii', errors='ignore')
        assert "VER 8.7DSP" in ascii_data

    def test_params_map_length(self):
        """Params map должен быть правильной длины."""
        assert len(PARAMS_MAP) == 56  # без sync/res/len/type

    def test_rx_identification_count(self):
        """rx_identification должен вернуть несколько пакетов."""
        packets = rx_identification()
        assert len(packets) > 5  # identification + params + responses


# ============================================================================
# Entry point
# ============================================================================

if __name__ == "__main__":
    pytest.main([__file__, "-v"])
