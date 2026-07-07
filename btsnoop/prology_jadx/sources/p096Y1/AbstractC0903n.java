package p096Y1;

/* renamed from: Y1.n */
/* loaded from: classes.dex */
public abstract class AbstractC0903n {

    /* renamed from: a */
    public static final java.text.SimpleDateFormat f3223a;

    /* renamed from: b */
    public static final java.lang.StringBuilder f3224b;

    static {
        java.util.Locale locale = java.util.Locale.ROOT;
        f3223a = new java.text.SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        new java.text.SimpleDateFormat("MM-dd HH:mm:ss", locale);
        f3224b = new java.lang.StringBuilder(33);
    }

    /* renamed from: a */
    public static void m1741a(long j4, java.lang.StringBuilder sb) {
        if (j4 == 0) {
            sb.append("0s");
            return;
        }
        sb.ensureCapacity(sb.length() + 27);
        boolean z4 = false;
        if (j4 < 0) {
            sb.append("-");
            if (j4 != Long.MIN_VALUE) {
                j4 = -j4;
            } else {
                j4 = Long.MAX_VALUE;
                z4 = true;
            }
        }
        if (j4 >= 86400000) {
            sb.append(j4 / 86400000);
            sb.append("d");
            j4 %= 86400000;
        }
        if (true == z4) {
            j4 = 25975808;
        }
        if (j4 >= 3600000) {
            sb.append(j4 / 3600000);
            sb.append("h");
            j4 %= 3600000;
        }
        if (j4 >= 60000) {
            sb.append(j4 / 60000);
            sb.append("m");
            j4 %= 60000;
        }
        if (j4 >= 1000) {
            sb.append(j4 / 1000);
            sb.append("s");
            j4 %= 1000;
        }
        if (j4 > 0) {
            sb.append(j4);
            sb.append("ms");
        }
    }
}
