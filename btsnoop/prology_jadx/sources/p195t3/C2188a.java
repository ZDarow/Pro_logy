package p195t3;

/* renamed from: t3.a */
/* loaded from: classes.dex */
public final class C2188a implements p187r3.InterfaceC2121l0 {

    /* renamed from: l */
    public java.lang.Object f8761l = p195t3.AbstractC2191d.f8791p;

    /* renamed from: m */
    public p187r3.C2108f f8762m;

    /* renamed from: n */
    public final /* synthetic */ p195t3.C2189b f8763n;

    public C2188a(p195t3.C2189b c2189b) {
        this.f8763n = c2189b;
    }

    @Override // p187r3.InterfaceC2121l0
    /* renamed from: a */
    public final void mo4224a(p209w3.AbstractC2359u abstractC2359u, int i4) {
        p187r3.C2108f c2108f = this.f8762m;
        if (c2108f != null) {
            c2108f.mo4224a(abstractC2359u, i4);
        }
    }

    /* renamed from: b */
    public final java.lang.Object m4342b(p200u3.C2252f c2252f) {
        p187r3.C2108f c2108f;
        java.lang.Boolean bool;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p195t3.C2189b.f8769s;
        p195t3.C2189b c2189b = this.f8763n;
        p195t3.C2197j c2197j = (p195t3.C2197j) atomicReferenceFieldUpdater.get(c2189b);
        while (true) {
            c2189b.getClass();
            if (c2189b.m4364r(p195t3.C2189b.f8764n.get(c2189b), true)) {
                this.f8761l = p195t3.AbstractC2191d.f8787l;
                java.lang.Throwable m4360m = c2189b.m4360m();
                if (m4360m == null) {
                    return java.lang.Boolean.FALSE;
                }
                int i4 = p209w3.AbstractC2360v.f9309a;
                throw m4360m;
            }
            long andIncrement = p195t3.C2189b.f8765o.getAndIncrement(c2189b);
            long j4 = p195t3.AbstractC2191d.f8777b;
            long j5 = andIncrement / j4;
            int i5 = (int) (andIncrement % j4);
            if (c2197j.f9308n != j5) {
                p195t3.C2197j m4359l = c2189b.m4359l(j5, c2197j);
                if (m4359l == null) {
                    continue;
                } else {
                    c2197j = m4359l;
                }
            }
            java.lang.Object m4348A = c2189b.m4348A(c2197j, i5, andIncrement, null);
            p124e2.C1358f c1358f = p195t3.AbstractC2191d.f8788m;
            if (m4348A == c1358f) {
                throw new java.lang.IllegalStateException("unreachable");
            }
            p124e2.C1358f c1358f2 = p195t3.AbstractC2191d.f8790o;
            if (m4348A == c1358f2) {
                if (andIncrement < c2189b.m4363p()) {
                    c2197j.m4552a();
                }
            } else {
                if (m4348A != p195t3.AbstractC2191d.f8789n) {
                    c2197j.m4552a();
                    this.f8761l = m4348A;
                    return java.lang.Boolean.TRUE;
                }
                p195t3.C2189b c2189b2 = this.f8763n;
                p187r3.C2108f m4244c = p187r3.AbstractC2131v.m4244c(p176p1.AbstractC1949a.m3902C(c2252f));
                try {
                    this.f8762m = m4244c;
                    c2108f = m4244c;
                    try {
                        java.lang.Object m4348A2 = c2189b2.m4348A(c2197j, i5, andIncrement, this);
                        if (m4348A2 == c1358f) {
                            mo4224a(c2197j, i5);
                        } else {
                            p209w3.C2354p c2354p = null;
                            p110b3.InterfaceC1195i interfaceC1195i = c2108f.f8471p;
                            p149j3.InterfaceC1737l interfaceC1737l = c2189b2.f8774m;
                            if (m4348A2 == c1358f2) {
                                if (andIncrement < c2189b2.m4363p()) {
                                    c2197j.m4552a();
                                }
                                p195t3.C2197j c2197j2 = (p195t3.C2197j) p195t3.C2189b.f8769s.get(c2189b2);
                                while (true) {
                                    if (c2189b2.m4364r(p195t3.C2189b.f8764n.get(c2189b2), true)) {
                                        p187r3.C2108f c2108f2 = this.f8762m;
                                        p154k3.AbstractC1803h.m3776b(c2108f2);
                                        this.f8762m = null;
                                        this.f8761l = p195t3.AbstractC2191d.f8787l;
                                        java.lang.Throwable m4360m2 = c2189b.m4360m();
                                        if (m4360m2 == null) {
                                            c2108f2.mo2836i(java.lang.Boolean.FALSE);
                                        } else {
                                            c2108f2.mo2836i(p176p1.AbstractC1949a.m3942s(m4360m2));
                                        }
                                    } else {
                                        long andIncrement2 = p195t3.C2189b.f8765o.getAndIncrement(c2189b2);
                                        long j6 = p195t3.AbstractC2191d.f8777b;
                                        long j7 = andIncrement2 / j6;
                                        int i6 = (int) (andIncrement2 % j6);
                                        if (c2197j2.f9308n != j7) {
                                            p195t3.C2197j m4359l2 = c2189b2.m4359l(j7, c2197j2);
                                            if (m4359l2 != null) {
                                                c2197j2 = m4359l2;
                                            }
                                        }
                                        p149j3.InterfaceC1737l interfaceC1737l2 = interfaceC1737l;
                                        java.lang.Object m4348A3 = c2189b2.m4348A(c2197j2, i6, andIncrement2, this);
                                        if (m4348A3 == p195t3.AbstractC2191d.f8788m) {
                                            mo4224a(c2197j2, i6);
                                            break;
                                        }
                                        if (m4348A3 == p195t3.AbstractC2191d.f8790o) {
                                            if (andIncrement2 < c2189b2.m4363p()) {
                                                c2197j2.m4552a();
                                            }
                                            interfaceC1737l = interfaceC1737l2;
                                        } else {
                                            if (m4348A3 == p195t3.AbstractC2191d.f8789n) {
                                                throw new java.lang.IllegalStateException("unexpected");
                                            }
                                            c2197j2.m4552a();
                                            this.f8761l = m4348A3;
                                            this.f8762m = null;
                                            bool = java.lang.Boolean.TRUE;
                                            if (interfaceC1737l2 != null) {
                                                c2354p = new p209w3.C2354p(interfaceC1737l2, m4348A3, interfaceC1195i);
                                            }
                                        }
                                    }
                                }
                            } else {
                                c2197j.m4552a();
                                this.f8761l = m4348A2;
                                this.f8762m = null;
                                bool = java.lang.Boolean.TRUE;
                                if (interfaceC1737l != null) {
                                    c2354p = new p209w3.C2354p(interfaceC1737l, m4348A2, interfaceC1195i);
                                }
                            }
                            c2108f.mo4217l(bool, c2354p);
                        }
                        return c2108f.m4231u();
                    } catch (java.lang.Throwable th) {
                        th = th;
                        c2108f.m4222B();
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    c2108f = m4244c;
                }
            }
        }
    }
}
