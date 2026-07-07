package p166n0;

/* renamed from: n0.f */
/* loaded from: classes.dex */
public final class C1890f implements p166n0.InterfaceC1893i {

    /* renamed from: l */
    public final p161m0.C1854k f7698l;

    /* renamed from: m */
    public final int f7699m;

    /* renamed from: n */
    public p215y0.InterfaceC2387F f7700n;

    /* renamed from: o */
    public long f7701o;

    /* renamed from: p */
    public int f7702p;

    /* renamed from: q */
    public int f7703q;

    /* renamed from: r */
    public long f7704r;

    /* renamed from: s */
    public long f7705s;

    public C1890f(p161m0.C1854k c1854k) {
        this.f7698l = c1854k;
        try {
            this.f7699m = m3876a(c1854k.f7513d);
            this.f7701o = -9223372036854775807L;
            this.f7702p = -1;
            this.f7703q = 0;
            this.f7704r = 0L;
            this.f7705s = -9223372036854775807L;
        } catch (p076T.C0666I e4) {
            throw new java.lang.IllegalArgumentException(e4);
        }
    }

    /* renamed from: a */
    public static int m3876a(p129f2.C1425h0 c1425h0) {
        java.lang.String str = (java.lang.String) c1425h0.get("config");
        int i4 = 0;
        i4 = 0;
        if (str != null && str.length() % 2 == 0) {
            byte[] m1625t = p086W.AbstractC0805y.m1625t(str);
            p086W.C0797q c0797q = new p086W.C0797q(m1625t, m1625t.length);
            int m1518i = c0797q.m1518i(1);
            if (m1518i != 0) {
                throw new p076T.C0666I(p009B2.AbstractC0051h.m152k("unsupported audio mux version: ", m1518i), null, true, 0);
            }
            p086W.AbstractC0781a.m1415d("Only supports allStreamsSameTimeFraming.", c0797q.m1518i(1) == 1);
            int m1518i2 = c0797q.m1518i(6);
            p086W.AbstractC0781a.m1415d("Only suppors one program.", c0797q.m1518i(4) == 0);
            p086W.AbstractC0781a.m1415d("Only suppors one layer.", c0797q.m1518i(3) == 0);
            i4 = m1518i2;
        }
        return i4 + 1;
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: b */
    public final void mo982b(long j4, long j5) {
        this.f7701o = j4;
        this.f7703q = 0;
        this.f7704r = j5;
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: c */
    public final void mo983c(p086W.C0798r c0798r, long j4, int i4, boolean z4) {
        p086W.AbstractC0781a.m1422k(this.f7700n);
        int m3811a = p161m0.C1852i.m3811a(this.f7702p);
        if (this.f7703q > 0 && m3811a < i4) {
            p215y0.InterfaceC2387F interfaceC2387F = this.f7700n;
            interfaceC2387F.getClass();
            interfaceC2387F.mo1406b(this.f7705s, 1, this.f7703q, 0, null);
            this.f7703q = 0;
            this.f7705s = -9223372036854775807L;
        }
        for (int i5 = 0; i5 < this.f7699m; i5++) {
            int i6 = 0;
            while (c0798r.f2787b < c0798r.f2788c) {
                int m1559u = c0798r.m1559u();
                i6 += m1559u;
                if (m1559u != 255) {
                    break;
                }
            }
            this.f7700n.mo1405a(c0798r, i6, 0);
            this.f7703q += i6;
        }
        this.f7705s = p080U1.AbstractC0748a.m1363K(this.f7704r, j4, this.f7701o, this.f7698l.f7511b);
        if (z4) {
            p215y0.InterfaceC2387F interfaceC2387F2 = this.f7700n;
            interfaceC2387F2.getClass();
            interfaceC2387F2.mo1406b(this.f7705s, 1, this.f7703q, 0, null);
            this.f7703q = 0;
            this.f7705s = -9223372036854775807L;
        }
        this.f7702p = i4;
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: d */
    public final void mo984d(p215y0.InterfaceC2405q interfaceC2405q, int i4) {
        p215y0.InterfaceC2387F mo640v = interfaceC2405q.mo640v(i4, 2);
        this.f7700n = mo640v;
        int i5 = p086W.AbstractC0805y.f2801a;
        mo640v.mo1407c(this.f7698l.f7512c);
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: e */
    public final void mo985e(long j4) {
        p086W.AbstractC0781a.m1421j(this.f7701o == -9223372036854775807L);
        this.f7701o = j4;
    }
}
