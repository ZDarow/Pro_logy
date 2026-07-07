package io.flutter.plugin.platform;

/* renamed from: io.flutter.plugin.platform.x */
/* loaded from: classes.dex */
public final class RunnableC1601x implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ int f6650l;

    /* renamed from: m */
    public final /* synthetic */ java.lang.Object f6651m;

    public /* synthetic */ RunnableC1601x(int i4, java.lang.Object obj) {
        this.f6650l = i4;
        this.f6651m = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6650l) {
            case 0:
                io.flutter.plugin.platform.ViewOnAttachStateChangeListenerC1602y viewOnAttachStateChangeListenerC1602y = (io.flutter.plugin.platform.ViewOnAttachStateChangeListenerC1602y) this.f6651m;
                ((android.view.SurfaceView) viewOnAttachStateChangeListenerC1602y.f6653b).postDelayed((io.flutter.plugin.platform.RunnableC1589l) viewOnAttachStateChangeListenerC1602y.f6654c, 128L);
                return;
            default:
                io.flutter.plugin.platform.ViewTreeObserverOnDrawListenerC1603z viewTreeObserverOnDrawListenerC1603z = (io.flutter.plugin.platform.ViewTreeObserverOnDrawListenerC1603z) this.f6651m;
                viewTreeObserverOnDrawListenerC1603z.f6655a.getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC1603z);
                return;
        }
    }
}
