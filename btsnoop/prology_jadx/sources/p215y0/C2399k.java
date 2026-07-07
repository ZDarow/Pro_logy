package p215y0;

/* renamed from: y0.k */
/* loaded from: classes.dex */
public class C2399k implements p215y0.InterfaceC2414z {

    /* renamed from: a */
    public final long f9440a;

    /* renamed from: b */
    public final long f9441b;

    /* renamed from: c */
    public final int f9442c;

    /* renamed from: d */
    public final long f9443d;

    /* renamed from: e */
    public final int f9444e;

    /* renamed from: f */
    public final long f9445f;

    /* renamed from: g */
    public final boolean f9446g;

    public C2399k(long j4, long j5, int i4, int i5, boolean z4) {
        this.f9440a = j4;
        this.f9441b = j5;
        this.f9442c = i5 == -1 ? 1 : i5;
        this.f9444e = i4;
        this.f9446g = z4;
        if (j4 == -1) {
            this.f9443d = -1L;
            this.f9445f = -9223372036854775807L;
        } else {
            long j6 = j4 - j5;
            this.f9443d = j6;
            this.f9445f = (java.lang.Math.max(0L, j6) * 8000000) / i4;
        }
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: c */
    public final boolean mo31c() {
        return this.f9443d != -1 || this.f9446g;
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: f */
    public final p215y0.C2413y mo32f(long j4) {
        long j5 = this.f9443d;
        long j6 = this.f9441b;
        if (j5 == -1 && !this.f9446g) {
            p215y0.C2382A c2382a = new p215y0.C2382A(0L, j6);
            return new p215y0.C2413y(c2382a, c2382a);
        }
        int i4 = this.f9444e;
        long j7 = this.f9442c;
        long j8 = (((i4 * j4) / 8000000) / j7) * j7;
        if (j5 != -1) {
            j8 = java.lang.Math.min(j8, j5 - j7);
        }
        long max = java.lang.Math.max(j8, 0L) + j6;
        long max2 = (java.lang.Math.max(0L, max - j6) * 8000000) / i4;
        p215y0.C2382A c2382a2 = new p215y0.C2382A(max2, max);
        if (j5 != -1 && max2 < j4) {
            long j9 = max + j7;
            if (j9 < this.f9440a) {
                return new p215y0.C2413y(c2382a2, new p215y0.C2382A((java.lang.Math.max(0L, j9 - j6) * 8000000) / i4, j9));
            }
        }
        return new p215y0.C2413y(c2382a2, c2382a2);
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: i */
    public final long mo33i() {
        return this.f9445f;
    }
}
