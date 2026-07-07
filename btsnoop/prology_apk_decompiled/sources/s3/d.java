package s3;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import k3.h;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public abstract class d {
    private static volatile Choreographer choreographer;

    static {
        Object s;
        try {
            s = new c(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            s = AbstractC0462a.s(th);
        }
        if (s instanceof Z2.c) {
            s = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            h.c(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
