package W;

import B2.AbstractC0007h;
import f2.M;
import java.nio.charset.Charset;
import java.util.Arrays;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f2691d = {'\r', '\n'};

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f2692e = {'\n'};

    /* renamed from: f, reason: collision with root package name */
    public static final M f2693f = M.i(5, e2.d.f5434a, e2.d.f5436c, e2.d.f5439f, e2.d.f5437d, e2.d.f5438e);

    /* renamed from: a, reason: collision with root package name */
    public byte[] f2694a;

    /* renamed from: b, reason: collision with root package name */
    public int f2695b;

    /* renamed from: c, reason: collision with root package name */
    public int f2696c;

    public r() {
        this.f2694a = y.f2714f;
    }

    public final int A() {
        byte[] bArr = this.f2694a;
        int i4 = this.f2695b;
        int i5 = i4 + 1;
        this.f2695b = i5;
        int i6 = (bArr[i4] & 255) << 8;
        this.f2695b = i4 + 2;
        return (bArr[i5] & 255) | i6;
    }

    public final long B() {
        int i4;
        int i5;
        long j4 = this.f2694a[this.f2695b];
        int i6 = 7;
        while (true) {
            if (i6 < 0) {
                break;
            }
            if (((1 << i6) & j4) != 0) {
                i6--;
            } else if (i6 < 6) {
                j4 &= r6 - 1;
                i5 = 7 - i6;
            } else if (i6 == 7) {
                i5 = 1;
            }
        }
        i5 = 0;
        if (i5 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j4);
        }
        for (i4 = 1; i4 < i5; i4++) {
            if ((this.f2694a[this.f2695b + i4] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j4);
            }
            j4 = (j4 << 6) | (r3 & 63);
        }
        this.f2695b += i5;
        return j4;
    }

    public final Charset C() {
        if (a() >= 3) {
            byte[] bArr = this.f2694a;
            int i4 = this.f2695b;
            if (bArr[i4] == -17 && bArr[i4 + 1] == -69 && bArr[i4 + 2] == -65) {
                this.f2695b = i4 + 3;
                return e2.d.f5436c;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f2694a;
        int i5 = this.f2695b;
        byte b4 = bArr2[i5];
        if (b4 == -2 && bArr2[i5 + 1] == -1) {
            this.f2695b = i5 + 2;
            return e2.d.f5437d;
        }
        if (b4 != -1 || bArr2[i5 + 1] != -2) {
            return null;
        }
        this.f2695b = i5 + 2;
        return e2.d.f5438e;
    }

    public final void D(int i4) {
        byte[] bArr = this.f2694a;
        if (bArr.length < i4) {
            bArr = new byte[i4];
        }
        E(bArr, i4);
    }

    public final void E(byte[] bArr, int i4) {
        this.f2694a = bArr;
        this.f2696c = i4;
        this.f2695b = 0;
    }

    public final void F(int i4) {
        a.e(i4 >= 0 && i4 <= this.f2694a.length);
        this.f2696c = i4;
    }

    public final void G(int i4) {
        a.e(i4 >= 0 && i4 <= this.f2696c);
        this.f2695b = i4;
    }

    public final void H(int i4) {
        G(this.f2695b + i4);
    }

    public final int a() {
        return this.f2696c - this.f2695b;
    }

    public final void b(int i4) {
        byte[] bArr = this.f2694a;
        if (i4 > bArr.length) {
            this.f2694a = Arrays.copyOf(bArr, i4);
        }
    }

    public final char c(Charset charset) {
        a.d("Unsupported charset: " + charset, f2693f.contains(charset));
        return (char) (d(charset) >> 16);
    }

    public final int d(Charset charset) {
        byte b4;
        int i4;
        byte b5;
        byte b6;
        if ((charset.equals(e2.d.f5436c) || charset.equals(e2.d.f5434a)) && a() >= 1) {
            long j4 = this.f2694a[this.f2695b] & 255;
            char c4 = (char) j4;
            AbstractC0462a.k(((long) c4) == j4, "Out of range: %s", j4);
            b4 = (byte) c4;
            i4 = 1;
        } else {
            i4 = 2;
            if ((charset.equals(e2.d.f5439f) || charset.equals(e2.d.f5437d)) && a() >= 2) {
                byte[] bArr = this.f2694a;
                int i5 = this.f2695b;
                b5 = bArr[i5];
                b6 = bArr[i5 + 1];
            } else {
                if (!charset.equals(e2.d.f5438e) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f2694a;
                int i6 = this.f2695b;
                b5 = bArr2[i6 + 1];
                b6 = bArr2[i6];
            }
            b4 = (byte) ((char) ((b6 & 255) | (b5 << 8)));
        }
        long j5 = b4;
        char c5 = (char) j5;
        AbstractC0462a.k(((long) c5) == j5, "Out of range: %s", j5);
        return (c5 << 16) + i4;
    }

    public final int e() {
        return this.f2694a[this.f2695b] & 255;
    }

    public final void f(byte[] bArr, int i4, int i5) {
        System.arraycopy(this.f2694a, this.f2695b, bArr, i4, i5);
        this.f2695b += i5;
    }

    public final char g(Charset charset, char[] cArr) {
        int d4 = d(charset);
        if (d4 != 0) {
            char c4 = (char) (d4 >> 16);
            for (char c5 : cArr) {
                if (c5 == c4) {
                    this.f2695b += d4 & 65535;
                    return c4;
                }
            }
        }
        return (char) 0;
    }

    public final int h() {
        byte[] bArr = this.f2694a;
        int i4 = this.f2695b;
        int i5 = i4 + 1;
        this.f2695b = i5;
        int i6 = (bArr[i4] & 255) << 24;
        int i7 = i4 + 2;
        this.f2695b = i7;
        int i8 = ((bArr[i5] & 255) << 16) | i6;
        int i9 = i4 + 3;
        this.f2695b = i9;
        int i10 = i8 | ((bArr[i7] & 255) << 8);
        this.f2695b = i4 + 4;
        return (bArr[i9] & 255) | i10;
    }

    public final String i(Charset charset) {
        int i4;
        a.d("Unsupported charset: " + charset, f2693f.contains(charset));
        if (a() == 0) {
            return null;
        }
        Charset charset2 = e2.d.f5434a;
        if (!charset.equals(charset2)) {
            C();
        }
        if (charset.equals(e2.d.f5436c) || charset.equals(charset2)) {
            i4 = 1;
        } else {
            if (!charset.equals(e2.d.f5439f) && !charset.equals(e2.d.f5438e) && !charset.equals(e2.d.f5437d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i4 = 2;
        }
        int i5 = this.f2695b;
        while (true) {
            int i6 = this.f2696c;
            if (i5 >= i6 - (i4 - 1)) {
                i5 = i6;
                break;
            }
            if ((charset.equals(e2.d.f5436c) || charset.equals(e2.d.f5434a)) && y.K(this.f2694a[i5])) {
                break;
            }
            if (charset.equals(e2.d.f5439f) || charset.equals(e2.d.f5437d)) {
                byte[] bArr = this.f2694a;
                if (bArr[i5] == 0 && y.K(bArr[i5 + 1])) {
                    break;
                }
            }
            if (charset.equals(e2.d.f5438e)) {
                byte[] bArr2 = this.f2694a;
                if (bArr2[i5 + 1] == 0 && y.K(bArr2[i5])) {
                    break;
                }
            }
            i5 += i4;
        }
        String s = s(i5 - this.f2695b, charset);
        if (this.f2695b != this.f2696c && g(charset, f2691d) == '\r') {
            g(charset, f2692e);
        }
        return s;
    }

    public final int j() {
        byte[] bArr = this.f2694a;
        int i4 = this.f2695b;
        int i5 = i4 + 1;
        this.f2695b = i5;
        int i6 = bArr[i4] & 255;
        int i7 = i4 + 2;
        this.f2695b = i7;
        int i8 = ((bArr[i5] & 255) << 8) | i6;
        int i9 = i4 + 3;
        this.f2695b = i9;
        int i10 = i8 | ((bArr[i7] & 255) << 16);
        this.f2695b = i4 + 4;
        return ((bArr[i9] & 255) << 24) | i10;
    }

    public final long k() {
        byte[] bArr = this.f2694a;
        int i4 = this.f2695b;
        this.f2695b = i4 + 1;
        this.f2695b = i4 + 2;
        this.f2695b = i4 + 3;
        long j4 = (bArr[i4] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f2695b = i4 + 4;
        long j5 = j4 | ((bArr[r8] & 255) << 24);
        this.f2695b = i4 + 5;
        long j6 = j5 | ((bArr[r7] & 255) << 32);
        this.f2695b = i4 + 6;
        long j7 = j6 | ((bArr[r8] & 255) << 40);
        this.f2695b = i4 + 7;
        long j8 = j7 | ((bArr[r7] & 255) << 48);
        this.f2695b = i4 + 8;
        return ((bArr[r8] & 255) << 56) | j8;
    }

    public final long l() {
        byte[] bArr = this.f2694a;
        int i4 = this.f2695b;
        this.f2695b = i4 + 1;
        this.f2695b = i4 + 2;
        this.f2695b = i4 + 3;
        long j4 = (bArr[i4] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f2695b = i4 + 4;
        return ((bArr[r4] & 255) << 24) | j4;
    }

    public final int m() {
        int j4 = j();
        if (j4 >= 0) {
            return j4;
        }
        throw new IllegalStateException(AbstractC0007h.k("Top bit not zero: ", j4));
    }

    public final int n() {
        byte[] bArr = this.f2694a;
        int i4 = this.f2695b;
        int i5 = i4 + 1;
        this.f2695b = i5;
        int i6 = bArr[i4] & 255;
        this.f2695b = i4 + 2;
        return ((bArr[i5] & 255) << 8) | i6;
    }

    public final long o() {
        byte[] bArr = this.f2694a;
        int i4 = this.f2695b;
        this.f2695b = i4 + 1;
        this.f2695b = i4 + 2;
        this.f2695b = i4 + 3;
        long j4 = ((bArr[i4] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.f2695b = i4 + 4;
        long j5 = j4 | ((bArr[r4] & 255) << 32);
        this.f2695b = i4 + 5;
        long j6 = j5 | ((bArr[r7] & 255) << 24);
        this.f2695b = i4 + 6;
        long j7 = j6 | ((bArr[r4] & 255) << 16);
        this.f2695b = i4 + 7;
        long j8 = j7 | ((bArr[r7] & 255) << 8);
        this.f2695b = i4 + 8;
        return (bArr[r4] & 255) | j8;
    }

    public final String p() {
        if (a() == 0) {
            return null;
        }
        int i4 = this.f2695b;
        while (i4 < this.f2696c && this.f2694a[i4] != 0) {
            i4++;
        }
        byte[] bArr = this.f2694a;
        int i5 = this.f2695b;
        int i6 = y.f2709a;
        String str = new String(bArr, i5, i4 - i5, e2.d.f5436c);
        this.f2695b = i4;
        if (i4 < this.f2696c) {
            this.f2695b = i4 + 1;
        }
        return str;
    }

    public final String q(int i4) {
        if (i4 == 0) {
            return "";
        }
        int i5 = this.f2695b;
        int i6 = (i5 + i4) - 1;
        int i7 = (i6 >= this.f2696c || this.f2694a[i6] != 0) ? i4 : i4 - 1;
        byte[] bArr = this.f2694a;
        int i8 = y.f2709a;
        String str = new String(bArr, i5, i7, e2.d.f5436c);
        this.f2695b += i4;
        return str;
    }

    public final short r() {
        byte[] bArr = this.f2694a;
        int i4 = this.f2695b;
        int i5 = i4 + 1;
        this.f2695b = i5;
        int i6 = (bArr[i4] & 255) << 8;
        this.f2695b = i4 + 2;
        return (short) ((bArr[i5] & 255) | i6);
    }

    public final String s(int i4, Charset charset) {
        String str = new String(this.f2694a, this.f2695b, i4, charset);
        this.f2695b += i4;
        return str;
    }

    public final int t() {
        return (u() << 21) | (u() << 14) | (u() << 7) | u();
    }

    public final int u() {
        byte[] bArr = this.f2694a;
        int i4 = this.f2695b;
        this.f2695b = i4 + 1;
        return bArr[i4] & 255;
    }

    public final int v() {
        byte[] bArr = this.f2694a;
        int i4 = this.f2695b;
        int i5 = i4 + 1;
        this.f2695b = i5;
        int i6 = (bArr[i4] & 255) << 8;
        this.f2695b = i4 + 2;
        int i7 = (bArr[i5] & 255) | i6;
        this.f2695b = i4 + 4;
        return i7;
    }

    public final long w() {
        byte[] bArr = this.f2694a;
        int i4 = this.f2695b;
        this.f2695b = i4 + 1;
        this.f2695b = i4 + 2;
        this.f2695b = i4 + 3;
        long j4 = ((bArr[i4] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.f2695b = i4 + 4;
        return (bArr[r4] & 255) | j4;
    }

    public final int x() {
        byte[] bArr = this.f2694a;
        int i4 = this.f2695b;
        int i5 = i4 + 1;
        this.f2695b = i5;
        int i6 = (bArr[i4] & 255) << 16;
        int i7 = i4 + 2;
        this.f2695b = i7;
        int i8 = ((bArr[i5] & 255) << 8) | i6;
        this.f2695b = i4 + 3;
        return (bArr[i7] & 255) | i8;
    }

    public final int y() {
        int h4 = h();
        if (h4 >= 0) {
            return h4;
        }
        throw new IllegalStateException(AbstractC0007h.k("Top bit not zero: ", h4));
    }

    public final long z() {
        long o2 = o();
        if (o2 >= 0) {
            return o2;
        }
        throw new IllegalStateException("Top bit not zero: " + o2);
    }

    public r(int i4) {
        this.f2694a = new byte[i4];
        this.f2696c = i4;
    }

    public r(byte[] bArr) {
        this.f2694a = bArr;
        this.f2696c = bArr.length;
    }

    public r(byte[] bArr, int i4) {
        this.f2694a = bArr;
        this.f2696c = i4;
    }
}
