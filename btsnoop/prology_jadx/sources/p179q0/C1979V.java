package p179q0;

/* renamed from: q0.V */
/* loaded from: classes.dex */
public final class C1979V extends p179q0.AbstractC1984a {

    /* renamed from: A */
    public boolean f8058A;

    /* renamed from: B */
    public p094Y.InterfaceC0860C f8059B;

    /* renamed from: C */
    public p076T.C0659B f8060C;

    /* renamed from: s */
    public final p008B1.C0026d f8061s;

    /* renamed from: t */
    public final p009B2.C0067x f8062t;

    /* renamed from: u */
    public final p127f0.InterfaceC1376i f8063u;

    /* renamed from: v */
    public final p193t0.C2164b f8064v;

    /* renamed from: w */
    public final int f8065w;

    /* renamed from: x */
    public boolean f8066x = true;

    /* renamed from: y */
    public long f8067y = -9223372036854775807L;

    /* renamed from: z */
    public boolean f8068z;

    public C1979V(p076T.C0659B c0659b, p008B1.C0026d c0026d, p009B2.C0067x c0067x, p127f0.InterfaceC1376i interfaceC1376i, p193t0.C2164b c2164b, int i4) {
        this.f8060C = c0659b;
        this.f8061s = c0026d;
        this.f8062t = c0067x;
        this.f8063u = interfaceC1376i;
        this.f8064v = c2164b;
        this.f8065w = i4;
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: b */
    public final p179q0.InterfaceC1962D mo2975b(p179q0.C1964F c1964f, p197u0.C2218e c2218e, long j4) {
        p094Y.InterfaceC0870h mo104a = this.f8061s.mo104a();
        p094Y.InterfaceC0860C interfaceC0860C = this.f8059B;
        if (interfaceC0860C != null) {
            ((p094Y.C0875m) mo104a).mo1688j(interfaceC0860C);
        }
        p076T.C0711y c0711y = mo2976h().f2143b;
        c0711y.getClass();
        p086W.AbstractC0781a.m1422k(this.f8117r);
        android.support.v4.media.session.C1061t c1061t = new android.support.v4.media.session.C1061t((p215y0.InterfaceC2406r) this.f8062t.f219m);
        p127f0.C1372e c1372e = new p127f0.C1372e(this.f8114o.f5650c, 0, c1964f);
        p127f0.C1372e m4031a = m4031a(c1964f);
        long m1592M = p086W.AbstractC0805y.m1592M(c0711y.f2454f);
        return new p179q0.C1977T(c0711y.f2449a, mo104a, c1061t, this.f8063u, c1372e, this.f8064v, m4031a, this, c2218e, this.f8065w, m1592M);
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: h */
    public final synchronized p076T.C0659B mo2976h() {
        return this.f8060C;
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: j */
    public final void mo2977j() {
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: m */
    public final void mo2978m(p094Y.InterfaceC0860C interfaceC0860C) {
        this.f8059B = interfaceC0860C;
        android.os.Looper myLooper = android.os.Looper.myLooper();
        myLooper.getClass();
        p107b0.C1177l c1177l = this.f8117r;
        p086W.AbstractC0781a.m1422k(c1177l);
        p127f0.InterfaceC1376i interfaceC1376i = this.f8063u;
        interfaceC1376i.mo3131b(myLooper, c1177l);
        interfaceC1376i.m3134c();
        m3999v();
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: o */
    public final void mo2979o(p179q0.InterfaceC1962D interfaceC1962D) {
        p179q0.C1977T c1977t = (p179q0.C1977T) interfaceC1962D;
        if (c1977t.f8020G) {
            for (p179q0.C1983Z c1983z : c1977t.f8017D) {
                c1983z.m4012g();
                p043K2.C0339o c0339o = c1983z.f8092h;
                if (c0339o != null) {
                    c0339o.m752K(c1983z.f8089e);
                    c1983z.f8092h = null;
                    c1983z.f8091g = null;
                }
            }
        }
        c1977t.f8048v.m4433e(c1977t);
        c1977t.f8014A.removeCallbacksAndMessages(null);
        c1977t.f8015B = null;
        c1977t.f8037X = true;
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: r */
    public final void mo2980r() {
        this.f8063u.release();
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: u */
    public final synchronized void mo2981u(p076T.C0659B c0659b) {
        this.f8060C = c0659b;
    }

    /* renamed from: v */
    public final void m3999v() {
        p076T.AbstractC0677U c1999h0 = new p179q0.C1999h0(this.f8067y, this.f8068z, this.f8058A, mo2976h());
        if (this.f8066x) {
            c1999h0 = new p161m0.C1862s(c1999h0, 1);
        }
        m4039n(c1999h0);
    }

    /* renamed from: w */
    public final void m4000w(long j4, boolean z4, boolean z5) {
        if (j4 == -9223372036854775807L) {
            j4 = this.f8067y;
        }
        if (!this.f8066x && this.f8067y == j4 && this.f8068z == z4 && this.f8058A == z5) {
            return;
        }
        this.f8067y = j4;
        this.f8068z = z4;
        this.f8058A = z5;
        this.f8066x = false;
        m3999v();
    }
}
