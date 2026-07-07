package p018D2;

/* renamed from: D2.i */
/* loaded from: classes.dex */
public final class C0183i implements p018D2.InterfaceC0179e {

    /* renamed from: a */
    public final java.util.concurrent.ExecutorService f499a;

    /* renamed from: b */
    public final java.util.concurrent.ConcurrentLinkedQueue f500b = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: c */
    public final java.util.concurrent.atomic.AtomicBoolean f501c = new java.util.concurrent.atomic.AtomicBoolean(false);

    public C0183i(java.util.concurrent.ExecutorService executorService) {
        this.f499a = executorService;
    }

    @Override // p018D2.InterfaceC0179e
    /* renamed from: a */
    public final void mo539a(p018D2.RunnableC0177c runnableC0177c) {
        this.f500b.add(runnableC0177c);
        this.f499a.execute(new p018D2.RunnableC0182h(this, 0));
    }

    /* renamed from: b */
    public final void m540b() {
        java.util.concurrent.ExecutorService executorService = this.f499a;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f500b;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f501c;
        if (atomicBoolean.compareAndSet(false, true)) {
            try {
                java.lang.Runnable runnable = (java.lang.Runnable) concurrentLinkedQueue.poll();
                if (runnable != null) {
                    runnable.run();
                }
            } finally {
                atomicBoolean.set(false);
                if (!concurrentLinkedQueue.isEmpty()) {
                    executorService.execute(new p018D2.RunnableC0182h(this, 1));
                }
            }
        }
    }
}
