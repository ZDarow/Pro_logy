package Z0;

import B2.AbstractC0007h;
import L.k;
import a.AbstractC0110a;
import android.graphics.Color;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f3169a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3170b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f3171c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f3172d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3173e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3174f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3175g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3176h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3177i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3178j;

    public d(String str, int i4, Integer num, Integer num2, float f4, boolean z4, boolean z5, boolean z6, boolean z7, int i5) {
        this.f3169a = str;
        this.f3170b = i4;
        this.f3171c = num;
        this.f3172d = num2;
        this.f3173e = f4;
        this.f3174f = z4;
        this.f3175g = z5;
        this.f3176h = z6;
        this.f3177i = z7;
        this.f3178j = i5;
    }

    public static int a(String str) {
        boolean z4;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case k.FLOAT_FIELD_NUMBER /* 2 */:
                case k.INTEGER_FIELD_NUMBER /* 3 */:
                case k.LONG_FIELD_NUMBER /* 4 */:
                case k.STRING_FIELD_NUMBER /* 5 */:
                case k.STRING_SET_FIELD_NUMBER /* 6 */:
                case k.DOUBLE_FIELD_NUMBER /* 7 */:
                case k.BYTES_FIELD_NUMBER /* 8 */:
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
        } catch (NumberFormatException unused) {
        }
        AbstractC0007h.t("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e4) {
            W.a.B("SsaStyle", "Failed to parse boolean value: '" + str + "'", e4);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            W.a.e(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(AbstractC0110a.l(((parseLong >> 24) & 255) ^ 255), AbstractC0110a.l(parseLong & 255), AbstractC0110a.l((parseLong >> 8) & 255), AbstractC0110a.l((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e4) {
            W.a.B("SsaStyle", "Failed to parse color expression: '" + str + "'", e4);
            return null;
        }
    }
}
