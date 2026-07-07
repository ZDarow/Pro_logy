package T;

import B2.AbstractC0007h;
import java.util.Arrays;

/* renamed from: T.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0088i {

    /* renamed from: h, reason: collision with root package name */
    public static final C0088i f2250h = new C0088i(1, 2, 3, -1, -1, null);

    /* renamed from: a, reason: collision with root package name */
    public final int f2251a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2252b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2253c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f2254d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2255e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2256f;

    /* renamed from: g, reason: collision with root package name */
    public int f2257g;

    static {
        AbstractC0007h.n(0, 1, 2, 3, 4);
        W.y.H(5);
    }

    public C0088i(int i4, int i5, int i6, int i7, int i8, byte[] bArr) {
        this.f2251a = i4;
        this.f2252b = i5;
        this.f2253c = i6;
        this.f2254d = bArr;
        this.f2255e = i7;
        this.f2256f = i8;
    }

    public static String a(int i4) {
        return i4 != -1 ? i4 != 1 ? i4 != 2 ? AbstractC0007h.k("Undefined color range ", i4) : "Limited range" : "Full range" : "Unset color range";
    }

    public static String b(int i4) {
        return i4 != -1 ? i4 != 6 ? i4 != 1 ? i4 != 2 ? AbstractC0007h.k("Undefined color space ", i4) : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String c(int i4) {
        return i4 != -1 ? i4 != 10 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 6 ? i4 != 7 ? AbstractC0007h.k("Undefined color transfer ", i4) : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean e(C0088i c0088i) {
        int i4;
        int i5;
        int i6;
        int i7;
        if (c0088i == null) {
            return true;
        }
        int i8 = c0088i.f2251a;
        return (i8 == -1 || i8 == 1 || i8 == 2) && ((i4 = c0088i.f2252b) == -1 || i4 == 2) && (((i5 = c0088i.f2253c) == -1 || i5 == 3) && c0088i.f2254d == null && (((i6 = c0088i.f2256f) == -1 || i6 == 8) && ((i7 = c0088i.f2255e) == -1 || i7 == 8)));
    }

    public static int f(int i4) {
        if (i4 == 1) {
            return 1;
        }
        if (i4 != 9) {
            return (i4 == 4 || i4 == 5 || i4 == 6 || i4 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int g(int i4) {
        if (i4 == 1) {
            return 3;
        }
        if (i4 == 4) {
            return 10;
        }
        if (i4 == 13) {
            return 2;
        }
        if (i4 == 16) {
            return 6;
        }
        if (i4 != 18) {
            return (i4 == 6 || i4 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean d() {
        return (this.f2251a == -1 || this.f2252b == -1 || this.f2253c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0088i.class != obj.getClass()) {
            return false;
        }
        C0088i c0088i = (C0088i) obj;
        return this.f2251a == c0088i.f2251a && this.f2252b == c0088i.f2252b && this.f2253c == c0088i.f2253c && Arrays.equals(this.f2254d, c0088i.f2254d) && this.f2255e == c0088i.f2255e && this.f2256f == c0088i.f2256f;
    }

    public final int hashCode() {
        if (this.f2257g == 0) {
            this.f2257g = ((((Arrays.hashCode(this.f2254d) + ((((((527 + this.f2251a) * 31) + this.f2252b) * 31) + this.f2253c) * 31)) * 31) + this.f2255e) * 31) + this.f2256f;
        }
        return this.f2257g;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(b(this.f2251a));
        sb.append(", ");
        sb.append(a(this.f2252b));
        sb.append(", ");
        sb.append(c(this.f2253c));
        sb.append(", ");
        sb.append(this.f2254d != null);
        sb.append(", ");
        String str2 = "NA";
        int i4 = this.f2255e;
        if (i4 != -1) {
            str = i4 + "bit Luma";
        } else {
            str = "NA";
        }
        sb.append(str);
        sb.append(", ");
        int i5 = this.f2256f;
        if (i5 != -1) {
            str2 = i5 + "bit Chroma";
        }
        return AbstractC0007h.m(sb, str2, ")");
    }
}
