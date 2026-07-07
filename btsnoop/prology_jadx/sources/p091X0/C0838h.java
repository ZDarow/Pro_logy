package p091X0;

/* renamed from: X0.h */
/* loaded from: classes.dex */
public final class C0838h implements p083V0.InterfaceC0774l {

    /* renamed from: s */
    public static final byte[] f3001s = {0, 7, 8, 15};

    /* renamed from: t */
    public static final byte[] f3002t = {0, 119, -120, -1};

    /* renamed from: u */
    public static final byte[] f3003u = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: l */
    public final android.graphics.Paint f3004l;

    /* renamed from: m */
    public final android.graphics.Paint f3005m;

    /* renamed from: n */
    public final android.graphics.Canvas f3006n;

    /* renamed from: o */
    public final p091X0.C0832b f3007o;

    /* renamed from: p */
    public final p091X0.C0831a f3008p;

    /* renamed from: q */
    public final p091X0.C0837g f3009q;

    /* renamed from: r */
    public android.graphics.Bitmap f3010r;

    public C0838h(java.util.List list) {
        p086W.C0798r c0798r = new p086W.C0798r((byte[]) list.get(0));
        int m1531A = c0798r.m1531A();
        int m1531A2 = c0798r.m1531A();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f3004l = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f3005m = paint2;
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f3006n = new android.graphics.Canvas();
        this.f3007o = new p091X0.C0832b(719, 575, 0, 719, 0, 575);
        this.f3008p = new p091X0.C0831a(0, new int[]{0, -1, -16777216, -8421505}, m1672c(), m1673d());
        this.f3009q = new p091X0.C0837g(m1531A, m1531A2);
    }

    /* renamed from: a */
    public static byte[] m1671a(int i4, int i5, p086W.C0797q c0797q) {
        byte[] bArr = new byte[i4];
        for (int i6 = 0; i6 < i4; i6++) {
            bArr[i6] = (byte) c0797q.m1518i(i5);
        }
        return bArr;
    }

    /* renamed from: c */
    public static int[] m1672c() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i4 = 1; i4 < 16; i4++) {
            if (i4 < 8) {
                iArr[i4] = m1674e(255, (i4 & 1) != 0 ? 255 : 0, (i4 & 2) != 0 ? 255 : 0, (i4 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i4] = m1674e(255, (i4 & 1) != 0 ? 127 : 0, (i4 & 2) != 0 ? 127 : 0, (i4 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* renamed from: d */
    public static int[] m1673d() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            if (i4 < 8) {
                iArr[i4] = m1674e(63, (i4 & 1) != 0 ? 255 : 0, (i4 & 2) != 0 ? 255 : 0, (i4 & 4) == 0 ? 0 : 255);
            } else {
                int i5 = i4 & 136;
                if (i5 == 0) {
                    iArr[i4] = m1674e(255, ((i4 & 1) != 0 ? 85 : 0) + ((i4 & 16) != 0 ? 170 : 0), ((i4 & 2) != 0 ? 85 : 0) + ((i4 & 32) != 0 ? 170 : 0), ((i4 & 4) == 0 ? 0 : 85) + ((i4 & 64) == 0 ? 0 : 170));
                } else if (i5 == 8) {
                    iArr[i4] = m1674e(127, ((i4 & 1) != 0 ? 85 : 0) + ((i4 & 16) != 0 ? 170 : 0), ((i4 & 2) != 0 ? 85 : 0) + ((i4 & 32) != 0 ? 170 : 0), ((i4 & 4) == 0 ? 0 : 85) + ((i4 & 64) == 0 ? 0 : 170));
                } else if (i5 == 128) {
                    iArr[i4] = m1674e(255, ((i4 & 1) != 0 ? 43 : 0) + 127 + ((i4 & 16) != 0 ? 85 : 0), ((i4 & 2) != 0 ? 43 : 0) + 127 + ((i4 & 32) != 0 ? 85 : 0), ((i4 & 4) == 0 ? 0 : 43) + 127 + ((i4 & 64) == 0 ? 0 : 85));
                } else if (i5 == 136) {
                    iArr[i4] = m1674e(255, ((i4 & 1) != 0 ? 43 : 0) + ((i4 & 16) != 0 ? 85 : 0), ((i4 & 2) != 0 ? 43 : 0) + ((i4 & 32) != 0 ? 85 : 0), ((i4 & 4) == 0 ? 0 : 43) + ((i4 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* renamed from: e */
    public static int m1674e(int i4, int i5, int i6, int i7) {
        return (i4 << 24) | (i5 << 16) | (i6 << 8) | i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0224 A[LOOP:3: B:89:0x0172->B:100:0x0224, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x021f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f1 A[ADDED_TO_REGION] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m1675f(byte[] r23, int[] r24, int r25, int r26, int r27, android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p091X0.C0838h.m1675f(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    /* renamed from: g */
    public static p091X0.C0831a m1676g(p086W.C0797q c0797q, int i4) {
        int m1518i;
        int i5;
        int m1518i2;
        int i6;
        int i7;
        int i8 = 8;
        int m1518i3 = c0797q.m1518i(8);
        c0797q.m1529t(8);
        int i9 = 2;
        int i10 = i4 - 2;
        int i11 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] m1672c = m1672c();
        int[] m1673d = m1673d();
        while (i10 > 0) {
            int m1518i4 = c0797q.m1518i(i8);
            int m1518i5 = c0797q.m1518i(i8);
            int[] iArr2 = (m1518i5 & 128) != 0 ? iArr : (m1518i5 & 64) != 0 ? m1672c : m1673d;
            if ((m1518i5 & 1) != 0) {
                i6 = c0797q.m1518i(i8);
                i7 = c0797q.m1518i(i8);
                m1518i = c0797q.m1518i(i8);
                m1518i2 = c0797q.m1518i(i8);
                i5 = i10 - 6;
            } else {
                int m1518i6 = c0797q.m1518i(6) << i9;
                int m1518i7 = c0797q.m1518i(4) << 4;
                m1518i = c0797q.m1518i(4) << 4;
                i5 = i10 - 4;
                m1518i2 = c0797q.m1518i(i9) << 6;
                i6 = m1518i6;
                i7 = m1518i7;
            }
            if (i6 == 0) {
                i7 = i11;
                m1518i = i7;
                m1518i2 = 255;
            }
            double d4 = i6;
            double d5 = i7 - 128;
            double d6 = m1518i - 128;
            iArr2[m1518i4] = m1674e((byte) (255 - (m1518i2 & 255)), p086W.AbstractC0805y.m1615j((int) ((1.402d * d5) + d4), 0, 255), p086W.AbstractC0805y.m1615j((int) ((d4 - (0.34414d * d6)) - (d5 * 0.71414d)), 0, 255), p086W.AbstractC0805y.m1615j((int) ((d6 * 1.772d) + d4), 0, 255));
            i10 = i5;
            i11 = 0;
            m1518i3 = m1518i3;
            m1673d = m1673d;
            i8 = 8;
            i9 = 2;
        }
        return new p091X0.C0831a(m1518i3, iArr, m1672c, m1673d);
    }

    /* renamed from: i */
    public static p091X0.C0833c m1677i(p086W.C0797q c0797q) {
        byte[] bArr;
        int m1518i = c0797q.m1518i(16);
        c0797q.m1529t(4);
        int m1518i2 = c0797q.m1518i(2);
        boolean m1517h = c0797q.m1517h();
        c0797q.m1529t(1);
        byte[] bArr2 = p086W.AbstractC0805y.f2806f;
        if (m1518i2 == 1) {
            c0797q.m1529t(c0797q.m1518i(8) * 16);
        } else if (m1518i2 == 0) {
            int m1518i3 = c0797q.m1518i(16);
            int m1518i4 = c0797q.m1518i(16);
            if (m1518i3 > 0) {
                bArr2 = new byte[m1518i3];
                c0797q.m1521l(bArr2, m1518i3);
            }
            if (m1518i4 > 0) {
                bArr = new byte[m1518i4];
                c0797q.m1521l(bArr, m1518i4);
                return new p091X0.C0833c(m1518i, m1517h, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new p091X0.C0833c(m1518i, m1517h, bArr2, bArr);
    }

    @Override // p083V0.InterfaceC0774l
    /* renamed from: b */
    public final void mo1403b() {
        p091X0.C0837g c0837g = this.f3009q;
        c0837g.f2994c.clear();
        c0837g.f2995d.clear();
        c0837g.f2996e.clear();
        c0837g.f2997f.clear();
        c0837g.f2998g.clear();
        c0837g.f2999h = null;
        c0837g.f3000i = null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0053. Please report as an issue. */
    @Override // p083V0.InterfaceC0774l
    /* renamed from: h */
    public final void mo692h(byte[] bArr, int i4, int i5, p083V0.C0773k c0773k, p086W.InterfaceC0783c interfaceC0783c) {
        p091X0.C0837g c0837g;
        p083V0.C0763a c0763a;
        int i6;
        char c4;
        int i7;
        p091X0.C0832b c0832b;
        java.util.ArrayList arrayList;
        int i8;
        p091X0.C0837g c0837g2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        p091X0.C0835e c0835e;
        p091X0.C0835e c0835e2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 8;
        p086W.C0797q c0797q = new p086W.C0797q(bArr, i4 + i5);
        c0797q.m1526q(i4);
        while (true) {
            int m1511b = c0797q.m1511b();
            c0837g = this.f3009q;
            if (m1511b >= 48 && c0797q.m1518i(i18) == 15) {
                int m1518i = c0797q.m1518i(i18);
                int i19 = 16;
                int m1518i2 = c0797q.m1518i(16);
                int m1518i3 = c0797q.m1518i(16);
                int m1515f = c0797q.m1515f() + m1518i3;
                if (m1518i3 * 8 > c0797q.m1511b()) {
                    p086W.AbstractC0781a.m1410A("DvbParser", "Data field length exceeds limit");
                    c0797q.m1529t(c0797q.m1511b());
                } else {
                    switch (m1518i) {
                        case 16:
                            if (m1518i2 == c0837g.f2992a) {
                                p073S0.C0630h c0630h = c0837g.f3000i;
                                c0797q.m1518i(i18);
                                int m1518i4 = c0797q.m1518i(4);
                                int m1518i5 = c0797q.m1518i(2);
                                c0797q.m1529t(2);
                                int i20 = m1518i3 - 2;
                                android.util.SparseArray sparseArray = new android.util.SparseArray();
                                while (i20 > 0) {
                                    int m1518i6 = c0797q.m1518i(i18);
                                    c0797q.m1529t(i18);
                                    i20 -= 6;
                                    sparseArray.put(m1518i6, new p091X0.C0834d(c0797q.m1518i(16), c0797q.m1518i(16)));
                                    i18 = 8;
                                }
                                p073S0.C0630h c0630h2 = new p073S0.C0630h(m1518i4, m1518i5, sparseArray);
                                if (m1518i5 == 0) {
                                    if (c0630h != null && c0630h.f1975a != m1518i4) {
                                        c0837g.f3000i = c0630h2;
                                        break;
                                    }
                                } else {
                                    c0837g.f3000i = c0630h2;
                                    c0837g.f2994c.clear();
                                    c0837g.f2995d.clear();
                                    c0837g.f2996e.clear();
                                    break;
                                }
                            }
                            break;
                        case 17:
                            p073S0.C0630h c0630h3 = c0837g.f3000i;
                            if (m1518i2 == c0837g.f2992a && c0630h3 != null) {
                                int m1518i7 = c0797q.m1518i(i18);
                                c0797q.m1529t(4);
                                boolean m1517h = c0797q.m1517h();
                                c0797q.m1529t(3);
                                int m1518i8 = c0797q.m1518i(16);
                                int m1518i9 = c0797q.m1518i(16);
                                c0797q.m1518i(3);
                                int m1518i10 = c0797q.m1518i(3);
                                c0797q.m1529t(2);
                                int m1518i11 = c0797q.m1518i(i18);
                                int m1518i12 = c0797q.m1518i(i18);
                                int m1518i13 = c0797q.m1518i(4);
                                int m1518i14 = c0797q.m1518i(2);
                                c0797q.m1529t(2);
                                int i21 = m1518i3 - 10;
                                android.util.SparseArray sparseArray2 = new android.util.SparseArray();
                                while (i21 > 0) {
                                    int m1518i15 = c0797q.m1518i(i19);
                                    int m1518i16 = c0797q.m1518i(2);
                                    c0797q.m1518i(2);
                                    int m1518i17 = c0797q.m1518i(12);
                                    c0797q.m1529t(4);
                                    int m1518i18 = c0797q.m1518i(12);
                                    int i22 = i21 - 6;
                                    if (m1518i16 == 1 || m1518i16 == 2) {
                                        c0797q.m1518i(i18);
                                        c0797q.m1518i(i18);
                                        i21 -= 8;
                                    } else {
                                        i21 = i22;
                                    }
                                    sparseArray2.put(m1518i15, new p091X0.C0836f(m1518i17, m1518i18));
                                    i19 = 16;
                                }
                                p091X0.C0835e c0835e3 = new p091X0.C0835e(m1518i7, m1517h, m1518i8, m1518i9, m1518i10, m1518i11, m1518i12, m1518i13, m1518i14, sparseArray2);
                                android.util.SparseArray sparseArray3 = c0837g.f2994c;
                                if (c0630h3.f1976b == 0 && (c0835e2 = (p091X0.C0835e) sparseArray3.get(m1518i7)) != null) {
                                    int i23 = 0;
                                    while (true) {
                                        android.util.SparseArray sparseArray4 = c0835e2.f2989j;
                                        if (i23 < sparseArray4.size()) {
                                            c0835e3.f2989j.put(sparseArray4.keyAt(i23), (p091X0.C0836f) sparseArray4.valueAt(i23));
                                            i23++;
                                        }
                                    }
                                }
                                sparseArray3.put(c0835e3.f2980a, c0835e3);
                                break;
                            }
                            break;
                        case 18:
                            if (m1518i2 != c0837g.f2992a) {
                                if (m1518i2 == c0837g.f2993b) {
                                    p091X0.C0831a m1676g = m1676g(c0797q, m1518i3);
                                    c0837g.f2997f.put(m1676g.f2964a, m1676g);
                                    break;
                                }
                            } else {
                                p091X0.C0831a m1676g2 = m1676g(c0797q, m1518i3);
                                c0837g.f2995d.put(m1676g2.f2964a, m1676g2);
                                break;
                            }
                            break;
                        case 19:
                            if (m1518i2 != c0837g.f2992a) {
                                if (m1518i2 == c0837g.f2993b) {
                                    p091X0.C0833c m1677i = m1677i(c0797q);
                                    c0837g.f2998g.put(m1677i.f2974a, m1677i);
                                    break;
                                }
                            } else {
                                p091X0.C0833c m1677i2 = m1677i(c0797q);
                                c0837g.f2996e.put(m1677i2.f2974a, m1677i2);
                                break;
                            }
                            break;
                        case 20:
                            if (m1518i2 == c0837g.f2992a) {
                                c0797q.m1529t(4);
                                boolean m1517h2 = c0797q.m1517h();
                                c0797q.m1529t(3);
                                int m1518i19 = c0797q.m1518i(16);
                                int m1518i20 = c0797q.m1518i(16);
                                if (m1517h2) {
                                    int m1518i21 = c0797q.m1518i(16);
                                    int m1518i22 = c0797q.m1518i(16);
                                    int m1518i23 = c0797q.m1518i(16);
                                    i14 = m1518i22;
                                    i15 = c0797q.m1518i(16);
                                    i17 = m1518i23;
                                    i16 = m1518i21;
                                } else {
                                    i14 = m1518i19;
                                    i15 = m1518i20;
                                    i16 = 0;
                                    i17 = 0;
                                }
                                c0837g.f2999h = new p091X0.C0832b(m1518i19, m1518i20, i16, i14, i17, i15);
                                break;
                            }
                            break;
                    }
                    c0797q.m1530u(m1515f - c0797q.m1515f());
                }
                i18 = 8;
            }
        }
        p073S0.C0630h c0630h4 = c0837g.f3000i;
        if (c0630h4 == null) {
            p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
            c0763a = new p083V0.C0763a(p129f2.C1415c0.f5744p, -9223372036854775807L, -9223372036854775807L);
        } else {
            p091X0.C0832b c0832b2 = c0837g.f2999h;
            if (c0832b2 == null) {
                c0832b2 = this.f3007o;
            }
            android.graphics.Bitmap bitmap = this.f3010r;
            android.graphics.Canvas canvas = this.f3006n;
            if (bitmap == null || c0832b2.f2968a + 1 != bitmap.getWidth() || c0832b2.f2969b + 1 != this.f3010r.getHeight()) {
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(c0832b2.f2968a + 1, c0832b2.f2969b + 1, android.graphics.Bitmap.Config.ARGB_8888);
                this.f3010r = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i24 = 0;
            while (true) {
                android.util.SparseArray sparseArray5 = (android.util.SparseArray) c0630h4.f1977c;
                if (i24 < sparseArray5.size()) {
                    canvas.save();
                    p091X0.C0834d c0834d = (p091X0.C0834d) sparseArray5.valueAt(i24);
                    p091X0.C0835e c0835e4 = (p091X0.C0835e) c0837g.f2994c.get(sparseArray5.keyAt(i24));
                    int i25 = c0834d.f2978a + c0832b2.f2970c;
                    int i26 = c0834d.f2979b + c0832b2.f2972e;
                    int min = java.lang.Math.min(c0835e4.f2982c + i25, c0832b2.f2971d);
                    int i27 = c0835e4.f2983d;
                    int i28 = i26 + i27;
                    canvas.clipRect(i25, i26, min, java.lang.Math.min(i28, c0832b2.f2973f));
                    android.util.SparseArray sparseArray6 = c0837g.f2995d;
                    int i29 = c0835e4.f2985f;
                    p091X0.C0831a c0831a = (p091X0.C0831a) sparseArray6.get(i29);
                    if (c0831a == null && (c0831a = (p091X0.C0831a) c0837g.f2997f.get(i29)) == null) {
                        c0831a = this.f3008p;
                    }
                    int i30 = 0;
                    while (true) {
                        android.util.SparseArray sparseArray7 = c0835e4.f2989j;
                        if (i30 < sparseArray7.size()) {
                            int keyAt = sparseArray7.keyAt(i30);
                            p091X0.C0836f c0836f = (p091X0.C0836f) sparseArray7.valueAt(i30);
                            p073S0.C0630h c0630h5 = c0630h4;
                            p091X0.C0833c c0833c = (p091X0.C0833c) c0837g.f2996e.get(keyAt);
                            if (c0833c == null) {
                                c0833c = (p091X0.C0833c) c0837g.f2998g.get(keyAt);
                            }
                            if (c0833c != null) {
                                android.graphics.Paint paint = c0833c.f2975b ? null : this.f3004l;
                                c0837g2 = c0837g;
                                int i31 = c0836f.f2990a + i25;
                                int i32 = c0836f.f2991b + i26;
                                i8 = i24;
                                int i33 = c0835e4.f2984e;
                                int i34 = i30;
                                int[] iArr = i33 == 3 ? c0831a.f2967d : i33 == 2 ? c0831a.f2966c : c0831a.f2965b;
                                i9 = i34;
                                arrayList = arrayList2;
                                c0832b = c0832b2;
                                i11 = i27;
                                i10 = i28;
                                i13 = i25;
                                i12 = i26;
                                c0835e = c0835e4;
                                android.graphics.Paint paint2 = paint;
                                m1675f(c0833c.f2976c, iArr, i33, i31, i32, paint2, canvas);
                                m1675f(c0833c.f2977d, iArr, i33, i31, i32 + 1, paint2, canvas);
                            } else {
                                c0832b = c0832b2;
                                arrayList = arrayList2;
                                i8 = i24;
                                c0837g2 = c0837g;
                                i9 = i30;
                                i10 = i28;
                                i11 = i27;
                                i12 = i26;
                                i13 = i25;
                                c0835e = c0835e4;
                            }
                            i30 = i9 + 1;
                            c0835e4 = c0835e;
                            i25 = i13;
                            c0630h4 = c0630h5;
                            c0837g = c0837g2;
                            i24 = i8;
                            c0832b2 = c0832b;
                            i27 = i11;
                            i28 = i10;
                            i26 = i12;
                            arrayList2 = arrayList;
                        } else {
                            p073S0.C0630h c0630h6 = c0630h4;
                            p091X0.C0832b c0832b3 = c0832b2;
                            java.util.ArrayList arrayList3 = arrayList2;
                            int i35 = i24;
                            p091X0.C0837g c0837g3 = c0837g;
                            int i36 = i28;
                            int i37 = i27;
                            int i38 = i26;
                            int i39 = i25;
                            p091X0.C0835e c0835e5 = c0835e4;
                            boolean z4 = c0835e5.f2981b;
                            int i40 = c0835e5.f2982c;
                            if (z4) {
                                int i41 = c0835e5.f2984e;
                                if (i41 == 3) {
                                    i7 = c0831a.f2967d[c0835e5.f2986g];
                                    c4 = 2;
                                } else {
                                    c4 = 2;
                                    i7 = i41 == 2 ? c0831a.f2966c[c0835e5.f2987h] : c0831a.f2965b[c0835e5.f2988i];
                                }
                                android.graphics.Paint paint3 = this.f3005m;
                                paint3.setColor(i7);
                                i6 = i38;
                                canvas.drawRect(i39, i6, i39 + i40, i36, paint3);
                            } else {
                                i6 = i38;
                                c4 = 2;
                            }
                            android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(this.f3010r, i39, i6, i40, i37);
                            float f4 = c0832b3.f2968a;
                            float f5 = c0832b3.f2969b;
                            arrayList3.add(new p082V.C0757b(null, null, null, createBitmap2, i6 / f5, 0, 0, i39 / f4, 0, Integer.MIN_VALUE, -3.4028235E38f, i40 / f4, i37 / f5, false, -16777216, Integer.MIN_VALUE, 0.0f));
                            canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
                            canvas.restore();
                            c0837g = c0837g3;
                            i24 = i35 + 1;
                            c0630h4 = c0630h6;
                            arrayList2 = arrayList3;
                            c0832b2 = c0832b3;
                        }
                    }
                } else {
                    c0763a = new p083V0.C0763a(arrayList2, -9223372036854775807L, -9223372036854775807L);
                }
            }
        }
        interfaceC0783c.accept(c0763a);
    }

    @Override // p083V0.InterfaceC0774l
    /* renamed from: w */
    public final int mo703w() {
        return 2;
    }
}
