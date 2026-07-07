package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.l */
/* loaded from: classes.dex */
public final class C1115l extends p080U1.AbstractC0748a {

    /* renamed from: l */
    public static final java.util.logging.Logger f4256l = java.util.logging.Logger.getLogger(androidx.datastore.preferences.protobuf.C1115l.class.getName());

    /* renamed from: m */
    public static final boolean f4257m = androidx.datastore.preferences.protobuf.AbstractC1110i0.f4250e;

    /* renamed from: g */
    public androidx.datastore.preferences.protobuf.C1072E f4258g;

    /* renamed from: h */
    public final byte[] f4259h;

    /* renamed from: i */
    public final int f4260i;

    /* renamed from: j */
    public int f4261j;

    /* renamed from: k */
    public final java.io.OutputStream f4262k;

    public C1115l(java.io.OutputStream outputStream, int i4) {
        if (i4 < 0) {
            throw new java.lang.IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = java.lang.Math.max(i4, 20);
        this.f4259h = new byte[max];
        this.f4260i = max;
        if (outputStream == null) {
            throw new java.lang.NullPointerException("out");
        }
        this.f4262k = outputStream;
    }

    /* renamed from: V */
    public static int m2579V(int i4) {
        return m2595l0(i4) + 1;
    }

    /* renamed from: W */
    public static int m2580W(int i4, androidx.datastore.preferences.protobuf.C1105g c1105g) {
        int m2595l0 = m2595l0(i4);
        int size = c1105g.size();
        return m2597n0(size) + size + m2595l0;
    }

    /* renamed from: X */
    public static int m2581X(int i4) {
        return m2595l0(i4) + 8;
    }

    /* renamed from: Y */
    public static int m2582Y(int i4, int i5) {
        return m2599p0(i5) + m2595l0(i4);
    }

    /* renamed from: Z */
    public static int m2583Z(int i4) {
        return m2595l0(i4) + 4;
    }

    /* renamed from: a0 */
    public static int m2584a0(int i4) {
        return m2595l0(i4) + 8;
    }

    /* renamed from: b0 */
    public static int m2585b0(int i4) {
        return m2595l0(i4) + 4;
    }

    /* renamed from: c0 */
    public static int m2586c0(int i4, androidx.datastore.preferences.protobuf.AbstractC1093a abstractC1093a, androidx.datastore.preferences.protobuf.InterfaceC1088V interfaceC1088V) {
        return abstractC1093a.mo2484a(interfaceC1088V) + (m2595l0(i4) * 2);
    }

    /* renamed from: d0 */
    public static int m2587d0(int i4, int i5) {
        return m2599p0(i5) + m2595l0(i4);
    }

    /* renamed from: e0 */
    public static int m2588e0(long j4, int i4) {
        return m2599p0(j4) + m2595l0(i4);
    }

    /* renamed from: f0 */
    public static int m2589f0(int i4) {
        return m2595l0(i4) + 4;
    }

    /* renamed from: g0 */
    public static int m2590g0(int i4) {
        return m2595l0(i4) + 8;
    }

    /* renamed from: h0 */
    public static int m2591h0(int i4, int i5) {
        return m2597n0((i5 >> 31) ^ (i5 << 1)) + m2595l0(i4);
    }

    /* renamed from: i0 */
    public static int m2592i0(long j4, int i4) {
        return m2599p0((j4 >> 63) ^ (j4 << 1)) + m2595l0(i4);
    }

    /* renamed from: j0 */
    public static int m2593j0(java.lang.String str, int i4) {
        return m2594k0(str) + m2595l0(i4);
    }

    /* renamed from: k0 */
    public static int m2594k0(java.lang.String str) {
        int length;
        try {
            length = androidx.datastore.preferences.protobuf.AbstractC1116l0.m2625a(str);
        } catch (androidx.datastore.preferences.protobuf.C1114k0 unused) {
            length = str.getBytes(androidx.datastore.preferences.protobuf.AbstractC1134x.f4297a).length;
        }
        return m2597n0(length) + length;
    }

    /* renamed from: l0 */
    public static int m2595l0(int i4) {
        return m2597n0(i4 << 3);
    }

    /* renamed from: m0 */
    public static int m2596m0(int i4, int i5) {
        return m2597n0(i5) + m2595l0(i4);
    }

    /* renamed from: n0 */
    public static int m2597n0(int i4) {
        return (352 - (java.lang.Integer.numberOfLeadingZeros(i4) * 9)) >>> 6;
    }

    /* renamed from: o0 */
    public static int m2598o0(long j4, int i4) {
        return m2599p0(j4) + m2595l0(i4);
    }

    /* renamed from: p0 */
    public static int m2599p0(long j4) {
        return (640 - (java.lang.Long.numberOfLeadingZeros(j4) * 9)) >>> 6;
    }

    /* renamed from: A0 */
    public final void m2600A0(long j4) {
        m2616r0(8);
        m2611R(j4);
    }

    /* renamed from: B0 */
    public final void m2601B0(int i4, int i5) {
        m2616r0(20);
        m2612S(i4, 0);
        if (i5 >= 0) {
            m2613T(i5);
        } else {
            m2614U(i5);
        }
    }

    /* renamed from: C0 */
    public final void m2602C0(int i4) {
        if (i4 >= 0) {
            m2607H0(i4);
        } else {
            m2609J0(i4);
        }
    }

    /* renamed from: D0 */
    public final void m2603D0(java.lang.String str, int i4) {
        m2605F0(i4, 2);
        m2604E0(str);
    }

    /* renamed from: E0 */
    public final void m2604E0(java.lang.String str) {
        try {
            int length = str.length() * 3;
            int m2597n0 = m2597n0(length);
            int i4 = m2597n0 + length;
            int i5 = this.f4260i;
            if (i4 > i5) {
                byte[] bArr = new byte[length];
                int mo1394n = androidx.datastore.preferences.protobuf.AbstractC1116l0.f4263a.mo1394n(str, bArr, 0, length);
                m2607H0(mo1394n);
                m2618t0(bArr, 0, mo1394n);
                return;
            }
            if (i4 > i5 - this.f4261j) {
                m2615q0();
            }
            int m2597n02 = m2597n0(str.length());
            int i6 = this.f4261j;
            byte[] bArr2 = this.f4259h;
            try {
                if (m2597n02 == m2597n0) {
                    int i7 = i6 + m2597n02;
                    this.f4261j = i7;
                    int mo1394n2 = androidx.datastore.preferences.protobuf.AbstractC1116l0.f4263a.mo1394n(str, bArr2, i7, i5 - i7);
                    this.f4261j = i6;
                    m2613T((mo1394n2 - i6) - m2597n02);
                    this.f4261j = mo1394n2;
                } else {
                    int m2625a = androidx.datastore.preferences.protobuf.AbstractC1116l0.m2625a(str);
                    m2613T(m2625a);
                    this.f4261j = androidx.datastore.preferences.protobuf.AbstractC1116l0.f4263a.mo1394n(str, bArr2, this.f4261j, m2625a);
                }
            } catch (androidx.datastore.preferences.protobuf.C1114k0 e4) {
                this.f4261j = i6;
                throw e4;
            } catch (java.lang.ArrayIndexOutOfBoundsException e5) {
                throw new androidx.datastore.preferences.protobuf.C1113k(e5);
            }
        } catch (androidx.datastore.preferences.protobuf.C1114k0 e6) {
            f4256l.log(java.util.logging.Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (java.lang.Throwable) e6);
            byte[] bytes = str.getBytes(androidx.datastore.preferences.protobuf.AbstractC1134x.f4297a);
            try {
                m2607H0(bytes.length);
                mo1392O(bytes, 0, bytes.length);
            } catch (java.lang.IndexOutOfBoundsException e7) {
                throw new androidx.datastore.preferences.protobuf.C1113k(e7);
            }
        }
    }

    /* renamed from: F0 */
    public final void m2605F0(int i4, int i5) {
        m2607H0((i4 << 3) | i5);
    }

    /* renamed from: G0 */
    public final void m2606G0(int i4, int i5) {
        m2616r0(20);
        m2612S(i4, 0);
        m2613T(i5);
    }

    /* renamed from: H0 */
    public final void m2607H0(int i4) {
        m2616r0(5);
        m2613T(i4);
    }

    /* renamed from: I0 */
    public final void m2608I0(long j4, int i4) {
        m2616r0(20);
        m2612S(i4, 0);
        m2614U(j4);
    }

    /* renamed from: J0 */
    public final void m2609J0(long j4) {
        m2616r0(10);
        m2614U(j4);
    }

    @Override // p080U1.AbstractC0748a
    /* renamed from: O */
    public final void mo1392O(byte[] bArr, int i4, int i5) {
        m2618t0(bArr, i4, i5);
    }

    /* renamed from: Q */
    public final void m2610Q(int i4) {
        int i5 = this.f4261j;
        int i6 = i5 + 1;
        this.f4261j = i6;
        byte[] bArr = this.f4259h;
        bArr[i5] = (byte) (i4 & 255);
        int i7 = i5 + 2;
        this.f4261j = i7;
        bArr[i6] = (byte) ((i4 >> 8) & 255);
        int i8 = i5 + 3;
        this.f4261j = i8;
        bArr[i7] = (byte) ((i4 >> 16) & 255);
        this.f4261j = i5 + 4;
        bArr[i8] = (byte) ((i4 >> 24) & 255);
    }

    /* renamed from: R */
    public final void m2611R(long j4) {
        int i4 = this.f4261j;
        int i5 = i4 + 1;
        this.f4261j = i5;
        byte[] bArr = this.f4259h;
        bArr[i4] = (byte) (j4 & 255);
        int i6 = i4 + 2;
        this.f4261j = i6;
        bArr[i5] = (byte) ((j4 >> 8) & 255);
        int i7 = i4 + 3;
        this.f4261j = i7;
        bArr[i6] = (byte) ((j4 >> 16) & 255);
        int i8 = i4 + 4;
        this.f4261j = i8;
        bArr[i7] = (byte) (255 & (j4 >> 24));
        int i9 = i4 + 5;
        this.f4261j = i9;
        bArr[i8] = (byte) (((int) (j4 >> 32)) & 255);
        int i10 = i4 + 6;
        this.f4261j = i10;
        bArr[i9] = (byte) (((int) (j4 >> 40)) & 255);
        int i11 = i4 + 7;
        this.f4261j = i11;
        bArr[i10] = (byte) (((int) (j4 >> 48)) & 255);
        this.f4261j = i4 + 8;
        bArr[i11] = (byte) (((int) (j4 >> 56)) & 255);
    }

    /* renamed from: S */
    public final void m2612S(int i4, int i5) {
        m2613T((i4 << 3) | i5);
    }

    /* renamed from: T */
    public final void m2613T(int i4) {
        boolean z4 = f4257m;
        byte[] bArr = this.f4259h;
        if (z4) {
            while ((i4 & (-128)) != 0) {
                int i5 = this.f4261j;
                this.f4261j = i5 + 1;
                androidx.datastore.preferences.protobuf.AbstractC1110i0.m2572j(bArr, i5, (byte) ((i4 | 128) & 255));
                i4 >>>= 7;
            }
            int i6 = this.f4261j;
            this.f4261j = i6 + 1;
            androidx.datastore.preferences.protobuf.AbstractC1110i0.m2572j(bArr, i6, (byte) i4);
            return;
        }
        while ((i4 & (-128)) != 0) {
            int i7 = this.f4261j;
            this.f4261j = i7 + 1;
            bArr[i7] = (byte) ((i4 | 128) & 255);
            i4 >>>= 7;
        }
        int i8 = this.f4261j;
        this.f4261j = i8 + 1;
        bArr[i8] = (byte) i4;
    }

    /* renamed from: U */
    public final void m2614U(long j4) {
        boolean z4 = f4257m;
        byte[] bArr = this.f4259h;
        if (z4) {
            while ((j4 & (-128)) != 0) {
                int i4 = this.f4261j;
                this.f4261j = i4 + 1;
                androidx.datastore.preferences.protobuf.AbstractC1110i0.m2572j(bArr, i4, (byte) ((((int) j4) | 128) & 255));
                j4 >>>= 7;
            }
            int i5 = this.f4261j;
            this.f4261j = i5 + 1;
            androidx.datastore.preferences.protobuf.AbstractC1110i0.m2572j(bArr, i5, (byte) j4);
            return;
        }
        while ((j4 & (-128)) != 0) {
            int i6 = this.f4261j;
            this.f4261j = i6 + 1;
            bArr[i6] = (byte) ((((int) j4) | 128) & 255);
            j4 >>>= 7;
        }
        int i7 = this.f4261j;
        this.f4261j = i7 + 1;
        bArr[i7] = (byte) j4;
    }

    /* renamed from: q0 */
    public final void m2615q0() {
        this.f4262k.write(this.f4259h, 0, this.f4261j);
        this.f4261j = 0;
    }

    /* renamed from: r0 */
    public final void m2616r0(int i4) {
        if (this.f4260i - this.f4261j < i4) {
            m2615q0();
        }
    }

    /* renamed from: s0 */
    public final void m2617s0(byte b4) {
        if (this.f4261j == this.f4260i) {
            m2615q0();
        }
        int i4 = this.f4261j;
        this.f4261j = i4 + 1;
        this.f4259h[i4] = b4;
    }

    /* renamed from: t0 */
    public final void m2618t0(byte[] bArr, int i4, int i5) {
        int i6 = this.f4261j;
        int i7 = this.f4260i;
        int i8 = i7 - i6;
        byte[] bArr2 = this.f4259h;
        if (i8 >= i5) {
            java.lang.System.arraycopy(bArr, i4, bArr2, i6, i5);
            this.f4261j += i5;
            return;
        }
        java.lang.System.arraycopy(bArr, i4, bArr2, i6, i8);
        int i9 = i4 + i8;
        int i10 = i5 - i8;
        this.f4261j = i7;
        m2615q0();
        if (i10 > i7) {
            this.f4262k.write(bArr, i9, i10);
        } else {
            java.lang.System.arraycopy(bArr, i9, bArr2, 0, i10);
            this.f4261j = i10;
        }
    }

    /* renamed from: u0 */
    public final void m2619u0(int i4, boolean z4) {
        m2616r0(11);
        m2612S(i4, 0);
        byte b4 = z4 ? (byte) 1 : (byte) 0;
        int i5 = this.f4261j;
        this.f4261j = i5 + 1;
        this.f4259h[i5] = b4;
    }

    /* renamed from: v0 */
    public final void m2620v0(int i4, androidx.datastore.preferences.protobuf.C1105g c1105g) {
        m2605F0(i4, 2);
        m2621w0(c1105g);
    }

    /* renamed from: w0 */
    public final void m2621w0(androidx.datastore.preferences.protobuf.C1105g c1105g) {
        m2607H0(c1105g.size());
        mo1392O(c1105g.f4229m, c1105g.mo2498e(), c1105g.size());
    }

    /* renamed from: x0 */
    public final void m2622x0(int i4, int i5) {
        m2616r0(14);
        m2612S(i4, 5);
        m2610Q(i5);
    }

    /* renamed from: y0 */
    public final void m2623y0(int i4) {
        m2616r0(4);
        m2610Q(i4);
    }

    /* renamed from: z0 */
    public final void m2624z0(long j4, int i4) {
        m2616r0(18);
        m2612S(i4, 1);
        m2611R(j4);
    }
}
