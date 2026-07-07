package p099Z0;

/* renamed from: Z0.c */
/* loaded from: classes.dex */
public final class C0926c {

    /* renamed from: a */
    public static final java.util.regex.Pattern f3277a = java.util.regex.Pattern.compile("\\{([^}]*)\\}");

    /* renamed from: b */
    public static final java.util.regex.Pattern f3278b;

    /* renamed from: c */
    public static final java.util.regex.Pattern f3279c;

    /* renamed from: d */
    public static final java.util.regex.Pattern f3280d;

    static {
        int i4 = p086W.AbstractC0805y.f2801a;
        java.util.Locale locale = java.util.Locale.US;
        f3278b = java.util.regex.Pattern.compile(java.lang.String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f3279c = java.util.regex.Pattern.compile(java.lang.String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f3280d = java.util.regex.Pattern.compile("\\\\an(\\d+)");
    }

    /* renamed from: a */
    public static android.graphics.PointF m1757a(java.lang.String str) {
        java.lang.String group;
        java.lang.String group2;
        java.util.regex.Matcher matcher = f3278b.matcher(str);
        java.util.regex.Matcher matcher2 = f3279c.matcher(str);
        boolean find = matcher.find();
        boolean find2 = matcher2.find();
        if (find) {
            if (find2) {
                p086W.AbstractC0781a.m1429r("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
            }
            group = matcher.group(1);
            group2 = matcher.group(2);
        } else {
            if (!find2) {
                return null;
            }
            group = matcher2.group(1);
            group2 = matcher2.group(2);
        }
        group.getClass();
        float parseFloat = java.lang.Float.parseFloat(group.trim());
        group2.getClass();
        return new android.graphics.PointF(parseFloat, java.lang.Float.parseFloat(group2.trim()));
    }
}
