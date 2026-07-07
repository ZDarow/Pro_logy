package p187r3;

/* renamed from: r3.f */
/* loaded from: classes.dex */
public class C2108f extends p187r3.AbstractC2073A implements p187r3.InterfaceC2106e, p120d3.InterfaceC1293c, p187r3.InterfaceC2121l0 {

    /* renamed from: q */
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f8467q = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p187r3.C2108f.class, "_decisionAndIndex");

    /* renamed from: r */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f8468r = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p187r3.C2108f.class, java.lang.Object.class, "_state");

    /* renamed from: s */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f8469s = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p187r3.C2108f.class, java.lang.Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile java.lang.Object _parentHandle;
    private volatile java.lang.Object _state;

    /* renamed from: o */
    public final p110b3.InterfaceC1190d f8470o;

    /* renamed from: p */
    public final p110b3.InterfaceC1195i f8471p;

    public C2108f(int i4, p110b3.InterfaceC1190d interfaceC1190d) {
        super(i4);
        this.f8470o = interfaceC1190d;
        this.f8471p = interfaceC1190d.mo2835f();
        this._decisionAndIndex = 536870911;
        this._state = p187r3.C2100b.f8462l;
    }

    /* renamed from: D */
    public static java.lang.Object m4220D(p187r3.InterfaceC2103c0 interfaceC2103c0, java.lang.Object obj, int i4, p149j3.InterfaceC1737l interfaceC1737l) {
        if ((obj instanceof p187r3.C2123n) || !p187r3.AbstractC2131v.m4247f(i4)) {
            return obj;
        }
        if (interfaceC1737l != null || (interfaceC2103c0 instanceof p187r3.C2076D)) {
            return new p187r3.C2122m(obj, interfaceC2103c0 instanceof p187r3.C2076D ? (p187r3.C2076D) interfaceC2103c0 : null, interfaceC1737l, (java.util.concurrent.CancellationException) null, 16);
        }
        return obj;
    }

    /* renamed from: z */
    public static void m4221z(p187r3.InterfaceC2103c0 interfaceC2103c0, java.lang.Object obj) {
        throw new java.lang.IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + interfaceC2103c0 + ", already has " + obj).toString());
    }

    /* renamed from: A */
    public java.lang.String mo4174A() {
        return "CancellableContinuation";
    }

    /* renamed from: B */
    public final void m4222B() {
        p110b3.InterfaceC1190d interfaceC1190d = this.f8470o;
        java.lang.Throwable th = null;
        p209w3.C2346h c2346h = interfaceC1190d instanceof p209w3.C2346h ? (p209w3.C2346h) interfaceC1190d : null;
        if (c2346h == null) {
            return;
        }
        loop0: while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p209w3.C2346h.f9279s;
            java.lang.Object obj = atomicReferenceFieldUpdater.get(c2346h);
            p124e2.C1358f c1358f = p209w3.AbstractC2339a.f9269d;
            if (obj != c1358f) {
                if (!(obj instanceof java.lang.Throwable)) {
                    throw new java.lang.IllegalStateException(("Inconsistent state " + obj).toString());
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(c2346h, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(c2346h) != obj) {
                        throw new java.lang.IllegalArgumentException("Failed requirement.");
                    }
                }
                th = (java.lang.Throwable) obj;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(c2346h, c1358f, this)) {
                if (atomicReferenceFieldUpdater.get(c2346h) != c1358f) {
                    break;
                }
            }
        }
        if (th == null) {
            return;
        }
        m4229r();
        m4228q(th);
    }

    /* renamed from: C */
    public final void m4223C(java.lang.Object obj, int i4, p149j3.InterfaceC1737l interfaceC1737l) {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8468r;
            java.lang.Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof p187r3.InterfaceC2103c0) {
                java.lang.Object m4220D = m4220D((p187r3.InterfaceC2103c0) obj2, obj, i4, interfaceC1737l);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, m4220D)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!m4235y()) {
                    m4229r();
                }
                m4230s(i4);
                return;
            }
            if (obj2 instanceof p187r3.C2110g) {
                p187r3.C2110g c2110g = (p187r3.C2110g) obj2;
                c2110g.getClass();
                if (p187r3.C2110g.f8472c.compareAndSet(c2110g, 0, 1)) {
                    if (interfaceC1737l != null) {
                        m4226m(interfaceC1737l, c2110g.f8485a);
                        return;
                    }
                    return;
                }
            }
            throw new java.lang.IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    @Override // p187r3.InterfaceC2121l0
    /* renamed from: a */
    public final void mo4224a(p209w3.AbstractC2359u abstractC2359u, int i4) {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i5;
        do {
            atomicIntegerFieldUpdater = f8467q;
            i5 = atomicIntegerFieldUpdater.get(this);
            if ((i5 & 536870911) != 536870911) {
                throw new java.lang.IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, ((i5 >> 29) << 29) + i4));
        m4234x(abstractC2359u);
    }

    @Override // p187r3.AbstractC2073A
    /* renamed from: b */
    public final void mo4149b(java.lang.Object obj, java.util.concurrent.CancellationException cancellationException) {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8468r;
            java.lang.Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof p187r3.InterfaceC2103c0) {
                throw new java.lang.IllegalStateException("Not completed");
            }
            if (obj2 instanceof p187r3.C2123n) {
                return;
            }
            if (!(obj2 instanceof p187r3.C2122m)) {
                p187r3.C2122m c2122m = new p187r3.C2122m(obj2, (p187r3.C2076D) null, (p149j3.InterfaceC1737l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c2122m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            p187r3.C2122m c2122m2 = (p187r3.C2122m) obj2;
            if (c2122m2.f8483e != null) {
                throw new java.lang.IllegalStateException("Must be called at most once");
            }
            p187r3.C2122m m4240a = p187r3.C2122m.m4240a(c2122m2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, m4240a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            p187r3.C2076D c2076d = c2122m2.f8480b;
            if (c2076d != null) {
                m4225k(c2076d, cancellationException);
            }
            p149j3.InterfaceC1737l interfaceC1737l = c2122m2.f8481c;
            if (interfaceC1737l != null) {
                m4226m(interfaceC1737l, cancellationException);
                return;
            }
            return;
        }
    }

    @Override // p187r3.AbstractC2073A
    /* renamed from: c */
    public final p110b3.InterfaceC1190d mo4150c() {
        return this.f8470o;
    }

    @Override // p120d3.InterfaceC1293c
    /* renamed from: d */
    public final p120d3.InterfaceC1293c mo3030d() {
        p110b3.InterfaceC1190d interfaceC1190d = this.f8470o;
        if (interfaceC1190d instanceof p120d3.InterfaceC1293c) {
            return (p120d3.InterfaceC1293c) interfaceC1190d;
        }
        return null;
    }

    @Override // p187r3.AbstractC2073A
    /* renamed from: e */
    public final java.lang.Throwable mo4151e(java.lang.Object obj) {
        java.lang.Throwable mo4151e = super.mo4151e(obj);
        if (mo4151e != null) {
            return mo4151e;
        }
        return null;
    }

    @Override // p110b3.InterfaceC1190d
    /* renamed from: f */
    public final p110b3.InterfaceC1195i mo2835f() {
        return this.f8471p;
    }

    @Override // p187r3.AbstractC2073A
    /* renamed from: g */
    public final java.lang.Object mo4152g(java.lang.Object obj) {
        return obj instanceof p187r3.C2122m ? ((p187r3.C2122m) obj).f8479a : obj;
    }

    @Override // p110b3.InterfaceC1190d
    /* renamed from: i */
    public final void mo2836i(java.lang.Object obj) {
        java.lang.Throwable m1761a = p100Z2.AbstractC0931d.m1761a(obj);
        if (m1761a != null) {
            obj = new p187r3.C2123n(m1761a, false);
        }
        m4223C(obj, this.f8424n, null);
    }

    @Override // p187r3.AbstractC2073A
    /* renamed from: j */
    public final java.lang.Object mo4154j() {
        return f8468r.get(this);
    }

    /* renamed from: k */
    public final void m4225k(p187r3.C2076D c2076d, java.lang.Throwable th) {
        try {
            c2076d.m4156a(th);
        } catch (java.lang.Throwable th2) {
            p187r3.AbstractC2131v.m4245d(this.f8471p, new java.lang.RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // p187r3.InterfaceC2106e
    /* renamed from: l */
    public final void mo4217l(java.lang.Object obj, p149j3.InterfaceC1737l interfaceC1737l) {
        m4223C(obj, this.f8424n, interfaceC1737l);
    }

    /* renamed from: m */
    public final void m4226m(p149j3.InterfaceC1737l interfaceC1737l, java.lang.Throwable th) {
        try {
            interfaceC1737l.mo661b(th);
        } catch (java.lang.Throwable th2) {
            p187r3.AbstractC2131v.m4245d(this.f8471p, new java.lang.RuntimeException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // p187r3.InterfaceC2106e
    /* renamed from: n */
    public final p124e2.C1358f mo4218n(java.lang.Object obj, p149j3.InterfaceC1737l interfaceC1737l) {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8468r;
            java.lang.Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z4 = obj2 instanceof p187r3.InterfaceC2103c0;
            p124e2.C1358f c1358f = p187r3.AbstractC2131v.f8497a;
            if (!z4) {
                boolean z5 = obj2 instanceof p187r3.C2122m;
                return null;
            }
            java.lang.Object m4220D = m4220D((p187r3.InterfaceC2103c0) obj2, obj, this.f8424n, interfaceC1737l);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, m4220D)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (m4235y()) {
                return c1358f;
            }
            m4229r();
            return c1358f;
        }
    }

    @Override // p187r3.InterfaceC2106e
    /* renamed from: o */
    public final void mo4219o(java.lang.Object obj) {
        m4230s(this.f8424n);
    }

    /* renamed from: p */
    public final void m4227p(p209w3.AbstractC2359u abstractC2359u, java.lang.Throwable th) {
        p110b3.InterfaceC1195i interfaceC1195i = this.f8471p;
        int i4 = f8467q.get(this) & 536870911;
        if (i4 == 536870911) {
            throw new java.lang.IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            abstractC2359u.mo4376g(i4, interfaceC1195i);
        } catch (java.lang.Throwable th2) {
            p187r3.AbstractC2131v.m4245d(interfaceC1195i, new java.lang.RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: q */
    public final void m4228q(java.lang.Throwable th) {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8468r;
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof p187r3.InterfaceC2103c0) {
                p187r3.C2110g c2110g = new p187r3.C2110g(this, th, (obj instanceof p187r3.C2076D) || (obj instanceof p209w3.AbstractC2359u));
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2110g)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                p187r3.InterfaceC2103c0 interfaceC2103c0 = (p187r3.InterfaceC2103c0) obj;
                if (interfaceC2103c0 instanceof p187r3.C2076D) {
                    m4225k((p187r3.C2076D) obj, th);
                } else if (interfaceC2103c0 instanceof p209w3.AbstractC2359u) {
                    m4227p((p209w3.AbstractC2359u) obj, th);
                }
                if (!m4235y()) {
                    m4229r();
                }
                m4230s(this.f8424n);
                return;
            }
            return;
        }
    }

    /* renamed from: r */
    public final void m4229r() {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8469s;
        p187r3.InterfaceC2075C interfaceC2075C = (p187r3.InterfaceC2075C) atomicReferenceFieldUpdater.get(this);
        if (interfaceC2075C == null) {
            return;
        }
        interfaceC2075C.mo4155d();
        atomicReferenceFieldUpdater.set(this, p187r3.C2101b0.f8463l);
    }

    /* renamed from: s */
    public final void m4230s(int i4) {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i5;
        do {
            atomicIntegerFieldUpdater = f8467q;
            i5 = atomicIntegerFieldUpdater.get(this);
            int i6 = i5 >> 29;
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("Already resumed");
                }
                boolean z4 = i4 == 4;
                p110b3.InterfaceC1190d interfaceC1190d = this.f8470o;
                if (z4 || !(interfaceC1190d instanceof p209w3.C2346h) || p187r3.AbstractC2131v.m4247f(i4) != p187r3.AbstractC2131v.m4247f(this.f8424n)) {
                    p187r3.AbstractC2131v.m4250i(this, interfaceC1190d, z4);
                    return;
                }
                p187r3.AbstractC2128s abstractC2128s = ((p209w3.C2346h) interfaceC1190d).f9280o;
                p110b3.InterfaceC1195i mo2835f = ((p209w3.C2346h) interfaceC1190d).f9281p.mo2835f();
                if (abstractC2128s.mo4241f()) {
                    abstractC2128s.mo4159e(mo2835f, this);
                    return;
                }
                p187r3.AbstractC2080H m4236a = p187r3.AbstractC2113h0.m4236a();
                if (m4236a.f8433n >= 4294967296L) {
                    p105a3.C1019b c1019b = m4236a.f8435p;
                    if (c1019b == null) {
                        c1019b = new p105a3.C1019b();
                        m4236a.f8435p = c1019b;
                    }
                    c1019b.addLast(this);
                    return;
                }
                m4236a.m4166i(true);
                try {
                    p187r3.AbstractC2131v.m4250i(this, interfaceC1190d, true);
                    do {
                    } while (m4236a.m4167n());
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

    /* renamed from: t */
    public java.lang.Throwable mo4175t(p187r3.C2097Z c2097z) {
        return c2097z.m4185A();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(mo4174A());
        sb.append('(');
        sb.append(p187r3.AbstractC2131v.m4252k(this.f8470o));
        sb.append("){");
        java.lang.Object obj = f8468r.get(this);
        sb.append(obj instanceof p187r3.InterfaceC2103c0 ? "Active" : obj instanceof p187r3.C2110g ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(p187r3.AbstractC2131v.m4243b(this));
        return sb.toString();
    }

    /* renamed from: u */
    public final java.lang.Object m4231u() {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        boolean m4235y = m4235y();
        do {
            atomicIntegerFieldUpdater = f8467q;
            i4 = atomicIntegerFieldUpdater.get(this);
            int i5 = i4 >> 29;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw new java.lang.IllegalStateException("Already suspended");
                }
                if (m4235y) {
                    m4222B();
                }
                java.lang.Object obj = f8468r.get(this);
                if (obj instanceof p187r3.C2123n) {
                    throw ((p187r3.C2123n) obj).f8485a;
                }
                if (p187r3.AbstractC2131v.m4247f(this.f8424n)) {
                    p187r3.InterfaceC2088P interfaceC2088P = (p187r3.InterfaceC2088P) this.f8471p.mo678j(p187r3.C2129t.f8496m);
                    if (interfaceC2088P != null && !interfaceC2088P.mo4169a()) {
                        java.util.concurrent.CancellationException m4185A = ((p187r3.C2097Z) interfaceC2088P).m4185A();
                        mo4149b(obj, m4185A);
                        throw m4185A;
                    }
                }
                return mo4152g(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 536870912 + (536870911 & i4)));
        if (((p187r3.InterfaceC2075C) f8469s.get(this)) == null) {
            m4233w();
        }
        if (m4235y) {
            m4222B();
        }
        return p115c3.EnumC1252a.f4880l;
    }

    /* renamed from: v */
    public final void m4232v() {
        p187r3.InterfaceC2075C m4233w = m4233w();
        if (m4233w == null || (f8468r.get(this) instanceof p187r3.InterfaceC2103c0)) {
            return;
        }
        m4233w.mo4155d();
        f8469s.set(this, p187r3.C2101b0.f8463l);
    }

    /* renamed from: w */
    public final p187r3.InterfaceC2075C m4233w() {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        p187r3.InterfaceC2088P interfaceC2088P = (p187r3.InterfaceC2088P) this.f8471p.mo678j(p187r3.C2129t.f8496m);
        if (interfaceC2088P == null) {
            return null;
        }
        p187r3.InterfaceC2075C m4246e = p187r3.AbstractC2131v.m4246e(interfaceC2088P, true, new p187r3.C2112h(this), 2);
        do {
            atomicReferenceFieldUpdater = f8469s;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, m4246e)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return m4246e;
    }

    /* renamed from: x */
    public final void m4234x(p187r3.InterfaceC2103c0 interfaceC2103c0) {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8468r;
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof p187r3.C2100b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, interfaceC2103c0)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof p187r3.C2076D ? true : obj instanceof p209w3.AbstractC2359u) {
                m4221z(interfaceC2103c0, obj);
                throw null;
            }
            if (obj instanceof p187r3.C2123n) {
                p187r3.C2123n c2123n = (p187r3.C2123n) obj;
                c2123n.getClass();
                if (!p187r3.C2123n.f8484b.compareAndSet(c2123n, 0, 1)) {
                    m4221z(interfaceC2103c0, obj);
                    throw null;
                }
                if (obj instanceof p187r3.C2110g) {
                    if (!(obj instanceof p187r3.C2123n)) {
                        c2123n = null;
                    }
                    java.lang.Throwable th = c2123n != null ? c2123n.f8485a : null;
                    if (interfaceC2103c0 instanceof p187r3.C2076D) {
                        m4225k((p187r3.C2076D) interfaceC2103c0, th);
                        return;
                    } else {
                        p154k3.AbstractC1803h.m3777c(interfaceC2103c0, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        m4227p((p209w3.AbstractC2359u) interfaceC2103c0, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof p187r3.C2122m)) {
                if (interfaceC2103c0 instanceof p209w3.AbstractC2359u) {
                    return;
                }
                p154k3.AbstractC1803h.m3777c(interfaceC2103c0, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                p187r3.C2122m c2122m = new p187r3.C2122m(obj, (p187r3.C2076D) interfaceC2103c0, (p149j3.InterfaceC1737l) null, (java.util.concurrent.CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2122m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            p187r3.C2122m c2122m2 = (p187r3.C2122m) obj;
            if (c2122m2.f8480b != null) {
                m4221z(interfaceC2103c0, obj);
                throw null;
            }
            if (interfaceC2103c0 instanceof p209w3.AbstractC2359u) {
                return;
            }
            p154k3.AbstractC1803h.m3777c(interfaceC2103c0, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            p187r3.C2076D c2076d = (p187r3.C2076D) interfaceC2103c0;
            java.lang.Throwable th2 = c2122m2.f8483e;
            if (th2 != null) {
                m4225k(c2076d, th2);
                return;
            }
            p187r3.C2122m m4240a = p187r3.C2122m.m4240a(c2122m2, c2076d, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, m4240a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    /* renamed from: y */
    public final boolean m4235y() {
        if (this.f8424n == 2) {
            p110b3.InterfaceC1190d interfaceC1190d = this.f8470o;
            p154k3.AbstractC1803h.m3777c(interfaceC1190d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (p209w3.C2346h.f9279s.get((p209w3.C2346h) interfaceC1190d) != null) {
                return true;
            }
        }
        return false;
    }
}
