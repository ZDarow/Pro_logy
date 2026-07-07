package p010B3;

/* renamed from: B3.a */
/* loaded from: classes.dex */
public final class C0070a implements p010B3.InterfaceC0089t, java.nio.channels.ReadableByteChannel, java.io.Closeable, java.io.Flushable, java.nio.channels.WritableByteChannel, java.lang.Cloneable, java.nio.channels.ByteChannel {

    /* renamed from: l */
    public p010B3.C0086q f228l;

    /* renamed from: m */
    public long f229m;

    /* renamed from: a */
    public final byte m290a(long j4) {
        p080U1.AbstractC0748a.m1371d(this.f229m, j4, 1L);
        p010B3.C0086q c0086q = this.f228l;
        if (c0086q == null) {
            p154k3.AbstractC1803h.m3776b(null);
            throw null;
        }
        long j5 = this.f229m;
        if (j5 - j4 < j4) {
            while (j5 > j4) {
                c0086q = c0086q.f271g;
                p154k3.AbstractC1803h.m3776b(c0086q);
                j5 -= c0086q.f267c - c0086q.f266b;
            }
            return c0086q.f265a[(int) ((c0086q.f266b + j4) - j5)];
        }
        long j6 = 0;
        while (true) {
            int i4 = c0086q.f267c;
            int i5 = c0086q.f266b;
            long j7 = (i4 - i5) + j6;
            if (j7 > j4) {
                return c0086q.f265a[(int) ((i5 + j4) - j6)];
            }
            c0086q = c0086q.f270f;
            p154k3.AbstractC1803h.m3776b(c0086q);
            j6 = j7;
        }
    }

    /* renamed from: b */
    public final long m291b(p010B3.C0071b c0071b) {
        int i4;
        int i5;
        p154k3.AbstractC1803h.m3779e(c0071b, "targetBytes");
        p010B3.C0086q c0086q = this.f228l;
        if (c0086q == null) {
            return -1L;
        }
        long j4 = this.f229m;
        long j5 = 0;
        byte[] bArr = c0071b.f231l;
        if (j4 < 0) {
            while (j4 > 0) {
                c0086q = c0086q.f271g;
                p154k3.AbstractC1803h.m3776b(c0086q);
                j4 -= c0086q.f267c - c0086q.f266b;
            }
            if (bArr.length == 2) {
                byte b4 = bArr[0];
                byte b5 = bArr[1];
                while (j4 < this.f229m) {
                    i4 = (int) ((c0086q.f266b + j5) - j4);
                    int i6 = c0086q.f267c;
                    while (i4 < i6) {
                        byte b6 = c0086q.f265a[i4];
                        if (b6 != b4 && b6 != b5) {
                            i4++;
                        }
                        i5 = c0086q.f266b;
                    }
                    j5 = (c0086q.f267c - c0086q.f266b) + j4;
                    c0086q = c0086q.f270f;
                    p154k3.AbstractC1803h.m3776b(c0086q);
                    j4 = j5;
                }
                return -1L;
            }
            while (j4 < this.f229m) {
                i4 = (int) ((c0086q.f266b + j5) - j4);
                int i7 = c0086q.f267c;
                while (i4 < i7) {
                    byte b7 = c0086q.f265a[i4];
                    for (byte b8 : bArr) {
                        if (b7 == b8) {
                            i5 = c0086q.f266b;
                        }
                    }
                    i4++;
                }
                j5 = (c0086q.f267c - c0086q.f266b) + j4;
                c0086q = c0086q.f270f;
                p154k3.AbstractC1803h.m3776b(c0086q);
                j4 = j5;
            }
            return -1L;
        }
        j4 = 0;
        while (true) {
            long j6 = (c0086q.f267c - c0086q.f266b) + j4;
            if (j6 > 0) {
                break;
            }
            c0086q = c0086q.f270f;
            p154k3.AbstractC1803h.m3776b(c0086q);
            j4 = j6;
        }
        if (bArr.length == 2) {
            byte b9 = bArr[0];
            byte b10 = bArr[1];
            while (j4 < this.f229m) {
                i4 = (int) ((c0086q.f266b + j5) - j4);
                int i8 = c0086q.f267c;
                while (i4 < i8) {
                    byte b11 = c0086q.f265a[i4];
                    if (b11 != b9 && b11 != b10) {
                        i4++;
                    }
                    i5 = c0086q.f266b;
                }
                j5 = (c0086q.f267c - c0086q.f266b) + j4;
                c0086q = c0086q.f270f;
                p154k3.AbstractC1803h.m3776b(c0086q);
                j4 = j5;
            }
            return -1L;
        }
        while (j4 < this.f229m) {
            i4 = (int) ((c0086q.f266b + j5) - j4);
            int i9 = c0086q.f267c;
            while (i4 < i9) {
                byte b12 = c0086q.f265a[i4];
                for (byte b13 : bArr) {
                    if (b12 == b13) {
                        i5 = c0086q.f266b;
                    }
                }
                i4++;
            }
            j5 = (c0086q.f267c - c0086q.f266b) + j4;
            c0086q = c0086q.f270f;
            p154k3.AbstractC1803h.m3776b(c0086q);
            j4 = j5;
        }
        return -1L;
        return (i4 - i5) + j4;
    }

    /* renamed from: c */
    public final boolean m292c(p010B3.C0071b c0071b) {
        p154k3.AbstractC1803h.m3779e(c0071b, "bytes");
        byte[] bArr = c0071b.f231l;
        int length = bArr.length;
        if (length < 0 || this.f229m < length || bArr.length < length) {
            return false;
        }
        for (int i4 = 0; i4 < length; i4++) {
            if (m290a(i4) != bArr[i4]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, B3.a] */
    public final java.lang.Object clone() {
        ?? obj = new java.lang.Object();
        if (this.f229m != 0) {
            p010B3.C0086q c0086q = this.f228l;
            p154k3.AbstractC1803h.m3776b(c0086q);
            p010B3.C0086q m349c = c0086q.m349c();
            obj.f228l = m349c;
            m349c.f271g = m349c;
            m349c.f270f = m349c;
            for (p010B3.C0086q c0086q2 = c0086q.f270f; c0086q2 != c0086q; c0086q2 = c0086q2.f270f) {
                p010B3.C0086q c0086q3 = m349c.f271g;
                p154k3.AbstractC1803h.m3776b(c0086q3);
                p154k3.AbstractC1803h.m3776b(c0086q2);
                c0086q3.m348b(c0086q2.m349c());
            }
            obj.f229m = this.f229m;
        }
        return obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
    }

    @Override // p010B3.InterfaceC0089t
    /* renamed from: d */
    public final long mo293d(p010B3.C0070a c0070a, long j4) {
        p154k3.AbstractC1803h.m3779e(c0070a, "sink");
        if (j4 < 0) {
            throw new java.lang.IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        long j5 = this.f229m;
        if (j5 == 0) {
            return -1L;
        }
        if (j4 > j5) {
            j4 = j5;
        }
        c0070a.m301l(this, j4);
        return j4;
    }

    /* renamed from: e */
    public final byte m294e() {
        if (this.f229m == 0) {
            throw new java.io.EOFException();
        }
        p010B3.C0086q c0086q = this.f228l;
        p154k3.AbstractC1803h.m3776b(c0086q);
        int i4 = c0086q.f266b;
        int i5 = c0086q.f267c;
        int i6 = i4 + 1;
        byte b4 = c0086q.f265a[i4];
        this.f229m--;
        if (i6 == i5) {
            this.f228l = c0086q.m347a();
            p010B3.AbstractC0087r.m351a(c0086q);
        } else {
            c0086q.f266b = i6;
        }
        return b4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof p010B3.C0070a) {
                long j4 = this.f229m;
                p010B3.C0070a c0070a = (p010B3.C0070a) obj;
                if (j4 == c0070a.f229m) {
                    if (j4 != 0) {
                        p010B3.C0086q c0086q = this.f228l;
                        p154k3.AbstractC1803h.m3776b(c0086q);
                        p010B3.C0086q c0086q2 = c0070a.f228l;
                        p154k3.AbstractC1803h.m3776b(c0086q2);
                        int i4 = c0086q.f266b;
                        int i5 = c0086q2.f266b;
                        long j5 = 0;
                        while (j5 < this.f229m) {
                            long min = java.lang.Math.min(c0086q.f267c - i4, c0086q2.f267c - i5);
                            long j6 = 0;
                            while (j6 < min) {
                                int i6 = i4 + 1;
                                byte b4 = c0086q.f265a[i4];
                                int i7 = i5 + 1;
                                if (b4 == c0086q2.f265a[i5]) {
                                    j6++;
                                    i5 = i7;
                                    i4 = i6;
                                }
                            }
                            if (i4 == c0086q.f267c) {
                                p010B3.C0086q c0086q3 = c0086q.f270f;
                                p154k3.AbstractC1803h.m3776b(c0086q3);
                                i4 = c0086q3.f266b;
                                c0086q = c0086q3;
                            }
                            if (i5 == c0086q2.f267c) {
                                c0086q2 = c0086q2.f270f;
                                p154k3.AbstractC1803h.m3776b(c0086q2);
                                i5 = c0086q2.f266b;
                            }
                            j5 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final byte[] m295f(long j4) {
        if (j4 < 0 || j4 > 2147483647L) {
            throw new java.lang.IllegalArgumentException(("byteCount: " + j4).toString());
        }
        if (this.f229m < j4) {
            throw new java.io.EOFException();
        }
        int i4 = (int) j4;
        byte[] bArr = new byte[i4];
        int i5 = 0;
        while (i5 < i4) {
            int read = read(bArr, i5, i4 - i5);
            if (read == -1) {
                throw new java.io.EOFException();
            }
            i5 += read;
        }
        return bArr;
    }

    @Override // java.io.Flushable
    public final void flush() {
    }

    /* renamed from: g */
    public final p010B3.C0071b m296g(long j4) {
        if (j4 < 0 || j4 > 2147483647L) {
            throw new java.lang.IllegalArgumentException(("byteCount: " + j4).toString());
        }
        if (this.f229m < j4) {
            throw new java.io.EOFException();
        }
        if (j4 < 4096) {
            return new p010B3.C0071b(m295f(j4));
        }
        p010B3.C0071b m299j = m299j((int) j4);
        m298i(j4);
        return m299j;
    }

    /* renamed from: h */
    public final int m297h() {
        if (this.f229m < 4) {
            throw new java.io.EOFException();
        }
        p010B3.C0086q c0086q = this.f228l;
        p154k3.AbstractC1803h.m3776b(c0086q);
        int i4 = c0086q.f266b;
        int i5 = c0086q.f267c;
        if (i5 - i4 < 4) {
            return ((m294e() & 255) << 24) | ((m294e() & 255) << 16) | ((m294e() & 255) << 8) | (m294e() & 255);
        }
        byte[] bArr = c0086q.f265a;
        int i6 = i4 + 3;
        int i7 = ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4] & 255) << 24) | ((bArr[i4 + 2] & 255) << 8);
        int i8 = i4 + 4;
        int i9 = i7 | (bArr[i6] & 255);
        this.f229m -= 4;
        if (i8 == i5) {
            this.f228l = c0086q.m347a();
            p010B3.AbstractC0087r.m351a(c0086q);
        } else {
            c0086q.f266b = i8;
        }
        return i9;
    }

    public final int hashCode() {
        p010B3.C0086q c0086q = this.f228l;
        if (c0086q == null) {
            return 0;
        }
        int i4 = 1;
        do {
            int i5 = c0086q.f267c;
            for (int i6 = c0086q.f266b; i6 < i5; i6++) {
                i4 = (i4 * 31) + c0086q.f265a[i6];
            }
            c0086q = c0086q.f270f;
            p154k3.AbstractC1803h.m3776b(c0086q);
        } while (c0086q != this.f228l);
        return i4;
    }

    /* renamed from: i */
    public final void m298i(long j4) {
        while (j4 > 0) {
            p010B3.C0086q c0086q = this.f228l;
            if (c0086q == null) {
                throw new java.io.EOFException();
            }
            int min = (int) java.lang.Math.min(j4, c0086q.f267c - c0086q.f266b);
            long j5 = min;
            this.f229m -= j5;
            j4 -= j5;
            int i4 = c0086q.f266b + min;
            c0086q.f266b = i4;
            if (i4 == c0086q.f267c) {
                this.f228l = c0086q.m347a();
                p010B3.AbstractC0087r.m351a(c0086q);
            }
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    /* renamed from: j */
    public final p010B3.C0071b m299j(int i4) {
        if (i4 == 0) {
            return p010B3.C0071b.f230o;
        }
        p080U1.AbstractC0748a.m1371d(this.f229m, 0L, i4);
        p010B3.C0086q c0086q = this.f228l;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i4) {
            p154k3.AbstractC1803h.m3776b(c0086q);
            int i8 = c0086q.f267c;
            int i9 = c0086q.f266b;
            if (i8 == i9) {
                throw new java.lang.AssertionError("s.limit == s.pos");
            }
            i6 += i8 - i9;
            i7++;
            c0086q = c0086q.f270f;
        }
        byte[][] bArr = new byte[i7];
        int[] iArr = new int[i7 * 2];
        p010B3.C0086q c0086q2 = this.f228l;
        int i10 = 0;
        while (i5 < i4) {
            p154k3.AbstractC1803h.m3776b(c0086q2);
            bArr[i10] = c0086q2.f265a;
            i5 += c0086q2.f267c - c0086q2.f266b;
            iArr[i10] = java.lang.Math.min(i5, i4);
            iArr[i10 + i7] = c0086q2.f266b;
            c0086q2.f268d = true;
            i10++;
            c0086q2 = c0086q2.f270f;
        }
        return new p010B3.C0088s(bArr, iArr);
    }

    /* renamed from: k */
    public final p010B3.C0086q m300k(int i4) {
        if (i4 < 1 || i4 > 8192) {
            throw new java.lang.IllegalArgumentException("unexpected capacity");
        }
        p010B3.C0086q c0086q = this.f228l;
        if (c0086q == null) {
            p010B3.C0086q m352b = p010B3.AbstractC0087r.m352b();
            this.f228l = m352b;
            m352b.f271g = m352b;
            m352b.f270f = m352b;
            return m352b;
        }
        p010B3.C0086q c0086q2 = c0086q.f271g;
        p154k3.AbstractC1803h.m3776b(c0086q2);
        if (c0086q2.f267c + i4 <= 8192 && c0086q2.f269e) {
            return c0086q2;
        }
        p010B3.C0086q m352b2 = p010B3.AbstractC0087r.m352b();
        c0086q2.m348b(m352b2);
        return m352b2;
    }

    /* renamed from: l */
    public final void m301l(p010B3.C0070a c0070a, long j4) {
        p010B3.C0086q m352b;
        p154k3.AbstractC1803h.m3779e(c0070a, "source");
        if (c0070a == this) {
            throw new java.lang.IllegalArgumentException("source == this");
        }
        p080U1.AbstractC0748a.m1371d(c0070a.f229m, 0L, j4);
        while (j4 > 0) {
            p010B3.C0086q c0086q = c0070a.f228l;
            p154k3.AbstractC1803h.m3776b(c0086q);
            int i4 = c0086q.f267c;
            p010B3.C0086q c0086q2 = c0070a.f228l;
            p154k3.AbstractC1803h.m3776b(c0086q2);
            long j5 = i4 - c0086q2.f266b;
            int i5 = 0;
            if (j4 < j5) {
                p010B3.C0086q c0086q3 = this.f228l;
                p010B3.C0086q c0086q4 = c0086q3 != null ? c0086q3.f271g : null;
                if (c0086q4 != null && c0086q4.f269e) {
                    if ((c0086q4.f267c + j4) - (c0086q4.f268d ? 0 : c0086q4.f266b) <= 8192) {
                        p010B3.C0086q c0086q5 = c0070a.f228l;
                        p154k3.AbstractC1803h.m3776b(c0086q5);
                        c0086q5.m350d(c0086q4, (int) j4);
                        c0070a.f229m -= j4;
                        this.f229m += j4;
                        return;
                    }
                }
                p010B3.C0086q c0086q6 = c0070a.f228l;
                p154k3.AbstractC1803h.m3776b(c0086q6);
                int i6 = (int) j4;
                if (i6 <= 0 || i6 > c0086q6.f267c - c0086q6.f266b) {
                    throw new java.lang.IllegalArgumentException("byteCount out of range");
                }
                if (i6 >= 1024) {
                    m352b = c0086q6.m349c();
                } else {
                    m352b = p010B3.AbstractC0087r.m352b();
                    int i7 = c0086q6.f266b;
                    p105a3.AbstractC1020c.m2045g0(0, i7, i7 + i6, c0086q6.f265a, m352b.f265a);
                }
                m352b.f267c = m352b.f266b + i6;
                c0086q6.f266b += i6;
                p010B3.C0086q c0086q7 = c0086q6.f271g;
                p154k3.AbstractC1803h.m3776b(c0086q7);
                c0086q7.m348b(m352b);
                c0070a.f228l = m352b;
            }
            p010B3.C0086q c0086q8 = c0070a.f228l;
            p154k3.AbstractC1803h.m3776b(c0086q8);
            long j6 = c0086q8.f267c - c0086q8.f266b;
            c0070a.f228l = c0086q8.m347a();
            p010B3.C0086q c0086q9 = this.f228l;
            if (c0086q9 == null) {
                this.f228l = c0086q8;
                c0086q8.f271g = c0086q8;
                c0086q8.f270f = c0086q8;
            } else {
                p010B3.C0086q c0086q10 = c0086q9.f271g;
                p154k3.AbstractC1803h.m3776b(c0086q10);
                c0086q10.m348b(c0086q8);
                p010B3.C0086q c0086q11 = c0086q8.f271g;
                if (c0086q11 == c0086q8) {
                    throw new java.lang.IllegalStateException("cannot compact");
                }
                p154k3.AbstractC1803h.m3776b(c0086q11);
                if (c0086q11.f269e) {
                    int i8 = c0086q8.f267c - c0086q8.f266b;
                    p010B3.C0086q c0086q12 = c0086q8.f271g;
                    p154k3.AbstractC1803h.m3776b(c0086q12);
                    int i9 = 8192 - c0086q12.f267c;
                    p010B3.C0086q c0086q13 = c0086q8.f271g;
                    p154k3.AbstractC1803h.m3776b(c0086q13);
                    if (!c0086q13.f268d) {
                        p010B3.C0086q c0086q14 = c0086q8.f271g;
                        p154k3.AbstractC1803h.m3776b(c0086q14);
                        i5 = c0086q14.f266b;
                    }
                    if (i8 <= i9 + i5) {
                        p010B3.C0086q c0086q15 = c0086q8.f271g;
                        p154k3.AbstractC1803h.m3776b(c0086q15);
                        c0086q8.m350d(c0086q15, i8);
                        c0086q8.m347a();
                        p010B3.AbstractC0087r.m351a(c0086q8);
                    }
                }
            }
            c0070a.f229m -= j6;
            this.f229m += j6;
            j4 -= j6;
        }
    }

    /* renamed from: m */
    public final void m302m(p010B3.C0071b c0071b) {
        p154k3.AbstractC1803h.m3779e(c0071b, "byteString");
        c0071b.mo320o(this, c0071b.mo310b());
    }

    /* renamed from: n */
    public final void m303n(byte[] bArr, int i4, int i5) {
        p154k3.AbstractC1803h.m3779e(bArr, "source");
        long j4 = i5;
        p080U1.AbstractC0748a.m1371d(bArr.length, i4, j4);
        int i6 = i5 + i4;
        while (i4 < i6) {
            p010B3.C0086q m300k = m300k(1);
            int min = java.lang.Math.min(i6 - i4, 8192 - m300k.f267c);
            int i7 = i4 + min;
            p105a3.AbstractC1020c.m2045g0(m300k.f267c, i4, i7, bArr, m300k.f265a);
            m300k.f267c += min;
            i4 = i7;
        }
        this.f229m += j4;
    }

    /* renamed from: o */
    public final void m304o(int i4) {
        p010B3.C0086q m300k = m300k(1);
        int i5 = m300k.f267c;
        m300k.f267c = i5 + 1;
        m300k.f265a[i5] = (byte) i4;
        this.f229m++;
    }

    /* renamed from: p */
    public final void m305p(java.lang.String str) {
        char charAt;
        p154k3.AbstractC1803h.m3779e(str, "string");
        int length = str.length();
        if (length < 0) {
            throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m151j(length, "endIndex < beginIndex: ", " < 0").toString());
        }
        if (length > str.length()) {
            throw new java.lang.IllegalArgumentException(("endIndex > string.length: " + length + " > " + str.length()).toString());
        }
        int i4 = 0;
        while (i4 < length) {
            char charAt2 = str.charAt(i4);
            if (charAt2 < 128) {
                p010B3.C0086q m300k = m300k(1);
                int i5 = m300k.f267c - i4;
                int min = java.lang.Math.min(length, 8192 - i5);
                int i6 = i4 + 1;
                byte[] bArr = m300k.f265a;
                bArr[i4 + i5] = (byte) charAt2;
                while (true) {
                    i4 = i6;
                    if (i4 >= min || (charAt = str.charAt(i4)) >= 128) {
                        break;
                    }
                    i6 = i4 + 1;
                    bArr[i4 + i5] = (byte) charAt;
                }
                int i7 = m300k.f267c;
                int i8 = (i5 + i4) - i7;
                m300k.f267c = i7 + i8;
                this.f229m += i8;
            } else {
                if (charAt2 < 2048) {
                    p010B3.C0086q m300k2 = m300k(2);
                    int i9 = m300k2.f267c;
                    byte[] bArr2 = m300k2.f265a;
                    bArr2[i9] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i9 + 1] = (byte) ((charAt2 & '?') | 128);
                    m300k2.f267c = i9 + 2;
                    this.f229m += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    p010B3.C0086q m300k3 = m300k(3);
                    int i10 = m300k3.f267c;
                    byte[] bArr3 = m300k3.f265a;
                    bArr3[i10] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i10 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i10 + 2] = (byte) ((charAt2 & '?') | 128);
                    m300k3.f267c = i10 + 3;
                    this.f229m += 3;
                } else {
                    int i11 = i4 + 1;
                    char charAt3 = i11 < length ? str.charAt(i11) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        m304o(63);
                        i4 = i11;
                    } else {
                        int i12 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        p010B3.C0086q m300k4 = m300k(4);
                        int i13 = m300k4.f267c;
                        byte[] bArr4 = m300k4.f265a;
                        bArr4[i13] = (byte) ((i12 >> 18) | 240);
                        bArr4[i13 + 1] = (byte) (((i12 >> 12) & 63) | 128);
                        bArr4[i13 + 2] = (byte) (((i12 >> 6) & 63) | 128);
                        bArr4[i13 + 3] = (byte) ((i12 & 63) | 128);
                        m300k4.f267c = i13 + 4;
                        this.f229m += 4;
                        i4 += 2;
                    }
                }
                i4++;
            }
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(java.nio.ByteBuffer byteBuffer) {
        p154k3.AbstractC1803h.m3779e(byteBuffer, "sink");
        p010B3.C0086q c0086q = this.f228l;
        if (c0086q == null) {
            return -1;
        }
        int min = java.lang.Math.min(byteBuffer.remaining(), c0086q.f267c - c0086q.f266b);
        byteBuffer.put(c0086q.f265a, c0086q.f266b, min);
        int i4 = c0086q.f266b + min;
        c0086q.f266b = i4;
        this.f229m -= min;
        if (i4 == c0086q.f267c) {
            this.f228l = c0086q.m347a();
            p010B3.AbstractC0087r.m351a(c0086q);
        }
        return min;
    }

    public final java.lang.String toString() {
        long j4 = this.f229m;
        if (j4 <= 2147483647L) {
            return m299j((int) j4).toString();
        }
        throw new java.lang.IllegalStateException(("size > Int.MAX_VALUE: " + this.f229m).toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(java.nio.ByteBuffer byteBuffer) {
        p154k3.AbstractC1803h.m3779e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i4 = remaining;
        while (i4 > 0) {
            p010B3.C0086q m300k = m300k(1);
            int min = java.lang.Math.min(i4, 8192 - m300k.f267c);
            byteBuffer.get(m300k.f265a, m300k.f267c, min);
            i4 -= min;
            m300k.f267c += min;
        }
        this.f229m += remaining;
        return remaining;
    }

    public final int read(byte[] bArr, int i4, int i5) {
        p154k3.AbstractC1803h.m3779e(bArr, "sink");
        p080U1.AbstractC0748a.m1371d(bArr.length, i4, i5);
        p010B3.C0086q c0086q = this.f228l;
        if (c0086q == null) {
            return -1;
        }
        int min = java.lang.Math.min(i5, c0086q.f267c - c0086q.f266b);
        int i6 = c0086q.f266b;
        p105a3.AbstractC1020c.m2045g0(i4, i6, i6 + min, c0086q.f265a, bArr);
        int i7 = c0086q.f266b + min;
        c0086q.f266b = i7;
        this.f229m -= min;
        if (i7 == c0086q.f267c) {
            this.f228l = c0086q.m347a();
            p010B3.AbstractC0087r.m351a(c0086q);
        }
        return min;
    }
}
