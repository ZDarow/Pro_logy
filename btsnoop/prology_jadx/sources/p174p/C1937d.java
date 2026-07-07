package p174p;

/* renamed from: p.d */
/* loaded from: classes.dex */
public final class C1937d extends p176p1.AbstractC1949a {

    /* renamed from: a */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f7867a;

    /* renamed from: b */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f7868b;

    /* renamed from: c */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f7869c;

    /* renamed from: d */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f7870d;

    /* renamed from: e */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f7871e;

    public C1937d(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f7867a = atomicReferenceFieldUpdater;
        this.f7868b = atomicReferenceFieldUpdater2;
        this.f7869c = atomicReferenceFieldUpdater3;
        this.f7870d = atomicReferenceFieldUpdater4;
        this.f7871e = atomicReferenceFieldUpdater5;
    }

    @Override // p176p1.AbstractC1949a
    /* renamed from: G */
    public final void mo3887G(p174p.C1939f c1939f, p174p.C1939f c1939f2) {
        this.f7868b.lazySet(c1939f, c1939f2);
    }

    @Override // p176p1.AbstractC1949a
    /* renamed from: H */
    public final void mo3888H(p174p.C1939f c1939f, java.lang.Thread thread) {
        this.f7867a.lazySet(c1939f, thread);
    }

    @Override // p176p1.AbstractC1949a
    /* renamed from: h */
    public final boolean mo3889h(p174p.AbstractFutureC1940g abstractFutureC1940g, p174p.C1936c c1936c, p174p.C1936c c1936c2) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f7870d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC1940g, c1936c, c1936c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC1940g) == c1936c);
        return false;
    }

    @Override // p176p1.AbstractC1949a
    /* renamed from: i */
    public final boolean mo3890i(p174p.AbstractFutureC1940g abstractFutureC1940g, java.lang.Object obj, java.lang.Object obj2) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f7871e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC1940g, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC1940g) == obj);
        return false;
    }

    @Override // p176p1.AbstractC1949a
    /* renamed from: j */
    public final boolean mo3891j(p174p.AbstractFutureC1940g abstractFutureC1940g, p174p.C1939f c1939f, p174p.C1939f c1939f2) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f7869c;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC1940g, c1939f, c1939f2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC1940g) == c1939f);
        return false;
    }
}
