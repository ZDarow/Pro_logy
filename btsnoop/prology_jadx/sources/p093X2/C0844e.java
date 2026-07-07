package p093X2;

/* renamed from: X2.e */
/* loaded from: classes.dex */
public final class C0844e implements p047L2.InterfaceC0386p {

    /* renamed from: a */
    public final /* synthetic */ android.bluetooth.BluetoothDevice f3021a;

    /* renamed from: b */
    public final /* synthetic */ android.content.BroadcastReceiver.PendingResult f3022b;

    /* renamed from: c */
    public final /* synthetic */ android.content.Intent f3023c;

    /* renamed from: d */
    public final /* synthetic */ p093X2.C0843d f3024d;

    public C0844e(p093X2.C0843d c0843d, android.bluetooth.BluetoothDevice bluetoothDevice, android.content.BroadcastReceiver.PendingResult pendingResult, android.content.Intent intent) {
        this.f3024d = c0843d;
        this.f3021a = bluetoothDevice;
        this.f3022b = pendingResult;
        this.f3023c = intent;
    }

    @Override // p047L2.InterfaceC0386p
    /* renamed from: a */
    public final void mo741a(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // p047L2.InterfaceC0386p
    /* renamed from: b */
    public final void mo742b(java.lang.Object obj) {
        android.util.Log.d("FlutterBluePlugin", obj.toString());
        boolean z4 = obj instanceof java.lang.String;
        android.content.BroadcastReceiver.PendingResult pendingResult = this.f3022b;
        if (z4) {
            try {
                java.lang.String str = (java.lang.String) obj;
                byte[] bytes = str.getBytes();
                android.util.Log.d("FlutterBluePlugin", "Trying to set passkey for pairing to ".concat(str));
                this.f3021a.setPin(bytes);
                pendingResult.abortBroadcast();
            } catch (java.lang.Exception e4) {
                android.util.Log.e("FlutterBluePlugin", e4.getMessage());
                e4.printStackTrace();
            }
        } else {
            android.util.Log.d("FlutterBluePlugin", "Manual pin pairing in progress");
            this.f3024d.f3020b.f3080x.startActivity(this.f3023c, null);
        }
        pendingResult.finish();
    }

    @Override // p047L2.InterfaceC0386p
    /* renamed from: c */
    public final void mo743c() {
        throw new java.lang.UnsupportedOperationException();
    }
}
