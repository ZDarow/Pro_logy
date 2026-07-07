package R0;

import W.y;
import android.util.Pair;
import y0.C0617A;

/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f1721a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f1722b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1723c;

    public c(long j4, long[] jArr, long[] jArr2) {
        this.f1721a = jArr;
        this.f1722b = jArr2;
        this.f1723c = j4 == -9223372036854775807L ? y.M(jArr2[jArr2.length - 1]) : j4;
    }

    public static Pair b(long j4, long[] jArr, long[] jArr2) {
        int f4 = y.f(jArr, j4, true);
        long j5 = jArr[f4];
        long j6 = jArr2[f4];
        int i4 = f4 + 1;
        if (i4 == jArr.length) {
            return Pair.create(Long.valueOf(j5), Long.valueOf(j6));
        }
        return Pair.create(Long.valueOf(j4), Long.valueOf(((long) ((jArr[i4] == j5 ? 0.0d : (j4 - j5) / (r6 - j5)) * (jArr2[i4] - j6))) + j6));
    }

    @Override // R0.f
    public final long a(long j4) {
        return y.M(((Long) b(j4, this.f1721a, this.f1722b).second).longValue());
    }

    @Override // y0.z
    public final boolean c() {
        return true;
    }

    @Override // R0.f
    public final long e() {
        return -1L;
    }

    @Override // y0.z
    public final y0.y f(long j4) {
        Pair b4 = b(y.Z(y.k(j4, 0L, this.f1723c)), this.f1722b, this.f1721a);
        C0617A c0617a = new C0617A(y.M(((Long) b4.first).longValue()), ((Long) b4.second).longValue());
        return new y0.y(c0617a, c0617a);
    }

    @Override // R0.f
    public final int h() {
        return -2147483647;
    }

    @Override // y0.z
    public final long i() {
        return this.f1723c;
    }
}
