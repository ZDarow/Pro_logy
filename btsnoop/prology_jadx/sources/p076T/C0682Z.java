package p076T;

/* renamed from: T.Z */
/* loaded from: classes.dex */
public final class C0682Z {

    /* renamed from: a */
    public final int f2292a;

    /* renamed from: b */
    public final p076T.C0678V f2293b;

    /* renamed from: c */
    public final boolean f2294c;

    /* renamed from: d */
    public final int[] f2295d;

    /* renamed from: e */
    public final boolean[] f2296e;

    static {
        p086W.AbstractC0805y.m1587H(0);
        p086W.AbstractC0805y.m1587H(1);
        p086W.AbstractC0805y.m1587H(3);
        p086W.AbstractC0805y.m1587H(4);
    }

    public C0682Z(p076T.C0678V c0678v, boolean z4, int[] iArr, boolean[] zArr) {
        int i4 = c0678v.f2249a;
        this.f2292a = i4;
        boolean z5 = false;
        p086W.AbstractC0781a.m1416e(i4 == iArr.length && i4 == zArr.length);
        this.f2293b = c0678v;
        if (z4 && i4 > 1) {
            z5 = true;
        }
        this.f2294c = z5;
        this.f2295d = (int[]) iArr.clone();
        this.f2296e = (boolean[]) zArr.clone();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p076T.C0682Z.class != obj.getClass()) {
            return false;
        }
        p076T.C0682Z c0682z = (p076T.C0682Z) obj;
        return this.f2294c == c0682z.f2294c && this.f2293b.equals(c0682z.f2293b) && java.util.Arrays.equals(this.f2295d, c0682z.f2295d) && java.util.Arrays.equals(this.f2296e, c0682z.f2296e);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.f2296e) + ((java.util.Arrays.hashCode(this.f2295d) + (((this.f2293b.hashCode() * 31) + (this.f2294c ? 1 : 0)) * 31)) * 31);
    }
}
