package p025F1;

/* renamed from: F1.k */
/* loaded from: classes.dex */
public final class C0219k extends android.content.BroadcastReceiver {

    /* renamed from: a */
    public final p047L2.C0378h f624a;

    /* renamed from: b */
    public int f625b;

    public C0219k(p047L2.C0378h c0378h) {
        this.f624a = c0378h;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if ("android.location.PROVIDERS_CHANGED".equals(intent.getAction())) {
            android.location.LocationManager locationManager = (android.location.LocationManager) context.getSystemService("location");
            boolean isProviderEnabled = locationManager.isProviderEnabled("gps");
            boolean isProviderEnabled2 = locationManager.isProviderEnabled("network");
            p047L2.C0378h c0378h = this.f624a;
            if (isProviderEnabled || isProviderEnabled2) {
                int i4 = this.f625b;
                if (i4 == 0 || i4 == 1) {
                    this.f625b = 2;
                    c0378h.m830c(1);
                    return;
                }
                return;
            }
            int i5 = this.f625b;
            if (i5 == 0 || i5 == 2) {
                this.f625b = 1;
                c0378h.m830c(0);
            }
        }
    }
}
