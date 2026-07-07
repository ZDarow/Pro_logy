package p007B0;

/* renamed from: B0.a */
/* loaded from: classes.dex */
public final class C0022a implements p215y0.InterfaceC2403o {

    /* renamed from: a */
    public final /* synthetic */ int f91a;

    /* renamed from: b */
    public final p086W.C0798r f92b;

    /* renamed from: c */
    public final p215y0.C2383B f93c;

    public C0022a(int i4) {
        this.f91a = i4;
        switch (i4) {
            case 1:
                this.f92b = new p086W.C0798r(4);
                this.f93c = new p215y0.C2383B(-1, -1, "image/heif");
                return;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                this.f92b = new p086W.C0798r(4);
                this.f93c = new p215y0.C2383B(-1, -1, "image/webp");
                return;
            default:
                this.f92b = new p086W.C0798r(4);
                this.f93c = new p215y0.C2383B(-1, -1, "image/avif");
                return;
        }
    }

    /* renamed from: a */
    private final void m65a() {
    }

    /* renamed from: c */
    private final void m66c() {
    }

    /* renamed from: e */
    private final void m67e() {
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: b */
    public final void mo34b(long j4, long j5) {
        switch (this.f91a) {
            case 0:
                this.f93c.mo34b(j4, j5);
                return;
            case 1:
                this.f93c.mo34b(j4, j5);
                return;
            default:
                this.f93c.mo34b(j4, j5);
                return;
        }
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: g */
    public final void mo35g(p215y0.InterfaceC2405q interfaceC2405q) {
        switch (this.f91a) {
            case 0:
                this.f93c.mo35g(interfaceC2405q);
                return;
            case 1:
                this.f93c.mo35g(interfaceC2405q);
                return;
            default:
                this.f93c.mo35g(interfaceC2405q);
                return;
        }
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: k */
    public final boolean mo36k(p215y0.InterfaceC2404p interfaceC2404p) {
        switch (this.f91a) {
            case 0:
                p215y0.C2400l c2400l = (p215y0.C2400l) interfaceC2404p;
                c2400l.m4631a(4, false);
                p086W.C0798r c0798r = this.f92b;
                c0798r.m1534D(4);
                c2400l.mo634p(c0798r.f2786a, 0, 4, false);
                if (c0798r.m1561w() != 1718909296) {
                    return false;
                }
                c0798r.m1534D(4);
                c2400l.mo634p(c0798r.f2786a, 0, 4, false);
                return c0798r.m1561w() == ((long) 1635150182);
            case 1:
                p215y0.C2400l c2400l2 = (p215y0.C2400l) interfaceC2404p;
                c2400l2.m4631a(4, false);
                p086W.C0798r c0798r2 = this.f92b;
                c0798r2.m1534D(4);
                c2400l2.mo634p(c0798r2.f2786a, 0, 4, false);
                if (c0798r2.m1561w() != 1718909296) {
                    return false;
                }
                c0798r2.m1534D(4);
                c2400l2.mo634p(c0798r2.f2786a, 0, 4, false);
                return c0798r2.m1561w() == ((long) 1751476579);
            default:
                p086W.C0798r c0798r3 = this.f92b;
                c0798r3.m1534D(4);
                p215y0.C2400l c2400l3 = (p215y0.C2400l) interfaceC2404p;
                c2400l3.mo634p(c0798r3.f2786a, 0, 4, false);
                if (c0798r3.m1561w() != 1380533830) {
                    return false;
                }
                c2400l3.m4631a(4, false);
                c0798r3.m1534D(4);
                c2400l3.mo634p(c0798r3.f2786a, 0, 4, false);
                return c0798r3.m1561w() == 1464156752;
        }
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: l */
    public final int mo37l(p215y0.InterfaceC2404p interfaceC2404p, p076T.C0706t c0706t) {
        switch (this.f91a) {
            case 0:
                return this.f93c.mo37l(interfaceC2404p, c0706t);
            case 1:
                return this.f93c.mo37l(interfaceC2404p, c0706t);
            default:
                return this.f93c.mo37l(interfaceC2404p, c0706t);
        }
    }

    @Override // p215y0.InterfaceC2403o
    public final void release() {
        int i4 = this.f91a;
    }
}
