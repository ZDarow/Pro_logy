package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.h */
/* loaded from: classes.dex */
public final class C1107h extends androidx.datastore.preferences.protobuf.AbstractC1111j {

    /* renamed from: c */
    public final byte[] f4230c;

    /* renamed from: d */
    public int f4231d;

    /* renamed from: e */
    public int f4232e;

    /* renamed from: f */
    public int f4233f;

    /* renamed from: g */
    public final int f4234g;

    /* renamed from: h */
    public int f4235h;

    /* renamed from: i */
    public int f4236i = Integer.MAX_VALUE;

    public C1107h(byte[] bArr, int i4, int i5, boolean z4) {
        this.f4230c = bArr;
        this.f4231d = i5 + i4;
        this.f4233f = i4;
        this.f4234g = i4;
    }

    /* renamed from: A */
    public final long m2511A() {
        int i4 = this.f4233f;
        if (this.f4231d - i4 < 8) {
            throw androidx.datastore.preferences.protobuf.C1136z.m2649e();
        }
        this.f4233f = i4 + 8;
        byte[] bArr = this.f4230c;
        return ((bArr[i4 + 7] & 255) << 56) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48);
    }

    /* renamed from: B */
    public final int m2512B() {
        int i4;
        int i5 = this.f4233f;
        int i6 = this.f4231d;
        if (i6 != i5) {
            int i7 = i5 + 1;
            byte[] bArr = this.f4230c;
            byte b4 = bArr[i5];
            if (b4 >= 0) {
                this.f4233f = i7;
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
                this.f4233f = i8;
                return i4;
            }
        }
        return (int) m2514D();
    }

    /* renamed from: C */
    public final long m2513C() {
        long j4;
        long j5;
        long j6;
        long j7;
        int i4 = this.f4233f;
        int i5 = this.f4231d;
        if (i5 != i4) {
            int i6 = i4 + 1;
            byte[] bArr = this.f4230c;
            byte b4 = bArr[i4];
            if (b4 >= 0) {
                this.f4233f = i6;
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
                this.f4233f = i7;
                return j4;
            }
        }
        return m2514D();
    }

    /* renamed from: D */
    public final long m2514D() {
        long j4 = 0;
        for (int i4 = 0; i4 < 64; i4 += 7) {
            int i5 = this.f4233f;
            if (i5 == this.f4231d) {
                throw androidx.datastore.preferences.protobuf.C1136z.m2649e();
            }
            this.f4233f = i5 + 1;
            j4 |= (r3 & Byte.MAX_VALUE) << i4;
            if ((this.f4230c[i5] & 128) == 0) {
                return j4;
            }
        }
        throw androidx.datastore.preferences.protobuf.C1136z.m2647c();
    }

    /* renamed from: E */
    public final void m2515E() {
        int i4 = this.f4231d + this.f4232e;
        this.f4231d = i4;
        int i5 = i4 - this.f4234g;
        int i6 = this.f4236i;
        if (i5 <= i6) {
            this.f4232e = 0;
            return;
        }
        int i7 = i5 - i6;
        this.f4232e = i7;
        this.f4231d = i4 - i7;
    }

    /* renamed from: F */
    public final void m2516F(int i4) {
        if (i4 >= 0) {
            int i5 = this.f4231d;
            int i6 = this.f4233f;
            if (i4 <= i5 - i6) {
                this.f4233f = i6 + i4;
                return;
            }
        }
        if (i4 >= 0) {
            throw androidx.datastore.preferences.protobuf.C1136z.m2649e();
        }
        throw androidx.datastore.preferences.protobuf.C1136z.m2648d();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: a */
    public final void mo2517a(int i4) {
        if (this.f4235h != i4) {
            throw new java.io.IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: b */
    public final int mo2518b() {
        return this.f4233f - this.f4234g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: c */
    public final boolean mo2519c() {
        return this.f4233f == this.f4231d;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: d */
    public final void mo2520d(int i4) {
        this.f4236i = i4;
        m2515E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: e */
    public final int mo2521e(int i4) {
        if (i4 < 0) {
            throw androidx.datastore.preferences.protobuf.C1136z.m2648d();
        }
        int mo2518b = mo2518b() + i4;
        if (mo2518b < 0) {
            throw new java.io.IOException("Failed to parse the message.");
        }
        int i5 = this.f4236i;
        if (mo2518b > i5) {
            throw androidx.datastore.preferences.protobuf.C1136z.m2649e();
        }
        this.f4236i = mo2518b;
        m2515E();
        return i5;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: f */
    public final boolean mo2522f() {
        return m2513C() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: g */
    public final androidx.datastore.preferences.protobuf.C1105g mo2523g() {
        byte[] bArr;
        int m2512B = m2512B();
        byte[] bArr2 = this.f4230c;
        if (m2512B > 0) {
            int i4 = this.f4231d;
            int i5 = this.f4233f;
            if (m2512B <= i4 - i5) {
                androidx.datastore.preferences.protobuf.C1105g m2509c = androidx.datastore.preferences.protobuf.C1105g.m2509c(bArr2, i5, m2512B);
                this.f4233f += m2512B;
                return m2509c;
            }
        }
        if (m2512B == 0) {
            return androidx.datastore.preferences.protobuf.C1105g.f4226n;
        }
        if (m2512B > 0) {
            int i6 = this.f4231d;
            int i7 = this.f4233f;
            if (m2512B <= i6 - i7) {
                int i8 = m2512B + i7;
                this.f4233f = i8;
                bArr = java.util.Arrays.copyOfRange(bArr2, i7, i8);
                androidx.datastore.preferences.protobuf.C1105g c1105g = androidx.datastore.preferences.protobuf.C1105g.f4226n;
                return new androidx.datastore.preferences.protobuf.C1105g(bArr);
            }
        }
        if (m2512B > 0) {
            throw androidx.datastore.preferences.protobuf.C1136z.m2649e();
        }
        if (m2512B != 0) {
            throw androidx.datastore.preferences.protobuf.C1136z.m2648d();
        }
        bArr = androidx.datastore.preferences.protobuf.AbstractC1134x.f4298b;
        androidx.datastore.preferences.protobuf.C1105g c1105g2 = androidx.datastore.preferences.protobuf.C1105g.f4226n;
        return new androidx.datastore.preferences.protobuf.C1105g(bArr);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: h */
    public final double mo2524h() {
        return java.lang.Double.longBitsToDouble(m2511A());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: i */
    public final int mo2525i() {
        return m2512B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: j */
    public final int mo2526j() {
        return m2541z();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: k */
    public final long mo2527k() {
        return m2511A();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: l */
    public final float mo2528l() {
        return java.lang.Float.intBitsToFloat(m2541z());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: m */
    public final int mo2529m() {
        return m2512B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: n */
    public final long mo2530n() {
        return m2513C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: o */
    public final int mo2531o() {
        return m2541z();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: p */
    public final long mo2532p() {
        return m2511A();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: q */
    public final int mo2533q() {
        int m2512B = m2512B();
        return (-(m2512B & 1)) ^ (m2512B >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: r */
    public final long mo2534r() {
        long m2513C = m2513C();
        return (-(m2513C & 1)) ^ (m2513C >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: s */
    public final java.lang.String mo2535s() {
        int m2512B = m2512B();
        if (m2512B > 0) {
            int i4 = this.f4231d;
            int i5 = this.f4233f;
            if (m2512B <= i4 - i5) {
                java.lang.String str = new java.lang.String(this.f4230c, i5, m2512B, androidx.datastore.preferences.protobuf.AbstractC1134x.f4297a);
                this.f4233f += m2512B;
                return str;
            }
        }
        if (m2512B == 0) {
            return "";
        }
        if (m2512B < 0) {
            throw androidx.datastore.preferences.protobuf.C1136z.m2648d();
        }
        throw androidx.datastore.preferences.protobuf.C1136z.m2649e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: t */
    public final java.lang.String mo2536t() {
        int m2512B = m2512B();
        if (m2512B > 0) {
            int i4 = this.f4231d;
            int i5 = this.f4233f;
            if (m2512B <= i4 - i5) {
                java.lang.String mo1393j = androidx.datastore.preferences.protobuf.AbstractC1116l0.f4263a.mo1393j(this.f4230c, i5, m2512B);
                this.f4233f += m2512B;
                return mo1393j;
            }
        }
        if (m2512B == 0) {
            return "";
        }
        if (m2512B <= 0) {
            throw androidx.datastore.preferences.protobuf.C1136z.m2648d();
        }
        throw androidx.datastore.preferences.protobuf.C1136z.m2649e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: u */
    public final int mo2537u() {
        if (mo2519c()) {
            this.f4235h = 0;
            return 0;
        }
        int m2512B = m2512B();
        this.f4235h = m2512B;
        if ((m2512B >>> 3) != 0) {
            return m2512B;
        }
        throw new java.io.IOException("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: v */
    public final int mo2538v() {
        return m2512B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: w */
    public final long mo2539w() {
        return m2513C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1111j
    /* renamed from: x */
    public final boolean mo2540x(int i4) {
        int i5 = i4 & 7;
        int i6 = 0;
        if (i5 != 0) {
            if (i5 == 1) {
                m2516F(8);
                return true;
            }
            if (i5 == 2) {
                m2516F(m2512B());
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
            m2516F(4);
            return true;
        }
        int i7 = this.f4231d - this.f4233f;
        byte[] bArr = this.f4230c;
        if (i7 >= 10) {
            while (i6 < 10) {
                int i8 = this.f4233f;
                this.f4233f = i8 + 1;
                if (bArr[i8] < 0) {
                    i6++;
                }
            }
            throw androidx.datastore.preferences.protobuf.C1136z.m2647c();
        }
        while (i6 < 10) {
            int i9 = this.f4233f;
            if (i9 == this.f4231d) {
                throw androidx.datastore.preferences.protobuf.C1136z.m2649e();
            }
            this.f4233f = i9 + 1;
            if (bArr[i9] < 0) {
                i6++;
            }
        }
        throw androidx.datastore.preferences.protobuf.C1136z.m2647c();
        return true;
    }

    /* renamed from: z */
    public final int m2541z() {
        int i4 = this.f4233f;
        if (this.f4231d - i4 < 4) {
            throw androidx.datastore.preferences.protobuf.C1136z.m2649e();
        }
        this.f4233f = i4 + 4;
        byte[] bArr = this.f4230c;
        return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
    }
}
