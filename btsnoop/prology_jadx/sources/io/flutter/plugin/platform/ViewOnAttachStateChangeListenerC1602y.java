package io.flutter.plugin.platform;

/* renamed from: io.flutter.plugin.platform.y */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1602y implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f6652a = 0;

    /* renamed from: b */
    public final java.lang.Object f6653b;

    /* renamed from: c */
    public final java.lang.Object f6654c;

    public ViewOnAttachStateChangeListenerC1602y(android.view.SurfaceView surfaceView, io.flutter.plugin.platform.RunnableC1589l runnableC1589l) {
        this.f6653b = surfaceView;
        this.f6654c = runnableC1589l;
    }

    /* renamed from: a */
    private final void m3519a(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        android.view.Window window;
        android.view.WindowManager.LayoutParams attributes;
        switch (this.f6652a) {
            case 0:
                io.flutter.plugin.platform.RunnableC1601x runnableC1601x = new io.flutter.plugin.platform.RunnableC1601x(0, this);
                android.view.SurfaceView surfaceView = (android.view.SurfaceView) this.f6653b;
                surfaceView.getViewTreeObserver().addOnDrawListener(new io.flutter.plugin.platform.ViewTreeObserverOnDrawListenerC1603z(surfaceView, runnableC1601x));
                surfaceView.removeOnAttachStateChangeListener(this);
                return;
            default:
                p154k3.AbstractC1803h.m3779e(view, "view");
                view.removeOnAttachStateChangeListener(this);
                android.app.Activity activity = (android.app.Activity) ((java.lang.ref.WeakReference) this.f6654c).get();
                android.os.IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                if (activity == null || iBinder == null) {
                    return;
                }
                ((p212x1.C2375h) this.f6653b).m4600g(iBinder, activity);
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        switch (this.f6652a) {
            case 0:
                return;
            default:
                p154k3.AbstractC1803h.m3779e(view, "view");
                return;
        }
    }

    public ViewOnAttachStateChangeListenerC1602y(p212x1.C2375h c2375h, android.app.Activity activity) {
        p154k3.AbstractC1803h.m3779e(c2375h, "sidecarCompat");
        this.f6653b = c2375h;
        this.f6654c = new java.lang.ref.WeakReference(activity);
    }
}
