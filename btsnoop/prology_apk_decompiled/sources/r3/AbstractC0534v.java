package r3;

import a.AbstractC0110a;
import b3.C0191e;
import b3.C0196j;
import b3.InterfaceC0190d;
import b3.InterfaceC0195i;
import c3.EnumC0225a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p1.AbstractC0462a;
import u.AbstractC0579g;
import u.AbstractC0580h;

/* renamed from: r3.v */
/* loaded from: classes.dex */
public abstract class AbstractC0534v {

    /* renamed from: a */
    public static final e2.f f8179a = new e2.f("RESUME_TOKEN", 1);

    /* renamed from: b */
    public static final e2.f f8180b = new e2.f("CLOSED_EMPTY", 1);

    /* renamed from: c */
    public static final e2.f f8181c = new e2.f("COMPLETING_ALREADY", 1);

    /* renamed from: d */
    public static final e2.f f8182d = new e2.f("COMPLETING_WAITING_CHILDREN", 1);

    /* renamed from: e */
    public static final e2.f f8183e = new e2.f("COMPLETING_RETRY", 1);

    /* renamed from: f */
    public static final e2.f f8184f = new e2.f("TOO_LATE_TO_CANCEL", 1);

    /* renamed from: g */
    public static final e2.f f8185g = new e2.f("SEALED", 1);

    /* renamed from: h */
    public static final E f8186h = new E(false);

    /* renamed from: i */
    public static final E f8187i = new E(true);

    public static final InterfaceC0195i a(InterfaceC0195i interfaceC0195i, InterfaceC0195i interfaceC0195i2, boolean z4) {
        Boolean bool = Boolean.FALSE;
        C0529p c0529p = C0529p.f8171o;
        boolean booleanValue = ((Boolean) interfaceC0195i.k(bool, c0529p)).booleanValue();
        boolean booleanValue2 = ((Boolean) interfaceC0195i2.k(bool, c0529p)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return interfaceC0195i.c(interfaceC0195i2);
        }
        C0196j c0196j = C0196j.f4462l;
        InterfaceC0195i interfaceC0195i3 = (InterfaceC0195i) interfaceC0195i.k(c0196j, new C0529p(2, 2));
        Object obj = interfaceC0195i2;
        if (booleanValue2) {
            obj = interfaceC0195i2.k(c0196j, C0529p.f8170n);
        }
        return interfaceC0195i3.c((InterfaceC0195i) obj);
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0519f c(InterfaceC0190d interfaceC0190d) {
        C0519f c0519f;
        C0519f c0519f2;
        if (!(interfaceC0190d instanceof w3.h)) {
            return new C0519f(1, interfaceC0190d);
        }
        w3.h hVar = (w3.h) interfaceC0190d;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w3.h.s;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            e2.f fVar = w3.a.f8911d;
            c0519f = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, fVar);
                c0519f2 = null;
                break;
            }
            if (obj instanceof C0519f) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, fVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c0519f2 = (C0519f) obj;
                break loop0;
            }
            if (obj != fVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0519f2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0519f.f8151r;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0519f2);
            if (!(obj2 instanceof C0526m) || ((C0526m) obj2).f8164d == null) {
                C0519f.f8150q.set(c0519f2, 536870911);
                atomicReferenceFieldUpdater2.set(c0519f2, C0515b.f8145l);
                c0519f = c0519f2;
            } else {
                c0519f2.r();
            }
            if (c0519f != null) {
                return c0519f;
            }
        }
        return new C0519f(2, interfaceC0190d);
    }

    public static final void d(InterfaceC0195i interfaceC0195i, Throwable th) {
        try {
            s3.b bVar = (s3.b) interfaceC0195i.j(C0532t.f8177l);
            if (bVar != null) {
                bVar.e(interfaceC0195i, th);
            } else {
                w3.a.e(interfaceC0195i, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC0110a.c(runtimeException, th);
                th = runtimeException;
            }
            w3.a.e(interfaceC0195i, th);
        }
    }

    public static /* synthetic */ C e(P p2, boolean z4, U u4, int i4) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        return ((Z) p2).I(z4, (i4 & 2) != 0, u4);
    }

    public static final boolean f(int i4) {
        return i4 == 1 || i4 == 2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [r3.a, r3.e0] */
    public static e0 g(InterfaceC0533u interfaceC0533u, j3.p pVar) {
        InterfaceC0195i a4 = a(interfaceC0533u.h(), C0196j.f4462l, true);
        y3.d dVar = B.f8110a;
        if (a4 != dVar && a4.j(C0191e.f4461l) == null) {
            a4 = a4.c(dVar);
        }
        ?? abstractC0514a = new AbstractC0514a(a4, true);
        abstractC0514a.W(1, abstractC0514a, pVar);
        return abstractC0514a;
    }

    public static final Object h(Object obj) {
        return obj instanceof C0527n ? AbstractC0462a.s(((C0527n) obj).f8167a) : obj;
    }

    public static final void i(C0519f c0519f, InterfaceC0190d interfaceC0190d, boolean z4) {
        Object obj = C0519f.f8151r.get(c0519f);
        Throwable e4 = c0519f.e(obj);
        Object s = e4 != null ? AbstractC0462a.s(e4) : c0519f.g(obj);
        if (!z4) {
            interfaceC0190d.i(s);
            return;
        }
        k3.h.c(interfaceC0190d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        w3.h hVar = (w3.h) interfaceC0190d;
        d3.b bVar = hVar.f8922p;
        InterfaceC0195i f4 = bVar.f();
        Object m4 = w3.a.m(f4, hVar.f8924r);
        j0 m5 = m4 != w3.a.f8913f ? m(bVar, f4, m4) : null;
        try {
            bVar.i(s);
        } finally {
            if (m5 == null || m5.X()) {
                w3.a.h(f4, m4);
            }
        }
    }

    public static Object j(j3.p pVar) {
        C0196j c0196j = C0196j.f4462l;
        Thread currentThread = Thread.currentThread();
        C0191e c0191e = C0191e.f4461l;
        H a4 = h0.a();
        InterfaceC0195i a5 = a(c0196j, a4, true);
        y3.d dVar = B.f8110a;
        if (a5 != dVar && a5.j(c0191e) == null) {
            a5 = a5.c(dVar);
        }
        C0516c c0516c = new C0516c(a5, currentThread, a4);
        c0516c.W(1, c0516c, pVar);
        H h4 = c0516c.f8148p;
        if (h4 != null) {
            int i4 = H.f8116q;
            h4.i(false);
        }
        while (!Thread.interrupted()) {
            try {
                long l4 = h4 != null ? h4.l() : Long.MAX_VALUE;
                if (!(c0516c.E() instanceof L)) {
                    if (h4 != null) {
                        int i5 = H.f8116q;
                        h4.g(false);
                    }
                    Object l5 = l(c0516c.E());
                    C0527n c0527n = l5 instanceof C0527n ? (C0527n) l5 : null;
                    if (c0527n == null) {
                        return l5;
                    }
                    throw c0527n.f8167a;
                }
                LockSupport.parkNanos(c0516c, l4);
            } catch (Throwable th) {
                if (h4 != null) {
                    int i6 = H.f8116q;
                    h4.g(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0516c.s(interruptedException);
        throw interruptedException;
    }

    public static final String k(InterfaceC0190d interfaceC0190d) {
        Object s;
        if (interfaceC0190d instanceof w3.h) {
            return interfaceC0190d.toString();
        }
        try {
            s = interfaceC0190d + '@' + b(interfaceC0190d);
        } catch (Throwable th) {
            s = AbstractC0462a.s(th);
        }
        if (Z2.d.a(s) != null) {
            s = interfaceC0190d.getClass().getName() + '@' + b(interfaceC0190d);
        }
        return (String) s;
    }

    public static final Object l(Object obj) {
        L l4;
        M m4 = obj instanceof M ? (M) obj : null;
        return (m4 == null || (l4 = m4.f8122a) == null) ? obj : l4;
    }

    public static final j0 m(InterfaceC0190d interfaceC0190d, InterfaceC0195i interfaceC0195i, Object obj) {
        j0 j0Var = null;
        if (!(interfaceC0190d instanceof d3.c)) {
            return null;
        }
        if (interfaceC0195i.j(k0.f8160l) != null) {
            d3.c cVar = (d3.c) interfaceC0190d;
            while (true) {
                if ((cVar instanceof C0538z) || (cVar = cVar.d()) == null) {
                    break;
                }
                if (cVar instanceof j0) {
                    j0Var = (j0) cVar;
                    break;
                }
            }
            if (j0Var != null) {
                j0Var.Y(interfaceC0195i, obj);
            }
        }
        return j0Var;
    }

    public static final Object n(InterfaceC0195i interfaceC0195i, j3.p pVar, InterfaceC0190d interfaceC0190d) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        InterfaceC0195i f4 = interfaceC0190d.f();
        InterfaceC0195i c4 = !((Boolean) interfaceC0195i.k(Boolean.FALSE, C0529p.f8171o)).booleanValue() ? f4.c(interfaceC0195i) : a(f4, interfaceC0195i, false);
        P p2 = (P) c4.j(C0532t.f8178m);
        if (p2 != null && !p2.a()) {
            throw ((Z) p2).A();
        }
        if (c4 == f4) {
            w3.t tVar = new w3.t(interfaceC0190d, c4);
            return AbstractC0580h.e(tVar, tVar, pVar);
        }
        C0191e c0191e = C0191e.f4461l;
        if (k3.h.a(c4.j(c0191e), f4.j(c0191e))) {
            j0 j0Var = new j0(interfaceC0190d, c4);
            InterfaceC0195i interfaceC0195i2 = j0Var.f8144n;
            Object m4 = w3.a.m(interfaceC0195i2, null);
            try {
                return AbstractC0580h.e(j0Var, j0Var, pVar);
            } finally {
                w3.a.h(interfaceC0195i2, m4);
            }
        }
        w3.t tVar2 = new w3.t(interfaceC0190d, c4);
        AbstractC0579g.n(pVar, tVar2, tVar2);
        do {
            atomicIntegerFieldUpdater = C0538z.f8191p;
            int i4 = atomicIntegerFieldUpdater.get(tVar2);
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object l4 = l(tVar2.E());
                if (l4 instanceof C0527n) {
                    throw ((C0527n) l4).f8167a;
                }
                return l4;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(tVar2, 0, 1));
        return EnumC0225a.f4710l;
    }
}
