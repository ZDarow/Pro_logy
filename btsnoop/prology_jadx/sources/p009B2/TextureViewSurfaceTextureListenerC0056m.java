package p009B2;

/* renamed from: B2.m */
/* loaded from: classes.dex */
public final class TextureViewSurfaceTextureListenerC0056m implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: a */
    public final /* synthetic */ p009B2.C0057n f179a;

    public TextureViewSurfaceTextureListenerC0056m(p009B2.C0057n c0057n) {
        this.f179a = c0057n;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i4, int i5) {
        p009B2.C0057n c0057n = this.f179a;
        c0057n.f180l = true;
        if ((c0057n.f182n == null || c0057n.f181m) ? false : true) {
            c0057n.m201e();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        p009B2.C0057n c0057n = this.f179a;
        boolean z4 = false;
        c0057n.f180l = false;
        io.flutter.embedding.engine.renderer.C1561j c1561j = c0057n.f182n;
        if (c1561j != null && !c0057n.f181m) {
            z4 = true;
        }
        if (z4) {
            if (c1561j == null) {
                throw new java.lang.IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            c1561j.m3451h();
            android.view.Surface surface = c0057n.f183o;
            if (surface != null) {
                surface.release();
                c0057n.f183o = null;
            }
        }
        android.view.Surface surface2 = c0057n.f183o;
        if (surface2 != null) {
            surface2.release();
            c0057n.f183o = null;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i4, int i5) {
        p009B2.C0057n c0057n = this.f179a;
        io.flutter.embedding.engine.renderer.C1561j c1561j = c0057n.f182n;
        if (c1561j == null || c0057n.f181m) {
            return;
        }
        if (c1561j == null) {
            throw new java.lang.IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        c1561j.f6478a.onSurfaceChanged(i4, i5);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }
}
