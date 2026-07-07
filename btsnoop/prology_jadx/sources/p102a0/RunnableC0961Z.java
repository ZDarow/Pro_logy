package p102a0;

/* renamed from: a0.Z */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0961Z implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ int f3497l;

    /* renamed from: m */
    public final /* synthetic */ p094Y.C0886x f3498m;

    /* renamed from: n */
    public final /* synthetic */ android.util.Pair f3499n;

    /* renamed from: o */
    public final /* synthetic */ p166n0.C1891g f3500o;

    public /* synthetic */ RunnableC0961Z(p094Y.C0886x c0886x, android.util.Pair pair, p166n0.C1891g c1891g, int i4) {
        this.f3497l = i4;
        this.f3498m = c0886x;
        this.f3499n = pair;
        this.f3500o = c1891g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3497l) {
            case 0:
                p107b0.C1170e c1170e = ((p102a0.C0971e0) this.f3498m.f3176n).f3561h;
                android.util.Pair pair = this.f3499n;
                int intValue = ((java.lang.Integer) pair.first).intValue();
                p179q0.C1964F c1964f = (p179q0.C1964F) pair.second;
                c1964f.getClass();
                c1170e.mo704x(intValue, c1964f, this.f3500o);
                return;
            default:
                p107b0.C1170e c1170e2 = ((p102a0.C0971e0) this.f3498m.f3176n).f3561h;
                android.util.Pair pair2 = this.f3499n;
                c1170e2.mo705z(((java.lang.Integer) pair2.first).intValue(), (p179q0.C1964F) pair2.second, this.f3500o);
                return;
        }
    }
}
