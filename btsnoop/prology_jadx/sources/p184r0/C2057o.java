package p184r0;

/* renamed from: r0.o */
/* loaded from: classes.dex */
public final class C2057o extends p184r0.AbstractC2043a {

    /* renamed from: A */
    public final p076T.C0702p f8380A;

    /* renamed from: B */
    public long f8381B;

    /* renamed from: C */
    public boolean f8382C;

    /* renamed from: z */
    public final int f8383z;

    public C2057o(p094Y.InterfaceC0870h interfaceC0870h, p094Y.C0874l c0874l, p076T.C0702p c0702p, int i4, java.lang.Object obj, long j4, long j5, long j6, int i5, p076T.C0702p c0702p2) {
        super(interfaceC0870h, c0874l, c0702p, i4, obj, j4, j5, -9223372036854775807L, -9223372036854775807L, j6);
        this.f8383z = i5;
        this.f8380A = c0702p2;
    }

    @Override // p197u0.InterfaceC2224k
    /* renamed from: b */
    public final void mo3266b() {
        p094Y.C0859B c0859b = this.f8339t;
        p094Y.C0886x c0886x = this.f8309x;
        p086W.AbstractC0781a.m1422k(c0886x);
        for (p179q0.C1983Z c1983z : (p179q0.C1983Z[]) c0886x.f3176n) {
            if (c1983z.f8083F != 0) {
                c1983z.f8083F = 0L;
                c1983z.f8110z = true;
            }
        }
        p215y0.InterfaceC2387F m1723a0 = c0886x.m1723a0(this.f8383z);
        m1723a0.mo1407c(this.f8380A);
        try {
            long mo1686b = c0859b.mo1686b(this.f8332m.m1695a(this.f8381B));
            if (mo1686b != -1) {
                mo1686b += this.f8381B;
            }
            p215y0.C2400l c2400l = new p215y0.C2400l(this.f8339t, this.f8381B, mo1686b);
            for (int i4 = 0; i4 != -1; i4 = m1723a0.mo1408d(c2400l, Integer.MAX_VALUE, true)) {
                this.f8381B += i4;
            }
            m1723a0.mo1406b(this.f8337r, 1, (int) this.f8381B, 0, null);
            p101a.AbstractC0936a.m1805m(c0859b);
            this.f8382C = true;
        } catch (java.lang.Throwable th) {
            p101a.AbstractC0936a.m1805m(c0859b);
            throw th;
        }
    }

    @Override // p197u0.InterfaceC2224k
    /* renamed from: c */
    public final void mo3267c() {
    }

    @Override // p184r0.AbstractC2054l
    /* renamed from: d */
    public final boolean mo3277d() {
        return this.f8382C;
    }
}
