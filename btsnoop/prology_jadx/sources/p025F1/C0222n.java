package p025F1;

/* renamed from: F1.n */
/* loaded from: classes.dex */
public final class C0222n {

    /* renamed from: a */
    public final android.content.Context f628a;

    /* renamed from: b */
    public final android.location.LocationManager f629b;

    /* renamed from: c */
    public final p025F1.C0218j f630c;

    /* renamed from: f */
    public java.lang.String f633f;

    /* renamed from: g */
    public double f634g;

    /* renamed from: h */
    public double f635h;

    /* renamed from: i */
    public java.util.Calendar f636i;

    /* renamed from: j */
    public boolean f637j = false;

    /* renamed from: d */
    public final p025F1.C0220l f631d = new android.location.OnNmeaMessageListener() { // from class: F1.l
        @Override // android.location.OnNmeaMessageListener
        public final void onNmeaMessage(java.lang.String str, long j4) {
            p025F1.C0222n c0222n = p025F1.C0222n.this;
            c0222n.getClass();
            if (str.trim().matches("^\\$..GGA.*$")) {
                c0222n.f633f = str;
                c0222n.f636i = java.util.Calendar.getInstance();
            }
        }
    };

    /* renamed from: e */
    public final p025F1.C0221m f632e = new p025F1.C0221m(this);

    /* JADX WARN: Type inference failed for: r2v3, types: [F1.l] */
    public C0222n(android.content.Context context, p025F1.C0218j c0218j) {
        this.f628a = context;
        this.f630c = c0218j;
        this.f629b = (android.location.LocationManager) context.getSystemService("location");
    }

    /* renamed from: a */
    public final void m607a(android.location.Location location) {
        p025F1.C0218j c0218j;
        if (location == null) {
            return;
        }
        if (location.getExtras() == null) {
            location.setExtras(android.os.Bundle.EMPTY);
        }
        location.getExtras().putDouble("geolocator_mslSatelliteCount", this.f634g);
        location.getExtras().putDouble("geolocator_mslSatellitesUsedInFix", this.f635h);
        if (this.f633f == null || (c0218j = this.f630c) == null || !this.f637j) {
            return;
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.add(13, -5);
        java.util.Calendar calendar2 = this.f636i;
        if ((calendar2 == null || !calendar2.before(calendar)) && c0218j.f623d) {
            java.lang.String[] split = this.f633f.split(",");
            java.lang.String str = split[0];
            if (!this.f633f.trim().matches("^\\$..GGA.*$") || split.length <= 9 || split[9].isEmpty()) {
                return;
            }
            double parseDouble = java.lang.Double.parseDouble(split[9]);
            if (location.getExtras() == null) {
                location.setExtras(android.os.Bundle.EMPTY);
            }
            location.getExtras().putDouble("geolocator_mslAltitude", parseDouble);
        }
    }

    /* renamed from: b */
    public final void m608b() {
        android.location.LocationManager locationManager;
        if (this.f637j || this.f630c == null || (locationManager = this.f629b) == null || this.f628a.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
            return;
        }
        locationManager.addNmeaListener(this.f631d, (android.os.Handler) null);
        locationManager.registerGnssStatusCallback(this.f632e, (android.os.Handler) null);
        this.f637j = true;
    }
}
