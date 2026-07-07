package p132g0;

/* renamed from: g0.i */
/* loaded from: classes.dex */
public final class C1464i {

    /* renamed from: a */
    public final p132g0.C1458c f5854a;

    /* renamed from: b */
    public final p094Y.InterfaceC0870h f5855b;

    /* renamed from: c */
    public final p094Y.InterfaceC0870h f5856c;

    /* renamed from: d */
    public final p129f2.C1408Y f5857d;

    /* renamed from: e */
    public final android.net.Uri[] f5858e;

    /* renamed from: f */
    public final p076T.C0702p[] f5859f;

    /* renamed from: g */
    public final p136h0.C1486c f5860g;

    /* renamed from: h */
    public final p076T.C0678V f5861h;

    /* renamed from: i */
    public final java.util.List f5862i;

    /* renamed from: k */
    public final p107b0.C1177l f5864k;

    /* renamed from: l */
    public boolean f5865l;

    /* renamed from: n */
    public p179q0.C1986b f5867n;

    /* renamed from: o */
    public android.net.Uri f5868o;

    /* renamed from: p */
    public boolean f5869p;

    /* renamed from: q */
    public p193t0.InterfaceC2181s f5870q;

    /* renamed from: s */
    public boolean f5872s;

    /* renamed from: j */
    public final p129f2.C1408Y f5863j = new p129f2.C1408Y(2);

    /* renamed from: m */
    public byte[] f5866m = p086W.AbstractC0805y.f2806f;

    /* renamed from: r */
    public long f5871r = -9223372036854775807L;

    /* JADX WARN: Type inference failed for: r3v1, types: [t0.s, t0.d, g0.g] */
    public C1464i(p132g0.C1458c c1458c, p136h0.C1486c c1486c, android.net.Uri[] uriArr, p076T.C0702p[] c0702pArr, p129f2.C1408Y c1408y, p094Y.InterfaceC0860C interfaceC0860C, p129f2.C1408Y c1408y2, java.util.List list, p107b0.C1177l c1177l) {
        this.f5854a = c1458c;
        this.f5860g = c1486c;
        this.f5858e = uriArr;
        this.f5859f = c0702pArr;
        this.f5857d = c1408y2;
        this.f5862i = list;
        this.f5864k = c1177l;
        p094Y.InterfaceC0870h mo104a = ((p094Y.InterfaceC0869g) c1408y.f5729m).mo104a();
        this.f5855b = mo104a;
        if (interfaceC0860C != null) {
            mo104a.mo1688j(interfaceC0860C);
        }
        this.f5856c = ((p094Y.InterfaceC0869g) c1408y.f5729m).mo104a();
        this.f5861h = new p076T.C0678V("", c0702pArr);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i4 = 0; i4 < uriArr.length; i4++) {
            if ((c0702pArr[i4].f2401f & 16384) == 0) {
                arrayList.add(java.lang.Integer.valueOf(i4));
            }
        }
        p076T.C0678V c0678v = this.f5861h;
        int[] m1786X = p101a.AbstractC0936a.m1786X(arrayList);
        ?? abstractC2166d = new p193t0.AbstractC2166d(c0678v, m1786X);
        abstractC2166d.f5849g = abstractC2166d.mo3981p(c0678v.f2252d[m1786X[0]]);
        this.f5870q = abstractC2166d;
    }

    /* renamed from: a */
    public final p184r0.InterfaceC2056n[] m3272a(p132g0.C1466k c1466k, long j4) {
        int i4;
        java.util.List list;
        int m1259b = c1466k == null ? -1 : this.f5861h.m1259b(c1466k.f8334o);
        int length = this.f5870q.length();
        p184r0.InterfaceC2056n[] interfaceC2056nArr = new p184r0.InterfaceC2056n[length];
        boolean z4 = false;
        int i5 = 0;
        while (i5 < length) {
            int mo3977k = this.f5870q.mo3977k(i5);
            android.net.Uri uri = this.f5858e[mo3977k];
            p136h0.C1486c c1486c = this.f5860g;
            if (c1486c.m3319c(uri)) {
                p136h0.C1492i m3317a = c1486c.m3317a(z4, uri);
                m3317a.getClass();
                long j5 = m3317a.f6116h - c1486c.f6088y;
                i4 = i5;
                android.util.Pair m3274c = m3274c(c1466k, mo3977k != m1259b ? true : z4, m3317a, j5, j4);
                long longValue = ((java.lang.Long) m3274c.first).longValue();
                int intValue = ((java.lang.Integer) m3274c.second).intValue();
                int i6 = (int) (longValue - m3317a.f6119k);
                if (i6 >= 0) {
                    p129f2.AbstractC1393I abstractC1393I = m3317a.f6126r;
                    if (abstractC1393I.size() >= i6) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        if (i6 < abstractC1393I.size()) {
                            if (intValue != -1) {
                                p136h0.C1489f c1489f = (p136h0.C1489f) abstractC1393I.get(i6);
                                if (intValue == 0) {
                                    arrayList.add(c1489f);
                                } else if (intValue < c1489f.f6095x.size()) {
                                    p129f2.AbstractC1393I abstractC1393I2 = c1489f.f6095x;
                                    arrayList.addAll(abstractC1393I2.subList(intValue, abstractC1393I2.size()));
                                }
                                i6++;
                            }
                            arrayList.addAll(abstractC1393I.subList(i6, abstractC1393I.size()));
                            intValue = 0;
                        }
                        if (m3317a.f6122n != -9223372036854775807L) {
                            if (intValue == -1) {
                                intValue = 0;
                            }
                            p129f2.AbstractC1393I abstractC1393I3 = m3317a.f6127s;
                            if (intValue < abstractC1393I3.size()) {
                                arrayList.addAll(abstractC1393I3.subList(intValue, abstractC1393I3.size()));
                            }
                        }
                        list = java.util.Collections.unmodifiableList(arrayList);
                        interfaceC2056nArr[i4] = new p132g0.C1461f(j5, list);
                    }
                }
                p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
                list = p129f2.C1415c0.f5744p;
                interfaceC2056nArr[i4] = new p132g0.C1461f(j5, list);
            } else {
                interfaceC2056nArr[i5] = p184r0.InterfaceC2056n.f8379f;
                i4 = i5;
            }
            i5 = i4 + 1;
            z4 = false;
        }
        return interfaceC2056nArr;
    }

    /* renamed from: b */
    public final int m3273b(p132g0.C1466k c1466k) {
        if (c1466k.f5901z == -1) {
            return 1;
        }
        p136h0.C1492i m3317a = this.f5860g.m3317a(false, this.f5858e[this.f5861h.m1259b(c1466k.f8334o)]);
        m3317a.getClass();
        int i4 = (int) (c1466k.f8378u - m3317a.f6119k);
        if (i4 < 0) {
            return 1;
        }
        p129f2.AbstractC1393I abstractC1393I = m3317a.f6126r;
        p129f2.AbstractC1393I abstractC1393I2 = i4 < abstractC1393I.size() ? ((p136h0.C1489f) abstractC1393I.get(i4)).f6095x : m3317a.f6127s;
        int size = abstractC1393I2.size();
        int i5 = c1466k.f5901z;
        if (i5 >= size) {
            return 2;
        }
        p136h0.C1487d c1487d = (p136h0.C1487d) abstractC1393I2.get(i5);
        if (c1487d.f6090x) {
            return 0;
        }
        return p086W.AbstractC0805y.m1606a(android.net.Uri.parse(p086W.AbstractC0781a.m1435x(m3317a.f6149a, c1487d.f6096l)), c1466k.f8332m.f3135a) ? 1 : 2;
    }

    /* renamed from: c */
    public final android.util.Pair m3274c(p132g0.C1466k c1466k, boolean z4, p136h0.C1492i c1492i, long j4, long j5) {
        boolean z5 = true;
        if (c1466k != null && !z4) {
            boolean z6 = c1466k.f5893S;
            long j6 = c1466k.f8378u;
            int i4 = c1466k.f5901z;
            if (!z6) {
                return new android.util.Pair(java.lang.Long.valueOf(j6), java.lang.Integer.valueOf(i4));
            }
            if (i4 == -1) {
                j6 = c1466k.mo4114a();
            }
            return new android.util.Pair(java.lang.Long.valueOf(j6), java.lang.Integer.valueOf(i4 != -1 ? i4 + 1 : -1));
        }
        long j7 = c1492i.f6129u + j4;
        if (c1466k != null && !this.f5869p) {
            j5 = c1466k.f8337r;
        }
        boolean z7 = c1492i.f6123o;
        long j8 = c1492i.f6119k;
        p129f2.AbstractC1393I abstractC1393I = c1492i.f6126r;
        if (!z7 && j5 >= j7) {
            return new android.util.Pair(java.lang.Long.valueOf(j8 + abstractC1393I.size()), -1);
        }
        long j9 = j5 - j4;
        java.lang.Long valueOf = java.lang.Long.valueOf(j9);
        int i5 = 0;
        if (this.f5860g.f6087x && c1466k != null) {
            z5 = false;
        }
        int m1609d = p086W.AbstractC0805y.m1609d(abstractC1393I, valueOf, z5);
        long j10 = m1609d + j8;
        if (m1609d >= 0) {
            p136h0.C1489f c1489f = (p136h0.C1489f) abstractC1393I.get(m1609d);
            long j11 = c1489f.f6100p + c1489f.f6098n;
            p129f2.AbstractC1393I abstractC1393I2 = c1492i.f6127s;
            p129f2.AbstractC1393I abstractC1393I3 = j9 < j11 ? c1489f.f6095x : abstractC1393I2;
            while (true) {
                if (i5 >= abstractC1393I3.size()) {
                    break;
                }
                p136h0.C1487d c1487d = (p136h0.C1487d) abstractC1393I3.get(i5);
                if (j9 >= c1487d.f6100p + c1487d.f6098n) {
                    i5++;
                } else if (c1487d.f6089w) {
                    j10 += abstractC1393I3 == abstractC1393I2 ? 1L : 0L;
                    r1 = i5;
                }
            }
        }
        return new android.util.Pair(java.lang.Long.valueOf(j10), java.lang.Integer.valueOf(r1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [r0.e, g0.e] */
    /* renamed from: d */
    public final p132g0.C1460e m3275d(android.net.Uri uri, int i4, boolean z4) {
        if (uri == null) {
            return null;
        }
        p129f2.C1408Y c1408y = this.f5863j;
        byte[] bArr = (byte[]) ((p132g0.C1459d) c1408y.f5729m).remove(uri);
        if (bArr != null) {
            return null;
        }
        p094Y.C0874l c0874l = new p094Y.C0874l(uri, 1, null, java.util.Collections.emptyMap(), 0L, -1L, null, 1);
        p076T.C0702p c0702p = this.f5859f[i4];
        int mo3268e = this.f5870q.mo3268e();
        java.lang.Object mo3270l = this.f5870q.mo3270l();
        byte[] bArr2 = this.f5866m;
        ?? abstractC2047e = new p184r0.AbstractC2047e(this.f5856c, c0874l, 3, c0702p, mo3268e, mo3270l, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = p086W.AbstractC0805y.f2806f;
        }
        abstractC2047e.f5844u = bArr2;
        return abstractC2047e;
    }
}
