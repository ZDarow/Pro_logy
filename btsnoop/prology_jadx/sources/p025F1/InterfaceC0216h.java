package p025F1;

/* renamed from: F1.h */
/* loaded from: classes.dex */
public interface InterfaceC0216h {
    /* renamed from: e */
    static boolean m604e(android.content.Context context) {
        android.location.LocationManager locationManager = (android.location.LocationManager) context.getSystemService("location");
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }

    /* renamed from: a */
    void mo571a(p017D1.C0173f c0173f, p017D1.C0173f c0173f2);

    /* renamed from: b */
    void mo572b(p009B2.AbstractActivityC0047d abstractActivityC0047d, p025F1.InterfaceC0223o interfaceC0223o, p022E1.InterfaceC0195a interfaceC0195a);

    /* renamed from: c */
    boolean mo573c(int i4, int i5);

    /* renamed from: d */
    void mo574d();

    /* renamed from: f */
    void mo575f(p009B2.C0061r c0061r);
}
