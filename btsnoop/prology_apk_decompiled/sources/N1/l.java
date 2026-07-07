package N1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Executor {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1284l = 2;

    /* renamed from: m, reason: collision with root package name */
    public final Handler f1285m;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1284l) {
            case 0:
                ((W1.f) this.f1285m).post(runnable);
                return;
            case 1:
                ((W1.f) this.f1285m).post(runnable);
                return;
            default:
                ((W1.f) this.f1285m).post(runnable);
                return;
        }
    }

    public l() {
        Handler handler = new Handler(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f1285m = handler;
    }

    public l(Looper looper) {
        this.f1285m = new W1.f(looper, 1);
    }
}
