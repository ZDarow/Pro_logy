package q0;

/* loaded from: classes.dex */
public final /* synthetic */ class N implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f7697l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T f7698m;

    public /* synthetic */ N(T t4, int i4) {
        this.f7697l = i4;
        this.f7698m = t4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7697l) {
            case 0:
                this.f7698m.f7734R = true;
                return;
            case 1:
                this.f7698m.z();
                return;
            default:
                T t4 = this.f7698m;
                if (t4.f7740X) {
                    return;
                }
                InterfaceC0466C interfaceC0466C = t4.f7719B;
                interfaceC0466C.getClass();
                interfaceC0466C.f(t4);
                return;
        }
    }
}
