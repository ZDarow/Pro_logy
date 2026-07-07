package p141i0;

/* renamed from: i0.h */
/* loaded from: classes.dex */
public final class C1535h extends p102a0.AbstractC0970e {

    /* renamed from: C */
    public final p129f2.C1408Y f6379C;

    /* renamed from: D */
    public final p098Z.C0921f f6380D;

    /* renamed from: E */
    public final java.util.ArrayDeque f6381E;

    /* renamed from: F */
    public boolean f6382F;

    /* renamed from: G */
    public boolean f6383G;

    /* renamed from: H */
    public p141i0.C1533f f6384H;

    /* renamed from: I */
    public long f6385I;

    /* renamed from: J */
    public long f6386J;

    /* renamed from: K */
    public int f6387K;

    /* renamed from: L */
    public int f6388L;

    /* renamed from: M */
    public p076T.C0702p f6389M;

    /* renamed from: N */
    public p141i0.C1529b f6390N;

    /* renamed from: O */
    public p098Z.C0921f f6391O;

    /* renamed from: P */
    public p141i0.C1532e f6392P;

    /* renamed from: Q */
    public android.graphics.Bitmap f6393Q;

    /* renamed from: R */
    public boolean f6394R;

    /* renamed from: S */
    public p141i0.C1534g f6395S;

    /* renamed from: T */
    public p141i0.C1534g f6396T;

    /* renamed from: U */
    public int f6397U;

    public C1535h(p129f2.C1408Y c1408y) {
        super(4);
        this.f6379C = c1408y;
        this.f6392P = p141i0.C1532e.f6372a;
        this.f6380D = new p098Z.C0921f(0);
        this.f6384H = p141i0.C1533f.f6373c;
        this.f6381E = new java.util.ArrayDeque();
        this.f6386J = -9223372036854775807L;
        this.f6385I = -9223372036854775807L;
        this.f6387K = 0;
        this.f6388L = 1;
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: D */
    public final int mo1983D(p076T.C0702p c0702p) {
        return this.f6379C.m3188G(c0702p);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0141, code lost:
    
        if (r14.f6376a == ((r0.f2393I * r1.f2392H) - 1)) goto L78;
     */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m3402F(long r13) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p141i0.C1535h.m3402F(long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0104, code lost:
    
        if (r2 == false) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a4  */
    /* JADX WARN: Type inference failed for: r3v5, types: [i0.g, java.lang.Object] */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m3403G(long r13) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p141i0.C1535h.m3403G(long):boolean");
    }

    /* renamed from: H */
    public final void m3404H() {
        p076T.C0702p c0702p = this.f6389M;
        p129f2.C1408Y c1408y = this.f6379C;
        int m3188G = c1408y.m3188G(c0702p);
        if (m3188G != p102a0.AbstractC0970e.m1976f(4, 0, 0, 0) && m3188G != p102a0.AbstractC0970e.m1976f(3, 0, 0, 0)) {
            throw m1985g(new java.lang.Exception("Provided decoder factory can't create decoder for format."), this.f6389M, false, 4005);
        }
        p141i0.C1529b c1529b = this.f6390N;
        if (c1529b != null) {
            c1529b.release();
        }
        this.f6390N = new p141i0.C1529b((p107b0.C1169d) c1408y.f5729m);
    }

    /* renamed from: I */
    public final void m3405I() {
        this.f6391O = null;
        this.f6387K = 0;
        this.f6386J = -9223372036854775807L;
        p141i0.C1529b c1529b = this.f6390N;
        if (c1529b != null) {
            c1529b.release();
            this.f6390N = null;
        }
    }

    @Override // p102a0.AbstractC0970e, p102a0.InterfaceC0977h0
    /* renamed from: d */
    public final void mo1824d(int i4, java.lang.Object obj) {
        if (i4 != 15) {
            return;
        }
        p141i0.C1532e c1532e = obj instanceof p141i0.C1532e ? (p141i0.C1532e) obj : null;
        if (c1532e == null) {
            c1532e = p141i0.C1532e.f6372a;
        }
        this.f6392P = c1532e;
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: l */
    public final java.lang.String mo1988l() {
        return "ImageRenderer";
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: n */
    public final boolean mo1990n() {
        return this.f6383G;
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: p */
    public final boolean mo1991p() {
        int i4 = this.f6388L;
        return i4 == 3 || (i4 == 0 && this.f6394R);
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: q */
    public final void mo1992q() {
        this.f6389M = null;
        this.f6384H = p141i0.C1533f.f6373c;
        this.f6381E.clear();
        m3405I();
        this.f6392P.getClass();
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: r */
    public final void mo1993r(boolean z4, boolean z5) {
        this.f6388L = z5 ? 1 : 0;
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: s */
    public final void mo1994s(long j4, boolean z4) {
        this.f6388L = java.lang.Math.min(this.f6388L, 1);
        this.f6383G = false;
        this.f6382F = false;
        this.f6393Q = null;
        this.f6395S = null;
        this.f6396T = null;
        this.f6394R = false;
        this.f6391O = null;
        p141i0.C1529b c1529b = this.f6390N;
        if (c1529b != null) {
            c1529b.flush();
        }
        this.f6381E.clear();
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: t */
    public final void mo1995t() {
        m3405I();
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: u */
    public final void mo1996u() {
        m3405I();
        this.f6388L = java.lang.Math.min(this.f6388L, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r2 >= r7) goto L14;
     */
    @Override // p102a0.AbstractC0970e
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1999x(p076T.C0702p[] r6, long r7, long r9) {
        /*
            r5 = this;
            i0.f r6 = r5.f6384H
            long r6 = r6.f6375b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L31
            java.util.ArrayDeque r6 = r5.f6381E
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L26
            long r7 = r5.f6386J
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L31
            long r2 = r5.f6385I
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L26
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 < 0) goto L26
            goto L31
        L26:
            i0.f r7 = new i0.f
            long r0 = r5.f6386J
            r7.<init>(r0, r9)
            r6.add(r7)
            goto L38
        L31:
            i0.f r6 = new i0.f
            r6.<init>(r0, r9)
            r5.f6384H = r6
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p141i0.C1535h.mo1999x(T.p[], long, long):void");
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: z */
    public final void mo2001z(long j4, long j5) {
        if (this.f6383G) {
            return;
        }
        if (this.f6389M == null) {
            p094Y.C0886x c0886x = this.f3541n;
            c0886x.m1710N();
            p098Z.C0921f c0921f = this.f6380D;
            c0921f.mo1750e();
            int m2000y = m2000y(c0886x, c0921f, 2);
            if (m2000y != -5) {
                if (m2000y == -4) {
                    p086W.AbstractC0781a.m1421j(c0921f.m1138c(4));
                    this.f6382F = true;
                    this.f6383G = true;
                    return;
                }
                return;
            }
            p076T.C0702p c0702p = (p076T.C0702p) c0886x.f3176n;
            p086W.AbstractC0781a.m1422k(c0702p);
            this.f6389M = c0702p;
            m3404H();
        }
        try {
            android.os.Trace.beginSection("drainAndFeedDecoder");
            do {
            } while (m3402F(j4));
            do {
            } while (m3403G(j4));
            android.os.Trace.endSection();
        } catch (p141i0.C1531d e4) {
            throw m1985g(e4, null, false, 4003);
        }
    }
}
