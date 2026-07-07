package p069R0;

/* renamed from: R0.h */
/* loaded from: classes.dex */
public final class C0578h implements p069R0.InterfaceC0576f {

    /* renamed from: a */
    public final long f1809a;

    /* renamed from: b */
    public final int f1810b;

    /* renamed from: c */
    public final long f1811c;

    /* renamed from: d */
    public final int f1812d;

    /* renamed from: e */
    public final long f1813e;

    /* renamed from: f */
    public final long f1814f;

    /* renamed from: g */
    public final long[] f1815g;

    public C0578h(long j4, int i4, long j5, int i5, long j6, long[] jArr) {
        this.f1809a = j4;
        this.f1810b = i4;
        this.f1811c = j5;
        this.f1812d = i5;
        this.f1813e = j6;
        this.f1815g = jArr;
        this.f1814f = j6 != -1 ? j4 + j6 : -1L;
    }

    @Override // p069R0.InterfaceC0576f
    /* renamed from: a */
    public final long mo1092a(long j4) {
        long j5 = j4 - this.f1809a;
        if (!mo31c() || j5 <= this.f1810b) {
            return 0L;
        }
        long[] jArr = this.f1815g;
        p086W.AbstractC0781a.m1422k(jArr);
        double d4 = (j5 * 256.0d) / this.f1813e;
        int m1611f = p086W.AbstractC0805y.m1611f(jArr, (long) d4, true);
        long j6 = this.f1811c;
        long j7 = (m1611f * j6) / 100;
        long j8 = jArr[m1611f];
        int i4 = m1611f + 1;
        long j9 = (j6 * i4) / 100;
        return java.lang.Math.round((j8 == (m1611f == 99 ? 256L : jArr[i4]) ? 0.0d : (d4 - j8) / (r0 - j8)) * (j9 - j7)) + j7;
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: c */
    public final boolean mo31c() {
        return this.f1815g != null;
    }

    @Override // p069R0.InterfaceC0576f
    /* renamed from: e */
    public final long mo1093e() {
        return this.f1814f;
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: f */
    public final p215y0.C2413y mo32f(long j4) {
        double d4;
        boolean mo31c = mo31c();
        int i4 = this.f1810b;
        long j5 = this.f1809a;
        if (!mo31c) {
            p215y0.C2382A c2382a = new p215y0.C2382A(0L, j5 + i4);
            return new p215y0.C2413y(c2382a, c2382a);
        }
        long m1616k = p086W.AbstractC0805y.m1616k(j4, 0L, this.f1811c);
        double d5 = (m1616k * 100.0d) / this.f1811c;
        double d6 = 0.0d;
        if (d5 > 0.0d) {
            if (d5 >= 100.0d) {
                d4 = 256.0d;
                d6 = 256.0d;
                double d7 = d6 / d4;
                long j6 = this.f1813e;
                p215y0.C2382A c2382a2 = new p215y0.C2382A(m1616k, j5 + p086W.AbstractC0805y.m1616k(java.lang.Math.round(d7 * j6), i4, j6 - 1));
                return new p215y0.C2413y(c2382a2, c2382a2);
            }
            int i5 = (int) d5;
            long[] jArr = this.f1815g;
            p086W.AbstractC0781a.m1422k(jArr);
            double d8 = jArr[i5];
            d6 = (((i5 == 99 ? 256.0d : jArr[i5 + 1]) - d8) * (d5 - i5)) + d8;
        }
        d4 = 256.0d;
        double d72 = d6 / d4;
        long j62 = this.f1813e;
        p215y0.C2382A c2382a22 = new p215y0.C2382A(m1616k, j5 + p086W.AbstractC0805y.m1616k(java.lang.Math.round(d72 * j62), i4, j62 - 1));
        return new p215y0.C2413y(c2382a22, c2382a22);
    }

    @Override // p069R0.InterfaceC0576f
    /* renamed from: h */
    public final int mo1094h() {
        return this.f1812d;
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: i */
    public final long mo33i() {
        return this.f1811c;
    }
}
