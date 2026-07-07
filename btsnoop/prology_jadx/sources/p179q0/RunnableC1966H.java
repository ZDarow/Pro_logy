package p179q0;

/* renamed from: q0.H */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1966H implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ int f7965l;

    /* renamed from: m */
    public final /* synthetic */ p127f0.C1372e f7966m;

    /* renamed from: n */
    public final /* synthetic */ java.lang.Object f7967n;

    /* renamed from: o */
    public final /* synthetic */ p179q0.C2019x f7968o;

    /* renamed from: p */
    public final /* synthetic */ p166n0.C1891g f7969p;

    public /* synthetic */ RunnableC1966H(p127f0.C1372e c1372e, p179q0.InterfaceC1968J interfaceC1968J, p179q0.C2019x c2019x, p166n0.C1891g c1891g, int i4) {
        this.f7965l = i4;
        this.f7966m = c1372e;
        this.f7967n = interfaceC1968J;
        this.f7968o = c2019x;
        this.f7969p = c1891g;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, q0.J] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, q0.J] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, q0.J] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7965l) {
            case 0:
                p127f0.C1372e c1372e = this.f7966m;
                int i4 = c1372e.f5648a;
                this.f7967n.mo691g(i4, c1372e.f5649b, this.f7968o, this.f7969p);
                return;
            case 1:
                p127f0.C1372e c1372e2 = this.f7966m;
                int i5 = c1372e2.f5648a;
                this.f7967n.mo683D(i5, c1372e2.f5649b, this.f7968o, this.f7969p);
                return;
            default:
                p127f0.C1372e c1372e3 = this.f7966m;
                int i6 = c1372e3.f5648a;
                this.f7967n.mo684H(i6, c1372e3.f5649b, this.f7968o, this.f7969p);
                return;
        }
    }
}
