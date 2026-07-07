package p153k2;

/* renamed from: k2.d */
/* loaded from: classes.dex */
public final class C1791d extends android.content.BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ int f7323a;

    /* renamed from: b */
    public final /* synthetic */ p153k2.C1795h f7324b;

    public /* synthetic */ C1791d(p153k2.C1795h c1795h, int i4) {
        this.f7323a = i4;
        this.f7324b = c1795h;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String str;
        android.bluetooth.BluetoothAdapter bluetoothAdapter;
        android.bluetooth.le.BluetoothLeScanner bluetoothLeScanner;
        android.bluetooth.BluetoothDevice bluetoothDevice;
        java.lang.Object parcelableExtra;
        android.bluetooth.BluetoothDevice bluetoothDevice2;
        java.lang.Object parcelableExtra2;
        switch (this.f7323a) {
            case 0:
                java.lang.String action = intent.getAction();
                if (action == null || !"android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
                    return;
                }
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("OnAdapterStateChanged: ");
                switch (intExtra) {
                    case 10:
                        str = "off";
                        break;
                    case 11:
                        str = "turningOn";
                        break;
                    case 12:
                        str = "on";
                        break;
                    case 13:
                        str = "turningOff";
                        break;
                    default:
                        str = p009B2.AbstractC0051h.m151j(intExtra, "UNKNOWN_ADAPTER_STATE (", ")");
                        break;
                }
                sb.append(str);
                java.lang.String sb2 = sb.toString();
                p153k2.C1795h c1795h = this.f7324b;
                int i4 = 5;
                c1795h.m3765C(sb2, 5);
                if (intExtra == 12 && (bluetoothAdapter = c1795h.f7342o) != null && c1795h.f7343p && (bluetoothLeScanner = bluetoothAdapter.getBluetoothLeScanner()) != null) {
                    c1795h.m3765C("calling stopScan (Bluetooth Restarted)", 5);
                    bluetoothLeScanner.stopScan(c1795h.m3769x());
                    c1795h.f7343p = false;
                }
                java.util.HashMap hashMap = new java.util.HashMap();
                switch (intExtra) {
                    case 10:
                        i4 = 6;
                        break;
                    case 11:
                        i4 = 3;
                        break;
                    case 12:
                        i4 = 4;
                        break;
                    case 13:
                        break;
                    default:
                        i4 = 0;
                        break;
                }
                hashMap.put("adapter_state", java.lang.Integer.valueOf(i4));
                c1795h.m3770z("OnAdapterStateChanged", hashMap);
                if (intExtra == 13 || intExtra == 10) {
                    c1795h.m3766r("adapterTurnOff");
                    return;
                }
                return;
            case 1:
                java.lang.String action2 = intent.getAction();
                if (action2 == null || !action2.equals("android.bluetooth.device.action.PAIRING_REQUEST")) {
                    return;
                }
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra = intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE", android.bluetooth.BluetoothDevice.class);
                    bluetoothDevice = (android.bluetooth.BluetoothDevice) parcelableExtra;
                } else {
                    bluetoothDevice = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                }
                java.lang.String address = bluetoothDevice.getAddress();
                p153k2.C1795h c1795h2 = this.f7324b;
                if (c1795h2.f7350w.containsKey(address)) {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = c1795h2.f7350w;
                    byte[] bArr = (byte[]) concurrentHashMap.get(address);
                    c1795h2.m3765C("Setting PIN code for " + address + ": " + p153k2.C1795h.m3752j(bArr), 5);
                    if (!bluetoothDevice.setPin(bArr)) {
                        c1795h2.m3765C("setPin() failed on " + address, 2);
                    }
                    concurrentHashMap.remove(address);
                    return;
                }
                return;
            default:
                java.lang.String action3 = intent.getAction();
                if (action3 == null || !action3.equals("android.bluetooth.device.action.BOND_STATE_CHANGED")) {
                    return;
                }
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra2 = intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE", android.bluetooth.BluetoothDevice.class);
                    bluetoothDevice2 = (android.bluetooth.BluetoothDevice) parcelableExtra2;
                } else {
                    bluetoothDevice2 = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                }
                int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", Integer.MIN_VALUE);
                int intExtra3 = intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", -1);
                java.lang.String str2 = "OnBondStateChanged: " + p153k2.C1795h.m3751i(intExtra2) + " prev: " + p153k2.C1795h.m3751i(intExtra3);
                p153k2.C1795h c1795h3 = this.f7324b;
                c1795h3.m3765C(str2, 5);
                java.lang.String address2 = bluetoothDevice2.getAddress();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = c1795h3.f7349v;
                if (intExtra2 == 11) {
                    concurrentHashMap2.put(address2, bluetoothDevice2);
                } else {
                    concurrentHashMap2.remove(address2);
                }
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("remote_id", address2);
                hashMap2.put("bond_state", java.lang.Integer.valueOf(intExtra2 != 11 ? intExtra2 != 12 ? 0 : 2 : 1));
                hashMap2.put("prev_state", java.lang.Integer.valueOf(intExtra3 != 11 ? intExtra3 != 12 ? 0 : 2 : 1));
                c1795h3.m3770z("OnBondStateChanged", hashMap2);
                return;
        }
    }
}
