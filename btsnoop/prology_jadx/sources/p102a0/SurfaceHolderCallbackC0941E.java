package p102a0;

/* renamed from: a0.E */
/* loaded from: classes.dex */
public final class SurfaceHolderCallbackC0941E implements android.view.SurfaceHolder.Callback, android.view.TextureView.SurfaceTextureListener {

    /* renamed from: a */
    public final /* synthetic */ p102a0.C0944H f3316a;

    public SurfaceHolderCallbackC0941E(p102a0.C0944H c0944h) {
        this.f3316a = c0944h;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i4, int i5) {
        p102a0.C0944H c0944h = this.f3316a;
        c0944h.getClass();
        android.view.Surface surface = new android.view.Surface(surfaceTexture);
        c0944h.m1840M(surface);
        c0944h.f3336P = surface;
        c0944h.m1830C(i4, i5);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        p102a0.C0944H c0944h = this.f3316a;
        c0944h.m1840M(null);
        c0944h.m1830C(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i4, int i5) {
        this.f3316a.m1830C(i4, i5);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i4, int i5, int i6) {
        this.f3316a.m1830C(i5, i6);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        p102a0.C0944H c0944h = this.f3316a;
        if (c0944h.f3338R) {
            c0944h.m1840M(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        p102a0.C0944H c0944h = this.f3316a;
        if (c0944h.f3338R) {
            c0944h.m1840M(null);
        }
        c0944h.m1830C(0, 0);
    }
}
