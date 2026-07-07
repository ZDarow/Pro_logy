package p193t0;

/* renamed from: t0.b */
/* loaded from: classes.dex */
public final class C2164b implements p197u0.InterfaceC2224k, p215y0.InterfaceC2395g, p215y0.InterfaceC2405q {
    /* renamed from: d */
    public static p128f1.C1383e m4284d(p197u0.C2221h c2221h, p006B.C0020c c0020c) {
        int i4;
        java.io.IOException iOException = (java.io.IOException) c0020c.f88m;
        if (!(iOException instanceof p094Y.C0885w) || ((i4 = ((p094Y.C0885w) iOException).f3173o) != 403 && i4 != 404 && i4 != 410 && i4 != 416 && i4 != 500 && i4 != 503)) {
            return null;
        }
        if (c2221h.m4428a(1)) {
            return new p128f1.C1383e(300000L, 1);
        }
        if (c2221h.m4428a(2)) {
            return new p128f1.C1383e(60000L, 2);
        }
        return null;
    }

    /* renamed from: f */
    public static long m4285f(p006B.C0020c c0020c) {
        java.lang.Throwable th = (java.io.IOException) c0020c.f88m;
        if (!(th instanceof p076T.C0666I) && !(th instanceof java.io.FileNotFoundException) && !(th instanceof p094Y.C0882t) && !(th instanceof p197u0.C2226m)) {
            int i4 = p094Y.C0871i.f3120m;
            while (th != null) {
                if (!(th instanceof p094Y.C0871i) || ((p094Y.C0871i) th).f3121l != 2008) {
                    th = th.getCause();
                }
            }
            return java.lang.Math.min((c0020c.f87l - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }

    @Override // p215y0.InterfaceC2395g
    /* renamed from: a */
    public long mo284a(long j4) {
        return j4;
    }

    @Override // p197u0.InterfaceC2224k
    /* renamed from: b */
    public void mo3266b() {
        synchronized (p202v0.AbstractC2269a.f9005a) {
            java.lang.Object obj = p202v0.AbstractC2269a.f9006b;
            synchronized (obj) {
                if (p202v0.AbstractC2269a.f9007c) {
                    return;
                }
                long m4454a = p202v0.AbstractC2269a.m4454a();
                synchronized (obj) {
                    p202v0.AbstractC2269a.f9008d = m4454a;
                    p202v0.AbstractC2269a.f9007c = true;
                }
            }
        }
    }

    @Override // p197u0.InterfaceC2224k
    /* renamed from: c */
    public void mo3267c() {
    }

    /* renamed from: e */
    public int m4286e(int i4) {
        return i4 == 7 ? 6 : 3;
    }

    @Override // p215y0.InterfaceC2405q
    /* renamed from: s */
    public void mo637s() {
    }

    @Override // p215y0.InterfaceC2405q
    /* renamed from: t */
    public void mo638t(p215y0.InterfaceC2414z interfaceC2414z) {
    }

    @Override // p215y0.InterfaceC2405q
    /* renamed from: v */
    public p215y0.InterfaceC2387F mo640v(int i4, int i5) {
        return new p215y0.C2402n();
    }
}
