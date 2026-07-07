package android.support.v4.media;

/* loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends p111c.C1201d {
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
        if (!bundle.containsKey("search_results")) {
            throw null;
        }
        android.os.Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        parcelableArray.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(parcelableArray.length);
        for (android.os.Parcelable parcelable : parcelableArray) {
            arrayList.add((android.support.v4.media.MediaBrowserCompat$MediaItem) parcelable);
        }
        throw null;
    }
}
