package p096Y1;

/* renamed from: Y1.f */
/* loaded from: classes.dex */
public final class BinderC0895f extends p088W1.AbstractBinderC0816b {

    /* renamed from: d */
    public final /* synthetic */ java.lang.Boolean f3196d;

    /* renamed from: e */
    public final /* synthetic */ p119d2.C1285d f3197e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0895f(java.lang.Boolean bool, p119d2.C1285d c1285d) {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 0);
        this.f3196d = bool;
        this.f3197e = c1285d;
    }

    @Override // p088W1.AbstractBinderC0816b
    /* renamed from: l0 */
    public final boolean mo1659l0(int i4, android.os.Parcel parcel, android.os.Parcel parcel2) {
        if (i4 != 1) {
            return false;
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) p088W1.AbstractC0817c.m1661a(parcel, com.google.android.gms.common.api.Status.CREATOR);
        p088W1.AbstractC0817c.m1662b(parcel);
        p080U1.AbstractC0748a.m1355C(status, this.f3196d, this.f3197e);
        return true;
    }
}
