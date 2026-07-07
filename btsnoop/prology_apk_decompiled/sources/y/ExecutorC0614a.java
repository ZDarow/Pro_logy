package y;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: y.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0614a implements Executor {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8987l;

    /* renamed from: m, reason: collision with root package name */
    public final Handler f8988m;

    public /* synthetic */ ExecutorC0614a(Handler handler, int i4) {
        this.f8987l = i4;
        this.f8988m = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f8987l) {
            case 0:
                runnable.getClass();
                Handler handler = this.f8988m;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                runnable.getClass();
                Handler handler2 = this.f8988m;
                if (handler2.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler2 + " is shutting down");
        }
    }
}
