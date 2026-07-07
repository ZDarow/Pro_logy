package p003A1;

/* renamed from: A1.a */
/* loaded from: classes.dex */
public final class C0013a implements p034H2.InterfaceC0248b, p047L2.InterfaceC0385o {

    /* renamed from: l */
    public p035I.C0291m f50l;

    /* renamed from: m */
    public android.content.Context f51m;

    /* renamed from: n */
    public final java.util.List f52n = p105a3.AbstractC1022e.m2056d0(new p003A1.C0014b(p003A1.EnumC0015c.f68l, "Google Maps", "com.google.android.apps.maps", "geo://"), new p003A1.C0014b(p003A1.EnumC0015c.f69m, "Google Maps Go", "com.google.android.apps.mapslite", "geo://"), new p003A1.C0014b(p003A1.EnumC0015c.f70n, "Amap", "com.autonavi.minimap", "iosamap://"), new p003A1.C0014b(p003A1.EnumC0015c.f71o, "Baidu Maps", "com.baidu.BaiduMap", "baidumap://"), new p003A1.C0014b(p003A1.EnumC0015c.f72p, "Waze", "com.waze", "waze://"), new p003A1.C0014b(p003A1.EnumC0015c.f73q, "Yandex Navigator", "ru.yandex.yandexnavi", "yandexnavi://"), new p003A1.C0014b(p003A1.EnumC0015c.f74r, "Yandex Maps", "ru.yandex.yandexmaps", "yandexmaps://"), new p003A1.C0014b(p003A1.EnumC0015c.f75s, "Citymapper", "com.citymapper.app.release", "citymapper://"), new p003A1.C0014b(p003A1.EnumC0015c.f76t, "OsmAnd", "net.osmand", "osmandmaps://"), new p003A1.C0014b(p003A1.EnumC0015c.f77u, "OsmAnd+", "net.osmand.plus", "osmandmaps://"), new p003A1.C0014b(p003A1.EnumC0015c.f78v, "2GIS", "ru.dublgis.dgismobile", "dgis://"), new p003A1.C0014b(p003A1.EnumC0015c.f79w, "Tencent (QQ Maps)", "com.tencent.map", "qqmap://"), new p003A1.C0014b(p003A1.EnumC0015c.f80x, "HERE WeGo", "com.here.app.maps", "here-location://"), new p003A1.C0014b(p003A1.EnumC0015c.f81y, "Petal Maps", "com.huawei.maps.app", "petalmaps://"), new p003A1.C0014b(p003A1.EnumC0015c.f82z, "TomTom Go", "com.tomtom.gplay.navapp", "tomtomgo://"), new p003A1.C0014b(p003A1.EnumC0015c.f59C, "TomTom Go Fleet", "com.tomtom.gplay.navapp.gofleet", "tomtomgofleet://"), new p003A1.C0014b(p003A1.EnumC0015c.f58B, "Sygic Truck", "com.sygic.truck", "com.sygic.aura://"), new p003A1.C0014b(p003A1.EnumC0015c.f57A, "CoPilot", "com.alk.copilot.mapviewer", "copilot://"), new p003A1.C0014b(p003A1.EnumC0015c.f60D, "Flitsmeister", "nl.flitsmeister", "flitsmeister://"), new p003A1.C0014b(p003A1.EnumC0015c.f61E, "Truckmeister", "nl.flitsmeister.flux", "truckmeister://"), new p003A1.C0014b(p003A1.EnumC0015c.f62F, "Naver Map", "com.nhn.android.nmap", "nmap://"), new p003A1.C0014b(p003A1.EnumC0015c.f63G, "Kakao Maps", "net.daum.android.map", "kakaomap://"), new p003A1.C0014b(p003A1.EnumC0015c.f64H, "TMap", "com.skt.tmap.ku", "tmap://"), new p003A1.C0014b(p003A1.EnumC0015c.f65I, "Mapy CZ", "cz.seznam.mapy", "https://"), new p003A1.C0014b(p003A1.EnumC0015c.f66J, "Mappls MapmyIndia", "com.mmi.maps", "mappls://"));

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0087, code lost:
    
        if (r0.equals("showDirections") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
    
        if (r0.equals("showMarker") == false) goto L44;
     */
    @Override // p047L2.InterfaceC0385o
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo42I(p047L2.C0384n r9, p043K2.C0335k r10) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p003A1.C0013a.mo42I(L2.n, K2.k):void");
    }

    /* renamed from: a */
    public final java.util.ArrayList m43a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : this.f52n) {
            p003A1.C0014b c0014b = (p003A1.C0014b) obj;
            android.content.Context context = this.f51m;
            if (context == null) {
                p154k3.AbstractC1803h.m3783i("context");
                throw null;
            }
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if ((packageManager != null ? packageManager.getLaunchIntentForPackage(c0014b.f55c) : null) != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: b */
    public final void mo44b(p034H2.C0247a c0247a) {
        p154k3.AbstractC1803h.m3779e(c0247a, "binding");
        p035I.C0291m c0291m = this.f50l;
        if (c0291m != null) {
            c0291m.m702s(null);
        } else {
            p154k3.AbstractC1803h.m3783i("channel");
            throw null;
        }
    }

    /* renamed from: c */
    public final boolean m45c(java.lang.String str) {
        java.util.ArrayList m43a = m43a();
        if (m43a.isEmpty()) {
            return false;
        }
        java.util.Iterator it = m43a.iterator();
        while (it.hasNext()) {
            if (p154k3.AbstractC1803h.m3775a(((p003A1.C0014b) it.next()).f53a.name(), str)) {
                return true;
            }
        }
        return false;
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: d */
    public final void mo46d(p034H2.C0247a c0247a) {
        p154k3.AbstractC1803h.m3779e(c0247a, "flutterPluginBinding");
        p035I.C0291m c0291m = new p035I.C0291m((p047L2.InterfaceC0376f) c0247a.f720m, "map_launcher");
        this.f50l = c0291m;
        this.f51m = (android.content.Context) c0247a.f719l;
        c0291m.m702s(this);
    }
}
