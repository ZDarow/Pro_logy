package p187r3;

/* renamed from: r3.c */
/* loaded from: classes.dex */
public final class C2102c extends p187r3.AbstractC2098a {

    /* renamed from: o */
    public final java.lang.Thread f8464o;

    /* renamed from: p */
    public final p187r3.AbstractC2080H f8465p;

    public C2102c(p110b3.InterfaceC1195i interfaceC1195i, java.lang.Thread thread, p187r3.AbstractC2080H abstractC2080H) {
        super(interfaceC1195i, true);
        this.f8464o = thread;
        this.f8465p = abstractC2080H;
    }

    @Override // p187r3.C2097Z
    /* renamed from: q */
    public final void mo4202q(java.lang.Object obj) {
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        java.lang.Thread thread = this.f8464o;
        if (p154k3.AbstractC1803h.m3775a(currentThread, thread)) {
            return;
        }
        java.util.concurrent.locks.LockSupport.unpark(thread);
    }
}
