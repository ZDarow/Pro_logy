package y0;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f9117c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f9118a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f9119b = -1;

    public final boolean a(String str) {
        Matcher matcher = f9117c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i4 = W.y.f2709a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f9118a = parseInt;
            this.f9119b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(T.G g4) {
        int i4 = 0;
        while (true) {
            T.F[] fArr = g4.f2118l;
            if (i4 >= fArr.length) {
                return;
            }
            T.F f4 = fArr[i4];
            if (f4 instanceof M0.e) {
                M0.e eVar = (M0.e) f4;
                if ("iTunSMPB".equals(eVar.f1131n) && a(eVar.f1132o)) {
                    return;
                }
            } else if (f4 instanceof M0.k) {
                M0.k kVar = (M0.k) f4;
                if ("com.apple.iTunes".equals(kVar.f1144m) && "iTunSMPB".equals(kVar.f1145n) && a(kVar.f1146o)) {
                    return;
                }
            } else {
                continue;
            }
            i4++;
        }
    }
}
