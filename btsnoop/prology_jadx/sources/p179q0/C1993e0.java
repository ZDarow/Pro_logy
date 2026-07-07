package p179q0;

/* renamed from: q0.e0 */
/* loaded from: classes.dex */
public final class C1993e0 implements p179q0.InterfaceC1962D {

    /* renamed from: n */
    public static final p179q0.C2005k0 f8135n = new p179q0.C2005k0(new p076T.C0678V("", p179q0.C1997g0.f8150u));

    /* renamed from: l */
    public final long f8136l;

    /* renamed from: m */
    public final java.util.ArrayList f8137m = new java.util.ArrayList();

    public C1993e0(long j4) {
        this.f8136l = j4;
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: b */
    public final long mo2953b(long j4, p102a0.C0987m0 c0987m0) {
        return p086W.AbstractC0805y.m1616k(j4, 0L, this.f8136l);
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: c */
    public final boolean mo2954c() {
        return false;
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: e */
    public final p179q0.C2005k0 mo2956e() {
        return f8135n;
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: g */
    public final void mo2957g(p179q0.InterfaceC1961C interfaceC1961C, long j4) {
        interfaceC1961C.mo1920o(this);
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: h */
    public final long mo2958h() {
        return Long.MIN_VALUE;
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: i */
    public final boolean mo2959i(p102a0.C0953Q c0953q) {
        return false;
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: j */
    public final void mo2960j() {
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: l */
    public final long mo2961l(long j4) {
        long m1616k = p086W.AbstractC0805y.m1616k(j4, 0L, this.f8136l);
        int i4 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f8137m;
            if (i4 >= arrayList.size()) {
                return m1616k;
            }
            ((p179q0.C1995f0) arrayList.get(i4)).m4047b(m1616k);
            i4++;
        }
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: m */
    public final void mo2962m(long j4) {
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: p */
    public final long mo2963p(p193t0.InterfaceC2181s[] interfaceC2181sArr, boolean[] zArr, p179q0.InterfaceC1985a0[] interfaceC1985a0Arr, boolean[] zArr2, long j4) {
        long m1616k = p086W.AbstractC0805y.m1616k(j4, 0L, this.f8136l);
        for (int i4 = 0; i4 < interfaceC2181sArr.length; i4++) {
            p179q0.InterfaceC1985a0 interfaceC1985a0 = interfaceC1985a0Arr[i4];
            java.util.ArrayList arrayList = this.f8137m;
            if (interfaceC1985a0 != null && (interfaceC2181sArr[i4] == null || !zArr[i4])) {
                arrayList.remove(interfaceC1985a0);
                interfaceC1985a0Arr[i4] = null;
            }
            if (interfaceC1985a0Arr[i4] == null && interfaceC2181sArr[i4] != null) {
                p179q0.C1995f0 c1995f0 = new p179q0.C1995f0(this.f8136l);
                c1995f0.m4047b(m1616k);
                arrayList.add(c1995f0);
                interfaceC1985a0Arr[i4] = c1995f0;
                zArr2[i4] = true;
            }
        }
        return m1616k;
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: r */
    public final long mo2964r() {
        return Long.MIN_VALUE;
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: u */
    public final long mo2965u() {
        return -9223372036854775807L;
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: w */
    public final void mo2966w(long j4) {
    }
}
