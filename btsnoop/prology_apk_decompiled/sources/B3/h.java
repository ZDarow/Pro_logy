package B3;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class h implements Closeable {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f244l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f245m;

    /* renamed from: n, reason: collision with root package name */
    public int f246n;

    /* renamed from: o, reason: collision with root package name */
    public final ReentrantLock f247o = new ReentrantLock();

    /* renamed from: p, reason: collision with root package name */
    public final RandomAccessFile f248p;

    public h(boolean z4, RandomAccessFile randomAccessFile) {
        this.f244l = z4;
        this.f248p = randomAccessFile;
    }

    public static c b(h hVar) {
        if (!hVar.f244l) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = hVar.f247o;
        reentrantLock.lock();
        try {
            if (hVar.f245m) {
                throw new IllegalStateException("closed");
            }
            hVar.f246n++;
            reentrantLock.unlock();
            return new c(hVar, 0L);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void a() {
        if (!this.f244l) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f247o;
        reentrantLock.lock();
        try {
            if (this.f245m) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                this.f248p.getFD().sync();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long c() {
        long length;
        ReentrantLock reentrantLock = this.f247o;
        reentrantLock.lock();
        try {
            if (this.f245m) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                length = this.f248p.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f247o;
        reentrantLock.lock();
        try {
            if (this.f245m) {
                return;
            }
            this.f245m = true;
            if (this.f246n != 0) {
                return;
            }
            synchronized (this) {
                this.f248p.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final d e(long j4) {
        ReentrantLock reentrantLock = this.f247o;
        reentrantLock.lock();
        try {
            if (this.f245m) {
                throw new IllegalStateException("closed");
            }
            this.f246n++;
            reentrantLock.unlock();
            return new d(this, j4);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
