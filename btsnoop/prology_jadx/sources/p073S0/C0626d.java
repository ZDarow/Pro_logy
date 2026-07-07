package p073S0;

/* renamed from: S0.d */
/* loaded from: classes.dex */
public final class C0626d {

    /* renamed from: a */
    public final int f1958a;

    /* renamed from: b */
    public int f1959b;

    /* renamed from: c */
    public int f1960c;

    /* renamed from: d */
    public long f1961d;

    /* renamed from: e */
    public final boolean f1962e;

    /* renamed from: f */
    public final p086W.C0798r f1963f;

    /* renamed from: g */
    public final p086W.C0798r f1964g;

    /* renamed from: h */
    public int f1965h;

    /* renamed from: i */
    public int f1966i;

    public C0626d(p086W.C0798r c0798r, p086W.C0798r c0798r2, boolean z4) {
        this.f1964g = c0798r;
        this.f1963f = c0798r2;
        this.f1962e = z4;
        c0798r2.m1537G(12);
        this.f1958a = c0798r2.m1563y();
        c0798r.m1537G(12);
        this.f1966i = c0798r.m1563y();
        p215y0.AbstractC2390b.m4610e("first_chunk must be 1", c0798r.m1546h() == 1);
        this.f1959b = -1;
    }

    /* renamed from: a */
    public final boolean m1139a() {
        int i4 = this.f1959b + 1;
        this.f1959b = i4;
        if (i4 == this.f1958a) {
            return false;
        }
        boolean z4 = this.f1962e;
        p086W.C0798r c0798r = this.f1963f;
        this.f1961d = z4 ? c0798r.m1564z() : c0798r.m1561w();
        if (this.f1959b == this.f1965h) {
            p086W.C0798r c0798r2 = this.f1964g;
            this.f1960c = c0798r2.m1563y();
            c0798r2.m1538H(4);
            int i5 = this.f1966i - 1;
            this.f1966i = i5;
            this.f1965h = i5 > 0 ? c0798r2.m1563y() - 1 : -1;
        }
        return true;
    }
}
