package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$GLTextureConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.o;

/* loaded from: classes.dex */
public final class m implements TextureRegistry$SurfaceProducer, TextureRegistry$GLTextureConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final long f6253a;

    /* renamed from: b, reason: collision with root package name */
    public int f6254b;

    /* renamed from: c, reason: collision with root package name */
    public int f6255c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6256d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f6257e;

    /* renamed from: f, reason: collision with root package name */
    public final g f6258f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f6259g;

    /* renamed from: h, reason: collision with root package name */
    public final FlutterJNI f6260h;

    public m(long j4, Handler handler, FlutterJNI flutterJNI, g gVar) {
        this.f6253a = j4;
        this.f6259g = handler;
        this.f6260h = flutterJNI;
        this.f6258f = gVar;
    }

    public final void finalize() {
        try {
            if (this.f6256d) {
                return;
            }
            release();
            this.f6259g.post(new h(this.f6253a, this.f6260h));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final Surface getForcedNewSurface() {
        this.f6257e = null;
        return getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getHeight() {
        return this.f6255c;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final Surface getSurface() {
        Surface surface = this.f6257e;
        if (surface == null || !surface.isValid()) {
            this.f6257e = new Surface(this.f6258f.f6221b.surfaceTexture());
        }
        return this.f6257e;
    }

    @Override // io.flutter.view.TextureRegistry$GLTextureConsumer
    public final SurfaceTexture getSurfaceTexture() {
        return this.f6258f.f6221b.surfaceTexture();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getWidth() {
        return this.f6254b;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final boolean handlesCropAndRotation() {
        return true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final long id() {
        return this.f6253a;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void release() {
        this.f6258f.release();
        this.f6257e.release();
        this.f6257e = null;
        this.f6256d = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void scheduleFrame() {
        this.f6260h.markTextureFrameAvailable(this.f6253a);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setCallback(o oVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setSize(int i4, int i5) {
        this.f6254b = i4;
        this.f6255c = i5;
        this.f6258f.f6221b.surfaceTexture().setDefaultBufferSize(i4, i5);
    }
}
