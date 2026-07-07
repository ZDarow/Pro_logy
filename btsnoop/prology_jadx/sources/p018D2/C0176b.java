package p018D2;

/* renamed from: D2.b */
/* loaded from: classes.dex */
public final class C0176b implements p047L2.InterfaceC0376f {

    /* renamed from: l */
    public final io.flutter.embedding.engine.FlutterJNI f477l;

    /* renamed from: m */
    public final android.content.res.AssetManager f478m;

    /* renamed from: n */
    public final long f479n;

    /* renamed from: o */
    public final p018D2.C0184j f480o;

    /* renamed from: p */
    public final p009B2.C0061r f481p;

    /* renamed from: q */
    public boolean f482q;

    public C0176b(io.flutter.embedding.engine.FlutterJNI flutterJNI, android.content.res.AssetManager assetManager, long j4) {
        this.f482q = false;
        p009B2.C0061r c0061r = new p009B2.C0061r(5, this);
        this.f477l = flutterJNI;
        this.f478m = assetManager;
        this.f479n = j4;
        p018D2.C0184j c0184j = new p018D2.C0184j(flutterJNI);
        this.f480o = c0184j;
        c0184j.mo271f("flutter/isolate", c0061r, null);
        this.f481p = new p009B2.C0061r(6, c0184j);
        if (flutterJNI.isAttached()) {
            this.f482q = true;
        }
    }

    @Override // p047L2.InterfaceC0376f
    /* renamed from: a */
    public final void mo267a(java.lang.String str, java.nio.ByteBuffer byteBuffer, p047L2.InterfaceC0375e interfaceC0375e) {
        this.f481p.mo267a(str, byteBuffer, interfaceC0375e);
    }

    @Override // p047L2.InterfaceC0376f
    /* renamed from: b */
    public final p025F1.C0215g mo268b(p047L2.C0382l c0382l) {
        return ((p018D2.C0184j) this.f481p.f188m).mo268b(c0382l);
    }

    @Override // p047L2.InterfaceC0376f
    /* renamed from: c */
    public final void mo269c(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
        this.f481p.mo269c(str, byteBuffer);
    }

    /* renamed from: e */
    public final void m538e(p018D2.C0175a c0175a, java.util.List list) {
        if (this.f482q) {
            android.util.Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        p089W2.AbstractC0821a.m1664b("DartExecutor#executeDartEntrypoint");
        try {
            java.util.Objects.toString(c0175a);
            this.f477l.runBundleAndSnapshotFromLibrary(c0175a.f474a, c0175a.f476c, c0175a.f475b, this.f478m, list, this.f479n);
            this.f482q = true;
            android.os.Trace.endSection();
        } catch (java.lang.Throwable th) {
            try {
                android.os.Trace.endSection();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p047L2.InterfaceC0376f
    /* renamed from: f */
    public final void mo271f(java.lang.String str, p047L2.InterfaceC0374d interfaceC0374d, p025F1.C0215g c0215g) {
        this.f481p.mo271f(str, interfaceC0374d, c0215g);
    }

    @Override // p047L2.InterfaceC0376f
    /* renamed from: g */
    public final void mo272g(java.lang.String str, p047L2.InterfaceC0374d interfaceC0374d) {
        this.f481p.mo272g(str, interfaceC0374d);
    }
}
