package p102a0;

/* renamed from: a0.e */
/* loaded from: classes.dex */
public abstract class AbstractC0970e implements p102a0.InterfaceC0977h0 {

    /* renamed from: B */
    public p193t0.C2179q f3538B;

    /* renamed from: m */
    public final int f3540m;

    /* renamed from: o */
    public p102a0.C0985l0 f3542o;

    /* renamed from: p */
    public int f3543p;

    /* renamed from: q */
    public p107b0.C1177l f3544q;

    /* renamed from: r */
    public p086W.C0800t f3545r;

    /* renamed from: s */
    public int f3546s;

    /* renamed from: t */
    public p179q0.InterfaceC1985a0 f3547t;

    /* renamed from: u */
    public p076T.C0702p[] f3548u;

    /* renamed from: v */
    public long f3549v;

    /* renamed from: w */
    public long f3550w;

    /* renamed from: y */
    public boolean f3552y;

    /* renamed from: z */
    public boolean f3553z;

    /* renamed from: l */
    public final java.lang.Object f3539l = new java.lang.Object();

    /* renamed from: n */
    public final p094Y.C0886x f3541n = new p094Y.C0886x((char) 0, 4);

    /* renamed from: x */
    public long f3551x = Long.MIN_VALUE;

    /* renamed from: A */
    public p076T.AbstractC0677U f3537A = p076T.AbstractC0677U.f2248a;

    public AbstractC0970e(int i4) {
        this.f3540m = i4;
    }

    /* renamed from: f */
    public static int m1976f(int i4, int i5, int i6, int i7) {
        return i4 | i5 | i6 | 128 | i7;
    }

    /* renamed from: i */
    public static int m1977i(int i4) {
        return i4 & 384;
    }

    /* renamed from: j */
    public static int m1978j(int i4) {
        return i4 & 64;
    }

    /* renamed from: o */
    public static boolean m1979o(int i4, boolean z4) {
        int i5 = i4 & 7;
        return i5 == 4 || (z4 && i5 == 3);
    }

    /* renamed from: A */
    public final void m1980A(p076T.C0702p[] c0702pArr, p179q0.InterfaceC1985a0 interfaceC1985a0, long j4, long j5, p179q0.C1964F c1964f) {
        p086W.AbstractC0781a.m1421j(!this.f3552y);
        this.f3547t = interfaceC1985a0;
        if (this.f3551x == Long.MIN_VALUE) {
            this.f3551x = j4;
        }
        this.f3548u = c0702pArr;
        this.f3549v = j5;
        mo1999x(c0702pArr, j4, j5);
    }

    /* renamed from: B */
    public final void m1981B() {
        p086W.AbstractC0781a.m1421j(this.f3546s == 0);
        this.f3541n.m1710N();
        mo1996u();
    }

    /* renamed from: C */
    public void mo1982C(float f4, float f5) {
    }

    /* renamed from: D */
    public abstract int mo1983D(p076T.C0702p c0702p);

    /* renamed from: E */
    public int mo1984E() {
        return 0;
    }

    @Override // p102a0.InterfaceC0977h0
    /* renamed from: d */
    public void mo1824d(int i4, java.lang.Object obj) {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p102a0.C0986m m1985g(java.lang.Exception r13, p076T.C0702p r14, boolean r15, int r16) {
        /*
            r12 = this;
            r1 = r12
            r0 = r14
            r2 = 4
            if (r0 == 0) goto L1d
            boolean r3 = r1.f3553z
            if (r3 != 0) goto L1d
            r3 = 1
            r1.f3553z = r3
            r3 = 0
            int r4 = r12.mo1983D(r14)     // Catch: java.lang.Throwable -> L16 p102a0.C0986m -> L1b
            r4 = r4 & 7
            r1.f3553z = r3
            goto L1e
        L16:
            r0 = move-exception
            r2 = r0
            r1.f3553z = r3
            throw r2
        L1b:
            r1.f3553z = r3
        L1d:
            r4 = r2
        L1e:
            java.lang.String r6 = r12.mo1988l()
            int r7 = r1.f3543p
            a0.m r11 = new a0.m
            if (r0 != 0) goto L2a
            r9 = r2
            goto L2b
        L2a:
            r9 = r4
        L2b:
            r3 = 1
            r2 = r11
            r4 = r13
            r5 = r16
            r8 = r14
            r10 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p102a0.AbstractC0970e.m1985g(java.lang.Exception, T.p, boolean, int):a0.m");
    }

    /* renamed from: h */
    public void mo1986h() {
    }

    /* renamed from: k */
    public p102a0.InterfaceC0954S mo1987k() {
        return null;
    }

    /* renamed from: l */
    public abstract java.lang.String mo1988l();

    /* renamed from: m */
    public final boolean m1989m() {
        return this.f3551x == Long.MIN_VALUE;
    }

    /* renamed from: n */
    public abstract boolean mo1990n();

    /* renamed from: p */
    public abstract boolean mo1991p();

    /* renamed from: q */
    public abstract void mo1992q();

    /* renamed from: r */
    public void mo1993r(boolean z4, boolean z5) {
    }

    /* renamed from: s */
    public abstract void mo1994s(long j4, boolean z4);

    /* renamed from: t */
    public void mo1995t() {
    }

    /* renamed from: u */
    public void mo1996u() {
    }

    /* renamed from: v */
    public void mo1997v() {
    }

    /* renamed from: w */
    public void mo1998w() {
    }

    /* renamed from: x */
    public abstract void mo1999x(p076T.C0702p[] c0702pArr, long j4, long j5);

    /* renamed from: y */
    public final int m2000y(p094Y.C0886x c0886x, p098Z.C0921f c0921f, int i4) {
        p179q0.InterfaceC1985a0 interfaceC1985a0 = this.f3547t;
        interfaceC1985a0.getClass();
        int mo59o = interfaceC1985a0.mo59o(c0886x, c0921f, i4);
        if (mo59o == -4) {
            if (c0921f.m1138c(4)) {
                this.f3551x = Long.MIN_VALUE;
                return this.f3552y ? -4 : -3;
            }
            long j4 = c0921f.f3253r + this.f3549v;
            c0921f.f3253r = j4;
            this.f3551x = java.lang.Math.max(this.f3551x, j4);
        } else if (mo59o == -5) {
            p076T.C0702p c0702p = (p076T.C0702p) c0886x.f3176n;
            c0702p.getClass();
            long j5 = c0702p.f2413r;
            if (j5 != Long.MAX_VALUE) {
                p076T.C0701o m1295a = c0702p.m1295a();
                m1295a.f2375q = j5 + this.f3549v;
                c0886x.f3176n = new p076T.C0702p(m1295a);
            }
        }
        return mo59o;
    }

    /* renamed from: z */
    public abstract void mo2001z(long j4, long j5);
}
