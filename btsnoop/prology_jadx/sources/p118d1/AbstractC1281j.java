package p118d1;

/* renamed from: d1.j */
/* loaded from: classes.dex */
public abstract class AbstractC1281j {

    /* renamed from: a */
    public static final java.util.regex.Pattern f5160a = java.util.regex.Pattern.compile("^NOTE([ \t].*)?$");

    /* renamed from: a */
    public static boolean m3017a(p086W.C0798r c0798r) {
        c0798r.getClass();
        java.lang.String m1547i = c0798r.m1547i(p124e2.AbstractC1356d.f5630c);
        return m1547i != null && m1547i.startsWith("WEBVTT");
    }

    /* renamed from: b */
    public static float m3018b(java.lang.String str) {
        if (str.endsWith("%")) {
            return java.lang.Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new java.lang.NumberFormatException("Percentages must end with %");
    }

    /* renamed from: c */
    public static long m3019c(java.lang.String str) {
        int i4 = p086W.AbstractC0805y.f2801a;
        java.lang.String[] split = str.split("\\.", 2);
        long j4 = 0;
        for (java.lang.String str2 : split[0].split(":", -1)) {
            j4 = (j4 * 60) + java.lang.Long.parseLong(str2);
        }
        long j5 = j4 * 1000;
        if (split.length == 2) {
            j5 += java.lang.Long.parseLong(split[1]);
        }
        return j5 * 1000;
    }

    /* renamed from: d */
    public static void m3020d(p086W.C0798r c0798r) {
        int i4 = c0798r.f2787b;
        if (m3017a(c0798r)) {
            return;
        }
        c0798r.m1537G(i4);
        throw p076T.C0666I.m1202a(null, "Expected WEBVTT. Got " + c0798r.m1547i(p124e2.AbstractC1356d.f5630c));
    }
}
