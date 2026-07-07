package B2;

import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import io.flutter.embedding.engine.FlutterJNI;

/* renamed from: B2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0013n extends TextureView implements io.flutter.embedding.engine.renderer.l {

    /* renamed from: l, reason: collision with root package name */
    public boolean f177l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f178m;

    /* renamed from: n, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.j f179n;

    /* renamed from: o, reason: collision with root package name */
    public Surface f180o;

    @Override // io.flutter.embedding.engine.renderer.l
    public final void a() {
        if (this.f179n == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f178m = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void b(io.flutter.embedding.engine.renderer.j jVar) {
        io.flutter.embedding.engine.renderer.j jVar2 = this.f179n;
        if (jVar2 != null) {
            jVar2.h();
        }
        this.f179n = jVar;
        d();
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void c() {
        if (this.f179n == null) {
            Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.j jVar = this.f179n;
            if (jVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            jVar.h();
            Surface surface = this.f180o;
            if (surface != null) {
                surface.release();
                this.f180o = null;
            }
        }
        this.f179n = null;
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void d() {
        if (this.f179n == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f177l) {
            e();
        }
        this.f178m = false;
    }

    public final void e() {
        if (this.f179n == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f180o;
        if (surface != null) {
            surface.release();
            this.f180o = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f180o = surface2;
        io.flutter.embedding.engine.renderer.j jVar = this.f179n;
        boolean z4 = this.f178m;
        if (!z4) {
            jVar.h();
        }
        jVar.f6247c = surface2;
        FlutterJNI flutterJNI = jVar.f6245a;
        if (z4) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public io.flutter.embedding.engine.renderer.j getAttachedRenderer() {
        return this.f179n;
    }

    public void setRenderSurface(Surface surface) {
        this.f180o = surface;
    }
}
