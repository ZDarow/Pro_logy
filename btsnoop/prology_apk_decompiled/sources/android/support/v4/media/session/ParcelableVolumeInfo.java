package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new s(3);

    /* renamed from: l, reason: collision with root package name */
    public int f3678l;

    /* renamed from: m, reason: collision with root package name */
    public int f3679m;

    /* renamed from: n, reason: collision with root package name */
    public int f3680n;

    /* renamed from: o, reason: collision with root package name */
    public int f3681o;

    /* renamed from: p, reason: collision with root package name */
    public int f3682p;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f3678l);
        parcel.writeInt(this.f3680n);
        parcel.writeInt(this.f3681o);
        parcel.writeInt(this.f3682p);
        parcel.writeInt(this.f3679m);
    }
}
