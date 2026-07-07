package p222z3;

/* renamed from: z3.d */
/* loaded from: classes.dex */
public final class C2445d extends p222z3.C2449h implements p222z3.InterfaceC2442a {

    /* renamed from: g */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f9605g = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p222z3.C2445d.class, java.lang.Object.class, "owner");
    private volatile java.lang.Object owner;

    public C2445d(boolean z4) {
        super(z4 ? 1 : 0);
        this.owner = z4 ? null : p222z3.AbstractC2446e.f9606a;
    }

    /* renamed from: c */
    public final java.lang.Object m4681c(p120d3.AbstractC1292b abstractC1292b) {
        boolean m4682d = m4682d(null);
        p100Z2.C0934g c0934g = p100Z2.C0934g.f3298a;
        if (m4682d) {
            return c0934g;
        }
        p187r3.C2108f m4244c = p187r3.AbstractC2131v.m4244c(p176p1.AbstractC1949a.m3902C(abstractC1292b));
        try {
            m4685a(new p222z3.C2444c(this, m4244c));
            java.lang.Object m4231u = m4244c.m4231u();
            p115c3.EnumC1252a enumC1252a = p115c3.EnumC1252a.f4880l;
            if (m4231u != enumC1252a) {
                m4231u = c0934g;
            }
            return m4231u == enumC1252a ? m4231u : c0934g;
        } catch (java.lang.Throwable th) {
            m4244c.m4222B();
            throw th;
        }
    }

    /* renamed from: d */
    public final boolean m4682d(java.lang.Object obj) {
        int i4;
        char c4;
        char c5;
        while (true) {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = p222z3.C2449h.f9613f;
            int i5 = atomicIntegerFieldUpdater.get(this);
            if (i5 > 1) {
                do {
                    i4 = atomicIntegerFieldUpdater.get(this);
                    if (i4 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 1));
            } else {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9605g;
                if (i5 <= 0) {
                    if (obj == null) {
                        break;
                    }
                    while (true) {
                        if (java.lang.Math.max(atomicIntegerFieldUpdater.get(this), 0) != 0) {
                            c5 = 0;
                            break;
                        }
                        java.lang.Object obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 != p222z3.AbstractC2446e.f9606a) {
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
            throw new java.lang.IllegalStateException("unexpected");
        }
        throw new java.lang.IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    /* renamed from: e */
    public final void m4683e(java.lang.Object obj) {
        while (java.lang.Math.max(p222z3.C2449h.f9613f.get(this), 0) == 0) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9605g;
            java.lang.Object obj2 = atomicReferenceFieldUpdater.get(this);
            p124e2.C1358f c1358f = p222z3.AbstractC2446e.f9606a;
            if (obj2 != c1358f) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c1358f)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    m4686b();
                    return;
                }
                throw new java.lang.IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new java.lang.IllegalStateException("This mutex is not locked");
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Mutex@");
        sb.append(p187r3.AbstractC2131v.m4243b(this));
        sb.append("[isLocked=");
        sb.append(java.lang.Math.max(p222z3.C2449h.f9613f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f9605g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
