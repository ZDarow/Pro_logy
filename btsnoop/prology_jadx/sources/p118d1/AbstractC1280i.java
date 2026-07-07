package p118d1;

/* renamed from: d1.i */
/* loaded from: classes.dex */
public abstract class AbstractC1280i {

    /* renamed from: a */
    public static final java.util.regex.Pattern f5156a = java.util.regex.Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b */
    public static final java.util.regex.Pattern f5157b = java.util.regex.Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c */
    public static final java.util.Map f5158c;

    /* renamed from: d */
    public static final java.util.Map f5159d;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("white", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 255, 255)));
        hashMap.put("lime", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 255, 0)));
        hashMap.put("cyan", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 255, 255)));
        hashMap.put("red", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 0, 0)));
        hashMap.put("yellow", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 255, 0)));
        hashMap.put("magenta", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 0, 255)));
        hashMap.put("blue", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 0, 255)));
        hashMap.put("black", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 0, 0)));
        f5158c = java.util.Collections.unmodifiableMap(hashMap);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("bg_white", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 0, 0)));
        f5159d = java.util.Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static void m3010a(java.lang.String str, p118d1.C1277f c1277f, java.util.List list, android.text.SpannableStringBuilder spannableStringBuilder, java.util.List list2) {
        char c4;
        int i4;
        int i5 = c1277f.f5140b;
        int length = spannableStringBuilder.length();
        java.lang.String str2 = c1277f.f5139a;
        str2.getClass();
        int i6 = -1;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case 98:
                if (str2.equals("b")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case 99:
                if (str2.equals("c")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case 105:
                if (str2.equals("i")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case 117:
                if (str2.equals("u")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case 118:
                if (str2.equals("v")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c4 = 7;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        switch (c4) {
            case 0:
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case 1:
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), i5, length, 33);
                break;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                for (java.lang.String str3 : c1277f.f5142d) {
                    java.util.Map map = f5158c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(((java.lang.Integer) map.get(str3)).intValue()), i5, length, 33);
                    } else {
                        java.util.Map map2 = f5159d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new android.text.style.BackgroundColorSpan(((java.lang.Integer) map2.get(str3)).intValue()), i5, length, 33);
                        }
                    }
                }
                break;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), i5, length, 33);
                break;
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i5, length, 33);
                break;
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                int m3012c = m3012c(list2, str, c1277f);
                java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                arrayList.addAll(list);
                java.util.Collections.sort(arrayList, p118d1.C1276e.f5136c);
                int i7 = c1277f.f5140b;
                int i8 = 0;
                int i9 = 0;
                while (i8 < arrayList.size()) {
                    if ("rt".equals(((p118d1.C1276e) arrayList.get(i8)).f5137a.f5139a)) {
                        p118d1.C1276e c1276e = (p118d1.C1276e) arrayList.get(i8);
                        int m3012c2 = m3012c(list2, str, c1276e.f5137a);
                        if (m3012c2 == i6) {
                            m3012c2 = m3012c != i6 ? m3012c : 1;
                        }
                        int i10 = c1276e.f5137a.f5140b - i9;
                        int i11 = c1276e.f5138b - i9;
                        java.lang.CharSequence subSequence = spannableStringBuilder.subSequence(i10, i11);
                        spannableStringBuilder.delete(i10, i11);
                        spannableStringBuilder.setSpan(new p082V.C0761f(subSequence.toString(), m3012c2), i7, i10, 33);
                        i9 = subSequence.length() + i9;
                        i7 = i10;
                    }
                    i8++;
                    i6 = -1;
                }
                break;
            default:
                return;
        }
        java.util.ArrayList m3011b = m3011b(list2, str, c1277f);
        for (int i12 = 0; i12 < m3011b.size(); i12++) {
            p118d1.C1274c c1274c = ((p118d1.C1278g) m3011b.get(i12)).f5144m;
            int i13 = c1274c.f5127k;
            if (i13 == -1 && c1274c.f5128l == -1) {
                i4 = -1;
            } else {
                i4 = (c1274c.f5128l == 1 ? (char) 2 : (char) 0) | (i13 == 1 ? (char) 1 : (char) 0);
            }
            if (i4 != -1) {
                int i14 = c1274c.f5127k;
                p176p1.AbstractC1949a.m3930d(spannableStringBuilder, new android.text.style.StyleSpan((i14 == -1 && c1274c.f5128l == -1) ? -1 : (i14 == 1 ? 1 : 0) | (c1274c.f5128l == 1 ? 2 : 0)), i5, length);
            }
            if (c1274c.f5126j == 1) {
                spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i5, length, 33);
            }
            if (c1274c.f5123g) {
                if (!c1274c.f5123g) {
                    throw new java.lang.IllegalStateException("Font color not defined");
                }
                p176p1.AbstractC1949a.m3930d(spannableStringBuilder, new android.text.style.ForegroundColorSpan(c1274c.f5122f), i5, length);
            }
            if (c1274c.f5125i) {
                if (!c1274c.f5125i) {
                    throw new java.lang.IllegalStateException("Background color not defined.");
                }
                p176p1.AbstractC1949a.m3930d(spannableStringBuilder, new android.text.style.BackgroundColorSpan(c1274c.f5124h), i5, length);
            }
            if (c1274c.f5121e != null) {
                p176p1.AbstractC1949a.m3930d(spannableStringBuilder, new android.text.style.TypefaceSpan(c1274c.f5121e), i5, length);
            }
            int i15 = c1274c.f5129m;
            if (i15 == 1) {
                p176p1.AbstractC1949a.m3930d(spannableStringBuilder, new android.text.style.AbsoluteSizeSpan((int) c1274c.f5130n, true), i5, length);
            } else if (i15 == 2) {
                p176p1.AbstractC1949a.m3930d(spannableStringBuilder, new android.text.style.RelativeSizeSpan(c1274c.f5130n), i5, length);
            } else if (i15 == 3) {
                p176p1.AbstractC1949a.m3930d(spannableStringBuilder, new android.text.style.RelativeSizeSpan(c1274c.f5130n / 100.0f), i5, length);
            }
            if (c1274c.f5132p) {
                spannableStringBuilder.setSpan(new java.lang.Object(), i5, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static java.util.ArrayList m3011b(java.util.List list, java.lang.String str, p118d1.C1277f c1277f) {
        int i4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i5 = 0; i5 < list.size(); i5++) {
            p118d1.C1274c c1274c = (p118d1.C1274c) list.get(i5);
            java.lang.String str2 = c1277f.f5139a;
            if (c1274c.f5117a.isEmpty() && c1274c.f5118b.isEmpty() && c1274c.f5119c.isEmpty() && c1274c.f5120d.isEmpty()) {
                i4 = android.text.TextUtils.isEmpty(str2);
            } else {
                int m3008a = p118d1.C1274c.m3008a(p118d1.C1274c.m3008a(p118d1.C1274c.m3008a(0, 1073741824, c1274c.f5117a, str), 2, c1274c.f5118b, str2), 4, c1274c.f5120d, c1277f.f5141c);
                if (m3008a != -1) {
                    if (c1277f.f5142d.containsAll(c1274c.f5119c)) {
                        i4 = m3008a + (c1274c.f5119c.size() * 4);
                    }
                }
                i4 = 0;
            }
            if (i4 > 0) {
                arrayList.add(new p118d1.C1278g(i4, c1274c));
            }
        }
        java.util.Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: c */
    public static int m3012c(java.util.List list, java.lang.String str, p118d1.C1277f c1277f) {
        java.util.ArrayList m3011b = m3011b(list, str, c1277f);
        for (int i4 = 0; i4 < m3011b.size(); i4++) {
            int i5 = ((p118d1.C1278g) m3011b.get(i4)).f5144m.f5131o;
            if (i5 != -1) {
                return i5;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static p118d1.C1275d m3013d(java.lang.String str, java.util.regex.Matcher matcher, p086W.C0798r c0798r, java.util.ArrayList arrayList) {
        p118d1.C1279h c1279h = new p118d1.C1279h();
        try {
            java.lang.String group = matcher.group(1);
            group.getClass();
            c1279h.f5145a = p118d1.AbstractC1281j.m3019c(group);
            java.lang.String group2 = matcher.group(2);
            group2.getClass();
            c1279h.f5146b = p118d1.AbstractC1281j.m3019c(group2);
            java.lang.String group3 = matcher.group(3);
            group3.getClass();
            m3014e(group3, c1279h);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            c0798r.getClass();
            java.lang.String m1547i = c0798r.m1547i(p124e2.AbstractC1356d.f5630c);
            while (!android.text.TextUtils.isEmpty(m1547i)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(m1547i.trim());
                m1547i = c0798r.m1547i(p124e2.AbstractC1356d.f5630c);
            }
            c1279h.f5147c = m3015f(str, sb.toString(), arrayList);
            return new p118d1.C1275d(c1279h.m3009a().m1396a(), c1279h.f5145a, c1279h.f5146b);
        } catch (java.lang.NumberFormatException unused) {
            p086W.AbstractC0781a.m1410A("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* renamed from: e */
    public static void m3014e(java.lang.String str, p118d1.C1279h c1279h) {
        char c4;
        int i4;
        char c5;
        int i5;
        int i6;
        java.util.regex.Matcher matcher = f5157b.matcher(str);
        while (matcher.find()) {
            java.lang.String group = matcher.group(1);
            group.getClass();
            java.lang.String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    m3016g(group2, c1279h);
                } else if ("align".equals(group)) {
                    switch (group2.hashCode()) {
                        case -1364013995:
                            if (group2.equals("center")) {
                                c4 = 0;
                                break;
                            }
                            break;
                        case -1074341483:
                            if (group2.equals("middle")) {
                                c4 = 1;
                                break;
                            }
                            break;
                        case 100571:
                            if (group2.equals("end")) {
                                c4 = 2;
                                break;
                            }
                            break;
                        case 3317767:
                            if (group2.equals("left")) {
                                c4 = 3;
                                break;
                            }
                            break;
                        case 108511772:
                            if (group2.equals("right")) {
                                c4 = 4;
                                break;
                            }
                            break;
                        case 109757538:
                            if (group2.equals("start")) {
                                c4 = 5;
                                break;
                            }
                            break;
                    }
                    c4 = 65535;
                    switch (c4) {
                        case 0:
                        case 1:
                            break;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            i4 = 3;
                            break;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            i4 = 4;
                            break;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            i4 = 5;
                            break;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            i4 = 1;
                            break;
                        default:
                            p086W.AbstractC0781a.m1410A("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                            break;
                    }
                    i4 = 2;
                    c1279h.f5148d = i4;
                } else if ("position".equals(group)) {
                    int indexOf = group2.indexOf(44);
                    if (indexOf != -1) {
                        java.lang.String substring = group2.substring(indexOf + 1);
                        substring.getClass();
                        switch (substring.hashCode()) {
                            case -1842484672:
                                if (substring.equals("line-left")) {
                                    c5 = 0;
                                    break;
                                }
                                break;
                            case -1364013995:
                                if (substring.equals("center")) {
                                    c5 = 1;
                                    break;
                                }
                                break;
                            case -1276788989:
                                if (substring.equals("line-right")) {
                                    c5 = 2;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring.equals("middle")) {
                                    c5 = 3;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring.equals("end")) {
                                    c5 = 4;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring.equals("start")) {
                                    c5 = 5;
                                    break;
                                }
                                break;
                        }
                        c5 = 65535;
                        switch (c5) {
                            case 0:
                            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                                i5 = 0;
                                break;
                            case 1:
                            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                                i5 = 1;
                                break;
                            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                                i5 = 2;
                                break;
                            default:
                                p086W.AbstractC0781a.m1410A("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                                i5 = Integer.MIN_VALUE;
                                break;
                        }
                        c1279h.f5153i = i5;
                        group2 = group2.substring(0, indexOf);
                    }
                    c1279h.f5152h = p118d1.AbstractC1281j.m3018b(group2);
                } else if ("size".equals(group)) {
                    c1279h.f5154j = p118d1.AbstractC1281j.m3018b(group2);
                } else if ("vertical".equals(group)) {
                    if (group2.equals("lr")) {
                        i6 = 2;
                    } else if (group2.equals("rl")) {
                        i6 = 1;
                    } else {
                        p086W.AbstractC0781a.m1410A("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                        i6 = Integer.MIN_VALUE;
                    }
                    c1279h.f5155k = i6;
                } else {
                    p086W.AbstractC0781a.m1410A("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                }
            } catch (java.lang.NumberFormatException unused) {
                p086W.AbstractC0781a.m1410A("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x00fb. Please report as an issue. */
    /* renamed from: f */
    public static android.text.SpannedString m3015f(java.lang.String str, java.lang.String str2, java.util.List list) {
        int i4;
        int i5;
        char c4;
        int i6;
        char c5;
        int i7 = -1;
        int i8 = 2;
        int i9 = 1;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i10 = 0;
        while (true) {
            java.lang.String str3 = "";
            if (i10 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    m3010a(str, (p118d1.C1277f) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                m3010a(str, new p118d1.C1277f("", 0, "", java.util.Collections.emptySet()), java.util.Collections.emptyList(), spannableStringBuilder, list);
                return android.text.SpannedString.valueOf(spannableStringBuilder);
            }
            char charAt = str2.charAt(i10);
            if (charAt != '&') {
                if (charAt != '<') {
                    spannableStringBuilder.append(charAt);
                    i10 += i9;
                } else {
                    int i11 = i10 + 1;
                    if (i11 >= str2.length()) {
                        i10 = i11;
                    } else {
                        int i12 = str2.charAt(i11) == '/' ? i9 : 0;
                        int indexOf = str2.indexOf(62, i11);
                        int length = indexOf == i7 ? str2.length() : indexOf + i9;
                        int i13 = length - 2;
                        int i14 = str2.charAt(i13) == '/' ? i9 : 0;
                        int i15 = i10 + (i12 != 0 ? i8 : i9);
                        if (i14 == 0) {
                            i13 = length - 1;
                        }
                        java.lang.String substring = str2.substring(i15, i13);
                        if (!substring.trim().isEmpty()) {
                            java.lang.String trim = substring.trim();
                            p086W.AbstractC0781a.m1416e(trim.isEmpty() ^ i9);
                            int i16 = p086W.AbstractC0805y.f2801a;
                            java.lang.String str4 = trim.split("[ \\.]", i8)[0];
                            str4.getClass();
                            switch (str4.hashCode()) {
                                case 98:
                                    if (str4.equals("b")) {
                                        i6 = 0;
                                        break;
                                    }
                                    break;
                                case 99:
                                    if (str4.equals("c")) {
                                        i6 = i9;
                                        break;
                                    }
                                    break;
                                case 105:
                                    if (str4.equals("i")) {
                                        i6 = i8;
                                        break;
                                    }
                                    break;
                                case 117:
                                    if (str4.equals("u")) {
                                        i6 = 3;
                                        break;
                                    }
                                    break;
                                case 118:
                                    if (str4.equals("v")) {
                                        i6 = 4;
                                        break;
                                    }
                                    break;
                                case 3650:
                                    if (str4.equals("rt")) {
                                        i6 = 5;
                                        break;
                                    }
                                    break;
                                case 3314158:
                                    if (str4.equals("lang")) {
                                        i6 = 6;
                                        break;
                                    }
                                    break;
                                case 3511770:
                                    if (str4.equals("ruby")) {
                                        i6 = 7;
                                        break;
                                    }
                                    break;
                            }
                            i6 = -1;
                            switch (i6) {
                                case 0:
                                case 1:
                                case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                                case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                                case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                                case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                                case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                                case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                                    if (i12 == 0) {
                                        if (i14 == 0) {
                                            int length2 = spannableStringBuilder.length();
                                            java.lang.String trim2 = substring.trim();
                                            p086W.AbstractC0781a.m1416e(trim2.isEmpty() ^ i9);
                                            int indexOf2 = trim2.indexOf(" ");
                                            if (indexOf2 == -1) {
                                                c5 = 0;
                                            } else {
                                                str3 = trim2.substring(indexOf2).trim();
                                                c5 = 0;
                                                trim2 = trim2.substring(0, indexOf2);
                                            }
                                            java.lang.String[] split = trim2.split("\\.", -1);
                                            java.lang.String str5 = split[c5];
                                            java.util.HashSet hashSet = new java.util.HashSet();
                                            for (int i17 = i9; i17 < split.length; i17 += i9) {
                                                hashSet.add(split[i17]);
                                            }
                                            arrayDeque.push(new p118d1.C1277f(str5, length2, str3, hashSet));
                                        }
                                        i10 = length;
                                        i5 = i9;
                                        i4 = -1;
                                        break;
                                    }
                                    while (!arrayDeque.isEmpty()) {
                                        p118d1.C1277f c1277f = (p118d1.C1277f) arrayDeque.pop();
                                        m3010a(str, c1277f, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new p118d1.C1276e(c1277f, spannableStringBuilder.length()));
                                        }
                                        if (c1277f.f5139a.equals(str4)) {
                                            i10 = length;
                                            i5 = i9;
                                            i4 = -1;
                                        }
                                    }
                                    i10 = length;
                                    i5 = i9;
                                    i4 = -1;
                            }
                        }
                        i10 = length;
                        i7 = -1;
                    }
                }
                i5 = i9;
                i4 = i7;
            } else {
                i10 += i9;
                int indexOf3 = str2.indexOf(59, i10);
                int indexOf4 = str2.indexOf(32, i10);
                i4 = -1;
                if (indexOf3 == -1) {
                    indexOf3 = indexOf4;
                } else if (indexOf4 != -1) {
                    indexOf3 = java.lang.Math.min(indexOf3, indexOf4);
                }
                if (indexOf3 != -1) {
                    java.lang.String substring2 = str2.substring(i10, indexOf3);
                    substring2.getClass();
                    switch (substring2.hashCode()) {
                        case 3309:
                            if (substring2.equals("gt")) {
                                c4 = 0;
                                break;
                            }
                            break;
                        case 3464:
                            if (substring2.equals("lt")) {
                                c4 = 1;
                                break;
                            }
                            break;
                        case 96708:
                            if (substring2.equals("amp")) {
                                c4 = 2;
                                break;
                            }
                            break;
                        case 3374865:
                            if (substring2.equals("nbsp")) {
                                c4 = 3;
                                break;
                            }
                            break;
                    }
                    c4 = 65535;
                    switch (c4) {
                        case 0:
                            spannableStringBuilder.append('>');
                            break;
                        case 1:
                            spannableStringBuilder.append('<');
                            break;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            spannableStringBuilder.append('&');
                            break;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            p086W.AbstractC0781a.m1410A("WebvttCueParser", "ignoring unsupported entity: '&" + substring2 + ";'");
                            break;
                    }
                    if (indexOf3 == indexOf4) {
                        spannableStringBuilder.append((java.lang.CharSequence) " ");
                    }
                    i5 = 1;
                    i10 = indexOf3 + 1;
                } else {
                    i5 = 1;
                    spannableStringBuilder.append(charAt);
                }
            }
            i7 = i4;
            i8 = 2;
            i9 = i5;
        }
    }

    /* renamed from: g */
    public static void m3016g(java.lang.String str, p118d1.C1279h c1279h) {
        int i4 = 2;
        int indexOf = str.indexOf(44);
        char c4 = 65535;
        if (indexOf != -1) {
            java.lang.String substring = str.substring(indexOf + 1);
            substring.getClass();
            switch (substring.hashCode()) {
                case -1364013995:
                    if (substring.equals("center")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals("end")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c4 = 3;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                case 1:
                    i4 = 1;
                    break;
                case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                    break;
                case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                    i4 = 0;
                    break;
                default:
                    p086W.AbstractC0781a.m1410A("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i4 = Integer.MIN_VALUE;
                    break;
            }
            c1279h.f5151g = i4;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            c1279h.f5149e = p118d1.AbstractC1281j.m3018b(str);
            c1279h.f5150f = 0;
        } else {
            c1279h.f5149e = java.lang.Integer.parseInt(str);
            c1279h.f5150f = 1;
        }
    }
}
