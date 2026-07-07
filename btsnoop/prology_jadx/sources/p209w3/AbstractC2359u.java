package p209w3;

/* renamed from: w3.u */
/* loaded from: classes.dex */
public abstract class AbstractC2359u extends p209w3.AbstractC2342d implements p187r3.InterfaceC2103c0 {

    /* renamed from: o */
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f9307o = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p209w3.AbstractC2359u.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* renamed from: n */
    public final long f9308n;

    public AbstractC2359u(long j4, p209w3.AbstractC2359u abstractC2359u, int i4) {
        super(abstractC2359u);
        this.f9308n = j4;
        this.cleanedAndPointers = i4 << 16;
    }

    @Override // p209w3.AbstractC2342d
    /* renamed from: c */
    public final boolean mo4554c() {
        return f9307o.get(this) == mo4375f() && m4553b() != null;
    }

    /* renamed from: e */
    public final boolean m4572e() {
        return f9307o.addAndGet(this, -65536) == mo4375f() && m4553b() != null;
    }

    /* renamed from: f */
    public abstract int mo4375f();

    /* renamed from: g */
    public abstract void mo4376g(int i4, p110b3.InterfaceC1195i interfaceC1195i);

    /* renamed from: h */
    public final void m4573h() {
        if (f9307o.incrementAndGet(this) == mo4375f()) {
            m4555d();
        }
    }

    /* renamed from: i */
    public final boolean m4574i() {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = f9307o;
            i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 == mo4375f() && m4553b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 65536 + i4));
        return true;
    }
}
