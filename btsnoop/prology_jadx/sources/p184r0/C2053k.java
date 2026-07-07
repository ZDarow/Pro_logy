package p184r0;

/* renamed from: r0.k */
/* loaded from: classes.dex */
public final class C2053k extends p184r0.AbstractC2047e {

    /* renamed from: u */
    public final p184r0.C2046d f8374u;

    /* renamed from: v */
    public p094Y.C0886x f8375v;

    /* renamed from: w */
    public long f8376w;

    /* renamed from: x */
    public volatile boolean f8377x;

    public C2053k(p094Y.InterfaceC0870h interfaceC0870h, p094Y.C0874l c0874l, p076T.C0702p c0702p, int i4, java.lang.Object obj, p184r0.C2046d c2046d) {
        super(interfaceC0870h, c0874l, 2, c0702p, i4, obj, -9223372036854775807L, -9223372036854775807L);
        this.f8374u = c2046d;
    }

    @Override // p197u0.InterfaceC2224k
    /* renamed from: b */
    public final void mo3266b() {
        if (this.f8376w == 0) {
            this.f8374u.m4102a(this.f8375v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            p094Y.C0874l m1695a = this.f8332m.m1695a(this.f8376w);
            p094Y.C0859B c0859b = this.f8339t;
            p215y0.C2400l c2400l = new p215y0.C2400l(c0859b, m1695a.f3139e, c0859b.mo1686b(m1695a));
            while (!this.f8377x) {
                try {
                    int mo37l = this.f8374u.f8322l.mo37l(c2400l, p184r0.C2046d.f8321v);
                    boolean z4 = false;
                    p086W.AbstractC0781a.m1421j(mo37l != 1);
                    if (mo37l == 0) {
                        z4 = true;
                    }
                    if (!z4) {
                        break;
                    }
                } finally {
                    this.f8376w = c2400l.f9450o - this.f8332m.f3139e;
                }
            }
        } finally {
            p101a.AbstractC0936a.m1805m(this.f8339t);
        }
    }

    @Override // p197u0.InterfaceC2224k
    /* renamed from: c */
    public final void mo3267c() {
        this.f8377x = true;
    }
}
