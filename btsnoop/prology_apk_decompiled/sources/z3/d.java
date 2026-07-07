package z3;

import c3.EnumC0225a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p1.AbstractC0462a;
import r3.AbstractC0534v;
import r3.C0519f;

/* loaded from: classes.dex */
public final class d extends h implements a {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f9240g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner");
    private volatile Object owner;

    public d(boolean z4) {
        super(z4 ? 1 : 0);
        this.owner = z4 ? null : e.f9241a;
    }

    public final Object c(d3.b bVar) {
        boolean d4 = d(null);
        Z2.g gVar = Z2.g.f3186a;
        if (d4) {
            return gVar;
        }
        C0519f c4 = AbstractC0534v.c(AbstractC0462a.C(bVar));
        try {
            a(new c(this, c4));
            Object u4 = c4.u();
            EnumC0225a enumC0225a = EnumC0225a.f4710l;
            if (u4 != enumC0225a) {
                u4 = gVar;
            }
            return u4 == enumC0225a ? u4 : gVar;
        } catch (Throwable th) {
            c4.B();
            throw th;
        }
    }

    public final boolean d(Object obj) {
        int i4;
        char c4;
        char c5;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f9248f;
            int i5 = atomicIntegerFieldUpdater.get(this);
            if (i5 > 1) {
                do {
                    i4 = atomicIntegerFieldUpdater.get(this);
                    if (i4 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 1));
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9240g;
                if (i5 <= 0) {
                    if (obj == null) {
                        break;
                    }
                    while (true) {
                        if (Math.max(atomicIntegerFieldUpdater.get(this), 0) != 0) {
                            c5 = 0;
                            break;
                        }
                        Object obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 != e.f9241a) {
                            c5 = obj2 == obj ? (char) 1 : (char) 2;
                        }
                    }
                    if (c5 == 1) {
                        c4 = 2;
                        break;
                    }
                    if (c5 == 2) {
                        break;
                    }
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i5, i5 - 1)) {
                    atomicReferenceFieldUpdater.set(this, obj);
                    c4 = 0;
                    break;
                }
            }
        }
        c4 = 1;
        if (c4 == 0) {
            return true;
        }
        if (c4 == 1) {
            return false;
        }
        if (c4 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public final void e(Object obj) {
        while (Math.max(h.f9248f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9240g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            e2.f fVar = e.f9241a;
            if (obj2 != fVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, fVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(AbstractC0534v.b(this));
        sb.append("[isLocked=");
        sb.append(Math.max(h.f9248f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f9240g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
