package S0;

import W.y;
import y0.z;

/* loaded from: classes.dex */
public final class e implements T0.g {

    /* renamed from: l, reason: collision with root package name */
    public long f1896l;

    /* renamed from: m, reason: collision with root package name */
    public long f1897m;

    /* renamed from: n, reason: collision with root package name */
    public Object f1898n;

    /* renamed from: o, reason: collision with root package name */
    public Object f1899o;

    public e(long j4, int i4) {
        W.a.j(((u0.a) this.f1898n) == null);
        this.f1896l = j4;
        this.f1897m = j4 + i4;
    }

    @Override // T0.g
    public long a(y0.l lVar) {
        long j4 = this.f1897m;
        if (j4 < 0) {
            return -1L;
        }
        long j5 = -(j4 + 2);
        this.f1897m = -1L;
        return j5;
    }

    @Override // T0.g
    public z h() {
        W.a.j(this.f1896l != -1);
        return new A0.b((y0.s) this.f1898n, this.f1896l, 1);
    }

    @Override // T0.g
    public void n(long j4) {
        long[] jArr = (long[]) ((u3.m) this.f1899o).f8632l;
        this.f1897m = jArr[y.f(jArr, j4, true)];
    }

    public e(String str, byte[] bArr, long j4, long j5) {
        this.f1898n = str;
        this.f1899o = bArr;
        this.f1896l = j4;
        this.f1897m = j5;
    }
}
