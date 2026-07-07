package p093X2;

/* renamed from: X2.d */
/* loaded from: classes.dex */
public final class C0843d extends android.content.BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ int f3019a;

    /* renamed from: b */
    public final /* synthetic */ p093X2.C0857r f3020b;

    public /* synthetic */ C0843d(p093X2.C0857r c0857r, int i4) {
        this.f3019a = i4;
        this.f3020b = c0857r;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        p093X2.C0857r c0857r = this.f3020b;
        switch (this.f3019a) {
            case 0:
                if (c0857r.f3072p == null) {
                    return;
                }
                java.lang.String action = intent.getAction();
                action.getClass();
                if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                    android.util.SparseArray sparseArray = c0857r.f3078v;
                    int size = sparseArray.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ((p093X2.C0849j) sparseArray.valueAt(i4)).m1681b();
                    }
                    sparseArray.clear();
                    c0857r.f3072p.m830c(java.lang.Integer.valueOf(intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE)));
                    return;
                }
                return;
            case 1:
                java.lang.String action2 = intent.getAction();
                action2.getClass();
                if (action2.equals("android.bluetooth.device.action.PAIRING_REQUEST")) {
                    android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    int intExtra = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_VARIANT", Integer.MIN_VALUE);
                    android.util.Log.d("FlutterBluePlugin", "Pairing request (variant " + intExtra + ") incoming from " + bluetoothDevice.getAddress());
                    if (intExtra == 0) {
                        android.content.BroadcastReceiver.PendingResult goAsync = goAsync();
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("address", bluetoothDevice.getAddress());
                        hashMap.put("variant", java.lang.Integer.valueOf(intExtra));
                        c0857r.f3068l.m694j("handlePairingRequest", hashMap, new p093X2.C0844e(this, bluetoothDevice, goAsync, intent));
                        return;
                    }
                    if (intExtra == 2 || intExtra == 3) {
                        int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_KEY", Integer.MIN_VALUE);
                        java.util.HashMap hashMap2 = new java.util.HashMap();
                        hashMap2.put("address", bluetoothDevice.getAddress());
                        hashMap2.put("variant", java.lang.Integer.valueOf(intExtra));
                        hashMap2.put("pairingKey", java.lang.Integer.valueOf(intExtra2));
                        c0857r.f3068l.m694j("handlePairingRequest", hashMap2, new p093X2.C0845f(this, intExtra2, bluetoothDevice, goAsync(), intent));
                        return;
                    }
                    if (intExtra != 4 && intExtra != 5) {
                        android.util.Log.w("FlutterBluePlugin", "Unknown pairing variant: " + intExtra);
                        return;
                    }
                    int intExtra3 = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_KEY", Integer.MIN_VALUE);
                    java.util.HashMap hashMap3 = new java.util.HashMap();
                    hashMap3.put("address", bluetoothDevice.getAddress());
                    hashMap3.put("variant", java.lang.Integer.valueOf(intExtra));
                    hashMap3.put("pairingKey", java.lang.Integer.valueOf(intExtra3));
                    c0857r.f3068l.m694j("handlePairingRequest", hashMap3, null);
                    return;
                }
                return;
            default:
                java.lang.String action3 = intent.getAction();
                action3.getClass();
                if (action3.equals("android.bluetooth.adapter.action.DISCOVERY_FINISHED")) {
                    android.util.Log.d("FlutterBluePlugin", "Discovery finished");
                    try {
                        context.unregisterReceiver(c0857r.f3077u);
                    } catch (java.lang.IllegalArgumentException unused) {
                    }
                    c0857r.f3070n.cancelDiscovery();
                    p047L2.C0378h c0378h = c0857r.f3076t;
                    if (c0378h != null) {
                        c0378h.m828a();
                        c0857r.f3076t = null;
                        return;
                    }
                    return;
                }
                if (action3.equals("android.bluetooth.device.action.FOUND")) {
                    android.bluetooth.BluetoothDevice bluetoothDevice2 = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    short shortExtra = intent.getShortExtra("android.bluetooth.device.extra.RSSI", Short.MIN_VALUE);
                    java.util.HashMap hashMap4 = new java.util.HashMap();
                    hashMap4.put("address", bluetoothDevice2.getAddress());
                    hashMap4.put("name", bluetoothDevice2.getName());
                    hashMap4.put("type", java.lang.Integer.valueOf(bluetoothDevice2.getType()));
                    hashMap4.put("isConnected", java.lang.Boolean.valueOf(p093X2.C0857r.m1685i(bluetoothDevice2)));
                    hashMap4.put("bondState", java.lang.Integer.valueOf(bluetoothDevice2.getBondState()));
                    hashMap4.put("rssi", java.lang.Integer.valueOf(shortExtra));
                    android.util.Log.d("FlutterBluePlugin", "Discovered " + bluetoothDevice2.getAddress());
                    p047L2.C0378h c0378h2 = c0857r.f3076t;
                    if (c0378h2 != null) {
                        c0378h2.m830c(hashMap4);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
