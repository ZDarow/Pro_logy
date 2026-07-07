package F1;

import android.location.GnssStatus;

/* loaded from: classes.dex */
public final class m extends GnssStatus.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f617a;

    public m(n nVar) {
        this.f617a = nVar;
    }

    @Override // android.location.GnssStatus.Callback
    public final void onSatelliteStatusChanged(GnssStatus gnssStatus) {
        double satelliteCount = gnssStatus.getSatelliteCount();
        n nVar = this.f617a;
        nVar.f624g = satelliteCount;
        nVar.f625h = 0.0d;
        for (int i4 = 0; i4 < nVar.f624g; i4++) {
            if (gnssStatus.usedInFix(i4)) {
                nVar.f625h += 1.0d;
            }
        }
    }
}
