package p073S0;

/* renamed from: S0.h */
/* loaded from: classes.dex */
public final class C0630h implements p073S0.InterfaceC0628f {

    /* renamed from: a */
    public final int f1975a;

    /* renamed from: b */
    public final int f1976b;

    /* renamed from: c */
    public final java.lang.Object f1977c;

    public C0630h(int i4, int i5, android.util.SparseArray sparseArray) {
        this.f1975a = i4;
        this.f1976b = i5;
        this.f1977c = sparseArray;
    }

    @Override // p073S0.InterfaceC0628f
    /* renamed from: a */
    public int mo1140a() {
        return this.f1975a;
    }

    @Override // p073S0.InterfaceC0628f
    /* renamed from: b */
    public int mo1141b() {
        return this.f1976b;
    }

    @Override // p073S0.InterfaceC0628f
    /* renamed from: c */
    public int mo1142c() {
        int i4 = this.f1975a;
        return i4 == -1 ? ((p086W.C0798r) this.f1977c).m1563y() : i4;
    }

    public C0630h(p073S0.C0624b c0624b, p076T.C0702p c0702p) {
        p086W.C0798r c0798r = c0624b.f1955n;
        this.f1977c = c0798r;
        c0798r.m1537G(12);
        int m1563y = c0798r.m1563y();
        if ("audio/raw".equals(c0702p.f2408m)) {
            int m1581B = p086W.AbstractC0805y.m1581B(c0702p.f2387C, c0702p.f2385A);
            if (m1563y == 0 || m1563y % m1581B != 0) {
                p086W.AbstractC0781a.m1410A("AtomParsers", "Audio sample size mismatch. stsd sample size: " + m1581B + ", stsz sample size: " + m1563y);
                m1563y = m1581B;
            }
        }
        this.f1975a = m1563y == 0 ? -1 : m1563y;
        this.f1976b = c0798r.m1563y();
    }
}
