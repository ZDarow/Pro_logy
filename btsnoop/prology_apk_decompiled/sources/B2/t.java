package B2;

/* loaded from: classes.dex */
public final class t implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.j f188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F2.c f189b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f190c;

    public t(u uVar, io.flutter.embedding.engine.renderer.j jVar, F2.c cVar) {
        this.f190c = uVar;
        this.f188a = jVar;
        this.f189b = cVar;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a() {
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        C0009j c0009j;
        this.f188a.f6245a.removeIsDisplayingFlutterUiListener(this);
        this.f189b.run();
        u uVar = this.f190c;
        if ((uVar.f203o instanceof C0009j) || (c0009j = uVar.f202n) == null) {
            return;
        }
        c0009j.c();
        C0009j c0009j2 = uVar.f202n;
        if (c0009j2 != null) {
            c0009j2.f164l.close();
            uVar.removeView(uVar.f202n);
            uVar.f202n = null;
        }
    }
}
