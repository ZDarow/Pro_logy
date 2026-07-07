package p093X2;

/* renamed from: X2.j */
/* loaded from: classes.dex */
public final class C0849j {

    /* renamed from: h */
    public static final java.util.UUID f3038h = java.util.UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");

    /* renamed from: a */
    public final android.bluetooth.BluetoothAdapter f3039a;

    /* renamed from: c */
    public final int f3041c;

    /* renamed from: d */
    public p047L2.C0378h f3042d;

    /* renamed from: e */
    public final android.support.v4.media.session.C1061t f3043e;

    /* renamed from: g */
    public final /* synthetic */ p093X2.C0857r f3045g;

    /* renamed from: b */
    public p093X2.C0840a f3040b = null;

    /* renamed from: f */
    public final p093X2.C0849j f3044f = this;

    public C0849j(p093X2.C0857r c0857r, int i4, android.bluetooth.BluetoothAdapter bluetoothAdapter) {
        this.f3045g = c0857r;
        this.f3039a = bluetoothAdapter;
        this.f3041c = i4;
        android.support.v4.media.session.C1061t c1061t = new android.support.v4.media.session.C1061t(c0857r.f3081y, p009B2.AbstractC0051h.m152k("flutter_bluetooth_serial/read/", i4));
        this.f3043e = c1061t;
        c1061t.m2206B0(new p006B.C0020c(i4, this));
    }

    /* renamed from: a */
    public final void m1680a(java.lang.String str) {
        p093X2.C0840a c0840a = this.f3040b;
        if (c0840a != null && !c0840a.f3015o) {
            throw new java.io.IOException("already connected");
        }
        android.bluetooth.BluetoothAdapter bluetoothAdapter = this.f3039a;
        android.bluetooth.BluetoothDevice remoteDevice = bluetoothAdapter.getRemoteDevice(str);
        if (remoteDevice == null) {
            throw new java.io.IOException("device not found");
        }
        android.bluetooth.BluetoothSocket createRfcommSocketToServiceRecord = remoteDevice.createRfcommSocketToServiceRecord(f3038h);
        if (createRfcommSocketToServiceRecord == null) {
            throw new java.io.IOException("socket connection not established");
        }
        bluetoothAdapter.cancelDiscovery();
        createRfcommSocketToServiceRecord.connect();
        p093X2.C0840a c0840a2 = new p093X2.C0840a(this, createRfcommSocketToServiceRecord);
        this.f3040b = c0840a2;
        c0840a2.start();
    }

    /* renamed from: b */
    public final void m1681b() {
        boolean z4;
        p093X2.C0840a c0840a = this.f3040b;
        if (c0840a == null || (z4 = c0840a.f3015o)) {
            return;
        }
        if (!z4) {
            c0840a.f3015o = true;
            try {
                c0840a.f3014n.flush();
            } catch (java.lang.Exception unused) {
            }
            android.bluetooth.BluetoothSocket bluetoothSocket = c0840a.f3012l;
            if (bluetoothSocket != null) {
                try {
                    java.lang.Thread.sleep(111L);
                    bluetoothSocket.close();
                } catch (java.lang.Exception unused2) {
                }
            }
        }
        this.f3040b = null;
    }

    /* renamed from: c */
    public final void m1682c(byte[] bArr) {
        p093X2.C0840a c0840a = this.f3040b;
        if (c0840a == null || c0840a.f3015o) {
            throw new java.io.IOException("not connected");
        }
        c0840a.getClass();
        try {
            c0840a.f3014n.write(bArr);
        } catch (java.io.IOException e4) {
            e4.printStackTrace();
        }
    }
}
