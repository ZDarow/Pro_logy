package p222z3;

/* renamed from: z3.h */
/* loaded from: classes.dex */
public class C2449h {

    /* renamed from: b */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f9609b = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p222z3.C2449h.class, java.lang.Object.class, "head");

    /* renamed from: c */
    public static final java.util.concurrent.atomic.AtomicLongFieldUpdater f9610c = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(p222z3.C2449h.class, "deqIdx");

    /* renamed from: d */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f9611d = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p222z3.C2449h.class, java.lang.Object.class, "tail");

    /* renamed from: e */
    public static final java.util.concurrent.atomic.AtomicLongFieldUpdater f9612e = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(p222z3.C2449h.class, "enqIdx");

    /* renamed from: f */
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f9613f = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p222z3.C2449h.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a */
    public final p035I.C0260L f9614a;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile java.lang.Object head;
    private volatile java.lang.Object tail;

    public C2449h(int i4) {
        if (i4 < 0 || i4 > 1) {
            throw new java.lang.IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        p222z3.C2451j c2451j = new p222z3.C2451j(0L, null, 2);
        this.head = c2451j;
        this.tail = c2451j;
        this._availablePermits = 1 - i4;
        this.f9614a = new p035I.C0260L(2, this);
    }

    /* renamed from: a */
    public final void m4685a(p222z3.C2444c c2444c) {
        java.lang.Object m4540c;
        p222z3.C2447f c2447f;
        long j4;
        while (true) {
            int andDecrement = f9613f.getAndDecrement(this);
            if (andDecrement <= 1) {
                java.lang.Object obj = p100Z2.C0934g.f3298a;
                p149j3.InterfaceC1737l interfaceC1737l = this.f9614a;
                if (andDecrement > 0) {
                    c2444c.mo4217l(obj, interfaceC1737l);
                    return;
                }
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9611d;
                p222z3.C2451j c2451j = (p222z3.C2451j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f9612e.getAndIncrement(this);
                p222z3.C2447f c2447f2 = p222z3.C2447f.f9607t;
                long j5 = andIncrement / p222z3.AbstractC2450i.f9620f;
                while (true) {
                    m4540c = p209w3.AbstractC2339a.m4540c(c2451j, j5, c2447f2);
                    if (!p209w3.AbstractC2339a.m4543f(m4540c)) {
                        p209w3.AbstractC2359u m4541d = p209w3.AbstractC2339a.m4541d(m4540c);
                        while (true) {
                            p209w3.AbstractC2359u abstractC2359u = (p209w3.AbstractC2359u) atomicReferenceFieldUpdater.get(this);
                            c2447f = c2447f2;
                            j4 = j5;
                            if (abstractC2359u.f9308n >= m4541d.f9308n) {
                                break;
                            }
                            if (!m4541d.m4574i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC2359u, m4541d)) {
                                if (atomicReferenceFieldUpdater.get(this) != abstractC2359u) {
                                    if (m4541d.m4572e()) {
                                        m4541d.m4555d();
                                    }
                                    c2447f2 = c2447f;
                                    j5 = j4;
                                }
                            }
                            if (abstractC2359u.m4572e()) {
                                abstractC2359u.m4555d();
                            }
                        }
                    } else {
                        break;
                    }
                    c2447f2 = c2447f;
                    j5 = j4;
                }
                p222z3.C2451j c2451j2 = (p222z3.C2451j) p209w3.AbstractC2339a.m4541d(m4540c);
                int i4 = (int) (andIncrement % p222z3.AbstractC2450i.f9620f);
                java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = c2451j2.f9621p;
                while (!atomicReferenceArray.compareAndSet(i4, null, c2444c)) {
                    if (atomicReferenceArray.get(i4) != null) {
                        p124e2.C1358f c1358f = p222z3.AbstractC2450i.f9616b;
                        p124e2.C1358f c1358f2 = p222z3.AbstractC2450i.f9617c;
                        while (!atomicReferenceArray.compareAndSet(i4, c1358f, c1358f2)) {
                            if (atomicReferenceArray.get(i4) != c1358f) {
                                break;
                            }
                        }
                        c2444c.mo4217l(obj, interfaceC1737l);
                        return;
                    }
                }
                c2444c.mo4224a(c2451j2, i4);
                return;
            }
        }
    }

    /* renamed from: b */
    public final void m4686b() {
        boolean z4;
        int i4;
        java.lang.Object m4540c;
        do {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9613f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z4 = true;
            if (andIncrement >= 1) {
                do {
                    i4 = atomicIntegerFieldUpdater.get(this);
                    if (i4 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 1));
                throw new java.lang.IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9609b;
            p222z3.C2451j c2451j = (p222z3.C2451j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f9610c.getAndIncrement(this);
            long j4 = andIncrement2 / p222z3.AbstractC2450i.f9620f;
            p222z3.C2448g c2448g = p222z3.C2448g.f9608t;
            while (true) {
                m4540c = p209w3.AbstractC2339a.m4540c(c2451j, j4, c2448g);
                if (!p209w3.AbstractC2339a.m4543f(m4540c)) {
                    p209w3.AbstractC2359u m4541d = p209w3.AbstractC2339a.m4541d(m4540c);
                    while (true) {
                        p209w3.AbstractC2359u abstractC2359u = (p209w3.AbstractC2359u) atomicReferenceFieldUpdater.get(this);
                        if (abstractC2359u.f9308n >= m4541d.f9308n) {
                            break;
                        }
                        if (!m4541d.m4574i()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC2359u, m4541d)) {
                            if (atomicReferenceFieldUpdater.get(this) != abstractC2359u) {
                                if (m4541d.m4572e()) {
                                    m4541d.m4555d();
                                }
                            }
                        }
                        if (abstractC2359u.m4572e()) {
                            abstractC2359u.m4555d();
                        }
                    }
                } else {
                    break;
                }
            }
            p222z3.C2451j c2451j2 = (p222z3.C2451j) p209w3.AbstractC2339a.m4541d(m4540c);
            c2451j2.m4552a();
            boolean z5 = false;
            if (c2451j2.f9308n <= j4) {
                int i5 = (int) (andIncrement2 % p222z3.AbstractC2450i.f9620f);
                p124e2.C1358f c1358f = p222z3.AbstractC2450i.f9616b;
                java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = c2451j2.f9621p;
                java.lang.Object andSet = atomicReferenceArray.getAndSet(i5, c1358f);
                if (andSet == null) {
                    int i6 = p222z3.AbstractC2450i.f9615a;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= i6) {
                            p124e2.C1358f c1358f2 = p222z3.AbstractC2450i.f9616b;
                            p124e2.C1358f c1358f3 = p222z3.AbstractC2450i.f9618d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i5, c1358f2, c1358f3)) {
                                    z5 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i5) != c1358f2) {
                                    break;
                                }
                            }
                            z4 = true ^ z5;
                        } else if (atomicReferenceArray.get(i5) == p222z3.AbstractC2450i.f9617c) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                } else if (andSet != p222z3.AbstractC2450i.f9619e) {
                    if (!(andSet instanceof p187r3.InterfaceC2106e)) {
                        throw new java.lang.IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    p187r3.InterfaceC2106e interfaceC2106e = (p187r3.InterfaceC2106e) andSet;
                    p124e2.C1358f mo4218n = interfaceC2106e.mo4218n(p100Z2.C0934g.f3298a, this.f9614a);
                    if (mo4218n != null) {
                        interfaceC2106e.mo4219o(mo4218n);
                    }
                }
            }
            z4 = false;
        } while (!z4);
    }
}
