package B2;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* renamed from: B2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class TextureViewSurfaceTextureListenerC0012m implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0013n f176a;

    public TextureViewSurfaceTextureListenerC0012m(C0013n c0013n) {
        this.f176a = c0013n;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i4, int i5) {
        C0013n c0013n = this.f176a;
        c0013n.f177l = true;
        if ((c0013n.f179n == null || c0013n.f178m) ? false : true) {
            c0013n.e();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C0013n c0013n = this.f176a;
        boolean z4 = false;
        c0013n.f177l = false;
        io.flutter.embedding.engine.renderer.j jVar = c0013n.f179n;
        if (jVar != null && !c0013n.f178m) {
            z4 = true;
        }
        if (z4) {
            if (jVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            jVar.h();
            Surface surface = c0013n.f180o;
            if (surface != null) {
                surface.release();
                c0013n.f180o = null;
            }
        }
        Surface surface2 = c0013n.f180o;
        if (surface2 != null) {
            surface2.release();
            c0013n.f180o = null;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i4, int i5) {
        C0013n c0013n = this.f176a;
        io.flutter.embedding.engine.renderer.j jVar = c0013n.f179n;
        if (jVar == null || c0013n.f178m) {
            return;
        }
        if (jVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        jVar.f6245a.onSurfaceChanged(i4, i5);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
