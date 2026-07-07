package p151k0;

/* renamed from: k0.b */
/* loaded from: classes.dex */
public final class C1752b extends p102a0.AbstractC0970e implements android.os.Handler.Callback {

    /* renamed from: C */
    public final p151k0.C1751a f7189C;

    /* renamed from: D */
    public final p102a0.SurfaceHolderCallbackC0941E f7190D;

    /* renamed from: E */
    public final android.os.Handler f7191E;

    /* renamed from: F */
    public final p032H0.C0244a f7192F;

    /* renamed from: G */
    public p176p1.AbstractC1949a f7193G;

    /* renamed from: H */
    public boolean f7194H;

    /* renamed from: I */
    public boolean f7195I;

    /* renamed from: J */
    public long f7196J;

    /* renamed from: K */
    public p076T.C0664G f7197K;

    /* renamed from: L */
    public long f7198L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v3, types: [Z.f, H0.a] */
    public C1752b(p102a0.SurfaceHolderCallbackC0941E surfaceHolderCallbackC0941E, android.os.Looper looper) {
        super(5);
        p151k0.C1751a c1751a = p151k0.C1751a.f7188a;
        this.f7190D = surfaceHolderCallbackC0941E;
        this.f7191E = looper == null ? null : new android.os.Handler(looper, this);
        this.f7189C = c1751a;
        this.f7192F = new p098Z.C0921f(1);
        this.f7198L = -9223372036854775807L;
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: D */
    public final int mo1983D(p076T.C0702p c0702p) {
        if (this.f7189C.m3715b(c0702p)) {
            return p102a0.AbstractC0970e.m1976f(c0702p.f2394J == 0 ? 4 : 2, 0, 0, 0);
        }
        return p102a0.AbstractC0970e.m1976f(0, 0, 0, 0);
    }

    /* renamed from: F */
    public final void m3716F(p076T.C0664G c0664g, java.util.ArrayList arrayList) {
        int i4 = 0;
        while (true) {
            p076T.InterfaceC0663F[] interfaceC0663FArr = c0664g.f2198l;
            if (i4 >= interfaceC0663FArr.length) {
                return;
            }
            p076T.C0702p mo711b = interfaceC0663FArr[i4].mo711b();
            if (mo711b != null) {
                p151k0.C1751a c1751a = this.f7189C;
                if (c1751a.m3715b(mo711b)) {
                    p176p1.AbstractC1949a m3714a = c1751a.m3714a(mo711b);
                    byte[] mo710a = interfaceC0663FArr[i4].mo710a();
                    mo710a.getClass();
                    p032H0.C0244a c0244a = this.f7192F;
                    c0244a.mo1750e();
                    c0244a.m1752h(mo710a.length);
                    c0244a.f3251p.put(mo710a);
                    c0244a.m1753i();
                    p076T.C0664G m3948u = m3714a.m3948u(c0244a);
                    if (m3948u != null) {
                        m3716F(m3948u, arrayList);
                    }
                    i4++;
                }
            }
            arrayList.add(interfaceC0663FArr[i4]);
            i4++;
        }
    }

    /* renamed from: G */
    public final long m3717G(long j4) {
        p086W.AbstractC0781a.m1421j(j4 != -9223372036854775807L);
        p086W.AbstractC0781a.m1421j(this.f7198L != -9223372036854775807L);
        return j4 - this.f7198L;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        if (message.what != 1) {
            throw new java.lang.IllegalStateException();
        }
        p076T.C0664G c0664g = (p076T.C0664G) message.obj;
        p102a0.SurfaceHolderCallbackC0941E surfaceHolderCallbackC0941E = this.f7190D;
        p102a0.C0944H c0944h = surfaceHolderCallbackC0941E.f3316a;
        p076T.C0661D m1185a = c0944h.f3353d0.m1185a();
        int i4 = 0;
        while (true) {
            p076T.InterfaceC0663F[] interfaceC0663FArr = c0664g.f2198l;
            if (i4 >= interfaceC0663FArr.length) {
                break;
            }
            interfaceC0663FArr[i4].mo717c(m1185a);
            i4++;
        }
        c0944h.f3353d0 = new p076T.C0662E(m1185a);
        p076T.C0662E m1849l = c0944h.m1849l();
        boolean equals = m1849l.equals(c0944h.f3332L);
        p086W.C0791k c0791k = c0944h.f3364l;
        if (!equals) {
            c0944h.f3332L = m1849l;
            c0791k.m1442c(14, new p009B2.C0067x(17, surfaceHolderCallbackC0941E));
        }
        c0791k.m1442c(28, new p009B2.C0067x(18, c0664g));
        c0791k.m1441b();
        return true;
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: l */
    public final java.lang.String mo1988l() {
        return "MetadataRenderer";
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: n */
    public final boolean mo1990n() {
        return this.f7195I;
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: p */
    public final boolean mo1991p() {
        return true;
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: q */
    public final void mo1992q() {
        this.f7197K = null;
        this.f7193G = null;
        this.f7198L = -9223372036854775807L;
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: s */
    public final void mo1994s(long j4, boolean z4) {
        this.f7197K = null;
        this.f7194H = false;
        this.f7195I = false;
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: x */
    public final void mo1999x(p076T.C0702p[] c0702pArr, long j4, long j5) {
        this.f7193G = this.f7189C.m3714a(c0702pArr[0]);
        p076T.C0664G c0664g = this.f7197K;
        if (c0664g != null) {
            long j6 = this.f7198L;
            long j7 = c0664g.f2199m;
            long j8 = (j6 + j7) - j5;
            if (j7 != j8) {
                c0664g = new p076T.C0664G(j8, c0664g.f2198l);
            }
            this.f7197K = c0664g;
        }
        this.f7198L = j5;
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: z */
    public final void mo2001z(long j4, long j5) {
        boolean z4 = true;
        while (z4) {
            int i4 = 0;
            if (!this.f7194H && this.f7197K == null) {
                p032H0.C0244a c0244a = this.f7192F;
                c0244a.mo1750e();
                p094Y.C0886x c0886x = this.f3541n;
                c0886x.m1710N();
                int m2000y = m2000y(c0886x, c0244a, 0);
                if (m2000y == -4) {
                    if (c0244a.m1138c(4)) {
                        this.f7194H = true;
                    } else if (c0244a.f3253r >= this.f3550w) {
                        c0244a.f710u = this.f7196J;
                        c0244a.m1753i();
                        p176p1.AbstractC1949a abstractC1949a = this.f7193G;
                        int i5 = p086W.AbstractC0805y.f2801a;
                        p076T.C0664G m3948u = abstractC1949a.m3948u(c0244a);
                        if (m3948u != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList(m3948u.f2198l.length);
                            m3716F(m3948u, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f7197K = new p076T.C0664G(m3717G(c0244a.f3253r), (p076T.InterfaceC0663F[]) arrayList.toArray(new p076T.InterfaceC0663F[0]));
                            }
                        }
                    }
                } else if (m2000y == -5) {
                    p076T.C0702p c0702p = (p076T.C0702p) c0886x.f3176n;
                    c0702p.getClass();
                    this.f7196J = c0702p.f2413r;
                }
            }
            p076T.C0664G c0664g = this.f7197K;
            if (c0664g == null || c0664g.f2199m > m3717G(j4)) {
                z4 = false;
            } else {
                p076T.C0664G c0664g2 = this.f7197K;
                android.os.Handler handler = this.f7191E;
                if (handler != null) {
                    handler.obtainMessage(1, c0664g2).sendToTarget();
                } else {
                    p102a0.SurfaceHolderCallbackC0941E surfaceHolderCallbackC0941E = this.f7190D;
                    p102a0.C0944H c0944h = surfaceHolderCallbackC0941E.f3316a;
                    p076T.C0661D m1185a = c0944h.f3353d0.m1185a();
                    while (true) {
                        p076T.InterfaceC0663F[] interfaceC0663FArr = c0664g2.f2198l;
                        if (i4 >= interfaceC0663FArr.length) {
                            break;
                        }
                        interfaceC0663FArr[i4].mo717c(m1185a);
                        i4++;
                    }
                    c0944h.f3353d0 = new p076T.C0662E(m1185a);
                    p076T.C0662E m1849l = c0944h.m1849l();
                    boolean equals = m1849l.equals(c0944h.f3332L);
                    p086W.C0791k c0791k = c0944h.f3364l;
                    if (!equals) {
                        c0944h.f3332L = m1849l;
                        c0791k.m1442c(14, new p009B2.C0067x(17, surfaceHolderCallbackC0941E));
                    }
                    c0791k.m1442c(28, new p009B2.C0067x(18, c0664g2));
                    c0791k.m1441b();
                }
                this.f7197K = null;
                z4 = true;
            }
            if (this.f7194H && this.f7197K == null) {
                this.f7195I = true;
            }
        }
    }
}
