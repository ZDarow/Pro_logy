package android.support.v4.media.session;

@android.annotation.SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class MediaSessionCompat$ResultReceiverWrapper implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper> CREATOR = new android.support.v4.media.session.C1060s(0);

    /* renamed from: l */
    public android.os.ResultReceiver f3798l;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        this.f3798l.writeToParcel(parcel, i4);
    }
}
