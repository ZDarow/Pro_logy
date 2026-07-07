package p009B2;

/* renamed from: B2.M */
/* loaded from: classes.dex */
public final class C0042M implements io.flutter.embedding.engine.renderer.InterfaceC1562k {

    /* renamed from: a */
    public final /* synthetic */ java.lang.Runnable f133a;

    /* renamed from: b */
    public final /* synthetic */ p009B2.SurfaceHolderCallback2C0043N f134b;

    public C0042M(p009B2.SurfaceHolderCallback2C0043N surfaceHolderCallback2C0043N, java.lang.Runnable runnable) {
        this.f134b = surfaceHolderCallback2C0043N;
        this.f133a = runnable;
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC1562k
    /* renamed from: a */
    public final void mo122a() {
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC1562k
    /* renamed from: b */
    public final void mo123b() {
        this.f133a.run();
        io.flutter.embedding.engine.renderer.C1561j c1561j = this.f134b.f136b;
        if (c1561j != null) {
            c1561j.f6478a.removeIsDisplayingFlutterUiListener(this);
        }
    }
}
