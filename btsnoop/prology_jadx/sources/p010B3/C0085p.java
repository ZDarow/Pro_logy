package p010B3;

/* renamed from: B3.p */
/* loaded from: classes.dex */
public final class C0085p implements p010B3.InterfaceC0089t, java.nio.channels.ReadableByteChannel {

    /* renamed from: l */
    public final p010B3.InterfaceC0089t f262l;

    /* renamed from: m */
    public final p010B3.C0070a f263m;

    /* renamed from: n */
    public boolean f264n;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, B3.a] */
    public C0085p(p010B3.InterfaceC0089t interfaceC0089t) {
        p154k3.AbstractC1803h.m3779e(interfaceC0089t, "source");
        this.f262l = interfaceC0089t;
        this.f263m = new java.lang.Object();
    }

    /* renamed from: a */
    public final int m341a() {
        m345f(4L);
        int m297h = this.f263m.m297h();
        return ((m297h & 255) << 24) | (((-16777216) & m297h) >>> 24) | ((16711680 & m297h) >>> 8) | ((65280 & m297h) << 8);
    }

    /* renamed from: b */
    public final long m342b() {
        long j4;
        m345f(8L);
        p010B3.C0070a c0070a = this.f263m;
        if (c0070a.f229m < 8) {
            throw new java.io.EOFException();
        }
        p010B3.C0086q c0086q = c0070a.f228l;
        p154k3.AbstractC1803h.m3776b(c0086q);
        int i4 = c0086q.f266b;
        int i5 = c0086q.f267c;
        if (i5 - i4 < 8) {
            j4 = ((c0070a.m297h() & 4294967295L) << 32) | (4294967295L & c0070a.m297h());
        } else {
            byte[] bArr = c0086q.f265a;
            int i6 = i4 + 7;
            long j5 = ((bArr[i4] & 255) << 56) | ((bArr[i4 + 1] & 255) << 48) | ((bArr[i4 + 2] & 255) << 40) | ((bArr[i4 + 3] & 255) << 32) | ((bArr[i4 + 4] & 255) << 24) | ((bArr[i4 + 5] & 255) << 16) | ((bArr[i4 + 6] & 255) << 8);
            int i7 = i4 + 8;
            long j6 = j5 | (bArr[i6] & 255);
            c0070a.f229m -= 8;
            if (i7 == i5) {
                c0070a.f228l = c0086q.m347a();
                p010B3.AbstractC0087r.m351a(c0086q);
            } else {
                c0086q.f266b = i7;
            }
            j4 = j6;
        }
        return ((j4 & 255) << 56) | (((-72057594037927936L) & j4) >>> 56) | ((71776119061217280L & j4) >>> 40) | ((280375465082880L & j4) >>> 24) | ((1095216660480L & j4) >>> 8) | ((4278190080L & j4) << 8) | ((16711680 & j4) << 24) | ((65280 & j4) << 40);
    }

    /* renamed from: c */
    public final short m343c() {
        short s;
        m345f(2L);
        p010B3.C0070a c0070a = this.f263m;
        if (c0070a.f229m < 2) {
            throw new java.io.EOFException();
        }
        p010B3.C0086q c0086q = c0070a.f228l;
        p154k3.AbstractC1803h.m3776b(c0086q);
        int i4 = c0086q.f266b;
        int i5 = c0086q.f267c;
        if (i5 - i4 < 2) {
            s = (short) ((c0070a.m294e() & 255) | ((c0070a.m294e() & 255) << 8));
        } else {
            int i6 = i4 + 1;
            byte[] bArr = c0086q.f265a;
            int i7 = (bArr[i4] & 255) << 8;
            int i8 = i4 + 2;
            int i9 = (bArr[i6] & 255) | i7;
            c0070a.f229m -= 2;
            if (i8 == i5) {
                c0070a.f228l = c0086q.m347a();
                p010B3.AbstractC0087r.m351a(c0086q);
            } else {
                c0086q.f266b = i8;
            }
            s = (short) i9;
        }
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f264n) {
            return;
        }
        this.f264n = true;
        this.f262l.close();
        p010B3.C0070a c0070a = this.f263m;
        c0070a.m298i(c0070a.f229m);
    }

    @Override // p010B3.InterfaceC0089t
    /* renamed from: d */
    public final long mo293d(p010B3.C0070a c0070a, long j4) {
        p154k3.AbstractC1803h.m3779e(c0070a, "sink");
        if (j4 < 0) {
            throw new java.lang.IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        if (this.f264n) {
            throw new java.lang.IllegalStateException("closed");
        }
        p010B3.C0070a c0070a2 = this.f263m;
        if (c0070a2.f229m == 0 && this.f262l.mo293d(c0070a2, 8192L) == -1) {
            return -1L;
        }
        return c0070a2.mo293d(c0070a, java.lang.Math.min(j4, c0070a2.f229m));
    }

    /* renamed from: e */
    public final java.lang.String m344e(long j4) {
        m345f(j4);
        p010B3.C0070a c0070a = this.f263m;
        c0070a.getClass();
        java.nio.charset.Charset charset = p182q3.AbstractC2024a.f8253a;
        p154k3.AbstractC1803h.m3779e(charset, "charset");
        if (j4 < 0 || j4 > 2147483647L) {
            throw new java.lang.IllegalArgumentException(("byteCount: " + j4).toString());
        }
        if (c0070a.f229m < j4) {
            throw new java.io.EOFException();
        }
        if (j4 == 0) {
            return "";
        }
        p010B3.C0086q c0086q = c0070a.f228l;
        p154k3.AbstractC1803h.m3776b(c0086q);
        int i4 = c0086q.f266b;
        if (i4 + j4 > c0086q.f267c) {
            return new java.lang.String(c0070a.m295f(j4), charset);
        }
        int i5 = (int) j4;
        java.lang.String str = new java.lang.String(c0086q.f265a, i4, i5, charset);
        int i6 = c0086q.f266b + i5;
        c0086q.f266b = i6;
        c0070a.f229m -= j4;
        if (i6 == c0086q.f267c) {
            c0070a.f228l = c0086q.m347a();
            p010B3.AbstractC0087r.m351a(c0086q);
        }
        return str;
    }

    /* renamed from: f */
    public final void m345f(long j4) {
        p010B3.C0070a c0070a;
        if (j4 < 0) {
            throw new java.lang.IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        if (this.f264n) {
            throw new java.lang.IllegalStateException("closed");
        }
        do {
            c0070a = this.f263m;
            if (c0070a.f229m >= j4) {
                return;
            }
        } while (this.f262l.mo293d(c0070a, 8192L) != -1);
        throw new java.io.EOFException();
    }

    /* renamed from: g */
    public final void m346g(long j4) {
        if (this.f264n) {
            throw new java.lang.IllegalStateException("closed");
        }
        while (j4 > 0) {
            p010B3.C0070a c0070a = this.f263m;
            if (c0070a.f229m == 0 && this.f262l.mo293d(c0070a, 8192L) == -1) {
                throw new java.io.EOFException();
            }
            long min = java.lang.Math.min(j4, c0070a.f229m);
            c0070a.m298i(min);
            j4 -= min;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f264n;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(java.nio.ByteBuffer byteBuffer) {
        p154k3.AbstractC1803h.m3779e(byteBuffer, "sink");
        p010B3.C0070a c0070a = this.f263m;
        if (c0070a.f229m == 0 && this.f262l.mo293d(c0070a, 8192L) == -1) {
            return -1;
        }
        return c0070a.read(byteBuffer);
    }

    public final java.lang.String toString() {
        return "buffer(" + this.f262l + ')';
    }
}
