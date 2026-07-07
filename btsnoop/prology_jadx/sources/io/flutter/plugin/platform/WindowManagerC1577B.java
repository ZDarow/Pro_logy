package io.flutter.plugin.platform;

/* renamed from: io.flutter.plugin.platform.B */
/* loaded from: classes.dex */
public final class WindowManagerC1577B implements android.view.WindowManager {

    /* renamed from: l */
    public final android.view.WindowManager f6560l;

    /* renamed from: m */
    public final io.flutter.plugin.platform.C1593p f6561m;

    public WindowManagerC1577B(android.view.WindowManager windowManager, io.flutter.plugin.platform.C1593p c1593p) {
        this.f6560l = windowManager;
        this.f6561m = c1593p;
    }

    @Override // android.view.WindowManager
    public final void addCrossWindowBlurEnabledListener(java.util.function.Consumer consumer) {
        this.f6560l.addCrossWindowBlurEnabledListener(consumer);
    }

    @Override // android.view.ViewManager
    public final void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        io.flutter.plugin.platform.C1593p c1593p = this.f6561m;
        if (c1593p == null) {
            android.util.Log.w("PlatformViewsController", "Embedded view called addView while detached from presentation");
        } else {
            c1593p.addView(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public final android.view.WindowMetrics getCurrentWindowMetrics() {
        android.view.WindowMetrics currentWindowMetrics;
        currentWindowMetrics = this.f6560l.getCurrentWindowMetrics();
        return currentWindowMetrics;
    }

    @Override // android.view.WindowManager
    public final android.view.Display getDefaultDisplay() {
        return this.f6560l.getDefaultDisplay();
    }

    @Override // android.view.WindowManager
    public final android.view.WindowMetrics getMaximumWindowMetrics() {
        android.view.WindowMetrics maximumWindowMetrics;
        maximumWindowMetrics = this.f6560l.getMaximumWindowMetrics();
        return maximumWindowMetrics;
    }

    @Override // android.view.WindowManager
    public final boolean isCrossWindowBlurEnabled() {
        boolean isCrossWindowBlurEnabled;
        isCrossWindowBlurEnabled = this.f6560l.isCrossWindowBlurEnabled();
        return isCrossWindowBlurEnabled;
    }

    @Override // android.view.WindowManager
    public final void removeCrossWindowBlurEnabledListener(java.util.function.Consumer consumer) {
        this.f6560l.removeCrossWindowBlurEnabledListener(consumer);
    }

    @Override // android.view.ViewManager
    public final void removeView(android.view.View view) {
        io.flutter.plugin.platform.C1593p c1593p = this.f6561m;
        if (c1593p == null) {
            android.util.Log.w("PlatformViewsController", "Embedded view called removeView while detached from presentation");
        } else {
            c1593p.removeView(view);
        }
    }

    @Override // android.view.WindowManager
    public final void removeViewImmediate(android.view.View view) {
        io.flutter.plugin.platform.C1593p c1593p = this.f6561m;
        if (c1593p == null) {
            android.util.Log.w("PlatformViewsController", "Embedded view called removeViewImmediate while detached from presentation");
        } else {
            view.clearAnimation();
            c1593p.removeView(view);
        }
    }

    @Override // android.view.ViewManager
    public final void updateViewLayout(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        io.flutter.plugin.platform.C1593p c1593p = this.f6561m;
        if (c1593p == null) {
            android.util.Log.w("PlatformViewsController", "Embedded view called updateViewLayout while detached from presentation");
        } else {
            c1593p.updateViewLayout(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public final void addCrossWindowBlurEnabledListener(java.util.concurrent.Executor executor, java.util.function.Consumer consumer) {
        this.f6560l.addCrossWindowBlurEnabledListener(executor, consumer);
    }
}
