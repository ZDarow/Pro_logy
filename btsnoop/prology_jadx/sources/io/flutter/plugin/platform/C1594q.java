package io.flutter.plugin.platform;

/* renamed from: io.flutter.plugin.platform.q */
/* loaded from: classes.dex */
public final class C1594q extends android.widget.FrameLayout {

    /* renamed from: l */
    public final io.flutter.plugin.platform.C1578a f6634l;

    /* renamed from: m */
    public final android.view.SurfaceView f6635m;

    public C1594q(android.content.Context context, io.flutter.plugin.platform.C1578a c1578a, android.view.SurfaceView surfaceView) {
        super(context);
        this.f6634l = c1578a;
        this.f6635m = surfaceView;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        io.flutter.view.C1610g c1610g = this.f6634l.f6562a;
        if (c1610g == null) {
            return false;
        }
        return c1610g.m3559a(this.f6635m, view, accessibilityEvent);
    }
}
