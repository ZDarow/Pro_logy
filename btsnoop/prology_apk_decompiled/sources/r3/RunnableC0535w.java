package r3;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: r3.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0535w extends G implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: u, reason: collision with root package name */
    public static final RunnableC0535w f8188u;

    /* renamed from: v, reason: collision with root package name */
    public static final long f8189v;

    /* JADX WARN: Type inference failed for: r0v0, types: [r3.G, r3.w, r3.H] */
    static {
        Long l4;
        ?? g4 = new G();
        f8188u = g4;
        g4.i(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l4 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l4 = 1000L;
        }
        f8189v = timeUnit.toNanos(l4.longValue());
    }

    @Override // r3.H
    public final Thread h() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // r3.G, r3.H
    public final void o() {
        debugStatus = 4;
        super.o();
    }

    @Override // r3.G
    public final void p(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.p(runnable);
    }

    public final synchronized void r() {
        int i4 = debugStatus;
        if (i4 == 2 || i4 == 3) {
            debugStatus = 3;
            G.f8114r.set(this, null);
            G.s.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean q4;
        h0.f8156a.set(this);
        try {
            synchronized (this) {
                int i4 = debugStatus;
                if (i4 == 2 || i4 == 3) {
                    if (q4) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j4 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long l4 = l();
                    if (l4 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j4 == Long.MAX_VALUE) {
                            j4 = f8189v + nanoTime;
                        }
                        long j5 = j4 - nanoTime;
                        if (j5 <= 0) {
                            _thread = null;
                            r();
                            if (q()) {
                                return;
                            }
                            h();
                            return;
                        }
                        if (l4 > j5) {
                            l4 = j5;
                        }
                    } else {
                        j4 = Long.MAX_VALUE;
                    }
                    if (l4 > 0) {
                        int i5 = debugStatus;
                        if (i5 == 2 || i5 == 3) {
                            _thread = null;
                            r();
                            if (q()) {
                                return;
                            }
                            h();
                            return;
                        }
                        LockSupport.parkNanos(this, l4);
                    }
                }
            }
        } finally {
            _thread = null;
            r();
            if (!q()) {
                h();
            }
        }
    }
}
