package p166n0;

/* renamed from: n0.c */
/* loaded from: classes.dex */
public final class C1887c implements p166n0.InterfaceC1893i {

    /* renamed from: s */
    public static final int[] f7666s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: t */
    public static final int[] f7667t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: l */
    public final p161m0.C1854k f7668l;

    /* renamed from: m */
    public final boolean f7669m;

    /* renamed from: n */
    public final int f7670n;

    /* renamed from: o */
    public p215y0.InterfaceC2387F f7671o;

    /* renamed from: p */
    public long f7672p;

    /* renamed from: q */
    public long f7673q;

    /* renamed from: r */
    public int f7674r;

    public C1887c(p161m0.C1854k c1854k) {
        this.f7668l = c1854k;
        java.lang.String str = c1854k.f7512c.f2408m;
        str.getClass();
        this.f7669m = "audio/amr-wb".equals(str);
        this.f7670n = c1854k.f7511b;
        this.f7672p = -9223372036854775807L;
        this.f7674r = -1;
        this.f7673q = 0L;
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: b */
    public final void mo982b(long j4, long j5) {
        this.f7672p = j4;
        this.f7673q = j5;
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: c */
    public final void mo983c(p086W.C0798r c0798r, long j4, int i4, boolean z4) {
        int m3811a;
        p086W.AbstractC0781a.m1422k(this.f7671o);
        int i5 = this.f7674r;
        if (i5 != -1 && i4 != (m3811a = p161m0.C1852i.m3811a(i5))) {
            int i6 = p086W.AbstractC0805y.f2801a;
            java.util.Locale locale = java.util.Locale.US;
            p086W.AbstractC0781a.m1410A("RtpAmrReader", "Received RTP packet with unexpected sequence number. Expected: " + m3811a + "; received: " + i4 + ".");
        }
        c0798r.m1538H(1);
        int m1543e = (c0798r.m1543e() >> 3) & 15;
        boolean z5 = (m1543e >= 0 && m1543e <= 8) || m1543e == 15;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Illegal AMR ");
        boolean z6 = this.f7669m;
        sb.append(z6 ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(m1543e);
        p086W.AbstractC0781a.m1415d(sb.toString(), z5);
        int i7 = z6 ? f7667t[m1543e] : f7666s[m1543e];
        int m1539a = c0798r.m1539a();
        p086W.AbstractC0781a.m1415d("compound payload not supported currently", m1539a == i7);
        this.f7671o.mo1405a(c0798r, m1539a, 0);
        this.f7671o.mo1406b(p080U1.AbstractC0748a.m1363K(this.f7673q, j4, this.f7672p, this.f7670n), 1, m1539a, 0, null);
        this.f7674r = i4;
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: d */
    public final void mo984d(p215y0.InterfaceC2405q interfaceC2405q, int i4) {
        p215y0.InterfaceC2387F mo640v = interfaceC2405q.mo640v(i4, 1);
        this.f7671o = mo640v;
        mo640v.mo1407c(this.f7668l.f7512c);
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: e */
    public final void mo985e(long j4) {
        this.f7672p = j4;
    }
}
