package B1;

import android.location.Geocoder$GeocodeListener;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements Geocoder$GeocodeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f92b;

    public /* synthetic */ c(a aVar, int i4) {
        this.f91a = i4;
        this.f92b = aVar;
    }

    public final void onError(String str) {
        switch (this.f91a) {
            case 0:
                this.f92b.onError(str);
                return;
            default:
                ((g) this.f92b).onError(str);
                return;
        }
    }

    public final void onGeocode(List list) {
        switch (this.f91a) {
            case 0:
                this.f92b.onGeocode(list);
                return;
            default:
                ((g) this.f92b).onGeocode(list);
                return;
        }
    }
}
