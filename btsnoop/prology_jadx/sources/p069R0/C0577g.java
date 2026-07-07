package p069R0;

/* renamed from: R0.g */
/* loaded from: classes.dex */
public final class C0577g implements p069R0.InterfaceC0576f {

    /* renamed from: a */
    public final long[] f1804a;

    /* renamed from: b */
    public final long[] f1805b;

    /* renamed from: c */
    public final long f1806c;

    /* renamed from: d */
    public final long f1807d;

    /* renamed from: e */
    public final int f1808e;

    public C0577g(long[] jArr, long[] jArr2, long j4, long j5, int i4) {
        this.f1804a = jArr;
        this.f1805b = jArr2;
        this.f1806c = j4;
        this.f1807d = j5;
        this.f1808e = i4;
    }

    @Override // p069R0.InterfaceC0576f
    /* renamed from: a */
    public final long mo1092a(long j4) {
        return this.f1804a[p086W.AbstractC0805y.m1611f(this.f1805b, j4, true)];
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: c */
    public final boolean mo31c() {
        return true;
    }

    @Override // p069R0.InterfaceC0576f
    /* renamed from: e */
    public final long mo1093e() {
        return this.f1807d;
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: f */
    public final p215y0.C2413y mo32f(long j4) {
        long[] jArr = this.f1804a;
        int m1611f = p086W.AbstractC0805y.m1611f(jArr, j4, true);
        long j5 = jArr[m1611f];
        long[] jArr2 = this.f1805b;
        p215y0.C2382A c2382a = new p215y0.C2382A(j5, jArr2[m1611f]);
        if (j5 >= j4 || m1611f == jArr.length - 1) {
            return new p215y0.C2413y(c2382a, c2382a);
        }
        int i4 = m1611f + 1;
        return new p215y0.C2413y(c2382a, new p215y0.C2382A(jArr[i4], jArr2[i4]));
    }

    @Override // p069R0.InterfaceC0576f
    /* renamed from: h */
    public final int mo1094h() {
        return this.f1808e;
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: i */
    public final long mo33i() {
        return this.f1806c;
    }
}
