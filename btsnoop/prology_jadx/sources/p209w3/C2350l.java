package p209w3;

/* renamed from: w3.l */
/* loaded from: classes.dex */
public class C2350l {

    /* renamed from: a */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f9292a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p209w3.C2350l.class, java.lang.Object.class, "_cur");
    private volatile java.lang.Object _cur = new p209w3.C2352n(8, false);

    /* renamed from: a */
    public final boolean m4561a(java.lang.Runnable runnable) {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9292a;
            p209w3.C2352n c2352n = (p209w3.C2352n) atomicReferenceFieldUpdater.get(this);
            int m4565a = c2352n.m4565a(runnable);
            if (m4565a == 0) {
                return true;
            }
            if (m4565a == 1) {
                p209w3.C2352n m4567c = c2352n.m4567c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c2352n, m4567c) && atomicReferenceFieldUpdater.get(this) == c2352n) {
                }
            } else if (m4565a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void m4562b() {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9292a;
            p209w3.C2352n c2352n = (p209w3.C2352n) atomicReferenceFieldUpdater.get(this);
            if (c2352n.m4566b()) {
                return;
            }
            p209w3.C2352n m4567c = c2352n.m4567c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c2352n, m4567c) && atomicReferenceFieldUpdater.get(this) == c2352n) {
            }
        }
    }

    /* renamed from: c */
    public final int m4563c() {
        p209w3.C2352n c2352n = (p209w3.C2352n) f9292a.get(this);
        c2352n.getClass();
        long j4 = p209w3.C2352n.f9295f.get(c2352n);
        return (((int) ((j4 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j4))) & 1073741823;
    }

    /* renamed from: d */
    public final java.lang.Object m4564d() {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9292a;
            p209w3.C2352n c2352n = (p209w3.C2352n) atomicReferenceFieldUpdater.get(this);
            java.lang.Object m4568d = c2352n.m4568d();
            if (m4568d != p209w3.C2352n.f9296g) {
                return m4568d;
            }
            p209w3.C2352n m4567c = c2352n.m4567c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c2352n, m4567c) && atomicReferenceFieldUpdater.get(this) == c2352n) {
            }
        }
    }
}
