package p008B1;

/* renamed from: B1.c */
/* loaded from: classes.dex */
public final class C0025c implements android.location.Geocoder$GeocodeListener {

    /* renamed from: a */
    public final /* synthetic */ int f94a;

    /* renamed from: b */
    public final /* synthetic */ p008B1.InterfaceC0023a f95b;

    public /* synthetic */ C0025c(p008B1.InterfaceC0023a interfaceC0023a, int i4) {
        this.f94a = i4;
        this.f95b = interfaceC0023a;
    }

    public final void onError(java.lang.String str) {
        switch (this.f94a) {
            case 0:
                this.f95b.onError(str);
                return;
            default:
                ((p008B1.C0029g) this.f95b).onError(str);
                return;
        }
    }

    public final void onGeocode(java.util.List list) {
        switch (this.f94a) {
            case 0:
                this.f95b.onGeocode(list);
                return;
            default:
                ((p008B1.C0029g) this.f95b).onGeocode(list);
                return;
        }
    }
}
