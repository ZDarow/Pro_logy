package p010B3;

/* renamed from: B3.d */
/* loaded from: classes.dex */
public final class C0073d implements p010B3.InterfaceC0089t {

    /* renamed from: l */
    public final p010B3.C0077h f237l;

    /* renamed from: m */
    public long f238m;

    /* renamed from: n */
    public boolean f239n;

    public C0073d(p010B3.C0077h c0077h, long j4) {
        p154k3.AbstractC1803h.m3779e(c0077h, "fileHandle");
        this.f237l = c0077h;
        this.f238m = j4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f239n) {
            return;
        }
        this.f239n = true;
        p010B3.C0077h c0077h = this.f237l;
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

    @Override // p010B3.InterfaceC0089t
    /* renamed from: d */
    public final long mo293d(p010B3.C0070a c0070a, long j4) {
        long j5;
        long j6;
        int i4;
        int i5;
        p154k3.AbstractC1803h.m3779e(c0070a, "sink");
        if (this.f239n) {
            throw new java.lang.IllegalStateException("closed");
        }
        p010B3.C0077h c0077h = this.f237l;
        long j7 = this.f238m;
        c0077h.getClass();
        if (j4 < 0) {
            throw new java.lang.IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        long j8 = j4 + j7;
        long j9 = j7;
        while (true) {
            if (j9 >= j8) {
                break;
            }
            p010B3.C0086q m300k = c0070a.m300k(1);
            byte[] bArr = m300k.f265a;
            int i6 = m300k.f267c;
            int min = (int) java.lang.Math.min(j8 - j9, 8192 - i6);
            synchronized (c0077h) {
                p154k3.AbstractC1803h.m3779e(bArr, "array");
                c0077h.f253p.seek(j9);
                i4 = 0;
                while (true) {
                    if (i4 >= min) {
                        break;
                    }
                    int read = c0077h.f253p.read(bArr, i6, min - i4);
                    if (read != -1) {
                        i4 += read;
                    } else if (i4 == 0) {
                        i5 = -1;
                        i4 = -1;
                    }
                }
                i5 = -1;
            }
            if (i4 == i5) {
                if (m300k.f266b == m300k.f267c) {
                    c0070a.f228l = m300k.m347a();
                    p010B3.AbstractC0087r.m351a(m300k);
                }
                if (j7 == j9) {
                    j6 = -1;
                    j5 = -1;
                }
            } else {
                m300k.f267c += i4;
                long j10 = i4;
                j9 += j10;
                c0070a.f229m += j10;
            }
        }
        j5 = j9 - j7;
        j6 = -1;
        if (j5 != j6) {
            this.f238m += j5;
        }
        return j5;
    }
}
