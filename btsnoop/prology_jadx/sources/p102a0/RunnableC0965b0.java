package p102a0;

/* renamed from: a0.b0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0965b0 implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ int f3512l;

    /* renamed from: m */
    public final /* synthetic */ p179q0.C2019x f3513m;

    /* renamed from: n */
    public final /* synthetic */ p166n0.C1891g f3514n;

    /* renamed from: o */
    public final /* synthetic */ java.io.IOException f3515o;

    /* renamed from: p */
    public final /* synthetic */ boolean f3516p;

    /* renamed from: q */
    public final /* synthetic */ java.lang.Object f3517q;

    /* renamed from: r */
    public final /* synthetic */ java.lang.Object f3518r;

    public /* synthetic */ RunnableC0965b0(java.lang.Object obj, java.lang.Object obj2, p179q0.C2019x c2019x, p166n0.C1891g c1891g, java.io.IOException iOException, boolean z4, int i4) {
        this.f3512l = i4;
        this.f3517q = obj;
        this.f3518r = obj2;
        this.f3513m = c2019x;
        this.f3514n = c1891g;
        this.f3515o = iOException;
        this.f3516p = z4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, q0.J] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3512l) {
            case 0:
                p107b0.C1170e c1170e = ((p102a0.C0971e0) ((p094Y.C0886x) this.f3517q).f3176n).f3561h;
                android.util.Pair pair = (android.util.Pair) this.f3518r;
                c1170e.mo685L(((java.lang.Integer) pair.first).intValue(), (p179q0.C1964F) pair.second, this.f3513m, this.f3514n, this.f3515o, this.f3516p);
                return;
            default:
                p127f0.C1372e c1372e = (p127f0.C1372e) this.f3517q;
                int i4 = c1372e.f5648a;
                this.f3518r.mo685L(i4, c1372e.f5649b, this.f3513m, this.f3514n, this.f3515o, this.f3516p);
                return;
        }
    }
}
