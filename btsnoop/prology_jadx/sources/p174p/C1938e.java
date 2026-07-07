package p174p;

/* renamed from: p.e */
/* loaded from: classes.dex */
public final class C1938e extends p176p1.AbstractC1949a {
    @Override // p176p1.AbstractC1949a
    /* renamed from: G */
    public final void mo3887G(p174p.C1939f c1939f, p174p.C1939f c1939f2) {
        c1939f.f7874b = c1939f2;
    }

    @Override // p176p1.AbstractC1949a
    /* renamed from: H */
    public final void mo3888H(p174p.C1939f c1939f, java.lang.Thread thread) {
        c1939f.f7873a = thread;
    }

    @Override // p176p1.AbstractC1949a
    /* renamed from: h */
    public final boolean mo3889h(p174p.AbstractFutureC1940g abstractFutureC1940g, p174p.C1936c c1936c, p174p.C1936c c1936c2) {
        synchronized (abstractFutureC1940g) {
            try {
                if (abstractFutureC1940g.f7880b != c1936c) {
                    return false;
                }
                abstractFutureC1940g.f7880b = c1936c2;
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p176p1.AbstractC1949a
    /* renamed from: i */
    public final boolean mo3890i(p174p.AbstractFutureC1940g abstractFutureC1940g, java.lang.Object obj, java.lang.Object obj2) {
        synchronized (abstractFutureC1940g) {
            try {
                if (abstractFutureC1940g.f7879a != obj) {
                    return false;
                }
                abstractFutureC1940g.f7879a = obj2;
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p176p1.AbstractC1949a
    /* renamed from: j */
    public final boolean mo3891j(p174p.AbstractFutureC1940g abstractFutureC1940g, p174p.C1939f c1939f, p174p.C1939f c1939f2) {
        synchronized (abstractFutureC1940g) {
            try {
                if (abstractFutureC1940g.f7881c != c1939f) {
                    return false;
                }
                abstractFutureC1940g.f7881c = c1939f2;
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
