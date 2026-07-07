package m0;

import T.I;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: m0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0413B {

    /* renamed from: c, reason: collision with root package name */
    public static final C0413B f7136c = new C0413B(0, -9223372036854775807L);

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f7137d = Pattern.compile("npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    /* renamed from: a, reason: collision with root package name */
    public final long f7138a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7139b;

    public C0413B(long j4, long j5) {
        this.f7138a = j4;
        this.f7139b = j5;
    }

    public static C0413B a(String str) {
        long parseFloat;
        Matcher matcher = f7137d.matcher(str);
        boolean matches = matcher.matches();
        Pattern pattern = z.f7321a;
        if (!matches) {
            throw I.b(str, null);
        }
        String group = matcher.group(1);
        if (group == null) {
            throw I.b(str, null);
        }
        int i4 = W.y.f2709a;
        long parseFloat2 = group.equals("now") ? 0L : Float.parseFloat(group) * 1000.0f;
        String group2 = matcher.group(2);
        if (group2 != null) {
            try {
                parseFloat = Float.parseFloat(group2) * 1000.0f;
                if (parseFloat < parseFloat2) {
                    throw I.b(str, null);
                }
            } catch (NumberFormatException e4) {
                throw I.b(group2, e4);
            }
        } else {
            parseFloat = -9223372036854775807L;
        }
        return new C0413B(parseFloat2, parseFloat);
    }
}
