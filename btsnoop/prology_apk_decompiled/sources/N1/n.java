package N1;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1287l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f1288m;

    public n(o oVar, int i4) {
        this.f1288m = oVar;
        this.f1287l = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1288m.f(this.f1287l);
    }
}
