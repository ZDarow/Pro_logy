package p079U;

/* renamed from: U.f */
/* loaded from: classes.dex */
public final class C0745f {

    /* renamed from: a */
    public final int f2565a;

    /* renamed from: b */
    public final int f2566b;

    /* renamed from: c */
    public final float f2567c;

    /* renamed from: d */
    public final float f2568d;

    /* renamed from: e */
    public final float f2569e;

    /* renamed from: f */
    public final int f2570f;

    /* renamed from: g */
    public final int f2571g;

    /* renamed from: h */
    public final int f2572h;

    /* renamed from: i */
    public final short[] f2573i;

    /* renamed from: j */
    public short[] f2574j;

    /* renamed from: k */
    public int f2575k;

    /* renamed from: l */
    public short[] f2576l;

    /* renamed from: m */
    public int f2577m;

    /* renamed from: n */
    public short[] f2578n;

    /* renamed from: o */
    public int f2579o;

    /* renamed from: p */
    public int f2580p;

    /* renamed from: q */
    public int f2581q;

    /* renamed from: r */
    public int f2582r;

    /* renamed from: s */
    public int f2583s;

    /* renamed from: t */
    public int f2584t;

    /* renamed from: u */
    public int f2585u;

    /* renamed from: v */
    public int f2586v;

    public C0745f(int i4, int i5, float f4, float f5, int i6) {
        this.f2565a = i4;
        this.f2566b = i5;
        this.f2567c = f4;
        this.f2568d = f5;
        this.f2569e = i4 / i6;
        this.f2570f = i4 / 400;
        int i7 = i4 / 65;
        this.f2571g = i7;
        int i8 = i7 * 2;
        this.f2572h = i8;
        this.f2573i = new short[i8];
        this.f2574j = new short[i8 * i5];
        this.f2576l = new short[i8 * i5];
        this.f2578n = new short[i8 * i5];
    }

    /* renamed from: e */
    public static void m1349e(int i4, int i5, short[] sArr, int i6, short[] sArr2, int i7, short[] sArr3, int i8) {
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = (i6 * i5) + i9;
            int i11 = (i8 * i5) + i9;
            int i12 = (i7 * i5) + i9;
            for (int i13 = 0; i13 < i4; i13++) {
                sArr[i10] = (short) (((sArr3[i11] * i13) + ((i4 - i13) * sArr2[i12])) / i4);
                i10 += i5;
                i12 += i5;
                i11 += i5;
            }
        }
    }

    /* renamed from: a */
    public final void m1350a(short[] sArr, int i4, int i5) {
        short[] m1352c = m1352c(this.f2576l, this.f2577m, i5);
        this.f2576l = m1352c;
        int i6 = this.f2566b;
        java.lang.System.arraycopy(sArr, i4 * i6, m1352c, this.f2577m * i6, i6 * i5);
        this.f2577m += i5;
    }

    /* renamed from: b */
    public final void m1351b(short[] sArr, int i4, int i5) {
        int i6 = this.f2572h / i5;
        int i7 = this.f2566b;
        int i8 = i5 * i7;
        int i9 = i4 * i7;
        for (int i10 = 0; i10 < i6; i10++) {
            int i11 = 0;
            for (int i12 = 0; i12 < i8; i12++) {
                i11 += sArr[(i10 * i8) + i9 + i12];
            }
            this.f2573i[i10] = (short) (i11 / i8);
        }
    }

    /* renamed from: c */
    public final short[] m1352c(short[] sArr, int i4, int i5) {
        int length = sArr.length;
        int i6 = this.f2566b;
        int i7 = length / i6;
        return i4 + i5 <= i7 ? sArr : java.util.Arrays.copyOf(sArr, (((i7 * 3) / 2) + i5) * i6);
    }

    /* renamed from: d */
    public final int m1353d(short[] sArr, int i4, int i5, int i6) {
        int i7 = i4 * this.f2566b;
        int i8 = 255;
        int i9 = 1;
        int i10 = 0;
        int i11 = 0;
        while (i5 <= i6) {
            int i12 = 0;
            for (int i13 = 0; i13 < i5; i13++) {
                i12 += java.lang.Math.abs(sArr[i7 + i13] - sArr[(i7 + i5) + i13]);
            }
            if (i12 * i10 < i9 * i5) {
                i10 = i5;
                i9 = i12;
            }
            if (i12 * i8 > i11 * i5) {
                i8 = i5;
                i11 = i12;
            }
            i5++;
        }
        this.f2585u = i9 / i10;
        this.f2586v = i11 / i8;
        return i10;
    }

    /* renamed from: f */
    public final void m1354f() {
        int i4;
        int i5;
        float f4;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.f2577m;
        float f5 = this.f2567c;
        float f6 = this.f2568d;
        float f7 = f5 / f6;
        float f8 = this.f2569e * f6;
        double d4 = f7;
        int i16 = this.f2565a;
        int i17 = this.f2566b;
        int i18 = 1;
        if (d4 > 1.00001d || d4 < 0.99999d) {
            int i19 = this.f2575k;
            int i20 = this.f2572h;
            if (i19 >= i20) {
                int i21 = 0;
                while (true) {
                    int i22 = this.f2582r;
                    if (i22 > 0) {
                        int min = java.lang.Math.min(i20, i22);
                        m1350a(this.f2574j, i21, min);
                        this.f2582r -= min;
                        i21 += min;
                        i5 = i15;
                        f4 = f8;
                        i4 = i16;
                    } else {
                        short[] sArr = this.f2574j;
                        int i23 = i16 > 4000 ? i16 / 4000 : i18;
                        int i24 = this.f2571g;
                        int i25 = this.f2570f;
                        if (i17 == i18 && i23 == i18) {
                            i6 = m1353d(sArr, i21, i25, i24);
                            i5 = i15;
                            f4 = f8;
                            i4 = i16;
                        } else {
                            m1351b(sArr, i21, i23);
                            i4 = i16;
                            i5 = i15;
                            short[] sArr2 = this.f2573i;
                            f4 = f8;
                            int m1353d = m1353d(sArr2, 0, i25 / i23, i24 / i23);
                            if (i23 != 1) {
                                int i26 = m1353d * i23;
                                int i27 = i23 * 4;
                                int i28 = i26 - i27;
                                int i29 = i26 + i27;
                                if (i28 >= i25) {
                                    i25 = i28;
                                }
                                if (i29 <= i24) {
                                    i24 = i29;
                                }
                                if (i17 == 1) {
                                    i6 = m1353d(sArr, i21, i25, i24);
                                } else {
                                    m1351b(sArr, i21, 1);
                                    i6 = m1353d(sArr2, 0, i25, i24);
                                }
                            } else {
                                i6 = m1353d;
                            }
                        }
                        int i30 = this.f2585u;
                        int i31 = this.f2586v;
                        if (i30 == 0 || (i7 = this.f2583s) == 0 || i31 > i30 * 3 || i30 * 2 <= this.f2584t * 3) {
                            i7 = i6;
                        }
                        this.f2584t = i30;
                        this.f2583s = i6;
                        if (d4 > 1.0d) {
                            short[] sArr3 = this.f2574j;
                            if (f7 >= 2.0f) {
                                i9 = (int) (i7 / (f7 - 1.0f));
                            } else {
                                this.f2582r = (int) (((2.0f - f7) * i7) / (f7 - 1.0f));
                                i9 = i7;
                            }
                            short[] m1352c = m1352c(this.f2576l, this.f2577m, i9);
                            this.f2576l = m1352c;
                            int i32 = i21;
                            m1349e(i9, this.f2566b, m1352c, this.f2577m, sArr3, i32, sArr3, i21 + i7);
                            this.f2577m += i9;
                            i21 = i7 + i9 + i32;
                        } else {
                            int i33 = i21;
                            short[] sArr4 = this.f2574j;
                            if (f7 < 0.5f) {
                                i8 = (int) ((i7 * f7) / (1.0f - f7));
                            } else {
                                this.f2582r = (int) ((((2.0f * f7) - 1.0f) * i7) / (1.0f - f7));
                                i8 = i7;
                            }
                            int i34 = i7 + i8;
                            short[] m1352c2 = m1352c(this.f2576l, this.f2577m, i34);
                            this.f2576l = m1352c2;
                            java.lang.System.arraycopy(sArr4, i33 * i17, m1352c2, this.f2577m * i17, i7 * i17);
                            m1349e(i8, this.f2566b, this.f2576l, this.f2577m + i7, sArr4, i33 + i7, sArr4, i33);
                            this.f2577m += i34;
                            i21 = i33 + i8;
                        }
                    }
                    if (i21 + i20 > i19) {
                        break;
                    }
                    i16 = i4;
                    i15 = i5;
                    f8 = f4;
                    i18 = 1;
                }
                int i35 = this.f2575k - i21;
                short[] sArr5 = this.f2574j;
                java.lang.System.arraycopy(sArr5, i21 * i17, sArr5, 0, i35 * i17);
                this.f2575k = i35;
                if (f4 != 1.0f || this.f2577m == (i10 = i5)) {
                }
                int i36 = i4;
                int i37 = (int) (i36 / f4);
                int i38 = i36;
                while (true) {
                    if (i37 <= 16384 && i38 <= 16384) {
                        break;
                    }
                    i37 /= 2;
                    i38 /= 2;
                }
                int i39 = this.f2577m - i10;
                short[] m1352c3 = m1352c(this.f2578n, this.f2579o, i39);
                this.f2578n = m1352c3;
                java.lang.System.arraycopy(this.f2576l, i10 * i17, m1352c3, this.f2579o * i17, i39 * i17);
                this.f2577m = i10;
                this.f2579o += i39;
                int i40 = 0;
                while (true) {
                    i11 = this.f2579o;
                    i12 = i11 - 1;
                    if (i40 >= i12) {
                        break;
                    }
                    while (true) {
                        i13 = this.f2580p + 1;
                        int i41 = i13 * i37;
                        i14 = this.f2581q;
                        if (i41 <= i14 * i38) {
                            break;
                        }
                        this.f2576l = m1352c(this.f2576l, this.f2577m, 1);
                        for (int i42 = 0; i42 < i17; i42++) {
                            short[] sArr6 = this.f2576l;
                            int i43 = (this.f2577m * i17) + i42;
                            short[] sArr7 = this.f2578n;
                            int i44 = (i40 * i17) + i42;
                            short s = sArr7[i44];
                            short s4 = sArr7[i44 + i17];
                            int i45 = this.f2581q * i38;
                            int i46 = this.f2580p;
                            int i47 = i46 * i37;
                            int i48 = (i46 + 1) * i37;
                            int i49 = i48 - i45;
                            int i50 = i48 - i47;
                            sArr6[i43] = (short) ((((i50 - i49) * s4) + (s * i49)) / i50);
                        }
                        this.f2581q++;
                        this.f2577m++;
                    }
                    this.f2580p = i13;
                    if (i13 == i38) {
                        this.f2580p = 0;
                        p086W.AbstractC0781a.m1421j(i14 == i37);
                        this.f2581q = 0;
                    }
                    i40++;
                }
                if (i12 == 0) {
                    return;
                }
                short[] sArr8 = this.f2578n;
                java.lang.System.arraycopy(sArr8, i12 * i17, sArr8, 0, (i11 - i12) * i17);
                this.f2579o -= i12;
                return;
            }
        } else {
            m1350a(this.f2574j, 0, this.f2575k);
            this.f2575k = 0;
        }
        i5 = i15;
        f4 = f8;
        i4 = i16;
        if (f4 != 1.0f) {
        }
    }
}
