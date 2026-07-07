package p191s3;

/* renamed from: s3.d */
/* loaded from: classes.dex */
public abstract class AbstractC2157d {
    private static volatile android.view.Choreographer choreographer;

    static {
        java.lang.Object m3942s;
        try {
            m3942s = new p191s3.C2156c(m4283a(android.os.Looper.getMainLooper()));
        } catch (java.lang.Throwable th) {
            m3942s = p176p1.AbstractC1949a.m3942s(th);
        }
        if (m3942s instanceof p100Z2.C0930c) {
            m3942s = null;
        }
    }

    /* renamed from: a */
    public static final android.os.Handler m4283a(android.os.Looper looper) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            java.lang.Object invoke = android.os.Handler.class.getDeclaredMethod("createAsync", android.os.Looper.class).invoke(null, looper);
            p154k3.AbstractC1803h.m3777c(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (android.os.Handler) invoke;
        }
        try {
            return (android.os.Handler) android.os.Handler.class.getDeclaredConstructor(android.os.Looper.class, android.os.Handler.Callback.class, java.lang.Boolean.TYPE).newInstance(looper, null, java.lang.Boolean.TRUE);
        } catch (java.lang.NoSuchMethodException unused) {
            return new android.os.Handler(looper);
        }
    }
}
