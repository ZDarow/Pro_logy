package w0;

import W.y;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;

/* loaded from: classes.dex */
public final class o extends Surface {

    /* renamed from: o, reason: collision with root package name */
    public static int f8833o;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f8834p;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f8835l;

    /* renamed from: m, reason: collision with root package name */
    public final n f8836m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8837n;

    public o(n nVar, SurfaceTexture surfaceTexture, boolean z4) {
        super(surfaceTexture);
        this.f8836m = nVar;
        this.f8835l = z4;
    }

    public static synchronized boolean d(Context context) {
        boolean z4;
        String eglQueryString;
        int i4;
        synchronized (o.class) {
            try {
                if (!f8834p) {
                    int i5 = y.f2709a;
                    if (i5 >= 24 && ((i5 >= 26 || (!"samsung".equals(y.f2711c) && !"XT1650".equals(y.f2712d))) && ((i5 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")))) {
                        String eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                        i4 = eglQueryString2 != null && eglQueryString2.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
                        f8833o = i4;
                        f8834p = true;
                    }
                    i4 = 0;
                    f8833o = i4;
                    f8834p = true;
                }
                z4 = f8833o != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [android.os.HandlerThread, java.lang.Thread, android.os.Handler$Callback, java.lang.Object, w0.n] */
    public static o e(Context context, boolean z4) {
        boolean z5 = false;
        W.a.j(!z4 || d(context));
        ?? handlerThread = new HandlerThread("ExoPlayer:PlaceholderSurface");
        int i4 = z4 ? f8833o : 0;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), handlerThread);
        handlerThread.f8829m = handler;
        handlerThread.f8828l = new W.d(handler);
        synchronized (handlerThread) {
            handlerThread.f8829m.obtainMessage(1, i4, 0).sendToTarget();
            while (handlerThread.f8832p == null && handlerThread.f8831o == null && handlerThread.f8830n == null) {
                try {
                    handlerThread.wait();
                } catch (InterruptedException unused) {
                    z5 = true;
                }
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = handlerThread.f8831o;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = handlerThread.f8830n;
        if (error != null) {
            throw error;
        }
        o oVar = handlerThread.f8832p;
        oVar.getClass();
        return oVar;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f8836m) {
            try {
                if (!this.f8837n) {
                    n nVar = this.f8836m;
                    nVar.f8829m.getClass();
                    nVar.f8829m.sendEmptyMessage(2);
                    this.f8837n = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
