package io.flutter.plugin.platform;

import android.content.Context;
import android.view.SurfaceView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class q extends FrameLayout {

    /* renamed from: l, reason: collision with root package name */
    public final C0344a f6395l;

    /* renamed from: m, reason: collision with root package name */
    public final SurfaceView f6396m;

    public q(Context context, C0344a c0344a, SurfaceView surfaceView) {
        super(context);
        this.f6395l = c0344a;
        this.f6396m = surfaceView;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        io.flutter.view.g gVar = this.f6395l.f6327a;
        if (gVar == null) {
            return false;
        }
        return gVar.a(this.f6396m, view, accessibilityEvent);
    }
}
