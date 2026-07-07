package p008B1;

/* renamed from: B1.e */
/* loaded from: classes.dex */
public final class C0027e implements p034H2.InterfaceC0248b {

    /* renamed from: l */
    public p008B1.C0026d f101l;

    @Override // p034H2.InterfaceC0248b
    /* renamed from: b */
    public final void mo44b(p034H2.C0247a c0247a) {
        p008B1.C0026d c0026d = this.f101l;
        if (c0026d == null) {
            android.util.Log.wtf("GeocodingPlugin", "Already detached from the engine.");
            return;
        }
        p035I.C0291m c0291m = (p035I.C0291m) c0026d.f100n;
        if (c0291m == null) {
            android.util.Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
        } else {
            c0291m.m702s(null);
            c0026d.f100n = null;
        }
        this.f101l = null;
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: d */
    public final void mo46d(p034H2.C0247a c0247a) {
        p008B1.C0026d c0026d = new p008B1.C0026d(1, new p008B1.C0026d(0, (android.content.Context) c0247a.f719l));
        this.f101l = c0026d;
        if (((p035I.C0291m) c0026d.f100n) != null) {
            android.util.Log.wtf("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            p035I.C0291m c0291m = (p035I.C0291m) c0026d.f100n;
            if (c0291m == null) {
                android.util.Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
            } else {
                c0291m.m702s(null);
                c0026d.f100n = null;
            }
        }
        p047L2.InterfaceC0376f interfaceC0376f = (p047L2.InterfaceC0376f) c0247a.f720m;
        p035I.C0291m c0291m2 = new p035I.C0291m(interfaceC0376f, "flutter.baseflow.com/geocoding", p047L2.C0392v.f1138a, interfaceC0376f.m827d());
        c0026d.f100n = c0291m2;
        c0291m2.m702s(c0026d);
    }
}
