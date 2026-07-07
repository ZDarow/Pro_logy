package A0;

import y0.C0617A;
import y0.F;
import y0.y;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final F f34a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36c;

    /* renamed from: d, reason: collision with root package name */
    public final long f37d;

    /* renamed from: e, reason: collision with root package name */
    public final int f38e;

    /* renamed from: f, reason: collision with root package name */
    public int f39f;

    /* renamed from: g, reason: collision with root package name */
    public int f40g;

    /* renamed from: h, reason: collision with root package name */
    public int f41h;

    /* renamed from: i, reason: collision with root package name */
    public int f42i;

    /* renamed from: j, reason: collision with root package name */
    public int f43j;

    /* renamed from: k, reason: collision with root package name */
    public long[] f44k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f45l;

    public g(int i4, int i5, long j4, int i6, F f4) {
        boolean z4 = true;
        if (i5 != 1 && i5 != 2) {
            z4 = false;
        }
        W.a.e(z4);
        this.f37d = j4;
        this.f38e = i6;
        this.f34a = f4;
        int i7 = (((i4 % 10) + 48) << 8) | ((i4 / 10) + 48);
        this.f35b = (i5 == 2 ? 1667497984 : 1651965952) | i7;
        this.f36c = i5 == 2 ? i7 | 1650720768 : -1;
        this.f44k = new long[512];
        this.f45l = new int[512];
    }

    public final C0617A a(int i4) {
        return new C0617A(((this.f37d * 1) / this.f38e) * this.f45l[i4], this.f44k[i4]);
    }

    public final y b(long j4) {
        int i4 = (int) (j4 / ((this.f37d * 1) / this.f38e));
        int e4 = W.y.e(this.f45l, i4, true, true);
        if (this.f45l[e4] == i4) {
            C0617A a4 = a(e4);
            return new y(a4, a4);
        }
        C0617A a5 = a(e4);
        int i5 = e4 + 1;
        return i5 < this.f44k.length ? new y(a5, a(i5)) : new y(a5, a5);
    }
}
