package io.flutter.plugin.platform;

/* renamed from: io.flutter.plugin.platform.n */
/* loaded from: classes.dex */
public final class C1591n implements io.flutter.plugin.platform.InterfaceC1586i {

    /* renamed from: l */
    public io.flutter.plugin.platform.C1590m f6593l;

    /* renamed from: m */
    public p009B2.C0044a f6594m;

    /* renamed from: n */
    public android.app.Activity f6595n;

    /* renamed from: o */
    public p009B2.C0064u f6596o;

    /* renamed from: q */
    public io.flutter.plugin.editing.C1575k f6598q;

    /* renamed from: r */
    public p008B1.C0026d f6599r;

    /* renamed from: v */
    public final p008B1.C0026d f6603v;

    /* renamed from: p */
    public io.flutter.embedding.engine.FlutterJNI f6597p = null;

    /* renamed from: y */
    public android.view.Surface f6606y = null;

    /* renamed from: z */
    public android.view.SurfaceControl f6607z = null;

    /* renamed from: A */
    public final io.flutter.plugin.platform.C1590m f6592A = new io.flutter.plugin.platform.C1590m(3, this);

    /* renamed from: s */
    public final io.flutter.plugin.platform.C1578a f6600s = new java.lang.Object();

    /* renamed from: t */
    public final android.util.SparseArray f6601t = new android.util.SparseArray();

    /* renamed from: u */
    public final android.util.SparseArray f6602u = new android.util.SparseArray();

    /* renamed from: w */
    public final java.util.ArrayList f6604w = new java.util.ArrayList();

    /* renamed from: x */
    public final java.util.ArrayList f6605x = new java.util.ArrayList();

    /* JADX WARN: Type inference failed for: r0v2, types: [io.flutter.plugin.platform.a, java.lang.Object] */
    public C1591n() {
        if (p008B1.C0026d.f96o == null) {
            p008B1.C0026d.f96o = new p008B1.C0026d(3);
        }
        this.f6603v = p008B1.C0026d.f96o;
    }

    @Override // io.flutter.plugin.platform.InterfaceC1586i
    /* renamed from: K */
    public final android.view.SurfaceView mo1708K(int i4) {
        io.flutter.plugin.platform.InterfaceC1583f interfaceC1583f = (io.flutter.plugin.platform.InterfaceC1583f) this.f6601t.get(i4);
        if (interfaceC1583f == null) {
            return null;
        }
        return ((p081U2.C0751a) interfaceC1583f).f2611a;
    }

    @Override // io.flutter.plugin.platform.InterfaceC1586i
    /* renamed from: f */
    public final void mo1724f() {
        this.f6600s.f6562a = null;
    }

    @Override // io.flutter.plugin.platform.InterfaceC1586i
    /* renamed from: m */
    public final void mo1725m(io.flutter.view.C1610g c1610g) {
        this.f6600s.f6562a = c1610g;
    }

    @Override // io.flutter.plugin.platform.InterfaceC1586i
    /* renamed from: r */
    public final boolean mo1726r(int i4) {
        return false;
    }
}
