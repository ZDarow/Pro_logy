package p214y;

/* renamed from: y.a */
/* loaded from: classes.dex */
public final class ExecutorC2379a implements java.util.concurrent.Executor {

    /* renamed from: l */
    public final /* synthetic */ int f9346l;

    /* renamed from: m */
    public final android.os.Handler f9347m;

    public /* synthetic */ ExecutorC2379a(android.os.Handler handler, int i4) {
        this.f9346l = i4;
        this.f9347m = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        switch (this.f9346l) {
            case 0:
                runnable.getClass();
                android.os.Handler handler = this.f9347m;
                if (handler.post(runnable)) {
                    return;
                }
                throw new java.util.concurrent.RejectedExecutionException(handler + " is shutting down");
            default:
                runnable.getClass();
                android.os.Handler handler2 = this.f9347m;
                if (handler2.post(runnable)) {
                    return;
                }
                throw new java.util.concurrent.RejectedExecutionException(handler2 + " is shutting down");
        }
    }
}
