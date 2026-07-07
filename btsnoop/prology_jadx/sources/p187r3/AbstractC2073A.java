package p187r3;

/* renamed from: r3.A */
/* loaded from: classes.dex */
public abstract class AbstractC2073A extends p218y3.AbstractRunnableC2425h {

    /* renamed from: n */
    public int f8424n;

    public AbstractC2073A(int i4) {
        super(0L, p218y3.AbstractC2427j.f9542g);
        this.f8424n = i4;
    }

    /* renamed from: b */
    public abstract void mo4149b(java.lang.Object obj, java.util.concurrent.CancellationException cancellationException);

    /* renamed from: c */
    public abstract p110b3.InterfaceC1190d mo4150c();

    /* renamed from: e */
    public java.lang.Throwable mo4151e(java.lang.Object obj) {
        p187r3.C2123n c2123n = obj instanceof p187r3.C2123n ? (p187r3.C2123n) obj : null;
        if (c2123n != null) {
            return c2123n.f8485a;
        }
        return null;
    }

    /* renamed from: g */
    public java.lang.Object mo4152g(java.lang.Object obj) {
        return obj;
    }

    /* renamed from: h */
    public final void m4153h(java.lang.Throwable th, java.lang.Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            p101a.AbstractC0936a.m1793c(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        p154k3.AbstractC1803h.m3776b(th);
        p187r3.AbstractC2131v.m4245d(mo4150c().mo2835f(), new java.lang.Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* renamed from: j */
    public abstract java.lang.Object mo4154j();

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj = p100Z2.C0934g.f3298a;
        p009B2.C0032C c0032c = this.f9534m;
        try {
            p110b3.InterfaceC1190d mo4150c = mo4150c();
            p154k3.AbstractC1803h.m3777c(mo4150c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            p209w3.C2346h c2346h = (p209w3.C2346h) mo4150c;
            p120d3.AbstractC1292b abstractC1292b = c2346h.f9281p;
            java.lang.Object obj2 = c2346h.f9283r;
            p110b3.InterfaceC1195i mo2835f = abstractC1292b.mo2835f();
            java.lang.Object m4550m = p209w3.AbstractC2339a.m4550m(mo2835f, obj2);
            p187r3.C2117j0 m4254m = m4550m != p209w3.AbstractC2339a.f9271f ? p187r3.AbstractC2131v.m4254m(abstractC1292b, mo2835f, m4550m) : null;
            try {
                p110b3.InterfaceC1195i mo2835f2 = abstractC1292b.mo2835f();
                java.lang.Object mo4154j = mo4154j();
                java.lang.Throwable mo4151e = mo4151e(mo4154j);
                p187r3.InterfaceC2088P interfaceC2088P = (mo4151e == null && p187r3.AbstractC2131v.m4247f(this.f8424n)) ? (p187r3.InterfaceC2088P) mo2835f2.mo678j(p187r3.C2129t.f8496m) : null;
                if (interfaceC2088P != null && !interfaceC2088P.mo4169a()) {
                    java.util.concurrent.CancellationException m4185A = ((p187r3.C2097Z) interfaceC2088P).m4185A();
                    mo4149b(mo4154j, m4185A);
                    abstractC1292b.mo2836i(p176p1.AbstractC1949a.m3942s(m4185A));
                } else if (mo4151e != null) {
                    abstractC1292b.mo2836i(p176p1.AbstractC1949a.m3942s(mo4151e));
                } else {
                    abstractC1292b.mo2836i(mo4152g(mo4154j));
                }
                if (m4254m == null || m4254m.m4237X()) {
                    p209w3.AbstractC2339a.m4545h(mo2835f, m4550m);
                }
                try {
                    c0032c.getClass();
                } catch (java.lang.Throwable th) {
                    obj = p176p1.AbstractC1949a.m3942s(th);
                }
                m4153h(null, p100Z2.AbstractC0931d.m1761a(obj));
            } catch (java.lang.Throwable th2) {
                if (m4254m == null || m4254m.m4237X()) {
                    p209w3.AbstractC2339a.m4545h(mo2835f, m4550m);
                }
                throw th2;
            }
        } catch (java.lang.Throwable th3) {
            try {
                c0032c.getClass();
            } catch (java.lang.Throwable th4) {
                obj = p176p1.AbstractC1949a.m3942s(th4);
            }
            m4153h(th3, p100Z2.AbstractC0931d.m1761a(obj));
        }
    }
}
