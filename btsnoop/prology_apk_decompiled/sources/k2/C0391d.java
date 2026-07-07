package k2;

import B2.AbstractC0007h;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: k2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0391d extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7057a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0395h f7058b;

    public /* synthetic */ C0391d(C0395h c0395h, int i4) {
        this.f7057a = i4;
        this.f7058b = c0395h;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        BluetoothAdapter bluetoothAdapter;
        BluetoothLeScanner bluetoothLeScanner;
        BluetoothDevice bluetoothDevice;
        Object parcelableExtra;
        BluetoothDevice bluetoothDevice2;
        Object parcelableExtra2;
        switch (this.f7057a) {
            case 0:
                String action = intent.getAction();
                if (action == null || !"android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
                    return;
                }
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                StringBuilder sb = new StringBuilder("OnAdapterStateChanged: ");
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
                        str = AbstractC0007h.j(intExtra, "UNKNOWN_ADAPTER_STATE (", ")");
                        break;
                }
                sb.append(str);
                String sb2 = sb.toString();
                C0395h c0395h = this.f7058b;
                int i4 = 5;
                c0395h.C(sb2, 5);
                if (intExtra == 12 && (bluetoothAdapter = c0395h.f7075o) != null && c0395h.f7076p && (bluetoothLeScanner = bluetoothAdapter.getBluetoothLeScanner()) != null) {
                    c0395h.C("calling stopScan (Bluetooth Restarted)", 5);
                    bluetoothLeScanner.stopScan(c0395h.x());
                    c0395h.f7076p = false;
                }
                HashMap hashMap = new HashMap();
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
                hashMap.put("adapter_state", Integer.valueOf(i4));
                c0395h.z("OnAdapterStateChanged", hashMap);
                if (intExtra == 13 || intExtra == 10) {
                    c0395h.r("adapterTurnOff");
                    return;
                }
                return;
            case 1:
                String action2 = intent.getAction();
                if (action2 == null || !action2.equals("android.bluetooth.device.action.PAIRING_REQUEST")) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra = intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE", BluetoothDevice.class);
                    bluetoothDevice = (BluetoothDevice) parcelableExtra;
                } else {
                    bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                }
                String address = bluetoothDevice.getAddress();
                C0395h c0395h2 = this.f7058b;
                if (c0395h2.w.containsKey(address)) {
                    ConcurrentHashMap concurrentHashMap = c0395h2.w;
                    byte[] bArr = (byte[]) concurrentHashMap.get(address);
                    c0395h2.C("Setting PIN code for " + address + ": " + C0395h.j(bArr), 5);
                    if (!bluetoothDevice.setPin(bArr)) {
                        c0395h2.C("setPin() failed on " + address, 2);
                    }
                    concurrentHashMap.remove(address);
                    return;
                }
                return;
            default:
                String action3 = intent.getAction();
                if (action3 == null || !action3.equals("android.bluetooth.device.action.BOND_STATE_CHANGED")) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra2 = intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE", BluetoothDevice.class);
                    bluetoothDevice2 = (BluetoothDevice) parcelableExtra2;
                } else {
                    bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                }
                int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", Integer.MIN_VALUE);
                int intExtra3 = intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", -1);
                String str2 = "OnBondStateChanged: " + C0395h.i(intExtra2) + " prev: " + C0395h.i(intExtra3);
                C0395h c0395h3 = this.f7058b;
                c0395h3.C(str2, 5);
                String address2 = bluetoothDevice2.getAddress();
                ConcurrentHashMap concurrentHashMap2 = c0395h3.f7081v;
                if (intExtra2 == 11) {
                    concurrentHashMap2.put(address2, bluetoothDevice2);
                } else {
                    concurrentHashMap2.remove(address2);
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("remote_id", address2);
                hashMap2.put("bond_state", Integer.valueOf(intExtra2 != 11 ? intExtra2 != 12 ? 0 : 2 : 1));
                hashMap2.put("prev_state", Integer.valueOf(intExtra3 != 11 ? intExtra3 != 12 ? 0 : 2 : 1));
                c0395h3.z("OnBondStateChanged", hashMap2);
                return;
        }
    }
}
