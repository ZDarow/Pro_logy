package T;

import java.util.Arrays;

/* renamed from: T.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0081b {

    /* renamed from: c, reason: collision with root package name */
    public static final C0081b f2225c = new C0081b(new C0080a[0]);

    /* renamed from: d, reason: collision with root package name */
    public static final C0080a f2226d;

    /* renamed from: a, reason: collision with root package name */
    public final int f2227a;

    /* renamed from: b, reason: collision with root package name */
    public final C0080a[] f2228b;

    static {
        C0080a c0080a = new C0080a(-1, -1, new int[0], new B[0], new long[0]);
        int[] iArr = c0080a.f2221e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = c0080a.f2222f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        f2226d = new C0080a(0, c0080a.f2218b, copyOf, (B[]) Arrays.copyOf(c0080a.f2220d, 0), copyOf2);
        W.y.H(1);
        W.y.H(2);
        W.y.H(3);
        W.y.H(4);
    }

    public C0081b(C0080a[] c0080aArr) {
        this.f2227a = c0080aArr.length;
        this.f2228b = c0080aArr;
    }

    public final C0080a a(int i4) {
        return i4 < 0 ? f2226d : this.f2228b[i4];
    }

    public final boolean b(int i4) {
        if (i4 != this.f2227a - 1) {
            return false;
        }
        a(i4).getClass();
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0081b.class != obj.getClass()) {
            return false;
        }
        C0081b c0081b = (C0081b) obj;
        return W.y.a(null, null) && this.f2227a == c0081b.f2227a && Arrays.equals(this.f2228b, c0081b.f2228b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2228b) + (((((this.f2227a * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i4 = 0;
        while (true) {
            C0080a[] c0080aArr = this.f2228b;
            if (i4 >= c0080aArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=0, ads=[");
            c0080aArr[i4].getClass();
            for (int i5 = 0; i5 < c0080aArr[i4].f2221e.length; i5++) {
                sb.append("ad(state=");
                int i6 = c0080aArr[i4].f2221e[i5];
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
                sb.append(c0080aArr[i4].f2222f[i5]);
                sb.append(')');
                if (i5 < c0080aArr[i4].f2221e.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i4 < c0080aArr.length - 1) {
                sb.append(", ");
            }
            i4++;
        }
    }
}
