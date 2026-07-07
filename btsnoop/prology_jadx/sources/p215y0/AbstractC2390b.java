package p215y0;

/* renamed from: y0.b */
/* loaded from: classes.dex */
public abstract class AbstractC2390b {

    /* renamed from: a */
    public static final int[] f9373a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b */
    public static final int[] f9374b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: c */
    public static final int[] f9375c = {1, 2, 3, 6};

    /* renamed from: d */
    public static final int[] f9376d = {48000, 44100, 32000};

    /* renamed from: e */
    public static final int[] f9377e = {24000, 22050, 16000};

    /* renamed from: f */
    public static final int[] f9378f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: g */
    public static final int[] f9379g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: h */
    public static final int[] f9380h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: i */
    public static final int[] f9381i = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: j */
    public static final int[] f9382j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: k */
    public static final int[] f9383k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: l */
    public static final int[] f9384l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: m */
    public static final int[] f9385m = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: n */
    public static final int[] f9386n = {5, 8, 10, 12};

    /* renamed from: o */
    public static final int[] f9387o = {6, 9, 12, 15};

    /* renamed from: p */
    public static final int[] f9388p = {2, 4, 6, 8};

    /* renamed from: q */
    public static final int[] f9389q = {9, 11, 13, 16};

    /* renamed from: r */
    public static final int[] f9390r = {5, 8, 10, 12};

    /* renamed from: s */
    public static final java.lang.String[] f9391s = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: t */
    public static final int[] f9392t = {44100, 48000, 32000};

    /* renamed from: u */
    public static final int[] f9393u = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: v */
    public static final int[] f9394v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: w */
    public static final int[] f9395w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: x */
    public static final int[] f9396x = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: y */
    public static final int[] f9397y = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: a */
    public static byte[] m4606a(int i4, int i5) {
        int i6 = -1;
        for (int i7 = 0; i7 < 13; i7++) {
            if (i4 == f9373a[i7]) {
                i6 = i7;
            }
        }
        int i8 = -1;
        for (int i9 = 0; i9 < 16; i9++) {
            if (i5 == f9374b[i9]) {
                i8 = i9;
            }
        }
        if (i4 == -1 || i8 == -1) {
            throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m150i(i4, i5, "Invalid sample rate or number of channels: ", ", "));
        }
        return m4607b(2, i6, i8);
    }

    /* renamed from: b */
    public static byte[] m4607b(int i4, int i5, int i6) {
        return new byte[]{(byte) (((i4 << 3) & 248) | ((i5 >> 1) & 7)), (byte) (((i5 << 7) & 128) | ((i6 << 3) & 120))};
    }

    /* renamed from: c */
    public static java.util.ArrayList m4608c(byte[] bArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        if (r13 == r21.f9471f) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
    
        if ((r20.m1559u() * 1000) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a5, code lost:
    
        if (r6 == r1) goto L52;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m4609d(p086W.C0798r r20, p215y0.C2407s r21, int r22, p076T.C0706t r23) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p215y0.AbstractC2390b.m4609d(W.r, y0.s, int, T.t):boolean");
    }

    /* renamed from: e */
    public static void m4610e(java.lang.String str, boolean z4) {
        if (!z4) {
            throw p076T.C0666I.m1202a(null, str);
        }
    }

    /* renamed from: f */
    public static void m4611f(long j4, p086W.C0798r c0798r, p215y0.InterfaceC2387F[] interfaceC2387FArr) {
        int i4;
        while (true) {
            if (c0798r.m1539a() <= 1) {
                return;
            }
            int i5 = 0;
            while (true) {
                if (c0798r.m1539a() == 0) {
                    i4 = -1;
                    break;
                }
                int m1559u = c0798r.m1559u();
                i5 += m1559u;
                if (m1559u != 255) {
                    i4 = i5;
                    break;
                }
            }
            int i6 = 0;
            while (true) {
                if (c0798r.m1539a() == 0) {
                    i6 = -1;
                    break;
                }
                int m1559u2 = c0798r.m1559u();
                i6 += m1559u2;
                if (m1559u2 != 255) {
                    break;
                }
            }
            int i7 = c0798r.f2787b + i6;
            if (i6 == -1 || i6 > c0798r.m1539a()) {
                p086W.AbstractC0781a.m1410A("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i7 = c0798r.f2788c;
            } else if (i4 == 4 && i6 >= 8) {
                int m1559u3 = c0798r.m1559u();
                int m1531A = c0798r.m1531A();
                int m1546h = m1531A == 49 ? c0798r.m1546h() : 0;
                int m1559u4 = c0798r.m1559u();
                if (m1531A == 47) {
                    c0798r.m1538H(1);
                }
                boolean z4 = m1559u3 == 181 && (m1531A == 49 || m1531A == 47) && m1559u4 == 3;
                if (m1531A == 49) {
                    z4 &= m1546h == 1195456820;
                }
                if (z4) {
                    m4612g(j4, c0798r, interfaceC2387FArr);
                }
            }
            c0798r.m1537G(i7);
        }
    }

    /* renamed from: g */
    public static void m4612g(long j4, p086W.C0798r c0798r, p215y0.InterfaceC2387F[] interfaceC2387FArr) {
        int m1559u = c0798r.m1559u();
        if ((m1559u & 64) != 0) {
            c0798r.m1538H(1);
            int i4 = (m1559u & 31) * 3;
            int i5 = c0798r.f2787b;
            for (p215y0.InterfaceC2387F interfaceC2387F : interfaceC2387FArr) {
                c0798r.m1537G(i5);
                interfaceC2387F.mo1405a(c0798r, i4, 0);
                p086W.AbstractC0781a.m1421j(j4 != -9223372036854775807L);
                interfaceC2387F.mo1406b(j4, 1, i4, 0, null);
            }
        }
    }

    /* renamed from: h */
    public static int m4613h(int i4, int i5) {
        int i6 = i5 / 2;
        if (i4 < 0 || i4 >= 3 || i5 < 0 || i6 >= 19) {
            return -1;
        }
        int i7 = f9376d[i4];
        if (i7 == 44100) {
            return ((i5 % 2) + f9380h[i6]) * 2;
        }
        int i8 = f9379g[i6];
        return i7 == 32000 ? i8 * 6 : i8 * 4;
    }

    /* renamed from: i */
    public static void m4614i(int i4, p086W.C0798r c0798r) {
        c0798r.m1534D(7);
        byte[] bArr = c0798r.f2786a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i4 >> 16) & 255);
        bArr[5] = (byte) ((i4 >> 8) & 255);
        bArr[6] = (byte) (i4 & 255);
    }

    /* renamed from: j */
    public static int m4615j(int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (!((i4 & (-2097152)) == -2097152) || (i5 = (i4 >>> 19) & 3) == 1 || (i6 = (i4 >>> 17) & 3) == 0 || (i7 = (i4 >>> 12) & 15) == 0 || i7 == 15 || (i8 = (i4 >>> 10) & 3) == 3) {
            return -1;
        }
        int i9 = f9392t[i8];
        if (i5 == 2) {
            i9 /= 2;
        } else if (i5 == 0) {
            i9 /= 4;
        }
        int i10 = (i4 >>> 9) & 1;
        if (i6 == 3) {
            return ((((i5 == 3 ? f9393u[i7 - 1] : f9394v[i7 - 1]) * 12) / i9) + i10) * 4;
        }
        int i11 = i5 == 3 ? i6 == 2 ? f9395w[i7 - 1] : f9396x[i7 - 1] : f9397y[i7 - 1];
        if (i5 == 3) {
            return ((i11 * 144) / i9) + i10;
        }
        return (((i6 == 1 ? 72 : 144) * i11) / i9) + i10;
    }

    /* renamed from: k */
    public static p086W.C0797q m4616k(byte[] bArr) {
        byte b4 = bArr[0];
        if (b4 == Byte.MAX_VALUE || b4 == 100 || b4 == 64 || b4 == 113) {
            return new p086W.C0797q(bArr, bArr.length);
        }
        byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        byte b5 = copyOf[0];
        if (b5 == -2 || b5 == -1 || b5 == 37 || b5 == -14 || b5 == -24) {
            for (int i4 = 0; i4 < copyOf.length - 1; i4 += 2) {
                byte b6 = copyOf[i4];
                int i5 = i4 + 1;
                copyOf[i4] = copyOf[i5];
                copyOf[i5] = b6;
            }
        }
        p086W.C0797q c0797q = new p086W.C0797q(copyOf, copyOf.length);
        if (copyOf[0] == 31) {
            p086W.C0797q c0797q2 = new p086W.C0797q(copyOf, copyOf.length);
            while (c0797q2.m1511b() >= 16) {
                c0797q2.m1529t(2);
                int m1518i = c0797q2.m1518i(14) & 16383;
                int min = java.lang.Math.min(8 - c0797q.f2780c, 14);
                int i6 = c0797q.f2780c;
                int i7 = (8 - i6) - min;
                byte[] bArr2 = c0797q.f2781d;
                int i8 = c0797q.f2779b;
                byte b7 = (byte) (((65280 >> i6) | ((1 << i7) - 1)) & bArr2[i8]);
                bArr2[i8] = b7;
                int i9 = 14 - min;
                bArr2[i8] = (byte) (b7 | ((m1518i >>> i9) << i7));
                int i10 = i8 + 1;
                while (i9 > 8) {
                    c0797q.f2781d[i10] = (byte) (m1518i >>> (i9 - 8));
                    i9 -= 8;
                    i10++;
                }
                int i11 = 8 - i9;
                byte[] bArr3 = c0797q.f2781d;
                byte b8 = (byte) (bArr3[i10] & ((1 << i11) - 1));
                bArr3[i10] = b8;
                bArr3[i10] = (byte) (((m1518i & ((1 << i9) - 1)) << i11) | b8);
                c0797q.m1529t(14);
                c0797q.m1510a();
            }
        }
        c0797q.m1525p(copyOf, copyOf.length);
        return c0797q;
    }

    /* renamed from: l */
    public static long m4617l(byte b4, byte b5) {
        int i4;
        int i5 = b4 & 255;
        int i6 = b4 & 3;
        if (i6 != 0) {
            i4 = 2;
            if (i6 != 1 && i6 != 2) {
                i4 = b5 & 63;
            }
        } else {
            i4 = 1;
        }
        int i7 = i5 >> 3;
        return i4 * (i7 >= 16 ? 2500 << r6 : i7 >= 12 ? 10000 << (i7 & 1) : (i7 & 3) == 3 ? 60000 : 10000 << r6);
    }

    /* renamed from: m */
    public static int m4618m(p086W.C0797q c0797q) {
        int m1518i = c0797q.m1518i(4);
        if (m1518i == 15) {
            if (c0797q.m1511b() >= 24) {
                return c0797q.m1518i(24);
            }
            throw p076T.C0666I.m1202a(null, "AAC header insufficient data");
        }
        if (m1518i < 13) {
            return f9373a[m1518i];
        }
        throw p076T.C0666I.m1202a(null, "AAC header wrong Sampling Frequency Index");
    }

    /* renamed from: n */
    public static int m4619n(int i4) {
        int i5 = 0;
        while (i4 > 0) {
            i5++;
            i4 >>>= 1;
        }
        return i5;
    }

    /* renamed from: o */
    public static p215y0.C2391c m4620o(p086W.C0797q c0797q) {
        int m4613h;
        int i4;
        int i5;
        java.lang.String str;
        int i6;
        int i7;
        int i8;
        int m1518i;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int m1516g = c0797q.m1516g();
        c0797q.m1529t(40);
        boolean z4 = c0797q.m1518i(5) > 10;
        c0797q.m1526q(m1516g);
        int[] iArr = f9378f;
        int[] iArr2 = f9376d;
        if (z4) {
            c0797q.m1529t(16);
            int m1518i2 = c0797q.m1518i(2);
            if (m1518i2 == 0) {
                r9 = 0;
            } else if (m1518i2 == 1) {
                r9 = 1;
            } else if (m1518i2 == 2) {
                r9 = 2;
            }
            c0797q.m1529t(3);
            m4613h = (c0797q.m1518i(11) + 1) * 2;
            int m1518i3 = c0797q.m1518i(2);
            if (m1518i3 == 3) {
                i9 = f9377e[c0797q.m1518i(2)];
                m1518i = 3;
                i10 = 6;
            } else {
                m1518i = c0797q.m1518i(2);
                int i17 = f9375c[m1518i];
                i9 = iArr2[m1518i3];
                i10 = i17;
            }
            int i18 = i10 * 256;
            int i19 = (m4613h * i9) / (i10 * 32);
            int m1518i4 = c0797q.m1518i(3);
            boolean m1517h = c0797q.m1517h();
            int i20 = iArr[m1518i4] + (m1517h ? 1 : 0);
            c0797q.m1529t(10);
            if (c0797q.m1517h()) {
                c0797q.m1529t(8);
            }
            if (m1518i4 == 0) {
                c0797q.m1529t(5);
                if (c0797q.m1517h()) {
                    c0797q.m1529t(8);
                }
            }
            if (r9 == 1 && c0797q.m1517h()) {
                c0797q.m1529t(16);
            }
            if (c0797q.m1517h()) {
                if (m1518i4 > 2) {
                    c0797q.m1529t(2);
                }
                if ((m1518i4 & 1) == 0 || m1518i4 <= 2) {
                    i13 = 6;
                } else {
                    i13 = 6;
                    c0797q.m1529t(6);
                }
                if ((m1518i4 & 4) != 0) {
                    c0797q.m1529t(i13);
                }
                if (m1517h && c0797q.m1517h()) {
                    c0797q.m1529t(5);
                }
                if (r9 == 0) {
                    if (c0797q.m1517h()) {
                        i14 = 6;
                        c0797q.m1529t(6);
                    } else {
                        i14 = 6;
                    }
                    if (m1518i4 == 0 && c0797q.m1517h()) {
                        c0797q.m1529t(i14);
                    }
                    if (c0797q.m1517h()) {
                        c0797q.m1529t(i14);
                    }
                    int m1518i5 = c0797q.m1518i(2);
                    if (m1518i5 == 1) {
                        c0797q.m1529t(5);
                        i16 = 2;
                    } else {
                        if (m1518i5 == 2) {
                            c0797q.m1529t(12);
                        } else if (m1518i5 == 3) {
                            int m1518i6 = c0797q.m1518i(5);
                            if (c0797q.m1517h()) {
                                c0797q.m1529t(5);
                                if (c0797q.m1517h()) {
                                    c0797q.m1529t(4);
                                }
                                if (c0797q.m1517h()) {
                                    c0797q.m1529t(4);
                                }
                                if (c0797q.m1517h()) {
                                    c0797q.m1529t(4);
                                }
                                if (c0797q.m1517h()) {
                                    c0797q.m1529t(4);
                                }
                                if (c0797q.m1517h()) {
                                    c0797q.m1529t(4);
                                }
                                if (c0797q.m1517h()) {
                                    c0797q.m1529t(4);
                                }
                                if (c0797q.m1517h()) {
                                    c0797q.m1529t(4);
                                }
                                if (c0797q.m1517h()) {
                                    if (c0797q.m1517h()) {
                                        c0797q.m1529t(4);
                                    }
                                    if (c0797q.m1517h()) {
                                        c0797q.m1529t(4);
                                    }
                                }
                            }
                            if (c0797q.m1517h()) {
                                c0797q.m1529t(5);
                                if (c0797q.m1517h()) {
                                    c0797q.m1529t(7);
                                    if (c0797q.m1517h()) {
                                        i15 = 8;
                                        c0797q.m1529t(8);
                                        i16 = 2;
                                        c0797q.m1529t((m1518i6 + 2) * i15);
                                        c0797q.m1512c();
                                    }
                                }
                            }
                            i15 = 8;
                            i16 = 2;
                            c0797q.m1529t((m1518i6 + 2) * i15);
                            c0797q.m1512c();
                        }
                        i16 = 2;
                    }
                    if (m1518i4 < i16) {
                        if (c0797q.m1517h()) {
                            c0797q.m1529t(14);
                        }
                        if (m1518i4 == 0 && c0797q.m1517h()) {
                            c0797q.m1529t(14);
                        }
                    }
                    if (c0797q.m1517h()) {
                        if (m1518i == 0) {
                            c0797q.m1529t(5);
                        } else {
                            for (int i21 = 0; i21 < i10; i21++) {
                                if (c0797q.m1517h()) {
                                    c0797q.m1529t(5);
                                }
                            }
                        }
                    }
                }
            }
            if (c0797q.m1517h()) {
                c0797q.m1529t(5);
                if (m1518i4 == 2) {
                    c0797q.m1529t(4);
                }
                if (m1518i4 >= 6) {
                    c0797q.m1529t(2);
                }
                if (c0797q.m1517h()) {
                    i12 = 8;
                    c0797q.m1529t(8);
                } else {
                    i12 = 8;
                }
                if (m1518i4 == 0 && c0797q.m1517h()) {
                    c0797q.m1529t(i12);
                }
                if (m1518i3 < 3) {
                    c0797q.m1528s();
                }
            }
            if (r9 == 0 && m1518i != 3) {
                c0797q.m1528s();
            }
            if (r9 == 2 && (m1518i == 3 || c0797q.m1517h())) {
                i11 = 6;
                c0797q.m1529t(6);
            } else {
                i11 = 6;
            }
            str = (c0797q.m1517h() && c0797q.m1518i(i11) == 1 && c0797q.m1518i(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i5 = i20;
            i7 = i9;
            i8 = i18;
            i6 = i19;
        } else {
            c0797q.m1529t(32);
            int m1518i7 = c0797q.m1518i(2);
            java.lang.String str2 = m1518i7 == 3 ? null : "audio/ac3";
            int m1518i8 = c0797q.m1518i(6);
            int i22 = f9379g[m1518i8 / 2] * 1000;
            m4613h = m4613h(m1518i7, m1518i8);
            c0797q.m1529t(8);
            int m1518i9 = c0797q.m1518i(3);
            if ((m1518i9 & 1) == 0 || m1518i9 == 1) {
                i4 = 2;
            } else {
                i4 = 2;
                c0797q.m1529t(2);
            }
            if ((m1518i9 & 4) != 0) {
                c0797q.m1529t(i4);
            }
            if (m1518i9 == i4) {
                c0797q.m1529t(i4);
            }
            r9 = m1518i7 < 3 ? iArr2[m1518i7] : -1;
            i5 = iArr[m1518i9] + (c0797q.m1517h() ? 1 : 0);
            str = str2;
            i6 = i22;
            i7 = r9;
            i8 = 1536;
        }
        return new p215y0.C2391c(str, i5, i7, m4613h, i8, i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r9.m1517h() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r2 = r9.m1518i(10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r9.m1517h() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r9.m1518i(3) <= 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        r9.m1529t(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r9.m1517h() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r5 = 48000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        r9 = r9.m1518i(4);
        r8 = p215y0.AbstractC2390b.f9381i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (r5 != 44100) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r9 != 13) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        r9 = r8[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
    
        return new p002A0.C0005c(r5, r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        if (r5 != 48000) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        if (r9 >= 14) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        r6 = r8[r9];
        r2 = r2 % 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        if (r2 == 1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
    
        if (r2 == 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
    
        if (r2 == 3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007a, code lost:
    
        if (r2 == 4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
    
        if (r9 == 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
    
        if (r9 == 8) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
    
        r9 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0086, code lost:
    
        if (r9 == 8) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        if (r9 == 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        if (r9 != 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0092, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0055, code lost:
    
        r5 = 44100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r9.m1518i(2) == 3) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r9.m1518i(2);
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p002A0.C0005c m4621p(p086W.C0797q r9) {
        /*
            r0 = 16
            int r1 = r9.m1518i(r0)
            int r0 = r9.m1518i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.m1518i(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.m1518i(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.m1518i(r1)
            boolean r2 = r9.m1517h()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.m1518i(r2)
            boolean r5 = r9.m1517h()
            if (r5 == 0) goto L47
            int r5 = r9.m1518i(r4)
            if (r5 <= 0) goto L47
            r9.m1529t(r1)
        L47:
            boolean r5 = r9.m1517h()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L55
            r5 = r7
            goto L56
        L55:
            r5 = r6
        L56:
            int r9 = r9.m1518i(r3)
            int[] r8 = p215y0.AbstractC2390b.f9381i
            if (r5 != r6) goto L65
            r6 = 13
            if (r9 != r6) goto L65
            r9 = r8[r9]
            goto L93
        L65:
            if (r5 != r7) goto L92
            r6 = 14
            if (r9 >= r6) goto L92
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 1
            r8 = 8
            if (r2 == r7) goto L8b
            r7 = 11
            if (r2 == r1) goto L86
            if (r2 == r4) goto L8b
            if (r2 == r3) goto L7d
            goto L90
        L7d:
            if (r9 == r4) goto L83
            if (r9 == r8) goto L83
            if (r9 != r7) goto L90
        L83:
            int r9 = r6 + 1
            goto L93
        L86:
            if (r9 == r8) goto L83
            if (r9 != r7) goto L90
            goto L83
        L8b:
            if (r9 == r4) goto L83
            if (r9 != r8) goto L90
            goto L83
        L90:
            r9 = r6
            goto L93
        L92:
            r9 = 0
        L93:
            A0.c r1 = new A0.c
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p215y0.AbstractC2390b.m4621p(W.q):A0.c");
    }

    /* renamed from: q */
    public static p215y0.C2389a m4622q(p086W.C0797q c0797q, boolean z4) {
        int m1518i = c0797q.m1518i(5);
        if (m1518i == 31) {
            m1518i = c0797q.m1518i(6) + 32;
        }
        int m4618m = m4618m(c0797q);
        int m1518i2 = c0797q.m1518i(4);
        java.lang.String m152k = p009B2.AbstractC0051h.m152k("mp4a.40.", m1518i);
        if (m1518i == 5 || m1518i == 29) {
            m4618m = m4618m(c0797q);
            int m1518i3 = c0797q.m1518i(5);
            if (m1518i3 == 31) {
                m1518i3 = c0797q.m1518i(6) + 32;
            }
            m1518i = m1518i3;
            if (m1518i == 22) {
                m1518i2 = c0797q.m1518i(4);
            }
        }
        if (z4) {
            if (m1518i != 1 && m1518i != 2 && m1518i != 3 && m1518i != 4 && m1518i != 6 && m1518i != 7 && m1518i != 17) {
                switch (m1518i) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw p076T.C0666I.m1204c("Unsupported audio object type: " + m1518i);
                }
            }
            if (c0797q.m1517h()) {
                p086W.AbstractC0781a.m1410A("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (c0797q.m1517h()) {
                c0797q.m1529t(14);
            }
            boolean m1517h = c0797q.m1517h();
            if (m1518i2 == 0) {
                throw new java.lang.UnsupportedOperationException();
            }
            if (m1518i == 6 || m1518i == 20) {
                c0797q.m1529t(3);
            }
            if (m1517h) {
                if (m1518i == 22) {
                    c0797q.m1529t(16);
                }
                if (m1518i == 17 || m1518i == 19 || m1518i == 20 || m1518i == 23) {
                    c0797q.m1529t(3);
                }
                c0797q.m1529t(1);
            }
            switch (m1518i) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int m1518i4 = c0797q.m1518i(2);
                    if (m1518i4 == 2 || m1518i4 == 3) {
                        throw p076T.C0666I.m1204c("Unsupported epConfig: " + m1518i4);
                    }
            }
        }
        int i4 = f9374b[m1518i2];
        if (i4 != -1) {
            return new p215y0.C2389a(m4618m, i4, m152k);
        }
        throw p076T.C0666I.m1202a(null, null);
    }

    /* renamed from: r */
    public static int m4623r(p086W.C0797q c0797q, int[] iArr) {
        int i4 = 0;
        for (int i5 = 0; i5 < 3 && c0797q.m1517h(); i5++) {
            i4++;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < i4; i7++) {
            i6 += 1 << iArr[i7];
        }
        return c0797q.m1518i(iArr[i4]) + i6;
    }

    /* renamed from: s */
    public static p076T.C0664G m4624s(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i4 = 0; i4 < list.size(); i4++) {
            java.lang.String str = (java.lang.String) list.get(i4);
            int i5 = p086W.AbstractC0805y.f2801a;
            java.lang.String[] split = str.split("=", 2);
            if (split.length != 2) {
                p086W.AbstractC0781a.m1410A("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(p041K0.C0322a.m716d(new p086W.C0798r(android.util.Base64.decode(split[1], 0))));
                } catch (java.lang.RuntimeException e4) {
                    p086W.AbstractC0781a.m1411B("VorbisUtil", "Failed to parse vorbis picture", e4);
                }
            } else {
                arrayList.add(new p041K0.C0323b(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new p076T.C0664G(arrayList);
    }

    /* renamed from: t */
    public static int m4625t(int i4, p086W.C0798r c0798r) {
        switch (i4) {
            case 1:
                return 192;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                return 576 << (i4 - 2);
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                return c0798r.m1559u() + 1;
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                return c0798r.m1531A() + 1;
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i4 - 8);
            default:
                return -1;
        }
    }

    /* renamed from: u */
    public static p200u3.C2259m m4626u(p086W.C0798r c0798r) {
        c0798r.m1538H(1);
        int m1562x = c0798r.m1562x();
        long j4 = c0798r.f2787b + m1562x;
        int i4 = m1562x / 18;
        long[] jArr = new long[i4];
        long[] jArr2 = new long[i4];
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                break;
            }
            long m1553o = c0798r.m1553o();
            if (m1553o == -1) {
                jArr = java.util.Arrays.copyOf(jArr, i5);
                jArr2 = java.util.Arrays.copyOf(jArr2, i5);
                break;
            }
            jArr[i5] = m1553o;
            jArr2[i5] = c0798r.m1553o();
            c0798r.m1538H(2);
            i5++;
        }
        c0798r.m1538H((int) (j4 - c0798r.f2787b));
        return new p200u3.C2259m(jArr, jArr2);
    }

    /* renamed from: v */
    public static p206w0.C2305a m4627v(p086W.C0798r c0798r, boolean z4, boolean z5) {
        if (z4) {
            m4628w(3, c0798r, false);
        }
        c0798r.m1557s((int) c0798r.m1550l(), p124e2.AbstractC1356d.f5630c);
        long m1550l = c0798r.m1550l();
        java.lang.String[] strArr = new java.lang.String[(int) m1550l];
        for (int i4 = 0; i4 < m1550l; i4++) {
            strArr[i4] = c0798r.m1557s((int) c0798r.m1550l(), p124e2.AbstractC1356d.f5630c);
        }
        if (z5 && (c0798r.m1559u() & 1) == 0) {
            throw p076T.C0666I.m1202a(null, "framing bit expected to be set");
        }
        return new p206w0.C2305a(strArr);
    }

    /* renamed from: w */
    public static boolean m4628w(int i4, p086W.C0798r c0798r, boolean z4) {
        if (c0798r.m1539a() < 7) {
            if (z4) {
                return false;
            }
            throw p076T.C0666I.m1202a(null, "too short header: " + c0798r.m1539a());
        }
        if (c0798r.m1559u() != i4) {
            if (z4) {
                return false;
            }
            throw p076T.C0666I.m1202a(null, "expected header type " + java.lang.Integer.toHexString(i4));
        }
        if (c0798r.m1559u() == 118 && c0798r.m1559u() == 111 && c0798r.m1559u() == 114 && c0798r.m1559u() == 98 && c0798r.m1559u() == 105 && c0798r.m1559u() == 115) {
            return true;
        }
        if (z4) {
            return false;
        }
        throw p076T.C0666I.m1202a(null, "expected characters 'vorbis'");
    }
}
