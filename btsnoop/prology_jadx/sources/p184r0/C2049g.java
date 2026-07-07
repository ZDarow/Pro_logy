package p184r0;

/* renamed from: r0.g */
/* loaded from: classes.dex */
public final class C2049g implements p179q0.InterfaceC1985a0 {

    /* renamed from: l */
    public final p184r0.C2050h f8340l;

    /* renamed from: m */
    public final p179q0.C1983Z f8341m;

    /* renamed from: n */
    public final int f8342n;

    /* renamed from: o */
    public boolean f8343o;

    /* renamed from: p */
    public final /* synthetic */ p184r0.C2050h f8344p;

    public C2049g(p184r0.C2050h c2050h, p184r0.C2050h c2050h2, p179q0.C1983Z c1983z, int i4) {
        this.f8344p = c2050h;
        this.f8340l = c2050h2;
        this.f8341m = c1983z;
        this.f8342n = i4;
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: a */
    public final void mo49a() {
    }

    /* renamed from: b */
    public final void m4103b() {
        if (this.f8343o) {
            return;
        }
        p184r0.C2050h c2050h = this.f8344p;
        p127f0.C1372e c1372e = c2050h.f8359r;
        int[] iArr = c2050h.f8354m;
        int i4 = this.f8342n;
        c1372e.m3117a(iArr[i4], c2050h.f8355n[i4], 0, null, c2050h.f8349E);
        this.f8343o = true;
    }

    /* renamed from: c */
    public final void m4104c() {
        p184r0.C2050h c2050h = this.f8344p;
        boolean[] zArr = c2050h.f8356o;
        int i4 = this.f8342n;
        p086W.AbstractC0781a.m1421j(zArr[i4]);
        c2050h.f8356o[i4] = false;
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: d */
    public final boolean mo52d() {
        p184r0.C2050h c2050h = this.f8344p;
        return !c2050h.m4112y() && this.f8341m.m4023s(c2050h.f8352H);
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: n */
    public final int mo58n(long j4) {
        p184r0.C2050h c2050h = this.f8344p;
        if (c2050h.m4112y()) {
            return 0;
        }
        boolean z4 = c2050h.f8352H;
        p179q0.C1983Z c1983z = this.f8341m;
        int m4020p = c1983z.m4020p(j4, z4);
        p184r0.AbstractC2043a abstractC2043a = c2050h.f8351G;
        if (abstractC2043a != null) {
            m4020p = java.lang.Math.min(m4020p, abstractC2043a.m4100e(this.f8342n + 1) - c1983z.m4018n());
        }
        c1983z.m4009C(m4020p);
        if (m4020p > 0) {
            m4103b();
        }
        return m4020p;
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: o */
    public final int mo59o(p094Y.C0886x c0886x, p098Z.C0921f c0921f, int i4) {
        p184r0.C2050h c2050h = this.f8344p;
        if (c2050h.m4112y()) {
            return -3;
        }
        p184r0.AbstractC2043a abstractC2043a = c2050h.f8351G;
        p179q0.C1983Z c1983z = this.f8341m;
        if (abstractC2043a != null && abstractC2043a.m4100e(this.f8342n + 1) <= c1983z.m4018n()) {
            return -3;
        }
        m4103b();
        return c1983z.m4028x(c0886x, c0921f, i4, c2050h.f8352H);
    }
}
