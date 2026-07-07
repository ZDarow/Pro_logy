package io.flutter.embedding.engine.renderer;

/* renamed from: io.flutter.embedding.engine.renderer.g */
/* loaded from: classes.dex */
public final class C1558g implements io.flutter.view.TextureRegistry$SurfaceTextureEntry, io.flutter.view.InterfaceC1617n {

    /* renamed from: a */
    public final long f6453a;

    /* renamed from: b */
    public final io.flutter.embedding.engine.renderer.SurfaceTextureWrapper f6454b;

    /* renamed from: c */
    public boolean f6455c;

    /* renamed from: d */
    public io.flutter.view.InterfaceC1617n f6456d;

    /* renamed from: e */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.C1561j f6457e;

    public C1558g(io.flutter.embedding.engine.renderer.C1561j c1561j, long j4, android.graphics.SurfaceTexture surfaceTexture) {
        this.f6457e = c1561j;
        this.f6453a = j4;
        io.flutter.embedding.engine.renderer.SurfaceTextureWrapper surfaceTextureWrapper = new io.flutter.embedding.engine.renderer.SurfaceTextureWrapper(surfaceTexture, new io.flutter.embedding.engine.renderer.RunnableC1553b(this, 1));
        this.f6454b = surfaceTextureWrapper;
        surfaceTextureWrapper.surfaceTexture().setOnFrameAvailableListener(new android.graphics.SurfaceTexture.OnFrameAvailableListener() { // from class: io.flutter.embedding.engine.renderer.f
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture2) {
                io.flutter.embedding.engine.renderer.C1558g c1558g = io.flutter.embedding.engine.renderer.C1558g.this;
                if (c1558g.f6455c) {
                    return;
                }
                io.flutter.embedding.engine.renderer.C1561j c1561j2 = c1558g.f6457e;
                if (c1561j2.f6478a.isAttached()) {
                    c1558g.f6454b.markDirty();
                    c1561j2.f6478a.scheduleFrame();
                }
            }
        }, new android.os.Handler());
    }

    public final void finalize() {
        try {
            if (this.f6455c) {
                return;
            }
            io.flutter.embedding.engine.renderer.C1561j c1561j = this.f6457e;
            c1561j.f6482e.post(new io.flutter.embedding.engine.renderer.RunnableC1559h(this.f6453a, c1561j.f6478a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    /* renamed from: id */
    public final long mo3443id() {
        return this.f6453a;
    }

    @Override // io.flutter.view.InterfaceC1617n
    public final void onTrimMemory(int i4) {
        io.flutter.view.InterfaceC1617n interfaceC1617n = this.f6456d;
        if (interfaceC1617n != null) {
            interfaceC1617n.onTrimMemory(i4);
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void release() {
        if (this.f6455c) {
            return;
        }
        this.f6454b.release();
        io.flutter.embedding.engine.renderer.C1561j c1561j = this.f6457e;
        c1561j.f6478a.unregisterTexture(this.f6453a);
        c1561j.m3449f(this);
        this.f6455c = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnFrameConsumedListener(io.flutter.view.InterfaceC1616m interfaceC1616m) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnTrimMemoryListener(io.flutter.view.InterfaceC1617n interfaceC1617n) {
        this.f6456d = interfaceC1617n;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final android.graphics.SurfaceTexture surfaceTexture() {
        return this.f6454b.surfaceTexture();
    }
}
