package D1;

import B2.AbstractC0007h;
import F1.o;
import L2.h;
import android.location.Location;
import com.baseflow.geolocator.GeolocatorLocationService;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements o, E1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f439a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f440b;

    public /* synthetic */ a(h hVar, int i4) {
        this.f439a = i4;
        this.f440b = hVar;
    }

    @Override // F1.o
    public void a(Location location) {
        h hVar = this.f440b;
        switch (this.f439a) {
            case 0:
                int i4 = GeolocatorLocationService.f4712v;
                hVar.c(U1.a.H(location));
                return;
            default:
                hVar.c(U1.a.H(location));
                return;
        }
    }

    @Override // E1.a
    public void c(int i4) {
        h hVar = this.f440b;
        switch (this.f439a) {
            case 1:
                int i5 = GeolocatorLocationService.f4712v;
                hVar.b(AbstractC0007h.f(i4), AbstractC0007h.e(i4), null);
                return;
            default:
                hVar.b(AbstractC0007h.f(i4), AbstractC0007h.e(i4), null);
                return;
        }
    }
}
