package q0;

/* loaded from: classes.dex */
public final /* synthetic */ class H implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f7673l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f0.e f7674m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f7675n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0491x f7676o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ n0.g f7677p;

    public /* synthetic */ H(f0.e eVar, J j4, C0491x c0491x, n0.g gVar, int i4) {
        this.f7673l = i4;
        this.f7674m = eVar;
        this.f7675n = j4;
        this.f7676o = c0491x;
        this.f7677p = gVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, q0.J] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, q0.J] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, q0.J] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7673l) {
            case 0:
                f0.e eVar = this.f7674m;
                int i4 = eVar.f5454a;
                this.f7675n.g(i4, eVar.f5455b, this.f7676o, this.f7677p);
                return;
            case 1:
                f0.e eVar2 = this.f7674m;
                int i5 = eVar2.f5454a;
                this.f7675n.D(i5, eVar2.f5455b, this.f7676o, this.f7677p);
                return;
            default:
                f0.e eVar3 = this.f7674m;
                int i6 = eVar3.f5454a;
                this.f7675n.H(i6, eVar3.f5455b, this.f7676o, this.f7677p);
                return;
        }
    }
}
