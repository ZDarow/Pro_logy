package p206w0;

/* renamed from: w0.n */
/* loaded from: classes.dex */
public final class HandlerThreadC2318n extends android.os.HandlerThread implements android.os.Handler.Callback {

    /* renamed from: l */
    public p086W.RunnableC0784d f9186l;

    /* renamed from: m */
    public android.os.Handler f9187m;

    /* renamed from: n */
    public java.lang.Error f9188n;

    /* renamed from: o */
    public java.lang.RuntimeException f9189o;

    /* renamed from: p */
    public p206w0.C2319o f9190p;

    /* renamed from: a */
    public final void m4513a(int i4) {
        android.opengl.EGLSurface eglCreatePbufferSurface;
        this.f9186l.getClass();
        p086W.RunnableC0784d runnableC0784d = this.f9186l;
        runnableC0784d.getClass();
        android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        p086W.AbstractC0781a.m1417f("eglGetDisplay failed", eglGetDisplay != null);
        int[] iArr = new int[2];
        p086W.AbstractC0781a.m1417f("eglInitialize failed", android.opengl.EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1));
        runnableC0784d.f2742n = eglGetDisplay;
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean eglChooseConfig = android.opengl.EGL14.eglChooseConfig(eglGetDisplay, p086W.RunnableC0784d.f2739r, 0, eGLConfigArr, 0, 1, iArr2, 0);
        boolean z4 = eglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null;
        java.lang.Object[] objArr = {java.lang.Boolean.valueOf(eglChooseConfig), java.lang.Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
        int i5 = p086W.AbstractC0805y.f2801a;
        p086W.AbstractC0781a.m1417f(java.lang.String.format(java.util.Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z4);
        android.opengl.EGLConfig eGLConfig = eGLConfigArr[0];
        android.opengl.EGLContext eglCreateContext = android.opengl.EGL14.eglCreateContext(runnableC0784d.f2742n, eGLConfig, android.opengl.EGL14.EGL_NO_CONTEXT, i4 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        p086W.AbstractC0781a.m1417f("eglCreateContext failed", eglCreateContext != null);
        runnableC0784d.f2743o = eglCreateContext;
        android.opengl.EGLDisplay eGLDisplay = runnableC0784d.f2742n;
        if (i4 == 1) {
            eglCreatePbufferSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = android.opengl.EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i4 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            p086W.AbstractC0781a.m1417f("eglCreatePbufferSurface failed", eglCreatePbufferSurface != null);
        }
        p086W.AbstractC0781a.m1417f("eglMakeCurrent failed", android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        runnableC0784d.f2744p = eglCreatePbufferSurface;
        int[] iArr3 = runnableC0784d.f2741m;
        android.opengl.GLES20.glGenTextures(1, iArr3, 0);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        boolean z5 = false;
        while (true) {
            int glGetError = android.opengl.GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z5) {
                sb.append('\n');
            }
            java.lang.String gluErrorString = android.opengl.GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + java.lang.Integer.toHexString(glGetError);
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            z5 = true;
        }
        if (z5) {
            throw new java.lang.Exception(sb.toString());
        }
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(iArr3[0]);
        runnableC0784d.f2745q = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(runnableC0784d);
        android.graphics.SurfaceTexture surfaceTexture2 = this.f9186l.f2745q;
        surfaceTexture2.getClass();
        this.f9190p = new p206w0.C2319o(this, surfaceTexture2, i4 != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final void m4514b() {
        this.f9186l.getClass();
        p086W.RunnableC0784d runnableC0784d = this.f9186l;
        runnableC0784d.f2740l.removeCallbacks(runnableC0784d);
        try {
            android.graphics.SurfaceTexture surfaceTexture = runnableC0784d.f2745q;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                android.opengl.GLES20.glDeleteTextures(1, runnableC0784d.f2741m, 0);
            }
        } finally {
            android.opengl.EGLDisplay eGLDisplay = runnableC0784d.f2742n;
            if (eGLDisplay != null && !eGLDisplay.equals(android.opengl.EGL14.EGL_NO_DISPLAY)) {
                android.opengl.EGLDisplay eGLDisplay2 = runnableC0784d.f2742n;
                android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
                android.opengl.EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT);
            }
            android.opengl.EGLSurface eGLSurface2 = runnableC0784d.f2744p;
            if (eGLSurface2 != null && !eGLSurface2.equals(android.opengl.EGL14.EGL_NO_SURFACE)) {
                android.opengl.EGL14.eglDestroySurface(runnableC0784d.f2742n, runnableC0784d.f2744p);
            }
            android.opengl.EGLContext eGLContext = runnableC0784d.f2743o;
            if (eGLContext != null) {
                android.opengl.EGL14.eglDestroyContext(runnableC0784d.f2742n, eGLContext);
            }
            android.opengl.EGL14.eglReleaseThread();
            android.opengl.EGLDisplay eGLDisplay3 = runnableC0784d.f2742n;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(android.opengl.EGL14.EGL_NO_DISPLAY)) {
                android.opengl.EGL14.eglTerminate(runnableC0784d.f2742n);
            }
            runnableC0784d.f2742n = null;
            runnableC0784d.f2743o = null;
            runnableC0784d.f2744p = null;
            runnableC0784d.f2745q = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        int i4 = message.what;
        try {
            if (i4 != 1) {
                if (i4 != 2) {
                    return true;
                }
                try {
                    m4514b();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                m4513a(message.arg1);
                synchronized (this) {
                    notify();
                }
            } catch (p086W.C0785e e4) {
                p086W.AbstractC0781a.m1426o("PlaceholderSurface", "Failed to initialize placeholder surface", e4);
                this.f9189o = new java.lang.IllegalStateException(e4);
                synchronized (this) {
                    notify();
                }
            } catch (java.lang.Error e5) {
                p086W.AbstractC0781a.m1426o("PlaceholderSurface", "Failed to initialize placeholder surface", e5);
                this.f9188n = e5;
                synchronized (this) {
                    notify();
                }
            } catch (java.lang.RuntimeException e6) {
                p086W.AbstractC0781a.m1426o("PlaceholderSurface", "Failed to initialize placeholder surface", e6);
                this.f9189o = e6;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (java.lang.Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
