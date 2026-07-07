package p102a0;

/* renamed from: a0.a0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0963a0 implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ int f3504l;

    /* renamed from: m */
    public final /* synthetic */ p094Y.C0886x f3505m;

    /* renamed from: n */
    public final /* synthetic */ android.util.Pair f3506n;

    /* renamed from: o */
    public final /* synthetic */ p179q0.C2019x f3507o;

    /* renamed from: p */
    public final /* synthetic */ p166n0.C1891g f3508p;

    public /* synthetic */ RunnableC0963a0(p094Y.C0886x c0886x, android.util.Pair pair, p179q0.C2019x c2019x, p166n0.C1891g c1891g, int i4) {
        this.f3504l = i4;
        this.f3505m = c0886x;
        this.f3506n = pair;
        this.f3507o = c2019x;
        this.f3508p = c1891g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3504l) {
            case 0:
                p107b0.C1170e c1170e = ((p102a0.C0971e0) this.f3505m.f3176n).f3561h;
                android.util.Pair pair = this.f3506n;
                c1170e.mo684H(((java.lang.Integer) pair.first).intValue(), (p179q0.C1964F) pair.second, this.f3507o, this.f3508p);
                return;
            case 1:
                p107b0.C1170e c1170e2 = ((p102a0.C0971e0) this.f3505m.f3176n).f3561h;
                android.util.Pair pair2 = this.f3506n;
                c1170e2.mo691g(((java.lang.Integer) pair2.first).intValue(), (p179q0.C1964F) pair2.second, this.f3507o, this.f3508p);
                return;
            default:
                p107b0.C1170e c1170e3 = ((p102a0.C0971e0) this.f3505m.f3176n).f3561h;
                android.util.Pair pair3 = this.f3506n;
                c1170e3.mo683D(((java.lang.Integer) pair3.first).intValue(), (p179q0.C1964F) pair3.second, this.f3507o, this.f3508p);
                return;
        }
    }
}
