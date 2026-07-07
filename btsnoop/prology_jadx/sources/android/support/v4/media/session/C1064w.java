package android.support.v4.media.session;

/* renamed from: android.support.v4.media.session.w */
/* loaded from: classes.dex */
public final class C1064w implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new android.support.v4.media.session.PlaybackStateCompat.CustomAction(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i4) {
        return new android.support.v4.media.session.PlaybackStateCompat.CustomAction[i4];
    }
}
