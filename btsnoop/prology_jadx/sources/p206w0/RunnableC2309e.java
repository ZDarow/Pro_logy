package p206w0;

/* renamed from: w0.e */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2309e implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ int f9111l;

    /* renamed from: m */
    public final /* synthetic */ p206w0.InterfaceC2327w f9112m;

    public /* synthetic */ RunnableC2309e(p206w0.C2310f c2310f, p206w0.InterfaceC2327w interfaceC2327w, int i4) {
        this.f9111l = i4;
        this.f9112m = interfaceC2327w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9111l) {
            case 0:
                this.f9112m.getClass();
                return;
            case 1:
                this.f9112m.mo4116e();
                return;
            default:
                this.f9112m.mo4115d();
                return;
        }
    }

    public /* synthetic */ RunnableC2309e(p206w0.C2310f c2310f, p206w0.InterfaceC2327w interfaceC2327w, p076T.C0690d0 c0690d0) {
        this.f9111l = 0;
        this.f9112m = interfaceC2327w;
    }
}
