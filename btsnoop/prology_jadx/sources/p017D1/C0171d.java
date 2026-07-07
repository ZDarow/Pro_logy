package p017D1;

/* renamed from: D1.d */
/* loaded from: classes.dex */
public class C0171d implements p034H2.InterfaceC0248b, p038I2.InterfaceC0309a {

    /* renamed from: l */
    public final p029G1.C0238a f451l;

    /* renamed from: m */
    public final p025F1.C0214f f452m;

    /* renamed from: n */
    public final p025F1.C0215g f453n;

    /* renamed from: o */
    public com.baseflow.geolocator.GeolocatorLocationService f454o;

    /* renamed from: p */
    public p017D1.C0174g f455p;

    /* renamed from: q */
    public p017D1.C0174g f456q;

    /* renamed from: r */
    public final p017D1.ServiceConnectionC0170c f457r = new p017D1.ServiceConnectionC0170c(this);

    /* renamed from: s */
    public android.support.v4.media.session.C1061t f458s;

    /* renamed from: t */
    public p013C2.C0139d f459t;

    /* JADX WARN: Type inference failed for: r1v7, types: [F1.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, G1.a] */
    public C0171d() {
        p029G1.C0238a c0238a;
        p025F1.C0214f c0214f;
        p025F1.C0215g c0215g;
        synchronized (p029G1.C0238a.class) {
            try {
                if (p029G1.C0238a.f691o == null) {
                    p029G1.C0238a.f691o = new java.lang.Object();
                }
                c0238a = p029G1.C0238a.f691o;
            } finally {
            }
        }
        this.f451l = c0238a;
        synchronized (p025F1.C0214f.class) {
            try {
                if (p025F1.C0214f.f607m == null) {
                    p025F1.C0214f.f607m = new p025F1.C0214f();
                }
                c0214f = p025F1.C0214f.f607m;
            } finally {
            }
        }
        this.f452m = c0214f;
        synchronized (p025F1.C0215g.class) {
            try {
                if (p025F1.C0215g.f609l == null) {
                    p025F1.C0215g.f609l = new java.lang.Object();
                }
                c0215g = p025F1.C0215g.f609l;
            } finally {
            }
        }
        this.f453n = c0215g;
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: b */
    public final void mo44b(p034H2.C0247a c0247a) {
        android.content.Context context = (android.content.Context) c0247a.f719l;
        com.baseflow.geolocator.GeolocatorLocationService geolocatorLocationService = this.f454o;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.f4885n--;
            android.util.Log.d("FlutterGeolocator", "Flutter engine disconnected. Connected engine count " + geolocatorLocationService.f4885n);
        }
        context.unbindService(this.f457r);
        p017D1.C0174g c0174g = this.f455p;
        if (c0174g != null) {
            p035I.C0291m c0291m = (p035I.C0291m) c0174g.f473r;
            if (c0291m == null) {
                android.util.Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
            } else {
                c0291m.m702s(null);
                c0174g.f473r = null;
            }
            this.f455p.f469n = null;
            this.f455p = null;
        }
        p017D1.C0174g c0174g2 = this.f456q;
        if (c0174g2 != null) {
            c0174g2.m537b();
            this.f456q.f472q = null;
            this.f456q = null;
        }
        android.support.v4.media.session.C1061t c1061t = this.f458s;
        if (c1061t != null) {
            c1061t.f3862n = null;
            if (((android.support.v4.media.session.C1061t) c1061t.f3861m) != null) {
                ((android.support.v4.media.session.C1061t) c1061t.f3861m).m2206B0(null);
                c1061t.f3861m = null;
            }
            this.f458s = null;
        }
        com.baseflow.geolocator.GeolocatorLocationService geolocatorLocationService2 = this.f454o;
        if (geolocatorLocationService2 != null) {
            geolocatorLocationService2.f4887p = null;
        }
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: d */
    public final void mo46d(p034H2.C0247a c0247a) {
        p025F1.C0219k c0219k;
        p029G1.C0238a c0238a = this.f451l;
        p025F1.C0214f c0214f = this.f452m;
        p017D1.C0174g c0174g = new p017D1.C0174g(c0238a, c0214f, this.f453n);
        this.f455p = c0174g;
        android.content.Context context = (android.content.Context) c0247a.f719l;
        if (((p035I.C0291m) c0174g.f473r) != null) {
            android.util.Log.w("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            p035I.C0291m c0291m = (p035I.C0291m) c0174g.f473r;
            if (c0291m == null) {
                android.util.Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
            } else {
                c0291m.m702s(null);
                c0174g.f473r = null;
            }
        }
        p047L2.InterfaceC0376f interfaceC0376f = (p047L2.InterfaceC0376f) c0247a.f720m;
        p035I.C0291m c0291m2 = new p035I.C0291m(interfaceC0376f, "flutter.baseflow.com/geolocator_android");
        c0174g.f473r = c0291m2;
        c0291m2.m702s(c0174g);
        c0174g.f468m = context;
        p017D1.C0174g c0174g2 = new p017D1.C0174g(c0238a, c0214f);
        this.f456q = c0174g2;
        if (((android.support.v4.media.session.C1061t) c0174g2.f471p) != null) {
            android.util.Log.w("FlutterGeolocator", "Setting a event call handler before the last was disposed.");
            c0174g2.m537b();
        }
        android.support.v4.media.session.C1061t c1061t = new android.support.v4.media.session.C1061t(interfaceC0376f, "flutter.baseflow.com/geolocator_updates_android");
        c0174g2.f471p = c1061t;
        c1061t.m2206B0(c0174g2);
        android.content.Context context2 = (android.content.Context) c0247a.f719l;
        c0174g2.f468m = context2;
        android.support.v4.media.session.C1061t c1061t2 = new android.support.v4.media.session.C1061t(3, false);
        this.f458s = c1061t2;
        c1061t2.f3862n = context2;
        if (((android.support.v4.media.session.C1061t) c1061t2.f3861m) != null) {
            android.util.Log.w("LocationServiceHandler", "Setting a event call handler before the last was disposed.");
            if (((android.support.v4.media.session.C1061t) c1061t2.f3861m) != null) {
                android.content.Context context3 = (android.content.Context) c1061t2.f3862n;
                if (context3 != null && (c0219k = (p025F1.C0219k) c1061t2.f3863o) != null) {
                    context3.unregisterReceiver(c0219k);
                }
                ((android.support.v4.media.session.C1061t) c1061t2.f3861m).m2206B0(null);
                c1061t2.f3861m = null;
            }
        }
        android.support.v4.media.session.C1061t c1061t3 = new android.support.v4.media.session.C1061t(interfaceC0376f, "flutter.baseflow.com/geolocator_service_updates_android");
        c1061t2.f3861m = c1061t3;
        c1061t3.m2206B0(c1061t2);
        c1061t2.f3862n = context2;
        context2.bindService(new android.content.Intent(context2, (java.lang.Class<?>) com.baseflow.geolocator.GeolocatorLocationService.class), this.f457r, 1);
    }

    @Override // p038I2.InterfaceC0309a
    /* renamed from: e */
    public final void mo531e() {
        p013C2.C0139d c0139d = this.f459t;
        if (c0139d != null) {
            ((java.util.HashSet) c0139d.f377c).remove(this.f452m);
            ((java.util.HashSet) this.f459t.f376b).remove(this.f451l);
        }
        p017D1.C0174g c0174g = this.f455p;
        if (c0174g != null) {
            c0174g.f469n = null;
        }
        p017D1.C0174g c0174g2 = this.f456q;
        if (c0174g2 != null) {
            if (((p025F1.InterfaceC0216h) c0174g2.f473r) != null && ((android.support.v4.media.session.C1061t) c0174g2.f471p) != null) {
                c0174g2.m537b();
            }
            c0174g2.f469n = null;
        }
        com.baseflow.geolocator.GeolocatorLocationService geolocatorLocationService = this.f454o;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.f4887p = null;
        }
        if (this.f459t != null) {
            this.f459t = null;
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
        this.f459t = c0139d;
        if (c0139d != null) {
            c0139d.m480a(this.f452m);
            ((java.util.HashSet) this.f459t.f376b).add(this.f451l);
        }
        p017D1.C0174g c0174g = this.f455p;
        if (c0174g != null) {
            c0174g.f469n = (p009B2.AbstractActivityC0047d) c0139d.f375a;
        }
        p017D1.C0174g c0174g2 = this.f456q;
        if (c0174g2 != null) {
            p009B2.AbstractActivityC0047d abstractActivityC0047d = (p009B2.AbstractActivityC0047d) c0139d.f375a;
            if (abstractActivityC0047d == null && ((p025F1.InterfaceC0216h) c0174g2.f473r) != null && ((android.support.v4.media.session.C1061t) c0174g2.f471p) != null) {
                c0174g2.m537b();
            }
            c0174g2.f469n = abstractActivityC0047d;
        }
        com.baseflow.geolocator.GeolocatorLocationService geolocatorLocationService = this.f454o;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.f4887p = (p009B2.AbstractActivityC0047d) this.f459t.f375a;
        }
    }
}
