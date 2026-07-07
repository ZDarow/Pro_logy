package p028G0;

/* renamed from: G0.a */
/* loaded from: classes.dex */
public final class C0233a implements p215y0.InterfaceC2403o {

    /* renamed from: b */
    public p215y0.InterfaceC2405q f671b;

    /* renamed from: c */
    public int f672c;

    /* renamed from: d */
    public int f673d;

    /* renamed from: e */
    public int f674e;

    /* renamed from: g */
    public p053N0.C0438a f676g;

    /* renamed from: h */
    public p215y0.C2400l f677h;

    /* renamed from: i */
    public p028G0.C0235c f678i;

    /* renamed from: j */
    public p073S0.C0639q f679j;

    /* renamed from: a */
    public final p086W.C0798r f670a = new p086W.C0798r(6);

    /* renamed from: f */
    public long f675f = -1;

    /* renamed from: a */
    public final void m616a() {
        p215y0.InterfaceC2405q interfaceC2405q = this.f671b;
        interfaceC2405q.getClass();
        interfaceC2405q.mo637s();
        this.f671b.mo638t(new p002A0.C0004b(-9223372036854775807L));
        this.f672c = 6;
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: b */
    public final void mo34b(long j4, long j5) {
        if (j4 == 0) {
            this.f672c = 0;
            this.f679j = null;
        } else if (this.f672c == 5) {
            p073S0.C0639q c0639q = this.f679j;
            c0639q.getClass();
            c0639q.mo34b(j4, j5);
        }
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: g */
    public final void mo35g(p215y0.InterfaceC2405q interfaceC2405q) {
        this.f671b = interfaceC2405q;
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: k */
    public final boolean mo36k(p215y0.InterfaceC2404p interfaceC2404p) {
        p215y0.C2400l c2400l = (p215y0.C2400l) interfaceC2404p;
        p086W.C0798r c0798r = this.f670a;
        c0798r.m1534D(2);
        c2400l.mo634p(c0798r.f2786a, 0, 2, false);
        if (c0798r.m1531A() != 65496) {
            return false;
        }
        c0798r.m1534D(2);
        c2400l.mo634p(c0798r.f2786a, 0, 2, false);
        int m1531A = c0798r.m1531A();
        this.f673d = m1531A;
        if (m1531A == 65504) {
            c0798r.m1534D(2);
            c2400l.mo634p(c0798r.f2786a, 0, 2, false);
            c2400l.m4631a(c0798r.m1531A() - 2, false);
            c0798r.m1534D(2);
            c2400l.mo634p(c0798r.f2786a, 0, 2, false);
            this.f673d = c0798r.m1531A();
        }
        if (this.f673d != 65505) {
            return false;
        }
        c2400l.m4631a(2, false);
        c0798r.m1534D(6);
        c2400l.mo634p(c0798r.f2786a, 0, 6, false);
        return c0798r.m1561w() == 1165519206 && c0798r.m1531A() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0181  */
    @Override // p215y0.InterfaceC2403o
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo37l(p215y0.InterfaceC2404p r27, p076T.C0706t r28) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p028G0.C0233a.mo37l(y0.p, T.t):int");
    }

    @Override // p215y0.InterfaceC2403o
    public final void release() {
        p073S0.C0639q c0639q = this.f679j;
        if (c0639q != null) {
            c0639q.getClass();
        }
    }
}
