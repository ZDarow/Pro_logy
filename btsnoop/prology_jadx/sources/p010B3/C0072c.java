package p010B3;

/* renamed from: B3.c */
/* loaded from: classes.dex */
public final class C0072c implements java.io.Closeable, java.io.Flushable {

    /* renamed from: l */
    public final p010B3.C0077h f234l;

    /* renamed from: m */
    public long f235m;

    /* renamed from: n */
    public boolean f236n;

    public C0072c(p010B3.C0077h c0077h, long j4) {
        p154k3.AbstractC1803h.m3779e(c0077h, "fileHandle");
        this.f234l = c0077h;
        this.f235m = j4;
    }

    /* renamed from: a */
    public final void m321a(p010B3.C0070a c0070a, long j4) {
        if (this.f236n) {
            throw new java.lang.IllegalStateException("closed");
        }
        p010B3.C0077h c0077h = this.f234l;
        long j5 = this.f235m;
        c0077h.getClass();
        p080U1.AbstractC0748a.m1371d(c0070a.f229m, 0L, j4);
        long j6 = j5 + j4;
        while (j5 < j6) {
            p010B3.C0086q c0086q = c0070a.f228l;
            p154k3.AbstractC1803h.m3776b(c0086q);
            int min = (int) java.lang.Math.min(j6 - j5, c0086q.f267c - c0086q.f266b);
            byte[] bArr = c0086q.f265a;
            int i4 = c0086q.f266b;
            synchronized (c0077h) {
                p154k3.AbstractC1803h.m3779e(bArr, "array");
                c0077h.f253p.seek(j5);
                c0077h.f253p.write(bArr, i4, min);
            }
            int i5 = c0086q.f266b + min;
            c0086q.f266b = i5;
            long j7 = min;
            j5 += j7;
            c0070a.f229m -= j7;
            if (i5 == c0086q.f267c) {
                c0070a.f228l = c0086q.m347a();
                p010B3.AbstractC0087r.m351a(c0086q);
            }
        }
        this.f235m += j4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f236n) {
            return;
        }
        this.f236n = true;
        p010B3.C0077h c0077h = this.f234l;
        java.util.concurrent.locks.ReentrantLock reentrantLock = c0077h.f252o;
        reentrantLock.lock();
        try {
            int i4 = c0077h.f251n - 1;
            c0077h.f251n = i4;
            if (i4 == 0) {
                if (c0077h.f250m) {
                    synchronized (c0077h) {
                        c0077h.f253p.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f236n) {
            throw new java.lang.IllegalStateException("closed");
        }
        p010B3.C0077h c0077h = this.f234l;
        synchronized (c0077h) {
            c0077h.f253p.getFD().sync();
        }
    }
}
