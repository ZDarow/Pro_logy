package i1;

import java.util.concurrent.Executor;

/* renamed from: i1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC0342b implements Executor {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6176l;

    private final void a(Runnable runnable) {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f6176l) {
            case 0:
                runnable.run();
                return;
            default:
                return;
        }
    }
}
