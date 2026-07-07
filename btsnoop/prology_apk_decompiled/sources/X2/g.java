package X2;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.provider.Settings;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class g implements L2.i, L2.o {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2932l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r f2933m;

    public /* synthetic */ g(r rVar, int i4) {
        this.f2932l = i4;
        this.f2933m = rVar;
    }

    @Override // L2.i
    public void E() {
        switch (this.f2932l) {
            case 0:
                r rVar = this.f2933m;
                rVar.f2974p = null;
                try {
                    rVar.f2982z.unregisterReceiver(rVar.f2973o);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                r rVar2 = this.f2933m;
                Log.d("FlutterBluePlugin", "Canceling discovery (stream closed)");
                try {
                    rVar2.f2982z.unregisterReceiver(rVar2.f2978u);
                } catch (IllegalArgumentException unused2) {
                }
                rVar2.f2972n.cancelDiscovery();
                L2.h hVar = rVar2.f2977t;
                if (hVar != null) {
                    hVar.a();
                    rVar2.f2977t = null;
                    return;
                }
                return;
        }
    }

    @Override // L2.i
    public void H(Object obj, L2.h hVar) {
        switch (this.f2932l) {
            case 0:
                r rVar = this.f2933m;
                rVar.f2974p = hVar;
                rVar.f2982z.registerReceiver(rVar.f2973o, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
                return;
            default:
                this.f2933m.f2977t = hVar;
                return;
        }
    }

    @Override // L2.o
    public void I(L2.n nVar, final K2.k kVar) {
        String str;
        byte[] hardwareAddress;
        String str2;
        Object obj;
        char c4;
        r rVar = this.f2933m;
        if (rVar.f2972n == null) {
            if ("isAvailable".equals(nVar.f1094a)) {
                kVar.b(Boolean.FALSE);
                return;
            } else {
                kVar.a("bluetooth_unavailable", "bluetooth is not available", null);
                return;
            }
        }
        String str3 = nVar.f1094a;
        str3.getClass();
        d dVar = rVar.f2975q;
        SparseArray sparseArray = rVar.f2979v;
        char c5 = 65535;
        switch (str3.hashCode()) {
            case -1926215729:
                if (str3.equals("isDiscovering")) {
                    c5 = 0;
                    break;
                }
                break;
            case -1807096071:
                if (str3.equals("bondDevice")) {
                    c5 = 1;
                    break;
                }
                break;
            case -1683323867:
                if (str3.equals("getBondedDevices")) {
                    c4 = 2;
                    c5 = c4;
                    break;
                }
                break;
            case -1638000305:
                if (str3.equals("pairingRequestHandlingEnable")) {
                    c4 = 3;
                    c5 = c4;
                    break;
                }
                break;
            case -689606750:
                if (str3.equals("getDeviceBondState")) {
                    c4 = 4;
                    c5 = c4;
                    break;
                }
                break;
            case -475549842:
                if (str3.equals("startDiscovery")) {
                    c4 = 5;
                    c5 = c4;
                    break;
                }
                break;
            case -372024179:
                if (str3.equals("openSettings")) {
                    c5 = 6;
                    break;
                }
                break;
            case -252467044:
                if (str3.equals("pairingRequestHandlingDisable")) {
                    c4 = 7;
                    c5 = c4;
                    break;
                }
                break;
            case -184837799:
                if (str3.equals("requestDisable")) {
                    c4 = '\b';
                    c5 = c4;
                    break;
                }
                break;
            case -110831682:
                if (str3.equals("getAddress")) {
                    c4 = '\t';
                    c5 = c4;
                    break;
                }
                break;
            case -75308287:
                if (str3.equals("getName")) {
                    c5 = '\n';
                    break;
                }
                break;
            case 3241129:
                if (str3.equals("isOn")) {
                    c5 = 11;
                    break;
                }
                break;
            case 113399775:
                if (str3.equals("write")) {
                    c5 = '\f';
                    break;
                }
                break;
            case 139599958:
                if (str3.equals("cancelDiscovery")) {
                    c4 = '\r';
                    c5 = c4;
                    break;
                }
                break;
            case 416604941:
                if (str3.equals("isDiscoverable")) {
                    c4 = 14;
                    c5 = c4;
                    break;
                }
                break;
            case 444517567:
                if (str3.equals("isAvailable")) {
                    c4 = 15;
                    c5 = c4;
                    break;
                }
                break;
            case 598071538:
                if (str3.equals("requestDiscoverable")) {
                    c4 = 16;
                    c5 = c4;
                    break;
                }
                break;
            case 951351530:
                if (str3.equals("connect")) {
                    c5 = 17;
                    break;
                }
                break;
            case 996580594:
                if (str3.equals("requestEnable")) {
                    c5 = 18;
                    break;
                }
                break;
            case 1040944486:
                if (str3.equals("ensurePermissions")) {
                    c4 = 19;
                    c5 = c4;
                    break;
                }
                break;
            case 1815785949:
                if (str3.equals("removeDeviceBond")) {
                    c4 = 20;
                    c5 = c4;
                    break;
                }
                break;
            case 1965583067:
                if (str3.equals("getState")) {
                    c4 = 21;
                    c5 = c4;
                    break;
                }
                break;
            case 1984801293:
                if (str3.equals("setName")) {
                    c4 = 22;
                    c5 = c4;
                    break;
                }
                break;
            case 2105594551:
                if (str3.equals("isEnabled")) {
                    c5 = 23;
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
                kVar.b(Boolean.valueOf(rVar.f2972n.isDiscovering()));
                return;
            case 1:
                if (!nVar.c("address")) {
                    kVar.a("invalid_argument", "argument 'address' not found", null);
                    return;
                }
                try {
                    String str4 = (String) nVar.a("address");
                    if (!BluetoothAdapter.checkBluetoothAddress(str4)) {
                        throw new ClassCastException();
                    }
                    if (rVar.s != null) {
                        kVar.a("bond_error", "another bonding process is ongoing from local device", null);
                        return;
                    }
                    BluetoothDevice remoteDevice = rVar.f2972n.getRemoteDevice(str4);
                    int bondState = remoteDevice.getBondState();
                    if (bondState == 11) {
                        kVar.a("bond_error", "device already bonding", null);
                        return;
                    }
                    if (bondState == 12) {
                        kVar.a("bond_error", "device already bonded", null);
                        return;
                    }
                    rVar.s = new q(this, remoteDevice, kVar);
                    rVar.f2982z.registerReceiver(rVar.s, new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED"));
                    if (remoteDevice.createBond()) {
                        return;
                    }
                    kVar.a("bond_error", "error starting bonding process", null);
                    return;
                } catch (ClassCastException unused) {
                    kVar.a("invalid_argument", "'address' argument is required to be string containing remote MAC address", null);
                    return;
                }
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                final int i4 = 0;
                r.a(rVar, new k(this) { // from class: X2.m

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f2952b;

                    {
                        this.f2952b = this;
                    }

                    @Override // X2.k
                    public final void b(boolean z4) {
                        switch (i4) {
                            case 0:
                                g gVar = this.f2952b;
                                gVar.getClass();
                                K2.k kVar2 = kVar;
                                if (!z4) {
                                    kVar2.a("no_permissions", "discovering other devices requires location access permission", null);
                                    return;
                                }
                                ArrayList arrayList = new ArrayList();
                                for (BluetoothDevice bluetoothDevice : gVar.f2933m.f2972n.getBondedDevices()) {
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("address", bluetoothDevice.getAddress());
                                    hashMap.put("name", bluetoothDevice.getName());
                                    hashMap.put("type", Integer.valueOf(bluetoothDevice.getType()));
                                    hashMap.put("isConnected", Boolean.valueOf(r.i(bluetoothDevice)));
                                    hashMap.put("bondState", 12);
                                    arrayList.add(hashMap);
                                }
                                kVar2.b(arrayList);
                                return;
                            default:
                                g gVar2 = this.f2952b;
                                gVar2.getClass();
                                K2.k kVar3 = kVar;
                                if (!z4) {
                                    kVar3.a("no_permissions", "discovering other devices requires location access permission", null);
                                    return;
                                }
                                Log.d("FlutterBluePlugin", "Starting discovery");
                                IntentFilter intentFilter = new IntentFilter();
                                intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
                                intentFilter.addAction("android.bluetooth.device.action.FOUND");
                                r rVar2 = gVar2.f2933m;
                                rVar2.f2982z.registerReceiver(rVar2.f2978u, intentFilter);
                                rVar2.f2972n.startDiscovery();
                                kVar3.b(null);
                                return;
                        }
                    }
                });
                return;
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                if (rVar.f2976r) {
                    kVar.a("logic_error", "pairing request handling is already enabled", null);
                    return;
                }
                Log.d("FlutterBluePlugin", "Starting listening for pairing requests to handle");
                rVar.f2976r = true;
                rVar.f2982z.registerReceiver(dVar, new IntentFilter("android.bluetooth.device.action.PAIRING_REQUEST"));
                return;
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                if (!nVar.c("address")) {
                    kVar.a("invalid_argument", "argument 'address' not found", null);
                    return;
                }
                try {
                    String str5 = (String) nVar.a("address");
                    if (!BluetoothAdapter.checkBluetoothAddress(str5)) {
                        throw new ClassCastException();
                    }
                    kVar.b(Integer.valueOf(rVar.f2972n.getRemoteDevice(str5).getBondState()));
                    return;
                } catch (ClassCastException unused2) {
                    kVar.a("invalid_argument", "'address' argument is required to be string containing remote MAC address", null);
                    return;
                }
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                final int i5 = 1;
                r.a(rVar, new k(this) { // from class: X2.m

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f2952b;

                    {
                        this.f2952b = this;
                    }

                    @Override // X2.k
                    public final void b(boolean z4) {
                        switch (i5) {
                            case 0:
                                g gVar = this.f2952b;
                                gVar.getClass();
                                K2.k kVar2 = kVar;
                                if (!z4) {
                                    kVar2.a("no_permissions", "discovering other devices requires location access permission", null);
                                    return;
                                }
                                ArrayList arrayList = new ArrayList();
                                for (BluetoothDevice bluetoothDevice : gVar.f2933m.f2972n.getBondedDevices()) {
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("address", bluetoothDevice.getAddress());
                                    hashMap.put("name", bluetoothDevice.getName());
                                    hashMap.put("type", Integer.valueOf(bluetoothDevice.getType()));
                                    hashMap.put("isConnected", Boolean.valueOf(r.i(bluetoothDevice)));
                                    hashMap.put("bondState", 12);
                                    arrayList.add(hashMap);
                                }
                                kVar2.b(arrayList);
                                return;
                            default:
                                g gVar2 = this.f2952b;
                                gVar2.getClass();
                                K2.k kVar3 = kVar;
                                if (!z4) {
                                    kVar3.a("no_permissions", "discovering other devices requires location access permission", null);
                                    return;
                                }
                                Log.d("FlutterBluePlugin", "Starting discovery");
                                IntentFilter intentFilter = new IntentFilter();
                                intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
                                intentFilter.addAction("android.bluetooth.device.action.FOUND");
                                r rVar2 = gVar2.f2933m;
                                rVar2.f2982z.registerReceiver(rVar2.f2978u, intentFilter);
                                rVar2.f2972n.startDiscovery();
                                kVar3.b(null);
                                return;
                        }
                    }
                });
                return;
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                rVar.f2980x.startActivity(new Intent("android.settings.BLUETOOTH_SETTINGS"), null);
                kVar.b(null);
                break;
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                rVar.f2976r = false;
                try {
                    rVar.f2982z.unregisterReceiver(dVar);
                    Log.d("FlutterBluePlugin", "Stopped listening for pairing requests to handle");
                    break;
                } catch (IllegalArgumentException unused3) {
                    break;
                }
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                if (rVar.f2972n.isEnabled()) {
                    rVar.f2972n.disable();
                    kVar.b(Boolean.TRUE);
                    break;
                } else {
                    kVar.b(Boolean.FALSE);
                    break;
                }
            case '\t':
                String address = rVar.f2972n.getAddress();
                if (address.equals("02:00:00:00:00:00")) {
                    Log.w("FlutterBluePlugin", "Local Bluetooth MAC address is hidden by system, trying other options...");
                    Log.d("FlutterBluePlugin", "Trying to obtain address using Settings Secure bank");
                    try {
                        str2 = Settings.Secure.getString(rVar.f2982z.getContentResolver(), "bluetooth_address");
                        if (str2 == null) {
                            throw new NullPointerException("null returned, might be no permissions problem");
                        }
                    } catch (Exception unused4) {
                        Log.d("FlutterBluePlugin", "Obtaining address using Settings Secure bank failed");
                        Log.d("FlutterBluePlugin", "Trying to obtain address using reflection against internal Android code");
                        try {
                            Field declaredField = rVar.f2972n.getClass().getDeclaredField("mService");
                            declaredField.setAccessible(true);
                            Object obj2 = declaredField.get(rVar.f2972n);
                            if (obj2 == null) {
                                if (!rVar.f2972n.isEnabled()) {
                                    Log.d("FlutterBluePlugin", "Probably failed just because adapter is disabled!");
                                }
                                throw new NullPointerException();
                            }
                            str2 = (String) obj2.getClass().getMethod("getAddress", null).invoke(obj2, null);
                            if (str2 == null) {
                                throw new NullPointerException();
                            }
                            try {
                                Log.d("FlutterBluePlugin", "Probably succed: " + str2 + " ✨ :F");
                            } catch (Exception unused5) {
                                address = str2;
                                Log.d("FlutterBluePlugin", "Obtaining address using reflection against internal Android code failed");
                                Log.d("FlutterBluePlugin", "Trying to look up address by network interfaces - might be invalid on some devices");
                                try {
                                    Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                                    str = null;
                                    while (networkInterfaces.hasMoreElements()) {
                                        NetworkInterface nextElement = networkInterfaces.nextElement();
                                        if (nextElement.getName().equalsIgnoreCase("wlan0") && (hardwareAddress = nextElement.getHardwareAddress()) != null) {
                                            StringBuilder sb = new StringBuilder(18);
                                            for (byte b4 : hardwareAddress) {
                                                sb.append(String.format("%02X:", Byte.valueOf(b4)));
                                            }
                                            sb.setLength(17);
                                            str = sb.toString();
                                        }
                                    }
                                } catch (Exception unused6) {
                                    Log.w("FlutterBluePlugin", "Looking for address by network interfaces failed");
                                }
                                if (str == null) {
                                    throw new NullPointerException();
                                }
                                address = str;
                                kVar.b(address);
                            }
                        } catch (Exception unused7) {
                        }
                    }
                    address = str2;
                }
                kVar.b(address);
                break;
            case '\n':
                kVar.b(rVar.f2972n.getName());
                break;
            case 11:
            case 23:
                kVar.b(Boolean.valueOf(rVar.f2972n.isEnabled()));
                break;
            case '\f':
                if (nVar.c("id")) {
                    try {
                        j jVar = (j) sparseArray.get(((Integer) nVar.a("id")).intValue());
                        if (jVar == null) {
                            kVar.a("invalid_argument", "there is no connection with provided id", null);
                            break;
                        } else if (nVar.c("string")) {
                            AsyncTask.execute(new o(this, jVar, (String) nVar.a("string"), kVar, 0));
                            break;
                        } else if (nVar.c("bytes")) {
                            AsyncTask.execute(new o(this, jVar, (byte[]) nVar.a("bytes"), kVar, 1));
                            break;
                        } else {
                            kVar.a("invalid_argument", "there must be 'string' or 'bytes' argument", null);
                            break;
                        }
                    } catch (ClassCastException unused8) {
                        kVar.a("invalid_argument", "'id' argument is required to be integer id of connection", null);
                        break;
                    }
                } else {
                    kVar.a("invalid_argument", "argument 'id' not found", null);
                    break;
                }
            case '\r':
                Log.d("FlutterBluePlugin", "Canceling discovery");
                try {
                    rVar.f2982z.unregisterReceiver(rVar.f2978u);
                } catch (IllegalArgumentException unused9) {
                }
                rVar.f2972n.cancelDiscovery();
                L2.h hVar = rVar.f2977t;
                if (hVar != null) {
                    hVar.a();
                    obj = null;
                    rVar.f2977t = null;
                } else {
                    obj = null;
                }
                kVar.b(obj);
                break;
            case 14:
                kVar.b(Boolean.valueOf(rVar.f2972n.getScanMode() == 23));
                break;
            case 15:
                kVar.b(Boolean.TRUE);
                break;
            case 16:
                Intent intent = new Intent("android.bluetooth.adapter.action.REQUEST_DISCOVERABLE");
                if (nVar.c("duration")) {
                    try {
                        intent.putExtra("android.bluetooth.adapter.extra.DISCOVERABLE_DURATION", ((Integer) nVar.a("duration")).intValue());
                    } catch (ClassCastException unused10) {
                        kVar.a("invalid_argument", "'duration' argument is required to be integer", null);
                        break;
                    }
                }
                rVar.f2971m = kVar;
                rVar.f2980x.startActivityForResult(intent, 2137, null);
                break;
            case 17:
                if (nVar.c("address")) {
                    try {
                        final String str6 = (String) nVar.a("address");
                        if (!BluetoothAdapter.checkBluetoothAddress(str6)) {
                            throw new ClassCastException();
                        }
                        final int i6 = rVar.w + 1;
                        rVar.w = i6;
                        final j jVar2 = new j(rVar, i6, rVar.f2972n);
                        sparseArray.put(i6, jVar2);
                        Log.d("FlutterBluePlugin", "Connecting to " + str6 + " (id: " + i6 + ")");
                        AsyncTask.execute(new Runnable() { // from class: X2.n
                            @Override // java.lang.Runnable
                            public final void run() {
                                j jVar3 = jVar2;
                                String str7 = str6;
                                K2.k kVar2 = kVar;
                                int i7 = i6;
                                r rVar2 = g.this.f2933m;
                                try {
                                    jVar3.a(str7);
                                    rVar2.f2980x.runOnUiThread(new i(i7, 1, kVar2));
                                } catch (Exception e4) {
                                    rVar2.f2980x.runOnUiThread(new l(kVar2, e4, 0));
                                    rVar2.f2979v.remove(i7);
                                }
                            }
                        });
                        break;
                    } catch (ClassCastException unused11) {
                        kVar.a("invalid_argument", "'address' argument is required to be string containing remote MAC address", null);
                        break;
                    }
                } else {
                    kVar.a("invalid_argument", "argument 'address' not found", null);
                    break;
                }
            case 18:
                if (rVar.f2972n.isEnabled()) {
                    kVar.b(Boolean.TRUE);
                    break;
                } else {
                    rVar.f2971m = kVar;
                    rVar.f2980x.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1337, null);
                    break;
                }
            case 19:
                r.a(rVar, new D1.f(kVar, 6));
                break;
            case 20:
                if (nVar.c("address")) {
                    try {
                        String str7 = (String) nVar.a("address");
                        if (!BluetoothAdapter.checkBluetoothAddress(str7)) {
                            throw new ClassCastException();
                        }
                        BluetoothDevice remoteDevice2 = rVar.f2972n.getRemoteDevice(str7);
                        int bondState2 = remoteDevice2.getBondState();
                        if (bondState2 != 10) {
                            if (bondState2 != 11) {
                                try {
                                    Object obj3 = (Boolean) remoteDevice2.getClass().getMethod("removeBond", null).invoke(remoteDevice2, null);
                                    obj3.getClass();
                                    kVar.b(obj3);
                                    break;
                                } catch (Exception e4) {
                                    kVar.a("bond_error", "error while unbonding", r.c(e4));
                                    break;
                                }
                            } else {
                                kVar.a("bond_error", "device already bonding", null);
                                break;
                            }
                        } else {
                            kVar.a("bond_error", "device already unbonded", null);
                            break;
                        }
                    } catch (ClassCastException unused12) {
                        kVar.a("invalid_argument", "'address' argument is required to be string containing remote MAC address", null);
                        break;
                    }
                } else {
                    kVar.a("invalid_argument", "argument 'address' not found", null);
                    break;
                }
            case 21:
                kVar.b(Integer.valueOf(rVar.f2972n.getState()));
                break;
            case 22:
                if (nVar.c("name")) {
                    try {
                        kVar.b(Boolean.valueOf(rVar.f2972n.setName((String) nVar.a("name"))));
                        break;
                    } catch (ClassCastException unused13) {
                        kVar.a("invalid_argument", "'name' argument is required to be string", null);
                        break;
                    }
                } else {
                    kVar.a("invalid_argument", "argument 'name' not found", null);
                    break;
                }
            default:
                kVar.c();
                break;
        }
    }
}
