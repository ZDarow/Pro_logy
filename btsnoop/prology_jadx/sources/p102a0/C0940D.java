package p102a0;

/* renamed from: a0.D */
/* loaded from: classes.dex */
public final /* synthetic */ class C0940D implements p086W.InterfaceC0788h {

    /* renamed from: l */
    public final /* synthetic */ int f3314l = 0;

    /* renamed from: m */
    public final /* synthetic */ p076T.C0690d0 f3315m;

    public /* synthetic */ C0940D(p076T.C0690d0 c0690d0) {
        this.f3315m = c0690d0;
    }

    @Override // p086W.InterfaceC0788h
    /* renamed from: b */
    public final void mo285b(java.lang.Object obj) {
        switch (this.f3314l) {
            case 0:
                ((p076T.InterfaceC0670M) obj).mo1219m(this.f3315m);
                return;
            default:
                p107b0.C1175j c1175j = (p107b0.C1175j) obj;
                p063P2.C0528a c0528a = c1175j.f4537o;
                p076T.C0690d0 c0690d0 = this.f3315m;
                if (c0528a != null) {
                    p076T.C0702p c0702p = (p076T.C0702p) c0528a.f1552m;
                    if (c0702p.f2415t == -1) {
                        p076T.C0701o m1295a = c0702p.m1295a();
                        m1295a.f2376r = c0690d0.f2311a;
                        m1295a.f2377s = c0690d0.f2312b;
                        c1175j.f4537o = new p063P2.C0528a(new p076T.C0702p(m1295a), c0528a.f1551l, (java.lang.String) c0528a.f1553n);
                    }
                }
                int i4 = c0690d0.f2311a;
                return;
        }
    }

    public /* synthetic */ C0940D(p107b0.C1166a c1166a, p076T.C0690d0 c0690d0) {
        this.f3315m = c0690d0;
    }
}
