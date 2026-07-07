package p096Y1;

/* renamed from: Y1.v */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0911v extends p088W1.AbstractBinderC0816b implements p096Y1.InterfaceC0912w {
    public AbstractBinderC0911v() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 2);
    }

    @Override // p088W1.AbstractBinderC0816b
    /* renamed from: n0 */
    public final boolean mo1660n0(android.os.Parcel parcel, int i4) {
        if (i4 == 1) {
            p096Y1.C0909t c0909t = (p096Y1.C0909t) p096Y1.AbstractC0892c.m1734a(parcel, p096Y1.C0909t.CREATOR);
            p096Y1.AbstractC0892c.m1736c(parcel);
            mo1738j(c0909t);
        } else {
            if (i4 != 2) {
                return false;
            }
            mo1737h0();
        }
        return true;
    }
}
