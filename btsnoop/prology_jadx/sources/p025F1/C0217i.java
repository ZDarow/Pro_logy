package p025F1;

/* renamed from: F1.i */
/* loaded from: classes.dex */
public final class C0217i implements p025F1.InterfaceC0216h, android.location.LocationListener {

    /* renamed from: a */
    public final android.location.LocationManager f611a;

    /* renamed from: b */
    public final p025F1.C0222n f612b;

    /* renamed from: c */
    public final p025F1.C0218j f613c;

    /* renamed from: d */
    public final android.content.Context f614d;

    /* renamed from: e */
    public boolean f615e = false;

    /* renamed from: f */
    public android.location.Location f616f;

    /* renamed from: g */
    public java.lang.String f617g;

    /* renamed from: h */
    public p025F1.InterfaceC0223o f618h;

    /* renamed from: i */
    public p022E1.InterfaceC0195a f619i;

    public C0217i(android.content.Context context, p025F1.C0218j c0218j) {
        this.f611a = (android.location.LocationManager) context.getSystemService("location");
        this.f613c = c0218j;
        this.f614d = context;
        this.f612b = new p025F1.C0222n(context, c0218j);
    }

    /* renamed from: g */
    public static boolean m605g(android.location.Location location, android.location.Location location2) {
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        boolean z4 = time > 120000;
        boolean z5 = time < -120000;
        boolean z6 = time > 0;
        if (z4) {
            return true;
        }
        if (z5) {
            return false;
        }
        float accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z7 = accuracy > 0.0f;
        boolean z8 = accuracy < 0.0f;
        boolean z9 = accuracy > 200.0f;
        boolean equals = location.getProvider() != null ? location.getProvider().equals(location2.getProvider()) : false;
        if (z8) {
            return true;
        }
        if (!z6 || z7) {
            return z6 && !z9 && equals;
        }
        return true;
    }

    @Override // p025F1.InterfaceC0216h
    /* renamed from: a */
    public final void mo571a(p017D1.C0173f c0173f, p017D1.C0173f c0173f2) {
        android.location.LocationManager locationManager = this.f611a;
        java.util.Iterator<java.lang.String> it = locationManager.getProviders(true).iterator();
        android.location.Location location = null;
        while (it.hasNext()) {
            android.location.Location lastKnownLocation = locationManager.getLastKnownLocation(it.next());
            if (lastKnownLocation != null && m605g(lastKnownLocation, location)) {
                location = lastKnownLocation;
            }
        }
        c0173f.mo529a(location);
    }

    @Override // p025F1.InterfaceC0216h
    /* renamed from: b */
    public final void mo572b(p009B2.AbstractActivityC0047d abstractActivityC0047d, p025F1.InterfaceC0223o interfaceC0223o, p022E1.InterfaceC0195a interfaceC0195a) {
        long j4;
        float f4;
        int i4;
        java.lang.String str;
        if (!p025F1.InterfaceC0216h.m604e(this.f614d)) {
            interfaceC0195a.mo530c(3);
            return;
        }
        this.f618h = interfaceC0223o;
        this.f619i = interfaceC0195a;
        int i5 = 5;
        p025F1.C0218j c0218j = this.f613c;
        if (c0218j != null) {
            float f5 = (float) c0218j.f621b;
            int i6 = c0218j.f620a;
            long j5 = i6 == 1 ? Long.MAX_VALUE : c0218j.f622c;
            int m781b = p044L.AbstractC0352j.m781b(i6);
            i4 = (m781b == 0 || m781b == 1) ? 104 : (m781b == 3 || m781b == 4 || m781b == 5) ? 100 : 102;
            f4 = f5;
            i5 = i6;
            j4 = j5;
        } else {
            j4 = 0;
            f4 = 0.0f;
            i4 = 102;
        }
        java.util.List<java.lang.String> providers = this.f611a.getProviders(true);
        if (i5 == 1) {
            str = "passive";
        } else {
            str = "fused";
            if (!providers.contains("fused") || android.os.Build.VERSION.SDK_INT < 31) {
                str = "gps";
                if (!providers.contains("gps")) {
                    str = "network";
                    if (!providers.contains("network")) {
                        str = !providers.isEmpty() ? providers.get(0) : null;
                    }
                }
            }
        }
        this.f617g = str;
        if (str == null) {
            interfaceC0195a.mo530c(3);
            return;
        }
        p006B.AbstractC0021d.m61a("intervalMillis", j4);
        if (f4 < 0.0f) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "%s is out of range of [%f, %f] (too low)", "minUpdateDistanceMeters", java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(Float.MAX_VALUE)));
        }
        if (f4 > Float.MAX_VALUE) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "%s is out of range of [%f, %f] (too high)", "minUpdateDistanceMeters", java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(Float.MAX_VALUE)));
        }
        p006B.AbstractC0021d.m61a("minUpdateIntervalMillis", j4);
        boolean z4 = i4 == 104 || i4 == 102 || i4 == 100;
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i4)};
        if (!z4) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("quality must be a defined QUALITY constant, not %d", objArr));
        }
        if (j4 == Long.MAX_VALUE && j4 == -1) {
            throw new java.lang.IllegalStateException("passive location requests must have an explicit minimum update interval");
        }
        p210x.C2366b c2366b = new p210x.C2366b(j4, i4, java.lang.Math.min(j4, j4), f4);
        this.f615e = true;
        this.f612b.m608b();
        java.lang.String str2 = this.f617g;
        android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        int i7 = p210x.AbstractC2365a.f9318a;
        int i8 = android.os.Build.VERSION.SDK_INT;
        android.location.LocationManager locationManager = this.f611a;
        if (i8 >= 31) {
            p183r.AbstractC2037e.m4094b(locationManager, str2, p183r.AbstractC2037e.m4096d(c2366b), new p214y.ExecutorC2379a(new android.os.Handler(mainLooper), 0), this);
            return;
        }
        try {
            if (p196u.AbstractC2213h.f8829a == null) {
                p196u.AbstractC2213h.f8829a = java.lang.Class.forName("android.location.LocationRequest");
            }
            if (p196u.AbstractC2213h.f8830b == null) {
                java.lang.reflect.Method declaredMethod = android.location.LocationManager.class.getDeclaredMethod("requestLocationUpdates", p196u.AbstractC2213h.f8829a, android.location.LocationListener.class, android.os.Looper.class);
                p196u.AbstractC2213h.f8830b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            android.location.LocationRequest m4575a = c2366b.m4575a(str2);
            if (m4575a != null) {
                p196u.AbstractC2213h.f8830b.invoke(locationManager, m4575a, this, mainLooper);
                return;
            }
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.UnsupportedOperationException | java.lang.reflect.InvocationTargetException unused) {
        }
        locationManager.requestLocationUpdates(str2, c2366b.f9320b, c2366b.f9322d, this, mainLooper);
    }

    @Override // p025F1.InterfaceC0216h
    /* renamed from: c */
    public final boolean mo573c(int i4, int i5) {
        return false;
    }

    @Override // p025F1.InterfaceC0216h
    /* renamed from: d */
    public final void mo574d() {
        android.location.LocationManager locationManager;
        this.f615e = false;
        p025F1.C0222n c0222n = this.f612b;
        if (c0222n.f630c != null && (locationManager = c0222n.f629b) != null) {
            locationManager.removeNmeaListener(c0222n.f631d);
            locationManager.unregisterGnssStatusCallback(c0222n.f632e);
            c0222n.f637j = false;
        }
        this.f611a.removeUpdates(this);
    }

    @Override // p025F1.InterfaceC0216h
    /* renamed from: f */
    public final void mo575f(p009B2.C0061r c0061r) {
        if (this.f611a == null) {
            ((p043K2.C0335k) c0061r.f188m).mo742b(java.lang.Boolean.FALSE);
        } else {
            ((p043K2.C0335k) c0061r.f188m).mo742b(java.lang.Boolean.valueOf(p025F1.InterfaceC0216h.m604e(this.f614d)));
        }
    }

    @Override // android.location.LocationListener
    public final void onFlushComplete(int i4) {
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(java.util.List list) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            onLocationChanged((android.location.Location) list.get(i4));
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(java.lang.String str) {
        if (str.equals(this.f617g)) {
            if (this.f615e) {
                this.f611a.removeUpdates(this);
            }
            p022E1.InterfaceC0195a interfaceC0195a = this.f619i;
            if (interfaceC0195a != null) {
                interfaceC0195a.mo530c(3);
            }
            this.f617g = null;
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(java.lang.String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(java.lang.String str, int i4, android.os.Bundle bundle) {
        if (i4 != 2 && i4 == 0) {
            onProviderDisabled(str);
        }
    }

    @Override // android.location.LocationListener
    public final synchronized void onLocationChanged(android.location.Location location) {
        if (m605g(location, this.f616f)) {
            this.f616f = location;
            if (this.f618h != null) {
                this.f612b.m607a(location);
                this.f618h.mo529a(this.f616f);
            }
        }
    }
}
