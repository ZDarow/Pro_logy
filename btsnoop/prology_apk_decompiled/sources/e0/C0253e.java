package e0;

import T.I;
import W.y;
import android.net.Uri;
import android.support.v4.media.session.t;
import android.text.TextUtils;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: e0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0253e extends DefaultHandler implements u0.p {

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f5049m = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f5050n = Pattern.compile("CC([1-4])=.*");

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f5051o = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f5052p = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: l, reason: collision with root package name */
    public final XmlPullParserFactory f5053l;

    public C0253e() {
        try {
            this.f5053l = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e4) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e4);
        }
    }

    public static long a(ArrayList arrayList, long j4, long j5, int i4, long j6) {
        int i5;
        if (i4 >= 0) {
            i5 = i4 + 1;
        } else {
            int i6 = y.f2709a;
            i5 = (int) ((((j6 - j4) + j5) - 1) / j5);
        }
        for (int i7 = 0; i7 < i5; i7++) {
            arrayList.add(new q(j4, j5));
            j4 += j5;
        }
        return j4;
    }

    public static void b(XmlPullParser xmlPullParser) {
        if (W.a.t(xmlPullParser)) {
            int i4 = 1;
            while (i4 != 0) {
                xmlPullParser.next();
                if (W.a.t(xmlPullParser)) {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(org.xmlpull.v1.XmlPullParser r12) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.C0253e.c(org.xmlpull.v1.XmlPullParser):int");
    }

    public static long d(XmlPullParser xmlPullParser, long j4) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j4;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return Float.parseFloat(attributeValue) * 1000000.0f;
    }

    public static ArrayList e(XmlPullParser xmlPullParser, List list, boolean z4) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z4 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String str = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!W.a.s(xmlPullParser, "BaseURL"));
        if (str != null && W.a.q(str)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = str;
            }
            return f2.r.p(new C0250b(parseInt, parseInt2, str, attributeValue3));
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < list.size(); i4++) {
            C0250b c0250b = (C0250b) list.get(i4);
            String x3 = W.a.x(c0250b.f5025a, str);
            String str2 = attributeValue3 == null ? x3 : attributeValue3;
            if (z4) {
                parseInt = c0250b.f5027c;
                parseInt2 = c0250b.f5028d;
                str2 = c0250b.f5026b;
            }
            arrayList.add(new C0250b(parseInt, parseInt2, x3, str2));
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair f(org.xmlpull.v1.XmlPullParser r14) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.C0253e.f(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public static int g(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
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

    public static C0254f h(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!W.a.s(xmlPullParser, str));
        return new C0254f(attributeValue, attributeValue2, str2);
    }

    public static long i(XmlPullParser xmlPullParser, String str, long j4) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j4;
        }
        Matcher matcher = y.f2717i.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        long parseDouble6 = (long) ((parseDouble5 + (group6 != null ? Double.parseDouble(group6) : 0.0d)) * 1000.0d);
        return !isEmpty ? -parseDouble6 : parseDouble6;
    }

    public static float j(XmlPullParser xmlPullParser, float f4) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f4;
        }
        Matcher matcher = f5049m.matcher(attributeValue);
        if (!matcher.matches()) {
            return f4;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        return !TextUtils.isEmpty(matcher.group(2)) ? parseInt / Integer.parseInt(r2) : parseInt;
    }

    public static int k(XmlPullParser xmlPullParser, String str, int i4) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i4 : Integer.parseInt(attributeValue);
    }

    public static long l(XmlPullParser xmlPullParser, String str, long j4) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j4 : Long.parseLong(attributeValue);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static e0.C0251c m(org.xmlpull.v1.XmlPullParser r162, android.net.Uri r163) {
        /*
            Method dump skipped, instructions count: 5118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.C0253e.m(org.xmlpull.v1.XmlPullParser, android.net.Uri):e0.c");
    }

    public static j n(XmlPullParser xmlPullParser, String str, String str2) {
        long j4;
        long j5;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j4 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j5 = (Long.parseLong(split[1]) - j4) + 1;
                return new j(j4, j5, attributeValue);
            }
        } else {
            j4 = 0;
        }
        j5 = -1;
        return new j(j4, j5, attributeValue);
    }

    public static int o(String str) {
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
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                return 128;
            case 1:
                return 512;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                return 2048;
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                return 2;
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return 16;
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return 1;
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
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

    public static int q(ArrayList arrayList) {
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            if (U1.a.o("http://dashif.org/guidelines/trickmode", ((C0254f) arrayList.get(i5)).f5054a)) {
                i4 = 16384;
            }
        }
        return i4;
    }

    public static r r(XmlPullParser xmlPullParser, r rVar) {
        long j4;
        long j5;
        long l4 = l(xmlPullParser, "timescale", rVar != null ? rVar.f5097b : 1L);
        long l5 = l(xmlPullParser, "presentationTimeOffset", rVar != null ? rVar.f5098c : 0L);
        long j6 = rVar != null ? rVar.f5094d : 0L;
        long j7 = rVar != null ? rVar.f5095e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong = Long.parseLong(split[0]);
            j4 = (Long.parseLong(split[1]) - parseLong) + 1;
            j5 = parseLong;
        } else {
            j4 = j7;
            j5 = j6;
        }
        j jVar = rVar != null ? rVar.f5096a : null;
        do {
            xmlPullParser.next();
            if (W.a.u(xmlPullParser, "Initialization")) {
                jVar = n(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
        } while (!W.a.s(xmlPullParser, "SegmentBase"));
        return new r(jVar, l4, l5, j5, j4);
    }

    public static o s(XmlPullParser xmlPullParser, o oVar, long j4, long j5, long j6, long j7, long j8) {
        long l4 = l(xmlPullParser, "timescale", oVar != null ? oVar.f5097b : 1L);
        long l5 = l(xmlPullParser, "presentationTimeOffset", oVar != null ? oVar.f5098c : 0L);
        long l6 = l(xmlPullParser, "duration", oVar != null ? oVar.f5083e : -9223372036854775807L);
        long l7 = l(xmlPullParser, "startNumber", oVar != null ? oVar.f5082d : 1L);
        long j9 = j7 == -9223372036854775807L ? j6 : j7;
        long j10 = j9 == Long.MAX_VALUE ? -9223372036854775807L : j9;
        List list = null;
        j jVar = null;
        List list2 = null;
        do {
            xmlPullParser.next();
            if (W.a.u(xmlPullParser, "Initialization")) {
                jVar = n(xmlPullParser, "sourceURL", "range");
            } else if (W.a.u(xmlPullParser, "SegmentTimeline")) {
                list2 = u(xmlPullParser, l4, j5);
            } else if (W.a.u(xmlPullParser, "SegmentURL")) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(n(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!W.a.s(xmlPullParser, "SegmentList"));
        if (oVar != null) {
            if (jVar == null) {
                jVar = oVar.f5096a;
            }
            if (list2 == null) {
                list2 = oVar.f5084f;
            }
            if (list == null) {
                list = oVar.f5088j;
            }
        }
        return new o(jVar, l4, l5, l7, l6, list2, j10, list, y.M(j8), y.M(j4));
    }

    public static p t(XmlPullParser xmlPullParser, p pVar, List list, long j4, long j5, long j6, long j7, long j8) {
        long j9;
        long l4 = l(xmlPullParser, "timescale", pVar != null ? pVar.f5097b : 1L);
        long l5 = l(xmlPullParser, "presentationTimeOffset", pVar != null ? pVar.f5098c : 0L);
        long l6 = l(xmlPullParser, "duration", pVar != null ? pVar.f5083e : -9223372036854775807L);
        long l7 = l(xmlPullParser, "startNumber", pVar != null ? pVar.f5082d : 1L);
        int i4 = 0;
        while (true) {
            if (i4 >= list.size()) {
                j9 = -1;
                break;
            }
            C0254f c0254f = (C0254f) list.get(i4);
            if (U1.a.o("http://dashif.org/guidelines/last-segment-number", c0254f.f5054a)) {
                j9 = Long.parseLong(c0254f.f5055b);
                break;
            }
            i4++;
        }
        long j10 = j9;
        long j11 = j7 == -9223372036854775807L ? j6 : j7;
        long j12 = j11 == Long.MAX_VALUE ? -9223372036854775807L : j11;
        j jVar = null;
        t v4 = v(xmlPullParser, "media", pVar != null ? pVar.f5090k : null);
        t v5 = v(xmlPullParser, "initialization", pVar != null ? pVar.f5089j : null);
        List list2 = null;
        do {
            xmlPullParser.next();
            if (W.a.u(xmlPullParser, "Initialization")) {
                jVar = n(xmlPullParser, "sourceURL", "range");
            } else if (W.a.u(xmlPullParser, "SegmentTimeline")) {
                list2 = u(xmlPullParser, l4, j5);
            } else {
                b(xmlPullParser);
            }
        } while (!W.a.s(xmlPullParser, "SegmentTemplate"));
        if (pVar != null) {
            if (jVar == null) {
                jVar = pVar.f5096a;
            }
            if (list2 == null) {
                list2 = pVar.f5084f;
            }
        }
        return new p(jVar, l4, l5, l7, j10, l6, list2, j12, v5, v4, y.M(j8), y.M(j4));
    }

    public static ArrayList u(XmlPullParser xmlPullParser, long j4, long j5) {
        ArrayList arrayList = new ArrayList();
        long j6 = 0;
        long j7 = -9223372036854775807L;
        boolean z4 = false;
        int i4 = 0;
        do {
            xmlPullParser.next();
            if (W.a.u(xmlPullParser, "S")) {
                long l4 = l(xmlPullParser, "t", -9223372036854775807L);
                if (z4) {
                    j6 = a(arrayList, j6, j7, i4, l4);
                }
                if (l4 == -9223372036854775807L) {
                    l4 = j6;
                }
                long l5 = l(xmlPullParser, "d", -9223372036854775807L);
                i4 = k(xmlPullParser, "r", 0);
                z4 = true;
                j7 = l5;
                j6 = l4;
            } else {
                b(xmlPullParser);
            }
        } while (!W.a.s(xmlPullParser, "SegmentTimeline"));
        if (z4) {
            int i5 = y.f2709a;
            a(arrayList, j6, j7, i4, y.U(j5, j4, 1000L, RoundingMode.FLOOR));
        }
        return arrayList;
    }

    public static t v(XmlPullParser xmlPullParser, String str, t tVar) {
        String str2;
        boolean z4;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return tVar;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add("");
        int i4 = 0;
        while (i4 < attributeValue.length()) {
            int indexOf = attributeValue.indexOf("$", i4);
            if (indexOf == -1) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i4));
                i4 = attributeValue.length();
            } else if (indexOf != i4) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i4, indexOf));
                i4 = indexOf;
            } else if (attributeValue.startsWith("$$", i4)) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + "$");
                i4 += 2;
            } else {
                arrayList3.add("");
                int i5 = i4 + 1;
                int indexOf2 = attributeValue.indexOf("$", i5);
                String substring = attributeValue.substring(i5, indexOf2);
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
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            arrayList2.add(3);
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                    }
                    arrayList3.set(arrayList2.size() - 1, str2);
                }
                arrayList.add("");
                i4 = indexOf2 + 1;
            }
        }
        return new t(arrayList, arrayList2, arrayList3);
    }

    @Override // u0.p
    public final Object p(Uri uri, Y.j jVar) {
        try {
            XmlPullParser newPullParser = this.f5053l.newPullParser();
            newPullParser.setInput(jVar, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return m(newPullParser, uri);
            }
            throw I.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e4) {
            throw I.b(null, e4);
        }
    }
}
