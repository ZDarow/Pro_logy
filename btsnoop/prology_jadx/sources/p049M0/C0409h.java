package p049M0;

/* renamed from: M0.h */
/* loaded from: classes.dex */
public final class C0409h extends p176p1.AbstractC1949a {

    /* renamed from: b */
    public static final p011C.C0111c f1179b = new p011C.C0111c(5);

    /* renamed from: a */
    public final p011C.C0111c f1180a;

    public C0409h(p011C.C0111c c0111c) {
        this.f1180a = c0111c;
    }

    /* renamed from: e0 */
    public static p049M0.C0402a m860e0(p086W.C0798r c0798r, int i4, int i5) {
        int m878w0;
        java.lang.String concat;
        int m1559u = c0798r.m1559u();
        java.nio.charset.Charset m875t0 = m875t0(m1559u);
        int i6 = i4 - 1;
        byte[] bArr = new byte[i6];
        c0798r.m1544f(bArr, 0, i6);
        if (i5 == 2) {
            concat = "image/" + p080U1.AbstractC0748a.m1361I(new java.lang.String(bArr, 0, 3, p124e2.AbstractC1356d.f5629b));
            if ("image/jpg".equals(concat)) {
                concat = "image/jpeg";
            }
            m878w0 = 2;
        } else {
            m878w0 = m878w0(bArr, 0);
            java.lang.String m1361I = p080U1.AbstractC0748a.m1361I(new java.lang.String(bArr, 0, m878w0, p124e2.AbstractC1356d.f5629b));
            concat = m1361I.indexOf(47) == -1 ? "image/".concat(m1361I) : m1361I;
        }
        int i7 = bArr[m878w0 + 1] & 255;
        int i8 = m878w0 + 2;
        int m877v0 = m877v0(bArr, i8, m1559u);
        java.lang.String str = new java.lang.String(bArr, i8, m877v0 - i8, m875t0);
        int m874s0 = m874s0(m1559u) + m877v0;
        return new p049M0.C0402a(concat, str, i7, i6 <= m874s0 ? p086W.AbstractC0805y.f2806f : java.util.Arrays.copyOfRange(bArr, m874s0, i6));
    }

    /* renamed from: f0 */
    public static p049M0.C0404c m861f0(p086W.C0798r c0798r, int i4, int i5, boolean z4, int i6, p011C.C0111c c0111c) {
        int i7 = c0798r.f2787b;
        int m878w0 = m878w0(c0798r.f2786a, i7);
        java.lang.String str = new java.lang.String(c0798r.f2786a, i7, m878w0 - i7, p124e2.AbstractC1356d.f5629b);
        c0798r.m1537G(m878w0 + 1);
        int m1546h = c0798r.m1546h();
        int m1546h2 = c0798r.m1546h();
        long m1561w = c0798r.m1561w();
        long j4 = m1561w == 4294967295L ? -1L : m1561w;
        long m1561w2 = c0798r.m1561w();
        long j5 = m1561w2 == 4294967295L ? -1L : m1561w2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i8 = i7 + i4;
        while (c0798r.f2787b < i8) {
            p049M0.AbstractC0410i m864i0 = m864i0(i5, c0798r, z4, i6, c0111c);
            if (m864i0 != null) {
                arrayList.add(m864i0);
            }
        }
        return new p049M0.C0404c(str, m1546h, m1546h2, j4, j5, (p049M0.AbstractC0410i[]) arrayList.toArray(new p049M0.AbstractC0410i[0]));
    }

    /* renamed from: g0 */
    public static p049M0.C0405d m862g0(p086W.C0798r c0798r, int i4, int i5, boolean z4, int i6, p011C.C0111c c0111c) {
        int i7 = c0798r.f2787b;
        int m878w0 = m878w0(c0798r.f2786a, i7);
        java.lang.String str = new java.lang.String(c0798r.f2786a, i7, m878w0 - i7, p124e2.AbstractC1356d.f5629b);
        c0798r.m1537G(m878w0 + 1);
        int m1559u = c0798r.m1559u();
        boolean z5 = (m1559u & 2) != 0;
        boolean z6 = (m1559u & 1) != 0;
        int m1559u2 = c0798r.m1559u();
        java.lang.String[] strArr = new java.lang.String[m1559u2];
        for (int i8 = 0; i8 < m1559u2; i8++) {
            int i9 = c0798r.f2787b;
            int m878w02 = m878w0(c0798r.f2786a, i9);
            strArr[i8] = new java.lang.String(c0798r.f2786a, i9, m878w02 - i9, p124e2.AbstractC1356d.f5629b);
            c0798r.m1537G(m878w02 + 1);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i10 = i7 + i4;
        while (c0798r.f2787b < i10) {
            p049M0.AbstractC0410i m864i0 = m864i0(i5, c0798r, z4, i6, c0111c);
            if (m864i0 != null) {
                arrayList.add(m864i0);
            }
        }
        return new p049M0.C0405d(str, z5, z6, strArr, (p049M0.AbstractC0410i[]) arrayList.toArray(new p049M0.AbstractC0410i[0]));
    }

    /* renamed from: h0 */
    public static p049M0.C0406e m863h0(int i4, p086W.C0798r c0798r) {
        if (i4 < 4) {
            return null;
        }
        int m1559u = c0798r.m1559u();
        java.nio.charset.Charset m875t0 = m875t0(m1559u);
        byte[] bArr = new byte[3];
        c0798r.m1544f(bArr, 0, 3);
        java.lang.String str = new java.lang.String(bArr, 0, 3);
        int i5 = i4 - 4;
        byte[] bArr2 = new byte[i5];
        c0798r.m1544f(bArr2, 0, i5);
        int m877v0 = m877v0(bArr2, 0, m1559u);
        java.lang.String str2 = new java.lang.String(bArr2, 0, m877v0, m875t0);
        int m874s0 = m874s0(m1559u) + m877v0;
        return new p049M0.C0406e(str, str2, m868m0(bArr2, m874s0, m877v0(bArr2, m874s0, m1559u), m875t0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0199, code lost:
    
        if (r12 == 67) goto L152;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021e  */
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p049M0.AbstractC0410i m864i0(int r18, p086W.C0798r r19, boolean r20, int r21, p011C.C0111c r22) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p049M0.C0409h.m864i0(int, W.r, boolean, int, C.c):M0.i");
    }

    /* renamed from: j0 */
    public static p049M0.C0407f m865j0(int i4, p086W.C0798r c0798r) {
        int m1559u = c0798r.m1559u();
        java.nio.charset.Charset m875t0 = m875t0(m1559u);
        int i5 = i4 - 1;
        byte[] bArr = new byte[i5];
        c0798r.m1544f(bArr, 0, i5);
        int m878w0 = m878w0(bArr, 0);
        java.lang.String m1201l = p076T.AbstractC0665H.m1201l(new java.lang.String(bArr, 0, m878w0, p124e2.AbstractC1356d.f5629b));
        int i6 = m878w0 + 1;
        int m877v0 = m877v0(bArr, i6, m1559u);
        java.lang.String m868m0 = m868m0(bArr, i6, m877v0, m875t0);
        int m874s0 = m874s0(m1559u) + m877v0;
        int m877v02 = m877v0(bArr, m874s0, m1559u);
        java.lang.String m868m02 = m868m0(bArr, m874s0, m877v02, m875t0);
        int m874s02 = m874s0(m1559u) + m877v02;
        return new p049M0.C0407f(m1201l, m868m0, m868m02, i5 <= m874s02 ? p086W.AbstractC0805y.f2806f : java.util.Arrays.copyOfRange(bArr, m874s02, i5));
    }

    /* renamed from: k0 */
    public static p049M0.C0413l m866k0(int i4, p086W.C0798r c0798r) {
        int m1531A = c0798r.m1531A();
        int m1562x = c0798r.m1562x();
        int m1562x2 = c0798r.m1562x();
        int m1559u = c0798r.m1559u();
        int m1559u2 = c0798r.m1559u();
        p086W.C0797q c0797q = new p086W.C0797q();
        c0797q.m1524o(c0798r);
        int i5 = ((i4 - 10) * 8) / (m1559u + m1559u2);
        int[] iArr = new int[i5];
        int[] iArr2 = new int[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            int m1518i = c0797q.m1518i(m1559u);
            int m1518i2 = c0797q.m1518i(m1559u2);
            iArr[i6] = m1518i;
            iArr2[i6] = m1518i2;
        }
        return new p049M0.C0413l(m1531A, m1562x, m1562x2, iArr, iArr2);
    }

    /* renamed from: l0 */
    public static p049M0.C0414m m867l0(int i4, p086W.C0798r c0798r) {
        byte[] bArr = new byte[i4];
        c0798r.m1544f(bArr, 0, i4);
        int m878w0 = m878w0(bArr, 0);
        java.lang.String str = new java.lang.String(bArr, 0, m878w0, p124e2.AbstractC1356d.f5629b);
        int i5 = m878w0 + 1;
        return new p049M0.C0414m(str, i4 <= i5 ? p086W.AbstractC0805y.f2806f : java.util.Arrays.copyOfRange(bArr, i5, i4));
    }

    /* renamed from: m0 */
    public static java.lang.String m868m0(byte[] bArr, int i4, int i5, java.nio.charset.Charset charset) {
        return (i5 <= i4 || i5 > bArr.length) ? "" : new java.lang.String(bArr, i4, i5 - i4, charset);
    }

    /* renamed from: n0 */
    public static p049M0.C0415n m869n0(int i4, p086W.C0798r c0798r, java.lang.String str) {
        if (i4 < 1) {
            return null;
        }
        int m1559u = c0798r.m1559u();
        int i5 = i4 - 1;
        byte[] bArr = new byte[i5];
        c0798r.m1544f(bArr, 0, i5);
        return new p049M0.C0415n(str, null, m870o0(bArr, m1559u, 0));
    }

    /* renamed from: o0 */
    public static p129f2.C1415c0 m870o0(byte[] bArr, int i4, int i5) {
        if (i5 >= bArr.length) {
            return p129f2.AbstractC1393I.m3166o("");
        }
        p129f2.C1390F m3161i = p129f2.AbstractC1393I.m3161i();
        int m877v0 = m877v0(bArr, i5, i4);
        while (i5 < m877v0) {
            m3161i.m3145a(new java.lang.String(bArr, i5, m877v0 - i5, m875t0(i4)));
            i5 = m874s0(i4) + m877v0;
            m877v0 = m877v0(bArr, i5, i4);
        }
        p129f2.C1415c0 m3157g = m3161i.m3157g();
        return m3157g.isEmpty() ? p129f2.AbstractC1393I.m3166o("") : m3157g;
    }

    /* renamed from: p0 */
    public static p049M0.C0415n m871p0(int i4, p086W.C0798r c0798r) {
        if (i4 < 1) {
            return null;
        }
        int m1559u = c0798r.m1559u();
        int i5 = i4 - 1;
        byte[] bArr = new byte[i5];
        c0798r.m1544f(bArr, 0, i5);
        int m877v0 = m877v0(bArr, 0, m1559u);
        return new p049M0.C0415n("TXXX", new java.lang.String(bArr, 0, m877v0, m875t0(m1559u)), m870o0(bArr, m1559u, m874s0(m1559u) + m877v0));
    }

    /* renamed from: q0 */
    public static p049M0.C0416o m872q0(int i4, p086W.C0798r c0798r, java.lang.String str) {
        byte[] bArr = new byte[i4];
        c0798r.m1544f(bArr, 0, i4);
        return new p049M0.C0416o(str, null, new java.lang.String(bArr, 0, m878w0(bArr, 0), p124e2.AbstractC1356d.f5629b));
    }

    /* renamed from: r0 */
    public static p049M0.C0416o m873r0(int i4, p086W.C0798r c0798r) {
        if (i4 < 1) {
            return null;
        }
        int m1559u = c0798r.m1559u();
        int i5 = i4 - 1;
        byte[] bArr = new byte[i5];
        c0798r.m1544f(bArr, 0, i5);
        int m877v0 = m877v0(bArr, 0, m1559u);
        java.lang.String str = new java.lang.String(bArr, 0, m877v0, m875t0(m1559u));
        int m874s0 = m874s0(m1559u) + m877v0;
        return new p049M0.C0416o("WXXX", str, m868m0(bArr, m874s0, m878w0(bArr, m874s0), p124e2.AbstractC1356d.f5629b));
    }

    /* renamed from: s0 */
    public static int m874s0(int i4) {
        return (i4 == 0 || i4 == 3) ? 1 : 2;
    }

    /* renamed from: t0 */
    public static java.nio.charset.Charset m875t0(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? p124e2.AbstractC1356d.f5629b : p124e2.AbstractC1356d.f5630c : p124e2.AbstractC1356d.f5631d : p124e2.AbstractC1356d.f5633f;
    }

    /* renamed from: u0 */
    public static java.lang.String m876u0(int i4, int i5, int i6, int i7, int i8) {
        return i4 == 2 ? java.lang.String.format(java.util.Locale.US, "%c%c%c", java.lang.Integer.valueOf(i5), java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i7)) : java.lang.String.format(java.util.Locale.US, "%c%c%c%c", java.lang.Integer.valueOf(i5), java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i7), java.lang.Integer.valueOf(i8));
    }

    /* renamed from: v0 */
    public static int m877v0(byte[] bArr, int i4, int i5) {
        int m878w0 = m878w0(bArr, i4);
        if (i5 == 0 || i5 == 3) {
            return m878w0;
        }
        while (m878w0 < bArr.length - 1) {
            if ((m878w0 - i4) % 2 == 0 && bArr[m878w0 + 1] == 0) {
                return m878w0;
            }
            m878w0 = m878w0(bArr, m878w0 + 1);
        }
        return bArr.length;
    }

    /* renamed from: w0 */
    public static int m878w0(byte[] bArr, int i4) {
        while (i4 < bArr.length) {
            if (bArr[i4] == 0) {
                return i4;
            }
            i4++;
        }
        return bArr.length;
    }

    /* renamed from: x0 */
    public static int m879x0(int i4, p086W.C0798r c0798r) {
        byte[] bArr = c0798r.f2786a;
        int i5 = c0798r.f2787b;
        int i6 = i5;
        while (true) {
            int i7 = i6 + 1;
            if (i7 >= i5 + i4) {
                return i4;
            }
            if ((bArr[i6] & 255) == 255 && bArr[i7] == 0) {
                java.lang.System.arraycopy(bArr, i6 + 2, bArr, i7, (i4 - (i6 - i5)) - 2);
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
    /* renamed from: y0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m880y0(p086W.C0798r r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f2787b
        L6:
            int r3 = r18.m1539a()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r18.m1546h()     // Catch: java.lang.Throwable -> L20
            long r8 = r18.m1561w()     // Catch: java.lang.Throwable -> L20
            int r10 = r18.m1531A()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r18.m1562x()     // Catch: java.lang.Throwable -> L20
            int r8 = r18.m1562x()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.m1537G(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.m1537G(r2)
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
            r1.m1537G(r2)
            return r6
        L99:
            int r3 = r18.m1539a()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.m1537G(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.m1538H(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.m1537G(r2)
            return r4
        Lb0:
            r1.m1537G(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p049M0.C0409h.m880y0(W.r, int, int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009c  */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p076T.C0664G m881d0(byte[] r13, int r14) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p049M0.C0409h.m881d0(byte[], int):T.G");
    }

    @Override // p176p1.AbstractC1949a
    /* renamed from: v */
    public final p076T.C0664G mo709v(p032H0.C0244a c0244a, java.nio.ByteBuffer byteBuffer) {
        return m881d0(byteBuffer.array(), byteBuffer.limit());
    }
}
