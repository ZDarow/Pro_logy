package android.support.v4.media.session;

/* renamed from: android.support.v4.media.session.s */
/* loaded from: classes.dex */
public final class C1060s implements android.os.Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f3857a;

    /* JADX WARN: Type inference failed for: r0v1, types: [android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.support.v4.media.session.ParcelableVolumeInfo, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        switch (this.f3857a) {
            case 0:
                ?? obj = new java.lang.Object();
                obj.f3798l = (android.os.ResultReceiver) android.os.ResultReceiver.CREATOR.createFromParcel(parcel);
                return obj;
            case 1:
                return new android.support.v4.media.session.MediaSessionCompat$QueueItem(parcel);
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return new android.support.v4.media.session.MediaSessionCompat$Token(parcel.readParcelable(null), null);
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                ?? obj2 = new java.lang.Object();
                obj2.f3803l = parcel.readInt();
                obj2.f3805n = parcel.readInt();
                obj2.f3806o = parcel.readInt();
                obj2.f3807p = parcel.readInt();
                obj2.f3804m = parcel.readInt();
                return obj2;
            default:
                return new android.support.v4.media.session.PlaybackStateCompat(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i4) {
        switch (this.f3857a) {
            case 0:
                return new android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper[i4];
            case 1:
                return new android.support.v4.media.session.MediaSessionCompat$QueueItem[i4];
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return new android.support.v4.media.session.MediaSessionCompat$Token[i4];
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                return new android.support.v4.media.session.ParcelableVolumeInfo[i4];
            default:
                return new android.support.v4.media.session.PlaybackStateCompat[i4];
        }
    }
}
