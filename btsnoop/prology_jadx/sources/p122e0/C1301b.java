package p122e0;

/* renamed from: e0.b */
/* loaded from: classes.dex */
public final class C1301b {

    /* renamed from: a */
    public final java.lang.String f5213a;

    /* renamed from: b */
    public final java.lang.String f5214b;

    /* renamed from: c */
    public final int f5215c;

    /* renamed from: d */
    public final int f5216d;

    public C1301b(int i4, int i5, java.lang.String str, java.lang.String str2) {
        this.f5213a = str;
        this.f5214b = str2;
        this.f5215c = i4;
        this.f5216d = i5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p122e0.C1301b)) {
            return false;
        }
        p122e0.C1301b c1301b = (p122e0.C1301b) obj;
        return this.f5215c == c1301b.f5215c && this.f5216d == c1301b.f5216d && p101a.AbstractC0936a.m1814v(this.f5213a, c1301b.f5213a) && p101a.AbstractC0936a.m1814v(this.f5214b, c1301b.f5214b);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f5213a, this.f5214b, java.lang.Integer.valueOf(this.f5215c), java.lang.Integer.valueOf(this.f5216d)});
    }
}
