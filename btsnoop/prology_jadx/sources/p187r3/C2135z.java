package p187r3;

/* renamed from: r3.z */
/* loaded from: classes.dex */
public final class C2135z extends p209w3.C2358t {

    /* renamed from: p */
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f8509p = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p187r3.C2135z.class, "_decision");
    private volatile int _decision;

    @Override // p209w3.C2358t, p187r3.C2097Z
    /* renamed from: q */
    public final void mo4202q(java.lang.Object obj) {
        mo4203r(obj);
    }

    @Override // p209w3.C2358t, p187r3.C2097Z
    /* renamed from: r */
    public final void mo4203r(java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f8509p;
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new java.lang.IllegalStateException("Already resumed");
                }
                p209w3.AbstractC2339a.m4546i(p176p1.AbstractC1949a.m3902C(this.f9306o), p187r3.AbstractC2131v.m4249h(obj), null);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
