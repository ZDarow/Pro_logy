package p179q0;

/* renamed from: q0.j0 */
/* loaded from: classes.dex */
public final class C2003j0 implements p179q0.InterfaceC1962D, p179q0.InterfaceC1961C {

    /* renamed from: l */
    public final p179q0.InterfaceC1962D f8178l;

    /* renamed from: m */
    public final long f8179m;

    /* renamed from: n */
    public p179q0.InterfaceC1961C f8180n;

    public C2003j0(p179q0.InterfaceC1962D interfaceC1962D, long j4) {
        this.f8178l = interfaceC1962D;
        this.f8179m = j4;
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: b */
    public final long mo2953b(long j4, p102a0.C0987m0 c0987m0) {
        long j5 = this.f8179m;
        return this.f8178l.mo2953b(j4 - j5, c0987m0) + j5;
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: c */
    public final boolean mo2954c() {
        return this.f8178l.mo2954c();
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: e */
    public final p179q0.C2005k0 mo2956e() {
        return this.f8178l.mo2956e();
    }

    @Override // p179q0.InterfaceC1987b0
    /* renamed from: f */
    public final void mo1906f(p179q0.InterfaceC1989c0 interfaceC1989c0) {
        p179q0.InterfaceC1961C interfaceC1961C = this.f8180n;
        interfaceC1961C.getClass();
        interfaceC1961C.mo1906f(this);
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: g */
    public final void mo2957g(p179q0.InterfaceC1961C interfaceC1961C, long j4) {
        this.f8180n = interfaceC1961C;
        this.f8178l.mo2957g(this, j4 - this.f8179m);
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: h */
    public final long mo2958h() {
        long mo2958h = this.f8178l.mo2958h();
        if (mo2958h == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f8179m + mo2958h;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, a0.P] */
    @Override // p179q0.InterfaceC1989c0
    /* renamed from: i */
    public final boolean mo2959i(p102a0.C0953Q c0953q) {
        ?? obj = new java.lang.Object();
        obj.f3448b = c0953q.f3451b;
        obj.f3449c = c0953q.f3452c;
        obj.f3447a = c0953q.f3450a - this.f8179m;
        return this.f8178l.mo2959i(new p102a0.C0953Q(obj));
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: j */
    public final void mo2960j() {
        this.f8178l.mo2960j();
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: l */
    public final long mo2961l(long j4) {
        long j5 = this.f8179m;
        return this.f8178l.mo2961l(j4 - j5) + j5;
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: m */
    public final void mo2962m(long j4) {
        this.f8178l.mo2962m(j4 - this.f8179m);
    }

    @Override // p179q0.InterfaceC1961C
    /* renamed from: o */
    public final void mo1920o(p179q0.InterfaceC1962D interfaceC1962D) {
        p179q0.InterfaceC1961C interfaceC1961C = this.f8180n;
        interfaceC1961C.getClass();
        interfaceC1961C.mo1920o(this);
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: p */
    public final long mo2963p(p193t0.InterfaceC2181s[] interfaceC2181sArr, boolean[] zArr, p179q0.InterfaceC1985a0[] interfaceC1985a0Arr, boolean[] zArr2, long j4) {
        p179q0.InterfaceC1985a0[] interfaceC1985a0Arr2 = new p179q0.InterfaceC1985a0[interfaceC1985a0Arr.length];
        int i4 = 0;
        while (true) {
            p179q0.InterfaceC1985a0 interfaceC1985a0 = null;
            if (i4 >= interfaceC1985a0Arr.length) {
                break;
            }
            p179q0.C2001i0 c2001i0 = (p179q0.C2001i0) interfaceC1985a0Arr[i4];
            if (c2001i0 != null) {
                interfaceC1985a0 = c2001i0.f8173l;
            }
            interfaceC1985a0Arr2[i4] = interfaceC1985a0;
            i4++;
        }
        long j5 = this.f8179m;
        long mo2963p = this.f8178l.mo2963p(interfaceC2181sArr, zArr, interfaceC1985a0Arr2, zArr2, j4 - j5);
        for (int i5 = 0; i5 < interfaceC1985a0Arr.length; i5++) {
            p179q0.InterfaceC1985a0 interfaceC1985a02 = interfaceC1985a0Arr2[i5];
            if (interfaceC1985a02 == null) {
                interfaceC1985a0Arr[i5] = null;
            } else {
                p179q0.InterfaceC1985a0 interfaceC1985a03 = interfaceC1985a0Arr[i5];
                if (interfaceC1985a03 == null || ((p179q0.C2001i0) interfaceC1985a03).f8173l != interfaceC1985a02) {
                    interfaceC1985a0Arr[i5] = new p179q0.C2001i0(interfaceC1985a02, j5);
                }
            }
        }
        return mo2963p + j5;
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: r */
    public final long mo2964r() {
        long mo2964r = this.f8178l.mo2964r();
        if (mo2964r == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f8179m + mo2964r;
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: u */
    public final long mo2965u() {
        long mo2965u = this.f8178l.mo2965u();
        if (mo2965u == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f8179m + mo2965u;
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: w */
    public final void mo2966w(long j4) {
        this.f8178l.mo2966w(j4 - this.f8179m);
    }
}
