package R0;

import W.y;
import y0.C0617A;

/* loaded from: classes.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f1744a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f1745b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1746c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1747d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1748e;

    public g(long[] jArr, long[] jArr2, long j4, long j5, int i4) {
        this.f1744a = jArr;
        this.f1745b = jArr2;
        this.f1746c = j4;
        this.f1747d = j5;
        this.f1748e = i4;
    }

    @Override // R0.f
    public final long a(long j4) {
        return this.f1744a[y.f(this.f1745b, j4, true)];
    }

    @Override // y0.z
    public final boolean c() {
        return true;
    }

    @Override // R0.f
    public final long e() {
        return this.f1747d;
    }

    @Override // y0.z
    public final y0.y f(long j4) {
        long[] jArr = this.f1744a;
        int f4 = y.f(jArr, j4, true);
        long j5 = jArr[f4];
        long[] jArr2 = this.f1745b;
        C0617A c0617a = new C0617A(j5, jArr2[f4]);
        if (j5 >= j4 || f4 == jArr.length - 1) {
            return new y0.y(c0617a, c0617a);
        }
        int i4 = f4 + 1;
        return new y0.y(c0617a, new C0617A(jArr[i4], jArr2[i4]));
    }

    @Override // R0.f
    public final int h() {
        return this.f1748e;
    }

    @Override // y0.z
    public final long i() {
        return this.f1746c;
    }
}
