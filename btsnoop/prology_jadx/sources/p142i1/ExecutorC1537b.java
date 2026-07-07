package p142i1;

/* renamed from: i1.b */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC1537b implements java.util.concurrent.Executor {

    /* renamed from: l */
    public final /* synthetic */ int f6406l;

    /* renamed from: a */
    private final void m3408a(java.lang.Runnable runnable) {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        switch (this.f6406l) {
            case 0:
                runnable.run();
                return;
            default:
                return;
        }
    }
}
