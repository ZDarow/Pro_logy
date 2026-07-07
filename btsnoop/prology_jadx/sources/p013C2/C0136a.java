package p013C2;

/* renamed from: C2.a */
/* loaded from: classes.dex */
public final class C0136a implements p013C2.InterfaceC0137b {

    /* renamed from: a */
    public final /* synthetic */ int f347a;

    /* renamed from: b */
    public final /* synthetic */ java.lang.Object f348b;

    public /* synthetic */ C0136a(int i4, java.lang.Object obj) {
        this.f347a = i4;
        this.f348b = obj;
    }

    /* renamed from: c */
    private final void m469c() {
    }

    /* renamed from: d */
    private final void m470d() {
    }

    @Override // p013C2.InterfaceC0137b
    /* renamed from: a */
    public final void mo471a() {
        switch (this.f347a) {
            case 0:
                p013C2.C0138c c0138c = (p013C2.C0138c) this.f348b;
                java.util.Iterator it = c0138c.f372v.iterator();
                while (it.hasNext()) {
                    ((p013C2.InterfaceC0137b) it.next()).mo471a();
                }
                while (true) {
                    io.flutter.plugin.platform.C1592o c1592o = c0138c.f369s;
                    android.util.SparseArray sparseArray = c1592o.f6628w;
                    if (sparseArray.size() > 0) {
                        c1592o.f6616H.mo731A(sparseArray.keyAt(0));
                    } else {
                        while (true) {
                            io.flutter.plugin.platform.C1591n c1591n = c0138c.f370t;
                            android.util.SparseArray sparseArray2 = c1591n.f6601t;
                            if (sparseArray2.size() <= 0) {
                                c0138c.f361k.f1039b = null;
                                return;
                            } else {
                                c1591n.f6592A.mo731A(sparseArray2.keyAt(0));
                            }
                        }
                    }
                }
            default:
                ((p194t2.C2187c) this.f348b).f8760m.m2217a0();
                return;
        }
    }

    @Override // p013C2.InterfaceC0137b
    /* renamed from: b */
    public final void mo472b() {
        int i4 = this.f347a;
    }
}
