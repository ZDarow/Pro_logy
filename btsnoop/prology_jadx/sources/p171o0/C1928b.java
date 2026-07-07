package p171o0;

/* renamed from: o0.b */
/* loaded from: classes.dex */
public final class C1928b implements p179q0.InterfaceC1962D, p179q0.InterfaceC1987b0 {

    /* renamed from: l */
    public final p096Y1.C0890a f7829l;

    /* renamed from: m */
    public final p094Y.InterfaceC0860C f7830m;

    /* renamed from: n */
    public final p197u0.InterfaceC2228o f7831n;

    /* renamed from: o */
    public final p127f0.InterfaceC1376i f7832o;

    /* renamed from: p */
    public final p127f0.C1372e f7833p;

    /* renamed from: q */
    public final p193t0.C2164b f7834q;

    /* renamed from: r */
    public final p127f0.C1372e f7835r;

    /* renamed from: s */
    public final p197u0.C2218e f7836s;

    /* renamed from: t */
    public final p179q0.C2005k0 f7837t;

    /* renamed from: u */
    public final p046L1.C0363g f7838u;

    /* renamed from: v */
    public p179q0.InterfaceC1961C f7839v;

    /* renamed from: w */
    public p175p0.C1944c f7840w;

    /* renamed from: x */
    public p184r0.C2050h[] f7841x;

    /* renamed from: y */
    public p179q0.C2006l f7842y;

    public C1928b(p175p0.C1944c c1944c, p096Y1.C0890a c0890a, p094Y.InterfaceC0860C interfaceC0860C, p046L1.C0363g c0363g, p127f0.InterfaceC1376i interfaceC1376i, p127f0.C1372e c1372e, p193t0.C2164b c2164b, p127f0.C1372e c1372e2, p197u0.InterfaceC2228o interfaceC2228o, p197u0.C2218e c2218e) {
        this.f7840w = c1944c;
        this.f7829l = c0890a;
        this.f7830m = interfaceC0860C;
        this.f7831n = interfaceC2228o;
        this.f7832o = interfaceC1376i;
        this.f7833p = c1372e;
        this.f7834q = c2164b;
        this.f7835r = c1372e2;
        this.f7836s = c2218e;
        this.f7838u = c0363g;
        p076T.C0678V[] c0678vArr = new p076T.C0678V[c1944c.f7906f.length];
        int i4 = 0;
        while (true) {
            p175p0.C1943b[] c1943bArr = c1944c.f7906f;
            if (i4 >= c1943bArr.length) {
                this.f7837t = new p179q0.C2005k0(c0678vArr);
                this.f7841x = new p184r0.C2050h[0];
                c0363g.getClass();
                p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
                p129f2.C1415c0 c1415c0 = p129f2.C1415c0.f5744p;
                this.f7842y = new p179q0.C2006l(c1415c0, c1415c0);
                return;
            }
            p076T.C0702p[] c0702pArr = c1943bArr[i4].f7894j;
            p076T.C0702p[] c0702pArr2 = new p076T.C0702p[c0702pArr.length];
            for (int i5 = 0; i5 < c0702pArr.length; i5++) {
                p076T.C0702p c0702p = c0702pArr[i5];
                p076T.C0701o m1295a = c0702p.m1295a();
                m1295a.f2358I = interfaceC1376i.mo3132d(c0702p);
                p076T.C0702p c0702p2 = new p076T.C0702p(m1295a);
                if (c0890a.f3188l && ((p046L1.C0363g) c0890a.f3190n).mo600o(c0702p2)) {
                    p076T.C0701o m1295a2 = c0702p2.m1295a();
                    m1295a2.f2370l = p076T.AbstractC0665H.m1201l("application/x-media3-cues");
                    m1295a2.f2355F = ((p046L1.C0363g) c0890a.f3190n).mo592e(c0702p2);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(c0702p2.f2408m);
                    java.lang.String str = c0702p2.f2405j;
                    sb.append(str != null ? " ".concat(str) : "");
                    m1295a2.f2367i = sb.toString();
                    m1295a2.f2375q = Long.MAX_VALUE;
                    c0702p2 = new p076T.C0702p(m1295a2);
                }
                c0702pArr2[i5] = c0702p2;
            }
            c0678vArr[i4] = new p076T.C0678V(java.lang.Integer.toString(i4), c0702pArr2);
            i4++;
        }
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: b */
    public final long mo2953b(long j4, p102a0.C0987m0 c0987m0) {
        for (p184r0.C2050h c2050h : this.f7841x) {
            if (c2050h.f8353l == 2) {
                return c2050h.f8357p.mo2995b(j4, c0987m0);
            }
        }
        return j4;
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: c */
    public final boolean mo2954c() {
        return this.f7842y.mo2954c();
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: e */
    public final p179q0.C2005k0 mo2956e() {
        return this.f7837t;
    }

    @Override // p179q0.InterfaceC1987b0
    /* renamed from: f */
    public final void mo1906f(p179q0.InterfaceC1989c0 interfaceC1989c0) {
        p179q0.InterfaceC1961C interfaceC1961C = this.f7839v;
        interfaceC1961C.getClass();
        interfaceC1961C.mo1906f(this);
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: g */
    public final void mo2957g(p179q0.InterfaceC1961C interfaceC1961C, long j4) {
        this.f7839v = interfaceC1961C;
        interfaceC1961C.mo1920o(this);
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: h */
    public final long mo2958h() {
        return this.f7842y.mo2958h();
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: i */
    public final boolean mo2959i(p102a0.C0953Q c0953q) {
        return this.f7842y.mo2959i(c0953q);
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: j */
    public final void mo2960j() {
        this.f7831n.mo2967a();
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: l */
    public final long mo2961l(long j4) {
        for (p184r0.C2050h c2050h : this.f7841x) {
            c2050h.m4107C(j4);
        }
        return j4;
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: m */
    public final void mo2962m(long j4) {
        for (p184r0.C2050h c2050h : this.f7841x) {
            c2050h.m4108m(j4);
        }
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: p */
    public final long mo2963p(p193t0.InterfaceC2181s[] interfaceC2181sArr, boolean[] zArr, p179q0.InterfaceC1985a0[] interfaceC1985a0Arr, boolean[] zArr2, long j4) {
        int i4;
        p193t0.InterfaceC2181s interfaceC2181s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i5 = 0;
        while (i5 < interfaceC2181sArr.length) {
            p179q0.InterfaceC1985a0 interfaceC1985a0 = interfaceC1985a0Arr[i5];
            if (interfaceC1985a0 != null) {
                p184r0.C2050h c2050h = (p184r0.C2050h) interfaceC1985a0;
                p193t0.InterfaceC2181s interfaceC2181s2 = interfaceC2181sArr[i5];
                if (interfaceC2181s2 == null || !zArr[i5]) {
                    c2050h.m4106B(null);
                    interfaceC1985a0Arr[i5] = null;
                } else {
                    ((p171o0.C1927a) c2050h.f8357p).f7825e = interfaceC2181s2;
                    arrayList.add(c2050h);
                }
            }
            if (interfaceC1985a0Arr[i5] != null || (interfaceC2181s = interfaceC2181sArr[i5]) == null) {
                i4 = i5;
            } else {
                int m4054b = this.f7837t.m4054b(interfaceC2181s.mo3970b());
                p175p0.C1944c c1944c = this.f7840w;
                p096Y1.C0890a c0890a = this.f7829l;
                p094Y.InterfaceC0870h mo104a = ((p094Y.InterfaceC0869g) c0890a.f3189m).mo104a();
                p094Y.InterfaceC0860C interfaceC0860C = this.f7830m;
                if (interfaceC0860C != null) {
                    mo104a.mo1688j(interfaceC0860C);
                }
                i4 = i5;
                p184r0.C2050h c2050h2 = new p184r0.C2050h(this.f7840w.f7906f[m4054b].f7885a, null, null, new p171o0.C1927a(this.f7831n, c1944c, m4054b, interfaceC2181s, mo104a, (p046L1.C0363g) c0890a.f3190n, c0890a.f3188l), this, this.f7836s, j4, this.f7832o, this.f7833p, this.f7834q, this.f7835r);
                arrayList.add(c2050h2);
                interfaceC1985a0Arr[i4] = c2050h2;
                zArr2[i4] = true;
            }
            i5 = i4 + 1;
        }
        p184r0.C2050h[] c2050hArr = new p184r0.C2050h[arrayList.size()];
        this.f7841x = c2050hArr;
        arrayList.toArray(c2050hArr);
        java.util.AbstractList m3243w = p129f2.AbstractC1444r.m3243w(arrayList, new p107b0.C1169d(15));
        this.f7838u.getClass();
        this.f7842y = new p179q0.C2006l(arrayList, m3243w);
        return j4;
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: r */
    public final long mo2964r() {
        return this.f7842y.mo2964r();
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: u */
    public final long mo2965u() {
        return -9223372036854775807L;
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: w */
    public final void mo2966w(long j4) {
        this.f7842y.mo2966w(j4);
    }
}
