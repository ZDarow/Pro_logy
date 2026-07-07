package A1;

import I.C0044m;
import L2.f;
import L2.o;
import a3.e;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k3.h;

/* loaded from: classes.dex */
public final class a implements H2.b, o {

    /* renamed from: l, reason: collision with root package name */
    public C0044m f50l;

    /* renamed from: m, reason: collision with root package name */
    public Context f51m;

    /* renamed from: n, reason: collision with root package name */
    public final List f52n = e.d0(new b(c.f67l, "Google Maps", "com.google.android.apps.maps", "geo://"), new b(c.f68m, "Google Maps Go", "com.google.android.apps.mapslite", "geo://"), new b(c.f69n, "Amap", "com.autonavi.minimap", "iosamap://"), new b(c.f70o, "Baidu Maps", "com.baidu.BaiduMap", "baidumap://"), new b(c.f71p, "Waze", "com.waze", "waze://"), new b(c.f72q, "Yandex Navigator", "ru.yandex.yandexnavi", "yandexnavi://"), new b(c.f73r, "Yandex Maps", "ru.yandex.yandexmaps", "yandexmaps://"), new b(c.s, "Citymapper", "com.citymapper.app.release", "citymapper://"), new b(c.f74t, "OsmAnd", "net.osmand", "osmandmaps://"), new b(c.f75u, "OsmAnd+", "net.osmand.plus", "osmandmaps://"), new b(c.f76v, "2GIS", "ru.dublgis.dgismobile", "dgis://"), new b(c.w, "Tencent (QQ Maps)", "com.tencent.map", "qqmap://"), new b(c.f77x, "HERE WeGo", "com.here.app.maps", "here-location://"), new b(c.f78y, "Petal Maps", "com.huawei.maps.app", "petalmaps://"), new b(c.f79z, "TomTom Go", "com.tomtom.gplay.navapp", "tomtomgo://"), new b(c.f59C, "TomTom Go Fleet", "com.tomtom.gplay.navapp.gofleet", "tomtomgofleet://"), new b(c.f58B, "Sygic Truck", "com.sygic.truck", "com.sygic.aura://"), new b(c.f57A, "CoPilot", "com.alk.copilot.mapviewer", "copilot://"), new b(c.f60D, "Flitsmeister", "nl.flitsmeister", "flitsmeister://"), new b(c.f61E, "Truckmeister", "nl.flitsmeister.flux", "truckmeister://"), new b(c.f62F, "Naver Map", "com.nhn.android.nmap", "nmap://"), new b(c.f63G, "Kakao Maps", "net.daum.android.map", "kakaomap://"), new b(c.f64H, "TMap", "com.skt.tmap.ku", "tmap://"), new b(c.f65I, "Mapy CZ", "cz.seznam.mapy", "https://"), new b(c.J, "Mappls MapmyIndia", "com.mmi.maps", "mappls://"));

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0087, code lost:
    
        if (r0.equals("showDirections") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
    
        if (r0.equals("showMarker") == false) goto L44;
     */
    @Override // L2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(L2.n r9, K2.k r10) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.a.I(L2.n, K2.k):void");
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f52n) {
            b bVar = (b) obj;
            Context context = this.f51m;
            if (context == null) {
                h.i("context");
                throw null;
            }
            PackageManager packageManager = context.getPackageManager();
            if ((packageManager != null ? packageManager.getLaunchIntentForPackage(bVar.f55c) : null) != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // H2.b
    public final void b(H2.a aVar) {
        h.e(aVar, "binding");
        C0044m c0044m = this.f50l;
        if (c0044m != null) {
            c0044m.s(null);
        } else {
            h.i("channel");
            throw null;
        }
    }

    public final boolean c(String str) {
        ArrayList a4 = a();
        if (a4.isEmpty()) {
            return false;
        }
        Iterator it = a4.iterator();
        while (it.hasNext()) {
            if (h.a(((b) it.next()).f53a.name(), str)) {
                return true;
            }
        }
        return false;
    }

    @Override // H2.b
    public final void d(H2.a aVar) {
        h.e(aVar, "flutterPluginBinding");
        C0044m c0044m = new C0044m((f) aVar.f709m, "map_launcher");
        this.f50l = c0044m;
        this.f51m = (Context) aVar.f708l;
        c0044m.s(this);
    }
}
