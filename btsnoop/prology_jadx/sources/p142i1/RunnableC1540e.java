package p142i1;

/* renamed from: i1.e */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1540e implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ int f6417l;

    /* renamed from: m */
    public final /* synthetic */ android.content.Context f6418m;

    public /* synthetic */ RunnableC1540e(android.content.Context context, int i4) {
        this.f6417l = i4;
        this.f6418m = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6417l) {
            case 0:
                new java.util.concurrent.ThreadPoolExecutor(0, 1, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingQueue()).execute(new p142i1.RunnableC1540e(this.f6418m, 1));
                return;
            default:
                p142i1.AbstractC1539d.m3427s(this.f6418m, new p142i1.ExecutorC1537b(0), p142i1.AbstractC1539d.f6407a, false);
                return;
        }
    }
}
