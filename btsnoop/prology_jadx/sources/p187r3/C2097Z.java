package p187r3;

/* renamed from: r3.Z */
/* loaded from: classes.dex */
public class C2097Z implements p187r3.InterfaceC2088P, p187r3.InterfaceC2105d0 {

    /* renamed from: l */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f8459l = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p187r3.C2097Z.class, java.lang.Object.class, "_state");

    /* renamed from: m */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f8460m = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p187r3.C2097Z.class, java.lang.Object.class, "_parentHandle");
    private volatile java.lang.Object _parentHandle;
    private volatile java.lang.Object _state;

    public C2097Z(boolean z4) {
        this._state = z4 ? p187r3.AbstractC2131v.f8505i : p187r3.AbstractC2131v.f8504h;
    }

    /* renamed from: M */
    public static p187r3.C2116j m4183M(p209w3.C2349k c2349k) {
        while (c2349k.mo4215m()) {
            p209w3.C2349k m4557i = c2349k.m4557i();
            if (m4557i == null) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p209w3.C2349k.f9290m;
                java.lang.Object obj = atomicReferenceFieldUpdater.get(c2349k);
                while (true) {
                    c2349k = (p209w3.C2349k) obj;
                    if (!c2349k.mo4215m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c2349k);
                }
            } else {
                c2349k = m4557i;
            }
        }
        while (true) {
            c2349k = c2349k.m4560l();
            if (!c2349k.mo4215m()) {
                if (c2349k instanceof p187r3.C2116j) {
                    return (p187r3.C2116j) c2349k;
                }
                if (c2349k instanceof p187r3.C2099a0) {
                    return null;
                }
            }
        }
    }

    /* renamed from: S */
    public static java.lang.String m4184S(java.lang.Object obj) {
        if (!(obj instanceof p187r3.C2095X)) {
            return obj instanceof p187r3.InterfaceC2084L ? ((p187r3.InterfaceC2084L) obj).mo4157a() ? "Active" : "New" : obj instanceof p187r3.C2123n ? "Cancelled" : "Completed";
        }
        p187r3.C2095X c2095x = (p187r3.C2095X) obj;
        return c2095x.m4178d() ? "Cancelling" : c2095x.m4179e() ? "Completing" : "Active";
    }

    /* renamed from: A */
    public final java.util.concurrent.CancellationException m4185A() {
        java.util.concurrent.CancellationException cancellationException;
        java.lang.Object m4187E = m4187E();
        if (!(m4187E instanceof p187r3.C2095X)) {
            if (m4187E instanceof p187r3.InterfaceC2084L) {
                throw new java.lang.IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(m4187E instanceof p187r3.C2123n)) {
                return new p187r3.C2089Q(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            java.lang.Throwable th = ((p187r3.C2123n) m4187E).f8485a;
            cancellationException = th instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) th : null;
            return cancellationException == null ? new p187r3.C2089Q(mo4207v(), th, this) : cancellationException;
        }
        java.lang.Throwable m4177c = ((p187r3.C2095X) m4187E).m4177c();
        if (m4177c == null) {
            throw new java.lang.IllegalStateException(("Job is still new or active: " + this).toString());
        }
        java.lang.String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = m4177c instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) m4177c : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = mo4207v();
        }
        return new p187r3.C2089Q(concat, m4177c, this);
    }

    /* renamed from: B */
    public boolean mo4171B() {
        return true;
    }

    /* renamed from: C */
    public boolean mo4172C() {
        return this instanceof p187r3.C2120l;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [r3.a0, w3.k] */
    /* renamed from: D */
    public final p187r3.C2099a0 m4186D(p187r3.InterfaceC2084L interfaceC2084L) {
        p187r3.C2099a0 mo4158g = interfaceC2084L.mo4158g();
        if (mo4158g != null) {
            return mo4158g;
        }
        if (interfaceC2084L instanceof p187r3.C2077E) {
            return new p209w3.C2349k();
        }
        if (interfaceC2084L instanceof p187r3.AbstractC2092U) {
            m4198Q((p187r3.AbstractC2092U) interfaceC2084L);
            return null;
        }
        throw new java.lang.IllegalStateException(("State should have list: " + interfaceC2084L).toString());
    }

    /* renamed from: E */
    public final java.lang.Object m4187E() {
        while (true) {
            java.lang.Object obj = f8459l.get(this);
            if (!(obj instanceof p209w3.AbstractC2355q)) {
                return obj;
            }
            ((p209w3.AbstractC2355q) obj).mo4551a(this);
        }
    }

    /* renamed from: F */
    public boolean mo4188F(java.lang.Throwable th) {
        return false;
    }

    /* renamed from: G */
    public void mo4189G(p037I1.C0307a c0307a) {
        throw c0307a;
    }

    /* renamed from: H */
    public final void m4190H(p187r3.InterfaceC2088P interfaceC2088P) {
        int m4199R;
        p187r3.C2101b0 c2101b0 = p187r3.C2101b0.f8463l;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8460m;
        if (interfaceC2088P == null) {
            atomicReferenceFieldUpdater.set(this, c2101b0);
            return;
        }
        p187r3.C2097Z c2097z = (p187r3.C2097Z) interfaceC2088P;
        do {
            m4199R = c2097z.m4199R(c2097z.m4187E());
            if (m4199R == 0) {
                break;
            }
        } while (m4199R != 1);
        p187r3.InterfaceC2114i interfaceC2114i = (p187r3.InterfaceC2114i) p187r3.AbstractC2131v.m4246e(c2097z, true, new p187r3.C2116j(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC2114i);
        if (m4187E() instanceof p187r3.InterfaceC2084L) {
            return;
        }
        interfaceC2114i.mo4155d();
        atomicReferenceFieldUpdater.set(this, c2101b0);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [r3.a0, w3.k] */
    /* renamed from: I */
    public final p187r3.InterfaceC2075C m4191I(boolean z4, boolean z5, p149j3.InterfaceC1737l interfaceC1737l) {
        p187r3.AbstractC2092U abstractC2092U;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        java.lang.Throwable th;
        if (z4) {
            abstractC2092U = interfaceC1737l instanceof p187r3.AbstractC2090S ? (p187r3.AbstractC2090S) interfaceC1737l : null;
            if (abstractC2092U == null) {
                abstractC2092U = new p187r3.C2086N(interfaceC1737l);
            }
        } else {
            abstractC2092U = interfaceC1737l instanceof p187r3.AbstractC2092U ? (p187r3.AbstractC2092U) interfaceC1737l : null;
            if (abstractC2092U == null) {
                abstractC2092U = new p187r3.C2087O(0, interfaceC1737l);
            }
        }
        abstractC2092U.f8445o = this;
        while (true) {
            java.lang.Object m4187E = m4187E();
            if (m4187E instanceof p187r3.C2077E) {
                p187r3.C2077E c2077e = (p187r3.C2077E) m4187E;
                if (c2077e.f8428l) {
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8459l;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, m4187E, abstractC2092U)) {
                        if (atomicReferenceFieldUpdater2.get(this) != m4187E) {
                            break;
                        }
                    }
                    return abstractC2092U;
                }
                ?? c2349k = new p209w3.C2349k();
                p187r3.C2083K c2083k = c2077e.f8428l ? c2349k : new p187r3.C2083K(c2349k);
                do {
                    atomicReferenceFieldUpdater = f8459l;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, c2077e, c2083k)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == c2077e);
            } else {
                if (!(m4187E instanceof p187r3.InterfaceC2084L)) {
                    if (z5) {
                        p187r3.C2123n c2123n = m4187E instanceof p187r3.C2123n ? (p187r3.C2123n) m4187E : null;
                        interfaceC1737l.mo661b(c2123n != null ? c2123n.f8485a : null);
                    }
                    return p187r3.C2101b0.f8463l;
                }
                p187r3.C2099a0 mo4158g = ((p187r3.InterfaceC2084L) m4187E).mo4158g();
                if (mo4158g == null) {
                    p154k3.AbstractC1803h.m3777c(m4187E, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    m4198Q((p187r3.AbstractC2092U) m4187E);
                } else {
                    p187r3.InterfaceC2075C interfaceC2075C = p187r3.C2101b0.f8463l;
                    if (z4 && (m4187E instanceof p187r3.C2095X)) {
                        synchronized (m4187E) {
                            try {
                                th = ((p187r3.C2095X) m4187E).m4177c();
                                if (th != null) {
                                    if ((interfaceC1737l instanceof p187r3.C2116j) && !((p187r3.C2095X) m4187E).m4179e()) {
                                    }
                                }
                                if (m4201p((p187r3.InterfaceC2084L) m4187E, mo4158g, abstractC2092U)) {
                                    if (th == null) {
                                        return abstractC2092U;
                                    }
                                    interfaceC2075C = abstractC2092U;
                                }
                            } catch (java.lang.Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z5) {
                            interfaceC1737l.mo661b(th);
                        }
                        return interfaceC2075C;
                    }
                    if (m4201p((p187r3.InterfaceC2084L) m4187E, mo4158g, abstractC2092U)) {
                        return abstractC2092U;
                    }
                }
            }
        }
    }

    /* renamed from: J */
    public boolean mo4192J() {
        return this instanceof p187r3.C2102c;
    }

    /* renamed from: K */
    public final boolean m4193K(java.lang.Object obj) {
        java.lang.Object m4200T;
        do {
            m4200T = m4200T(m4187E(), obj);
            if (m4200T == p187r3.AbstractC2131v.f8499c) {
                return false;
            }
            if (m4200T == p187r3.AbstractC2131v.f8500d) {
                return true;
            }
        } while (m4200T == p187r3.AbstractC2131v.f8501e);
        mo4202q(m4200T);
        return true;
    }

    /* renamed from: L */
    public final java.lang.Object m4194L(java.lang.Object obj) {
        java.lang.Object m4200T;
        do {
            m4200T = m4200T(m4187E(), obj);
            if (m4200T == p187r3.AbstractC2131v.f8499c) {
                java.lang.String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                p187r3.C2123n c2123n = obj instanceof p187r3.C2123n ? (p187r3.C2123n) obj : null;
                throw new java.lang.IllegalStateException(str, c2123n != null ? c2123n.f8485a : null);
            }
        } while (m4200T == p187r3.AbstractC2131v.f8501e);
        return m4200T;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable, I1.a] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* renamed from: N */
    public final void m4195N(p187r3.C2099a0 c2099a0, java.lang.Throwable th) {
        java.lang.Object m4559k = c2099a0.m4559k();
        p154k3.AbstractC1803h.m3777c(m4559k, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        p209w3.C2349k c2349k = (p209w3.C2349k) m4559k;
        p037I1.C0307a c0307a = 0;
        while (!c2349k.equals(c2099a0)) {
            if (c2349k instanceof p187r3.AbstractC2090S) {
                p187r3.AbstractC2092U abstractC2092U = (p187r3.AbstractC2092U) c2349k;
                try {
                    abstractC2092U.mo4168o(th);
                } catch (java.lang.Throwable th2) {
                    if (c0307a != 0) {
                        p101a.AbstractC0936a.m1793c(c0307a, th2);
                    } else {
                        c0307a = new java.lang.RuntimeException("Exception in completion handler " + abstractC2092U + " for " + this, th2);
                    }
                }
            }
            c2349k = c2349k.m4560l();
            c0307a = c0307a;
        }
        if (c0307a != 0) {
            mo4189G(c0307a);
        }
        m4206u(th);
    }

    /* renamed from: O */
    public void mo4196O(java.lang.Object obj) {
    }

    /* renamed from: P */
    public void m4197P() {
    }

    /* renamed from: Q */
    public final void m4198Q(p187r3.AbstractC2092U abstractC2092U) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        p209w3.C2349k c2349k = new p209w3.C2349k();
        abstractC2092U.getClass();
        p209w3.C2349k.f9290m.lazySet(c2349k, abstractC2092U);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = p209w3.C2349k.f9289l;
        atomicReferenceFieldUpdater2.lazySet(c2349k, abstractC2092U);
        loop0: while (true) {
            if (abstractC2092U.m4559k() != abstractC2092U) {
                break;
            }
            while (!atomicReferenceFieldUpdater2.compareAndSet(abstractC2092U, abstractC2092U, c2349k)) {
                if (atomicReferenceFieldUpdater2.get(abstractC2092U) != abstractC2092U) {
                    break;
                }
            }
            c2349k.m4558j(abstractC2092U);
        }
        p209w3.C2349k m4560l = abstractC2092U.m4560l();
        do {
            atomicReferenceFieldUpdater = f8459l;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC2092U, m4560l)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC2092U);
    }

    /* renamed from: R */
    public final int m4199R(java.lang.Object obj) {
        boolean z4 = obj instanceof p187r3.C2077E;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8459l;
        if (z4) {
            if (((p187r3.C2077E) obj).f8428l) {
                return 0;
            }
            p187r3.C2077E c2077e = p187r3.AbstractC2131v.f8505i;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2077e)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof p187r3.C2083K)) {
            return 0;
        }
        p187r3.C2099a0 c2099a0 = ((p187r3.C2083K) obj).f8437l;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2099a0)) {
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
    
        if (p187r3.AbstractC2131v.m4246e(r2.f8476p, false, new p187r3.C2094W(r6, r1, r2, r8), 1) == p187r3.C2101b0.f8463l) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d5, code lost:
    
        r2 = m4183M(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d9, code lost:
    
        if (r2 != null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return p187r3.AbstractC2131v.f8500d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00df, code lost:
    
        return m4211z(r1, r8);
     */
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4200T(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p187r3.C2097Z.m4200T(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // p187r3.InterfaceC2088P
    /* renamed from: a */
    public boolean mo4169a() {
        java.lang.Object m4187E = m4187E();
        return (m4187E instanceof p187r3.InterfaceC2084L) && ((p187r3.InterfaceC2084L) m4187E).mo4157a();
    }

    @Override // p187r3.InterfaceC2088P
    /* renamed from: b */
    public void mo4170b(java.util.concurrent.CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new p187r3.C2089Q(mo4207v(), null, this);
        }
        mo4205t(cancellationException);
    }

    @Override // p110b3.InterfaceC1195i
    /* renamed from: c */
    public final p110b3.InterfaceC1195i mo676c(p110b3.InterfaceC1195i interfaceC1195i) {
        return p101a.AbstractC0936a.m1772J(this, interfaceC1195i);
    }

    @Override // p110b3.InterfaceC1193g
    public final p110b3.InterfaceC1194h getKey() {
        return p187r3.C2129t.f8496m;
    }

    @Override // p110b3.InterfaceC1195i
    /* renamed from: j */
    public final p110b3.InterfaceC1193g mo678j(p110b3.InterfaceC1194h interfaceC1194h) {
        return p101a.AbstractC0936a.m1817y(this, interfaceC1194h);
    }

    @Override // p110b3.InterfaceC1195i
    /* renamed from: k */
    public final java.lang.Object mo679k(java.lang.Object obj, p149j3.InterfaceC1741p interfaceC1741p) {
        return interfaceC1741p.mo502h(obj, this);
    }

    @Override // p110b3.InterfaceC1195i
    /* renamed from: m */
    public final p110b3.InterfaceC1195i mo680m(p110b3.InterfaceC1194h interfaceC1194h) {
        return p101a.AbstractC0936a.m1770H(this, interfaceC1194h);
    }

    /* renamed from: p */
    public final boolean m4201p(p187r3.InterfaceC2084L interfaceC2084L, p187r3.C2099a0 c2099a0, p187r3.AbstractC2092U abstractC2092U) {
        char c4;
        p187r3.C2096Y c2096y = new p187r3.C2096Y(abstractC2092U, this, interfaceC2084L);
        do {
            p209w3.C2349k m4557i = c2099a0.m4557i();
            if (m4557i == null) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p209w3.C2349k.f9290m;
                java.lang.Object obj = atomicReferenceFieldUpdater.get(c2099a0);
                while (true) {
                    m4557i = (p209w3.C2349k) obj;
                    if (!m4557i.mo4215m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(m4557i);
                }
            }
            p209w3.C2349k.f9290m.lazySet(abstractC2092U, m4557i);
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = p209w3.C2349k.f9289l;
            atomicReferenceFieldUpdater2.lazySet(abstractC2092U, c2099a0);
            c2096y.f8456c = c2099a0;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(m4557i, c2099a0, c2096y)) {
                    c4 = c2096y.mo4551a(m4557i) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(m4557i) != c2099a0) {
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

    /* renamed from: q */
    public void mo4202q(java.lang.Object obj) {
    }

    /* renamed from: r */
    public void mo4203r(java.lang.Object obj) {
        mo4202q(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        r0 = p187r3.AbstractC2131v.f8499c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 != p187r3.AbstractC2131v.f8500d) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        r0 = m4200T(r0, new p187r3.C2123n(m4210y(r10), false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r0 == p187r3.AbstractC2131v.f8501e) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r0 != p187r3.AbstractC2131v.f8499c) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        r0 = null;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        r4 = m4187E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if ((r4 instanceof p187r3.C2095X) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if ((r4 instanceof p187r3.InterfaceC2084L) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (r1 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
    
        r1 = m4210y(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
    
        r5 = (p187r3.InterfaceC2084L) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0008, code lost:
    
        if (mo4172C() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
    
        if (r5.mo4157a() == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
    
        r5 = m4200T(r4, new p187r3.C2123n(r1, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d2, code lost:
    
        if (r5 == p187r3.AbstractC2131v.f8499c) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d6, code lost:
    
        if (r5 == p187r3.AbstractC2131v.f8501e) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d8, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        r0 = m4187E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f1, code lost:
    
        throw new java.lang.IllegalStateException(("Cannot happen in " + r4).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a5, code lost:
    
        r6 = m4186D(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a9, code lost:
    
        if (r6 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ac, code lost:
    
        r7 = new p187r3.C2095X(r6, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b1, code lost:
    
        r4 = p187r3.C2097Z.f8459l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b7, code lost:
    
        if (r4.compareAndSet(r9, r5, r7) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if ((r0 instanceof p187r3.InterfaceC2084L) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c3, code lost:
    
        if (r4.get(r9) == r5) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b9, code lost:
    
        m4195N(r6, r1);
        r10 = p187r3.AbstractC2131v.f8499c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0060, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f2, code lost:
    
        r10 = p187r3.AbstractC2131v.f8502f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0047, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0048, code lost:
    
        r5 = (p187r3.C2095X) r4;
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0056, code lost:
    
        if (p187r3.C2095X.f8453o.get(r5) != p187r3.AbstractC2131v.f8503g) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0058, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x005b, code lost:
    
        if (r5 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x005d, code lost:
    
        r10 = p187r3.AbstractC2131v.f8502f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x005f, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0063, code lost:
    
        r5 = ((p187r3.C2095X) r4).m4178d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if ((r0 instanceof p187r3.C2095X) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x006a, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x006c, code lost:
    
        r1 = m4210y(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0073, code lost:
    
        ((p187r3.C2095X) r4).m4176b(r1);
        r10 = ((p187r3.C2095X) r4).m4177c();
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
    
        m4195N(((p187r3.C2095X) r4).f8454l, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x008d, code lost:
    
        r10 = p187r3.AbstractC2131v.f8499c;
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
    
        if (r0 != p187r3.AbstractC2131v.f8499c) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x010a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00fe, code lost:
    
        if (r0 != p187r3.AbstractC2131v.f8500d) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (((p187r3.C2095X) r0).m4179e() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0103, code lost:
    
        if (r0 != p187r3.AbstractC2131v.f8502f) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0106, code lost:
    
        mo4202q(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:?, code lost:
    
        return false;
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m4204s(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p187r3.C2097Z.m4204s(java.lang.Object):boolean");
    }

    /* renamed from: t */
    public void mo4205t(java.util.concurrent.CancellationException cancellationException) {
        m4204s(cancellationException);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + m4184S(m4187E()) + '}');
        sb.append('@');
        sb.append(p187r3.AbstractC2131v.m4243b(this));
        return sb.toString();
    }

    /* renamed from: u */
    public final boolean m4206u(java.lang.Throwable th) {
        if (mo4192J()) {
            return true;
        }
        boolean z4 = th instanceof java.util.concurrent.CancellationException;
        p187r3.InterfaceC2114i interfaceC2114i = (p187r3.InterfaceC2114i) f8460m.get(this);
        return (interfaceC2114i == null || interfaceC2114i == p187r3.C2101b0.f8463l) ? z4 : interfaceC2114i.mo4216f(th) || z4;
    }

    /* renamed from: v */
    public java.lang.String mo4207v() {
        return "Job was cancelled";
    }

    /* renamed from: w */
    public boolean mo4208w(java.lang.Throwable th) {
        if (th instanceof java.util.concurrent.CancellationException) {
            return true;
        }
        return m4204s(th) && mo4171B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [I1.a, java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable, I1.a] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* renamed from: x */
    public final void m4209x(p187r3.InterfaceC2084L interfaceC2084L, java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8460m;
        p187r3.InterfaceC2114i interfaceC2114i = (p187r3.InterfaceC2114i) atomicReferenceFieldUpdater.get(this);
        if (interfaceC2114i != null) {
            interfaceC2114i.mo4155d();
            atomicReferenceFieldUpdater.set(this, p187r3.C2101b0.f8463l);
        }
        p037I1.C0307a c0307a = 0;
        p187r3.C2123n c2123n = obj instanceof p187r3.C2123n ? (p187r3.C2123n) obj : null;
        java.lang.Throwable th = c2123n != null ? c2123n.f8485a : null;
        if (interfaceC2084L instanceof p187r3.AbstractC2092U) {
            try {
                ((p187r3.AbstractC2092U) interfaceC2084L).mo4168o(th);
                return;
            } catch (java.lang.Throwable th2) {
                mo4189G(new java.lang.RuntimeException("Exception in completion handler " + interfaceC2084L + " for " + this, th2));
                return;
            }
        }
        p187r3.C2099a0 mo4158g = interfaceC2084L.mo4158g();
        if (mo4158g != null) {
            java.lang.Object m4559k = mo4158g.m4559k();
            p154k3.AbstractC1803h.m3777c(m4559k, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            p209w3.C2349k c2349k = (p209w3.C2349k) m4559k;
            while (!c2349k.equals(mo4158g)) {
                if (c2349k instanceof p187r3.AbstractC2092U) {
                    p187r3.AbstractC2092U abstractC2092U = (p187r3.AbstractC2092U) c2349k;
                    try {
                        abstractC2092U.mo4168o(th);
                    } catch (java.lang.Throwable th3) {
                        if (c0307a != 0) {
                            p101a.AbstractC0936a.m1793c(c0307a, th3);
                        } else {
                            c0307a = new java.lang.RuntimeException("Exception in completion handler " + abstractC2092U + " for " + this, th3);
                        }
                    }
                }
                c2349k = c2349k.m4560l();
                c0307a = c0307a;
            }
            if (c0307a != 0) {
                mo4189G(c0307a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    /* renamed from: y */
    public final java.lang.Throwable m4210y(java.lang.Object obj) {
        java.util.concurrent.CancellationException cancellationException;
        if (obj instanceof java.lang.Throwable) {
            return (java.lang.Throwable) obj;
        }
        p187r3.C2097Z c2097z = (p187r3.C2097Z) ((p187r3.InterfaceC2105d0) obj);
        java.lang.Object m4187E = c2097z.m4187E();
        if (m4187E instanceof p187r3.C2095X) {
            cancellationException = ((p187r3.C2095X) m4187E).m4177c();
        } else if (m4187E instanceof p187r3.C2123n) {
            cancellationException = ((p187r3.C2123n) m4187E).f8485a;
        } else {
            if (m4187E instanceof p187r3.InterfaceC2084L) {
                throw new java.lang.IllegalStateException(("Cannot be cancelling child in this state: " + m4187E).toString());
            }
            cancellationException = null;
        }
        java.util.concurrent.CancellationException cancellationException2 = cancellationException instanceof java.util.concurrent.CancellationException ? cancellationException : null;
        if (cancellationException2 == null) {
            cancellationException2 = new p187r3.C2089Q("Parent job is ".concat(m4184S(m4187E)), cancellationException, c2097z);
        }
        return cancellationException2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    public final java.lang.Object m4211z(p187r3.C2095X c2095x, java.lang.Object obj) {
        java.lang.Throwable th = null;
        p187r3.C2123n c2123n = obj instanceof p187r3.C2123n ? (p187r3.C2123n) obj : null;
        java.lang.Throwable th2 = c2123n != null ? c2123n.f8485a : null;
        synchronized (c2095x) {
            c2095x.m4178d();
            java.util.ArrayList<java.lang.Throwable> m4180f = c2095x.m4180f(th2);
            if (!m4180f.isEmpty()) {
                java.util.Iterator it = m4180f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (!(((java.lang.Throwable) next) instanceof java.util.concurrent.CancellationException)) {
                        th = next;
                        break;
                    }
                }
                th = th;
                if (th == null) {
                    th = (java.lang.Throwable) m4180f.get(0);
                }
            } else if (c2095x.m4178d()) {
                th = new p187r3.C2089Q(mo4207v(), null, this);
            }
            if (th != null && m4180f.size() > 1) {
                java.util.Set newSetFromMap = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap(m4180f.size()));
                for (java.lang.Throwable th3 : m4180f) {
                    if (th3 != th && th3 != th && !(th3 instanceof java.util.concurrent.CancellationException) && newSetFromMap.add(th3)) {
                        p101a.AbstractC0936a.m1793c(th, th3);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new p187r3.C2123n(th, false);
        }
        if (th != null && (m4206u(th) || mo4188F(th))) {
            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            p187r3.C2123n.f8484b.compareAndSet((p187r3.C2123n) obj, 0, 1);
        }
        mo4196O(obj);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8459l;
        java.lang.Object c2085m = obj instanceof p187r3.InterfaceC2084L ? new p187r3.C2085M((p187r3.InterfaceC2084L) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c2095x, c2085m) && atomicReferenceFieldUpdater.get(this) == c2095x) {
        }
        m4209x(c2095x, obj);
        return obj;
    }
}
