package k1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class H implements Parcelable {
    public static final Parcelable.Creator<H> CREATOR = new a2.g(14);

    /* renamed from: l, reason: collision with root package name */
    public int f6954l;

    /* renamed from: m, reason: collision with root package name */
    public int f6955m;

    /* renamed from: n, reason: collision with root package name */
    public int f6956n;

    /* renamed from: o, reason: collision with root package name */
    public int[] f6957o;

    /* renamed from: p, reason: collision with root package name */
    public int f6958p;

    /* renamed from: q, reason: collision with root package name */
    public int[] f6959q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f6960r;
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6961t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6962u;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f6954l);
        parcel.writeInt(this.f6955m);
        parcel.writeInt(this.f6956n);
        if (this.f6956n > 0) {
            parcel.writeIntArray(this.f6957o);
        }
        parcel.writeInt(this.f6958p);
        if (this.f6958p > 0) {
            parcel.writeIntArray(this.f6959q);
        }
        parcel.writeInt(this.s ? 1 : 0);
        parcel.writeInt(this.f6961t ? 1 : 0);
        parcel.writeInt(this.f6962u ? 1 : 0);
        parcel.writeList(this.f6960r);
    }
}
