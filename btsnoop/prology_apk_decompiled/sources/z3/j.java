package z3;

import b3.InterfaceC0195i;
import java.util.concurrent.atomic.AtomicReferenceArray;
import w3.u;

/* loaded from: classes.dex */
public final class j extends u {

    /* renamed from: p, reason: collision with root package name */
    public final AtomicReferenceArray f9256p;

    public j(long j4, j jVar, int i4) {
        super(j4, jVar, i4);
        this.f9256p = new AtomicReferenceArray(i.f9255f);
    }

    @Override // w3.u
    public final int f() {
        return i.f9255f;
    }

    @Override // w3.u
    public final void g(int i4, InterfaceC0195i interfaceC0195i) {
        this.f9256p.set(i4, i.f9254e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f8949n + ", hashCode=" + hashCode() + ']';
    }
}
