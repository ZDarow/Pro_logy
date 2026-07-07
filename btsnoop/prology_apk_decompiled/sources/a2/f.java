package a2;

import android.os.Parcel;
import android.os.Parcelable;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class f extends P1.a {
    public static final Parcelable.Creator<f> CREATOR = new g(0);

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3609l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f3610m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f3611n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f3612o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f3613p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f3614q;

    public f(boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f3609l = z4;
        this.f3610m = z5;
        this.f3611n = z6;
        this.f3612o = z7;
        this.f3613p = z8;
        this.f3614q = z9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int X3 = AbstractC0462a.X(parcel, 20293);
        AbstractC0462a.a0(parcel, 1, 4);
        parcel.writeInt(this.f3609l ? 1 : 0);
        AbstractC0462a.a0(parcel, 2, 4);
        parcel.writeInt(this.f3610m ? 1 : 0);
        AbstractC0462a.a0(parcel, 3, 4);
        parcel.writeInt(this.f3611n ? 1 : 0);
        AbstractC0462a.a0(parcel, 4, 4);
        parcel.writeInt(this.f3612o ? 1 : 0);
        AbstractC0462a.a0(parcel, 5, 4);
        parcel.writeInt(this.f3613p ? 1 : 0);
        AbstractC0462a.a0(parcel, 6, 4);
        parcel.writeInt(this.f3614q ? 1 : 0);
        AbstractC0462a.Y(parcel, X3);
    }
}
