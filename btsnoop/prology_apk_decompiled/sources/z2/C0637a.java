package z2;

import B2.AbstractActivityC0003d;
import H2.b;
import L2.f;
import c0.C0218q;
import defpackage.d;
import defpackage.e;
import k3.h;
import w0.C0591a;

/* renamed from: z2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0637a implements b, e, I2.a {

    /* renamed from: l, reason: collision with root package name */
    public C0591a f9234l;

    public final void a(defpackage.b bVar) {
        C0591a c0591a = this.f9234l;
        h.b(c0591a);
        AbstractActivityC0003d abstractActivityC0003d = (AbstractActivityC0003d) c0591a.f8747l;
        if (abstractActivityC0003d == null) {
            throw new C0218q();
        }
        h.b(abstractActivityC0003d);
        boolean z4 = (abstractActivityC0003d.getWindow().getAttributes().flags & 128) != 0;
        Boolean bool = bVar.f4322a;
        h.b(bool);
        if (bool.booleanValue()) {
            if (z4) {
                return;
            }
            abstractActivityC0003d.getWindow().addFlags(128);
        } else if (z4) {
            abstractActivityC0003d.getWindow().clearFlags(128);
        }
    }

    @Override // H2.b
    public final void b(H2.a aVar) {
        h.e(aVar, "binding");
        f fVar = (f) aVar.f709m;
        h.d(fVar, "getBinaryMessenger(...)");
        d.a(e.f4997d, fVar, null);
        this.f9234l = null;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, w0.a] */
    @Override // H2.b
    public final void d(H2.a aVar) {
        h.e(aVar, "flutterPluginBinding");
        f fVar = (f) aVar.f709m;
        h.d(fVar, "getBinaryMessenger(...)");
        d.a(e.f4997d, fVar, this);
        this.f9234l = new Object();
    }

    @Override // I2.a
    public final void e() {
        C0591a c0591a = this.f9234l;
        if (c0591a != null) {
            c0591a.f8747l = null;
        }
    }

    @Override // I2.a
    public final void f(C2.d dVar) {
        h.e(dVar, "binding");
        h(dVar);
    }

    @Override // I2.a
    public final void g() {
        e();
    }

    @Override // I2.a
    public final void h(C2.d dVar) {
        h.e(dVar, "binding");
        C0591a c0591a = this.f9234l;
        if (c0591a != null) {
            c0591a.f8747l = (AbstractActivityC0003d) dVar.f367a;
        }
    }
}
