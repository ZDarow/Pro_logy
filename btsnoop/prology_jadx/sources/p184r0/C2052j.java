package p184r0;

/* renamed from: r0.j */
/* loaded from: classes.dex */
public final class C2052j extends p184r0.AbstractC2043a {

    /* renamed from: A */
    public final long f8368A;

    /* renamed from: B */
    public final p184r0.InterfaceC2048f f8369B;

    /* renamed from: C */
    public long f8370C;

    /* renamed from: D */
    public volatile boolean f8371D;

    /* renamed from: E */
    public boolean f8372E;

    /* renamed from: z */
    public final int f8373z;

    public C2052j(p094Y.InterfaceC0870h interfaceC0870h, p094Y.C0874l c0874l, p076T.C0702p c0702p, int i4, java.lang.Object obj, long j4, long j5, long j6, long j7, long j8, int i5, long j9, p184r0.InterfaceC2048f interfaceC2048f) {
        super(interfaceC0870h, c0874l, c0702p, i4, obj, j4, j5, j6, j7, j8);
        this.f8373z = i5;
        this.f8368A = j9;
        this.f8369B = interfaceC2048f;
    }

    @Override // p184r0.AbstractC2054l
    /* renamed from: a */
    public final long mo4114a() {
        return this.f8378u + this.f8373z;
    }

    @Override // p197u0.InterfaceC2224k
    /* renamed from: b */
    public final void mo3266b() {
        int mo37l;
        p094Y.C0886x c0886x = this.f8309x;
        p086W.AbstractC0781a.m1422k(c0886x);
        if (this.f8370C == 0) {
            long j4 = this.f8368A;
            for (p179q0.C1983Z c1983z : (p179q0.C1983Z[]) c0886x.f3176n) {
                if (c1983z.f8083F != j4) {
                    c1983z.f8083F = j4;
                    c1983z.f8110z = true;
                }
            }
            p184r0.InterfaceC2048f interfaceC2048f = this.f8369B;
            long j5 = this.f8307v;
            long j6 = j5 == -9223372036854775807L ? -9223372036854775807L : j5 - this.f8368A;
            long j7 = this.f8308w;
            ((p184r0.C2046d) interfaceC2048f).m4102a(c0886x, j6, j7 == -9223372036854775807L ? -9223372036854775807L : j7 - this.f8368A);
        }
        try {
            p094Y.C0874l m1695a = this.f8332m.m1695a(this.f8370C);
            p094Y.C0859B c0859b = this.f8339t;
            p215y0.C2400l c2400l = new p215y0.C2400l(c0859b, m1695a.f3139e, c0859b.mo1686b(m1695a));
            do {
                try {
                    if (this.f8371D) {
                        break;
                    }
                    mo37l = ((p184r0.C2046d) this.f8369B).f8322l.mo37l(c2400l, p184r0.C2046d.f8321v);
                    p086W.AbstractC0781a.m1421j(mo37l != 1);
                } finally {
                    this.f8370C = c2400l.f9450o - this.f8332m.f3139e;
                }
            } while (mo37l == 0);
            p076T.C0702p c0702p = this.f8334o;
            if (p076T.AbstractC0665H.m1198i(c0702p.f2407l)) {
                int i4 = c0702p.f2392H;
                int i5 = c0702p.f2393I;
                if ((i4 > 1 || i5 > 1) && i4 != -1 && i5 != -1) {
                    p215y0.InterfaceC2387F m1723a0 = c0886x.m1723a0(4);
                    int i6 = i4 * i5;
                    long j8 = (this.f8338s - this.f8337r) / i6;
                    for (int i7 = 1; i7 < i6; i7++) {
                        m1723a0.mo1405a(new p086W.C0798r(), 0, 0);
                        m1723a0.mo1406b(i7 * j8, 0, 0, 0, null);
                    }
                }
            }
            p101a.AbstractC0936a.m1805m(this.f8339t);
            this.f8372E = !this.f8371D;
        } catch (java.lang.Throwable th) {
            p101a.AbstractC0936a.m1805m(this.f8339t);
            throw th;
        }
    }

    @Override // p197u0.InterfaceC2224k
    /* renamed from: c */
    public final void mo3267c() {
        this.f8371D = true;
    }

    @Override // p184r0.AbstractC2054l
    /* renamed from: d */
    public final boolean mo3277d() {
        return this.f8372E;
    }
}
