package O1;

import android.os.Parcel;
import android.os.Parcelable;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class i extends P1.a {
    public static final Parcelable.Creator<i> CREATOR = new O0.g(7);

    /* renamed from: l, reason: collision with root package name */
    public final int f1447l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f1448m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1449n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1450o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1451p;

    public i(int i4, boolean z4, boolean z5, int i5, int i6) {
        this.f1447l = i4;
        this.f1448m = z4;
        this.f1449n = z5;
        this.f1450o = i5;
        this.f1451p = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int X3 = AbstractC0462a.X(parcel, 20293);
        AbstractC0462a.a0(parcel, 1, 4);
        parcel.writeInt(this.f1447l);
        AbstractC0462a.a0(parcel, 2, 4);
        parcel.writeInt(this.f1448m ? 1 : 0);
        AbstractC0462a.a0(parcel, 3, 4);
        parcel.writeInt(this.f1449n ? 1 : 0);
        AbstractC0462a.a0(parcel, 4, 4);
        parcel.writeInt(this.f1450o);
        AbstractC0462a.a0(parcel, 5, 4);
        parcel.writeInt(this.f1451p);
        AbstractC0462a.Y(parcel, X3);
    }
}
