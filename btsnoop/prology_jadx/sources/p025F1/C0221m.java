package p025F1;

/* renamed from: F1.m */
/* loaded from: classes.dex */
public final class C0221m extends android.location.GnssStatus.Callback {

    /* renamed from: a */
    public final /* synthetic */ p025F1.C0222n f627a;

    public C0221m(p025F1.C0222n c0222n) {
        this.f627a = c0222n;
    }

    @Override // android.location.GnssStatus.Callback
    public final void onSatelliteStatusChanged(android.location.GnssStatus gnssStatus) {
        double satelliteCount = gnssStatus.getSatelliteCount();
        p025F1.C0222n c0222n = this.f627a;
        c0222n.f634g = satelliteCount;
        c0222n.f635h = 0.0d;
        for (int i4 = 0; i4 < c0222n.f634g; i4++) {
            if (gnssStatus.usedInFix(i4)) {
                c0222n.f635h += 1.0d;
            }
        }
    }
}
