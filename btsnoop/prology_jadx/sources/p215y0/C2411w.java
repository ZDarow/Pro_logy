package p215y0;

/* renamed from: y0.w */
/* loaded from: classes.dex */
public final class C2411w implements p215y0.InterfaceC2414z {

    /* renamed from: a */
    public final long[] f9492a;

    /* renamed from: b */
    public final long[] f9493b;

    /* renamed from: c */
    public final long f9494c;

    /* renamed from: d */
    public final boolean f9495d;

    public C2411w(long j4, long[] jArr, long[] jArr2) {
        p086W.AbstractC0781a.m1416e(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z4 = length > 0;
        this.f9495d = z4;
        if (!z4 || jArr2[0] <= 0) {
            this.f9492a = jArr;
            this.f9493b = jArr2;
        } else {
            int i4 = length + 1;
            long[] jArr3 = new long[i4];
            this.f9492a = jArr3;
            long[] jArr4 = new long[i4];
            this.f9493b = jArr4;
            java.lang.System.arraycopy(jArr, 0, jArr3, 1, length);
            java.lang.System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f9494c = j4;
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: c */
    public final boolean mo31c() {
        return this.f9495d;
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: f */
    public final p215y0.C2413y mo32f(long j4) {
        if (!this.f9495d) {
            p215y0.C2382A c2382a = p215y0.C2382A.f9349c;
            return new p215y0.C2413y(c2382a, c2382a);
        }
        long[] jArr = this.f9493b;
        int m1611f = p086W.AbstractC0805y.m1611f(jArr, j4, true);
        long j5 = jArr[m1611f];
        long[] jArr2 = this.f9492a;
        p215y0.C2382A c2382a2 = new p215y0.C2382A(j5, jArr2[m1611f]);
        if (j5 == j4 || m1611f == jArr.length - 1) {
            return new p215y0.C2413y(c2382a2, c2382a2);
        }
        int i4 = m1611f + 1;
        return new p215y0.C2413y(c2382a2, new p215y0.C2382A(jArr[i4], jArr2[i4]));
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: i */
    public final long mo33i() {
        return this.f9494c;
    }
}
