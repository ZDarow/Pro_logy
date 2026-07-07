package p009B2;

/* renamed from: B2.l */
/* loaded from: classes.dex */
public final class C0055l extends android.view.SurfaceView implements io.flutter.embedding.engine.renderer.InterfaceC1563l {

    /* renamed from: l */
    public boolean f175l;

    /* renamed from: m */
    public boolean f176m;

    /* renamed from: n */
    public io.flutter.embedding.engine.renderer.C1561j f177n;

    /* renamed from: o */
    public final p009B2.SurfaceHolderCallback2C0043N f178o;

    public C0055l(p009B2.AbstractActivityC0047d abstractActivityC0047d, boolean z4) {
        super(abstractActivityC0047d, null);
        this.f175l = false;
        this.f176m = false;
        p009B2.SurfaceHolderCallback2C0043N surfaceHolderCallback2C0043N = new p009B2.SurfaceHolderCallback2C0043N(new p009B2.SurfaceHolderCallbackC0054k(0, this), this, this.f177n);
        this.f178o = surfaceHolderCallback2C0043N;
        if (z4) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(surfaceHolderCallback2C0043N);
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC1563l
    /* renamed from: a */
    public final void mo193a() {
        if (this.f177n == null) {
            android.util.Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f176m = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC1563l
    /* renamed from: b */
    public final void mo194b(io.flutter.embedding.engine.renderer.C1561j c1561j) {
        io.flutter.embedding.engine.renderer.C1561j c1561j2 = this.f177n;
        if (c1561j2 != null) {
            c1561j2.m3451h();
        }
        this.f177n = c1561j;
        ((p009B2.SurfaceHolderCallback2C0043N) this.f178o.f138d.f188m).f136b = c1561j;
        mo196d();
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC1563l
    /* renamed from: c */
    public final void mo195c() {
        if (this.f177n == null) {
            android.util.Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.C1561j c1561j = this.f177n;
            if (c1561j == null) {
                throw new java.lang.IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            c1561j.m3451h();
        }
        ((p009B2.SurfaceHolderCallback2C0043N) this.f178o.f138d.f188m).f136b = null;
        this.f177n = null;
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC1563l
    /* renamed from: d */
    public final void mo196d() {
        if (this.f177n == null) {
            android.util.Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        p009B2.C0061r c0061r = this.f178o.f138d;
        if (this.f175l) {
            m200e();
        }
        this.f176m = false;
    }

    /* renamed from: e */
    public final void m200e() {
        if (this.f177n == null || getHolder() == null) {
            throw new java.lang.IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        io.flutter.embedding.engine.renderer.C1561j c1561j = this.f177n;
        android.view.Surface surface = getHolder().getSurface();
        boolean z4 = this.f176m;
        if (!z4) {
            c1561j.m3451h();
        }
        c1561j.f6480c = surface;
        io.flutter.embedding.engine.FlutterJNI flutterJNI = c1561j.f6478a;
        if (z4) {
            flutterJNI.onSurfaceWindowChanged(surface);
        } else {
            flutterJNI.onSurfaceCreated(surface);
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public final boolean gatherTransparentRegion(android.graphics.Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i4 = iArr[0];
        region.op(i4, iArr[1], (getRight() + i4) - getLeft(), (getBottom() + iArr[1]) - getTop(), android.graphics.Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC1563l
    public io.flutter.embedding.engine.renderer.C1561j getAttachedRenderer() {
        return this.f177n;
    }
}
