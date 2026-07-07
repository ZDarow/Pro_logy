package p187r3;

/* renamed from: r3.Y */
/* loaded from: classes.dex */
public final class C2096Y extends p209w3.AbstractC2340b {

    /* renamed from: b */
    public final p187r3.AbstractC2092U f8455b;

    /* renamed from: c */
    public p187r3.C2099a0 f8456c;

    /* renamed from: d */
    public final /* synthetic */ p187r3.C2097Z f8457d;

    /* renamed from: e */
    public final /* synthetic */ p187r3.InterfaceC2084L f8458e;

    public C2096Y(p187r3.AbstractC2092U abstractC2092U, p187r3.C2097Z c2097z, p187r3.InterfaceC2084L interfaceC2084L) {
        this.f8457d = c2097z;
        this.f8458e = interfaceC2084L;
        this.f8455b = abstractC2092U;
    }

    @Override // p209w3.AbstractC2340b
    /* renamed from: b */
    public final void mo4181b(java.lang.Object obj, java.lang.Object obj2) {
        p209w3.C2349k c2349k = (p209w3.C2349k) obj;
        boolean z4 = obj2 == null;
        p187r3.AbstractC2092U abstractC2092U = this.f8455b;
        java.lang.Object obj3 = z4 ? abstractC2092U : this.f8456c;
        if (obj3 != null) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p209w3.C2349k.f9289l;
            while (!atomicReferenceFieldUpdater.compareAndSet(c2349k, this, obj3)) {
                if (atomicReferenceFieldUpdater.get(c2349k) != this) {
                    return;
                }
            }
            if (z4) {
                p187r3.C2099a0 c2099a0 = this.f8456c;
                p154k3.AbstractC1803h.m3776b(c2099a0);
                abstractC2092U.m4558j(c2099a0);
            }
        }
    }

    @Override // p209w3.AbstractC2340b
    /* renamed from: c */
    public final p124e2.C1358f mo4182c(java.lang.Object obj) {
        if (this.f8457d.m4187E() == this.f8458e) {
            return null;
        }
        return p209w3.AbstractC2339a.f9270e;
    }
}
