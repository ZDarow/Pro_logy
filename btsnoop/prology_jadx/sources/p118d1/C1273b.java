package p118d1;

/* renamed from: d1.b */
/* loaded from: classes.dex */
public final class C1273b {

    /* renamed from: c */
    public static final java.util.regex.Pattern f5113c = java.util.regex.Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d */
    public static final java.util.regex.Pattern f5114d = java.util.regex.Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a */
    public final p086W.C0798r f5115a = new p086W.C0798r();

    /* renamed from: b */
    public final java.lang.StringBuilder f5116b = new java.lang.StringBuilder();

    /* renamed from: a */
    public static java.lang.String m3005a(p086W.C0798r c0798r, java.lang.StringBuilder sb) {
        boolean z4 = false;
        sb.setLength(0);
        int i4 = c0798r.f2787b;
        int i5 = c0798r.f2788c;
        while (i4 < i5 && !z4) {
            char c4 = (char) c0798r.f2786a[i4];
            if ((c4 < 'A' || c4 > 'Z') && ((c4 < 'a' || c4 > 'z') && !((c4 >= '0' && c4 <= '9') || c4 == '#' || c4 == '-' || c4 == '.' || c4 == '_'))) {
                z4 = true;
            } else {
                i4++;
                sb.append(c4);
            }
        }
        c0798r.m1538H(i4 - c0798r.f2787b);
        return sb.toString();
    }

    /* renamed from: b */
    public static java.lang.String m3006b(p086W.C0798r c0798r, java.lang.StringBuilder sb) {
        m3007c(c0798r);
        if (c0798r.m1539a() == 0) {
            return null;
        }
        java.lang.String m3005a = m3005a(c0798r, sb);
        if (!"".equals(m3005a)) {
            return m3005a;
        }
        return "" + ((char) c0798r.m1559u());
    }

    /* renamed from: c */
    public static void m3007c(p086W.C0798r c0798r) {
        while (true) {
            for (boolean z4 = true; c0798r.m1539a() > 0 && z4; z4 = false) {
                int i4 = c0798r.f2787b;
                byte[] bArr = c0798r.f2786a;
                byte b4 = bArr[i4];
                char c4 = (char) b4;
                if (c4 == '\t' || c4 == '\n' || c4 == '\f' || c4 == '\r' || c4 == ' ') {
                    c0798r.m1538H(1);
                } else {
                    int i5 = c0798r.f2788c;
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
                            c0798r.m1538H(i5 - c0798r.f2787b);
                        }
                    }
                }
            }
            return;
        }
    }
}
