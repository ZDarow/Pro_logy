package w3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8916l = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_next");

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8917m = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public d(u uVar) {
        this._prev = uVar;
    }

    public final void a() {
        f8917m.lazySet(this, null);
    }

    public final d b() {
        Object obj = f8916l.get(this);
        if (obj == a.f8909b) {
            return null;
        }
        return (d) obj;
    }

    public abstract boolean c();

    public final void d() {
        d b4;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8917m;
            d dVar = (d) atomicReferenceFieldUpdater.get(this);
            while (dVar != null && dVar.c()) {
                dVar = (d) atomicReferenceFieldUpdater.get(dVar);
            }
            d b5 = b();
            k3.h.b(b5);
            while (b5.c() && (b4 = b5.b()) != null) {
                b5 = b4;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(b5);
                d dVar2 = ((d) obj) == null ? null : dVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(b5, obj, dVar2)) {
                    if (atomicReferenceFieldUpdater.get(b5) != obj) {
                        break;
                    }
                }
            }
            if (dVar != null) {
                f8916l.set(dVar, b5);
            }
            if (!b5.c() || b5.b() == null) {
                if (dVar == null || !dVar.c()) {
                    return;
                }
            }
        }
    }
}
