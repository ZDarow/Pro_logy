package p013C2;

/* renamed from: C2.e */
/* loaded from: classes.dex */
public final class C0140e {

    /* renamed from: b */
    public final p013C2.C0138c f382b;

    /* renamed from: c */
    public final p034H2.C0247a f383c;

    /* renamed from: e */
    public p009B2.C0050g f385e;

    /* renamed from: f */
    public p013C2.C0139d f386f;

    /* renamed from: a */
    public final java.util.HashMap f381a = new java.util.HashMap();

    /* renamed from: d */
    public final java.util.HashMap f384d = new java.util.HashMap();

    /* renamed from: g */
    public boolean f387g = false;

    public C0140e(android.content.Context context, p013C2.C0138c c0138c) {
        new java.util.HashMap();
        new java.util.HashMap();
        new java.util.HashMap();
        this.f382b = c0138c;
        this.f383c = new p034H2.C0247a(context, c0138c, c0138c.f353c, c0138c.f352b, c0138c.f369s.f6617l);
    }

    /* renamed from: a */
    public final void m484a(p034H2.InterfaceC0248b interfaceC0248b) {
        p089W2.AbstractC0821a.m1664b("FlutterEngineConnectionRegistry#add ".concat(interfaceC0248b.getClass().getSimpleName()));
        try {
            java.lang.Class<?> cls = interfaceC0248b.getClass();
            java.util.HashMap hashMap = this.f381a;
            if (hashMap.containsKey(cls)) {
                android.util.Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + interfaceC0248b + ") but it was already registered with this FlutterEngine (" + this.f382b + ").");
                android.os.Trace.endSection();
                return;
            }
            interfaceC0248b.toString();
            hashMap.put(interfaceC0248b.getClass(), interfaceC0248b);
            interfaceC0248b.mo46d(this.f383c);
            if (interfaceC0248b instanceof p038I2.InterfaceC0309a) {
                p038I2.InterfaceC0309a interfaceC0309a = (p038I2.InterfaceC0309a) interfaceC0248b;
                this.f384d.put(interfaceC0248b.getClass(), interfaceC0309a);
                if (m489f()) {
                    interfaceC0309a.mo534h(this.f386f);
                }
            }
            android.os.Trace.endSection();
        } catch (java.lang.Throwable th) {
            try {
                android.os.Trace.endSection();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: b */
    public final void m485b(p009B2.AbstractActivityC0047d abstractActivityC0047d, androidx.lifecycle.C1149m c1149m) {
        this.f386f = new p013C2.C0139d(abstractActivityC0047d, c1149m);
        boolean booleanExtra = abstractActivityC0047d.getIntent() != null ? abstractActivityC0047d.getIntent().getBooleanExtra("enable-software-rendering", false) : false;
        p013C2.C0138c c0138c = this.f382b;
        c0138c.f369s.f6615G = booleanExtra;
        p094Y.C0886x c0886x = c0138c.f371u;
        io.flutter.plugin.platform.C1592o c1592o = (io.flutter.plugin.platform.C1592o) c0886x.f3175m;
        if (c1592o.f6619n != null) {
            throw new java.lang.AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        c1592o.f6619n = abstractActivityC0047d;
        c1592o.f6622q = c0138c.f352b;
        p018D2.C0176b c0176b = c0138c.f353c;
        c1592o.f6624s = new p008B1.C0026d(c0176b, 12);
        io.flutter.plugin.platform.C1591n c1591n = (io.flutter.plugin.platform.C1591n) c0886x.f3176n;
        if (c1591n.f6595n != null) {
            throw new java.lang.AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        c1591n.f6595n = abstractActivityC0047d;
        p008B1.C0026d c0026d = new p008B1.C0026d(c0176b, 11);
        c1591n.f6599r = c0026d;
        c0026d.f100n = c1591n.f6592A;
        c1592o.f6624s.f100n = c0886x;
        for (p038I2.InterfaceC0309a interfaceC0309a : this.f384d.values()) {
            if (this.f387g) {
                interfaceC0309a.mo532f(this.f386f);
            } else {
                interfaceC0309a.mo534h(this.f386f);
            }
        }
        this.f387g = false;
    }

    /* renamed from: c */
    public final void m486c() {
        if (!m489f()) {
            android.util.Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        p089W2.AbstractC0821a.m1664b("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            java.util.Iterator it = this.f384d.values().iterator();
            while (it.hasNext()) {
                ((p038I2.InterfaceC0309a) it.next()).mo531e();
            }
            m487d();
            android.os.Trace.endSection();
        } catch (java.lang.Throwable th) {
            try {
                android.os.Trace.endSection();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: d */
    public final void m487d() {
        p013C2.C0138c c0138c = this.f382b;
        io.flutter.plugin.platform.C1592o c1592o = c0138c.f369s;
        p008B1.C0026d c0026d = c1592o.f6624s;
        if (c0026d != null) {
            c0026d.f100n = null;
        }
        c1592o.m3512c();
        c1592o.f6624s = null;
        c1592o.f6619n = null;
        c1592o.f6622q = null;
        io.flutter.plugin.platform.C1591n c1591n = c0138c.f370t;
        p008B1.C0026d c0026d2 = c1591n.f6599r;
        if (c0026d2 != null) {
            c0026d2.f100n = null;
        }
        android.view.Surface surface = c1591n.f6606y;
        if (surface != null) {
            surface.release();
            c1591n.f6606y = null;
            c1591n.f6607z = null;
        }
        c1591n.f6599r = null;
        c1591n.f6595n = null;
        this.f385e = null;
        this.f386f = null;
    }

    /* renamed from: e */
    public final void m488e() {
        if (m489f()) {
            m486c();
        }
    }

    /* renamed from: f */
    public final boolean m489f() {
        return this.f385e != null;
    }
}
