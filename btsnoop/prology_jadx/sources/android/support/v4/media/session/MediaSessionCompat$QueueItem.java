package android.support.v4.media.session;

@android.annotation.SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaSessionCompat$QueueItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.session.MediaSessionCompat$QueueItem> CREATOR = new android.support.v4.media.session.C1060s(1);

    /* renamed from: l */
    public final android.support.v4.media.MediaDescriptionCompat f3795l;

    /* renamed from: m */
    public final long f3796m;

    /* renamed from: n */
    public android.media.session.MediaSession.QueueItem f3797n;

    public MediaSessionCompat$QueueItem(android.media.session.MediaSession.QueueItem queueItem, android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat, long j4) {
        if (mediaDescriptionCompat == null) {
            throw new java.lang.IllegalArgumentException("Description cannot be null");
        }
        if (j4 != -1) {
            this.f3795l = mediaDescriptionCompat;
            this.f3796m = j4;
            this.f3797n = queueItem;
            return;
        }
        throw new java.lang.IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        return "MediaSession.QueueItem {Description=" + this.f3795l + ", Id=" + this.f3796m + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        this.f3795l.writeToParcel(parcel, i4);
        parcel.writeLong(this.f3796m);
    }

    public MediaSessionCompat$QueueItem(android.os.Parcel parcel) {
        this.f3795l = android.support.v4.media.MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.f3796m = parcel.readLong();
    }
}
