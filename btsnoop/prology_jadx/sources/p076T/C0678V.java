package p076T;

/* renamed from: T.V */
/* loaded from: classes.dex */
public final class C0678V {

    /* renamed from: a */
    public final int f2249a;

    /* renamed from: b */
    public final java.lang.String f2250b;

    /* renamed from: c */
    public final int f2251c;

    /* renamed from: d */
    public final p076T.C0702p[] f2252d;

    /* renamed from: e */
    public int f2253e;

    static {
        p086W.AbstractC0805y.m1587H(0);
        p086W.AbstractC0805y.m1587H(1);
    }

    public C0678V(java.lang.String str, p076T.C0702p... c0702pArr) {
        p086W.AbstractC0781a.m1416e(c0702pArr.length > 0);
        this.f2250b = str;
        this.f2252d = c0702pArr;
        this.f2249a = c0702pArr.length;
        int m1196g = p076T.AbstractC0665H.m1196g(c0702pArr[0].f2408m);
        this.f2251c = m1196g == -1 ? p076T.AbstractC0665H.m1196g(c0702pArr[0].f2407l) : m1196g;
        java.lang.String str2 = c0702pArr[0].f2399d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i4 = c0702pArr[0].f2401f | 16384;
        for (int i5 = 1; i5 < c0702pArr.length; i5++) {
            java.lang.String str3 = c0702pArr[i5].f2399d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                m1257c(i5, "languages", c0702pArr[0].f2399d, c0702pArr[i5].f2399d);
                return;
            } else {
                if (i4 != (c0702pArr[i5].f2401f | 16384)) {
                    m1257c(i5, "role flags", java.lang.Integer.toBinaryString(c0702pArr[0].f2401f), java.lang.Integer.toBinaryString(c0702pArr[i5].f2401f));
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public static void m1257c(int i4, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        p086W.AbstractC0781a.m1426o("TrackGroup", "", new java.lang.IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i4 + ")"));
    }

    /* renamed from: a */
    public final p076T.C0702p m1258a(int i4) {
        return this.f2252d[i4];
    }

    /* renamed from: b */
    public final int m1259b(p076T.C0702p c0702p) {
        int i4 = 0;
        while (true) {
            p076T.C0702p[] c0702pArr = this.f2252d;
            if (i4 >= c0702pArr.length) {
                return -1;
            }
            if (c0702p == c0702pArr[i4]) {
                return i4;
            }
            i4++;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p076T.C0678V.class != obj.getClass()) {
            return false;
        }
        p076T.C0678V c0678v = (p076T.C0678V) obj;
        return this.f2250b.equals(c0678v.f2250b) && java.util.Arrays.equals(this.f2252d, c0678v.f2252d);
    }

    public final int hashCode() {
        if (this.f2253e == 0) {
            this.f2253e = java.util.Arrays.hashCode(this.f2252d) + ((this.f2250b.hashCode() + 527) * 31);
        }
        return this.f2253e;
    }
}
