package p161m0;

/* renamed from: m0.q */
/* loaded from: classes.dex */
public final class C1860q {

    /* renamed from: a */
    public final p161m0.C1859p f7545a;

    /* renamed from: b */
    public final p197u0.C2227n f7546b;

    /* renamed from: c */
    public final p179q0.C1983Z f7547c;

    /* renamed from: d */
    public boolean f7548d;

    /* renamed from: e */
    public boolean f7549e;

    /* renamed from: f */
    public final /* synthetic */ p161m0.C1861r f7550f;

    public C1860q(p161m0.C1861r c1861r, p161m0.C1865v c1865v, int i4, p161m0.InterfaceC1847d interfaceC1847d) {
        this.f7550f = c1861r;
        this.f7546b = new p197u0.C2227n(p009B2.AbstractC0051h.m152k("ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper ", i4));
        p179q0.C1983Z c1983z = new p179q0.C1983Z(c1861r.f7558l, null, null);
        this.f7547c = c1983z;
        this.f7545a = new p161m0.C1859p(c1861r, c1865v, i4, c1983z, interfaceC1847d);
        c1983z.f8090f = c1861r.f7560n;
    }

    /* renamed from: a */
    public final void m3824a() {
        if (this.f7548d) {
            return;
        }
        this.f7545a.f7542b.f7479u = true;
        this.f7548d = true;
        p161m0.C1861r.m3835v(this.f7550f);
    }

    /* renamed from: b */
    public final void m3825b() {
        this.f7546b.m4434f(this.f7545a.f7542b, this.f7550f.f7560n, 0);
    }
}
