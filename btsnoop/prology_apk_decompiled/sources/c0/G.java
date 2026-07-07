package c0;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class G implements Executor {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Handler f4489l;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f4489l.post(runnable);
    }
}
