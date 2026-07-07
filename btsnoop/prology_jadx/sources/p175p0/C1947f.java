package p175p0;

/* renamed from: p0.f */
/* loaded from: classes.dex */
public final class C1947f extends p064Q.AbstractC0537i {

    /* renamed from: e */
    public final java.util.LinkedList f7913e;

    /* renamed from: f */
    public int f7914f;

    /* renamed from: g */
    public int f7915g;

    /* renamed from: h */
    public long f7916h;

    /* renamed from: i */
    public long f7917i;

    /* renamed from: j */
    public long f7918j;

    /* renamed from: k */
    public int f7919k;

    /* renamed from: l */
    public boolean f7920l;

    /* renamed from: m */
    public p175p0.C1942a f7921m;

    public C1947f(java.lang.String str) {
        super(null, str, "SmoothStreamingMedia");
        this.f7919k = -1;
        this.f7921m = null;
        this.f7913e = new java.util.LinkedList();
    }

    @Override // p064Q.AbstractC0537i
    /* renamed from: a */
    public final void mo1042a(java.lang.Object obj) {
        if (obj instanceof p175p0.C1943b) {
            this.f7913e.add((p175p0.C1943b) obj);
        } else if (obj instanceof p175p0.C1942a) {
            p086W.AbstractC0781a.m1421j(this.f7921m == null);
            this.f7921m = (p175p0.C1942a) obj;
        }
    }

    @Override // p064Q.AbstractC0537i
    /* renamed from: b */
    public final java.lang.Object mo1043b() {
        long j4;
        p175p0.C1942a c1942a;
        long m1600U;
        long m1600U2;
        boolean z4;
        java.util.LinkedList linkedList = this.f7913e;
        int size = linkedList.size();
        p175p0.C1943b[] c1943bArr = new p175p0.C1943b[size];
        linkedList.toArray(c1943bArr);
        p175p0.C1942a c1942a2 = this.f7921m;
        if (c1942a2 != null) {
            p076T.C0699m c0699m = new p076T.C0699m(new p076T.C0698l(c1942a2.f7882a, null, "video/mp4", c1942a2.f7883b));
            for (int i4 = 0; i4 < size; i4++) {
                p175p0.C1943b c1943b = c1943bArr[i4];
                int i5 = c1943b.f7885a;
                if (i5 == 2 || i5 == 1) {
                    int i6 = 0;
                    while (true) {
                        p076T.C0702p[] c0702pArr = c1943b.f7894j;
                        if (i6 < c0702pArr.length) {
                            p076T.C0701o m1295a = c0702pArr[i6].m1295a();
                            m1295a.f2374p = c0699m;
                            c0702pArr[i6] = new p076T.C0702p(m1295a);
                            i6++;
                        }
                    }
                }
            }
        }
        int i7 = this.f7914f;
        int i8 = this.f7915g;
        long j5 = this.f7916h;
        long j6 = this.f7917i;
        long j7 = this.f7918j;
        int i9 = this.f7919k;
        boolean z5 = this.f7920l;
        p175p0.C1942a c1942a3 = this.f7921m;
        if (j6 == 0) {
            j4 = j7;
            c1942a = c1942a3;
            m1600U = -9223372036854775807L;
        } else {
            int i10 = p086W.AbstractC0805y.f2801a;
            j4 = j7;
            c1942a = c1942a3;
            m1600U = p086W.AbstractC0805y.m1600U(j6, 1000000L, j5, java.math.RoundingMode.FLOOR);
        }
        if (j4 == 0) {
            z4 = z5;
            m1600U2 = -9223372036854775807L;
        } else {
            int i11 = p086W.AbstractC0805y.f2801a;
            m1600U2 = p086W.AbstractC0805y.m1600U(j4, 1000000L, j5, java.math.RoundingMode.FLOOR);
            z4 = z5;
        }
        return new p175p0.C1944c(i7, i8, m1600U, m1600U2, i9, z4, c1942a, c1943bArr);
    }

    @Override // p064Q.AbstractC0537i
    /* renamed from: k */
    public final void mo1049k(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        this.f7914f = p064Q.AbstractC0537i.m1041j(xmlPullParser, "MajorVersion");
        this.f7915g = p064Q.AbstractC0537i.m1041j(xmlPullParser, "MinorVersion");
        this.f7916h = p064Q.AbstractC0537i.m1040i(xmlPullParser, "TimeScale", 10000000L);
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, "Duration");
        if (attributeValue == null) {
            throw new p021E0.C0192d("Duration", 1);
        }
        try {
            this.f7917i = java.lang.Long.parseLong(attributeValue);
            this.f7918j = p064Q.AbstractC0537i.m1040i(xmlPullParser, "DVRWindowLength", 0L);
            this.f7919k = p064Q.AbstractC0537i.m1039h(xmlPullParser, "LookaheadCount");
            java.lang.String attributeValue2 = xmlPullParser.getAttributeValue(null, "IsLive");
            this.f7920l = attributeValue2 != null ? java.lang.Boolean.parseBoolean(attributeValue2) : false;
            m1051m(java.lang.Long.valueOf(this.f7916h), "TimeScale");
        } catch (java.lang.NumberFormatException e4) {
            throw p076T.C0666I.m1203b(null, e4);
        }
    }
}
