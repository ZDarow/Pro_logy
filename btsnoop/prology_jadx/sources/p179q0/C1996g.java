package p179q0;

/* renamed from: q0.g */
/* loaded from: classes.dex */
public final class C1996g extends p179q0.AbstractC2007l0 {

    /* renamed from: A */
    public final p076T.C0676T f8141A;

    /* renamed from: B */
    public p179q0.C1992e f8142B;

    /* renamed from: C */
    public p179q0.C1994f f8143C;

    /* renamed from: D */
    public long f8144D;

    /* renamed from: E */
    public long f8145E;

    /* renamed from: w */
    public final long f8146w;

    /* renamed from: x */
    public final long f8147x;

    /* renamed from: y */
    public final boolean f8148y;

    /* renamed from: z */
    public final java.util.ArrayList f8149z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1996g(p179q0.AbstractC1984a abstractC1984a, long j4, long j5, boolean z4) {
        super(abstractC1984a);
        abstractC1984a.getClass();
        p086W.AbstractC0781a.m1416e(j4 >= 0);
        this.f8146w = j4;
        this.f8147x = j5;
        this.f8148y = z4;
        this.f8149z = new java.util.ArrayList();
        this.f8141A = new p076T.C0676T();
    }

    @Override // p179q0.AbstractC2007l0
    /* renamed from: C */
    public final void mo3963C(p076T.AbstractC0677U abstractC0677U) {
        if (this.f8143C != null) {
            return;
        }
        m4048E(abstractC0677U);
    }

    /* renamed from: E */
    public final void m4048E(p076T.AbstractC0677U abstractC0677U) {
        long j4;
        p076T.C0676T c0676t = this.f8141A;
        abstractC0677U.m1255n(0, c0676t);
        long j5 = c0676t.f2247p;
        p179q0.C1992e c1992e = this.f8142B;
        java.util.ArrayList arrayList = this.f8149z;
        long j6 = this.f8147x;
        if (c1992e == null || arrayList.isEmpty()) {
            j4 = this.f8146w;
            this.f8144D = j5 + j4;
            this.f8145E = j6 != Long.MIN_VALUE ? j5 + j6 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                p179q0.C1990d c1990d = (p179q0.C1990d) arrayList.get(i4);
                long j7 = this.f8144D;
                long j8 = this.f8145E;
                c1990d.f8125p = j7;
                c1990d.f8126q = j8;
            }
        } else {
            j4 = this.f8144D - j5;
            j6 = j6 != Long.MIN_VALUE ? this.f8145E - j5 : Long.MIN_VALUE;
        }
        try {
            p179q0.C1992e c1992e2 = new p179q0.C1992e(abstractC0677U, j4, j6);
            this.f8142B = c1992e2;
            m4039n(c1992e2);
        } catch (p179q0.C1994f e4) {
            this.f8143C = e4;
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((p179q0.C1990d) arrayList.get(i5)).f8127r = this.f8143C;
            }
        }
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: b */
    public final p179q0.InterfaceC1962D mo2975b(p179q0.C1964F c1964f, p197u0.C2218e c2218e, long j4) {
        p179q0.C1990d c1990d = new p179q0.C1990d(this.f8189v.mo2975b(c1964f, c2218e, j4), this.f8148y, this.f8144D, this.f8145E);
        this.f8149z.add(c1990d);
        return c1990d;
    }

    @Override // p179q0.AbstractC2002j, p179q0.AbstractC1984a
    /* renamed from: j */
    public final void mo2977j() {
        p179q0.C1994f c1994f = this.f8143C;
        if (c1994f != null) {
            throw c1994f;
        }
        super.mo2977j();
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: o */
    public final void mo2979o(p179q0.InterfaceC1962D interfaceC1962D) {
        java.util.ArrayList arrayList = this.f8149z;
        p086W.AbstractC0781a.m1421j(arrayList.remove(interfaceC1962D));
        this.f8189v.mo2979o(((p179q0.C1990d) interfaceC1962D).f8121l);
        if (arrayList.isEmpty()) {
            p179q0.C1992e c1992e = this.f8142B;
            c1992e.getClass();
            m4048E(c1992e.f8231b);
        }
    }

    @Override // p179q0.AbstractC2002j, p179q0.AbstractC1984a
    /* renamed from: r */
    public final void mo2980r() {
        super.mo2980r();
        this.f8143C = null;
        this.f8142B = null;
    }
}
