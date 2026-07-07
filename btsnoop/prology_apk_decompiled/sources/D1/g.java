package D1;

import B2.AbstractActivityC0003d;
import B2.AbstractC0007h;
import B2.r;
import F1.j;
import K2.k;
import L2.h;
import L2.i;
import L2.n;
import L2.o;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.media.session.t;
import android.util.Log;
import com.baseflow.geolocator.GeolocatorLocationService;
import java.util.HashMap;
import java.util.Map;
import p1.AbstractC0462a;
import r.C0498c;

/* loaded from: classes.dex */
public final class g implements o, i {

    /* renamed from: l, reason: collision with root package name */
    public final G1.a f458l;

    /* renamed from: m, reason: collision with root package name */
    public Context f459m;

    /* renamed from: n, reason: collision with root package name */
    public AbstractActivityC0003d f460n;

    /* renamed from: o, reason: collision with root package name */
    public final F1.f f461o;

    /* renamed from: p, reason: collision with root package name */
    public Object f462p;

    /* renamed from: q, reason: collision with root package name */
    public Object f463q;

    /* renamed from: r, reason: collision with root package name */
    public Object f464r;

    public g(G1.a aVar, F1.f fVar) {
        this.f458l = aVar;
        this.f461o = fVar;
    }

    @Override // L2.i
    public void E() {
        a(true);
    }

    @Override // L2.i
    public void H(Object obj, h hVar) {
        Map map;
        F1.b bVar = null;
        bVar = null;
        try {
            G1.a aVar = this.f458l;
            Context context = this.f459m;
            aVar.getClass();
            if (!G1.a.d(context)) {
                hVar.b(AbstractC0007h.f(5), AbstractC0007h.e(5), null);
                return;
            }
            if (((GeolocatorLocationService) this.f463q) == null) {
                Log.e("FlutterGeolocator", "Location background service has not started correctly");
                return;
            }
            Map map2 = (Map) obj;
            boolean booleanValue = (map2 == null || map2.get("forceLocationManager") == null) ? false : ((Boolean) map2.get("forceLocationManager")).booleanValue();
            j a4 = j.a(map2);
            if (map2 != null && (map = (Map) map2.get("foregroundNotificationConfig")) != null) {
                Map map3 = (Map) map.get("notificationIcon");
                F1.a aVar2 = map3 == null ? null : new F1.a(0, (String) map3.get("name"), (String) map3.get("defType"));
                String str = (String) map.get("notificationTitle");
                String str2 = (String) map.get("notificationChannelName");
                String str3 = (String) map.get("notificationText");
                Boolean bool = (Boolean) map.get("enableWifiLock");
                Boolean bool2 = (Boolean) map.get("enableWakeLock");
                Boolean bool3 = (Boolean) map.get("setOngoing");
                Object obj2 = map.get("color");
                bVar = new F1.b(str, str3, str2, aVar2, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), obj2 != null ? Integer.valueOf(((Number) obj2).intValue()) : null);
            }
            if (bVar == null) {
                Log.e("FlutterGeolocator", "Geolocator position updates started");
                Context context2 = this.f459m;
                boolean equals = Boolean.TRUE.equals(Boolean.valueOf(booleanValue));
                F1.f fVar = this.f461o;
                fVar.getClass();
                F1.h b4 = F1.f.b(context2, equals, a4);
                this.f464r = b4;
                AbstractActivityC0003d abstractActivityC0003d = this.f460n;
                a aVar3 = new a(hVar, 2);
                a aVar4 = new a(hVar, 3);
                fVar.f598l.add(b4);
                b4.b(abstractActivityC0003d, aVar3, aVar4);
                return;
            }
            Log.e("FlutterGeolocator", "Geolocator position updates started using Android foreground service");
            GeolocatorLocationService geolocatorLocationService = (GeolocatorLocationService) this.f463q;
            geolocatorLocationService.f4716o++;
            if (geolocatorLocationService.f4718q != null) {
                F1.h b5 = F1.f.b(geolocatorLocationService.getApplicationContext(), Boolean.TRUE.equals(Boolean.valueOf(booleanValue)), a4);
                geolocatorLocationService.f4719r = b5;
                F1.f fVar2 = geolocatorLocationService.f4718q;
                AbstractActivityC0003d abstractActivityC0003d2 = geolocatorLocationService.f4717p;
                a aVar5 = new a(hVar, 0);
                a aVar6 = new a(hVar, 1);
                fVar2.f598l.add(b5);
                b5.b(abstractActivityC0003d2, aVar5, aVar6);
            }
            GeolocatorLocationService geolocatorLocationService2 = (GeolocatorLocationService) this.f463q;
            if (geolocatorLocationService2.f4721u != null) {
                Log.d("FlutterGeolocator", "Service already in foreground mode.");
                B1.d dVar = geolocatorLocationService2.f4721u;
                if (dVar != null) {
                    dVar.n(bVar, geolocatorLocationService2.f4714m);
                    geolocatorLocationService2.a(bVar);
                }
            } else {
                Log.d("FlutterGeolocator", "Start service in foreground mode.");
                Context applicationContext = geolocatorLocationService2.getApplicationContext();
                geolocatorLocationService2.f4721u = new B1.d(applicationContext, bVar);
                r.j jVar = new r.j(applicationContext);
                NotificationChannel notificationChannel = new NotificationChannel("geolocator_channel_01", bVar.f577c, 0);
                notificationChannel.setLockscreenVisibility(0);
                jVar.f7997a.createNotificationChannel(notificationChannel);
                geolocatorLocationService2.startForeground(75415, ((C0498c) geolocatorLocationService2.f4721u.f97n).a());
                geolocatorLocationService2.f4714m = true;
            }
            geolocatorLocationService2.a(bVar);
        } catch (E1.b unused) {
            hVar.b(AbstractC0007h.f(4), AbstractC0007h.e(4), null);
        }
    }

    @Override // L2.o
    public void I(n nVar, k kVar) {
        int i4;
        String str = nVar.f1094a;
        str.getClass();
        HashMap hashMap = (HashMap) this.f463q;
        int i5 = 2;
        boolean z4 = false;
        F1.f fVar = this.f461o;
        G1.a aVar = this.f458l;
        Object obj = nVar.f1095b;
        char c4 = 65535;
        switch (str.hashCode()) {
            case -1757019252:
                if (str.equals("getCurrentPosition")) {
                    c4 = 0;
                    break;
                }
                break;
            case -1156770336:
                if (str.equals("getLastKnownPosition")) {
                    c4 = 1;
                    break;
                }
                break;
            case -821636766:
                if (str.equals("openLocationSettings")) {
                    c4 = 2;
                    break;
                }
                break;
            case 347240634:
                if (str.equals("openAppSettings")) {
                    c4 = 3;
                    break;
                }
                break;
            case 356040619:
                if (str.equals("isLocationServiceEnabled")) {
                    c4 = 4;
                    break;
                }
                break;
            case 686218487:
                if (str.equals("checkPermission")) {
                    c4 = 5;
                    break;
                }
                break;
            case 746581438:
                if (str.equals("requestPermission")) {
                    c4 = 6;
                    break;
                }
                break;
            case 877043524:
                if (str.equals("getLocationAccuracy")) {
                    c4 = 7;
                    break;
                }
                break;
            case 1774650278:
                if (str.equals("cancelGetCurrentPosition")) {
                    c4 = '\b';
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                try {
                    Context context = this.f459m;
                    aVar.getClass();
                    if (!G1.a.d(context)) {
                        kVar.a(AbstractC0007h.f(5), AbstractC0007h.e(5), null);
                        return;
                    }
                    Map map = (Map) obj;
                    boolean booleanValue = map.get("forceLocationManager") != null ? ((Boolean) map.get("forceLocationManager")).booleanValue() : false;
                    j a4 = j.a(map);
                    String str2 = (String) map.get("requestId");
                    boolean[] zArr = {false};
                    Context context2 = this.f459m;
                    fVar.getClass();
                    F1.h b4 = F1.f.b(context2, booleanValue, a4);
                    hashMap.put(str2, b4);
                    AbstractActivityC0003d abstractActivityC0003d = this.f460n;
                    e eVar = new e(this, zArr, b4, str2, kVar);
                    e eVar2 = new e(this, zArr, b4, str2, kVar);
                    fVar.f598l.add(b4);
                    b4.b(abstractActivityC0003d, eVar, eVar2);
                    return;
                } catch (E1.b unused) {
                    kVar.a(AbstractC0007h.f(4), AbstractC0007h.e(4), null);
                    return;
                }
            case 1:
                try {
                    Context context3 = this.f459m;
                    aVar.getClass();
                    if (!G1.a.d(context3)) {
                        kVar.a(AbstractC0007h.f(5), AbstractC0007h.e(5), null);
                        return;
                    }
                    Boolean bool = (Boolean) nVar.a("forceLocationManager");
                    Context context4 = this.f459m;
                    if (bool != null && bool.booleanValue()) {
                        z4 = true;
                    }
                    f fVar2 = new f(kVar, 2);
                    f fVar3 = new f(kVar, 3);
                    fVar.getClass();
                    F1.f.b(context4, z4, null).a(fVar2, fVar3);
                    return;
                } catch (E1.b unused2) {
                    kVar.a(AbstractC0007h.f(4), AbstractC0007h.e(4), null);
                    return;
                }
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                Context context5 = this.f459m;
                try {
                    Intent intent = new Intent();
                    intent.setAction("android.settings.LOCATION_SOURCE_SETTINGS");
                    intent.addCategory("android.intent.category.DEFAULT");
                    intent.addFlags(268435456);
                    intent.addFlags(1073741824);
                    intent.addFlags(8388608);
                    context5.startActivity(intent);
                    z4 = true;
                } catch (Exception unused3) {
                }
                kVar.b(Boolean.valueOf(z4));
                return;
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                Context context6 = this.f459m;
                try {
                    Intent intent2 = new Intent();
                    intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.addCategory("android.intent.category.DEFAULT");
                    intent2.setData(Uri.parse("package:" + context6.getPackageName()));
                    intent2.addFlags(268435456);
                    intent2.addFlags(1073741824);
                    intent2.addFlags(8388608);
                    context6.startActivity(intent2);
                    z4 = true;
                } catch (Exception unused4) {
                }
                kVar.b(Boolean.valueOf(z4));
                return;
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                Context context7 = this.f459m;
                r rVar = new r(9, false);
                rVar.f185m = kVar;
                if (context7 == null) {
                    fVar.getClass();
                    ((k) rVar.f185m).a(AbstractC0007h.f(3), AbstractC0007h.e(3), null);
                }
                fVar.getClass();
                F1.f.b(context7, false, null).f(rVar);
                return;
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                try {
                    Context context8 = this.f459m;
                    aVar.getClass();
                    int b5 = L.j.b(G1.a.a(context8));
                    if (b5 == 0) {
                        i4 = 0;
                    } else if (b5 == 1) {
                        i4 = 1;
                    } else if (b5 == 2) {
                        i4 = 2;
                    } else {
                        if (b5 != 3) {
                            throw new IndexOutOfBoundsException();
                        }
                        i4 = 3;
                    }
                    kVar.b(Integer.valueOf(i4));
                    return;
                } catch (E1.b unused5) {
                    kVar.a(AbstractC0007h.f(4), AbstractC0007h.e(4), null);
                    return;
                }
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                try {
                    aVar.e(this.f460n, new f(kVar, 0), new f(kVar, 1));
                    return;
                } catch (E1.b unused6) {
                    kVar.a(AbstractC0007h.f(4), AbstractC0007h.e(4), null);
                    return;
                }
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                Context context9 = this.f459m;
                ((F1.g) this.f462p).getClass();
                if (AbstractC0462a.o(context9, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                    if (AbstractC0462a.o(context9, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        i5 = 1;
                    } else {
                        kVar.a(AbstractC0007h.f(5), AbstractC0007h.e(5), null);
                        i5 = 0;
                    }
                }
                if (i5 != 0) {
                    kVar.b(Integer.valueOf(L.j.b(i5)));
                    return;
                }
                return;
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                String str3 = (String) ((Map) obj).get("requestId");
                F1.h hVar = (F1.h) hashMap.get(str3);
                if (hVar != null) {
                    hVar.d();
                }
                hashMap.remove(str3);
                kVar.b(null);
                return;
            default:
                kVar.c();
                return;
        }
    }

    public void a(boolean z4) {
        F1.f fVar;
        F1.f fVar2;
        Log.e("FlutterGeolocator", "Geolocator position updates stopped");
        GeolocatorLocationService geolocatorLocationService = (GeolocatorLocationService) this.f463q;
        if (geolocatorLocationService == null || (!z4 ? geolocatorLocationService.f4715n == 0 : geolocatorLocationService.f4716o == 1)) {
            Log.e("FlutterGeolocator", "There is still another flutter engine connected, not stopping location service");
        } else {
            geolocatorLocationService.f4716o--;
            Log.d("FlutterGeolocator", "Stopping location service.");
            F1.h hVar = geolocatorLocationService.f4719r;
            if (hVar != null && (fVar2 = geolocatorLocationService.f4718q) != null) {
                fVar2.f598l.remove(hVar);
                hVar.d();
            }
            GeolocatorLocationService geolocatorLocationService2 = (GeolocatorLocationService) this.f463q;
            if (geolocatorLocationService2.f4714m) {
                Log.d("FlutterGeolocator", "Stop service in foreground.");
                geolocatorLocationService2.stopForeground(1);
                geolocatorLocationService2.b();
                geolocatorLocationService2.f4714m = false;
                geolocatorLocationService2.f4721u = null;
            }
        }
        F1.h hVar2 = (F1.h) this.f464r;
        if (hVar2 == null || (fVar = this.f461o) == null) {
            return;
        }
        fVar.f598l.remove(hVar2);
        hVar2.d();
        this.f464r = null;
    }

    public void b() {
        if (((t) this.f462p) == null) {
            Log.d("FlutterGeolocator", "Tried to stop listening when no MethodChannel had been initialized.");
            return;
        }
        a(false);
        ((t) this.f462p).B0(null);
        this.f462p = null;
    }

    public g(G1.a aVar, F1.f fVar, F1.g gVar) {
        this.f458l = aVar;
        this.f461o = fVar;
        this.f462p = gVar;
        this.f463q = new HashMap();
    }
}
