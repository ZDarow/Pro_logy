package y0;

/* loaded from: classes.dex */
public class k implements z {

    /* renamed from: a, reason: collision with root package name */
    public final long f9079a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9080b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9081c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9082d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9083e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9084f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f9085g;

    public k(long j4, long j5, int i4, int i5, boolean z4) {
        this.f9079a = j4;
        this.f9080b = j5;
        this.f9081c = i5 == -1 ? 1 : i5;
        this.f9083e = i4;
        this.f9085g = z4;
        if (j4 == -1) {
            this.f9082d = -1L;
            this.f9084f = -9223372036854775807L;
        } else {
            long j6 = j4 - j5;
            this.f9082d = j6;
            this.f9084f = (Math.max(0L, j6) * 8000000) / i4;
        }
    }

    @Override // y0.z
    public final boolean c() {
        return this.f9082d != -1 || this.f9085g;
    }

    @Override // y0.z
    public final y f(long j4) {
        long j5 = this.f9082d;
        long j6 = this.f9080b;
        if (j5 == -1 && !this.f9085g) {
            C0617A c0617a = new C0617A(0L, j6);
            return new y(c0617a, c0617a);
        }
        int i4 = this.f9083e;
        long j7 = this.f9081c;
        long j8 = (((i4 * j4) / 8000000) / j7) * j7;
        if (j5 != -1) {
            j8 = Math.min(j8, j5 - j7);
        }
        long max = Math.max(j8, 0L) + j6;
        long max2 = (Math.max(0L, max - j6) * 8000000) / i4;
        C0617A c0617a2 = new C0617A(max2, max);
        if (j5 != -1 && max2 < j4) {
            long j9 = max + j7;
            if (j9 < this.f9079a) {
                return new y(c0617a2, new C0617A((Math.max(0L, j9 - j6) * 8000000) / i4, j9));
            }
        }
        return new y(c0617a2, c0617a2);
    }

    @Override // y0.z
    public final long i() {
        return this.f9084f;
    }
}
