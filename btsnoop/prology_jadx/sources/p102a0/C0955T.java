package p102a0;

/* renamed from: a0.T */
/* loaded from: classes.dex */
public final class C0955T {

    /* renamed from: a */
    public final java.lang.Object f3453a;

    /* renamed from: b */
    public final java.lang.Object f3454b;

    /* renamed from: c */
    public final p179q0.InterfaceC1985a0[] f3455c;

    /* renamed from: d */
    public boolean f3456d;

    /* renamed from: e */
    public boolean f3457e;

    /* renamed from: f */
    public p102a0.C0956U f3458f;

    /* renamed from: g */
    public boolean f3459g;

    /* renamed from: h */
    public final boolean[] f3460h;

    /* renamed from: i */
    public final p102a0.AbstractC0970e[] f3461i;

    /* renamed from: j */
    public final p193t0.AbstractC2183u f3462j;

    /* renamed from: k */
    public final p102a0.C0971e0 f3463k;

    /* renamed from: l */
    public p102a0.C0955T f3464l;

    /* renamed from: m */
    public p179q0.C2005k0 f3465m;

    /* renamed from: n */
    public p193t0.C2184v f3466n;

    /* renamed from: o */
    public long f3467o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [q0.d] */
    public C0955T(p102a0.AbstractC0970e[] abstractC0970eArr, long j4, p193t0.AbstractC2183u abstractC2183u, p197u0.C2218e c2218e, p102a0.C0971e0 c0971e0, p102a0.C0956U c0956u, p193t0.C2184v c2184v) {
        this.f3461i = abstractC0970eArr;
        this.f3467o = j4;
        this.f3462j = abstractC2183u;
        this.f3463k = c0971e0;
        p179q0.C1964F c1964f = c0956u.f3468a;
        this.f3454b = c1964f.f7960a;
        this.f3458f = c0956u;
        this.f3465m = p179q0.C2005k0.f8183d;
        this.f3466n = c2184v;
        this.f3455c = new p179q0.InterfaceC1985a0[abstractC0970eArr.length];
        this.f3460h = new boolean[abstractC0970eArr.length];
        c0971e0.getClass();
        int i4 = p102a0.AbstractC0962a.f3501d;
        android.util.Pair pair = (android.util.Pair) c1964f.f7960a;
        java.lang.Object obj = pair.first;
        p179q0.C1964F m3967a = c1964f.m3967a(pair.second);
        p102a0.C0969d0 c0969d0 = (p102a0.C0969d0) c0971e0.f3557d.get(obj);
        c0969d0.getClass();
        c0971e0.f3560g.add(c0969d0);
        p102a0.C0967c0 c0967c0 = (p102a0.C0967c0) c0971e0.f3559f.get(c0969d0);
        if (c0967c0 != null) {
            c0967c0.f3521a.m4034e(c0967c0.f3522b);
        }
        c0969d0.f3534c.add(m3967a);
        p179q0.C2020y mo2975b = c0969d0.f3532a.mo2975b(m3967a, c2218e, c0956u.f3469b);
        c0971e0.f3556c.put(mo2975b, c0969d0);
        c0971e0.m2004c();
        long j5 = c0956u.f3471d;
        this.f3453a = j5 != -9223372036854775807L ? new p179q0.C1990d(mo2975b, true, 0L, j5) : mo2975b;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [q0.D, java.lang.Object] */
    /* renamed from: a */
    public final long m1935a(p193t0.C2184v c2184v, long j4, boolean z4, boolean[] zArr) {
        p102a0.AbstractC0970e[] abstractC0970eArr;
        java.lang.Object[] objArr;
        int i4 = 0;
        while (true) {
            boolean z5 = true;
            if (i4 >= c2184v.f8720a) {
                break;
            }
            if (z4 || !c2184v.m4305a(this.f3466n, i4)) {
                z5 = false;
            }
            this.f3460h[i4] = z5;
            i4++;
        }
        int i5 = 0;
        while (true) {
            abstractC0970eArr = this.f3461i;
            int length = abstractC0970eArr.length;
            objArr = this.f3455c;
            if (i5 >= length) {
                break;
            }
            if (abstractC0970eArr[i5].f3540m == -2) {
                objArr[i5] = null;
            }
            i5++;
        }
        m1936b();
        this.f3466n = c2184v;
        m1937c();
        long mo2963p = this.f3453a.mo2963p(c2184v.f8722c, this.f3460h, this.f3455c, zArr, j4);
        for (int i6 = 0; i6 < abstractC0970eArr.length; i6++) {
            if (abstractC0970eArr[i6].f3540m == -2 && this.f3466n.m4306b(i6)) {
                objArr[i6] = new java.lang.Object();
            }
        }
        this.f3457e = false;
        for (int i7 = 0; i7 < objArr.length; i7++) {
            if (objArr[i7] != null) {
                p086W.AbstractC0781a.m1421j(c2184v.m4306b(i7));
                if (abstractC0970eArr[i7].f3540m != -2) {
                    this.f3457e = true;
                }
            } else {
                p086W.AbstractC0781a.m1421j(c2184v.f8722c[i7] == null);
            }
        }
        return mo2963p;
    }

    /* renamed from: b */
    public final void m1936b() {
        if (this.f3464l != null) {
            return;
        }
        int i4 = 0;
        while (true) {
            p193t0.C2184v c2184v = this.f3466n;
            if (i4 >= c2184v.f8720a) {
                return;
            }
            boolean m4306b = c2184v.m4306b(i4);
            p193t0.InterfaceC2181s interfaceC2181s = this.f3466n.f8722c[i4];
            if (m4306b && interfaceC2181s != null) {
                interfaceC2181s.mo3983r();
            }
            i4++;
        }
    }

    /* renamed from: c */
    public final void m1937c() {
        if (this.f3464l != null) {
            return;
        }
        int i4 = 0;
        while (true) {
            p193t0.C2184v c2184v = this.f3466n;
            if (i4 >= c2184v.f8720a) {
                return;
            }
            boolean m4306b = c2184v.m4306b(i4);
            p193t0.InterfaceC2181s interfaceC2181s = this.f3466n.f8722c[i4];
            if (m4306b && interfaceC2181s != null) {
                interfaceC2181s.mo3975i();
            }
            i4++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [q0.c0, java.lang.Object] */
    /* renamed from: d */
    public final long m1938d() {
        if (!this.f3456d) {
            return this.f3458f.f3469b;
        }
        long mo2958h = this.f3457e ? this.f3453a.mo2958h() : Long.MIN_VALUE;
        return mo2958h == Long.MIN_VALUE ? this.f3458f.f3472e : mo2958h;
    }

    /* renamed from: e */
    public final long m1939e() {
        return this.f3458f.f3469b + this.f3467o;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [q0.c0, java.lang.Object] */
    /* renamed from: f */
    public final boolean m1940f() {
        return this.f3456d && (!this.f3457e || this.f3453a.mo2958h() == Long.MIN_VALUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [q0.D, java.lang.Object] */
    /* renamed from: g */
    public final void m1941g() {
        m1936b();
        ?? r02 = this.f3453a;
        try {
            boolean z4 = r02 instanceof p179q0.C1990d;
            p102a0.C0971e0 c0971e0 = this.f3463k;
            if (z4) {
                c0971e0.m2007f(((p179q0.C1990d) r02).f8121l);
            } else {
                c0971e0.m2007f(r02);
            }
        } catch (java.lang.RuntimeException e4) {
            p086W.AbstractC0781a.m1426o("MediaPeriodHolder", "Period release failed.", e4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x02b2, code lost:
    
        if (p129f2.AbstractC1453z.f5826a.mo3261c(r9.f8659m, r8.f8659m).mo3261c(r9.f8658l, r8.f8658l).mo3263e() > 0) goto L130;
     */
    /* JADX WARN: Type inference failed for: r1v18, types: [f2.F, f2.C] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p193t0.C2184v m1942h(float r36, p076T.AbstractC0677U r37) {
        /*
            Method dump skipped, instructions count: 2126
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p102a0.C0955T.m1942h(float, T.U):t0.v");
    }

    /* renamed from: i */
    public final void m1943i() {
        java.lang.Object obj = this.f3453a;
        if (obj instanceof p179q0.C1990d) {
            long j4 = this.f3458f.f3471d;
            if (j4 == -9223372036854775807L) {
                j4 = Long.MIN_VALUE;
            }
            p179q0.C1990d c1990d = (p179q0.C1990d) obj;
            c1990d.f8125p = 0L;
            c1990d.f8126q = j4;
        }
    }
}
