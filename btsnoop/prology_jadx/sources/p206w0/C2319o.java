package p206w0;

/* renamed from: w0.o */
/* loaded from: classes.dex */
public final class C2319o extends android.view.Surface {

    /* renamed from: o */
    public static int f9191o;

    /* renamed from: p */
    public static boolean f9192p;

    /* renamed from: l */
    public final boolean f9193l;

    /* renamed from: m */
    public final p206w0.HandlerThreadC2318n f9194m;

    /* renamed from: n */
    public boolean f9195n;

    public C2319o(p206w0.HandlerThreadC2318n handlerThreadC2318n, android.graphics.SurfaceTexture surfaceTexture, boolean z4) {
        super(surfaceTexture);
        this.f9194m = handlerThreadC2318n;
        this.f9193l = z4;
    }

    /* renamed from: d */
    public static synchronized boolean m4515d(android.content.Context context) {
        boolean z4;
        java.lang.String eglQueryString;
        int i4;
        synchronized (p206w0.C2319o.class) {
            try {
                if (!f9192p) {
                    int i5 = p086W.AbstractC0805y.f2801a;
                    if (i5 >= 24 && ((i5 >= 26 || (!"samsung".equals(p086W.AbstractC0805y.f2803c) && !"XT1650".equals(p086W.AbstractC0805y.f2804d))) && ((i5 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = android.opengl.EGL14.eglQueryString(android.opengl.EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")))) {
                        java.lang.String eglQueryString2 = android.opengl.EGL14.eglQueryString(android.opengl.EGL14.eglGetDisplay(0), 12373);
                        i4 = eglQueryString2 != null && eglQueryString2.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
                        f9191o = i4;
                        f9192p = true;
                    }
                    i4 = 0;
                    f9191o = i4;
                    f9192p = true;
                }
                z4 = f9191o != 0;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return z4;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [android.os.HandlerThread, java.lang.Thread, android.os.Handler$Callback, java.lang.Object, w0.n] */
    /* renamed from: e */
    public static p206w0.C2319o m4516e(android.content.Context context, boolean z4) {
        boolean z5 = false;
        p086W.AbstractC0781a.m1421j(!z4 || m4515d(context));
        ?? handlerThread = new android.os.HandlerThread("ExoPlayer:PlaceholderSurface");
        int i4 = z4 ? f9191o : 0;
        handlerThread.start();
        android.os.Handler handler = new android.os.Handler(handlerThread.getLooper(), handlerThread);
        handlerThread.f9187m = handler;
        handlerThread.f9186l = new p086W.RunnableC0784d(handler);
        synchronized (handlerThread) {
            handlerThread.f9187m.obtainMessage(1, i4, 0).sendToTarget();
            while (handlerThread.f9190p == null && handlerThread.f9189o == null && handlerThread.f9188n == null) {
                try {
                    handlerThread.wait();
                } catch (java.lang.InterruptedException unused) {
                    z5 = true;
                }
            }
        }
        if (z5) {
            java.lang.Thread.currentThread().interrupt();
        }
        java.lang.RuntimeException runtimeException = handlerThread.f9189o;
        if (runtimeException != null) {
            throw runtimeException;
        }
        java.lang.Error error = handlerThread.f9188n;
        if (error != null) {
            throw error;
        }
        p206w0.C2319o c2319o = handlerThread.f9190p;
        c2319o.getClass();
        return c2319o;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f9194m) {
            try {
                if (!this.f9195n) {
                    p206w0.HandlerThreadC2318n handlerThreadC2318n = this.f9194m;
                    handlerThreadC2318n.f9187m.getClass();
                    handlerThreadC2318n.f9187m.sendEmptyMessage(2);
                    this.f9195n = true;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
