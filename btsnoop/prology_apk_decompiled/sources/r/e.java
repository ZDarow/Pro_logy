package r;

import android.app.Notification;
import android.location.Location;
import android.location.LocationManager;
import android.location.LocationRequest;
import x.C0610b;
import y.ExecutorC0614a;

/* loaded from: classes.dex */
public abstract class e {
    public static boolean a(Location location) {
        return location.isMock();
    }

    public static void b(LocationManager locationManager, String str, LocationRequest locationRequest, ExecutorC0614a executorC0614a, F1.i iVar) {
        locationManager.requestLocationUpdates(str, locationRequest, executorC0614a, iVar);
    }

    public static void c(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    public static LocationRequest d(C0610b c0610b) {
        LocationRequest.Builder quality = new LocationRequest.Builder(c0610b.f8961b).setQuality(c0610b.f8960a);
        long j4 = c0610b.f8962c;
        if (j4 == -1) {
            j4 = c0610b.f8961b;
        }
        return quality.setMinUpdateIntervalMillis(j4).setDurationMillis(Long.MAX_VALUE).setMaxUpdates(Integer.MAX_VALUE).setMinUpdateDistanceMeters(c0610b.f8963d).setMaxUpdateDelayMillis(0L).build();
    }
}
