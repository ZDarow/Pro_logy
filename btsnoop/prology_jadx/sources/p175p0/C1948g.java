package p175p0;

/* renamed from: p0.g */
/* loaded from: classes.dex */
public final class C1948g extends p064Q.AbstractC0537i {

    /* renamed from: e */
    public final java.lang.String f7922e;

    /* renamed from: f */
    public final java.util.LinkedList f7923f;

    /* renamed from: g */
    public int f7924g;

    /* renamed from: h */
    public java.lang.String f7925h;

    /* renamed from: i */
    public long f7926i;

    /* renamed from: j */
    public java.lang.String f7927j;

    /* renamed from: k */
    public java.lang.String f7928k;

    /* renamed from: l */
    public int f7929l;

    /* renamed from: m */
    public int f7930m;

    /* renamed from: n */
    public int f7931n;

    /* renamed from: o */
    public int f7932o;

    /* renamed from: p */
    public java.lang.String f7933p;

    /* renamed from: q */
    public java.util.ArrayList f7934q;

    /* renamed from: r */
    public long f7935r;

    public C1948g(p064Q.AbstractC0537i abstractC0537i, java.lang.String str) {
        super(abstractC0537i, str, "StreamIndex");
        this.f7922e = str;
        this.f7923f = new java.util.LinkedList();
    }

    @Override // p064Q.AbstractC0537i
    /* renamed from: a */
    public final void mo1042a(java.lang.Object obj) {
        if (obj instanceof p076T.C0702p) {
            this.f7923f.add((p076T.C0702p) obj);
        }
    }

    @Override // p064Q.AbstractC0537i
    /* renamed from: b */
    public final java.lang.Object mo1043b() {
        int i4;
        int i5;
        int i6;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.math.RoundingMode roundingMode;
        int i7;
        long[] jArr;
        int i8;
        java.util.ArrayList arrayList3;
        long[] jArr2;
        java.util.LinkedList linkedList = this.f7923f;
        p076T.C0702p[] c0702pArr = new p076T.C0702p[linkedList.size()];
        linkedList.toArray(c0702pArr);
        java.lang.String str = this.f7928k;
        int i9 = this.f7924g;
        java.lang.String str2 = this.f7925h;
        long j4 = this.f7926i;
        java.lang.String str3 = this.f7927j;
        int i10 = this.f7929l;
        int i11 = this.f7930m;
        int i12 = this.f7931n;
        int i13 = this.f7932o;
        java.lang.String str4 = this.f7933p;
        java.util.ArrayList arrayList4 = this.f7934q;
        long j5 = this.f7935r;
        int i14 = p086W.AbstractC0805y.f2801a;
        java.math.RoundingMode roundingMode2 = java.math.RoundingMode.FLOOR;
        int size = arrayList4.size();
        long[] jArr3 = new long[size];
        if (j4 < 1000000 || j4 % 1000000 != 0) {
            i4 = i11;
            i5 = i12;
            i6 = i10;
            if (j4 >= 1000000 || 1000000 % j4 != 0) {
                int i15 = 0;
                while (i15 < size) {
                    long longValue = ((java.lang.Long) arrayList4.get(i15)).longValue();
                    if (longValue == 0) {
                        arrayList2 = arrayList4;
                        roundingMode = roundingMode2;
                        i7 = size;
                        jArr = jArr3;
                        i8 = i15;
                    } else {
                        if (j4 < longValue || j4 % longValue != 0) {
                            arrayList = arrayList4;
                            if (j4 >= longValue || longValue % j4 != 0) {
                                arrayList2 = arrayList;
                                roundingMode = roundingMode2;
                                i7 = size;
                                jArr = jArr3;
                                i8 = i15;
                                jArr[i8] = p086W.AbstractC0805y.m1601V(longValue, 1000000L, j4, roundingMode);
                            } else {
                                jArr3[i15] = p080U1.AbstractC0748a.m1391z(1000000L, p080U1.AbstractC0748a.m1379m(longValue, j4, java.math.RoundingMode.UNNECESSARY));
                            }
                        } else {
                            arrayList = arrayList4;
                            jArr3[i15] = p080U1.AbstractC0748a.m1379m(1000000L, p080U1.AbstractC0748a.m1379m(j4, longValue, java.math.RoundingMode.UNNECESSARY), roundingMode2);
                        }
                        i7 = size;
                        jArr = jArr3;
                        i8 = i15;
                        arrayList2 = arrayList;
                        roundingMode = roundingMode2;
                    }
                    i15 = i8 + 1;
                    arrayList4 = arrayList2;
                    roundingMode2 = roundingMode;
                    size = i7;
                    jArr3 = jArr;
                }
            } else {
                long m1379m = p080U1.AbstractC0748a.m1379m(1000000L, j4, java.math.RoundingMode.UNNECESSARY);
                for (int i16 = 0; i16 < size; i16++) {
                    jArr3[i16] = p080U1.AbstractC0748a.m1391z(((java.lang.Long) arrayList4.get(i16)).longValue(), m1379m);
                }
            }
            arrayList3 = arrayList4;
            jArr2 = jArr3;
        } else {
            i4 = i11;
            long m1379m2 = p080U1.AbstractC0748a.m1379m(j4, 1000000L, java.math.RoundingMode.UNNECESSARY);
            int i17 = 0;
            while (i17 < size) {
                jArr3[i17] = p080U1.AbstractC0748a.m1379m(((java.lang.Long) arrayList4.get(i17)).longValue(), m1379m2, roundingMode2);
                i17++;
                i10 = i10;
                i12 = i12;
            }
            arrayList3 = arrayList4;
            jArr2 = jArr3;
            i5 = i12;
            i6 = i10;
        }
        return new p175p0.C1943b(this.f7922e, str, i9, str2, j4, str3, i6, i4, i5, i13, str4, c0702pArr, arrayList3, jArr2, p086W.AbstractC0805y.m1600U(j5, 1000000L, j4, java.math.RoundingMode.FLOOR));
    }

    @Override // p064Q.AbstractC0537i
    /* renamed from: d */
    public final boolean mo1045d(java.lang.String str) {
        return "c".equals(str);
    }

    @Override // p064Q.AbstractC0537i
    /* renamed from: k */
    public final void mo1049k(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        int i4 = 1;
        if (!"c".equals(xmlPullParser.getName())) {
            java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new p021E0.C0192d("Type", 1);
            }
            if (!"audio".equalsIgnoreCase(attributeValue)) {
                if ("video".equalsIgnoreCase(attributeValue)) {
                    i4 = 2;
                } else {
                    if (!"text".equalsIgnoreCase(attributeValue)) {
                        throw p076T.C0666I.m1203b("Invalid key value[" + attributeValue + "]", null);
                    }
                    i4 = 3;
                }
            }
            this.f7924g = i4;
            m1051m(java.lang.Integer.valueOf(i4), "Type");
            if (this.f7924g == 3) {
                java.lang.String attributeValue2 = xmlPullParser.getAttributeValue(null, "Subtype");
                if (attributeValue2 == null) {
                    throw new p021E0.C0192d("Subtype", 1);
                }
                this.f7925h = attributeValue2;
            } else {
                this.f7925h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            m1051m(this.f7925h, "Subtype");
            java.lang.String attributeValue3 = xmlPullParser.getAttributeValue(null, "Name");
            this.f7927j = attributeValue3;
            m1051m(attributeValue3, "Name");
            java.lang.String attributeValue4 = xmlPullParser.getAttributeValue(null, "Url");
            if (attributeValue4 == null) {
                throw new p021E0.C0192d("Url", 1);
            }
            this.f7928k = attributeValue4;
            this.f7929l = p064Q.AbstractC0537i.m1039h(xmlPullParser, "MaxWidth");
            this.f7930m = p064Q.AbstractC0537i.m1039h(xmlPullParser, "MaxHeight");
            this.f7931n = p064Q.AbstractC0537i.m1039h(xmlPullParser, "DisplayWidth");
            this.f7932o = p064Q.AbstractC0537i.m1039h(xmlPullParser, "DisplayHeight");
            java.lang.String attributeValue5 = xmlPullParser.getAttributeValue(null, "Language");
            this.f7933p = attributeValue5;
            m1051m(attributeValue5, "Language");
            long m1039h = p064Q.AbstractC0537i.m1039h(xmlPullParser, "TimeScale");
            this.f7926i = m1039h;
            if (m1039h == -1) {
                this.f7926i = ((java.lang.Long) m1044c("TimeScale")).longValue();
            }
            this.f7934q = new java.util.ArrayList();
            return;
        }
        int size = this.f7934q.size();
        long m1040i = p064Q.AbstractC0537i.m1040i(xmlPullParser, "t", -9223372036854775807L);
        if (m1040i == -9223372036854775807L) {
            if (size == 0) {
                m1040i = 0;
            } else {
                if (this.f7935r == -1) {
                    throw p076T.C0666I.m1203b("Unable to infer start time", null);
                }
                m1040i = this.f7935r + ((java.lang.Long) this.f7934q.get(size - 1)).longValue();
            }
        }
        this.f7934q.add(java.lang.Long.valueOf(m1040i));
        this.f7935r = p064Q.AbstractC0537i.m1040i(xmlPullParser, "d", -9223372036854775807L);
        long m1040i2 = p064Q.AbstractC0537i.m1040i(xmlPullParser, "r", 1L);
        if (m1040i2 > 1 && this.f7935r == -9223372036854775807L) {
            throw p076T.C0666I.m1203b("Repeated chunk with unspecified duration", null);
        }
        while (true) {
            long j4 = i4;
            if (j4 >= m1040i2) {
                return;
            }
            this.f7934q.add(java.lang.Long.valueOf((this.f7935r * j4) + m1040i));
            i4++;
        }
    }
}
