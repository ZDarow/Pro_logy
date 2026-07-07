package Y1;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f3112a;

    /* renamed from: b, reason: collision with root package name */
    public static final StringBuilder f3113b;

    static {
        Locale locale = Locale.ROOT;
        f3112a = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        f3113b = new StringBuilder(33);
    }

    public static void a(long j4, StringBuilder sb) {
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
