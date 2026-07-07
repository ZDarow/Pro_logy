package D1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.baseflow.geolocator.GeolocatorLocationService;

/* loaded from: classes.dex */
public final class c implements ServiceConnection {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f442l;

    public c(d dVar) {
        this.f442l = dVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder instanceof b) {
            GeolocatorLocationService geolocatorLocationService = ((b) iBinder).f441c;
            d dVar = this.f442l;
            dVar.f446o = geolocatorLocationService;
            geolocatorLocationService.f4718q = dVar.f444m;
            geolocatorLocationService.f4715n++;
            Log.d("FlutterGeolocator", "Flutter engine connected. Connected engine count " + geolocatorLocationService.f4715n);
            g gVar = dVar.f448q;
            if (gVar != null) {
                gVar.f463q = geolocatorLocationService;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        d dVar = this.f442l;
        GeolocatorLocationService geolocatorLocationService = dVar.f446o;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.f4717p = null;
            dVar.f446o = null;
        }
    }
}
