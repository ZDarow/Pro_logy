package android.support.v4.media;

@android.annotation.SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class MediaBrowserCompat$MediaItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.MediaBrowserCompat$MediaItem> CREATOR = new p104a2.C1009g(2);

    /* renamed from: l */
    public final int f3758l;

    /* renamed from: m */
    public final android.support.v4.media.MediaDescriptionCompat f3759m;

    public MediaBrowserCompat$MediaItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat, int i4) {
        if (mediaDescriptionCompat != null) {
            if (!android.text.TextUtils.isEmpty(mediaDescriptionCompat.f3760l)) {
                this.f3758l = i4;
                this.f3759m = mediaDescriptionCompat;
                return;
            }
            throw new java.lang.IllegalArgumentException("description must have a non-empty media id");
        }
        throw new java.lang.IllegalArgumentException("description cannot be null");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        return "MediaItem{mFlags=" + this.f3758l + ", mDescription=" + this.f3759m + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeInt(this.f3758l);
        this.f3759m.writeToParcel(parcel, i4);
    }

    public MediaBrowserCompat$MediaItem(android.os.Parcel parcel) {
        this.f3758l = parcel.readInt();
        this.f3759m = android.support.v4.media.MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }
}
