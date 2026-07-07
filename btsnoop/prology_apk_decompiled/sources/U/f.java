package U;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f2478a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2479b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2480c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2481d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2482e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2483f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2484g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2485h;

    /* renamed from: i, reason: collision with root package name */
    public final short[] f2486i;

    /* renamed from: j, reason: collision with root package name */
    public short[] f2487j;

    /* renamed from: k, reason: collision with root package name */
    public int f2488k;

    /* renamed from: l, reason: collision with root package name */
    public short[] f2489l;

    /* renamed from: m, reason: collision with root package name */
    public int f2490m;

    /* renamed from: n, reason: collision with root package name */
    public short[] f2491n;

    /* renamed from: o, reason: collision with root package name */
    public int f2492o;

    /* renamed from: p, reason: collision with root package name */
    public int f2493p;

    /* renamed from: q, reason: collision with root package name */
    public int f2494q;

    /* renamed from: r, reason: collision with root package name */
    public int f2495r;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public int f2496t;

    /* renamed from: u, reason: collision with root package name */
    public int f2497u;

    /* renamed from: v, reason: collision with root package name */
    public int f2498v;

    public f(int i4, int i5, float f4, float f5, int i6) {
        this.f2478a = i4;
        this.f2479b = i5;
        this.f2480c = f4;
        this.f2481d = f5;
        this.f2482e = i4 / i6;
        this.f2483f = i4 / 400;
        int i7 = i4 / 65;
        this.f2484g = i7;
        int i8 = i7 * 2;
        this.f2485h = i8;
        this.f2486i = new short[i8];
        this.f2487j = new short[i8 * i5];
        this.f2489l = new short[i8 * i5];
        this.f2491n = new short[i8 * i5];
    }

    public static void e(int i4, int i5, short[] sArr, int i6, short[] sArr2, int i7, short[] sArr3, int i8) {
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

    public final void a(short[] sArr, int i4, int i5) {
        short[] c4 = c(this.f2489l, this.f2490m, i5);
        this.f2489l = c4;
        int i6 = this.f2479b;
        System.arraycopy(sArr, i4 * i6, c4, this.f2490m * i6, i6 * i5);
        this.f2490m += i5;
    }

    public final void b(short[] sArr, int i4, int i5) {
        int i6 = this.f2485h / i5;
        int i7 = this.f2479b;
        int i8 = i5 * i7;
        int i9 = i4 * i7;
        for (int i10 = 0; i10 < i6; i10++) {
            int i11 = 0;
            for (int i12 = 0; i12 < i8; i12++) {
                i11 += sArr[(i10 * i8) + i9 + i12];
            }
            this.f2486i[i10] = (short) (i11 / i8);
        }
    }

    public final short[] c(short[] sArr, int i4, int i5) {
        int length = sArr.length;
        int i6 = this.f2479b;
        int i7 = length / i6;
        return i4 + i5 <= i7 ? sArr : Arrays.copyOf(sArr, (((i7 * 3) / 2) + i5) * i6);
    }

    public final int d(short[] sArr, int i4, int i5, int i6) {
        int i7 = i4 * this.f2479b;
        int i8 = 255;
        int i9 = 1;
        int i10 = 0;
        int i11 = 0;
        while (i5 <= i6) {
            int i12 = 0;
            for (int i13 = 0; i13 < i5; i13++) {
                i12 += Math.abs(sArr[i7 + i13] - sArr[(i7 + i5) + i13]);
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
        this.f2497u = i9 / i10;
        this.f2498v = i11 / i8;
        return i10;
    }

    public final void f() {
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
        int i15 = this.f2490m;
        float f5 = this.f2480c;
        float f6 = this.f2481d;
        float f7 = f5 / f6;
        float f8 = this.f2482e * f6;
        double d4 = f7;
        int i16 = this.f2478a;
        int i17 = this.f2479b;
        int i18 = 1;
        if (d4 > 1.00001d || d4 < 0.99999d) {
            int i19 = this.f2488k;
            int i20 = this.f2485h;
            if (i19 >= i20) {
                int i21 = 0;
                while (true) {
                    int i22 = this.f2495r;
                    if (i22 > 0) {
                        int min = Math.min(i20, i22);
                        a(this.f2487j, i21, min);
                        this.f2495r -= min;
                        i21 += min;
                        i5 = i15;
                        f4 = f8;
                        i4 = i16;
                    } else {
                        short[] sArr = this.f2487j;
                        int i23 = i16 > 4000 ? i16 / 4000 : i18;
                        int i24 = this.f2484g;
                        int i25 = this.f2483f;
                        if (i17 == i18 && i23 == i18) {
                            i6 = d(sArr, i21, i25, i24);
                            i5 = i15;
                            f4 = f8;
                            i4 = i16;
                        } else {
                            b(sArr, i21, i23);
                            i4 = i16;
                            i5 = i15;
                            short[] sArr2 = this.f2486i;
                            f4 = f8;
                            int d5 = d(sArr2, 0, i25 / i23, i24 / i23);
                            if (i23 != 1) {
                                int i26 = d5 * i23;
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
                                    i6 = d(sArr, i21, i25, i24);
                                } else {
                                    b(sArr, i21, 1);
                                    i6 = d(sArr2, 0, i25, i24);
                                }
                            } else {
                                i6 = d5;
                            }
                        }
                        int i30 = this.f2497u;
                        int i31 = this.f2498v;
                        if (i30 == 0 || (i7 = this.s) == 0 || i31 > i30 * 3 || i30 * 2 <= this.f2496t * 3) {
                            i7 = i6;
                        }
                        this.f2496t = i30;
                        this.s = i6;
                        if (d4 > 1.0d) {
                            short[] sArr3 = this.f2487j;
                            if (f7 >= 2.0f) {
                                i9 = (int) (i7 / (f7 - 1.0f));
                            } else {
                                this.f2495r = (int) (((2.0f - f7) * i7) / (f7 - 1.0f));
                                i9 = i7;
                            }
                            short[] c4 = c(this.f2489l, this.f2490m, i9);
                            this.f2489l = c4;
                            int i32 = i21;
                            e(i9, this.f2479b, c4, this.f2490m, sArr3, i32, sArr3, i21 + i7);
                            this.f2490m += i9;
                            i21 = i7 + i9 + i32;
                        } else {
                            int i33 = i21;
                            short[] sArr4 = this.f2487j;
                            if (f7 < 0.5f) {
                                i8 = (int) ((i7 * f7) / (1.0f - f7));
                            } else {
                                this.f2495r = (int) ((((2.0f * f7) - 1.0f) * i7) / (1.0f - f7));
                                i8 = i7;
                            }
                            int i34 = i7 + i8;
                            short[] c5 = c(this.f2489l, this.f2490m, i34);
                            this.f2489l = c5;
                            System.arraycopy(sArr4, i33 * i17, c5, this.f2490m * i17, i7 * i17);
                            e(i8, this.f2479b, this.f2489l, this.f2490m + i7, sArr4, i33 + i7, sArr4, i33);
                            this.f2490m += i34;
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
                int i35 = this.f2488k - i21;
                short[] sArr5 = this.f2487j;
                System.arraycopy(sArr5, i21 * i17, sArr5, 0, i35 * i17);
                this.f2488k = i35;
                if (f4 != 1.0f || this.f2490m == (i10 = i5)) {
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
                int i39 = this.f2490m - i10;
                short[] c6 = c(this.f2491n, this.f2492o, i39);
                this.f2491n = c6;
                System.arraycopy(this.f2489l, i10 * i17, c6, this.f2492o * i17, i39 * i17);
                this.f2490m = i10;
                this.f2492o += i39;
                int i40 = 0;
                while (true) {
                    i11 = this.f2492o;
                    i12 = i11 - 1;
                    if (i40 >= i12) {
                        break;
                    }
                    while (true) {
                        i13 = this.f2493p + 1;
                        int i41 = i13 * i37;
                        i14 = this.f2494q;
                        if (i41 <= i14 * i38) {
                            break;
                        }
                        this.f2489l = c(this.f2489l, this.f2490m, 1);
                        for (int i42 = 0; i42 < i17; i42++) {
                            short[] sArr6 = this.f2489l;
                            int i43 = (this.f2490m * i17) + i42;
                            short[] sArr7 = this.f2491n;
                            int i44 = (i40 * i17) + i42;
                            short s = sArr7[i44];
                            short s4 = sArr7[i44 + i17];
                            int i45 = this.f2494q * i38;
                            int i46 = this.f2493p;
                            int i47 = i46 * i37;
                            int i48 = (i46 + 1) * i37;
                            int i49 = i48 - i45;
                            int i50 = i48 - i47;
                            sArr6[i43] = (short) ((((i50 - i49) * s4) + (s * i49)) / i50);
                        }
                        this.f2494q++;
                        this.f2490m++;
                    }
                    this.f2493p = i13;
                    if (i13 == i38) {
                        this.f2493p = 0;
                        W.a.j(i14 == i37);
                        this.f2494q = 0;
                    }
                    i40++;
                }
                if (i12 == 0) {
                    return;
                }
                short[] sArr8 = this.f2491n;
                System.arraycopy(sArr8, i12 * i17, sArr8, 0, (i11 - i12) * i17);
                this.f2492o -= i12;
                return;
            }
        } else {
            a(this.f2487j, 0, this.f2488k);
            this.f2488k = 0;
        }
        i5 = i15;
        f4 = f8;
        i4 = i16;
        if (f4 != 1.0f) {
        }
    }
}
