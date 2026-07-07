package io.flutter.view;

import B2.u;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public final class c implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f6425a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f6426b;

    public c(g gVar, AccessibilityManager accessibilityManager) {
        this.f6426b = gVar;
        this.f6425a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z4) {
        g gVar = this.f6426b;
        if (gVar.f6526u) {
            return;
        }
        boolean z5 = false;
        if (!z4) {
            gVar.j(false);
            f fVar = gVar.f6522p;
            if (fVar != null) {
                gVar.h(fVar.f6482b, 256);
                gVar.f6522p = null;
            }
        }
        B2.r rVar = gVar.s;
        if (rVar != null) {
            boolean isEnabled = this.f6425a.isEnabled();
            u uVar = (u) rVar.f185m;
            if (uVar.s.f346b.f6245a.getIsSoftwareRenderingEnabled()) {
                uVar.setWillNotDraw(false);
                return;
            }
            if (!isEnabled && !z4) {
                z5 = true;
            }
            uVar.setWillNotDraw(z5);
        }
    }
}
