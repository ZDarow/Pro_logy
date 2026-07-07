package p179q0;

/* renamed from: q0.g0 */
/* loaded from: classes.dex */
public final class C1997g0 extends p179q0.AbstractC1984a {

    /* renamed from: u */
    public static final p076T.C0702p f8150u;

    /* renamed from: v */
    public static final p076T.C0659B f8151v;

    /* renamed from: w */
    public static final byte[] f8152w;

    /* renamed from: s */
    public final long f8153s;

    /* renamed from: t */
    public p076T.C0659B f8154t;

    /* JADX WARN: Type inference failed for: r11v0, types: [T.u, T.v] */
    static {
        p076T.C0701o c0701o = new p076T.C0701o();
        c0701o.f2370l = p076T.AbstractC0665H.m1201l("audio/raw");
        c0701o.f2384z = 2;
        c0701o.f2350A = 44100;
        c0701o.f2351B = 2;
        p076T.C0702p c0702p = new p076T.C0702p(c0701o);
        f8150u = c0702p;
        p076T.C0706t c0706t = new p076T.C0706t();
        p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
        p129f2.C1415c0 c1415c0 = p129f2.C1415c0.f5744p;
        java.util.List emptyList = java.util.Collections.emptyList();
        p129f2.C1415c0 c1415c02 = p129f2.C1415c0.f5744p;
        p076T.C0709w c0709w = new p076T.C0709w();
        p076T.C0712z c0712z = p076T.C0712z.f2455a;
        android.net.Uri uri = android.net.Uri.EMPTY;
        f8151v = new p076T.C0659B("SilenceMediaSource", new p076T.C0707u(c0706t), uri != null ? new p076T.C0711y(uri, c0702p.f2408m, null, emptyList, c1415c02, null, -9223372036854775807L) : null, new p076T.C0710x(c0709w), p076T.C0662E.f2173y, c0712z);
        f8152w = new byte[4096];
    }

    public C1997g0(long j4, p076T.C0659B c0659b) {
        p086W.AbstractC0781a.m1416e(j4 >= 0);
        this.f8153s = j4;
        this.f8154t = c0659b;
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: b */
    public final p179q0.InterfaceC1962D mo2975b(p179q0.C1964F c1964f, p197u0.C2218e c2218e, long j4) {
        return new p179q0.C1993e0(this.f8153s);
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: h */
    public final synchronized p076T.C0659B mo2976h() {
        return this.f8154t;
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: j */
    public final void mo2977j() {
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: m */
    public final void mo2978m(p094Y.InterfaceC0860C interfaceC0860C) {
        m4039n(new p179q0.C1999h0(this.f8153s, true, false, mo2976h()));
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: o */
    public final void mo2979o(p179q0.InterfaceC1962D interfaceC1962D) {
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: r */
    public final void mo2980r() {
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: u */
    public final synchronized void mo2981u(p076T.C0659B c0659b) {
        this.f8154t = c0659b;
    }
}
