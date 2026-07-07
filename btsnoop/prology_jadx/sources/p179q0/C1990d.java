package p179q0;

/* renamed from: q0.d */
/* loaded from: classes.dex */
public final class C1990d implements p179q0.InterfaceC1962D, p179q0.InterfaceC1961C {

    /* renamed from: l */
    public final p179q0.InterfaceC1962D f8121l;

    /* renamed from: m */
    public p179q0.InterfaceC1961C f8122m;

    /* renamed from: n */
    public p179q0.C1988c[] f8123n = new p179q0.C1988c[0];

    /* renamed from: o */
    public long f8124o;

    /* renamed from: p */
    public long f8125p;

    /* renamed from: q */
    public long f8126q;

    /* renamed from: r */
    public p179q0.C1994f f8127r;

    public C1990d(p179q0.InterfaceC1962D interfaceC1962D, boolean z4, long j4, long j5) {
        this.f8121l = interfaceC1962D;
        this.f8124o = z4 ? j4 : -9223372036854775807L;
        this.f8125p = j4;
        this.f8126q = j5;
    }

    /* renamed from: a */
    public final boolean m4043a() {
        return this.f8124o != -9223372036854775807L;
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: b */
    public final long mo2953b(long j4, p102a0.C0987m0 c0987m0) {
        long j5 = this.f8125p;
        if (j4 == j5) {
            return j5;
        }
        long m1616k = p086W.AbstractC0805y.m1616k(c0987m0.f3672a, 0L, j4 - j5);
        long j6 = this.f8126q;
        long m1616k2 = p086W.AbstractC0805y.m1616k(c0987m0.f3673b, 0L, j6 == Long.MIN_VALUE ? Long.MAX_VALUE : j6 - j4);
        if (m1616k != c0987m0.f3672a || m1616k2 != c0987m0.f3673b) {
            c0987m0 = new p102a0.C0987m0(m1616k, m1616k2);
        }
        return this.f8121l.mo2953b(j4, c0987m0);
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: c */
    public final boolean mo2954c() {
        return this.f8121l.mo2954c();
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: e */
    public final p179q0.C2005k0 mo2956e() {
        return this.f8121l.mo2956e();
    }

    @Override // p179q0.InterfaceC1987b0
    /* renamed from: f */
    public final void mo1906f(p179q0.InterfaceC1989c0 interfaceC1989c0) {
        p179q0.InterfaceC1961C interfaceC1961C = this.f8122m;
        interfaceC1961C.getClass();
        interfaceC1961C.mo1906f(this);
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: g */
    public final void mo2957g(p179q0.InterfaceC1961C interfaceC1961C, long j4) {
        this.f8122m = interfaceC1961C;
        this.f8121l.mo2957g(this, j4);
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: h */
    public final long mo2958h() {
        long mo2958h = this.f8121l.mo2958h();
        if (mo2958h != Long.MIN_VALUE) {
            long j4 = this.f8126q;
            if (j4 == Long.MIN_VALUE || mo2958h < j4) {
                return mo2958h;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: i */
    public final boolean mo2959i(p102a0.C0953Q c0953q) {
        return this.f8121l.mo2959i(c0953q);
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: j */
    public final void mo2960j() {
        p179q0.C1994f c1994f = this.f8127r;
        if (c1994f != null) {
            throw c1994f;
        }
        this.f8121l.mo2960j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r0 > r6) goto L17;
     */
    @Override // p179q0.InterfaceC1962D
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo2961l(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f8124o = r0
            q0.c[] r0 = r5.f8123n
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f8119m = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            q0.D r0 = r5.f8121l
            long r0 = r0.mo2961l(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L33
            long r6 = r5.f8125p
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L34
            long r6 = r5.f8126q
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L33
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L34
        L33:
            r2 = 1
        L34:
            p086W.AbstractC0781a.m1421j(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p179q0.C1990d.mo2961l(long):long");
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: m */
    public final void mo2962m(long j4) {
        this.f8121l.mo2962m(j4);
    }

    @Override // p179q0.InterfaceC1961C
    /* renamed from: o */
    public final void mo1920o(p179q0.InterfaceC1962D interfaceC1962D) {
        if (this.f8127r != null) {
            return;
        }
        p179q0.InterfaceC1961C interfaceC1961C = this.f8122m;
        interfaceC1961C.getClass();
        interfaceC1961C.mo1920o(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x011f, code lost:
    
        if (r1 > r3) goto L94;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x005e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x00e4. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012b  */
    @Override // p179q0.InterfaceC1962D
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo2963p(p193t0.InterfaceC2181s[] r16, boolean[] r17, p179q0.InterfaceC1985a0[] r18, boolean[] r19, long r20) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p179q0.C1990d.mo2963p(t0.s[], boolean[], q0.a0[], boolean[], long):long");
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: r */
    public final long mo2964r() {
        long mo2964r = this.f8121l.mo2964r();
        if (mo2964r != Long.MIN_VALUE) {
            long j4 = this.f8126q;
            if (j4 == Long.MIN_VALUE || mo2964r < j4) {
                return mo2964r;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: u */
    public final long mo2965u() {
        if (m4043a()) {
            long j4 = this.f8124o;
            this.f8124o = -9223372036854775807L;
            long mo2965u = mo2965u();
            return mo2965u != -9223372036854775807L ? mo2965u : j4;
        }
        long mo2965u2 = this.f8121l.mo2965u();
        if (mo2965u2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        p086W.AbstractC0781a.m1421j(mo2965u2 >= this.f8125p);
        long j5 = this.f8126q;
        p086W.AbstractC0781a.m1421j(j5 == Long.MIN_VALUE || mo2965u2 <= j5);
        return mo2965u2;
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: w */
    public final void mo2966w(long j4) {
        this.f8121l.mo2966w(j4);
    }
}
