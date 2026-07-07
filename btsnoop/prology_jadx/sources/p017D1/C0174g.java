package p017D1;

/* renamed from: D1.g */
/* loaded from: classes.dex */
public final class C0174g implements p047L2.InterfaceC0385o, p047L2.InterfaceC0379i {

    /* renamed from: l */
    public final p029G1.C0238a f467l;

    /* renamed from: m */
    public android.content.Context f468m;

    /* renamed from: n */
    public p009B2.AbstractActivityC0047d f469n;

    /* renamed from: o */
    public final p025F1.C0214f f470o;

    /* renamed from: p */
    public java.lang.Object f471p;

    /* renamed from: q */
    public java.lang.Object f472q;

    /* renamed from: r */
    public java.lang.Object f473r;

    public C0174g(p029G1.C0238a c0238a, p025F1.C0214f c0214f) {
        this.f467l = c0238a;
        this.f470o = c0214f;
    }

    @Override // p047L2.InterfaceC0379i
    /* renamed from: E */
    public void mo47E() {
        m536a(true);
    }

    @Override // p047L2.InterfaceC0379i
    /* renamed from: H */
    public void mo48H(java.lang.Object obj, p047L2.C0378h c0378h) {
        java.util.Map map;
        p025F1.C0210b c0210b = null;
        c0210b = null;
        try {
            p029G1.C0238a c0238a = this.f467l;
            android.content.Context context = this.f468m;
            c0238a.getClass();
            if (!p029G1.C0238a.m647d(context)) {
                c0378h.m829b(p009B2.AbstractC0051h.m147f(5), p009B2.AbstractC0051h.m146e(5), null);
                return;
            }
            if (((com.baseflow.geolocator.GeolocatorLocationService) this.f472q) == null) {
                android.util.Log.e("FlutterGeolocator", "Location background service has not started correctly");
                return;
            }
            java.util.Map map2 = (java.util.Map) obj;
            boolean booleanValue = (map2 == null || map2.get("forceLocationManager") == null) ? false : ((java.lang.Boolean) map2.get("forceLocationManager")).booleanValue();
            p025F1.C0218j m606a = p025F1.C0218j.m606a(map2);
            if (map2 != null && (map = (java.util.Map) map2.get("foregroundNotificationConfig")) != null) {
                java.util.Map map3 = (java.util.Map) map.get("notificationIcon");
                p025F1.C0209a c0209a = map3 == null ? null : new p025F1.C0209a(0, (java.lang.String) map3.get("name"), (java.lang.String) map3.get("defType"));
                java.lang.String str = (java.lang.String) map.get("notificationTitle");
                java.lang.String str2 = (java.lang.String) map.get("notificationChannelName");
                java.lang.String str3 = (java.lang.String) map.get("notificationText");
                java.lang.Boolean bool = (java.lang.Boolean) map.get("enableWifiLock");
                java.lang.Boolean bool2 = (java.lang.Boolean) map.get("enableWakeLock");
                java.lang.Boolean bool3 = (java.lang.Boolean) map.get("setOngoing");
                java.lang.Object obj2 = map.get("color");
                c0210b = new p025F1.C0210b(str, str3, str2, c0209a, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), obj2 != null ? java.lang.Integer.valueOf(((java.lang.Number) obj2).intValue()) : null);
            }
            if (c0210b == null) {
                android.util.Log.e("FlutterGeolocator", "Geolocator position updates started");
                android.content.Context context2 = this.f468m;
                boolean equals = java.lang.Boolean.TRUE.equals(java.lang.Boolean.valueOf(booleanValue));
                p025F1.C0214f c0214f = this.f470o;
                c0214f.getClass();
                p025F1.InterfaceC0216h m577b = p025F1.C0214f.m577b(context2, equals, m606a);
                this.f473r = m577b;
                p009B2.AbstractActivityC0047d abstractActivityC0047d = this.f469n;
                p017D1.C0168a c0168a = new p017D1.C0168a(c0378h, 2);
                p017D1.C0168a c0168a2 = new p017D1.C0168a(c0378h, 3);
                c0214f.f608l.add(m577b);
                m577b.mo572b(abstractActivityC0047d, c0168a, c0168a2);
                return;
            }
            android.util.Log.e("FlutterGeolocator", "Geolocator position updates started using Android foreground service");
            com.baseflow.geolocator.GeolocatorLocationService geolocatorLocationService = (com.baseflow.geolocator.GeolocatorLocationService) this.f472q;
            geolocatorLocationService.f4886o++;
            if (geolocatorLocationService.f4888q != null) {
                p025F1.InterfaceC0216h m577b2 = p025F1.C0214f.m577b(geolocatorLocationService.getApplicationContext(), java.lang.Boolean.TRUE.equals(java.lang.Boolean.valueOf(booleanValue)), m606a);
                geolocatorLocationService.f4889r = m577b2;
                p025F1.C0214f c0214f2 = geolocatorLocationService.f4888q;
                p009B2.AbstractActivityC0047d abstractActivityC0047d2 = geolocatorLocationService.f4887p;
                p017D1.C0168a c0168a3 = new p017D1.C0168a(c0378h, 0);
                p017D1.C0168a c0168a4 = new p017D1.C0168a(c0378h, 1);
                c0214f2.f608l.add(m577b2);
                m577b2.mo572b(abstractActivityC0047d2, c0168a3, c0168a4);
            }
            com.baseflow.geolocator.GeolocatorLocationService geolocatorLocationService2 = (com.baseflow.geolocator.GeolocatorLocationService) this.f472q;
            if (geolocatorLocationService2.f4892u != null) {
                android.util.Log.d("FlutterGeolocator", "Service already in foreground mode.");
                p008B1.C0026d c0026d = geolocatorLocationService2.f4892u;
                if (c0026d != null) {
                    c0026d.m112n(c0210b, geolocatorLocationService2.f4884m);
                    geolocatorLocationService2.m2924a(c0210b);
                }
            } else {
                android.util.Log.d("FlutterGeolocator", "Start service in foreground mode.");
                android.content.Context applicationContext = geolocatorLocationService2.getApplicationContext();
                geolocatorLocationService2.f4892u = new p008B1.C0026d(applicationContext, c0210b);
                p183r.C2042j c2042j = new p183r.C2042j(applicationContext);
                android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("geolocator_channel_01", c0210b.f587c, 0);
                notificationChannel.setLockscreenVisibility(0);
                c2042j.f8306a.createNotificationChannel(notificationChannel);
                geolocatorLocationService2.startForeground(75415, ((p183r.C2035c) geolocatorLocationService2.f4892u.f100n).m4085a());
                geolocatorLocationService2.f4884m = true;
            }
            geolocatorLocationService2.m2924a(c0210b);
        } catch (p022E1.C0196b unused) {
            c0378h.m829b(p009B2.AbstractC0051h.m147f(4), p009B2.AbstractC0051h.m146e(4), null);
        }
    }

    @Override // p047L2.InterfaceC0385o
    /* renamed from: I */
    public void mo42I(p047L2.C0384n c0384n, p043K2.C0335k c0335k) {
        int i4;
        java.lang.String str = c0384n.f1133a;
        str.getClass();
        java.util.HashMap hashMap = (java.util.HashMap) this.f472q;
        int i5 = 2;
        boolean z4 = false;
        p025F1.C0214f c0214f = this.f470o;
        p029G1.C0238a c0238a = this.f467l;
        java.lang.Object obj = c0384n.f1134b;
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
                    android.content.Context context = this.f468m;
                    c0238a.getClass();
                    if (!p029G1.C0238a.m647d(context)) {
                        c0335k.mo741a(p009B2.AbstractC0051h.m147f(5), p009B2.AbstractC0051h.m146e(5), null);
                        return;
                    }
                    java.util.Map map = (java.util.Map) obj;
                    boolean booleanValue = map.get("forceLocationManager") != null ? ((java.lang.Boolean) map.get("forceLocationManager")).booleanValue() : false;
                    p025F1.C0218j m606a = p025F1.C0218j.m606a(map);
                    java.lang.String str2 = (java.lang.String) map.get("requestId");
                    boolean[] zArr = {false};
                    android.content.Context context2 = this.f468m;
                    c0214f.getClass();
                    p025F1.InterfaceC0216h m577b = p025F1.C0214f.m577b(context2, booleanValue, m606a);
                    hashMap.put(str2, m577b);
                    p009B2.AbstractActivityC0047d abstractActivityC0047d = this.f469n;
                    p017D1.C0172e c0172e = new p017D1.C0172e(this, zArr, m577b, str2, c0335k);
                    p017D1.C0172e c0172e2 = new p017D1.C0172e(this, zArr, m577b, str2, c0335k);
                    c0214f.f608l.add(m577b);
                    m577b.mo572b(abstractActivityC0047d, c0172e, c0172e2);
                    return;
                } catch (p022E1.C0196b unused) {
                    c0335k.mo741a(p009B2.AbstractC0051h.m147f(4), p009B2.AbstractC0051h.m146e(4), null);
                    return;
                }
            case 1:
                try {
                    android.content.Context context3 = this.f468m;
                    c0238a.getClass();
                    if (!p029G1.C0238a.m647d(context3)) {
                        c0335k.mo741a(p009B2.AbstractC0051h.m147f(5), p009B2.AbstractC0051h.m146e(5), null);
                        return;
                    }
                    java.lang.Boolean bool = (java.lang.Boolean) c0384n.m839a("forceLocationManager");
                    android.content.Context context4 = this.f468m;
                    if (bool != null && bool.booleanValue()) {
                        z4 = true;
                    }
                    p017D1.C0173f c0173f = new p017D1.C0173f(c0335k, 2);
                    p017D1.C0173f c0173f2 = new p017D1.C0173f(c0335k, 3);
                    c0214f.getClass();
                    p025F1.C0214f.m577b(context4, z4, null).mo571a(c0173f, c0173f2);
                    return;
                } catch (p022E1.C0196b unused2) {
                    c0335k.mo741a(p009B2.AbstractC0051h.m147f(4), p009B2.AbstractC0051h.m146e(4), null);
                    return;
                }
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                android.content.Context context5 = this.f468m;
                try {
                    android.content.Intent intent = new android.content.Intent();
                    intent.setAction("android.settings.LOCATION_SOURCE_SETTINGS");
                    intent.addCategory("android.intent.category.DEFAULT");
                    intent.addFlags(268435456);
                    intent.addFlags(1073741824);
                    intent.addFlags(8388608);
                    context5.startActivity(intent);
                    z4 = true;
                } catch (java.lang.Exception unused3) {
                }
                c0335k.mo742b(java.lang.Boolean.valueOf(z4));
                return;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                android.content.Context context6 = this.f468m;
                try {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.addCategory("android.intent.category.DEFAULT");
                    intent2.setData(android.net.Uri.parse("package:" + context6.getPackageName()));
                    intent2.addFlags(268435456);
                    intent2.addFlags(1073741824);
                    intent2.addFlags(8388608);
                    context6.startActivity(intent2);
                    z4 = true;
                } catch (java.lang.Exception unused4) {
                }
                c0335k.mo742b(java.lang.Boolean.valueOf(z4));
                return;
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                android.content.Context context7 = this.f468m;
                p009B2.C0061r c0061r = new p009B2.C0061r(9, false);
                c0061r.f188m = c0335k;
                if (context7 == null) {
                    c0214f.getClass();
                    ((p043K2.C0335k) c0061r.f188m).mo741a(p009B2.AbstractC0051h.m147f(3), p009B2.AbstractC0051h.m146e(3), null);
                }
                c0214f.getClass();
                p025F1.C0214f.m577b(context7, false, null).mo575f(c0061r);
                return;
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                try {
                    android.content.Context context8 = this.f468m;
                    c0238a.getClass();
                    int m781b = p044L.AbstractC0352j.m781b(p029G1.C0238a.m645a(context8));
                    if (m781b == 0) {
                        i4 = 0;
                    } else if (m781b == 1) {
                        i4 = 1;
                    } else if (m781b == 2) {
                        i4 = 2;
                    } else {
                        if (m781b != 3) {
                            throw new java.lang.IndexOutOfBoundsException();
                        }
                        i4 = 3;
                    }
                    c0335k.mo742b(java.lang.Integer.valueOf(i4));
                    return;
                } catch (p022E1.C0196b unused5) {
                    c0335k.mo741a(p009B2.AbstractC0051h.m147f(4), p009B2.AbstractC0051h.m146e(4), null);
                    return;
                }
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                try {
                    c0238a.m649e(this.f469n, new p017D1.C0173f(c0335k, 0), new p017D1.C0173f(c0335k, 1));
                    return;
                } catch (p022E1.C0196b unused6) {
                    c0335k.mo741a(p009B2.AbstractC0051h.m147f(4), p009B2.AbstractC0051h.m146e(4), null);
                    return;
                }
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                android.content.Context context9 = this.f468m;
                ((p025F1.C0215g) this.f471p).getClass();
                if (p176p1.AbstractC1949a.m3938o(context9, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                    if (p176p1.AbstractC1949a.m3938o(context9, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        i5 = 1;
                    } else {
                        c0335k.mo741a(p009B2.AbstractC0051h.m147f(5), p009B2.AbstractC0051h.m146e(5), null);
                        i5 = 0;
                    }
                }
                if (i5 != 0) {
                    c0335k.mo742b(java.lang.Integer.valueOf(p044L.AbstractC0352j.m781b(i5)));
                    return;
                }
                return;
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.String str3 = (java.lang.String) ((java.util.Map) obj).get("requestId");
                p025F1.InterfaceC0216h interfaceC0216h = (p025F1.InterfaceC0216h) hashMap.get(str3);
                if (interfaceC0216h != null) {
                    interfaceC0216h.mo574d();
                }
                hashMap.remove(str3);
                c0335k.mo742b(null);
                return;
            default:
                c0335k.mo743c();
                return;
        }
    }

    /* renamed from: a */
    public void m536a(boolean z4) {
        p025F1.C0214f c0214f;
        p025F1.C0214f c0214f2;
        android.util.Log.e("FlutterGeolocator", "Geolocator position updates stopped");
        com.baseflow.geolocator.GeolocatorLocationService geolocatorLocationService = (com.baseflow.geolocator.GeolocatorLocationService) this.f472q;
        if (geolocatorLocationService == null || (!z4 ? geolocatorLocationService.f4885n == 0 : geolocatorLocationService.f4886o == 1)) {
            android.util.Log.e("FlutterGeolocator", "There is still another flutter engine connected, not stopping location service");
        } else {
            geolocatorLocationService.f4886o--;
            android.util.Log.d("FlutterGeolocator", "Stopping location service.");
            p025F1.InterfaceC0216h interfaceC0216h = geolocatorLocationService.f4889r;
            if (interfaceC0216h != null && (c0214f2 = geolocatorLocationService.f4888q) != null) {
                c0214f2.f608l.remove(interfaceC0216h);
                interfaceC0216h.mo574d();
            }
            com.baseflow.geolocator.GeolocatorLocationService geolocatorLocationService2 = (com.baseflow.geolocator.GeolocatorLocationService) this.f472q;
            if (geolocatorLocationService2.f4884m) {
                android.util.Log.d("FlutterGeolocator", "Stop service in foreground.");
                geolocatorLocationService2.stopForeground(1);
                geolocatorLocationService2.m2925b();
                geolocatorLocationService2.f4884m = false;
                geolocatorLocationService2.f4892u = null;
            }
        }
        p025F1.InterfaceC0216h interfaceC0216h2 = (p025F1.InterfaceC0216h) this.f473r;
        if (interfaceC0216h2 == null || (c0214f = this.f470o) == null) {
            return;
        }
        c0214f.f608l.remove(interfaceC0216h2);
        interfaceC0216h2.mo574d();
        this.f473r = null;
    }

    /* renamed from: b */
    public void m537b() {
        if (((android.support.v4.media.session.C1061t) this.f471p) == null) {
            android.util.Log.d("FlutterGeolocator", "Tried to stop listening when no MethodChannel had been initialized.");
            return;
        }
        m536a(false);
        ((android.support.v4.media.session.C1061t) this.f471p).m2206B0(null);
        this.f471p = null;
    }

    public C0174g(p029G1.C0238a c0238a, p025F1.C0214f c0214f, p025F1.C0215g c0215g) {
        this.f467l = c0238a;
        this.f470o = c0214f;
        this.f471p = c0215g;
        this.f472q = new java.util.HashMap();
    }
}
