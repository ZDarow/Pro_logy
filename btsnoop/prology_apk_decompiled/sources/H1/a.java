package H1;

import B2.AbstractActivityC0003d;
import C2.d;
import I.C0044m;
import L1.g;
import L2.f;
import android.content.Context;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class a implements H2.b, I2.a {

    /* renamed from: l, reason: collision with root package name */
    public b f700l;

    /* renamed from: m, reason: collision with root package name */
    public C0044m f701m;

    /* renamed from: n, reason: collision with root package name */
    public d f702n;

    @Override // H2.b
    public final void b(H2.a aVar) {
        this.f701m.s(null);
        this.f701m = null;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [F1.g, java.lang.Object] */
    @Override // H2.b
    public final void d(H2.a aVar) {
        Context context = (Context) aVar.f708l;
        this.f700l = new b(context);
        C0044m c0044m = new C0044m((f) aVar.f709m, "flutter.baseflow.com/permissions/methods");
        this.f701m = c0044m;
        c0044m.s(new B1.d(context, new g(4, false), this.f700l, new Object()));
    }

    @Override // I2.a
    public final void e() {
        b bVar = this.f700l;
        if (bVar != null) {
            bVar.f705n = null;
        }
        d dVar = this.f702n;
        if (dVar != null) {
            ((HashSet) dVar.f369c).remove(bVar);
            d dVar2 = this.f702n;
            ((HashSet) dVar2.f368b).remove(this.f700l);
        }
        this.f702n = null;
    }

    @Override // I2.a
    public final void f(d dVar) {
        h(dVar);
    }

    @Override // I2.a
    public final void g() {
        e();
    }

    @Override // I2.a
    public final void h(d dVar) {
        AbstractActivityC0003d abstractActivityC0003d = (AbstractActivityC0003d) dVar.f367a;
        b bVar = this.f700l;
        if (bVar != null) {
            bVar.f705n = abstractActivityC0003d;
        }
        this.f702n = dVar;
        dVar.a(bVar);
        d dVar2 = this.f702n;
        ((HashSet) dVar2.f368b).add(this.f700l);
    }
}
