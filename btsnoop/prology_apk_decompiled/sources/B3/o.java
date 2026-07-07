package B3;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class o extends InputStream {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f256l;

    public o(p pVar) {
        this.f256l = pVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        p pVar = this.f256l;
        if (pVar.f259n) {
            throw new IOException("closed");
        }
        return (int) Math.min(pVar.f258m.f224m, Integer.MAX_VALUE);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f256l.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        p pVar = this.f256l;
        if (!pVar.f259n) {
            a aVar = pVar.f258m;
            if (aVar.f224m == 0 && pVar.f257l.d(aVar, 8192L) == -1) {
                return -1;
            }
            return aVar.e() & 255;
        }
        throw new IOException("closed");
    }

    public final String toString() {
        return this.f256l + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i4, int i5) {
        k3.h.e(bArr, "data");
        p pVar = this.f256l;
        if (!pVar.f259n) {
            U1.a.d(bArr.length, i4, i5);
            a aVar = pVar.f258m;
            if (aVar.f224m == 0 && pVar.f257l.d(aVar, 8192L) == -1) {
                return -1;
            }
            return aVar.read(bArr, i4, i5);
        }
        throw new IOException("closed");
    }
}
