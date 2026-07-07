package D2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class l implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f502a;

    public l() {
        Looper mainLooper = Looper.getMainLooper();
        this.f502a = Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(mainLooper) : new Handler(mainLooper);
    }

    @Override // D2.e
    public final void a(c cVar) {
        this.f502a.post(cVar);
    }
}
