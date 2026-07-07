package io.flutter.embedding.engine.renderer;

/* renamed from: io.flutter.embedding.engine.renderer.m */
/* loaded from: classes.dex */
public final class C1564m implements io.flutter.view.TextureRegistry$SurfaceProducer, io.flutter.view.TextureRegistry$GLTextureConsumer {

    /* renamed from: a */
    public final long f6486a;

    /* renamed from: b */
    public int f6487b;

    /* renamed from: c */
    public int f6488c;

    /* renamed from: d */
    public boolean f6489d;

    /* renamed from: e */
    public android.view.Surface f6490e;

    /* renamed from: f */
    public final io.flutter.embedding.engine.renderer.C1558g f6491f;

    /* renamed from: g */
    public final android.os.Handler f6492g;

    /* renamed from: h */
    public final io.flutter.embedding.engine.FlutterJNI f6493h;

    public C1564m(long j4, android.os.Handler handler, io.flutter.embedding.engine.FlutterJNI flutterJNI, io.flutter.embedding.engine.renderer.C1558g c1558g) {
        this.f6486a = j4;
        this.f6492g = handler;
        this.f6493h = flutterJNI;
        this.f6491f = c1558g;
    }

    public final void finalize() {
        try {
            if (this.f6489d) {
                return;
            }
            release();
            this.f6492g.post(new io.flutter.embedding.engine.renderer.RunnableC1559h(this.f6486a, this.f6493h));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final android.view.Surface getForcedNewSurface() {
        this.f6490e = null;
        return getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getHeight() {
        return this.f6488c;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final android.view.Surface getSurface() {
        android.view.Surface surface = this.f6490e;
        if (surface == null || !surface.isValid()) {
            this.f6490e = new android.view.Surface(this.f6491f.f6454b.surfaceTexture());
        }
        return this.f6490e;
    }

    @Override // io.flutter.view.TextureRegistry$GLTextureConsumer
    public final android.graphics.SurfaceTexture getSurfaceTexture() {
        return this.f6491f.f6454b.surfaceTexture();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getWidth() {
        return this.f6487b;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final boolean handlesCropAndRotation() {
        return true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    /* renamed from: id */
    public final long mo3441id() {
        return this.f6486a;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void release() {
        this.f6491f.release();
        this.f6490e.release();
        this.f6490e = null;
        this.f6489d = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void scheduleFrame() {
        this.f6493h.markTextureFrameAvailable(this.f6486a);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setCallback(io.flutter.view.InterfaceC1618o interfaceC1618o) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setSize(int i4, int i5) {
        this.f6487b = i4;
        this.f6488c = i5;
        this.f6491f.f6454b.surfaceTexture().setDefaultBufferSize(i4, i5);
    }
}
