package y0;

import B2.AbstractC0007h;
import T.I;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import w0.C0591a;

/* renamed from: y0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0619b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f9014a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f9015b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f9016c = {1, 2, 3, 6};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f9017d = {48000, 44100, 32000};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f9018e = {24000, 22050, 16000};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f9019f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f9020g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f9021h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f9022i = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f9023j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f9024k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f9025l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f9026m = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f9027n = {5, 8, 10, 12};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f9028o = {6, 9, 12, 15};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f9029p = {2, 4, 6, 8};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f9030q = {9, 11, 13, 16};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f9031r = {5, 8, 10, 12};
    public static final String[] s = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f9032t = {44100, 48000, 32000};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f9033u = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f9034v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f9035x = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f9036y = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static byte[] a(int i4, int i5) {
        int i6 = -1;
        for (int i7 = 0; i7 < 13; i7++) {
            if (i4 == f9014a[i7]) {
                i6 = i7;
            }
        }
        int i8 = -1;
        for (int i9 = 0; i9 < 16; i9++) {
            if (i5 == f9015b[i9]) {
                i8 = i9;
            }
        }
        if (i4 == -1 || i8 == -1) {
            throw new IllegalArgumentException(AbstractC0007h.i(i4, i5, "Invalid sample rate or number of channels: ", ", "));
        }
        return b(2, i6, i8);
    }

    public static byte[] b(int i4, int i5, int i6) {
        return new byte[]{(byte) (((i4 << 3) & 248) | ((i5 >> 1) & 7)), (byte) (((i5 << 7) & 128) | ((i6 << 3) & 120))};
    }

    public static ArrayList c(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        if (r13 == r21.f9109f) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
    
        if ((r20.u() * 1000) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a5, code lost:
    
        if (r6 == r1) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(W.r r20, y0.s r21, int r22, T.C0098t r23) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.AbstractC0619b.d(W.r, y0.s, int, T.t):boolean");
    }

    public static void e(String str, boolean z4) {
        if (!z4) {
            throw I.a(null, str);
        }
    }

    public static void f(long j4, W.r rVar, F[] fArr) {
        int i4;
        while (true) {
            if (rVar.a() <= 1) {
                return;
            }
            int i5 = 0;
            while (true) {
                if (rVar.a() == 0) {
                    i4 = -1;
                    break;
                }
                int u4 = rVar.u();
                i5 += u4;
                if (u4 != 255) {
                    i4 = i5;
                    break;
                }
            }
            int i6 = 0;
            while (true) {
                if (rVar.a() == 0) {
                    i6 = -1;
                    break;
                }
                int u5 = rVar.u();
                i6 += u5;
                if (u5 != 255) {
                    break;
                }
            }
            int i7 = rVar.f2695b + i6;
            if (i6 == -1 || i6 > rVar.a()) {
                W.a.A("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i7 = rVar.f2696c;
            } else if (i4 == 4 && i6 >= 8) {
                int u6 = rVar.u();
                int A4 = rVar.A();
                int h4 = A4 == 49 ? rVar.h() : 0;
                int u7 = rVar.u();
                if (A4 == 47) {
                    rVar.H(1);
                }
                boolean z4 = u6 == 181 && (A4 == 49 || A4 == 47) && u7 == 3;
                if (A4 == 49) {
                    z4 &= h4 == 1195456820;
                }
                if (z4) {
                    g(j4, rVar, fArr);
                }
            }
            rVar.G(i7);
        }
    }

    public static void g(long j4, W.r rVar, F[] fArr) {
        int u4 = rVar.u();
        if ((u4 & 64) != 0) {
            rVar.H(1);
            int i4 = (u4 & 31) * 3;
            int i5 = rVar.f2695b;
            for (F f4 : fArr) {
                rVar.G(i5);
                f4.a(rVar, i4, 0);
                W.a.j(j4 != -9223372036854775807L);
                f4.b(j4, 1, i4, 0, null);
            }
        }
    }

    public static int h(int i4, int i5) {
        int i6 = i5 / 2;
        if (i4 < 0 || i4 >= 3 || i5 < 0 || i6 >= 19) {
            return -1;
        }
        int i7 = f9017d[i4];
        if (i7 == 44100) {
            return ((i5 % 2) + f9021h[i6]) * 2;
        }
        int i8 = f9020g[i6];
        return i7 == 32000 ? i8 * 6 : i8 * 4;
    }

    public static void i(int i4, W.r rVar) {
        rVar.D(7);
        byte[] bArr = rVar.f2694a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i4 >> 16) & 255);
        bArr[5] = (byte) ((i4 >> 8) & 255);
        bArr[6] = (byte) (i4 & 255);
    }

    public static int j(int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (!((i4 & (-2097152)) == -2097152) || (i5 = (i4 >>> 19) & 3) == 1 || (i6 = (i4 >>> 17) & 3) == 0 || (i7 = (i4 >>> 12) & 15) == 0 || i7 == 15 || (i8 = (i4 >>> 10) & 3) == 3) {
            return -1;
        }
        int i9 = f9032t[i8];
        if (i5 == 2) {
            i9 /= 2;
        } else if (i5 == 0) {
            i9 /= 4;
        }
        int i10 = (i4 >>> 9) & 1;
        if (i6 == 3) {
            return ((((i5 == 3 ? f9033u[i7 - 1] : f9034v[i7 - 1]) * 12) / i9) + i10) * 4;
        }
        int i11 = i5 == 3 ? i6 == 2 ? w[i7 - 1] : f9035x[i7 - 1] : f9036y[i7 - 1];
        if (i5 == 3) {
            return ((i11 * 144) / i9) + i10;
        }
        return (((i6 == 1 ? 72 : 144) * i11) / i9) + i10;
    }

    public static W.q k(byte[] bArr) {
        byte b4 = bArr[0];
        if (b4 == Byte.MAX_VALUE || b4 == 100 || b4 == 64 || b4 == 113) {
            return new W.q(bArr, bArr.length);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b5 = copyOf[0];
        if (b5 == -2 || b5 == -1 || b5 == 37 || b5 == -14 || b5 == -24) {
            for (int i4 = 0; i4 < copyOf.length - 1; i4 += 2) {
                byte b6 = copyOf[i4];
                int i5 = i4 + 1;
                copyOf[i4] = copyOf[i5];
                copyOf[i5] = b6;
            }
        }
        W.q qVar = new W.q(copyOf, copyOf.length);
        if (copyOf[0] == 31) {
            W.q qVar2 = new W.q(copyOf, copyOf.length);
            while (qVar2.b() >= 16) {
                qVar2.t(2);
                int i6 = qVar2.i(14) & 16383;
                int min = Math.min(8 - qVar.f2688c, 14);
                int i7 = qVar.f2688c;
                int i8 = (8 - i7) - min;
                byte[] bArr2 = qVar.f2689d;
                int i9 = qVar.f2687b;
                byte b7 = (byte) (((65280 >> i7) | ((1 << i8) - 1)) & bArr2[i9]);
                bArr2[i9] = b7;
                int i10 = 14 - min;
                bArr2[i9] = (byte) (b7 | ((i6 >>> i10) << i8));
                int i11 = i9 + 1;
                while (i10 > 8) {
                    qVar.f2689d[i11] = (byte) (i6 >>> (i10 - 8));
                    i10 -= 8;
                    i11++;
                }
                int i12 = 8 - i10;
                byte[] bArr3 = qVar.f2689d;
                byte b8 = (byte) (bArr3[i11] & ((1 << i12) - 1));
                bArr3[i11] = b8;
                bArr3[i11] = (byte) (((i6 & ((1 << i10) - 1)) << i12) | b8);
                qVar.t(14);
                qVar.a();
            }
        }
        qVar.p(copyOf, copyOf.length);
        return qVar;
    }

    public static long l(byte b4, byte b5) {
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

    public static int m(W.q qVar) {
        int i4 = qVar.i(4);
        if (i4 == 15) {
            if (qVar.b() >= 24) {
                return qVar.i(24);
            }
            throw I.a(null, "AAC header insufficient data");
        }
        if (i4 < 13) {
            return f9014a[i4];
        }
        throw I.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static int n(int i4) {
        int i5 = 0;
        while (i4 > 0) {
            i5++;
            i4 >>>= 1;
        }
        return i5;
    }

    public static C0620c o(W.q qVar) {
        int h4;
        int i4;
        int i5;
        String str;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int g4 = qVar.g();
        qVar.t(40);
        boolean z4 = qVar.i(5) > 10;
        qVar.q(g4);
        int[] iArr = f9019f;
        int[] iArr2 = f9017d;
        if (z4) {
            qVar.t(16);
            int i18 = qVar.i(2);
            if (i18 == 0) {
                r9 = 0;
            } else if (i18 == 1) {
                r9 = 1;
            } else if (i18 == 2) {
                r9 = 2;
            }
            qVar.t(3);
            h4 = (qVar.i(11) + 1) * 2;
            int i19 = qVar.i(2);
            if (i19 == 3) {
                i10 = f9018e[qVar.i(2)];
                i9 = 3;
                i11 = 6;
            } else {
                i9 = qVar.i(2);
                int i20 = f9016c[i9];
                i10 = iArr2[i19];
                i11 = i20;
            }
            int i21 = i11 * 256;
            int i22 = (h4 * i10) / (i11 * 32);
            int i23 = qVar.i(3);
            boolean h5 = qVar.h();
            int i24 = iArr[i23] + (h5 ? 1 : 0);
            qVar.t(10);
            if (qVar.h()) {
                qVar.t(8);
            }
            if (i23 == 0) {
                qVar.t(5);
                if (qVar.h()) {
                    qVar.t(8);
                }
            }
            if (r9 == 1 && qVar.h()) {
                qVar.t(16);
            }
            if (qVar.h()) {
                if (i23 > 2) {
                    qVar.t(2);
                }
                if ((i23 & 1) == 0 || i23 <= 2) {
                    i14 = 6;
                } else {
                    i14 = 6;
                    qVar.t(6);
                }
                if ((i23 & 4) != 0) {
                    qVar.t(i14);
                }
                if (h5 && qVar.h()) {
                    qVar.t(5);
                }
                if (r9 == 0) {
                    if (qVar.h()) {
                        i15 = 6;
                        qVar.t(6);
                    } else {
                        i15 = 6;
                    }
                    if (i23 == 0 && qVar.h()) {
                        qVar.t(i15);
                    }
                    if (qVar.h()) {
                        qVar.t(i15);
                    }
                    int i25 = qVar.i(2);
                    if (i25 == 1) {
                        qVar.t(5);
                        i17 = 2;
                    } else {
                        if (i25 == 2) {
                            qVar.t(12);
                        } else if (i25 == 3) {
                            int i26 = qVar.i(5);
                            if (qVar.h()) {
                                qVar.t(5);
                                if (qVar.h()) {
                                    qVar.t(4);
                                }
                                if (qVar.h()) {
                                    qVar.t(4);
                                }
                                if (qVar.h()) {
                                    qVar.t(4);
                                }
                                if (qVar.h()) {
                                    qVar.t(4);
                                }
                                if (qVar.h()) {
                                    qVar.t(4);
                                }
                                if (qVar.h()) {
                                    qVar.t(4);
                                }
                                if (qVar.h()) {
                                    qVar.t(4);
                                }
                                if (qVar.h()) {
                                    if (qVar.h()) {
                                        qVar.t(4);
                                    }
                                    if (qVar.h()) {
                                        qVar.t(4);
                                    }
                                }
                            }
                            if (qVar.h()) {
                                qVar.t(5);
                                if (qVar.h()) {
                                    qVar.t(7);
                                    if (qVar.h()) {
                                        i16 = 8;
                                        qVar.t(8);
                                        i17 = 2;
                                        qVar.t((i26 + 2) * i16);
                                        qVar.c();
                                    }
                                }
                            }
                            i16 = 8;
                            i17 = 2;
                            qVar.t((i26 + 2) * i16);
                            qVar.c();
                        }
                        i17 = 2;
                    }
                    if (i23 < i17) {
                        if (qVar.h()) {
                            qVar.t(14);
                        }
                        if (i23 == 0 && qVar.h()) {
                            qVar.t(14);
                        }
                    }
                    if (qVar.h()) {
                        if (i9 == 0) {
                            qVar.t(5);
                        } else {
                            for (int i27 = 0; i27 < i11; i27++) {
                                if (qVar.h()) {
                                    qVar.t(5);
                                }
                            }
                        }
                    }
                }
            }
            if (qVar.h()) {
                qVar.t(5);
                if (i23 == 2) {
                    qVar.t(4);
                }
                if (i23 >= 6) {
                    qVar.t(2);
                }
                if (qVar.h()) {
                    i13 = 8;
                    qVar.t(8);
                } else {
                    i13 = 8;
                }
                if (i23 == 0 && qVar.h()) {
                    qVar.t(i13);
                }
                if (i19 < 3) {
                    qVar.s();
                }
            }
            if (r9 == 0 && i9 != 3) {
                qVar.s();
            }
            if (r9 == 2 && (i9 == 3 || qVar.h())) {
                i12 = 6;
                qVar.t(6);
            } else {
                i12 = 6;
            }
            str = (qVar.h() && qVar.i(i12) == 1 && qVar.i(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i5 = i24;
            i7 = i10;
            i8 = i21;
            i6 = i22;
        } else {
            qVar.t(32);
            int i28 = qVar.i(2);
            String str2 = i28 == 3 ? null : "audio/ac3";
            int i29 = qVar.i(6);
            int i30 = f9020g[i29 / 2] * 1000;
            h4 = h(i28, i29);
            qVar.t(8);
            int i31 = qVar.i(3);
            if ((i31 & 1) == 0 || i31 == 1) {
                i4 = 2;
            } else {
                i4 = 2;
                qVar.t(2);
            }
            if ((i31 & 4) != 0) {
                qVar.t(i4);
            }
            if (i31 == i4) {
                qVar.t(i4);
            }
            r9 = i28 < 3 ? iArr2[i28] : -1;
            i5 = iArr[i31] + (qVar.h() ? 1 : 0);
            str = str2;
            i6 = i30;
            i7 = r9;
            i8 = 1536;
        }
        return new C0620c(str, i5, i7, h4, i8, i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r9.h() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r2 = r9.i(10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r9.h() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r9.i(3) <= 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        r9.t(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r9.h() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r5 = 48000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        r9 = r9.i(4);
        r8 = y0.AbstractC0619b.f9022i;
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
    
        return new A0.c(r5, r0, r9);
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
    
        if (r9.i(2) == 3) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r9.i(2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static A0.c p(W.q r9) {
        /*
            r0 = 16
            int r1 = r9.i(r0)
            int r0 = r9.i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.i(r0)
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
            int r2 = r9.i(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.i(r1)
            boolean r2 = r9.h()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.i(r2)
            boolean r5 = r9.h()
            if (r5 == 0) goto L47
            int r5 = r9.i(r4)
            if (r5 <= 0) goto L47
            r9.t(r1)
        L47:
            boolean r5 = r9.h()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L55
            r5 = r7
            goto L56
        L55:
            r5 = r6
        L56:
            int r9 = r9.i(r3)
            int[] r8 = y0.AbstractC0619b.f9022i
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
        throw new UnsupportedOperationException("Method not decompiled: y0.AbstractC0619b.p(W.q):A0.c");
    }

    public static C0618a q(W.q qVar, boolean z4) {
        int i4 = qVar.i(5);
        if (i4 == 31) {
            i4 = qVar.i(6) + 32;
        }
        int m4 = m(qVar);
        int i5 = qVar.i(4);
        String k4 = AbstractC0007h.k("mp4a.40.", i4);
        if (i4 == 5 || i4 == 29) {
            m4 = m(qVar);
            int i6 = qVar.i(5);
            if (i6 == 31) {
                i6 = qVar.i(6) + 32;
            }
            i4 = i6;
            if (i4 == 22) {
                i5 = qVar.i(4);
            }
        }
        if (z4) {
            if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4 && i4 != 6 && i4 != 7 && i4 != 17) {
                switch (i4) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw I.c("Unsupported audio object type: " + i4);
                }
            }
            if (qVar.h()) {
                W.a.A("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (qVar.h()) {
                qVar.t(14);
            }
            boolean h4 = qVar.h();
            if (i5 == 0) {
                throw new UnsupportedOperationException();
            }
            if (i4 == 6 || i4 == 20) {
                qVar.t(3);
            }
            if (h4) {
                if (i4 == 22) {
                    qVar.t(16);
                }
                if (i4 == 17 || i4 == 19 || i4 == 20 || i4 == 23) {
                    qVar.t(3);
                }
                qVar.t(1);
            }
            switch (i4) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int i7 = qVar.i(2);
                    if (i7 == 2 || i7 == 3) {
                        throw I.c("Unsupported epConfig: " + i7);
                    }
            }
        }
        int i8 = f9015b[i5];
        if (i8 != -1) {
            return new C0618a(m4, i8, k4);
        }
        throw I.a(null, null);
    }

    public static int r(W.q qVar, int[] iArr) {
        int i4 = 0;
        for (int i5 = 0; i5 < 3 && qVar.h(); i5++) {
            i4++;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < i4; i7++) {
            i6 += 1 << iArr[i7];
        }
        return qVar.i(iArr[i4]) + i6;
    }

    public static T.G s(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < list.size(); i4++) {
            String str = (String) list.get(i4);
            int i5 = W.y.f2709a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                W.a.A("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(K0.a.d(new W.r(Base64.decode(split[1], 0))));
                } catch (RuntimeException e4) {
                    W.a.B("VorbisUtil", "Failed to parse vorbis picture", e4);
                }
            } else {
                arrayList.add(new K0.b(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new T.G(arrayList);
    }

    public static int t(int i4, W.r rVar) {
        switch (i4) {
            case 1:
                return 192;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
            case L.k.LONG_FIELD_NUMBER /* 4 */:
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                return 576 << (i4 - 2);
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return rVar.u() + 1;
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return rVar.A() + 1;
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
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

    public static u3.m u(W.r rVar) {
        rVar.H(1);
        int x3 = rVar.x();
        long j4 = rVar.f2695b + x3;
        int i4 = x3 / 18;
        long[] jArr = new long[i4];
        long[] jArr2 = new long[i4];
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                break;
            }
            long o2 = rVar.o();
            if (o2 == -1) {
                jArr = Arrays.copyOf(jArr, i5);
                jArr2 = Arrays.copyOf(jArr2, i5);
                break;
            }
            jArr[i5] = o2;
            jArr2[i5] = rVar.o();
            rVar.H(2);
            i5++;
        }
        rVar.H((int) (j4 - rVar.f2695b));
        return new u3.m(jArr, jArr2);
    }

    public static C0591a v(W.r rVar, boolean z4, boolean z5) {
        if (z4) {
            w(3, rVar, false);
        }
        rVar.s((int) rVar.l(), e2.d.f5436c);
        long l4 = rVar.l();
        String[] strArr = new String[(int) l4];
        for (int i4 = 0; i4 < l4; i4++) {
            strArr[i4] = rVar.s((int) rVar.l(), e2.d.f5436c);
        }
        if (z5 && (rVar.u() & 1) == 0) {
            throw I.a(null, "framing bit expected to be set");
        }
        return new C0591a(strArr);
    }

    public static boolean w(int i4, W.r rVar, boolean z4) {
        if (rVar.a() < 7) {
            if (z4) {
                return false;
            }
            throw I.a(null, "too short header: " + rVar.a());
        }
        if (rVar.u() != i4) {
            if (z4) {
                return false;
            }
            throw I.a(null, "expected header type " + Integer.toHexString(i4));
        }
        if (rVar.u() == 118 && rVar.u() == 111 && rVar.u() == 114 && rVar.u() == 98 && rVar.u() == 105 && rVar.u() == 115) {
            return true;
        }
        if (z4) {
            return false;
        }
        throw I.a(null, "expected characters 'vorbis'");
    }
}
