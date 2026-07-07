package p093X2;

/* renamed from: X2.q */
/* loaded from: classes.dex */
public final class C0856q extends android.content.BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ android.bluetooth.BluetoothDevice f3064a;

    /* renamed from: b */
    public final /* synthetic */ p043K2.C0335k f3065b;

    /* renamed from: c */
    public final /* synthetic */ p093X2.C0846g f3066c;

    public C0856q(p093X2.C0846g c0846g, android.bluetooth.BluetoothDevice bluetoothDevice, p043K2.C0335k c0335k) {
        this.f3066c = c0846g;
        this.f3064a = bluetoothDevice;
        this.f3065b = c0335k;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        action.getClass();
        if (action.equals("android.bluetooth.device.action.BOND_STATE_CHANGED") && ((android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")).equals(this.f3064a)) {
            int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", Integer.MIN_VALUE);
            p043K2.C0335k c0335k = this.f3065b;
            switch (intExtra) {
                case 10:
                    c0335k.mo742b(java.lang.Boolean.FALSE);
                    break;
                case 11:
                    return;
                case 12:
                    c0335k.mo742b(java.lang.Boolean.TRUE);
                    break;
                default:
                    c0335k.mo741a("bond_error", "invalid bond state while bonding", null);
                    break;
            }
            p093X2.C0846g c0846g = this.f3066c;
            c0846g.f3031m.f3082z.unregisterReceiver(this);
            c0846g.f3031m.f3075s = null;
        }
    }
}
