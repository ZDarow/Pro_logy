package p187r3;

/* renamed from: r3.w */
/* loaded from: classes.dex */
public final class RunnableC2132w extends p187r3.AbstractC2079G implements java.lang.Runnable {
    private static volatile java.lang.Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: u */
    public static final p187r3.RunnableC2132w f8506u;

    /* renamed from: v */
    public static final long f8507v;

    /* JADX WARN: Type inference failed for: r0v0, types: [r3.G, r3.w, r3.H] */
    static {
        java.lang.Long l4;
        ?? abstractC2079G = new p187r3.AbstractC2079G();
        f8506u = abstractC2079G;
        abstractC2079G.m4166i(false);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        try {
            l4 = java.lang.Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (java.lang.SecurityException unused) {
            l4 = 1000L;
        }
        f8507v = timeUnit.toNanos(l4.longValue());
    }

    @Override // p187r3.AbstractC2080H
    /* renamed from: h */
    public final java.lang.Thread mo4165h() {
        java.lang.Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new java.lang.Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // p187r3.AbstractC2079G, p187r3.AbstractC2080H
    /* renamed from: o */
    public final void mo4161o() {
        debugStatus = 4;
        super.mo4161o();
    }

    @Override // p187r3.AbstractC2079G
    /* renamed from: p */
    public final void mo4162p(java.lang.Runnable runnable) {
        if (debugStatus == 4) {
            throw new java.util.concurrent.RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo4162p(runnable);
    }

    /* renamed from: r */
    public final synchronized void m4256r() {
        int i4 = debugStatus;
        if (i4 == 2 || i4 == 3) {
            debugStatus = 3;
            p187r3.AbstractC2079G.f8429r.set(this, null);
            p187r3.AbstractC2079G.f8430s.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean m4163q;
        p187r3.AbstractC2113h0.f8474a.set(this);
        try {
            synchronized (this) {
                int i4 = debugStatus;
                if (i4 == 2 || i4 == 3) {
                    if (m4163q) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j4 = Long.MAX_VALUE;
                while (true) {
                    java.lang.Thread.interrupted();
                    long mo4160l = mo4160l();
                    if (mo4160l == Long.MAX_VALUE) {
                        long nanoTime = java.lang.System.nanoTime();
                        if (j4 == Long.MAX_VALUE) {
                            j4 = f8507v + nanoTime;
                        }
                        long j5 = j4 - nanoTime;
                        if (j5 <= 0) {
                            _thread = null;
                            m4256r();
                            if (m4163q()) {
                                return;
                            }
                            mo4165h();
                            return;
                        }
                        if (mo4160l > j5) {
                            mo4160l = j5;
                        }
                    } else {
                        j4 = Long.MAX_VALUE;
                    }
                    if (mo4160l > 0) {
                        int i5 = debugStatus;
                        if (i5 == 2 || i5 == 3) {
                            _thread = null;
                            m4256r();
                            if (m4163q()) {
                                return;
                            }
                            mo4165h();
                            return;
                        }
                        java.util.concurrent.locks.LockSupport.parkNanos(this, mo4160l);
                    }
                }
            }
        } finally {
            _thread = null;
            m4256r();
            if (!m4163q()) {
                mo4165h();
            }
        }
    }
}
