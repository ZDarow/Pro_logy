package p150k;

/* renamed from: k.b */
/* loaded from: classes.dex */
public final class ThreadFactoryC1750b implements java.util.concurrent.ThreadFactory {

    /* renamed from: a */
    public final java.util.concurrent.atomic.AtomicInteger f7187a = new java.util.concurrent.atomic.AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable);
        thread.setName("arch_disk_io_" + this.f7187a.getAndIncrement());
        return thread;
    }
}
