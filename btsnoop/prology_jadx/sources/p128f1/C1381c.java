package p128f1;

/* renamed from: f1.c */
/* loaded from: classes.dex */
public final class C1381c implements p128f1.InterfaceC1380b {

    /* renamed from: a */
    public final p215y0.InterfaceC2405q f5668a;

    /* renamed from: b */
    public final p215y0.InterfaceC2387F f5669b;

    /* renamed from: c */
    public final p073S0.C0631i f5670c;

    /* renamed from: d */
    public final p076T.C0702p f5671d;

    /* renamed from: e */
    public final int f5672e;

    /* renamed from: f */
    public long f5673f;

    /* renamed from: g */
    public int f5674g;

    /* renamed from: h */
    public long f5675h;

    public C1381c(p215y0.InterfaceC2405q interfaceC2405q, p215y0.InterfaceC2387F interfaceC2387F, p073S0.C0631i c0631i, java.lang.String str, int i4) {
        this.f5668a = interfaceC2405q;
        this.f5669b = interfaceC2387F;
        this.f5670c = c0631i;
        int i5 = c0631i.f1981d;
        int i6 = c0631i.f1978a;
        int i7 = (i5 * i6) / 8;
        int i8 = c0631i.f1980c;
        if (i8 != i7) {
            throw p076T.C0666I.m1202a(null, "Expected block size: " + i7 + "; got: " + i8);
        }
        int i9 = c0631i.f1979b;
        int i10 = i9 * i7;
        int i11 = i10 * 8;
        int max = java.lang.Math.max(i7, i10 / 10);
        this.f5672e = max;
        p076T.C0701o c0701o = new p076T.C0701o();
        c0701o.f2370l = p076T.AbstractC0665H.m1201l(str);
        c0701o.f2365g = i11;
        c0701o.f2366h = i11;
        c0701o.f2371m = max;
        c0701o.f2384z = i6;
        c0701o.f2350A = i9;
        c0701o.f2351B = i4;
        this.f5671d = new p076T.C0702p(c0701o);
    }

    @Override // p128f1.InterfaceC1380b
    /* renamed from: a */
    public final void mo3135a(long j4) {
        this.f5673f = j4;
        this.f5674g = 0;
        this.f5675h = 0L;
    }

    @Override // p128f1.InterfaceC1380b
    /* renamed from: b */
    public final void mo3136b(long j4, int i4) {
        this.f5668a.mo638t(new p128f1.C1384f(this.f5670c, 1, i4, j4));
        this.f5669b.mo1407c(this.f5671d);
    }

    @Override // p128f1.InterfaceC1380b
    /* renamed from: c */
    public final boolean mo3137c(p215y0.C2400l c2400l, long j4) {
        int i4;
        int i5;
        long j5 = j4;
        while (j5 > 0 && (i4 = this.f5674g) < (i5 = this.f5672e)) {
            int mo1408d = this.f5669b.mo1408d(c2400l, (int) java.lang.Math.min(i5 - i4, j5), true);
            if (mo1408d == -1) {
                j5 = 0;
            } else {
                this.f5674g += mo1408d;
                j5 -= mo1408d;
            }
        }
        p073S0.C0631i c0631i = this.f5670c;
        int i6 = this.f5674g;
        int i7 = c0631i.f1980c;
        int i8 = i6 / i7;
        if (i8 > 0) {
            long j6 = this.f5673f;
            long j7 = this.f5675h;
            long j8 = c0631i.f1979b;
            int i9 = p086W.AbstractC0805y.f2801a;
            long m1600U = j6 + p086W.AbstractC0805y.m1600U(j7, 1000000L, j8, java.math.RoundingMode.FLOOR);
            int i10 = i8 * i7;
            int i11 = this.f5674g - i10;
            this.f5669b.mo1406b(m1600U, 1, i10, i11, null);
            this.f5675h += i8;
            this.f5674g = i11;
        }
        return j5 <= 0;
    }
}
