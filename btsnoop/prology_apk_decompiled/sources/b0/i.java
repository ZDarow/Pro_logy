package b0;

import B2.u;
import android.location.LocationRequest;
import android.media.AudioProfile;
import android.media.metrics.PlaybackMetrics;
import android.view.AttachedSurfaceControl;
import android.view.SurfaceControl;

/* loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static /* bridge */ /* synthetic */ LocationRequest d(Object obj) {
        return (LocationRequest) obj;
    }

    public static /* bridge */ /* synthetic */ AudioProfile f(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* synthetic */ PlaybackMetrics.Builder g() {
        return new PlaybackMetrics.Builder();
    }

    public static /* bridge */ /* synthetic */ AttachedSurfaceControl j(u uVar) {
        return uVar.getRootSurfaceControl();
    }

    public static /* bridge */ /* synthetic */ SurfaceControl.Transaction k(AttachedSurfaceControl attachedSurfaceControl, SurfaceControl surfaceControl) {
        return attachedSurfaceControl.buildReparentTransaction(surfaceControl);
    }

    public static /* bridge */ /* synthetic */ void s(AttachedSurfaceControl attachedSurfaceControl, SurfaceControl.Transaction transaction) {
        attachedSurfaceControl.applyTransactionOnDraw(transaction);
    }
}
