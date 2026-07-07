package a0;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* renamed from: a0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SurfaceHolderCallbackC0115E implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0118H f3204a;

    public SurfaceHolderCallbackC0115E(C0118H c0118h) {
        this.f3204a = c0118h;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i4, int i5) {
        C0118H c0118h = this.f3204a;
        c0118h.getClass();
        Surface surface = new Surface(surfaceTexture);
        c0118h.M(surface);
        c0118h.f3223P = surface;
        c0118h.C(i4, i5);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C0118H c0118h = this.f3204a;
        c0118h.M(null);
        c0118h.C(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i4, int i5) {
        this.f3204a.C(i4, i5);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i4, int i5, int i6) {
        this.f3204a.C(i5, i6);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C0118H c0118h = this.f3204a;
        if (c0118h.f3225R) {
            c0118h.M(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C0118H c0118h = this.f3204a;
        if (c0118h.f3225R) {
            c0118h.M(null);
        }
        c0118h.C(0, 0);
    }
}
