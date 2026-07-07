package w3;

import b3.InterfaceC0195i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import r3.AbstractC0531s;
import r3.AbstractC0536x;
import r3.InterfaceC0537y;

/* loaded from: classes.dex */
public final class i extends AbstractC0531s implements InterfaceC0537y {

    /* renamed from: r, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f8925r = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers");

    /* renamed from: n, reason: collision with root package name */
    public final y3.k f8926n;

    /* renamed from: o, reason: collision with root package name */
    public final int f8927o;

    /* renamed from: p, reason: collision with root package name */
    public final l f8928p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f8929q;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public i(y3.k kVar, int i4) {
        this.f8926n = kVar;
        this.f8927o = i4;
        if ((kVar instanceof InterfaceC0537y ? (InterfaceC0537y) kVar : null) == null) {
            int i5 = AbstractC0536x.f8190a;
        }
        this.f8928p = new l();
        this.f8929q = new Object();
    }

    @Override // r3.AbstractC0531s
    public final void e(InterfaceC0195i interfaceC0195i, Runnable runnable) {
        this.f8928p.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8925r;
        if (atomicIntegerFieldUpdater.get(this) < this.f8927o) {
            synchronized (this.f8929q) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f8927o) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable g4 = g();
                if (g4 == null) {
                    return;
                }
                this.f8926n.e(this, new N1.q(9, this, g4));
            }
        }
    }

    public final Runnable g() {
        while (true) {
            Runnable runnable = (Runnable) this.f8928p.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f8929q) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8925r;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f8928p.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
