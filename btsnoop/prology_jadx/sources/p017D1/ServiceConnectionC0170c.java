package p017D1;

/* renamed from: D1.c */
/* loaded from: classes.dex */
public final class ServiceConnectionC0170c implements android.content.ServiceConnection {

    /* renamed from: l */
    public final /* synthetic */ p017D1.C0171d f450l;

    public ServiceConnectionC0170c(p017D1.C0171d c0171d) {
        this.f450l = c0171d;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        if (iBinder instanceof p017D1.BinderC0169b) {
            com.baseflow.geolocator.GeolocatorLocationService geolocatorLocationService = ((p017D1.BinderC0169b) iBinder).f449c;
            p017D1.C0171d c0171d = this.f450l;
            c0171d.f454o = geolocatorLocationService;
            geolocatorLocationService.f4888q = c0171d.f452m;
            geolocatorLocationService.f4885n++;
            android.util.Log.d("FlutterGeolocator", "Flutter engine connected. Connected engine count " + geolocatorLocationService.f4885n);
            p017D1.C0174g c0174g = c0171d.f456q;
            if (c0174g != null) {
                c0174g.f472q = geolocatorLocationService;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        p017D1.C0171d c0171d = this.f450l;
        com.baseflow.geolocator.GeolocatorLocationService geolocatorLocationService = c0171d.f454o;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.f4887p = null;
            c0171d.f454o = null;
        }
    }
}
