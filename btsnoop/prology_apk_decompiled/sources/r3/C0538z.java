package r3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p1.AbstractC0462a;

/* renamed from: r3.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0538z extends w3.t {

    /* renamed from: p, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f8191p = AtomicIntegerFieldUpdater.newUpdater(C0538z.class, "_decision");
    private volatile int _decision;

    @Override // w3.t, r3.Z
    public final void q(Object obj) {
        r(obj);
    }

    @Override // w3.t, r3.Z
    public final void r(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f8191p;
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                w3.a.i(AbstractC0462a.C(this.f8947o), AbstractC0534v.h(obj), null);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
