package p175p0;

/* renamed from: p0.e */
/* loaded from: classes.dex */
public final class C1946e extends p064Q.AbstractC0537i {

    /* renamed from: e */
    public p076T.C0702p f7912e;

    /* renamed from: n */
    public static java.util.ArrayList m3899n(java.lang.String str) {
        byte[][] bArr;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!android.text.TextUtils.isEmpty(str)) {
            byte[] m1625t = p086W.AbstractC0805y.m1625t(str);
            if (m1625t.length > 4) {
                int i4 = 0;
                while (true) {
                    byte[] bArr2 = p086W.AbstractC0781a.f2732a;
                    if (i4 >= 4) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        int i5 = 0;
                        do {
                            arrayList2.add(java.lang.Integer.valueOf(i5));
                            i5 += 4;
                            int length = m1625t.length - 4;
                            while (true) {
                                if (i5 > length) {
                                    i5 = -1;
                                    break;
                                }
                                if (m1625t.length - i5 > 4) {
                                    for (int i6 = 0; i6 < 4; i6++) {
                                        if (m1625t[i5 + i6] != bArr2[i6]) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                                i5++;
                            }
                        } while (i5 != -1);
                        byte[][] bArr3 = new byte[arrayList2.size()];
                        int i7 = 0;
                        while (i7 < arrayList2.size()) {
                            int intValue = ((java.lang.Integer) arrayList2.get(i7)).intValue();
                            int intValue2 = (i7 < arrayList2.size() + (-1) ? ((java.lang.Integer) arrayList2.get(i7 + 1)).intValue() : m1625t.length) - intValue;
                            byte[] bArr4 = new byte[intValue2];
                            java.lang.System.arraycopy(m1625t, intValue, bArr4, 0, intValue2);
                            bArr3[i7] = bArr4;
                            i7++;
                        }
                        bArr = bArr3;
                    } else {
                        if (m1625t[i4] != bArr2[i4]) {
                            break;
                        }
                        i4++;
                    }
                }
            }
            bArr = null;
            if (bArr == null) {
                arrayList.add(m1625t);
            } else {
                java.util.Collections.addAll(arrayList, bArr);
            }
        }
        return arrayList;
    }

    @Override // p064Q.AbstractC0537i
    /* renamed from: b */
    public final java.lang.Object mo1043b() {
        return this.f7912e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    @Override // p064Q.AbstractC0537i
    /* renamed from: k */
    public final void mo1049k(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        int i4;
        p076T.C0701o c0701o = new p076T.C0701o();
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, "FourCC");
        if (attributeValue == null) {
            throw new p021E0.C0192d("FourCC", 1);
        }
        java.lang.String str = (attributeValue.equalsIgnoreCase("H264") || attributeValue.equalsIgnoreCase("X264") || attributeValue.equalsIgnoreCase("AVC1") || attributeValue.equalsIgnoreCase("DAVC")) ? "video/avc" : (attributeValue.equalsIgnoreCase("AAC") || attributeValue.equalsIgnoreCase("AACL") || attributeValue.equalsIgnoreCase("AACH") || attributeValue.equalsIgnoreCase("AACP")) ? "audio/mp4a-latm" : (attributeValue.equalsIgnoreCase("TTML") || attributeValue.equalsIgnoreCase("DFXP")) ? "application/ttml+xml" : (attributeValue.equalsIgnoreCase("ac-3") || attributeValue.equalsIgnoreCase("dac3")) ? "audio/ac3" : (attributeValue.equalsIgnoreCase("ec-3") || attributeValue.equalsIgnoreCase("dec3")) ? "audio/eac3" : attributeValue.equalsIgnoreCase("dtsc") ? "audio/vnd.dts" : (attributeValue.equalsIgnoreCase("dtsh") || attributeValue.equalsIgnoreCase("dtsl")) ? "audio/vnd.dts.hd" : attributeValue.equalsIgnoreCase("dtse") ? "audio/vnd.dts.hd;profile=lbr" : attributeValue.equalsIgnoreCase("opus") ? "audio/opus" : null;
        int intValue = ((java.lang.Integer) m1044c("Type")).intValue();
        if (intValue == 2) {
            java.util.ArrayList m3899n = m3899n(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
            c0701o.f2369k = p076T.AbstractC0665H.m1201l("video/mp4");
            c0701o.f2376r = p064Q.AbstractC0537i.m1041j(xmlPullParser, "MaxWidth");
            c0701o.f2377s = p064Q.AbstractC0537i.m1041j(xmlPullParser, "MaxHeight");
            c0701o.f2373o = m3899n;
        } else if (intValue == 1) {
            if (str == null) {
                str = "audio/mp4a-latm";
            }
            int m1041j = p064Q.AbstractC0537i.m1041j(xmlPullParser, "Channels");
            int m1041j2 = p064Q.AbstractC0537i.m1041j(xmlPullParser, "SamplingRate");
            java.util.ArrayList m3899n2 = m3899n(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
            boolean isEmpty = m3899n2.isEmpty();
            java.util.ArrayList arrayList = m3899n2;
            if (isEmpty) {
                arrayList = m3899n2;
                if ("audio/mp4a-latm".equals(str)) {
                    arrayList = java.util.Collections.singletonList(p215y0.AbstractC2390b.m4606a(m1041j2, m1041j));
                }
            }
            c0701o.f2369k = p076T.AbstractC0665H.m1201l("audio/mp4");
            c0701o.f2384z = m1041j;
            c0701o.f2350A = m1041j2;
            c0701o.f2373o = arrayList;
        } else if (intValue == 3) {
            java.lang.String str2 = (java.lang.String) m1044c("Subtype");
            if (str2 != null) {
                if (str2.equals("CAPT")) {
                    i4 = 64;
                } else if (str2.equals("DESC")) {
                    i4 = 1024;
                }
                c0701o.f2369k = p076T.AbstractC0665H.m1201l("application/mp4");
                c0701o.f2364f = i4;
            }
            i4 = 0;
            c0701o.f2369k = p076T.AbstractC0665H.m1201l("application/mp4");
            c0701o.f2364f = i4;
        } else {
            c0701o.f2369k = p076T.AbstractC0665H.m1201l("application/mp4");
        }
        c0701o.f2359a = xmlPullParser.getAttributeValue(null, "Index");
        c0701o.f2360b = (java.lang.String) m1044c("Name");
        c0701o.f2370l = p076T.AbstractC0665H.m1201l(str);
        c0701o.f2365g = p064Q.AbstractC0537i.m1041j(xmlPullParser, "Bitrate");
        c0701o.f2362d = (java.lang.String) m1044c("Language");
        this.f7912e = new p076T.C0702p(c0701o);
    }
}
