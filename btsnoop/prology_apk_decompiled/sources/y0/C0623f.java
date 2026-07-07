package y0;

/* renamed from: y0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0623f {

    /* renamed from: a, reason: collision with root package name */
    public final long f9061a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9062b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9063c;

    /* renamed from: d, reason: collision with root package name */
    public long f9064d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f9065e;

    /* renamed from: f, reason: collision with root package name */
    public long f9066f;

    /* renamed from: g, reason: collision with root package name */
    public long f9067g;

    /* renamed from: h, reason: collision with root package name */
    public long f9068h;

    public C0623f(long j4, long j5, long j6, long j7, long j8, long j9) {
        this.f9061a = j4;
        this.f9062b = j5;
        this.f9065e = j6;
        this.f9066f = j7;
        this.f9067g = j8;
        this.f9063c = j9;
        this.f9068h = a(j5, 0L, j6, j7, j8, j9);
    }

    public static long a(long j4, long j5, long j6, long j7, long j8, long j9) {
        if (j7 + 1 >= j8 || j5 + 1 >= j6) {
            return j7;
        }
        long j10 = ((float) (j4 - j5)) * (((float) (j8 - j7)) / ((float) (j6 - j5)));
        return W.y.k(((j10 + j7) - j9) - (j10 / 20), j7, j8 - 1);
    }
}
