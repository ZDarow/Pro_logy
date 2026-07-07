package p103a1;

/* renamed from: a1.a */
/* loaded from: classes.dex */
public final class C1002a implements p083V0.InterfaceC0774l {

    /* renamed from: o */
    public static final java.util.regex.Pattern f3717o = java.util.regex.Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: p */
    public static final java.util.regex.Pattern f3718p = java.util.regex.Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: l */
    public final java.lang.StringBuilder f3719l = new java.lang.StringBuilder();

    /* renamed from: m */
    public final java.util.ArrayList f3720m = new java.util.ArrayList();

    /* renamed from: n */
    public final p086W.C0798r f3721n = new p086W.C0798r();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static p082V.C0757b m2033a(android.text.Spanned spanned, java.lang.String str) {
        char c4;
        char c5;
        float f4;
        if (str == null) {
            return new p082V.C0757b(spanned, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c4 = 7;
                    break;
                }
                c4 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c4 = '\b';
                    break;
                }
                c4 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        int i4 = (c4 == 0 || c4 == 1 || c4 == 2) ? 0 : (c4 == 3 || c4 == 4 || c4 == 5) ? 2 : 1;
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c5 = 0;
                    break;
                }
                c5 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c5 = 1;
                    break;
                }
                c5 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c5 = 2;
                    break;
                }
                c5 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c5 = 6;
                    break;
                }
                c5 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c5 = 7;
                    break;
                }
                c5 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c5 = '\b';
                    break;
                }
                c5 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c5 = 3;
                    break;
                }
                c5 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c5 = 4;
                    break;
                }
                c5 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c5 = 5;
                    break;
                }
                c5 = 65535;
                break;
            default:
                c5 = 65535;
                break;
        }
        int i5 = (c5 == 0 || c5 == 1 || c5 == 2) ? 2 : (c5 == 3 || c5 == 4 || c5 == 5) ? 0 : 1;
        float f5 = 0.92f;
        if (i4 == 0) {
            f4 = 0.08f;
        } else if (i4 == 1) {
            f4 = 0.5f;
        } else {
            if (i4 != 2) {
                throw new java.lang.IllegalArgumentException();
            }
            f4 = 0.92f;
        }
        if (i5 == 0) {
            f5 = 0.08f;
        } else if (i5 == 1) {
            f5 = 0.5f;
        } else if (i5 != 2) {
            throw new java.lang.IllegalArgumentException();
        }
        return new p082V.C0757b(spanned, null, null, null, f5, 0, i5, f4, i4, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    /* renamed from: c */
    public static long m2034c(java.util.regex.Matcher matcher, int i4) {
        java.lang.String group = matcher.group(i4 + 1);
        long parseLong = group != null ? java.lang.Long.parseLong(group) * 3600000 : 0L;
        java.lang.String group2 = matcher.group(i4 + 2);
        group2.getClass();
        long parseLong2 = (java.lang.Long.parseLong(group2) * 60000) + parseLong;
        java.lang.String group3 = matcher.group(i4 + 3);
        group3.getClass();
        long parseLong3 = (java.lang.Long.parseLong(group3) * 1000) + parseLong2;
        java.lang.String group4 = matcher.group(i4 + 4);
        if (group4 != null) {
            parseLong3 += java.lang.Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    @Override // p083V0.InterfaceC0774l
    /* renamed from: h */
    public final void mo692h(byte[] bArr, int i4, int i5, p083V0.C0773k c0773k, p086W.InterfaceC0783c interfaceC0783c) {
        p086W.InterfaceC0783c interfaceC0783c2;
        java.lang.String m1547i;
        java.lang.String str;
        p086W.InterfaceC0783c interfaceC0783c3;
        p103a1.C1002a c1002a = this;
        p086W.InterfaceC0783c interfaceC0783c4 = interfaceC0783c;
        java.lang.String str2 = "SubripParser";
        p086W.C0798r c0798r = c1002a.f3721n;
        c0798r.m1535E(bArr, i4 + i5);
        c0798r.m1537G(i4);
        java.nio.charset.Charset m1533C = c0798r.m1533C();
        if (m1533C == null) {
            m1533C = p124e2.AbstractC1356d.f5630c;
        }
        long j4 = c0773k.f2713a;
        java.util.ArrayList arrayList = (j4 == -9223372036854775807L || !c0773k.f2714b) ? null : new java.util.ArrayList();
        while (true) {
            java.lang.String m1547i2 = c0798r.m1547i(m1533C);
            if (m1547i2 == null) {
                break;
            }
            if (m1547i2.length() != 0) {
                try {
                    java.lang.Integer.parseInt(m1547i2);
                    m1547i = c0798r.m1547i(m1533C);
                } catch (java.lang.NumberFormatException unused) {
                    interfaceC0783c2 = interfaceC0783c4;
                    p086W.AbstractC0781a.m1410A(str2, "Skipping invalid index: ".concat(m1547i2));
                }
                if (m1547i == null) {
                    p086W.AbstractC0781a.m1410A(str2, "Unexpected end");
                    break;
                }
                java.util.regex.Matcher matcher = f3717o.matcher(m1547i);
                if (matcher.matches()) {
                    long m2034c = m2034c(matcher, 1);
                    long m2034c2 = m2034c(matcher, 6);
                    java.lang.StringBuilder sb = c1002a.f3719l;
                    sb.setLength(0);
                    java.util.ArrayList arrayList2 = c1002a.f3720m;
                    arrayList2.clear();
                    java.lang.String m1547i3 = c0798r.m1547i(m1533C);
                    while (!android.text.TextUtils.isEmpty(m1547i3)) {
                        if (sb.length() > 0) {
                            sb.append("<br>");
                        }
                        java.lang.String trim = m1547i3.trim();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(trim);
                        java.util.regex.Matcher matcher2 = f3718p.matcher(trim);
                        int i6 = 0;
                        while (matcher2.find()) {
                            java.lang.String group = matcher2.group();
                            arrayList2.add(group);
                            java.util.regex.Matcher matcher3 = matcher2;
                            int start = matcher2.start() - i6;
                            int length = group.length();
                            sb2.replace(start, start + length, "");
                            i6 += length;
                            matcher2 = matcher3;
                            str2 = str2;
                        }
                        sb.append(sb2.toString());
                        m1547i3 = c0798r.m1547i(m1533C);
                        str2 = str2;
                    }
                    java.lang.String str3 = str2;
                    android.text.Spanned fromHtml = android.text.Html.fromHtml(sb.toString());
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList2.size()) {
                            str = null;
                            break;
                        }
                        str = (java.lang.String) arrayList2.get(i7);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    if (j4 == -9223372036854775807L || m2034c >= j4) {
                        p083V0.C0763a c0763a = new p083V0.C0763a(p129f2.AbstractC1393I.m3166o(m2033a(fromHtml, str)), m2034c, m2034c2 - m2034c);
                        interfaceC0783c3 = interfaceC0783c;
                        interfaceC0783c3.accept(c0763a);
                    } else {
                        if (arrayList != null) {
                            arrayList.add(new p083V0.C0763a(p129f2.AbstractC1393I.m3166o(m2033a(fromHtml, str)), m2034c, m2034c2 - m2034c));
                        }
                        interfaceC0783c3 = interfaceC0783c;
                    }
                    interfaceC0783c4 = interfaceC0783c3;
                    str2 = str3;
                    c1002a = this;
                } else {
                    interfaceC0783c2 = interfaceC0783c4;
                    p086W.AbstractC0781a.m1410A(str2, "Skipping invalid timing: ".concat(m1547i));
                    interfaceC0783c4 = interfaceC0783c2;
                    c1002a = this;
                }
            }
        }
        p086W.InterfaceC0783c interfaceC0783c5 = interfaceC0783c4;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                interfaceC0783c5.accept((p083V0.C0763a) it.next());
            }
        }
    }

    @Override // p083V0.InterfaceC0774l
    /* renamed from: w */
    public final int mo703w() {
        return 1;
    }
}
