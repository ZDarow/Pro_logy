package F1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;

/* loaded from: classes.dex */
public final class k extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final L2.h f614a;

    /* renamed from: b, reason: collision with root package name */
    public int f615b;

    public k(L2.h hVar) {
        this.f614a = hVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.location.PROVIDERS_CHANGED".equals(intent.getAction())) {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            boolean isProviderEnabled = locationManager.isProviderEnabled("gps");
            boolean isProviderEnabled2 = locationManager.isProviderEnabled("network");
            L2.h hVar = this.f614a;
            if (isProviderEnabled || isProviderEnabled2) {
                int i4 = this.f615b;
                if (i4 == 0 || i4 == 1) {
                    this.f615b = 2;
                    hVar.c(1);
                    return;
                }
                return;
            }
            int i5 = this.f615b;
            if (i5 == 0 || i5 == 2) {
                this.f615b = 1;
                hVar.c(0);
            }
        }
    }
}
