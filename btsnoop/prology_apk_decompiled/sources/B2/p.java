package B2;

import android.app.ForegroundServiceStartNotAllowedException;
import android.media.metrics.NetworkEvent;
import android.media.metrics.TrackChangeEvent;

/* loaded from: classes.dex */
public abstract /* synthetic */ class p {
    public static /* bridge */ /* synthetic */ ForegroundServiceStartNotAllowedException b(IllegalStateException illegalStateException) {
        return (ForegroundServiceStartNotAllowedException) illegalStateException;
    }

    public static /* synthetic */ NetworkEvent.Builder d() {
        return new NetworkEvent.Builder();
    }

    public static /* synthetic */ TrackChangeEvent.Builder g(int i4) {
        return new TrackChangeEvent.Builder(i4);
    }

    public static /* bridge */ /* synthetic */ boolean w(IllegalStateException illegalStateException) {
        return illegalStateException instanceof ForegroundServiceStartNotAllowedException;
    }
}
