package p187r3;

/* renamed from: r3.h */
/* loaded from: classes.dex */
public final class C2112h extends p187r3.AbstractC2090S {

    /* renamed from: p */
    public final p187r3.C2108f f8473p;

    public C2112h(p187r3.C2108f c2108f) {
        this.f8473p = c2108f;
    }

    @Override // p149j3.InterfaceC1737l
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ java.lang.Object mo661b(java.lang.Object obj) {
        mo4168o((java.lang.Throwable) obj);
        return p100Z2.C0934g.f3298a;
    }

    @Override // p187r3.AbstractC2092U
    /* renamed from: o */
    public final void mo4168o(java.lang.Throwable th) {
        p187r3.C2097Z m4173n = m4173n();
        p187r3.C2108f c2108f = this.f8473p;
        java.lang.Throwable mo4175t = c2108f.mo4175t(m4173n);
        if (c2108f.m4235y()) {
            p110b3.InterfaceC1190d interfaceC1190d = c2108f.f8470o;
            p154k3.AbstractC1803h.m3777c(interfaceC1190d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            p209w3.C2346h c2346h = (p209w3.C2346h) interfaceC1190d;
            loop0: while (true) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p209w3.C2346h.f9279s;
                java.lang.Object obj = atomicReferenceFieldUpdater.get(c2346h);
                p124e2.C1358f c1358f = p209w3.AbstractC2339a.f9269d;
                if (!p154k3.AbstractC1803h.m3775a(obj, c1358f)) {
                    if (obj instanceof java.lang.Throwable) {
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c2346h, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(c2346h) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(c2346h, c1358f, mo4175t)) {
                    if (atomicReferenceFieldUpdater.get(c2346h) != c1358f) {
                        break;
                    }
                }
                return;
            }
        }
        c2108f.m4228q(mo4175t);
        if (c2108f.m4235y()) {
            return;
        }
        c2108f.m4229r();
    }
}
