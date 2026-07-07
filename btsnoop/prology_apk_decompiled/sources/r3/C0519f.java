package r3;

import b3.InterfaceC0190d;
import b3.InterfaceC0195i;
import c3.EnumC0225a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: r3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0519f extends A implements InterfaceC0518e, d3.c, l0 {

    /* renamed from: q, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f8150q = AtomicIntegerFieldUpdater.newUpdater(C0519f.class, "_decisionAndIndex");

    /* renamed from: r, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8151r = AtomicReferenceFieldUpdater.newUpdater(C0519f.class, Object.class, "_state");
    public static final AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(C0519f.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC0190d f8152o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC0195i f8153p;

    public C0519f(int i4, InterfaceC0190d interfaceC0190d) {
        super(i4);
        this.f8152o = interfaceC0190d;
        this.f8153p = interfaceC0190d.f();
        this._decisionAndIndex = 536870911;
        this._state = C0515b.f8145l;
    }

    public static Object D(c0 c0Var, Object obj, int i4, j3.l lVar) {
        if ((obj instanceof C0527n) || !AbstractC0534v.f(i4)) {
            return obj;
        }
        if (lVar != null || (c0Var instanceof D)) {
            return new C0526m(obj, c0Var instanceof D ? (D) c0Var : null, lVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void z(c0 c0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + c0Var + ", already has " + obj).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    public final void B() {
        InterfaceC0190d interfaceC0190d = this.f8152o;
        Throwable th = null;
        w3.h hVar = interfaceC0190d instanceof w3.h ? (w3.h) interfaceC0190d : null;
        if (hVar == null) {
            return;
        }
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w3.h.s;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            e2.f fVar = w3.a.f8911d;
            if (obj != fVar) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                }
                th = (Throwable) obj;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(hVar, fVar, this)) {
                if (atomicReferenceFieldUpdater.get(hVar) != fVar) {
                    break;
                }
            }
        }
        if (th == null) {
            return;
        }
        r();
        q(th);
    }

    public final void C(Object obj, int i4, j3.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8151r;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof c0) {
                Object D4 = D((c0) obj2, obj, i4, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, D4)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!y()) {
                    r();
                }
                s(i4);
                return;
            }
            if (obj2 instanceof C0520g) {
                C0520g c0520g = (C0520g) obj2;
                c0520g.getClass();
                if (C0520g.f8154c.compareAndSet(c0520g, 0, 1)) {
                    if (lVar != null) {
                        m(lVar, c0520g.f8167a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    @Override // r3.l0
    public final void a(w3.u uVar, int i4) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i5;
        do {
            atomicIntegerFieldUpdater = f8150q;
            i5 = atomicIntegerFieldUpdater.get(this);
            if ((i5 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, ((i5 >> 29) << 29) + i4));
        x(uVar);
    }

    @Override // r3.A
    public final void b(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8151r;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof c0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0527n) {
                return;
            }
            if (!(obj2 instanceof C0526m)) {
                C0526m c0526m = new C0526m(obj2, (D) null, (j3.l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0526m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0526m c0526m2 = (C0526m) obj2;
            if (c0526m2.f8165e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0526m a4 = C0526m.a(c0526m2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a4)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            D d4 = c0526m2.f8162b;
            if (d4 != null) {
                k(d4, cancellationException);
            }
            j3.l lVar = c0526m2.f8163c;
            if (lVar != null) {
                m(lVar, cancellationException);
                return;
            }
            return;
        }
    }

    @Override // r3.A
    public final InterfaceC0190d c() {
        return this.f8152o;
    }

    @Override // d3.c
    public final d3.c d() {
        InterfaceC0190d interfaceC0190d = this.f8152o;
        if (interfaceC0190d instanceof d3.c) {
            return (d3.c) interfaceC0190d;
        }
        return null;
    }

    @Override // r3.A
    public final Throwable e(Object obj) {
        Throwable e4 = super.e(obj);
        if (e4 != null) {
            return e4;
        }
        return null;
    }

    @Override // b3.InterfaceC0190d
    public final InterfaceC0195i f() {
        return this.f8153p;
    }

    @Override // r3.A
    public final Object g(Object obj) {
        return obj instanceof C0526m ? ((C0526m) obj).f8161a : obj;
    }

    @Override // b3.InterfaceC0190d
    public final void i(Object obj) {
        Throwable a4 = Z2.d.a(obj);
        if (a4 != null) {
            obj = new C0527n(a4, false);
        }
        C(obj, this.f8109n, null);
    }

    @Override // r3.A
    public final Object j() {
        return f8151r.get(this);
    }

    public final void k(D d4, Throwable th) {
        try {
            d4.a(th);
        } catch (Throwable th2) {
            AbstractC0534v.d(this.f8153p, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // r3.InterfaceC0518e
    public final void l(Object obj, j3.l lVar) {
        C(obj, this.f8109n, lVar);
    }

    public final void m(j3.l lVar, Throwable th) {
        try {
            lVar.b(th);
        } catch (Throwable th2) {
            AbstractC0534v.d(this.f8153p, new RuntimeException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // r3.InterfaceC0518e
    public final e2.f n(Object obj, j3.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8151r;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z4 = obj2 instanceof c0;
            e2.f fVar = AbstractC0534v.f8179a;
            if (!z4) {
                boolean z5 = obj2 instanceof C0526m;
                return null;
            }
            Object D4 = D((c0) obj2, obj, this.f8109n, lVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, D4)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (y()) {
                return fVar;
            }
            r();
            return fVar;
        }
    }

    @Override // r3.InterfaceC0518e
    public final void o(Object obj) {
        s(this.f8109n);
    }

    public final void p(w3.u uVar, Throwable th) {
        InterfaceC0195i interfaceC0195i = this.f8153p;
        int i4 = f8150q.get(this) & 536870911;
        if (i4 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            uVar.g(i4, interfaceC0195i);
        } catch (Throwable th2) {
            AbstractC0534v.d(interfaceC0195i, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void q(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8151r;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof c0) {
                C0520g c0520g = new C0520g(this, th, (obj instanceof D) || (obj instanceof w3.u));
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0520g)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                c0 c0Var = (c0) obj;
                if (c0Var instanceof D) {
                    k((D) obj, th);
                } else if (c0Var instanceof w3.u) {
                    p((w3.u) obj, th);
                }
                if (!y()) {
                    r();
                }
                s(this.f8109n);
                return;
            }
            return;
        }
    }

    public final void r() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s;
        C c4 = (C) atomicReferenceFieldUpdater.get(this);
        if (c4 == null) {
            return;
        }
        c4.d();
        atomicReferenceFieldUpdater.set(this, b0.f8146l);
    }

    public final void s(int i4) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i5;
        do {
            atomicIntegerFieldUpdater = f8150q;
            i5 = atomicIntegerFieldUpdater.get(this);
            int i6 = i5 >> 29;
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z4 = i4 == 4;
                InterfaceC0190d interfaceC0190d = this.f8152o;
                if (z4 || !(interfaceC0190d instanceof w3.h) || AbstractC0534v.f(i4) != AbstractC0534v.f(this.f8109n)) {
                    AbstractC0534v.i(this, interfaceC0190d, z4);
                    return;
                }
                AbstractC0531s abstractC0531s = ((w3.h) interfaceC0190d).f8921o;
                InterfaceC0195i f4 = ((w3.h) interfaceC0190d).f8922p.f();
                if (abstractC0531s.f()) {
                    abstractC0531s.e(f4, this);
                    return;
                }
                H a4 = h0.a();
                if (a4.f8117n >= 4294967296L) {
                    a3.b bVar = a4.f8119p;
                    if (bVar == null) {
                        bVar = new a3.b();
                        a4.f8119p = bVar;
                    }
                    bVar.addLast(this);
                    return;
                }
                a4.i(true);
                try {
                    AbstractC0534v.i(this, interfaceC0190d, true);
                    do {
                    } while (a4.n());
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, 1073741824 + (536870911 & i5)));
    }

    public Throwable t(Z z4) {
        return z4.A();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(A());
        sb.append('(');
        sb.append(AbstractC0534v.k(this.f8152o));
        sb.append("){");
        Object obj = f8151r.get(this);
        sb.append(obj instanceof c0 ? "Active" : obj instanceof C0520g ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0534v.b(this));
        return sb.toString();
    }

    public final Object u() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        boolean y4 = y();
        do {
            atomicIntegerFieldUpdater = f8150q;
            i4 = atomicIntegerFieldUpdater.get(this);
            int i5 = i4 >> 29;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (y4) {
                    B();
                }
                Object obj = f8151r.get(this);
                if (obj instanceof C0527n) {
                    throw ((C0527n) obj).f8167a;
                }
                if (AbstractC0534v.f(this.f8109n)) {
                    P p2 = (P) this.f8153p.j(C0532t.f8178m);
                    if (p2 != null && !p2.a()) {
                        CancellationException A4 = ((Z) p2).A();
                        b(obj, A4);
                        throw A4;
                    }
                }
                return g(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 536870912 + (536870911 & i4)));
        if (((C) s.get(this)) == null) {
            w();
        }
        if (y4) {
            B();
        }
        return EnumC0225a.f4710l;
    }

    public final void v() {
        C w = w();
        if (w == null || (f8151r.get(this) instanceof c0)) {
            return;
        }
        w.d();
        s.set(this, b0.f8146l);
    }

    public final C w() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        P p2 = (P) this.f8153p.j(C0532t.f8178m);
        if (p2 == null) {
            return null;
        }
        C e4 = AbstractC0534v.e(p2, true, new C0521h(this), 2);
        do {
            atomicReferenceFieldUpdater = s;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, e4)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return e4;
    }

    public final void x(c0 c0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8151r;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0515b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof D ? true : obj instanceof w3.u) {
                z(c0Var, obj);
                throw null;
            }
            if (obj instanceof C0527n) {
                C0527n c0527n = (C0527n) obj;
                c0527n.getClass();
                if (!C0527n.f8166b.compareAndSet(c0527n, 0, 1)) {
                    z(c0Var, obj);
                    throw null;
                }
                if (obj instanceof C0520g) {
                    if (!(obj instanceof C0527n)) {
                        c0527n = null;
                    }
                    Throwable th = c0527n != null ? c0527n.f8167a : null;
                    if (c0Var instanceof D) {
                        k((D) c0Var, th);
                        return;
                    } else {
                        k3.h.c(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        p((w3.u) c0Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0526m)) {
                if (c0Var instanceof w3.u) {
                    return;
                }
                k3.h.c(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0526m c0526m = new C0526m(obj, (D) c0Var, (j3.l) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0526m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0526m c0526m2 = (C0526m) obj;
            if (c0526m2.f8162b != null) {
                z(c0Var, obj);
                throw null;
            }
            if (c0Var instanceof w3.u) {
                return;
            }
            k3.h.c(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            D d4 = (D) c0Var;
            Throwable th2 = c0526m2.f8165e;
            if (th2 != null) {
                k(d4, th2);
                return;
            }
            C0526m a4 = C0526m.a(c0526m2, d4, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a4)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean y() {
        if (this.f8109n == 2) {
            InterfaceC0190d interfaceC0190d = this.f8152o;
            k3.h.c(interfaceC0190d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (w3.h.s.get((w3.h) interfaceC0190d) != null) {
                return true;
            }
        }
        return false;
    }
}
