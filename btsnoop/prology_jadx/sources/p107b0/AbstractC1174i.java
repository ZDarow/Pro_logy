package p107b0;

/* renamed from: b0.i */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1174i {
    /* renamed from: d */
    public static /* bridge */ /* synthetic */ android.location.LocationRequest m2787d(java.lang.Object obj) {
        return (android.location.LocationRequest) obj;
    }

    /* renamed from: f */
    public static /* bridge */ /* synthetic */ android.media.AudioProfile m2789f(java.lang.Object obj) {
        return (android.media.AudioProfile) obj;
    }

    /* renamed from: g */
    public static /* synthetic */ android.media.metrics.PlaybackMetrics.Builder m2790g() {
        return new android.media.metrics.PlaybackMetrics.Builder();
    }

    /* renamed from: j */
    public static /* bridge */ /* synthetic */ android.view.AttachedSurfaceControl m2793j(p009B2.C0064u c0064u) {
        return c0064u.getRootSurfaceControl();
    }

    /* renamed from: k */
    public static /* bridge */ /* synthetic */ android.view.SurfaceControl.Transaction m2794k(android.view.AttachedSurfaceControl attachedSurfaceControl, android.view.SurfaceControl surfaceControl) {
        return attachedSurfaceControl.buildReparentTransaction(surfaceControl);
    }

    /* renamed from: s */
    public static /* bridge */ /* synthetic */ void m2802s(android.view.AttachedSurfaceControl attachedSurfaceControl, android.view.SurfaceControl.Transaction transaction) {
        attachedSurfaceControl.applyTransactionOnDraw(transaction);
    }
}
