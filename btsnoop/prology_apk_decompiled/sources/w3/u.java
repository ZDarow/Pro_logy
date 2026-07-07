package w3;

import b3.InterfaceC0195i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import r3.c0;

/* loaded from: classes.dex */
public abstract class u extends d implements c0 {

    /* renamed from: o, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f8948o = AtomicIntegerFieldUpdater.newUpdater(u.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* renamed from: n, reason: collision with root package name */
    public final long f8949n;

    public u(long j4, u uVar, int i4) {
        super(uVar);
        this.f8949n = j4;
        this.cleanedAndPointers = i4 << 16;
    }

    @Override // w3.d
    public final boolean c() {
        return f8948o.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f8948o.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i4, InterfaceC0195i interfaceC0195i);

    public final void h() {
        if (f8948o.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = f8948o;
            i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 65536 + i4));
        return true;
    }
}
