package p096Y1;

/* renamed from: Y1.e */
/* loaded from: classes.dex */
public final class BinderC0894e extends p088W1.AbstractBinderC0816b {

    /* renamed from: d */
    public final /* synthetic */ int f3194d;

    /* renamed from: e */
    public final /* synthetic */ p119d2.C1285d f3195e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0894e(int i4, p119d2.C1285d c1285d) {
        super("com.google.android.gms.location.internal.ISettingsCallbacks", 2);
        this.f3194d = i4;
        switch (i4) {
            case 1:
                this.f3195e = c1285d;
                super("com.google.android.gms.location.internal.ILocationStatusCallback", 2);
                return;
            default:
                this.f3195e = c1285d;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, a2.d] */
    @Override // p088W1.AbstractBinderC0816b
    /* renamed from: n0 */
    public final boolean mo1660n0(android.os.Parcel parcel, int i4) {
        switch (this.f3194d) {
            case 0:
                if (i4 != 1) {
                    return false;
                }
                p104a2.C1007e c1007e = (p104a2.C1007e) p096Y1.AbstractC0892c.m1734a(parcel, p104a2.C1007e.CREATOR);
                p096Y1.AbstractC0892c.m1736c(parcel);
                com.google.android.gms.common.api.Status status = c1007e.f3731l;
                ?? obj = new java.lang.Object();
                obj.f3730a = c1007e;
                p080U1.AbstractC0748a.m1355C(status, obj, this.f3195e);
                return true;
            default:
                if (i4 != 1) {
                    return false;
                }
                com.google.android.gms.common.api.Status status2 = (com.google.android.gms.common.api.Status) p096Y1.AbstractC0892c.m1734a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                android.location.Location location = (android.location.Location) p096Y1.AbstractC0892c.m1734a(parcel, android.location.Location.CREATOR);
                p096Y1.AbstractC0892c.m1736c(parcel);
                p080U1.AbstractC0748a.m1355C(status2, location, this.f3195e);
                return true;
        }
    }
}
