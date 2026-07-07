package p161m0;

/* renamed from: m0.B */
/* loaded from: classes.dex */
public final class C1837B {

    /* renamed from: c */
    public static final p161m0.C1837B f7406c = new p161m0.C1837B(0, -9223372036854775807L);

    /* renamed from: d */
    public static final java.util.regex.Pattern f7407d = java.util.regex.Pattern.compile("npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    /* renamed from: a */
    public final long f7408a;

    /* renamed from: b */
    public final long f7409b;

    public C1837B(long j4, long j5) {
        this.f7408a = j4;
        this.f7409b = j5;
    }

    /* renamed from: a */
    public static p161m0.C1837B m3800a(java.lang.String str) {
        long parseFloat;
        java.util.regex.Matcher matcher = f7407d.matcher(str);
        boolean matches = matcher.matches();
        java.util.regex.Pattern pattern = p161m0.AbstractC1869z.f7600a;
        if (!matches) {
            throw p076T.C0666I.m1203b(str, null);
        }
        java.lang.String group = matcher.group(1);
        if (group == null) {
            throw p076T.C0666I.m1203b(str, null);
        }
        int i4 = p086W.AbstractC0805y.f2801a;
        long parseFloat2 = group.equals("now") ? 0L : java.lang.Float.parseFloat(group) * 1000.0f;
        java.lang.String group2 = matcher.group(2);
        if (group2 != null) {
            try {
                parseFloat = java.lang.Float.parseFloat(group2) * 1000.0f;
                if (parseFloat < parseFloat2) {
                    throw p076T.C0666I.m1203b(str, null);
                }
            } catch (java.lang.NumberFormatException e4) {
                throw p076T.C0666I.m1203b(group2, e4);
            }
        } else {
            parseFloat = -9223372036854775807L;
        }
        return new p161m0.C1837B(parseFloat2, parseFloat);
    }
}
