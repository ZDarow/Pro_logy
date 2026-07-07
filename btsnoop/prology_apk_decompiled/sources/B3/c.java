package B3;

import java.io.Closeable;
import java.io.Flushable;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class c implements Closeable, Flushable {

    /* renamed from: l, reason: collision with root package name */
    public final h f229l;

    /* renamed from: m, reason: collision with root package name */
    public long f230m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f231n;

    public c(h hVar, long j4) {
        k3.h.e(hVar, "fileHandle");
        this.f229l = hVar;
        this.f230m = j4;
    }

    public final void a(a aVar, long j4) {
        if (this.f231n) {
            throw new IllegalStateException("closed");
        }
        h hVar = this.f229l;
        long j5 = this.f230m;
        hVar.getClass();
        U1.a.d(aVar.f224m, 0L, j4);
        long j6 = j5 + j4;
        while (j5 < j6) {
            q qVar = aVar.f223l;
            k3.h.b(qVar);
            int min = (int) Math.min(j6 - j5, qVar.f262c - qVar.f261b);
            byte[] bArr = qVar.f260a;
            int i4 = qVar.f261b;
            synchronized (hVar) {
                k3.h.e(bArr, "array");
                hVar.f248p.seek(j5);
                hVar.f248p.write(bArr, i4, min);
            }
            int i5 = qVar.f261b + min;
            qVar.f261b = i5;
            long j7 = min;
            j5 += j7;
            aVar.f224m -= j7;
            if (i5 == qVar.f262c) {
                aVar.f223l = qVar.a();
                r.a(qVar);
            }
        }
        this.f230m += j4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f231n) {
            return;
        }
        this.f231n = true;
        h hVar = this.f229l;
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

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f231n) {
            throw new IllegalStateException("closed");
        }
        h hVar = this.f229l;
        synchronized (hVar) {
            hVar.f248p.getFD().sync();
        }
    }
}
