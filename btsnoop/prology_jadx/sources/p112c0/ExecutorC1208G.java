package p112c0;

/* renamed from: c0.G */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC1208G implements java.util.concurrent.Executor {

    /* renamed from: l */
    public final /* synthetic */ android.os.Handler f4650l;

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.f4650l.post(runnable);
    }
}
