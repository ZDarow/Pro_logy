package p002A0;

/* renamed from: A0.g */
/* loaded from: classes.dex */
public final class C0009g {

    /* renamed from: a */
    public final p215y0.InterfaceC2387F f34a;

    /* renamed from: b */
    public final int f35b;

    /* renamed from: c */
    public final int f36c;

    /* renamed from: d */
    public final long f37d;

    /* renamed from: e */
    public final int f38e;

    /* renamed from: f */
    public int f39f;

    /* renamed from: g */
    public int f40g;

    /* renamed from: h */
    public int f41h;

    /* renamed from: i */
    public int f42i;

    /* renamed from: j */
    public int f43j;

    /* renamed from: k */
    public long[] f44k;

    /* renamed from: l */
    public int[] f45l;

    public C0009g(int i4, int i5, long j4, int i6, p215y0.InterfaceC2387F interfaceC2387F) {
        boolean z4 = true;
        if (i5 != 1 && i5 != 2) {
            z4 = false;
        }
        p086W.AbstractC0781a.m1416e(z4);
        this.f37d = j4;
        this.f38e = i6;
        this.f34a = interfaceC2387F;
        int i7 = (((i4 % 10) + 48) << 8) | ((i4 / 10) + 48);
        this.f35b = (i5 == 2 ? 1667497984 : 1651965952) | i7;
        this.f36c = i5 == 2 ? i7 | 1650720768 : -1;
        this.f44k = new long[512];
        this.f45l = new int[512];
    }

    /* renamed from: a */
    public final p215y0.C2382A m38a(int i4) {
        return new p215y0.C2382A(((this.f37d * 1) / this.f38e) * this.f45l[i4], this.f44k[i4]);
    }

    /* renamed from: b */
    public final p215y0.C2413y m39b(long j4) {
        int i4 = (int) (j4 / ((this.f37d * 1) / this.f38e));
        int m1610e = p086W.AbstractC0805y.m1610e(this.f45l, i4, true, true);
        if (this.f45l[m1610e] == i4) {
            p215y0.C2382A m38a = m38a(m1610e);
            return new p215y0.C2413y(m38a, m38a);
        }
        p215y0.C2382A m38a2 = m38a(m1610e);
        int i5 = m1610e + 1;
        return i5 < this.f44k.length ? new p215y0.C2413y(m38a2, m38a(i5)) : new p215y0.C2413y(m38a2, m38a2);
    }
}
