package p143i2;

/* renamed from: i2.a */
/* loaded from: classes.dex */
public final class C1548a implements java.io.Serializable {

    /* renamed from: n */
    public static final /* synthetic */ int f6430n = 0;

    /* renamed from: l */
    public final int[] f6431l;

    /* renamed from: m */
    public final int f6432m;

    static {
        new p143i2.C1548a(new int[0]);
    }

    public C1548a(int[] iArr) {
        int length = iArr.length;
        this.f6431l = iArr;
        this.f6432m = length;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p143i2.C1548a)) {
            return false;
        }
        p143i2.C1548a c1548a = (p143i2.C1548a) obj;
        int i4 = c1548a.f6432m;
        int i5 = this.f6432m;
        if (i5 != i4) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            p176p1.AbstractC1949a.m3935l(i6, i5);
            int i7 = this.f6431l[i6];
            p176p1.AbstractC1949a.m3935l(i6, c1548a.f6432m);
            if (i7 != c1548a.f6431l[i6]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i4 = 1;
        for (int i5 = 0; i5 < this.f6432m; i5++) {
            i4 = (i4 * 31) + this.f6431l[i5];
        }
        return i4;
    }

    public final java.lang.String toString() {
        int i4 = this.f6432m;
        if (i4 == 0) {
            return "[]";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i4 * 5);
        sb.append('[');
        int[] iArr = this.f6431l;
        sb.append(iArr[0]);
        for (int i5 = 1; i5 < i4; i5++) {
            sb.append(", ");
            sb.append(iArr[i5]);
        }
        sb.append(']');
        return sb.toString();
    }
}
