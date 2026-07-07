package O1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class o extends P1.a {
    public static final Parcelable.Creator<o> CREATOR = new O0.g(6);

    /* renamed from: l, reason: collision with root package name */
    public final int f1464l;

    /* renamed from: m, reason: collision with root package name */
    public final IBinder f1465m;

    /* renamed from: n, reason: collision with root package name */
    public final L1.a f1466n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1467o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f1468p;

    public o(int i4, IBinder iBinder, L1.a aVar, boolean z4, boolean z5) {
        this.f1464l = i4;
        this.f1465m = iBinder;
        this.f1466n = aVar;
        this.f1467o = z4;
        this.f1468p = z5;
    }

    public final boolean equals(Object obj) {
        Object d4;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f1466n.equals(oVar.f1466n)) {
            Object obj2 = null;
            IBinder iBinder = this.f1465m;
            if (iBinder == null) {
                d4 = null;
            } else {
                int i4 = AbstractBinderC0061a.f1413d;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                d4 = queryLocalInterface instanceof f ? (f) queryLocalInterface : new D(iBinder);
            }
            IBinder iBinder2 = oVar.f1465m;
            if (iBinder2 != null) {
                int i5 = AbstractBinderC0061a.f1413d;
                IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                obj2 = queryLocalInterface2 instanceof f ? (f) queryLocalInterface2 : new D(iBinder2);
            }
            if (s.f(d4, obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int X3 = AbstractC0462a.X(parcel, 20293);
        AbstractC0462a.a0(parcel, 1, 4);
        parcel.writeInt(this.f1464l);
        AbstractC0462a.R(parcel, 2, this.f1465m);
        AbstractC0462a.S(parcel, 3, this.f1466n, i4);
        AbstractC0462a.a0(parcel, 4, 4);
        parcel.writeInt(this.f1467o ? 1 : 0);
        AbstractC0462a.a0(parcel, 5, 4);
        parcel.writeInt(this.f1468p ? 1 : 0);
        AbstractC0462a.Y(parcel, X3);
    }
}
