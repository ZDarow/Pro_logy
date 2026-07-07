package android.support.v4.media.session;

@android.annotation.SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.session.ParcelableVolumeInfo> CREATOR = new android.support.v4.media.session.C1060s(3);

    /* renamed from: l */
    public int f3803l;

    /* renamed from: m */
    public int f3804m;

    /* renamed from: n */
    public int f3805n;

    /* renamed from: o */
    public int f3806o;

    /* renamed from: p */
    public int f3807p;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeInt(this.f3803l);
        parcel.writeInt(this.f3805n);
        parcel.writeInt(this.f3806o);
        parcel.writeInt(this.f3807p);
        parcel.writeInt(this.f3804m);
    }
}
