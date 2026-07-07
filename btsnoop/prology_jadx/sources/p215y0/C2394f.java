package p215y0;

/* renamed from: y0.f */
/* loaded from: classes.dex */
public final class C2394f {

    /* renamed from: a */
    public final long f9422a;

    /* renamed from: b */
    public final long f9423b;

    /* renamed from: c */
    public final long f9424c;

    /* renamed from: d */
    public long f9425d = 0;

    /* renamed from: e */
    public long f9426e;

    /* renamed from: f */
    public long f9427f;

    /* renamed from: g */
    public long f9428g;

    /* renamed from: h */
    public long f9429h;

    public C2394f(long j4, long j5, long j6, long j7, long j8, long j9) {
        this.f9422a = j4;
        this.f9423b = j5;
        this.f9426e = j6;
        this.f9427f = j7;
        this.f9428g = j8;
        this.f9424c = j9;
        this.f9429h = m4630a(j5, 0L, j6, j7, j8, j9);
    }

    /* renamed from: a */
    public static long m4630a(long j4, long j5, long j6, long j7, long j8, long j9) {
        if (j7 + 1 >= j8 || j5 + 1 >= j6) {
            return j7;
        }
        long j10 = ((float) (j4 - j5)) * (((float) (j8 - j7)) / ((float) (j6 - j5)));
        return p086W.AbstractC0805y.m1616k(((j10 + j7) - j9) - (j10 / 20), j7, j8 - 1);
    }
}
