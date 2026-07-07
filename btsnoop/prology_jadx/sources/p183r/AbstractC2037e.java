package p183r;

/* renamed from: r.e */
/* loaded from: classes.dex */
public abstract class AbstractC2037e {
    /* renamed from: a */
    public static boolean m4093a(android.location.Location location) {
        return location.isMock();
    }

    /* renamed from: b */
    public static void m4094b(android.location.LocationManager locationManager, java.lang.String str, android.location.LocationRequest locationRequest, p214y.ExecutorC2379a executorC2379a, p025F1.C0217i c0217i) {
        locationManager.requestLocationUpdates(str, locationRequest, executorC2379a, c0217i);
    }

    /* renamed from: c */
    public static void m4095c(android.app.Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    /* renamed from: d */
    public static android.location.LocationRequest m4096d(p210x.C2366b c2366b) {
        android.location.LocationRequest.Builder quality = new android.location.LocationRequest.Builder(c2366b.f9320b).setQuality(c2366b.f9319a);
        long j4 = c2366b.f9321c;
        if (j4 == -1) {
            j4 = c2366b.f9320b;
        }
        return quality.setMinUpdateIntervalMillis(j4).setDurationMillis(Long.MAX_VALUE).setMaxUpdates(Integer.MAX_VALUE).setMinUpdateDistanceMeters(c2366b.f9322d).setMaxUpdateDelayMillis(0L).build();
    }
}
