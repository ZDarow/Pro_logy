package p028G0;

/* renamed from: G0.e */
/* loaded from: classes.dex */
public abstract class AbstractC0237e {

    /* renamed from: a */
    public static final java.lang.String[] f688a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b */
    public static final java.lang.String[] f689b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c */
    public static final java.lang.String[] f690c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r8 == (-1)) goto L22;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p028G0.C0235c m643a(java.lang.String r21) {
        /*
            r0 = 0
            r1 = 1
            org.xmlpull.v1.XmlPullParserFactory r2 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r2 = r2.newPullParser()
            java.io.StringReader r3 = new java.io.StringReader
            r4 = r21
            r3.<init>(r4)
            r2.setInput(r3)
            r2.next()
            java.lang.String r3 = "x:xmpmeta"
            boolean r4 = p086W.AbstractC0781a.m1432u(r2, r3)
            r5 = 0
            if (r4 == 0) goto Lcf
            f2.G r4 = p129f2.AbstractC1393I.f5704m
            f2.c0 r4 = p129f2.C1415c0.f5744p
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r6
        L2a:
            r2.next()
            java.lang.String r10 = "rdf:Description"
            boolean r10 = p086W.AbstractC0781a.m1432u(r2, r10)
            if (r10 == 0) goto L9b
            java.lang.String[] r4 = p028G0.AbstractC0237e.f688a
            r8 = r0
        L38:
            r9 = 4
            if (r8 >= r9) goto L9a
            r10 = r4[r8]
            java.lang.String r10 = p086W.AbstractC0781a.m1427p(r2, r10)
            if (r10 == 0) goto L98
            int r4 = java.lang.Integer.parseInt(r10)
            if (r4 != r1) goto L9a
            java.lang.String[] r4 = p028G0.AbstractC0237e.f689b
            r8 = r0
        L4c:
            if (r8 >= r9) goto L63
            r10 = r4[r8]
            java.lang.String r10 = p086W.AbstractC0781a.m1427p(r2, r10)
            if (r10 == 0) goto L61
            long r8 = java.lang.Long.parseLong(r10)
            r10 = -1
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 != 0) goto L64
            goto L63
        L61:
            int r8 = r8 + r1
            goto L4c
        L63:
            r8 = r6
        L64:
            java.lang.String[] r4 = p028G0.AbstractC0237e.f690c
            r10 = r0
        L67:
            r11 = 2
            if (r10 >= r11) goto L93
            r11 = r4[r10]
            java.lang.String r11 = p086W.AbstractC0781a.m1427p(r2, r11)
            if (r11 == 0) goto L91
            long r13 = java.lang.Long.parseLong(r11)
            G0.b r4 = new G0.b
            r16 = 0
            r18 = 0
            java.lang.String r20 = "image/jpeg"
            r15 = r4
            r15.<init>(r16, r18, r20)
            G0.b r10 = new G0.b
            r15 = 0
            java.lang.String r17 = "video/mp4"
            r12 = r10
            r12.<init>(r13, r15, r17)
            f2.c0 r4 = p129f2.AbstractC1393I.m3167p(r4, r10)
            goto Lbc
        L91:
            int r10 = r10 + r1
            goto L67
        L93:
            f2.G r4 = p129f2.AbstractC1393I.f5704m
            f2.c0 r4 = p129f2.C1415c0.f5744p
            goto Lbc
        L98:
            int r8 = r8 + r1
            goto L38
        L9a:
            return r5
        L9b:
            java.lang.String r10 = "Container:Directory"
            boolean r10 = p086W.AbstractC0781a.m1432u(r2, r10)
            if (r10 == 0) goto Lac
            java.lang.String r4 = "Container"
            java.lang.String r10 = "Item"
            f2.c0 r4 = m644b(r2, r4, r10)
            goto Lbc
        Lac:
            java.lang.String r10 = "GContainer:Directory"
            boolean r10 = p086W.AbstractC0781a.m1432u(r2, r10)
            if (r10 == 0) goto Lbc
            java.lang.String r4 = "GContainer"
            java.lang.String r10 = "GContainerItem"
            f2.c0 r4 = m644b(r2, r4, r10)
        Lbc:
            boolean r10 = p086W.AbstractC0781a.m1430s(r2, r3)
            if (r10 == 0) goto L2a
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto Lc9
            return r5
        Lc9:
            G0.c r1 = new G0.c
            r1.<init>(r8, r4, r0)
            return r1
        Lcf:
            java.lang.String r0 = "Couldn't find xmp metadata"
            T.I r0 = p076T.C0666I.m1202a(r5, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p028G0.AbstractC0237e.m643a(java.lang.String):G0.c");
    }

    /* renamed from: b */
    public static p129f2.C1415c0 m644b(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, java.lang.String str2) {
        p129f2.C1390F m3161i = p129f2.AbstractC1393I.m3161i();
        java.lang.String concat = str.concat(":Item");
        java.lang.String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (p086W.AbstractC0781a.m1432u(xmlPullParser, concat)) {
                java.lang.String concat3 = str2.concat(":Mime");
                java.lang.String concat4 = str2.concat(":Semantic");
                java.lang.String concat5 = str2.concat(":Length");
                java.lang.String concat6 = str2.concat(":Padding");
                java.lang.String m1427p = p086W.AbstractC0781a.m1427p(xmlPullParser, concat3);
                java.lang.String m1427p2 = p086W.AbstractC0781a.m1427p(xmlPullParser, concat4);
                java.lang.String m1427p3 = p086W.AbstractC0781a.m1427p(xmlPullParser, concat5);
                java.lang.String m1427p4 = p086W.AbstractC0781a.m1427p(xmlPullParser, concat6);
                if (m1427p == null || m1427p2 == null) {
                    return p129f2.C1415c0.f5744p;
                }
                m3161i.m3145a(new p028G0.C0234b(m1427p3 != null ? java.lang.Long.parseLong(m1427p3) : 0L, m1427p4 != null ? java.lang.Long.parseLong(m1427p4) : 0L, m1427p));
            }
        } while (!p086W.AbstractC0781a.m1430s(xmlPullParser, concat2));
        return m3161i.m3157g();
    }
}
