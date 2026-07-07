package io.flutter.plugin.editing;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class c implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImeSyncDeferringInsetsCallback f6261a;

    public c(ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback) {
        this.f6261a = imeSyncDeferringInsetsCallback;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets windowInsets2;
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f6261a;
        imeSyncDeferringInsetsCallback.view = view;
        if (imeSyncDeferringInsetsCallback.needsSave) {
            imeSyncDeferringInsetsCallback.lastWindowInsets = windowInsets;
            imeSyncDeferringInsetsCallback.needsSave = false;
        }
        if (!imeSyncDeferringInsetsCallback.animating) {
            return view.onApplyWindowInsets(windowInsets);
        }
        windowInsets2 = WindowInsets.CONSUMED;
        return windowInsets2;
    }
}
