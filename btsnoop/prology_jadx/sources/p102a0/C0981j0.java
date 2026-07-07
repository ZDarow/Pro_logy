package p102a0;

/* renamed from: a0.j0 */
/* loaded from: classes.dex */
public final class C0981j0 extends p179q0.AbstractC2017v {

    /* renamed from: c */
    public final /* synthetic */ int f3644c = 0;

    /* renamed from: d */
    public final java.lang.Object f3645d;

    public C0981j0(p076T.AbstractC0677U abstractC0677U, p076T.C0659B c0659b) {
        super(abstractC0677U);
        this.f3645d = c0659b;
    }

    @Override // p179q0.AbstractC2017v, p076T.AbstractC0677U
    /* renamed from: f */
    public p076T.C0675S mo1232f(int i4, p076T.C0675S c0675s, boolean z4) {
        switch (this.f3644c) {
            case 0:
                p076T.AbstractC0677U abstractC0677U = this.f8231b;
                p076T.C0675S mo1232f = abstractC0677U.mo1232f(i4, c0675s, z4);
                if (abstractC0677U.mo1235m(mo1232f.f2225c, (p076T.C0676T) this.f3645d, 0L).m1245a()) {
                    mo1232f.m1244h(c0675s.f2223a, c0675s.f2224b, c0675s.f2225c, c0675s.f2226d, c0675s.f2227e, p076T.C0685b.f2305c, true);
                } else {
                    mo1232f.f2228f = true;
                }
                return mo1232f;
            default:
                return super.mo1232f(i4, c0675s, z4);
        }
    }

    @Override // p179q0.AbstractC2017v, p076T.AbstractC0677U
    /* renamed from: m */
    public p076T.C0676T mo1235m(int i4, p076T.C0676T c0676t, long j4) {
        switch (this.f3644c) {
            case 1:
                super.mo1235m(i4, c0676t, j4);
                p076T.C0659B c0659b = (p076T.C0659B) this.f3645d;
                c0676t.f2234c = c0659b;
                p076T.C0711y c0711y = c0659b.f2143b;
                if (c0711y != null) {
                    java.lang.String str = c0711y.f2453e;
                }
                c0676t.getClass();
                return c0676t;
            default:
                return super.mo1235m(i4, c0676t, j4);
        }
    }

    public C0981j0(p076T.AbstractC0677U abstractC0677U) {
        super(abstractC0677U);
        this.f3645d = new p076T.C0676T();
    }
}
