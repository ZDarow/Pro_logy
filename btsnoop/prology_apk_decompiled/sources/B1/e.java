package B1;

import I.C0044m;
import L2.v;
import android.content.Context;
import android.util.Log;

/* loaded from: classes.dex */
public final class e implements H2.b {

    /* renamed from: l, reason: collision with root package name */
    public d f98l;

    @Override // H2.b
    public final void b(H2.a aVar) {
        d dVar = this.f98l;
        if (dVar == null) {
            Log.wtf("GeocodingPlugin", "Already detached from the engine.");
            return;
        }
        C0044m c0044m = (C0044m) dVar.f97n;
        if (c0044m == null) {
            Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
        } else {
            c0044m.s(null);
            dVar.f97n = null;
        }
        this.f98l = null;
    }

    @Override // H2.b
    public final void d(H2.a aVar) {
        d dVar = new d(1, new d(0, (Context) aVar.f708l));
        this.f98l = dVar;
        if (((C0044m) dVar.f97n) != null) {
            Log.wtf("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            C0044m c0044m = (C0044m) dVar.f97n;
            if (c0044m == null) {
                Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
            } else {
                c0044m.s(null);
                dVar.f97n = null;
            }
        }
        L2.f fVar = (L2.f) aVar.f709m;
        C0044m c0044m2 = new C0044m(fVar, "flutter.baseflow.com/geocoding", v.f1099a, fVar.d());
        dVar.f97n = c0044m2;
        c0044m2.s(dVar);
    }
}
