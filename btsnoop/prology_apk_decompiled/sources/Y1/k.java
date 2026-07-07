package Y1;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class k extends P1.a {
    public static final Parcelable.Creator<k> CREATOR = new O0.g(19);

    /* renamed from: l, reason: collision with root package name */
    public final int f3099l;

    /* renamed from: m, reason: collision with root package name */
    public final IBinder f3100m;

    /* renamed from: n, reason: collision with root package name */
    public final IBinder f3101n;

    /* renamed from: o, reason: collision with root package name */
    public final PendingIntent f3102o;

    /* renamed from: p, reason: collision with root package name */
    public final String f3103p;

    public k(int i4, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.f3099l = i4;
        this.f3100m = iBinder;
        this.f3101n = iBinder2;
        this.f3102o = pendingIntent;
        this.f3103p = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int X3 = AbstractC0462a.X(parcel, 20293);
        AbstractC0462a.a0(parcel, 1, 4);
        parcel.writeInt(this.f3099l);
        AbstractC0462a.R(parcel, 2, this.f3100m);
        AbstractC0462a.R(parcel, 3, this.f3101n);
        AbstractC0462a.S(parcel, 4, this.f3102o, i4);
        AbstractC0462a.T(parcel, 6, this.f3103p);
        AbstractC0462a.Y(parcel, X3);
    }
}
