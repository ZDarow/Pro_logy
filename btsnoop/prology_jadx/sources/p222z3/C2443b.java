package p222z3;

/* renamed from: z3.b */
/* loaded from: classes.dex */
public final class C2443b extends p154k3.AbstractC1804i implements p149j3.InterfaceC1737l {

    /* renamed from: m */
    public final /* synthetic */ int f9600m;

    /* renamed from: n */
    public final /* synthetic */ java.lang.Object f9601n;

    /* renamed from: o */
    public final /* synthetic */ java.lang.Object f9602o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2443b(int i4, java.lang.Object obj, java.lang.Object obj2) {
        super(1);
        this.f9600m = i4;
        this.f9601n = obj;
        this.f9602o = obj2;
    }

    @Override // p149j3.InterfaceC1737l
    /* renamed from: b */
    public final java.lang.Object mo661b(java.lang.Object obj) {
        java.lang.Object c2194g;
        p195t3.C2197j c2197j;
        p100Z2.C0934g c0934g;
        p100Z2.C0934g c0934g2;
        switch (this.f9600m) {
            case 0:
                ((p222z3.C2444c) this.f9602o).getClass();
                ((p222z3.C2445d) this.f9601n).m4683e(null);
                return p100Z2.C0934g.f3298a;
            case 1:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p222z3.C2445d.f9605g;
                ((p222z3.C2444c) this.f9602o).getClass();
                p222z3.C2445d c2445d = (p222z3.C2445d) this.f9601n;
                atomicReferenceFieldUpdater.set(c2445d, null);
                c2445d.m4683e(null);
                return p100Z2.C0934g.f3298a;
            default:
                java.lang.Throwable th = (java.lang.Throwable) obj;
                ((p035I.C0260L) this.f9601n).mo661b(th);
                p035I.C0291m c0291m = (p035I.C0291m) this.f9602o;
                ((p195t3.C2189b) c0291m.f878n).m4355h(th, false);
                do {
                    p195t3.C2189b c2189b = (p195t3.C2189b) c0291m.f878n;
                    c2189b.getClass();
                    java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = p195t3.C2189b.f8765o;
                    long j4 = atomicLongFieldUpdater.get(c2189b);
                    java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater2 = p195t3.C2189b.f8764n;
                    long j5 = atomicLongFieldUpdater2.get(c2189b);
                    if (c2189b.m4364r(j5, true)) {
                        c2194g = new p195t3.C2194g(c2189b.m4360m());
                    } else {
                        long j6 = j5 & 1152921504606846975L;
                        java.lang.Object obj2 = p195t3.AbstractC2196i.f8799a;
                        if (j4 < j6) {
                            java.lang.Object obj3 = p195t3.AbstractC2191d.f8786k;
                            p195t3.C2197j c2197j2 = (p195t3.C2197j) p195t3.C2189b.f8769s.get(c2189b);
                            for (boolean z4 = true; !c2189b.m4364r(atomicLongFieldUpdater2.get(c2189b), z4); z4 = true) {
                                long andIncrement = atomicLongFieldUpdater.getAndIncrement(c2189b);
                                long j7 = p195t3.AbstractC2191d.f8777b;
                                java.lang.Object obj4 = obj2;
                                long j8 = andIncrement / j7;
                                int i4 = (int) (andIncrement % j7);
                                if (c2197j2.f9308n != j8) {
                                    p195t3.C2197j m4359l = c2189b.m4359l(j8, c2197j2);
                                    if (m4359l == null) {
                                        continue;
                                        obj2 = obj4;
                                    } else {
                                        c2197j = m4359l;
                                    }
                                } else {
                                    c2197j = c2197j2;
                                }
                                java.lang.Object m4348A = c2189b.m4348A(c2197j, i4, andIncrement, obj3);
                                if (m4348A == p195t3.AbstractC2191d.f8788m) {
                                    p187r3.InterfaceC2121l0 interfaceC2121l0 = obj3 instanceof p187r3.InterfaceC2121l0 ? (p187r3.InterfaceC2121l0) obj3 : null;
                                    if (interfaceC2121l0 != null) {
                                        interfaceC2121l0.mo4224a(c2197j, i4);
                                    }
                                    c2189b.m4350C(andIncrement);
                                    c2197j.m4573h();
                                    obj2 = obj4;
                                } else if (m4348A == p195t3.AbstractC2191d.f8790o) {
                                    if (andIncrement < c2189b.m4363p()) {
                                        c2197j.m4552a();
                                    }
                                    c2197j2 = c2197j;
                                    obj2 = obj4;
                                } else {
                                    if (m4348A == p195t3.AbstractC2191d.f8789n) {
                                        throw new java.lang.IllegalStateException("unexpected");
                                    }
                                    c2197j.m4552a();
                                    obj2 = m4348A;
                                }
                            }
                            c2194g = new p195t3.C2194g(c2189b.m4360m());
                        }
                        c2194g = obj2;
                    }
                    c0934g = null;
                    if (c2194g instanceof p195t3.C2195h) {
                        c2194g = null;
                    }
                    c0934g2 = p100Z2.C0934g.f3298a;
                    if (c2194g != null) {
                        p035I.C0261M.f776m.mo502h(c2194g, th);
                        c0934g = c0934g2;
                    }
                } while (c0934g != null);
                return c0934g2;
        }
    }
}
