package p215y0;

/* renamed from: y0.u */
/* loaded from: classes.dex */
public final class C2409u {

    /* renamed from: c */
    public static final java.util.regex.Pattern f9479c = java.util.regex.Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f9480a = -1;

    /* renamed from: b */
    public int f9481b = -1;

    /* renamed from: a */
    public final boolean m4643a(java.lang.String str) {
        java.util.regex.Matcher matcher = f9479c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            java.lang.String group = matcher.group(1);
            int i4 = p086W.AbstractC0805y.f2801a;
            int parseInt = java.lang.Integer.parseInt(group, 16);
            int parseInt2 = java.lang.Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f9480a = parseInt;
            this.f9481b = parseInt2;
            return true;
        } catch (java.lang.NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final void m4644b(p076T.C0664G c0664g) {
        int i4 = 0;
        while (true) {
            p076T.InterfaceC0663F[] interfaceC0663FArr = c0664g.f2198l;
            if (i4 >= interfaceC0663FArr.length) {
                return;
            }
            p076T.InterfaceC0663F interfaceC0663F = interfaceC0663FArr[i4];
            if (interfaceC0663F instanceof p049M0.C0406e) {
                p049M0.C0406e c0406e = (p049M0.C0406e) interfaceC0663F;
                if ("iTunSMPB".equals(c0406e.f1170n) && m4643a(c0406e.f1171o)) {
                    return;
                }
            } else if (interfaceC0663F instanceof p049M0.C0412k) {
                p049M0.C0412k c0412k = (p049M0.C0412k) interfaceC0663F;
                if ("com.apple.iTunes".equals(c0412k.f1183m) && "iTunSMPB".equals(c0412k.f1184n) && m4643a(c0412k.f1185o)) {
                    return;
                }
            } else {
                continue;
            }
            i4++;
        }
    }
}
