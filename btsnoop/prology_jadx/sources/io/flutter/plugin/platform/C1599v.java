package io.flutter.plugin.platform;

/* renamed from: io.flutter.plugin.platform.v */
/* loaded from: classes.dex */
public final class C1599v implements io.flutter.plugin.platform.InterfaceC1584g {

    /* renamed from: l */
    public final io.flutter.embedding.engine.renderer.C1558g f6644l;

    /* renamed from: m */
    public android.graphics.SurfaceTexture f6645m;

    /* renamed from: n */
    public android.view.Surface f6646n;

    /* renamed from: o */
    public int f6647o = 0;

    /* renamed from: p */
    public int f6648p = 0;

    /* renamed from: q */
    public boolean f6649q = false;

    public C1599v(io.flutter.embedding.engine.renderer.C1558g c1558g) {
        io.flutter.plugin.platform.C1598u c1598u = new io.flutter.plugin.platform.C1598u(this);
        this.f6644l = c1558g;
        this.f6645m = c1558g.f6454b.surfaceTexture();
        c1558g.f6456d = c1598u;
    }

    @Override // io.flutter.plugin.platform.InterfaceC1584g
    /* renamed from: a */
    public final long mo3501a() {
        return this.f6644l.f6453a;
    }

    @Override // io.flutter.plugin.platform.InterfaceC1584g
    /* renamed from: b */
    public final void mo3502b(int i4, int i5) {
        this.f6647o = i4;
        this.f6648p = i5;
        android.graphics.SurfaceTexture surfaceTexture = this.f6645m;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i4, i5);
        }
    }

    @Override // io.flutter.plugin.platform.InterfaceC1584g
    public final int getHeight() {
        return this.f6648p;
    }

    @Override // io.flutter.plugin.platform.InterfaceC1584g
    public final android.view.Surface getSurface() {
        android.view.Surface surface = this.f6646n;
        if (surface == null || this.f6649q) {
            if (surface != null) {
                surface.release();
                this.f6646n = null;
            }
            this.f6646n = new android.view.Surface(this.f6645m);
            this.f6649q = false;
        }
        android.graphics.SurfaceTexture surfaceTexture = this.f6645m;
        if (surfaceTexture == null || surfaceTexture.isReleased()) {
            return null;
        }
        return this.f6646n;
    }

    @Override // io.flutter.plugin.platform.InterfaceC1584g
    public final int getWidth() {
        return this.f6647o;
    }

    @Override // io.flutter.plugin.platform.InterfaceC1584g
    public final void release() {
        this.f6645m = null;
        android.view.Surface surface = this.f6646n;
        if (surface != null) {
            surface.release();
            this.f6646n = null;
        }
    }
}
