package p017D1;

/* renamed from: D1.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0168a implements p025F1.InterfaceC0223o, p022E1.InterfaceC0195a {

    /* renamed from: a */
    public final /* synthetic */ int f447a;

    /* renamed from: b */
    public final /* synthetic */ p047L2.C0378h f448b;

    public /* synthetic */ C0168a(p047L2.C0378h c0378h, int i4) {
        this.f447a = i4;
        this.f448b = c0378h;
    }

    @Override // p025F1.InterfaceC0223o
    /* renamed from: a */
    public void mo529a(android.location.Location location) {
        p047L2.C0378h c0378h = this.f448b;
        switch (this.f447a) {
            case 0:
                int i4 = com.baseflow.geolocator.GeolocatorLocationService.f4882v;
                c0378h.m830c(p080U1.AbstractC0748a.m1360H(location));
                return;
            default:
                c0378h.m830c(p080U1.AbstractC0748a.m1360H(location));
                return;
        }
    }

    @Override // p022E1.InterfaceC0195a
    /* renamed from: c */
    public void mo530c(int i4) {
        p047L2.C0378h c0378h = this.f448b;
        switch (this.f447a) {
            case 1:
                int i5 = com.baseflow.geolocator.GeolocatorLocationService.f4882v;
                c0378h.m829b(p009B2.AbstractC0051h.m147f(i4), p009B2.AbstractC0051h.m146e(i4), null);
                return;
            default:
                c0378h.m829b(p009B2.AbstractC0051h.m147f(i4), p009B2.AbstractC0051h.m146e(i4), null);
                return;
        }
    }
}
