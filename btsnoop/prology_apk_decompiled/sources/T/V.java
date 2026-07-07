package T;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final int f2169a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2170b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2171c;

    /* renamed from: d, reason: collision with root package name */
    public final C0095p[] f2172d;

    /* renamed from: e, reason: collision with root package name */
    public int f2173e;

    static {
        W.y.H(0);
        W.y.H(1);
    }

    public V(String str, C0095p... c0095pArr) {
        W.a.e(c0095pArr.length > 0);
        this.f2170b = str;
        this.f2172d = c0095pArr;
        this.f2169a = c0095pArr.length;
        int g4 = H.g(c0095pArr[0].f2325m);
        this.f2171c = g4 == -1 ? H.g(c0095pArr[0].f2324l) : g4;
        String str2 = c0095pArr[0].f2316d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i4 = c0095pArr[0].f2318f | 16384;
        for (int i5 = 1; i5 < c0095pArr.length; i5++) {
            String str3 = c0095pArr[i5].f2316d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                c(i5, "languages", c0095pArr[0].f2316d, c0095pArr[i5].f2316d);
                return;
            } else {
                if (i4 != (c0095pArr[i5].f2318f | 16384)) {
                    c(i5, "role flags", Integer.toBinaryString(c0095pArr[0].f2318f), Integer.toBinaryString(c0095pArr[i5].f2318f));
                    return;
                }
            }
        }
    }

    public static void c(int i4, String str, String str2, String str3) {
        W.a.o("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i4 + ")"));
    }

    public final C0095p a(int i4) {
        return this.f2172d[i4];
    }

    public final int b(C0095p c0095p) {
        int i4 = 0;
        while (true) {
            C0095p[] c0095pArr = this.f2172d;
            if (i4 >= c0095pArr.length) {
                return -1;
            }
            if (c0095p == c0095pArr[i4]) {
                return i4;
            }
            i4++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || V.class != obj.getClass()) {
            return false;
        }
        V v4 = (V) obj;
        return this.f2170b.equals(v4.f2170b) && Arrays.equals(this.f2172d, v4.f2172d);
    }

    public final int hashCode() {
        if (this.f2173e == 0) {
            this.f2173e = Arrays.hashCode(this.f2172d) + ((this.f2170b.hashCode() + 527) * 31);
        }
        return this.f2173e;
    }
}
