package O1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class j extends P1.a {
    public static final Parcelable.Creator<j> CREATOR = new O0.g(3);

    /* renamed from: l, reason: collision with root package name */
    public final int f1452l;

    /* renamed from: m, reason: collision with root package name */
    public List f1453m;

    public j(int i4, List list) {
        this.f1452l = i4;
        this.f1453m = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int X3 = AbstractC0462a.X(parcel, 20293);
        AbstractC0462a.a0(parcel, 1, 4);
        parcel.writeInt(this.f1452l);
        AbstractC0462a.V(parcel, 2, this.f1453m);
        AbstractC0462a.Y(parcel, X3);
    }
}
