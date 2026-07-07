package p179q0;

/* renamed from: q0.T */
/* loaded from: classes.dex */
public final class C1977T implements p179q0.InterfaceC1962D, p215y0.InterfaceC2405q, p197u0.InterfaceC2222i, p197u0.InterfaceC2225l, p179q0.InterfaceC1982Y {

    /* renamed from: Y */
    public static final java.util.Map f8012Y;

    /* renamed from: Z */
    public static final p076T.C0702p f8013Z;

    /* renamed from: B */
    public p179q0.InterfaceC1961C f8015B;

    /* renamed from: C */
    public p045L0.C0355b f8016C;

    /* renamed from: F */
    public boolean f8019F;

    /* renamed from: G */
    public boolean f8020G;

    /* renamed from: H */
    public boolean f8021H;

    /* renamed from: I */
    public boolean f8022I;

    /* renamed from: J */
    public p035I.C0291m f8023J;

    /* renamed from: K */
    public p215y0.InterfaceC2414z f8024K;

    /* renamed from: L */
    public long f8025L;

    /* renamed from: M */
    public boolean f8026M;

    /* renamed from: O */
    public boolean f8028O;

    /* renamed from: P */
    public boolean f8029P;

    /* renamed from: Q */
    public int f8030Q;

    /* renamed from: R */
    public boolean f8031R;

    /* renamed from: S */
    public long f8032S;

    /* renamed from: U */
    public boolean f8034U;

    /* renamed from: V */
    public int f8035V;

    /* renamed from: W */
    public boolean f8036W;

    /* renamed from: X */
    public boolean f8037X;

    /* renamed from: l */
    public final android.net.Uri f8038l;

    /* renamed from: m */
    public final p094Y.InterfaceC0870h f8039m;

    /* renamed from: n */
    public final p127f0.InterfaceC1376i f8040n;

    /* renamed from: o */
    public final p193t0.C2164b f8041o;

    /* renamed from: p */
    public final p127f0.C1372e f8042p;

    /* renamed from: q */
    public final p127f0.C1372e f8043q;

    /* renamed from: r */
    public final p179q0.C1979V f8044r;

    /* renamed from: s */
    public final p197u0.C2218e f8045s;

    /* renamed from: t */
    public final long f8046t;

    /* renamed from: u */
    public final long f8047u;

    /* renamed from: w */
    public final android.support.v4.media.session.C1061t f8049w;

    /* renamed from: v */
    public final p197u0.C2227n f8048v = new p197u0.C2227n("ProgressiveMediaPeriod");

    /* renamed from: x */
    public final p078T2.C0737n f8050x = new java.lang.Object();

    /* renamed from: y */
    public final p179q0.RunnableC1972N f8051y = new p179q0.RunnableC1972N(this, 1);

    /* renamed from: z */
    public final p179q0.RunnableC1972N f8052z = new p179q0.RunnableC1972N(this, 2);

    /* renamed from: A */
    public final android.os.Handler f8014A = p086W.AbstractC0805y.m1619n(null);

    /* renamed from: E */
    public p179q0.C1976S[] f8018E = new p179q0.C1976S[0];

    /* renamed from: D */
    public p179q0.C1983Z[] f8017D = new p179q0.C1983Z[0];

    /* renamed from: T */
    public long f8033T = -9223372036854775807L;

    /* renamed from: N */
    public int f8027N = 1;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("Icy-MetaData", "1");
        f8012Y = java.util.Collections.unmodifiableMap(hashMap);
        p076T.C0701o c0701o = new p076T.C0701o();
        c0701o.f2359a = "icy";
        c0701o.f2370l = p076T.AbstractC0665H.m1201l("application/x-icy");
        f8013Z = new p076T.C0702p(c0701o);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [T2.n, java.lang.Object] */
    public C1977T(android.net.Uri uri, p094Y.InterfaceC0870h interfaceC0870h, android.support.v4.media.session.C1061t c1061t, p127f0.InterfaceC1376i interfaceC1376i, p127f0.C1372e c1372e, p193t0.C2164b c2164b, p127f0.C1372e c1372e2, p179q0.C1979V c1979v, p197u0.C2218e c2218e, int i4, long j4) {
        this.f8038l = uri;
        this.f8039m = interfaceC0870h;
        this.f8040n = interfaceC1376i;
        this.f8043q = c1372e;
        this.f8041o = c2164b;
        this.f8042p = c1372e2;
        this.f8044r = c1979v;
        this.f8045s = c2218e;
        this.f8046t = i4;
        this.f8049w = c1061t;
        this.f8047u = j4;
    }

    /* renamed from: A */
    public final void m3989A(int i4) {
        m3994a();
        p035I.C0291m c0291m = this.f8023J;
        boolean[] zArr = (boolean[]) c0291m.f879o;
        if (zArr[i4]) {
            return;
        }
        p076T.C0702p c0702p = ((p179q0.C2005k0) c0291m.f876l).m4053a(i4).f2252d[0];
        this.f8042p.m3117a(p076T.AbstractC0665H.m1196g(c0702p.f2408m), c0702p, 0, null, this.f8032S);
        zArr[i4] = true;
    }

    /* renamed from: B */
    public final void m3990B(int i4) {
        m3994a();
        boolean[] zArr = (boolean[]) this.f8023J.f877m;
        if (this.f8034U && zArr[i4] && !this.f8017D[i4].m4023s(false)) {
            this.f8033T = 0L;
            this.f8034U = false;
            this.f8029P = true;
            this.f8032S = 0L;
            this.f8035V = 0;
            for (p179q0.C1983Z c1983z : this.f8017D) {
                c1983z.m4030z(false);
            }
            p179q0.InterfaceC1961C interfaceC1961C = this.f8015B;
            interfaceC1961C.getClass();
            interfaceC1961C.mo1906f(this);
        }
    }

    /* renamed from: C */
    public final p215y0.InterfaceC2387F m3991C(p179q0.C1976S c1976s) {
        int length = this.f8017D.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (c1976s.equals(this.f8018E[i4])) {
                return this.f8017D[i4];
            }
        }
        if (this.f8019F) {
            p086W.AbstractC0781a.m1410A("ProgressiveMediaPeriod", "Extractor added new track (id=" + c1976s.f8010a + ") after finishing tracks.");
            return new p215y0.C2402n();
        }
        p127f0.C1372e c1372e = this.f8043q;
        p127f0.InterfaceC1376i interfaceC1376i = this.f8040n;
        interfaceC1376i.getClass();
        p179q0.C1983Z c1983z = new p179q0.C1983Z(this.f8045s, interfaceC1376i, c1372e);
        c1983z.f8090f = this;
        int i5 = length + 1;
        p179q0.C1976S[] c1976sArr = (p179q0.C1976S[]) java.util.Arrays.copyOf(this.f8018E, i5);
        c1976sArr[length] = c1976s;
        int i6 = p086W.AbstractC0805y.f2801a;
        this.f8018E = c1976sArr;
        p179q0.C1983Z[] c1983zArr = (p179q0.C1983Z[]) java.util.Arrays.copyOf(this.f8017D, i5);
        c1983zArr[length] = c1983z;
        this.f8017D = c1983zArr;
        return c1983z;
    }

    /* renamed from: D */
    public final void m3992D() {
        p179q0.C1974P c1974p = new p179q0.C1974P(this, this.f8038l, this.f8039m, this.f8049w, this, this.f8050x);
        if (this.f8020G) {
            p086W.AbstractC0781a.m1421j(m3997y());
            long j4 = this.f8025L;
            if (j4 != -9223372036854775807L && this.f8033T > j4) {
                this.f8036W = true;
                this.f8033T = -9223372036854775807L;
                return;
            }
            p215y0.InterfaceC2414z interfaceC2414z = this.f8024K;
            interfaceC2414z.getClass();
            long j5 = interfaceC2414z.mo32f(this.f8033T).f9503a.f9351b;
            long j6 = this.f8033T;
            c1974p.f8000r.f2437a = j5;
            c1974p.f8003u = j6;
            c1974p.f8002t = true;
            c1974p.f8006x = false;
            for (p179q0.C1983Z c1983z : this.f8017D) {
                c1983z.f8104t = this.f8033T;
            }
            this.f8033T = -9223372036854775807L;
        }
        this.f8035V = m3995d();
        this.f8042p.m3127k(new p179q0.C2019x(c1974p.f7994l, c1974p.f8004v, this.f8048v.m4434f(c1974p, this, this.f8041o.m4286e(this.f8027N))), 1, -1, null, 0, null, c1974p.f8003u, this.f8025L);
    }

    /* renamed from: E */
    public final boolean m3993E() {
        return this.f8029P || m3997y();
    }

    /* renamed from: a */
    public final void m3994a() {
        p086W.AbstractC0781a.m1421j(this.f8020G);
        this.f8023J.getClass();
        this.f8024K.getClass();
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: b */
    public final long mo2953b(long j4, p102a0.C0987m0 c0987m0) {
        m3994a();
        if (!this.f8024K.mo31c()) {
            return 0L;
        }
        p215y0.C2413y mo32f = this.f8024K.mo32f(j4);
        return c0987m0.m2029a(j4, mo32f.f9503a.f9350a, mo32f.f9504b.f9350a);
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: c */
    public final boolean mo2954c() {
        boolean z4;
        if (this.f8048v.m4432d()) {
            p078T2.C0737n c0737n = this.f8050x;
            synchronized (c0737n) {
                z4 = c0737n.f2542a;
            }
            if (z4) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final int m3995d() {
        int i4 = 0;
        for (p179q0.C1983Z c1983z : this.f8017D) {
            i4 += c1983z.f8101q + c1983z.f8100p;
        }
        return i4;
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: e */
    public final p179q0.C2005k0 mo2956e() {
        m3994a();
        return (p179q0.C2005k0) this.f8023J.f876l;
    }

    @Override // p197u0.InterfaceC2225l
    /* renamed from: f */
    public final void mo3301f() {
        for (p179q0.C1983Z c1983z : this.f8017D) {
            c1983z.m4029y();
        }
        android.support.v4.media.session.C1061t c1061t = this.f8049w;
        p215y0.InterfaceC2403o interfaceC2403o = (p215y0.InterfaceC2403o) c1061t.f3862n;
        if (interfaceC2403o != null) {
            interfaceC2403o.release();
            c1061t.f3862n = null;
        }
        c1061t.f3863o = null;
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: g */
    public final void mo2957g(p179q0.InterfaceC1961C interfaceC1961C, long j4) {
        this.f8015B = interfaceC1961C;
        this.f8050x.m1327b();
        m3992D();
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: h */
    public final long mo2958h() {
        long j4;
        boolean z4;
        m3994a();
        if (this.f8036W || this.f8030Q == 0) {
            return Long.MIN_VALUE;
        }
        if (m3997y()) {
            return this.f8033T;
        }
        if (this.f8021H) {
            int length = this.f8017D.length;
            j4 = Long.MAX_VALUE;
            for (int i4 = 0; i4 < length; i4++) {
                p035I.C0291m c0291m = this.f8023J;
                if (((boolean[]) c0291m.f877m)[i4] && ((boolean[]) c0291m.f878n)[i4]) {
                    p179q0.C1983Z c1983z = this.f8017D[i4];
                    synchronized (c1983z) {
                        z4 = c1983z.f8107w;
                    }
                    if (!z4) {
                        j4 = java.lang.Math.min(j4, this.f8017D[i4].m4016l());
                    }
                }
            }
        } else {
            j4 = Long.MAX_VALUE;
        }
        if (j4 == Long.MAX_VALUE) {
            j4 = m3996o(false);
        }
        return j4 == Long.MIN_VALUE ? this.f8032S : j4;
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: i */
    public final boolean mo2959i(p102a0.C0953Q c0953q) {
        if (this.f8036W) {
            return false;
        }
        p197u0.C2227n c2227n = this.f8048v;
        if (c2227n.m4431c() || this.f8034U) {
            return false;
        }
        if (this.f8020G && this.f8030Q == 0) {
            return false;
        }
        boolean m1327b = this.f8050x.m1327b();
        if (c2227n.m4432d()) {
            return m1327b;
        }
        m3992D();
        return true;
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: j */
    public final void mo2960j() {
        int m4286e = this.f8041o.m4286e(this.f8027N);
        p197u0.C2227n c2227n = this.f8048v;
        java.io.IOException iOException = c2227n.f8886n;
        if (iOException != null) {
            throw iOException;
        }
        p197u0.HandlerC2223j handlerC2223j = c2227n.f8885m;
        if (handlerC2223j != null) {
            if (m4286e == Integer.MIN_VALUE) {
                m4286e = handlerC2223j.f8871l;
            }
            java.io.IOException iOException2 = handlerC2223j.f8875p;
            if (iOException2 != null && handlerC2223j.f8876q > m4286e) {
                throw iOException2;
            }
        }
        if (this.f8036W && !this.f8020G) {
            throw p076T.C0666I.m1202a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // p197u0.InterfaceC2222i
    /* renamed from: k */
    public final void mo2969k(p197u0.InterfaceC2224k interfaceC2224k, long j4, long j5) {
        p215y0.InterfaceC2414z interfaceC2414z;
        p179q0.C1974P c1974p = (p179q0.C1974P) interfaceC2224k;
        if (this.f8025L == -9223372036854775807L && (interfaceC2414z = this.f8024K) != null) {
            boolean mo31c = interfaceC2414z.mo31c();
            long m3996o = m3996o(true);
            long j6 = m3996o == Long.MIN_VALUE ? 0L : m3996o + 10000;
            this.f8025L = j6;
            this.f8044r.m4000w(j6, mo31c, this.f8026M);
        }
        android.net.Uri uri = c1974p.f7996n.f3091n;
        p179q0.C2019x c2019x = new p179q0.C2019x(j5);
        this.f8041o.getClass();
        this.f8042p.m3122f(c2019x, 1, -1, null, 0, null, c1974p.f8003u, this.f8025L);
        this.f8036W = true;
        p179q0.InterfaceC1961C interfaceC1961C = this.f8015B;
        interfaceC1961C.getClass();
        interfaceC1961C.mo1906f(this);
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: l */
    public final long mo2961l(long j4) {
        boolean z4;
        m3994a();
        boolean[] zArr = (boolean[]) this.f8023J.f877m;
        if (!this.f8024K.mo31c()) {
            j4 = 0;
        }
        this.f8029P = false;
        this.f8032S = j4;
        if (m3997y()) {
            this.f8033T = j4;
            return j4;
        }
        int i4 = this.f8027N;
        p197u0.C2227n c2227n = this.f8048v;
        if (i4 != 7 && (this.f8036W || c2227n.m4432d())) {
            int length = this.f8017D.length;
            for (int i5 = 0; i5 < length; i5++) {
                p179q0.C1983Z c1983z = this.f8017D[i5];
                if (!(this.f8022I ? c1983z.m4007A(c1983z.f8101q) : c1983z.m4008B(j4, false)) && (zArr[i5] || !this.f8021H)) {
                    z4 = false;
                    break;
                }
            }
            z4 = true;
            if (z4) {
                return j4;
            }
        }
        this.f8034U = false;
        this.f8033T = j4;
        this.f8036W = false;
        if (c2227n.m4432d()) {
            for (p179q0.C1983Z c1983z2 : this.f8017D) {
                c1983z2.m4012g();
            }
            c2227n.m4430b();
        } else {
            c2227n.f8886n = null;
            for (p179q0.C1983Z c1983z3 : this.f8017D) {
                c1983z3.m4030z(false);
            }
        }
        return j4;
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: m */
    public final void mo2962m(long j4) {
        if (this.f8022I) {
            return;
        }
        m3994a();
        if (m3997y()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.f8023J.f878n;
        int length = this.f8017D.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.f8017D[i4].m4011f(j4, zArr[i4]);
        }
    }

    @Override // p179q0.InterfaceC1982Y
    /* renamed from: n */
    public final void mo3196n() {
        this.f8014A.post(this.f8051y);
    }

    /* renamed from: o */
    public final long m3996o(boolean z4) {
        int i4;
        long j4 = Long.MIN_VALUE;
        while (i4 < this.f8017D.length) {
            if (!z4) {
                p035I.C0291m c0291m = this.f8023J;
                c0291m.getClass();
                i4 = ((boolean[]) c0291m.f878n)[i4] ? 0 : i4 + 1;
            }
            j4 = java.lang.Math.max(j4, this.f8017D[i4].m4016l());
        }
        return j4;
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: p */
    public final long mo2963p(p193t0.InterfaceC2181s[] interfaceC2181sArr, boolean[] zArr, p179q0.InterfaceC1985a0[] interfaceC1985a0Arr, boolean[] zArr2, long j4) {
        p193t0.InterfaceC2181s interfaceC2181s;
        m3994a();
        p035I.C0291m c0291m = this.f8023J;
        p179q0.C2005k0 c2005k0 = (p179q0.C2005k0) c0291m.f876l;
        boolean[] zArr3 = (boolean[]) c0291m.f878n;
        int i4 = this.f8030Q;
        int i5 = 0;
        for (int i6 = 0; i6 < interfaceC2181sArr.length; i6++) {
            p179q0.InterfaceC1985a0 interfaceC1985a0 = interfaceC1985a0Arr[i6];
            if (interfaceC1985a0 != null && (interfaceC2181sArr[i6] == null || !zArr[i6])) {
                int i7 = ((p179q0.C1975Q) interfaceC1985a0).f8008l;
                p086W.AbstractC0781a.m1421j(zArr3[i7]);
                this.f8030Q--;
                zArr3[i7] = false;
                interfaceC1985a0Arr[i6] = null;
            }
        }
        boolean z4 = !this.f8028O ? j4 == 0 || this.f8022I : i4 != 0;
        for (int i8 = 0; i8 < interfaceC2181sArr.length; i8++) {
            if (interfaceC1985a0Arr[i8] == null && (interfaceC2181s = interfaceC2181sArr[i8]) != null) {
                p086W.AbstractC0781a.m1421j(interfaceC2181s.length() == 1);
                p086W.AbstractC0781a.m1421j(interfaceC2181s.mo3977k(0) == 0);
                int m4054b = c2005k0.m4054b(interfaceC2181s.mo3970b());
                p086W.AbstractC0781a.m1421j(!zArr3[m4054b]);
                this.f8030Q++;
                zArr3[m4054b] = true;
                interfaceC1985a0Arr[i8] = new p179q0.C1975Q(this, m4054b);
                zArr2[i8] = true;
                if (!z4) {
                    p179q0.C1983Z c1983z = this.f8017D[m4054b];
                    z4 = (c1983z.m4018n() == 0 || c1983z.m4008B(j4, true)) ? false : true;
                }
            }
        }
        if (this.f8030Q == 0) {
            this.f8034U = false;
            this.f8029P = false;
            p197u0.C2227n c2227n = this.f8048v;
            if (c2227n.m4432d()) {
                p179q0.C1983Z[] c1983zArr = this.f8017D;
                int length = c1983zArr.length;
                while (i5 < length) {
                    c1983zArr[i5].m4012g();
                    i5++;
                }
                c2227n.m4430b();
            } else {
                this.f8036W = false;
                for (p179q0.C1983Z c1983z2 : this.f8017D) {
                    c1983z2.m4030z(false);
                }
            }
        } else if (z4) {
            j4 = mo2961l(j4);
            while (i5 < interfaceC1985a0Arr.length) {
                if (interfaceC1985a0Arr[i5] != null) {
                    zArr2[i5] = true;
                }
                i5++;
            }
        }
        this.f8028O = true;
        return j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    @Override // p197u0.InterfaceC2222i
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p128f1.C1383e mo2970q(p197u0.InterfaceC2224k r17, long r18, long r20, java.io.IOException r22, int r23) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p179q0.C1977T.mo2970q(u0.k, long, long, java.io.IOException, int):f1.e");
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: r */
    public final long mo2964r() {
        return mo2958h();
    }

    @Override // p215y0.InterfaceC2405q
    /* renamed from: s */
    public final void mo637s() {
        this.f8019F = true;
        this.f8014A.post(this.f8051y);
    }

    @Override // p215y0.InterfaceC2405q
    /* renamed from: t */
    public final void mo638t(p215y0.InterfaceC2414z interfaceC2414z) {
        this.f8014A.post(new p086W.RunnableC0793m(11, this, interfaceC2414z));
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: u */
    public final long mo2965u() {
        if (!this.f8029P) {
            return -9223372036854775807L;
        }
        if (!this.f8036W && m3995d() <= this.f8035V) {
            return -9223372036854775807L;
        }
        this.f8029P = false;
        return this.f8032S;
    }

    @Override // p215y0.InterfaceC2405q
    /* renamed from: v */
    public final p215y0.InterfaceC2387F mo640v(int i4, int i5) {
        return m3991C(new p179q0.C1976S(i4, false));
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: w */
    public final void mo2966w(long j4) {
    }

    @Override // p197u0.InterfaceC2222i
    /* renamed from: x */
    public final void mo2971x(p197u0.InterfaceC2224k interfaceC2224k, long j4, long j5, boolean z4) {
        p179q0.C1974P c1974p = (p179q0.C1974P) interfaceC2224k;
        android.net.Uri uri = c1974p.f7996n.f3091n;
        p179q0.C2019x c2019x = new p179q0.C2019x(j5);
        this.f8041o.getClass();
        this.f8042p.m3119c(c2019x, 1, -1, null, 0, null, c1974p.f8003u, this.f8025L);
        if (z4) {
            return;
        }
        for (p179q0.C1983Z c1983z : this.f8017D) {
            c1983z.m4030z(false);
        }
        if (this.f8030Q > 0) {
            p179q0.InterfaceC1961C interfaceC1961C = this.f8015B;
            interfaceC1961C.getClass();
            interfaceC1961C.mo1906f(this);
        }
    }

    /* renamed from: y */
    public final boolean m3997y() {
        return this.f8033T != -9223372036854775807L;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [I.m, java.lang.Object] */
    /* renamed from: z */
    public final void m3998z() {
        long j4;
        int i4;
        if (this.f8037X || this.f8020G || !this.f8019F || this.f8024K == null) {
            return;
        }
        for (p179q0.C1983Z c1983z : this.f8017D) {
            if (c1983z.m4021q() == null) {
                return;
            }
        }
        this.f8050x.m1326a();
        int length = this.f8017D.length;
        p076T.C0678V[] c0678vArr = new p076T.C0678V[length];
        boolean[] zArr = new boolean[length];
        int i5 = 0;
        while (true) {
            j4 = this.f8047u;
            if (i5 >= length) {
                break;
            }
            p076T.C0702p m4021q = this.f8017D[i5].m4021q();
            m4021q.getClass();
            java.lang.String str = m4021q.f2408m;
            boolean m1197h = p076T.AbstractC0665H.m1197h(str);
            boolean z4 = m1197h || p076T.AbstractC0665H.m1200k(str);
            zArr[i5] = z4;
            this.f8021H = z4 | this.f8021H;
            this.f8022I = j4 != -9223372036854775807L && length == 1 && p076T.AbstractC0665H.m1198i(str);
            p045L0.C0355b c0355b = this.f8016C;
            if (c0355b != null) {
                if (m1197h || this.f8018E[i5].f8011b) {
                    p076T.C0664G c0664g = m4021q.f2406k;
                    p076T.C0664G c0664g2 = c0664g == null ? new p076T.C0664G(c0355b) : c0664g.m1186d(c0355b);
                    p076T.C0701o m1295a = m4021q.m1295a();
                    m1295a.f2368j = c0664g2;
                    m4021q = new p076T.C0702p(m1295a);
                }
                if (m1197h && m4021q.f2402g == -1 && m4021q.f2403h == -1 && (i4 = c0355b.f1083l) != -1) {
                    p076T.C0701o m1295a2 = m4021q.m1295a();
                    m1295a2.f2365g = i4;
                    m4021q = new p076T.C0702p(m1295a2);
                }
            }
            int mo3132d = this.f8040n.mo3132d(m4021q);
            p076T.C0701o m1295a3 = m4021q.m1295a();
            m1295a3.f2358I = mo3132d;
            c0678vArr[i5] = new p076T.C0678V(java.lang.Integer.toString(i5), new p076T.C0702p(m1295a3));
            i5++;
        }
        p179q0.C2005k0 c2005k0 = new p179q0.C2005k0(c0678vArr);
        ?? obj = new java.lang.Object();
        obj.f876l = c2005k0;
        obj.f877m = zArr;
        int i6 = c2005k0.f8184a;
        obj.f878n = new boolean[i6];
        obj.f879o = new boolean[i6];
        this.f8023J = obj;
        if (this.f8022I && this.f8025L == -9223372036854775807L) {
            this.f8025L = j4;
            this.f8024K = new p179q0.C1973O(this, this.f8024K);
        }
        this.f8044r.m4000w(this.f8025L, this.f8024K.mo31c(), this.f8026M);
        this.f8020G = true;
        p179q0.InterfaceC1961C interfaceC1961C = this.f8015B;
        interfaceC1961C.getClass();
        interfaceC1961C.mo1920o(this);
    }
}
