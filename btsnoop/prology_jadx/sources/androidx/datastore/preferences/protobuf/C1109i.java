package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.i */
/* loaded from: classes.dex */
public final class C1109i extends androidx.datastore.preferences.protobuf.AbstractC1111j {

    /* renamed from: c */
    public final java.io.InputStream f4238c;

    /* renamed from: d */
    public final byte[] f4239d;

    /* renamed from: e */
    public int f4240e;

    /* renamed from: f */
    public int f4241f;

    /* renamed from: g */
    public int f4242g;

    /* renamed from: h */
    public int f4243h;

    /* renamed from: i */
    public int f4244i;

    /* renamed from: j */
    public int f4245j = Integer.MAX_VALUE;

    public C1109i(java.io.InputStream inputStream) {
        java.nio.charset.Charset charset = androidx.datastore.preferences.protobuf.AbstractC1134x.f4297a;
        this.f4238c = inputStream;
        this.f4239d = new byte[4096];
        this.f4240e = 0;
        this.f4242g = 0;
        this.f4244i = 0;
    }

    /* renamed from: A */
    public final byte[] m2551A(int i4) {
        if (i4 == 0) {
            return androidx.datastore.preferences.protobuf.AbstractC1134x.f4298b;
        }
        if (i4 < 0) {
            throw androidx.datastore.preferences.protobuf.C1136z.m2648d();
        }
        int i5 = this.f4244i;
        int i6 = this.f4242g;
        int i7 = i5 + i6 + i4;
        if (i7 - Integer.MAX_VALUE > 0) {
            throw new java.io.IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i8 = this.f4245j;
        if (i7 > i8) {
            m2560J((i8 - i5) - i6);
            throw androidx.datastore.preferences.protobuf.C1136z.m2649e();
        }
        int i9 = this.f4240e - i6;
        int i10 = i4 - i9;
        java.io.InputStream inputStream = this.f4238c;
        if (i10 >= 4096) {
            try {
                if (i10 > inputStream.available()) {
                    return null;
                }
            } catch (androidx.datastore.preferences.protobuf.C1136z e4) {
                e4.f4299l = true;
                throw e4;
            }
        }
        byte[] bArr = new byte[i4];
        java.lang.System.arraycopy(this.f4239d, this.f4242g, bArr, 0, i9);
        this.f4244i += this.f4240e;
        this.f4242g = 0;
        this.f4240e = 0;
        while (i9 < i4) {
            try {
                int read = inputStream.read(bArr, i9, i4 - i9);
                if (read == -1) {
                    throw androidx.datastore.preferences.protobuf.C1136z.m2649e();
                }
                this.f4244i += read;
                i9 += read;
            } catch (androidx.datastore.preferences.protobuf.C1136z e5) {
                e5.f4299l = true;
                throw e5;
            }
        }
        return bArr;
    }

    /* renamed from: B */
    public final java.util.ArrayList m2552B(int i4) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (i4 > 0) {
            int min = java.lang.Math.min(i4, 4096);
            byte[] bArr = new byte[min];
            int i5 = 0;
            while (i5 < min) {
                int read = this.f4238c.read(bArr, i5, min - i5);
                if (read == -1) {
                    throw androidx.datastore.preferences.protobuf.C1136z.m2649e();
                }
                this.f4244i += read;
                i5 += read;
            }
            i4 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* renamed from: C */
    public final int m2553C() {
        int i4 = this.f4242g;
        if (this.f4240e - i4 < 4) {
            m2559I(4);
            i4 = this.f4242g;
        }
        this.f4242g = i4 + 4;
        byte[] bArr = this.f4239d;
        return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
    }

    /* renamed from: D */
    public final long m2554D() {
        int i4 = this.f4242g;
        if (this.f4240e - i4 < 8) {
            m2559I(8);
            i4 = this.f4242g;
        }
        this.f4242g = i4 + 8;
        byte[] bArr = this.f4239d;
        return ((bArr[i4 + 7] & 255) << 56) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48);
    }

    /* renamed from: E */
    public final int m2555E() {
        int i4;
        int i5 = this.f4242g;
        int i6 = this.f4240e;
        if (i6 != i5) {
            int i7 = i5 + 1;
            byte[] bArr = this.f4239d;
            byte b4 = bArr[i5];
            if (b4 >= 0) {
                this.f4242g = i7;
                return b4;
            }
            if (i6 - i7 >= 9) {
                int i8 = i5 + 2;
                int i9 = (bArr[i7] << 7) ^ b4;
                if (i9 < 0) {
                    i4 = i9 ^ (-128);
                } else {
                    int i10 = i5 + 3;
                    int i11 = (bArr[i8] << 14) ^ i9;
                    if (i11 >= 0) {
                        i4 = i11 ^ 16256;
                    } else {
                        int i12 = i5 + 4;
                        int i13 = i11 ^ (bArr[i10] << 21);
                        if (i13 < 0) {
                            i4 = (-2080896) ^ i13;
                        } else {
                            i10 = i5 + 5;
                            byte b5 = bArr[i12];
                            int i14 = (i13 ^ (b5 << 28)) ^ 266354560;
                            if (b5 < 0) {
                                i12 = i5 + 6;
                                if (bArr[i10] < 0) {
                                    i10 = i5 + 7;
                                    if (bArr[i12] < 0) {
                                        i12 = i5 + 8;
                                        if (bArr[i10] < 0) {
                                            i10 = i5 + 9;
                                            if (bArr[i12] < 0) {
                                                int i15 = i5 + 10;
                                                if (bArr[i10] >= 0) {
                                                    i8 = i15;
                                                    i4 = i14;
                                                }
                                            }
                                        }
                                    }
                                }
                                i4 = i14;
                            }
                            i4 = i14;
                        }
                        i8 = i12;
                    }
                    i8 = i10;
                }
                this.f4242g = i8;
                return i4;
            }
        }
        return (int) m2557G();
    }

    /* renamed from: F */
    public final long m2556F() {
        long j4;
        long j5;
        long j6;
        long j7;
        int i4 = this.f4242g;
        int i5 = this.f4240e;
        if (i5 != i4) {
            int i6 = i4 + 1;
            byte[] bArr = this.f4239d;
            byte b4 = bArr[i4];
            if (b4 >= 0) {
                this.f4242g = i6;
                return b4;
            }
            if (i5 - i6 >= 9) {
                int i7 = i4 + 2;
                int i8 = (bArr[i6] << 7) ^ b4;
                if (i8 < 0) {
                    j4 = i8 ^ (-128);
                } else {
                    int i9 = i4 + 3;
                    int i10 = (bArr[i7] << 14) ^ i8;
                    if (i10 >= 0) {
                        j4 = i10 ^ 16256;
                        i7 = i9;
                    } else {
                        int i11 = i4 + 4;
                        int i12 = i10 ^ (bArr[i9] << 21);
                        if (i12 < 0) {
                            j7 = (-2080896) ^ i12;
                        } else {
                            long j8 = i12;
                            i7 = i4 + 5;
                            long j9 = j8 ^ (bArr[i11] << 28);
                            if (j9 >= 0) {
                                j6 = 266354560;
                            } else {
                                i11 = i4 + 6;
                                long j10 = j9 ^ (bArr[i7] << 35);
                                if (j10 < 0) {
                                    j5 = -34093383808L;
                                } else {
                                    i7 = i4 + 7;
                                    j9 = j10 ^ (bArr[i11] << 42);
                                    if (j9 >= 0) {
                                        j6 = 4363953127296L;
                                    } else {
                                        i11 = i4 + 8;
                                        j10 = j9 ^ (bArr[i7] << 49);
                                        if (j10 < 0) {
                                            j5 = -558586000294016L;
                                        } else {
                                            i7 = i4 + 9;
                                            long j11 = (j10 ^ (bArr[i11] << 56)) ^ 71499008037633920L;
                                            if (j11 < 0) {
                                                int i13 = i4 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i7 = i13;
                                                }
                                            }
                                            j4 = j11;
                                        }
                                    }
                                }
                                j7 = j5 ^ j10;
                            }
                            j4 = j6 ^ j9;
                        }
                        i7 = i11;
                        j4 = j7;
                    }
                }
                this.f4242g = i7;
                return j4;
            }
        }
        return m2557G();
    }

    /* renamed from: G */
    public final long m2557G() {
        long j4 = 0;
        for (int i4 = 0; i4 < 64; i4 += 7) {
            if (this.f4242g == this.f4240e) {
                m2559I(1);
            }
            int i5 = this.f4242g;
            this.f4242g = i5 + 1;
            j4 |= (r3 & Byte.MAX_VALUE) << i4;
            if ((this.f4239d[i5] & 128) == 0) {
                return j4;
            }
        }
        throw androidx.datastore.preferences.protobuf.C1136z.m2647c();
    }

    /* renamed from: H */
    public final void m2558H() {
        int i4 = this.f4240e + this.f4241f;
        this.f4240e = i4;
        int i5 = this.f4244i + i4;
        int i6 = this.f4245j;
        if (i5 <= i6) {
            this.f4241f = 0;
            return;
        }
        int i7 = i5 - i6;
        this.f4241f = i7;
        this.f4240e = i4 - i7;
    }

    /* renamed from: I */
    public final void m2559I(int i4) {
        if (m2561K(i4)) {
            return;
        }
        if (i4 <= (Integer.MAX_VALUE - this.f4244i) - this.f4242g) {
            throw androidx.datastore.preferences.protobuf.C1136z.m2649e();
        }
        throw new java.io.IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* renamed from: J */
    public final void m2560J(int i4) {
        int i5 = this.f4240e;
        int i6 = this.f4242g;
        if (i4 <= i5 - i6 && i4 >= 0) {
            this.f4242g = i6 + i4;
            return;
        }
        java.io.InputStream inputStream = this.f4238c;
        if (i4 < 0) {
            throw androidx.datastore.preferences.protobuf.C1136z.m2648d();
        }
        int i7 = this.f4244i;
        int i8 = i7 + i6;
        int i9 = i8 + i4;
        int i10 = this.f4245j;
        if (i9 > i10) {
            m2560J((i10 - i7) - i6);
            throw androidx.datastore.preferences.protobuf.C1136z.m2649e();
        }
        this.f4244i = i8;
        int i11 = i5 - i6;
        this.f4240e = 0;
        this.f4242g = 0;
        while (i11 < i4) {
            long j4 = i4 - i11;
            try {
                try {
                    long skip = inputStream.skip(j4);
                    if (skip < 0 || skip > j4) {
                        throw new java.lang.IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i11 += (int) skip;
                    }
                } catch (androidx.datastore.preferences.protobuf.C1136z e4) {
                    e4.f4299l = true;
                    throw e4;
                }
            } catch (java.lang.Throwable th) {
                this.f4244i += i11;
                m2558H();
                throw th;
            }
        }
        this.f4244i += i11;
        m2558H();
        if (i11 >= i4) {
            return;
        }
        int i12 = this.f4240e;
        int i13 = i12 - this.f4242g;
        this.f4242g = i12;
        m2559I(1);
        while (true) {
            int i14 = i4 - i13;
            int i15 = this.f4240e;
            if (i14 <= i15) {
                this.f4242g = i14;
                return;
            } else {
                i13 += i15;
                this.f4242g = i15;
                m2559I(1);
            }
        }
    }

    /* renamed from: K */
    public final boolean m2561K(int i4) {
        int i5 = this.f4242g;
        int i6 = i5 + i4;
        int i7 = this.f4240e;
        if (i6 <= i7) {
            throw new java.lang.IllegalStateException(p009B2.AbstractC0051h.m151j(i4, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i8 = this.f4244i;
        if (i4 > (Integer.MAX_VALUE - i8) - i5 || i8 + i5 + i4 > this.f4245j) {
            return false;
        }
        byte[] bArr = this.f4239d;
        if (i5 > 0) {
            if (i7 > i5) {
                java.lang.System.arraycopy(bArr, i5, bArr, 0, i7 - i5);
            }
            this.f4244i += i5;
            this.f4240e -= i5;
            this.f4242g = 0;
        }
        int i9 = this.f4240e;
        int min = java.lang.Math.min(bArr.length - i9, (Integer.MAX_VALUE - this.f4244i) - i9);
        java.io.InputStream inputStream = this.f4238c;
        try {
            int read = inputStream.read(bArr, i9, min);
            if (read == 0 || read < -1 || read > bArr.length) {
                throw new java.lang.IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.f4240e += read;
            m2558H();
            if (this.f4240e >= i4) {
                return true;
            }
            return m2561K(i4);
        } catch (androidx.datastore.preferences.protobuf.C1136z e4) {
            e4.f4299l = true;
            throw e4;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: a */
    public final void mo2517a(int i4) {
        if (this.f4243h != i4) {
            throw new java.io.IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: b */
    public final int mo2518b() {
        return this.f4244i + this.f4242g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: c */
    public final boolean mo2519c() {
        return this.f4242g == this.f4240e && !m2561K(1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: d */
    public final void mo2520d(int i4) {
        this.f4245j = i4;
        m2558H();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: e */
    public final int mo2521e(int i4) {
        if (i4 < 0) {
            throw androidx.datastore.preferences.protobuf.C1136z.m2648d();
        }
        int i5 = this.f4244i + this.f4242g + i4;
        if (i5 < 0) {
            throw new java.io.IOException("Failed to parse the message.");
        }
        int i6 = this.f4245j;
        if (i5 > i6) {
            throw androidx.datastore.preferences.protobuf.C1136z.m2649e();
        }
        this.f4245j = i5;
        m2558H();
        return i6;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: f */
    public final boolean mo2522f() {
        return m2556F() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: g */
    public final androidx.datastore.preferences.protobuf.C1105g mo2523g() {
        int m2555E = m2555E();
        int i4 = this.f4240e;
        int i5 = this.f4242g;
        int i6 = i4 - i5;
        byte[] bArr = this.f4239d;
        if (m2555E <= i6 && m2555E > 0) {
            androidx.datastore.preferences.protobuf.C1105g m2509c = androidx.datastore.preferences.protobuf.C1105g.m2509c(bArr, i5, m2555E);
            this.f4242g += m2555E;
            return m2509c;
        }
        if (m2555E == 0) {
            return androidx.datastore.preferences.protobuf.C1105g.f4226n;
        }
        if (m2555E < 0) {
            throw androidx.datastore.preferences.protobuf.C1136z.m2648d();
        }
        byte[] m2551A = m2551A(m2555E);
        if (m2551A != null) {
            return androidx.datastore.preferences.protobuf.C1105g.m2509c(m2551A, 0, m2551A.length);
        }
        int i7 = this.f4242g;
        int i8 = this.f4240e;
        int i9 = i8 - i7;
        this.f4244i += i8;
        this.f4242g = 0;
        this.f4240e = 0;
        java.util.ArrayList m2552B = m2552B(m2555E - i9);
        byte[] bArr2 = new byte[m2555E];
        java.lang.System.arraycopy(bArr, i7, bArr2, 0, i9);
        java.util.Iterator it = m2552B.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            java.lang.System.arraycopy(bArr3, 0, bArr2, i9, bArr3.length);
            i9 += bArr3.length;
        }
        androidx.datastore.preferences.protobuf.C1105g c1105g = androidx.datastore.preferences.protobuf.C1105g.f4226n;
        return new androidx.datastore.preferences.protobuf.C1105g(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: h */
    public final double mo2524h() {
        return java.lang.Double.longBitsToDouble(m2554D());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: i */
    public final int mo2525i() {
        return m2555E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: j */
    public final int mo2526j() {
        return m2553C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: k */
    public final long mo2527k() {
        return m2554D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: l */
    public final float mo2528l() {
        return java.lang.Float.intBitsToFloat(m2553C());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: m */
    public final int mo2529m() {
        return m2555E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: n */
    public final long mo2530n() {
        return m2556F();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: o */
    public final int mo2531o() {
        return m2553C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: p */
    public final long mo2532p() {
        return m2554D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: q */
    public final int mo2533q() {
        int m2555E = m2555E();
        return (-(m2555E & 1)) ^ (m2555E >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: r */
    public final long mo2534r() {
        long m2556F = m2556F();
        return (-(m2556F & 1)) ^ (m2556F >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: s */
    public final java.lang.String mo2535s() {
        int m2555E = m2555E();
        byte[] bArr = this.f4239d;
        if (m2555E > 0) {
            int i4 = this.f4240e;
            int i5 = this.f4242g;
            if (m2555E <= i4 - i5) {
                java.lang.String str = new java.lang.String(bArr, i5, m2555E, androidx.datastore.preferences.protobuf.AbstractC1134x.f4297a);
                this.f4242g += m2555E;
                return str;
            }
        }
        if (m2555E == 0) {
            return "";
        }
        if (m2555E < 0) {
            throw androidx.datastore.preferences.protobuf.C1136z.m2648d();
        }
        if (m2555E > this.f4240e) {
            return new java.lang.String(m2562z(m2555E), androidx.datastore.preferences.protobuf.AbstractC1134x.f4297a);
        }
        m2559I(m2555E);
        java.lang.String str2 = new java.lang.String(bArr, this.f4242g, m2555E, androidx.datastore.preferences.protobuf.AbstractC1134x.f4297a);
        this.f4242g += m2555E;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: t */
    public final java.lang.String mo2536t() {
        int m2555E = m2555E();
        int i4 = this.f4242g;
        int i5 = this.f4240e;
        int i6 = i5 - i4;
        byte[] bArr = this.f4239d;
        if (m2555E <= i6 && m2555E > 0) {
            this.f4242g = i4 + m2555E;
        } else {
            if (m2555E == 0) {
                return "";
            }
            if (m2555E < 0) {
                throw androidx.datastore.preferences.protobuf.C1136z.m2648d();
            }
            i4 = 0;
            if (m2555E <= i5) {
                m2559I(m2555E);
                this.f4242g = m2555E;
            } else {
                bArr = m2562z(m2555E);
            }
        }
        return androidx.datastore.preferences.protobuf.AbstractC1116l0.f4263a.mo1393j(bArr, i4, m2555E);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: u */
    public final int mo2537u() {
        if (mo2519c()) {
            this.f4243h = 0;
            return 0;
        }
        int m2555E = m2555E();
        this.f4243h = m2555E;
        if ((m2555E >>> 3) != 0) {
            return m2555E;
        }
        throw new java.io.IOException("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: v */
    public final int mo2538v() {
        return m2555E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: w */
    public final long mo2539w() {
        return m2556F();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: x */
    public final boolean mo2540x(int i4) {
        int i5 = i4 & 7;
        int i6 = 0;
        if (i5 != 0) {
            if (i5 == 1) {
                m2560J(8);
                return true;
            }
            if (i5 == 2) {
                m2560J(m2555E());
                return true;
            }
            if (i5 == 3) {
                m2578y();
                mo2517a(((i4 >>> 3) << 3) | 4);
                return true;
            }
            if (i5 == 4) {
                return false;
            }
            if (i5 != 5) {
                throw androidx.datastore.preferences.protobuf.C1136z.m2646b();
            }
            m2560J(4);
            return true;
        }
        int i7 = this.f4240e - this.f4242g;
        byte[] bArr = this.f4239d;
        if (i7 >= 10) {
            while (i6 < 10) {
                int i8 = this.f4242g;
                this.f4242g = i8 + 1;
                if (bArr[i8] < 0) {
                    i6++;
                }
            }
            throw androidx.datastore.preferences.protobuf.C1136z.m2647c();
        }
        while (i6 < 10) {
            if (this.f4242g == this.f4240e) {
                m2559I(1);
            }
            int i9 = this.f4242g;
            this.f4242g = i9 + 1;
            if (bArr[i9] < 0) {
                i6++;
            }
        }
        throw androidx.datastore.preferences.protobuf.C1136z.m2647c();
        return true;
    }

    /* renamed from: z */
    public final byte[] m2562z(int i4) {
        byte[] m2551A = m2551A(i4);
        if (m2551A != null) {
            return m2551A;
        }
        int i5 = this.f4242g;
        int i6 = this.f4240e;
        int i7 = i6 - i5;
        this.f4244i += i6;
        this.f4242g = 0;
        this.f4240e = 0;
        java.util.ArrayList m2552B = m2552B(i4 - i7);
        byte[] bArr = new byte[i4];
        java.lang.System.arraycopy(this.f4239d, i5, bArr, 0, i7);
        java.util.Iterator it = m2552B.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            java.lang.System.arraycopy(bArr2, 0, bArr, i7, bArr2.length);
            i7 += bArr2.length;
        }
        return bArr;
    }
}
