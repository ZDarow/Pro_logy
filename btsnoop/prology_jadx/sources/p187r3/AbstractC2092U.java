package p187r3;

/* renamed from: r3.U */
/* loaded from: classes.dex */
public abstract class AbstractC2092U extends p209w3.C2349k implements p187r3.InterfaceC2075C, p187r3.InterfaceC2084L, p149j3.InterfaceC1737l {

    /* renamed from: o */
    public p187r3.C2097Z f8445o;

    @Override // p187r3.InterfaceC2084L
    /* renamed from: a */
    public final boolean mo4157a() {
        return true;
    }

    @Override // p187r3.InterfaceC2075C
    /* renamed from: d */
    public final void mo4155d() {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        p187r3.C2097Z m4173n = m4173n();
        while (true) {
            java.lang.Object m4187E = m4173n.m4187E();
            if (!(m4187E instanceof p187r3.AbstractC2092U)) {
                if (!(m4187E instanceof p187r3.InterfaceC2084L) || ((p187r3.InterfaceC2084L) m4187E).mo4158g() == null) {
                    return;
                }
                while (true) {
                    java.lang.Object m4559k = m4559k();
                    if (m4559k instanceof p209w3.C2356r) {
                        p209w3.C2349k c2349k = ((p209w3.C2356r) m4559k).f9305a;
                        return;
                    }
                    if (m4559k == this) {
                        return;
                    }
                    p154k3.AbstractC1803h.m3777c(m4559k, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    p209w3.C2349k c2349k2 = (p209w3.C2349k) m4559k;
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = p209w3.C2349k.f9291n;
                    p209w3.C2356r c2356r = (p209w3.C2356r) atomicReferenceFieldUpdater3.get(c2349k2);
                    if (c2356r == null) {
                        c2356r = new p209w3.C2356r(c2349k2);
                        atomicReferenceFieldUpdater3.lazySet(c2349k2, c2356r);
                    }
                    do {
                        atomicReferenceFieldUpdater = p209w3.C2349k.f9289l;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, m4559k, c2356r)) {
                            c2349k2.m4557i();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == m4559k);
                }
            } else {
                if (m4187E != this) {
                    return;
                }
                p187r3.C2077E c2077e = p187r3.AbstractC2131v.f8505i;
                do {
                    atomicReferenceFieldUpdater2 = p187r3.C2097Z.f8459l;
                    if (atomicReferenceFieldUpdater2.compareAndSet(m4173n, m4187E, c2077e)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(m4173n) == m4187E);
            }
        }
    }

    @Override // p187r3.InterfaceC2084L
    /* renamed from: g */
    public final p187r3.C2099a0 mo4158g() {
        return null;
    }

    public p187r3.InterfaceC2088P getParent() {
        return m4173n();
    }

    /* renamed from: n */
    public final p187r3.C2097Z m4173n() {
        p187r3.C2097Z c2097z = this.f8445o;
        if (c2097z != null) {
            return c2097z;
        }
        p154k3.AbstractC1803h.m3783i("job");
        throw null;
    }

    /* renamed from: o */
    public abstract void mo4168o(java.lang.Throwable th);

    @Override // p209w3.C2349k
    public final java.lang.String toString() {
        return getClass().getSimpleName() + '@' + p187r3.AbstractC2131v.m4243b(this) + "[job@" + p187r3.AbstractC2131v.m4243b(m4173n()) + ']';
    }
}
