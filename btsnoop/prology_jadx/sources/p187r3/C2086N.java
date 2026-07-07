package p187r3;

/* renamed from: r3.N */
/* loaded from: classes.dex */
public final class C2086N extends p187r3.AbstractC2090S {

    /* renamed from: q */
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f8439q = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p187r3.C2086N.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: p */
    public final p149j3.InterfaceC1737l f8440p;

    public C2086N(p149j3.InterfaceC1737l interfaceC1737l) {
        this.f8440p = interfaceC1737l;
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
        if (f8439q.compareAndSet(this, 0, 1)) {
            this.f8440p.mo661b(th);
        }
    }
}
