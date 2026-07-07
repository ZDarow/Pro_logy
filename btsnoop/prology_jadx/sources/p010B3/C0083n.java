package p010B3;

/* renamed from: B3.n */
/* loaded from: classes.dex */
public final class C0083n implements java.io.Closeable, java.io.Flushable, java.nio.channels.WritableByteChannel {

    /* renamed from: l */
    public final p010B3.C0072c f258l;

    /* renamed from: m */
    public final p010B3.C0070a f259m = new java.lang.Object();

    /* renamed from: n */
    public boolean f260n;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, B3.a] */
    public C0083n(p010B3.C0072c c0072c) {
        this.f258l = c0072c;
    }

    /* renamed from: a */
    public final void m340a() {
        if (this.f260n) {
            throw new java.lang.IllegalStateException("closed");
        }
        p010B3.C0070a c0070a = this.f259m;
        long j4 = c0070a.f229m;
        if (j4 == 0) {
            j4 = 0;
        } else {
            p010B3.C0086q c0086q = c0070a.f228l;
            p154k3.AbstractC1803h.m3776b(c0086q);
            p010B3.C0086q c0086q2 = c0086q.f271g;
            p154k3.AbstractC1803h.m3776b(c0086q2);
            if (c0086q2.f267c < 8192 && c0086q2.f269e) {
                j4 -= r6 - c0086q2.f266b;
            }
        }
        if (j4 > 0) {
            this.f258l.m321a(c0070a, j4);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        p010B3.C0072c c0072c = this.f258l;
        if (this.f260n) {
            return;
        }
        try {
            p010B3.C0070a c0070a = this.f259m;
            long j4 = c0070a.f229m;
            if (j4 > 0) {
                c0072c.m321a(c0070a, j4);
            }
            th = null;
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            c0072c.close();
        } catch (java.lang.Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f260n = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f260n) {
            throw new java.lang.IllegalStateException("closed");
        }
        p010B3.C0070a c0070a = this.f259m;
        long j4 = c0070a.f229m;
        p010B3.C0072c c0072c = this.f258l;
        if (j4 > 0) {
            c0072c.m321a(c0070a, j4);
        }
        c0072c.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f260n;
    }

    public final java.lang.String toString() {
        return "buffer(" + this.f258l + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(java.nio.ByteBuffer byteBuffer) {
        p154k3.AbstractC1803h.m3779e(byteBuffer, "source");
        if (this.f260n) {
            throw new java.lang.IllegalStateException("closed");
        }
        int write = this.f259m.write(byteBuffer);
        m340a();
        return write;
    }
}
