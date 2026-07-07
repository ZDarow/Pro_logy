package p195t3;

/* renamed from: t3.l */
/* loaded from: classes.dex */
public final class C2199l extends p195t3.C2189b {

    /* renamed from: w */
    public final int f8802w;

    public C2199l(int i4, int i5, p149j3.InterfaceC1737l interfaceC1737l) {
        super(i4, interfaceC1737l);
        this.f8802w = i5;
        if (i5 != 1) {
            if (i4 < 1) {
                throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m151j(i4, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new java.lang.IllegalArgumentException(("This implementation does not support suspension for senders, use " + p154k3.AbstractC1812q.m3788a(p195t3.C2189b.class).m3774b() + " instead").toString());
        }
    }

    /* renamed from: D */
    public final java.lang.Object m4382D(java.lang.Object obj, boolean z4) {
        p195t3.C2197j c2197j;
        p149j3.InterfaceC1737l interfaceC1737l;
        p037I1.C0307a m4539b;
        p100Z2.C0934g c0934g = p100Z2.C0934g.f3298a;
        if (this.f8802w == 3) {
            java.lang.Object mo4354g = super.mo4354g(obj);
            if (!(mo4354g instanceof p195t3.C2195h) || (mo4354g instanceof p195t3.C2194g)) {
                return mo4354g;
            }
            if (!z4 || (interfaceC1737l = this.f8774m) == null || (m4539b = p209w3.AbstractC2339a.m4539b(interfaceC1737l, obj, null)) == null) {
                return c0934g;
            }
            throw m4539b;
        }
        java.lang.Object obj2 = p195t3.AbstractC2191d.f8779d;
        p195t3.C2197j c2197j2 = (p195t3.C2197j) p195t3.C2189b.f8768r.get(this);
        while (true) {
            long andIncrement = p195t3.C2189b.f8764n.getAndIncrement(this);
            long j4 = andIncrement & 1152921504606846975L;
            boolean m4364r = m4364r(andIncrement, false);
            int i4 = p195t3.AbstractC2191d.f8777b;
            long j5 = i4;
            long j6 = j4 / j5;
            int i5 = (int) (j4 % j5);
            if (c2197j2.f9308n != j6) {
                p195t3.C2197j m4343a = p195t3.C2189b.m4343a(this, j6, c2197j2);
                if (m4343a != null) {
                    c2197j = m4343a;
                } else if (m4364r) {
                    return new p195t3.C2194g(m4362o());
                }
            } else {
                c2197j = c2197j2;
            }
            int m4345d = p195t3.C2189b.m4345d(this, c2197j, i5, obj, j4, obj2, m4364r);
            if (m4345d == 0) {
                c2197j.m4552a();
                return c0934g;
            }
            if (m4345d == 1) {
                return c0934g;
            }
            if (m4345d == 2) {
                if (m4364r) {
                    c2197j.m4573h();
                    return new p195t3.C2194g(m4362o());
                }
                p187r3.InterfaceC2121l0 interfaceC2121l0 = obj2 instanceof p187r3.InterfaceC2121l0 ? (p187r3.InterfaceC2121l0) obj2 : null;
                if (interfaceC2121l0 != null) {
                    interfaceC2121l0.mo4224a(c2197j, i5 + i4);
                }
                m4357j((c2197j.f9308n * j5) + i5);
                return c0934g;
            }
            if (m4345d == 3) {
                throw new java.lang.IllegalStateException("unexpected");
            }
            if (m4345d == 4) {
                if (j4 < p195t3.C2189b.f8765o.get(this)) {
                    c2197j.m4552a();
                }
                return new p195t3.C2194g(m4362o());
            }
            if (m4345d == 5) {
                c2197j.m4552a();
            }
            c2197j2 = c2197j;
        }
    }

    @Override // p195t3.C2189b, p195t3.InterfaceC2204q
    /* renamed from: e */
    public final java.lang.Object mo4352e(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        p037I1.C0307a m4539b;
        if (!(m4382D(obj, true) instanceof p195t3.C2194g)) {
            return p100Z2.C0934g.f3298a;
        }
        p149j3.InterfaceC1737l interfaceC1737l = this.f8774m;
        if (interfaceC1737l == null || (m4539b = p209w3.AbstractC2339a.m4539b(interfaceC1737l, obj, null)) == null) {
            throw m4362o();
        }
        p101a.AbstractC0936a.m1793c(m4539b, m4362o());
        throw m4539b;
    }

    @Override // p195t3.C2189b, p195t3.InterfaceC2204q
    /* renamed from: g */
    public final java.lang.Object mo4354g(java.lang.Object obj) {
        return m4382D(obj, false);
    }

    @Override // p195t3.C2189b
    /* renamed from: t */
    public final boolean mo4366t() {
        return this.f8802w == 2;
    }
}
