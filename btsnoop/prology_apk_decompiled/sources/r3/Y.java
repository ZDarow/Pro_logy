package r3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class Y extends w3.b {

    /* renamed from: b, reason: collision with root package name */
    public final U f8138b;

    /* renamed from: c, reason: collision with root package name */
    public a0 f8139c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Z f8140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L f8141e;

    public Y(U u4, Z z4, L l4) {
        this.f8140d = z4;
        this.f8141e = l4;
        this.f8138b = u4;
    }

    @Override // w3.b
    public final void b(Object obj, Object obj2) {
        w3.k kVar = (w3.k) obj;
        boolean z4 = obj2 == null;
        U u4 = this.f8138b;
        Object obj3 = z4 ? u4 : this.f8139c;
        if (obj3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w3.k.f8930l;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, obj3)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z4) {
                a0 a0Var = this.f8139c;
                k3.h.b(a0Var);
                u4.j(a0Var);
            }
        }
    }

    @Override // w3.b
    public final e2.f c(Object obj) {
        if (this.f8140d.E() == this.f8141e) {
            return null;
        }
        return w3.a.f8912e;
    }
}
