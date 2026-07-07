package p010B3;

/* renamed from: B3.m */
/* loaded from: classes.dex */
public final class C0082m extends java.io.OutputStream {

    /* renamed from: l */
    public final /* synthetic */ p010B3.C0083n f257l;

    public C0082m(p010B3.C0083n c0083n) {
        this.f257l = c0083n;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f257l.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        p010B3.C0083n c0083n = this.f257l;
        if (c0083n.f260n) {
            return;
        }
        c0083n.flush();
    }

    public final java.lang.String toString() {
        return this.f257l + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i4) {
        p010B3.C0083n c0083n = this.f257l;
        if (!c0083n.f260n) {
            c0083n.f259m.m304o((byte) i4);
            c0083n.m340a();
            return;
        }
        throw new java.io.IOException("closed");
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i4, int i5) {
        p154k3.AbstractC1803h.m3779e(bArr, "data");
        p010B3.C0083n c0083n = this.f257l;
        if (!c0083n.f260n) {
            c0083n.f259m.m303n(bArr, i4, i5);
            c0083n.m340a();
            return;
        }
        throw new java.io.IOException("closed");
    }
}
