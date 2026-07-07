package android.support.v4.media.session;

@android.annotation.SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaSessionCompat$Token implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.session.MediaSessionCompat$Token> CREATOR = new android.support.v4.media.session.C1060s(2);

    /* renamed from: m */
    public final java.lang.Object f3800m;

    /* renamed from: n */
    public android.support.v4.media.session.InterfaceC1045d f3801n;

    /* renamed from: l */
    public final java.lang.Object f3799l = new java.lang.Object();

    /* renamed from: o */
    public p176p1.InterfaceC1952d f3802o = null;

    public MediaSessionCompat$Token(java.lang.Object obj, android.support.v4.media.session.InterfaceC1045d interfaceC1045d) {
        this.f3800m = obj;
        this.f3801n = interfaceC1045d;
    }

    /* renamed from: d */
    public final android.support.v4.media.session.InterfaceC1045d m2098d() {
        android.support.v4.media.session.InterfaceC1045d interfaceC1045d;
        synchronized (this.f3799l) {
            interfaceC1045d = this.f3801n;
        }
        return interfaceC1045d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof android.support.v4.media.session.MediaSessionCompat$Token)) {
            return false;
        }
        android.support.v4.media.session.MediaSessionCompat$Token mediaSessionCompat$Token = (android.support.v4.media.session.MediaSessionCompat$Token) obj;
        java.lang.Object obj2 = this.f3800m;
        if (obj2 == null) {
            return mediaSessionCompat$Token.f3800m == null;
        }
        java.lang.Object obj3 = mediaSessionCompat$Token.f3800m;
        if (obj3 == null) {
            return false;
        }
        return obj2.equals(obj3);
    }

    public final int hashCode() {
        java.lang.Object obj = this.f3800m;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeParcelable((android.os.Parcelable) this.f3800m, i4);
    }
}
