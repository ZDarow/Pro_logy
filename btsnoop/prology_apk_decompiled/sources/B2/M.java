package B2;

/* loaded from: classes.dex */
public final class M implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f130a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f131b;

    public M(N n4, Runnable runnable) {
        this.f131b = n4;
        this.f130a = runnable;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a() {
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        this.f130a.run();
        io.flutter.embedding.engine.renderer.j jVar = this.f131b.f133b;
        if (jVar != null) {
            jVar.f6245a.removeIsDisplayingFlutterUiListener(this);
        }
    }
}
