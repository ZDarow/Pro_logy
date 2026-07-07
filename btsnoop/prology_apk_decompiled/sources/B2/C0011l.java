package B2;

import android.graphics.Region;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import io.flutter.embedding.engine.FlutterJNI;

/* renamed from: B2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0011l extends SurfaceView implements io.flutter.embedding.engine.renderer.l {

    /* renamed from: l, reason: collision with root package name */
    public boolean f172l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f173m;

    /* renamed from: n, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.j f174n;

    /* renamed from: o, reason: collision with root package name */
    public final N f175o;

    public C0011l(AbstractActivityC0003d abstractActivityC0003d, boolean z4) {
        super(abstractActivityC0003d, null);
        this.f172l = false;
        this.f173m = false;
        N n4 = new N(new SurfaceHolderCallbackC0010k(0, this), this, this.f174n);
        this.f175o = n4;
        if (z4) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(n4);
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void a() {
        if (this.f174n == null) {
            Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f173m = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void b(io.flutter.embedding.engine.renderer.j jVar) {
        io.flutter.embedding.engine.renderer.j jVar2 = this.f174n;
        if (jVar2 != null) {
            jVar2.h();
        }
        this.f174n = jVar;
        ((N) this.f175o.f135d.f185m).f133b = jVar;
        d();
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void c() {
        if (this.f174n == null) {
            Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.j jVar = this.f174n;
            if (jVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            jVar.h();
        }
        ((N) this.f175o.f135d.f185m).f133b = null;
        this.f174n = null;
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void d() {
        if (this.f174n == null) {
            Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        r rVar = this.f175o.f135d;
        if (this.f172l) {
            e();
        }
        this.f173m = false;
    }

    public final void e() {
        if (this.f174n == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        io.flutter.embedding.engine.renderer.j jVar = this.f174n;
        Surface surface = getHolder().getSurface();
        boolean z4 = this.f173m;
        if (!z4) {
            jVar.h();
        }
        jVar.f6247c = surface;
        FlutterJNI flutterJNI = jVar.f6245a;
        if (z4) {
            flutterJNI.onSurfaceWindowChanged(surface);
        } else {
            flutterJNI.onSurfaceCreated(surface);
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i4 = iArr[0];
        region.op(i4, iArr[1], (getRight() + i4) - getLeft(), (getBottom() + iArr[1]) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public io.flutter.embedding.engine.renderer.j getAttachedRenderer() {
        return this.f174n;
    }
}
