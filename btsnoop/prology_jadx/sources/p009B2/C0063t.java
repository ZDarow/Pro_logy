package p009B2;

/* renamed from: B2.t */
/* loaded from: classes.dex */
public final class C0063t implements io.flutter.embedding.engine.renderer.InterfaceC1562k {

    /* renamed from: a */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.C1561j f191a;

    /* renamed from: b */
    public final /* synthetic */ p026F2.RunnableC0226c f192b;

    /* renamed from: c */
    public final /* synthetic */ p009B2.C0064u f193c;

    public C0063t(p009B2.C0064u c0064u, io.flutter.embedding.engine.renderer.C1561j c1561j, p026F2.RunnableC0226c runnableC0226c) {
        this.f193c = c0064u;
        this.f191a = c1561j;
        this.f192b = runnableC0226c;
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC1562k
    /* renamed from: a */
    public final void mo122a() {
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC1562k
    /* renamed from: b */
    public final void mo123b() {
        p009B2.C0053j c0053j;
        this.f191a.f6478a.removeIsDisplayingFlutterUiListener(this);
        this.f192b.run();
        p009B2.C0064u c0064u = this.f193c;
        if ((c0064u.f206o instanceof p009B2.C0053j) || (c0053j = c0064u.f205n) == null) {
            return;
        }
        c0053j.mo195c();
        p009B2.C0053j c0053j2 = c0064u.f205n;
        if (c0053j2 != null) {
            c0053j2.f167l.close();
            c0064u.removeView(c0064u.f205n);
            c0064u.f205n = null;
        }
    }
}
