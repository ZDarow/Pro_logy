package r3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class U extends w3.k implements C, L, j3.l {

    /* renamed from: o, reason: collision with root package name */
    public Z f8129o;

    @Override // r3.L
    public final boolean a() {
        return true;
    }

    @Override // r3.C
    public final void d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        Z n4 = n();
        while (true) {
            Object E3 = n4.E();
            if (!(E3 instanceof U)) {
                if (!(E3 instanceof L) || ((L) E3).g() == null) {
                    return;
                }
                while (true) {
                    Object k4 = k();
                    if (k4 instanceof w3.r) {
                        w3.k kVar = ((w3.r) k4).f8946a;
                        return;
                    }
                    if (k4 == this) {
                        return;
                    }
                    k3.h.c(k4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    w3.k kVar2 = (w3.k) k4;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = w3.k.f8932n;
                    w3.r rVar = (w3.r) atomicReferenceFieldUpdater3.get(kVar2);
                    if (rVar == null) {
                        rVar = new w3.r(kVar2);
                        atomicReferenceFieldUpdater3.lazySet(kVar2, rVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = w3.k.f8930l;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, k4, rVar)) {
                            kVar2.i();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == k4);
                }
            } else {
                if (E3 != this) {
                    return;
                }
                E e4 = AbstractC0534v.f8187i;
                do {
                    atomicReferenceFieldUpdater2 = Z.f8142l;
                    if (atomicReferenceFieldUpdater2.compareAndSet(n4, E3, e4)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(n4) == E3);
            }
        }
    }

    @Override // r3.L
    public final a0 g() {
        return null;
    }

    public P getParent() {
        return n();
    }

    public final Z n() {
        Z z4 = this.f8129o;
        if (z4 != null) {
            return z4;
        }
        k3.h.i("job");
        throw null;
    }

    public abstract void o(Throwable th);

    @Override // w3.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0534v.b(this) + "[job@" + AbstractC0534v.b(n()) + ']';
    }
}
