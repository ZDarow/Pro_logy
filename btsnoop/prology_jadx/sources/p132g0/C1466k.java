package p132g0;

/* renamed from: g0.k */
/* loaded from: classes.dex */
public final class C1466k extends p184r0.AbstractC2054l {

    /* renamed from: W */
    public static final java.util.concurrent.atomic.AtomicInteger f5874W = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: A */
    public final p094Y.InterfaceC0870h f5875A;

    /* renamed from: B */
    public final p094Y.C0874l f5876B;

    /* renamed from: C */
    public final p132g0.C1457b f5877C;

    /* renamed from: D */
    public final boolean f5878D;

    /* renamed from: E */
    public final boolean f5879E;

    /* renamed from: F */
    public final p086W.C0803w f5880F;

    /* renamed from: G */
    public final p132g0.C1458c f5881G;

    /* renamed from: H */
    public final java.util.List f5882H;

    /* renamed from: I */
    public final p076T.C0699m f5883I;

    /* renamed from: J */
    public final p049M0.C0409h f5884J;

    /* renamed from: K */
    public final p086W.C0798r f5885K;

    /* renamed from: L */
    public final boolean f5886L;

    /* renamed from: M */
    public final boolean f5887M;

    /* renamed from: N */
    public p132g0.C1457b f5888N;

    /* renamed from: O */
    public p132g0.C1473r f5889O;

    /* renamed from: P */
    public int f5890P;

    /* renamed from: Q */
    public boolean f5891Q;

    /* renamed from: R */
    public volatile boolean f5892R;

    /* renamed from: S */
    public boolean f5893S;

    /* renamed from: T */
    public p129f2.C1415c0 f5894T;

    /* renamed from: U */
    public boolean f5895U;

    /* renamed from: V */
    public boolean f5896V;

    /* renamed from: v */
    public final int f5897v;

    /* renamed from: w */
    public final int f5898w;

    /* renamed from: x */
    public final android.net.Uri f5899x;

    /* renamed from: y */
    public final boolean f5900y;

    /* renamed from: z */
    public final int f5901z;

    public C1466k(p132g0.C1458c c1458c, p094Y.InterfaceC0870h interfaceC0870h, p094Y.C0874l c0874l, p076T.C0702p c0702p, boolean z4, p094Y.InterfaceC0870h interfaceC0870h2, p094Y.C0874l c0874l2, boolean z5, android.net.Uri uri, java.util.List list, int i4, java.lang.Object obj, long j4, long j5, long j6, int i5, boolean z6, int i6, boolean z7, boolean z8, p086W.C0803w c0803w, p076T.C0699m c0699m, p132g0.C1457b c1457b, p049M0.C0409h c0409h, p086W.C0798r c0798r, boolean z9, p107b0.C1177l c1177l) {
        super(interfaceC0870h, c0874l, c0702p, i4, obj, j4, j5, j6);
        this.f5886L = z4;
        this.f5901z = i5;
        this.f5896V = z6;
        this.f5898w = i6;
        this.f5876B = c0874l2;
        this.f5875A = interfaceC0870h2;
        this.f5891Q = c0874l2 != null;
        this.f5887M = z5;
        this.f5899x = uri;
        this.f5878D = z8;
        this.f5880F = c0803w;
        this.f5879E = z7;
        this.f5881G = c1458c;
        this.f5882H = list;
        this.f5883I = c0699m;
        this.f5877C = c1457b;
        this.f5884J = c0409h;
        this.f5885K = c0798r;
        this.f5900y = z9;
        p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
        this.f5894T = p129f2.C1415c0.f5744p;
        this.f5897v = f5874W.getAndIncrement();
    }

    /* renamed from: f */
    public static byte[] m3276f(java.lang.String str) {
        if (p080U1.AbstractC0748a.m1361I(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new java.math.BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        java.lang.System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // p197u0.InterfaceC2224k
    /* renamed from: b */
    public final void mo3266b() {
        p132g0.C1457b c1457b;
        this.f5889O.getClass();
        if (this.f5888N == null && (c1457b = this.f5877C) != null) {
            p215y0.InterfaceC2403o mo1404d = c1457b.f5836a.mo1404d();
            if ((mo1404d instanceof p123e1.C1323E) || (mo1404d instanceof p073S0.C0636n)) {
                this.f5888N = this.f5877C;
                this.f5891Q = false;
            }
        }
        if (this.f5891Q) {
            p094Y.InterfaceC0870h interfaceC0870h = this.f5875A;
            interfaceC0870h.getClass();
            p094Y.C0874l c0874l = this.f5876B;
            c0874l.getClass();
            m3278e(interfaceC0870h, c0874l, this.f5887M, false);
            this.f5890P = 0;
            this.f5891Q = false;
        }
        if (this.f5892R) {
            return;
        }
        if (!this.f5879E) {
            m3278e(this.f8339t, this.f8332m, this.f5886L, true);
        }
        this.f5893S = !this.f5892R;
    }

    @Override // p197u0.InterfaceC2224k
    /* renamed from: c */
    public final void mo3267c() {
        this.f5892R = true;
    }

    @Override // p184r0.AbstractC2054l
    /* renamed from: d */
    public final boolean mo3277d() {
        throw null;
    }

    /* renamed from: e */
    public final void m3278e(p094Y.InterfaceC0870h interfaceC0870h, p094Y.C0874l c0874l, boolean z4, boolean z5) {
        p094Y.C0874l m1695a;
        long j4;
        long j5;
        if (z4) {
            r0 = this.f5890P != 0;
            m1695a = c0874l;
        } else {
            m1695a = c0874l.m1695a(this.f5890P);
        }
        try {
            p215y0.C2400l m3280h = m3280h(interfaceC0870h, m1695a, z5);
            if (r0) {
                m3280h.mo628e(this.f5890P);
            }
            while (!this.f5892R) {
                try {
                    try {
                        if (this.f5888N.f5836a.mo37l(m3280h, p132g0.C1457b.f5835f) != 0) {
                            break;
                        }
                    } catch (java.io.EOFException e4) {
                        if ((this.f8334o.f2401f & 16384) == 0) {
                            throw e4;
                        }
                        this.f5888N.f5836a.mo34b(0L, 0L);
                        j4 = m3280h.f9450o;
                        j5 = c0874l.f3139e;
                    }
                } catch (java.lang.Throwable th) {
                    this.f5890P = (int) (m3280h.f9450o - c0874l.f3139e);
                    throw th;
                }
            }
            j4 = m3280h.f9450o;
            j5 = c0874l.f3139e;
            this.f5890P = (int) (j4 - j5);
        } finally {
            p101a.AbstractC0936a.m1805m(interfaceC0870h);
        }
    }

    /* renamed from: g */
    public final int m3279g(int i4) {
        p086W.AbstractC0781a.m1421j(!this.f5900y);
        if (i4 >= this.f5894T.size()) {
            return 0;
        }
        return ((java.lang.Integer) this.f5894T.get(i4)).intValue();
    }

    /* renamed from: h */
    public final p215y0.C2400l m3280h(p094Y.InterfaceC0870h interfaceC0870h, p094Y.C0874l c0874l, boolean z4) {
        int i4;
        long j4;
        long j5;
        p086W.C0803w c0803w;
        long j6;
        p132g0.C1457b c1457b;
        java.util.ArrayList arrayList;
        p215y0.InterfaceC2403o c1327a;
        boolean z5;
        p083V0.InterfaceC0772j interfaceC0772j;
        boolean z6;
        int i5;
        p083V0.InterfaceC0772j interfaceC0772j2;
        int i6;
        p215y0.InterfaceC2403o c0574d;
        long mo1686b = interfaceC0870h.mo1686b(c0874l);
        long j7 = this.f8337r;
        p086W.C0803w c0803w2 = this.f5880F;
        if (z4) {
            try {
                c0803w2.m1579g(j7, this.f5878D);
            } catch (java.lang.InterruptedException unused) {
                throw new java.io.InterruptedIOException();
            } catch (java.util.concurrent.TimeoutException e4) {
                throw new java.io.IOException(e4);
            }
        }
        p215y0.C2400l c2400l = new p215y0.C2400l(interfaceC0870h, c0874l.f3139e, mo1686b);
        if (this.f5888N == null) {
            p086W.C0798r c0798r = this.f5885K;
            c2400l.f9452q = 0;
            try {
                c0798r.m1534D(10);
                c2400l.mo634p(c0798r.f2786a, 0, 10, false);
                if (c0798r.m1562x() == 4801587) {
                    c0798r.m1538H(3);
                    int m1558t = c0798r.m1558t();
                    int i7 = m1558t + 10;
                    byte[] bArr = c0798r.f2786a;
                    if (i7 > bArr.length) {
                        c0798r.m1534D(i7);
                        java.lang.System.arraycopy(bArr, 0, c0798r.f2786a, 0, 10);
                    }
                    c2400l.mo634p(c0798r.f2786a, 10, m1558t, false);
                    p076T.C0664G m881d0 = this.f5884J.m881d0(c0798r.f2786a, m1558t);
                    if (m881d0 != null) {
                        for (p076T.InterfaceC0663F interfaceC0663F : m881d0.f2198l) {
                            if (interfaceC0663F instanceof p049M0.C0414m) {
                                p049M0.C0414m c0414m = (p049M0.C0414m) interfaceC0663F;
                                if ("com.apple.streaming.transportStreamTimestamp".equals(c0414m.f1191m)) {
                                    java.lang.System.arraycopy(c0414m.f1192n, 0, c0798r.f2786a, 0, 8);
                                    c0798r.m1537G(0);
                                    c0798r.m1536F(8);
                                    j4 = c0798r.m1553o() & 8589934591L;
                                    break;
                                }
                            }
                        }
                    }
                }
            } catch (java.io.EOFException unused2) {
            }
            j4 = -9223372036854775807L;
            c2400l.f9452q = 0;
            p132g0.C1457b c1457b2 = this.f5877C;
            if (c1457b2 == null) {
                java.util.Map mo1689y = interfaceC0870h.mo1689y();
                p132g0.C1458c c1458c = this.f5881G;
                c1458c.getClass();
                p076T.C0702p c0702p = this.f8334o;
                int m3900A = p176p1.AbstractC1949a.m3900A(c0702p.f2408m);
                java.util.List list = (java.util.List) mo1689y.get("Content-Type");
                int m3900A2 = p176p1.AbstractC1949a.m3900A((list == null || list.isEmpty()) ? null : (java.lang.String) list.get(0));
                int m3901B = p176p1.AbstractC1949a.m3901B(c0874l.f3135a);
                java.util.ArrayList arrayList2 = new java.util.ArrayList(7);
                p132g0.C1458c.m3264a(m3900A, arrayList2);
                p132g0.C1458c.m3264a(m3900A2, arrayList2);
                p132g0.C1458c.m3264a(m3901B, arrayList2);
                int[] iArr = p132g0.C1458c.f5841d;
                int i8 = 0;
                for (int i9 = 7; i8 < i9; i9 = 7) {
                    p132g0.C1458c.m3264a(iArr[i8], arrayList2);
                    i8++;
                }
                c2400l.f9452q = 0;
                int i10 = 0;
                p215y0.InterfaceC2403o interfaceC2403o = null;
                while (true) {
                    int size = arrayList2.size();
                    p086W.C0803w c0803w3 = this.f5880F;
                    if (i10 >= size) {
                        j5 = j7;
                        c0803w = c0803w2;
                        j6 = j4;
                        i4 = 0;
                        interfaceC2403o.getClass();
                        c1457b = new p132g0.C1457b(interfaceC2403o, c0702p, c0803w3, c1458c.f5842b, c1458c.f5843c);
                        break;
                    }
                    int intValue = ((java.lang.Integer) arrayList2.get(i10)).intValue();
                    j5 = j7;
                    if (intValue == 0) {
                        c0803w = c0803w2;
                        j6 = j4;
                        arrayList = arrayList2;
                        c1327a = new p123e1.C1327a();
                    } else if (intValue == 1) {
                        c0803w = c0803w2;
                        j6 = j4;
                        arrayList = arrayList2;
                        c1327a = new p123e1.C1329c();
                    } else if (intValue == 2) {
                        c0803w = c0803w2;
                        j6 = j4;
                        arrayList = arrayList2;
                        c1327a = new p123e1.C1330d(0);
                    } else if (intValue != 7) {
                        p083V0.InterfaceC0772j interfaceC0772j3 = p083V0.InterfaceC0772j.f2711c;
                        java.util.List list2 = this.f5882H;
                        arrayList = arrayList2;
                        if (intValue == 8) {
                            c0803w = c0803w2;
                            j6 = j4;
                            p083V0.InterfaceC0772j interfaceC0772j4 = c1458c.f5842b;
                            boolean z7 = c1458c.f5843c;
                            p076T.C0664G c0664g = c0702p.f2406k;
                            if (c0664g != null) {
                                int i11 = 0;
                                p083V0.InterfaceC0772j interfaceC0772j5 = interfaceC0772j4;
                                while (true) {
                                    p076T.InterfaceC0663F[] interfaceC0663FArr = c0664g.f2198l;
                                    interfaceC0772j = interfaceC0772j5;
                                    if (i11 >= interfaceC0663FArr.length) {
                                        break;
                                    }
                                    p076T.InterfaceC0663F interfaceC0663F2 = interfaceC0663FArr[i11];
                                    if (interfaceC0663F2 instanceof p132g0.C1475t) {
                                        z6 = !((p132g0.C1475t) interfaceC0663F2).f6010n.isEmpty();
                                        break;
                                    }
                                    i11++;
                                    interfaceC0772j5 = interfaceC0772j;
                                }
                            } else {
                                interfaceC0772j = interfaceC0772j4;
                            }
                            z6 = false;
                            int i12 = z6 ? 4 : 0;
                            if (z7) {
                                i5 = i12;
                                interfaceC0772j2 = interfaceC0772j;
                            } else {
                                i5 = i12 | 32;
                                interfaceC0772j2 = interfaceC0772j3;
                            }
                            if (list2 == null) {
                                list2 = p129f2.C1415c0.f5744p;
                            }
                            c1327a = new p073S0.C0636n(interfaceC0772j2, i5, c0803w3, null, list2, null);
                        } else if (intValue == 11) {
                            c0803w = c0803w2;
                            p083V0.InterfaceC0772j interfaceC0772j6 = c1458c.f5842b;
                            boolean z8 = c1458c.f5843c;
                            if (list2 != null) {
                                i6 = 48;
                            } else {
                                p076T.C0701o c0701o = new p076T.C0701o();
                                c0701o.f2370l = p076T.AbstractC0665H.m1201l("application/cea-608");
                                list2 = java.util.Collections.singletonList(new p076T.C0702p(c0701o));
                                i6 = 16;
                            }
                            java.lang.String str = c0702p.f2405j;
                            j6 = j4;
                            if (!android.text.TextUtils.isEmpty(str)) {
                                if (p076T.AbstractC0665H.m1190a(str, "audio/mp4a-latm") == null) {
                                    i6 |= 2;
                                }
                                if (p076T.AbstractC0665H.m1190a(str, "video/avc") == null) {
                                    i6 |= 4;
                                }
                            }
                            c1327a = new p123e1.C1323E(2, !z8 ? 1 : 0, !z8 ? interfaceC0772j3 : interfaceC0772j6, c0803w3, new p123e1.C1332f(i6, list2));
                        } else if (intValue != 13) {
                            c0803w = c0803w2;
                            j6 = j4;
                            c1327a = null;
                        } else {
                            c0803w = c0803w2;
                            c1327a = new p132g0.C1476u(c0702p.f2399d, c0803w3, c1458c.f5842b, c1458c.f5843c);
                            j6 = j4;
                        }
                    } else {
                        c0803w = c0803w2;
                        j6 = j4;
                        arrayList = arrayList2;
                        c1327a = new p069R0.C0574d(0L, 0);
                    }
                    c1327a.getClass();
                    try {
                        z5 = c1327a.mo36k(c2400l);
                        i4 = 0;
                        c2400l.f9452q = 0;
                    } catch (java.io.EOFException unused3) {
                        i4 = 0;
                        c2400l.f9452q = 0;
                        z5 = false;
                    } catch (java.lang.Throwable th) {
                        c2400l.f9452q = 0;
                        throw th;
                    }
                    if (z5) {
                        c1457b = new p132g0.C1457b(c1327a, c0702p, c0803w3, c1458c.f5842b, c1458c.f5843c);
                        break;
                    }
                    if (interfaceC2403o == null && (intValue == m3900A || intValue == m3900A2 || intValue == m3901B || intValue == 11)) {
                        interfaceC2403o = c1327a;
                    }
                    i10++;
                    arrayList2 = arrayList;
                    j7 = j5;
                    c0803w2 = c0803w;
                    j4 = j6;
                }
            } else {
                p215y0.InterfaceC2403o interfaceC2403o2 = c1457b2.f5836a;
                p215y0.InterfaceC2403o mo1404d = interfaceC2403o2.mo1404d();
                p086W.AbstractC0781a.m1421j(!((mo1404d instanceof p123e1.C1323E) || (mo1404d instanceof p073S0.C0636n)));
                p086W.AbstractC0781a.m1420i("Can't recreate wrapped extractors. Outer type: " + interfaceC2403o2.getClass(), interfaceC2403o2.mo1404d() == interfaceC2403o2);
                boolean z9 = interfaceC2403o2 instanceof p132g0.C1476u;
                p046L1.C0363g c0363g = c1457b2.f5839d;
                if (z9) {
                    c0574d = new p132g0.C1476u(c1457b2.f5837b.f2399d, c1457b2.f5838c, c0363g, c1457b2.f5840e);
                } else if (interfaceC2403o2 instanceof p123e1.C1330d) {
                    c0574d = new p123e1.C1330d(0);
                } else if (interfaceC2403o2 instanceof p123e1.C1327a) {
                    c0574d = new p123e1.C1327a();
                } else if (interfaceC2403o2 instanceof p123e1.C1329c) {
                    c0574d = new p123e1.C1329c();
                } else {
                    if (!(interfaceC2403o2 instanceof p069R0.C0574d)) {
                        throw new java.lang.IllegalStateException("Unexpected extractor type for recreation: ".concat(interfaceC2403o2.getClass().getSimpleName()));
                    }
                    c0574d = new p069R0.C0574d(0);
                }
                c1457b = new p132g0.C1457b(c0574d, c1457b2.f5837b, c1457b2.f5838c, c0363g, c1457b2.f5840e);
                j5 = j7;
                c0803w = c0803w2;
                j6 = j4;
                i4 = 0;
            }
            this.f5888N = c1457b;
            p215y0.InterfaceC2403o mo1404d2 = c1457b.f5836a.mo1404d();
            if ((((mo1404d2 instanceof p123e1.C1330d) || (mo1404d2 instanceof p123e1.C1327a) || (mo1404d2 instanceof p123e1.C1329c) || (mo1404d2 instanceof p069R0.C0574d)) ? 1 : i4) != 0) {
                p132g0.C1473r c1473r = this.f5889O;
                long m1574b = j6 != -9223372036854775807L ? c0803w.m1574b(j6) : j5;
                if (c1473r.f5984g0 != m1574b) {
                    c1473r.f5984g0 = m1574b;
                    p132g0.C1472q[] c1472qArr = c1473r.f5958G;
                    int length = c1472qArr.length;
                    for (int i13 = i4; i13 < length; i13++) {
                        p132g0.C1472q c1472q = c1472qArr[i13];
                        if (c1472q.f8083F != m1574b) {
                            c1472q.f8083F = m1574b;
                            c1472q.f8110z = true;
                        }
                    }
                }
            } else {
                p132g0.C1473r c1473r2 = this.f5889O;
                if (c1473r2.f5984g0 != 0) {
                    c1473r2.f5984g0 = 0L;
                    p132g0.C1472q[] c1472qArr2 = c1473r2.f5958G;
                    int length2 = c1472qArr2.length;
                    for (int i14 = i4; i14 < length2; i14++) {
                        p132g0.C1472q c1472q2 = c1472qArr2[i14];
                        if (c1472q2.f8083F != 0) {
                            c1472q2.f8083F = 0L;
                            c1472q2.f8110z = true;
                        }
                    }
                }
            }
            this.f5889O.f5960I.clear();
            this.f5888N.f5836a.mo35g(this.f5889O);
        } else {
            i4 = 0;
        }
        p132g0.C1473r c1473r3 = this.f5889O;
        p076T.C0699m c0699m = c1473r3.f5985h0;
        p076T.C0699m c0699m2 = this.f5883I;
        if (!p086W.AbstractC0805y.m1606a(c0699m, c0699m2)) {
            c1473r3.f5985h0 = c0699m2;
            while (true) {
                p132g0.C1472q[] c1472qArr3 = c1473r3.f5958G;
                if (i4 >= c1472qArr3.length) {
                    break;
                }
                if (c1473r3.f5977Z[i4]) {
                    p132g0.C1472q c1472q3 = c1472qArr3[i4];
                    c1472q3.f5950I = c0699m2;
                    c1472q3.f8110z = true;
                }
                i4++;
            }
        }
        return c2400l;
    }
}
