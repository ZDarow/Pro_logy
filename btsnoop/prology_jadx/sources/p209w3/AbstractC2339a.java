package p209w3;

/* renamed from: w3.a */
/* loaded from: classes.dex */
public abstract class AbstractC2339a {

    /* renamed from: a */
    public static final p124e2.C1358f f9266a = new p124e2.C1358f("NO_DECISION", 1);

    /* renamed from: b */
    public static final p124e2.C1358f f9267b = new p124e2.C1358f("CLOSED", 1);

    /* renamed from: c */
    public static final p124e2.C1358f f9268c = new p124e2.C1358f("UNDEFINED", 1);

    /* renamed from: d */
    public static final p124e2.C1358f f9269d = new p124e2.C1358f("REUSABLE_CLAIMED", 1);

    /* renamed from: e */
    public static final p124e2.C1358f f9270e = new p124e2.C1358f("CONDITION_FALSE", 1);

    /* renamed from: f */
    public static final p124e2.C1358f f9271f = new p124e2.C1358f("NO_THREAD_ELEMENTS", 1);

    /* renamed from: a */
    public static final void m4538a(p149j3.InterfaceC1737l interfaceC1737l, java.lang.Object obj, p110b3.InterfaceC1195i interfaceC1195i) {
        p037I1.C0307a m4539b = m4539b(interfaceC1737l, obj, null);
        if (m4539b != null) {
            p187r3.AbstractC2131v.m4245d(interfaceC1195i, m4539b);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [I1.a, java.lang.RuntimeException] */
    /* renamed from: b */
    public static final p037I1.C0307a m4539b(p149j3.InterfaceC1737l interfaceC1737l, java.lang.Object obj, p037I1.C0307a c0307a) {
        try {
            interfaceC1737l.mo661b(obj);
        } catch (java.lang.Throwable th) {
            if (c0307a == null || c0307a.getCause() == th) {
                return new java.lang.RuntimeException("Exception in undelivered element handler for " + obj, th);
            }
            p101a.AbstractC0936a.m1793c(c0307a, th);
        }
        return c0307a;
    }

    /* renamed from: c */
    public static final java.lang.Object m4540c(p209w3.AbstractC2359u abstractC2359u, long j4, p149j3.InterfaceC1741p interfaceC1741p) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (abstractC2359u.f9308n >= j4 && !abstractC2359u.mo4554c()) {
                return abstractC2359u;
            }
            java.lang.Object obj = p209w3.AbstractC2342d.f9274l.get(abstractC2359u);
            p124e2.C1358f c1358f = f9267b;
            if (obj == c1358f) {
                return c1358f;
            }
            p209w3.AbstractC2359u abstractC2359u2 = (p209w3.AbstractC2359u) ((p209w3.AbstractC2342d) obj);
            if (abstractC2359u2 == null) {
                abstractC2359u2 = (p209w3.AbstractC2359u) interfaceC1741p.mo502h(java.lang.Long.valueOf(abstractC2359u.f9308n + 1), abstractC2359u);
                do {
                    atomicReferenceFieldUpdater = p209w3.AbstractC2342d.f9274l;
                    if (atomicReferenceFieldUpdater.compareAndSet(abstractC2359u, null, abstractC2359u2)) {
                        if (abstractC2359u.mo4554c()) {
                            abstractC2359u.m4555d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(abstractC2359u) == null);
            }
            abstractC2359u = abstractC2359u2;
        }
    }

    /* renamed from: d */
    public static final p209w3.AbstractC2359u m4541d(java.lang.Object obj) {
        if (obj != f9267b) {
            return (p209w3.AbstractC2359u) obj;
        }
        throw new java.lang.IllegalStateException("Does not contain segment");
    }

    /* renamed from: e */
    public static final void m4542e(p110b3.InterfaceC1195i interfaceC1195i, java.lang.Throwable th) {
        java.lang.Throwable runtimeException;
        java.util.Iterator it = p209w3.AbstractC2344f.f9277a.iterator();
        while (it.hasNext()) {
            try {
                ((p191s3.C2155b) it.next()).m4282e(interfaceC1195i, th);
            } catch (java.lang.Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new java.lang.RuntimeException("Exception while trying to handle coroutine exception", th2);
                    p101a.AbstractC0936a.m1793c(runtimeException, th);
                }
                java.lang.Thread currentThread = java.lang.Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            p101a.AbstractC0936a.m1793c(th, new p209w3.C2345g(interfaceC1195i));
        } catch (java.lang.Throwable unused) {
        }
        java.lang.Thread currentThread2 = java.lang.Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    /* renamed from: f */
    public static final boolean m4543f(java.lang.Object obj) {
        return obj == f9267b;
    }

    /* renamed from: g */
    public static final java.lang.Object m4544g(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof java.util.ArrayList) {
            ((java.util.ArrayList) obj).add(obj2);
            return obj;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    /* renamed from: h */
    public static final void m4545h(p110b3.InterfaceC1195i interfaceC1195i, java.lang.Object obj) {
        if (obj == f9271f) {
            return;
        }
        if (!(obj instanceof p209w3.C2364z)) {
            java.lang.Object mo679k = interfaceC1195i.mo679k(null, p209w3.C2362x.f9312o);
            p154k3.AbstractC1803h.m3777c(mo679k, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            p009B2.AbstractC0051h.m159r(mo679k);
            throw null;
        }
        p209w3.C2364z c2364z = (p209w3.C2364z) obj;
        p187r3.InterfaceC2111g0[] interfaceC2111g0Arr = c2364z.f9317b;
        int length = interfaceC2111g0Arr.length - 1;
        if (length < 0) {
            return;
        }
        p187r3.InterfaceC2111g0 interfaceC2111g0 = interfaceC2111g0Arr[length];
        p154k3.AbstractC1803h.m3776b(null);
        java.lang.Object obj2 = c2364z.f9316a[length];
        throw null;
    }

    /* renamed from: i */
    public static final void m4546i(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj, p149j3.InterfaceC1737l interfaceC1737l) {
        if (!(interfaceC1190d instanceof p209w3.C2346h)) {
            interfaceC1190d.mo2836i(obj);
            return;
        }
        p209w3.C2346h c2346h = (p209w3.C2346h) interfaceC1190d;
        java.lang.Throwable m1761a = p100Z2.AbstractC0931d.m1761a(obj);
        java.lang.Object c2124o = m1761a == null ? interfaceC1737l != null ? new p187r3.C2124o(obj, interfaceC1737l) : obj : new p187r3.C2123n(m1761a, false);
        p187r3.AbstractC2128s abstractC2128s = c2346h.f9280o;
        p120d3.AbstractC1292b abstractC1292b = c2346h.f9281p;
        abstractC1292b.mo2835f();
        if (abstractC2128s.mo4241f()) {
            c2346h.f9282q = c2124o;
            c2346h.f8424n = 1;
            c2346h.f9280o.mo4159e(abstractC1292b.mo2835f(), c2346h);
            return;
        }
        p187r3.AbstractC2080H m4236a = p187r3.AbstractC2113h0.m4236a();
        if (m4236a.f8433n >= 4294967296L) {
            c2346h.f9282q = c2124o;
            c2346h.f8424n = 1;
            p105a3.C1019b c1019b = m4236a.f8435p;
            if (c1019b == null) {
                c1019b = new p105a3.C1019b();
                m4236a.f8435p = c1019b;
            }
            c1019b.addLast(c2346h);
            return;
        }
        m4236a.m4166i(true);
        try {
            p187r3.InterfaceC2088P interfaceC2088P = (p187r3.InterfaceC2088P) abstractC1292b.mo2835f().mo678j(p187r3.C2129t.f8496m);
            if (interfaceC2088P == null || interfaceC2088P.mo4169a()) {
                java.lang.Object obj2 = c2346h.f9283r;
                p110b3.InterfaceC1195i mo2835f = abstractC1292b.mo2835f();
                java.lang.Object m4550m = m4550m(mo2835f, obj2);
                p187r3.C2117j0 m4254m = m4550m != f9271f ? p187r3.AbstractC2131v.m4254m(abstractC1292b, mo2835f, m4550m) : null;
                try {
                    abstractC1292b.mo2836i(obj);
                } finally {
                    if (m4254m == null || m4254m.m4237X()) {
                        m4545h(mo2835f, m4550m);
                    }
                }
            } else {
                java.util.concurrent.CancellationException m4185A = ((p187r3.C2097Z) interfaceC2088P).m4185A();
                c2346h.mo4149b(c2124o, m4185A);
                c2346h.mo2836i(p176p1.AbstractC1949a.m3942s(m4185A));
            }
            do {
            } while (m4236a.m4167n());
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0084  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long m4547j(java.lang.String r22, long r23, long r25, long r27) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p209w3.AbstractC2339a.m4547j(java.lang.String, long, long, long):long");
    }

    /* renamed from: k */
    public static int m4548k(java.lang.String str, int i4, int i5, int i6, int i7) {
        if ((i7 & 4) != 0) {
            i5 = 1;
        }
        if ((i7 & 8) != 0) {
            i6 = Integer.MAX_VALUE;
        }
        return (int) m4547j(str, i4, i5, i6);
    }

    /* renamed from: l */
    public static final java.lang.Object m4549l(p110b3.InterfaceC1195i interfaceC1195i) {
        java.lang.Object mo679k = interfaceC1195i.mo679k(0, p209w3.C2362x.f9311n);
        p154k3.AbstractC1803h.m3776b(mo679k);
        return mo679k;
    }

    /* renamed from: m */
    public static final java.lang.Object m4550m(p110b3.InterfaceC1195i interfaceC1195i, java.lang.Object obj) {
        if (obj == null) {
            obj = m4549l(interfaceC1195i);
        }
        if (obj == 0) {
            return f9271f;
        }
        if (obj instanceof java.lang.Integer) {
            return interfaceC1195i.mo679k(new p209w3.C2364z(((java.lang.Number) obj).intValue(), interfaceC1195i), p209w3.C2362x.f9313p);
        }
        p009B2.AbstractC0051h.m159r(obj);
        throw null;
    }
}
