package r3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class N extends S {

    /* renamed from: q, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f8123q = AtomicIntegerFieldUpdater.newUpdater(N.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: p, reason: collision with root package name */
    public final j3.l f8124p;

    public N(j3.l lVar) {
        this.f8124p = lVar;
    }

    @Override // j3.l
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        o((Throwable) obj);
        return Z2.g.f3186a;
    }

    @Override // r3.U
    public final void o(Throwable th) {
        if (f8123q.compareAndSet(this, 0, 1)) {
            this.f8124p.b(th);
        }
    }
}
