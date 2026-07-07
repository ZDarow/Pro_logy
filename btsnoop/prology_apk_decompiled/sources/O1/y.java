package O1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class y extends P1.a {
    public static final Parcelable.Creator<y> CREATOR = new O0.g(8);

    /* renamed from: l, reason: collision with root package name */
    public Bundle f1487l;

    /* renamed from: m, reason: collision with root package name */
    public L1.c[] f1488m;

    /* renamed from: n, reason: collision with root package name */
    public int f1489n;

    /* renamed from: o, reason: collision with root package name */
    public C0064d f1490o;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int X3 = AbstractC0462a.X(parcel, 20293);
        Bundle bundle = this.f1487l;
        if (bundle != null) {
            int X4 = AbstractC0462a.X(parcel, 1);
            parcel.writeBundle(bundle);
            AbstractC0462a.Y(parcel, X4);
        }
        AbstractC0462a.U(parcel, 2, this.f1488m, i4);
        AbstractC0462a.a0(parcel, 3, 4);
        parcel.writeInt(this.f1489n);
        AbstractC0462a.S(parcel, 4, this.f1490o, i4);
        AbstractC0462a.Y(parcel, X3);
    }
}
