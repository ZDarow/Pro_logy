package io.flutter.embedding.engine.renderer;

/* renamed from: io.flutter.embedding.engine.renderer.j */
/* loaded from: classes.dex */
public final class C1561j {

    /* renamed from: a */
    public final io.flutter.embedding.engine.FlutterJNI f6478a;

    /* renamed from: c */
    public android.view.Surface f6480c;

    /* renamed from: h */
    public final p009B2.C0048e f6485h;

    /* renamed from: b */
    public final java.util.concurrent.atomic.AtomicLong f6479b = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: d */
    public boolean f6481d = false;

    /* renamed from: e */
    public final android.os.Handler f6482e = new android.os.Handler();

    /* renamed from: f */
    public final java.util.HashSet f6483f = new java.util.HashSet();

    /* renamed from: g */
    public final java.util.ArrayList f6484g = new java.util.ArrayList();

    public C1561j(io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        p009B2.C0048e c0048e = new p009B2.C0048e(3, this);
        this.f6485h = c0048e;
        this.f6478a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(c0048e);
    }

    /* renamed from: a */
    public final void m3444a(io.flutter.view.InterfaceC1617n interfaceC1617n) {
        java.util.HashSet hashSet = this.f6483f;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((io.flutter.view.InterfaceC1617n) ((java.lang.ref.WeakReference) it.next()).get()) == null) {
                it.remove();
            }
        }
        hashSet.add(new java.lang.ref.WeakReference(interfaceC1617n));
    }

    /* renamed from: b */
    public final io.flutter.view.TextureRegistry$ImageTextureEntry m3445b() {
        io.flutter.embedding.engine.renderer.FlutterRenderer$ImageTextureRegistryEntry flutterRenderer$ImageTextureRegistryEntry = new io.flutter.embedding.engine.renderer.FlutterRenderer$ImageTextureRegistryEntry(this, this.f6479b.getAndIncrement());
        flutterRenderer$ImageTextureRegistryEntry.mo3442id();
        this.f6478a.registerImageTexture(flutterRenderer$ImageTextureRegistryEntry.mo3442id(), flutterRenderer$ImageTextureRegistryEntry, false);
        return flutterRenderer$ImageTextureRegistryEntry;
    }

    /* renamed from: c */
    public final io.flutter.view.TextureRegistry$SurfaceProducer m3446c(int i4) {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            io.flutter.embedding.engine.renderer.C1558g m3447d = m3447d();
            return new io.flutter.embedding.engine.renderer.C1564m(m3447d.f6453a, this.f6482e, this.f6478a, m3447d);
        }
        long andIncrement = this.f6479b.getAndIncrement();
        io.flutter.embedding.engine.renderer.FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = new io.flutter.embedding.engine.renderer.FlutterRenderer$ImageReaderSurfaceProducer(this, andIncrement);
        boolean z4 = i4 == 2;
        this.f6478a.registerImageTexture(andIncrement, flutterRenderer$ImageReaderSurfaceProducer, z4);
        if (z4) {
            m3444a(flutterRenderer$ImageReaderSurfaceProducer);
        }
        this.f6484g.add(flutterRenderer$ImageReaderSurfaceProducer);
        return flutterRenderer$ImageReaderSurfaceProducer;
    }

    /* renamed from: d */
    public final io.flutter.embedding.engine.renderer.C1558g m3447d() {
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(0);
        long andIncrement = this.f6479b.getAndIncrement();
        surfaceTexture.detachFromGLContext();
        io.flutter.embedding.engine.renderer.C1558g c1558g = new io.flutter.embedding.engine.renderer.C1558g(this, andIncrement, surfaceTexture);
        this.f6478a.registerTexture(c1558g.f6453a, c1558g.f6454b);
        m3444a(c1558g);
        return c1558g;
    }

    /* renamed from: e */
    public final void m3448e(int i4) {
        java.util.Iterator it = this.f6483f.iterator();
        while (it.hasNext()) {
            io.flutter.view.InterfaceC1617n interfaceC1617n = (io.flutter.view.InterfaceC1617n) ((java.lang.ref.WeakReference) it.next()).get();
            if (interfaceC1617n != null) {
                interfaceC1617n.onTrimMemory(i4);
            } else {
                it.remove();
            }
        }
    }

    /* renamed from: f */
    public final void m3449f(io.flutter.view.InterfaceC1617n interfaceC1617n) {
        java.util.HashSet hashSet = this.f6483f;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference.get() == interfaceC1617n) {
                hashSet.remove(weakReference);
                return;
            }
        }
    }

    /* renamed from: g */
    public final void m3450g() {
        java.util.Iterator it = this.f6484g.iterator();
        while (it.hasNext()) {
            io.flutter.embedding.engine.renderer.FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = (io.flutter.embedding.engine.renderer.FlutterRenderer$ImageReaderSurfaceProducer) it.next();
            io.flutter.view.InterfaceC1618o interfaceC1618o = flutterRenderer$ImageReaderSurfaceProducer.callback;
            if (interfaceC1618o != null && flutterRenderer$ImageReaderSurfaceProducer.notifiedDestroy) {
                flutterRenderer$ImageReaderSurfaceProducer.notifiedDestroy = false;
                p085V2.C0780b c0780b = (p085V2.C0780b) interfaceC1618o;
                if (c0780b.f2731d) {
                    ((p102a0.C0944H) c0780b.f2540c).m1841N(c0780b.f2539b.getSurface());
                    c0780b.f2731d = false;
                }
            }
        }
    }

    /* renamed from: h */
    public final void m3451h() {
        if (this.f6480c != null) {
            this.f6478a.onSurfaceDestroyed();
            if (this.f6481d) {
                this.f6485h.mo122a();
            }
            this.f6481d = false;
            this.f6480c = null;
        }
    }
}
