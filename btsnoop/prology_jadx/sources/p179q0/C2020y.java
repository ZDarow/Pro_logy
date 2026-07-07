package p179q0;

/* renamed from: q0.y */
/* loaded from: classes.dex */
public final class C2020y implements p179q0.InterfaceC1962D, p179q0.InterfaceC1961C {

    /* renamed from: l */
    public final p179q0.C1964F f8239l;

    /* renamed from: m */
    public final long f8240m;

    /* renamed from: n */
    public final p197u0.C2218e f8241n;

    /* renamed from: o */
    public p179q0.AbstractC1984a f8242o;

    /* renamed from: p */
    public p179q0.InterfaceC1962D f8243p;

    /* renamed from: q */
    public p179q0.InterfaceC1961C f8244q;

    /* renamed from: r */
    public long f8245r = -9223372036854775807L;

    public C2020y(p179q0.C1964F c1964f, p197u0.C2218e c2218e, long j4) {
        this.f8239l = c1964f;
        this.f8241n = c2218e;
        this.f8240m = j4;
    }

    /* renamed from: a */
    public final void m4069a(p179q0.C1964F c1964f) {
        long j4 = this.f8245r;
        if (j4 == -9223372036854775807L) {
            j4 = this.f8240m;
        }
        p179q0.AbstractC1984a abstractC1984a = this.f8242o;
        abstractC1984a.getClass();
        p179q0.InterfaceC1962D mo2975b = abstractC1984a.mo2975b(c1964f, this.f8241n, j4);
        this.f8243p = mo2975b;
        if (this.f8244q != null) {
            mo2975b.mo2957g(this, j4);
        }
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: b */
    public final long mo2953b(long j4, p102a0.C0987m0 c0987m0) {
        p179q0.InterfaceC1962D interfaceC1962D = this.f8243p;
        int i4 = p086W.AbstractC0805y.f2801a;
        return interfaceC1962D.mo2953b(j4, c0987m0);
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: c */
    public final boolean mo2954c() {
        p179q0.InterfaceC1962D interfaceC1962D = this.f8243p;
        return interfaceC1962D != null && interfaceC1962D.mo2954c();
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: e */
    public final p179q0.C2005k0 mo2956e() {
        p179q0.InterfaceC1962D interfaceC1962D = this.f8243p;
        int i4 = p086W.AbstractC0805y.f2801a;
        return interfaceC1962D.mo2956e();
    }

    @Override // p179q0.InterfaceC1987b0
    /* renamed from: f */
    public final void mo1906f(p179q0.InterfaceC1989c0 interfaceC1989c0) {
        p179q0.InterfaceC1961C interfaceC1961C = this.f8244q;
        int i4 = p086W.AbstractC0805y.f2801a;
        interfaceC1961C.mo1906f(this);
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: g */
    public final void mo2957g(p179q0.InterfaceC1961C interfaceC1961C, long j4) {
        this.f8244q = interfaceC1961C;
        p179q0.InterfaceC1962D interfaceC1962D = this.f8243p;
        if (interfaceC1962D != null) {
            long j5 = this.f8245r;
            if (j5 == -9223372036854775807L) {
                j5 = this.f8240m;
            }
            interfaceC1962D.mo2957g(this, j5);
        }
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: h */
    public final long mo2958h() {
        p179q0.InterfaceC1962D interfaceC1962D = this.f8243p;
        int i4 = p086W.AbstractC0805y.f2801a;
        return interfaceC1962D.mo2958h();
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: i */
    public final boolean mo2959i(p102a0.C0953Q c0953q) {
        p179q0.InterfaceC1962D interfaceC1962D = this.f8243p;
        return interfaceC1962D != null && interfaceC1962D.mo2959i(c0953q);
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: j */
    public final void mo2960j() {
        p179q0.InterfaceC1962D interfaceC1962D = this.f8243p;
        if (interfaceC1962D != null) {
            interfaceC1962D.mo2960j();
            return;
        }
        p179q0.AbstractC1984a abstractC1984a = this.f8242o;
        if (abstractC1984a != null) {
            abstractC1984a.mo2977j();
        }
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: l */
    public final long mo2961l(long j4) {
        p179q0.InterfaceC1962D interfaceC1962D = this.f8243p;
        int i4 = p086W.AbstractC0805y.f2801a;
        return interfaceC1962D.mo2961l(j4);
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: m */
    public final void mo2962m(long j4) {
        p179q0.InterfaceC1962D interfaceC1962D = this.f8243p;
        int i4 = p086W.AbstractC0805y.f2801a;
        interfaceC1962D.mo2962m(j4);
    }

    @Override // p179q0.InterfaceC1961C
    /* renamed from: o */
    public final void mo1920o(p179q0.InterfaceC1962D interfaceC1962D) {
        p179q0.InterfaceC1961C interfaceC1961C = this.f8244q;
        int i4 = p086W.AbstractC0805y.f2801a;
        interfaceC1961C.mo1920o(this);
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: p */
    public final long mo2963p(p193t0.InterfaceC2181s[] interfaceC2181sArr, boolean[] zArr, p179q0.InterfaceC1985a0[] interfaceC1985a0Arr, boolean[] zArr2, long j4) {
        long j5 = this.f8245r;
        long j6 = (j5 == -9223372036854775807L || j4 != this.f8240m) ? j4 : j5;
        this.f8245r = -9223372036854775807L;
        p179q0.InterfaceC1962D interfaceC1962D = this.f8243p;
        int i4 = p086W.AbstractC0805y.f2801a;
        return interfaceC1962D.mo2963p(interfaceC2181sArr, zArr, interfaceC1985a0Arr, zArr2, j6);
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: r */
    public final long mo2964r() {
        p179q0.InterfaceC1962D interfaceC1962D = this.f8243p;
        int i4 = p086W.AbstractC0805y.f2801a;
        return interfaceC1962D.mo2964r();
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: u */
    public final long mo2965u() {
        p179q0.InterfaceC1962D interfaceC1962D = this.f8243p;
        int i4 = p086W.AbstractC0805y.f2801a;
        return interfaceC1962D.mo2965u();
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: w */
    public final void mo2966w(long j4) {
        p179q0.InterfaceC1962D interfaceC1962D = this.f8243p;
        int i4 = p086W.AbstractC0805y.f2801a;
        interfaceC1962D.mo2966w(j4);
    }
}
