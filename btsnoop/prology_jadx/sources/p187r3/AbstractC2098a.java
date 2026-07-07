package p187r3;

/* renamed from: r3.a */
/* loaded from: classes.dex */
public abstract class AbstractC2098a extends p187r3.C2097Z implements p110b3.InterfaceC1190d, p187r3.InterfaceC2130u {

    /* renamed from: n */
    public final p110b3.InterfaceC1195i f8461n;

    public AbstractC2098a(p110b3.InterfaceC1195i interfaceC1195i, boolean z4) {
        super(z4);
        m4190H((p187r3.InterfaceC2088P) interfaceC1195i.mo678j(p187r3.C2129t.f8496m));
        this.f8461n = interfaceC1195i.mo676c(this);
    }

    @Override // p187r3.C2097Z
    /* renamed from: G */
    public final void mo4189G(p037I1.C0307a c0307a) {
        p187r3.AbstractC2131v.m4245d(this.f8461n, c0307a);
    }

    @Override // p187r3.C2097Z
    /* renamed from: O */
    public final void mo4196O(java.lang.Object obj) {
        if (!(obj instanceof p187r3.C2123n)) {
            mo4213V(obj);
        } else {
            p187r3.C2123n c2123n = (p187r3.C2123n) obj;
            mo4212U(c2123n.f8485a, p187r3.C2123n.f8484b.get(c2123n) != 0);
        }
    }

    /* renamed from: U */
    public void mo4212U(java.lang.Throwable th, boolean z4) {
    }

    /* renamed from: V */
    public void mo4213V(java.lang.Object obj) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: W */
    public final void m4214W(int i4, p187r3.AbstractC2098a abstractC2098a, p149j3.InterfaceC1741p interfaceC1741p) {
        int m781b = p044L.AbstractC0352j.m781b(i4);
        if (m781b == 0) {
            p196u.AbstractC2212g.m4410n(interfaceC1741p, abstractC2098a, this);
            return;
        }
        if (m781b != 1) {
            if (m781b == 2) {
                p176p1.AbstractC1949a.m3902C(((p120d3.AbstractC1292b) interfaceC1741p).mo659g(this, abstractC2098a)).mo2836i(p100Z2.C0934g.f3298a);
                return;
            }
            if (m781b != 3) {
                throw new java.lang.RuntimeException();
            }
            try {
                p110b3.InterfaceC1195i interfaceC1195i = this.f8461n;
                java.lang.Object m4550m = p209w3.AbstractC2339a.m4550m(interfaceC1195i, null);
                try {
                    p154k3.AbstractC1814s.m3789a(2, interfaceC1741p);
                    java.lang.Object mo502h = interfaceC1741p.mo502h(abstractC2098a, this);
                    if (mo502h != p115c3.EnumC1252a.f4880l) {
                        mo2836i(mo502h);
                    }
                } finally {
                    p209w3.AbstractC2339a.m4545h(interfaceC1195i, m4550m);
                }
            } catch (java.lang.Throwable th) {
                mo2836i(p176p1.AbstractC1949a.m3942s(th));
            }
        }
    }

    @Override // p110b3.InterfaceC1190d
    /* renamed from: f */
    public final p110b3.InterfaceC1195i mo2835f() {
        return this.f8461n;
    }

    @Override // p187r3.InterfaceC2130u
    /* renamed from: h */
    public final p110b3.InterfaceC1195i mo2652h() {
        return this.f8461n;
    }

    @Override // p110b3.InterfaceC1190d
    /* renamed from: i */
    public final void mo2836i(java.lang.Object obj) {
        java.lang.Throwable m1761a = p100Z2.AbstractC0931d.m1761a(obj);
        if (m1761a != null) {
            obj = new p187r3.C2123n(m1761a, false);
        }
        java.lang.Object m4194L = m4194L(obj);
        if (m4194L == p187r3.AbstractC2131v.f8500d) {
            return;
        }
        mo4203r(m4194L);
    }

    @Override // p187r3.C2097Z
    /* renamed from: v */
    public final java.lang.String mo4207v() {
        return getClass().getSimpleName().concat(" was cancelled");
    }
}
