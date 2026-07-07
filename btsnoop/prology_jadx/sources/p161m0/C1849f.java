package p161m0;

/* renamed from: m0.f */
/* loaded from: classes.dex */
public final class C1849f implements p197u0.InterfaceC2224k {

    /* renamed from: l */
    public final int f7470l;

    /* renamed from: m */
    public final p161m0.C1865v f7471m;

    /* renamed from: n */
    public final p009B2.C0067x f7472n;

    /* renamed from: o */
    public final p094Y.C0886x f7473o;

    /* renamed from: q */
    public final p161m0.InterfaceC1847d f7475q;

    /* renamed from: r */
    public p161m0.InterfaceC1848e f7476r;

    /* renamed from: s */
    public p161m0.C1850g f7477s;

    /* renamed from: t */
    public p215y0.C2400l f7478t;

    /* renamed from: u */
    public volatile boolean f7479u;

    /* renamed from: w */
    public volatile long f7481w;

    /* renamed from: p */
    public final android.os.Handler f7474p = p086W.AbstractC0805y.m1619n(null);

    /* renamed from: v */
    public volatile long f7480v = -9223372036854775807L;

    public C1849f(int i4, p161m0.C1865v c1865v, p009B2.C0067x c0067x, p094Y.C0886x c0886x, p161m0.InterfaceC1847d interfaceC1847d) {
        this.f7470l = i4;
        this.f7471m = c1865v;
        this.f7472n = c0067x;
        this.f7473o = c0886x;
        this.f7475q = interfaceC1847d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, T.t] */
    @Override // p197u0.InterfaceC2224k
    /* renamed from: b */
    public final void mo3266b() {
        if (this.f7479u) {
            this.f7479u = false;
        }
        try {
            if (this.f7476r == null) {
                p161m0.InterfaceC1848e mo597l = this.f7475q.mo597l(this.f7470l);
                this.f7476r = mo597l;
                this.f7474p.post(new p102a0.RunnableC0957V(this, mo597l.mo3804g(), this.f7476r, 2));
                p161m0.InterfaceC1848e interfaceC1848e = this.f7476r;
                interfaceC1848e.getClass();
                this.f7478t = new p215y0.C2400l(interfaceC1848e, 0L, -1L);
                p161m0.C1850g c1850g = new p161m0.C1850g(this.f7471m.f7583a, this.f7470l);
                this.f7477s = c1850g;
                c1850g.mo35g(this.f7473o);
            }
            while (!this.f7479u) {
                if (this.f7480v != -9223372036854775807L) {
                    p161m0.C1850g c1850g2 = this.f7477s;
                    c1850g2.getClass();
                    c1850g2.mo34b(this.f7481w, this.f7480v);
                    this.f7480v = -9223372036854775807L;
                }
                p161m0.C1850g c1850g3 = this.f7477s;
                c1850g3.getClass();
                p215y0.C2400l c2400l = this.f7478t;
                c2400l.getClass();
                if (c1850g3.mo37l(c2400l, new java.lang.Object()) == -1) {
                    break;
                }
            }
            this.f7479u = false;
            p161m0.InterfaceC1848e interfaceC1848e2 = this.f7476r;
            interfaceC1848e2.getClass();
            if (interfaceC1848e2.mo3805h()) {
                p101a.AbstractC0936a.m1805m(this.f7476r);
                this.f7476r = null;
            }
        } catch (java.lang.Throwable th) {
            p161m0.InterfaceC1848e interfaceC1848e3 = this.f7476r;
            interfaceC1848e3.getClass();
            if (interfaceC1848e3.mo3805h()) {
                p101a.AbstractC0936a.m1805m(this.f7476r);
                this.f7476r = null;
            }
            throw th;
        }
    }

    @Override // p197u0.InterfaceC2224k
    /* renamed from: c */
    public final void mo3267c() {
        this.f7479u = true;
    }
}
