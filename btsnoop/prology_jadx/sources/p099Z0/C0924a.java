package p099Z0;

/* renamed from: Z0.a */
/* loaded from: classes.dex */
public final class C0924a implements p083V0.InterfaceC0774l {

    /* renamed from: r */
    public static final java.util.regex.Pattern f3259r = java.util.regex.Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: l */
    public final boolean f3260l;

    /* renamed from: m */
    public final p076T.C0694h f3261m;

    /* renamed from: o */
    public java.util.LinkedHashMap f3263o;

    /* renamed from: p */
    public float f3264p = -3.4028235E38f;

    /* renamed from: q */
    public float f3265q = -3.4028235E38f;

    /* renamed from: n */
    public final p086W.C0798r f3262n = new p086W.C0798r();

    public C0924a(java.util.List list) {
        if (list == null || list.isEmpty()) {
            this.f3260l = false;
            this.f3261m = null;
            return;
        }
        this.f3260l = true;
        java.lang.String m1621p = p086W.AbstractC0805y.m1621p((byte[]) list.get(0));
        p086W.AbstractC0781a.m1416e(m1621p.startsWith("Format:"));
        p076T.C0694h m1270c = p076T.C0694h.m1270c(m1621p);
        m1270c.getClass();
        this.f3261m = m1270c;
        m1756c(new p086W.C0798r((byte[]) list.get(1)), p124e2.AbstractC1356d.f5630c);
    }

    /* renamed from: a */
    public static int m1754a(long j4, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        int i4;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((java.lang.Long) arrayList.get(size)).longValue() == j4) {
                return size;
            }
            if (((java.lang.Long) arrayList.get(size)).longValue() < j4) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, java.lang.Long.valueOf(j4));
        arrayList2.add(i4, i4 == 0 ? new java.util.ArrayList() : new java.util.ArrayList((java.util.Collection) arrayList2.get(i4 - 1)));
        return i4;
    }

    /* renamed from: d */
    public static long m1755d(java.lang.String str) {
        java.util.regex.Matcher matcher = f3259r.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        java.lang.String group = matcher.group(1);
        int i4 = p086W.AbstractC0805y.f2801a;
        return (java.lang.Long.parseLong(matcher.group(4)) * 10000) + (java.lang.Long.parseLong(matcher.group(3)) * 1000000) + (java.lang.Long.parseLong(matcher.group(2)) * 60000000) + (java.lang.Long.parseLong(group) * 3600000000L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x02aa, code lost:
    
        if (r4 != 3) goto L160;
     */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0035 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02e1  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1756c(p086W.C0798r r38, java.nio.charset.Charset r39) {
        /*
            Method dump skipped, instructions count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p099Z0.C0924a.m1756c(W.r, java.nio.charset.Charset):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:92:0x0226. Please report as an issue. */
    @Override // p083V0.InterfaceC0774l
    /* renamed from: h */
    public final void mo692h(byte[] bArr, int i4, int i5, p083V0.C0773k c0773k, p086W.InterfaceC0783c interfaceC0783c) {
        java.nio.charset.Charset charset;
        p076T.C0694h c0694h;
        p086W.C0798r c0798r;
        int i6;
        float f4;
        int i7;
        android.text.Layout.Alignment alignment;
        android.text.Layout.Alignment alignment2;
        int i8;
        android.graphics.PointF pointF;
        int i9;
        int i10;
        float f5;
        float f6;
        float f7;
        float f8;
        int i11;
        int i12;
        float f9;
        int i13;
        int i14;
        java.lang.Integer num;
        int i15;
        int i16;
        p099Z0.C0924a c0924a = this;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        p086W.C0798r c0798r2 = c0924a.f3262n;
        c0798r2.m1535E(bArr, i4 + i5);
        c0798r2.m1537G(i4);
        java.nio.charset.Charset m1533C = c0798r2.m1533C();
        if (m1533C == null) {
            m1533C = p124e2.AbstractC1356d.f5630c;
        }
        boolean z4 = c0924a.f3260l;
        if (!z4) {
            c0924a.m1756c(c0798r2, m1533C);
        }
        p076T.C0694h c0694h2 = z4 ? c0924a.f3261m : null;
        while (true) {
            java.lang.String m1547i = c0798r2.m1547i(m1533C);
            if (m1547i == null) {
                long j4 = c0773k.f2713a;
                java.util.ArrayList arrayList3 = (j4 == -9223372036854775807L || !c0773k.f2714b) ? null : new java.util.ArrayList();
                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                    java.util.List list = (java.util.List) arrayList.get(i17);
                    if (!list.isEmpty() || i17 == 0) {
                        if (i17 == arrayList.size() - 1) {
                            throw new java.lang.IllegalStateException();
                        }
                        long longValue = ((java.lang.Long) arrayList2.get(i17)).longValue();
                        long longValue2 = ((java.lang.Long) arrayList2.get(i17 + 1)).longValue() - ((java.lang.Long) arrayList2.get(i17)).longValue();
                        if (j4 == -9223372036854775807L || longValue >= j4) {
                            interfaceC0783c.accept(new p083V0.C0763a(list, longValue, longValue2));
                        } else if (arrayList3 != null) {
                            arrayList3.add(new p083V0.C0763a(list, longValue, longValue2));
                        }
                    }
                }
                if (arrayList3 != null) {
                    java.util.Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        interfaceC0783c.accept((p083V0.C0763a) it.next());
                    }
                    return;
                }
                return;
            }
            if (m1547i.startsWith("Format:")) {
                c0694h2 = p076T.C0694h.m1270c(m1547i);
            } else {
                if (m1547i.startsWith("Dialogue:")) {
                    if (c0694h2 == null) {
                        p086W.AbstractC0781a.m1410A("SsaParser", "Skipping dialogue line before complete format: ".concat(m1547i));
                    } else {
                        p086W.AbstractC0781a.m1416e(m1547i.startsWith("Dialogue:"));
                        java.lang.String substring = m1547i.substring(9);
                        int i18 = c0694h2.f2329e;
                        java.lang.String[] split = substring.split(",", i18);
                        if (split.length != i18) {
                            p086W.AbstractC0781a.m1410A("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(m1547i));
                        } else {
                            p086W.C0798r c0798r3 = c0798r2;
                            long m1755d = m1755d(split[c0694h2.f2325a]);
                            if (m1755d == -9223372036854775807L) {
                                p086W.AbstractC0781a.m1410A("SsaParser", "Skipping invalid timing: ".concat(m1547i));
                            } else {
                                long m1755d2 = m1755d(split[c0694h2.f2326b]);
                                if (m1755d2 == -9223372036854775807L) {
                                    p086W.AbstractC0781a.m1410A("SsaParser", "Skipping invalid timing: ".concat(m1547i));
                                } else {
                                    java.util.LinkedHashMap linkedHashMap = c0924a.f3263o;
                                    charset = m1533C;
                                    p099Z0.C0927d c0927d = (linkedHashMap == null || (i16 = c0694h2.f2327c) == -1) ? null : (p099Z0.C0927d) linkedHashMap.get(split[i16].trim());
                                    java.lang.String str = split[c0694h2.f2328d];
                                    java.util.regex.Matcher matcher = p099Z0.C0926c.f3277a.matcher(str);
                                    int i19 = -1;
                                    android.graphics.PointF pointF2 = null;
                                    while (matcher.find()) {
                                        p076T.C0694h c0694h3 = c0694h2;
                                        java.lang.String group = matcher.group(1);
                                        group.getClass();
                                        try {
                                            android.graphics.PointF m1757a = p099Z0.C0926c.m1757a(group);
                                            if (m1757a != null) {
                                                pointF2 = m1757a;
                                            }
                                        } catch (java.lang.RuntimeException unused) {
                                        }
                                        try {
                                            java.util.regex.Matcher matcher2 = p099Z0.C0926c.f3280d.matcher(group);
                                            if (matcher2.find()) {
                                                java.lang.String group2 = matcher2.group(1);
                                                group2.getClass();
                                                i15 = p099Z0.C0927d.m1758a(group2);
                                            } else {
                                                i15 = -1;
                                            }
                                            if (i15 != -1) {
                                                i19 = i15;
                                            }
                                        } catch (java.lang.RuntimeException unused2) {
                                        }
                                        c0694h2 = c0694h3;
                                    }
                                    c0694h = c0694h2;
                                    java.lang.String replace = p099Z0.C0926c.f3277a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f10 = c0924a.f3264p;
                                    float f11 = c0924a.f3265q;
                                    android.text.SpannableString spannableString = new android.text.SpannableString(replace);
                                    if (c0927d != null) {
                                        java.lang.Integer num2 = c0927d.f3283c;
                                        if (num2 != null) {
                                            c0798r = c0798r3;
                                            spannableString.setSpan(new android.text.style.ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            c0798r = c0798r3;
                                        }
                                        if (c0927d.f3290j == 3 && (num = c0927d.f3284d) != null) {
                                            spannableString.setSpan(new android.text.style.BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f12 = c0927d.f3285e;
                                        if (f12 == -3.4028235E38f || f11 == -3.4028235E38f) {
                                            f8 = -3.4028235E38f;
                                            i11 = Integer.MIN_VALUE;
                                        } else {
                                            f8 = f12 / f11;
                                            i11 = 1;
                                        }
                                        boolean z5 = c0927d.f3287g;
                                        boolean z6 = c0927d.f3286f;
                                        if (z6 && z5) {
                                            i12 = i11;
                                            f9 = f8;
                                            i13 = 0;
                                            i14 = 33;
                                            spannableString.setSpan(new android.text.style.StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i12 = i11;
                                            f9 = f8;
                                            i13 = 0;
                                            i14 = 33;
                                            if (z6) {
                                                spannableString.setSpan(new android.text.style.StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z5) {
                                                spannableString.setSpan(new android.text.style.StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (c0927d.f3288h) {
                                            spannableString.setSpan(new android.text.style.UnderlineSpan(), i13, spannableString.length(), i14);
                                        }
                                        if (c0927d.f3289i) {
                                            spannableString.setSpan(new android.text.style.StrikethroughSpan(), i13, spannableString.length(), i14);
                                        }
                                        i6 = i19;
                                        f4 = f9;
                                        i7 = i12;
                                    } else {
                                        c0798r = c0798r3;
                                        i6 = i19;
                                        f4 = -3.4028235E38f;
                                        i7 = Integer.MIN_VALUE;
                                    }
                                    int i20 = -1;
                                    if (i6 != -1) {
                                        i20 = i6;
                                    } else if (c0927d != null) {
                                        i20 = c0927d.f3282b;
                                    }
                                    switch (i20) {
                                        case 0:
                                        default:
                                            p009B2.AbstractC0051h.m156o(i20, "Unknown alignment: ", "SsaParser");
                                        case -1:
                                            alignment2 = null;
                                            break;
                                        case 1:
                                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                                            alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
                                            alignment2 = alignment;
                                            break;
                                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                                            alignment = android.text.Layout.Alignment.ALIGN_CENTER;
                                            alignment2 = alignment;
                                            break;
                                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                                        case 9:
                                            alignment = android.text.Layout.Alignment.ALIGN_OPPOSITE;
                                            alignment2 = alignment;
                                            break;
                                    }
                                    int i21 = Integer.MIN_VALUE;
                                    switch (i20) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            p009B2.AbstractC0051h.m156o(i20, "Unknown alignment: ", "SsaParser");
                                            break;
                                        case 1:
                                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                                            i8 = 0;
                                            break;
                                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                                            i8 = 1;
                                            break;
                                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                                        case 9:
                                            i8 = 2;
                                            break;
                                    }
                                    i8 = Integer.MIN_VALUE;
                                    switch (i20) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            p009B2.AbstractC0051h.m156o(i20, "Unknown alignment: ", "SsaParser");
                                            break;
                                        case 1:
                                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                                            pointF = pointF2;
                                            i21 = 2;
                                            break;
                                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                                            pointF = pointF2;
                                            i21 = 1;
                                            break;
                                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                                        case 9:
                                            pointF = pointF2;
                                            i21 = 0;
                                            break;
                                    }
                                    pointF = pointF2;
                                    if (pointF == null || f11 == -3.4028235E38f || f10 == -3.4028235E38f) {
                                        float f13 = 0.95f;
                                        if (i8 != 0) {
                                            i9 = 1;
                                            if (i8 != 1) {
                                                i10 = 2;
                                                f5 = i8 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i10 = 2;
                                                f5 = 0.5f;
                                            }
                                        } else {
                                            i9 = 1;
                                            i10 = 2;
                                            f5 = 0.05f;
                                        }
                                        if (i21 == 0) {
                                            f13 = 0.05f;
                                        } else if (i21 == i9) {
                                            f13 = 0.5f;
                                        } else if (i21 != i10) {
                                            f13 = -3.4028235E38f;
                                        }
                                        f6 = f13;
                                        f7 = f5;
                                    } else {
                                        float f14 = pointF.x / f10;
                                        f6 = pointF.y / f11;
                                        f7 = f14;
                                    }
                                    p082V.C0757b c0757b = new p082V.C0757b(spannableString, alignment2, null, null, f6, 0, i21, f7, i8, i7, f4, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                    int m1754a = m1754a(m1755d2, arrayList2, arrayList);
                                    for (int m1754a2 = m1754a(m1755d, arrayList2, arrayList); m1754a2 < m1754a; m1754a2++) {
                                        ((java.util.List) arrayList.get(m1754a2)).add(c0757b);
                                    }
                                    c0924a = this;
                                    m1533C = charset;
                                    c0694h2 = c0694h;
                                    c0798r2 = c0798r;
                                }
                            }
                            charset = m1533C;
                            c0694h = c0694h2;
                            c0798r = c0798r3;
                            c0924a = this;
                            m1533C = charset;
                            c0694h2 = c0694h;
                            c0798r2 = c0798r;
                        }
                    }
                }
                charset = m1533C;
                c0694h = c0694h2;
                c0798r = c0798r2;
                c0924a = this;
                m1533C = charset;
                c0694h2 = c0694h;
                c0798r2 = c0798r;
            }
        }
    }

    @Override // p083V0.InterfaceC0774l
    /* renamed from: w */
    public final int mo703w() {
        return 1;
    }
}
