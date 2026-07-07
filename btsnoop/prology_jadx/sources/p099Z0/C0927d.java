package p099Z0;

/* renamed from: Z0.d */
/* loaded from: classes.dex */
public final class C0927d {

    /* renamed from: a */
    public final java.lang.String f3281a;

    /* renamed from: b */
    public final int f3282b;

    /* renamed from: c */
    public final java.lang.Integer f3283c;

    /* renamed from: d */
    public final java.lang.Integer f3284d;

    /* renamed from: e */
    public final float f3285e;

    /* renamed from: f */
    public final boolean f3286f;

    /* renamed from: g */
    public final boolean f3287g;

    /* renamed from: h */
    public final boolean f3288h;

    /* renamed from: i */
    public final boolean f3289i;

    /* renamed from: j */
    public final int f3290j;

    public C0927d(java.lang.String str, int i4, java.lang.Integer num, java.lang.Integer num2, float f4, boolean z4, boolean z5, boolean z6, boolean z7, int i5) {
        this.f3281a = str;
        this.f3282b = i4;
        this.f3283c = num;
        this.f3284d = num2;
        this.f3285e = f4;
        this.f3286f = z4;
        this.f3287g = z5;
        this.f3288h = z6;
        this.f3289i = z7;
        this.f3290j = i5;
    }

    /* renamed from: a */
    public static int m1758a(java.lang.String str) {
        boolean z4;
        try {
            int parseInt = java.lang.Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                case 9:
                    z4 = true;
                    break;
                default:
                    z4 = false;
                    break;
            }
            if (z4) {
                return parseInt;
            }
        } catch (java.lang.NumberFormatException unused) {
        }
        p009B2.AbstractC0051h.m161t("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    /* renamed from: b */
    public static boolean m1759b(java.lang.String str) {
        try {
            int parseInt = java.lang.Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (java.lang.NumberFormatException e4) {
            p086W.AbstractC0781a.m1411B("SsaStyle", "Failed to parse boolean value: '" + str + "'", e4);
            return false;
        }
    }

    /* renamed from: c */
    public static java.lang.Integer m1760c(java.lang.String str) {
        try {
            long parseLong = str.startsWith("&H") ? java.lang.Long.parseLong(str.substring(2), 16) : java.lang.Long.parseLong(str);
            p086W.AbstractC0781a.m1416e(parseLong <= 4294967295L);
            return java.lang.Integer.valueOf(android.graphics.Color.argb(p101a.AbstractC0936a.m1804l(((parseLong >> 24) & 255) ^ 255), p101a.AbstractC0936a.m1804l(parseLong & 255), p101a.AbstractC0936a.m1804l((parseLong >> 8) & 255), p101a.AbstractC0936a.m1804l((parseLong >> 16) & 255)));
        } catch (java.lang.IllegalArgumentException e4) {
            p086W.AbstractC0781a.m1411B("SsaStyle", "Failed to parse color expression: '" + str + "'", e4);
            return null;
        }
    }
}
