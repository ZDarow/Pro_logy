package d1;

import T.I;
import W.r;
import W.y;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f4973a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(r rVar) {
        rVar.getClass();
        String i4 = rVar.i(e2.d.f5436c);
        return i4 != null && i4.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i4 = y.f2709a;
        String[] split = str.split("\\.", 2);
        long j4 = 0;
        for (String str2 : split[0].split(":", -1)) {
            j4 = (j4 * 60) + Long.parseLong(str2);
        }
        long j5 = j4 * 1000;
        if (split.length == 2) {
            j5 += Long.parseLong(split[1]);
        }
        return j5 * 1000;
    }

    public static void d(r rVar) {
        int i4 = rVar.f2695b;
        if (a(rVar)) {
            return;
        }
        rVar.G(i4);
        throw I.a(null, "Expected WEBVTT. Got " + rVar.i(e2.d.f5436c));
    }
}
