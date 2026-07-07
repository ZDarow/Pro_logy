package z3;

import I.L;
import j3.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r3.InterfaceC0518e;
import w3.u;

/* loaded from: classes.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f9244b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f9245c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f9246d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f9247e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f9248f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a, reason: collision with root package name */
    public final L f9249a;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public h(int i4) {
        if (i4 < 0 || i4 > 1) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        j jVar = new j(0L, null, 2);
        this.head = jVar;
        this.tail = jVar;
        this._availablePermits = 1 - i4;
        this.f9249a = new L(2, this);
    }

    public final void a(c cVar) {
        Object c4;
        f fVar;
        long j4;
        while (true) {
            int andDecrement = f9248f.getAndDecrement(this);
            if (andDecrement <= 1) {
                Object obj = Z2.g.f3186a;
                l lVar = this.f9249a;
                if (andDecrement > 0) {
                    cVar.l(obj, lVar);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9246d;
                j jVar = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f9247e.getAndIncrement(this);
                f fVar2 = f.f9242t;
                long j5 = andIncrement / i.f9255f;
                while (true) {
                    c4 = w3.a.c(jVar, j5, fVar2);
                    if (!w3.a.f(c4)) {
                        u d4 = w3.a.d(c4);
                        while (true) {
                            u uVar = (u) atomicReferenceFieldUpdater.get(this);
                            fVar = fVar2;
                            j4 = j5;
                            if (uVar.f8949n >= d4.f8949n) {
                                break;
                            }
                            if (!d4.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, d4)) {
                                if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                    if (d4.e()) {
                                        d4.d();
                                    }
                                    fVar2 = fVar;
                                    j5 = j4;
                                }
                            }
                            if (uVar.e()) {
                                uVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                    fVar2 = fVar;
                    j5 = j4;
                }
                j jVar2 = (j) w3.a.d(c4);
                int i4 = (int) (andIncrement % i.f9255f);
                AtomicReferenceArray atomicReferenceArray = jVar2.f9256p;
                while (!atomicReferenceArray.compareAndSet(i4, null, cVar)) {
                    if (atomicReferenceArray.get(i4) != null) {
                        e2.f fVar3 = i.f9251b;
                        e2.f fVar4 = i.f9252c;
                        while (!atomicReferenceArray.compareAndSet(i4, fVar3, fVar4)) {
                            if (atomicReferenceArray.get(i4) != fVar3) {
                                break;
                            }
                        }
                        cVar.l(obj, lVar);
                        return;
                    }
                }
                cVar.a(jVar2, i4);
                return;
            }
        }
    }

    public final void b() {
        boolean z4;
        int i4;
        Object c4;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9248f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z4 = true;
            if (andIncrement >= 1) {
                do {
                    i4 = atomicIntegerFieldUpdater.get(this);
                    if (i4 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9244b;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f9245c.getAndIncrement(this);
            long j4 = andIncrement2 / i.f9255f;
            g gVar = g.f9243t;
            while (true) {
                c4 = w3.a.c(jVar, j4, gVar);
                if (!w3.a.f(c4)) {
                    u d4 = w3.a.d(c4);
                    while (true) {
                        u uVar = (u) atomicReferenceFieldUpdater.get(this);
                        if (uVar.f8949n >= d4.f8949n) {
                            break;
                        }
                        if (!d4.i()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, d4)) {
                            if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                if (d4.e()) {
                                    d4.d();
                                }
                            }
                        }
                        if (uVar.e()) {
                            uVar.d();
                        }
                    }
                } else {
                    break;
                }
            }
            j jVar2 = (j) w3.a.d(c4);
            jVar2.a();
            boolean z5 = false;
            if (jVar2.f8949n <= j4) {
                int i5 = (int) (andIncrement2 % i.f9255f);
                e2.f fVar = i.f9251b;
                AtomicReferenceArray atomicReferenceArray = jVar2.f9256p;
                Object andSet = atomicReferenceArray.getAndSet(i5, fVar);
                if (andSet == null) {
                    int i6 = i.f9250a;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= i6) {
                            e2.f fVar2 = i.f9251b;
                            e2.f fVar3 = i.f9253d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i5, fVar2, fVar3)) {
                                    z5 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i5) != fVar2) {
                                    break;
                                }
                            }
                            z4 = true ^ z5;
                        } else if (atomicReferenceArray.get(i5) == i.f9252c) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                } else if (andSet != i.f9254e) {
                    if (!(andSet instanceof InterfaceC0518e)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0518e interfaceC0518e = (InterfaceC0518e) andSet;
                    e2.f n4 = interfaceC0518e.n(Z2.g.f3186a, this.f9249a);
                    if (n4 != null) {
                        interfaceC0518e.o(n4);
                    }
                }
            }
            z4 = false;
        } while (!z4);
    }
}
