package p166n0;

/* renamed from: n0.b */
/* loaded from: classes.dex */
public final class C1886b implements p166n0.InterfaceC1893i {

    /* renamed from: l */
    public final p161m0.C1854k f7659l;

    /* renamed from: n */
    public p215y0.InterfaceC2387F f7661n;

    /* renamed from: o */
    public int f7662o;

    /* renamed from: q */
    public long f7664q;

    /* renamed from: r */
    public long f7665r;

    /* renamed from: m */
    public final p086W.C0797q f7660m = new p086W.C0797q();

    /* renamed from: p */
    public long f7663p = -9223372036854775807L;

    public C1886b(p161m0.C1854k c1854k) {
        this.f7659l = c1854k;
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: b */
    public final void mo982b(long j4, long j5) {
        this.f7663p = j4;
        this.f7665r = j5;
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: c */
    public final void mo983c(p086W.C0798r c0798r, long j4, int i4, boolean z4) {
        int m1559u = c0798r.m1559u() & 3;
        int m1559u2 = c0798r.m1559u() & 255;
        long m1363K = p080U1.AbstractC0748a.m1363K(this.f7665r, j4, this.f7663p, this.f7659l.f7511b);
        if (m1559u != 0) {
            if (m1559u == 1 || m1559u == 2) {
                int i5 = this.f7662o;
                if (i5 > 0) {
                    p215y0.InterfaceC2387F interfaceC2387F = this.f7661n;
                    int i6 = p086W.AbstractC0805y.f2801a;
                    interfaceC2387F.mo1406b(this.f7664q, 1, i5, 0, null);
                    this.f7662o = 0;
                }
            } else if (m1559u != 3) {
                throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(m1559u));
            }
            int m1539a = c0798r.m1539a();
            p215y0.InterfaceC2387F interfaceC2387F2 = this.f7661n;
            interfaceC2387F2.getClass();
            interfaceC2387F2.mo1405a(c0798r, m1539a, 0);
            int i7 = this.f7662o + m1539a;
            this.f7662o = i7;
            this.f7664q = m1363K;
            if (z4 && m1559u == 3) {
                p215y0.InterfaceC2387F interfaceC2387F3 = this.f7661n;
                int i8 = p086W.AbstractC0805y.f2801a;
                interfaceC2387F3.mo1406b(m1363K, 1, i7, 0, null);
                this.f7662o = 0;
                return;
            }
            return;
        }
        int i9 = this.f7662o;
        if (i9 > 0) {
            p215y0.InterfaceC2387F interfaceC2387F4 = this.f7661n;
            int i10 = p086W.AbstractC0805y.f2801a;
            interfaceC2387F4.mo1406b(this.f7664q, 1, i9, 0, null);
            this.f7662o = 0;
        }
        if (m1559u2 == 1) {
            int m1539a2 = c0798r.m1539a();
            p215y0.InterfaceC2387F interfaceC2387F5 = this.f7661n;
            interfaceC2387F5.getClass();
            interfaceC2387F5.mo1405a(c0798r, m1539a2, 0);
            p215y0.InterfaceC2387F interfaceC2387F6 = this.f7661n;
            int i11 = p086W.AbstractC0805y.f2801a;
            interfaceC2387F6.mo1406b(m1363K, 1, m1539a2, 0, null);
            return;
        }
        byte[] bArr = c0798r.f2786a;
        p086W.C0797q c0797q = this.f7660m;
        c0797q.getClass();
        c0797q.m1525p(bArr, bArr.length);
        c0797q.m1530u(2);
        for (int i12 = 0; i12 < m1559u2; i12++) {
            p215y0.C2391c m4620o = p215y0.AbstractC2390b.m4620o(c0797q);
            p215y0.InterfaceC2387F interfaceC2387F7 = this.f7661n;
            interfaceC2387F7.getClass();
            int i13 = m4620o.f9401d;
            interfaceC2387F7.mo1405a(c0798r, i13, 0);
            p215y0.InterfaceC2387F interfaceC2387F8 = this.f7661n;
            int i14 = p086W.AbstractC0805y.f2801a;
            interfaceC2387F8.mo1406b(m1363K, 1, m4620o.f9401d, 0, null);
            m1363K += (m4620o.f9402e / m4620o.f9399b) * 1000000;
            c0797q.m1530u(i13);
        }
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: d */
    public final void mo984d(p215y0.InterfaceC2405q interfaceC2405q, int i4) {
        p215y0.InterfaceC2387F mo640v = interfaceC2405q.mo640v(i4, 1);
        this.f7661n = mo640v;
        mo640v.mo1407c(this.f7659l.f7512c);
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: e */
    public final void mo985e(long j4) {
        p086W.AbstractC0781a.m1421j(this.f7663p == -9223372036854775807L);
        this.f7663p = j4;
    }
}
