package p090X;

/* renamed from: X.g */
/* loaded from: classes.dex */
public abstract class AbstractC0830g {

    /* renamed from: a */
    public static final byte[] f2960a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f2961b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    public static final java.lang.Object f2962c = new java.lang.Object();

    /* renamed from: d */
    public static int[] f2963d = new int[10];

    /* renamed from: a */
    public static void m1665a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: b */
    public static int m1666b(byte[] bArr, int i4, int i5, boolean[] zArr) {
        int i6 = i5 - i4;
        p086W.AbstractC0781a.m1421j(i6 >= 0);
        if (i6 == 0) {
            return i5;
        }
        if (zArr[0]) {
            m1665a(zArr);
            return i4 - 3;
        }
        if (i6 > 1 && zArr[1] && bArr[i4] == 1) {
            m1665a(zArr);
            return i4 - 2;
        }
        if (i6 > 2 && zArr[2] && bArr[i4] == 0 && bArr[i4 + 1] == 1) {
            m1665a(zArr);
            return i4 - 1;
        }
        int i7 = i5 - 1;
        int i8 = i4 + 2;
        while (i8 < i7) {
            byte b4 = bArr[i8];
            if ((b4 & 254) == 0) {
                int i9 = i8 - 2;
                if (bArr[i9] == 0 && bArr[i8 - 1] == 0 && b4 == 1) {
                    m1665a(zArr);
                    return i9;
                }
                i8 -= 2;
            }
            i8 += 3;
        }
        zArr[0] = i6 <= 2 ? !(i6 != 2 ? !(zArr[1] && bArr[i7] == 1) : !(zArr[2] && bArr[i5 + (-2)] == 0 && bArr[i7] == 1)) : bArr[i5 + (-3)] == 0 && bArr[i5 + (-2)] == 0 && bArr[i7] == 1;
        zArr[1] = i6 <= 1 ? zArr[2] && bArr[i7] == 0 : bArr[i5 + (-2)] == 0 && bArr[i7] == 0;
        zArr[2] = bArr[i7] == 0;
        return i5;
    }

    /* renamed from: c */
    public static p090X.C0827d m1667c(byte[] bArr, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        int i15;
        p086W.C0797q c0797q = new p086W.C0797q(bArr, i4 + 2, i5);
        int i16 = 4;
        c0797q.m1529t(4);
        int m1518i = c0797q.m1518i(3);
        c0797q.m1528s();
        int m1518i2 = c0797q.m1518i(2);
        boolean m1517h = c0797q.m1517h();
        int m1518i3 = c0797q.m1518i(5);
        int i17 = 0;
        for (int i18 = 0; i18 < 32; i18++) {
            if (c0797q.m1517h()) {
                i17 |= 1 << i18;
            }
        }
        int[] iArr2 = new int[6];
        for (int i19 = 0; i19 < 6; i19++) {
            iArr2[i19] = c0797q.m1518i(8);
        }
        int m1518i4 = c0797q.m1518i(8);
        int i20 = 0;
        for (int i21 = 0; i21 < m1518i; i21++) {
            if (c0797q.m1517h()) {
                i20 += 89;
            }
            if (c0797q.m1517h()) {
                i20 += 8;
            }
        }
        c0797q.m1529t(i20);
        if (m1518i > 0) {
            c0797q.m1529t((8 - m1518i) * 2);
        }
        c0797q.m1522m();
        int m1522m = c0797q.m1522m();
        if (m1522m == 3) {
            c0797q.m1528s();
        }
        int m1522m2 = c0797q.m1522m();
        int m1522m3 = c0797q.m1522m();
        if (c0797q.m1517h()) {
            int m1522m4 = c0797q.m1522m();
            int m1522m5 = c0797q.m1522m();
            int m1522m6 = c0797q.m1522m();
            int m1522m7 = c0797q.m1522m();
            m1522m2 -= (m1522m4 + m1522m5) * ((m1522m == 1 || m1522m == 2) ? 2 : 1);
            m1522m3 -= (m1522m6 + m1522m7) * (m1522m == 1 ? 2 : 1);
        }
        int i22 = m1522m3;
        int i23 = m1522m2;
        int m1522m8 = c0797q.m1522m();
        int m1522m9 = c0797q.m1522m();
        int m1522m10 = c0797q.m1522m();
        int i24 = -1;
        int i25 = -1;
        for (int i26 = c0797q.m1517h() ? 0 : m1518i; i26 <= m1518i; i26++) {
            c0797q.m1522m();
            i25 = java.lang.Math.max(c0797q.m1522m(), i25);
            c0797q.m1522m();
        }
        c0797q.m1522m();
        c0797q.m1522m();
        c0797q.m1522m();
        c0797q.m1522m();
        c0797q.m1522m();
        c0797q.m1522m();
        if (c0797q.m1517h() && c0797q.m1517h()) {
            int i27 = 0;
            while (i27 < i16) {
                int i28 = 0;
                while (i28 < 6) {
                    if (c0797q.m1517h()) {
                        int min = java.lang.Math.min(64, 1 << ((i27 << 1) + i16));
                        if (i27 > 1) {
                            c0797q.m1523n();
                        }
                        for (int i29 = 0; i29 < min; i29++) {
                            c0797q.m1523n();
                        }
                    } else {
                        c0797q.m1522m();
                    }
                    i28 += i27 == 3 ? 3 : 1;
                    i16 = 4;
                }
                i27++;
                i16 = 4;
            }
        }
        c0797q.m1529t(2);
        if (c0797q.m1517h()) {
            c0797q.m1529t(8);
            c0797q.m1522m();
            c0797q.m1522m();
            c0797q.m1528s();
        }
        int m1522m11 = c0797q.m1522m();
        int[] iArr3 = new int[0];
        int[] iArr4 = new int[0];
        int i30 = 0;
        int i31 = -1;
        int i32 = -1;
        while (i30 < m1522m11) {
            if (i30 == 0 || !c0797q.m1517h()) {
                i10 = m1522m11;
                i11 = m1518i3;
                i12 = i17;
                iArr = iArr2;
                i13 = m1518i4;
                i14 = i25;
                int m1522m12 = c0797q.m1522m();
                int m1522m13 = c0797q.m1522m();
                iArr3 = new int[m1522m12];
                int i33 = 0;
                while (i33 < m1522m12) {
                    iArr3[i33] = (i33 > 0 ? iArr3[i33 - 1] : 0) - (c0797q.m1522m() + 1);
                    c0797q.m1528s();
                    i33++;
                }
                iArr4 = new int[m1522m13];
                int i34 = 0;
                while (i34 < m1522m13) {
                    iArr4[i34] = c0797q.m1522m() + 1 + (i34 > 0 ? iArr4[i34 - 1] : 0);
                    c0797q.m1528s();
                    i34++;
                }
                i31 = m1522m12;
                i15 = m1522m13;
            } else {
                i10 = m1522m11;
                int i35 = i31 + i32;
                int m1522m14 = (1 - ((c0797q.m1517h() ? 1 : 0) * 2)) * (c0797q.m1522m() + 1);
                i14 = i25;
                int i36 = i35 + 1;
                i13 = m1518i4;
                boolean[] zArr = new boolean[i36];
                iArr = iArr2;
                for (int i37 = 0; i37 <= i35; i37++) {
                    if (c0797q.m1517h()) {
                        zArr[i37] = true;
                    } else {
                        zArr[i37] = c0797q.m1517h();
                    }
                }
                int[] iArr5 = new int[i36];
                int[] iArr6 = new int[i36];
                int i38 = 0;
                for (int i39 = i32 - 1; i39 >= 0; i39--) {
                    int i40 = iArr4[i39] + m1522m14;
                    if (i40 < 0 && zArr[i31 + i39]) {
                        iArr5[i38] = i40;
                        i38++;
                    }
                }
                if (m1522m14 < 0 && zArr[i35]) {
                    iArr5[i38] = m1522m14;
                    i38++;
                }
                i12 = i17;
                int i41 = i38;
                i11 = m1518i3;
                for (int i42 = 0; i42 < i31; i42++) {
                    int i43 = iArr3[i42] + m1522m14;
                    if (i43 < 0 && zArr[i42]) {
                        iArr5[i41] = i43;
                        i41++;
                    }
                }
                int[] copyOf = java.util.Arrays.copyOf(iArr5, i41);
                int i44 = 0;
                for (int i45 = i31 - 1; i45 >= 0; i45--) {
                    int i46 = iArr3[i45] + m1522m14;
                    if (i46 > 0 && zArr[i45]) {
                        iArr6[i44] = i46;
                        i44++;
                    }
                }
                if (m1522m14 > 0 && zArr[i35]) {
                    iArr6[i44] = m1522m14;
                    i44++;
                }
                i15 = i44;
                for (int i47 = 0; i47 < i32; i47++) {
                    int i48 = iArr4[i47] + m1522m14;
                    if (i48 > 0 && zArr[i31 + i47]) {
                        iArr6[i15] = i48;
                        i15++;
                    }
                }
                iArr4 = java.util.Arrays.copyOf(iArr6, i15);
                iArr3 = copyOf;
                i31 = i41;
            }
            i30++;
            i32 = i15;
            m1522m11 = i10;
            i25 = i14;
            m1518i4 = i13;
            iArr2 = iArr;
            i17 = i12;
            m1518i3 = i11;
        }
        int i49 = m1518i3;
        int i50 = i17;
        int[] iArr7 = iArr2;
        int i51 = m1518i4;
        int i52 = i25;
        if (c0797q.m1517h()) {
            int m1522m15 = c0797q.m1522m();
            for (int i53 = 0; i53 < m1522m15; i53++) {
                c0797q.m1529t(m1522m10 + 5);
            }
        }
        c0797q.m1529t(2);
        float f4 = 1.0f;
        if (c0797q.m1517h()) {
            if (c0797q.m1517h()) {
                int m1518i5 = c0797q.m1518i(8);
                if (m1518i5 == 255) {
                    int m1518i6 = c0797q.m1518i(16);
                    int m1518i7 = c0797q.m1518i(16);
                    if (m1518i6 != 0 && m1518i7 != 0) {
                        f4 = m1518i6 / m1518i7;
                    }
                } else if (m1518i5 < 17) {
                    f4 = f2961b[m1518i5];
                } else {
                    p009B2.AbstractC0051h.m156o(m1518i5, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (c0797q.m1517h()) {
                c0797q.m1528s();
            }
            if (c0797q.m1517h()) {
                c0797q.m1529t(3);
                i9 = c0797q.m1517h() ? 1 : 2;
                if (c0797q.m1517h()) {
                    int m1518i8 = c0797q.m1518i(8);
                    int m1518i9 = c0797q.m1518i(8);
                    c0797q.m1529t(8);
                    i24 = p076T.C0695i.m1282f(m1518i8);
                    i7 = p076T.C0695i.m1283g(m1518i9);
                } else {
                    i7 = -1;
                }
            } else {
                i9 = -1;
                i7 = -1;
            }
            if (c0797q.m1517h()) {
                c0797q.m1522m();
                c0797q.m1522m();
            }
            c0797q.m1528s();
            if (c0797q.m1517h()) {
                i22 *= 2;
            }
            i8 = i9;
            i6 = i22;
        } else {
            i6 = i22;
            i7 = -1;
            i8 = -1;
        }
        return new p090X.C0827d(m1518i2, m1517h, i49, i50, m1522m8, m1522m9, iArr7, i51, i23, i6, f4, i52, i24, i8, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x025b  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p090X.C0829f m1668d(byte[] r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p090X.AbstractC0830g.m1668d(byte[], int, int):X.f");
    }

    /* renamed from: e */
    public static void m1669e(p086W.C0797q c0797q) {
        int m1522m = c0797q.m1522m() + 1;
        c0797q.m1529t(8);
        for (int i4 = 0; i4 < m1522m; i4++) {
            c0797q.m1522m();
            c0797q.m1522m();
            c0797q.m1528s();
        }
        c0797q.m1529t(20);
    }

    /* renamed from: f */
    public static int m1670f(byte[] bArr, int i4) {
        int i5;
        synchronized (f2962c) {
            int i6 = 0;
            int i7 = 0;
            while (i6 < i4) {
                while (true) {
                    if (i6 >= i4 - 2) {
                        i6 = i4;
                        break;
                    }
                    try {
                        if (bArr[i6] == 0 && bArr[i6 + 1] == 0 && bArr[i6 + 2] == 3) {
                            break;
                        }
                        i6++;
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                if (i6 < i4) {
                    int[] iArr = f2963d;
                    if (iArr.length <= i7) {
                        f2963d = java.util.Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f2963d[i7] = i6;
                    i6 += 3;
                    i7++;
                }
            }
            i5 = i4 - i7;
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < i7; i10++) {
                int i11 = f2963d[i10] - i9;
                java.lang.System.arraycopy(bArr, i9, bArr, i8, i11);
                int i12 = i8 + i11;
                int i13 = i12 + 1;
                bArr[i12] = 0;
                i8 = i12 + 2;
                bArr[i13] = 0;
                i9 += i11 + 3;
            }
            java.lang.System.arraycopy(bArr, i9, bArr, i8, i5 - i8);
        }
        return i5;
    }
}
