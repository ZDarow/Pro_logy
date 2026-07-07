package X2;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.util.Log;

/* loaded from: classes.dex */
public final class f implements L2.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2927a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BluetoothDevice f2928b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BroadcastReceiver.PendingResult f2929c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Intent f2930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f2931e;

    public f(d dVar, int i4, BluetoothDevice bluetoothDevice, BroadcastReceiver.PendingResult pendingResult, Intent intent) {
        this.f2931e = dVar;
        this.f2927a = i4;
        this.f2928b = bluetoothDevice;
        this.f2929c = pendingResult;
        this.f2930d = intent;
    }

    @Override // L2.p
    public final void a(String str, String str2, Object obj) {
        Log.e("FlutterBluePlugin", str + " " + str2);
        throw new UnsupportedOperationException();
    }

    @Override // L2.p
    public final void b(Object obj) {
        boolean z4 = obj instanceof Boolean;
        BroadcastReceiver.PendingResult pendingResult = this.f2929c;
        int i4 = this.f2927a;
        if (z4) {
            try {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Log.d("FlutterBluePlugin", "Trying to set pairing confirmation to " + booleanValue + " (key: " + i4 + ")");
                this.f2928b.setPairingConfirmation(booleanValue);
                pendingResult.abortBroadcast();
            } catch (Exception e4) {
                Log.e("FlutterBluePlugin", e4.getMessage());
                e4.printStackTrace();
            }
        } else {
            Log.d("FlutterBluePlugin", "Manual passkey confirmation pairing in progress (key: " + i4 + ")");
            this.f2931e.f2922b.f2980x.startActivity(this.f2930d, null);
        }
        pendingResult.finish();
    }

    @Override // L2.p
    public final void c() {
        throw new UnsupportedOperationException();
    }
}
