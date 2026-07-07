package io.flutter.plugin.editing;

/* JADX INFO: Access modifiers changed from: package-private */
@androidx.annotation.Keep
@android.annotation.SuppressLint({"NewApi", "Override"})
/* loaded from: classes.dex */
public class ImeSyncDeferringInsetsCallback {
    private boolean animating;
    private io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.AnimationCallback animationCallback;
    private final int deferredInsetTypes;
    private io.flutter.plugin.editing.InterfaceC1566b imeVisibilityListener;
    private io.flutter.plugin.editing.ViewOnApplyWindowInsetsListenerC1567c insetsListener;
    private android.view.WindowInsets lastWindowInsets;
    private boolean needsSave;
    private android.view.View view;

    @androidx.annotation.Keep
    /* loaded from: classes.dex */
    public class AnimationCallback extends android.view.WindowInsetsAnimation$Callback {
        public AnimationCallback() {
            super(1);
        }

        public void onEnd(android.view.WindowInsetsAnimation windowInsetsAnimation) {
            int typeMask;
            if (io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.animating) {
                typeMask = windowInsetsAnimation.getTypeMask();
                if ((typeMask & io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                    io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.animating = false;
                    if (io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.lastWindowInsets != null && io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.view != null) {
                        io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.view.dispatchApplyWindowInsets(io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                    }
                }
            }
            android.view.View view = io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.view;
            java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
            p011C.C0105O m450a = p011C.AbstractC0127s.m450a(view);
            if (m450a == null || io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.imeVisibilityListener == null) {
                return;
            }
            boolean mo366n = m450a.f302a.mo366n(8);
            io.flutter.plugin.editing.C1574j c1574j = (io.flutter.plugin.editing.C1574j) io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.imeVisibilityListener;
            if (mo366n) {
                c1574j.getClass();
            } else {
                io.flutter.plugin.editing.C1575k c1575k = c1574j.f6534a;
                c1575k.f6536b.restartInput(c1575k.f6535a);
            }
        }

        public void onPrepare(android.view.WindowInsetsAnimation windowInsetsAnimation) {
            int typeMask;
            io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.needsSave = true;
            typeMask = windowInsetsAnimation.getTypeMask();
            if ((typeMask & io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.animating = true;
            }
        }

        public android.view.WindowInsets onProgress(android.view.WindowInsets windowInsets, java.util.List<android.view.WindowInsetsAnimation> list) {
            int i4;
            android.graphics.Insets insets;
            int i5;
            android.graphics.Insets of;
            android.view.WindowInsets build;
            int navigationBars;
            android.graphics.Insets insets2;
            int typeMask;
            if (io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.animating && !io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.needsSave) {
                java.util.Iterator<android.view.WindowInsetsAnimation> it = list.iterator();
                boolean z4 = false;
                while (it.hasNext()) {
                    typeMask = p009B2.AbstractC0058o.m212g(it.next()).getTypeMask();
                    if ((typeMask & io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                        z4 = true;
                    }
                }
                if (!z4) {
                    return windowInsets;
                }
                int windowSystemUiVisibility = io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.view.getWindowSystemUiVisibility();
                if ((windowSystemUiVisibility & 512) == 0 && (windowSystemUiVisibility & 2) == 0) {
                    navigationBars = android.view.WindowInsets.Type.navigationBars();
                    insets2 = windowInsets.getInsets(navigationBars);
                    i4 = insets2.bottom;
                } else {
                    i4 = 0;
                }
                io.flutter.plugin.editing.AbstractC1565a.m3466k();
                android.view.WindowInsets.Builder m173h = p009B2.AbstractC0052i.m173h(io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                insets = windowInsets.getInsets(io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.deferredInsetTypes);
                i5 = insets.bottom;
                of = android.graphics.Insets.of(0, 0, 0, java.lang.Math.max(i5 - i4, 0));
                m173h.setInsets(io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.deferredInsetTypes, of);
                android.view.View view = io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.view;
                build = m173h.build();
                view.onApplyWindowInsets(build);
            }
            return windowInsets;
        }
    }

    public ImeSyncDeferringInsetsCallback(android.view.View view) {
        int ime;
        ime = android.view.WindowInsets.Type.ime();
        this.deferredInsetTypes = ime;
        this.animating = false;
        this.needsSave = false;
        this.view = view;
        this.animationCallback = new io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.AnimationCallback();
        this.insetsListener = new io.flutter.plugin.editing.ViewOnApplyWindowInsetsListenerC1567c(this);
    }

    public android.view.WindowInsetsAnimation$Callback getAnimationCallback() {
        return this.animationCallback;
    }

    public io.flutter.plugin.editing.InterfaceC1566b getImeVisibilityListener() {
        return this.imeVisibilityListener;
    }

    public android.view.View.OnApplyWindowInsetsListener getInsetsListener() {
        return this.insetsListener;
    }

    public void install() {
        this.view.setWindowInsetsAnimationCallback(this.animationCallback);
        this.view.setOnApplyWindowInsetsListener(this.insetsListener);
    }

    public void remove() {
        this.view.setWindowInsetsAnimationCallback(null);
        this.view.setOnApplyWindowInsetsListener(null);
    }

    public void setImeVisibilityListener(io.flutter.plugin.editing.InterfaceC1566b interfaceC1566b) {
        this.imeVisibilityListener = interfaceC1566b;
    }
}
