package p077T0;

/* renamed from: T0.d */
/* loaded from: classes.dex */
public final class C0716d implements p215y0.InterfaceC2403o {

    /* renamed from: a */
    public p215y0.InterfaceC2405q f2471a;

    /* renamed from: b */
    public p077T0.AbstractC0721i f2472b;

    /* renamed from: c */
    public boolean f2473c;

    /* renamed from: a */
    public final boolean m1306a(p215y0.C2400l c2400l) {
        boolean z4;
        p077T0.C0718f c0718f = new p077T0.C0718f();
        if (c0718f.m1310a(c2400l, true) && (c0718f.f2479a & 2) == 2) {
            int min = java.lang.Math.min(c0718f.f2483e, 8);
            p086W.C0798r c0798r = new p086W.C0798r(min);
            c2400l.mo634p(c0798r.f2786a, 0, min, false);
            c0798r.m1537G(0);
            if (c0798r.m1539a() >= 5 && c0798r.m1559u() == 127 && c0798r.m1561w() == 1179402563) {
                this.f2472b = new p077T0.AbstractC0721i();
            } else {
                c0798r.m1537G(0);
                try {
                    z4 = p215y0.AbstractC2390b.m4628w(1, c0798r, true);
                } catch (p076T.C0666I unused) {
                    z4 = false;
                }
                if (z4) {
                    this.f2472b = new p077T0.AbstractC0721i();
                } else {
                    c0798r.m1537G(0);
                    if (p077T0.C0720h.m1312e(c0798r, p077T0.C0720h.f2486o)) {
                        this.f2472b = new p077T0.AbstractC0721i();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: b */
    public final void mo34b(long j4, long j5) {
        p077T0.AbstractC0721i abstractC0721i = this.f2472b;
        if (abstractC0721i != null) {
            p077T0.C0717e c0717e = abstractC0721i.f2489a;
            p077T0.C0718f c0718f = (p077T0.C0718f) c0717e.f2477o;
            c0718f.f2479a = 0;
            c0718f.f2480b = 0L;
            c0718f.f2481c = 0;
            c0718f.f2482d = 0;
            c0718f.f2483e = 0;
            ((p086W.C0798r) c0717e.f2478p).m1534D(0);
            c0717e.f2474l = -1;
            c0717e.f2476n = false;
            if (j4 == 0) {
                abstractC0721i.mo1305d(!abstractC0721i.f2500l);
                return;
            }
            if (abstractC0721i.f2496h != 0) {
                long j6 = (abstractC0721i.f2497i * j5) / 1000000;
                abstractC0721i.f2493e = j6;
                p077T0.InterfaceC0719g interfaceC0719g = abstractC0721i.f2492d;
                int i4 = p086W.AbstractC0805y.f2801a;
                interfaceC0719g.mo599n(j6);
                abstractC0721i.f2496h = 2;
            }
        }
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: g */
    public final void mo35g(p215y0.InterfaceC2405q interfaceC2405q) {
        this.f2471a = interfaceC2405q;
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: k */
    public final boolean mo36k(p215y0.InterfaceC2404p interfaceC2404p) {
        try {
            return m1306a((p215y0.C2400l) interfaceC2404p);
        } catch (p076T.C0666I unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0187  */
    /* JADX WARN: Type inference failed for: r3v2, types: [T0.g, java.lang.Object] */
    @Override // p215y0.InterfaceC2403o
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo37l(p215y0.InterfaceC2404p r21, p076T.C0706t r22) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p077T0.C0716d.mo37l(y0.p, T.t):int");
    }

    @Override // p215y0.InterfaceC2403o
    public final void release() {
    }
}
