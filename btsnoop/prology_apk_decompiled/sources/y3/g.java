package y3;

import b3.InterfaceC0195i;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import r3.I;

/* loaded from: classes.dex */
public abstract class g extends I {

    /* renamed from: n, reason: collision with root package name */
    public b f9168n;

    @Override // r3.AbstractC0531s
    public final void e(InterfaceC0195i interfaceC0195i, Runnable runnable) {
        b bVar = this.f9168n;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.s;
        bVar.b(runnable, j.f9178g, false);
    }
}
