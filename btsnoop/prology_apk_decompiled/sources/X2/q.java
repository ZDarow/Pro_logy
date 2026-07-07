package X2;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class q extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BluetoothDevice f2966a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K2.k f2967b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f2968c;

    public q(g gVar, BluetoothDevice bluetoothDevice, K2.k kVar) {
        this.f2968c = gVar;
        this.f2966a = bluetoothDevice;
        this.f2967b = kVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.bluetooth.device.action.BOND_STATE_CHANGED") && ((BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")).equals(this.f2966a)) {
            int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", Integer.MIN_VALUE);
            K2.k kVar = this.f2967b;
            switch (intExtra) {
                case 10:
                    kVar.b(Boolean.FALSE);
                    break;
                case 11:
                    return;
                case 12:
                    kVar.b(Boolean.TRUE);
                    break;
                default:
                    kVar.a("bond_error", "invalid bond state while bonding", null);
                    break;
            }
            g gVar = this.f2968c;
            gVar.f2933m.f2982z.unregisterReceiver(this);
            gVar.f2933m.s = null;
        }
    }
}
