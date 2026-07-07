package p108b1;

/* renamed from: b1.e */
/* loaded from: classes.dex */
public final class C1182e implements p083V0.InterfaceC0774l {

    /* renamed from: m */
    public static final java.util.regex.Pattern f4578m = java.util.regex.Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: n */
    public static final java.util.regex.Pattern f4579n = java.util.regex.Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: o */
    public static final java.util.regex.Pattern f4580o = java.util.regex.Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: p */
    public static final java.util.regex.Pattern f4581p = java.util.regex.Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: q */
    public static final java.util.regex.Pattern f4582q = java.util.regex.Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: r */
    public static final java.util.regex.Pattern f4583r = java.util.regex.Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: s */
    public static final java.util.regex.Pattern f4584s = java.util.regex.Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: t */
    public static final p108b1.C1181d f4585t = new p108b1.C1181d(30.0f, 1, 1);

    /* renamed from: l */
    public final org.xmlpull.v1.XmlPullParserFactory f4586l;

    public C1182e() {
        try {
            org.xmlpull.v1.XmlPullParserFactory newInstance = org.xmlpull.v1.XmlPullParserFactory.newInstance();
            this.f4586l = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (org.xmlpull.v1.XmlPullParserException e4) {
            throw new java.lang.RuntimeException("Couldn't create XmlPullParserFactory instance", e4);
        }
    }

    /* renamed from: a */
    public static p108b1.C1184g m2824a(p108b1.C1184g c1184g) {
        return c1184g == null ? new p108b1.C1184g() : c1184g;
    }

    /* renamed from: c */
    public static boolean m2825c(java.lang.String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    /* renamed from: d */
    public static int m2826d(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        java.lang.String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        java.util.regex.Matcher matcher = f4584s.matcher(attributeValue);
        if (!matcher.matches()) {
            p086W.AbstractC0781a.m1410A("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z4 = true;
        try {
            java.lang.String group = matcher.group(1);
            group.getClass();
            int parseInt = java.lang.Integer.parseInt(group);
            java.lang.String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = java.lang.Integer.parseInt(group2);
            if (parseInt == 0 || parseInt2 == 0) {
                z4 = false;
            }
            p086W.AbstractC0781a.m1415d("Invalid cell resolution " + parseInt + " " + parseInt2, z4);
            return parseInt2;
        } catch (java.lang.NumberFormatException unused) {
            p086W.AbstractC0781a.m1410A("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    /* renamed from: e */
    public static void m2827e(java.lang.String str, p108b1.C1184g c1184g) {
        java.util.regex.Matcher matcher;
        char c4 = 65535;
        int i4 = p086W.AbstractC0805y.f2801a;
        java.lang.String[] split = str.split("\\s+", -1);
        int length = split.length;
        java.util.regex.Pattern pattern = f4580o;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (split.length != 2) {
                throw new java.lang.Exception("Invalid number of entries for fontSize: " + split.length + ".");
            }
            matcher = pattern.matcher(split[1]);
            p086W.AbstractC0781a.m1410A("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new java.lang.Exception("Invalid expression for fontSize: '" + str + "'.");
        }
        java.lang.String group = matcher.group(3);
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
                c1184g.f4606j = 3;
                break;
            case 1:
                c1184g.f4606j = 2;
                break;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                c1184g.f4606j = 1;
                break;
            default:
                throw new java.lang.Exception("Invalid unit for fontSize: '" + group + "'.");
        }
        java.lang.String group2 = matcher.group(1);
        group2.getClass();
        c1184g.f4607k = java.lang.Float.parseFloat(group2);
    }

    /* renamed from: f */
    public static p108b1.C1181d m2828f(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        float f4;
        java.lang.String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? java.lang.Integer.parseInt(attributeValue) : 30;
        java.lang.String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i4 = p086W.AbstractC0805y.f2801a;
            p086W.AbstractC0781a.m1415d("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
            f4 = java.lang.Integer.parseInt(r2[0]) / java.lang.Integer.parseInt(r2[1]);
        } else {
            f4 = 1.0f;
        }
        p108b1.C1181d c1181d = f4585t;
        int i5 = c1181d.f4576b;
        java.lang.String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i5 = java.lang.Integer.parseInt(attributeValue3);
        }
        java.lang.String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        return new p108b1.C1181d(parseInt * f4, i5, attributeValue4 != null ? java.lang.Integer.parseInt(attributeValue4) : c1181d.f4577c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x021f, code lost:
    
        if (p086W.AbstractC0781a.m1432u(r20, "metadata") != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0221, code lost:
    
        r20.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x022a, code lost:
    
        if (p086W.AbstractC0781a.m1432u(r20, "image") == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x022c, code lost:
    
        r7 = p086W.AbstractC0781a.m1427p(r20, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0230, code lost:
    
        if (r7 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0232, code lost:
    
        r25.put(r7, r20.nextText());
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0242, code lost:
    
        if (p086W.AbstractC0781a.m1430s(r20, "metadata") == false) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x024d A[LOOP:0: B:2:0x000a->B:21:0x024d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x024c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0192  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m2829g(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, p011C.C0118j r23, java.util.HashMap r24, java.util.HashMap r25) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p108b1.C1182e.m2829g(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, C.j, java.util.HashMap, java.util.HashMap):void");
    }

    /* renamed from: i */
    public static p108b1.C1180c m2830i(org.xmlpull.v1.XmlPullParser xmlPullParser, p108b1.C1180c c1180c, java.util.HashMap hashMap, p108b1.C1181d c1181d) {
        long j4;
        long j5;
        char c4;
        java.lang.String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        p108b1.C1184g m2831j = m2831j(xmlPullParser, null);
        java.lang.String[] strArr = null;
        java.lang.String str = null;
        java.lang.String str2 = "";
        long j6 = -9223372036854775807L;
        long j7 = -9223372036854775807L;
        long j8 = -9223372036854775807L;
        for (int i4 = 0; i4 < attributeCount; i4++) {
            java.lang.String attributeName = xmlPullParser.getAttributeName(i4);
            java.lang.String attributeValue = xmlPullParser.getAttributeValue(i4);
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
                    j8 = m2832k(attributeValue, c1181d);
                    break;
                case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                    j7 = m2832k(attributeValue, c1181d);
                    break;
                case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                    j6 = m2832k(attributeValue, c1181d);
                    break;
                case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                    java.lang.String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new java.lang.String[0];
                    } else {
                        int i5 = p086W.AbstractC0805y.f2801a;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length > 0) {
                        strArr = split;
                        break;
                    }
                    break;
                case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (c1180c != null) {
            long j9 = c1180c.f4565d;
            j4 = -9223372036854775807L;
            if (j9 != -9223372036854775807L) {
                if (j6 != -9223372036854775807L) {
                    j6 += j9;
                }
                if (j7 != -9223372036854775807L) {
                    j7 += j9;
                }
            }
        } else {
            j4 = -9223372036854775807L;
        }
        if (j7 == j4) {
            if (j8 != j4) {
                j5 = j6 + j8;
            } else if (c1180c != null) {
                long j10 = c1180c.f4566e;
                if (j10 != j4) {
                    j5 = j10;
                }
            }
            return new p108b1.C1180c(xmlPullParser.getName(), null, j6, j5, m2831j, strArr, str2, str, c1180c);
        }
        j5 = j7;
        return new p108b1.C1180c(xmlPullParser.getName(), null, j6, j5, m2831j, strArr, str2, str, c1180c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0140, code lost:
    
        r0.f4612p = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x04f6, code lost:
    
        r0.f4611o = r16;
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
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p108b1.C1184g m2831j(org.xmlpull.v1.XmlPullParser r19, p108b1.C1184g r20) {
        /*
            Method dump skipped, instructions count: 1554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p108b1.C1182e.m2831j(org.xmlpull.v1.XmlPullParser, b1.g):b1.g");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long m2832k(java.lang.String r13, p108b1.C1181d r14) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p108b1.C1182e.m2832k(java.lang.String, b1.d):long");
    }

    /* renamed from: l */
    public static p011C.C0118j m2833l(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        java.lang.String m1427p = p086W.AbstractC0781a.m1427p(xmlPullParser, "extent");
        if (m1427p == null) {
            return null;
        }
        java.util.regex.Matcher matcher = f4583r.matcher(m1427p);
        if (!matcher.matches()) {
            p086W.AbstractC0781a.m1410A("TtmlParser", "Ignoring non-pixel tts extent: ".concat(m1427p));
            return null;
        }
        try {
            java.lang.String group = matcher.group(1);
            group.getClass();
            int parseInt = java.lang.Integer.parseInt(group);
            java.lang.String group2 = matcher.group(2);
            group2.getClass();
            return new p011C.C0118j(parseInt, java.lang.Integer.parseInt(group2), 4);
        } catch (java.lang.NumberFormatException unused) {
            p086W.AbstractC0781a.m1410A("TtmlParser", "Ignoring malformed tts extent: ".concat(m1427p));
            return null;
        }
    }

    @Override // p083V0.InterfaceC0774l
    /* renamed from: F */
    public final p083V0.InterfaceC0766d mo1402F(byte[] bArr, int i4, int i5) {
        p108b1.C1181d c1181d;
        try {
            org.xmlpull.v1.XmlPullParser newPullParser = this.f4586l.newPullParser();
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.HashMap hashMap2 = new java.util.HashMap();
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap2.put("", new p108b1.C1183f("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            p011C.C0118j c0118j = null;
            newPullParser.setInput(new java.io.ByteArrayInputStream(bArr, i4, i5), null);
            java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
            p108b1.C1181d c1181d2 = f4585t;
            int i6 = 15;
            p034H2.C0247a c0247a = null;
            int i7 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                p108b1.C1180c c1180c = (p108b1.C1180c) arrayDeque.peek();
                if (i7 == 0) {
                    java.lang.String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            c1181d2 = m2828f(newPullParser);
                            i6 = m2826d(newPullParser);
                            c0118j = m2833l(newPullParser);
                        }
                        p011C.C0118j c0118j2 = c0118j;
                        p108b1.C1181d c1181d3 = c1181d2;
                        int i8 = i6;
                        if (m2825c(name)) {
                            if ("head".equals(name)) {
                                c1181d = c1181d3;
                                m2829g(newPullParser, hashMap, i8, c0118j2, hashMap2, hashMap3);
                            } else {
                                c1181d = c1181d3;
                                try {
                                    p108b1.C1180c m2830i = m2830i(newPullParser, c1180c, hashMap2, c1181d);
                                    arrayDeque.push(m2830i);
                                    if (c1180c != null) {
                                        if (c1180c.f4574m == null) {
                                            c1180c.f4574m = new java.util.ArrayList();
                                        }
                                        c1180c.f4574m.add(m2830i);
                                    }
                                } catch (p083V0.C0768f e4) {
                                    p086W.AbstractC0781a.m1411B("TtmlParser", "Suppressing parser error", e4);
                                    i7++;
                                }
                            }
                            c1181d2 = c1181d;
                        } else {
                            p086W.AbstractC0781a.m1429r("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                            i7++;
                            c1181d2 = c1181d3;
                        }
                        c0118j = c0118j2;
                        i6 = i8;
                    } else if (eventType == 4) {
                        c1180c.getClass();
                        p108b1.C1180c m2815a = p108b1.C1180c.m2815a(newPullParser.getText());
                        if (c1180c.f4574m == null) {
                            c1180c.f4574m = new java.util.ArrayList();
                        }
                        c1180c.f4574m.add(m2815a);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            p108b1.C1180c c1180c2 = (p108b1.C1180c) arrayDeque.peek();
                            c1180c2.getClass();
                            c0247a = new p034H2.C0247a(c1180c2, hashMap, hashMap2, hashMap3);
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
            c0247a.getClass();
            return c0247a;
        } catch (java.io.IOException e5) {
            throw new java.lang.IllegalStateException("Unexpected error when reading input.", e5);
        } catch (org.xmlpull.v1.XmlPullParserException e6) {
            throw new java.lang.IllegalStateException("Unable to decode source", e6);
        }
    }

    @Override // p083V0.InterfaceC0774l
    /* renamed from: h */
    public final void mo692h(byte[] bArr, int i4, int i5, p083V0.C0773k c0773k, p086W.InterfaceC0783c interfaceC0783c) {
        p080U1.AbstractC0748a.m1359G(mo1402F(bArr, i4, i5), c0773k, interfaceC0783c);
    }

    @Override // p083V0.InterfaceC0774l
    /* renamed from: w */
    public final int mo703w() {
        return 1;
    }
}
