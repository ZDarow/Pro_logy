package androidx.datastore.preferences.protobuf;

import B2.AbstractC0007h;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0157i extends AbstractC0158j {

    /* renamed from: c, reason: collision with root package name */
    public final InputStream f4090c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f4091d;

    /* renamed from: e, reason: collision with root package name */
    public int f4092e;

    /* renamed from: f, reason: collision with root package name */
    public int f4093f;

    /* renamed from: g, reason: collision with root package name */
    public int f4094g;

    /* renamed from: h, reason: collision with root package name */
    public int f4095h;

    /* renamed from: i, reason: collision with root package name */
    public int f4096i;

    /* renamed from: j, reason: collision with root package name */
    public int f4097j = Integer.MAX_VALUE;

    public C0157i(InputStream inputStream) {
        Charset charset = AbstractC0171x.f4148a;
        this.f4090c = inputStream;
        this.f4091d = new byte[4096];
        this.f4092e = 0;
        this.f4094g = 0;
        this.f4096i = 0;
    }

    public final byte[] A(int i4) {
        if (i4 == 0) {
            return AbstractC0171x.f4149b;
        }
        if (i4 < 0) {
            throw C0173z.d();
        }
        int i5 = this.f4096i;
        int i6 = this.f4094g;
        int i7 = i5 + i6 + i4;
        if (i7 - Integer.MAX_VALUE > 0) {
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i8 = this.f4097j;
        if (i7 > i8) {
            J((i8 - i5) - i6);
            throw C0173z.e();
        }
        int i9 = this.f4092e - i6;
        int i10 = i4 - i9;
        InputStream inputStream = this.f4090c;
        if (i10 >= 4096) {
            try {
                if (i10 > inputStream.available()) {
                    return null;
                }
            } catch (C0173z e4) {
                e4.f4150l = true;
                throw e4;
            }
        }
        byte[] bArr = new byte[i4];
        System.arraycopy(this.f4091d, this.f4094g, bArr, 0, i9);
        this.f4096i += this.f4092e;
        this.f4094g = 0;
        this.f4092e = 0;
        while (i9 < i4) {
            try {
                int read = inputStream.read(bArr, i9, i4 - i9);
                if (read == -1) {
                    throw C0173z.e();
                }
                this.f4096i += read;
                i9 += read;
            } catch (C0173z e5) {
                e5.f4150l = true;
                throw e5;
            }
        }
        return bArr;
    }

    public final ArrayList B(int i4) {
        ArrayList arrayList = new ArrayList();
        while (i4 > 0) {
            int min = Math.min(i4, 4096);
            byte[] bArr = new byte[min];
            int i5 = 0;
            while (i5 < min) {
                int read = this.f4090c.read(bArr, i5, min - i5);
                if (read == -1) {
                    throw C0173z.e();
                }
                this.f4096i += read;
                i5 += read;
            }
            i4 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int C() {
        int i4 = this.f4094g;
        if (this.f4092e - i4 < 4) {
            I(4);
            i4 = this.f4094g;
        }
        this.f4094g = i4 + 4;
        byte[] bArr = this.f4091d;
        return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
    }

    public final long D() {
        int i4 = this.f4094g;
        if (this.f4092e - i4 < 8) {
            I(8);
            i4 = this.f4094g;
        }
        this.f4094g = i4 + 8;
        byte[] bArr = this.f4091d;
        return ((bArr[i4 + 7] & 255) << 56) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48);
    }

    public final int E() {
        int i4;
        int i5 = this.f4094g;
        int i6 = this.f4092e;
        if (i6 != i5) {
            int i7 = i5 + 1;
            byte[] bArr = this.f4091d;
            byte b4 = bArr[i5];
            if (b4 >= 0) {
                this.f4094g = i7;
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
                this.f4094g = i8;
                return i4;
            }
        }
        return (int) G();
    }

    public final long F() {
        long j4;
        long j5;
        long j6;
        long j7;
        int i4 = this.f4094g;
        int i5 = this.f4092e;
        if (i5 != i4) {
            int i6 = i4 + 1;
            byte[] bArr = this.f4091d;
            byte b4 = bArr[i4];
            if (b4 >= 0) {
                this.f4094g = i6;
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
                this.f4094g = i7;
                return j4;
            }
        }
        return G();
    }

    public final long G() {
        long j4 = 0;
        for (int i4 = 0; i4 < 64; i4 += 7) {
            if (this.f4094g == this.f4092e) {
                I(1);
            }
            int i5 = this.f4094g;
            this.f4094g = i5 + 1;
            j4 |= (r3 & Byte.MAX_VALUE) << i4;
            if ((this.f4091d[i5] & 128) == 0) {
                return j4;
            }
        }
        throw C0173z.c();
    }

    public final void H() {
        int i4 = this.f4092e + this.f4093f;
        this.f4092e = i4;
        int i5 = this.f4096i + i4;
        int i6 = this.f4097j;
        if (i5 <= i6) {
            this.f4093f = 0;
            return;
        }
        int i7 = i5 - i6;
        this.f4093f = i7;
        this.f4092e = i4 - i7;
    }

    public final void I(int i4) {
        if (K(i4)) {
            return;
        }
        if (i4 <= (Integer.MAX_VALUE - this.f4096i) - this.f4094g) {
            throw C0173z.e();
        }
        throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void J(int i4) {
        int i5 = this.f4092e;
        int i6 = this.f4094g;
        if (i4 <= i5 - i6 && i4 >= 0) {
            this.f4094g = i6 + i4;
            return;
        }
        InputStream inputStream = this.f4090c;
        if (i4 < 0) {
            throw C0173z.d();
        }
        int i7 = this.f4096i;
        int i8 = i7 + i6;
        int i9 = i8 + i4;
        int i10 = this.f4097j;
        if (i9 > i10) {
            J((i10 - i7) - i6);
            throw C0173z.e();
        }
        this.f4096i = i8;
        int i11 = i5 - i6;
        this.f4092e = 0;
        this.f4094g = 0;
        while (i11 < i4) {
            long j4 = i4 - i11;
            try {
                try {
                    long skip = inputStream.skip(j4);
                    if (skip < 0 || skip > j4) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i11 += (int) skip;
                    }
                } catch (C0173z e4) {
                    e4.f4150l = true;
                    throw e4;
                }
            } catch (Throwable th) {
                this.f4096i += i11;
                H();
                throw th;
            }
        }
        this.f4096i += i11;
        H();
        if (i11 >= i4) {
            return;
        }
        int i12 = this.f4092e;
        int i13 = i12 - this.f4094g;
        this.f4094g = i12;
        I(1);
        while (true) {
            int i14 = i4 - i13;
            int i15 = this.f4092e;
            if (i14 <= i15) {
                this.f4094g = i14;
                return;
            } else {
                i13 += i15;
                this.f4094g = i15;
                I(1);
            }
        }
    }

    public final boolean K(int i4) {
        int i5 = this.f4094g;
        int i6 = i5 + i4;
        int i7 = this.f4092e;
        if (i6 <= i7) {
            throw new IllegalStateException(AbstractC0007h.j(i4, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i8 = this.f4096i;
        if (i4 > (Integer.MAX_VALUE - i8) - i5 || i8 + i5 + i4 > this.f4097j) {
            return false;
        }
        byte[] bArr = this.f4091d;
        if (i5 > 0) {
            if (i7 > i5) {
                System.arraycopy(bArr, i5, bArr, 0, i7 - i5);
            }
            this.f4096i += i5;
            this.f4092e -= i5;
            this.f4094g = 0;
        }
        int i9 = this.f4092e;
        int min = Math.min(bArr.length - i9, (Integer.MAX_VALUE - this.f4096i) - i9);
        InputStream inputStream = this.f4090c;
        try {
            int read = inputStream.read(bArr, i9, min);
            if (read == 0 || read < -1 || read > bArr.length) {
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.f4092e += read;
            H();
            if (this.f4092e >= i4) {
                return true;
            }
            return K(i4);
        } catch (C0173z e4) {
            e4.f4150l = true;
            throw e4;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final void a(int i4) {
        if (this.f4095h != i4) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final int b() {
        return this.f4096i + this.f4094g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final boolean c() {
        return this.f4094g == this.f4092e && !K(1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final void d(int i4) {
        this.f4097j = i4;
        H();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final int e(int i4) {
        if (i4 < 0) {
            throw C0173z.d();
        }
        int i5 = this.f4096i + this.f4094g + i4;
        if (i5 < 0) {
            throw new IOException("Failed to parse the message.");
        }
        int i6 = this.f4097j;
        if (i5 > i6) {
            throw C0173z.e();
        }
        this.f4097j = i5;
        H();
        return i6;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final boolean f() {
        return F() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final C0155g g() {
        int E3 = E();
        int i4 = this.f4092e;
        int i5 = this.f4094g;
        int i6 = i4 - i5;
        byte[] bArr = this.f4091d;
        if (E3 <= i6 && E3 > 0) {
            C0155g c4 = C0155g.c(bArr, i5, E3);
            this.f4094g += E3;
            return c4;
        }
        if (E3 == 0) {
            return C0155g.f4078n;
        }
        if (E3 < 0) {
            throw C0173z.d();
        }
        byte[] A4 = A(E3);
        if (A4 != null) {
            return C0155g.c(A4, 0, A4.length);
        }
        int i7 = this.f4094g;
        int i8 = this.f4092e;
        int i9 = i8 - i7;
        this.f4096i += i8;
        this.f4094g = 0;
        this.f4092e = 0;
        ArrayList B4 = B(E3 - i9);
        byte[] bArr2 = new byte[E3];
        System.arraycopy(bArr, i7, bArr2, 0, i9);
        Iterator it = B4.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, i9, bArr3.length);
            i9 += bArr3.length;
        }
        C0155g c0155g = C0155g.f4078n;
        return new C0155g(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final double h() {
        return Double.longBitsToDouble(D());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final int i() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final int j() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final long k() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final float l() {
        return Float.intBitsToFloat(C());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final int m() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final long n() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final int o() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final long p() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final int q() {
        int E3 = E();
        return (-(E3 & 1)) ^ (E3 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final long r() {
        long F3 = F();
        return (-(F3 & 1)) ^ (F3 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final String s() {
        int E3 = E();
        byte[] bArr = this.f4091d;
        if (E3 > 0) {
            int i4 = this.f4092e;
            int i5 = this.f4094g;
            if (E3 <= i4 - i5) {
                String str = new String(bArr, i5, E3, AbstractC0171x.f4148a);
                this.f4094g += E3;
                return str;
            }
        }
        if (E3 == 0) {
            return "";
        }
        if (E3 < 0) {
            throw C0173z.d();
        }
        if (E3 > this.f4092e) {
            return new String(z(E3), AbstractC0171x.f4148a);
        }
        I(E3);
        String str2 = new String(bArr, this.f4094g, E3, AbstractC0171x.f4148a);
        this.f4094g += E3;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final String t() {
        int E3 = E();
        int i4 = this.f4094g;
        int i5 = this.f4092e;
        int i6 = i5 - i4;
        byte[] bArr = this.f4091d;
        if (E3 <= i6 && E3 > 0) {
            this.f4094g = i4 + E3;
        } else {
            if (E3 == 0) {
                return "";
            }
            if (E3 < 0) {
                throw C0173z.d();
            }
            i4 = 0;
            if (E3 <= i5) {
                I(E3);
                this.f4094g = E3;
            } else {
                bArr = z(E3);
            }
        }
        return l0.f4115a.j(bArr, i4, E3);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final int u() {
        if (c()) {
            this.f4095h = 0;
            return 0;
        }
        int E3 = E();
        this.f4095h = E3;
        if ((E3 >>> 3) != 0) {
            return E3;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final int v() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final long w() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0158j
    public final boolean x(int i4) {
        int i5 = i4 & 7;
        int i6 = 0;
        if (i5 != 0) {
            if (i5 == 1) {
                J(8);
                return true;
            }
            if (i5 == 2) {
                J(E());
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
            J(4);
            return true;
        }
        int i7 = this.f4092e - this.f4094g;
        byte[] bArr = this.f4091d;
        if (i7 >= 10) {
            while (i6 < 10) {
                int i8 = this.f4094g;
                this.f4094g = i8 + 1;
                if (bArr[i8] < 0) {
                    i6++;
                }
            }
            throw C0173z.c();
        }
        while (i6 < 10) {
            if (this.f4094g == this.f4092e) {
                I(1);
            }
            int i9 = this.f4094g;
            this.f4094g = i9 + 1;
            if (bArr[i9] < 0) {
                i6++;
            }
        }
        throw C0173z.c();
        return true;
    }

    public final byte[] z(int i4) {
        byte[] A4 = A(i4);
        if (A4 != null) {
            return A4;
        }
        int i5 = this.f4094g;
        int i6 = this.f4092e;
        int i7 = i6 - i5;
        this.f4096i += i6;
        this.f4094g = 0;
        this.f4092e = 0;
        ArrayList B4 = B(i4 - i7);
        byte[] bArr = new byte[i4];
        System.arraycopy(this.f4091d, i5, bArr, 0, i7);
        Iterator it = B4.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i7, bArr2.length);
            i7 += bArr2.length;
        }
        return bArr;
    }
}
