package io.flutter.plugin.editing;

/* renamed from: io.flutter.plugin.editing.c */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC1567c implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public final /* synthetic */ io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback f6494a;

    public ViewOnApplyWindowInsetsListenerC1567c(io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback) {
        this.f6494a = imeSyncDeferringInsetsCallback;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        android.view.WindowInsets windowInsets2;
        io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f6494a;
        imeSyncDeferringInsetsCallback.view = view;
        if (imeSyncDeferringInsetsCallback.needsSave) {
            imeSyncDeferringInsetsCallback.lastWindowInsets = windowInsets;
            imeSyncDeferringInsetsCallback.needsSave = false;
        }
        if (!imeSyncDeferringInsetsCallback.animating) {
            return view.onApplyWindowInsets(windowInsets);
        }
        windowInsets2 = android.view.WindowInsets.CONSUMED;
        return windowInsets2;
    }
}
