package r3;

import b3.InterfaceC0195i;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class J extends I implements InterfaceC0537y {

    /* renamed from: n, reason: collision with root package name */
    public final Executor f8120n;

    public J(Executor executor) {
        Method method;
        this.f8120n = executor;
        Method method2 = w3.c.f8915a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = w3.c.f8915a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f8120n;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // r3.AbstractC0531s
    public final void e(InterfaceC0195i interfaceC0195i, Runnable runnable) {
        try {
            this.f8120n.execute(runnable);
        } catch (RejectedExecutionException e4) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e4);
            P p2 = (P) interfaceC0195i.j(C0532t.f8178m);
            if (p2 != null) {
                p2.b(cancellationException);
            }
            B.f8111b.e(interfaceC0195i, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof J) && ((J) obj).f8120n == this.f8120n;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f8120n);
    }

    @Override // r3.AbstractC0531s
    public final String toString() {
        return this.f8120n.toString();
    }
}
