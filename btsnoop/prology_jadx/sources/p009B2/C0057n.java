package p009B2;

/* renamed from: B2.n */
/* loaded from: classes.dex */
public final class C0057n extends android.view.TextureView implements io.flutter.embedding.engine.renderer.InterfaceC1563l {

    /* renamed from: l */
    public boolean f180l;

    /* renamed from: m */
    public boolean f181m;

    /* renamed from: n */
    public io.flutter.embedding.engine.renderer.C1561j f182n;

    /* renamed from: o */
    public android.view.Surface f183o;

    @Override // io.flutter.embedding.engine.renderer.InterfaceC1563l
    /* renamed from: a */
    public final void mo193a() {
        if (this.f182n == null) {
            android.util.Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f181m = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC1563l
    /* renamed from: b */
    public final void mo194b(io.flutter.embedding.engine.renderer.C1561j c1561j) {
        io.flutter.embedding.engine.renderer.C1561j c1561j2 = this.f182n;
        if (c1561j2 != null) {
            c1561j2.m3451h();
        }
        this.f182n = c1561j;
        mo196d();
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC1563l
    /* renamed from: c */
    public final void mo195c() {
        if (this.f182n == null) {
            android.util.Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.C1561j c1561j = this.f182n;
            if (c1561j == null) {
                throw new java.lang.IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            c1561j.m3451h();
            android.view.Surface surface = this.f183o;
            if (surface != null) {
                surface.release();
                this.f183o = null;
            }
        }
        this.f182n = null;
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC1563l
    /* renamed from: d */
    public final void mo196d() {
        if (this.f182n == null) {
            android.util.Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f180l) {
            m201e();
        }
        this.f181m = false;
    }

    /* renamed from: e */
    public final void m201e() {
        if (this.f182n == null || getSurfaceTexture() == null) {
            throw new java.lang.IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        android.view.Surface surface = this.f183o;
        if (surface != null) {
            surface.release();
            this.f183o = null;
        }
        android.view.Surface surface2 = new android.view.Surface(getSurfaceTexture());
        this.f183o = surface2;
        io.flutter.embedding.engine.renderer.C1561j c1561j = this.f182n;
        boolean z4 = this.f181m;
        if (!z4) {
            c1561j.m3451h();
        }
        c1561j.f6480c = surface2;
        io.flutter.embedding.engine.FlutterJNI flutterJNI = c1561j.f6478a;
        if (z4) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC1563l
    public io.flutter.embedding.engine.renderer.C1561j getAttachedRenderer() {
        return this.f182n;
    }

    public void setRenderSurface(android.view.Surface surface) {
        this.f183o = surface;
    }
}
