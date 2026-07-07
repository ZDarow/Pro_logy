package X2;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.util.SparseArray;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2921a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f2922b;

    public /* synthetic */ d(r rVar, int i4) {
        this.f2921a = i4;
        this.f2922b = rVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        r rVar = this.f2922b;
        switch (this.f2921a) {
            case 0:
                if (rVar.f2974p == null) {
                    return;
                }
                String action = intent.getAction();
                action.getClass();
                if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                    SparseArray sparseArray = rVar.f2979v;
                    int size = sparseArray.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ((j) sparseArray.valueAt(i4)).b();
                    }
                    sparseArray.clear();
                    rVar.f2974p.c(Integer.valueOf(intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE)));
                    return;
                }
                return;
            case 1:
                String action2 = intent.getAction();
                action2.getClass();
                if (action2.equals("android.bluetooth.device.action.PAIRING_REQUEST")) {
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    int intExtra = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_VARIANT", Integer.MIN_VALUE);
                    Log.d("FlutterBluePlugin", "Pairing request (variant " + intExtra + ") incoming from " + bluetoothDevice.getAddress());
                    if (intExtra == 0) {
                        BroadcastReceiver.PendingResult goAsync = goAsync();
                        HashMap hashMap = new HashMap();
                        hashMap.put("address", bluetoothDevice.getAddress());
                        hashMap.put("variant", Integer.valueOf(intExtra));
                        rVar.f2970l.j("handlePairingRequest", hashMap, new e(this, bluetoothDevice, goAsync, intent));
                        return;
                    }
                    if (intExtra == 2 || intExtra == 3) {
                        int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_KEY", Integer.MIN_VALUE);
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("address", bluetoothDevice.getAddress());
                        hashMap2.put("variant", Integer.valueOf(intExtra));
                        hashMap2.put("pairingKey", Integer.valueOf(intExtra2));
                        rVar.f2970l.j("handlePairingRequest", hashMap2, new f(this, intExtra2, bluetoothDevice, goAsync(), intent));
                        return;
                    }
                    if (intExtra != 4 && intExtra != 5) {
                        Log.w("FlutterBluePlugin", "Unknown pairing variant: " + intExtra);
                        return;
                    }
                    int intExtra3 = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_KEY", Integer.MIN_VALUE);
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("address", bluetoothDevice.getAddress());
                    hashMap3.put("variant", Integer.valueOf(intExtra));
                    hashMap3.put("pairingKey", Integer.valueOf(intExtra3));
                    rVar.f2970l.j("handlePairingRequest", hashMap3, null);
                    return;
                }
                return;
            default:
                String action3 = intent.getAction();
                action3.getClass();
                if (action3.equals("android.bluetooth.adapter.action.DISCOVERY_FINISHED")) {
                    Log.d("FlutterBluePlugin", "Discovery finished");
                    try {
                        context.unregisterReceiver(rVar.f2978u);
                    } catch (IllegalArgumentException unused) {
                    }
                    rVar.f2972n.cancelDiscovery();
                    L2.h hVar = rVar.f2977t;
                    if (hVar != null) {
                        hVar.a();
                        rVar.f2977t = null;
                        return;
                    }
                    return;
                }
                if (action3.equals("android.bluetooth.device.action.FOUND")) {
                    BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    short shortExtra = intent.getShortExtra("android.bluetooth.device.extra.RSSI", Short.MIN_VALUE);
                    HashMap hashMap4 = new HashMap();
                    hashMap4.put("address", bluetoothDevice2.getAddress());
                    hashMap4.put("name", bluetoothDevice2.getName());
                    hashMap4.put("type", Integer.valueOf(bluetoothDevice2.getType()));
                    hashMap4.put("isConnected", Boolean.valueOf(r.i(bluetoothDevice2)));
                    hashMap4.put("bondState", Integer.valueOf(bluetoothDevice2.getBondState()));
                    hashMap4.put("rssi", Integer.valueOf(shortExtra));
                    Log.d("FlutterBluePlugin", "Discovered " + bluetoothDevice2.getAddress());
                    L2.h hVar2 = rVar.f2977t;
                    if (hVar2 != null) {
                        hVar2.c(hashMap4);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
