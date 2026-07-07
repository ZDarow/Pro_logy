package androidx.datastore.preferences.protobuf;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0160l extends U1.a {

    /* renamed from: l, reason: collision with root package name */
    public static final Logger f4108l = Logger.getLogger(C0160l.class.getName());

    /* renamed from: m, reason: collision with root package name */
    public static final boolean f4109m = i0.f4102e;

    /* renamed from: g, reason: collision with root package name */
    public E f4110g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f4111h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4112i;

    /* renamed from: j, reason: collision with root package name */
    public int f4113j;

    /* renamed from: k, reason: collision with root package name */
    public final OutputStream f4114k;

    public C0160l(OutputStream outputStream, int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i4, 20);
        this.f4111h = new byte[max];
        this.f4112i = max;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f4114k = outputStream;
    }

    public static int V(int i4) {
        return l0(i4) + 1;
    }

    public static int W(int i4, C0155g c0155g) {
        int l02 = l0(i4);
        int size = c0155g.size();
        return n0(size) + size + l02;
    }

    public static int X(int i4) {
        return l0(i4) + 8;
    }

    public static int Y(int i4, int i5) {
        return p0(i5) + l0(i4);
    }

    public static int Z(int i4) {
        return l0(i4) + 4;
    }

    public static int a0(int i4) {
        return l0(i4) + 8;
    }

    public static int b0(int i4) {
        return l0(i4) + 4;
    }

    public static int c0(int i4, AbstractC0149a abstractC0149a, V v4) {
        return abstractC0149a.a(v4) + (l0(i4) * 2);
    }

    public static int d0(int i4, int i5) {
        return p0(i5) + l0(i4);
    }

    public static int e0(long j4, int i4) {
        return p0(j4) + l0(i4);
    }

    public static int f0(int i4) {
        return l0(i4) + 4;
    }

    public static int g0(int i4) {
        return l0(i4) + 8;
    }

    public static int h0(int i4, int i5) {
        return n0((i5 >> 31) ^ (i5 << 1)) + l0(i4);
    }

    public static int i0(long j4, int i4) {
        return p0((j4 >> 63) ^ (j4 << 1)) + l0(i4);
    }

    public static int j0(String str, int i4) {
        return k0(str) + l0(i4);
    }

    public static int k0(String str) {
        int length;
        try {
            length = l0.a(str);
        } catch (k0 unused) {
            length = str.getBytes(AbstractC0171x.f4148a).length;
        }
        return n0(length) + length;
    }

    public static int l0(int i4) {
        return n0(i4 << 3);
    }

    public static int m0(int i4, int i5) {
        return n0(i5) + l0(i4);
    }

    public static int n0(int i4) {
        return (352 - (Integer.numberOfLeadingZeros(i4) * 9)) >>> 6;
    }

    public static int o0(long j4, int i4) {
        return p0(j4) + l0(i4);
    }

    public static int p0(long j4) {
        return (640 - (Long.numberOfLeadingZeros(j4) * 9)) >>> 6;
    }

    public final void A0(long j4) {
        r0(8);
        R(j4);
    }

    public final void B0(int i4, int i5) {
        r0(20);
        S(i4, 0);
        if (i5 >= 0) {
            T(i5);
        } else {
            U(i5);
        }
    }

    public final void C0(int i4) {
        if (i4 >= 0) {
            H0(i4);
        } else {
            J0(i4);
        }
    }

    public final void D0(String str, int i4) {
        F0(i4, 2);
        E0(str);
    }

    public final void E0(String str) {
        try {
            int length = str.length() * 3;
            int n02 = n0(length);
            int i4 = n02 + length;
            int i5 = this.f4112i;
            if (i4 > i5) {
                byte[] bArr = new byte[length];
                int n4 = l0.f4115a.n(str, bArr, 0, length);
                H0(n4);
                t0(bArr, 0, n4);
                return;
            }
            if (i4 > i5 - this.f4113j) {
                q0();
            }
            int n03 = n0(str.length());
            int i6 = this.f4113j;
            byte[] bArr2 = this.f4111h;
            try {
                if (n03 == n02) {
                    int i7 = i6 + n03;
                    this.f4113j = i7;
                    int n5 = l0.f4115a.n(str, bArr2, i7, i5 - i7);
                    this.f4113j = i6;
                    T((n5 - i6) - n03);
                    this.f4113j = n5;
                } else {
                    int a4 = l0.a(str);
                    T(a4);
                    this.f4113j = l0.f4115a.n(str, bArr2, this.f4113j, a4);
                }
            } catch (k0 e4) {
                this.f4113j = i6;
                throw e4;
            } catch (ArrayIndexOutOfBoundsException e5) {
                throw new C0159k(e5);
            }
        } catch (k0 e6) {
            f4108l.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e6);
            byte[] bytes = str.getBytes(AbstractC0171x.f4148a);
            try {
                H0(bytes.length);
                O(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e7) {
                throw new C0159k(e7);
            }
        }
    }

    public final void F0(int i4, int i5) {
        H0((i4 << 3) | i5);
    }

    public final void G0(int i4, int i5) {
        r0(20);
        S(i4, 0);
        T(i5);
    }

    public final void H0(int i4) {
        r0(5);
        T(i4);
    }

    public final void I0(long j4, int i4) {
        r0(20);
        S(i4, 0);
        U(j4);
    }

    public final void J0(long j4) {
        r0(10);
        U(j4);
    }

    @Override // U1.a
    public final void O(byte[] bArr, int i4, int i5) {
        t0(bArr, i4, i5);
    }

    public final void Q(int i4) {
        int i5 = this.f4113j;
        int i6 = i5 + 1;
        this.f4113j = i6;
        byte[] bArr = this.f4111h;
        bArr[i5] = (byte) (i4 & 255);
        int i7 = i5 + 2;
        this.f4113j = i7;
        bArr[i6] = (byte) ((i4 >> 8) & 255);
        int i8 = i5 + 3;
        this.f4113j = i8;
        bArr[i7] = (byte) ((i4 >> 16) & 255);
        this.f4113j = i5 + 4;
        bArr[i8] = (byte) ((i4 >> 24) & 255);
    }

    public final void R(long j4) {
        int i4 = this.f4113j;
        int i5 = i4 + 1;
        this.f4113j = i5;
        byte[] bArr = this.f4111h;
        bArr[i4] = (byte) (j4 & 255);
        int i6 = i4 + 2;
        this.f4113j = i6;
        bArr[i5] = (byte) ((j4 >> 8) & 255);
        int i7 = i4 + 3;
        this.f4113j = i7;
        bArr[i6] = (byte) ((j4 >> 16) & 255);
        int i8 = i4 + 4;
        this.f4113j = i8;
        bArr[i7] = (byte) (255 & (j4 >> 24));
        int i9 = i4 + 5;
        this.f4113j = i9;
        bArr[i8] = (byte) (((int) (j4 >> 32)) & 255);
        int i10 = i4 + 6;
        this.f4113j = i10;
        bArr[i9] = (byte) (((int) (j4 >> 40)) & 255);
        int i11 = i4 + 7;
        this.f4113j = i11;
        bArr[i10] = (byte) (((int) (j4 >> 48)) & 255);
        this.f4113j = i4 + 8;
        bArr[i11] = (byte) (((int) (j4 >> 56)) & 255);
    }

    public final void S(int i4, int i5) {
        T((i4 << 3) | i5);
    }

    public final void T(int i4) {
        boolean z4 = f4109m;
        byte[] bArr = this.f4111h;
        if (z4) {
            while ((i4 & (-128)) != 0) {
                int i5 = this.f4113j;
                this.f4113j = i5 + 1;
                i0.j(bArr, i5, (byte) ((i4 | 128) & 255));
                i4 >>>= 7;
            }
            int i6 = this.f4113j;
            this.f4113j = i6 + 1;
            i0.j(bArr, i6, (byte) i4);
            return;
        }
        while ((i4 & (-128)) != 0) {
            int i7 = this.f4113j;
            this.f4113j = i7 + 1;
            bArr[i7] = (byte) ((i4 | 128) & 255);
            i4 >>>= 7;
        }
        int i8 = this.f4113j;
        this.f4113j = i8 + 1;
        bArr[i8] = (byte) i4;
    }

    public final void U(long j4) {
        boolean z4 = f4109m;
        byte[] bArr = this.f4111h;
        if (z4) {
            while ((j4 & (-128)) != 0) {
                int i4 = this.f4113j;
                this.f4113j = i4 + 1;
                i0.j(bArr, i4, (byte) ((((int) j4) | 128) & 255));
                j4 >>>= 7;
            }
            int i5 = this.f4113j;
            this.f4113j = i5 + 1;
            i0.j(bArr, i5, (byte) j4);
            return;
        }
        while ((j4 & (-128)) != 0) {
            int i6 = this.f4113j;
            this.f4113j = i6 + 1;
            bArr[i6] = (byte) ((((int) j4) | 128) & 255);
            j4 >>>= 7;
        }
        int i7 = this.f4113j;
        this.f4113j = i7 + 1;
        bArr[i7] = (byte) j4;
    }

    public final void q0() {
        this.f4114k.write(this.f4111h, 0, this.f4113j);
        this.f4113j = 0;
    }

    public final void r0(int i4) {
        if (this.f4112i - this.f4113j < i4) {
            q0();
        }
    }

    public final void s0(byte b4) {
        if (this.f4113j == this.f4112i) {
            q0();
        }
        int i4 = this.f4113j;
        this.f4113j = i4 + 1;
        this.f4111h[i4] = b4;
    }

    public final void t0(byte[] bArr, int i4, int i5) {
        int i6 = this.f4113j;
        int i7 = this.f4112i;
        int i8 = i7 - i6;
        byte[] bArr2 = this.f4111h;
        if (i8 >= i5) {
            System.arraycopy(bArr, i4, bArr2, i6, i5);
            this.f4113j += i5;
            return;
        }
        System.arraycopy(bArr, i4, bArr2, i6, i8);
        int i9 = i4 + i8;
        int i10 = i5 - i8;
        this.f4113j = i7;
        q0();
        if (i10 > i7) {
            this.f4114k.write(bArr, i9, i10);
        } else {
            System.arraycopy(bArr, i9, bArr2, 0, i10);
            this.f4113j = i10;
        }
    }

    public final void u0(int i4, boolean z4) {
        r0(11);
        S(i4, 0);
        byte b4 = z4 ? (byte) 1 : (byte) 0;
        int i5 = this.f4113j;
        this.f4113j = i5 + 1;
        this.f4111h[i5] = b4;
    }

    public final void v0(int i4, C0155g c0155g) {
        F0(i4, 2);
        w0(c0155g);
    }

    public final void w0(C0155g c0155g) {
        H0(c0155g.size());
        O(c0155g.f4081m, c0155g.e(), c0155g.size());
    }

    public final void x0(int i4, int i5) {
        r0(14);
        S(i4, 5);
        Q(i5);
    }

    public final void y0(int i4) {
        r0(4);
        Q(i4);
    }

    public final void z0(long j4, int i4) {
        r0(18);
        S(i4, 1);
        R(j4);
    }
}
