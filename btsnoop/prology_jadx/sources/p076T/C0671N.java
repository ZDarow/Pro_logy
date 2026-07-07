package p076T;

/* renamed from: T.N */
/* loaded from: classes.dex */
public final class C0671N {

    /* renamed from: a */
    public final java.lang.Object f2211a;

    /* renamed from: b */
    public final int f2212b;

    /* renamed from: c */
    public final p076T.C0659B f2213c;

    /* renamed from: d */
    public final java.lang.Object f2214d;

    /* renamed from: e */
    public final int f2215e;

    /* renamed from: f */
    public final long f2216f;

    /* renamed from: g */
    public final long f2217g;

    /* renamed from: h */
    public final int f2218h;

    /* renamed from: i */
    public final int f2219i;

    static {
        p009B2.AbstractC0051h.m155n(0, 1, 2, 3, 4);
        p086W.AbstractC0805y.m1587H(5);
        p086W.AbstractC0805y.m1587H(6);
    }

    public C0671N(java.lang.Object obj, int i4, p076T.C0659B c0659b, java.lang.Object obj2, int i5, long j4, long j5, int i6, int i7) {
        this.f2211a = obj;
        this.f2212b = i4;
        this.f2213c = c0659b;
        this.f2214d = obj2;
        this.f2215e = i5;
        this.f2216f = j4;
        this.f2217g = j5;
        this.f2218h = i6;
        this.f2219i = i7;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p076T.C0671N.class != obj.getClass()) {
            return false;
        }
        p076T.C0671N c0671n = (p076T.C0671N) obj;
        return this.f2212b == c0671n.f2212b && this.f2215e == c0671n.f2215e && this.f2216f == c0671n.f2216f && this.f2217g == c0671n.f2217g && this.f2218h == c0671n.f2218h && this.f2219i == c0671n.f2219i && p101a.AbstractC0936a.m1814v(this.f2213c, c0671n.f2213c) && p101a.AbstractC0936a.m1814v(this.f2211a, c0671n.f2211a) && p101a.AbstractC0936a.m1814v(this.f2214d, c0671n.f2214d);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f2211a, java.lang.Integer.valueOf(this.f2212b), this.f2213c, this.f2214d, java.lang.Integer.valueOf(this.f2215e), java.lang.Long.valueOf(this.f2216f), java.lang.Long.valueOf(this.f2217g), java.lang.Integer.valueOf(this.f2218h), java.lang.Integer.valueOf(this.f2219i)});
    }
}
