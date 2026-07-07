package b1;

import C.C0023j;
import L.k;
import V0.l;
import W.y;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: b1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0182e implements l {

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f4419m = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f4420n = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f4421o = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f4422p = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f4423q = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f4424r = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern s = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: t, reason: collision with root package name */
    public static final C0181d f4425t = new C0181d(30.0f, 1, 1);

    /* renamed from: l, reason: collision with root package name */
    public final XmlPullParserFactory f4426l;

    public C0182e() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f4426l = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e4) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e4);
        }
    }

    public static C0184g a(C0184g c0184g) {
        return c0184g == null ? new C0184g() : c0184g;
    }

    public static boolean c(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static int d(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = s.matcher(attributeValue);
        if (!matcher.matches()) {
            W.a.A("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z4 = true;
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt == 0 || parseInt2 == 0) {
                z4 = false;
            }
            W.a.d("Invalid cell resolution " + parseInt + " " + parseInt2, z4);
            return parseInt2;
        } catch (NumberFormatException unused) {
            W.a.A("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void e(String str, C0184g c0184g) {
        Matcher matcher;
        char c4 = 65535;
        int i4 = y.f2709a;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = f4421o;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (split.length != 2) {
                throw new Exception("Invalid number of entries for fontSize: " + split.length + ".");
            }
            matcher = pattern.matcher(split[1]);
            W.a.A("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new Exception("Invalid expression for fontSize: '" + str + "'.");
        }
        String group = matcher.group(3);
        group.getClass();
        switch (group.hashCode()) {
            case 37:
                if (group.equals("%")) {
                    c4 = 0;
                    break;
                }
                break;
            case 3240:
                if (group.equals("em")) {
                    c4 = 1;
                    break;
                }
                break;
            case 3592:
                if (group.equals("px")) {
                    c4 = 2;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                c0184g.f4446j = 3;
                break;
            case 1:
                c0184g.f4446j = 2;
                break;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                c0184g.f4446j = 1;
                break;
            default:
                throw new Exception("Invalid unit for fontSize: '" + group + "'.");
        }
        String group2 = matcher.group(1);
        group2.getClass();
        c0184g.f4447k = Float.parseFloat(group2);
    }

    public static C0181d f(XmlPullParser xmlPullParser) {
        float f4;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i4 = y.f2709a;
            W.a.d("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
            f4 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f4 = 1.0f;
        }
        C0181d c0181d = f4425t;
        int i5 = c0181d.f4417b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i5 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        return new C0181d(parseInt * f4, i5, attributeValue4 != null ? Integer.parseInt(attributeValue4) : c0181d.f4418c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x021f, code lost:
    
        if (W.a.u(r20, "metadata") != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0221, code lost:
    
        r20.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x022a, code lost:
    
        if (W.a.u(r20, "image") == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x022c, code lost:
    
        r7 = W.a.p(r20, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0230, code lost:
    
        if (r7 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0232, code lost:
    
        r25.put(r7, r20.nextText());
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0242, code lost:
    
        if (W.a.s(r20, "metadata") == false) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x024d A[LOOP:0: B:2:0x000a->B:21:0x024d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x024c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, C.C0023j r23, java.util.HashMap r24, java.util.HashMap r25) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.C0182e.g(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, C.j, java.util.HashMap, java.util.HashMap):void");
    }

    public static C0180c i(XmlPullParser xmlPullParser, C0180c c0180c, HashMap hashMap, C0181d c0181d) {
        long j4;
        long j5;
        char c4;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        C0184g j6 = j(xmlPullParser, null);
        String[] strArr = null;
        String str = null;
        String str2 = "";
        long j7 = -9223372036854775807L;
        long j8 = -9223372036854775807L;
        long j9 = -9223372036854775807L;
        for (int i4 = 0; i4 < attributeCount; i4++) {
            String attributeName = xmlPullParser.getAttributeName(i4);
            String attributeValue = xmlPullParser.getAttributeValue(i4);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c4 = 3;
                        break;
                    }
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c4 = 4;
                        break;
                    }
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c4 = 5;
                        break;
                    }
                    break;
            }
            c4 = 65535;
            switch (c4) {
                case 0:
                    if (!hashMap.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j9 = k(attributeValue, c0181d);
                    break;
                case k.FLOAT_FIELD_NUMBER /* 2 */:
                    j8 = k(attributeValue, c0181d);
                    break;
                case k.INTEGER_FIELD_NUMBER /* 3 */:
                    j7 = k(attributeValue, c0181d);
                    break;
                case k.LONG_FIELD_NUMBER /* 4 */:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        int i5 = y.f2709a;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length > 0) {
                        strArr = split;
                        break;
                    }
                    break;
                case k.STRING_FIELD_NUMBER /* 5 */:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (c0180c != null) {
            long j10 = c0180c.f4406d;
            j4 = -9223372036854775807L;
            if (j10 != -9223372036854775807L) {
                if (j7 != -9223372036854775807L) {
                    j7 += j10;
                }
                if (j8 != -9223372036854775807L) {
                    j8 += j10;
                }
            }
        } else {
            j4 = -9223372036854775807L;
        }
        if (j8 == j4) {
            if (j9 != j4) {
                j5 = j7 + j9;
            } else if (c0180c != null) {
                long j11 = c0180c.f4407e;
                if (j11 != j4) {
                    j5 = j11;
                }
            }
            return new C0180c(xmlPullParser.getName(), null, j7, j5, j6, strArr, str2, str, c0180c);
        }
        j5 = j8;
        return new C0180c(xmlPullParser.getName(), null, j7, j5, j6, strArr, str2, str, c0180c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0140, code lost:
    
        r0.f4452p = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x04f6, code lost:
    
        r0.f4451o = r16;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x00eb. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024b  */
    /* JADX WARN: Type inference failed for: r11v84, types: [b1.b] */
    /* JADX WARN: Type inference failed for: r12v46, types: [b1.b] */
    /* JADX WARN: Type inference failed for: r12v55, types: [b1.b] */
    /* JADX WARN: Type inference failed for: r1v50, types: [b1.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static b1.C0184g j(org.xmlpull.v1.XmlPullParser r19, b1.C0184g r20) {
        /*
            Method dump skipped, instructions count: 1554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.C0182e.j(org.xmlpull.v1.XmlPullParser, b1.g):b1.g");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long k(java.lang.String r13, b1.C0181d r14) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.C0182e.k(java.lang.String, b1.d):long");
    }

    public static C0023j l(XmlPullParser xmlPullParser) {
        String p2 = W.a.p(xmlPullParser, "extent");
        if (p2 == null) {
            return null;
        }
        Matcher matcher = f4424r.matcher(p2);
        if (!matcher.matches()) {
            W.a.A("TtmlParser", "Ignoring non-pixel tts extent: ".concat(p2));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new C0023j(parseInt, Integer.parseInt(group2), 4);
        } catch (NumberFormatException unused) {
            W.a.A("TtmlParser", "Ignoring malformed tts extent: ".concat(p2));
            return null;
        }
    }

    @Override // V0.l
    public final V0.d F(byte[] bArr, int i4, int i5) {
        C0181d c0181d;
        try {
            XmlPullParser newPullParser = this.f4426l.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new C0183f("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            C0023j c0023j = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i4, i5), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C0181d c0181d2 = f4425t;
            int i6 = 15;
            H2.a aVar = null;
            int i7 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                C0180c c0180c = (C0180c) arrayDeque.peek();
                if (i7 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            c0181d2 = f(newPullParser);
                            i6 = d(newPullParser);
                            c0023j = l(newPullParser);
                        }
                        C0023j c0023j2 = c0023j;
                        C0181d c0181d3 = c0181d2;
                        int i8 = i6;
                        if (c(name)) {
                            if ("head".equals(name)) {
                                c0181d = c0181d3;
                                g(newPullParser, hashMap, i8, c0023j2, hashMap2, hashMap3);
                            } else {
                                c0181d = c0181d3;
                                try {
                                    C0180c i9 = i(newPullParser, c0180c, hashMap2, c0181d);
                                    arrayDeque.push(i9);
                                    if (c0180c != null) {
                                        if (c0180c.f4415m == null) {
                                            c0180c.f4415m = new ArrayList();
                                        }
                                        c0180c.f4415m.add(i9);
                                    }
                                } catch (V0.f e4) {
                                    W.a.B("TtmlParser", "Suppressing parser error", e4);
                                    i7++;
                                }
                            }
                            c0181d2 = c0181d;
                        } else {
                            W.a.r("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                            i7++;
                            c0181d2 = c0181d3;
                        }
                        c0023j = c0023j2;
                        i6 = i8;
                    } else if (eventType == 4) {
                        c0180c.getClass();
                        C0180c a4 = C0180c.a(newPullParser.getText());
                        if (c0180c.f4415m == null) {
                            c0180c.f4415m = new ArrayList();
                        }
                        c0180c.f4415m.add(a4);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            C0180c c0180c2 = (C0180c) arrayDeque.peek();
                            c0180c2.getClass();
                            aVar = new H2.a(c0180c2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i7++;
                } else if (eventType == 3) {
                    i7--;
                }
                newPullParser.next();
            }
            aVar.getClass();
            return aVar;
        } catch (IOException e5) {
            throw new IllegalStateException("Unexpected error when reading input.", e5);
        } catch (XmlPullParserException e6) {
            throw new IllegalStateException("Unable to decode source", e6);
        }
    }

    @Override // V0.l
    public final void h(byte[] bArr, int i4, int i5, V0.k kVar, W.c cVar) {
        U1.a.G(F(bArr, i4, i5), kVar, cVar);
    }

    @Override // V0.l
    public final int w() {
        return 1;
    }
}
