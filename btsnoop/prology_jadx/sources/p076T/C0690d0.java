package p076T;

/* renamed from: T.d0 */
/* loaded from: classes.dex */
public final class C0690d0 {

    /* renamed from: e */
    public static final p076T.C0690d0 f2310e = new p076T.C0690d0(0, 0, 0, 1.0f);

    /* renamed from: a */
    public final int f2311a;

    /* renamed from: b */
    public final int f2312b;

    /* renamed from: c */
    public final int f2313c;

    /* renamed from: d */
    public final float f2314d;

    static {
        p086W.AbstractC0805y.m1587H(0);
        p086W.AbstractC0805y.m1587H(1);
        p086W.AbstractC0805y.m1587H(2);
        p086W.AbstractC0805y.m1587H(3);
    }

    public C0690d0(int i4, int i5, int i6, float f4) {
        this.f2311a = i4;
        this.f2312b = i5;
        this.f2313c = i6;
        this.f2314d = f4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p076T.C0690d0)) {
            return false;
        }
        p076T.C0690d0 c0690d0 = (p076T.C0690d0) obj;
        return this.f2311a == c0690d0.f2311a && this.f2312b == c0690d0.f2312b && this.f2313c == c0690d0.f2313c && this.f2314d == c0690d0.f2314d;
    }

    public final int hashCode() {
        return java.lang.Float.floatToRawIntBits(this.f2314d) + ((((((217 + this.f2311a) * 31) + this.f2312b) * 31) + this.f2313c) * 31);
    }
}
