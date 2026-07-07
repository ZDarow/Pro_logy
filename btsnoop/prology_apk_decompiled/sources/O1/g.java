package O1;

import android.os.Parcel;
import android.os.Parcelable;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class g extends P1.a {
    public static final Parcelable.Creator<g> CREATOR = new O0.g(4);

    /* renamed from: l, reason: collision with root package name */
    public final int f1436l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1437m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1438n;

    /* renamed from: o, reason: collision with root package name */
    public final long f1439o;

    /* renamed from: p, reason: collision with root package name */
    public final long f1440p;

    /* renamed from: q, reason: collision with root package name */
    public final String f1441q;

    /* renamed from: r, reason: collision with root package name */
    public final String f1442r;
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1443t;

    public g(int i4, int i5, int i6, long j4, long j5, String str, String str2, int i7, int i8) {
        this.f1436l = i4;
        this.f1437m = i5;
        this.f1438n = i6;
        this.f1439o = j4;
        this.f1440p = j5;
        this.f1441q = str;
        this.f1442r = str2;
        this.s = i7;
        this.f1443t = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int X3 = AbstractC0462a.X(parcel, 20293);
        AbstractC0462a.a0(parcel, 1, 4);
        parcel.writeInt(this.f1436l);
        AbstractC0462a.a0(parcel, 2, 4);
        parcel.writeInt(this.f1437m);
        AbstractC0462a.a0(parcel, 3, 4);
        parcel.writeInt(this.f1438n);
        AbstractC0462a.a0(parcel, 4, 8);
        parcel.writeLong(this.f1439o);
        AbstractC0462a.a0(parcel, 5, 8);
        parcel.writeLong(this.f1440p);
        AbstractC0462a.T(parcel, 6, this.f1441q);
        AbstractC0462a.T(parcel, 7, this.f1442r);
        AbstractC0462a.a0(parcel, 8, 4);
        parcel.writeInt(this.s);
        AbstractC0462a.a0(parcel, 9, 4);
        parcel.writeInt(this.f1443t);
        AbstractC0462a.Y(parcel, X3);
    }
}
