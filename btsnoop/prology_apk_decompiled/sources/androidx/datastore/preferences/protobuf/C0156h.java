package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0156h extends AbstractC0158j {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f4082c;

    /* renamed from: d, reason: collision with root package name */
    public int f4083d;

    /* renamed from: e, reason: collision with root package name */
    public int f4084e;

    /* renamed from: f, reason: collision with root package name */
    public int f4085f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4086g;

    /* renamed from: h, reason: collision with root package name */
    public int f4087h;

    /* renamed from: i, reason: collision with root package name */
    public int f4088i = Integer.MAX_VALUE;

    public C0156h(byte[] bArr, int i4, int i5, boolean z4) {
        this.f4082c = bArr;
        this.f4083d = i5 + i4;
        this.f4085f = i4;
        this.f4086g = i4;
    }

    public final long A() {
        int i4 = this.f4085f;
        if (this.f4083d - i4 < 8) {
            throw C0173z.e();
        }
        this.f4085f = i4 + 8;
        byte[] bArr = this.f4082c;
        return ((bArr[i4 + 7] & 255) << 56) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48);
    }

    public final int B() {
        int i4;
        int i5 = this.f4085f;
        int i6 = this.f4083d;
        if (i6 != i5) {
            int i7 = i5 + 1;
            byte[] bArr = this.f4082c;
            byte b4 = bArr[i5];
            if (b4 >= 0) {
                this.f4085f = i7;
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
                this.f4085f = i8;
                return i4;
            }
        }
        return (int) D();
    }

    public final long C() {
        long j4;
        long j5;
        long j6;
        long j7;
        int i4 = this.f4085f;
        int i5 = this.f4083d;
        if (i5 != i4) {
            int i6 = i4 + 1;
            byte[] bArr = this.f4082c;
            byte b4 = bArr[i4];
            if (b4 >= 0) {
                this.f4085f = i6;
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
                this.f4085f = i7;
                return j4;
            }
        }
        return D();
    }

    public final long D() {
        long j4 = 0;
        for (int i4 = 0; i4 < 64; i4 += 7) {
            int i5 = this.f4085f;
            if (i5 == this.f4083d) {
                throw C0173z.e();
            }
            this.f4085f = i5 + 1;
            j4 |= (r3 & Byte.MAX_VALUE) << i4;
            if ((this.f4082c[i5] & 128) == 0) {
                return j4;
            }
        }
        throw C0173z.c();
    }

    public final void E() {
        int i4 = this.f4083d + this.f4084e;
        this.f4083d = i4;
        int i5 = i4 - this.f4086g;
        int i6 = this.f4088i;
        if (i5 <= i6) {
            this.f4084e = 0;
            return;
        }
        int i7 = i5 - i6;
        this.f4084e = i7;
        this.f4083d = i4 - i7;
    }

    public final void F(int i4) {
        if (i4 >= 0) {
            int i5 = this.f4083d;
            int i6 = this.f4085f;
            if (i4 <= i5 - i6) {
                this.f4085f = i6 + i4;
                return;
            }
        }
        if (i4 >= 0) {
            throw C0173z.e();
        }
        throw C0173z.d();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final void a(int i4) {
        if (this.f4087h != i4) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final int b() {
        return this.f4085f - this.f4086g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final boolean c() {
        return this.f4085f == this.f4083d;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final void d(int i4) {
        this.f4088i = i4;
        E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final int e(int i4) {
        if (i4 < 0) {
            throw C0173z.d();
        }
        int b4 = b() + i4;
        if (b4 < 0) {
            throw new IOException("Failed to parse the message.");
        }
        int i5 = this.f4088i;
        if (b4 > i5) {
            throw C0173z.e();
        }
        this.f4088i = b4;
        E();
        return i5;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final boolean f() {
        return C() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final C0155g g() {
        byte[] bArr;
        int B4 = B();
        byte[] bArr2 = this.f4082c;
        if (B4 > 0) {
            int i4 = this.f4083d;
            int i5 = this.f4085f;
            if (B4 <= i4 - i5) {
                C0155g c4 = C0155g.c(bArr2, i5, B4);
                this.f4085f += B4;
                return c4;
            }
        }
        if (B4 == 0) {
            return C0155g.f4078n;
        }
        if (B4 > 0) {
            int i6 = this.f4083d;
            int i7 = this.f4085f;
            if (B4 <= i6 - i7) {
                int i8 = B4 + i7;
                this.f4085f = i8;
                bArr = Arrays.copyOfRange(bArr2, i7, i8);
                C0155g c0155g = C0155g.f4078n;
                return new C0155g(bArr);
            }
        }
        if (B4 > 0) {
            throw C0173z.e();
        }
        if (B4 != 0) {
            throw C0173z.d();
        }
        bArr = AbstractC0171x.f4149b;
        C0155g c0155g2 = C0155g.f4078n;
        return new C0155g(bArr);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final double h() {
        return Double.longBitsToDouble(A());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final int i() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final int j() {
        return z();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final long k() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final float l() {
        return Float.intBitsToFloat(z());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final int m() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final long n() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final int o() {
        return z();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final long p() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final int q() {
        int B4 = B();
        return (-(B4 & 1)) ^ (B4 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final long r() {
        long C4 = C();
        return (-(C4 & 1)) ^ (C4 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final String s() {
        int B4 = B();
        if (B4 > 0) {
            int i4 = this.f4083d;
            int i5 = this.f4085f;
            if (B4 <= i4 - i5) {
                String str = new String(this.f4082c, i5, B4, AbstractC0171x.f4148a);
                this.f4085f += B4;
                return str;
            }
        }
        if (B4 == 0) {
            return "";
        }
        if (B4 < 0) {
            throw C0173z.d();
        }
        throw C0173z.e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final String t() {
        int B4 = B();
        if (B4 > 0) {
            int i4 = this.f4083d;
            int i5 = this.f4085f;
            if (B4 <= i4 - i5) {
                String j4 = l0.f4115a.j(this.f4082c, i5, B4);
                this.f4085f += B4;
                return j4;
            }
        }
        if (B4 == 0) {
            return "";
        }
        if (B4 <= 0) {
            throw C0173z.d();
        }
        throw C0173z.e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final int u() {
        if (c()) {
            this.f4087h = 0;
            return 0;
        }
        int B4 = B();
        this.f4087h = B4;
        if ((B4 >>> 3) != 0) {
            return B4;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final int v() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final long w() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final boolean x(int i4) {
        int i5 = i4 & 7;
        int i6 = 0;
        if (i5 != 0) {
            if (i5 == 1) {
                F(8);
                return true;
            }
            if (i5 == 2) {
                F(B());
                return true;
            }
            if (i5 == 3) {
                y();
                a(((i4 >>> 3) << 3) | 4);
                return true;
            }
            if (i5 == 4) {
                return false;
            }
            if (i5 != 5) {
                throw C0173z.b();
            }
            F(4);
            return true;
        }
        int i7 = this.f4083d - this.f4085f;
        byte[] bArr = this.f4082c;
        if (i7 >= 10) {
            while (i6 < 10) {
                int i8 = this.f4085f;
                this.f4085f = i8 + 1;
                if (bArr[i8] < 0) {
                    i6++;
                }
            }
            throw C0173z.c();
        }
        while (i6 < 10) {
            int i9 = this.f4085f;
            if (i9 == this.f4083d) {
                throw C0173z.e();
            }
            this.f4085f = i9 + 1;
            if (bArr[i9] < 0) {
                i6++;
            }
        }
        throw C0173z.c();
        return true;
    }

    public final int z() {
        int i4 = this.f4085f;
        if (this.f4083d - i4 < 4) {
            throw C0173z.e();
        }
        this.f4085f = i4 + 4;
        byte[] bArr = this.f4082c;
        return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
    }
}
