package B2;

import android.view.SurfaceHolder;

/* loaded from: classes.dex */
public final class N implements SurfaceHolder.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    public final C0011l f132a;

    /* renamed from: b, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.j f133b;

    /* renamed from: c, reason: collision with root package name */
    public final SurfaceHolderCallbackC0010k f134c;

    /* renamed from: d, reason: collision with root package name */
    public final r f135d;

    public N(SurfaceHolderCallbackC0010k surfaceHolderCallbackC0010k, C0011l c0011l, io.flutter.embedding.engine.renderer.j jVar) {
        new C0004e(2, this);
        this.f135d = new r(1, this);
        this.f134c = surfaceHolderCallbackC0010k;
        this.f133b = jVar;
        this.f132a = c0011l;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i4, int i5, int i6) {
        this.f134c.surfaceChanged(surfaceHolder, i4, i5, i6);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f134c.surfaceCreated(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f134c.surfaceDestroyed(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        io.flutter.embedding.engine.renderer.j jVar = this.f133b;
        if (jVar == null) {
            return;
        }
        M m4 = new M(this, runnable);
        jVar.f6245a.addIsDisplayingFlutterUiListener(m4);
        if (jVar.f6248d) {
            m4.b();
        }
    }
}
