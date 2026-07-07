package w0;

import W.y;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Locale;

/* loaded from: classes.dex */
public final class n extends HandlerThread implements Handler.Callback {

    /* renamed from: l, reason: collision with root package name */
    public W.d f8828l;

    /* renamed from: m, reason: collision with root package name */
    public Handler f8829m;

    /* renamed from: n, reason: collision with root package name */
    public Error f8830n;

    /* renamed from: o, reason: collision with root package name */
    public RuntimeException f8831o;

    /* renamed from: p, reason: collision with root package name */
    public o f8832p;

    public final void a(int i4) {
        EGLSurface eglCreatePbufferSurface;
        this.f8828l.getClass();
        W.d dVar = this.f8828l;
        dVar.getClass();
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        W.a.f("eglGetDisplay failed", eglGetDisplay != null);
        int[] iArr = new int[2];
        W.a.f("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1));
        dVar.f2650n = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, W.d.f2647r, 0, eGLConfigArr, 0, 1, iArr2, 0);
        boolean z4 = eglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
        int i5 = y.f2709a;
        W.a.f(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z4);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(dVar.f2650n, eGLConfig, EGL14.EGL_NO_CONTEXT, i4 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        W.a.f("eglCreateContext failed", eglCreateContext != null);
        dVar.f2651o = eglCreateContext;
        EGLDisplay eGLDisplay = dVar.f2650n;
        if (i4 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i4 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            W.a.f("eglCreatePbufferSurface failed", eglCreatePbufferSurface != null);
        }
        W.a.f("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        dVar.f2652p = eglCreatePbufferSurface;
        int[] iArr3 = dVar.f2649m;
        GLES20.glGenTextures(1, iArr3, 0);
        StringBuilder sb = new StringBuilder();
        boolean z5 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z5) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            z5 = true;
        }
        if (z5) {
            throw new Exception(sb.toString());
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        dVar.f2653q = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(dVar);
        SurfaceTexture surfaceTexture2 = this.f8828l.f2653q;
        surfaceTexture2.getClass();
        this.f8832p = new o(this, surfaceTexture2, i4 != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.f8828l.getClass();
        W.d dVar = this.f8828l;
        dVar.f2648l.removeCallbacks(dVar);
        try {
            SurfaceTexture surfaceTexture = dVar.f2653q;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, dVar.f2649m, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = dVar.f2650n;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = dVar.f2650n;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = dVar.f2652p;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(dVar.f2650n, dVar.f2652p);
            }
            EGLContext eGLContext = dVar.f2651o;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(dVar.f2650n, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = dVar.f2650n;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(dVar.f2650n);
            }
            dVar.f2650n = null;
            dVar.f2651o = null;
            dVar.f2652p = null;
            dVar.f2653q = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i4 = message.what;
        try {
            if (i4 != 1) {
                if (i4 != 2) {
                    return true;
                }
                try {
                    b();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                a(message.arg1);
                synchronized (this) {
                    notify();
                }
            } catch (W.e e4) {
                W.a.o("PlaceholderSurface", "Failed to initialize placeholder surface", e4);
                this.f8831o = new IllegalStateException(e4);
                synchronized (this) {
                    notify();
                }
            } catch (Error e5) {
                W.a.o("PlaceholderSurface", "Failed to initialize placeholder surface", e5);
                this.f8830n = e5;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e6) {
                W.a.o("PlaceholderSurface", "Failed to initialize placeholder surface", e6);
                this.f8831o = e6;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
