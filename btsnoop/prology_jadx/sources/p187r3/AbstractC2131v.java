package p187r3;

/* renamed from: r3.v */
/* loaded from: classes.dex */
public abstract class AbstractC2131v {

    /* renamed from: a */
    public static final p124e2.C1358f f8497a = new p124e2.C1358f("RESUME_TOKEN", 1);

    /* renamed from: b */
    public static final p124e2.C1358f f8498b = new p124e2.C1358f("CLOSED_EMPTY", 1);

    /* renamed from: c */
    public static final p124e2.C1358f f8499c = new p124e2.C1358f("COMPLETING_ALREADY", 1);

    /* renamed from: d */
    public static final p124e2.C1358f f8500d = new p124e2.C1358f("COMPLETING_WAITING_CHILDREN", 1);

    /* renamed from: e */
    public static final p124e2.C1358f f8501e = new p124e2.C1358f("COMPLETING_RETRY", 1);

    /* renamed from: f */
    public static final p124e2.C1358f f8502f = new p124e2.C1358f("TOO_LATE_TO_CANCEL", 1);

    /* renamed from: g */
    public static final p124e2.C1358f f8503g = new p124e2.C1358f("SEALED", 1);

    /* renamed from: h */
    public static final p187r3.C2077E f8504h = new p187r3.C2077E(false);

    /* renamed from: i */
    public static final p187r3.C2077E f8505i = new p187r3.C2077E(true);

    /* renamed from: a */
    public static final p110b3.InterfaceC1195i m4242a(p110b3.InterfaceC1195i interfaceC1195i, p110b3.InterfaceC1195i interfaceC1195i2, boolean z4) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        p187r3.C2125p c2125p = p187r3.C2125p.f8489o;
        boolean booleanValue = ((java.lang.Boolean) interfaceC1195i.mo679k(bool, c2125p)).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) interfaceC1195i2.mo679k(bool, c2125p)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return interfaceC1195i.mo676c(interfaceC1195i2);
        }
        p110b3.C1196j c1196j = p110b3.C1196j.f4623l;
        p110b3.InterfaceC1195i interfaceC1195i3 = (p110b3.InterfaceC1195i) interfaceC1195i.mo679k(c1196j, new p187r3.C2125p(2, 2));
        java.lang.Object obj = interfaceC1195i2;
        if (booleanValue2) {
            obj = interfaceC1195i2.mo679k(c1196j, p187r3.C2125p.f8488n);
        }
        return interfaceC1195i3.mo676c((p110b3.InterfaceC1195i) obj);
    }

    /* renamed from: b */
    public static final java.lang.String m4243b(java.lang.Object obj) {
        return java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj));
    }

    /* renamed from: c */
    public static final p187r3.C2108f m4244c(p110b3.InterfaceC1190d interfaceC1190d) {
        p187r3.C2108f c2108f;
        p187r3.C2108f c2108f2;
        if (!(interfaceC1190d instanceof p209w3.C2346h)) {
            return new p187r3.C2108f(1, interfaceC1190d);
        }
        p209w3.C2346h c2346h = (p209w3.C2346h) interfaceC1190d;
        loop0: while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p209w3.C2346h.f9279s;
            java.lang.Object obj = atomicReferenceFieldUpdater.get(c2346h);
            p124e2.C1358f c1358f = p209w3.AbstractC2339a.f9269d;
            c2108f = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(c2346h, c1358f);
                c2108f2 = null;
                break;
            }
            if (obj instanceof p187r3.C2108f) {
                while (!atomicReferenceFieldUpdater.compareAndSet(c2346h, obj, c1358f)) {
                    if (atomicReferenceFieldUpdater.get(c2346h) != obj) {
                        break;
                    }
                }
                c2108f2 = (p187r3.C2108f) obj;
                break loop0;
            }
            if (obj != c1358f && !(obj instanceof java.lang.Throwable)) {
                throw new java.lang.IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c2108f2 != null) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = p187r3.C2108f.f8468r;
            java.lang.Object obj2 = atomicReferenceFieldUpdater2.get(c2108f2);
            if (!(obj2 instanceof p187r3.C2122m) || ((p187r3.C2122m) obj2).f8482d == null) {
                p187r3.C2108f.f8467q.set(c2108f2, 536870911);
                atomicReferenceFieldUpdater2.set(c2108f2, p187r3.C2100b.f8462l);
                c2108f = c2108f2;
            } else {
                c2108f2.m4229r();
            }
            if (c2108f != null) {
                return c2108f;
            }
        }
        return new p187r3.C2108f(2, interfaceC1190d);
    }

    /* renamed from: d */
    public static final void m4245d(p110b3.InterfaceC1195i interfaceC1195i, java.lang.Throwable th) {
        try {
            p191s3.C2155b c2155b = (p191s3.C2155b) interfaceC1195i.mo678j(p187r3.C2129t.f8495l);
            if (c2155b != null) {
                c2155b.m4282e(interfaceC1195i, th);
            } else {
                p209w3.AbstractC2339a.m4542e(interfaceC1195i, th);
            }
        } catch (java.lang.Throwable th2) {
            if (th != th2) {
                java.lang.RuntimeException runtimeException = new java.lang.RuntimeException("Exception while trying to handle coroutine exception", th2);
                p101a.AbstractC0936a.m1793c(runtimeException, th);
                th = runtimeException;
            }
            p209w3.AbstractC2339a.m4542e(interfaceC1195i, th);
        }
    }

    /* renamed from: e */
    public static /* synthetic */ p187r3.InterfaceC2075C m4246e(p187r3.InterfaceC2088P interfaceC2088P, boolean z4, p187r3.AbstractC2092U abstractC2092U, int i4) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        return ((p187r3.C2097Z) interfaceC2088P).m4191I(z4, (i4 & 2) != 0, abstractC2092U);
    }

    /* renamed from: f */
    public static final boolean m4247f(int i4) {
        return i4 == 1 || i4 == 2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [r3.a, r3.e0] */
    /* renamed from: g */
    public static p187r3.C2107e0 m4248g(p187r3.InterfaceC2130u interfaceC2130u, p149j3.InterfaceC1741p interfaceC1741p) {
        p110b3.InterfaceC1195i m4242a = m4242a(interfaceC2130u.mo2652h(), p110b3.C1196j.f4623l, true);
        p218y3.C2421d c2421d = p187r3.AbstractC2074B.f8425a;
        if (m4242a != c2421d && m4242a.mo678j(p110b3.C1191e.f4622l) == null) {
            m4242a = m4242a.mo676c(c2421d);
        }
        ?? abstractC2098a = new p187r3.AbstractC2098a(m4242a, true);
        abstractC2098a.m4214W(1, abstractC2098a, interfaceC1741p);
        return abstractC2098a;
    }

    /* renamed from: h */
    public static final java.lang.Object m4249h(java.lang.Object obj) {
        return obj instanceof p187r3.C2123n ? p176p1.AbstractC1949a.m3942s(((p187r3.C2123n) obj).f8485a) : obj;
    }

    /* renamed from: i */
    public static final void m4250i(p187r3.C2108f c2108f, p110b3.InterfaceC1190d interfaceC1190d, boolean z4) {
        java.lang.Object obj = p187r3.C2108f.f8468r.get(c2108f);
        java.lang.Throwable mo4151e = c2108f.mo4151e(obj);
        java.lang.Object m3942s = mo4151e != null ? p176p1.AbstractC1949a.m3942s(mo4151e) : c2108f.mo4152g(obj);
        if (!z4) {
            interfaceC1190d.mo2836i(m3942s);
            return;
        }
        p154k3.AbstractC1803h.m3777c(interfaceC1190d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        p209w3.C2346h c2346h = (p209w3.C2346h) interfaceC1190d;
        p120d3.AbstractC1292b abstractC1292b = c2346h.f9281p;
        p110b3.InterfaceC1195i mo2835f = abstractC1292b.mo2835f();
        java.lang.Object m4550m = p209w3.AbstractC2339a.m4550m(mo2835f, c2346h.f9283r);
        p187r3.C2117j0 m4254m = m4550m != p209w3.AbstractC2339a.f9271f ? m4254m(abstractC1292b, mo2835f, m4550m) : null;
        try {
            abstractC1292b.mo2836i(m3942s);
        } finally {
            if (m4254m == null || m4254m.m4237X()) {
                p209w3.AbstractC2339a.m4545h(mo2835f, m4550m);
            }
        }
    }

    /* renamed from: j */
    public static java.lang.Object m4251j(p149j3.InterfaceC1741p interfaceC1741p) {
        p110b3.C1196j c1196j = p110b3.C1196j.f4623l;
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        p110b3.C1191e c1191e = p110b3.C1191e.f4622l;
        p187r3.AbstractC2080H m4236a = p187r3.AbstractC2113h0.m4236a();
        p110b3.InterfaceC1195i m4242a = m4242a(c1196j, m4236a, true);
        p218y3.C2421d c2421d = p187r3.AbstractC2074B.f8425a;
        if (m4242a != c2421d && m4242a.mo678j(c1191e) == null) {
            m4242a = m4242a.mo676c(c2421d);
        }
        p187r3.C2102c c2102c = new p187r3.C2102c(m4242a, currentThread, m4236a);
        c2102c.m4214W(1, c2102c, interfaceC1741p);
        p187r3.AbstractC2080H abstractC2080H = c2102c.f8465p;
        if (abstractC2080H != null) {
            int i4 = p187r3.AbstractC2080H.f8432q;
            abstractC2080H.m4166i(false);
        }
        while (!java.lang.Thread.interrupted()) {
            try {
                long mo4160l = abstractC2080H != null ? abstractC2080H.mo4160l() : Long.MAX_VALUE;
                if (!(c2102c.m4187E() instanceof p187r3.InterfaceC2084L)) {
                    if (abstractC2080H != null) {
                        int i5 = p187r3.AbstractC2080H.f8432q;
                        abstractC2080H.m4164g(false);
                    }
                    java.lang.Object m4253l = m4253l(c2102c.m4187E());
                    p187r3.C2123n c2123n = m4253l instanceof p187r3.C2123n ? (p187r3.C2123n) m4253l : null;
                    if (c2123n == null) {
                        return m4253l;
                    }
                    throw c2123n.f8485a;
                }
                java.util.concurrent.locks.LockSupport.parkNanos(c2102c, mo4160l);
            } catch (java.lang.Throwable th) {
                if (abstractC2080H != null) {
                    int i6 = p187r3.AbstractC2080H.f8432q;
                    abstractC2080H.m4164g(false);
                }
                throw th;
            }
        }
        java.lang.InterruptedException interruptedException = new java.lang.InterruptedException();
        c2102c.m4204s(interruptedException);
        throw interruptedException;
    }

    /* renamed from: k */
    public static final java.lang.String m4252k(p110b3.InterfaceC1190d interfaceC1190d) {
        java.lang.Object m3942s;
        if (interfaceC1190d instanceof p209w3.C2346h) {
            return interfaceC1190d.toString();
        }
        try {
            m3942s = interfaceC1190d + '@' + m4243b(interfaceC1190d);
        } catch (java.lang.Throwable th) {
            m3942s = p176p1.AbstractC1949a.m3942s(th);
        }
        if (p100Z2.AbstractC0931d.m1761a(m3942s) != null) {
            m3942s = interfaceC1190d.getClass().getName() + '@' + m4243b(interfaceC1190d);
        }
        return (java.lang.String) m3942s;
    }

    /* renamed from: l */
    public static final java.lang.Object m4253l(java.lang.Object obj) {
        p187r3.InterfaceC2084L interfaceC2084L;
        p187r3.C2085M c2085m = obj instanceof p187r3.C2085M ? (p187r3.C2085M) obj : null;
        return (c2085m == null || (interfaceC2084L = c2085m.f8438a) == null) ? obj : interfaceC2084L;
    }

    /* renamed from: m */
    public static final p187r3.C2117j0 m4254m(p110b3.InterfaceC1190d interfaceC1190d, p110b3.InterfaceC1195i interfaceC1195i, java.lang.Object obj) {
        p187r3.C2117j0 c2117j0 = null;
        if (!(interfaceC1190d instanceof p120d3.InterfaceC1293c)) {
            return null;
        }
        if (interfaceC1195i.mo678j(p187r3.C2119k0.f8478l) != null) {
            p120d3.InterfaceC1293c interfaceC1293c = (p120d3.InterfaceC1293c) interfaceC1190d;
            while (true) {
                if ((interfaceC1293c instanceof p187r3.C2135z) || (interfaceC1293c = interfaceC1293c.mo3030d()) == null) {
                    break;
                }
                if (interfaceC1293c instanceof p187r3.C2117j0) {
                    c2117j0 = (p187r3.C2117j0) interfaceC1293c;
                    break;
                }
            }
            if (c2117j0 != null) {
                c2117j0.m4238Y(interfaceC1195i, obj);
            }
        }
        return c2117j0;
    }

    /* renamed from: n */
    public static final java.lang.Object m4255n(p110b3.InterfaceC1195i interfaceC1195i, p149j3.InterfaceC1741p interfaceC1741p, p110b3.InterfaceC1190d interfaceC1190d) {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        p110b3.InterfaceC1195i mo2835f = interfaceC1190d.mo2835f();
        p110b3.InterfaceC1195i mo676c = !((java.lang.Boolean) interfaceC1195i.mo679k(java.lang.Boolean.FALSE, p187r3.C2125p.f8489o)).booleanValue() ? mo2835f.mo676c(interfaceC1195i) : m4242a(mo2835f, interfaceC1195i, false);
        p187r3.InterfaceC2088P interfaceC2088P = (p187r3.InterfaceC2088P) mo676c.mo678j(p187r3.C2129t.f8496m);
        if (interfaceC2088P != null && !interfaceC2088P.mo4169a()) {
            throw ((p187r3.C2097Z) interfaceC2088P).m4185A();
        }
        if (mo676c == mo2835f) {
            p209w3.C2358t c2358t = new p209w3.C2358t(interfaceC1190d, mo676c);
            return p196u.AbstractC2213h.m4421e(c2358t, c2358t, interfaceC1741p);
        }
        p110b3.C1191e c1191e = p110b3.C1191e.f4622l;
        if (p154k3.AbstractC1803h.m3775a(mo676c.mo678j(c1191e), mo2835f.mo678j(c1191e))) {
            p187r3.C2117j0 c2117j0 = new p187r3.C2117j0(interfaceC1190d, mo676c);
            p110b3.InterfaceC1195i interfaceC1195i2 = c2117j0.f8461n;
            java.lang.Object m4550m = p209w3.AbstractC2339a.m4550m(interfaceC1195i2, null);
            try {
                return p196u.AbstractC2213h.m4421e(c2117j0, c2117j0, interfaceC1741p);
            } finally {
                p209w3.AbstractC2339a.m4545h(interfaceC1195i2, m4550m);
            }
        }
        p209w3.C2358t c2358t2 = new p209w3.C2358t(interfaceC1190d, mo676c);
        p196u.AbstractC2212g.m4410n(interfaceC1741p, c2358t2, c2358t2);
        do {
            atomicIntegerFieldUpdater = p187r3.C2135z.f8509p;
            int i4 = atomicIntegerFieldUpdater.get(c2358t2);
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new java.lang.IllegalStateException("Already suspended");
                }
                java.lang.Object m4253l = m4253l(c2358t2.m4187E());
                if (m4253l instanceof p187r3.C2123n) {
                    throw ((p187r3.C2123n) m4253l).f8485a;
                }
                return m4253l;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(c2358t2, 0, 1));
        return p115c3.EnumC1252a.f4880l;
    }
}
