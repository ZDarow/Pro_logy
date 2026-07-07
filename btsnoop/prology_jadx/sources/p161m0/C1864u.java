package p161m0;

/* renamed from: m0.u */
/* loaded from: classes.dex */
public final class C1864u extends p179q0.AbstractC1984a {

    /* renamed from: A */
    public p076T.C0659B f7574A;

    /* renamed from: s */
    public final p046L1.C0363g f7575s;

    /* renamed from: t */
    public final java.lang.String f7576t = "AndroidXMedia3/1.4.1";

    /* renamed from: u */
    public final android.net.Uri f7577u;

    /* renamed from: v */
    public final javax.net.SocketFactory f7578v;

    /* renamed from: w */
    public long f7579w;

    /* renamed from: x */
    public boolean f7580x;

    /* renamed from: y */
    public boolean f7581y;

    /* renamed from: z */
    public boolean f7582z;

    static {
        p076T.AbstractC0660C.m1179a("media3.exoplayer.rtsp");
    }

    public C1864u(p076T.C0659B c0659b, p046L1.C0363g c0363g, javax.net.SocketFactory socketFactory) {
        this.f7574A = c0659b;
        this.f7575s = c0363g;
        p076T.C0711y c0711y = c0659b.f2143b;
        c0711y.getClass();
        this.f7577u = c0711y.f2449a;
        this.f7578v = socketFactory;
        this.f7579w = -9223372036854775807L;
        this.f7582z = true;
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: b */
    public final p179q0.InterfaceC1962D mo2975b(p179q0.C1964F c1964f, p197u0.C2218e c2218e, long j4) {
        p129f2.C1408Y c1408y = new p129f2.C1408Y(17, this);
        return new p161m0.C1861r(c2218e, this.f7575s, this.f7577u, c1408y, this.f7576t, this.f7578v);
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: h */
    public final synchronized p076T.C0659B mo2976h() {
        return this.f7574A;
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: j */
    public final void mo2977j() {
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: m */
    public final void mo2978m(p094Y.InterfaceC0860C interfaceC0860C) {
        m3839v();
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: o */
    public final void mo2979o(p179q0.InterfaceC1962D interfaceC1962D) {
        p161m0.C1861r c1861r = (p161m0.C1861r) interfaceC1962D;
        int i4 = 0;
        while (true) {
            java.util.ArrayList arrayList = c1861r.f7562p;
            if (i4 >= arrayList.size()) {
                p086W.AbstractC0805y.m1613h(c1861r.f7561o);
                c1861r.f7553C = true;
                return;
            }
            p161m0.C1860q c1860q = (p161m0.C1860q) arrayList.get(i4);
            if (!c1860q.f7549e) {
                c1860q.f7546b.m4433e(null);
                c1860q.f7547c.m4029y();
                c1860q.f7549e = true;
            }
            i4++;
        }
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: r */
    public final void mo2980r() {
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: u */
    public final synchronized void mo2981u(p076T.C0659B c0659b) {
        this.f7574A = c0659b;
    }

    /* renamed from: v */
    public final void m3839v() {
        p076T.AbstractC0677U c1999h0 = new p179q0.C1999h0(this.f7579w, this.f7580x, this.f7581y, mo2976h());
        if (this.f7582z) {
            c1999h0 = new p161m0.C1862s(c1999h0, 0);
        }
        m4039n(c1999h0);
    }
}
