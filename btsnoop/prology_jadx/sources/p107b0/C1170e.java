package p107b0;

/* renamed from: b0.e */
/* loaded from: classes.dex */
public final class C1170e implements p076T.InterfaceC0670M, p179q0.InterfaceC1968J, p127f0.InterfaceC1373f {

    /* renamed from: l */
    public final p086W.C0800t f4497l;

    /* renamed from: m */
    public final p076T.C0675S f4498m;

    /* renamed from: n */
    public final p076T.C0676T f4499n;

    /* renamed from: o */
    public final p013C2.C0139d f4500o;

    /* renamed from: p */
    public final android.util.SparseArray f4501p;

    /* renamed from: q */
    public p086W.C0791k f4502q;

    /* renamed from: r */
    public p076T.InterfaceC0672O f4503r;

    /* renamed from: s */
    public p086W.C0802v f4504s;

    /* renamed from: t */
    public boolean f4505t;

    public C1170e(p086W.C0800t c0800t) {
        c0800t.getClass();
        this.f4497l = c0800t;
        int i4 = p086W.AbstractC0805y.f2801a;
        android.os.Looper myLooper = android.os.Looper.myLooper();
        this.f4502q = new p086W.C0791k(myLooper == null ? android.os.Looper.getMainLooper() : myLooper, c0800t, new p107b0.C1168c(7));
        p076T.C0675S c0675s = new p076T.C0675S();
        this.f4498m = c0675s;
        this.f4499n = new p076T.C0676T();
        this.f4500o = new p013C2.C0139d(c0675s);
        this.f4501p = new android.util.SparseArray();
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: A */
    public final void mo1205A(int i4, boolean z4) {
        m2742K(m2744a(), 5, new p107b0.C1168c(5));
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: B */
    public final void mo1206B(float f4) {
        m2742K(m2741J(), 22, new p011C.C0111c(22));
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: C */
    public final void mo1207C(p076T.C0669L c0669l) {
        m2742K(m2744a(), 13, new p011C.C0111c(18));
    }

    @Override // p179q0.InterfaceC1968J
    /* renamed from: D */
    public final void mo683D(int i4, p179q0.C1964F c1964f, p179q0.C2019x c2019x, p166n0.C1891g c1891g) {
        m2742K(m2740I(i4, c1964f), 1001, new p107b0.C1168c(26));
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: E */
    public final void mo1208E(boolean z4) {
        m2742K(m2744a(), 7, new p011C.C0111c(29));
    }

    /* renamed from: F */
    public final p107b0.C1166a m2738F(p076T.AbstractC0677U abstractC0677U, int i4, p179q0.C1964F c1964f) {
        p179q0.C1964F c1964f2 = abstractC0677U.m1256p() ? null : c1964f;
        this.f4497l.getClass();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        boolean z4 = abstractC0677U.equals(((p102a0.C0944H) this.f4503r).m1857t()) && i4 == ((p102a0.C0944H) this.f4503r).m1854q();
        long j4 = 0;
        if (c1964f2 == null || !c1964f2.m3968b()) {
            if (z4) {
                p102a0.C0944H c0944h = (p102a0.C0944H) this.f4503r;
                c0944h.m1848U();
                j4 = c0944h.m1851n(c0944h.f3355e0);
            } else if (!abstractC0677U.m1256p()) {
                j4 = p086W.AbstractC0805y.m1605Z(abstractC0677U.mo1235m(i4, this.f4499n, 0L).f2243l);
            }
        } else if (z4 && ((p102a0.C0944H) this.f4503r).m1852o() == c1964f2.f7961b && ((p102a0.C0944H) this.f4503r).m1853p() == c1964f2.f7962c) {
            j4 = ((p102a0.C0944H) this.f4503r).m1855r();
        }
        p179q0.C1964F c1964f3 = (p179q0.C1964F) this.f4500o.f378d;
        p076T.AbstractC0677U m1857t = ((p102a0.C0944H) this.f4503r).m1857t();
        int m1854q = ((p102a0.C0944H) this.f4503r).m1854q();
        long m1855r = ((p102a0.C0944H) this.f4503r).m1855r();
        p102a0.C0944H c0944h2 = (p102a0.C0944H) this.f4503r;
        c0944h2.m1848U();
        return new p107b0.C1166a(elapsedRealtime, abstractC0677U, i4, c1964f2, j4, m1857t, m1854q, c1964f3, m1855r, p086W.AbstractC0805y.m1605Z(c0944h2.f3355e0.f3596r));
    }

    /* renamed from: G */
    public final p107b0.C1166a m2739G(p179q0.C1964F c1964f) {
        this.f4503r.getClass();
        p076T.AbstractC0677U abstractC0677U = c1964f == null ? null : (p076T.AbstractC0677U) ((p129f2.C1425h0) this.f4500o.f377c).get(c1964f);
        if (c1964f != null && abstractC0677U != null) {
            return m2738F(abstractC0677U, abstractC0677U.mo1251g(c1964f.f7960a, this.f4498m).f2225c, c1964f);
        }
        int m1854q = ((p102a0.C0944H) this.f4503r).m1854q();
        p076T.AbstractC0677U m1857t = ((p102a0.C0944H) this.f4503r).m1857t();
        if (m1854q >= m1857t.mo1236o()) {
            m1857t = p076T.AbstractC0677U.f2248a;
        }
        return m2738F(m1857t, m1854q, null);
    }

    @Override // p179q0.InterfaceC1968J
    /* renamed from: H */
    public final void mo684H(int i4, p179q0.C1964F c1964f, p179q0.C2019x c2019x, p166n0.C1891g c1891g) {
        m2742K(m2740I(i4, c1964f), 1002, new p107b0.C1168c(25));
    }

    /* renamed from: I */
    public final p107b0.C1166a m2740I(int i4, p179q0.C1964F c1964f) {
        this.f4503r.getClass();
        if (c1964f != null) {
            return ((p076T.AbstractC0677U) ((p129f2.C1425h0) this.f4500o.f377c).get(c1964f)) != null ? m2739G(c1964f) : m2738F(p076T.AbstractC0677U.f2248a, i4, c1964f);
        }
        p076T.AbstractC0677U m1857t = ((p102a0.C0944H) this.f4503r).m1857t();
        if (i4 >= m1857t.mo1236o()) {
            m1857t = p076T.AbstractC0677U.f2248a;
        }
        return m2738F(m1857t, i4, null);
    }

    /* renamed from: J */
    public final p107b0.C1166a m2741J() {
        return m2739G((p179q0.C1964F) this.f4500o.f380f);
    }

    /* renamed from: K */
    public final void m2742K(p107b0.C1166a c1166a, int i4, p086W.InterfaceC0788h interfaceC0788h) {
        this.f4501p.put(i4, c1166a);
        this.f4502q.m1444e(i4, interfaceC0788h);
    }

    @Override // p179q0.InterfaceC1968J
    /* renamed from: L */
    public final void mo685L(int i4, p179q0.C1964F c1964f, p179q0.C2019x c2019x, p166n0.C1891g c1891g, java.io.IOException iOException, boolean z4) {
        p107b0.C1166a m2740I = m2740I(i4, c1964f);
        m2742K(m2740I, 1003, new p009B2.C0067x(m2740I, c2019x, c1891g, iOException, z4));
    }

    /* renamed from: M */
    public final void m2743M(p076T.InterfaceC0672O interfaceC0672O, android.os.Looper looper) {
        p086W.AbstractC0781a.m1421j(this.f4503r == null || ((p129f2.AbstractC1393I) this.f4500o.f376b).isEmpty());
        interfaceC0672O.getClass();
        this.f4503r = interfaceC0672O;
        this.f4504s = this.f4497l.m1565a(looper, null);
        p086W.C0791k c0791k = this.f4502q;
        this.f4502q = new p086W.C0791k(c0791k.f2759d, looper, c0791k.f2756a, new p107b0.C1167b(0, this, interfaceC0672O), c0791k.f2764i);
    }

    /* renamed from: a */
    public final p107b0.C1166a m2744a() {
        return m2739G((p179q0.C1964F) this.f4500o.f378d);
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: b */
    public final void mo1209b(int i4) {
        m2742K(m2744a(), 8, new p107b0.C1168c(16));
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: c */
    public final void mo1210c(int i4) {
        m2742K(m2744a(), 6, new p107b0.C1168c(1));
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: d */
    public final void mo1211d(p193t0.C2173k c2173k) {
        p107b0.C1166a m2744a = m2744a();
        m2742K(m2744a, 19, new p107b0.C1169d(m2744a, c2173k));
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: e */
    public final void mo1212e(int i4, p076T.C0671N c0671n, p076T.C0671N c0671n2) {
        if (i4 == 1) {
            this.f4505t = false;
        }
        p076T.InterfaceC0672O interfaceC0672O = this.f4503r;
        interfaceC0672O.getClass();
        p013C2.C0139d c0139d = this.f4500o;
        c0139d.f378d = p013C2.C0139d.m476e(interfaceC0672O, (p129f2.AbstractC1393I) c0139d.f376b, (p179q0.C1964F) c0139d.f379e, (p076T.C0675S) c0139d.f375a);
        p107b0.C1166a m2744a = m2744a();
        m2742K(m2744a, 11, new p102a0.C1000y(m2744a, i4, c0671n, c0671n2));
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: f */
    public final void mo1213f(int i4) {
        m2742K(m2744a(), 4, new p107b0.C1168c(10));
    }

    @Override // p179q0.InterfaceC1968J
    /* renamed from: g */
    public final void mo691g(int i4, p179q0.C1964F c1964f, p179q0.C2019x c2019x, p166n0.C1891g c1891g) {
        m2742K(m2740I(i4, c1964f), 1000, new p107b0.C1169d(4));
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: h */
    public final void mo1214h(int i4) {
        p076T.InterfaceC0672O interfaceC0672O = this.f4503r;
        interfaceC0672O.getClass();
        p013C2.C0139d c0139d = this.f4500o;
        c0139d.f378d = p013C2.C0139d.m476e(interfaceC0672O, (p129f2.AbstractC1393I) c0139d.f376b, (p179q0.C1964F) c0139d.f379e, (p076T.C0675S) c0139d.f375a);
        c0139d.m483j(((p102a0.C0944H) interfaceC0672O).m1857t());
        m2742K(m2744a(), 0, new p011C.C0111c(19));
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: i */
    public final void mo1215i(p076T.C0662E c0662e) {
        m2742K(m2744a(), 14, new p107b0.C1168c(24));
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: j */
    public final void mo1216j(p076T.C0691e c0691e) {
        m2742K(m2741J(), 20, new p011C.C0111c(25));
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: k */
    public final void mo1217k(p082V.C0758c c0758c) {
        m2742K(m2744a(), 27, new p107b0.C1168c(15));
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: l */
    public final void mo1218l(p076T.AbstractC0667J abstractC0667J) {
        p179q0.C1964F c1964f;
        m2742K((!(abstractC0667J instanceof p102a0.C0986m) || (c1964f = ((p102a0.C0986m) abstractC0667J).f3669s) == null) ? m2744a() : m2739G(c1964f), 10, new p107b0.C1168c(4));
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: m */
    public final void mo1219m(p076T.C0690d0 c0690d0) {
        p107b0.C1166a m2741J = m2741J();
        m2742K(m2741J, 25, new p102a0.C0940D(m2741J, c0690d0));
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: n */
    public final void mo1220n(p076T.C0684a0 c0684a0) {
        m2742K(m2744a(), 2, new p011C.C0111c(27));
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: o */
    public final void mo1221o(boolean z4) {
        m2742K(m2744a(), 9, new p107b0.C1168c(20));
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: p */
    public final void mo1222p(p076T.C0668K c0668k) {
        m2742K(m2744a(), 12, new p011C.C0111c(17));
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: q */
    public final void mo1223q(p076T.C0659B c0659b, int i4) {
        m2742K(m2744a(), 1, new p011C.C0111c(20));
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: r */
    public final void mo1224r(int i4, int i5) {
        m2742K(m2741J(), 24, new p107b0.C1168c(21));
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: s */
    public final void mo1225s(boolean z4) {
        m2742K(m2744a(), 3, new p107b0.C1169d(2));
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: t */
    public final void mo1226t(p076T.AbstractC0667J abstractC0667J) {
        p179q0.C1964F c1964f;
        p107b0.C1166a m2744a = (!(abstractC0667J instanceof p102a0.C0986m) || (c1964f = ((p102a0.C0986m) abstractC0667J).f3669s) == null) ? m2744a() : m2739G(c1964f);
        m2742K(m2744a, 10, new p009B2.C0067x(m2744a, (java.lang.Object) abstractC0667J, 22));
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: u */
    public final void mo1227u(boolean z4) {
        m2742K(m2741J(), 23, new p011C.C0111c(21));
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: v */
    public final void mo1228v(p076T.C0664G c0664g) {
        m2742K(m2744a(), 28, new p011C.C0111c(26));
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: w */
    public final void mo1229w(java.util.List list) {
        m2742K(m2744a(), 27, new p107b0.C1168c(6));
    }

    @Override // p179q0.InterfaceC1968J
    /* renamed from: x */
    public final void mo704x(int i4, p179q0.C1964F c1964f, p166n0.C1891g c1891g) {
        m2742K(m2740I(i4, c1964f), 1005, new p107b0.C1168c(27));
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: y */
    public final void mo1230y(int i4, boolean z4) {
        m2742K(m2744a(), -1, new p011C.C0111c(24));
    }

    @Override // p179q0.InterfaceC1968J
    /* renamed from: z */
    public final void mo705z(int i4, p179q0.C1964F c1964f, p166n0.C1891g c1891g) {
        p107b0.C1166a m2740I = m2740I(i4, c1964f);
        m2742K(m2740I, 1004, new p107b0.C1167b(1, m2740I, c1891g));
    }
}
