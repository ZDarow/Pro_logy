package p086W;

/* renamed from: W.d */
/* loaded from: classes.dex */
public final class RunnableC0784d implements android.graphics.SurfaceTexture.OnFrameAvailableListener, java.lang.Runnable {

    /* renamed from: r */
    public static final int[] f2739r = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: l */
    public final android.os.Handler f2740l;

    /* renamed from: m */
    public final int[] f2741m = new int[1];

    /* renamed from: n */
    public android.opengl.EGLDisplay f2742n;

    /* renamed from: o */
    public android.opengl.EGLContext f2743o;

    /* renamed from: p */
    public android.opengl.EGLSurface f2744p;

    /* renamed from: q */
    public android.graphics.SurfaceTexture f2745q;

    public RunnableC0784d(android.os.Handler handler) {
        this.f2740l = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        this.f2740l.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.SurfaceTexture surfaceTexture = this.f2745q;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (java.lang.RuntimeException unused) {
            }
        }
    }
}
