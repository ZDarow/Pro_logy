package p075S2;

/* renamed from: S2.f */
/* loaded from: classes.dex */
public final class C0653f implements p034H2.InterfaceC0248b, p038I2.InterfaceC0309a {

    /* renamed from: l */
    public android.support.v4.media.session.C1061t f2137l;

    @Override // p034H2.InterfaceC0248b
    /* renamed from: b */
    public final void mo44b(p034H2.C0247a c0247a) {
        if (this.f2137l == null) {
            android.util.Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
        } else {
            android.support.v4.media.session.C1061t.m2197C0((p047L2.InterfaceC0376f) c0247a.f720m, null);
            this.f2137l = null;
        }
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: d */
    public final void mo46d(p034H2.C0247a c0247a) {
        android.support.v4.media.session.C1061t c1061t = new android.support.v4.media.session.C1061t((android.content.Context) c0247a.f719l);
        this.f2137l = c1061t;
        android.support.v4.media.session.C1061t.m2197C0((p047L2.InterfaceC0376f) c0247a.f720m, c1061t);
    }

    @Override // p038I2.InterfaceC0309a
    /* renamed from: e */
    public final void mo531e() {
        android.support.v4.media.session.C1061t c1061t = this.f2137l;
        if (c1061t == null) {
            android.util.Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            c1061t.f3863o = null;
        }
    }

    @Override // p038I2.InterfaceC0309a
    /* renamed from: f */
    public final void mo532f(p013C2.C0139d c0139d) {
        mo534h(c0139d);
    }

    @Override // p038I2.InterfaceC0309a
    /* renamed from: g */
    public final void mo533g() {
        mo531e();
    }

    @Override // p038I2.InterfaceC0309a
    /* renamed from: h */
    public final void mo534h(p013C2.C0139d c0139d) {
        android.support.v4.media.session.C1061t c1061t = this.f2137l;
        if (c1061t == null) {
            android.util.Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            c1061t.f3863o = (p009B2.AbstractActivityC0047d) c0139d.f375a;
        }
    }
}
