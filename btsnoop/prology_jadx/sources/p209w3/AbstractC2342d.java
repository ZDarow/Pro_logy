package p209w3;

/* renamed from: w3.d */
/* loaded from: classes.dex */
public abstract class AbstractC2342d {

    /* renamed from: l */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f9274l = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p209w3.AbstractC2342d.class, java.lang.Object.class, "_next");

    /* renamed from: m */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f9275m = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p209w3.AbstractC2342d.class, java.lang.Object.class, "_prev");
    private volatile java.lang.Object _next;
    private volatile java.lang.Object _prev;

    public AbstractC2342d(p209w3.AbstractC2359u abstractC2359u) {
        this._prev = abstractC2359u;
    }

    /* renamed from: a */
    public final void m4552a() {
        f9275m.lazySet(this, null);
    }

    /* renamed from: b */
    public final p209w3.AbstractC2342d m4553b() {
        java.lang.Object obj = f9274l.get(this);
        if (obj == p209w3.AbstractC2339a.f9267b) {
            return null;
        }
        return (p209w3.AbstractC2342d) obj;
    }

    /* renamed from: c */
    public abstract boolean mo4554c();

    /* renamed from: d */
    public final void m4555d() {
        p209w3.AbstractC2342d m4553b;
        if (m4553b() == null) {
            return;
        }
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9275m;
            p209w3.AbstractC2342d abstractC2342d = (p209w3.AbstractC2342d) atomicReferenceFieldUpdater.get(this);
            while (abstractC2342d != null && abstractC2342d.mo4554c()) {
                abstractC2342d = (p209w3.AbstractC2342d) atomicReferenceFieldUpdater.get(abstractC2342d);
            }
            p209w3.AbstractC2342d m4553b2 = m4553b();
            p154k3.AbstractC1803h.m3776b(m4553b2);
            while (m4553b2.mo4554c() && (m4553b = m4553b2.m4553b()) != null) {
                m4553b2 = m4553b;
            }
            while (true) {
                java.lang.Object obj = atomicReferenceFieldUpdater.get(m4553b2);
                p209w3.AbstractC2342d abstractC2342d2 = ((p209w3.AbstractC2342d) obj) == null ? null : abstractC2342d;
                while (!atomicReferenceFieldUpdater.compareAndSet(m4553b2, obj, abstractC2342d2)) {
                    if (atomicReferenceFieldUpdater.get(m4553b2) != obj) {
                        break;
                    }
                }
            }
            if (abstractC2342d != null) {
                f9274l.set(abstractC2342d, m4553b2);
            }
            if (!m4553b2.mo4554c() || m4553b2.m4553b() == null) {
                if (abstractC2342d == null || !abstractC2342d.mo4554c()) {
                    return;
                }
            }
        }
    }
}
