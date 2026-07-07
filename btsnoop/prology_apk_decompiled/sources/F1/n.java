package F1;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.location.OnNmeaMessageListener;
import android.os.Bundle;
import android.os.Handler;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f618a;

    /* renamed from: b, reason: collision with root package name */
    public final LocationManager f619b;

    /* renamed from: c, reason: collision with root package name */
    public final j f620c;

    /* renamed from: f, reason: collision with root package name */
    public String f623f;

    /* renamed from: g, reason: collision with root package name */
    public double f624g;

    /* renamed from: h, reason: collision with root package name */
    public double f625h;

    /* renamed from: i, reason: collision with root package name */
    public Calendar f626i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f627j = false;

    /* renamed from: d, reason: collision with root package name */
    public final l f621d = new OnNmeaMessageListener() { // from class: F1.l
        @Override // android.location.OnNmeaMessageListener
        public final void onNmeaMessage(String str, long j4) {
            n nVar = n.this;
            nVar.getClass();
            if (str.trim().matches("^\\$..GGA.*$")) {
                nVar.f623f = str;
                nVar.f626i = Calendar.getInstance();
            }
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public final m f622e = new m(this);

    /* JADX WARN: Type inference failed for: r2v3, types: [F1.l] */
    public n(Context context, j jVar) {
        this.f618a = context;
        this.f620c = jVar;
        this.f619b = (LocationManager) context.getSystemService("location");
    }

    public final void a(Location location) {
        j jVar;
        if (location == null) {
            return;
        }
        if (location.getExtras() == null) {
            location.setExtras(Bundle.EMPTY);
        }
        location.getExtras().putDouble("geolocator_mslSatelliteCount", this.f624g);
        location.getExtras().putDouble("geolocator_mslSatellitesUsedInFix", this.f625h);
        if (this.f623f == null || (jVar = this.f620c) == null || !this.f627j) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(13, -5);
        Calendar calendar2 = this.f626i;
        if ((calendar2 == null || !calendar2.before(calendar)) && jVar.f613d) {
            String[] split = this.f623f.split(",");
            String str = split[0];
            if (!this.f623f.trim().matches("^\\$..GGA.*$") || split.length <= 9 || split[9].isEmpty()) {
                return;
            }
            double parseDouble = Double.parseDouble(split[9]);
            if (location.getExtras() == null) {
                location.setExtras(Bundle.EMPTY);
            }
            location.getExtras().putDouble("geolocator_mslAltitude", parseDouble);
        }
    }

    public final void b() {
        LocationManager locationManager;
        if (this.f627j || this.f620c == null || (locationManager = this.f619b) == null || this.f618a.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
            return;
        }
        locationManager.addNmeaListener(this.f621d, (Handler) null);
        locationManager.registerGnssStatusCallback(this.f622e, (Handler) null);
        this.f627j = true;
    }
}
