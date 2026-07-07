package p117d0;

/* renamed from: d0.n */
/* loaded from: classes.dex */
public final class C1270n implements p215y0.InterfaceC2387F {

    /* renamed from: a */
    public final p179q0.C1983Z f5098a;

    /* renamed from: b */
    public final p094Y.C0886x f5099b = new p094Y.C0886x((char) 0, 4);

    /* renamed from: c */
    public final p032H0.C0244a f5100c = new p098Z.C0921f(1);

    /* renamed from: d */
    public long f5101d = -9223372036854775807L;

    /* renamed from: e */
    public final /* synthetic */ p117d0.C1271o f5102e;

    /* JADX WARN: Type inference failed for: r2v3, types: [Z.f, H0.a] */
    public C1270n(p117d0.C1271o c1271o, p197u0.C2218e c2218e) {
        this.f5102e = c1271o;
        this.f5098a = new p179q0.C1983Z(c2218e, null, null);
    }

    @Override // p215y0.InterfaceC2387F
    /* renamed from: a */
    public final void mo1405a(p086W.C0798r c0798r, int i4, int i5) {
        this.f5098a.mo1405a(c0798r, i4, 0);
    }

    @Override // p215y0.InterfaceC2387F
    /* renamed from: b */
    public final void mo1406b(long j4, int i4, int i5, int i6, p215y0.C2386E c2386e) {
        long m4010e;
        long j5;
        this.f5098a.mo1406b(j4, i4, i5, i6, c2386e);
        while (this.f5098a.m4023s(false)) {
            p032H0.C0244a c0244a = this.f5100c;
            c0244a.mo1750e();
            if (this.f5098a.m4028x(this.f5099b, c0244a, 0, false) == -4) {
                c0244a.m1753i();
            } else {
                c0244a = null;
            }
            if (c0244a != null) {
                long j6 = c0244a.f3253r;
                p076T.C0664G m3948u = this.f5102e.f5105n.m3948u(c0244a);
                if (m3948u != null) {
                    p039J0.C0310a c0310a = (p039J0.C0310a) m3948u.f2198l[0];
                    java.lang.String str = c0310a.f925l;
                    java.lang.String str2 = c0310a.f926m;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j5 = p086W.AbstractC0805y.m1595P(p086W.AbstractC0805y.m1621p(c0310a.f929p));
                        } catch (p076T.C0666I unused) {
                            j5 = -9223372036854775807L;
                        }
                        if (j5 != -9223372036854775807L) {
                            p117d0.C1269m c1269m = new p117d0.C1269m(j6, j5);
                            android.os.Handler handler = this.f5102e.f5106o;
                            handler.sendMessage(handler.obtainMessage(1, c1269m));
                        }
                    }
                }
            }
        }
        p179q0.C1983Z c1983z = this.f5098a;
        p179q0.C1980W c1980w = c1983z.f8085a;
        synchronized (c1983z) {
            int i7 = c1983z.f8103s;
            m4010e = i7 == 0 ? -1L : c1983z.m4010e(i7);
        }
        c1980w.m4005b(m4010e);
    }

    @Override // p215y0.InterfaceC2387F
    /* renamed from: c */
    public final void mo1407c(p076T.C0702p c0702p) {
        this.f5098a.mo1407c(c0702p);
    }

    @Override // p215y0.InterfaceC2387F
    /* renamed from: d */
    public final int mo1408d(p076T.InterfaceC0696j interfaceC0696j, int i4, boolean z4) {
        return this.f5098a.mo1408d(interfaceC0696j, i4, z4);
    }
}
