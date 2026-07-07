package p093X2;

/* renamed from: X2.f */
/* loaded from: classes.dex */
public final class C0845f implements p047L2.InterfaceC0386p {

    /* renamed from: a */
    public final /* synthetic */ int f3025a;

    /* renamed from: b */
    public final /* synthetic */ android.bluetooth.BluetoothDevice f3026b;

    /* renamed from: c */
    public final /* synthetic */ android.content.BroadcastReceiver.PendingResult f3027c;

    /* renamed from: d */
    public final /* synthetic */ android.content.Intent f3028d;

    /* renamed from: e */
    public final /* synthetic */ p093X2.C0843d f3029e;

    public C0845f(p093X2.C0843d c0843d, int i4, android.bluetooth.BluetoothDevice bluetoothDevice, android.content.BroadcastReceiver.PendingResult pendingResult, android.content.Intent intent) {
        this.f3029e = c0843d;
        this.f3025a = i4;
        this.f3026b = bluetoothDevice;
        this.f3027c = pendingResult;
        this.f3028d = intent;
    }

    @Override // p047L2.InterfaceC0386p
    /* renamed from: a */
    public final void mo741a(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        android.util.Log.e("FlutterBluePlugin", str + " " + str2);
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // p047L2.InterfaceC0386p
    /* renamed from: b */
    public final void mo742b(java.lang.Object obj) {
        boolean z4 = obj instanceof java.lang.Boolean;
        android.content.BroadcastReceiver.PendingResult pendingResult = this.f3027c;
        int i4 = this.f3025a;
        if (z4) {
            try {
                boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
                android.util.Log.d("FlutterBluePlugin", "Trying to set pairing confirmation to " + booleanValue + " (key: " + i4 + ")");
                this.f3026b.setPairingConfirmation(booleanValue);
                pendingResult.abortBroadcast();
            } catch (java.lang.Exception e4) {
                android.util.Log.e("FlutterBluePlugin", e4.getMessage());
                e4.printStackTrace();
            }
        } else {
            android.util.Log.d("FlutterBluePlugin", "Manual passkey confirmation pairing in progress (key: " + i4 + ")");
            this.f3029e.f3020b.f3080x.startActivity(this.f3028d, null);
        }
        pendingResult.finish();
    }

    @Override // p047L2.InterfaceC0386p
    /* renamed from: c */
    public final void mo743c() {
        throw new java.lang.UnsupportedOperationException();
    }
}
