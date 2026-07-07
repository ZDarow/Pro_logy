package p195t3;

/* renamed from: t3.n */
/* loaded from: classes.dex */
public final class C2201n extends p187r3.AbstractC2098a implements p195t3.InterfaceC2202o, p195t3.InterfaceC2193f {

    /* renamed from: o */
    public final p195t3.C2189b f8806o;

    public C2201n(p110b3.InterfaceC1195i interfaceC1195i, p195t3.C2189b c2189b) {
        super(interfaceC1195i, true);
        this.f8806o = c2189b;
    }

    @Override // p187r3.AbstractC2098a
    /* renamed from: U */
    public final void mo4212U(java.lang.Throwable th, boolean z4) {
        if (this.f8806o.m4355h(th, false) || z4) {
            return;
        }
        p187r3.AbstractC2131v.m4245d(this.f8461n, th);
    }

    @Override // p187r3.AbstractC2098a
    /* renamed from: V */
    public final void mo4213V(java.lang.Object obj) {
        this.f8806o.m4355h(null, false);
    }

    /* renamed from: X */
    public final void m4383X(p035I.C0260L c0260l) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        p195t3.C2189b c2189b = this.f8806o;
        c2189b.getClass();
        do {
            atomicReferenceFieldUpdater = p195t3.C2189b.f8772v;
            if (atomicReferenceFieldUpdater.compareAndSet(c2189b, null, c0260l)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(c2189b) == null);
        while (true) {
            java.lang.Object obj = atomicReferenceFieldUpdater.get(c2189b);
            p124e2.C1358f c1358f = p195t3.AbstractC2191d.f8792q;
            if (obj != c1358f) {
                if (obj == p195t3.AbstractC2191d.f8793r) {
                    throw new java.lang.IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new java.lang.IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            p124e2.C1358f c1358f2 = p195t3.AbstractC2191d.f8793r;
            while (!atomicReferenceFieldUpdater.compareAndSet(c2189b, c1358f, c1358f2)) {
                if (atomicReferenceFieldUpdater.get(c2189b) != c1358f) {
                    break;
                }
            }
            c0260l.mo661b(c2189b.m4360m());
            return;
        }
    }

    @Override // p187r3.C2097Z, p187r3.InterfaceC2088P
    /* renamed from: b */
    public final void mo4170b(java.util.concurrent.CancellationException cancellationException) {
        java.lang.Object m4187E = m4187E();
        if (m4187E instanceof p187r3.C2123n) {
            return;
        }
        if ((m4187E instanceof p187r3.C2095X) && ((p187r3.C2095X) m4187E).m4178d()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new p187r3.C2089Q(mo4207v(), null, this);
        }
        mo4205t(cancellationException);
    }

    @Override // p195t3.InterfaceC2204q
    /* renamed from: e */
    public final java.lang.Object mo4352e(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        return this.f8806o.mo4352e(interfaceC1190d, obj);
    }

    @Override // p195t3.InterfaceC2204q
    /* renamed from: g */
    public final java.lang.Object mo4354g(java.lang.Object obj) {
        return this.f8806o.mo4354g(obj);
    }

    @Override // p187r3.C2097Z
    /* renamed from: t */
    public final void mo4205t(java.util.concurrent.CancellationException cancellationException) {
        this.f8806o.m4355h(cancellationException, true);
        m4204s(cancellationException);
    }
}
