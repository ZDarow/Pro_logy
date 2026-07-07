package W;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* loaded from: classes.dex */
public final class d implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f2647r = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: l, reason: collision with root package name */
    public final Handler f2648l;

    /* renamed from: m, reason: collision with root package name */
    public final int[] f2649m = new int[1];

    /* renamed from: n, reason: collision with root package name */
    public EGLDisplay f2650n;

    /* renamed from: o, reason: collision with root package name */
    public EGLContext f2651o;

    /* renamed from: p, reason: collision with root package name */
    public EGLSurface f2652p;

    /* renamed from: q, reason: collision with root package name */
    public SurfaceTexture f2653q;

    public d(Handler handler) {
        this.f2648l = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f2648l.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f2653q;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
