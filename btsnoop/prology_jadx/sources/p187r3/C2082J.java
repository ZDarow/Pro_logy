package p187r3;

/* renamed from: r3.J */
/* loaded from: classes.dex */
public final class C2082J extends p187r3.AbstractC2081I implements p187r3.InterfaceC2134y {

    /* renamed from: n */
    public final java.util.concurrent.Executor f8436n;

    public C2082J(java.util.concurrent.Executor executor) {
        java.lang.reflect.Method method;
        this.f8436n = executor;
        java.lang.reflect.Method method2 = p209w3.AbstractC2341c.f9273a;
        try {
            java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof java.util.concurrent.ScheduledThreadPoolExecutor ? (java.util.concurrent.ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = p209w3.AbstractC2341c.f9273a) != null) {
                method.invoke(scheduledThreadPoolExecutor, java.lang.Boolean.TRUE);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        java.util.concurrent.Executor executor = this.f8436n;
        java.util.concurrent.ExecutorService executorService = executor instanceof java.util.concurrent.ExecutorService ? (java.util.concurrent.ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // p187r3.AbstractC2128s
    /* renamed from: e */
    public final void mo4159e(p110b3.InterfaceC1195i interfaceC1195i, java.lang.Runnable runnable) {
        try {
            this.f8436n.execute(runnable);
        } catch (java.util.concurrent.RejectedExecutionException e4) {
            java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("The task was rejected");
            cancellationException.initCause(e4);
            p187r3.InterfaceC2088P interfaceC2088P = (p187r3.InterfaceC2088P) interfaceC1195i.mo678j(p187r3.C2129t.f8496m);
            if (interfaceC2088P != null) {
                interfaceC2088P.mo4170b(cancellationException);
            }
            p187r3.AbstractC2074B.f8426b.mo4159e(interfaceC1195i, runnable);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof p187r3.C2082J) && ((p187r3.C2082J) obj).f8436n == this.f8436n;
    }

    public final int hashCode() {
        return java.lang.System.identityHashCode(this.f8436n);
    }

    @Override // p187r3.AbstractC2128s
    public final java.lang.String toString() {
        return this.f8436n.toString();
    }
}
