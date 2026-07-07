package p009B2;

/* renamed from: B2.k */
/* loaded from: classes.dex */
public final class SurfaceHolderCallbackC0054k implements android.view.SurfaceHolder.Callback {

    /* renamed from: a */
    public final /* synthetic */ int f173a;

    /* renamed from: b */
    public final /* synthetic */ java.lang.Object f174b;

    public /* synthetic */ SurfaceHolderCallbackC0054k(int i4, java.lang.Object obj) {
        this.f173a = i4;
        this.f174b = obj;
    }

    /* renamed from: a */
    private final void m199a(android.view.SurfaceHolder surfaceHolder, int i4, int i5, int i6) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i4, int i5, int i6) {
        switch (this.f173a) {
            case 0:
                p009B2.C0055l c0055l = (p009B2.C0055l) this.f174b;
                io.flutter.embedding.engine.renderer.C1561j c1561j = c0055l.f177n;
                if (c1561j == null || c0055l.f176m) {
                    return;
                }
                if (c1561j == null) {
                    throw new java.lang.IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
                }
                c1561j.f6478a.onSurfaceChanged(i5, i6);
                return;
            default:
                return;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        switch (this.f173a) {
            case 0:
                p009B2.C0055l c0055l = (p009B2.C0055l) this.f174b;
                c0055l.f175l = true;
                if ((c0055l.f177n == null || c0055l.f176m) ? false : true) {
                    c0055l.m200e();
                    return;
                }
                return;
            default:
                android.view.Surface surface = surfaceHolder.getSurface();
                p076T.InterfaceC0672O interfaceC0672O = (p102a0.InterfaceC0994s) this.f174b;
                ((p102a0.C0944H) interfaceC0672O).m1841N(surface);
                p021E0.AbstractC0193e abstractC0193e = (p021E0.AbstractC0193e) interfaceC0672O;
                abstractC0193e.getClass();
                abstractC0193e.mo558k(((p102a0.C0944H) abstractC0193e).m1854q(), 1L, false);
                return;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        switch (this.f173a) {
            case 0:
                p009B2.C0055l c0055l = (p009B2.C0055l) this.f174b;
                boolean z4 = false;
                c0055l.f175l = false;
                io.flutter.embedding.engine.renderer.C1561j c1561j = c0055l.f177n;
                if (c1561j != null && !c0055l.f176m) {
                    z4 = true;
                }
                if (z4) {
                    if (c1561j == null) {
                        throw new java.lang.IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
                    }
                    c1561j.m3451h();
                    return;
                }
                return;
            default:
                ((p102a0.C0944H) ((p102a0.InterfaceC0994s) this.f174b)).m1841N(null);
                return;
        }
    }
}
