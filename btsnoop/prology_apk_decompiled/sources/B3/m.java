package B3;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class m extends OutputStream {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f252l;

    public m(n nVar) {
        this.f252l = nVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f252l.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        n nVar = this.f252l;
        if (nVar.f255n) {
            return;
        }
        nVar.flush();
    }

    public final String toString() {
        return this.f252l + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i4) {
        n nVar = this.f252l;
        if (!nVar.f255n) {
            nVar.f254m.o((byte) i4);
            nVar.a();
            return;
        }
        throw new IOException("closed");
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i4, int i5) {
        k3.h.e(bArr, "data");
        n nVar = this.f252l;
        if (!nVar.f255n) {
            nVar.f254m.n(bArr, i4, i5);
            nVar.a();
            return;
        }
        throw new IOException("closed");
    }
}
