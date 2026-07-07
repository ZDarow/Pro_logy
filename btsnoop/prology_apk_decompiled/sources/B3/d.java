package B3;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class d implements t {

    /* renamed from: l, reason: collision with root package name */
    public final h f232l;

    /* renamed from: m, reason: collision with root package name */
    public long f233m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f234n;

    public d(h hVar, long j4) {
        k3.h.e(hVar, "fileHandle");
        this.f232l = hVar;
        this.f233m = j4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f234n) {
            return;
        }
        this.f234n = true;
        h hVar = this.f232l;
        ReentrantLock reentrantLock = hVar.f247o;
        reentrantLock.lock();
        try {
            int i4 = hVar.f246n - 1;
            hVar.f246n = i4;
            if (i4 == 0) {
                if (hVar.f245m) {
                    synchronized (hVar) {
                        hVar.f248p.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // B3.t
    public final long d(a aVar, long j4) {
        long j5;
        long j6;
        int i4;
        int i5;
        k3.h.e(aVar, "sink");
        if (this.f234n) {
            throw new IllegalStateException("closed");
        }
        h hVar = this.f232l;
        long j7 = this.f233m;
        hVar.getClass();
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        long j8 = j4 + j7;
        long j9 = j7;
        while (true) {
            if (j9 >= j8) {
                break;
            }
            q k4 = aVar.k(1);
            byte[] bArr = k4.f260a;
            int i6 = k4.f262c;
            int min = (int) Math.min(j8 - j9, 8192 - i6);
            synchronized (hVar) {
                k3.h.e(bArr, "array");
                hVar.f248p.seek(j9);
                i4 = 0;
                while (true) {
                    if (i4 >= min) {
                        break;
                    }
                    int read = hVar.f248p.read(bArr, i6, min - i4);
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
                if (k4.f261b == k4.f262c) {
                    aVar.f223l = k4.a();
                    r.a(k4);
                }
                if (j7 == j9) {
                    j6 = -1;
                    j5 = -1;
                }
            } else {
                k4.f262c += i4;
                long j10 = i4;
                j9 += j10;
                aVar.f224m += j10;
            }
        }
        j5 = j9 - j7;
        j6 = -1;
        if (j5 != j6) {
            this.f233m += j5;
        }
        return j5;
    }
}
