package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new s(2);

    /* renamed from: m, reason: collision with root package name */
    public final Object f3675m;

    /* renamed from: n, reason: collision with root package name */
    public d f3676n;

    /* renamed from: l, reason: collision with root package name */
    public final Object f3674l = new Object();

    /* renamed from: o, reason: collision with root package name */
    public p1.d f3677o = null;

    public MediaSessionCompat$Token(Object obj, d dVar) {
        this.f3675m = obj;
        this.f3676n = dVar;
    }

    public final d d() {
        d dVar;
        synchronized (this.f3674l) {
            dVar = this.f3676n;
        }
        return dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
        Object obj2 = this.f3675m;
        if (obj2 == null) {
            return mediaSessionCompat$Token.f3675m == null;
        }
        Object obj3 = mediaSessionCompat$Token.f3675m;
        if (obj3 == null) {
            return false;
        }
        return obj2.equals(obj3);
    }

    public final int hashCode() {
        Object obj = this.f3675m;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable((Parcelable) this.f3675m, i4);
    }
}
