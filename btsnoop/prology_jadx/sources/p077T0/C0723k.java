package p077T0;

/* renamed from: T0.k */
/* loaded from: classes.dex */
public final class C0723k extends p077T0.AbstractC0721i {

    /* renamed from: n */
    public p077T0.C0722j f2507n;

    /* renamed from: o */
    public int f2508o;

    /* renamed from: p */
    public boolean f2509p;

    /* renamed from: q */
    public p215y0.C2412x f2510q;

    /* renamed from: r */
    public p206w0.C2305a f2511r;

    @Override // p077T0.AbstractC0721i
    /* renamed from: a */
    public final void mo1313a(long j4) {
        this.f2495g = j4;
        this.f2509p = j4 != 0;
        p215y0.C2412x c2412x = this.f2510q;
        this.f2508o = c2412x != null ? c2412x.f9500e : 0;
    }

    @Override // p077T0.AbstractC0721i
    /* renamed from: b */
    public final long mo1303b(p086W.C0798r c0798r) {
        byte b4 = c0798r.f2786a[0];
        if ((b4 & 1) == 1) {
            return -1L;
        }
        p077T0.C0722j c0722j = this.f2507n;
        p086W.AbstractC0781a.m1422k(c0722j);
        boolean z4 = ((p078T2.C0737n[]) c0722j.f2506p)[(b4 >> 1) & (255 >>> (8 - c0722j.f2502l))].f2542a;
        p215y0.C2412x c2412x = (p215y0.C2412x) c0722j.f2503m;
        int i4 = !z4 ? c2412x.f9500e : c2412x.f9501f;
        long j4 = this.f2509p ? (this.f2508o + i4) / 4 : 0;
        byte[] bArr = c0798r.f2786a;
        int length = bArr.length;
        int i5 = c0798r.f2788c + 4;
        if (length < i5) {
            byte[] copyOf = java.util.Arrays.copyOf(bArr, i5);
            c0798r.m1535E(copyOf, copyOf.length);
        } else {
            c0798r.m1536F(i5);
        }
        byte[] bArr2 = c0798r.f2786a;
        int i6 = c0798r.f2788c;
        bArr2[i6 - 4] = (byte) (j4 & 255);
        bArr2[i6 - 3] = (byte) ((j4 >>> 8) & 255);
        bArr2[i6 - 2] = (byte) ((j4 >>> 16) & 255);
        bArr2[i6 - 1] = (byte) ((j4 >>> 24) & 255);
        this.f2509p = true;
        this.f2508o = i4;
        return j4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [T2.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v49, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v8, types: [y0.x, java.lang.Object] */
    @Override // p077T0.AbstractC0721i
    /* renamed from: c */
    public final boolean mo1304c(p086W.C0798r c0798r, long j4, p008B1.C0026d c0026d) {
        p077T0.C0722j c0722j;
        p215y0.C2412x c2412x;
        p215y0.C2412x c2412x2;
        byte[] bArr;
        long j5;
        if (this.f2507n != null) {
            ((p076T.C0702p) c0026d.f99m).getClass();
            return false;
        }
        p215y0.C2412x c2412x3 = this.f2510q;
        int i4 = 4;
        if (c2412x3 == null) {
            p215y0.AbstractC2390b.m4628w(1, c0798r, false);
            c0798r.m1551m();
            int m1559u = c0798r.m1559u();
            int m1551m = c0798r.m1551m();
            int m1548j = c0798r.m1548j();
            if (m1548j <= 0) {
                m1548j = -1;
            }
            int m1548j2 = c0798r.m1548j();
            int i5 = m1548j2 <= 0 ? -1 : m1548j2;
            c0798r.m1548j();
            int m1559u2 = c0798r.m1559u();
            int pow = (int) java.lang.Math.pow(2.0d, m1559u2 & 15);
            int pow2 = (int) java.lang.Math.pow(2.0d, (m1559u2 & 240) >> 4);
            c0798r.m1559u();
            ?? copyOf = java.util.Arrays.copyOf(c0798r.f2786a, c0798r.f2788c);
            ?? obj = new java.lang.Object();
            obj.f9496a = m1559u;
            obj.f9497b = m1551m;
            obj.f9498c = m1548j;
            obj.f9499d = i5;
            obj.f9500e = pow;
            obj.f9501f = pow2;
            obj.f9502g = copyOf;
            this.f2510q = obj;
        } else {
            p206w0.C2305a c2305a = this.f2511r;
            if (c2305a == null) {
                this.f2511r = p215y0.AbstractC2390b.m4627v(c0798r, true, true);
            } else {
                int i6 = c0798r.f2788c;
                byte[] bArr2 = new byte[i6];
                java.lang.System.arraycopy(c0798r.f2786a, 0, bArr2, 0, i6);
                int i7 = 5;
                p215y0.AbstractC2390b.m4628w(5, c0798r, false);
                int m1559u3 = c0798r.m1559u() + 1;
                p086W.C0797q c0797q = new p086W.C0797q(c0798r.f2786a);
                c0797q.m1529t(c0798r.f2787b * 8);
                int i8 = 0;
                while (true) {
                    int i9 = 2;
                    int i10 = 16;
                    if (i8 >= m1559u3) {
                        p215y0.C2412x c2412x4 = c2412x3;
                        byte[] bArr3 = bArr2;
                        int i11 = 6;
                        int m1518i = c0797q.m1518i(6) + 1;
                        for (int i12 = 0; i12 < m1518i; i12++) {
                            if (c0797q.m1518i(16) != 0) {
                                throw p076T.C0666I.m1202a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int m1518i2 = c0797q.m1518i(6) + 1;
                        int i13 = 0;
                        while (true) {
                            int i14 = 3;
                            if (i13 < m1518i2) {
                                int m1518i3 = c0797q.m1518i(i10);
                                if (m1518i3 == 0) {
                                    int i15 = 8;
                                    c0797q.m1529t(8);
                                    c0797q.m1529t(16);
                                    c0797q.m1529t(16);
                                    c0797q.m1529t(6);
                                    c0797q.m1529t(8);
                                    int m1518i4 = c0797q.m1518i(4) + 1;
                                    int i16 = 0;
                                    while (i16 < m1518i4) {
                                        c0797q.m1529t(i15);
                                        i16++;
                                        i15 = 8;
                                    }
                                } else {
                                    if (m1518i3 != 1) {
                                        throw p076T.C0666I.m1202a(null, "floor type greater than 1 not decodable: " + m1518i3);
                                    }
                                    int m1518i5 = c0797q.m1518i(5);
                                    int[] iArr = new int[m1518i5];
                                    int i17 = -1;
                                    for (int i18 = 0; i18 < m1518i5; i18++) {
                                        int m1518i6 = c0797q.m1518i(4);
                                        iArr[i18] = m1518i6;
                                        if (m1518i6 > i17) {
                                            i17 = m1518i6;
                                        }
                                    }
                                    int i19 = i17 + 1;
                                    int[] iArr2 = new int[i19];
                                    int i20 = 0;
                                    while (i20 < i19) {
                                        iArr2[i20] = c0797q.m1518i(i14) + 1;
                                        int m1518i7 = c0797q.m1518i(i9);
                                        int i21 = 8;
                                        if (m1518i7 > 0) {
                                            c0797q.m1529t(8);
                                        }
                                        int i22 = 0;
                                        while (i22 < (1 << m1518i7)) {
                                            c0797q.m1529t(i21);
                                            i22++;
                                            i21 = 8;
                                        }
                                        i20++;
                                        i14 = 3;
                                        i9 = 2;
                                    }
                                    c0797q.m1529t(i9);
                                    int m1518i8 = c0797q.m1518i(4);
                                    int i23 = 0;
                                    int i24 = 0;
                                    for (int i25 = 0; i25 < m1518i5; i25++) {
                                        i23 += iArr2[iArr[i25]];
                                        while (i24 < i23) {
                                            c0797q.m1529t(m1518i8);
                                            i24++;
                                        }
                                    }
                                }
                                i13++;
                                i11 = 6;
                                i10 = 16;
                                i9 = 2;
                            } else {
                                int m1518i9 = c0797q.m1518i(i11) + 1;
                                int i26 = 0;
                                while (i26 < m1518i9) {
                                    if (c0797q.m1518i(16) > 2) {
                                        throw p076T.C0666I.m1202a(null, "residueType greater than 2 is not decodable");
                                    }
                                    c0797q.m1529t(24);
                                    c0797q.m1529t(24);
                                    c0797q.m1529t(24);
                                    int m1518i10 = c0797q.m1518i(i11) + 1;
                                    int i27 = 8;
                                    c0797q.m1529t(8);
                                    int[] iArr3 = new int[m1518i10];
                                    for (int i28 = 0; i28 < m1518i10; i28++) {
                                        iArr3[i28] = ((c0797q.m1517h() ? c0797q.m1518i(5) : 0) * 8) + c0797q.m1518i(3);
                                    }
                                    int i29 = 0;
                                    while (i29 < m1518i10) {
                                        int i30 = 0;
                                        while (i30 < i27) {
                                            if ((iArr3[i29] & (1 << i30)) != 0) {
                                                c0797q.m1529t(i27);
                                            }
                                            i30++;
                                            i27 = 8;
                                        }
                                        i29++;
                                        i27 = 8;
                                    }
                                    i26++;
                                    i11 = 6;
                                }
                                int m1518i11 = c0797q.m1518i(i11) + 1;
                                int i31 = 0;
                                while (i31 < m1518i11) {
                                    int m1518i12 = c0797q.m1518i(16);
                                    if (m1518i12 != 0) {
                                        p086W.AbstractC0781a.m1425n("VorbisUtil", "mapping type other than 0 not supported: " + m1518i12);
                                        c2412x = c2412x4;
                                    } else {
                                        int m1518i13 = c0797q.m1517h() ? c0797q.m1518i(4) + 1 : 1;
                                        boolean m1517h = c0797q.m1517h();
                                        c2412x = c2412x4;
                                        int i32 = c2412x.f9496a;
                                        if (m1517h) {
                                            int m1518i14 = c0797q.m1518i(8) + 1;
                                            for (int i33 = 0; i33 < m1518i14; i33++) {
                                                int i34 = i32 - 1;
                                                c0797q.m1529t(p215y0.AbstractC2390b.m4619n(i34));
                                                c0797q.m1529t(p215y0.AbstractC2390b.m4619n(i34));
                                            }
                                        }
                                        if (c0797q.m1518i(2) != 0) {
                                            throw p076T.C0666I.m1202a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (m1518i13 > 1) {
                                            for (int i35 = 0; i35 < i32; i35++) {
                                                c0797q.m1529t(4);
                                            }
                                        }
                                        for (int i36 = 0; i36 < m1518i13; i36++) {
                                            c0797q.m1529t(8);
                                            c0797q.m1529t(8);
                                            c0797q.m1529t(8);
                                        }
                                    }
                                    i31++;
                                    c2412x4 = c2412x;
                                }
                                p215y0.C2412x c2412x5 = c2412x4;
                                int m1518i15 = c0797q.m1518i(6);
                                int i37 = m1518i15 + 1;
                                p078T2.C0737n[] c0737nArr = new p078T2.C0737n[i37];
                                for (int i38 = 0; i38 < i37; i38++) {
                                    boolean m1517h2 = c0797q.m1517h();
                                    c0797q.m1518i(16);
                                    c0797q.m1518i(16);
                                    c0797q.m1518i(8);
                                    ?? obj2 = new java.lang.Object();
                                    obj2.f2542a = m1517h2;
                                    c0737nArr[i38] = obj2;
                                }
                                if (!c0797q.m1517h()) {
                                    throw p076T.C0666I.m1202a(null, "framing bit after modes not set as expected");
                                }
                                c0722j = new p077T0.C0722j(c2412x5, c2305a, bArr3, c0737nArr, p215y0.AbstractC2390b.m4619n(m1518i15));
                            }
                        }
                    } else {
                        if (c0797q.m1518i(24) != 5653314) {
                            throw p076T.C0666I.m1202a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((c0797q.f2780c * 8) + c0797q.f2782e));
                        }
                        int m1518i16 = c0797q.m1518i(16);
                        int m1518i17 = c0797q.m1518i(24);
                        if (c0797q.m1517h()) {
                            c0797q.m1529t(i7);
                            for (int i39 = 0; i39 < m1518i17; i39 += c0797q.m1518i(p215y0.AbstractC2390b.m4619n(m1518i17 - i39))) {
                            }
                        } else {
                            boolean m1517h3 = c0797q.m1517h();
                            for (int i40 = 0; i40 < m1518i17; i40++) {
                                if (!m1517h3) {
                                    c0797q.m1529t(i7);
                                } else if (c0797q.m1517h()) {
                                    c0797q.m1529t(i7);
                                }
                            }
                        }
                        int m1518i18 = c0797q.m1518i(i4);
                        if (m1518i18 > 2) {
                            throw p076T.C0666I.m1202a(null, "lookup type greater than 2 not decodable: " + m1518i18);
                        }
                        if (m1518i18 == 1 || m1518i18 == 2) {
                            c0797q.m1529t(32);
                            c0797q.m1529t(32);
                            int m1518i19 = c0797q.m1518i(i4) + 1;
                            c0797q.m1529t(1);
                            if (m1518i18 != 1) {
                                c2412x2 = c2412x3;
                                bArr = bArr2;
                                j5 = m1518i17 * m1518i16;
                            } else if (m1518i16 != 0) {
                                c2412x2 = c2412x3;
                                bArr = bArr2;
                                j5 = (long) java.lang.Math.floor(java.lang.Math.pow(m1518i17, 1.0d / m1518i16));
                            } else {
                                c2412x2 = c2412x3;
                                bArr = bArr2;
                                j5 = 0;
                            }
                            c0797q.m1529t((int) (j5 * m1518i19));
                        } else {
                            c2412x2 = c2412x3;
                            bArr = bArr2;
                        }
                        i8++;
                        c2412x3 = c2412x2;
                        bArr2 = bArr;
                        i4 = 4;
                        i7 = 5;
                    }
                }
            }
        }
        c0722j = null;
        this.f2507n = c0722j;
        if (c0722j == null) {
            return true;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p215y0.C2412x c2412x6 = (p215y0.C2412x) c0722j.f2503m;
        arrayList.add((byte[]) c2412x6.f9502g);
        arrayList.add((byte[]) c0722j.f2505o);
        p076T.C0664G m4624s = p215y0.AbstractC2390b.m4624s(p129f2.AbstractC1393I.m3163k((java.lang.String[]) ((p206w0.C2305a) c0722j.f2504n).f9102l));
        p076T.C0701o c0701o = new p076T.C0701o();
        c0701o.f2370l = p076T.AbstractC0665H.m1201l("audio/vorbis");
        c0701o.f2365g = c2412x6.f9499d;
        c0701o.f2366h = c2412x6.f9498c;
        c0701o.f2384z = c2412x6.f9496a;
        c0701o.f2350A = c2412x6.f9497b;
        c0701o.f2373o = arrayList;
        c0701o.f2368j = m4624s;
        c0026d.f99m = new p076T.C0702p(c0701o);
        return true;
    }

    @Override // p077T0.AbstractC0721i
    /* renamed from: d */
    public final void mo1305d(boolean z4) {
        super.mo1305d(z4);
        if (z4) {
            this.f2507n = null;
            this.f2510q = null;
            this.f2511r = null;
        }
        this.f2508o = 0;
        this.f2509p = false;
    }
}
