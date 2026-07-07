package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.t;
import c.C0200d;

/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends C0200d {
    @Override // c.C0200d
    public final void d(int i4, Bundle bundle) {
        if (bundle != null) {
            bundle = t.E0(bundle);
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
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
