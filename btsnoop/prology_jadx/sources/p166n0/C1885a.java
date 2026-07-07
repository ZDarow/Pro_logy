package p166n0;

/* renamed from: n0.a */
/* loaded from: classes.dex */
public final class C1885a implements p166n0.InterfaceC1893i {

    /* renamed from: l */
    public final p161m0.C1854k f7650l;

    /* renamed from: m */
    public final p086W.C0797q f7651m = new p086W.C0797q();

    /* renamed from: n */
    public final int f7652n;

    /* renamed from: o */
    public final int f7653o;

    /* renamed from: p */
    public final int f7654p;

    /* renamed from: q */
    public final int f7655q;

    /* renamed from: r */
    public long f7656r;

    /* renamed from: s */
    public p215y0.InterfaceC2387F f7657s;

    /* renamed from: t */
    public long f7658t;

    public C1885a(p161m0.C1854k c1854k) {
        this.f7650l = c1854k;
        this.f7652n = c1854k.f7511b;
        java.lang.String str = (java.lang.String) c1854k.f7513d.get("mode");
        str.getClass();
        if (p080U1.AbstractC0748a.m1380o(str, "AAC-hbr")) {
            this.f7653o = 13;
            this.f7654p = 3;
        } else {
            if (!p080U1.AbstractC0748a.m1380o(str, "AAC-lbr")) {
                throw new java.lang.UnsupportedOperationException("AAC mode not supported");
            }
            this.f7653o = 6;
            this.f7654p = 2;
        }
        this.f7655q = this.f7654p + this.f7653o;
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: b */
    public final void mo982b(long j4, long j5) {
        this.f7656r = j4;
        this.f7658t = j5;
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: c */
    public final void mo983c(p086W.C0798r c0798r, long j4, int i4, boolean z4) {
        this.f7657s.getClass();
        short m1556r = c0798r.m1556r();
        int i5 = m1556r / this.f7655q;
        long m1363K = p080U1.AbstractC0748a.m1363K(this.f7658t, j4, this.f7656r, this.f7652n);
        p086W.C0797q c0797q = this.f7651m;
        c0797q.m1524o(c0798r);
        int i6 = this.f7654p;
        int i7 = this.f7653o;
        if (i5 == 1) {
            int m1518i = c0797q.m1518i(i7);
            c0797q.m1529t(i6);
            this.f7657s.mo1405a(c0798r, c0798r.m1539a(), 0);
            if (z4) {
                this.f7657s.mo1406b(m1363K, 1, m1518i, 0, null);
                return;
            }
            return;
        }
        c0798r.m1538H((m1556r + 7) / 8);
        for (int i8 = 0; i8 < i5; i8++) {
            int m1518i2 = c0797q.m1518i(i7);
            c0797q.m1529t(i6);
            this.f7657s.mo1405a(c0798r, m1518i2, 0);
            this.f7657s.mo1406b(m1363K, 1, m1518i2, 0, null);
            m1363K += p086W.AbstractC0805y.m1600U(i5, 1000000L, this.f7652n, java.math.RoundingMode.FLOOR);
        }
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: d */
    public final void mo984d(p215y0.InterfaceC2405q interfaceC2405q, int i4) {
        p215y0.InterfaceC2387F mo640v = interfaceC2405q.mo640v(i4, 1);
        this.f7657s = mo640v;
        mo640v.mo1407c(this.f7650l.f7512c);
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: e */
    public final void mo985e(long j4) {
        this.f7656r = j4;
    }
}
