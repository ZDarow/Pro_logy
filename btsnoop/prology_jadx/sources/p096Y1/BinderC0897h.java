package p096Y1;

/* renamed from: Y1.h */
/* loaded from: classes.dex */
public final class BinderC0897h extends p088W1.AbstractBinderC0816b implements p104a2.InterfaceC1014l {

    /* renamed from: e */
    public static final /* synthetic */ int f3199e = 0;

    /* renamed from: d */
    public final p096Y1.C0890a f3200d;

    public BinderC0897h(p096Y1.C0890a c0890a) {
        super("com.google.android.gms.location.ILocationCallback", 2);
        this.f3200d = c0890a;
    }

    @Override // p088W1.AbstractBinderC0816b
    /* renamed from: n0 */
    public final boolean mo1660n0(android.os.Parcel parcel, int i4) {
        p096Y1.C0890a c0890a = this.f3200d;
        if (i4 == 1) {
            com.google.android.gms.location.LocationResult locationResult = (com.google.android.gms.location.LocationResult) p096Y1.AbstractC0892c.m1734a(parcel, com.google.android.gms.location.LocationResult.CREATOR);
            p096Y1.AbstractC0892c.m1736c(parcel);
            c0890a.m1730d().m959a(new p043K2.C0339o(18, locationResult));
        } else if (i4 == 2) {
            com.google.android.gms.location.LocationAvailability locationAvailability = (com.google.android.gms.location.LocationAvailability) p096Y1.AbstractC0892c.m1734a(parcel, com.google.android.gms.location.LocationAvailability.CREATOR);
            p096Y1.AbstractC0892c.m1736c(parcel);
            c0890a.m1730d().m959a(new p043K2.C0339o(19, locationAvailability));
        } else {
            if (i4 != 3) {
                return false;
            }
            m1739o0();
        }
        return true;
    }

    /* renamed from: o0 */
    public final void m1739o0() {
        this.f3200d.m1730d().m959a(new p043K2.C0339o(20, this));
    }
}
