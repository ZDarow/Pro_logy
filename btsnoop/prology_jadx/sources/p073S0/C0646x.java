package p073S0;

/* renamed from: S0.x */
/* loaded from: classes.dex */
public final class C0646x {

    /* renamed from: a */
    public final p073S0.C0643u f2117a;

    /* renamed from: b */
    public final int f2118b;

    /* renamed from: c */
    public final long[] f2119c;

    /* renamed from: d */
    public final int[] f2120d;

    /* renamed from: e */
    public final int f2121e;

    /* renamed from: f */
    public final long[] f2122f;

    /* renamed from: g */
    public final int[] f2123g;

    /* renamed from: h */
    public final long f2124h;

    public C0646x(p073S0.C0643u c0643u, long[] jArr, int[] iArr, int i4, long[] jArr2, int[] iArr2, long j4) {
        p086W.AbstractC0781a.m1416e(iArr.length == jArr2.length);
        p086W.AbstractC0781a.m1416e(jArr.length == jArr2.length);
        p086W.AbstractC0781a.m1416e(iArr2.length == jArr2.length);
        this.f2117a = c0643u;
        this.f2119c = jArr;
        this.f2120d = iArr;
        this.f2121e = i4;
        this.f2122f = jArr2;
        this.f2123g = iArr2;
        this.f2124h = j4;
        this.f2118b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* renamed from: a */
    public final int m1177a(long j4) {
        long[] jArr = this.f2122f;
        for (int m1607b = p086W.AbstractC0805y.m1607b(jArr, j4, true); m1607b < jArr.length; m1607b++) {
            if ((this.f2123g[m1607b] & 1) != 0) {
                return m1607b;
            }
        }
        return -1;
    }
}
