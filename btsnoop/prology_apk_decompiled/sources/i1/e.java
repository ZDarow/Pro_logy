package i1;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6187l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Context f6188m;

    public /* synthetic */ e(Context context, int i4) {
        this.f6187l = i4;
        this.f6188m = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6187l) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new e(this.f6188m, 1));
                return;
            default:
                d.s(this.f6188m, new ExecutorC0342b(0), d.f6177a, false);
                return;
        }
    }
}
