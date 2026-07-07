package p166n0;

/* renamed from: n0.j */
/* loaded from: classes.dex */
public final class C1894j implements p166n0.InterfaceC1893i {

    /* renamed from: l */
    public final p161m0.C1854k f7720l;

    /* renamed from: m */
    public p215y0.InterfaceC2387F f7721m;

    /* renamed from: n */
    public long f7722n = -9223372036854775807L;

    /* renamed from: o */
    public int f7723o = -1;

    /* renamed from: p */
    public int f7724p = -1;

    /* renamed from: q */
    public long f7725q = -9223372036854775807L;

    /* renamed from: r */
    public long f7726r = 0;

    /* renamed from: s */
    public boolean f7727s;

    /* renamed from: t */
    public boolean f7728t;

    /* renamed from: u */
    public boolean f7729u;

    public C1894j(p161m0.C1854k c1854k) {
        this.f7720l = c1854k;
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: b */
    public final void mo982b(long j4, long j5) {
        this.f7722n = j4;
        this.f7724p = -1;
        this.f7726r = j5;
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: c */
    public final void mo983c(p086W.C0798r c0798r, long j4, int i4, boolean z4) {
        p086W.AbstractC0781a.m1422k(this.f7721m);
        int m1559u = c0798r.m1559u();
        if ((m1559u & 16) == 16 && (m1559u & 7) == 0) {
            if (this.f7727s && this.f7724p > 0) {
                p215y0.InterfaceC2387F interfaceC2387F = this.f7721m;
                interfaceC2387F.getClass();
                interfaceC2387F.mo1406b(this.f7725q, this.f7728t ? 1 : 0, this.f7724p, 0, null);
                this.f7724p = -1;
                this.f7725q = -9223372036854775807L;
                this.f7727s = false;
            }
            this.f7727s = true;
        } else {
            if (!this.f7727s) {
                p086W.AbstractC0781a.m1410A("RtpVP8Reader", "RTP packet is not the start of a new VP8 partition, skipping.");
                return;
            }
            int m3811a = p161m0.C1852i.m3811a(this.f7723o);
            if (i4 < m3811a) {
                int i5 = p086W.AbstractC0805y.f2801a;
                java.util.Locale locale = java.util.Locale.US;
                p086W.AbstractC0781a.m1410A("RtpVP8Reader", "Received RTP packet with unexpected sequence number. Expected: " + m3811a + "; received: " + i4 + ". Dropping packet.");
                return;
            }
        }
        if ((m1559u & 128) != 0) {
            int m1559u2 = c0798r.m1559u();
            if ((m1559u2 & 128) != 0 && (c0798r.m1559u() & 128) != 0) {
                c0798r.m1538H(1);
            }
            if ((m1559u2 & 64) != 0) {
                c0798r.m1538H(1);
            }
            if ((m1559u2 & 32) != 0 || (16 & m1559u2) != 0) {
                c0798r.m1538H(1);
            }
        }
        if (this.f7724p == -1 && this.f7727s) {
            this.f7728t = (c0798r.m1543e() & 1) == 0;
        }
        if (!this.f7729u) {
            int i6 = c0798r.f2787b;
            c0798r.m1537G(i6 + 6);
            int m1552n = c0798r.m1552n() & 16383;
            int m1552n2 = c0798r.m1552n() & 16383;
            c0798r.m1537G(i6);
            p076T.C0702p c0702p = this.f7720l.f7512c;
            if (m1552n != c0702p.f2414s || m1552n2 != c0702p.f2415t) {
                p215y0.InterfaceC2387F interfaceC2387F2 = this.f7721m;
                p076T.C0701o m1295a = c0702p.m1295a();
                m1295a.f2376r = m1552n;
                m1295a.f2377s = m1552n2;
                p009B2.AbstractC0051h.m158q(m1295a, interfaceC2387F2);
            }
            this.f7729u = true;
        }
        int m1539a = c0798r.m1539a();
        this.f7721m.mo1405a(c0798r, m1539a, 0);
        int i7 = this.f7724p;
        if (i7 == -1) {
            this.f7724p = m1539a;
        } else {
            this.f7724p = i7 + m1539a;
        }
        this.f7725q = p080U1.AbstractC0748a.m1363K(this.f7726r, j4, this.f7722n, 90000);
        if (z4) {
            p215y0.InterfaceC2387F interfaceC2387F3 = this.f7721m;
            interfaceC2387F3.getClass();
            interfaceC2387F3.mo1406b(this.f7725q, this.f7728t ? 1 : 0, this.f7724p, 0, null);
            this.f7724p = -1;
            this.f7725q = -9223372036854775807L;
            this.f7727s = false;
        }
        this.f7723o = i4;
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: d */
    public final void mo984d(p215y0.InterfaceC2405q interfaceC2405q, int i4) {
        p215y0.InterfaceC2387F mo640v = interfaceC2405q.mo640v(i4, 2);
        this.f7721m = mo640v;
        mo640v.mo1407c(this.f7720l.f7512c);
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: e */
    public final void mo985e(long j4) {
        p086W.AbstractC0781a.m1421j(this.f7722n == -9223372036854775807L);
        this.f7722n = j4;
    }
}
