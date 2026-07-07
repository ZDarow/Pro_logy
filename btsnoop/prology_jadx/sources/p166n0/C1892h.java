package p166n0;

/* renamed from: n0.h */
/* loaded from: classes.dex */
public final class C1892h implements p166n0.InterfaceC1893i {

    /* renamed from: l */
    public final p161m0.C1854k f7713l;

    /* renamed from: m */
    public p215y0.InterfaceC2387F f7714m;

    /* renamed from: o */
    public long f7716o;

    /* renamed from: q */
    public boolean f7718q;

    /* renamed from: r */
    public boolean f7719r;

    /* renamed from: n */
    public long f7715n = -1;

    /* renamed from: p */
    public int f7717p = -1;

    public C1892h(p161m0.C1854k c1854k) {
        this.f7713l = c1854k;
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: b */
    public final void mo982b(long j4, long j5) {
        this.f7715n = j4;
        this.f7716o = j5;
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: c */
    public final void mo983c(p086W.C0798r c0798r, long j4, int i4, boolean z4) {
        p086W.AbstractC0781a.m1422k(this.f7714m);
        if (!this.f7718q) {
            int i5 = c0798r.f2787b;
            p086W.AbstractC0781a.m1415d("ID Header has insufficient data", c0798r.f2788c > 18);
            p086W.AbstractC0781a.m1415d("ID Header missing", c0798r.m1557s(8, p124e2.AbstractC1356d.f5630c).equals("OpusHead"));
            p086W.AbstractC0781a.m1415d("version number must always be 1", c0798r.m1559u() == 1);
            c0798r.m1537G(i5);
            java.util.ArrayList m4608c = p215y0.AbstractC2390b.m4608c(c0798r.f2786a);
            p076T.C0701o m1295a = this.f7713l.f7512c.m1295a();
            m1295a.f2373o = m4608c;
            p009B2.AbstractC0051h.m158q(m1295a, this.f7714m);
            this.f7718q = true;
        } else if (this.f7719r) {
            int m3811a = p161m0.C1852i.m3811a(this.f7717p);
            if (i4 != m3811a) {
                int i6 = p086W.AbstractC0805y.f2801a;
                java.util.Locale locale = java.util.Locale.US;
                p086W.AbstractC0781a.m1410A("RtpOpusReader", "Received RTP packet with unexpected sequence number. Expected: " + m3811a + "; received: " + i4 + ".");
            }
            int m1539a = c0798r.m1539a();
            this.f7714m.mo1405a(c0798r, m1539a, 0);
            this.f7714m.mo1406b(p080U1.AbstractC0748a.m1363K(this.f7716o, j4, this.f7715n, 48000), 1, m1539a, 0, null);
        } else {
            p086W.AbstractC0781a.m1415d("Comment Header has insufficient data", c0798r.f2788c >= 8);
            p086W.AbstractC0781a.m1415d("Comment Header should follow ID Header", c0798r.m1557s(8, p124e2.AbstractC1356d.f5630c).equals("OpusTags"));
            this.f7719r = true;
        }
        this.f7717p = i4;
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: d */
    public final void mo984d(p215y0.InterfaceC2405q interfaceC2405q, int i4) {
        p215y0.InterfaceC2387F mo640v = interfaceC2405q.mo640v(i4, 1);
        this.f7714m = mo640v;
        mo640v.mo1407c(this.f7713l.f7512c);
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: e */
    public final void mo985e(long j4) {
        this.f7715n = j4;
    }
}
