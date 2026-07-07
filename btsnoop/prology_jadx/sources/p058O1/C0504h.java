package p058O1;

/* renamed from: O1.h */
/* loaded from: classes.dex */
public final class C0504h implements p058O1.InterfaceC0498b {

    /* renamed from: b */
    public static p058O1.C0504h f1495b;

    /* renamed from: c */
    public static final p058O1.C0505i f1496c = new p058O1.C0505i(0, false, false, 0, 0);

    /* renamed from: a */
    public java.lang.Object f1497a;

    public /* synthetic */ C0504h(java.lang.Object obj) {
        this.f1497a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [O1.h, java.lang.Object] */
    /* renamed from: b */
    public static synchronized p058O1.C0504h m1003b() {
        p058O1.C0504h c0504h;
        synchronized (p058O1.C0504h.class) {
            try {
                if (f1495b == null) {
                    f1495b = new java.lang.Object();
                }
                c0504h = f1495b;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return c0504h;
    }

    @Override // p058O1.InterfaceC0498b
    /* renamed from: a */
    public void mo977a(p046L1.C0357a c0357a) {
        boolean z4 = c0357a.f1094m == 0;
        p114c2.C1246a c1246a = (p114c2.C1246a) this.f1497a;
        if (z4) {
            c1246a.mo890g(null, c1246a.f4922H);
            return;
        }
        p058O1.C0504h c0504h = c1246a.f4937z;
        if (c0504h != null) {
            ((p050M1.InterfaceC0424h) c0504h.f1497a).mo902f0(c0357a);
        }
    }
}
