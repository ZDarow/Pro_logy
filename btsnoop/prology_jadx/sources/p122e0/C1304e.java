package p122e0;

/* renamed from: e0.e */
/* loaded from: classes.dex */
public final class C1304e extends org.xml.sax.helpers.DefaultHandler implements p197u0.InterfaceC2229p {

    /* renamed from: m */
    public static final java.util.regex.Pattern f5237m = java.util.regex.Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: n */
    public static final java.util.regex.Pattern f5238n = java.util.regex.Pattern.compile("CC([1-4])=.*");

    /* renamed from: o */
    public static final java.util.regex.Pattern f5239o = java.util.regex.Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: p */
    public static final int[] f5240p = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: l */
    public final org.xmlpull.v1.XmlPullParserFactory f5241l;

    public C1304e() {
        try {
            this.f5241l = org.xmlpull.v1.XmlPullParserFactory.newInstance();
        } catch (org.xmlpull.v1.XmlPullParserException e4) {
            throw new java.lang.RuntimeException("Couldn't create XmlPullParserFactory instance", e4);
        }
    }

    /* renamed from: a */
    public static long m3044a(java.util.ArrayList arrayList, long j4, long j5, int i4, long j6) {
        int i5;
        if (i4 >= 0) {
            i5 = i4 + 1;
        } else {
            int i6 = p086W.AbstractC0805y.f2801a;
            i5 = (int) ((((j6 - j4) + j5) - 1) / j5);
        }
        for (int i7 = 0; i7 < i5; i7++) {
            arrayList.add(new p122e0.C1316q(j4, j5));
            j4 += j5;
        }
        return j4;
    }

    /* renamed from: b */
    public static void m3045b(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        if (p086W.AbstractC0781a.m1431t(xmlPullParser)) {
            int i4 = 1;
            while (i4 != 0) {
                xmlPullParser.next();
                if (p086W.AbstractC0781a.m1431t(xmlPullParser)) {
                    i4++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i4--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0083, code lost:
    
        if (r0 == 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b5, code lost:
    
        if (r8.equals("fa01") == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fe, code lost:
    
        if (r0 < 33) goto L80;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m3046c(org.xmlpull.v1.XmlPullParser r12) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p122e0.C1304e.m3046c(org.xmlpull.v1.XmlPullParser):int");
    }

    /* renamed from: d */
    public static long m3047d(org.xmlpull.v1.XmlPullParser xmlPullParser, long j4) {
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j4;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return java.lang.Float.parseFloat(attributeValue) * 1000000.0f;
    }

    /* renamed from: e */
    public static java.util.ArrayList m3048e(org.xmlpull.v1.XmlPullParser xmlPullParser, java.util.List list, boolean z4) {
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int parseInt = attributeValue != null ? java.lang.Integer.parseInt(attributeValue) : z4 ? 1 : Integer.MIN_VALUE;
        java.lang.String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? java.lang.Integer.parseInt(attributeValue2) : 1;
        java.lang.String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        java.lang.String str = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str = xmlPullParser.getText();
            } else {
                m3045b(xmlPullParser);
            }
        } while (!p086W.AbstractC0781a.m1430s(xmlPullParser, "BaseURL"));
        if (str != null && p086W.AbstractC0781a.m1428q(str)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = str;
            }
            return p129f2.AbstractC1444r.m3236p(new p122e0.C1301b(parseInt, parseInt2, str, attributeValue3));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i4 = 0; i4 < list.size(); i4++) {
            p122e0.C1301b c1301b = (p122e0.C1301b) list.get(i4);
            java.lang.String m1435x = p086W.AbstractC0781a.m1435x(c1301b.f5213a, str);
            java.lang.String str2 = attributeValue3 == null ? m1435x : attributeValue3;
            if (z4) {
                parseInt = c1301b.f5215c;
                parseInt2 = c1301b.f5216d;
                str2 = c1301b.f5214b;
            }
            arrayList.add(new p122e0.C1301b(parseInt, parseInt2, m1435x, str2));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016b  */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v4, types: [byte[]] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair m3049f(org.xmlpull.v1.XmlPullParser r14) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p122e0.C1304e.m3049f(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* renamed from: g */
    public static int m3050g(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (android.text.TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    /* renamed from: h */
    public static p122e0.C1305f m3051h(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        java.lang.String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        java.lang.String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        java.lang.String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!p086W.AbstractC0781a.m1430s(xmlPullParser, str));
        return new p122e0.C1305f(attributeValue, attributeValue2, str2);
    }

    /* renamed from: i */
    public static long m3052i(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, long j4) {
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j4;
        }
        java.util.regex.Matcher matcher = p086W.AbstractC0805y.f2809i.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (java.lang.Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = android.text.TextUtils.isEmpty(matcher.group(1));
        java.lang.String group = matcher.group(3);
        double parseDouble = group != null ? java.lang.Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        java.lang.String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? java.lang.Double.parseDouble(group2) * 2629739.0d : 0.0d);
        java.lang.String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? java.lang.Double.parseDouble(group3) * 86400.0d : 0.0d);
        java.lang.String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? java.lang.Double.parseDouble(group4) * 3600.0d : 0.0d);
        java.lang.String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? java.lang.Double.parseDouble(group5) * 60.0d : 0.0d);
        java.lang.String group6 = matcher.group(14);
        long parseDouble6 = (long) ((parseDouble5 + (group6 != null ? java.lang.Double.parseDouble(group6) : 0.0d)) * 1000.0d);
        return !isEmpty ? -parseDouble6 : parseDouble6;
    }

    /* renamed from: j */
    public static float m3053j(org.xmlpull.v1.XmlPullParser xmlPullParser, float f4) {
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f4;
        }
        java.util.regex.Matcher matcher = f5237m.matcher(attributeValue);
        if (!matcher.matches()) {
            return f4;
        }
        int parseInt = java.lang.Integer.parseInt(matcher.group(1));
        return !android.text.TextUtils.isEmpty(matcher.group(2)) ? parseInt / java.lang.Integer.parseInt(r2) : parseInt;
    }

    /* renamed from: k */
    public static int m3054k(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i4) {
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i4 : java.lang.Integer.parseInt(attributeValue);
    }

    /* renamed from: l */
    public static long m3055l(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, long j4) {
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j4 : java.lang.Long.parseLong(attributeValue);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x09a5, code lost:
    
        r0 = "audio/eac3-joc";
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x09ae, code lost:
    
        if ("audio/eac3-joc".equals(r0) != false) goto L296;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:645:0x10e6. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0fd5 A[LOOP:5: B:154:0x03e1->B:163:0x0fd5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0e30 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0c9b A[LOOP:11: B:308:0x068f->B:316:0x0c9b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x08eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0971  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x09be  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x09ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x13b3 A[LOOP:1: B:33:0x00cf->B:41:0x13b3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x137f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0c2b  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0c49  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0c68  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0c6c  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0c4c  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0c2e  */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v101, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r15v66 */
    /* JADX WARN: Type inference failed for: r15v67, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r15v68 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r6v106, types: [java.lang.Object, T.w] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p122e0.C1302c m3056m(org.xmlpull.v1.XmlPullParser r162, android.net.Uri r163) {
        /*
            Method dump skipped, instructions count: 5118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p122e0.C1304e.m3056m(org.xmlpull.v1.XmlPullParser, android.net.Uri):e0.c");
    }

    /* renamed from: n */
    public static p122e0.C1309j m3057n(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, java.lang.String str2) {
        long j4;
        long j5;
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, str);
        java.lang.String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            java.lang.String[] split = attributeValue2.split("-");
            j4 = java.lang.Long.parseLong(split[0]);
            if (split.length == 2) {
                j5 = (java.lang.Long.parseLong(split[1]) - j4) + 1;
                return new p122e0.C1309j(j4, j5, attributeValue);
            }
        } else {
            j4 = 0;
        }
        j5 = -1;
        return new p122e0.C1309j(j4, j5, attributeValue);
    }

    /* renamed from: o */
    public static int m3058o(java.lang.String str) {
        if (str == null) {
            return 0;
        }
        char c4 = 65535;
        switch (str.hashCode()) {
            case -2060497896:
                if (str.equals("subtitle")) {
                    c4 = 0;
                    break;
                }
                break;
            case -1724546052:
                if (str.equals("description")) {
                    c4 = 1;
                    break;
                }
                break;
            case -1580883024:
                if (str.equals("enhanced-audio-intelligibility")) {
                    c4 = 2;
                    break;
                }
                break;
            case -1574842690:
                if (str.equals("forced_subtitle")) {
                    c4 = 3;
                    break;
                }
                break;
            case -1408024454:
                if (str.equals("alternate")) {
                    c4 = 4;
                    break;
                }
                break;
            case -1396432756:
                if (str.equals("forced-subtitle")) {
                    c4 = 5;
                    break;
                }
                break;
            case 99825:
                if (str.equals("dub")) {
                    c4 = 6;
                    break;
                }
                break;
            case 3343801:
                if (str.equals("main")) {
                    c4 = 7;
                    break;
                }
                break;
            case 3530173:
                if (str.equals("sign")) {
                    c4 = '\b';
                    break;
                }
                break;
            case 552573414:
                if (str.equals("caption")) {
                    c4 = '\t';
                    break;
                }
                break;
            case 899152809:
                if (str.equals("commentary")) {
                    c4 = '\n';
                    break;
                }
                break;
            case 1629013393:
                if (str.equals("emergency")) {
                    c4 = 11;
                    break;
                }
                break;
            case 1855372047:
                if (str.equals("supplementary")) {
                    c4 = '\f';
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                return 128;
            case 1:
                return 512;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return 2048;
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                return 2;
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                return 16;
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                return 1;
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                return 256;
            case '\t':
                return 64;
            case '\n':
                return 8;
            case 11:
                return 32;
            case '\f':
                return 4;
            default:
                return 0;
        }
    }

    /* renamed from: q */
    public static int m3059q(java.util.ArrayList arrayList) {
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            if (p080U1.AbstractC0748a.m1380o("http://dashif.org/guidelines/trickmode", ((p122e0.C1305f) arrayList.get(i5)).f5242a)) {
                i4 = 16384;
            }
        }
        return i4;
    }

    /* renamed from: r */
    public static p122e0.C1317r m3060r(org.xmlpull.v1.XmlPullParser xmlPullParser, p122e0.C1317r c1317r) {
        long j4;
        long j5;
        long m3055l = m3055l(xmlPullParser, "timescale", c1317r != null ? c1317r.f5285b : 1L);
        long m3055l2 = m3055l(xmlPullParser, "presentationTimeOffset", c1317r != null ? c1317r.f5286c : 0L);
        long j6 = c1317r != null ? c1317r.f5282d : 0L;
        long j7 = c1317r != null ? c1317r.f5283e : 0L;
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            java.lang.String[] split = attributeValue.split("-");
            long parseLong = java.lang.Long.parseLong(split[0]);
            j4 = (java.lang.Long.parseLong(split[1]) - parseLong) + 1;
            j5 = parseLong;
        } else {
            j4 = j7;
            j5 = j6;
        }
        p122e0.C1309j c1309j = c1317r != null ? c1317r.f5284a : null;
        do {
            xmlPullParser.next();
            if (p086W.AbstractC0781a.m1432u(xmlPullParser, "Initialization")) {
                c1309j = m3057n(xmlPullParser, "sourceURL", "range");
            } else {
                m3045b(xmlPullParser);
            }
        } while (!p086W.AbstractC0781a.m1430s(xmlPullParser, "SegmentBase"));
        return new p122e0.C1317r(c1309j, m3055l, m3055l2, j5, j4);
    }

    /* renamed from: s */
    public static p122e0.C1314o m3061s(org.xmlpull.v1.XmlPullParser xmlPullParser, p122e0.C1314o c1314o, long j4, long j5, long j6, long j7, long j8) {
        long m3055l = m3055l(xmlPullParser, "timescale", c1314o != null ? c1314o.f5285b : 1L);
        long m3055l2 = m3055l(xmlPullParser, "presentationTimeOffset", c1314o != null ? c1314o.f5286c : 0L);
        long m3055l3 = m3055l(xmlPullParser, "duration", c1314o != null ? c1314o.f5271e : -9223372036854775807L);
        long m3055l4 = m3055l(xmlPullParser, "startNumber", c1314o != null ? c1314o.f5270d : 1L);
        long j9 = j7 == -9223372036854775807L ? j6 : j7;
        long j10 = j9 == Long.MAX_VALUE ? -9223372036854775807L : j9;
        java.util.List list = null;
        p122e0.C1309j c1309j = null;
        java.util.List list2 = null;
        do {
            xmlPullParser.next();
            if (p086W.AbstractC0781a.m1432u(xmlPullParser, "Initialization")) {
                c1309j = m3057n(xmlPullParser, "sourceURL", "range");
            } else if (p086W.AbstractC0781a.m1432u(xmlPullParser, "SegmentTimeline")) {
                list2 = m3063u(xmlPullParser, m3055l, j5);
            } else if (p086W.AbstractC0781a.m1432u(xmlPullParser, "SegmentURL")) {
                if (list == null) {
                    list = new java.util.ArrayList();
                }
                list.add(m3057n(xmlPullParser, "media", "mediaRange"));
            } else {
                m3045b(xmlPullParser);
            }
        } while (!p086W.AbstractC0781a.m1430s(xmlPullParser, "SegmentList"));
        if (c1314o != null) {
            if (c1309j == null) {
                c1309j = c1314o.f5284a;
            }
            if (list2 == null) {
                list2 = c1314o.f5272f;
            }
            if (list == null) {
                list = c1314o.f5276j;
            }
        }
        return new p122e0.C1314o(c1309j, m3055l, m3055l2, m3055l4, m3055l3, list2, j10, list, p086W.AbstractC0805y.m1592M(j8), p086W.AbstractC0805y.m1592M(j4));
    }

    /* renamed from: t */
    public static p122e0.C1315p m3062t(org.xmlpull.v1.XmlPullParser xmlPullParser, p122e0.C1315p c1315p, java.util.List list, long j4, long j5, long j6, long j7, long j8) {
        long j9;
        long m3055l = m3055l(xmlPullParser, "timescale", c1315p != null ? c1315p.f5285b : 1L);
        long m3055l2 = m3055l(xmlPullParser, "presentationTimeOffset", c1315p != null ? c1315p.f5286c : 0L);
        long m3055l3 = m3055l(xmlPullParser, "duration", c1315p != null ? c1315p.f5271e : -9223372036854775807L);
        long m3055l4 = m3055l(xmlPullParser, "startNumber", c1315p != null ? c1315p.f5270d : 1L);
        int i4 = 0;
        while (true) {
            if (i4 >= list.size()) {
                j9 = -1;
                break;
            }
            p122e0.C1305f c1305f = (p122e0.C1305f) list.get(i4);
            if (p080U1.AbstractC0748a.m1380o("http://dashif.org/guidelines/last-segment-number", c1305f.f5242a)) {
                j9 = java.lang.Long.parseLong(c1305f.f5243b);
                break;
            }
            i4++;
        }
        long j10 = j9;
        long j11 = j7 == -9223372036854775807L ? j6 : j7;
        long j12 = j11 == Long.MAX_VALUE ? -9223372036854775807L : j11;
        p122e0.C1309j c1309j = null;
        android.support.v4.media.session.C1061t m3064v = m3064v(xmlPullParser, "media", c1315p != null ? c1315p.f5278k : null);
        android.support.v4.media.session.C1061t m3064v2 = m3064v(xmlPullParser, "initialization", c1315p != null ? c1315p.f5277j : null);
        java.util.List list2 = null;
        do {
            xmlPullParser.next();
            if (p086W.AbstractC0781a.m1432u(xmlPullParser, "Initialization")) {
                c1309j = m3057n(xmlPullParser, "sourceURL", "range");
            } else if (p086W.AbstractC0781a.m1432u(xmlPullParser, "SegmentTimeline")) {
                list2 = m3063u(xmlPullParser, m3055l, j5);
            } else {
                m3045b(xmlPullParser);
            }
        } while (!p086W.AbstractC0781a.m1430s(xmlPullParser, "SegmentTemplate"));
        if (c1315p != null) {
            if (c1309j == null) {
                c1309j = c1315p.f5284a;
            }
            if (list2 == null) {
                list2 = c1315p.f5272f;
            }
        }
        return new p122e0.C1315p(c1309j, m3055l, m3055l2, m3055l4, j10, m3055l3, list2, j12, m3064v2, m3064v, p086W.AbstractC0805y.m1592M(j8), p086W.AbstractC0805y.m1592M(j4));
    }

    /* renamed from: u */
    public static java.util.ArrayList m3063u(org.xmlpull.v1.XmlPullParser xmlPullParser, long j4, long j5) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        long j6 = 0;
        long j7 = -9223372036854775807L;
        boolean z4 = false;
        int i4 = 0;
        do {
            xmlPullParser.next();
            if (p086W.AbstractC0781a.m1432u(xmlPullParser, "S")) {
                long m3055l = m3055l(xmlPullParser, "t", -9223372036854775807L);
                if (z4) {
                    j6 = m3044a(arrayList, j6, j7, i4, m3055l);
                }
                if (m3055l == -9223372036854775807L) {
                    m3055l = j6;
                }
                long m3055l2 = m3055l(xmlPullParser, "d", -9223372036854775807L);
                i4 = m3054k(xmlPullParser, "r", 0);
                z4 = true;
                j7 = m3055l2;
                j6 = m3055l;
            } else {
                m3045b(xmlPullParser);
            }
        } while (!p086W.AbstractC0781a.m1430s(xmlPullParser, "SegmentTimeline"));
        if (z4) {
            int i5 = p086W.AbstractC0805y.f2801a;
            m3044a(arrayList, j6, j7, i4, p086W.AbstractC0805y.m1600U(j5, j4, 1000L, java.math.RoundingMode.FLOOR));
        }
        return arrayList;
    }

    /* renamed from: v */
    public static android.support.v4.media.session.C1061t m3064v(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, android.support.v4.media.session.C1061t c1061t) {
        java.lang.String str2;
        boolean z4;
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return c1061t;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList.add("");
        int i4 = 0;
        while (i4 < attributeValue.length()) {
            int indexOf = attributeValue.indexOf("$", i4);
            if (indexOf == -1) {
                arrayList.set(arrayList2.size(), ((java.lang.String) arrayList.get(arrayList2.size())) + attributeValue.substring(i4));
                i4 = attributeValue.length();
            } else if (indexOf != i4) {
                arrayList.set(arrayList2.size(), ((java.lang.String) arrayList.get(arrayList2.size())) + attributeValue.substring(i4, indexOf));
                i4 = indexOf;
            } else if (attributeValue.startsWith("$$", i4)) {
                arrayList.set(arrayList2.size(), ((java.lang.String) arrayList.get(arrayList2.size())) + "$");
                i4 += 2;
            } else {
                arrayList3.add("");
                int i5 = i4 + 1;
                int indexOf2 = attributeValue.indexOf("$", i5);
                java.lang.String substring = attributeValue.substring(i5, indexOf2);
                if (substring.equals("RepresentationID")) {
                    arrayList2.add(1);
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d") && !str2.endsWith("x") && !str2.endsWith("X")) {
                            str2 = str2.concat("d");
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    substring.getClass();
                    switch (substring.hashCode()) {
                        case -1950496919:
                            if (substring.equals("Number")) {
                                z4 = false;
                                break;
                            }
                            break;
                        case 2606829:
                            if (substring.equals("Time")) {
                                z4 = true;
                                break;
                            }
                            break;
                        case 38199441:
                            if (substring.equals("Bandwidth")) {
                                z4 = 2;
                                break;
                            }
                            break;
                    }
                    z4 = -1;
                    switch (z4) {
                        case false:
                            arrayList2.add(2);
                            break;
                        case true:
                            arrayList2.add(4);
                            break;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            arrayList2.add(3);
                            break;
                        default:
                            throw new java.lang.IllegalArgumentException("Invalid template: ".concat(attributeValue));
                    }
                    arrayList3.set(arrayList2.size() - 1, str2);
                }
                arrayList.add("");
                i4 = indexOf2 + 1;
            }
        }
        return new android.support.v4.media.session.C1061t(arrayList, arrayList2, arrayList3);
    }

    @Override // p197u0.InterfaceC2229p
    /* renamed from: p */
    public final java.lang.Object mo601p(android.net.Uri uri, p094Y.C0872j c0872j) {
        try {
            org.xmlpull.v1.XmlPullParser newPullParser = this.f5241l.newPullParser();
            newPullParser.setInput(c0872j, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return m3056m(newPullParser, uri);
            }
            throw p076T.C0666I.m1203b("inputStream does not contain a valid media presentation description", null);
        } catch (org.xmlpull.v1.XmlPullParserException e4) {
            throw p076T.C0666I.m1203b(null, e4);
        }
    }
}
