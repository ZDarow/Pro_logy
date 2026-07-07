package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a2.g(2);

    /* renamed from: l, reason: collision with root package name */
    public final int f3634l;

    /* renamed from: m, reason: collision with root package name */
    public final MediaDescriptionCompat f3635m;

    public MediaBrowserCompat$MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i4) {
        if (mediaDescriptionCompat != null) {
            if (!TextUtils.isEmpty(mediaDescriptionCompat.f3636l)) {
                this.f3634l = i4;
                this.f3635m = mediaDescriptionCompat;
                return;
            }
            throw new IllegalArgumentException("description must have a non-empty media id");
        }
        throw new IllegalArgumentException("description cannot be null");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.f3634l + ", mDescription=" + this.f3635m + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f3634l);
        this.f3635m.writeToParcel(parcel, i4);
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f3634l = parcel.readInt();
        this.f3635m = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }
}
