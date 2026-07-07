package T;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final int f2212a;

    /* renamed from: b, reason: collision with root package name */
    public final V f2213b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2214c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f2215d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f2216e;

    static {
        W.y.H(0);
        W.y.H(1);
        W.y.H(3);
        W.y.H(4);
    }

    public Z(V v4, boolean z4, int[] iArr, boolean[] zArr) {
        int i4 = v4.f2169a;
        this.f2212a = i4;
        boolean z5 = false;
        W.a.e(i4 == iArr.length && i4 == zArr.length);
        this.f2213b = v4;
        if (z4 && i4 > 1) {
            z5 = true;
        }
        this.f2214c = z5;
        this.f2215d = (int[]) iArr.clone();
        this.f2216e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Z.class != obj.getClass()) {
            return false;
        }
        Z z4 = (Z) obj;
        return this.f2214c == z4.f2214c && this.f2213b.equals(z4.f2213b) && Arrays.equals(this.f2215d, z4.f2215d) && Arrays.equals(this.f2216e, z4.f2216e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2216e) + ((Arrays.hashCode(this.f2215d) + (((this.f2213b.hashCode() * 31) + (this.f2214c ? 1 : 0)) * 31)) * 31);
    }
}
