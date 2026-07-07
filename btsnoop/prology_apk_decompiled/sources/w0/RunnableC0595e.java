package w0;

import T.d0;

/* renamed from: w0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0595e implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8756l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f8757m;

    public /* synthetic */ RunnableC0595e(C0596f c0596f, w wVar, int i4) {
        this.f8756l = i4;
        this.f8757m = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8756l) {
            case 0:
                this.f8757m.getClass();
                return;
            case 1:
                this.f8757m.e();
                return;
            default:
                this.f8757m.d();
                return;
        }
    }

    public /* synthetic */ RunnableC0595e(C0596f c0596f, w wVar, d0 d0Var) {
        this.f8756l = 0;
        this.f8757m = wVar;
    }
}
