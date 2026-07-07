package p013C2;

/* renamed from: C2.c */
/* loaded from: classes.dex */
public final class C0138c implements p089W2.InterfaceC0822b {

    /* renamed from: y */
    public static long f349y = 1;

    /* renamed from: z */
    public static final java.util.HashMap f350z = new java.util.HashMap();

    /* renamed from: a */
    public final io.flutter.embedding.engine.FlutterJNI f351a;

    /* renamed from: b */
    public final io.flutter.embedding.engine.renderer.C1561j f352b;

    /* renamed from: c */
    public final p018D2.C0176b f353c;

    /* renamed from: d */
    public final p013C2.C0140e f354d;

    /* renamed from: e */
    public final p051M2.C0428a f355e;

    /* renamed from: f */
    public final android.support.v4.media.session.C1061t f356f;

    /* renamed from: g */
    public final p043K2.C0327c f357g;

    /* renamed from: h */
    public final p009B2.C0061r f358h;

    /* renamed from: i */
    public final p043K2.C0325a f359i;

    /* renamed from: j */
    public final p043K2.C0325a f360j;

    /* renamed from: k */
    public final p043K2.C0336l f361k;

    /* renamed from: l */
    public final p008B1.C0026d f362l;

    /* renamed from: m */
    public final p009B2.C0061r f363m;

    /* renamed from: n */
    public final p009B2.C0061r f364n;

    /* renamed from: o */
    public final p043K2.C0338n f365o;

    /* renamed from: p */
    public final p009B2.C0061r f366p;

    /* renamed from: q */
    public final p043K2.C0326b f367q;

    /* renamed from: r */
    public final p008B1.C0026d f368r;

    /* renamed from: s */
    public final io.flutter.plugin.platform.C1592o f369s;

    /* renamed from: t */
    public final io.flutter.plugin.platform.C1591n f370t;

    /* renamed from: u */
    public final p094Y.C0886x f371u;

    /* renamed from: w */
    public final long f373w;

    /* renamed from: v */
    public final java.util.HashSet f372v = new java.util.HashSet();

    /* renamed from: x */
    public final p013C2.C0136a f374x = new p013C2.C0136a(0, this);

    /* JADX WARN: Removed duplicated region for block: B:92:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x042c  */
    /* JADX WARN: Type inference failed for: r3v8, types: [K2.l, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0138c(android.content.Context r22, io.flutter.embedding.engine.FlutterJNI r23, io.flutter.plugin.platform.C1592o r24) {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p013C2.C0138c.<init>(android.content.Context, io.flutter.embedding.engine.FlutterJNI, io.flutter.plugin.platform.o):void");
    }

    /* renamed from: a */
    public final void m473a() {
        java.util.Iterator it = this.f372v.iterator();
        while (it.hasNext()) {
            ((p013C2.InterfaceC0137b) it.next()).mo472b();
        }
        p013C2.C0140e c0140e = this.f354d;
        c0140e.m488e();
        java.util.HashMap hashMap = c0140e.f381a;
        java.util.Iterator it2 = new java.util.HashSet(hashMap.keySet()).iterator();
        while (it2.hasNext()) {
            java.lang.Class cls = (java.lang.Class) it2.next();
            p034H2.InterfaceC0248b interfaceC0248b = (p034H2.InterfaceC0248b) hashMap.get(cls);
            if (interfaceC0248b != null) {
                p089W2.AbstractC0821a.m1664b("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                try {
                    if (interfaceC0248b instanceof p038I2.InterfaceC0309a) {
                        if (c0140e.m489f()) {
                            ((p038I2.InterfaceC0309a) interfaceC0248b).mo531e();
                        }
                        c0140e.f384d.remove(cls);
                    }
                    interfaceC0248b.mo44b(c0140e.f383c);
                    hashMap.remove(cls);
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
        }
        hashMap.clear();
        while (true) {
            io.flutter.plugin.platform.C1592o c1592o = this.f369s;
            android.util.SparseArray sparseArray = c1592o.f6628w;
            if (sparseArray.size() <= 0) {
                break;
            }
            c1592o.f6616H.mo731A(sparseArray.keyAt(0));
        }
        while (true) {
            io.flutter.plugin.platform.C1591n c1591n = this.f370t;
            android.util.SparseArray sparseArray2 = c1591n.f6601t;
            if (sparseArray2.size() <= 0) {
                this.f353c.f477l.setPlatformMessageHandler(null);
                io.flutter.embedding.engine.FlutterJNI flutterJNI = this.f351a;
                flutterJNI.removeEngineLifecycleListener(this.f374x);
                flutterJNI.setDeferredComponentManager(null);
                flutterJNI.detachFromNativeAndReleaseResources();
                android.support.v4.media.session.C1061t.m2201n0().getClass();
                f350z.remove(java.lang.Long.valueOf(this.f373w));
                return;
            }
            c1591n.f6592A.mo731A(sparseArray2.keyAt(0));
        }
    }
}
