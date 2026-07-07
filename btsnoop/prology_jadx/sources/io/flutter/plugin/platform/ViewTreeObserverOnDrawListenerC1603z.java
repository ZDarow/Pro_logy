package io.flutter.plugin.platform;

/* renamed from: io.flutter.plugin.platform.z */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC1603z implements android.view.ViewTreeObserver.OnDrawListener {

    /* renamed from: a */
    public final android.view.SurfaceView f6655a;

    /* renamed from: b */
    public io.flutter.plugin.platform.RunnableC1601x f6656b;

    public ViewTreeObserverOnDrawListenerC1603z(android.view.SurfaceView surfaceView, io.flutter.plugin.platform.RunnableC1601x runnableC1601x) {
        this.f6655a = surfaceView;
        this.f6656b = runnableC1601x;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        io.flutter.plugin.platform.RunnableC1601x runnableC1601x = this.f6656b;
        if (runnableC1601x == null) {
            return;
        }
        runnableC1601x.run();
        this.f6656b = null;
        this.f6655a.post(new io.flutter.plugin.platform.RunnableC1601x(1, this));
    }
}
