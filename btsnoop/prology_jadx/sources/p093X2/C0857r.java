package p093X2;

/* renamed from: X2.r */
/* loaded from: classes.dex */
public class C0857r implements p034H2.InterfaceC0248b, p038I2.InterfaceC0309a {

    /* renamed from: l */
    public p035I.C0291m f3068l;

    /* renamed from: n */
    public android.bluetooth.BluetoothAdapter f3070n;

    /* renamed from: p */
    public p047L2.C0378h f3072p;

    /* renamed from: t */
    public p047L2.C0378h f3076t;

    /* renamed from: x */
    public p009B2.AbstractActivityC0047d f3080x;

    /* renamed from: y */
    public p047L2.InterfaceC0376f f3081y;

    /* renamed from: z */
    public android.content.Context f3082z;

    /* renamed from: m */
    public p043K2.C0335k f3069m = null;

    /* renamed from: r */
    public boolean f3074r = false;

    /* renamed from: s */
    public p093X2.C0856q f3075s = null;

    /* renamed from: v */
    public final android.util.SparseArray f3078v = new android.util.SparseArray(2);

    /* renamed from: w */
    public int f3079w = 0;

    /* renamed from: A */
    public p093X2.InterfaceC0850k f3067A = null;

    /* renamed from: o */
    public final p093X2.C0843d f3071o = new p093X2.C0843d(this, 0);

    /* renamed from: q */
    public final p093X2.C0843d f3073q = new p093X2.C0843d(this, 1);

    /* renamed from: u */
    public final p093X2.C0843d f3077u = new p093X2.C0843d(this, 2);

    /* renamed from: a */
    public static void m1683a(p093X2.C0857r c0857r, p093X2.InterfaceC0850k interfaceC0850k) {
        if (p176p1.AbstractC1949a.m3938o(c0857r.f3080x, "android.permission.ACCESS_COARSE_LOCATION") == 0 && p176p1.AbstractC1949a.m3938o(c0857r.f3080x, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            interfaceC0850k.mo535b(true);
        } else {
            p176p1.AbstractC1949a.m3909L(c0857r.f3080x, new java.lang.String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 1451);
            c0857r.f3067A = interfaceC0850k;
        }
    }

    /* renamed from: c */
    public static java.lang.String m1684c(java.lang.Exception exc) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        exc.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: i */
    public static boolean m1685i(android.bluetooth.BluetoothDevice bluetoothDevice) {
        try {
            return ((java.lang.Boolean) bluetoothDevice.getClass().getMethod("isConnected", null).invoke(bluetoothDevice, null)).booleanValue();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: b */
    public final void mo44b(p034H2.C0247a c0247a) {
        p035I.C0291m c0291m = this.f3068l;
        if (c0291m != null) {
            c0291m.m702s(null);
        }
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: d */
    public final void mo46d(p034H2.C0247a c0247a) {
        android.util.Log.v("FlutterBluetoothSerial", "Attached to engine");
        p047L2.InterfaceC0376f interfaceC0376f = (p047L2.InterfaceC0376f) c0247a.f720m;
        this.f3081y = interfaceC0376f;
        p035I.C0291m c0291m = new p035I.C0291m(interfaceC0376f, "flutter_bluetooth_serial/methods");
        this.f3068l = c0291m;
        c0291m.m702s(new p093X2.C0846g(this, 2));
        new android.support.v4.media.session.C1061t(this.f3081y, "flutter_bluetooth_serial/state").m2206B0(new p093X2.C0846g(this, 0));
        new android.support.v4.media.session.C1061t(this.f3081y, "flutter_bluetooth_serial/discovery").m2206B0(new p093X2.C0846g(this, 1));
    }

    @Override // p038I2.InterfaceC0309a
    /* renamed from: e */
    public final void mo531e() {
    }

    @Override // p038I2.InterfaceC0309a
    /* renamed from: f */
    public final void mo532f(p013C2.C0139d c0139d) {
    }

    @Override // p038I2.InterfaceC0309a
    /* renamed from: g */
    public final void mo533g() {
    }

    @Override // p038I2.InterfaceC0309a
    /* renamed from: h */
    public final void mo534h(p013C2.C0139d c0139d) {
        p009B2.AbstractActivityC0047d abstractActivityC0047d = (p009B2.AbstractActivityC0047d) c0139d.f375a;
        this.f3080x = abstractActivityC0047d;
        this.f3070n = ((android.bluetooth.BluetoothManager) abstractActivityC0047d.getSystemService("bluetooth")).getAdapter();
        c0139d.m480a(new p047L2.InterfaceC0388r() { // from class: X2.b
            @Override // p047L2.InterfaceC0388r
            /* renamed from: a */
            public final boolean mo578a(int i4, int i5, android.content.Intent intent) {
                p093X2.C0857r c0857r = p093X2.C0857r.this;
                if (i4 == 1337) {
                    p043K2.C0335k c0335k = c0857r.f3069m;
                    if (c0335k != null) {
                        c0335k.mo742b(java.lang.Boolean.valueOf(i5 != 0));
                    }
                } else {
                    if (i4 != 2137) {
                        c0857r.getClass();
                        return false;
                    }
                    p043K2.C0335k c0335k2 = c0857r.f3069m;
                    if (i5 == 0) {
                        i5 = -1;
                    }
                    c0335k2.mo742b(java.lang.Integer.valueOf(i5));
                }
                return true;
            }
        });
        ((java.util.HashSet) c0139d.f376b).add(new p047L2.InterfaceC0389s() { // from class: X2.c
            @Override // p047L2.InterfaceC0389s
            /* renamed from: c */
            public final boolean mo648c(int i4, java.lang.String[] strArr, int[] iArr) {
                p093X2.C0857r c0857r = p093X2.C0857r.this;
                if (i4 != 1451) {
                    c0857r.getClass();
                    return false;
                }
                c0857r.f3067A.mo535b(iArr[0] == 0);
                c0857r.f3067A = null;
                return true;
            }
        });
        p009B2.AbstractActivityC0047d abstractActivityC0047d2 = (p009B2.AbstractActivityC0047d) c0139d.f375a;
        this.f3080x = abstractActivityC0047d2;
        this.f3082z = abstractActivityC0047d2.getApplicationContext();
    }
}
