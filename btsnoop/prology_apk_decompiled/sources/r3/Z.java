package r3;

import a.AbstractC0110a;
import b3.InterfaceC0193g;
import b3.InterfaceC0194h;
import b3.InterfaceC0195i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class Z implements P, d0 {

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8142l = AtomicReferenceFieldUpdater.newUpdater(Z.class, Object.class, "_state");

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8143m = AtomicReferenceFieldUpdater.newUpdater(Z.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public Z(boolean z4) {
        this._state = z4 ? AbstractC0534v.f8187i : AbstractC0534v.f8186h;
    }

    public static C0523j M(w3.k kVar) {
        while (kVar.m()) {
            w3.k i4 = kVar.i();
            if (i4 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w3.k.f8931m;
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (w3.k) obj;
                    if (!kVar.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = i4;
            }
        }
        while (true) {
            kVar = kVar.l();
            if (!kVar.m()) {
                if (kVar instanceof C0523j) {
                    return (C0523j) kVar;
                }
                if (kVar instanceof a0) {
                    return null;
                }
            }
        }
    }

    public static String S(Object obj) {
        if (!(obj instanceof X)) {
            return obj instanceof L ? ((L) obj).a() ? "Active" : "New" : obj instanceof C0527n ? "Cancelled" : "Completed";
        }
        X x3 = (X) obj;
        return x3.d() ? "Cancelling" : x3.e() ? "Completing" : "Active";
    }

    public final CancellationException A() {
        CancellationException cancellationException;
        Object E3 = E();
        if (!(E3 instanceof X)) {
            if (E3 instanceof L) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(E3 instanceof C0527n)) {
                return new Q(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0527n) E3).f8167a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new Q(v(), th, this) : cancellationException;
        }
        Throwable c4 = ((X) E3).c();
        if (c4 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = c4 instanceof CancellationException ? (CancellationException) c4 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = v();
        }
        return new Q(concat, c4, this);
    }

    public boolean B() {
        return true;
    }

    public boolean C() {
        return this instanceof C0525l;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [r3.a0, w3.k] */
    public final a0 D(L l4) {
        a0 g4 = l4.g();
        if (g4 != null) {
            return g4;
        }
        if (l4 instanceof E) {
            return new w3.k();
        }
        if (l4 instanceof U) {
            Q((U) l4);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + l4).toString());
    }

    public final Object E() {
        while (true) {
            Object obj = f8142l.get(this);
            if (!(obj instanceof w3.q)) {
                return obj;
            }
            ((w3.q) obj).a(this);
        }
    }

    public boolean F(Throwable th) {
        return false;
    }

    public void G(I1.a aVar) {
        throw aVar;
    }

    public final void H(P p2) {
        int R3;
        b0 b0Var = b0.f8146l;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8143m;
        if (p2 == null) {
            atomicReferenceFieldUpdater.set(this, b0Var);
            return;
        }
        Z z4 = (Z) p2;
        do {
            R3 = z4.R(z4.E());
            if (R3 == 0) {
                break;
            }
        } while (R3 != 1);
        InterfaceC0522i interfaceC0522i = (InterfaceC0522i) AbstractC0534v.e(z4, true, new C0523j(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC0522i);
        if (E() instanceof L) {
            return;
        }
        interfaceC0522i.d();
        atomicReferenceFieldUpdater.set(this, b0Var);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [r3.a0, w3.k] */
    public final C I(boolean z4, boolean z5, j3.l lVar) {
        U u4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable th;
        if (z4) {
            u4 = lVar instanceof S ? (S) lVar : null;
            if (u4 == null) {
                u4 = new N(lVar);
            }
        } else {
            u4 = lVar instanceof U ? (U) lVar : null;
            if (u4 == null) {
                u4 = new O(0, lVar);
            }
        }
        u4.f8129o = this;
        while (true) {
            Object E3 = E();
            if (E3 instanceof E) {
                E e4 = (E) E3;
                if (e4.f8113l) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8142l;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, E3, u4)) {
                        if (atomicReferenceFieldUpdater2.get(this) != E3) {
                            break;
                        }
                    }
                    return u4;
                }
                ?? kVar = new w3.k();
                K k4 = e4.f8113l ? kVar : new K(kVar);
                do {
                    atomicReferenceFieldUpdater = f8142l;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, e4, k4)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == e4);
            } else {
                if (!(E3 instanceof L)) {
                    if (z5) {
                        C0527n c0527n = E3 instanceof C0527n ? (C0527n) E3 : null;
                        lVar.b(c0527n != null ? c0527n.f8167a : null);
                    }
                    return b0.f8146l;
                }
                a0 g4 = ((L) E3).g();
                if (g4 == null) {
                    k3.h.c(E3, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    Q((U) E3);
                } else {
                    C c4 = b0.f8146l;
                    if (z4 && (E3 instanceof X)) {
                        synchronized (E3) {
                            try {
                                th = ((X) E3).c();
                                if (th != null) {
                                    if ((lVar instanceof C0523j) && !((X) E3).e()) {
                                    }
                                }
                                if (p((L) E3, g4, u4)) {
                                    if (th == null) {
                                        return u4;
                                    }
                                    c4 = u4;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z5) {
                            lVar.b(th);
                        }
                        return c4;
                    }
                    if (p((L) E3, g4, u4)) {
                        return u4;
                    }
                }
            }
        }
    }

    public boolean J() {
        return this instanceof C0516c;
    }

    public final boolean K(Object obj) {
        Object T3;
        do {
            T3 = T(E(), obj);
            if (T3 == AbstractC0534v.f8181c) {
                return false;
            }
            if (T3 == AbstractC0534v.f8182d) {
                return true;
            }
        } while (T3 == AbstractC0534v.f8183e);
        q(T3);
        return true;
    }

    public final Object L(Object obj) {
        Object T3;
        do {
            T3 = T(E(), obj);
            if (T3 == AbstractC0534v.f8181c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0527n c0527n = obj instanceof C0527n ? (C0527n) obj : null;
                throw new IllegalStateException(str, c0527n != null ? c0527n.f8167a : null);
            }
        } while (T3 == AbstractC0534v.f8183e);
        return T3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable, I1.a] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final void N(a0 a0Var, Throwable th) {
        Object k4 = a0Var.k();
        k3.h.c(k4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        w3.k kVar = (w3.k) k4;
        I1.a aVar = 0;
        while (!kVar.equals(a0Var)) {
            if (kVar instanceof S) {
                U u4 = (U) kVar;
                try {
                    u4.o(th);
                } catch (Throwable th2) {
                    if (aVar != 0) {
                        AbstractC0110a.c(aVar, th2);
                    } else {
                        aVar = new RuntimeException("Exception in completion handler " + u4 + " for " + this, th2);
                    }
                }
            }
            kVar = kVar.l();
            aVar = aVar;
        }
        if (aVar != 0) {
            G(aVar);
        }
        u(th);
    }

    public void O(Object obj) {
    }

    public void P() {
    }

    public final void Q(U u4) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        w3.k kVar = new w3.k();
        u4.getClass();
        w3.k.f8931m.lazySet(kVar, u4);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = w3.k.f8930l;
        atomicReferenceFieldUpdater2.lazySet(kVar, u4);
        loop0: while (true) {
            if (u4.k() != u4) {
                break;
            }
            while (!atomicReferenceFieldUpdater2.compareAndSet(u4, u4, kVar)) {
                if (atomicReferenceFieldUpdater2.get(u4) != u4) {
                    break;
                }
            }
            kVar.j(u4);
        }
        w3.k l4 = u4.l();
        do {
            atomicReferenceFieldUpdater = f8142l;
            if (atomicReferenceFieldUpdater.compareAndSet(this, u4, l4)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == u4);
    }

    public final int R(Object obj) {
        boolean z4 = obj instanceof E;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8142l;
        if (z4) {
            if (((E) obj).f8113l) {
                return 0;
            }
            E e4 = AbstractC0534v.f8187i;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, e4)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof K)) {
            return 0;
        }
        a0 a0Var = ((K) obj).f8121l;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c0, code lost:
    
        if (r2 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d0, code lost:
    
        if (r3.AbstractC0534v.e(r2.f8158p, false, new r3.W(r6, r1, r2, r8), 1) == r3.b0.f8146l) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d5, code lost:
    
        r2 = M(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d9, code lost:
    
        if (r2 != null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return r3.AbstractC0534v.f8182d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00df, code lost:
    
        return z(r1, r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.Z.T(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // r3.P
    public boolean a() {
        Object E3 = E();
        return (E3 instanceof L) && ((L) E3).a();
    }

    @Override // r3.P
    public void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new Q(v(), null, this);
        }
        t(cancellationException);
    }

    @Override // b3.InterfaceC0195i
    public final InterfaceC0195i c(InterfaceC0195i interfaceC0195i) {
        return AbstractC0110a.J(this, interfaceC0195i);
    }

    @Override // b3.InterfaceC0193g
    public final InterfaceC0194h getKey() {
        return C0532t.f8178m;
    }

    @Override // b3.InterfaceC0195i
    public final InterfaceC0193g j(InterfaceC0194h interfaceC0194h) {
        return AbstractC0110a.y(this, interfaceC0194h);
    }

    @Override // b3.InterfaceC0195i
    public final Object k(Object obj, j3.p pVar) {
        return pVar.h(obj, this);
    }

    @Override // b3.InterfaceC0195i
    public final InterfaceC0195i m(InterfaceC0194h interfaceC0194h) {
        return AbstractC0110a.H(this, interfaceC0194h);
    }

    public final boolean p(L l4, a0 a0Var, U u4) {
        char c4;
        Y y4 = new Y(u4, this, l4);
        do {
            w3.k i4 = a0Var.i();
            if (i4 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w3.k.f8931m;
                Object obj = atomicReferenceFieldUpdater.get(a0Var);
                while (true) {
                    i4 = (w3.k) obj;
                    if (!i4.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(i4);
                }
            }
            w3.k.f8931m.lazySet(u4, i4);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = w3.k.f8930l;
            atomicReferenceFieldUpdater2.lazySet(u4, a0Var);
            y4.f8139c = a0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(i4, a0Var, y4)) {
                    c4 = y4.a(i4) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(i4) != a0Var) {
                    c4 = 0;
                    break;
                }
            }
            if (c4 == 1) {
                return true;
            }
        } while (c4 != 2);
        return false;
    }

    public void q(Object obj) {
    }

    public void r(Object obj) {
        q(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        r0 = r3.AbstractC0534v.f8181c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 != r3.AbstractC0534v.f8182d) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        r0 = T(r0, new r3.C0527n(y(r10), false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r0 == r3.AbstractC0534v.f8183e) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r0 != r3.AbstractC0534v.f8181c) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        r0 = null;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        r4 = E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if ((r4 instanceof r3.X) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if ((r4 instanceof r3.L) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (r1 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
    
        r1 = y(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
    
        r5 = (r3.L) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0008, code lost:
    
        if (C() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
    
        if (r5.a() == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
    
        r5 = T(r4, new r3.C0527n(r1, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d2, code lost:
    
        if (r5 == r3.AbstractC0534v.f8181c) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d6, code lost:
    
        if (r5 == r3.AbstractC0534v.f8183e) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d8, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        r0 = E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f1, code lost:
    
        throw new java.lang.IllegalStateException(("Cannot happen in " + r4).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a5, code lost:
    
        r6 = D(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a9, code lost:
    
        if (r6 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ac, code lost:
    
        r7 = new r3.X(r6, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b1, code lost:
    
        r4 = r3.Z.f8142l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b7, code lost:
    
        if (r4.compareAndSet(r9, r5, r7) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if ((r0 instanceof r3.L) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c3, code lost:
    
        if (r4.get(r9) == r5) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b9, code lost:
    
        N(r6, r1);
        r10 = r3.AbstractC0534v.f8181c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0060, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f2, code lost:
    
        r10 = r3.AbstractC0534v.f8184f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0047, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0048, code lost:
    
        r5 = (r3.X) r4;
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0056, code lost:
    
        if (r3.X.f8136o.get(r5) != r3.AbstractC0534v.f8185g) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0058, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x005b, code lost:
    
        if (r5 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x005d, code lost:
    
        r10 = r3.AbstractC0534v.f8184f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x005f, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0063, code lost:
    
        r5 = ((r3.X) r4).d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if ((r0 instanceof r3.X) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x006a, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x006c, code lost:
    
        r1 = y(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0073, code lost:
    
        ((r3.X) r4).b(r1);
        r10 = ((r3.X) r4).c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0080, code lost:
    
        if (r5 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0082, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0083, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0084, code lost:
    
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0086, code lost:
    
        N(((r3.X) r4).f8137l, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x008d, code lost:
    
        r10 = r3.AbstractC0534v.f8181c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x005a, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0071, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0091, code lost:
    
        throw r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f8, code lost:
    
        if (r0 != r3.AbstractC0534v.f8181c) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x010a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00fe, code lost:
    
        if (r0 != r3.AbstractC0534v.f8182d) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (((r3.X) r0).e() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0103, code lost:
    
        if (r0 != r3.AbstractC0534v.f8184f) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0106, code lost:
    
        q(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:?, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.Z.s(java.lang.Object):boolean");
    }

    public void t(CancellationException cancellationException) {
        s(cancellationException);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + S(E()) + '}');
        sb.append('@');
        sb.append(AbstractC0534v.b(this));
        return sb.toString();
    }

    public final boolean u(Throwable th) {
        if (J()) {
            return true;
        }
        boolean z4 = th instanceof CancellationException;
        InterfaceC0522i interfaceC0522i = (InterfaceC0522i) f8143m.get(this);
        return (interfaceC0522i == null || interfaceC0522i == b0.f8146l) ? z4 : interfaceC0522i.f(th) || z4;
    }

    public String v() {
        return "Job was cancelled";
    }

    public boolean w(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return s(th) && B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [I1.a, java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable, I1.a] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final void x(L l4, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8143m;
        InterfaceC0522i interfaceC0522i = (InterfaceC0522i) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0522i != null) {
            interfaceC0522i.d();
            atomicReferenceFieldUpdater.set(this, b0.f8146l);
        }
        I1.a aVar = 0;
        C0527n c0527n = obj instanceof C0527n ? (C0527n) obj : null;
        Throwable th = c0527n != null ? c0527n.f8167a : null;
        if (l4 instanceof U) {
            try {
                ((U) l4).o(th);
                return;
            } catch (Throwable th2) {
                G(new RuntimeException("Exception in completion handler " + l4 + " for " + this, th2));
                return;
            }
        }
        a0 g4 = l4.g();
        if (g4 != null) {
            Object k4 = g4.k();
            k3.h.c(k4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            w3.k kVar = (w3.k) k4;
            while (!kVar.equals(g4)) {
                if (kVar instanceof U) {
                    U u4 = (U) kVar;
                    try {
                        u4.o(th);
                    } catch (Throwable th3) {
                        if (aVar != 0) {
                            AbstractC0110a.c(aVar, th3);
                        } else {
                            aVar = new RuntimeException("Exception in completion handler " + u4 + " for " + this, th3);
                        }
                    }
                }
                kVar = kVar.l();
                aVar = aVar;
            }
            if (aVar != 0) {
                G(aVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable y(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        Z z4 = (Z) ((d0) obj);
        Object E3 = z4.E();
        if (E3 instanceof X) {
            cancellationException = ((X) E3).c();
        } else if (E3 instanceof C0527n) {
            cancellationException = ((C0527n) E3).f8167a;
        } else {
            if (E3 instanceof L) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + E3).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 == null) {
            cancellationException2 = new Q("Parent job is ".concat(S(E3)), cancellationException, z4);
        }
        return cancellationException2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object z(X x3, Object obj) {
        Throwable th = null;
        C0527n c0527n = obj instanceof C0527n ? (C0527n) obj : null;
        Throwable th2 = c0527n != null ? c0527n.f8167a : null;
        synchronized (x3) {
            x3.d();
            ArrayList<Throwable> f4 = x3.f(th2);
            if (!f4.isEmpty()) {
                Iterator it = f4.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        th = next;
                        break;
                    }
                }
                th = th;
                if (th == null) {
                    th = (Throwable) f4.get(0);
                }
            } else if (x3.d()) {
                th = new Q(v(), null, this);
            }
            if (th != null && f4.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f4.size()));
                for (Throwable th3 : f4) {
                    if (th3 != th && th3 != th && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        AbstractC0110a.c(th, th3);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new C0527n(th, false);
        }
        if (th != null && (u(th) || F(th))) {
            k3.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0527n.f8166b.compareAndSet((C0527n) obj, 0, 1);
        }
        O(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8142l;
        Object m4 = obj instanceof L ? new M((L) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, x3, m4) && atomicReferenceFieldUpdater.get(this) == x3) {
        }
        x(x3, obj);
        return obj;
    }
}
