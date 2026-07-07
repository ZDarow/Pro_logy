package p179q0;

/* renamed from: q0.W */
/* loaded from: classes.dex */
public final class C1980W {

    /* renamed from: a */
    public final p197u0.C2218e f8069a;

    /* renamed from: b */
    public final int f8070b;

    /* renamed from: c */
    public final p086W.C0798r f8071c;

    /* renamed from: d */
    public p073S0.C0627e f8072d;

    /* renamed from: e */
    public p073S0.C0627e f8073e;

    /* renamed from: f */
    public p073S0.C0627e f8074f;

    /* renamed from: g */
    public long f8075g;

    public C1980W(p197u0.C2218e c2218e) {
        this.f8069a = c2218e;
        int i4 = c2218e.f8841b;
        this.f8070b = i4;
        this.f8071c = new p086W.C0798r(32);
        p073S0.C0627e c0627e = new p073S0.C0627e(0L, i4);
        this.f8072d = c0627e;
        this.f8073e = c0627e;
        this.f8074f = c0627e;
    }

    /* renamed from: d */
    public static p073S0.C0627e m4001d(p073S0.C0627e c0627e, long j4, java.nio.ByteBuffer byteBuffer, int i4) {
        while (j4 >= c0627e.f1968m) {
            c0627e = (p073S0.C0627e) c0627e.f1970o;
        }
        while (i4 > 0) {
            int min = java.lang.Math.min(i4, (int) (c0627e.f1968m - j4));
            p197u0.C2214a c2214a = (p197u0.C2214a) c0627e.f1969n;
            byteBuffer.put(c2214a.f8831a, ((int) (j4 - c0627e.f1967l)) + c2214a.f8832b, min);
            i4 -= min;
            j4 += min;
            if (j4 == c0627e.f1968m) {
                c0627e = (p073S0.C0627e) c0627e.f1970o;
            }
        }
        return c0627e;
    }

    /* renamed from: e */
    public static p073S0.C0627e m4002e(p073S0.C0627e c0627e, long j4, byte[] bArr, int i4) {
        while (j4 >= c0627e.f1968m) {
            c0627e = (p073S0.C0627e) c0627e.f1970o;
        }
        int i5 = i4;
        while (i5 > 0) {
            int min = java.lang.Math.min(i5, (int) (c0627e.f1968m - j4));
            p197u0.C2214a c2214a = (p197u0.C2214a) c0627e.f1969n;
            java.lang.System.arraycopy(c2214a.f8831a, ((int) (j4 - c0627e.f1967l)) + c2214a.f8832b, bArr, i4 - i5, min);
            i5 -= min;
            j4 += min;
            if (j4 == c0627e.f1968m) {
                c0627e = (p073S0.C0627e) c0627e.f1970o;
            }
        }
        return c0627e;
    }

    /* renamed from: f */
    public static p073S0.C0627e m4003f(p073S0.C0627e c0627e, p098Z.C0921f c0921f, p141i0.C1534g c1534g, p086W.C0798r c0798r) {
        int i4;
        if (c0921f.m1138c(1073741824)) {
            long j4 = c1534g.f6377b;
            c0798r.m1534D(1);
            p073S0.C0627e m4002e = m4002e(c0627e, j4, c0798r.f2786a, 1);
            long j5 = j4 + 1;
            byte b4 = c0798r.f2786a[0];
            boolean z4 = (b4 & 128) != 0;
            int i5 = b4 & Byte.MAX_VALUE;
            p098Z.C0917b c0917b = c0921f.f3250o;
            byte[] bArr = c0917b.f3239a;
            if (bArr == null) {
                c0917b.f3239a = new byte[16];
            } else {
                java.util.Arrays.fill(bArr, (byte) 0);
            }
            c0627e = m4002e(m4002e, j5, c0917b.f3239a, i5);
            long j6 = j5 + i5;
            if (z4) {
                c0798r.m1534D(2);
                c0627e = m4002e(c0627e, j6, c0798r.f2786a, 2);
                j6 += 2;
                i4 = c0798r.m1531A();
            } else {
                i4 = 1;
            }
            int[] iArr = c0917b.f3242d;
            if (iArr == null || iArr.length < i4) {
                iArr = new int[i4];
            }
            int[] iArr2 = c0917b.f3243e;
            if (iArr2 == null || iArr2.length < i4) {
                iArr2 = new int[i4];
            }
            if (z4) {
                int i6 = i4 * 6;
                c0798r.m1534D(i6);
                c0627e = m4002e(c0627e, j6, c0798r.f2786a, i6);
                j6 += i6;
                c0798r.m1537G(0);
                for (int i7 = 0; i7 < i4; i7++) {
                    iArr[i7] = c0798r.m1531A();
                    iArr2[i7] = c0798r.m1563y();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = c1534g.f6376a - ((int) (j6 - c1534g.f6377b));
            }
            p215y0.C2386E c2386e = (p215y0.C2386E) c1534g.f6378c;
            int i8 = p086W.AbstractC0805y.f2801a;
            byte[] bArr2 = c2386e.f9360b;
            byte[] bArr3 = c0917b.f3239a;
            c0917b.f3244f = i4;
            c0917b.f3242d = iArr;
            c0917b.f3243e = iArr2;
            c0917b.f3240b = bArr2;
            c0917b.f3239a = bArr3;
            int i9 = c2386e.f9359a;
            c0917b.f3241c = i9;
            int i10 = c2386e.f9361c;
            c0917b.f3245g = i10;
            int i11 = c2386e.f9362d;
            c0917b.f3246h = i11;
            android.media.MediaCodec.CryptoInfo cryptoInfo = c0917b.f3247i;
            cryptoInfo.numSubSamples = i4;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i9;
            if (p086W.AbstractC0805y.f2801a >= 24) {
                p094Y.C0886x c0886x = c0917b.f3248j;
                c0886x.getClass();
                android.media.MediaCodec.CryptoInfo.Pattern pattern = (android.media.MediaCodec.CryptoInfo.Pattern) c0886x.f3176n;
                pattern.set(i10, i11);
                ((android.media.MediaCodec.CryptoInfo) c0886x.f3175m).setPattern(pattern);
            }
            long j7 = c1534g.f6377b;
            int i12 = (int) (j6 - j7);
            c1534g.f6377b = j7 + i12;
            c1534g.f6376a -= i12;
        }
        if (!c0921f.m1138c(268435456)) {
            c0921f.m1752h(c1534g.f6376a);
            return m4001d(c0627e, c1534g.f6377b, c0921f.f3251p, c1534g.f6376a);
        }
        c0798r.m1534D(4);
        p073S0.C0627e m4002e2 = m4002e(c0627e, c1534g.f6377b, c0798r.f2786a, 4);
        int m1563y = c0798r.m1563y();
        c1534g.f6377b += 4;
        c1534g.f6376a -= 4;
        c0921f.m1752h(m1563y);
        p073S0.C0627e m4001d = m4001d(m4002e2, c1534g.f6377b, c0921f.f3251p, m1563y);
        c1534g.f6377b += m1563y;
        int i13 = c1534g.f6376a - m1563y;
        c1534g.f6376a = i13;
        java.nio.ByteBuffer byteBuffer = c0921f.f3254s;
        if (byteBuffer == null || byteBuffer.capacity() < i13) {
            c0921f.f3254s = java.nio.ByteBuffer.allocate(i13);
        } else {
            c0921f.f3254s.clear();
        }
        return m4001d(m4001d, c1534g.f6377b, c0921f.f3254s, c1534g.f6376a);
    }

    /* renamed from: a */
    public final void m4004a(p073S0.C0627e c0627e) {
        if (((p197u0.C2214a) c0627e.f1969n) == null) {
            return;
        }
        p197u0.C2218e c2218e = this.f8069a;
        synchronized (c2218e) {
            p073S0.C0627e c0627e2 = c0627e;
            while (c0627e2 != null) {
                try {
                    p197u0.C2214a[] c2214aArr = c2218e.f8845f;
                    int i4 = c2218e.f8844e;
                    c2218e.f8844e = i4 + 1;
                    p197u0.C2214a c2214a = (p197u0.C2214a) c0627e2.f1969n;
                    c2214a.getClass();
                    c2214aArr[i4] = c2214a;
                    c2218e.f8843d--;
                    c0627e2 = (p073S0.C0627e) c0627e2.f1970o;
                    if (c0627e2 == null || ((p197u0.C2214a) c0627e2.f1969n) == null) {
                        c0627e2 = null;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            c2218e.notifyAll();
        }
        c0627e.f1969n = null;
        c0627e.f1970o = null;
    }

    /* renamed from: b */
    public final void m4005b(long j4) {
        p073S0.C0627e c0627e;
        if (j4 == -1) {
            return;
        }
        while (true) {
            c0627e = this.f8072d;
            if (j4 < c0627e.f1968m) {
                break;
            }
            p197u0.C2218e c2218e = this.f8069a;
            p197u0.C2214a c2214a = (p197u0.C2214a) c0627e.f1969n;
            synchronized (c2218e) {
                p197u0.C2214a[] c2214aArr = c2218e.f8845f;
                int i4 = c2218e.f8844e;
                c2218e.f8844e = i4 + 1;
                c2214aArr[i4] = c2214a;
                c2218e.f8843d--;
                c2218e.notifyAll();
            }
            p073S0.C0627e c0627e2 = this.f8072d;
            c0627e2.f1969n = null;
            p073S0.C0627e c0627e3 = (p073S0.C0627e) c0627e2.f1970o;
            c0627e2.f1970o = null;
            this.f8072d = c0627e3;
        }
        if (this.f8073e.f1967l < c0627e.f1967l) {
            this.f8073e = c0627e;
        }
    }

    /* renamed from: c */
    public final int m4006c(int i4) {
        p197u0.C2214a c2214a;
        p073S0.C0627e c0627e = this.f8074f;
        if (((p197u0.C2214a) c0627e.f1969n) == null) {
            p197u0.C2218e c2218e = this.f8069a;
            synchronized (c2218e) {
                try {
                    int i5 = c2218e.f8843d + 1;
                    c2218e.f8843d = i5;
                    int i6 = c2218e.f8844e;
                    if (i6 > 0) {
                        p197u0.C2214a[] c2214aArr = c2218e.f8845f;
                        int i7 = i6 - 1;
                        c2218e.f8844e = i7;
                        c2214a = c2214aArr[i7];
                        c2214a.getClass();
                        c2218e.f8845f[c2218e.f8844e] = null;
                    } else {
                        p197u0.C2214a c2214a2 = new p197u0.C2214a(new byte[c2218e.f8841b], 0);
                        p197u0.C2214a[] c2214aArr2 = c2218e.f8845f;
                        if (i5 > c2214aArr2.length) {
                            c2218e.f8845f = (p197u0.C2214a[]) java.util.Arrays.copyOf(c2214aArr2, c2214aArr2.length * 2);
                        }
                        c2214a = c2214a2;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            p073S0.C0627e c0627e2 = new p073S0.C0627e(this.f8074f.f1968m, this.f8070b);
            c0627e.f1969n = c2214a;
            c0627e.f1970o = c0627e2;
        }
        return java.lang.Math.min(i4, (int) (this.f8074f.f1968m - this.f8075g));
    }
}
