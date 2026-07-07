package p009B2;

/* renamed from: B2.N */
/* loaded from: classes.dex */
public final class SurfaceHolderCallback2C0043N implements android.view.SurfaceHolder.Callback2 {

    /* renamed from: a */
    public final p009B2.C0055l f135a;

    /* renamed from: b */
    public io.flutter.embedding.engine.renderer.C1561j f136b;

    /* renamed from: c */
    public final p009B2.SurfaceHolderCallbackC0054k f137c;

    /* renamed from: d */
    public final p009B2.C0061r f138d;

    public SurfaceHolderCallback2C0043N(p009B2.SurfaceHolderCallbackC0054k surfaceHolderCallbackC0054k, p009B2.C0055l c0055l, io.flutter.embedding.engine.renderer.C1561j c1561j) {
        new p009B2.C0048e(2, this);
        this.f138d = new p009B2.C0061r(1, this);
        this.f137c = surfaceHolderCallbackC0054k;
        this.f136b = c1561j;
        this.f135a = c0055l;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i4, int i5, int i6) {
        this.f137c.surfaceChanged(surfaceHolder, i4, i5, i6);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        this.f137c.surfaceCreated(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        this.f137c.surfaceDestroyed(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(android.view.SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeededAsync(android.view.SurfaceHolder surfaceHolder, java.lang.Runnable runnable) {
        io.flutter.embedding.engine.renderer.C1561j c1561j = this.f136b;
        if (c1561j == null) {
            return;
        }
        p009B2.C0042M c0042m = new p009B2.C0042M(this, runnable);
        c1561j.f6478a.addIsDisplayingFlutterUiListener(c0042m);
        if (c1561j.f6481d) {
            c0042m.mo123b();
        }
    }
}
