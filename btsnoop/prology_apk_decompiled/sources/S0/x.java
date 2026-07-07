package S0;

import W.y;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final u f2041a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2042b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f2043c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f2044d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2045e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f2046f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f2047g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2048h;

    public x(u uVar, long[] jArr, int[] iArr, int i4, long[] jArr2, int[] iArr2, long j4) {
        W.a.e(iArr.length == jArr2.length);
        W.a.e(jArr.length == jArr2.length);
        W.a.e(iArr2.length == jArr2.length);
        this.f2041a = uVar;
        this.f2043c = jArr;
        this.f2044d = iArr;
        this.f2045e = i4;
        this.f2046f = jArr2;
        this.f2047g = iArr2;
        this.f2048h = j4;
        this.f2042b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j4) {
        long[] jArr = this.f2046f;
        for (int b4 = y.b(jArr, j4, true); b4 < jArr.length; b4++) {
            if ((this.f2047g[b4] & 1) != 0) {
                return b4;
            }
        }
        return -1;
    }
}
