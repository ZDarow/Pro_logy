package p073S0;

/* renamed from: S0.i */
/* loaded from: classes.dex */
public final class C0631i implements p073S0.InterfaceC0628f {

    /* renamed from: a */
    public final int f1978a;

    /* renamed from: b */
    public final int f1979b;

    /* renamed from: c */
    public int f1980c;

    /* renamed from: d */
    public int f1981d;

    /* renamed from: e */
    public final java.lang.Object f1982e;

    public C0631i(int i4, int i5, int i6, int i7, int i8, byte[] bArr) {
        this.f1978a = i5;
        this.f1979b = i6;
        this.f1980c = i7;
        this.f1981d = i8;
        this.f1982e = bArr;
    }

    @Override // p073S0.InterfaceC0628f
    /* renamed from: a */
    public int mo1140a() {
        return -1;
    }

    @Override // p073S0.InterfaceC0628f
    /* renamed from: b */
    public int mo1141b() {
        return this.f1978a;
    }

    @Override // p073S0.InterfaceC0628f
    /* renamed from: c */
    public int mo1142c() {
        p086W.C0798r c0798r = (p086W.C0798r) this.f1982e;
        int i4 = this.f1979b;
        if (i4 == 8) {
            return c0798r.m1559u();
        }
        if (i4 == 16) {
            return c0798r.m1531A();
        }
        int i5 = this.f1980c;
        this.f1980c = i5 + 1;
        if (i5 % 2 != 0) {
            return this.f1981d & 15;
        }
        int m1559u = c0798r.m1559u();
        this.f1981d = m1559u;
        return (m1559u & 240) >> 4;
    }

    public C0631i(p073S0.C0624b c0624b) {
        p086W.C0798r c0798r = c0624b.f1955n;
        this.f1982e = c0798r;
        c0798r.m1537G(12);
        this.f1979b = c0798r.m1563y() & 255;
        this.f1978a = c0798r.m1563y();
    }
}
