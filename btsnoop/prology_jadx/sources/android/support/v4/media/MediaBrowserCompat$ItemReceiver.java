package android.support.v4.media;

/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends p111c.C1201d {
    @Override // p111c.C1201d
    /* renamed from: d */
    public final void mo2059d(int i4, android.os.Bundle bundle) {
        if (bundle != null) {
            bundle = android.support.v4.media.session.C1061t.m2198E0(bundle);
        }
        if (i4 != 0) {
            throw null;
        }
        if (bundle == null) {
            throw null;
        }
        if (!bundle.containsKey("media_item")) {
            throw null;
        }
        android.os.Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof android.support.v4.media.MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
