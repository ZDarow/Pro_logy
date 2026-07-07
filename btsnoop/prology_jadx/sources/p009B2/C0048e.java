package p009B2;

/* renamed from: B2.e */
/* loaded from: classes.dex */
public final class C0048e implements io.flutter.embedding.engine.renderer.InterfaceC1562k {

    /* renamed from: a */
    public final /* synthetic */ int f151a;

    /* renamed from: b */
    public final /* synthetic */ java.lang.Object f152b;

    public /* synthetic */ C0048e(int i4, java.lang.Object obj) {
        this.f151a = i4;
        this.f152b = obj;
    }

    /* renamed from: c */
    private final void m136c() {
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC1562k
    /* renamed from: a */
    public final void mo122a() {
        switch (this.f151a) {
            case 0:
                p009B2.C0050g c0050g = (p009B2.C0050g) this.f152b;
                c0050g.f155a.getClass();
                c0050g.f162h = false;
                return;
            case 1:
                p009B2.C0064u c0064u = (p009B2.C0064u) this.f152b;
                c0064u.f209r = false;
                java.util.Iterator it = c0064u.f208q.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.InterfaceC1562k) it.next()).mo122a();
                }
                return;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return;
            default:
                ((io.flutter.embedding.engine.renderer.C1561j) this.f152b).f6481d = false;
                return;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC1562k
    /* renamed from: b */
    public final void mo123b() {
        switch (this.f151a) {
            case 0:
                p009B2.C0050g c0050g = (p009B2.C0050g) this.f152b;
                p009B2.AbstractActivityC0047d abstractActivityC0047d = c0050g.f155a;
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    abstractActivityC0047d.reportFullyDrawn();
                } else {
                    abstractActivityC0047d.getClass();
                }
                c0050g.f162h = true;
                c0050g.f163i = true;
                return;
            case 1:
                p009B2.C0064u c0064u = (p009B2.C0064u) this.f152b;
                c0064u.f209r = true;
                java.util.Iterator it = c0064u.f208q.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.InterfaceC1562k) it.next()).mo123b();
                }
                return;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                p009B2.SurfaceHolderCallback2C0043N surfaceHolderCallback2C0043N = (p009B2.SurfaceHolderCallback2C0043N) this.f152b;
                surfaceHolderCallback2C0043N.f135a.setAlpha(1.0f);
                io.flutter.embedding.engine.renderer.C1561j c1561j = surfaceHolderCallback2C0043N.f136b;
                if (c1561j != null) {
                    c1561j.f6478a.removeIsDisplayingFlutterUiListener(this);
                    return;
                }
                return;
            default:
                ((io.flutter.embedding.engine.renderer.C1561j) this.f152b).f6481d = true;
                return;
        }
    }
}
