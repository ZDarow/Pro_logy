package F1;

import B2.AbstractActivityC0003d;
import B2.r;
import android.content.Context;
import android.location.LocationManager;

/* loaded from: classes.dex */
public interface h {
    static boolean e(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }

    void a(D1.f fVar, D1.f fVar2);

    void b(AbstractActivityC0003d abstractActivityC0003d, o oVar, E1.a aVar);

    boolean c(int i4, int i5);

    void d();

    void f(r rVar);
}
