package B3;

import java.io.Closeable;
import java.io.Flushable;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes.dex */
public final class n implements Closeable, Flushable, WritableByteChannel {

    /* renamed from: l, reason: collision with root package name */
    public final c f253l;

    /* renamed from: m, reason: collision with root package name */
    public final a f254m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public boolean f255n;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, B3.a] */
    public n(c cVar) {
        this.f253l = cVar;
    }

    public final void a() {
        if (this.f255n) {
            throw new IllegalStateException("closed");
        }
        a aVar = this.f254m;
        long j4 = aVar.f224m;
        if (j4 == 0) {
            j4 = 0;
        } else {
            q qVar = aVar.f223l;
            k3.h.b(qVar);
            q qVar2 = qVar.f266g;
            k3.h.b(qVar2);
            if (qVar2.f262c < 8192 && qVar2.f264e) {
                j4 -= r6 - qVar2.f261b;
            }
        }
        if (j4 > 0) {
            this.f253l.a(aVar, j4);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        c cVar = this.f253l;
        if (this.f255n) {
            return;
        }
        try {
            a aVar = this.f254m;
            long j4 = aVar.f224m;
            if (j4 > 0) {
                cVar.a(aVar, j4);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            cVar.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f255n = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f255n) {
            throw new IllegalStateException("closed");
        }
        a aVar = this.f254m;
        long j4 = aVar.f224m;
        c cVar = this.f253l;
        if (j4 > 0) {
            cVar.a(aVar, j4);
        }
        cVar.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f255n;
    }

    public final String toString() {
        return "buffer(" + this.f253l + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        k3.h.e(byteBuffer, "source");
        if (this.f255n) {
            throw new IllegalStateException("closed");
        }
        int write = this.f254m.write(byteBuffer);
        a();
        return write;
    }
}
