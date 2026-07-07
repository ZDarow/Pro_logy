package p054N1;

/* renamed from: N1.l */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC0457l implements java.util.concurrent.Executor {

    /* renamed from: l */
    public final /* synthetic */ int f1328l = 2;

    /* renamed from: m */
    public final android.os.Handler f1329m;

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        switch (this.f1328l) {
            case 0:
                ((p088W1.HandlerC0820f) this.f1329m).post(runnable);
                return;
            case 1:
                ((p088W1.HandlerC0820f) this.f1329m).post(runnable);
                return;
            default:
                ((p088W1.HandlerC0820f) this.f1329m).post(runnable);
                return;
        }
    }

    public ExecutorC0457l() {
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        android.os.Looper.getMainLooper();
        this.f1329m = handler;
    }

    public ExecutorC0457l(android.os.Looper looper) {
        this.f1329m = new p088W1.HandlerC0820f(looper, 1);
    }
}
