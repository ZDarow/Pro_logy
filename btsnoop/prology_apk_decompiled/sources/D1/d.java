package D1;

import B2.AbstractActivityC0003d;
import F1.h;
import F1.k;
import I.C0044m;
import android.content.Context;
import android.content.Intent;
import android.support.v4.media.session.t;
import android.util.Log;
import com.baseflow.geolocator.GeolocatorLocationService;
import java.util.HashSet;

/* loaded from: classes.dex */
public class d implements H2.b, I2.a {

    /* renamed from: l, reason: collision with root package name */
    public final G1.a f443l;

    /* renamed from: m, reason: collision with root package name */
    public final F1.f f444m;

    /* renamed from: n, reason: collision with root package name */
    public final F1.g f445n;

    /* renamed from: o, reason: collision with root package name */
    public GeolocatorLocationService f446o;

    /* renamed from: p, reason: collision with root package name */
    public g f447p;

    /* renamed from: q, reason: collision with root package name */
    public g f448q;

    /* renamed from: r, reason: collision with root package name */
    public final c f449r = new c(this);
    public t s;

    /* renamed from: t, reason: collision with root package name */
    public C2.d f450t;

    /* JADX WARN: Type inference failed for: r1v7, types: [F1.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, G1.a] */
    public d() {
        G1.a aVar;
        F1.f fVar;
        F1.g gVar;
        synchronized (G1.a.class) {
            try {
                if (G1.a.f681o == null) {
                    G1.a.f681o = new Object();
                }
                aVar = G1.a.f681o;
            } finally {
            }
        }
        this.f443l = aVar;
        synchronized (F1.f.class) {
            try {
                if (F1.f.f597m == null) {
                    F1.f.f597m = new F1.f();
                }
                fVar = F1.f.f597m;
            } finally {
            }
        }
        this.f444m = fVar;
        synchronized (F1.g.class) {
            try {
                if (F1.g.f599l == null) {
                    F1.g.f599l = new Object();
                }
                gVar = F1.g.f599l;
            } finally {
            }
        }
        this.f445n = gVar;
    }

    @Override // H2.b
    public final void b(H2.a aVar) {
        Context context = (Context) aVar.f708l;
        GeolocatorLocationService geolocatorLocationService = this.f446o;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.f4715n--;
            Log.d("FlutterGeolocator", "Flutter engine disconnected. Connected engine count " + geolocatorLocationService.f4715n);
        }
        context.unbindService(this.f449r);
        g gVar = this.f447p;
        if (gVar != null) {
            C0044m c0044m = (C0044m) gVar.f464r;
            if (c0044m == null) {
                Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
            } else {
                c0044m.s(null);
                gVar.f464r = null;
            }
            this.f447p.f460n = null;
            this.f447p = null;
        }
        g gVar2 = this.f448q;
        if (gVar2 != null) {
            gVar2.b();
            this.f448q.f463q = null;
            this.f448q = null;
        }
        t tVar = this.s;
        if (tVar != null) {
            tVar.f3735n = null;
            if (((t) tVar.f3734m) != null) {
                ((t) tVar.f3734m).B0(null);
                tVar.f3734m = null;
            }
            this.s = null;
        }
        GeolocatorLocationService geolocatorLocationService2 = this.f446o;
        if (geolocatorLocationService2 != null) {
            geolocatorLocationService2.f4717p = null;
        }
    }

    @Override // H2.b
    public final void d(H2.a aVar) {
        k kVar;
        G1.a aVar2 = this.f443l;
        F1.f fVar = this.f444m;
        g gVar = new g(aVar2, fVar, this.f445n);
        this.f447p = gVar;
        Context context = (Context) aVar.f708l;
        if (((C0044m) gVar.f464r) != null) {
            Log.w("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            C0044m c0044m = (C0044m) gVar.f464r;
            if (c0044m == null) {
                Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
            } else {
                c0044m.s(null);
                gVar.f464r = null;
            }
        }
        L2.f fVar2 = (L2.f) aVar.f709m;
        C0044m c0044m2 = new C0044m(fVar2, "flutter.baseflow.com/geolocator_android");
        gVar.f464r = c0044m2;
        c0044m2.s(gVar);
        gVar.f459m = context;
        g gVar2 = new g(aVar2, fVar);
        this.f448q = gVar2;
        if (((t) gVar2.f462p) != null) {
            Log.w("FlutterGeolocator", "Setting a event call handler before the last was disposed.");
            gVar2.b();
        }
        t tVar = new t(fVar2, "flutter.baseflow.com/geolocator_updates_android");
        gVar2.f462p = tVar;
        tVar.B0(gVar2);
        Context context2 = (Context) aVar.f708l;
        gVar2.f459m = context2;
        t tVar2 = new t(3, false);
        this.s = tVar2;
        tVar2.f3735n = context2;
        if (((t) tVar2.f3734m) != null) {
            Log.w("LocationServiceHandler", "Setting a event call handler before the last was disposed.");
            if (((t) tVar2.f3734m) != null) {
                Context context3 = (Context) tVar2.f3735n;
                if (context3 != null && (kVar = (k) tVar2.f3736o) != null) {
                    context3.unregisterReceiver(kVar);
                }
                ((t) tVar2.f3734m).B0(null);
                tVar2.f3734m = null;
            }
        }
        t tVar3 = new t(fVar2, "flutter.baseflow.com/geolocator_service_updates_android");
        tVar2.f3734m = tVar3;
        tVar3.B0(tVar2);
        tVar2.f3735n = context2;
        context2.bindService(new Intent(context2, (Class<?>) GeolocatorLocationService.class), this.f449r, 1);
    }

    @Override // I2.a
    public final void e() {
        C2.d dVar = this.f450t;
        if (dVar != null) {
            ((HashSet) dVar.f369c).remove(this.f444m);
            ((HashSet) this.f450t.f368b).remove(this.f443l);
        }
        g gVar = this.f447p;
        if (gVar != null) {
            gVar.f460n = null;
        }
        g gVar2 = this.f448q;
        if (gVar2 != null) {
            if (((h) gVar2.f464r) != null && ((t) gVar2.f462p) != null) {
                gVar2.b();
            }
            gVar2.f460n = null;
        }
        GeolocatorLocationService geolocatorLocationService = this.f446o;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.f4717p = null;
        }
        if (this.f450t != null) {
            this.f450t = null;
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
        this.f450t = dVar;
        if (dVar != null) {
            dVar.a(this.f444m);
            ((HashSet) this.f450t.f368b).add(this.f443l);
        }
        g gVar = this.f447p;
        if (gVar != null) {
            gVar.f460n = (AbstractActivityC0003d) dVar.f367a;
        }
        g gVar2 = this.f448q;
        if (gVar2 != null) {
            AbstractActivityC0003d abstractActivityC0003d = (AbstractActivityC0003d) dVar.f367a;
            if (abstractActivityC0003d == null && ((h) gVar2.f464r) != null && ((t) gVar2.f462p) != null) {
                gVar2.b();
            }
            gVar2.f460n = abstractActivityC0003d;
        }
        GeolocatorLocationService geolocatorLocationService = this.f446o;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.f4717p = (AbstractActivityC0003d) this.f450t.f367a;
        }
    }
}
