package R0;

import W.y;
import y0.C0617A;

/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long f1749a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1750b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1751c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1752d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1753e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1754f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f1755g;

    public h(long j4, int i4, long j5, int i5, long j6, long[] jArr) {
        this.f1749a = j4;
        this.f1750b = i4;
        this.f1751c = j5;
        this.f1752d = i5;
        this.f1753e = j6;
        this.f1755g = jArr;
        this.f1754f = j6 != -1 ? j4 + j6 : -1L;
    }

    @Override // R0.f
    public final long a(long j4) {
        long j5 = j4 - this.f1749a;
        if (!c() || j5 <= this.f1750b) {
            return 0L;
        }
        long[] jArr = this.f1755g;
        W.a.k(jArr);
        double d4 = (j5 * 256.0d) / this.f1753e;
        int f4 = y.f(jArr, (long) d4, true);
        long j6 = this.f1751c;
        long j7 = (f4 * j6) / 100;
        long j8 = jArr[f4];
        int i4 = f4 + 1;
        long j9 = (j6 * i4) / 100;
        return Math.round((j8 == (f4 == 99 ? 256L : jArr[i4]) ? 0.0d : (d4 - j8) / (r0 - j8)) * (j9 - j7)) + j7;
    }

    @Override // y0.z
    public final boolean c() {
        return this.f1755g != null;
    }

    @Override // R0.f
    public final long e() {
        return this.f1754f;
    }

    @Override // y0.z
    public final y0.y f(long j4) {
        double d4;
        boolean c4 = c();
        int i4 = this.f1750b;
        long j5 = this.f1749a;
        if (!c4) {
            C0617A c0617a = new C0617A(0L, j5 + i4);
            return new y0.y(c0617a, c0617a);
        }
        long k4 = y.k(j4, 0L, this.f1751c);
        double d5 = (k4 * 100.0d) / this.f1751c;
        double d6 = 0.0d;
        if (d5 > 0.0d) {
            if (d5 >= 100.0d) {
                d4 = 256.0d;
                d6 = 256.0d;
                double d7 = d6 / d4;
                long j6 = this.f1753e;
                C0617A c0617a2 = new C0617A(k4, j5 + y.k(Math.round(d7 * j6), i4, j6 - 1));
                return new y0.y(c0617a2, c0617a2);
            }
            int i5 = (int) d5;
            long[] jArr = this.f1755g;
            W.a.k(jArr);
            double d8 = jArr[i5];
            d6 = (((i5 == 99 ? 256.0d : jArr[i5 + 1]) - d8) * (d5 - i5)) + d8;
        }
        d4 = 256.0d;
        double d72 = d6 / d4;
        long j62 = this.f1753e;
        C0617A c0617a22 = new C0617A(k4, j5 + y.k(Math.round(d72 * j62), i4, j62 - 1));
        return new y0.y(c0617a22, c0617a22);
    }

    @Override // R0.f
    public final int h() {
        return this.f1752d;
    }

    @Override // y0.z
    public final long i() {
        return this.f1751c;
    }
}
