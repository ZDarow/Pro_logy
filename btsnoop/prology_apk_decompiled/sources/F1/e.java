package F1;

import B2.AbstractActivityC0003d;
import B2.E;
import B2.r;
import B2.x;
import N1.B;
import N1.C0060d;
import N1.y;
import O1.s;
import W.p;
import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentSender;
import android.location.LocationManager;
import android.os.Build;
import android.os.Looper;
import android.os.WorkSource;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import d2.AbstractC0242e;
import d2.C0241d;
import d2.C0244g;
import d2.C0246i;
import d2.InterfaceC0238a;
import d2.InterfaceC0239b;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f589a;

    /* renamed from: b, reason: collision with root package name */
    public final d f590b;

    /* renamed from: c, reason: collision with root package name */
    public final Y1.b f591c;

    /* renamed from: d, reason: collision with root package name */
    public final n f592d;

    /* renamed from: e, reason: collision with root package name */
    public final int f593e;

    /* renamed from: f, reason: collision with root package name */
    public final j f594f;

    /* renamed from: g, reason: collision with root package name */
    public E1.a f595g;

    /* renamed from: h, reason: collision with root package name */
    public o f596h;

    /* JADX WARN: Type inference failed for: r0v1, types: [Y1.b, M1.f] */
    public e(Context context, j jVar) {
        int nextInt;
        this.f589a = context;
        int i4 = a2.b.f3602a;
        this.f591c = new M1.f(context, Y1.b.f3081i, M1.b.f1158a, M1.e.f1160b);
        this.f594f = jVar;
        this.f592d = new n(context, jVar);
        synchronized (this) {
            nextInt = new SecureRandom().nextInt(65536);
        }
        this.f593e = nextInt;
        this.f590b = new d(this, jVar, context);
    }

    public static LocationRequest g(j jVar) {
        float f4;
        long j4;
        long j5;
        long j6;
        int i4 = 104;
        if (Build.VERSION.SDK_INT >= 33) {
            s.a("intervalMillis must be greater than or equal to 0", 0 >= 0);
            if (jVar != null) {
                int b4 = L.j.b(jVar.f610a);
                if (b4 == 0) {
                    i4 = 105;
                } else if (b4 != 1) {
                    i4 = b4 != 2 ? 100 : 102;
                }
                a2.j.a(i4);
                j5 = jVar.f612c;
                s.a("intervalMillis must be greater than or equal to 0", j5 >= 0);
                s.a("minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL", j5 == -1 || j5 >= 0);
                float f5 = (float) jVar.f611b;
                s.a("minUpdateDistanceMeters must be greater than or equal to 0", f5 >= 0.0f);
                f4 = f5;
                j4 = j5;
            } else {
                f4 = 0.0f;
                i4 = 102;
                j4 = 0;
                j5 = -1;
            }
            if (j5 == -1) {
                j6 = j4;
            } else {
                if (i4 != 105) {
                    j5 = Math.min(j5, j4);
                }
                j6 = j5;
            }
            return new LocationRequest(i4, j4, j6, Math.max(0L, j4), Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, f4, true, -1 == -1 ? j4 : -1L, 0, 0, false, new WorkSource(null), null);
        }
        LocationRequest locationRequest = new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
        if (jVar != null) {
            int b5 = L.j.b(jVar.f610a);
            if (b5 == 0) {
                i4 = 105;
            } else if (b5 != 1) {
                i4 = b5 != 2 ? 100 : 102;
            }
            a2.j.a(i4);
            locationRequest.f4768l = i4;
            long j7 = jVar.f612c;
            s.a("intervalMillis must be greater than or equal to 0", j7 >= 0);
            long j8 = locationRequest.f4770n;
            long j9 = locationRequest.f4769m;
            if (j8 == j9 / 6) {
                locationRequest.f4770n = j7 / 6;
            }
            if (locationRequest.f4775t == j9) {
                locationRequest.f4775t = j7;
            }
            locationRequest.f4769m = j7;
            long j10 = j7 / 2;
            Object[] objArr = {Long.valueOf(j10)};
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(String.format("illegal fastest interval: %d", objArr));
            }
            locationRequest.f4770n = j10;
            float f6 = (float) jVar.f611b;
            if (f6 < 0.0f) {
                StringBuilder sb = new StringBuilder(String.valueOf(f6).length() + 22);
                sb.append("invalid displacement: ");
                sb.append(f6);
                throw new IllegalArgumentException(sb.toString());
            }
            locationRequest.f4774r = f6;
        }
        return locationRequest;
    }

    @Override // F1.h
    public final void a(D1.f fVar, D1.f fVar2) {
        Y1.b bVar = this.f591c;
        bVar.getClass();
        E e4 = new E();
        e4.f118b = true;
        e4.f120d = L1.g.f1071n;
        e4.f119c = 2414;
        C0246i c4 = bVar.c(0, e4.a());
        x xVar = new x(4, fVar);
        c4.getClass();
        N1.l lVar = AbstractC0242e.f4975a;
        C0244g c0244g = new C0244g(lVar, xVar);
        Y1.a aVar = c4.f4982b;
        aVar.e(c0244g);
        c4.f();
        aVar.e(new C0244g(lVar, (InterfaceC0239b) new x(5, fVar2)));
        c4.f();
    }

    @Override // F1.h
    public final void b(final AbstractActivityC0003d abstractActivityC0003d, o oVar, final E1.a aVar) {
        this.f596h = oVar;
        this.f595g = aVar;
        LocationRequest g4 = g(this.f594f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(g4);
        a2.c cVar = new a2.c(arrayList, false, false);
        int i4 = a2.b.f3602a;
        M1.f fVar = new M1.f(this.f589a, Y1.b.f3081i, M1.b.f1158a, M1.e.f1160b);
        E e4 = new E();
        e4.f118b = true;
        e4.f120d = new K2.o(17, cVar);
        e4.f119c = 2426;
        C0246i c4 = fVar.c(0, e4.a());
        x xVar = new x(3, this);
        c4.getClass();
        N1.l lVar = AbstractC0242e.f4975a;
        C0244g c0244g = new C0244g(lVar, xVar);
        Y1.a aVar2 = c4.f4982b;
        aVar2.e(c0244g);
        c4.f();
        aVar2.e(new C0244g(lVar, new InterfaceC0239b() { // from class: F1.c
            @Override // d2.InterfaceC0239b
            public final void g(Exception exc) {
                e eVar = e.this;
                eVar.getClass();
                boolean z4 = exc instanceof M1.j;
                E1.a aVar3 = aVar;
                if (!z4) {
                    if (((M1.d) exc).f1159l.f4737l == 8502) {
                        eVar.h(eVar.f594f);
                        return;
                    } else {
                        aVar3.c(3);
                        return;
                    }
                }
                AbstractActivityC0003d abstractActivityC0003d2 = abstractActivityC0003d;
                if (abstractActivityC0003d2 == null) {
                    aVar3.c(3);
                    return;
                }
                Status status = ((M1.j) exc).f1159l;
                if (status.f4737l != 6) {
                    aVar3.c(3);
                    return;
                }
                try {
                    int i5 = eVar.f593e;
                    PendingIntent pendingIntent = status.f4739n;
                    if (pendingIntent != null) {
                        s.d(pendingIntent);
                        abstractActivityC0003d2.startIntentSenderForResult(pendingIntent.getIntentSender(), i5, null, 0, 0, 0);
                    }
                } catch (IntentSender.SendIntentException unused) {
                    aVar3.c(3);
                }
            }
        }));
        c4.f();
    }

    @Override // F1.h
    public final boolean c(int i4, int i5) {
        if (i4 == this.f593e) {
            if (i5 == -1) {
                j jVar = this.f594f;
                if (jVar == null || this.f596h == null || this.f595g == null) {
                    return false;
                }
                h(jVar);
                return true;
            }
            E1.a aVar = this.f595g;
            if (aVar != null) {
                aVar.c(3);
            }
        }
        return false;
    }

    @Override // F1.h
    public final void d() {
        LocationManager locationManager;
        n nVar = this.f592d;
        if (nVar.f620c != null && (locationManager = nVar.f619b) != null) {
            locationManager.removeNmeaListener(nVar.f621d);
            locationManager.unregisterGnssStatusCallback(nVar.f622e);
            nVar.f627j = false;
        }
        this.f591c.d(this.f590b);
    }

    @Override // F1.h
    public final void f(r rVar) {
        int i4 = a2.b.f3602a;
        M1.f fVar = new M1.f(this.f589a, Y1.b.f3081i, M1.b.f1158a, M1.e.f1160b);
        a2.c cVar = new a2.c(new ArrayList(), false, false);
        E e4 = new E();
        e4.f118b = true;
        e4.f120d = new K2.o(17, cVar);
        e4.f119c = 2426;
        C0246i c4 = fVar.c(0, e4.a());
        x xVar = new x(2, rVar);
        c4.getClass();
        c4.f4982b.e(new C0244g((Executor) AbstractC0242e.f4975a, (InterfaceC0238a) xVar));
        c4.f();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Y1.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [W.p, java.lang.Object] */
    public final void h(j jVar) {
        LocationRequest g4 = g(jVar);
        this.f592d.b();
        Y1.b bVar = this.f591c;
        d dVar = this.f590b;
        Looper mainLooper = Looper.getMainLooper();
        bVar.getClass();
        if (mainLooper == null) {
            mainLooper = Looper.myLooper();
            s.e(mainLooper, "invalid null looper");
        }
        String simpleName = d.class.getSimpleName();
        s.e(dVar, "Listener must not be null");
        N1.h hVar = new N1.h(mainLooper, dVar, simpleName);
        ?? obj = new Object();
        obj.f3080n = bVar;
        obj.f3078l = true;
        obj.f3079m = hVar;
        Y.x xVar = new Y.x(1, (Object) obj, g4);
        ?? obj2 = new Object();
        obj2.f2683b = xVar;
        obj2.f2684c = obj;
        obj2.f2685d = hVar;
        obj2.f2682a = 2436;
        N1.g gVar = hVar.f1283c;
        s.e(gVar, "Key must not be null");
        N1.h hVar2 = (N1.h) obj2.f2685d;
        int i4 = obj2.f2682a;
        B1.d dVar2 = new B1.d((p) obj2, hVar2, i4);
        K2.o oVar = new K2.o((p) obj2, gVar);
        s.e(hVar2.f1283c, "Listener has already been released.");
        C0060d c0060d = bVar.f1169h;
        c0060d.getClass();
        C0241d c0241d = new C0241d();
        c0060d.e(c0241d, i4, bVar);
        N1.x xVar2 = new N1.x(new B(new y(dVar2, oVar), c0241d), c0060d.f1274t.get(), bVar);
        W1.f fVar = c0060d.f1277x;
        fVar.sendMessage(fVar.obtainMessage(8, xVar2));
    }
}
