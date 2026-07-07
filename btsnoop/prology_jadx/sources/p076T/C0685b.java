package p076T;

/* renamed from: T.b */
/* loaded from: classes.dex */
public final class C0685b {

    /* renamed from: c */
    public static final p076T.C0685b f2305c = new p076T.C0685b(new p076T.C0683a[0]);

    /* renamed from: d */
    public static final p076T.C0683a f2306d;

    /* renamed from: a */
    public final int f2307a;

    /* renamed from: b */
    public final p076T.C0683a[] f2308b;

    static {
        p076T.C0683a c0683a = new p076T.C0683a(-1, -1, new int[0], new p076T.C0659B[0], new long[0]);
        int[] iArr = c0683a.f2301e;
        int length = iArr.length;
        int max = java.lang.Math.max(0, length);
        int[] copyOf = java.util.Arrays.copyOf(iArr, max);
        java.util.Arrays.fill(copyOf, length, max, 0);
        long[] jArr = c0683a.f2302f;
        int length2 = jArr.length;
        int max2 = java.lang.Math.max(0, length2);
        long[] copyOf2 = java.util.Arrays.copyOf(jArr, max2);
        java.util.Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        f2306d = new p076T.C0683a(0, c0683a.f2298b, copyOf, (p076T.C0659B[]) java.util.Arrays.copyOf(c0683a.f2300d, 0), copyOf2);
        p086W.AbstractC0805y.m1587H(1);
        p086W.AbstractC0805y.m1587H(2);
        p086W.AbstractC0805y.m1587H(3);
        p086W.AbstractC0805y.m1587H(4);
    }

    public C0685b(p076T.C0683a[] c0683aArr) {
        this.f2307a = c0683aArr.length;
        this.f2308b = c0683aArr;
    }

    /* renamed from: a */
    public final p076T.C0683a m1265a(int i4) {
        return i4 < 0 ? f2306d : this.f2308b[i4];
    }

    /* renamed from: b */
    public final boolean m1266b(int i4) {
        if (i4 != this.f2307a - 1) {
            return false;
        }
        m1265a(i4).getClass();
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p076T.C0685b.class != obj.getClass()) {
            return false;
        }
        p076T.C0685b c0685b = (p076T.C0685b) obj;
        return p086W.AbstractC0805y.m1606a(null, null) && this.f2307a == c0685b.f2307a && java.util.Arrays.equals(this.f2308b, c0685b.f2308b);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.f2308b) + (((((this.f2307a * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i4 = 0;
        while (true) {
            p076T.C0683a[] c0683aArr = this.f2308b;
            if (i4 >= c0683aArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=0, ads=[");
            c0683aArr[i4].getClass();
            for (int i5 = 0; i5 < c0683aArr[i4].f2301e.length; i5++) {
                sb.append("ad(state=");
                int i6 = c0683aArr[i4].f2301e[i5];
                if (i6 == 0) {
                    sb.append('_');
                } else if (i6 == 1) {
                    sb.append('R');
                } else if (i6 == 2) {
                    sb.append('S');
                } else if (i6 == 3) {
                    sb.append('P');
                } else if (i6 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(c0683aArr[i4].f2302f[i5]);
                sb.append(')');
                if (i5 < c0683aArr[i4].f2301e.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i4 < c0683aArr.length - 1) {
                sb.append(", ");
            }
            i4++;
        }
    }
}
