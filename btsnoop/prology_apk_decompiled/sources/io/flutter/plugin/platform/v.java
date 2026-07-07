package io.flutter.plugin.platform;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: classes.dex */
public final class v implements g {

    /* renamed from: l, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.g f6405l;

    /* renamed from: m, reason: collision with root package name */
    public SurfaceTexture f6406m;

    /* renamed from: n, reason: collision with root package name */
    public Surface f6407n;

    /* renamed from: o, reason: collision with root package name */
    public int f6408o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f6409p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6410q = false;

    public v(io.flutter.embedding.engine.renderer.g gVar) {
        u uVar = new u(this);
        this.f6405l = gVar;
        this.f6406m = gVar.f6221b.surfaceTexture();
        gVar.f6223d = uVar;
    }

    @Override // io.flutter.plugin.platform.g
    public final long a() {
        return this.f6405l.f6220a;
    }

    @Override // io.flutter.plugin.platform.g
    public final void b(int i4, int i5) {
        this.f6408o = i4;
        this.f6409p = i5;
        SurfaceTexture surfaceTexture = this.f6406m;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i4, i5);
        }
    }

    @Override // io.flutter.plugin.platform.g
    public final int getHeight() {
        return this.f6409p;
    }

    @Override // io.flutter.plugin.platform.g
    public final Surface getSurface() {
        Surface surface = this.f6407n;
        if (surface == null || this.f6410q) {
            if (surface != null) {
                surface.release();
                this.f6407n = null;
            }
            this.f6407n = new Surface(this.f6406m);
            this.f6410q = false;
        }
        SurfaceTexture surfaceTexture = this.f6406m;
        if (surfaceTexture == null || surfaceTexture.isReleased()) {
            return null;
        }
        return this.f6407n;
    }

    @Override // io.flutter.plugin.platform.g
    public final int getWidth() {
        return this.f6408o;
    }

    @Override // io.flutter.plugin.platform.g
    public final void release() {
        this.f6406m = null;
        Surface surface = this.f6407n;
        if (surface != null) {
            surface.release();
            this.f6407n = null;
        }
    }
}
