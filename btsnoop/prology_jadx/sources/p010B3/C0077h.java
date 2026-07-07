package p010B3;

/* renamed from: B3.h */
/* loaded from: classes.dex */
public final class C0077h implements java.io.Closeable {

    /* renamed from: l */
    public final boolean f249l;

    /* renamed from: m */
    public boolean f250m;

    /* renamed from: n */
    public int f251n;

    /* renamed from: o */
    public final java.util.concurrent.locks.ReentrantLock f252o = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: p */
    public final java.io.RandomAccessFile f253p;

    public C0077h(boolean z4, java.io.RandomAccessFile randomAccessFile) {
        this.f249l = z4;
        this.f253p = randomAccessFile;
    }

    /* renamed from: b */
    public static p010B3.C0072c m324b(p010B3.C0077h c0077h) {
        if (!c0077h.f249l) {
            throw new java.lang.IllegalStateException("file handle is read-only");
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = c0077h.f252o;
        reentrantLock.lock();
        try {
            if (c0077h.f250m) {
                throw new java.lang.IllegalStateException("closed");
            }
            c0077h.f251n++;
            reentrantLock.unlock();
            return new p010B3.C0072c(c0077h, 0L);
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public final void m325a() {
        if (!this.f249l) {
            throw new java.lang.IllegalStateException("file handle is read-only");
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f252o;
        reentrantLock.lock();
        try {
            if (this.f250m) {
                throw new java.lang.IllegalStateException("closed");
            }
            synchronized (this) {
                this.f253p.getFD().sync();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: c */
    public final long m326c() {
        long length;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f252o;
        reentrantLock.lock();
        try {
            if (this.f250m) {
                throw new java.lang.IllegalStateException("closed");
            }
            synchronized (this) {
                length = this.f253p.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f252o;
        reentrantLock.lock();
        try {
            if (this.f250m) {
                return;
            }
            this.f250m = true;
            if (this.f251n != 0) {
                return;
            }
            synchronized (this) {
                this.f253p.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: e */
    public final p010B3.C0073d m327e(long j4) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f252o;
        reentrantLock.lock();
        try {
            if (this.f250m) {
                throw new java.lang.IllegalStateException("closed");
            }
            this.f251n++;
            reentrantLock.unlock();
            return new p010B3.C0073d(this, j4);
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
