package X;

import B2.AbstractC0007h;
import T.C0088i;
import W.q;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f2863a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f2864b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2865c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static int[] f2866d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i4, int i5, boolean[] zArr) {
        int i6 = i5 - i4;
        W.a.j(i6 >= 0);
        if (i6 == 0) {
            return i5;
        }
        if (zArr[0]) {
            a(zArr);
            return i4 - 3;
        }
        if (i6 > 1 && zArr[1] && bArr[i4] == 1) {
            a(zArr);
            return i4 - 2;
        }
        if (i6 > 2 && zArr[2] && bArr[i4] == 0 && bArr[i4 + 1] == 1) {
            a(zArr);
            return i4 - 1;
        }
        int i7 = i5 - 1;
        int i8 = i4 + 2;
        while (i8 < i7) {
            byte b4 = bArr[i8];
            if ((b4 & 254) == 0) {
                int i9 = i8 - 2;
                if (bArr[i9] == 0 && bArr[i8 - 1] == 0 && b4 == 1) {
                    a(zArr);
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

    public static d c(byte[] bArr, int i4, int i5) {
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
        q qVar = new q(bArr, i4 + 2, i5);
        int i16 = 4;
        qVar.t(4);
        int i17 = qVar.i(3);
        qVar.s();
        int i18 = qVar.i(2);
        boolean h4 = qVar.h();
        int i19 = qVar.i(5);
        int i20 = 0;
        for (int i21 = 0; i21 < 32; i21++) {
            if (qVar.h()) {
                i20 |= 1 << i21;
            }
        }
        int[] iArr2 = new int[6];
        for (int i22 = 0; i22 < 6; i22++) {
            iArr2[i22] = qVar.i(8);
        }
        int i23 = qVar.i(8);
        int i24 = 0;
        for (int i25 = 0; i25 < i17; i25++) {
            if (qVar.h()) {
                i24 += 89;
            }
            if (qVar.h()) {
                i24 += 8;
            }
        }
        qVar.t(i24);
        if (i17 > 0) {
            qVar.t((8 - i17) * 2);
        }
        qVar.m();
        int m4 = qVar.m();
        if (m4 == 3) {
            qVar.s();
        }
        int m5 = qVar.m();
        int m6 = qVar.m();
        if (qVar.h()) {
            int m7 = qVar.m();
            int m8 = qVar.m();
            int m9 = qVar.m();
            int m10 = qVar.m();
            m5 -= (m7 + m8) * ((m4 == 1 || m4 == 2) ? 2 : 1);
            m6 -= (m9 + m10) * (m4 == 1 ? 2 : 1);
        }
        int i26 = m6;
        int i27 = m5;
        int m11 = qVar.m();
        int m12 = qVar.m();
        int m13 = qVar.m();
        int i28 = -1;
        int i29 = -1;
        for (int i30 = qVar.h() ? 0 : i17; i30 <= i17; i30++) {
            qVar.m();
            i29 = Math.max(qVar.m(), i29);
            qVar.m();
        }
        qVar.m();
        qVar.m();
        qVar.m();
        qVar.m();
        qVar.m();
        qVar.m();
        if (qVar.h() && qVar.h()) {
            int i31 = 0;
            while (i31 < i16) {
                int i32 = 0;
                while (i32 < 6) {
                    if (qVar.h()) {
                        int min = Math.min(64, 1 << ((i31 << 1) + i16));
                        if (i31 > 1) {
                            qVar.n();
                        }
                        for (int i33 = 0; i33 < min; i33++) {
                            qVar.n();
                        }
                    } else {
                        qVar.m();
                    }
                    i32 += i31 == 3 ? 3 : 1;
                    i16 = 4;
                }
                i31++;
                i16 = 4;
            }
        }
        qVar.t(2);
        if (qVar.h()) {
            qVar.t(8);
            qVar.m();
            qVar.m();
            qVar.s();
        }
        int m14 = qVar.m();
        int[] iArr3 = new int[0];
        int[] iArr4 = new int[0];
        int i34 = 0;
        int i35 = -1;
        int i36 = -1;
        while (i34 < m14) {
            if (i34 == 0 || !qVar.h()) {
                i10 = m14;
                i11 = i19;
                i12 = i20;
                iArr = iArr2;
                i13 = i23;
                i14 = i29;
                int m15 = qVar.m();
                int m16 = qVar.m();
                iArr3 = new int[m15];
                int i37 = 0;
                while (i37 < m15) {
                    iArr3[i37] = (i37 > 0 ? iArr3[i37 - 1] : 0) - (qVar.m() + 1);
                    qVar.s();
                    i37++;
                }
                iArr4 = new int[m16];
                int i38 = 0;
                while (i38 < m16) {
                    iArr4[i38] = qVar.m() + 1 + (i38 > 0 ? iArr4[i38 - 1] : 0);
                    qVar.s();
                    i38++;
                }
                i35 = m15;
                i15 = m16;
            } else {
                i10 = m14;
                int i39 = i35 + i36;
                int m17 = (1 - ((qVar.h() ? 1 : 0) * 2)) * (qVar.m() + 1);
                i14 = i29;
                int i40 = i39 + 1;
                i13 = i23;
                boolean[] zArr = new boolean[i40];
                iArr = iArr2;
                for (int i41 = 0; i41 <= i39; i41++) {
                    if (qVar.h()) {
                        zArr[i41] = true;
                    } else {
                        zArr[i41] = qVar.h();
                    }
                }
                int[] iArr5 = new int[i40];
                int[] iArr6 = new int[i40];
                int i42 = 0;
                for (int i43 = i36 - 1; i43 >= 0; i43--) {
                    int i44 = iArr4[i43] + m17;
                    if (i44 < 0 && zArr[i35 + i43]) {
                        iArr5[i42] = i44;
                        i42++;
                    }
                }
                if (m17 < 0 && zArr[i39]) {
                    iArr5[i42] = m17;
                    i42++;
                }
                i12 = i20;
                int i45 = i42;
                i11 = i19;
                for (int i46 = 0; i46 < i35; i46++) {
                    int i47 = iArr3[i46] + m17;
                    if (i47 < 0 && zArr[i46]) {
                        iArr5[i45] = i47;
                        i45++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr5, i45);
                int i48 = 0;
                for (int i49 = i35 - 1; i49 >= 0; i49--) {
                    int i50 = iArr3[i49] + m17;
                    if (i50 > 0 && zArr[i49]) {
                        iArr6[i48] = i50;
                        i48++;
                    }
                }
                if (m17 > 0 && zArr[i39]) {
                    iArr6[i48] = m17;
                    i48++;
                }
                i15 = i48;
                for (int i51 = 0; i51 < i36; i51++) {
                    int i52 = iArr4[i51] + m17;
                    if (i52 > 0 && zArr[i35 + i51]) {
                        iArr6[i15] = i52;
                        i15++;
                    }
                }
                iArr4 = Arrays.copyOf(iArr6, i15);
                iArr3 = copyOf;
                i35 = i45;
            }
            i34++;
            i36 = i15;
            m14 = i10;
            i29 = i14;
            i23 = i13;
            iArr2 = iArr;
            i20 = i12;
            i19 = i11;
        }
        int i53 = i19;
        int i54 = i20;
        int[] iArr7 = iArr2;
        int i55 = i23;
        int i56 = i29;
        if (qVar.h()) {
            int m18 = qVar.m();
            for (int i57 = 0; i57 < m18; i57++) {
                qVar.t(m13 + 5);
            }
        }
        qVar.t(2);
        float f4 = 1.0f;
        if (qVar.h()) {
            if (qVar.h()) {
                int i58 = qVar.i(8);
                if (i58 == 255) {
                    int i59 = qVar.i(16);
                    int i60 = qVar.i(16);
                    if (i59 != 0 && i60 != 0) {
                        f4 = i59 / i60;
                    }
                } else if (i58 < 17) {
                    f4 = f2864b[i58];
                } else {
                    AbstractC0007h.o(i58, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (qVar.h()) {
                qVar.s();
            }
            if (qVar.h()) {
                qVar.t(3);
                i9 = qVar.h() ? 1 : 2;
                if (qVar.h()) {
                    int i61 = qVar.i(8);
                    int i62 = qVar.i(8);
                    qVar.t(8);
                    i28 = C0088i.f(i61);
                    i7 = C0088i.g(i62);
                } else {
                    i7 = -1;
                }
            } else {
                i9 = -1;
                i7 = -1;
            }
            if (qVar.h()) {
                qVar.m();
                qVar.m();
            }
            qVar.s();
            if (qVar.h()) {
                i26 *= 2;
            }
            i8 = i9;
            i6 = i26;
        } else {
            i6 = i26;
            i7 = -1;
            i8 = -1;
        }
        return new d(i18, h4, i53, i54, m11, m12, iArr7, i55, i27, i6, f4, i56, i28, i8, i7);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.f d(byte[] r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.g.d(byte[], int, int):X.f");
    }

    public static void e(q qVar) {
        int m4 = qVar.m() + 1;
        qVar.t(8);
        for (int i4 = 0; i4 < m4; i4++) {
            qVar.m();
            qVar.m();
            qVar.s();
        }
        qVar.t(20);
    }

    public static int f(byte[] bArr, int i4) {
        int i5;
        synchronized (f2865c) {
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
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i6 < i4) {
                    int[] iArr = f2866d;
                    if (iArr.length <= i7) {
                        f2866d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f2866d[i7] = i6;
                    i6 += 3;
                    i7++;
                }
            }
            i5 = i4 - i7;
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < i7; i10++) {
                int i11 = f2866d[i10] - i9;
                System.arraycopy(bArr, i9, bArr, i8, i11);
                int i12 = i8 + i11;
                int i13 = i12 + 1;
                bArr[i12] = 0;
                i8 = i12 + 2;
                bArr[i13] = 0;
                i9 += i11 + 3;
            }
            System.arraycopy(bArr, i9, bArr, i8, i5 - i8);
        }
        return i5;
    }
}
