#!/usr/bin/env python3
# ============================================================================
# PROLOGY Controller на основе РЕАЛЬНЫХ пакетов из лога
# Использует перехваченные команды из log-user.txt
# ============================================================================

import time
import sys

# РЕАЛЬНЫЕ пакеты из лога перехвата
PACKETS_FROM_LOG = {
    # 6-байтовые: EQ Query
    'eq_query_0': bytes.fromhex('C000020000A2'),
    'eq_query_5': bytes.fromhex('C0000205050C'),
    'eq_query_159': bytes.fromhex('C000029F00A1'),
    
    # 7-байтовые: Q Factor
    'qfactor_1': bytes.fromhex('C00003920B40E0'),
    'qfactor_2': bytes.fromhex('C00003920B50F0'),
    'qfactor_3': bytes.fromhex('C00003920C32E2'),
    
    # 9-байтовые: EQ Gain Set (полосы 0-10)
    'eq_gain_0': bytes.fromhex('C00005920C322307FF'),
    'eq_gain_1': bytes.fromhex('C00005920C3C230709'),
    'eq_gain_2': bytes.fromhex('C00005920C46230713'),
    'eq_gain_3': bytes.fromhex('C00005920C5023071D'),
    'eq_gain_4': bytes.fromhex('C00005920C5A230727'),
    'eq_gain_5': bytes.fromhex('C00005920C64230731'),
    'eq_gain_6': bytes.fromhex('C00005920C6E23073B'),
    'eq_gain_7': bytes.fromhex('C00005920C78230745'),
    'eq_gain_8': bytes.fromhex('C00005920C8223074F'),
    'eq_gain_9': bytes.fromhex('C00005920C8C230759'),
    'eq_gain_10': bytes.fromhex('C00005920C96230763'),
    
    # 31-байтовый: Preset
    'preset_empty': bytes.fromhex('C0001B9A21080000000000000000000000000000000000000000000000000000DE'),
}

def send_via_rfcomm(packet_name: str):
    """Отправка пакета через RFCOMM"""
    if packet_name not in PACKETS_FROM_LOG:
        print(f"❌ Пакет '{packet_name}' не найден")
        return False
    
    packet = PACKETS_FROM_LOG[packet_name]
    
    try:
        rfcomm = open('/dev/rfcomm0', 'wb')
        print(f"📤 Отправка: {packet_name}")
        print(f"   {packet.hex().upper()}")
        rfcomm.write(packet)
        rfcomm.flush()
        time.sleep(0.1)
        rfcomm.close()
        print("✅ Отправлено")
        return True
    except Exception as e:
        print(f"❌ Ошибка: {e}")
        return False

def send_all_eq_gains():
    """Отправить все полосы EQ (0-10)"""
    print("📤 Отправка всех полос EQ...")
    try:
        rfcomm = open('/dev/rfcomm0', 'wb')
        for i in range(11):
            packet_name = f'eq_gain_{i}'
            packet = PACKETS_FROM_LOG[packet_name]
            rfcomm.write(packet)
            rfcomm.flush()
            print(f"   Полоса {i}: {packet.hex().upper()}")
            time.sleep(0.05)
        rfcomm.close()
        print("✅ Все полосы отправлены")
        return True
    except Exception as e:
        print(f"❌ Ошибка: {e}")
        return False

def test_connection():
    """Тест подключения"""
    print("📡 Тест подключения...")
    try:
        rfcomm = open('/dev/rfcomm0', 'rb')
        print("✅ RFCOMM открыто")
        rfcomm.close()
        return True
    except Exception as e:
        print(f"❌ Ошибка: {e}")
        return False

def main():
    print()
    print("╔═══════════════════════════════════════════════════════════╗")
    print("║     PROLOGY Controller (REAL PACKETS FROM LOG)            ║")
    print("║     На основе перехваченных команд                        ║")
    print("╚═══════════════════════════════════════════════════════════╝")
    print()
    
    if len(sys.argv) < 2:
        print("Использование:")
        print("  python3 prology-real-controller.py <команда>")
        print()
        print("Команды:")
        print("  test              - Тест подключения")
        print("  eq0               - EQ Query полоса 0")
        print("  eq5               - EQ Query полоса 5")
        print("  set0              - EQ Gain Set полоса 0")
        print("  set5              - EQ Gain Set полоса 5")
        print("  qf1               - Q Factor 1")
        print("  qf2               - Q Factor 2")
        print("  all               - Все полосы EQ (0-10)")
        print("  preset            - Пресет (пустой)")
        print()
        print("Пример:")
        print("  python3 prology-real-controller.py eq5")
        return
    
    cmd = sys.argv[1]
    
    if cmd == 'test':
        test_connection()
    
    elif cmd == 'eq0':
        send_via_rfcomm('eq_query_0')
    
    elif cmd == 'eq5':
        send_via_rfcomm('eq_query_5')
    
    elif cmd == 'set0':
        send_via_rfcomm('eq_gain_0')
    
    elif cmd == 'set5':
        send_via_rfcomm('eq_gain_5')
    
    elif cmd == 'qf1':
        send_via_rfcomm('qfactor_1')
    
    elif cmd == 'qf2':
        send_via_rfcomm('qfactor_2')
    
    elif cmd == 'all':
        send_all_eq_gains()
    
    elif cmd == 'preset':
        send_via_rfcomm('preset_empty')
    
    else:
        print(f"❌ Неизвестная команда: {cmd}")

if __name__ == '__main__':
    main()
