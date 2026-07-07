package p076T;

/* renamed from: T.i */
/* loaded from: classes.dex */
public final class C0695i {

    /* renamed from: h */
    public static final p076T.C0695i f2330h = new p076T.C0695i(1, 2, 3, -1, -1, null);

    /* renamed from: a */
    public final int f2331a;

    /* renamed from: b */
    public final int f2332b;

    /* renamed from: c */
    public final int f2333c;

    /* renamed from: d */
    public final byte[] f2334d;

    /* renamed from: e */
    public final int f2335e;

    /* renamed from: f */
    public final int f2336f;

    /* renamed from: g */
    public int f2337g;

    static {
        p009B2.AbstractC0051h.m155n(0, 1, 2, 3, 4);
        p086W.AbstractC0805y.m1587H(5);
    }

    public C0695i(int i4, int i5, int i6, int i7, int i8, byte[] bArr) {
        this.f2331a = i4;
        this.f2332b = i5;
        this.f2333c = i6;
        this.f2334d = bArr;
        this.f2335e = i7;
        this.f2336f = i8;
    }

    /* renamed from: a */
    public static java.lang.String m1278a(int i4) {
        return i4 != -1 ? i4 != 1 ? i4 != 2 ? p009B2.AbstractC0051h.m152k("Undefined color range ", i4) : "Limited range" : "Full range" : "Unset color range";
    }

    /* renamed from: b */
    public static java.lang.String m1279b(int i4) {
        return i4 != -1 ? i4 != 6 ? i4 != 1 ? i4 != 2 ? p009B2.AbstractC0051h.m152k("Undefined color space ", i4) : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    /* renamed from: c */
    public static java.lang.String m1280c(int i4) {
        return i4 != -1 ? i4 != 10 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 6 ? i4 != 7 ? p009B2.AbstractC0051h.m152k("Undefined color transfer ", i4) : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    /* renamed from: e */
    public static boolean m1281e(p076T.C0695i c0695i) {
        int i4;
        int i5;
        int i6;
        int i7;
        if (c0695i == null) {
            return true;
        }
        int i8 = c0695i.f2331a;
        return (i8 == -1 || i8 == 1 || i8 == 2) && ((i4 = c0695i.f2332b) == -1 || i4 == 2) && (((i5 = c0695i.f2333c) == -1 || i5 == 3) && c0695i.f2334d == null && (((i6 = c0695i.f2336f) == -1 || i6 == 8) && ((i7 = c0695i.f2335e) == -1 || i7 == 8)));
    }

    /* renamed from: f */
    public static int m1282f(int i4) {
        if (i4 == 1) {
            return 1;
        }
        if (i4 != 9) {
            return (i4 == 4 || i4 == 5 || i4 == 6 || i4 == 7) ? 2 : -1;
        }
        return 6;
    }

    /* renamed from: g */
    public static int m1283g(int i4) {
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

    /* renamed from: d */
    public final boolean m1284d() {
        return (this.f2331a == -1 || this.f2332b == -1 || this.f2333c == -1) ? false : true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p076T.C0695i.class != obj.getClass()) {
            return false;
        }
        p076T.C0695i c0695i = (p076T.C0695i) obj;
        return this.f2331a == c0695i.f2331a && this.f2332b == c0695i.f2332b && this.f2333c == c0695i.f2333c && java.util.Arrays.equals(this.f2334d, c0695i.f2334d) && this.f2335e == c0695i.f2335e && this.f2336f == c0695i.f2336f;
    }

    public final int hashCode() {
        if (this.f2337g == 0) {
            this.f2337g = ((((java.util.Arrays.hashCode(this.f2334d) + ((((((527 + this.f2331a) * 31) + this.f2332b) * 31) + this.f2333c) * 31)) * 31) + this.f2335e) * 31) + this.f2336f;
        }
        return this.f2337g;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ColorInfo(");
        sb.append(m1279b(this.f2331a));
        sb.append(", ");
        sb.append(m1278a(this.f2332b));
        sb.append(", ");
        sb.append(m1280c(this.f2333c));
        sb.append(", ");
        sb.append(this.f2334d != null);
        sb.append(", ");
        java.lang.String str2 = "NA";
        int i4 = this.f2335e;
        if (i4 != -1) {
            str = i4 + "bit Luma";
        } else {
            str = "NA";
        }
        sb.append(str);
        sb.append(", ");
        int i5 = this.f2336f;
        if (i5 != -1) {
            str2 = i5 + "bit Chroma";
        }
        return p009B2.AbstractC0051h.m154m(sb, str2, ")");
    }
}
