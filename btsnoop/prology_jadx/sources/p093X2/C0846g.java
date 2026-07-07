package p093X2;

/* renamed from: X2.g */
/* loaded from: classes.dex */
public final class C0846g implements p047L2.InterfaceC0379i, p047L2.InterfaceC0385o {

    /* renamed from: l */
    public final /* synthetic */ int f3030l;

    /* renamed from: m */
    public final /* synthetic */ p093X2.C0857r f3031m;

    public /* synthetic */ C0846g(p093X2.C0857r c0857r, int i4) {
        this.f3030l = i4;
        this.f3031m = c0857r;
    }

    @Override // p047L2.InterfaceC0379i
    /* renamed from: E */
    public void mo47E() {
        switch (this.f3030l) {
            case 0:
                p093X2.C0857r c0857r = this.f3031m;
                c0857r.f3072p = null;
                try {
                    c0857r.f3082z.unregisterReceiver(c0857r.f3071o);
                    return;
                } catch (java.lang.IllegalArgumentException unused) {
                    return;
                }
            default:
                p093X2.C0857r c0857r2 = this.f3031m;
                android.util.Log.d("FlutterBluePlugin", "Canceling discovery (stream closed)");
                try {
                    c0857r2.f3082z.unregisterReceiver(c0857r2.f3077u);
                } catch (java.lang.IllegalArgumentException unused2) {
                }
                c0857r2.f3070n.cancelDiscovery();
                p047L2.C0378h c0378h = c0857r2.f3076t;
                if (c0378h != null) {
                    c0378h.m828a();
                    c0857r2.f3076t = null;
                    return;
                }
                return;
        }
    }

    @Override // p047L2.InterfaceC0379i
    /* renamed from: H */
    public void mo48H(java.lang.Object obj, p047L2.C0378h c0378h) {
        switch (this.f3030l) {
            case 0:
                p093X2.C0857r c0857r = this.f3031m;
                c0857r.f3072p = c0378h;
                c0857r.f3082z.registerReceiver(c0857r.f3071o, new android.content.IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
                return;
            default:
                this.f3031m.f3076t = c0378h;
                return;
        }
    }

    @Override // p047L2.InterfaceC0385o
    /* renamed from: I */
    public void mo42I(p047L2.C0384n c0384n, final p043K2.C0335k c0335k) {
        java.lang.String str;
        byte[] hardwareAddress;
        java.lang.String str2;
        java.lang.Object obj;
        char c4;
        p093X2.C0857r c0857r = this.f3031m;
        if (c0857r.f3070n == null) {
            if ("isAvailable".equals(c0384n.f1133a)) {
                c0335k.mo742b(java.lang.Boolean.FALSE);
                return;
            } else {
                c0335k.mo741a("bluetooth_unavailable", "bluetooth is not available", null);
                return;
            }
        }
        java.lang.String str3 = c0384n.f1133a;
        str3.getClass();
        p093X2.C0843d c0843d = c0857r.f3073q;
        android.util.SparseArray sparseArray = c0857r.f3078v;
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
                c0335k.mo742b(java.lang.Boolean.valueOf(c0857r.f3070n.isDiscovering()));
                return;
            case 1:
                if (!c0384n.m841c("address")) {
                    c0335k.mo741a("invalid_argument", "argument 'address' not found", null);
                    return;
                }
                try {
                    java.lang.String str4 = (java.lang.String) c0384n.m839a("address");
                    if (!android.bluetooth.BluetoothAdapter.checkBluetoothAddress(str4)) {
                        throw new java.lang.ClassCastException();
                    }
                    if (c0857r.f3075s != null) {
                        c0335k.mo741a("bond_error", "another bonding process is ongoing from local device", null);
                        return;
                    }
                    android.bluetooth.BluetoothDevice remoteDevice = c0857r.f3070n.getRemoteDevice(str4);
                    int bondState = remoteDevice.getBondState();
                    if (bondState == 11) {
                        c0335k.mo741a("bond_error", "device already bonding", null);
                        return;
                    }
                    if (bondState == 12) {
                        c0335k.mo741a("bond_error", "device already bonded", null);
                        return;
                    }
                    c0857r.f3075s = new p093X2.C0856q(this, remoteDevice, c0335k);
                    c0857r.f3082z.registerReceiver(c0857r.f3075s, new android.content.IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED"));
                    if (remoteDevice.createBond()) {
                        return;
                    }
                    c0335k.mo741a("bond_error", "error starting bonding process", null);
                    return;
                } catch (java.lang.ClassCastException unused) {
                    c0335k.mo741a("invalid_argument", "'address' argument is required to be string containing remote MAC address", null);
                    return;
                }
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                final int i4 = 0;
                p093X2.C0857r.m1683a(c0857r, new p093X2.InterfaceC0850k(this) { // from class: X2.m

                    /* renamed from: b */
                    public final /* synthetic */ p093X2.C0846g f3050b;

                    {
                        this.f3050b = this;
                    }

                    @Override // p093X2.InterfaceC0850k
                    /* renamed from: b */
                    public final void mo535b(boolean z4) {
                        switch (i4) {
                            case 0:
                                p093X2.C0846g c0846g = this.f3050b;
                                c0846g.getClass();
                                p043K2.C0335k c0335k2 = c0335k;
                                if (!z4) {
                                    c0335k2.mo741a("no_permissions", "discovering other devices requires location access permission", null);
                                    return;
                                }
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                for (android.bluetooth.BluetoothDevice bluetoothDevice : c0846g.f3031m.f3070n.getBondedDevices()) {
                                    java.util.HashMap hashMap = new java.util.HashMap();
                                    hashMap.put("address", bluetoothDevice.getAddress());
                                    hashMap.put("name", bluetoothDevice.getName());
                                    hashMap.put("type", java.lang.Integer.valueOf(bluetoothDevice.getType()));
                                    hashMap.put("isConnected", java.lang.Boolean.valueOf(p093X2.C0857r.m1685i(bluetoothDevice)));
                                    hashMap.put("bondState", 12);
                                    arrayList.add(hashMap);
                                }
                                c0335k2.mo742b(arrayList);
                                return;
                            default:
                                p093X2.C0846g c0846g2 = this.f3050b;
                                c0846g2.getClass();
                                p043K2.C0335k c0335k3 = c0335k;
                                if (!z4) {
                                    c0335k3.mo741a("no_permissions", "discovering other devices requires location access permission", null);
                                    return;
                                }
                                android.util.Log.d("FlutterBluePlugin", "Starting discovery");
                                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                                intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
                                intentFilter.addAction("android.bluetooth.device.action.FOUND");
                                p093X2.C0857r c0857r2 = c0846g2.f3031m;
                                c0857r2.f3082z.registerReceiver(c0857r2.f3077u, intentFilter);
                                c0857r2.f3070n.startDiscovery();
                                c0335k3.mo742b(null);
                                return;
                        }
                    }
                });
                return;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                if (c0857r.f3074r) {
                    c0335k.mo741a("logic_error", "pairing request handling is already enabled", null);
                    return;
                }
                android.util.Log.d("FlutterBluePlugin", "Starting listening for pairing requests to handle");
                c0857r.f3074r = true;
                c0857r.f3082z.registerReceiver(c0843d, new android.content.IntentFilter("android.bluetooth.device.action.PAIRING_REQUEST"));
                return;
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                if (!c0384n.m841c("address")) {
                    c0335k.mo741a("invalid_argument", "argument 'address' not found", null);
                    return;
                }
                try {
                    java.lang.String str5 = (java.lang.String) c0384n.m839a("address");
                    if (!android.bluetooth.BluetoothAdapter.checkBluetoothAddress(str5)) {
                        throw new java.lang.ClassCastException();
                    }
                    c0335k.mo742b(java.lang.Integer.valueOf(c0857r.f3070n.getRemoteDevice(str5).getBondState()));
                    return;
                } catch (java.lang.ClassCastException unused2) {
                    c0335k.mo741a("invalid_argument", "'address' argument is required to be string containing remote MAC address", null);
                    return;
                }
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                final int i5 = 1;
                p093X2.C0857r.m1683a(c0857r, new p093X2.InterfaceC0850k(this) { // from class: X2.m

                    /* renamed from: b */
                    public final /* synthetic */ p093X2.C0846g f3050b;

                    {
                        this.f3050b = this;
                    }

                    @Override // p093X2.InterfaceC0850k
                    /* renamed from: b */
                    public final void mo535b(boolean z4) {
                        switch (i5) {
                            case 0:
                                p093X2.C0846g c0846g = this.f3050b;
                                c0846g.getClass();
                                p043K2.C0335k c0335k2 = c0335k;
                                if (!z4) {
                                    c0335k2.mo741a("no_permissions", "discovering other devices requires location access permission", null);
                                    return;
                                }
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                for (android.bluetooth.BluetoothDevice bluetoothDevice : c0846g.f3031m.f3070n.getBondedDevices()) {
                                    java.util.HashMap hashMap = new java.util.HashMap();
                                    hashMap.put("address", bluetoothDevice.getAddress());
                                    hashMap.put("name", bluetoothDevice.getName());
                                    hashMap.put("type", java.lang.Integer.valueOf(bluetoothDevice.getType()));
                                    hashMap.put("isConnected", java.lang.Boolean.valueOf(p093X2.C0857r.m1685i(bluetoothDevice)));
                                    hashMap.put("bondState", 12);
                                    arrayList.add(hashMap);
                                }
                                c0335k2.mo742b(arrayList);
                                return;
                            default:
                                p093X2.C0846g c0846g2 = this.f3050b;
                                c0846g2.getClass();
                                p043K2.C0335k c0335k3 = c0335k;
                                if (!z4) {
                                    c0335k3.mo741a("no_permissions", "discovering other devices requires location access permission", null);
                                    return;
                                }
                                android.util.Log.d("FlutterBluePlugin", "Starting discovery");
                                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                                intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
                                intentFilter.addAction("android.bluetooth.device.action.FOUND");
                                p093X2.C0857r c0857r2 = c0846g2.f3031m;
                                c0857r2.f3082z.registerReceiver(c0857r2.f3077u, intentFilter);
                                c0857r2.f3070n.startDiscovery();
                                c0335k3.mo742b(null);
                                return;
                        }
                    }
                });
                return;
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                c0857r.f3080x.startActivity(new android.content.Intent("android.settings.BLUETOOTH_SETTINGS"), null);
                c0335k.mo742b(null);
                break;
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                c0857r.f3074r = false;
                try {
                    c0857r.f3082z.unregisterReceiver(c0843d);
                    android.util.Log.d("FlutterBluePlugin", "Stopped listening for pairing requests to handle");
                    break;
                } catch (java.lang.IllegalArgumentException unused3) {
                    break;
                }
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                if (c0857r.f3070n.isEnabled()) {
                    c0857r.f3070n.disable();
                    c0335k.mo742b(java.lang.Boolean.TRUE);
                    break;
                } else {
                    c0335k.mo742b(java.lang.Boolean.FALSE);
                    break;
                }
            case '\t':
                java.lang.String address = c0857r.f3070n.getAddress();
                if (address.equals("02:00:00:00:00:00")) {
                    android.util.Log.w("FlutterBluePlugin", "Local Bluetooth MAC address is hidden by system, trying other options...");
                    android.util.Log.d("FlutterBluePlugin", "Trying to obtain address using Settings Secure bank");
                    try {
                        str2 = android.provider.Settings.Secure.getString(c0857r.f3082z.getContentResolver(), "bluetooth_address");
                        if (str2 == null) {
                            throw new java.lang.NullPointerException("null returned, might be no permissions problem");
                        }
                    } catch (java.lang.Exception unused4) {
                        android.util.Log.d("FlutterBluePlugin", "Obtaining address using Settings Secure bank failed");
                        android.util.Log.d("FlutterBluePlugin", "Trying to obtain address using reflection against internal Android code");
                        try {
                            java.lang.reflect.Field declaredField = c0857r.f3070n.getClass().getDeclaredField("mService");
                            declaredField.setAccessible(true);
                            java.lang.Object obj2 = declaredField.get(c0857r.f3070n);
                            if (obj2 == null) {
                                if (!c0857r.f3070n.isEnabled()) {
                                    android.util.Log.d("FlutterBluePlugin", "Probably failed just because adapter is disabled!");
                                }
                                throw new java.lang.NullPointerException();
                            }
                            str2 = (java.lang.String) obj2.getClass().getMethod("getAddress", null).invoke(obj2, null);
                            if (str2 == null) {
                                throw new java.lang.NullPointerException();
                            }
                            try {
                                android.util.Log.d("FlutterBluePlugin", "Probably succed: " + str2 + " ✨ :F");
                            } catch (java.lang.Exception unused5) {
                                address = str2;
                                android.util.Log.d("FlutterBluePlugin", "Obtaining address using reflection against internal Android code failed");
                                android.util.Log.d("FlutterBluePlugin", "Trying to look up address by network interfaces - might be invalid on some devices");
                                try {
                                    java.util.Enumeration<java.net.NetworkInterface> networkInterfaces = java.net.NetworkInterface.getNetworkInterfaces();
                                    str = null;
                                    while (networkInterfaces.hasMoreElements()) {
                                        java.net.NetworkInterface nextElement = networkInterfaces.nextElement();
                                        if (nextElement.getName().equalsIgnoreCase("wlan0") && (hardwareAddress = nextElement.getHardwareAddress()) != null) {
                                            java.lang.StringBuilder sb = new java.lang.StringBuilder(18);
                                            for (byte b4 : hardwareAddress) {
                                                sb.append(java.lang.String.format("%02X:", java.lang.Byte.valueOf(b4)));
                                            }
                                            sb.setLength(17);
                                            str = sb.toString();
                                        }
                                    }
                                } catch (java.lang.Exception unused6) {
                                    android.util.Log.w("FlutterBluePlugin", "Looking for address by network interfaces failed");
                                }
                                if (str == null) {
                                    throw new java.lang.NullPointerException();
                                }
                                address = str;
                                c0335k.mo742b(address);
                            }
                        } catch (java.lang.Exception unused7) {
                        }
                    }
                    address = str2;
                }
                c0335k.mo742b(address);
                break;
            case '\n':
                c0335k.mo742b(c0857r.f3070n.getName());
                break;
            case 11:
            case 23:
                c0335k.mo742b(java.lang.Boolean.valueOf(c0857r.f3070n.isEnabled()));
                break;
            case '\f':
                if (c0384n.m841c("id")) {
                    try {
                        p093X2.C0849j c0849j = (p093X2.C0849j) sparseArray.get(((java.lang.Integer) c0384n.m839a("id")).intValue());
                        if (c0849j == null) {
                            c0335k.mo741a("invalid_argument", "there is no connection with provided id", null);
                            break;
                        } else if (c0384n.m841c("string")) {
                            android.os.AsyncTask.execute(new p093X2.RunnableC0854o(this, c0849j, (java.lang.String) c0384n.m839a("string"), c0335k, 0));
                            break;
                        } else if (c0384n.m841c("bytes")) {
                            android.os.AsyncTask.execute(new p093X2.RunnableC0854o(this, c0849j, (byte[]) c0384n.m839a("bytes"), c0335k, 1));
                            break;
                        } else {
                            c0335k.mo741a("invalid_argument", "there must be 'string' or 'bytes' argument", null);
                            break;
                        }
                    } catch (java.lang.ClassCastException unused8) {
                        c0335k.mo741a("invalid_argument", "'id' argument is required to be integer id of connection", null);
                        break;
                    }
                } else {
                    c0335k.mo741a("invalid_argument", "argument 'id' not found", null);
                    break;
                }
            case '\r':
                android.util.Log.d("FlutterBluePlugin", "Canceling discovery");
                try {
                    c0857r.f3082z.unregisterReceiver(c0857r.f3077u);
                } catch (java.lang.IllegalArgumentException unused9) {
                }
                c0857r.f3070n.cancelDiscovery();
                p047L2.C0378h c0378h = c0857r.f3076t;
                if (c0378h != null) {
                    c0378h.m828a();
                    obj = null;
                    c0857r.f3076t = null;
                } else {
                    obj = null;
                }
                c0335k.mo742b(obj);
                break;
            case 14:
                c0335k.mo742b(java.lang.Boolean.valueOf(c0857r.f3070n.getScanMode() == 23));
                break;
            case 15:
                c0335k.mo742b(java.lang.Boolean.TRUE);
                break;
            case 16:
                android.content.Intent intent = new android.content.Intent("android.bluetooth.adapter.action.REQUEST_DISCOVERABLE");
                if (c0384n.m841c("duration")) {
                    try {
                        intent.putExtra("android.bluetooth.adapter.extra.DISCOVERABLE_DURATION", ((java.lang.Integer) c0384n.m839a("duration")).intValue());
                    } catch (java.lang.ClassCastException unused10) {
                        c0335k.mo741a("invalid_argument", "'duration' argument is required to be integer", null);
                        break;
                    }
                }
                c0857r.f3069m = c0335k;
                c0857r.f3080x.startActivityForResult(intent, 2137, null);
                break;
            case 17:
                if (c0384n.m841c("address")) {
                    try {
                        final java.lang.String str6 = (java.lang.String) c0384n.m839a("address");
                        if (!android.bluetooth.BluetoothAdapter.checkBluetoothAddress(str6)) {
                            throw new java.lang.ClassCastException();
                        }
                        final int i6 = c0857r.f3079w + 1;
                        c0857r.f3079w = i6;
                        final p093X2.C0849j c0849j2 = new p093X2.C0849j(c0857r, i6, c0857r.f3070n);
                        sparseArray.put(i6, c0849j2);
                        android.util.Log.d("FlutterBluePlugin", "Connecting to " + str6 + " (id: " + i6 + ")");
                        android.os.AsyncTask.execute(new java.lang.Runnable() { // from class: X2.n
                            @Override // java.lang.Runnable
                            public final void run() {
                                p093X2.C0849j c0849j3 = c0849j2;
                                java.lang.String str7 = str6;
                                p043K2.C0335k c0335k2 = c0335k;
                                int i7 = i6;
                                p093X2.C0857r c0857r2 = p093X2.C0846g.this.f3031m;
                                try {
                                    c0849j3.m1680a(str7);
                                    c0857r2.f3080x.runOnUiThread(new p093X2.RunnableC0848i(i7, 1, c0335k2));
                                } catch (java.lang.Exception e4) {
                                    c0857r2.f3080x.runOnUiThread(new p093X2.RunnableC0851l(c0335k2, e4, 0));
                                    c0857r2.f3078v.remove(i7);
                                }
                            }
                        });
                        break;
                    } catch (java.lang.ClassCastException unused11) {
                        c0335k.mo741a("invalid_argument", "'address' argument is required to be string containing remote MAC address", null);
                        break;
                    }
                } else {
                    c0335k.mo741a("invalid_argument", "argument 'address' not found", null);
                    break;
                }
            case 18:
                if (c0857r.f3070n.isEnabled()) {
                    c0335k.mo742b(java.lang.Boolean.TRUE);
                    break;
                } else {
                    c0857r.f3069m = c0335k;
                    c0857r.f3080x.startActivityForResult(new android.content.Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1337, null);
                    break;
                }
            case 19:
                p093X2.C0857r.m1683a(c0857r, new p017D1.C0173f(c0335k, 6));
                break;
            case 20:
                if (c0384n.m841c("address")) {
                    try {
                        java.lang.String str7 = (java.lang.String) c0384n.m839a("address");
                        if (!android.bluetooth.BluetoothAdapter.checkBluetoothAddress(str7)) {
                            throw new java.lang.ClassCastException();
                        }
                        android.bluetooth.BluetoothDevice remoteDevice2 = c0857r.f3070n.getRemoteDevice(str7);
                        int bondState2 = remoteDevice2.getBondState();
                        if (bondState2 != 10) {
                            if (bondState2 != 11) {
                                try {
                                    java.lang.Object obj3 = (java.lang.Boolean) remoteDevice2.getClass().getMethod("removeBond", null).invoke(remoteDevice2, null);
                                    obj3.getClass();
                                    c0335k.mo742b(obj3);
                                    break;
                                } catch (java.lang.Exception e4) {
                                    c0335k.mo741a("bond_error", "error while unbonding", p093X2.C0857r.m1684c(e4));
                                    break;
                                }
                            } else {
                                c0335k.mo741a("bond_error", "device already bonding", null);
                                break;
                            }
                        } else {
                            c0335k.mo741a("bond_error", "device already unbonded", null);
                            break;
                        }
                    } catch (java.lang.ClassCastException unused12) {
                        c0335k.mo741a("invalid_argument", "'address' argument is required to be string containing remote MAC address", null);
                        break;
                    }
                } else {
                    c0335k.mo741a("invalid_argument", "argument 'address' not found", null);
                    break;
                }
            case 21:
                c0335k.mo742b(java.lang.Integer.valueOf(c0857r.f3070n.getState()));
                break;
            case 22:
                if (c0384n.m841c("name")) {
                    try {
                        c0335k.mo742b(java.lang.Boolean.valueOf(c0857r.f3070n.setName((java.lang.String) c0384n.m839a("name"))));
                        break;
                    } catch (java.lang.ClassCastException unused13) {
                        c0335k.mo741a("invalid_argument", "'name' argument is required to be string", null);
                        break;
                    }
                } else {
                    c0335k.mo741a("invalid_argument", "argument 'name' not found", null);
                    break;
                }
            default:
                c0335k.mo743c();
                break;
        }
    }
}
