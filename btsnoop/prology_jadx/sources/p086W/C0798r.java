package p086W;

/* renamed from: W.r */
/* loaded from: classes.dex */
public final class C0798r {

    /* renamed from: d */
    public static final char[] f2783d = {'\r', '\n'};

    /* renamed from: e */
    public static final char[] f2784e = {'\n'};

    /* renamed from: f */
    public static final p129f2.AbstractC1397M f2785f = p129f2.AbstractC1397M.m3177i(5, p124e2.AbstractC1356d.f5628a, p124e2.AbstractC1356d.f5630c, p124e2.AbstractC1356d.f5633f, p124e2.AbstractC1356d.f5631d, p124e2.AbstractC1356d.f5632e);

    /* renamed from: a */
    public byte[] f2786a;

    /* renamed from: b */
    public int f2787b;

    /* renamed from: c */
    public int f2788c;

    public C0798r() {
        this.f2786a = p086W.AbstractC0805y.f2806f;
    }

    /* renamed from: A */
    public final int m1531A() {
        byte[] bArr = this.f2786a;
        int i4 = this.f2787b;
        int i5 = i4 + 1;
        this.f2787b = i5;
        int i6 = (bArr[i4] & 255) << 8;
        this.f2787b = i4 + 2;
        return (bArr[i5] & 255) | i6;
    }

    /* renamed from: B */
    public final long m1532B() {
        int i4;
        int i5;
        long j4 = this.f2786a[this.f2787b];
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
            throw new java.lang.NumberFormatException("Invalid UTF-8 sequence first byte: " + j4);
        }
        for (i4 = 1; i4 < i5; i4++) {
            if ((this.f2786a[this.f2787b + i4] & 192) != 128) {
                throw new java.lang.NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j4);
            }
            j4 = (j4 << 6) | (r3 & 63);
        }
        this.f2787b += i5;
        return j4;
    }

    /* renamed from: C */
    public final java.nio.charset.Charset m1533C() {
        if (m1539a() >= 3) {
            byte[] bArr = this.f2786a;
            int i4 = this.f2787b;
            if (bArr[i4] == -17 && bArr[i4 + 1] == -69 && bArr[i4 + 2] == -65) {
                this.f2787b = i4 + 3;
                return p124e2.AbstractC1356d.f5630c;
            }
        }
        if (m1539a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f2786a;
        int i5 = this.f2787b;
        byte b4 = bArr2[i5];
        if (b4 == -2 && bArr2[i5 + 1] == -1) {
            this.f2787b = i5 + 2;
            return p124e2.AbstractC1356d.f5631d;
        }
        if (b4 != -1 || bArr2[i5 + 1] != -2) {
            return null;
        }
        this.f2787b = i5 + 2;
        return p124e2.AbstractC1356d.f5632e;
    }

    /* renamed from: D */
    public final void m1534D(int i4) {
        byte[] bArr = this.f2786a;
        if (bArr.length < i4) {
            bArr = new byte[i4];
        }
        m1535E(bArr, i4);
    }

    /* renamed from: E */
    public final void m1535E(byte[] bArr, int i4) {
        this.f2786a = bArr;
        this.f2788c = i4;
        this.f2787b = 0;
    }

    /* renamed from: F */
    public final void m1536F(int i4) {
        p086W.AbstractC0781a.m1416e(i4 >= 0 && i4 <= this.f2786a.length);
        this.f2788c = i4;
    }

    /* renamed from: G */
    public final void m1537G(int i4) {
        p086W.AbstractC0781a.m1416e(i4 >= 0 && i4 <= this.f2788c);
        this.f2787b = i4;
    }

    /* renamed from: H */
    public final void m1538H(int i4) {
        m1537G(this.f2787b + i4);
    }

    /* renamed from: a */
    public final int m1539a() {
        return this.f2788c - this.f2787b;
    }

    /* renamed from: b */
    public final void m1540b(int i4) {
        byte[] bArr = this.f2786a;
        if (i4 > bArr.length) {
            this.f2786a = java.util.Arrays.copyOf(bArr, i4);
        }
    }

    /* renamed from: c */
    public final char m1541c(java.nio.charset.Charset charset) {
        p086W.AbstractC0781a.m1415d("Unsupported charset: " + charset, f2785f.contains(charset));
        return (char) (m1542d(charset) >> 16);
    }

    /* renamed from: d */
    public final int m1542d(java.nio.charset.Charset charset) {
        byte b4;
        int i4;
        byte b5;
        byte b6;
        if ((charset.equals(p124e2.AbstractC1356d.f5630c) || charset.equals(p124e2.AbstractC1356d.f5628a)) && m1539a() >= 1) {
            long j4 = this.f2786a[this.f2787b] & 255;
            char c4 = (char) j4;
            p176p1.AbstractC1949a.m3934k(((long) c4) == j4, "Out of range: %s", j4);
            b4 = (byte) c4;
            i4 = 1;
        } else {
            i4 = 2;
            if ((charset.equals(p124e2.AbstractC1356d.f5633f) || charset.equals(p124e2.AbstractC1356d.f5631d)) && m1539a() >= 2) {
                byte[] bArr = this.f2786a;
                int i5 = this.f2787b;
                b5 = bArr[i5];
                b6 = bArr[i5 + 1];
            } else {
                if (!charset.equals(p124e2.AbstractC1356d.f5632e) || m1539a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f2786a;
                int i6 = this.f2787b;
                b5 = bArr2[i6 + 1];
                b6 = bArr2[i6];
            }
            b4 = (byte) ((char) ((b6 & 255) | (b5 << 8)));
        }
        long j5 = b4;
        char c5 = (char) j5;
        p176p1.AbstractC1949a.m3934k(((long) c5) == j5, "Out of range: %s", j5);
        return (c5 << 16) + i4;
    }

    /* renamed from: e */
    public final int m1543e() {
        return this.f2786a[this.f2787b] & 255;
    }

    /* renamed from: f */
    public final void m1544f(byte[] bArr, int i4, int i5) {
        java.lang.System.arraycopy(this.f2786a, this.f2787b, bArr, i4, i5);
        this.f2787b += i5;
    }

    /* renamed from: g */
    public final char m1545g(java.nio.charset.Charset charset, char[] cArr) {
        int m1542d = m1542d(charset);
        if (m1542d != 0) {
            char c4 = (char) (m1542d >> 16);
            for (char c5 : cArr) {
                if (c5 == c4) {
                    this.f2787b += m1542d & 65535;
                    return c4;
                }
            }
        }
        return (char) 0;
    }

    /* renamed from: h */
    public final int m1546h() {
        byte[] bArr = this.f2786a;
        int i4 = this.f2787b;
        int i5 = i4 + 1;
        this.f2787b = i5;
        int i6 = (bArr[i4] & 255) << 24;
        int i7 = i4 + 2;
        this.f2787b = i7;
        int i8 = ((bArr[i5] & 255) << 16) | i6;
        int i9 = i4 + 3;
        this.f2787b = i9;
        int i10 = i8 | ((bArr[i7] & 255) << 8);
        this.f2787b = i4 + 4;
        return (bArr[i9] & 255) | i10;
    }

    /* renamed from: i */
    public final java.lang.String m1547i(java.nio.charset.Charset charset) {
        int i4;
        p086W.AbstractC0781a.m1415d("Unsupported charset: " + charset, f2785f.contains(charset));
        if (m1539a() == 0) {
            return null;
        }
        java.nio.charset.Charset charset2 = p124e2.AbstractC1356d.f5628a;
        if (!charset.equals(charset2)) {
            m1533C();
        }
        if (charset.equals(p124e2.AbstractC1356d.f5630c) || charset.equals(charset2)) {
            i4 = 1;
        } else {
            if (!charset.equals(p124e2.AbstractC1356d.f5633f) && !charset.equals(p124e2.AbstractC1356d.f5632e) && !charset.equals(p124e2.AbstractC1356d.f5631d)) {
                throw new java.lang.IllegalArgumentException("Unsupported charset: " + charset);
            }
            i4 = 2;
        }
        int i5 = this.f2787b;
        while (true) {
            int i6 = this.f2788c;
            if (i5 >= i6 - (i4 - 1)) {
                i5 = i6;
                break;
            }
            if ((charset.equals(p124e2.AbstractC1356d.f5630c) || charset.equals(p124e2.AbstractC1356d.f5628a)) && p086W.AbstractC0805y.m1590K(this.f2786a[i5])) {
                break;
            }
            if (charset.equals(p124e2.AbstractC1356d.f5633f) || charset.equals(p124e2.AbstractC1356d.f5631d)) {
                byte[] bArr = this.f2786a;
                if (bArr[i5] == 0 && p086W.AbstractC0805y.m1590K(bArr[i5 + 1])) {
                    break;
                }
            }
            if (charset.equals(p124e2.AbstractC1356d.f5632e)) {
                byte[] bArr2 = this.f2786a;
                if (bArr2[i5 + 1] == 0 && p086W.AbstractC0805y.m1590K(bArr2[i5])) {
                    break;
                }
            }
            i5 += i4;
        }
        java.lang.String m1557s = m1557s(i5 - this.f2787b, charset);
        if (this.f2787b != this.f2788c && m1545g(charset, f2783d) == '\r') {
            m1545g(charset, f2784e);
        }
        return m1557s;
    }

    /* renamed from: j */
    public final int m1548j() {
        byte[] bArr = this.f2786a;
        int i4 = this.f2787b;
        int i5 = i4 + 1;
        this.f2787b = i5;
        int i6 = bArr[i4] & 255;
        int i7 = i4 + 2;
        this.f2787b = i7;
        int i8 = ((bArr[i5] & 255) << 8) | i6;
        int i9 = i4 + 3;
        this.f2787b = i9;
        int i10 = i8 | ((bArr[i7] & 255) << 16);
        this.f2787b = i4 + 4;
        return ((bArr[i9] & 255) << 24) | i10;
    }

    /* renamed from: k */
    public final long m1549k() {
        byte[] bArr = this.f2786a;
        int i4 = this.f2787b;
        this.f2787b = i4 + 1;
        this.f2787b = i4 + 2;
        this.f2787b = i4 + 3;
        long j4 = (bArr[i4] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f2787b = i4 + 4;
        long j5 = j4 | ((bArr[r8] & 255) << 24);
        this.f2787b = i4 + 5;
        long j6 = j5 | ((bArr[r7] & 255) << 32);
        this.f2787b = i4 + 6;
        long j7 = j6 | ((bArr[r8] & 255) << 40);
        this.f2787b = i4 + 7;
        long j8 = j7 | ((bArr[r7] & 255) << 48);
        this.f2787b = i4 + 8;
        return ((bArr[r8] & 255) << 56) | j8;
    }

    /* renamed from: l */
    public final long m1550l() {
        byte[] bArr = this.f2786a;
        int i4 = this.f2787b;
        this.f2787b = i4 + 1;
        this.f2787b = i4 + 2;
        this.f2787b = i4 + 3;
        long j4 = (bArr[i4] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f2787b = i4 + 4;
        return ((bArr[r4] & 255) << 24) | j4;
    }

    /* renamed from: m */
    public final int m1551m() {
        int m1548j = m1548j();
        if (m1548j >= 0) {
            return m1548j;
        }
        throw new java.lang.IllegalStateException(p009B2.AbstractC0051h.m152k("Top bit not zero: ", m1548j));
    }

    /* renamed from: n */
    public final int m1552n() {
        byte[] bArr = this.f2786a;
        int i4 = this.f2787b;
        int i5 = i4 + 1;
        this.f2787b = i5;
        int i6 = bArr[i4] & 255;
        this.f2787b = i4 + 2;
        return ((bArr[i5] & 255) << 8) | i6;
    }

    /* renamed from: o */
    public final long m1553o() {
        byte[] bArr = this.f2786a;
        int i4 = this.f2787b;
        this.f2787b = i4 + 1;
        this.f2787b = i4 + 2;
        this.f2787b = i4 + 3;
        long j4 = ((bArr[i4] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.f2787b = i4 + 4;
        long j5 = j4 | ((bArr[r4] & 255) << 32);
        this.f2787b = i4 + 5;
        long j6 = j5 | ((bArr[r7] & 255) << 24);
        this.f2787b = i4 + 6;
        long j7 = j6 | ((bArr[r4] & 255) << 16);
        this.f2787b = i4 + 7;
        long j8 = j7 | ((bArr[r7] & 255) << 8);
        this.f2787b = i4 + 8;
        return (bArr[r4] & 255) | j8;
    }

    /* renamed from: p */
    public final java.lang.String m1554p() {
        if (m1539a() == 0) {
            return null;
        }
        int i4 = this.f2787b;
        while (i4 < this.f2788c && this.f2786a[i4] != 0) {
            i4++;
        }
        byte[] bArr = this.f2786a;
        int i5 = this.f2787b;
        int i6 = p086W.AbstractC0805y.f2801a;
        java.lang.String str = new java.lang.String(bArr, i5, i4 - i5, p124e2.AbstractC1356d.f5630c);
        this.f2787b = i4;
        if (i4 < this.f2788c) {
            this.f2787b = i4 + 1;
        }
        return str;
    }

    /* renamed from: q */
    public final java.lang.String m1555q(int i4) {
        if (i4 == 0) {
            return "";
        }
        int i5 = this.f2787b;
        int i6 = (i5 + i4) - 1;
        int i7 = (i6 >= this.f2788c || this.f2786a[i6] != 0) ? i4 : i4 - 1;
        byte[] bArr = this.f2786a;
        int i8 = p086W.AbstractC0805y.f2801a;
        java.lang.String str = new java.lang.String(bArr, i5, i7, p124e2.AbstractC1356d.f5630c);
        this.f2787b += i4;
        return str;
    }

    /* renamed from: r */
    public final short m1556r() {
        byte[] bArr = this.f2786a;
        int i4 = this.f2787b;
        int i5 = i4 + 1;
        this.f2787b = i5;
        int i6 = (bArr[i4] & 255) << 8;
        this.f2787b = i4 + 2;
        return (short) ((bArr[i5] & 255) | i6);
    }

    /* renamed from: s */
    public final java.lang.String m1557s(int i4, java.nio.charset.Charset charset) {
        java.lang.String str = new java.lang.String(this.f2786a, this.f2787b, i4, charset);
        this.f2787b += i4;
        return str;
    }

    /* renamed from: t */
    public final int m1558t() {
        return (m1559u() << 21) | (m1559u() << 14) | (m1559u() << 7) | m1559u();
    }

    /* renamed from: u */
    public final int m1559u() {
        byte[] bArr = this.f2786a;
        int i4 = this.f2787b;
        this.f2787b = i4 + 1;
        return bArr[i4] & 255;
    }

    /* renamed from: v */
    public final int m1560v() {
        byte[] bArr = this.f2786a;
        int i4 = this.f2787b;
        int i5 = i4 + 1;
        this.f2787b = i5;
        int i6 = (bArr[i4] & 255) << 8;
        this.f2787b = i4 + 2;
        int i7 = (bArr[i5] & 255) | i6;
        this.f2787b = i4 + 4;
        return i7;
    }

    /* renamed from: w */
    public final long m1561w() {
        byte[] bArr = this.f2786a;
        int i4 = this.f2787b;
        this.f2787b = i4 + 1;
        this.f2787b = i4 + 2;
        this.f2787b = i4 + 3;
        long j4 = ((bArr[i4] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.f2787b = i4 + 4;
        return (bArr[r4] & 255) | j4;
    }

    /* renamed from: x */
    public final int m1562x() {
        byte[] bArr = this.f2786a;
        int i4 = this.f2787b;
        int i5 = i4 + 1;
        this.f2787b = i5;
        int i6 = (bArr[i4] & 255) << 16;
        int i7 = i4 + 2;
        this.f2787b = i7;
        int i8 = ((bArr[i5] & 255) << 8) | i6;
        this.f2787b = i4 + 3;
        return (bArr[i7] & 255) | i8;
    }

    /* renamed from: y */
    public final int m1563y() {
        int m1546h = m1546h();
        if (m1546h >= 0) {
            return m1546h;
        }
        throw new java.lang.IllegalStateException(p009B2.AbstractC0051h.m152k("Top bit not zero: ", m1546h));
    }

    /* renamed from: z */
    public final long m1564z() {
        long m1553o = m1553o();
        if (m1553o >= 0) {
            return m1553o;
        }
        throw new java.lang.IllegalStateException("Top bit not zero: " + m1553o);
    }

    public C0798r(int i4) {
        this.f2786a = new byte[i4];
        this.f2788c = i4;
    }

    public C0798r(byte[] bArr) {
        this.f2786a = bArr;
        this.f2788c = bArr.length;
    }

    public C0798r(byte[] bArr, int i4) {
        this.f2786a = bArr;
        this.f2788c = i4;
    }
}
