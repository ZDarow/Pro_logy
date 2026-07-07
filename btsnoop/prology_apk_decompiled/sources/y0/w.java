package y0;

/* loaded from: classes.dex */
public final class w implements z {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f9130a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f9131b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9132c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9133d;

    public w(long j4, long[] jArr, long[] jArr2) {
        W.a.e(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z4 = length > 0;
        this.f9133d = z4;
        if (!z4 || jArr2[0] <= 0) {
            this.f9130a = jArr;
            this.f9131b = jArr2;
        } else {
            int i4 = length + 1;
            long[] jArr3 = new long[i4];
            this.f9130a = jArr3;
            long[] jArr4 = new long[i4];
            this.f9131b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f9132c = j4;
    }

    @Override // y0.z
    public final boolean c() {
        return this.f9133d;
    }

    @Override // y0.z
    public final y f(long j4) {
        if (!this.f9133d) {
            C0617A c0617a = C0617A.f8990c;
            return new y(c0617a, c0617a);
        }
        long[] jArr = this.f9131b;
        int f4 = W.y.f(jArr, j4, true);
        long j5 = jArr[f4];
        long[] jArr2 = this.f9130a;
        C0617A c0617a2 = new C0617A(j5, jArr2[f4]);
        if (j5 == j4 || f4 == jArr.length - 1) {
            return new y(c0617a2, c0617a2);
        }
        int i4 = f4 + 1;
        return new y(c0617a2, new C0617A(jArr[i4], jArr2[i4]));
    }

    @Override // y0.z
    public final long i() {
        return this.f9132c;
    }
}
