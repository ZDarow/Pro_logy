package p102a0;

/* renamed from: a0.N */
/* loaded from: classes.dex */
public final class C0950N implements android.os.Handler.Callback, p179q0.InterfaceC1961C, p102a0.InterfaceC0975g0 {

    /* renamed from: e0 */
    public static final long f3398e0 = p086W.AbstractC0805y.m1605Z(10000);

    /* renamed from: A */
    public final p086W.C0800t f3399A;

    /* renamed from: B */
    public final p102a0.C1001z f3400B;

    /* renamed from: C */
    public final p102a0.C0958W f3401C;

    /* renamed from: D */
    public final p102a0.C0971e0 f3402D;

    /* renamed from: E */
    public final p102a0.C0976h f3403E;

    /* renamed from: F */
    public final long f3404F;

    /* renamed from: G */
    public final p107b0.C1177l f3405G;

    /* renamed from: H */
    public p102a0.C0987m0 f3406H;

    /* renamed from: I */
    public p102a0.C0973f0 f3407I;

    /* renamed from: J */
    public p102a0.C0947K f3408J;

    /* renamed from: K */
    public boolean f3409K;

    /* renamed from: M */
    public boolean f3411M;

    /* renamed from: N */
    public boolean f3412N;

    /* renamed from: P */
    public boolean f3414P;

    /* renamed from: Q */
    public int f3415Q;

    /* renamed from: R */
    public boolean f3416R;

    /* renamed from: S */
    public boolean f3417S;

    /* renamed from: T */
    public boolean f3418T;

    /* renamed from: U */
    public boolean f3419U;

    /* renamed from: V */
    public int f3420V;

    /* renamed from: W */
    public p102a0.C0949M f3421W;

    /* renamed from: X */
    public long f3422X;

    /* renamed from: Y */
    public long f3423Y;

    /* renamed from: Z */
    public int f3424Z;

    /* renamed from: a0 */
    public boolean f3425a0;

    /* renamed from: b0 */
    public p102a0.C0986m f3426b0;

    /* renamed from: d0 */
    public p102a0.C0993r f3428d0;

    /* renamed from: l */
    public final p102a0.AbstractC0970e[] f3429l;

    /* renamed from: m */
    public final java.util.Set f3430m;

    /* renamed from: n */
    public final p102a0.AbstractC0970e[] f3431n;

    /* renamed from: o */
    public final p193t0.AbstractC2183u f3432o;

    /* renamed from: p */
    public final p193t0.C2184v f3433p;

    /* renamed from: q */
    public final p102a0.C0980j f3434q;

    /* renamed from: r */
    public final p197u0.InterfaceC2217d f3435r;

    /* renamed from: s */
    public final p086W.C0802v f3436s;

    /* renamed from: t */
    public final android.os.HandlerThread f3437t;

    /* renamed from: u */
    public final android.os.Looper f3438u;

    /* renamed from: v */
    public final p076T.C0676T f3439v;

    /* renamed from: w */
    public final p076T.C0675S f3440w;

    /* renamed from: x */
    public final long f3441x;

    /* renamed from: y */
    public final p102a0.C0982k f3442y;

    /* renamed from: z */
    public final java.util.ArrayList f3443z;

    /* renamed from: L */
    public boolean f3410L = false;

    /* renamed from: c0 */
    public long f3427c0 = -9223372036854775807L;

    /* renamed from: O */
    public long f3413O = -9223372036854775807L;

    public C0950N(p102a0.AbstractC0970e[] abstractC0970eArr, p193t0.AbstractC2183u abstractC2183u, p193t0.C2184v c2184v, p102a0.C0980j c0980j, p197u0.InterfaceC2217d interfaceC2217d, int i4, boolean z4, p107b0.C1170e c1170e, p102a0.C0987m0 c0987m0, p102a0.C0976h c0976h, long j4, android.os.Looper looper, p086W.C0800t c0800t, p102a0.C1001z c1001z, p107b0.C1177l c1177l, p102a0.C0993r c0993r) {
        this.f3400B = c1001z;
        this.f3429l = abstractC0970eArr;
        this.f3432o = abstractC2183u;
        this.f3433p = c2184v;
        this.f3434q = c0980j;
        this.f3435r = interfaceC2217d;
        this.f3415Q = i4;
        this.f3416R = z4;
        this.f3406H = c0987m0;
        this.f3403E = c0976h;
        this.f3404F = j4;
        this.f3399A = c0800t;
        this.f3405G = c1177l;
        this.f3428d0 = c0993r;
        this.f3441x = c0980j.f3641h;
        p076T.C0674Q c0674q = p076T.AbstractC0677U.f2248a;
        p102a0.C0973f0 m2009i = p102a0.C0973f0.m2009i(c2184v);
        this.f3407I = m2009i;
        this.f3408J = new p102a0.C0947K(m2009i);
        this.f3431n = new p102a0.AbstractC0970e[abstractC0970eArr.length];
        p193t0.C2179q c2179q = (p193t0.C2179q) abstractC2183u;
        c2179q.getClass();
        for (int i5 = 0; i5 < abstractC0970eArr.length; i5++) {
            p102a0.AbstractC0970e abstractC0970e = abstractC0970eArr[i5];
            abstractC0970e.f3543p = i5;
            abstractC0970e.f3544q = c1177l;
            abstractC0970e.f3545r = c0800t;
            this.f3431n[i5] = abstractC0970e;
            p102a0.AbstractC0970e abstractC0970e2 = this.f3431n[i5];
            synchronized (abstractC0970e2.f3539l) {
                abstractC0970e2.f3538B = c2179q;
            }
        }
        this.f3442y = new p102a0.C0982k(this, c0800t);
        this.f3443z = new java.util.ArrayList();
        this.f3430m = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap());
        this.f3439v = new p076T.C0676T();
        this.f3440w = new p076T.C0675S();
        abstractC2183u.f8718a = this;
        abstractC2183u.f8719b = interfaceC2217d;
        this.f3425a0 = true;
        p086W.C0802v m1565a = c0800t.m1565a(looper, null);
        this.f3401C = new p102a0.C0958W(c1170e, m1565a, new p009B2.C0067x(20, this), c0993r);
        this.f3402D = new p102a0.C0971e0(this, c1170e, m1565a, c1177l);
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("ExoPlayer:Playback", -16);
        this.f3437t = handlerThread;
        handlerThread.start();
        android.os.Looper looper2 = handlerThread.getLooper();
        this.f3438u = looper2;
        this.f3436s = c0800t.m1565a(looper2, this);
    }

    /* renamed from: F */
    public static android.util.Pair m1869F(p076T.AbstractC0677U abstractC0677U, p102a0.C0949M c0949m, boolean z4, int i4, boolean z5, p076T.C0676T c0676t, p076T.C0675S c0675s) {
        android.util.Pair m1252i;
        int m1870G;
        p076T.AbstractC0677U abstractC0677U2 = c0949m.f3395a;
        if (abstractC0677U.m1256p()) {
            return null;
        }
        p076T.AbstractC0677U abstractC0677U3 = abstractC0677U2.m1256p() ? abstractC0677U : abstractC0677U2;
        try {
            m1252i = abstractC0677U3.m1252i(c0676t, c0675s, c0949m.f3396b, c0949m.f3397c);
        } catch (java.lang.IndexOutOfBoundsException unused) {
        }
        if (abstractC0677U.equals(abstractC0677U3)) {
            return m1252i;
        }
        if (abstractC0677U.mo1231b(m1252i.first) != -1) {
            return (abstractC0677U3.mo1251g(m1252i.first, c0675s).f2228f && abstractC0677U3.mo1235m(c0675s.f2225c, c0676t, 0L).f2245n == abstractC0677U3.mo1231b(m1252i.first)) ? abstractC0677U.m1252i(c0676t, c0675s, abstractC0677U.mo1251g(m1252i.first, c0675s).f2225c, c0949m.f3397c) : m1252i;
        }
        if (z4 && (m1870G = m1870G(c0676t, c0675s, i4, z5, m1252i.first, abstractC0677U3, abstractC0677U)) != -1) {
            return abstractC0677U.m1252i(c0676t, c0675s, m1870G, -9223372036854775807L);
        }
        return null;
    }

    /* renamed from: G */
    public static int m1870G(p076T.C0676T c0676t, p076T.C0675S c0675s, int i4, boolean z4, java.lang.Object obj, p076T.AbstractC0677U abstractC0677U, p076T.AbstractC0677U abstractC0677U2) {
        java.lang.Object obj2 = abstractC0677U.mo1235m(abstractC0677U.mo1251g(obj, c0675s).f2225c, c0676t, 0L).f2232a;
        for (int i5 = 0; i5 < abstractC0677U2.mo1236o(); i5++) {
            if (abstractC0677U2.mo1235m(i5, c0676t, 0L).f2232a.equals(obj2)) {
                return i5;
            }
        }
        int mo1231b = abstractC0677U.mo1231b(obj);
        int mo1233h = abstractC0677U.mo1233h();
        int i6 = mo1231b;
        int i7 = -1;
        for (int i8 = 0; i8 < mo1233h && i7 == -1; i8++) {
            i6 = abstractC0677U.m1249d(i6, c0675s, c0676t, i4, z4);
            if (i6 == -1) {
                break;
            }
            i7 = abstractC0677U2.mo1231b(abstractC0677U.mo1234l(i6));
        }
        if (i7 == -1) {
            return -1;
        }
        return abstractC0677U2.mo1232f(i7, c0675s, false).f2225c;
    }

    /* renamed from: N */
    public static void m1871N(p102a0.AbstractC0970e abstractC0970e, long j4) {
        abstractC0970e.f3552y = true;
        if (abstractC0970e instanceof p188s0.C2139d) {
            p188s0.C2139d c2139d = (p188s0.C2139d) abstractC0970e;
            p086W.AbstractC0781a.m1421j(c2139d.f3552y);
            c2139d.f8532V = j4;
        }
    }

    /* renamed from: q */
    public static boolean m1872q(p102a0.AbstractC0970e abstractC0970e) {
        return abstractC0970e.f3546s != 0;
    }

    /* renamed from: A */
    public final void m1873A() {
        float f4 = this.f3442y.mo1932b().f2207a;
        p102a0.C0958W c0958w = this.f3401C;
        p102a0.C0955T c0955t = c0958w.f3489i;
        p102a0.C0955T c0955t2 = c0958w.f3490j;
        p193t0.C2184v c2184v = null;
        p102a0.C0955T c0955t3 = c0955t;
        boolean z4 = true;
        while (c0955t3 != null && c0955t3.f3456d) {
            p193t0.C2184v m1942h = c0955t3.m1942h(f4, this.f3407I.f3579a);
            p193t0.C2184v c2184v2 = c0955t3 == this.f3401C.f3489i ? m1942h : c2184v;
            p193t0.C2184v c2184v3 = c0955t3.f3466n;
            if (c2184v3 != null) {
                int length = c2184v3.f8722c.length;
                p193t0.InterfaceC2181s[] interfaceC2181sArr = m1942h.f8722c;
                if (length == interfaceC2181sArr.length) {
                    for (int i4 = 0; i4 < interfaceC2181sArr.length; i4++) {
                        if (m1942h.m4305a(c2184v3, i4)) {
                        }
                    }
                    if (c0955t3 == c0955t2) {
                        z4 = false;
                    }
                    c0955t3 = c0955t3.f3464l;
                    c2184v = c2184v2;
                }
            }
            if (z4) {
                p102a0.C0958W c0958w2 = this.f3401C;
                p102a0.C0955T c0955t4 = c0958w2.f3489i;
                boolean m1957k = c0958w2.m1957k(c0955t4);
                boolean[] zArr = new boolean[this.f3429l.length];
                c2184v2.getClass();
                long m1935a = c0955t4.m1935a(c2184v2, this.f3407I.f3597s, m1957k, zArr);
                p102a0.C0973f0 c0973f0 = this.f3407I;
                boolean z5 = (c0973f0.f3583e == 4 || m1935a == c0973f0.f3597s) ? false : true;
                p102a0.C0973f0 c0973f02 = this.f3407I;
                this.f3407I = m1919n(c0973f02.f3580b, m1935a, c0973f02.f3581c, c0973f02.f3582d, z5, 5);
                if (z5) {
                    m1876D(m1935a);
                }
                boolean[] zArr2 = new boolean[this.f3429l.length];
                int i5 = 0;
                while (true) {
                    p102a0.AbstractC0970e[] abstractC0970eArr = this.f3429l;
                    if (i5 >= abstractC0970eArr.length) {
                        break;
                    }
                    p102a0.AbstractC0970e abstractC0970e = abstractC0970eArr[i5];
                    boolean m1872q = m1872q(abstractC0970e);
                    zArr2[i5] = m1872q;
                    p179q0.InterfaceC1985a0 interfaceC1985a0 = c0955t4.f3455c[i5];
                    if (m1872q) {
                        if (interfaceC1985a0 != abstractC0970e.f3547t) {
                            m1898b(abstractC0970e);
                        } else if (zArr[i5]) {
                            long j4 = this.f3422X;
                            abstractC0970e.f3552y = false;
                            abstractC0970e.f3550w = j4;
                            abstractC0970e.f3551x = j4;
                            abstractC0970e.mo1994s(j4, false);
                            i5++;
                        }
                    }
                    i5++;
                }
                m1902d(zArr2, this.f3422X);
            } else {
                this.f3401C.m1957k(c0955t3);
                if (c0955t3.f3456d) {
                    c0955t3.m1935a(m1942h, java.lang.Math.max(c0955t3.f3458f.f3469b, this.f3422X - c0955t3.f3467o), false, new boolean[c0955t3.f3461i.length]);
                }
            }
            m1914j(true);
            if (this.f3407I.f3583e != 4) {
                m1923s();
                m1909g0();
                this.f3436s.m1572e(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0143  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1874B(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p102a0.C0950N.m1874B(boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: C */
    public final void m1875C() {
        p102a0.C0955T c0955t = this.f3401C.f3489i;
        this.f3411M = c0955t != null && c0955t.f3458f.f3475h && this.f3410L;
    }

    /* renamed from: D */
    public final void m1876D(long j4) {
        p102a0.C0955T c0955t = this.f3401C.f3489i;
        long j5 = j4 + (c0955t == null ? 1000000000000L : c0955t.f3467o);
        this.f3422X = j5;
        this.f3442y.f3646l.m2030d(j5);
        for (p102a0.AbstractC0970e abstractC0970e : this.f3429l) {
            if (m1872q(abstractC0970e)) {
                long j6 = this.f3422X;
                abstractC0970e.f3552y = false;
                abstractC0970e.f3550w = j6;
                abstractC0970e.f3551x = j6;
                abstractC0970e.mo1994s(j6, false);
            }
        }
        for (p102a0.C0955T c0955t2 = r0.f3489i; c0955t2 != null; c0955t2 = c0955t2.f3464l) {
            for (p193t0.InterfaceC2181s interfaceC2181s : c0955t2.f3466n.f8722c) {
                if (interfaceC2181s != null) {
                    interfaceC2181s.mo3978m();
                }
            }
        }
    }

    /* renamed from: E */
    public final void m1877E(p076T.AbstractC0677U abstractC0677U, p076T.AbstractC0677U abstractC0677U2) {
        if (abstractC0677U.m1256p() && abstractC0677U2.m1256p()) {
            return;
        }
        java.util.ArrayList arrayList = this.f3443z;
        int size = arrayList.size() - 1;
        if (size < 0) {
            java.util.Collections.sort(arrayList);
        } else {
            p009B2.AbstractC0051h.m159r(arrayList.get(size));
            throw null;
        }
    }

    /* renamed from: H */
    public final void m1878H(long j4) {
        this.f3436s.f2795a.sendEmptyMessageAtTime(2, j4 + ((this.f3407I.f3583e != 3 || m1894Y()) ? f3398e0 : 1000L));
    }

    /* renamed from: I */
    public final void m1879I(boolean z4) {
        p179q0.C1964F c1964f = this.f3401C.f3489i.f3458f.f3468a;
        long m1881K = m1881K(c1964f, this.f3407I.f3597s, true, false);
        if (m1881K != this.f3407I.f3597s) {
            p102a0.C0973f0 c0973f0 = this.f3407I;
            this.f3407I = m1919n(c1964f, m1881K, c0973f0.f3581c, c0973f0.f3582d, z4, 5);
        }
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [q0.D, java.lang.Object] */
    /* renamed from: J */
    public final void m1880J(p102a0.C0949M c0949m) {
        long j4;
        long j5;
        boolean z4;
        p179q0.C1964F c1964f;
        long j6;
        long j7;
        long j8;
        p102a0.C0973f0 c0973f0;
        int i4;
        this.f3408J.m1866c(1);
        android.util.Pair m1869F = m1869F(this.f3407I.f3579a, c0949m, true, this.f3415Q, this.f3416R, this.f3439v, this.f3440w);
        if (m1869F == null) {
            android.util.Pair m1908g = m1908g(this.f3407I.f3579a);
            c1964f = (p179q0.C1964F) m1908g.first;
            long longValue = ((java.lang.Long) m1908g.second).longValue();
            z4 = !this.f3407I.f3579a.m1256p();
            j4 = longValue;
            j5 = -9223372036854775807L;
        } else {
            java.lang.Object obj = m1869F.first;
            long longValue2 = ((java.lang.Long) m1869F.second).longValue();
            long j9 = c0949m.f3397c == -9223372036854775807L ? -9223372036854775807L : longValue2;
            p179q0.C1964F m1958m = this.f3401C.m1958m(this.f3407I.f3579a, obj, longValue2);
            if (m1958m.m3968b()) {
                this.f3407I.f3579a.mo1251g(m1958m.f7960a, this.f3440w);
                if (this.f3440w.m1241e(m1958m.f7961b) == m1958m.f7962c) {
                    this.f3440w.f2229g.getClass();
                }
                j4 = 0;
                j5 = j9;
                c1964f = m1958m;
                z4 = true;
            } else {
                j4 = longValue2;
                j5 = j9;
                z4 = c0949m.f3397c == -9223372036854775807L;
                c1964f = m1958m;
            }
        }
        try {
            if (this.f3407I.f3579a.m1256p()) {
                this.f3421W = c0949m;
            } else {
                if (m1869F != null) {
                    if (c1964f.equals(this.f3407I.f3580b)) {
                        p102a0.C0955T c0955t = this.f3401C.f3489i;
                        long mo2953b = (c0955t == null || !c0955t.f3456d || j4 == 0) ? j4 : c0955t.f3453a.mo2953b(j4, this.f3406H);
                        if (p086W.AbstractC0805y.m1605Z(mo2953b) == p086W.AbstractC0805y.m1605Z(this.f3407I.f3597s) && ((i4 = (c0973f0 = this.f3407I).f3583e) == 2 || i4 == 3)) {
                            long j10 = c0973f0.f3597s;
                            this.f3407I = m1919n(c1964f, j10, j5, j10, z4, 2);
                            return;
                        }
                        j7 = mo2953b;
                    } else {
                        j7 = j4;
                    }
                    boolean z5 = this.f3407I.f3583e == 4;
                    p102a0.C0958W c0958w = this.f3401C;
                    long m1881K = m1881K(c1964f, j7, c0958w.f3489i != c0958w.f3490j, z5);
                    z4 |= j4 != m1881K;
                    try {
                        p102a0.C0973f0 c0973f02 = this.f3407I;
                        p076T.AbstractC0677U abstractC0677U = c0973f02.f3579a;
                        m1911h0(abstractC0677U, c1964f, abstractC0677U, c0973f02.f3580b, j5, true);
                        j8 = m1881K;
                        this.f3407I = m1919n(c1964f, j8, j5, j8, z4, 2);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        j6 = m1881K;
                        this.f3407I = m1919n(c1964f, j6, j5, j6, z4, 2);
                        throw th;
                    }
                }
                if (this.f3407I.f3583e != 1) {
                    m1893X(4);
                }
                m1874B(false, true, false, true);
            }
            j8 = j4;
            this.f3407I = m1919n(c1964f, j8, j5, j8, z4, 2);
        } catch (java.lang.Throwable th2) {
            th = th2;
            j6 = j4;
        }
    }

    /* JADX WARN: Type inference failed for: r9v7, types: [q0.D, java.lang.Object] */
    /* renamed from: K */
    public final long m1881K(p179q0.C1964F c1964f, long j4, boolean z4, boolean z5) {
        m1901c0();
        m1913i0(false, true);
        if (z5 || this.f3407I.f3583e == 3) {
            m1893X(2);
        }
        p102a0.C0958W c0958w = this.f3401C;
        p102a0.C0955T c0955t = c0958w.f3489i;
        p102a0.C0955T c0955t2 = c0955t;
        while (c0955t2 != null && !c1964f.equals(c0955t2.f3458f.f3468a)) {
            c0955t2 = c0955t2.f3464l;
        }
        if (z4 || c0955t != c0955t2 || (c0955t2 != null && c0955t2.f3467o + j4 < 0)) {
            p102a0.AbstractC0970e[] abstractC0970eArr = this.f3429l;
            for (p102a0.AbstractC0970e abstractC0970e : abstractC0970eArr) {
                m1898b(abstractC0970e);
            }
            if (c0955t2 != null) {
                while (c0958w.f3489i != c0955t2) {
                    c0958w.m1947a();
                }
                c0958w.m1957k(c0955t2);
                c0955t2.f3467o = 1000000000000L;
                m1902d(new boolean[abstractC0970eArr.length], c0958w.f3490j.m1939e());
            }
        }
        if (c0955t2 != null) {
            c0958w.m1957k(c0955t2);
            if (!c0955t2.f3456d) {
                c0955t2.f3458f = c0955t2.f3458f.m1945b(j4);
            } else if (c0955t2.f3457e) {
                ?? r9 = c0955t2.f3453a;
                j4 = r9.mo2961l(j4);
                r9.mo2962m(j4 - this.f3441x);
            }
            m1876D(j4);
            m1923s();
        } else {
            c0958w.m1948b();
            m1876D(j4);
        }
        m1914j(false);
        this.f3436s.m1572e(2);
        return j4;
    }

    /* renamed from: L */
    public final void m1882L(p102a0.C0979i0 c0979i0) {
        android.os.Looper looper = c0979i0.f3630f;
        android.os.Looper looper2 = this.f3438u;
        p086W.C0802v c0802v = this.f3436s;
        if (looper != looper2) {
            c0802v.m1569a(15, c0979i0).m1567b();
            return;
        }
        synchronized (c0979i0) {
        }
        try {
            c0979i0.f3625a.mo1824d(c0979i0.f3628d, c0979i0.f3629e);
            c0979i0.m2022b(true);
            int i4 = this.f3407I.f3583e;
            if (i4 == 3 || i4 == 2) {
                c0802v.m1572e(2);
            }
        } catch (java.lang.Throwable th) {
            c0979i0.m2022b(true);
            throw th;
        }
    }

    /* renamed from: M */
    public final void m1883M(p102a0.C0979i0 c0979i0) {
        android.os.Looper looper = c0979i0.f3630f;
        if (looper.getThread().isAlive()) {
            this.f3399A.m1565a(looper, null).m1570c(new p086W.RunnableC0793m(3, this, c0979i0));
        } else {
            p086W.AbstractC0781a.m1410A("TAG", "Trying to send message on a dead thread.");
            c0979i0.m2022b(false);
        }
    }

    /* renamed from: O */
    public final void m1884O(boolean z4, java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
        if (this.f3417S != z4) {
            this.f3417S = z4;
            if (!z4) {
                for (p102a0.AbstractC0970e abstractC0970e : this.f3429l) {
                    if (!m1872q(abstractC0970e) && this.f3430m.remove(abstractC0970e)) {
                        abstractC0970e.m1981B();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* renamed from: P */
    public final void m1885P(p102a0.C0946J c0946j) {
        this.f3408J.m1866c(1);
        int i4 = c0946j.f3382c;
        java.util.ArrayList arrayList = c0946j.f3380a;
        p179q0.C1991d0 c1991d0 = c0946j.f3381b;
        if (i4 != -1) {
            this.f3421W = new p102a0.C0949M(new p102a0.C0983k0(arrayList, c1991d0), c0946j.f3382c, c0946j.f3383d);
        }
        p102a0.C0971e0 c0971e0 = this.f3402D;
        java.util.ArrayList arrayList2 = c0971e0.f3555b;
        c0971e0.m2008g(0, arrayList2.size());
        m1916k(c0971e0.m2002a(arrayList2.size(), arrayList, c1991d0), false);
    }

    /* renamed from: Q */
    public final void m1886Q(boolean z4) {
        this.f3410L = z4;
        m1875C();
        if (this.f3411M) {
            p102a0.C0958W c0958w = this.f3401C;
            if (c0958w.f3490j != c0958w.f3489i) {
                m1879I(true);
                m1914j(false);
            }
        }
    }

    /* renamed from: R */
    public final void m1887R(int i4, int i5, boolean z4, boolean z5) {
        this.f3408J.m1866c(z5 ? 1 : 0);
        this.f3407I = this.f3407I.m2013d(i5, i4, z4);
        m1913i0(false, false);
        for (p102a0.C0955T c0955t = this.f3401C.f3489i; c0955t != null; c0955t = c0955t.f3464l) {
            for (p193t0.InterfaceC2181s interfaceC2181s : c0955t.f3466n.f8722c) {
                if (interfaceC2181s != null) {
                    interfaceC2181s.mo3971c(z4);
                }
            }
        }
        if (!m1894Y()) {
            m1901c0();
            m1909g0();
            return;
        }
        int i6 = this.f3407I.f3583e;
        p086W.C0802v c0802v = this.f3436s;
        if (i6 != 3) {
            if (i6 == 2) {
                c0802v.m1572e(2);
            }
        } else {
            p102a0.C0982k c0982k = this.f3442y;
            c0982k.f3651q = true;
            c0982k.f3646l.m2031f();
            m1897a0();
            c0802v.m1572e(2);
        }
    }

    /* renamed from: S */
    public final void m1888S(p076T.C0668K c0668k) {
        this.f3436s.m1571d(16);
        p102a0.C0982k c0982k = this.f3442y;
        c0982k.mo1931a(c0668k);
        p076T.C0668K mo1932b = c0982k.mo1932b();
        m1918m(mo1932b, mo1932b.f2207a, true, true);
    }

    /* renamed from: T */
    public final void m1889T(p102a0.C0993r c0993r) {
        this.f3428d0 = c0993r;
        p076T.AbstractC0677U abstractC0677U = this.f3407I.f3579a;
        p102a0.C0958W c0958w = this.f3401C;
        c0958w.getClass();
        c0993r.getClass();
        if (c0958w.f3495o.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i4 = 0; i4 < c0958w.f3495o.size(); i4++) {
            ((p102a0.C0955T) c0958w.f3495o.get(i4)).m1941g();
        }
        c0958w.f3495o = arrayList;
    }

    /* renamed from: U */
    public final void m1890U(int i4) {
        this.f3415Q = i4;
        p076T.AbstractC0677U abstractC0677U = this.f3407I.f3579a;
        p102a0.C0958W c0958w = this.f3401C;
        c0958w.f3487g = i4;
        if (!c0958w.m1960o(abstractC0677U)) {
            m1879I(true);
        }
        m1914j(false);
    }

    /* renamed from: V */
    public final void m1891V(boolean z4) {
        this.f3416R = z4;
        p076T.AbstractC0677U abstractC0677U = this.f3407I.f3579a;
        p102a0.C0958W c0958w = this.f3401C;
        c0958w.f3488h = z4;
        if (!c0958w.m1960o(abstractC0677U)) {
            m1879I(true);
        }
        m1914j(false);
    }

    /* renamed from: W */
    public final void m1892W(p179q0.C1991d0 c1991d0) {
        this.f3408J.m1866c(1);
        p102a0.C0971e0 c0971e0 = this.f3402D;
        int size = c0971e0.f3555b.size();
        if (c1991d0.f8129b.length != size) {
            c1991d0 = c1991d0.m4044a().m4045b(0, size);
        }
        c0971e0.f3563j = c1991d0;
        m1916k(c0971e0.m2003b(), false);
    }

    /* renamed from: X */
    public final void m1893X(int i4) {
        p102a0.C0973f0 c0973f0 = this.f3407I;
        if (c0973f0.f3583e != i4) {
            if (i4 != 2) {
                this.f3427c0 = -9223372036854775807L;
            }
            this.f3407I = c0973f0.m2016g(i4);
        }
    }

    /* renamed from: Y */
    public final boolean m1894Y() {
        p102a0.C0973f0 c0973f0 = this.f3407I;
        return c0973f0.f3590l && c0973f0.f3592n == 0;
    }

    /* renamed from: Z */
    public final boolean m1895Z(p076T.AbstractC0677U abstractC0677U, p179q0.C1964F c1964f) {
        if (c1964f.m3968b() || abstractC0677U.m1256p()) {
            return false;
        }
        int i4 = abstractC0677U.mo1251g(c1964f.f7960a, this.f3440w).f2225c;
        p076T.C0676T c0676t = this.f3439v;
        abstractC0677U.m1255n(i4, c0676t);
        return c0676t.m1245a() && c0676t.f2240i && c0676t.f2237f != -9223372036854775807L;
    }

    /* renamed from: a */
    public final void m1896a(p102a0.C0946J c0946j, int i4) {
        this.f3408J.m1866c(1);
        p102a0.C0971e0 c0971e0 = this.f3402D;
        if (i4 == -1) {
            i4 = c0971e0.f3555b.size();
        }
        m1916k(c0971e0.m2002a(i4, c0946j.f3380a, c0946j.f3381b), false);
    }

    /* renamed from: a0 */
    public final void m1897a0() {
        p102a0.C0955T c0955t = this.f3401C.f3489i;
        if (c0955t == null) {
            return;
        }
        p193t0.C2184v c2184v = c0955t.f3466n;
        int i4 = 0;
        while (true) {
            p102a0.AbstractC0970e[] abstractC0970eArr = this.f3429l;
            if (i4 >= abstractC0970eArr.length) {
                return;
            }
            if (c2184v.m4306b(i4)) {
                p102a0.AbstractC0970e abstractC0970e = abstractC0970eArr[i4];
                int i5 = abstractC0970e.f3546s;
                if (i5 == 1) {
                    p086W.AbstractC0781a.m1421j(i5 == 1);
                    abstractC0970e.f3546s = 2;
                    abstractC0970e.mo1997v();
                }
            }
            i4++;
        }
    }

    /* renamed from: b */
    public final void m1898b(p102a0.AbstractC0970e abstractC0970e) {
        if (m1872q(abstractC0970e)) {
            p102a0.C0982k c0982k = this.f3442y;
            if (abstractC0970e == c0982k.f3648n) {
                c0982k.f3649o = null;
                c0982k.f3648n = null;
                c0982k.f3650p = true;
            }
            int i4 = abstractC0970e.f3546s;
            if (i4 == 2) {
                p086W.AbstractC0781a.m1421j(i4 == 2);
                abstractC0970e.f3546s = 1;
                abstractC0970e.mo1998w();
            }
            p086W.AbstractC0781a.m1421j(abstractC0970e.f3546s == 1);
            abstractC0970e.f3541n.m1710N();
            abstractC0970e.f3546s = 0;
            abstractC0970e.f3547t = null;
            abstractC0970e.f3548u = null;
            abstractC0970e.f3552y = false;
            abstractC0970e.mo1992q();
            this.f3420V--;
        }
    }

    /* renamed from: b0 */
    public final void m1899b0(boolean z4, boolean z5) {
        m1874B(z4 || !this.f3417S, false, true, false);
        this.f3408J.m1866c(z5 ? 1 : 0);
        p102a0.C0980j c0980j = this.f3434q;
        if (c0980j.f3642i.remove(this.f3405G) != null) {
            c0980j.m2027d();
        }
        m1893X(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:305:0x05c0, code lost:
    
        if (r2 >= r6.m2025b()) goto L320;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x035d A[EDGE_INSN: B:79:0x035d->B:80:0x035d BREAK  A[LOOP:0: B:39:0x02e1->B:50:0x035a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03b4  */
    /* JADX WARN: Type inference failed for: r0v65, types: [t0.v] */
    /* JADX WARN: Type inference failed for: r1v2, types: [q0.D, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v82, types: [q0.D, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v93, types: [q0.D, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57, types: [int] */
    /* JADX WARN: Type inference failed for: r2v96 */
    /* JADX WARN: Type inference failed for: r3v26, types: [q0.D, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v75, types: [q0.c0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v82, types: [t0.s[]] */
    /* JADX WARN: Type inference failed for: r4v83, types: [t0.s] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20, types: [int] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [int] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32, types: [int] */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [int] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1900c() {
        /*
            Method dump skipped, instructions count: 1891
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p102a0.C0950N.m1900c():void");
    }

    /* renamed from: c0 */
    public final void m1901c0() {
        int i4;
        p102a0.C0982k c0982k = this.f3442y;
        c0982k.f3651q = false;
        p102a0.C0989n0 c0989n0 = c0982k.f3646l;
        if (c0989n0.f3677m) {
            c0989n0.m2030d(c0989n0.mo1934e());
            c0989n0.f3677m = false;
        }
        for (p102a0.AbstractC0970e abstractC0970e : this.f3429l) {
            if (m1872q(abstractC0970e) && (i4 = abstractC0970e.f3546s) == 2) {
                p086W.AbstractC0781a.m1421j(i4 == 2);
                abstractC0970e.f3546s = 1;
                abstractC0970e.mo1998w();
            }
        }
    }

    /* renamed from: d */
    public final void m1902d(boolean[] zArr, long j4) {
        p102a0.AbstractC0970e[] abstractC0970eArr;
        java.util.Set set;
        int i4;
        p102a0.C0958W c0958w;
        p102a0.C0955T c0955t;
        p193t0.C2184v c2184v;
        java.util.Set set2;
        int i5;
        p102a0.InterfaceC0954S interfaceC0954S;
        p102a0.C0958W c0958w2 = this.f3401C;
        p102a0.C0955T c0955t2 = c0958w2.f3490j;
        p193t0.C2184v c2184v2 = c0955t2.f3466n;
        int i6 = 0;
        while (true) {
            abstractC0970eArr = this.f3429l;
            int length = abstractC0970eArr.length;
            set = this.f3430m;
            if (i6 >= length) {
                break;
            }
            if (!c2184v2.m4306b(i6) && set.remove(abstractC0970eArr[i6])) {
                abstractC0970eArr[i6].m1981B();
            }
            i6++;
        }
        int i7 = 0;
        while (i7 < abstractC0970eArr.length) {
            if (c2184v2.m4306b(i7)) {
                boolean z4 = zArr[i7];
                p102a0.AbstractC0970e abstractC0970e = abstractC0970eArr[i7];
                if (!m1872q(abstractC0970e)) {
                    p102a0.C0955T c0955t3 = c0958w2.f3490j;
                    boolean z5 = c0955t3 == c0958w2.f3489i;
                    p193t0.C2184v c2184v3 = c0955t3.f3466n;
                    p102a0.C0985l0 c0985l0 = c2184v3.f8721b[i7];
                    p193t0.InterfaceC2181s interfaceC2181s = c2184v3.f8722c[i7];
                    if (interfaceC2181s != null) {
                        c0958w = c0958w2;
                        i5 = interfaceC2181s.length();
                    } else {
                        c0958w = c0958w2;
                        i5 = 0;
                    }
                    p076T.C0702p[] c0702pArr = new p076T.C0702p[i5];
                    c2184v = c2184v2;
                    for (int i8 = 0; i8 < i5; i8++) {
                        c0702pArr[i8] = interfaceC2181s.mo3974h(i8);
                    }
                    boolean z6 = m1894Y() && this.f3407I.f3583e == 3;
                    boolean z7 = !z4 && z6;
                    this.f3420V++;
                    set.add(abstractC0970e);
                    p179q0.InterfaceC1985a0 interfaceC1985a0 = c0955t3.f3455c[i7];
                    c0955t = c0955t2;
                    boolean z8 = z6;
                    long j5 = c0955t3.f3467o;
                    p102a0.C0956U c0956u = c0955t3.f3458f;
                    p086W.AbstractC0781a.m1421j(abstractC0970e.f3546s == 0);
                    abstractC0970e.f3542o = c0985l0;
                    abstractC0970e.f3546s = 1;
                    abstractC0970e.mo1993r(z7, z5);
                    boolean z9 = z5;
                    i4 = i7;
                    set2 = set;
                    abstractC0970e.m1980A(c0702pArr, interfaceC1985a0, j4, j5, c0956u.f3468a);
                    abstractC0970e.f3552y = false;
                    abstractC0970e.f3550w = j4;
                    abstractC0970e.f3551x = j4;
                    abstractC0970e.mo1994s(j4, z7);
                    abstractC0970e.mo1824d(11, new p102a0.C0945I(this));
                    p102a0.C0982k c0982k = this.f3442y;
                    c0982k.getClass();
                    p102a0.InterfaceC0954S mo1987k = abstractC0970e.mo1987k();
                    if (mo1987k != null && mo1987k != (interfaceC0954S = c0982k.f3649o)) {
                        if (interfaceC0954S != null) {
                            throw new p102a0.C0986m(2, new java.lang.IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                        c0982k.f3649o = mo1987k;
                        c0982k.f3648n = abstractC0970e;
                        ((p112c0.C1214M) mo1987k).mo1931a(c0982k.f3646l.f3680p);
                    }
                    if (z8 && z9) {
                        p086W.AbstractC0781a.m1421j(abstractC0970e.f3546s == 1);
                        abstractC0970e.f3546s = 2;
                        abstractC0970e.mo1997v();
                    }
                    i7 = i4 + 1;
                    set = set2;
                    c0958w2 = c0958w;
                    c2184v2 = c2184v;
                    c0955t2 = c0955t;
                }
            }
            i4 = i7;
            c0958w = c0958w2;
            c0955t = c0955t2;
            c2184v = c2184v2;
            set2 = set;
            i7 = i4 + 1;
            set = set2;
            c0958w2 = c0958w;
            c2184v2 = c2184v;
            c0955t2 = c0955t;
        }
        c0955t2.f3459g = true;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [q0.c0, java.lang.Object] */
    /* renamed from: d0 */
    public final void m1903d0() {
        p102a0.C0955T c0955t = this.f3401C.f3491k;
        boolean z4 = this.f3414P || (c0955t != null && c0955t.f3453a.mo2954c());
        p102a0.C0973f0 c0973f0 = this.f3407I;
        if (z4 != c0973f0.f3585g) {
            this.f3407I = new p102a0.C0973f0(c0973f0.f3579a, c0973f0.f3580b, c0973f0.f3581c, c0973f0.f3582d, c0973f0.f3583e, c0973f0.f3584f, z4, c0973f0.f3586h, c0973f0.f3587i, c0973f0.f3588j, c0973f0.f3589k, c0973f0.f3590l, c0973f0.f3591m, c0973f0.f3592n, c0973f0.f3593o, c0973f0.f3595q, c0973f0.f3596r, c0973f0.f3597s, c0973f0.f3598t, c0973f0.f3594p);
        }
    }

    /* renamed from: e */
    public final long m1904e(p076T.AbstractC0677U abstractC0677U, java.lang.Object obj, long j4) {
        p076T.C0675S c0675s = this.f3440w;
        int i4 = abstractC0677U.mo1251g(obj, c0675s).f2225c;
        p076T.C0676T c0676t = this.f3439v;
        abstractC0677U.m1255n(i4, c0676t);
        if (c0676t.f2237f != -9223372036854775807L && c0676t.m1245a() && c0676t.f2240i) {
            return p086W.AbstractC0805y.m1592M(p086W.AbstractC0805y.m1631z(c0676t.f2238g) - c0676t.f2237f) - (j4 + c0675s.f2227e);
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002d. Please report as an issue. */
    /* renamed from: e0 */
    public final void m1905e0(p193t0.C2184v c2184v) {
        p076T.AbstractC0677U abstractC0677U = this.f3407I.f3579a;
        p193t0.InterfaceC2181s[] interfaceC2181sArr = c2184v.f8722c;
        p102a0.C0980j c0980j = this.f3434q;
        p102a0.C0978i c0978i = (p102a0.C0978i) c0980j.f3642i.get(this.f3405G);
        c0978i.getClass();
        int i4 = c0980j.f3639f;
        if (i4 == -1) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                p102a0.AbstractC0970e[] abstractC0970eArr = this.f3429l;
                int i7 = 13107200;
                if (i5 < abstractC0970eArr.length) {
                    if (interfaceC2181sArr[i5] != null) {
                        switch (abstractC0970eArr[i5].f3540m) {
                            case 0:
                                i7 = 144310272;
                                i6 += i7;
                                break;
                            case 1:
                                i6 += i7;
                                break;
                            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                                i7 = 131072000;
                                i6 += i7;
                                break;
                            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                                i7 = 131072;
                                i6 += i7;
                                break;
                            default:
                                throw new java.lang.IllegalArgumentException();
                        }
                    }
                    i5++;
                } else {
                    i4 = java.lang.Math.max(13107200, i6);
                }
            }
        }
        c0978i.f3624b = i4;
        c0980j.m2027d();
    }

    @Override // p179q0.InterfaceC1987b0
    /* renamed from: f */
    public final void mo1906f(p179q0.InterfaceC1989c0 interfaceC1989c0) {
        this.f3436s.m1569a(9, (p179q0.InterfaceC1962D) interfaceC1989c0).m1567b();
    }

    /* renamed from: f0 */
    public final void m1907f0(int i4, int i5, java.util.List list) {
        this.f3408J.m1866c(1);
        p102a0.C0971e0 c0971e0 = this.f3402D;
        c0971e0.getClass();
        java.util.ArrayList arrayList = c0971e0.f3555b;
        p086W.AbstractC0781a.m1416e(i4 >= 0 && i4 <= i5 && i5 <= arrayList.size());
        p086W.AbstractC0781a.m1416e(list.size() == i5 - i4);
        for (int i6 = i4; i6 < i5; i6++) {
            ((p102a0.C0969d0) arrayList.get(i6)).f3532a.mo2981u((p076T.C0659B) list.get(i6 - i4));
        }
        m1916k(c0971e0.m2003b(), false);
    }

    /* renamed from: g */
    public final android.util.Pair m1908g(p076T.AbstractC0677U abstractC0677U) {
        long j4 = 0;
        if (abstractC0677U.m1256p()) {
            return android.util.Pair.create(p102a0.C0973f0.f3578u, 0L);
        }
        android.util.Pair m1252i = abstractC0677U.m1252i(this.f3439v, this.f3440w, abstractC0677U.mo1247a(this.f3416R), -9223372036854775807L);
        p179q0.C1964F m1958m = this.f3401C.m1958m(abstractC0677U, m1252i.first, 0L);
        long longValue = ((java.lang.Long) m1252i.second).longValue();
        if (m1958m.m3968b()) {
            java.lang.Object obj = m1958m.f7960a;
            p076T.C0675S c0675s = this.f3440w;
            abstractC0677U.mo1251g(obj, c0675s);
            if (m1958m.f7962c == c0675s.m1241e(m1958m.f7961b)) {
                c0675s.f2229g.getClass();
            }
        } else {
            j4 = longValue;
        }
        return android.util.Pair.create(m1958m, java.lang.Long.valueOf(j4));
    }

    /* JADX WARN: Type inference failed for: r1v35, types: [q0.D, java.lang.Object] */
    /* renamed from: g0 */
    public final void m1909g0() {
        p102a0.C0955T c0955t = this.f3401C.f3489i;
        if (c0955t == null) {
            return;
        }
        long mo2965u = c0955t.f3456d ? c0955t.f3453a.mo2965u() : -9223372036854775807L;
        if (mo2965u != -9223372036854775807L) {
            if (!c0955t.m1940f()) {
                this.f3401C.m1957k(c0955t);
                m1914j(false);
                m1923s();
            }
            m1876D(mo2965u);
            if (mo2965u != this.f3407I.f3597s) {
                p102a0.C0973f0 c0973f0 = this.f3407I;
                this.f3407I = m1919n(c0973f0.f3580b, mo2965u, c0973f0.f3581c, mo2965u, true, 5);
            }
        } else {
            p102a0.C0982k c0982k = this.f3442y;
            boolean z4 = c0955t != this.f3401C.f3490j;
            p102a0.AbstractC0970e abstractC0970e = c0982k.f3648n;
            p102a0.C0989n0 c0989n0 = c0982k.f3646l;
            if (abstractC0970e == null || abstractC0970e.mo1990n() || ((z4 && c0982k.f3648n.f3546s != 2) || (!c0982k.f3648n.mo1991p() && (z4 || c0982k.f3648n.m1989m())))) {
                c0982k.f3650p = true;
                if (c0982k.f3651q) {
                    c0989n0.m2031f();
                }
            } else {
                p102a0.InterfaceC0954S interfaceC0954S = c0982k.f3649o;
                interfaceC0954S.getClass();
                long mo1934e = interfaceC0954S.mo1934e();
                if (c0982k.f3650p) {
                    if (mo1934e >= c0989n0.mo1934e()) {
                        c0982k.f3650p = false;
                        if (c0982k.f3651q) {
                            c0989n0.m2031f();
                        }
                    } else if (c0989n0.f3677m) {
                        c0989n0.m2030d(c0989n0.mo1934e());
                        c0989n0.f3677m = false;
                    }
                }
                c0989n0.m2030d(mo1934e);
                p076T.C0668K mo1932b = interfaceC0954S.mo1932b();
                if (!mo1932b.equals(c0989n0.f3680p)) {
                    c0989n0.mo1931a(mo1932b);
                    c0982k.f3647m.f3436s.m1569a(16, mo1932b).m1567b();
                }
            }
            long mo1934e2 = c0982k.mo1934e();
            this.f3422X = mo1934e2;
            long j4 = mo1934e2 - c0955t.f3467o;
            long j5 = this.f3407I.f3597s;
            if (!this.f3443z.isEmpty() && !this.f3407I.f3580b.m3968b()) {
                if (this.f3425a0) {
                    this.f3425a0 = false;
                }
                p102a0.C0973f0 c0973f02 = this.f3407I;
                c0973f02.f3579a.mo1231b(c0973f02.f3580b.f7960a);
                int min = java.lang.Math.min(this.f3424Z, this.f3443z.size());
                if (min > 0 && this.f3443z.get(min - 1) != null) {
                    throw new java.lang.ClassCastException();
                }
                if (min < this.f3443z.size() && this.f3443z.get(min) != null) {
                    throw new java.lang.ClassCastException();
                }
                this.f3424Z = min;
            }
            if (this.f3442y.mo1933c()) {
                boolean z5 = !this.f3408J.f3386c;
                p102a0.C0973f0 c0973f03 = this.f3407I;
                this.f3407I = m1919n(c0973f03.f3580b, j4, c0973f03.f3581c, j4, z5, 6);
            } else {
                p102a0.C0973f0 c0973f04 = this.f3407I;
                c0973f04.f3597s = j4;
                c0973f04.f3598t = android.os.SystemClock.elapsedRealtime();
            }
        }
        this.f3407I.f3595q = this.f3401C.f3491k.m1938d();
        p102a0.C0973f0 c0973f05 = this.f3407I;
        long j6 = c0973f05.f3595q;
        p102a0.C0955T c0955t2 = this.f3401C.f3491k;
        c0973f05.f3596r = c0955t2 == null ? 0L : java.lang.Math.max(0L, j6 - (this.f3422X - c0955t2.f3467o));
        p102a0.C0973f0 c0973f06 = this.f3407I;
        if (c0973f06.f3590l && c0973f06.f3583e == 3 && m1895Z(c0973f06.f3579a, c0973f06.f3580b)) {
            p102a0.C0973f0 c0973f07 = this.f3407I;
            float f4 = 1.0f;
            if (c0973f07.f3593o.f2207a == 1.0f) {
                p102a0.C0976h c0976h = this.f3403E;
                long m1904e = m1904e(c0973f07.f3579a, c0973f07.f3580b.f7960a, c0973f07.f3597s);
                long j7 = this.f3407I.f3595q;
                p102a0.C0955T c0955t3 = this.f3401C.f3491k;
                long max = c0955t3 == null ? 0L : java.lang.Math.max(0L, j7 - (this.f3422X - c0955t3.f3467o));
                if (c0976h.f3611h != -9223372036854775807L) {
                    long j8 = m1904e - max;
                    if (c0976h.f3621r == -9223372036854775807L) {
                        c0976h.f3621r = j8;
                        c0976h.f3622s = 0L;
                    } else {
                        float f5 = 1.0f - c0976h.f3610g;
                        c0976h.f3621r = java.lang.Math.max(j8, (((float) j8) * f5) + (((float) r12) * r0));
                        c0976h.f3622s = (f5 * ((float) java.lang.Math.abs(j8 - r12))) + (r0 * ((float) c0976h.f3622s));
                    }
                    long j9 = c0976h.f3620q;
                    long j10 = c0976h.f3606c;
                    if (j9 == -9223372036854775807L || android.os.SystemClock.elapsedRealtime() - c0976h.f3620q >= j10) {
                        c0976h.f3620q = android.os.SystemClock.elapsedRealtime();
                        long j11 = (c0976h.f3622s * 3) + c0976h.f3621r;
                        long j12 = c0976h.f3616m;
                        float f6 = c0976h.f3607d;
                        if (j12 > j11) {
                            float m1592M = (float) p086W.AbstractC0805y.m1592M(j10);
                            long[] jArr = {j11, c0976h.f3613j, c0976h.f3616m - (((c0976h.f3619p - 1.0f) * m1592M) + ((c0976h.f3617n - 1.0f) * m1592M))};
                            long j13 = jArr[0];
                            for (int i4 = 1; i4 < 3; i4++) {
                                long j14 = jArr[i4];
                                if (j14 > j13) {
                                    j13 = j14;
                                }
                            }
                            c0976h.f3616m = j13;
                        } else {
                            long m1616k = p086W.AbstractC0805y.m1616k(m1904e - (java.lang.Math.max(0.0f, c0976h.f3619p - 1.0f) / f6), c0976h.f3616m, j11);
                            c0976h.f3616m = m1616k;
                            long j15 = c0976h.f3615l;
                            if (j15 != -9223372036854775807L && m1616k > j15) {
                                c0976h.f3616m = j15;
                            }
                        }
                        long j16 = m1904e - c0976h.f3616m;
                        if (java.lang.Math.abs(j16) < c0976h.f3608e) {
                            c0976h.f3619p = 1.0f;
                        } else {
                            c0976h.f3619p = p086W.AbstractC0805y.m1614i((f6 * ((float) j16)) + 1.0f, c0976h.f3618o, c0976h.f3617n);
                        }
                        f4 = c0976h.f3619p;
                    } else {
                        f4 = c0976h.f3619p;
                    }
                }
                if (this.f3442y.mo1932b().f2207a != f4) {
                    p076T.C0668K c0668k = new p076T.C0668K(f4, this.f3407I.f3593o.f2208b);
                    this.f3436s.m1571d(16);
                    this.f3442y.mo1931a(c0668k);
                    m1918m(this.f3407I.f3593o, this.f3442y.mo1932b().f2207a, false, false);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [q0.c0, java.lang.Object] */
    /* renamed from: h */
    public final void m1910h(p179q0.InterfaceC1962D interfaceC1962D) {
        p102a0.C0955T c0955t = this.f3401C.f3491k;
        if (c0955t == null || c0955t.f3453a != interfaceC1962D) {
            return;
        }
        long j4 = this.f3422X;
        if (c0955t != null) {
            p086W.AbstractC0781a.m1421j(c0955t.f3464l == null);
            if (c0955t.f3456d) {
                c0955t.f3453a.mo2966w(j4 - c0955t.f3467o);
            }
        }
        m1923s();
    }

    /* renamed from: h0 */
    public final void m1911h0(p076T.AbstractC0677U abstractC0677U, p179q0.C1964F c1964f, p076T.AbstractC0677U abstractC0677U2, p179q0.C1964F c1964f2, long j4, boolean z4) {
        if (!m1895Z(abstractC0677U, c1964f)) {
            p076T.C0668K c0668k = c1964f.m3968b() ? p076T.C0668K.f2206d : this.f3407I.f3593o;
            p102a0.C0982k c0982k = this.f3442y;
            if (c0982k.mo1932b().equals(c0668k)) {
                return;
            }
            this.f3436s.m1571d(16);
            c0982k.mo1931a(c0668k);
            m1918m(this.f3407I.f3593o, c0668k.f2207a, false, false);
            return;
        }
        java.lang.Object obj = c1964f.f7960a;
        p076T.C0675S c0675s = this.f3440w;
        int i4 = abstractC0677U.mo1251g(obj, c0675s).f2225c;
        p076T.C0676T c0676t = this.f3439v;
        abstractC0677U.m1255n(i4, c0676t);
        p076T.C0710x c0710x = c0676t.f2241j;
        p102a0.C0976h c0976h = this.f3403E;
        c0976h.getClass();
        c0976h.f3611h = p086W.AbstractC0805y.m1592M(c0710x.f2444a);
        c0976h.f3614k = p086W.AbstractC0805y.m1592M(c0710x.f2445b);
        c0976h.f3615l = p086W.AbstractC0805y.m1592M(c0710x.f2446c);
        float f4 = c0710x.f2447d;
        if (f4 == -3.4028235E38f) {
            f4 = c0976h.f3604a;
        }
        c0976h.f3618o = f4;
        float f5 = c0710x.f2448e;
        if (f5 == -3.4028235E38f) {
            f5 = c0976h.f3605b;
        }
        c0976h.f3617n = f5;
        if (f4 == 1.0f && f5 == 1.0f) {
            c0976h.f3611h = -9223372036854775807L;
        }
        c0976h.m2020a();
        if (j4 != -9223372036854775807L) {
            c0976h.f3612i = m1904e(abstractC0677U, obj, j4);
            c0976h.m2020a();
            return;
        }
        if (!p086W.AbstractC0805y.m1606a(!abstractC0677U2.m1256p() ? abstractC0677U2.mo1235m(abstractC0677U2.mo1251g(c1964f2.f7960a, c0675s).f2225c, c0676t, 0L).f2232a : null, c0676t.f2232a) || z4) {
            c0976h.f3612i = -9223372036854775807L;
            c0976h.m2020a();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        p102a0.C0958W c0958w;
        boolean z4;
        p102a0.C0955T c0955t;
        int i4;
        p102a0.C0955T c0955t2;
        int i5;
        try {
            switch (message.what) {
                case 1:
                    boolean z5 = message.arg1 != 0;
                    int i6 = message.arg2;
                    m1887R(i6 >> 4, i6 & 15, z5, true);
                    break;
                case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                    m1900c();
                    break;
                case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                    m1880J((p102a0.C0949M) message.obj);
                    break;
                case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                    m1888S((p076T.C0668K) message.obj);
                    break;
                case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                    this.f3406H = (p102a0.C0987m0) message.obj;
                    break;
                case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                    m1899b0(false, true);
                    break;
                case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                    m1928x();
                    return true;
                case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                    m1917l((p179q0.InterfaceC1962D) message.obj);
                    break;
                case 9:
                    m1910h((p179q0.InterfaceC1962D) message.obj);
                    break;
                case 10:
                    m1873A();
                    break;
                case 11:
                    m1890U(message.arg1);
                    break;
                case 12:
                    m1891V(message.arg1 != 0);
                    break;
                case 13:
                    m1884O(message.arg1 != 0, (java.util.concurrent.atomic.AtomicBoolean) message.obj);
                    break;
                case 14:
                    p102a0.C0979i0 c0979i0 = (p102a0.C0979i0) message.obj;
                    c0979i0.getClass();
                    m1882L(c0979i0);
                    break;
                case 15:
                    m1883M((p102a0.C0979i0) message.obj);
                    break;
                case 16:
                    p076T.C0668K c0668k = (p076T.C0668K) message.obj;
                    m1918m(c0668k, c0668k.f2207a, true, false);
                    break;
                case 17:
                    m1885P((p102a0.C0946J) message.obj);
                    break;
                case 18:
                    m1896a((p102a0.C0946J) message.obj, message.arg1);
                    break;
                case 19:
                    p009B2.AbstractC0051h.m159r(message.obj);
                    m1926v();
                    throw null;
                case 20:
                    m1930z(message.arg1, message.arg2, (p179q0.C1991d0) message.obj);
                    break;
                case 21:
                    m1892W((p179q0.C1991d0) message.obj);
                    break;
                case 22:
                    m1925u();
                    break;
                case 23:
                    m1886Q(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    m1873A();
                    m1879I(true);
                    break;
                case 26:
                    m1873A();
                    m1879I(true);
                    break;
                case 27:
                    m1907f0(message.arg1, message.arg2, (java.util.List) message.obj);
                    break;
                case 28:
                    m1889T((p102a0.C0993r) message.obj);
                    break;
                case 29:
                    m1927w();
                    break;
            }
        } catch (p076T.C0666I e4) {
            boolean z6 = e4.f2202l;
            int i7 = e4.f2203m;
            if (i7 == 1) {
                i5 = z6 ? 3001 : 3003;
            } else {
                if (i7 == 4) {
                    i5 = z6 ? 3002 : 3004;
                }
                m1912i(e4, r4);
            }
            r4 = i5;
            m1912i(e4, r4);
        } catch (p094Y.C0871i e5) {
            m1912i(e5, e5.f3121l);
        } catch (p102a0.C0986m e6) {
            p102a0.C0986m c0986m = e6;
            int i8 = c0986m.f3664n;
            p102a0.C0958W c0958w2 = this.f3401C;
            if (i8 != 1 || (c0955t2 = c0958w2.f3490j) == null) {
                c0958w = c0958w2;
            } else {
                c0958w = c0958w2;
                c0986m = new p102a0.C0986m(c0986m.getMessage(), c0986m.getCause(), c0986m.f2204l, c0986m.f3664n, c0986m.f3665o, c0986m.f3666p, c0986m.f3667q, c0986m.f3668r, c0955t2.f3458f.f3468a, c0986m.f2205m, c0986m.f3670t);
            }
            if (c0986m.f3670t && (this.f3426b0 == null || (i4 = c0986m.f2204l) == 5004 || i4 == 5003)) {
                p086W.AbstractC0781a.m1411B("ExoPlayerImplInternal", "Recoverable renderer error", c0986m);
                p102a0.C0986m c0986m2 = this.f3426b0;
                if (c0986m2 != null) {
                    c0986m2.addSuppressed(c0986m);
                    c0986m = this.f3426b0;
                } else {
                    this.f3426b0 = c0986m;
                }
                p086W.C0802v c0802v = this.f3436s;
                p086W.C0801u m1569a = c0802v.m1569a(25, c0986m);
                c0802v.getClass();
                android.os.Message message2 = m1569a.f2793a;
                message2.getClass();
                c0802v.f2795a.sendMessageAtFrontOfQueue(message2);
                m1569a.m1566a();
                z4 = true;
            } else {
                p102a0.C0986m c0986m3 = this.f3426b0;
                if (c0986m3 != null) {
                    c0986m3.addSuppressed(c0986m);
                    c0986m = this.f3426b0;
                }
                p102a0.C0986m c0986m4 = c0986m;
                p086W.AbstractC0781a.m1426o("ExoPlayerImplInternal", "Playback error", c0986m4);
                if (c0986m4.f3664n == 1) {
                    p102a0.C0958W c0958w3 = c0958w;
                    if (c0958w3.f3489i != c0958w3.f3490j) {
                        while (true) {
                            c0955t = c0958w3.f3489i;
                            if (c0955t == c0958w3.f3490j) {
                                break;
                            }
                            c0958w3.m1947a();
                        }
                        c0955t.getClass();
                        m1924t();
                        p102a0.C0956U c0956u = c0955t.f3458f;
                        p179q0.C1964F c1964f = c0956u.f3468a;
                        long j4 = c0956u.f3469b;
                        this.f3407I = m1919n(c1964f, j4, c0956u.f3470c, j4, true, 0);
                    }
                    z4 = true;
                } else {
                    z4 = true;
                }
                m1899b0(z4, false);
                this.f3407I = this.f3407I.m2014e(c0986m4);
            }
        } catch (p127f0.C1370c e7) {
            m1912i(e7, e7.f5646l);
        } catch (java.lang.RuntimeException e8) {
            p102a0.C0986m c0986m5 = new p102a0.C0986m(2, e8, ((e8 instanceof java.lang.IllegalStateException) || (e8 instanceof java.lang.IllegalArgumentException)) ? 1004 : 1000);
            p086W.AbstractC0781a.m1426o("ExoPlayerImplInternal", "Playback error", c0986m5);
            m1899b0(true, false);
            this.f3407I = this.f3407I.m2014e(c0986m5);
        } catch (p179q0.C1986b e9) {
            m1912i(e9, 1002);
        } catch (java.io.IOException e10) {
            m1912i(e10, 2000);
        }
        z4 = true;
        m1924t();
        return z4;
    }

    /* renamed from: i */
    public final void m1912i(java.io.IOException iOException, int i4) {
        p102a0.C0986m c0986m = new p102a0.C0986m(0, iOException, i4);
        p102a0.C0955T c0955t = this.f3401C.f3489i;
        if (c0955t != null) {
            p102a0.C0956U c0956u = c0955t.f3458f;
            c0986m = new p102a0.C0986m(c0986m.getMessage(), c0986m.getCause(), c0986m.f2204l, c0986m.f3664n, c0986m.f3665o, c0986m.f3666p, c0986m.f3667q, c0986m.f3668r, c0956u.f3468a, c0986m.f2205m, c0986m.f3670t);
        }
        p086W.AbstractC0781a.m1426o("ExoPlayerImplInternal", "Playback error", c0986m);
        m1899b0(false, false);
        this.f3407I = this.f3407I.m2014e(c0986m);
    }

    /* renamed from: i0 */
    public final void m1913i0(boolean z4, boolean z5) {
        long j4;
        this.f3412N = z4;
        if (!z4 || z5) {
            j4 = -9223372036854775807L;
        } else {
            this.f3399A.getClass();
            j4 = android.os.SystemClock.elapsedRealtime();
        }
        this.f3413O = j4;
    }

    /* renamed from: j */
    public final void m1914j(boolean z4) {
        p102a0.C0955T c0955t = this.f3401C.f3491k;
        p179q0.C1964F c1964f = c0955t == null ? this.f3407I.f3580b : c0955t.f3458f.f3468a;
        boolean equals = this.f3407I.f3589k.equals(c1964f);
        if (!equals) {
            this.f3407I = this.f3407I.m2011b(c1964f);
        }
        p102a0.C0973f0 c0973f0 = this.f3407I;
        c0973f0.f3595q = c0955t == null ? c0973f0.f3597s : c0955t.m1938d();
        p102a0.C0973f0 c0973f02 = this.f3407I;
        long j4 = c0973f02.f3595q;
        p102a0.C0955T c0955t2 = this.f3401C.f3491k;
        c0973f02.f3596r = c0955t2 != null ? java.lang.Math.max(0L, j4 - (this.f3422X - c0955t2.f3467o)) : 0L;
        if ((!equals || z4) && c0955t != null && c0955t.f3456d) {
            m1905e0(c0955t.f3466n);
        }
    }

    /* renamed from: j0 */
    public final synchronized void m1915j0(p102a0.C0988n c0988n, long j4) {
        this.f3399A.getClass();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() + j4;
        boolean z4 = false;
        while (!((java.lang.Boolean) c0988n.get()).booleanValue() && j4 > 0) {
            try {
                this.f3399A.getClass();
                wait(j4);
            } catch (java.lang.InterruptedException unused) {
                z4 = true;
            }
            this.f3399A.getClass();
            j4 = elapsedRealtime - android.os.SystemClock.elapsedRealtime();
        }
        if (z4) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02e1 A[Catch: all -> 0x02e7, TryCatch #2 {all -> 0x02e7, blocks: (B:75:0x02db, B:77:0x02e1, B:20:0x0306, B:22:0x0313, B:24:0x0319, B:26:0x0323, B:28:0x0330, B:31:0x0333, B:34:0x033e), top: B:18:0x027f }] */
    /* JADX WARN: Type inference failed for: r13v1, types: [long] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2, types: [a0.M] */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v11 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v17 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [a0.N] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1916k(p076T.AbstractC0677U r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 1108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p102a0.C0950N.m1916k(T.U, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [q0.D, java.lang.Object] */
    /* renamed from: l */
    public final void m1917l(p179q0.InterfaceC1962D interfaceC1962D) {
        p102a0.C0958W c0958w = this.f3401C;
        p102a0.C0955T c0955t = c0958w.f3491k;
        if (c0955t == null || c0955t.f3453a != interfaceC1962D) {
            return;
        }
        float f4 = this.f3442y.mo1932b().f2207a;
        p076T.AbstractC0677U abstractC0677U = this.f3407I.f3579a;
        c0955t.f3456d = true;
        c0955t.f3465m = c0955t.f3453a.mo2956e();
        p193t0.C2184v m1942h = c0955t.m1942h(f4, abstractC0677U);
        p102a0.C0956U c0956u = c0955t.f3458f;
        long j4 = c0956u.f3472e;
        long j5 = c0956u.f3469b;
        long m1935a = c0955t.m1935a(m1942h, (j4 == -9223372036854775807L || j5 < j4) ? j5 : java.lang.Math.max(0L, j4 - 1), false, new boolean[c0955t.f3461i.length]);
        long j6 = c0955t.f3467o;
        p102a0.C0956U c0956u2 = c0955t.f3458f;
        c0955t.f3467o = (c0956u2.f3469b - m1935a) + j6;
        c0955t.f3458f = c0956u2.m1945b(m1935a);
        m1905e0(c0955t.f3466n);
        if (c0955t == c0958w.f3489i) {
            m1876D(c0955t.f3458f.f3469b);
            m1902d(new boolean[this.f3429l.length], c0958w.f3490j.m1939e());
            p102a0.C0973f0 c0973f0 = this.f3407I;
            p179q0.C1964F c1964f = c0973f0.f3580b;
            long j7 = c0955t.f3458f.f3469b;
            this.f3407I = m1919n(c1964f, j7, c0973f0.f3581c, j7, false, 5);
        }
        m1923s();
    }

    /* renamed from: m */
    public final void m1918m(p076T.C0668K c0668k, float f4, boolean z4, boolean z5) {
        int i4;
        if (z4) {
            if (z5) {
                this.f3408J.m1866c(1);
            }
            this.f3407I = this.f3407I.m2015f(c0668k);
        }
        float f5 = c0668k.f2207a;
        p102a0.C0955T c0955t = this.f3401C.f3489i;
        while (true) {
            i4 = 0;
            if (c0955t == null) {
                break;
            }
            p193t0.InterfaceC2181s[] interfaceC2181sArr = c0955t.f3466n.f8722c;
            int length = interfaceC2181sArr.length;
            while (i4 < length) {
                p193t0.InterfaceC2181s interfaceC2181s = interfaceC2181sArr[i4];
                if (interfaceC2181s != null) {
                    interfaceC2181s.mo3976j(f5);
                }
                i4++;
            }
            c0955t = c0955t.f3464l;
        }
        p102a0.AbstractC0970e[] abstractC0970eArr = this.f3429l;
        int length2 = abstractC0970eArr.length;
        while (i4 < length2) {
            p102a0.AbstractC0970e abstractC0970e = abstractC0970eArr[i4];
            if (abstractC0970e != null) {
                abstractC0970e.mo1982C(f4, c0668k.f2207a);
            }
            i4++;
        }
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [f2.F, f2.C] */
    /* renamed from: n */
    public final p102a0.C0973f0 m1919n(p179q0.C1964F c1964f, long j4, long j5, long j6, boolean z4, int i4) {
        p179q0.C2005k0 c2005k0;
        p193t0.C2184v c2184v;
        java.util.List list;
        p129f2.C1415c0 c1415c0;
        boolean z5;
        int i5;
        int i6;
        this.f3425a0 = (!this.f3425a0 && j4 == this.f3407I.f3597s && c1964f.equals(this.f3407I.f3580b)) ? false : true;
        m1875C();
        p102a0.C0973f0 c0973f0 = this.f3407I;
        p179q0.C2005k0 c2005k02 = c0973f0.f3586h;
        p193t0.C2184v c2184v2 = c0973f0.f3587i;
        java.util.List list2 = c0973f0.f3588j;
        if (this.f3402D.f3564k) {
            p102a0.C0955T c0955t = this.f3401C.f3489i;
            p179q0.C2005k0 c2005k03 = c0955t == null ? p179q0.C2005k0.f8183d : c0955t.f3465m;
            p193t0.C2184v c2184v3 = c0955t == null ? this.f3433p : c0955t.f3466n;
            p193t0.InterfaceC2181s[] interfaceC2181sArr = c2184v3.f8722c;
            ?? abstractC1387C = new p129f2.AbstractC1387C(4);
            int length = interfaceC2181sArr.length;
            int i7 = 0;
            boolean z6 = false;
            while (i7 < length) {
                p193t0.InterfaceC2181s interfaceC2181s = interfaceC2181sArr[i7];
                if (interfaceC2181s != null) {
                    p076T.C0664G c0664g = interfaceC2181s.mo3974h(0).f2406k;
                    if (c0664g == null) {
                        abstractC1387C.m3145a(new p076T.C0664G(new p076T.InterfaceC0663F[0]));
                    } else {
                        abstractC1387C.m3145a(c0664g);
                        i6 = 1;
                        z6 = true;
                        i7 += i6;
                    }
                }
                i6 = 1;
                i7 += i6;
            }
            if (z6) {
                c1415c0 = abstractC1387C.m3157g();
            } else {
                p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
                c1415c0 = p129f2.C1415c0.f5744p;
            }
            if (c0955t != null) {
                p102a0.C0956U c0956u = c0955t.f3458f;
                if (c0956u.f3470c != j5) {
                    c0955t.f3458f = c0956u.m1944a(j5);
                }
            }
            p102a0.C0955T c0955t2 = this.f3401C.f3489i;
            if (c0955t2 != null) {
                p193t0.C2184v c2184v4 = c0955t2.f3466n;
                boolean z7 = false;
                int i8 = 0;
                while (true) {
                    p102a0.AbstractC0970e[] abstractC0970eArr = this.f3429l;
                    if (i8 >= abstractC0970eArr.length) {
                        z5 = true;
                        break;
                    }
                    if (c2184v4.m4306b(i8)) {
                        i5 = 1;
                        if (abstractC0970eArr[i8].f3540m != 1) {
                            z5 = false;
                            break;
                        }
                        if (c2184v4.f8721b[i8].f3662a != 0) {
                            z7 = true;
                        }
                    } else {
                        i5 = 1;
                    }
                    i8 += i5;
                }
                boolean z8 = z7 && z5;
                if (z8 != this.f3419U) {
                    this.f3419U = z8;
                    if (!z8 && this.f3407I.f3594p) {
                        this.f3436s.m1572e(2);
                    }
                }
            }
            list = c1415c0;
            c2005k0 = c2005k03;
            c2184v = c2184v3;
        } else if (c1964f.equals(c0973f0.f3580b)) {
            c2005k0 = c2005k02;
            c2184v = c2184v2;
            list = list2;
        } else {
            c2005k0 = p179q0.C2005k0.f8183d;
            c2184v = this.f3433p;
            list = p129f2.C1415c0.f5744p;
        }
        if (z4) {
            p102a0.C0947K c0947k = this.f3408J;
            if (!c0947k.f3386c || c0947k.f3387d == 5) {
                c0947k.f3385b = true;
                c0947k.f3386c = true;
                c0947k.f3387d = i4;
            } else {
                p086W.AbstractC0781a.m1416e(i4 == 5);
            }
        }
        p102a0.C0973f0 c0973f02 = this.f3407I;
        long j7 = c0973f02.f3595q;
        p102a0.C0955T c0955t3 = this.f3401C.f3491k;
        return c0973f02.m2012c(c1964f, j4, j5, j6, c0955t3 == null ? 0L : java.lang.Math.max(0L, j7 - (this.f3422X - c0955t3.f3467o)), c2005k0, c2184v, list);
    }

    @Override // p179q0.InterfaceC1961C
    /* renamed from: o */
    public final void mo1920o(p179q0.InterfaceC1962D interfaceC1962D) {
        this.f3436s.m1569a(8, interfaceC1962D).m1567b();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [q0.D, q0.c0, java.lang.Object] */
    /* renamed from: p */
    public final boolean m1921p() {
        p102a0.C0955T c0955t = this.f3401C.f3491k;
        if (c0955t == null) {
            return false;
        }
        try {
            ?? r22 = c0955t.f3453a;
            if (c0955t.f3456d) {
                for (p179q0.InterfaceC1985a0 interfaceC1985a0 : c0955t.f3455c) {
                    if (interfaceC1985a0 != null) {
                        interfaceC1985a0.mo49a();
                    }
                }
            } else {
                r22.mo2960j();
            }
            return (!c0955t.f3456d ? 0L : r22.mo2964r()) != Long.MIN_VALUE;
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    /* renamed from: r */
    public final boolean m1922r() {
        p102a0.C0955T c0955t = this.f3401C.f3489i;
        long j4 = c0955t.f3458f.f3472e;
        return c0955t.f3456d && (j4 == -9223372036854775807L || this.f3407I.f3597s < j4 || !m1894Y());
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [q0.c0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [q0.c0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [q0.D, java.lang.Object] */
    /* renamed from: s */
    public final void m1923s() {
        boolean m2026c;
        if (m1921p()) {
            p102a0.C0955T c0955t = this.f3401C.f3491k;
            long mo2964r = !c0955t.f3456d ? 0L : c0955t.f3453a.mo2964r();
            p102a0.C0955T c0955t2 = this.f3401C.f3491k;
            long max = c0955t2 == null ? 0L : java.lang.Math.max(0L, mo2964r - (this.f3422X - c0955t2.f3467o));
            p102a0.C0955T c0955t3 = this.f3401C.f3489i;
            long j4 = m1895Z(this.f3407I.f3579a, c0955t.f3458f.f3468a) ? this.f3403E.f3616m : -9223372036854775807L;
            p107b0.C1177l c1177l = this.f3405G;
            p076T.AbstractC0677U abstractC0677U = this.f3407I.f3579a;
            float f4 = this.f3442y.mo1932b().f2207a;
            boolean z4 = this.f3407I.f3590l;
            p102a0.C0951O c0951o = new p102a0.C0951O(c1177l, max, f4, this.f3412N, j4);
            m2026c = this.f3434q.m2026c(c0951o);
            p102a0.C0955T c0955t4 = this.f3401C.f3489i;
            if (!m2026c && c0955t4.f3456d && max < 500000 && this.f3441x > 0) {
                c0955t4.f3453a.mo2962m(this.f3407I.f3597s);
                m2026c = this.f3434q.m2026c(c0951o);
            }
        } else {
            m2026c = false;
        }
        this.f3414P = m2026c;
        if (m2026c) {
            p102a0.C0955T c0955t5 = this.f3401C.f3491k;
            long j5 = this.f3422X;
            float f5 = this.f3442y.mo1932b().f2207a;
            long j6 = this.f3413O;
            p086W.AbstractC0781a.m1421j(c0955t5.f3464l == null);
            long j7 = j5 - c0955t5.f3467o;
            ?? r12 = c0955t5.f3453a;
            p102a0.C0952P c0952p = new p102a0.C0952P();
            c0952p.f3447a = j7;
            p086W.AbstractC0781a.m1416e(f5 > 0.0f || f5 == -3.4028235E38f);
            c0952p.f3448b = f5;
            p086W.AbstractC0781a.m1416e(j6 >= 0 || j6 == -9223372036854775807L);
            c0952p.f3449c = j6;
            r12.mo2959i(new p102a0.C0953Q(c0952p));
        }
        m1903d0();
    }

    /* renamed from: t */
    public final void m1924t() {
        p102a0.C0947K c0947k = this.f3408J;
        p102a0.C0973f0 c0973f0 = this.f3407I;
        boolean z4 = c0947k.f3385b | (((p102a0.C0973f0) c0947k.f3388e) != c0973f0);
        c0947k.f3385b = z4;
        c0947k.f3388e = c0973f0;
        if (z4) {
            p102a0.C0944H c0944h = this.f3400B.f3716l;
            c0944h.f3361i.m1570c(new p086W.RunnableC0793m(2, c0944h, c0947k));
            this.f3408J = new p102a0.C0947K(this.f3407I);
        }
    }

    /* renamed from: u */
    public final void m1925u() {
        m1916k(this.f3402D.m2003b(), true);
    }

    /* renamed from: v */
    public final void m1926v() {
        this.f3408J.m1866c(1);
        throw null;
    }

    /* renamed from: w */
    public final void m1927w() {
        this.f3408J.m1866c(1);
        int i4 = 0;
        m1874B(false, false, false, true);
        p102a0.C0980j c0980j = this.f3434q;
        c0980j.getClass();
        long id = java.lang.Thread.currentThread().getId();
        long j4 = c0980j.f3643j;
        p086W.AbstractC0781a.m1420i("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j4 == -1 || j4 == id);
        c0980j.f3643j = id;
        java.util.HashMap hashMap = c0980j.f3642i;
        p107b0.C1177l c1177l = this.f3405G;
        if (!hashMap.containsKey(c1177l)) {
            hashMap.put(c1177l, new java.lang.Object());
        }
        p102a0.C0978i c0978i = (p102a0.C0978i) hashMap.get(c1177l);
        c0978i.getClass();
        int i5 = c0980j.f3639f;
        if (i5 == -1) {
            i5 = 13107200;
        }
        c0978i.f3624b = i5;
        c0978i.f3623a = false;
        m1893X(this.f3407I.f3579a.m1256p() ? 4 : 2);
        p197u0.C2220g c2220g = (p197u0.C2220g) this.f3435r;
        c2220g.getClass();
        p102a0.C0971e0 c0971e0 = this.f3402D;
        p086W.AbstractC0781a.m1421j(!c0971e0.f3564k);
        c0971e0.f3565l = c2220g;
        while (true) {
            java.util.ArrayList arrayList = c0971e0.f3555b;
            if (i4 >= arrayList.size()) {
                c0971e0.f3564k = true;
                this.f3436s.m1572e(2);
                return;
            } else {
                p102a0.C0969d0 c0969d0 = (p102a0.C0969d0) arrayList.get(i4);
                c0971e0.m2006e(c0969d0);
                c0971e0.f3560g.add(c0969d0);
                i4++;
            }
        }
    }

    /* renamed from: x */
    public final void m1928x() {
        try {
            m1874B(true, false, true, false);
            m1929y();
            p102a0.C0980j c0980j = this.f3434q;
            if (c0980j.f3642i.remove(this.f3405G) != null) {
                c0980j.m2027d();
            }
            if (c0980j.f3642i.isEmpty()) {
                c0980j.f3643j = -1L;
            }
            m1893X(1);
            android.os.HandlerThread handlerThread = this.f3437t;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            synchronized (this) {
                this.f3409K = true;
                notifyAll();
            }
        } catch (java.lang.Throwable th) {
            android.os.HandlerThread handlerThread2 = this.f3437t;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            synchronized (this) {
                this.f3409K = true;
                notifyAll();
                throw th;
            }
        }
    }

    /* renamed from: y */
    public final void m1929y() {
        for (int i4 = 0; i4 < this.f3429l.length; i4++) {
            p102a0.AbstractC0970e abstractC0970e = this.f3431n[i4];
            synchronized (abstractC0970e.f3539l) {
                abstractC0970e.f3538B = null;
            }
            p102a0.AbstractC0970e abstractC0970e2 = this.f3429l[i4];
            p086W.AbstractC0781a.m1421j(abstractC0970e2.f3546s == 0);
            abstractC0970e2.mo1995t();
        }
    }

    /* renamed from: z */
    public final void m1930z(int i4, int i5, p179q0.C1991d0 c1991d0) {
        this.f3408J.m1866c(1);
        p102a0.C0971e0 c0971e0 = this.f3402D;
        c0971e0.getClass();
        p086W.AbstractC0781a.m1416e(i4 >= 0 && i4 <= i5 && i5 <= c0971e0.f3555b.size());
        c0971e0.f3563j = c1991d0;
        c0971e0.m2008g(i4, i5);
        m1916k(c0971e0.m2003b(), false);
    }
}
