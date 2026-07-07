package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import io.flutter.view.TextureRegistry$SurfaceTextureEntry;
import io.flutter.view.n;

/* loaded from: classes.dex */
public final class g implements TextureRegistry$SurfaceTextureEntry, n {

    /* renamed from: a, reason: collision with root package name */
    public final long f6220a;

    /* renamed from: b, reason: collision with root package name */
    public final SurfaceTextureWrapper f6221b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6222c;

    /* renamed from: d, reason: collision with root package name */
    public n f6223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f6224e;

    public g(j jVar, long j4, SurfaceTexture surfaceTexture) {
        this.f6224e = jVar;
        this.f6220a = j4;
        SurfaceTextureWrapper surfaceTextureWrapper = new SurfaceTextureWrapper(surfaceTexture, new b(this, 1));
        this.f6221b = surfaceTextureWrapper;
        surfaceTextureWrapper.surfaceTexture().setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: io.flutter.embedding.engine.renderer.f
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                g gVar = g.this;
                if (gVar.f6222c) {
                    return;
                }
                j jVar2 = gVar.f6224e;
                if (jVar2.f6245a.isAttached()) {
                    gVar.f6221b.markDirty();
                    jVar2.f6245a.scheduleFrame();
                }
            }
        }, new Handler());
    }

    public final void finalize() {
        try {
            if (this.f6222c) {
                return;
            }
            j jVar = this.f6224e;
            jVar.f6249e.post(new h(this.f6220a, jVar.f6245a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final long id() {
        return this.f6220a;
    }

    @Override // io.flutter.view.n
    public final void onTrimMemory(int i4) {
        n nVar = this.f6223d;
        if (nVar != null) {
            nVar.onTrimMemory(i4);
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void release() {
        if (this.f6222c) {
            return;
        }
        this.f6221b.release();
        j jVar = this.f6224e;
        jVar.f6245a.unregisterTexture(this.f6220a);
        jVar.f(this);
        this.f6222c = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnFrameConsumedListener(io.flutter.view.m mVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnTrimMemoryListener(n nVar) {
        this.f6223d = nVar;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final SurfaceTexture surfaceTexture() {
        return this.f6221b.surfaceTexture();
    }
}
