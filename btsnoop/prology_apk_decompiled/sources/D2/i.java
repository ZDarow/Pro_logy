package D2;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class i implements e {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f490a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f491b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f492c = new AtomicBoolean(false);

    public i(ExecutorService executorService) {
        this.f490a = executorService;
    }

    @Override // D2.e
    public final void a(c cVar) {
        this.f491b.add(cVar);
        this.f490a.execute(new h(this, 0));
    }

    public final void b() {
        ExecutorService executorService = this.f490a;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f491b;
        AtomicBoolean atomicBoolean = this.f492c;
        if (atomicBoolean.compareAndSet(false, true)) {
            try {
                Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                if (runnable != null) {
                    runnable.run();
                }
            } finally {
                atomicBoolean.set(false);
                if (!concurrentLinkedQueue.isEmpty()) {
                    executorService.execute(new h(this, 1));
                }
            }
        }
    }
}
