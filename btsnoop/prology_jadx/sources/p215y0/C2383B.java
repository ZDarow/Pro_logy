package p215y0;

/* renamed from: y0.B */
/* loaded from: classes.dex */
public final class C2383B implements p215y0.InterfaceC2403o {

    /* renamed from: a */
    public final int f9352a;

    /* renamed from: b */
    public final int f9353b;

    /* renamed from: c */
    public final java.lang.String f9354c;

    /* renamed from: d */
    public int f9355d;

    /* renamed from: e */
    public int f9356e;

    /* renamed from: f */
    public p215y0.InterfaceC2405q f9357f;

    /* renamed from: g */
    public p215y0.InterfaceC2387F f9358g;

    public C2383B(int i4, int i5, java.lang.String str) {
        this.f9352a = i4;
        this.f9353b = i5;
        this.f9354c = str;
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: b */
    public final void mo34b(long j4, long j5) {
        if (j4 == 0 || this.f9356e == 1) {
            this.f9356e = 1;
            this.f9355d = 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [y0.z, java.lang.Object] */
    @Override // p215y0.InterfaceC2403o
    /* renamed from: g */
    public final void mo35g(p215y0.InterfaceC2405q interfaceC2405q) {
        this.f9357f = interfaceC2405q;
        p215y0.InterfaceC2387F mo640v = interfaceC2405q.mo640v(1024, 4);
        this.f9358g = mo640v;
        p076T.C0701o c0701o = new p076T.C0701o();
        c0701o.f2370l = p076T.AbstractC0665H.m1201l(this.f9354c);
        p009B2.AbstractC0051h.m158q(c0701o, mo640v);
        this.f9357f.mo637s();
        this.f9357f.mo638t(new java.lang.Object());
        this.f9356e = 1;
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: k */
    public final boolean mo36k(p215y0.InterfaceC2404p interfaceC2404p) {
        int i4 = this.f9353b;
        int i5 = this.f9352a;
        p086W.AbstractC0781a.m1421j((i5 == -1 || i4 == -1) ? false : true);
        p086W.C0798r c0798r = new p086W.C0798r(i4);
        ((p215y0.C2400l) interfaceC2404p).mo634p(c0798r.f2786a, 0, i4, false);
        return c0798r.m1531A() == i5;
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: l */
    public final int mo37l(p215y0.InterfaceC2404p interfaceC2404p, p076T.C0706t c0706t) {
        int i4 = this.f9356e;
        if (i4 != 1) {
            if (i4 == 2) {
                return -1;
            }
            throw new java.lang.IllegalStateException();
        }
        p215y0.InterfaceC2387F interfaceC2387F = this.f9358g;
        interfaceC2387F.getClass();
        int mo1408d = interfaceC2387F.mo1408d(interfaceC2404p, 1024, true);
        if (mo1408d == -1) {
            this.f9356e = 2;
            this.f9358g.mo1406b(0L, 1, this.f9355d, 0, null);
            this.f9355d = 0;
        } else {
            this.f9355d += mo1408d;
        }
        return 0;
    }

    @Override // p215y0.InterfaceC2403o
    public final void release() {
    }
}
