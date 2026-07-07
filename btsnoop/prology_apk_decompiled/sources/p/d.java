package p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class d extends AbstractC0462a {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7576a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7577b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7578c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7579d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7580e;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f7576a = atomicReferenceFieldUpdater;
        this.f7577b = atomicReferenceFieldUpdater2;
        this.f7578c = atomicReferenceFieldUpdater3;
        this.f7579d = atomicReferenceFieldUpdater4;
        this.f7580e = atomicReferenceFieldUpdater5;
    }

    @Override // p1.AbstractC0462a
    public final void G(f fVar, f fVar2) {
        this.f7577b.lazySet(fVar, fVar2);
    }

    @Override // p1.AbstractC0462a
    public final void H(f fVar, Thread thread) {
        this.f7576a.lazySet(fVar, thread);
    }

    @Override // p1.AbstractC0462a
    public final boolean h(g gVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f7579d;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // p1.AbstractC0462a
    public final boolean i(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f7580e;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // p1.AbstractC0462a
    public final boolean j(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f7578c;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }
}
