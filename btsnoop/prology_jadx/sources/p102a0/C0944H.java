package p102a0;

/* renamed from: a0.H */
/* loaded from: classes.dex */
public final class C0944H extends p021E0.AbstractC0193e implements p102a0.InterfaceC0994s {

    /* renamed from: A */
    public final p046L1.C0363g f3321A;

    /* renamed from: B */
    public final long f3322B;

    /* renamed from: C */
    public int f3323C;

    /* renamed from: D */
    public boolean f3324D;

    /* renamed from: E */
    public int f3325E;

    /* renamed from: F */
    public int f3326F;

    /* renamed from: G */
    public boolean f3327G;

    /* renamed from: H */
    public final p102a0.C0987m0 f3328H;

    /* renamed from: I */
    public p179q0.C1991d0 f3329I;

    /* renamed from: J */
    public final p102a0.C0993r f3330J;

    /* renamed from: K */
    public p076T.C0669L f3331K;

    /* renamed from: L */
    public p076T.C0662E f3332L;

    /* renamed from: M */
    public p076T.C0702p f3333M;

    /* renamed from: N */
    public android.media.AudioTrack f3334N;

    /* renamed from: O */
    public android.view.Surface f3335O;

    /* renamed from: P */
    public android.view.Surface f3336P;

    /* renamed from: Q */
    public android.view.SurfaceHolder f3337Q;

    /* renamed from: R */
    public boolean f3338R;

    /* renamed from: S */
    public final int f3339S;

    /* renamed from: T */
    public p086W.C0799s f3340T;

    /* renamed from: U */
    public final int f3341U;

    /* renamed from: V */
    public p076T.C0691e f3342V;

    /* renamed from: W */
    public float f3343W;

    /* renamed from: X */
    public boolean f3344X;

    /* renamed from: Y */
    public final boolean f3345Y;

    /* renamed from: Z */
    public boolean f3346Z;

    /* renamed from: a0 */
    public final int f3347a0;

    /* renamed from: b */
    public final p193t0.C2184v f3348b;

    /* renamed from: b0 */
    public boolean f3349b0;

    /* renamed from: c */
    public final p076T.C0669L f3350c;

    /* renamed from: c0 */
    public p076T.C0690d0 f3351c0;

    /* renamed from: d */
    public final p078T2.C0737n f3352d;

    /* renamed from: d0 */
    public p076T.C0662E f3353d0;

    /* renamed from: e */
    public final android.content.Context f3354e;

    /* renamed from: e0 */
    public p102a0.C0973f0 f3355e0;

    /* renamed from: f */
    public final p076T.InterfaceC0672O f3356f;

    /* renamed from: f0 */
    public int f3357f0;

    /* renamed from: g */
    public final p102a0.AbstractC0970e[] f3358g;

    /* renamed from: g0 */
    public long f3359g0;

    /* renamed from: h */
    public final p193t0.AbstractC2183u f3360h;

    /* renamed from: i */
    public final p086W.C0802v f3361i;

    /* renamed from: j */
    public final p102a0.C1001z f3362j;

    /* renamed from: k */
    public final p102a0.C0950N f3363k;

    /* renamed from: l */
    public final p086W.C0791k f3364l;

    /* renamed from: m */
    public final java.util.concurrent.CopyOnWriteArraySet f3365m;

    /* renamed from: n */
    public final p076T.C0675S f3366n;

    /* renamed from: o */
    public final java.util.ArrayList f3367o;

    /* renamed from: p */
    public final boolean f3368p;

    /* renamed from: q */
    public final p179q0.InterfaceC1963E f3369q;

    /* renamed from: r */
    public final p107b0.C1170e f3370r;

    /* renamed from: s */
    public final android.os.Looper f3371s;

    /* renamed from: t */
    public final p197u0.InterfaceC2217d f3372t;

    /* renamed from: u */
    public final p086W.C0800t f3373u;

    /* renamed from: v */
    public final p102a0.SurfaceHolderCallbackC0941E f3374v;

    /* renamed from: w */
    public final p102a0.C0942F f3375w;

    /* renamed from: x */
    public final p096Y1.C0890a f3376x;

    /* renamed from: y */
    public final p102a0.C0968d f3377y;

    /* renamed from: z */
    public final p025F1.C0215g f3378z;

    static {
        p076T.AbstractC0660C.m1179a("media3.exoplayer");
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [T2.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, a0.F] */
    /* JADX WARN: Type inference failed for: r2v17, types: [Y1.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [F1.g, java.lang.Object] */
    public C0944H(p102a0.C0992q c0992q) {
        super(2);
        this.f3352d = new java.lang.Object();
        try {
            p086W.AbstractC0781a.m1429r("ExoPlayerImpl", "Init " + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + p086W.AbstractC0805y.f2805e + "]");
            android.content.Context context = c0992q.f3684a;
            android.os.Looper looper = c0992q.f3691h;
            this.f3354e = context.getApplicationContext();
            p086W.C0800t c0800t = c0992q.f3685b;
            this.f3370r = new p107b0.C1170e(c0800t);
            this.f3347a0 = c0992q.f3692i;
            this.f3342V = c0992q.f3693j;
            this.f3339S = c0992q.f3694k;
            this.f3344X = false;
            this.f3322B = c0992q.f3699p;
            p102a0.SurfaceHolderCallbackC0941E surfaceHolderCallbackC0941E = new p102a0.SurfaceHolderCallbackC0941E(this);
            this.f3374v = surfaceHolderCallbackC0941E;
            this.f3375w = new java.lang.Object();
            android.os.Handler handler = new android.os.Handler(looper);
            p102a0.AbstractC0970e[] m2028a = ((p102a0.C0984l) c0992q.f3686c.get()).m2028a(handler, surfaceHolderCallbackC0941E, surfaceHolderCallbackC0941E, surfaceHolderCallbackC0941E, surfaceHolderCallbackC0941E);
            this.f3358g = m2028a;
            p086W.AbstractC0781a.m1421j(m2028a.length > 0);
            this.f3360h = (p193t0.AbstractC2183u) c0992q.f3688e.get();
            this.f3369q = (p179q0.InterfaceC1963E) c0992q.f3687d.get();
            this.f3372t = (p197u0.InterfaceC2217d) c0992q.f3690g.get();
            this.f3368p = c0992q.f3695l;
            this.f3328H = c0992q.f3696m;
            this.f3371s = looper;
            this.f3373u = c0800t;
            this.f3356f = this;
            this.f3364l = new p086W.C0791k(looper, c0800t, new p102a0.C1001z(this));
            this.f3365m = new java.util.concurrent.CopyOnWriteArraySet();
            this.f3367o = new java.util.ArrayList();
            this.f3329I = new p179q0.C1991d0();
            this.f3330J = p102a0.C0993r.f3703a;
            this.f3348b = new p193t0.C2184v(new p102a0.C0985l0[m2028a.length], new p193t0.InterfaceC2181s[m2028a.length], p076T.C0684a0.f2303b, null);
            this.f3366n = new p076T.C0675S();
            android.util.SparseBooleanArray sparseBooleanArray = new android.util.SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i4 = 0; i4 < 20; i4++) {
                int i5 = iArr[i4];
                p086W.AbstractC0781a.m1421j(!false);
                sparseBooleanArray.append(i5, true);
            }
            this.f3360h.getClass();
            p086W.AbstractC0781a.m1421j(!false);
            sparseBooleanArray.append(29, true);
            p086W.AbstractC0781a.m1421j(!false);
            p076T.C0700n c0700n = new p076T.C0700n(sparseBooleanArray);
            this.f3350c = new p076T.C0669L(c0700n);
            android.util.SparseBooleanArray sparseBooleanArray2 = new android.util.SparseBooleanArray();
            for (int i6 = 0; i6 < c0700n.f2349a.size(); i6++) {
                int m1286a = c0700n.m1286a(i6);
                p086W.AbstractC0781a.m1421j(!false);
                sparseBooleanArray2.append(m1286a, true);
            }
            p086W.AbstractC0781a.m1421j(!false);
            sparseBooleanArray2.append(4, true);
            p086W.AbstractC0781a.m1421j(!false);
            sparseBooleanArray2.append(10, true);
            p086W.AbstractC0781a.m1421j(!false);
            this.f3331K = new p076T.C0669L(new p076T.C0700n(sparseBooleanArray2));
            this.f3361i = this.f3373u.m1565a(this.f3371s, null);
            p102a0.C1001z c1001z = new p102a0.C1001z(this);
            this.f3362j = c1001z;
            this.f3355e0 = p102a0.C0973f0.m2009i(this.f3348b);
            this.f3370r.m2743M(this.f3356f, this.f3371s);
            int i7 = p086W.AbstractC0805y.f2801a;
            java.lang.String str = c0992q.f3702s;
            this.f3363k = new p102a0.C0950N(this.f3358g, this.f3360h, this.f3348b, (p102a0.C0980j) c0992q.f3689f.get(), this.f3372t, this.f3323C, this.f3324D, this.f3370r, this.f3328H, c0992q.f3697n, c0992q.f3698o, this.f3371s, this.f3373u, c1001z, i7 < 31 ? new p107b0.C1177l(str) : p102a0.AbstractC0939C.m1820a(this.f3354e, this, c0992q.f3700q, str), this.f3330J);
            this.f3343W = 1.0f;
            this.f3323C = 0;
            p076T.C0662E c0662e = p076T.C0662E.f2173y;
            this.f3332L = c0662e;
            this.f3353d0 = c0662e;
            this.f3357f0 = -1;
            if (i7 < 21) {
                android.media.AudioTrack audioTrack = this.f3334N;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.f3334N.release();
                    this.f3334N = null;
                }
                if (this.f3334N == null) {
                    this.f3334N = new android.media.AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.f3341U = this.f3334N.getAudioSessionId();
            } else {
                android.media.AudioManager audioManager = (android.media.AudioManager) this.f3354e.getSystemService("audio");
                this.f3341U = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            }
            int i8 = p082V.C0758c.f2670b;
            this.f3345Y = true;
            p107b0.C1170e c1170e = this.f3370r;
            c1170e.getClass();
            this.f3364l.m1440a(c1170e);
            p197u0.InterfaceC2217d interfaceC2217d = this.f3372t;
            android.os.Handler handler2 = new android.os.Handler(this.f3371s);
            p107b0.C1170e c1170e2 = this.f3370r;
            p197u0.C2220g c2220g = (p197u0.C2220g) interfaceC2217d;
            c2220g.getClass();
            c1170e2.getClass();
            p129f2.C1408Y c1408y = c2220g.f8855b;
            c1408y.getClass();
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) c1408y.f5729m;
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                p197u0.C2216c c2216c = (p197u0.C2216c) it.next();
                if (c2216c.f8838b == c1170e2) {
                    c2216c.f8839c = true;
                    copyOnWriteArrayList.remove(c2216c);
                }
            }
            copyOnWriteArrayList.add(new p197u0.C2216c(handler2, c1170e2));
            this.f3365m.add(this.f3374v);
            p102a0.SurfaceHolderCallbackC0941E surfaceHolderCallbackC0941E2 = this.f3374v;
            ?? obj = new java.lang.Object();
            obj.f3189m = context.getApplicationContext();
            obj.f3190n = new p102a0.RunnableC0964b(obj, handler, surfaceHolderCallbackC0941E2);
            this.f3376x = obj;
            obj.m1729c();
            p102a0.C0968d c0968d = new p102a0.C0968d(context, handler, this.f3374v);
            this.f3377y = c0968d;
            c0968d.m1973b(null);
            ?? obj2 = new java.lang.Object();
            context.getApplicationContext();
            this.f3378z = obj2;
            this.f3321A = new p046L1.C0363g(context);
            p011C.C0118j c0118j = new p011C.C0118j(1);
            c0118j.f326b = 0;
            c0118j.f327c = 0;
            new p076T.C0697k(c0118j);
            this.f3351c0 = p076T.C0690d0.f2310e;
            this.f3340T = p086W.C0799s.f2789c;
            this.f3360h.mo4301a(this.f3342V);
            m1834G(1, 10, java.lang.Integer.valueOf(this.f3341U));
            m1834G(2, 10, java.lang.Integer.valueOf(this.f3341U));
            m1834G(1, 3, this.f3342V);
            m1834G(2, 4, java.lang.Integer.valueOf(this.f3339S));
            m1834G(2, 5, 0);
            m1834G(1, 9, java.lang.Boolean.valueOf(this.f3344X));
            m1834G(2, 7, this.f3375w);
            m1834G(6, 8, this.f3375w);
            m1834G(-1, 16, java.lang.Integer.valueOf(this.f3347a0));
            this.f3352d.m1327b();
        } catch (java.lang.Throwable th) {
            this.f3352d.m1327b();
            throw th;
        }
    }

    /* renamed from: y */
    public static long m1827y(p102a0.C0973f0 c0973f0) {
        p076T.C0676T c0676t = new p076T.C0676T();
        p076T.C0675S c0675s = new p076T.C0675S();
        c0973f0.f3579a.mo1251g(c0973f0.f3580b.f7960a, c0675s);
        long j4 = c0973f0.f3581c;
        if (j4 != -9223372036854775807L) {
            return c0675s.f2227e + j4;
        }
        return c0973f0.f3579a.mo1235m(c0675s.f2225c, c0676t, 0L).f2243l;
    }

    /* renamed from: A */
    public final p102a0.C0973f0 m1828A(p102a0.C0973f0 c0973f0, p076T.AbstractC0677U abstractC0677U, android.util.Pair pair) {
        java.util.List list;
        p086W.AbstractC0781a.m1416e(abstractC0677U.m1256p() || pair != null);
        p076T.AbstractC0677U abstractC0677U2 = c0973f0.f3579a;
        long m1851n = m1851n(c0973f0);
        p102a0.C0973f0 m2017h = c0973f0.m2017h(abstractC0677U);
        if (abstractC0677U.m1256p()) {
            p179q0.C1964F c1964f = p102a0.C0973f0.f3578u;
            long m1592M = p086W.AbstractC0805y.m1592M(this.f3359g0);
            p102a0.C0973f0 m2011b = m2017h.m2012c(c1964f, m1592M, m1592M, m1592M, 0L, p179q0.C2005k0.f8183d, this.f3348b, p129f2.C1415c0.f5744p).m2011b(c1964f);
            m2011b.f3595q = m2011b.f3597s;
            return m2011b;
        }
        java.lang.Object obj = m2017h.f3580b.f7960a;
        boolean equals = obj.equals(pair.first);
        p179q0.C1964F c1964f2 = !equals ? new p179q0.C1964F(pair.first) : m2017h.f3580b;
        long longValue = ((java.lang.Long) pair.second).longValue();
        long m1592M2 = p086W.AbstractC0805y.m1592M(m1851n);
        if (!abstractC0677U2.m1256p()) {
            m1592M2 -= abstractC0677U2.mo1251g(obj, this.f3366n).f2227e;
        }
        if (!equals || longValue < m1592M2) {
            p086W.AbstractC0781a.m1421j(!c1964f2.m3968b());
            p179q0.C2005k0 c2005k0 = !equals ? p179q0.C2005k0.f8183d : m2017h.f3586h;
            p193t0.C2184v c2184v = !equals ? this.f3348b : m2017h.f3587i;
            if (equals) {
                list = m2017h.f3588j;
            } else {
                p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
                list = p129f2.C1415c0.f5744p;
            }
            p102a0.C0973f0 m2011b2 = m2017h.m2012c(c1964f2, longValue, longValue, longValue, 0L, c2005k0, c2184v, list).m2011b(c1964f2);
            m2011b2.f3595q = longValue;
            return m2011b2;
        }
        if (longValue != m1592M2) {
            p086W.AbstractC0781a.m1421j(!c1964f2.m3968b());
            long max = java.lang.Math.max(0L, m2017h.f3596r - (longValue - m1592M2));
            long j4 = m2017h.f3595q;
            if (m2017h.f3589k.equals(m2017h.f3580b)) {
                j4 = longValue + max;
            }
            p102a0.C0973f0 m2012c = m2017h.m2012c(c1964f2, longValue, longValue, longValue, max, m2017h.f3586h, m2017h.f3587i, m2017h.f3588j);
            m2012c.f3595q = j4;
            return m2012c;
        }
        int mo1231b = abstractC0677U.mo1231b(m2017h.f3589k.f7960a);
        if (mo1231b != -1 && abstractC0677U.mo1232f(mo1231b, this.f3366n, false).f2225c == abstractC0677U.mo1251g(c1964f2.f7960a, this.f3366n).f2225c) {
            return m2017h;
        }
        abstractC0677U.mo1251g(c1964f2.f7960a, this.f3366n);
        long m1237a = c1964f2.m3968b() ? this.f3366n.m1237a(c1964f2.f7961b, c1964f2.f7962c) : this.f3366n.f2226d;
        p102a0.C0973f0 m2011b3 = m2017h.m2012c(c1964f2, m2017h.f3597s, m2017h.f3597s, m2017h.f3582d, m1237a - m2017h.f3597s, m2017h.f3586h, m2017h.f3587i, m2017h.f3588j).m2011b(c1964f2);
        m2011b3.f3595q = m1237a;
        return m2011b3;
    }

    /* renamed from: B */
    public final android.util.Pair m1829B(p076T.AbstractC0677U abstractC0677U, int i4, long j4) {
        if (abstractC0677U.m1256p()) {
            this.f3357f0 = i4;
            if (j4 == -9223372036854775807L) {
                j4 = 0;
            }
            this.f3359g0 = j4;
            return null;
        }
        if (i4 == -1 || i4 >= abstractC0677U.mo1236o()) {
            i4 = abstractC0677U.mo1247a(this.f3324D);
            j4 = p086W.AbstractC0805y.m1605Z(abstractC0677U.mo1235m(i4, (p076T.C0676T) this.f537a, 0L).f2243l);
        }
        return abstractC0677U.m1252i((p076T.C0676T) this.f537a, this.f3366n, i4, p086W.AbstractC0805y.m1592M(j4));
    }

    /* renamed from: C */
    public final void m1830C(final int i4, final int i5) {
        p086W.C0799s c0799s = this.f3340T;
        if (i4 == c0799s.f2790a && i5 == c0799s.f2791b) {
            return;
        }
        this.f3340T = new p086W.C0799s(i4, i5);
        this.f3364l.m1444e(24, new p086W.InterfaceC0788h() { // from class: a0.x
            @Override // p086W.InterfaceC0788h
            /* renamed from: b */
            public final void mo285b(java.lang.Object obj) {
                ((p076T.InterfaceC0670M) obj).mo1224r(i4, i5);
            }
        });
        m1834G(2, 14, new p086W.C0799s(i4, i5));
    }

    /* renamed from: D */
    public final void m1831D() {
        m1848U();
        boolean m1860w = m1860w();
        int m1975d = this.f3377y.m1975d(2, m1860w);
        m1845R(m1975d, m1975d == -1 ? 2 : 1, m1860w);
        p102a0.C0973f0 c0973f0 = this.f3355e0;
        if (c0973f0.f3583e != 1) {
            return;
        }
        p102a0.C0973f0 m2014e = c0973f0.m2014e(null);
        p102a0.C0973f0 m2016g = m2014e.m2016g(m2014e.f3579a.m1256p() ? 4 : 2);
        this.f3325E++;
        p086W.C0802v c0802v = this.f3363k.f3436s;
        c0802v.getClass();
        p086W.C0801u m1568b = p086W.C0802v.m1568b();
        m1568b.f2793a = c0802v.f2795a.obtainMessage(29);
        m1568b.m1567b();
        m1846S(m2016g, 1, false, 5, -9223372036854775807L, -1, false);
    }

    /* renamed from: E */
    public final void m1832E() {
        java.lang.String str;
        boolean z4;
        p193t0.C2174l c2174l;
        android.media.AudioTrack audioTrack;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Release ");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append(" [AndroidXMedia3/1.4.1] [");
        sb.append(p086W.AbstractC0805y.f2805e);
        sb.append("] [");
        java.util.HashSet hashSet = p076T.AbstractC0660C.f2148a;
        synchronized (p076T.AbstractC0660C.class) {
            str = p076T.AbstractC0660C.f2149b;
        }
        sb.append(str);
        sb.append("]");
        p086W.AbstractC0781a.m1429r("ExoPlayerImpl", sb.toString());
        m1848U();
        int i4 = p086W.AbstractC0805y.f2801a;
        if (i4 < 21 && (audioTrack = this.f3334N) != null) {
            audioTrack.release();
            this.f3334N = null;
        }
        this.f3376x.m1729c();
        this.f3378z.getClass();
        this.f3321A.getClass();
        p102a0.C0968d c0968d = this.f3377y;
        c0968d.f3526c = null;
        c0968d.m1972a();
        c0968d.m1974c(0);
        p102a0.C0950N c0950n = this.f3363k;
        synchronized (c0950n) {
            if (!c0950n.f3409K && c0950n.f3438u.getThread().isAlive()) {
                c0950n.f3436s.m1572e(7);
                c0950n.m1915j0(new p102a0.C0988n(2, c0950n), c0950n.f3404F);
                z4 = c0950n.f3409K;
            }
            z4 = true;
        }
        if (!z4) {
            this.f3364l.m1444e(10, new p011C.C0111c(15));
        }
        this.f3364l.m1443d();
        this.f3361i.f2795a.removeCallbacksAndMessages(null);
        p197u0.InterfaceC2217d interfaceC2217d = this.f3372t;
        p107b0.C1170e c1170e = this.f3370r;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) ((p197u0.C2220g) interfaceC2217d).f8855b.f5729m;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            p197u0.C2216c c2216c = (p197u0.C2216c) it.next();
            if (c2216c.f8838b == c1170e) {
                c2216c.f8839c = true;
                copyOnWriteArrayList.remove(c2216c);
            }
        }
        p102a0.C0973f0 c0973f0 = this.f3355e0;
        if (c0973f0.f3594p) {
            this.f3355e0 = c0973f0.m2010a();
        }
        p102a0.C0973f0 m2016g = this.f3355e0.m2016g(1);
        this.f3355e0 = m2016g;
        p102a0.C0973f0 m2011b = m2016g.m2011b(m2016g.f3580b);
        this.f3355e0 = m2011b;
        m2011b.f3595q = m2011b.f3597s;
        this.f3355e0.f3596r = 0L;
        p107b0.C1170e c1170e2 = this.f3370r;
        p086W.C0802v c0802v = c1170e2.f4504s;
        p086W.AbstractC0781a.m1422k(c0802v);
        c0802v.m1570c(new p026F2.RunnableC0226c(3, c1170e2));
        p193t0.C2179q c2179q = (p193t0.C2179q) this.f3360h;
        synchronized (c2179q.f8709c) {
            if (i4 >= 32) {
                try {
                    p043K2.C0336l c0336l = c2179q.f8714h;
                    if (c0336l != null && (c2174l = (p193t0.C2174l) c0336l.f1041d) != null && ((android.os.Handler) c0336l.f1040c) != null) {
                        ((android.media.Spatializer) c0336l.f1039b).removeOnSpatializerStateChangedListener(c2174l);
                        ((android.os.Handler) c0336l.f1040c).removeCallbacksAndMessages(null);
                        c0336l.f1040c = null;
                        c0336l.f1041d = null;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        c2179q.f8718a = null;
        c2179q.f8719b = null;
        m1833F();
        android.view.Surface surface = this.f3336P;
        if (surface != null) {
            surface.release();
            this.f3336P = null;
        }
        int i5 = p082V.C0758c.f2670b;
        this.f3349b0 = true;
    }

    /* renamed from: F */
    public final void m1833F() {
        android.view.SurfaceHolder surfaceHolder = this.f3337Q;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f3374v);
            this.f3337Q = null;
        }
    }

    /* renamed from: G */
    public final void m1834G(int i4, int i5, java.lang.Object obj) {
        for (p102a0.AbstractC0970e abstractC0970e : this.f3358g) {
            if (i4 == -1 || abstractC0970e.f3540m == i4) {
                int m1858u = m1858u(this.f3355e0);
                p076T.AbstractC0677U abstractC0677U = this.f3355e0.f3579a;
                int i6 = m1858u == -1 ? 0 : m1858u;
                p102a0.C0950N c0950n = this.f3363k;
                p102a0.C0979i0 c0979i0 = new p102a0.C0979i0(c0950n, abstractC0970e, abstractC0677U, i6, this.f3373u, c0950n.f3438u);
                p086W.AbstractC0781a.m1421j(!c0979i0.f3631g);
                c0979i0.f3628d = i5;
                p086W.AbstractC0781a.m1421j(!c0979i0.f3631g);
                c0979i0.f3629e = obj;
                c0979i0.m2023c();
            }
        }
    }

    /* renamed from: H */
    public final void m1835H(p076T.C0691e c0691e, boolean z4) {
        m1848U();
        if (this.f3349b0) {
            return;
        }
        boolean m1606a = p086W.AbstractC0805y.m1606a(this.f3342V, c0691e);
        p086W.C0791k c0791k = this.f3364l;
        if (!m1606a) {
            this.f3342V = c0691e;
            m1834G(1, 3, c0691e);
            c0791k.m1442c(20, new p009B2.C0067x(15, c0691e));
        }
        p076T.C0691e c0691e2 = z4 ? c0691e : null;
        p102a0.C0968d c0968d = this.f3377y;
        c0968d.m1973b(c0691e2);
        this.f3360h.mo4301a(c0691e);
        boolean m1860w = m1860w();
        int m1975d = c0968d.m1975d(m1861x(), m1860w);
        m1845R(m1975d, m1975d == -1 ? 2 : 1, m1860w);
        c0791k.m1441b();
    }

    /* renamed from: I */
    public final void m1836I(java.util.List list) {
        m1848U();
        m1858u(this.f3355e0);
        m1855r();
        this.f3325E++;
        java.util.ArrayList arrayList = this.f3367o;
        boolean z4 = false;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i4 = size - 1; i4 >= 0; i4--) {
                arrayList.remove(i4);
            }
            this.f3329I = this.f3329I.m4046c(0, size);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i5 = 0; i5 < list.size(); i5++) {
            p102a0.C0969d0 c0969d0 = new p102a0.C0969d0((p179q0.AbstractC1984a) list.get(i5), this.f3368p);
            arrayList2.add(c0969d0);
            arrayList.add(i5, new p102a0.C0943G(c0969d0.f3533b, c0969d0.f3532a));
        }
        this.f3329I = this.f3329I.m4045b(0, arrayList2.size());
        p102a0.C0983k0 c0983k0 = new p102a0.C0983k0(arrayList, this.f3329I);
        boolean m1256p = c0983k0.m1256p();
        int i6 = c0983k0.f3652e;
        if (!m1256p && -1 >= i6) {
            throw new java.lang.IllegalStateException();
        }
        int mo1247a = c0983k0.mo1247a(this.f3324D);
        p102a0.C0973f0 m1828A = m1828A(this.f3355e0, c0983k0, m1829B(c0983k0, mo1247a, -9223372036854775807L));
        int i7 = m1828A.f3583e;
        if (mo1247a != -1 && i7 != 1) {
            i7 = (c0983k0.m1256p() || mo1247a >= i6) ? 4 : 2;
        }
        p102a0.C0973f0 m2016g = m1828A.m2016g(i7);
        this.f3363k.f3436s.m1569a(17, new p102a0.C0946J(arrayList2, this.f3329I, mo1247a, p086W.AbstractC0805y.m1592M(-9223372036854775807L))).m1567b();
        if (!this.f3355e0.f3580b.f7960a.equals(m2016g.f3580b.f7960a) && !this.f3355e0.f3579a.m1256p()) {
            z4 = true;
        }
        m1846S(m2016g, 0, z4, 4, m1856s(m2016g), -1, false);
    }

    /* renamed from: J */
    public final void m1837J(boolean z4) {
        m1848U();
        int m1975d = this.f3377y.m1975d(m1861x(), z4);
        m1845R(m1975d, m1975d == -1 ? 2 : 1, z4);
    }

    /* renamed from: K */
    public final void m1838K(p076T.C0668K c0668k) {
        m1848U();
        if (this.f3355e0.f3593o.equals(c0668k)) {
            return;
        }
        p102a0.C0973f0 m2015f = this.f3355e0.m2015f(c0668k);
        this.f3325E++;
        this.f3363k.f3436s.m1569a(4, c0668k).m1567b();
        m1846S(m2015f, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* renamed from: L */
    public final void m1839L(int i4) {
        m1848U();
        if (this.f3323C != i4) {
            this.f3323C = i4;
            p086W.C0802v c0802v = this.f3363k.f3436s;
            c0802v.getClass();
            p086W.C0801u m1568b = p086W.C0802v.m1568b();
            m1568b.f2793a = c0802v.f2795a.obtainMessage(11, i4, 0);
            m1568b.m1567b();
            p102a0.C1000y c1000y = new p102a0.C1000y(i4);
            p086W.C0791k c0791k = this.f3364l;
            c0791k.m1442c(8, c1000y);
            m1844Q();
            c0791k.m1441b();
        }
    }

    /* renamed from: M */
    public final void m1840M(android.view.Surface surface) {
        boolean z4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (p102a0.AbstractC0970e abstractC0970e : this.f3358g) {
            if (abstractC0970e.f3540m == 2) {
                int m1858u = m1858u(this.f3355e0);
                p076T.AbstractC0677U abstractC0677U = this.f3355e0.f3579a;
                int i4 = m1858u == -1 ? 0 : m1858u;
                p102a0.C0950N c0950n = this.f3363k;
                p102a0.C0979i0 c0979i0 = new p102a0.C0979i0(c0950n, abstractC0970e, abstractC0677U, i4, this.f3373u, c0950n.f3438u);
                p086W.AbstractC0781a.m1421j(!c0979i0.f3631g);
                c0979i0.f3628d = 1;
                p086W.AbstractC0781a.m1421j(!c0979i0.f3631g);
                c0979i0.f3629e = surface;
                c0979i0.m2023c();
                arrayList.add(c0979i0);
            }
        }
        android.view.Surface surface2 = this.f3335O;
        if (surface2 == null || surface2 == surface) {
            z4 = false;
        } else {
            try {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((p102a0.C0979i0) it.next()).m2021a(this.f3322B);
                }
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
            } catch (java.util.concurrent.TimeoutException unused2) {
                z4 = true;
            }
            z4 = false;
            android.view.Surface surface3 = this.f3335O;
            android.view.Surface surface4 = this.f3336P;
            if (surface3 == surface4) {
                surface4.release();
                this.f3336P = null;
            }
        }
        this.f3335O = surface;
        if (z4) {
            m1843P(new p102a0.C0986m(2, new java.lang.RuntimeException("Detaching surface timed out."), 1003));
        }
    }

    /* renamed from: N */
    public final void m1841N(android.view.Surface surface) {
        m1848U();
        m1833F();
        m1840M(surface);
        int i4 = surface == null ? 0 : -1;
        m1830C(i4, i4);
    }

    /* renamed from: O */
    public final void m1842O(float f4) {
        m1848U();
        final float m1614i = p086W.AbstractC0805y.m1614i(f4, 0.0f, 1.0f);
        if (this.f3343W == m1614i) {
            return;
        }
        this.f3343W = m1614i;
        m1834G(1, 2, java.lang.Float.valueOf(this.f3377y.f3530g * m1614i));
        this.f3364l.m1444e(22, new p086W.InterfaceC0788h() { // from class: a0.w
            @Override // p086W.InterfaceC0788h
            /* renamed from: b */
            public final void mo285b(java.lang.Object obj) {
                ((p076T.InterfaceC0670M) obj).mo1206B(m1614i);
            }
        });
    }

    /* renamed from: P */
    public final void m1843P(p102a0.C0986m c0986m) {
        p102a0.C0973f0 c0973f0 = this.f3355e0;
        p102a0.C0973f0 m2011b = c0973f0.m2011b(c0973f0.f3580b);
        m2011b.f3595q = m2011b.f3597s;
        m2011b.f3596r = 0L;
        p102a0.C0973f0 m2016g = m2011b.m2016g(1);
        if (c0986m != null) {
            m2016g = m2016g.m2014e(c0986m);
        }
        p102a0.C0973f0 c0973f02 = m2016g;
        this.f3325E++;
        p086W.C0802v c0802v = this.f3363k.f3436s;
        c0802v.getClass();
        p086W.C0801u m1568b = p086W.C0802v.m1568b();
        m1568b.f2793a = c0802v.f2795a.obtainMessage(6);
        m1568b.m1567b();
        m1846S(c0973f02, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* renamed from: Q */
    public final void m1844Q() {
        int mo1254k;
        int mo1250e;
        p076T.C0669L c0669l = this.f3331K;
        int i4 = p086W.AbstractC0805y.f2801a;
        p102a0.C0944H c0944h = (p102a0.C0944H) this.f3356f;
        boolean m1862z = c0944h.m1862z();
        p076T.AbstractC0677U m1857t = c0944h.m1857t();
        boolean m1256p = m1857t.m1256p();
        p076T.C0676T c0676t = (p076T.C0676T) c0944h.f537a;
        boolean z4 = !m1256p && m1857t.mo1235m(c0944h.m1854q(), c0676t, 0L).f2239h;
        p076T.AbstractC0677U m1857t2 = c0944h.m1857t();
        if (m1857t2.m1256p()) {
            mo1254k = -1;
        } else {
            int m1854q = c0944h.m1854q();
            c0944h.m1848U();
            int i5 = c0944h.f3323C;
            if (i5 == 1) {
                i5 = 0;
            }
            c0944h.m1848U();
            mo1254k = m1857t2.mo1254k(m1854q, i5, c0944h.f3324D);
        }
        boolean z5 = mo1254k != -1;
        p076T.AbstractC0677U m1857t3 = c0944h.m1857t();
        if (m1857t3.m1256p()) {
            mo1250e = -1;
        } else {
            int m1854q2 = c0944h.m1854q();
            c0944h.m1848U();
            int i6 = c0944h.f3323C;
            if (i6 == 1) {
                i6 = 0;
            }
            c0944h.m1848U();
            mo1250e = m1857t3.mo1250e(m1854q2, i6, c0944h.f3324D);
        }
        boolean z6 = mo1250e != -1;
        p076T.AbstractC0677U m1857t4 = c0944h.m1857t();
        boolean z7 = !m1857t4.m1256p() && m1857t4.mo1235m(c0944h.m1854q(), c0676t, 0L).m1245a();
        p076T.AbstractC0677U m1857t5 = c0944h.m1857t();
        boolean z8 = !m1857t5.m1256p() && m1857t5.mo1235m(c0944h.m1854q(), c0676t, 0L).f2240i;
        boolean m1256p2 = c0944h.m1857t().m1256p();
        p043K2.C0339o c0339o = new p043K2.C0339o(15);
        p076T.C0700n c0700n = this.f3350c.f2210a;
        p009B2.C0033D c0033d = (p009B2.C0033D) c0339o.f1048m;
        c0033d.getClass();
        for (int i7 = 0; i7 < c0700n.f2349a.size(); i7++) {
            c0033d.m118a(c0700n.m1286a(i7));
        }
        boolean z9 = !m1862z;
        c0339o.m759j(4, z9);
        c0339o.m759j(5, z4 && !m1862z);
        c0339o.m759j(6, z5 && !m1862z);
        c0339o.m759j(7, !m1256p2 && (z5 || !z7 || z4) && !m1862z);
        c0339o.m759j(8, z6 && !m1862z);
        c0339o.m759j(9, !m1256p2 && (z6 || (z7 && z8)) && !m1862z);
        c0339o.m759j(10, z9);
        c0339o.m759j(11, z4 && !m1862z);
        c0339o.m759j(12, z4 && !m1862z);
        p076T.C0669L c0669l2 = new p076T.C0669L(c0033d.m119b());
        this.f3331K = c0669l2;
        if (c0669l2.equals(c0669l)) {
            return;
        }
        this.f3364l.m1442c(13, new p102a0.C1001z(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* renamed from: R */
    public final void m1845R(int i4, int i5, boolean z4) {
        ?? r14 = (!z4 || i4 == -1) ? 0 : 1;
        int i6 = i4 == 0 ? 1 : 0;
        p102a0.C0973f0 c0973f0 = this.f3355e0;
        if (c0973f0.f3590l == r14 && c0973f0.f3592n == i6 && c0973f0.f3591m == i5) {
            return;
        }
        this.f3325E++;
        p102a0.C0973f0 c0973f02 = this.f3355e0;
        boolean z5 = c0973f02.f3594p;
        p102a0.C0973f0 c0973f03 = c0973f02;
        if (z5) {
            c0973f03 = c0973f02.m2010a();
        }
        p102a0.C0973f0 m2013d = c0973f03.m2013d(i5, i6, r14);
        int i7 = (i6 << 4) | i5;
        p086W.C0802v c0802v = this.f3363k.f3436s;
        c0802v.getClass();
        p086W.C0801u m1568b = p086W.C0802v.m1568b();
        m1568b.f2793a = c0802v.f2795a.obtainMessage(1, r14, i7);
        m1568b.m1567b();
        m1846S(m2013d, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* renamed from: S */
    public final void m1846S(final p102a0.C0973f0 c0973f0, final int i4, boolean z4, final int i5, long j4, int i6, boolean z5) {
        android.util.Pair pair;
        int i7;
        final p076T.C0659B c0659b;
        boolean z6;
        boolean z7;
        int i8;
        java.lang.Object obj;
        p076T.C0659B c0659b2;
        java.lang.Object obj2;
        int i9;
        long j5;
        long j6;
        long j7;
        long m1827y;
        java.lang.Object obj3;
        p076T.C0659B c0659b3;
        java.lang.Object obj4;
        int i10;
        p102a0.C0973f0 c0973f02 = this.f3355e0;
        this.f3355e0 = c0973f0;
        boolean equals = c0973f02.f3579a.equals(c0973f0.f3579a);
        p076T.AbstractC0677U abstractC0677U = c0973f02.f3579a;
        p076T.AbstractC0677U abstractC0677U2 = c0973f0.f3579a;
        if (abstractC0677U2.m1256p() && abstractC0677U.m1256p()) {
            pair = new android.util.Pair(java.lang.Boolean.FALSE, -1);
        } else if (abstractC0677U2.m1256p() != abstractC0677U.m1256p()) {
            pair = new android.util.Pair(java.lang.Boolean.TRUE, 3);
        } else {
            p179q0.C1964F c1964f = c0973f02.f3580b;
            java.lang.Object obj5 = c1964f.f7960a;
            p076T.C0675S c0675s = this.f3366n;
            int i11 = abstractC0677U.mo1251g(obj5, c0675s).f2225c;
            p076T.C0676T c0676t = (p076T.C0676T) this.f537a;
            java.lang.Object obj6 = abstractC0677U.mo1235m(i11, c0676t, 0L).f2232a;
            p179q0.C1964F c1964f2 = c0973f0.f3580b;
            if (obj6.equals(abstractC0677U2.mo1235m(abstractC0677U2.mo1251g(c1964f2.f7960a, c0675s).f2225c, c0676t, 0L).f2232a)) {
                pair = (z4 && i5 == 0 && c1964f.f7963d < c1964f2.f7963d) ? new android.util.Pair(java.lang.Boolean.TRUE, 0) : (z4 && i5 == 1 && z5) ? new android.util.Pair(java.lang.Boolean.TRUE, 2) : new android.util.Pair(java.lang.Boolean.FALSE, -1);
            } else {
                if (z4 && i5 == 0) {
                    i7 = 1;
                } else if (z4 && i5 == 1) {
                    i7 = 2;
                } else {
                    if (equals) {
                        throw new java.lang.IllegalStateException();
                    }
                    i7 = 3;
                }
                pair = new android.util.Pair(java.lang.Boolean.TRUE, java.lang.Integer.valueOf(i7));
            }
        }
        boolean booleanValue = ((java.lang.Boolean) pair.first).booleanValue();
        final int intValue = ((java.lang.Integer) pair.second).intValue();
        if (booleanValue) {
            c0659b = !c0973f0.f3579a.m1256p() ? c0973f0.f3579a.mo1235m(c0973f0.f3579a.mo1251g(c0973f0.f3580b.f7960a, this.f3366n).f2225c, (p076T.C0676T) this.f537a, 0L).f2234c : null;
            this.f3353d0 = p076T.C0662E.f2173y;
        } else {
            c0659b = null;
        }
        if (booleanValue || !c0973f02.f3588j.equals(c0973f0.f3588j)) {
            p076T.C0661D m1185a = this.f3353d0.m1185a();
            java.util.List list = c0973f0.f3588j;
            for (int i12 = 0; i12 < list.size(); i12++) {
                p076T.C0664G c0664g = (p076T.C0664G) list.get(i12);
                int i13 = 0;
                while (true) {
                    p076T.InterfaceC0663F[] interfaceC0663FArr = c0664g.f2198l;
                    if (i13 < interfaceC0663FArr.length) {
                        interfaceC0663FArr[i13].mo717c(m1185a);
                        i13++;
                    }
                }
            }
            this.f3353d0 = new p076T.C0662E(m1185a);
        }
        p076T.C0662E m1849l = m1849l();
        boolean equals2 = m1849l.equals(this.f3332L);
        this.f3332L = m1849l;
        boolean z8 = c0973f02.f3590l != c0973f0.f3590l;
        boolean z9 = c0973f02.f3583e != c0973f0.f3583e;
        if (z9 || z8) {
            m1847T();
        }
        boolean z10 = c0973f02.f3585g != c0973f0.f3585g;
        if (!equals) {
            final int i14 = 0;
            this.f3364l.m1442c(0, new p086W.InterfaceC0788h() { // from class: a0.t
                @Override // p086W.InterfaceC0788h
                /* renamed from: b */
                public final void mo285b(java.lang.Object obj7) {
                    p076T.InterfaceC0670M interfaceC0670M = (p076T.InterfaceC0670M) obj7;
                    switch (i14) {
                        case 0:
                            p076T.AbstractC0677U abstractC0677U3 = ((p102a0.C0973f0) c0973f0).f3579a;
                            interfaceC0670M.mo1214h(i4);
                            return;
                        default:
                            interfaceC0670M.mo1223q((p076T.C0659B) c0973f0, i4);
                            return;
                    }
                }
            });
        }
        if (z4) {
            p076T.C0675S c0675s2 = new p076T.C0675S();
            if (c0973f02.f3579a.m1256p()) {
                z6 = z9;
                z7 = z10;
                i8 = i6;
                obj = null;
                c0659b2 = null;
                obj2 = null;
                i9 = -1;
            } else {
                java.lang.Object obj7 = c0973f02.f3580b.f7960a;
                c0973f02.f3579a.mo1251g(obj7, c0675s2);
                int i15 = c0675s2.f2225c;
                int mo1231b = c0973f02.f3579a.mo1231b(obj7);
                z6 = z9;
                z7 = z10;
                obj = c0973f02.f3579a.mo1235m(i15, (p076T.C0676T) this.f537a, 0L).f2232a;
                c0659b2 = ((p076T.C0676T) this.f537a).f2234c;
                i8 = i15;
                i9 = mo1231b;
                obj2 = obj7;
            }
            if (i5 == 0) {
                if (c0973f02.f3580b.m3968b()) {
                    p179q0.C1964F c1964f3 = c0973f02.f3580b;
                    j7 = c0675s2.m1237a(c1964f3.f7961b, c1964f3.f7962c);
                    m1827y = m1827y(c0973f02);
                } else if (c0973f02.f3580b.f7964e != -1) {
                    j7 = m1827y(this.f3355e0);
                    m1827y = j7;
                } else {
                    j5 = c0675s2.f2227e;
                    j6 = c0675s2.f2226d;
                    j7 = j5 + j6;
                    m1827y = j7;
                }
            } else if (c0973f02.f3580b.m3968b()) {
                j7 = c0973f02.f3597s;
                m1827y = m1827y(c0973f02);
            } else {
                j5 = c0675s2.f2227e;
                j6 = c0973f02.f3597s;
                j7 = j5 + j6;
                m1827y = j7;
            }
            long m1605Z = p086W.AbstractC0805y.m1605Z(j7);
            long m1605Z2 = p086W.AbstractC0805y.m1605Z(m1827y);
            p179q0.C1964F c1964f4 = c0973f02.f3580b;
            final p076T.C0671N c0671n = new p076T.C0671N(obj, i8, c0659b2, obj2, i9, m1605Z, m1605Z2, c1964f4.f7961b, c1964f4.f7962c);
            int m1854q = m1854q();
            if (this.f3355e0.f3579a.m1256p()) {
                obj3 = null;
                c0659b3 = null;
                obj4 = null;
                i10 = -1;
            } else {
                p102a0.C0973f0 c0973f03 = this.f3355e0;
                java.lang.Object obj8 = c0973f03.f3580b.f7960a;
                c0973f03.f3579a.mo1251g(obj8, this.f3366n);
                int mo1231b2 = this.f3355e0.f3579a.mo1231b(obj8);
                p076T.AbstractC0677U abstractC0677U3 = this.f3355e0.f3579a;
                p076T.C0676T c0676t2 = (p076T.C0676T) this.f537a;
                i10 = mo1231b2;
                obj3 = abstractC0677U3.mo1235m(m1854q, c0676t2, 0L).f2232a;
                c0659b3 = c0676t2.f2234c;
                obj4 = obj8;
            }
            long m1605Z3 = p086W.AbstractC0805y.m1605Z(j4);
            long m1605Z4 = this.f3355e0.f3580b.m3968b() ? p086W.AbstractC0805y.m1605Z(m1827y(this.f3355e0)) : m1605Z3;
            p179q0.C1964F c1964f5 = this.f3355e0.f3580b;
            final p076T.C0671N c0671n2 = new p076T.C0671N(obj3, m1854q, c0659b3, obj4, i10, m1605Z3, m1605Z4, c1964f5.f7961b, c1964f5.f7962c);
            this.f3364l.m1442c(11, new p086W.InterfaceC0788h() { // from class: a0.B
                @Override // p086W.InterfaceC0788h
                /* renamed from: b */
                public final void mo285b(java.lang.Object obj9) {
                    p076T.InterfaceC0670M interfaceC0670M = (p076T.InterfaceC0670M) obj9;
                    interfaceC0670M.getClass();
                    interfaceC0670M.mo1212e(i5, c0671n, c0671n2);
                }
            });
        } else {
            z6 = z9;
            z7 = z10;
        }
        if (booleanValue) {
            final int i16 = 1;
            this.f3364l.m1442c(1, new p086W.InterfaceC0788h() { // from class: a0.t
                @Override // p086W.InterfaceC0788h
                /* renamed from: b */
                public final void mo285b(java.lang.Object obj72) {
                    p076T.InterfaceC0670M interfaceC0670M = (p076T.InterfaceC0670M) obj72;
                    switch (i16) {
                        case 0:
                            p076T.AbstractC0677U abstractC0677U32 = ((p102a0.C0973f0) c0659b).f3579a;
                            interfaceC0670M.mo1214h(intValue);
                            return;
                        default:
                            interfaceC0670M.mo1223q((p076T.C0659B) c0659b, intValue);
                            return;
                    }
                }
            });
        }
        if (c0973f02.f3584f != c0973f0.f3584f) {
            final int i17 = 7;
            this.f3364l.m1442c(10, new p086W.InterfaceC0788h() { // from class: a0.u
                @Override // p086W.InterfaceC0788h
                /* renamed from: b */
                public final void mo285b(java.lang.Object obj9) {
                    p076T.InterfaceC0670M interfaceC0670M = (p076T.InterfaceC0670M) obj9;
                    switch (i17) {
                        case 0:
                            p102a0.C0973f0 c0973f04 = c0973f0;
                            boolean z11 = c0973f04.f3585g;
                            interfaceC0670M.getClass();
                            interfaceC0670M.mo1225s(c0973f04.f3585g);
                            return;
                        case 1:
                            p102a0.C0973f0 c0973f05 = c0973f0;
                            interfaceC0670M.mo1230y(c0973f05.f3583e, c0973f05.f3590l);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            interfaceC0670M.mo1213f(c0973f0.f3583e);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p102a0.C0973f0 c0973f06 = c0973f0;
                            interfaceC0670M.mo1205A(c0973f06.f3591m, c0973f06.f3590l);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            interfaceC0670M.mo1210c(c0973f0.f3592n);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            interfaceC0670M.mo1208E(c0973f0.m2019k());
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            interfaceC0670M.mo1222p(c0973f0.f3593o);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            interfaceC0670M.mo1218l(c0973f0.f3584f);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            interfaceC0670M.mo1226t(c0973f0.f3584f);
                            return;
                        default:
                            interfaceC0670M.mo1220n(c0973f0.f3587i.f8723d);
                            return;
                    }
                }
            });
            if (c0973f0.f3584f != null) {
                final int i18 = 8;
                this.f3364l.m1442c(10, new p086W.InterfaceC0788h() { // from class: a0.u
                    @Override // p086W.InterfaceC0788h
                    /* renamed from: b */
                    public final void mo285b(java.lang.Object obj9) {
                        p076T.InterfaceC0670M interfaceC0670M = (p076T.InterfaceC0670M) obj9;
                        switch (i18) {
                            case 0:
                                p102a0.C0973f0 c0973f04 = c0973f0;
                                boolean z11 = c0973f04.f3585g;
                                interfaceC0670M.getClass();
                                interfaceC0670M.mo1225s(c0973f04.f3585g);
                                return;
                            case 1:
                                p102a0.C0973f0 c0973f05 = c0973f0;
                                interfaceC0670M.mo1230y(c0973f05.f3583e, c0973f05.f3590l);
                                return;
                            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                                interfaceC0670M.mo1213f(c0973f0.f3583e);
                                return;
                            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                                p102a0.C0973f0 c0973f06 = c0973f0;
                                interfaceC0670M.mo1205A(c0973f06.f3591m, c0973f06.f3590l);
                                return;
                            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                                interfaceC0670M.mo1210c(c0973f0.f3592n);
                                return;
                            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                                interfaceC0670M.mo1208E(c0973f0.m2019k());
                                return;
                            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                                interfaceC0670M.mo1222p(c0973f0.f3593o);
                                return;
                            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                                interfaceC0670M.mo1218l(c0973f0.f3584f);
                                return;
                            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                                interfaceC0670M.mo1226t(c0973f0.f3584f);
                                return;
                            default:
                                interfaceC0670M.mo1220n(c0973f0.f3587i.f8723d);
                                return;
                        }
                    }
                });
            }
        }
        p193t0.C2184v c2184v = c0973f02.f3587i;
        p193t0.C2184v c2184v2 = c0973f0.f3587i;
        if (c2184v != c2184v2) {
            p193t0.AbstractC2183u abstractC2183u = this.f3360h;
            p145j.C1673n c1673n = c2184v2.f8724e;
            abstractC2183u.getClass();
            final int i19 = 9;
            this.f3364l.m1442c(2, new p086W.InterfaceC0788h() { // from class: a0.u
                @Override // p086W.InterfaceC0788h
                /* renamed from: b */
                public final void mo285b(java.lang.Object obj9) {
                    p076T.InterfaceC0670M interfaceC0670M = (p076T.InterfaceC0670M) obj9;
                    switch (i19) {
                        case 0:
                            p102a0.C0973f0 c0973f04 = c0973f0;
                            boolean z11 = c0973f04.f3585g;
                            interfaceC0670M.getClass();
                            interfaceC0670M.mo1225s(c0973f04.f3585g);
                            return;
                        case 1:
                            p102a0.C0973f0 c0973f05 = c0973f0;
                            interfaceC0670M.mo1230y(c0973f05.f3583e, c0973f05.f3590l);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            interfaceC0670M.mo1213f(c0973f0.f3583e);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p102a0.C0973f0 c0973f06 = c0973f0;
                            interfaceC0670M.mo1205A(c0973f06.f3591m, c0973f06.f3590l);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            interfaceC0670M.mo1210c(c0973f0.f3592n);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            interfaceC0670M.mo1208E(c0973f0.m2019k());
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            interfaceC0670M.mo1222p(c0973f0.f3593o);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            interfaceC0670M.mo1218l(c0973f0.f3584f);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            interfaceC0670M.mo1226t(c0973f0.f3584f);
                            return;
                        default:
                            interfaceC0670M.mo1220n(c0973f0.f3587i.f8723d);
                            return;
                    }
                }
            });
        }
        if (!equals2) {
            this.f3364l.m1442c(14, new p009B2.C0067x(14, this.f3332L));
        }
        if (z7) {
            final int i20 = 0;
            this.f3364l.m1442c(3, new p086W.InterfaceC0788h() { // from class: a0.u
                @Override // p086W.InterfaceC0788h
                /* renamed from: b */
                public final void mo285b(java.lang.Object obj9) {
                    p076T.InterfaceC0670M interfaceC0670M = (p076T.InterfaceC0670M) obj9;
                    switch (i20) {
                        case 0:
                            p102a0.C0973f0 c0973f04 = c0973f0;
                            boolean z11 = c0973f04.f3585g;
                            interfaceC0670M.getClass();
                            interfaceC0670M.mo1225s(c0973f04.f3585g);
                            return;
                        case 1:
                            p102a0.C0973f0 c0973f05 = c0973f0;
                            interfaceC0670M.mo1230y(c0973f05.f3583e, c0973f05.f3590l);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            interfaceC0670M.mo1213f(c0973f0.f3583e);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p102a0.C0973f0 c0973f06 = c0973f0;
                            interfaceC0670M.mo1205A(c0973f06.f3591m, c0973f06.f3590l);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            interfaceC0670M.mo1210c(c0973f0.f3592n);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            interfaceC0670M.mo1208E(c0973f0.m2019k());
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            interfaceC0670M.mo1222p(c0973f0.f3593o);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            interfaceC0670M.mo1218l(c0973f0.f3584f);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            interfaceC0670M.mo1226t(c0973f0.f3584f);
                            return;
                        default:
                            interfaceC0670M.mo1220n(c0973f0.f3587i.f8723d);
                            return;
                    }
                }
            });
        }
        if (z6 || z8) {
            final int i21 = 1;
            this.f3364l.m1442c(-1, new p086W.InterfaceC0788h() { // from class: a0.u
                @Override // p086W.InterfaceC0788h
                /* renamed from: b */
                public final void mo285b(java.lang.Object obj9) {
                    p076T.InterfaceC0670M interfaceC0670M = (p076T.InterfaceC0670M) obj9;
                    switch (i21) {
                        case 0:
                            p102a0.C0973f0 c0973f04 = c0973f0;
                            boolean z11 = c0973f04.f3585g;
                            interfaceC0670M.getClass();
                            interfaceC0670M.mo1225s(c0973f04.f3585g);
                            return;
                        case 1:
                            p102a0.C0973f0 c0973f05 = c0973f0;
                            interfaceC0670M.mo1230y(c0973f05.f3583e, c0973f05.f3590l);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            interfaceC0670M.mo1213f(c0973f0.f3583e);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p102a0.C0973f0 c0973f06 = c0973f0;
                            interfaceC0670M.mo1205A(c0973f06.f3591m, c0973f06.f3590l);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            interfaceC0670M.mo1210c(c0973f0.f3592n);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            interfaceC0670M.mo1208E(c0973f0.m2019k());
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            interfaceC0670M.mo1222p(c0973f0.f3593o);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            interfaceC0670M.mo1218l(c0973f0.f3584f);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            interfaceC0670M.mo1226t(c0973f0.f3584f);
                            return;
                        default:
                            interfaceC0670M.mo1220n(c0973f0.f3587i.f8723d);
                            return;
                    }
                }
            });
        }
        if (z6) {
            final int i22 = 2;
            this.f3364l.m1442c(4, new p086W.InterfaceC0788h() { // from class: a0.u
                @Override // p086W.InterfaceC0788h
                /* renamed from: b */
                public final void mo285b(java.lang.Object obj9) {
                    p076T.InterfaceC0670M interfaceC0670M = (p076T.InterfaceC0670M) obj9;
                    switch (i22) {
                        case 0:
                            p102a0.C0973f0 c0973f04 = c0973f0;
                            boolean z11 = c0973f04.f3585g;
                            interfaceC0670M.getClass();
                            interfaceC0670M.mo1225s(c0973f04.f3585g);
                            return;
                        case 1:
                            p102a0.C0973f0 c0973f05 = c0973f0;
                            interfaceC0670M.mo1230y(c0973f05.f3583e, c0973f05.f3590l);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            interfaceC0670M.mo1213f(c0973f0.f3583e);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p102a0.C0973f0 c0973f06 = c0973f0;
                            interfaceC0670M.mo1205A(c0973f06.f3591m, c0973f06.f3590l);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            interfaceC0670M.mo1210c(c0973f0.f3592n);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            interfaceC0670M.mo1208E(c0973f0.m2019k());
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            interfaceC0670M.mo1222p(c0973f0.f3593o);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            interfaceC0670M.mo1218l(c0973f0.f3584f);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            interfaceC0670M.mo1226t(c0973f0.f3584f);
                            return;
                        default:
                            interfaceC0670M.mo1220n(c0973f0.f3587i.f8723d);
                            return;
                    }
                }
            });
        }
        if (z8 || c0973f02.f3591m != c0973f0.f3591m) {
            final int i23 = 3;
            this.f3364l.m1442c(5, new p086W.InterfaceC0788h() { // from class: a0.u
                @Override // p086W.InterfaceC0788h
                /* renamed from: b */
                public final void mo285b(java.lang.Object obj9) {
                    p076T.InterfaceC0670M interfaceC0670M = (p076T.InterfaceC0670M) obj9;
                    switch (i23) {
                        case 0:
                            p102a0.C0973f0 c0973f04 = c0973f0;
                            boolean z11 = c0973f04.f3585g;
                            interfaceC0670M.getClass();
                            interfaceC0670M.mo1225s(c0973f04.f3585g);
                            return;
                        case 1:
                            p102a0.C0973f0 c0973f05 = c0973f0;
                            interfaceC0670M.mo1230y(c0973f05.f3583e, c0973f05.f3590l);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            interfaceC0670M.mo1213f(c0973f0.f3583e);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p102a0.C0973f0 c0973f06 = c0973f0;
                            interfaceC0670M.mo1205A(c0973f06.f3591m, c0973f06.f3590l);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            interfaceC0670M.mo1210c(c0973f0.f3592n);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            interfaceC0670M.mo1208E(c0973f0.m2019k());
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            interfaceC0670M.mo1222p(c0973f0.f3593o);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            interfaceC0670M.mo1218l(c0973f0.f3584f);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            interfaceC0670M.mo1226t(c0973f0.f3584f);
                            return;
                        default:
                            interfaceC0670M.mo1220n(c0973f0.f3587i.f8723d);
                            return;
                    }
                }
            });
        }
        if (c0973f02.f3592n != c0973f0.f3592n) {
            final int i24 = 4;
            this.f3364l.m1442c(6, new p086W.InterfaceC0788h() { // from class: a0.u
                @Override // p086W.InterfaceC0788h
                /* renamed from: b */
                public final void mo285b(java.lang.Object obj9) {
                    p076T.InterfaceC0670M interfaceC0670M = (p076T.InterfaceC0670M) obj9;
                    switch (i24) {
                        case 0:
                            p102a0.C0973f0 c0973f04 = c0973f0;
                            boolean z11 = c0973f04.f3585g;
                            interfaceC0670M.getClass();
                            interfaceC0670M.mo1225s(c0973f04.f3585g);
                            return;
                        case 1:
                            p102a0.C0973f0 c0973f05 = c0973f0;
                            interfaceC0670M.mo1230y(c0973f05.f3583e, c0973f05.f3590l);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            interfaceC0670M.mo1213f(c0973f0.f3583e);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p102a0.C0973f0 c0973f06 = c0973f0;
                            interfaceC0670M.mo1205A(c0973f06.f3591m, c0973f06.f3590l);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            interfaceC0670M.mo1210c(c0973f0.f3592n);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            interfaceC0670M.mo1208E(c0973f0.m2019k());
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            interfaceC0670M.mo1222p(c0973f0.f3593o);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            interfaceC0670M.mo1218l(c0973f0.f3584f);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            interfaceC0670M.mo1226t(c0973f0.f3584f);
                            return;
                        default:
                            interfaceC0670M.mo1220n(c0973f0.f3587i.f8723d);
                            return;
                    }
                }
            });
        }
        if (c0973f02.m2019k() != c0973f0.m2019k()) {
            final int i25 = 5;
            this.f3364l.m1442c(7, new p086W.InterfaceC0788h() { // from class: a0.u
                @Override // p086W.InterfaceC0788h
                /* renamed from: b */
                public final void mo285b(java.lang.Object obj9) {
                    p076T.InterfaceC0670M interfaceC0670M = (p076T.InterfaceC0670M) obj9;
                    switch (i25) {
                        case 0:
                            p102a0.C0973f0 c0973f04 = c0973f0;
                            boolean z11 = c0973f04.f3585g;
                            interfaceC0670M.getClass();
                            interfaceC0670M.mo1225s(c0973f04.f3585g);
                            return;
                        case 1:
                            p102a0.C0973f0 c0973f05 = c0973f0;
                            interfaceC0670M.mo1230y(c0973f05.f3583e, c0973f05.f3590l);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            interfaceC0670M.mo1213f(c0973f0.f3583e);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p102a0.C0973f0 c0973f06 = c0973f0;
                            interfaceC0670M.mo1205A(c0973f06.f3591m, c0973f06.f3590l);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            interfaceC0670M.mo1210c(c0973f0.f3592n);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            interfaceC0670M.mo1208E(c0973f0.m2019k());
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            interfaceC0670M.mo1222p(c0973f0.f3593o);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            interfaceC0670M.mo1218l(c0973f0.f3584f);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            interfaceC0670M.mo1226t(c0973f0.f3584f);
                            return;
                        default:
                            interfaceC0670M.mo1220n(c0973f0.f3587i.f8723d);
                            return;
                    }
                }
            });
        }
        if (!c0973f02.f3593o.equals(c0973f0.f3593o)) {
            final int i26 = 6;
            this.f3364l.m1442c(12, new p086W.InterfaceC0788h() { // from class: a0.u
                @Override // p086W.InterfaceC0788h
                /* renamed from: b */
                public final void mo285b(java.lang.Object obj9) {
                    p076T.InterfaceC0670M interfaceC0670M = (p076T.InterfaceC0670M) obj9;
                    switch (i26) {
                        case 0:
                            p102a0.C0973f0 c0973f04 = c0973f0;
                            boolean z11 = c0973f04.f3585g;
                            interfaceC0670M.getClass();
                            interfaceC0670M.mo1225s(c0973f04.f3585g);
                            return;
                        case 1:
                            p102a0.C0973f0 c0973f05 = c0973f0;
                            interfaceC0670M.mo1230y(c0973f05.f3583e, c0973f05.f3590l);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            interfaceC0670M.mo1213f(c0973f0.f3583e);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p102a0.C0973f0 c0973f06 = c0973f0;
                            interfaceC0670M.mo1205A(c0973f06.f3591m, c0973f06.f3590l);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            interfaceC0670M.mo1210c(c0973f0.f3592n);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            interfaceC0670M.mo1208E(c0973f0.m2019k());
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            interfaceC0670M.mo1222p(c0973f0.f3593o);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            interfaceC0670M.mo1218l(c0973f0.f3584f);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            interfaceC0670M.mo1226t(c0973f0.f3584f);
                            return;
                        default:
                            interfaceC0670M.mo1220n(c0973f0.f3587i.f8723d);
                            return;
                    }
                }
            });
        }
        m1844Q();
        this.f3364l.m1441b();
        if (c0973f02.f3594p != c0973f0.f3594p) {
            java.util.Iterator it = this.f3365m.iterator();
            while (it.hasNext()) {
                ((p102a0.SurfaceHolderCallbackC0941E) it.next()).f3316a.m1847T();
            }
        }
    }

    /* renamed from: T */
    public final void m1847T() {
        int m1861x = m1861x();
        p046L1.C0363g c0363g = this.f3321A;
        p025F1.C0215g c0215g = this.f3378z;
        if (m1861x != 1) {
            if (m1861x == 2 || m1861x == 3) {
                m1848U();
                boolean z4 = this.f3355e0.f3594p;
                m1860w();
                c0215g.getClass();
                m1860w();
                c0363g.getClass();
                return;
            }
            if (m1861x != 4) {
                throw new java.lang.IllegalStateException();
            }
        }
        c0215g.getClass();
        c0363g.getClass();
    }

    /* renamed from: U */
    public final void m1848U() {
        p078T2.C0737n c0737n = this.f3352d;
        synchronized (c0737n) {
            boolean z4 = false;
            while (!c0737n.f2542a) {
                try {
                    c0737n.wait();
                } catch (java.lang.InterruptedException unused) {
                    z4 = true;
                }
            }
            if (z4) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
        if (java.lang.Thread.currentThread() != this.f3371s.getThread()) {
            java.lang.String name = java.lang.Thread.currentThread().getName();
            java.lang.String name2 = this.f3371s.getThread().getName();
            int i4 = p086W.AbstractC0805y.f2801a;
            java.util.Locale locale = java.util.Locale.US;
            java.lang.String str = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread";
            if (this.f3345Y) {
                throw new java.lang.IllegalStateException(str);
            }
            p086W.AbstractC0781a.m1411B("ExoPlayerImpl", str, this.f3346Z ? null : new java.lang.IllegalStateException());
            this.f3346Z = true;
        }
    }

    @Override // p021E0.AbstractC0193e
    /* renamed from: k */
    public final void mo558k(int i4, long j4, boolean z4) {
        m1848U();
        if (i4 == -1) {
            return;
        }
        p086W.AbstractC0781a.m1416e(i4 >= 0);
        p076T.AbstractC0677U abstractC0677U = this.f3355e0.f3579a;
        if (abstractC0677U.m1256p() || i4 < abstractC0677U.mo1236o()) {
            p107b0.C1170e c1170e = this.f3370r;
            if (!c1170e.f4505t) {
                p107b0.C1166a m2744a = c1170e.m2744a();
                c1170e.f4505t = true;
                c1170e.m2742K(m2744a, -1, new p107b0.C1168c(12));
            }
            this.f3325E++;
            if (m1862z()) {
                p086W.AbstractC0781a.m1410A("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                p102a0.C0947K c0947k = new p102a0.C0947K(this.f3355e0);
                c0947k.m1866c(1);
                p102a0.C0944H c0944h = this.f3362j.f3716l;
                c0944h.f3361i.m1570c(new p086W.RunnableC0793m(2, c0944h, c0947k));
                return;
            }
            p102a0.C0973f0 c0973f0 = this.f3355e0;
            int i5 = c0973f0.f3583e;
            if (i5 == 3 || (i5 == 4 && !abstractC0677U.m1256p())) {
                c0973f0 = this.f3355e0.m2016g(2);
            }
            int m1854q = m1854q();
            p102a0.C0973f0 m1828A = m1828A(c0973f0, abstractC0677U, m1829B(abstractC0677U, i4, j4));
            this.f3363k.f3436s.m1569a(3, new p102a0.C0949M(abstractC0677U, i4, p086W.AbstractC0805y.m1592M(j4))).m1567b();
            m1846S(m1828A, 0, true, 1, m1856s(m1828A), m1854q, z4);
        }
    }

    /* renamed from: l */
    public final p076T.C0662E m1849l() {
        p076T.AbstractC0677U m1857t = m1857t();
        if (m1857t.m1256p()) {
            return this.f3353d0;
        }
        p076T.C0659B c0659b = m1857t.mo1235m(m1854q(), (p076T.C0676T) this.f537a, 0L).f2234c;
        p076T.C0661D m1185a = this.f3353d0.m1185a();
        p076T.C0662E c0662e = c0659b.f2145d;
        if (c0662e != null) {
            java.lang.CharSequence charSequence = c0662e.f2174a;
            if (charSequence != null) {
                m1185a.f2150a = charSequence;
            }
            java.lang.CharSequence charSequence2 = c0662e.f2175b;
            if (charSequence2 != null) {
                m1185a.f2151b = charSequence2;
            }
            java.lang.CharSequence charSequence3 = c0662e.f2176c;
            if (charSequence3 != null) {
                m1185a.f2152c = charSequence3;
            }
            java.lang.CharSequence charSequence4 = c0662e.f2177d;
            if (charSequence4 != null) {
                m1185a.f2153d = charSequence4;
            }
            java.lang.CharSequence charSequence5 = c0662e.f2178e;
            if (charSequence5 != null) {
                m1185a.f2154e = charSequence5;
            }
            byte[] bArr = c0662e.f2179f;
            if (bArr != null) {
                m1185a.f2155f = bArr == null ? null : (byte[]) bArr.clone();
                m1185a.f2156g = c0662e.f2180g;
            }
            java.lang.Integer num = c0662e.f2181h;
            if (num != null) {
                m1185a.f2157h = num;
            }
            java.lang.Integer num2 = c0662e.f2182i;
            if (num2 != null) {
                m1185a.f2158i = num2;
            }
            java.lang.Integer num3 = c0662e.f2183j;
            if (num3 != null) {
                m1185a.f2159j = num3;
            }
            java.lang.Boolean bool = c0662e.f2184k;
            if (bool != null) {
                m1185a.f2160k = bool;
            }
            java.lang.Integer num4 = c0662e.f2185l;
            if (num4 != null) {
                m1185a.f2161l = num4;
            }
            java.lang.Integer num5 = c0662e.f2186m;
            if (num5 != null) {
                m1185a.f2161l = num5;
            }
            java.lang.Integer num6 = c0662e.f2187n;
            if (num6 != null) {
                m1185a.f2162m = num6;
            }
            java.lang.Integer num7 = c0662e.f2188o;
            if (num7 != null) {
                m1185a.f2163n = num7;
            }
            java.lang.Integer num8 = c0662e.f2189p;
            if (num8 != null) {
                m1185a.f2164o = num8;
            }
            java.lang.Integer num9 = c0662e.f2190q;
            if (num9 != null) {
                m1185a.f2165p = num9;
            }
            java.lang.Integer num10 = c0662e.f2191r;
            if (num10 != null) {
                m1185a.f2166q = num10;
            }
            java.lang.CharSequence charSequence6 = c0662e.f2192s;
            if (charSequence6 != null) {
                m1185a.f2167r = charSequence6;
            }
            java.lang.CharSequence charSequence7 = c0662e.f2193t;
            if (charSequence7 != null) {
                m1185a.f2168s = charSequence7;
            }
            java.lang.CharSequence charSequence8 = c0662e.f2194u;
            if (charSequence8 != null) {
                m1185a.f2169t = charSequence8;
            }
            java.lang.CharSequence charSequence9 = c0662e.f2195v;
            if (charSequence9 != null) {
                m1185a.f2170u = charSequence9;
            }
            java.lang.CharSequence charSequence10 = c0662e.f2196w;
            if (charSequence10 != null) {
                m1185a.f2171v = charSequence10;
            }
            java.lang.Integer num11 = c0662e.f2197x;
            if (num11 != null) {
                m1185a.f2172w = num11;
            }
        }
        return new p076T.C0662E(m1185a);
    }

    /* renamed from: m */
    public final long m1850m() {
        m1848U();
        if (m1862z()) {
            p102a0.C0973f0 c0973f0 = this.f3355e0;
            return c0973f0.f3589k.equals(c0973f0.f3580b) ? p086W.AbstractC0805y.m1605Z(this.f3355e0.f3595q) : m1859v();
        }
        m1848U();
        if (this.f3355e0.f3579a.m1256p()) {
            return this.f3359g0;
        }
        p102a0.C0973f0 c0973f02 = this.f3355e0;
        long j4 = 0;
        if (c0973f02.f3589k.f7963d != c0973f02.f3580b.f7963d) {
            return p086W.AbstractC0805y.m1605Z(c0973f02.f3579a.mo1235m(m1854q(), (p076T.C0676T) this.f537a, 0L).f2244m);
        }
        long j5 = c0973f02.f3595q;
        if (this.f3355e0.f3589k.m3968b()) {
            p102a0.C0973f0 c0973f03 = this.f3355e0;
            c0973f03.f3579a.mo1251g(c0973f03.f3589k.f7960a, this.f3366n).m1240d(this.f3355e0.f3589k.f7961b);
        } else {
            j4 = j5;
        }
        p102a0.C0973f0 c0973f04 = this.f3355e0;
        p076T.AbstractC0677U abstractC0677U = c0973f04.f3579a;
        java.lang.Object obj = c0973f04.f3589k.f7960a;
        p076T.C0675S c0675s = this.f3366n;
        abstractC0677U.mo1251g(obj, c0675s);
        return p086W.AbstractC0805y.m1605Z(j4 + c0675s.f2227e);
    }

    /* renamed from: n */
    public final long m1851n(p102a0.C0973f0 c0973f0) {
        if (!c0973f0.f3580b.m3968b()) {
            return p086W.AbstractC0805y.m1605Z(m1856s(c0973f0));
        }
        java.lang.Object obj = c0973f0.f3580b.f7960a;
        p076T.AbstractC0677U abstractC0677U = c0973f0.f3579a;
        p076T.C0675S c0675s = this.f3366n;
        abstractC0677U.mo1251g(obj, c0675s);
        long j4 = c0973f0.f3581c;
        return j4 == -9223372036854775807L ? p086W.AbstractC0805y.m1605Z(abstractC0677U.mo1235m(m1858u(c0973f0), (p076T.C0676T) this.f537a, 0L).f2243l) : p086W.AbstractC0805y.m1605Z(c0675s.f2227e) + p086W.AbstractC0805y.m1605Z(j4);
    }

    /* renamed from: o */
    public final int m1852o() {
        m1848U();
        if (m1862z()) {
            return this.f3355e0.f3580b.f7961b;
        }
        return -1;
    }

    /* renamed from: p */
    public final int m1853p() {
        m1848U();
        if (m1862z()) {
            return this.f3355e0.f3580b.f7962c;
        }
        return -1;
    }

    /* renamed from: q */
    public final int m1854q() {
        m1848U();
        int m1858u = m1858u(this.f3355e0);
        if (m1858u == -1) {
            return 0;
        }
        return m1858u;
    }

    /* renamed from: r */
    public final long m1855r() {
        m1848U();
        return p086W.AbstractC0805y.m1605Z(m1856s(this.f3355e0));
    }

    /* renamed from: s */
    public final long m1856s(p102a0.C0973f0 c0973f0) {
        if (c0973f0.f3579a.m1256p()) {
            return p086W.AbstractC0805y.m1592M(this.f3359g0);
        }
        long m2018j = c0973f0.f3594p ? c0973f0.m2018j() : c0973f0.f3597s;
        if (c0973f0.f3580b.m3968b()) {
            return m2018j;
        }
        p076T.AbstractC0677U abstractC0677U = c0973f0.f3579a;
        java.lang.Object obj = c0973f0.f3580b.f7960a;
        p076T.C0675S c0675s = this.f3366n;
        abstractC0677U.mo1251g(obj, c0675s);
        return m2018j + c0675s.f2227e;
    }

    /* renamed from: t */
    public final p076T.AbstractC0677U m1857t() {
        m1848U();
        return this.f3355e0.f3579a;
    }

    /* renamed from: u */
    public final int m1858u(p102a0.C0973f0 c0973f0) {
        if (c0973f0.f3579a.m1256p()) {
            return this.f3357f0;
        }
        return c0973f0.f3579a.mo1251g(c0973f0.f3580b.f7960a, this.f3366n).f2225c;
    }

    /* renamed from: v */
    public final long m1859v() {
        m1848U();
        if (!m1862z()) {
            p076T.AbstractC0677U m1857t = m1857t();
            if (m1857t.m1256p()) {
                return -9223372036854775807L;
            }
            return p086W.AbstractC0805y.m1605Z(m1857t.mo1235m(m1854q(), (p076T.C0676T) this.f537a, 0L).f2244m);
        }
        p102a0.C0973f0 c0973f0 = this.f3355e0;
        p179q0.C1964F c1964f = c0973f0.f3580b;
        p076T.AbstractC0677U abstractC0677U = c0973f0.f3579a;
        java.lang.Object obj = c1964f.f7960a;
        p076T.C0675S c0675s = this.f3366n;
        abstractC0677U.mo1251g(obj, c0675s);
        return p086W.AbstractC0805y.m1605Z(c0675s.m1237a(c1964f.f7961b, c1964f.f7962c));
    }

    /* renamed from: w */
    public final boolean m1860w() {
        m1848U();
        return this.f3355e0.f3590l;
    }

    /* renamed from: x */
    public final int m1861x() {
        m1848U();
        return this.f3355e0.f3583e;
    }

    /* renamed from: z */
    public final boolean m1862z() {
        m1848U();
        return this.f3355e0.f3580b.m3968b();
    }
}
