package d1;

import W.r;
import java.util.regex.Pattern;

/* renamed from: d1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232b {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f4926c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f4927d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    public final r f4928a = new r();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f4929b = new StringBuilder();

    public static String a(r rVar, StringBuilder sb) {
        boolean z4 = false;
        sb.setLength(0);
        int i4 = rVar.f2695b;
        int i5 = rVar.f2696c;
        while (i4 < i5 && !z4) {
            char c4 = (char) rVar.f2694a[i4];
            if ((c4 < 'A' || c4 > 'Z') && ((c4 < 'a' || c4 > 'z') && !((c4 >= '0' && c4 <= '9') || c4 == '#' || c4 == '-' || c4 == '.' || c4 == '_'))) {
                z4 = true;
            } else {
                i4++;
                sb.append(c4);
            }
        }
        rVar.H(i4 - rVar.f2695b);
        return sb.toString();
    }

    public static String b(r rVar, StringBuilder sb) {
        c(rVar);
        if (rVar.a() == 0) {
            return null;
        }
        String a4 = a(rVar, sb);
        if (!"".equals(a4)) {
            return a4;
        }
        return "" + ((char) rVar.u());
    }

    public static void c(r rVar) {
        while (true) {
            for (boolean z4 = true; rVar.a() > 0 && z4; z4 = false) {
                int i4 = rVar.f2695b;
                byte[] bArr = rVar.f2694a;
                byte b4 = bArr[i4];
                char c4 = (char) b4;
                if (c4 == '\t' || c4 == '\n' || c4 == '\f' || c4 == '\r' || c4 == ' ') {
                    rVar.H(1);
                } else {
                    int i5 = rVar.f2696c;
                    int i6 = i4 + 2;
                    if (i6 <= i5) {
                        int i7 = i4 + 1;
                        if (b4 == 47 && bArr[i7] == 42) {
                            while (true) {
                                int i8 = i6 + 1;
                                if (i8 >= i5) {
                                    break;
                                }
                                if (((char) bArr[i6]) == '*' && ((char) bArr[i8]) == '/') {
                                    i6 += 2;
                                    i5 = i6;
                                } else {
                                    i6 = i8;
                                }
                            }
                            rVar.H(i5 - rVar.f2695b);
                        }
                    }
                }
            }
            return;
        }
    }
}
