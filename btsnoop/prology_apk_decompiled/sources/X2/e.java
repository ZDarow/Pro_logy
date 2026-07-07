package X2;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.util.Log;

/* loaded from: classes.dex */
public final class e implements L2.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BluetoothDevice f2923a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BroadcastReceiver.PendingResult f2924b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Intent f2925c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f2926d;

    public e(d dVar, BluetoothDevice bluetoothDevice, BroadcastReceiver.PendingResult pendingResult, Intent intent) {
        this.f2926d = dVar;
        this.f2923a = bluetoothDevice;
        this.f2924b = pendingResult;
        this.f2925c = intent;
    }

    @Override // L2.p
    public final void a(String str, String str2, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // L2.p
    public final void b(Object obj) {
        Log.d("FlutterBluePlugin", obj.toString());
        boolean z4 = obj instanceof String;
        BroadcastReceiver.PendingResult pendingResult = this.f2924b;
        if (z4) {
            try {
                String str = (String) obj;
                byte[] bytes = str.getBytes();
                Log.d("FlutterBluePlugin", "Trying to set passkey for pairing to ".concat(str));
                this.f2923a.setPin(bytes);
                pendingResult.abortBroadcast();
            } catch (Exception e4) {
                Log.e("FlutterBluePlugin", e4.getMessage());
                e4.printStackTrace();
            }
        } else {
            Log.d("FlutterBluePlugin", "Manual pin pairing in progress");
            this.f2926d.f2922b.f2980x.startActivity(this.f2925c, null);
        }
        pendingResult.finish();
    }

    @Override // L2.p
    public final void c() {
        throw new UnsupportedOperationException();
    }
}
