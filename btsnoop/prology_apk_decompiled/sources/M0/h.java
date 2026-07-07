package M0;

import C.C0016c;
import T.G;
import T.H;
import W.q;
import W.r;
import W.y;
import f2.C0278F;
import f2.I;
import f2.c0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class h extends AbstractC0462a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0016c f1140b = new C0016c(5);

    /* renamed from: a, reason: collision with root package name */
    public final C0016c f1141a;

    public h(C0016c c0016c) {
        this.f1141a = c0016c;
    }

    public static a e0(r rVar, int i4, int i5) {
        int w02;
        String concat;
        int u4 = rVar.u();
        Charset t02 = t0(u4);
        int i6 = i4 - 1;
        byte[] bArr = new byte[i6];
        rVar.f(bArr, 0, i6);
        if (i5 == 2) {
            concat = "image/" + U1.a.I(new String(bArr, 0, 3, e2.d.f5435b));
            if ("image/jpg".equals(concat)) {
                concat = "image/jpeg";
            }
            w02 = 2;
        } else {
            w02 = w0(bArr, 0);
            String I3 = U1.a.I(new String(bArr, 0, w02, e2.d.f5435b));
            concat = I3.indexOf(47) == -1 ? "image/".concat(I3) : I3;
        }
        int i7 = bArr[w02 + 1] & 255;
        int i8 = w02 + 2;
        int v02 = v0(bArr, i8, u4);
        String str = new String(bArr, i8, v02 - i8, t02);
        int s02 = s0(u4) + v02;
        return new a(concat, str, i7, i6 <= s02 ? y.f2714f : Arrays.copyOfRange(bArr, s02, i6));
    }

    public static c f0(r rVar, int i4, int i5, boolean z4, int i6, C0016c c0016c) {
        int i7 = rVar.f2695b;
        int w02 = w0(rVar.f2694a, i7);
        String str = new String(rVar.f2694a, i7, w02 - i7, e2.d.f5435b);
        rVar.G(w02 + 1);
        int h4 = rVar.h();
        int h5 = rVar.h();
        long w = rVar.w();
        long j4 = w == 4294967295L ? -1L : w;
        long w4 = rVar.w();
        long j5 = w4 == 4294967295L ? -1L : w4;
        ArrayList arrayList = new ArrayList();
        int i8 = i7 + i4;
        while (rVar.f2695b < i8) {
            i i02 = i0(i5, rVar, z4, i6, c0016c);
            if (i02 != null) {
                arrayList.add(i02);
            }
        }
        return new c(str, h4, h5, j4, j5, (i[]) arrayList.toArray(new i[0]));
    }

    public static d g0(r rVar, int i4, int i5, boolean z4, int i6, C0016c c0016c) {
        int i7 = rVar.f2695b;
        int w02 = w0(rVar.f2694a, i7);
        String str = new String(rVar.f2694a, i7, w02 - i7, e2.d.f5435b);
        rVar.G(w02 + 1);
        int u4 = rVar.u();
        boolean z5 = (u4 & 2) != 0;
        boolean z6 = (u4 & 1) != 0;
        int u5 = rVar.u();
        String[] strArr = new String[u5];
        for (int i8 = 0; i8 < u5; i8++) {
            int i9 = rVar.f2695b;
            int w03 = w0(rVar.f2694a, i9);
            strArr[i8] = new String(rVar.f2694a, i9, w03 - i9, e2.d.f5435b);
            rVar.G(w03 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i10 = i7 + i4;
        while (rVar.f2695b < i10) {
            i i02 = i0(i5, rVar, z4, i6, c0016c);
            if (i02 != null) {
                arrayList.add(i02);
            }
        }
        return new d(str, z5, z6, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    public static e h0(int i4, r rVar) {
        if (i4 < 4) {
            return null;
        }
        int u4 = rVar.u();
        Charset t02 = t0(u4);
        byte[] bArr = new byte[3];
        rVar.f(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i5 = i4 - 4;
        byte[] bArr2 = new byte[i5];
        rVar.f(bArr2, 0, i5);
        int v02 = v0(bArr2, 0, u4);
        String str2 = new String(bArr2, 0, v02, t02);
        int s02 = s0(u4) + v02;
        return new e(str, str2, m0(bArr2, s02, v0(bArr2, s02, u4), t02));
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0199, code lost:
    
        if (r12 == 67) goto L152;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static M0.i i0(int r18, W.r r19, boolean r20, int r21, C.C0016c r22) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.h.i0(int, W.r, boolean, int, C.c):M0.i");
    }

    public static f j0(int i4, r rVar) {
        int u4 = rVar.u();
        Charset t02 = t0(u4);
        int i5 = i4 - 1;
        byte[] bArr = new byte[i5];
        rVar.f(bArr, 0, i5);
        int w02 = w0(bArr, 0);
        String l4 = H.l(new String(bArr, 0, w02, e2.d.f5435b));
        int i6 = w02 + 1;
        int v02 = v0(bArr, i6, u4);
        String m02 = m0(bArr, i6, v02, t02);
        int s02 = s0(u4) + v02;
        int v03 = v0(bArr, s02, u4);
        String m03 = m0(bArr, s02, v03, t02);
        int s03 = s0(u4) + v03;
        return new f(l4, m02, m03, i5 <= s03 ? y.f2714f : Arrays.copyOfRange(bArr, s03, i5));
    }

    public static l k0(int i4, r rVar) {
        int A4 = rVar.A();
        int x3 = rVar.x();
        int x4 = rVar.x();
        int u4 = rVar.u();
        int u5 = rVar.u();
        q qVar = new q();
        qVar.o(rVar);
        int i5 = ((i4 - 10) * 8) / (u4 + u5);
        int[] iArr = new int[i5];
        int[] iArr2 = new int[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = qVar.i(u4);
            int i8 = qVar.i(u5);
            iArr[i6] = i7;
            iArr2[i6] = i8;
        }
        return new l(A4, x3, x4, iArr, iArr2);
    }

    public static m l0(int i4, r rVar) {
        byte[] bArr = new byte[i4];
        rVar.f(bArr, 0, i4);
        int w02 = w0(bArr, 0);
        String str = new String(bArr, 0, w02, e2.d.f5435b);
        int i5 = w02 + 1;
        return new m(str, i4 <= i5 ? y.f2714f : Arrays.copyOfRange(bArr, i5, i4));
    }

    public static String m0(byte[] bArr, int i4, int i5, Charset charset) {
        return (i5 <= i4 || i5 > bArr.length) ? "" : new String(bArr, i4, i5 - i4, charset);
    }

    public static n n0(int i4, r rVar, String str) {
        if (i4 < 1) {
            return null;
        }
        int u4 = rVar.u();
        int i5 = i4 - 1;
        byte[] bArr = new byte[i5];
        rVar.f(bArr, 0, i5);
        return new n(str, null, o0(bArr, u4, 0));
    }

    public static c0 o0(byte[] bArr, int i4, int i5) {
        if (i5 >= bArr.length) {
            return I.o("");
        }
        C0278F i6 = I.i();
        int v02 = v0(bArr, i5, i4);
        while (i5 < v02) {
            i6.a(new String(bArr, i5, v02 - i5, t0(i4)));
            i5 = s0(i4) + v02;
            v02 = v0(bArr, i5, i4);
        }
        c0 g4 = i6.g();
        return g4.isEmpty() ? I.o("") : g4;
    }

    public static n p0(int i4, r rVar) {
        if (i4 < 1) {
            return null;
        }
        int u4 = rVar.u();
        int i5 = i4 - 1;
        byte[] bArr = new byte[i5];
        rVar.f(bArr, 0, i5);
        int v02 = v0(bArr, 0, u4);
        return new n("TXXX", new String(bArr, 0, v02, t0(u4)), o0(bArr, u4, s0(u4) + v02));
    }

    public static o q0(int i4, r rVar, String str) {
        byte[] bArr = new byte[i4];
        rVar.f(bArr, 0, i4);
        return new o(str, null, new String(bArr, 0, w0(bArr, 0), e2.d.f5435b));
    }

    public static o r0(int i4, r rVar) {
        if (i4 < 1) {
            return null;
        }
        int u4 = rVar.u();
        int i5 = i4 - 1;
        byte[] bArr = new byte[i5];
        rVar.f(bArr, 0, i5);
        int v02 = v0(bArr, 0, u4);
        String str = new String(bArr, 0, v02, t0(u4));
        int s02 = s0(u4) + v02;
        return new o("WXXX", str, m0(bArr, s02, w0(bArr, s02), e2.d.f5435b));
    }

    public static int s0(int i4) {
        return (i4 == 0 || i4 == 3) ? 1 : 2;
    }

    public static Charset t0(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? e2.d.f5435b : e2.d.f5436c : e2.d.f5437d : e2.d.f5439f;
    }

    public static String u0(int i4, int i5, int i6, int i7, int i8) {
        return i4 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8));
    }

    public static int v0(byte[] bArr, int i4, int i5) {
        int w02 = w0(bArr, i4);
        if (i5 == 0 || i5 == 3) {
            return w02;
        }
        while (w02 < bArr.length - 1) {
            if ((w02 - i4) % 2 == 0 && bArr[w02 + 1] == 0) {
                return w02;
            }
            w02 = w0(bArr, w02 + 1);
        }
        return bArr.length;
    }

    public static int w0(byte[] bArr, int i4) {
        while (i4 < bArr.length) {
            if (bArr[i4] == 0) {
                return i4;
            }
            i4++;
        }
        return bArr.length;
    }

    public static int x0(int i4, r rVar) {
        byte[] bArr = rVar.f2694a;
        int i5 = rVar.f2695b;
        int i6 = i5;
        while (true) {
            int i7 = i6 + 1;
            if (i7 >= i5 + i4) {
                return i4;
            }
            if ((bArr[i6] & 255) == 255 && bArr[i7] == 0) {
                System.arraycopy(bArr, i6 + 2, bArr, i7, (i4 - (i6 - i5)) - 2);
                i4--;
            }
            i6 = i7;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0087, code lost:
    
        if ((r10 & 128) != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean y0(W.r r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f2695b
        L6:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r18.h()     // Catch: java.lang.Throwable -> L20
            long r8 = r18.w()     // Catch: java.lang.Throwable -> L20
            int r10 = r18.A()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r18.x()     // Catch: java.lang.Throwable -> L20
            int r8 = r18.x()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.G(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.G(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6c:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L74
            r3 = r4
            goto L75
        L74:
            r3 = r6
        L75:
            r7 = r10 & 1
            if (r7 == 0) goto L7a
            goto L8c
        L7a:
            r4 = r6
            goto L8c
        L7c:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = r4
            goto L85
        L84:
            r3 = r6
        L85:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L7a
            goto L8c
        L8a:
            r3 = r6
            r4 = r3
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L99
            r1.G(r2)
            return r6
        L99:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.G(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.H(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.G(r2)
            return r4
        Lb0:
            r1.G(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.h.y0(W.r, int, int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T.G d0(byte[] r13, int r14) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.h.d0(byte[], int):T.G");
    }

    @Override // p1.AbstractC0462a
    public final G v(H0.a aVar, ByteBuffer byteBuffer) {
        return d0(byteBuffer.array(), byteBuffer.limit());
    }
}
