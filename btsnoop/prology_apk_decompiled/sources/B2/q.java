package B2;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements B.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f182b;

    public /* synthetic */ q(int i4, Object obj) {
        this.f181a = i4;
        this.f182b = obj;
    }

    @Override // B.a
    public final void accept(Object obj) {
        switch (this.f181a) {
            case 0:
                ((u) this.f182b).setWindowInfoListenerDisplayFeatures((u1.j) obj);
                return;
            default:
                ((t3.n) ((t3.o) this.f182b)).g((u1.j) obj);
                return;
        }
    }
}
