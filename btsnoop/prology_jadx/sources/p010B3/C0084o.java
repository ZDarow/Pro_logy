package p010B3;

/* renamed from: B3.o */
/* loaded from: classes.dex */
public final class C0084o extends java.io.InputStream {

    /* renamed from: l */
    public final /* synthetic */ p010B3.C0085p f261l;

    public C0084o(p010B3.C0085p c0085p) {
        this.f261l = c0085p;
    }

    @Override // java.io.InputStream
    public final int available() {
        p010B3.C0085p c0085p = this.f261l;
        if (c0085p.f264n) {
            throw new java.io.IOException("closed");
        }
        return (int) java.lang.Math.min(c0085p.f263m.f229m, Integer.MAX_VALUE);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f261l.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        p010B3.C0085p c0085p = this.f261l;
        if (!c0085p.f264n) {
            p010B3.C0070a c0070a = c0085p.f263m;
            if (c0070a.f229m == 0 && c0085p.f262l.mo293d(c0070a, 8192L) == -1) {
                return -1;
            }
            return c0070a.m294e() & 255;
        }
        throw new java.io.IOException("closed");
    }

    public final java.lang.String toString() {
        return this.f261l + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i4, int i5) {
        p154k3.AbstractC1803h.m3779e(bArr, "data");
        p010B3.C0085p c0085p = this.f261l;
        if (!c0085p.f264n) {
            p080U1.AbstractC0748a.m1371d(bArr.length, i4, i5);
            p010B3.C0070a c0070a = c0085p.f263m;
            if (c0070a.f229m == 0 && c0085p.f262l.mo293d(c0070a, 8192L) == -1) {
                return -1;
            }
            return c0070a.read(bArr, i4, i5);
        }
        throw new java.io.IOException("closed");
    }
}
