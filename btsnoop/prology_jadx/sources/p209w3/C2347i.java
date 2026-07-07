package p209w3;

/* renamed from: w3.i */
/* loaded from: classes.dex */
public final class C2347i extends p187r3.AbstractC2128s implements p187r3.InterfaceC2134y {

    /* renamed from: r */
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f9284r = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p209w3.C2347i.class, "runningWorkers");

    /* renamed from: n */
    public final p218y3.C2428k f9285n;

    /* renamed from: o */
    public final int f9286o;

    /* renamed from: p */
    public final p209w3.C2350l f9287p;

    /* renamed from: q */
    public final java.lang.Object f9288q;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public C2347i(p218y3.C2428k c2428k, int i4) {
        this.f9285n = c2428k;
        this.f9286o = i4;
        if ((c2428k instanceof p187r3.InterfaceC2134y ? (p187r3.InterfaceC2134y) c2428k : null) == null) {
            int i5 = p187r3.AbstractC2133x.f8508a;
        }
        this.f9287p = new p209w3.C2350l();
        this.f9288q = new java.lang.Object();
    }

    @Override // p187r3.AbstractC2128s
    /* renamed from: e */
    public final void mo4159e(p110b3.InterfaceC1195i interfaceC1195i, java.lang.Runnable runnable) {
        this.f9287p.m4561a(runnable);
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9284r;
        if (atomicIntegerFieldUpdater.get(this) < this.f9286o) {
            synchronized (this.f9288q) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f9286o) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                java.lang.Runnable m4556g = m4556g();
                if (m4556g == null) {
                    return;
                }
                this.f9285n.mo4159e(this, new p054N1.RunnableC0462q(9, this, m4556g));
            }
        }
    }

    /* renamed from: g */
    public final java.lang.Runnable m4556g() {
        while (true) {
            java.lang.Runnable runnable = (java.lang.Runnable) this.f9287p.m4564d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f9288q) {
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9284r;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f9287p.m4563c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
