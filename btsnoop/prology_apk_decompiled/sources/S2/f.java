package S2;

import B2.AbstractActivityC0003d;
import android.content.Context;
import android.support.v4.media.session.t;
import android.util.Log;

/* loaded from: classes.dex */
public final class f implements H2.b, I2.a {

    /* renamed from: l, reason: collision with root package name */
    public t f2061l;

    @Override // H2.b
    public final void b(H2.a aVar) {
        if (this.f2061l == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
        } else {
            t.C0((L2.f) aVar.f709m, null);
            this.f2061l = null;
        }
    }

    @Override // H2.b
    public final void d(H2.a aVar) {
        t tVar = new t((Context) aVar.f708l);
        this.f2061l = tVar;
        t.C0((L2.f) aVar.f709m, tVar);
    }

    @Override // I2.a
    public final void e() {
        t tVar = this.f2061l;
        if (tVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            tVar.f3736o = null;
        }
    }

    @Override // I2.a
    public final void f(C2.d dVar) {
        h(dVar);
    }

    @Override // I2.a
    public final void g() {
        e();
    }

    @Override // I2.a
    public final void h(C2.d dVar) {
        t tVar = this.f2061l;
        if (tVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            tVar.f3736o = (AbstractActivityC0003d) dVar.f367a;
        }
    }
}
